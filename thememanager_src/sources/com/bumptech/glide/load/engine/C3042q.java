package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.q */
/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3042q implements com.bumptech.glide.load.f7l8 {

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.load.f7l8 f18462q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.f7l8 f62808zy;

    C3042q(com.bumptech.glide.load.f7l8 f7l8Var, com.bumptech.glide.load.f7l8 f7l8Var2) {
        this.f62808zy = f7l8Var;
        this.f18462q = f7l8Var2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof C3042q)) {
            return false;
        }
        C3042q c3042q = (C3042q) obj;
        return this.f62808zy.equals(c3042q.f62808zy) && this.f18462q.equals(c3042q.f18462q);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return (this.f62808zy.hashCode() * 31) + this.f18462q.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f62808zy + ", signature=" + this.f18462q + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        this.f62808zy.toq(messageDigest);
        this.f18462q.toq(messageDigest);
    }

    com.bumptech.glide.load.f7l8 zy() {
        return this.f62808zy;
    }
}
