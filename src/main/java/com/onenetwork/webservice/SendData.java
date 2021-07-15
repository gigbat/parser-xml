package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendData", propOrder = { "micInterfaceRequest" })
public class SendData
{
    @XmlElement(name = "MicInterfaceRequest", required = true)
    protected TMicInterface micInterfaceRequest;
    
    public TMicInterface getMicInterfaceRequest() {
        return this.micInterfaceRequest;
    }
    
    public void setMicInterfaceRequest(final TMicInterface value) {
        this.micInterfaceRequest = value;
    }
}