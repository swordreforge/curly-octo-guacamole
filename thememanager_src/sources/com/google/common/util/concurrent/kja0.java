package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: AtomicDouble.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 extends Number implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: k */
    private transient AtomicLong f27474k;

    public kja0(double d2) {
        this.f27474k = new AtomicLong(Double.doubleToRawLongBits(d2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f27474k = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d2) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.f27474k.get();
            dLongBitsToDouble = Double.longBitsToDouble(j2) + d2;
        } while (!this.f27474k.compareAndSet(j2, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(double d2, double d4) {
        return this.f27474k.compareAndSet(Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d4));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.f27474k.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d2) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.f27474k.get();
            dLongBitsToDouble = Double.longBitsToDouble(j2);
        } while (!this.f27474k.compareAndSet(j2, Double.doubleToRawLongBits(dLongBitsToDouble + d2)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(double d2) {
        return Double.longBitsToDouble(this.f27474k.getAndSet(Double.doubleToRawLongBits(d2)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d2) {
        this.f27474k.lazySet(Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d2) {
        this.f27474k.set(Double.doubleToRawLongBits(d2));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d2, double d4) {
        return this.f27474k.weakCompareAndSet(Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d4));
    }

    public kja0() {
        this(0.0d);
    }
}
