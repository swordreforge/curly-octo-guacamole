package com.google.common.cache;

import com.google.common.cache.AbstractC4284i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: LongAdder.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class n7h extends AbstractC4284i implements Serializable, x2 {
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

    @Override // com.google.common.cache.x2
    public void add(long j2) {
        int length;
        AbstractC4284i.toq toqVar;
        AbstractC4284i.toq[] toqVarArr = this.cells;
        if (toqVarArr == null) {
            long j3 = this.base;
            if (casBase(j3, j3 + j2)) {
                return;
            }
        }
        int[] iArr = AbstractC4284i.threadHashCode.get();
        boolean zM15472k = true;
        if (iArr != null && toqVarArr != null && (length = toqVarArr.length) >= 1 && (toqVar = toqVarArr[(length - 1) & iArr[0]]) != null) {
            long j4 = toqVar.f25782y;
            zM15472k = toqVar.m15472k(j4, j4 + j2);
            if (zM15472k) {
                return;
            }
        }
        retryUpdate(j2, iArr, zM15472k);
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

    @Override // com.google.common.cache.AbstractC4284i
    final long fn(long j2, long j3) {
        return j2 + j3;
    }

    @Override // com.google.common.cache.x2
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

    @Override // com.google.common.cache.x2
    public long sum() {
        long j2 = this.base;
        AbstractC4284i.toq[] toqVarArr = this.cells;
        if (toqVarArr != null) {
            for (AbstractC4284i.toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    j2 += toqVar.f25782y;
                }
            }
        }
        return j2;
    }

    public long sumThenReset() {
        long j2 = this.base;
        AbstractC4284i.toq[] toqVarArr = this.cells;
        this.base = 0L;
        if (toqVarArr != null) {
            for (AbstractC4284i.toq toqVar : toqVarArr) {
                if (toqVar != null) {
                    j2 += toqVar.f25782y;
                    toqVar.f25782y = 0L;
                }
            }
        }
        return j2;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
