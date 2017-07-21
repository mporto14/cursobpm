/**
 * AprovacaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bea.albpm.Despesas.Aprovacao;

public class AprovacaoServiceLocator extends org.apache.axis.client.Service implements com.bea.albpm.Despesas.Aprovacao.AprovacaoService {

    public AprovacaoServiceLocator() {
    }


    public AprovacaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AprovacaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Aprovacao
    private java.lang.String Aprovacao_address = "http://Renata-PC:9000/albpmServices/Despesas/ws/AprovacaoServiceListener";

    public java.lang.String getAprovacaoAddress() {
        return Aprovacao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AprovacaoWSDDServiceName = "Aprovacao";

    public java.lang.String getAprovacaoWSDDServiceName() {
        return AprovacaoWSDDServiceName;
    }

    public void setAprovacaoWSDDServiceName(java.lang.String name) {
        AprovacaoWSDDServiceName = name;
    }

    public com.bea.albpm.Despesas.Aprovacao.Aprovacao getAprovacao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Aprovacao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAprovacao(endpoint);
    }

    public com.bea.albpm.Despesas.Aprovacao.Aprovacao getAprovacao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bea.albpm.Despesas.Aprovacao.AprovacaoSoapBindingStub _stub = new com.bea.albpm.Despesas.Aprovacao.AprovacaoSoapBindingStub(portAddress, this);
            _stub.setPortName(getAprovacaoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAprovacaoEndpointAddress(java.lang.String address) {
        Aprovacao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bea.albpm.Despesas.Aprovacao.Aprovacao.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bea.albpm.Despesas.Aprovacao.AprovacaoSoapBindingStub _stub = new com.bea.albpm.Despesas.Aprovacao.AprovacaoSoapBindingStub(new java.net.URL(Aprovacao_address), this);
                _stub.setPortName(getAprovacaoWSDDServiceName());
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
        if ("Aprovacao".equals(inputPortName)) {
            return getAprovacao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bea.com/albpm/Despesas/Aprovacao", "AprovacaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bea.com/albpm/Despesas/Aprovacao", "Aprovacao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Aprovacao".equals(portName)) {
            setAprovacaoEndpointAddress(address);
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
