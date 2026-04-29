package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: Rotate.java */
/* JADX INFO: loaded from: classes2.dex */
public class jk extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f62896zy;

    /* JADX INFO: renamed from: q */
    private static final String f18706q = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: n */
    private static final byte[] f18705n = f18706q.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    public jk(int i2) {
        this.f62896zy = i2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return (obj instanceof jk) && this.f62896zy == ((jk) obj).f62896zy;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return com.bumptech.glide.util.kja0.m11226h(-950519196, com.bumptech.glide.util.kja0.kja0(this.f62896zy));
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18705n);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f62896zy).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.n7h(bitmap, this.f62896zy);
    }
}
