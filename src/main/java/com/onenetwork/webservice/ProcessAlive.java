package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "request" })
@XmlRootElement(name = "processAlive")
public class ProcessAlive
{
    @XmlElement(required = true)
    protected String request;
    
    public String getRequest() {
        return this.request;
    }
    
    public void setRequest(final String value) {
        this.request = value;
    }
}