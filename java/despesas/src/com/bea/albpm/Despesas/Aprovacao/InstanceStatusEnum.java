/**
 * InstanceStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bea.albpm.Despesas.Aprovacao;

public class InstanceStatusEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InstanceStatusEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RUNNING = "RUNNING";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _GRABBED = "GRABBED";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _ABORTED = "ABORTED";
    public static final java.lang.String _ACTIVITY_COMPLETED = "ACTIVITY_COMPLETED";
    public static final InstanceStatusEnum RUNNING = new InstanceStatusEnum(_RUNNING);
    public static final InstanceStatusEnum EXCEPTION = new InstanceStatusEnum(_EXCEPTION);
    public static final InstanceStatusEnum SUSPENDED = new InstanceStatusEnum(_SUSPENDED);
    public static final InstanceStatusEnum GRABBED = new InstanceStatusEnum(_GRABBED);
    public static final InstanceStatusEnum COMPLETED = new InstanceStatusEnum(_COMPLETED);
    public static final InstanceStatusEnum ABORTED = new InstanceStatusEnum(_ABORTED);
    public static final InstanceStatusEnum ACTIVITY_COMPLETED = new InstanceStatusEnum(_ACTIVITY_COMPLETED);
    public java.lang.String getValue() { return _value_;}
    public static InstanceStatusEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InstanceStatusEnum enumeration = (InstanceStatusEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InstanceStatusEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstanceStatusEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bea.com/albpm/Despesas/Aprovacao", "InstanceStatusEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
