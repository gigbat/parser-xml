package com.onenetwork.webservice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterface", propOrder = { "connection", "messages" })
public class TMicInterface
{
    @XmlElement(name = "Connection", required = true)
    protected TMicInterfaceConnection connection;
    @XmlElement(name = "Messages", required = true)
    protected TMicInterfaceMessages messages;
    
    public TMicInterfaceConnection getConnection() {
        return this.connection;
    }
    
    public void setConnection(final TMicInterfaceConnection value) {
        this.connection = value;
    }
    
    public TMicInterfaceMessages getMessages() {
        return this.messages;
    }
    
    public void setMessages(final TMicInterfaceMessages value) {
        this.messages = value;
    }
}