package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: FitCenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class fn3e extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62879zy = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* JADX INFO: renamed from: q */
    private static final byte[] f18688q = f62879zy.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return obj instanceof fn3e;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18688q);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.m10966g(interfaceC3008n, bitmap, i2, i3);
    }
}
