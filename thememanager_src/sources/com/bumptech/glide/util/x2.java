package com.bumptech.glide.util;

import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private Class<?> f19099k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Class<?> f63088toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Class<?> f63089zy;

    public x2() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.f19099k.equals(x2Var.f19099k) && this.f63088toq.equals(x2Var.f63088toq) && kja0.m11231q(this.f63089zy, x2Var.f63089zy);
    }

    public int hashCode() {
        int iHashCode = ((this.f19099k.hashCode() * 31) + this.f63088toq.hashCode()) * 31;
        Class<?> cls = this.f63089zy;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k */
    public void m11264k(@lvui Class<?> cls, @lvui Class<?> cls2) {
        toq(cls, cls2, null);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f19099k + ", second=" + this.f63088toq + '}';
    }

    public void toq(@lvui Class<?> cls, @lvui Class<?> cls2, @dd Class<?> cls3) {
        this.f19099k = cls;
        this.f63088toq = cls2;
        this.f63089zy = cls3;
    }

    public x2(@lvui Class<?> cls, @lvui Class<?> cls2) {
        m11264k(cls, cls2);
    }

    public x2(@lvui Class<?> cls, @lvui Class<?> cls2, @dd Class<?> cls3) {
        toq(cls, cls2, cls3);
    }
}
