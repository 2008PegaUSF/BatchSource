/**
 * HelloGeneratorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.revature.services;

public class HelloGeneratorServiceLocator extends org.apache.axis.client.Service implements com.revature.services.HelloGeneratorService {

    public HelloGeneratorServiceLocator() {
    }


    public HelloGeneratorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloGeneratorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloGenerator
    private java.lang.String HelloGenerator_address = "http://localhost:8080/SOAPService/services/HelloGenerator";

    public java.lang.String getHelloGeneratorAddress() {
        return HelloGenerator_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloGeneratorWSDDServiceName = "HelloGenerator";

    public java.lang.String getHelloGeneratorWSDDServiceName() {
        return HelloGeneratorWSDDServiceName;
    }

    public void setHelloGeneratorWSDDServiceName(java.lang.String name) {
        HelloGeneratorWSDDServiceName = name;
    }

    public com.revature.services.HelloGenerator getHelloGenerator() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloGenerator_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloGenerator(endpoint);
    }

    public com.revature.services.HelloGenerator getHelloGenerator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.revature.services.HelloGeneratorSoapBindingStub _stub = new com.revature.services.HelloGeneratorSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloGeneratorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloGeneratorEndpointAddress(java.lang.String address) {
        HelloGenerator_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.revature.services.HelloGenerator.class.isAssignableFrom(serviceEndpointInterface)) {
                com.revature.services.HelloGeneratorSoapBindingStub _stub = new com.revature.services.HelloGeneratorSoapBindingStub(new java.net.URL(HelloGenerator_address), this);
                _stub.setPortName(getHelloGeneratorWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloGenerator".equals(inputPortName)) {
            return getHelloGenerator();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.revature.com", "HelloGeneratorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.revature.com", "HelloGenerator"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloGenerator".equals(portName)) {
            setHelloGeneratorEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
