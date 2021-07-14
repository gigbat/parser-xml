package com.onenetwork.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMicInterfaceMessageAction", propOrder = { "code", "parameter" })
public class TMicInterfaceMessageAction
{
    @XmlElement(required = true)
    protected String code;
    @XmlElement(nillable = true)
    protected List<TMicInterfaceMessageAction.Parameter> parameter;
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(final String value) {
        this.code = value;
    }
    
    public List<TMicInterfaceMessageAction.Parameter> getParameter() {
        if (this.parameter == null) {
            this.parameter = new ArrayList<TMicInterfaceMessageAction.Parameter>();
        }
        return this.parameter;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Parameter
    {
        @XmlAttribute(name = "key")
        @XmlSchemaType(name = "anySimpleType")
        protected String key;
        @XmlAttribute(name = "value")
        @XmlSchemaType(name = "anySimpleType")
        protected String value;

        public String getKey() {
            return this.key;
        }

        public void setKey(final String value) {
            this.key = value;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(final String value) {
            this.value = value;
        }
    }
}