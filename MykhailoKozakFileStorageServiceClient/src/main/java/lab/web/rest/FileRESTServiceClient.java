package lab.web.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import lab.web.FileService;
import lab.web.soap.LibraryFault;
import lab.web.soap.ServiceException;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

public class FileRESTServiceClient implements FileService {

    public Logger LOGGER = Logger.getLogger(FileRESTServiceClient.class);

    public static final String BASE_ADDRESS = "http://localhost:8080/MykhailoKozakFileStorageService/fileREST";

    private ClientConfig clientConfig;
    private Client client;

    public FileRESTServiceClient() {
        clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
    }

    private ServiceException buildException(ClientResponse response, ObjectMapper mapper) throws ServiceException {
        LOGGER.info("buildException");
        String jsonFaultInfo = response.getEntity(String.class);

        LibraryFault faultInfo = null;
        try {
            faultInfo = mapper.readValue(jsonFaultInfo, LibraryFault.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ServiceException(faultInfo);

    }


    @Override
    public boolean writeFile(String name) throws ServiceException {
        LOGGER.info("writeFile method");

        ObjectMapper mapper = new ObjectMapper();
        String uri = BASE_ADDRESS + "/write?fileName=" + name.replace(" ", "%20");
        LOGGER.info("path:" + uri);

        WebResource webResource = client.resource(uri);

        ClientResponse response = null;
        try {
            response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                    .post(ClientResponse.class, mapper.writeValueAsString(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.getStatus() != 200) {
            throw buildException(response, mapper);
        }
        return true;
    }

    @Override
    public boolean downloadFile(String name, String path) throws ServiceException {
        LOGGER.info("downloadFile method");

        ObjectMapper mapper = new ObjectMapper();
        String uri = BASE_ADDRESS + "/download?fileName=" + name.replace(" ", "%20") +
                "&filePath=" + path.replace(" ", "%20");
        LOGGER.info("path:" + uri);

        WebResource webResource = client.resource(uri);
        ClientResponse response = null;
        try {
            response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                    .post(ClientResponse.class, mapper.writeValueAsString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.getStatus() != 200) {
            throw buildException(response, mapper);
        }
        return true;
    }

    @Override
    public List<String> getListAllFiles() {
        LOGGER.info("getListAllFiles method");
        ObjectMapper mapper = new ObjectMapper();

        String uri = BASE_ADDRESS + "/files";
        LOGGER.info("path: " + uri);

        WebResource webResource = client.resource(uri);

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8")
                .get(ClientResponse.class);

        String fileJson = response.getEntity(String.class);
        List<String> list = null;

        try {
            list = mapper.readValue(fileJson, new TypeReference<List<String>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean deleteFile(String name) throws ServiceException {
        LOGGER.info("deleteFile method");

        ObjectMapper mapper = new ObjectMapper();

        String uri = BASE_ADDRESS + "/delete/" + name.replace(" ", "%20");
        LOGGER.info("path:" + uri);

        WebResource webResource = client.resource(uri);

        ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
                .delete(ClientResponse.class, name);

        if (response.getStatus() != 200) {
            throw buildException(response, mapper);
        }
        return true;
    }
}
