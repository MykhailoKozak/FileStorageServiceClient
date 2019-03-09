
package lab.web.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "LibraryFault", targetNamespace = "http://soap.web.lab/")
public class ServiceException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LibraryFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServiceException(String message, LibraryFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServiceException(String message, LibraryFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: lab.web.soap.LibraryFault
     */
    public LibraryFault getFaultInfo() {
        return faultInfo;
    }

}