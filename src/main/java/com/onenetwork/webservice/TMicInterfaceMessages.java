package com.onenetwork.webservice;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterfaceMessages", propOrder = { "message" })
public class TMicInterfaceMessages
{
    @XmlElement(name = "Message", required = true)
    protected List<TMicInterfaceMessage> message;
    
    public List<TMicInterfaceMessage> getMessage() {
        if (this.message == null) {
            this.message = new ArrayList<TMicInterfaceMessage>();
        }
        return this.message;
    }
}