/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.hotel.rec.cross;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrossRecResponse implements org.apache.thrift.TBase<CrossRecResponse, CrossRecResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CrossRecResponse");

  private static final org.apache.thrift.protocol.TField POI_ARRAY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("poiArrayList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_NUM_OF_POI_FIELD_DESC = new org.apache.thrift.protocol.TField("totalNumOfPoi", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STRATEGY_FIELD_DESC = new org.apache.thrift.protocol.TField("strategy", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CrossRecResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CrossRecResponseTupleSchemeFactory());
  }

  public List<Long> poiArrayList; // required
  public int totalNumOfPoi; // optional
  public String strategy; // optional
  public int status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POI_ARRAY_LIST((short)1, "poiArrayList"),
    TOTAL_NUM_OF_POI((short)2, "totalNumOfPoi"),
    STRATEGY((short)3, "strategy"),
    STATUS((short)4, "status");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // POI_ARRAY_LIST
          return POI_ARRAY_LIST;
        case 2: // TOTAL_NUM_OF_POI
          return TOTAL_NUM_OF_POI;
        case 3: // STRATEGY
          return STRATEGY;
        case 4: // STATUS
          return STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALNUMOFPOI_ISSET_ID = 0;
  private static final int __STATUS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.TOTAL_NUM_OF_POI,_Fields.STRATEGY,_Fields.STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POI_ARRAY_LIST, new org.apache.thrift.meta_data.FieldMetaData("poiArrayList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.TOTAL_NUM_OF_POI, new org.apache.thrift.meta_data.FieldMetaData("totalNumOfPoi", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STRATEGY, new org.apache.thrift.meta_data.FieldMetaData("strategy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CrossRecResponse.class, metaDataMap);
  }

  public CrossRecResponse() {
  }

  public CrossRecResponse(
    List<Long> poiArrayList)
  {
    this();
    this.poiArrayList = poiArrayList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CrossRecResponse(CrossRecResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetPoiArrayList()) {
      List<Long> __this__poiArrayList = new ArrayList<Long>();
      for (Long other_element : other.poiArrayList) {
        __this__poiArrayList.add(other_element);
      }
      this.poiArrayList = __this__poiArrayList;
    }
    this.totalNumOfPoi = other.totalNumOfPoi;
    if (other.isSetStrategy()) {
      this.strategy = other.strategy;
    }
    this.status = other.status;
  }

  public CrossRecResponse deepCopy() {
    return new CrossRecResponse(this);
  }

  @Override
  public void clear() {
    this.poiArrayList = null;
    setTotalNumOfPoiIsSet(false);
    this.totalNumOfPoi = 0;
    this.strategy = null;
    setStatusIsSet(false);
    this.status = 0;
  }

  public int getPoiArrayListSize() {
    return (this.poiArrayList == null) ? 0 : this.poiArrayList.size();
  }

  public java.util.Iterator<Long> getPoiArrayListIterator() {
    return (this.poiArrayList == null) ? null : this.poiArrayList.iterator();
  }

  public void addToPoiArrayList(long elem) {
    if (this.poiArrayList == null) {
      this.poiArrayList = new ArrayList<Long>();
    }
    this.poiArrayList.add(elem);
  }

  public List<Long> getPoiArrayList() {
    return this.poiArrayList;
  }

  public CrossRecResponse setPoiArrayList(List<Long> poiArrayList) {
    this.poiArrayList = poiArrayList;
    return this;
  }

  public void unsetPoiArrayList() {
    this.poiArrayList = null;
  }

  /** Returns true if field poiArrayList is set (has been assigned a value) and false otherwise */
  public boolean isSetPoiArrayList() {
    return this.poiArrayList != null;
  }

  public void setPoiArrayListIsSet(boolean value) {
    if (!value) {
      this.poiArrayList = null;
    }
  }

  public int getTotalNumOfPoi() {
    return this.totalNumOfPoi;
  }

  public CrossRecResponse setTotalNumOfPoi(int totalNumOfPoi) {
    this.totalNumOfPoi = totalNumOfPoi;
    setTotalNumOfPoiIsSet(true);
    return this;
  }

  public void unsetTotalNumOfPoi() {
    __isset_bit_vector.clear(__TOTALNUMOFPOI_ISSET_ID);
  }

  /** Returns true if field totalNumOfPoi is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalNumOfPoi() {
    return __isset_bit_vector.get(__TOTALNUMOFPOI_ISSET_ID);
  }

  public void setTotalNumOfPoiIsSet(boolean value) {
    __isset_bit_vector.set(__TOTALNUMOFPOI_ISSET_ID, value);
  }

  public String getStrategy() {
    return this.strategy;
  }

  public CrossRecResponse setStrategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

  public void unsetStrategy() {
    this.strategy = null;
  }

  /** Returns true if field strategy is set (has been assigned a value) and false otherwise */
  public boolean isSetStrategy() {
    return this.strategy != null;
  }

  public void setStrategyIsSet(boolean value) {
    if (!value) {
      this.strategy = null;
    }
  }

  public int getStatus() {
    return this.status;
  }

  public CrossRecResponse setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bit_vector.clear(__STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return __isset_bit_vector.get(__STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bit_vector.set(__STATUS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POI_ARRAY_LIST:
      if (value == null) {
        unsetPoiArrayList();
      } else {
        setPoiArrayList((List<Long>)value);
      }
      break;

    case TOTAL_NUM_OF_POI:
      if (value == null) {
        unsetTotalNumOfPoi();
      } else {
        setTotalNumOfPoi((Integer)value);
      }
      break;

    case STRATEGY:
      if (value == null) {
        unsetStrategy();
      } else {
        setStrategy((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POI_ARRAY_LIST:
      return getPoiArrayList();

    case TOTAL_NUM_OF_POI:
      return Integer.valueOf(getTotalNumOfPoi());

    case STRATEGY:
      return getStrategy();

    case STATUS:
      return Integer.valueOf(getStatus());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POI_ARRAY_LIST:
      return isSetPoiArrayList();
    case TOTAL_NUM_OF_POI:
      return isSetTotalNumOfPoi();
    case STRATEGY:
      return isSetStrategy();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CrossRecResponse)
      return this.equals((CrossRecResponse)that);
    return false;
  }

  public boolean equals(CrossRecResponse that) {
    if (that == null)
      return false;

    boolean this_present_poiArrayList = true && this.isSetPoiArrayList();
    boolean that_present_poiArrayList = true && that.isSetPoiArrayList();
    if (this_present_poiArrayList || that_present_poiArrayList) {
      if (!(this_present_poiArrayList && that_present_poiArrayList))
        return false;
      if (!this.poiArrayList.equals(that.poiArrayList))
        return false;
    }

    boolean this_present_totalNumOfPoi = true && this.isSetTotalNumOfPoi();
    boolean that_present_totalNumOfPoi = true && that.isSetTotalNumOfPoi();
    if (this_present_totalNumOfPoi || that_present_totalNumOfPoi) {
      if (!(this_present_totalNumOfPoi && that_present_totalNumOfPoi))
        return false;
      if (this.totalNumOfPoi != that.totalNumOfPoi)
        return false;
    }

    boolean this_present_strategy = true && this.isSetStrategy();
    boolean that_present_strategy = true && that.isSetStrategy();
    if (this_present_strategy || that_present_strategy) {
      if (!(this_present_strategy && that_present_strategy))
        return false;
      if (!this.strategy.equals(that.strategy))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CrossRecResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CrossRecResponse typedOther = (CrossRecResponse)other;

    lastComparison = Boolean.valueOf(isSetPoiArrayList()).compareTo(typedOther.isSetPoiArrayList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoiArrayList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poiArrayList, typedOther.poiArrayList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalNumOfPoi()).compareTo(typedOther.isSetTotalNumOfPoi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalNumOfPoi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalNumOfPoi, typedOther.totalNumOfPoi);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStrategy()).compareTo(typedOther.isSetStrategy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStrategy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.strategy, typedOther.strategy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CrossRecResponse(");
    boolean first = true;

    sb.append("poiArrayList:");
    if (this.poiArrayList == null) {
      sb.append("null");
    } else {
      sb.append(this.poiArrayList);
    }
    first = false;
    if (isSetTotalNumOfPoi()) {
      if (!first) sb.append(", ");
      sb.append("totalNumOfPoi:");
      sb.append(this.totalNumOfPoi);
      first = false;
    }
    if (isSetStrategy()) {
      if (!first) sb.append(", ");
      sb.append("strategy:");
      if (this.strategy == null) {
        sb.append("null");
      } else {
        sb.append(this.strategy);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CrossRecResponseStandardSchemeFactory implements SchemeFactory {
    public CrossRecResponseStandardScheme getScheme() {
      return new CrossRecResponseStandardScheme();
    }
  }

  private static class CrossRecResponseStandardScheme extends StandardScheme<CrossRecResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CrossRecResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POI_ARRAY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list96 = iprot.readListBegin();
                struct.poiArrayList = new ArrayList<Long>(_list96.size);
                for (int _i97 = 0; _i97 < _list96.size; ++_i97)
                {
                  long _elem98; // required
                  _elem98 = iprot.readI64();
                  struct.poiArrayList.add(_elem98);
                }
                iprot.readListEnd();
              }
              struct.setPoiArrayListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_NUM_OF_POI
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalNumOfPoi = iprot.readI32();
              struct.setTotalNumOfPoiIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STRATEGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.strategy = iprot.readString();
              struct.setStrategyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CrossRecResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.poiArrayList != null) {
        oprot.writeFieldBegin(POI_ARRAY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.poiArrayList.size()));
          for (long _iter99 : struct.poiArrayList)
          {
            oprot.writeI64(_iter99);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalNumOfPoi()) {
        oprot.writeFieldBegin(TOTAL_NUM_OF_POI_FIELD_DESC);
        oprot.writeI32(struct.totalNumOfPoi);
        oprot.writeFieldEnd();
      }
      if (struct.strategy != null) {
        if (struct.isSetStrategy()) {
          oprot.writeFieldBegin(STRATEGY_FIELD_DESC);
          oprot.writeString(struct.strategy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CrossRecResponseTupleSchemeFactory implements SchemeFactory {
    public CrossRecResponseTupleScheme getScheme() {
      return new CrossRecResponseTupleScheme();
    }
  }

  private static class CrossRecResponseTupleScheme extends TupleScheme<CrossRecResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CrossRecResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPoiArrayList()) {
        optionals.set(0);
      }
      if (struct.isSetTotalNumOfPoi()) {
        optionals.set(1);
      }
      if (struct.isSetStrategy()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPoiArrayList()) {
        {
          oprot.writeI32(struct.poiArrayList.size());
          for (long _iter100 : struct.poiArrayList)
          {
            oprot.writeI64(_iter100);
          }
        }
      }
      if (struct.isSetTotalNumOfPoi()) {
        oprot.writeI32(struct.totalNumOfPoi);
      }
      if (struct.isSetStrategy()) {
        oprot.writeString(struct.strategy);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CrossRecResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list101 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.poiArrayList = new ArrayList<Long>(_list101.size);
          for (int _i102 = 0; _i102 < _list101.size; ++_i102)
          {
            long _elem103; // required
            _elem103 = iprot.readI64();
            struct.poiArrayList.add(_elem103);
          }
        }
        struct.setPoiArrayListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalNumOfPoi = iprot.readI32();
        struct.setTotalNumOfPoiIsSet(true);
      }
      if (incoming.get(2)) {
        struct.strategy = iprot.readString();
        struct.setStrategyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
    }
  }

}
