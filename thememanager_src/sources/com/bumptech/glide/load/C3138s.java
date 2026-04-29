package com.bumptech.glide.load;

import java.security.MessageDigest;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.s */
/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3138s<T> {

    /* JADX INFO: renamed from: n */
    private static final toq<Object> f18837n = new k();

    /* JADX INFO: renamed from: k */
    private final T f18838k;

    /* JADX INFO: renamed from: q */
    private volatile byte[] f18839q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final toq<T> f62976toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f62977zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.s$k */
    /* JADX INFO: compiled from: Option.java */
    class k implements toq<Object> {
        k() {
        }

        @Override // com.bumptech.glide.load.C3138s.toq
        /* JADX INFO: renamed from: k */
        public void mo10952k(@lvui byte[] bArr, @lvui Object obj, @lvui MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.s$toq */
    /* JADX INFO: compiled from: Option.java */
    public interface toq<T> {
        /* JADX INFO: renamed from: k */
        void mo10952k(@lvui byte[] bArr, @lvui T t2, @lvui MessageDigest messageDigest);
    }

    private C3138s(@lvui String str, @dd T t2, @lvui toq<T> toqVar) {
        this.f62977zy = com.bumptech.glide.util.qrj.toq(str);
        this.f18838k = t2;
        this.f62976toq = (toq) com.bumptech.glide.util.qrj.m11262q(toqVar);
    }

    @lvui
    public static <T> C3138s<T> f7l8(@lvui String str, @lvui T t2) {
        return new C3138s<>(str, t2, zy());
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static <T> C3138s<T> m11067g(@lvui String str) {
        return new C3138s<>(str, null, zy());
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static <T> C3138s<T> m11068k(@lvui String str, @lvui toq<T> toqVar) {
        return new C3138s<>(str, null, toqVar);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private byte[] m11069n() {
        if (this.f18839q == null) {
            this.f18839q = this.f62977zy.getBytes(f7l8.f62824toq);
        }
        return this.f18839q;
    }

    @lvui
    public static <T> C3138s<T> toq(@lvui String str, @dd T t2, @lvui toq<T> toqVar) {
        return new C3138s<>(str, t2, toqVar);
    }

    @lvui
    private static <T> toq<T> zy() {
        return (toq<T>) f18837n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3138s) {
            return this.f62977zy.equals(((C3138s) obj).f62977zy);
        }
        return false;
    }

    public int hashCode() {
        return this.f62977zy.hashCode();
    }

    @dd
    /* JADX INFO: renamed from: q */
    public T m11070q() {
        return this.f18838k;
    }

    public String toString() {
        return "Option{key='" + this.f62977zy + "'}";
    }

    /* JADX INFO: renamed from: y */
    public void m11071y(@lvui T t2, @lvui MessageDigest messageDigest) {
        this.f62976toq.mo10952k(m11069n(), t2, messageDigest);
    }
}
