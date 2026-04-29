package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: CenterCrop.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62940zy = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* JADX INFO: renamed from: q */
    private static final byte[] f18757q = f62940zy.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return obj instanceof x2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18757q);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.toq(interfaceC3008n, bitmap, i2, i3);
    }
}
