package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: CenterInside.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends AbstractC3115y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62936zy = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* JADX INFO: renamed from: q */
    private static final byte[] f18747q = f62936zy.getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        return obj instanceof qrj;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f18747q);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n interfaceC3008n, @lvui Bitmap bitmap, int i2, int i3) {
        return jp0y.zy(interfaceC3008n, bitmap, i2, i3);
    }
}
