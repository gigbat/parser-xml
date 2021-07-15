package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "response" })
@XmlRootElement(name = "processAliveResponse")
public class ProcessAliveResponse
{
    @XmlElement(required = true)
    protected String response;
    
    public String getResponse() {
        return this.response;
    }
    
    public void setResponse(final String value) {
        this.response = value;
    }
}