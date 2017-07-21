package com.bea.albpm.Despesas.Aprovacao;

public class AprovacaoProxy implements com.bea.albpm.Despesas.Aprovacao.Aprovacao {
  private String _endpoint = null;
  private com.bea.albpm.Despesas.Aprovacao.Aprovacao aprovacao = null;
  
  public AprovacaoProxy() {
    _initAprovacaoProxy();
  }
  
  public AprovacaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initAprovacaoProxy();
  }
  
  private void _initAprovacaoProxy() {
    try {
      aprovacao = (new com.bea.albpm.Despesas.Aprovacao.AprovacaoServiceLocator()).getAprovacao();
      if (aprovacao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aprovacao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aprovacao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aprovacao != null)
      ((javax.xml.rpc.Stub)aprovacao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bea.albpm.Despesas.Aprovacao.Aprovacao getAprovacao() {
    if (aprovacao == null)
      _initAprovacaoProxy();
    return aprovacao;
  }
  
  public java.lang.String startSession(java.lang.String password, java.lang.String user) throws java.rmi.RemoteException{
    if (aprovacao == null)
      _initAprovacaoProxy();
    return aprovacao.startSession(password, user);
  }
  
  public void discardSession(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (aprovacao == null)
      _initAprovacaoProxy();
    aprovacao.discardSession(sessionId);
  }
  
  public com.bea.albpm.Despesas.Aprovacao.InstanceStatusEnum getInstanceStatus(java.lang.String sessionId, java.lang.String instanceId) throws java.rmi.RemoteException{
    if (aprovacao == null)
      _initAprovacaoProxy();
    return aprovacao.getInstanceStatus(sessionId, instanceId);
  }
  
  public java.lang.String iniciarFluxoAprovacao(java.lang.String sessionId, long idSolicitacaoArg) throws java.rmi.RemoteException{
    if (aprovacao == null)
      _initAprovacaoProxy();
    return aprovacao.iniciarFluxoAprovacao(sessionId, idSolicitacaoArg);
  }
  
  
}