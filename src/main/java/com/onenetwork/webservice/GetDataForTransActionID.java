package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataForTransActionID", propOrder = { "transActionID" })
public class GetDataForTransActionID
{
    protected String transActionID;
    
    public String getTransActionID() {
        return this.transActionID;
    }
    
    public void setTransActionID(final String value) {
        this.transActionID = value;
    }
}