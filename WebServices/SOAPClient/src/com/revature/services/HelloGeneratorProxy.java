package com.revature.services;

public class HelloGeneratorProxy implements com.revature.services.HelloGenerator {
  private String _endpoint = null;
  private com.revature.services.HelloGenerator helloGenerator = null;
  
  public HelloGeneratorProxy() {
    _initHelloGeneratorProxy();
  }
  
  public HelloGeneratorProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloGeneratorProxy();
  }
  
  private void _initHelloGeneratorProxy() {
    try {
      helloGenerator = (new com.revature.services.HelloGeneratorServiceLocator()).getHelloGenerator();
      if (helloGenerator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloGenerator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloGenerator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloGenerator != null)
      ((javax.xml.rpc.Stub)helloGenerator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.revature.services.HelloGenerator getHelloGenerator() {
    if (helloGenerator == null)
      _initHelloGeneratorProxy();
    return helloGenerator;
  }
  
  public java.lang.String hello(java.lang.String name) throws java.rmi.RemoteException{
    if (helloGenerator == null)
      _initHelloGeneratorProxy();
    return helloGenerator.hello(name);
  }
  
  
}