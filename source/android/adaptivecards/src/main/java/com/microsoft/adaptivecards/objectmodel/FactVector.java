/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class FactVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FactVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FactVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FactVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FactVector() {
    this(AdaptiveCardObjectModelJNI.new_FactVector__SWIG_0(), true);
  }

  public FactVector(long n) {
    this(AdaptiveCardObjectModelJNI.new_FactVector__SWIG_1(n), true);
  }

  public long size() {
    return AdaptiveCardObjectModelJNI.FactVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.FactVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.FactVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.FactVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.FactVector_clear(swigCPtr, this);
  }

  public void add(Fact x) {
    AdaptiveCardObjectModelJNI.FactVector_add(swigCPtr, this, Fact.getCPtr(x), x);
  }

  public Fact get(int i) {
    long cPtr = AdaptiveCardObjectModelJNI.FactVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

  public void set(int i, Fact val) {
    AdaptiveCardObjectModelJNI.FactVector_set(swigCPtr, this, i, Fact.getCPtr(val), val);
  }

}
