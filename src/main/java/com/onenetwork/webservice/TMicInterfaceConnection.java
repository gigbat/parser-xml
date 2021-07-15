package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterfaceConnection", propOrder = { "connectionID", "partnerID", "dateTime" })
public class TMicInterfaceConnection
{
    @XmlElement(required = true)
    protected String connectionID;
    @XmlElement(required = true)
    protected String partnerID;
    @XmlElement(required = true)
    protected Object dateTime;
    
    public String getConnectionID() {
        return this.connectionID;
    }
    
    public void setConnectionID(final String value) {
        this.connectionID = value;
    }
    
    public String getPartnerID() {
        return this.partnerID;
    }
    
    public void setPartnerID(final String value) {
        this.partnerID = value;
    }
    
    public Object getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(final Object value) {
        this.dateTime = value;
    }
}