package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.util.C3204p;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes2.dex */
final class fu4 implements com.bumptech.glide.load.f7l8 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final C3204p<Class<?>, byte[]> f62771ld6 = new C3204p<>(50);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f62772f7l8;

    /* JADX INFO: renamed from: g */
    private final int f18370g;

    /* JADX INFO: renamed from: n */
    private final com.bumptech.glide.load.f7l8 f18371n;

    /* JADX INFO: renamed from: p */
    private final com.bumptech.glide.load.n7h<?> f18372p;

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.load.f7l8 f18373q;

    /* JADX INFO: renamed from: s */
    private final C3087p f18374s;

    /* JADX INFO: renamed from: y */
    private final Class<?> f18375y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62773zy;

    fu4(com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, com.bumptech.glide.load.f7l8 f7l8Var, com.bumptech.glide.load.f7l8 f7l8Var2, int i2, int i3, com.bumptech.glide.load.n7h<?> n7hVar, Class<?> cls, C3087p c3087p) {
        this.f62773zy = toqVar;
        this.f18373q = f7l8Var;
        this.f18371n = f7l8Var2;
        this.f18370g = i2;
        this.f62772f7l8 = i3;
        this.f18372p = n7hVar;
        this.f18375y = cls;
        this.f18374s = c3087p;
    }

    private byte[] zy() {
        C3204p<Class<?>, byte[]> c3204p = f62771ld6;
        byte[] bArrLd6 = c3204p.ld6(this.f18375y);
        if (bArrLd6 != null) {
            return bArrLd6;
        }
        byte[] bytes = this.f18375y.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);
        c3204p.kja0(this.f18375y, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof fu4)) {
            return false;
        }
        fu4 fu4Var = (fu4) obj;
        return this.f62772f7l8 == fu4Var.f62772f7l8 && this.f18370g == fu4Var.f18370g && com.bumptech.glide.util.kja0.m11231q(this.f18372p, fu4Var.f18372p) && this.f18375y.equals(fu4Var.f18375y) && this.f18373q.equals(fu4Var.f18373q) && this.f18371n.equals(fu4Var.f18371n) && this.f18374s.equals(fu4Var.f18374s);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        int iHashCode = (((((this.f18373q.hashCode() * 31) + this.f18371n.hashCode()) * 31) + this.f18370g) * 31) + this.f62772f7l8;
        com.bumptech.glide.load.n7h<?> n7hVar = this.f18372p;
        if (n7hVar != null) {
            iHashCode = (iHashCode * 31) + n7hVar.hashCode();
        }
        return (((iHashCode * 31) + this.f18375y.hashCode()) * 31) + this.f18374s.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f18373q + ", signature=" + this.f18371n + ", width=" + this.f18370g + ", height=" + this.f62772f7l8 + ", decodedResourceClass=" + this.f18375y + ", transformation='" + this.f18372p + "', options=" + this.f18374s + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f62773zy.mo10698q(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f18370g).putInt(this.f62772f7l8).array();
        this.f18371n.toq(messageDigest);
        this.f18373q.toq(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.n7h<?> n7hVar = this.f18372p;
        if (n7hVar != null) {
            n7hVar.toq(messageDigest);
        }
        this.f18374s.toq(messageDigest);
        messageDigest.update(zy());
        this.f62773zy.put(bArr);
    }
}
