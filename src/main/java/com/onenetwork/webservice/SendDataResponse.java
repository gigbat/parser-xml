package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendDataResponse", propOrder = { "micInterfaceResponse" })
public class SendDataResponse
{
    @XmlElement(name = "MicInterfaceResponse", required = true)
    protected TMicInterface micInterfaceResponse;
    
    public TMicInterface getMicInterfaceResponse() {
        return this.micInterfaceResponse;
    }
    
    public void setMicInterfaceResponse(final TMicInterface value) {
        this.micInterfaceResponse = value;
    }
}