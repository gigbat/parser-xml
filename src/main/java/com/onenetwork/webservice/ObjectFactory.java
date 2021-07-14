package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory
{
    private static final QName _MicInterfaceRequest_QNAME;
    private static final QName _MicInterfaceResponse_QNAME;
    private static final QName _GetDataForPartnerID_QNAME;
    private static final QName _GetDataForTransActionID_QNAME;
    private static final QName _GetDataResponse_QNAME;
    private static final QName _GetDataforPartnerID_QNAME;
    private static final QName _GetDataforTransActionID_QNAME;
    private static final QName _SendData_QNAME;
    private static final QName _SendDataResponse_QNAME;
    
    public TMicInterfaceMessageAction createTMicInterfaceMessageAction() {
        return new TMicInterfaceMessageAction();
    }
    
    public TMicInterfaceMessage createTMicInterfaceMessage() {
        return new TMicInterfaceMessage();
    }
    
    public TMicInterface createTMicInterface() {
        return new TMicInterface();
    }
    
    public GetDataForPartnerID createGetDataForPartnerID() {
        return new GetDataForPartnerID();
    }
    
    public GetDataForTransActionID createGetDataForTransActionID() {
        return new GetDataForTransActionID();
    }
    
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }
    
    public ProcessAlive createProcessAlive() {
        return new ProcessAlive();
    }
    
    public ProcessAliveResponse createProcessAliveResponse() {
        return new ProcessAliveResponse();
    }
    
    public SendData createSendData() {
        return new SendData();
    }
    
    public SendDataResponse createSendDataResponse() {
        return new SendDataResponse();
    }
    
    public TMicInterfaceConnection createTMicInterfaceConnection() {
        return new TMicInterfaceConnection();
    }
    
    public TMicInterfaceMessages createTMicInterfaceMessages() {
        return new TMicInterfaceMessages();
    }
    
    public TMicInterfaceMessageEnvelope createTMicInterfaceMessageEnvelope() {
        return new TMicInterfaceMessageEnvelope();
    }
    
    public TMicInterfaceMessageAction.Parameter createTMicInterfaceMessageActionParameter() {
        return new TMicInterfaceMessageAction.Parameter();
    }
    
    public TMicInterfaceMessage.Body createTMicInterfaceMessageBody() {
        return new TMicInterfaceMessage.Body();
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "MicInterfaceRequest")
    public JAXBElement<TMicInterface> createMicInterfaceRequest(final TMicInterface value) {
        return (JAXBElement<TMicInterface>)new JAXBElement(ObjectFactory._MicInterfaceRequest_QNAME, (Class)TMicInterface.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "MicInterfaceResponse")
    public JAXBElement<TMicInterface> createMicInterfaceResponse(final TMicInterface value) {
        return (JAXBElement<TMicInterface>)new JAXBElement(ObjectFactory._MicInterfaceResponse_QNAME, (Class)TMicInterface.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "getDataForPartnerID")
    public JAXBElement<GetDataForPartnerID> createGetDataForPartnerID(final GetDataForPartnerID value) {
        return (JAXBElement<GetDataForPartnerID>)new JAXBElement(ObjectFactory._GetDataForPartnerID_QNAME, (Class)GetDataForPartnerID.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "getDataForTransActionID")
    public JAXBElement<GetDataForTransActionID> createGetDataForTransActionID(final GetDataForTransActionID value) {
        return (JAXBElement<GetDataForTransActionID>)new JAXBElement(ObjectFactory._GetDataForTransActionID_QNAME, (Class)GetDataForTransActionID.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(final GetDataResponse value) {
        return (JAXBElement<GetDataResponse>)new JAXBElement(ObjectFactory._GetDataResponse_QNAME, (Class)GetDataResponse.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "getDataforPartnerID")
    public JAXBElement<Object> createGetDataforPartnerID(final Object value) {
        return (JAXBElement<Object>)new JAXBElement(ObjectFactory._GetDataforPartnerID_QNAME, (Class)Object.class, (Class)null, value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "getDataforTransActionID")
    public JAXBElement<Object> createGetDataforTransActionID(final Object value) {
        return (JAXBElement<Object>)new JAXBElement(ObjectFactory._GetDataforTransActionID_QNAME, (Class)Object.class, (Class)null, value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "sendData")
    public JAXBElement<SendData> createSendData(final SendData value) {
        return (JAXBElement<SendData>)new JAXBElement(ObjectFactory._SendData_QNAME, (Class)SendData.class, (Class)null, (Object)value);
    }
    
    @XmlElementDecl(namespace = "urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", name = "sendDataResponse")
    public JAXBElement<SendDataResponse> createSendDataResponse(final SendDataResponse value) {
        return (JAXBElement<SendDataResponse>)new JAXBElement(ObjectFactory._SendDataResponse_QNAME, (Class)SendDataResponse.class, (Class)null, (Object)value);
    }
    
    static {
        _MicInterfaceRequest_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "MicInterfaceRequest");
        _MicInterfaceResponse_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "MicInterfaceResponse");
        _GetDataForPartnerID_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "getDataForPartnerID");
        _GetDataForTransActionID_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "getDataForTransActionID");
        _GetDataResponse_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "getDataResponse");
        _GetDataforPartnerID_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "getDataforPartnerID");
        _GetDataforTransActionID_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "getDataforTransActionID");
        _SendData_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "sendData");
        _SendDataResponse_QNAME = new QName("urn:http://www.mic-cust.com/Webservice/MicInterface/v1.0", "sendDataResponse");
    }
}