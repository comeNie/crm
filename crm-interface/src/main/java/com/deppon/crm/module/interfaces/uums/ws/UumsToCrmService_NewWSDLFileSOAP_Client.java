
package com.deppon.crm.module.interfaces.uums.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.deppon.crm.module.interfaces.uums.UumsToCrmService;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-11-29T18:35:59.750+08:00
 * Generated source version: 2.7.3
 * 
 */
public final class UumsToCrmService_NewWSDLFileSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://www.deppon.com/crm/crmService", "crmService");

    private UumsToCrmService_NewWSDLFileSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CrmService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CrmService ss = new CrmService(wsdlURL, SERVICE_NAME);
        UumsToCrmService port = ss.getNewWSDLFileSOAP();  
        
        {
        System.out.println("Invoking syncCompanyInfos...");
        com.deppon.crm.module.interfaces.uums.ws.SendCompanyInfoRequest _syncCompanyInfos_syncCompanyInfosRequest = null;
        com.deppon.crm.module.interfaces.uums.ws.ESBHeader _syncCompanyInfos_esbHeaderVal = null;
        javax.xml.ws.Holder<com.deppon.crm.module.interfaces.uums.ws.ESBHeader> _syncCompanyInfos_esbHeader = new javax.xml.ws.Holder<com.deppon.crm.module.interfaces.uums.ws.ESBHeader>(_syncCompanyInfos_esbHeaderVal);
        try {
            com.deppon.crm.module.interfaces.uums.ws.SendCompanyInfoResponse _syncCompanyInfos__return = port.syncCompanyInfos(_syncCompanyInfos_syncCompanyInfosRequest, _syncCompanyInfos_esbHeader);
            System.out.println("syncCompanyInfos.result=" + _syncCompanyInfos__return);

            System.out.println("syncCompanyInfos._syncCompanyInfos_esbHeader=" + _syncCompanyInfos_esbHeader.value);
        } catch (SyncCompanyInfosFault e) { 
            System.out.println("Expected exception: syncCompanyInfosFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
