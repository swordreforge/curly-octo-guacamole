package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Count.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class x9kr implements Serializable {
    private int value;

    x9kr(int i2) {
        this.value = i2;
    }

    public void add(int i2) {
        this.value += i2;
    }

    public int addAndGet(int i2) {
        int i3 = this.value + i2;
        this.value = i3;
        return i3;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof x9kr) && ((x9kr) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int i2) {
        int i3 = this.value;
        this.value = i2;
        return i3;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int i2) {
        this.value = i2;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
