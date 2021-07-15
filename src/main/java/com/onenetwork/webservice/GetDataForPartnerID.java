package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataForPartnerID", propOrder = { "partnerID" })
public class GetDataForPartnerID
{
    protected String partnerID;
    
    public String getPartnerID() {
        return this.partnerID;
    }
    
    public void setPartnerID(final String value) {
        this.partnerID = value;
    }
}