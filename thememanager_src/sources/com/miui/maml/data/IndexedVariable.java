package com.miui.maml.data;

/* JADX INFO: loaded from: classes3.dex */
public class IndexedVariable {
    protected int mIndex;
    private boolean mIsNumber;
    protected Variables mVars;

    public IndexedVariable(String str, Variables variables, boolean z2) {
        this.mIsNumber = z2;
        this.mIndex = z2 ? variables.registerDoubleVariable(str) : variables.registerVariable(str);
        this.mVars = variables;
    }

    public final Object get() {
        return this.mVars.get(this.mIndex);
    }

    public final Object getArr(int i2) {
        return this.mVars.getArr(this.mIndex, i2);
    }

    public final double getArrDouble(int i2) {
        return this.mVars.getArrDouble(this.mIndex, i2);
    }

    public final String getArrString(int i2) {
        return this.mVars.getArrString(this.mIndex, i2);
    }

    public final double getDouble() {
        return this.mVars.getDouble(this.mIndex);
    }

    public final int getIndex() {
        return this.mIndex;
    }

    public final String getString() {
        return this.mVars.getString(this.mIndex);
    }

    public final Variables getVariables() {
        return this.mVars;
    }

    public final int getVersion() {
        return this.mVars.getVer(this.mIndex, this.mIsNumber);
    }

    public final boolean isNull() {
        if (this.mIsNumber) {
            if (!this.mVars.existsDouble(this.mIndex)) {
                return true;
            }
        } else if (this.mVars.get(this.mIndex) == null) {
            return true;
        }
        return false;
    }

    public final void set(double d2) {
        this.mVars.put(this.mIndex, d2);
    }

    public final boolean setArr(int i2, double d2) {
        return this.mVars.putArr(this.mIndex, i2, d2);
    }

    public final boolean isNull(int i2) {
        if (this.mIsNumber) {
            if (!this.mVars.existsArrItem(this.mIndex, i2)) {
                return true;
            }
        } else if (this.mVars.getArr(this.mIndex, i2) == null) {
            return true;
        }
        return false;
    }

    public final boolean set(Object obj) {
        if (this.mIsNumber) {
            return this.mVars.putDouble(this.mIndex, obj);
        }
        this.mVars.put(this.mIndex, obj);
        return true;
    }

    public final boolean setArr(int i2, Object obj) {
        return this.mIsNumber ? this.mVars.putArrDouble(this.mIndex, i2, obj) : this.mVars.putArr(this.mIndex, i2, obj);
    }
}
