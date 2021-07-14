package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterfaceMessage", propOrder = { "envelope", "actionCode", "body" })
public class TMicInterfaceMessage
{
    @XmlElement(name = "Envelope", required = true)
    protected TMicInterfaceMessageEnvelope envelope;
    @XmlElement(name = "ActionCode")
    protected TMicInterfaceMessageAction actionCode;
    @XmlElement(name = "Body")
    protected Body body;
    
    public TMicInterfaceMessageEnvelope getEnvelope() {
        return this.envelope;
    }
    
    public void setEnvelope(final TMicInterfaceMessageEnvelope value) {
        this.envelope = value;
    }
    
    public TMicInterfaceMessageAction getActionCode() {
        return this.actionCode;
    }
    
    public void setActionCode(final TMicInterfaceMessageAction value) {
        this.actionCode = value;
    }
    
    public Body getBody() {
        return this.body;
    }
    
    public void setBody(final Body value) {
        this.body = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class Body
    {
        @XmlValue
        protected String value;
        @XmlAttribute(name = "messageType")
        protected String messageType;
        
        public String getValue() {
            return this.value;
        }
        
        public void setValue(final String value) {
            this.value = value;
        }
        
        public String getMessageType() {
            return this.messageType;
        }
        
        public void setMessageType(final String value) {
            this.messageType = value;
        }
    }
}