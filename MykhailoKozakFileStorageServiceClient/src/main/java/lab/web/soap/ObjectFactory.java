
package lab.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lab.web.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WriteFileResponse_QNAME = new QName("http://soap.web.lab/", "writeFileResponse");
    private final static QName _DownloadFileResponse_QNAME = new QName("http://soap.web.lab/", "downloadFileResponse");
    private final static QName _DeleteFileResponse_QNAME = new QName("http://soap.web.lab/", "deleteFileResponse");
    private final static QName _DeleteFile_QNAME = new QName("http://soap.web.lab/", "deleteFile");
    private final static QName _DownloadFile_QNAME = new QName("http://soap.web.lab/", "downloadFile");
    private final static QName _GetListAllFilesResponse_QNAME = new QName("http://soap.web.lab/", "getListAllFilesResponse");
    private final static QName _WriteFile_QNAME = new QName("http://soap.web.lab/", "writeFile");
    private final static QName _GetListAllFiles_QNAME = new QName("http://soap.web.lab/", "getListAllFiles");
    private final static QName _LibraryFault_QNAME = new QName("http://soap.web.lab/", "LibraryFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lab.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteFile }
     * 
     */
    public DeleteFile createDeleteFile() {
        return new DeleteFile();
    }

    /**
     * Create an instance of {@link DownloadFile }
     * 
     */
    public DownloadFile createDownloadFile() {
        return new DownloadFile();
    }

    /**
     * Create an instance of {@link DeleteFileResponse }
     * 
     */
    public DeleteFileResponse createDeleteFileResponse() {
        return new DeleteFileResponse();
    }

    /**
     * Create an instance of {@link DownloadFileResponse }
     * 
     */
    public DownloadFileResponse createDownloadFileResponse() {
        return new DownloadFileResponse();
    }

    /**
     * Create an instance of {@link WriteFileResponse }
     * 
     */
    public WriteFileResponse createWriteFileResponse() {
        return new WriteFileResponse();
    }

    /**
     * Create an instance of {@link LibraryFault }
     * 
     */
    public LibraryFault createLibraryFault() {
        return new LibraryFault();
    }

    /**
     * Create an instance of {@link GetListAllFiles }
     * 
     */
    public GetListAllFiles createGetListAllFiles() {
        return new GetListAllFiles();
    }

    /**
     * Create an instance of {@link WriteFile }
     * 
     */
    public WriteFile createWriteFile() {
        return new WriteFile();
    }

    /**
     * Create an instance of {@link GetListAllFilesResponse }
     * 
     */
    public GetListAllFilesResponse createGetListAllFilesResponse() {
        return new GetListAllFilesResponse();
    }

    /**
     * Create an instance of {@link ServiceFaultInfo }
     * 
     */
    public ServiceFaultInfo createServiceFaultInfo() {
        return new ServiceFaultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "writeFileResponse")
    public JAXBElement<WriteFileResponse> createWriteFileResponse(WriteFileResponse value) {
        return new JAXBElement<WriteFileResponse>(_WriteFileResponse_QNAME, WriteFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "downloadFileResponse")
    public JAXBElement<DownloadFileResponse> createDownloadFileResponse(DownloadFileResponse value) {
        return new JAXBElement<DownloadFileResponse>(_DownloadFileResponse_QNAME, DownloadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "deleteFileResponse")
    public JAXBElement<DeleteFileResponse> createDeleteFileResponse(DeleteFileResponse value) {
        return new JAXBElement<DeleteFileResponse>(_DeleteFileResponse_QNAME, DeleteFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "deleteFile")
    public JAXBElement<DeleteFile> createDeleteFile(DeleteFile value) {
        return new JAXBElement<DeleteFile>(_DeleteFile_QNAME, DeleteFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "downloadFile")
    public JAXBElement<DownloadFile> createDownloadFile(DownloadFile value) {
        return new JAXBElement<DownloadFile>(_DownloadFile_QNAME, DownloadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAllFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "getListAllFilesResponse")
    public JAXBElement<GetListAllFilesResponse> createGetListAllFilesResponse(GetListAllFilesResponse value) {
        return new JAXBElement<GetListAllFilesResponse>(_GetListAllFilesResponse_QNAME, GetListAllFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "writeFile")
    public JAXBElement<WriteFile> createWriteFile(WriteFile value) {
        return new JAXBElement<WriteFile>(_WriteFile_QNAME, WriteFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAllFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "getListAllFiles")
    public JAXBElement<GetListAllFiles> createGetListAllFiles(GetListAllFiles value) {
        return new JAXBElement<GetListAllFiles>(_GetListAllFiles_QNAME, GetListAllFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.lab/", name = "LibraryFault")
    public JAXBElement<LibraryFault> createLibraryFault(LibraryFault value) {
        return new JAXBElement<LibraryFault>(_LibraryFault_QNAME, LibraryFault.class, null, value);
    }

}
