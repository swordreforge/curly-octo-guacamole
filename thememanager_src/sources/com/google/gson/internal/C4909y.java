package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.google.gson.internal.y */
/* JADX INFO: compiled from: LazilyParsedNumber.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4909y extends Number {
    private final String value;

    public C4909y(String str) {
        this.value = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.value);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4909y)) {
            return false;
        }
        String str = this.value;
        String str2 = ((C4909y) obj).value;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.value);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.value);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.value).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    public String toString() {
        return this.value;
    }
}
