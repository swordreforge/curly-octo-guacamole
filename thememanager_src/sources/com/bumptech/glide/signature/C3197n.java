package com.bumptech.glide.signature;

import com.bumptech.glide.load.f7l8;
import com.bumptech.glide.util.qrj;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.signature.n */
/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3197n implements f7l8 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Object f63066zy;

    public C3197n(@lvui Object obj) {
        this.f63066zy = qrj.m11262q(obj);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof C3197n) {
            return this.f63066zy.equals(((C3197n) obj).f63066zy);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f63066zy.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f63066zy + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(this.f63066zy.toString().getBytes(f7l8.f62824toq));
    }
}
