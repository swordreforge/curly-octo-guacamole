package com.google.common.util.concurrent;

import com.google.common.primitives.C4749y;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.google.common.util.concurrent.h */
/* JADX INFO: compiled from: AtomicDoubleArray.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public class C4810h implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: k */
    private transient AtomicLongArray f27441k;

    public C4810h(int i2) {
        this.f27441k = new AtomicLongArray(i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        C4749y.zy zyVarBuilder = C4749y.builder();
        for (int i3 = 0; i3 < i2; i3++) {
            zyVarBuilder.m16746k(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f27441k = new AtomicLongArray(zyVarBuilder.m16745g().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            objectOutputStream.writeDouble(get(i2));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i2, double d2) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.f27441k.get(i2);
            dLongBitsToDouble = Double.longBitsToDouble(j2) + d2;
        } while (!this.f27441k.compareAndSet(i2, j2, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(int i2, double d2, double d4) {
        return this.f27441k.compareAndSet(i2, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d4));
    }

    public final double get(int i2) {
        return Double.longBitsToDouble(this.f27441k.get(i2));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i2, double d2) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.f27441k.get(i2);
            dLongBitsToDouble = Double.longBitsToDouble(j2);
        } while (!this.f27441k.compareAndSet(i2, j2, Double.doubleToRawLongBits(dLongBitsToDouble + d2)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(int i2, double d2) {
        return Double.longBitsToDouble(this.f27441k.getAndSet(i2, Double.doubleToRawLongBits(d2)));
    }

    public final void lazySet(int i2, double d2) {
        this.f27441k.lazySet(i2, Double.doubleToRawLongBits(d2));
    }

    public final int length() {
        return this.f27441k.length();
    }

    public final void set(int i2, double d2) {
        this.f27441k.set(i2, Double.doubleToRawLongBits(d2));
    }

    public String toString() {
        int length = length() - 1;
        if (length == -1) {
            return okhttp3.zurt.f43629h;
        }
        StringBuilder sb = new StringBuilder((length + 1) * 19);
        sb.append('[');
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f27441k.get(i2)));
            if (i2 == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i2++;
        }
    }

    public final boolean weakCompareAndSet(int i2, double d2, double d4) {
        return this.f27441k.weakCompareAndSet(i2, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d4));
    }

    public C4810h(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = Double.doubleToRawLongBits(dArr[i2]);
        }
        this.f27441k = new AtomicLongArray(jArr);
    }
}
