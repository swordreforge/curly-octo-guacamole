package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C3087p;
import java.security.MessageDigest;
import java.util.Map;
import zy.lvui;

/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes2.dex */
class n7h implements com.bumptech.glide.load.f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Class<?> f62795f7l8;

    /* JADX INFO: renamed from: g */
    private final Class<?> f18410g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f62796ld6;

    /* JADX INFO: renamed from: n */
    private final int f18411n;

    /* JADX INFO: renamed from: p */
    private final C3087p f18412p;

    /* JADX INFO: renamed from: q */
    private final int f18413q;

    /* JADX INFO: renamed from: s */
    private final Map<Class<?>, com.bumptech.glide.load.n7h<?>> f18414s;

    /* JADX INFO: renamed from: y */
    private final com.bumptech.glide.load.f7l8 f18415y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Object f62797zy;

    n7h(Object obj, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, Class<?> cls, Class<?> cls2, C3087p c3087p) {
        this.f62797zy = com.bumptech.glide.util.qrj.m11262q(obj);
        this.f18415y = (com.bumptech.glide.load.f7l8) com.bumptech.glide.util.qrj.m11261n(f7l8Var, "Signature must not be null");
        this.f18413q = i2;
        this.f18411n = i3;
        this.f18414s = (Map) com.bumptech.glide.util.qrj.m11262q(map);
        this.f18410g = (Class) com.bumptech.glide.util.qrj.m11261n(cls, "Resource class must not be null");
        this.f62795f7l8 = (Class) com.bumptech.glide.util.qrj.m11261n(cls2, "Transcode class must not be null");
        this.f18412p = (C3087p) com.bumptech.glide.util.qrj.m11262q(c3087p);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof n7h)) {
            return false;
        }
        n7h n7hVar = (n7h) obj;
        return this.f62797zy.equals(n7hVar.f62797zy) && this.f18415y.equals(n7hVar.f18415y) && this.f18411n == n7hVar.f18411n && this.f18413q == n7hVar.f18413q && this.f18414s.equals(n7hVar.f18414s) && this.f18410g.equals(n7hVar.f18410g) && this.f62795f7l8.equals(n7hVar.f62795f7l8) && this.f18412p.equals(n7hVar.f18412p);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        if (this.f62796ld6 == 0) {
            int iHashCode = this.f62797zy.hashCode();
            this.f62796ld6 = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f18415y.hashCode()) * 31) + this.f18413q) * 31) + this.f18411n;
            this.f62796ld6 = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f18414s.hashCode();
            this.f62796ld6 = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f18410g.hashCode();
            this.f62796ld6 = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f62795f7l8.hashCode();
            this.f62796ld6 = iHashCode5;
            this.f62796ld6 = (iHashCode5 * 31) + this.f18412p.hashCode();
        }
        return this.f62796ld6;
    }

    public String toString() {
        return "EngineKey{model=" + this.f62797zy + ", width=" + this.f18413q + ", height=" + this.f18411n + ", resourceClass=" + this.f18410g + ", transcodeClass=" + this.f62795f7l8 + ", signature=" + this.f18415y + ", hashCode=" + this.f62796ld6 + ", transformations=" + this.f18414s + ", options=" + this.f18412p + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
