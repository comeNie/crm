package com.deppon.cc.complaint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-05-26T18:19:34.219+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://manager.complaint.callcenter.deppon.com", name = "receiveWorkOrderIdServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ReceiveWorkOrderIdServicePortType {

    @WebResult(name = "out", targetNamespace = "http://manager.complaint.callcenter.deppon.com")
    @RequestWrapper(localName = "receiveWorkOrderNumber", targetNamespace = "http://manager.complaint.callcenter.deppon.com", className = "com.deppon.cc.complaint.ReceiveWorkOrderNumber")
    @WebMethod
    @ResponseWrapper(localName = "receiveWorkOrderNumberResponse", targetNamespace = "http://manager.complaint.callcenter.deppon.com", className = "com.deppon.cc.complaint.ReceiveWorkOrderNumberResponse")
    public java.lang.String receiveWorkOrderNumber(
        @WebParam(name = "in0", targetNamespace = "http://manager.complaint.callcenter.deppon.com")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://manager.complaint.callcenter.deppon.com")
        java.lang.String in1
    );
}