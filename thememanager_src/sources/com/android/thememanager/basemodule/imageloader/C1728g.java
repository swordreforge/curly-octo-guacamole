package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.g */
/* JADX INFO: compiled from: EmptyTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class C1728g extends toq {

    /* JADX INFO: renamed from: q */
    private static final byte[] f9919q = C1728g.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57515zy = "com.android.thememanager.basemodule.imageloader.g";

    @Override // com.android.thememanager.basemodule.imageloader.toq
    /* JADX INFO: renamed from: q */
    protected boolean mo6742q() {
        return true;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(f9919q);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
    protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap toTransform, int outWidth, int outHeight) {
        return toTransform;
    }
}
