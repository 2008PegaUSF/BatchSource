/**
 * HelloGeneratorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.revature.services;

public interface HelloGeneratorService extends javax.xml.rpc.Service {
    public java.lang.String getHelloGeneratorAddress();

    public com.revature.services.HelloGenerator getHelloGenerator() throws javax.xml.rpc.ServiceException;

    public com.revature.services.HelloGenerator getHelloGenerator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
