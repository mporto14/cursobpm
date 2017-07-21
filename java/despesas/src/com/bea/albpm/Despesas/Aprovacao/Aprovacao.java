/**
 * Aprovacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bea.albpm.Despesas.Aprovacao;

public interface Aprovacao extends java.rmi.Remote {
    public java.lang.String startSession(java.lang.String password, java.lang.String user) throws java.rmi.RemoteException;
    public void discardSession(java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.bea.albpm.Despesas.Aprovacao.InstanceStatusEnum getInstanceStatus(java.lang.String sessionId, java.lang.String instanceId) throws java.rmi.RemoteException;
    public java.lang.String iniciarFluxoAprovacao(java.lang.String sessionId, long idSolicitacaoArg) throws java.rmi.RemoteException;
}
