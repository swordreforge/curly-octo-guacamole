package com.android.thememanager.basemodule.imageloader;

import java.security.MessageDigest;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.n */
/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public class C1730n implements com.bumptech.glide.load.f7l8 {

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.load.f7l8 f9921q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.f7l8 f57516zy;

    public C1730n(com.bumptech.glide.load.f7l8 sourceKey, com.bumptech.glide.load.f7l8 signature) {
        this.f57516zy = sourceKey;
        this.f9921q = signature;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object o2) {
        if (!(o2 instanceof C1730n)) {
            return false;
        }
        C1730n c1730n = (C1730n) o2;
        return this.f57516zy.equals(c1730n.f57516zy) && this.f9921q.equals(c1730n.f9921q);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return (this.f57516zy.hashCode() * 31) + this.f9921q.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f57516zy + ", signature=" + this.f9921q + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(MessageDigest messageDigest) {
        this.f57516zy.toq(messageDigest);
        this.f9921q.toq(messageDigest);
    }

    public com.bumptech.glide.load.f7l8 zy() {
        return this.f57516zy;
    }
}
