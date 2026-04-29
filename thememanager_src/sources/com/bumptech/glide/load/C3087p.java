package com.bumptech.glide.load;

import androidx.collection.C0247k;
import java.security.MessageDigest;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.p */
/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3087p implements f7l8 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C0247k<C3138s<?>, Object> f62864zy = new com.bumptech.glide.util.toq();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f7l8(@lvui C3138s<T> c3138s, @lvui Object obj, @lvui MessageDigest messageDigest) {
        c3138s.m11071y(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof C3087p) {
            return this.f62864zy.equals(((C3087p) obj).f62864zy);
        }
        return false;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public <T> C3087p m10927g(@lvui C3138s<T> c3138s, @lvui T t2) {
        this.f62864zy.put(c3138s, t2);
        return this;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f62864zy.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public C3087p m10928n(@lvui C3138s<?> c3138s) {
        this.f62864zy.remove(c3138s);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m10929q(@lvui C3087p c3087p) {
        this.f62864zy.x2(c3087p.f62864zy);
    }

    public String toString() {
        return "Options{values=" + this.f62864zy + '}';
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f62864zy.size(); i2++) {
            f7l8(this.f62864zy.ld6(i2), this.f62864zy.m873h(i2), messageDigest);
        }
    }

    @dd
    public <T> T zy(@lvui C3138s<T> c3138s) {
        return this.f62864zy.containsKey(c3138s) ? (T) this.f62864zy.get(c3138s) : c3138s.m11070q();
    }
}
