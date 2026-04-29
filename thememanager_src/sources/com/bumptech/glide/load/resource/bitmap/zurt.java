package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: GranularRoundedCorners.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt extends AbstractC3115y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f62941f7l8 = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: y */
    private static final byte[] f18759y = f62941f7l8.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    /* JADX INFO: renamed from: g */
    private final float f18760g;

    /* JADX INFO: renamed from: n */
    private final float f18761n;

    /* JADX INFO: renamed from: q */
    private final float f18762q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f62942zy;

    public zurt(float f2, float f3, float f4, float f5) {
        this.f62942zy = f2;
        this.f18762q = f3;
        this.f18761n = f4;
        this.f18760g = f5;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof zurt)) {
            return false;
        }
        zurt zurtVar = (zurt) obj;
        return this.f62942zy == zurtVar.f62942zy && this.f18762q == zurtVar.f18762q && this.f18761n == zurtVar.f18761n && this.f18760g == zurtVar.f18760g;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return com.bumptech.glide.util.kja0.n7h(this.f18760g, com.bumptech.glide.util.kja0.n7h(this.f18761n, com.bumptech.glide.util.kja0.n7h(this.f18762q, com.bumptech.glide.util.kja0.m11226h(-2013597734, com.bumptech.glide.util.kja0.qrj(this.f62942zy)))));
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18759y);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f62942zy).putFloat(this.f18762q).putFloat(this.f18761n).putFloat(this.f18760g).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.m10967h(interfaceC3008n, bitmap, this.f62942zy, this.f18762q, this.f18761n, this.f18760g);
    }
}
