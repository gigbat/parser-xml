package com.onenetwork.webservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterfaceMessageEnvelope", propOrder = { "messageID", "partyID", "schemaID", "transActionID", "sequenceNum" })
public class TMicInterfaceMessageEnvelope
{
    @XmlElement(required = true)
    protected String messageID;
    @XmlElement(required = true)
    protected String partyID;
    @XmlElement(required = true)
    protected String schemaID;
    @XmlElement(required = true)
    protected String transActionID;
    @XmlElement(required = true)
    protected BigInteger sequenceNum;
    
    public String getMessageID() {
        return this.messageID;
    }
    
    public void setMessageID(final String value) {
        this.messageID = value;
    }
    
    public String getPartyID() {
        return this.partyID;
    }
    
    public void setPartyID(final String value) {
        this.partyID = value;
    }
    
    public String getSchemaID() {
        return this.schemaID;
    }
    
    public void setSchemaID(final String value) {
        this.schemaID = value;
    }
    
    public String getTransActionID() {
        return this.transActionID;
    }
    
    public void setTransActionID(final String value) {
        this.transActionID = value;
    }
    
    public BigInteger getSequenceNum() {
        return this.sequenceNum;
    }
    
    public void setSequenceNum(final BigInteger value) {
        this.sequenceNum = value;
    }
}