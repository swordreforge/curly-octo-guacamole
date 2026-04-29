package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.bumptech.glide.load.C3087p;
import java.io.IOException;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class wvg implements com.bumptech.glide.load.x2<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f62939toq = 536870912;

    /* JADX INFO: renamed from: k */
    private final cdj f18756k;

    public wvg(cdj cdjVar) {
        this.f18756k = cdjVar;
    }

    /* JADX INFO: renamed from: n */
    private boolean m11008n(@lvui ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= InterfaceC1789q.h60v;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui ParcelFileDescriptor parcelFileDescriptor, @lvui C3087p c3087p) {
        return m11008n(parcelFileDescriptor) && this.f18756k.ki(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.x2
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        return this.f18756k.m10938q(parcelFileDescriptor, i2, i3, c3087p);
    }
}
