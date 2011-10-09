/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.dm.ws.ws1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author daniel
 */
@WebService(serviceName = "HelloService")
public class HelloMyService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
