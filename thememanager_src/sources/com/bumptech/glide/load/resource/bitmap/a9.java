package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f62865zy;

    /* JADX INFO: renamed from: q */
    private static final String f18666q = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: n */
    private static final byte[] f18665n = f18666q.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    public a9(int i2) {
        com.bumptech.glide.util.qrj.m11260k(i2 > 0, "roundingRadius must be greater than 0.");
        this.f62865zy = i2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return (obj instanceof a9) && this.f62865zy == ((a9) obj).f62865zy;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return com.bumptech.glide.util.kja0.m11226h(-569625254, com.bumptech.glide.util.kja0.kja0(this.f62865zy));
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18665n);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f62865zy).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.cdj(interfaceC3008n, bitmap, this.f62865zy);
    }
}
