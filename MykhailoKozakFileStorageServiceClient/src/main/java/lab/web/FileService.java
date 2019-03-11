package lab.web;

import lab.web.soap.ServiceException;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface FileService {

    boolean writeFile(String name) throws ServiceException;

    boolean downloadFile(String name, String path) throws ServiceException;

    List<String> getListAllFiles();

    boolean deleteFile(String name) throws ServiceException;
}
