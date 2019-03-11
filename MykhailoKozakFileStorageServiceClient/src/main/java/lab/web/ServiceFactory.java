package lab.web;

import lab.web.rest.FileRESTServiceClient;
import lab.web.soap.FileServiceImplService;
import org.apache.log4j.Logger;

public class ServiceFactory {
    private static Logger LOGGER = Logger.getLogger(ServiceFactory.class);
    public static final String REST = "REST";
    public static final String SOAP = "SOAP";

    public static FileService getFileService(String choice) {
        LOGGER.info("getFileService factory method");

        FileService service;
        if (choice.equals(REST)) {
            LOGGER.info("Creating Rest file service client");
            service = new FileRESTServiceClient();
        } else if (choice.equals(SOAP)) {
            LOGGER.info("Creating Soap file service client");
            service = new FileServiceImplService().getFileServiceImplPort();
        } else {
            LOGGER.info("Wrong input");
            throw new RuntimeException();
        }
        return service;
    }

}
