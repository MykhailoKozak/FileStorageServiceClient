package lab.web;

import lab.web.soap.LibraryFault;
import lab.web.soap.ServiceException;
import lab.web.utils.LoggerListener;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({LoggerListener.class, HTMLReporter.class})
public class WriteSameFileTwiceApiTest {
    public Logger LOGGER = Logger.getLogger(WriteSameFileTwiceApiTest.class);
    public static String name = "New2";

    @Test(expectedExceptions = ServiceException.class)
    public void tryWriteFileTwiceRest() throws ServiceException {
        LOGGER.info("tryWriteAndDeleteFileRest test");
        FileService service = ServiceFactory.getFileService(ServiceFactory.REST);

        Assert.assertTrue(service.writeFile(name));
        Assert.assertTrue(service.writeFile(name));
    }

    @Test(expectedExceptions = ServiceException.class)
    public void tryWriteFileTwiceSoap() throws ServiceException {
        LOGGER.info("tryWriteAndDeleteFileSoap test");
        FileService service = ServiceFactory.getFileService(ServiceFactory.SOAP);
        LibraryFault faultInfo = null;
        try {
            Assert.assertTrue(service.writeFile(name));
            Assert.assertTrue(service.writeFile(name));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        throw new ServiceException(faultInfo);
    }

    @AfterMethod
    public void clearWorkspace() {
        LOGGER.info("after method");
        FileService service = ServiceFactory.getFileService(ServiceFactory.REST);
        service.getListAllFiles();
    }
}
