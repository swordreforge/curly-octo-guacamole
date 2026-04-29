package com.google.common.hash;

import com.google.common.hash.a9;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: LongAdder.java */
/* JADX INFO: loaded from: classes2.dex */
final class fu4 extends a9 implements Serializable, zurt {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // com.google.common.hash.zurt
    public void add(long j2) {
        int length;
        a9.toq toqVar;
        a9.toq[] toqVarArr = this.cells;
        if (toqVarArr == null) {
            long j3 = this.base;
            if (casBase(j3, j3 + j2)) {
                return;
            }
        }
        int[] iArr = a9.threadHashCode.get();
        boolean zM16320k = true;
        if (iArr != null && toqVarArr != null && (length = toqVarArr.length) >= 1 && (toqVar = toqVarArr[(length - 1) & iArr[0]]) != null) {
            long j4 = toqVar.f26988y;
            zM16320k = toqVar.m16320k(j4, j4 + j2);
            if (zM16320k) {
                return;
            }
        }
        retryUpdate(j2, iArr, zM16320k);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // com.google.common.hash.a9
    final long fn(long j2, long j3) {
        return j2 + j3;
    }

    @Override // com.google.common.hash.zurt
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        internalReset(0L);
    }

    @Override // com.google.common.hash.zurt
    public long sum() {
        long j2 = this.base;
        a9.toq[] toqVarArr = this.cells;
        if (toqVarArr != null) {
            for (a9.toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    j2 += toqVar.f26988y;
                }
            }
        }
        return j2;
    }

    public long sumThenReset() {
        long j2 = this.base;
        a9.toq[] toqVarArr = this.cells;
        this.base = 0L;
        if (toqVarArr != null) {
            for (a9.toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    j2 += toqVar.f26988y;
                    toqVar.f26988y = 0L;
                }
            }
        }
        return j2;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
