package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: CircleCrop.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f62924zy = 1;

    /* JADX INFO: renamed from: q */
    private static final String f18735q = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* JADX INFO: renamed from: n */
    private static final byte[] f18734n = f18735q.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return obj instanceof n7h;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18734n);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.m10972q(interfaceC3008n, bitmap, i2, i3);
    }
}
