package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.k */
/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3105k<DataType> implements com.bumptech.glide.load.x2<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.x2<DataType, Bitmap> f18715k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Resources f62902toq;

    public C3105k(Context context, com.bumptech.glide.load.x2<DataType, Bitmap> x2Var) {
        this(context.getResources(), x2Var);
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: k */
    public boolean mo10948k(@lvui DataType datatype, @lvui C3087p c3087p) throws IOException {
        return this.f18715k.mo10948k(datatype, c3087p);
    }

    @Override // com.bumptech.glide.load.x2
    public com.bumptech.glide.load.engine.zurt<BitmapDrawable> toq(@lvui DataType datatype, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        return o1t.m10996g(this.f62902toq, this.f18715k.toq(datatype, i2, i3, c3087p));
    }

    @Deprecated
    public C3105k(Resources resources, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.x2<DataType, Bitmap> x2Var) {
        this(resources, x2Var);
    }

    public C3105k(@lvui Resources resources, @lvui com.bumptech.glide.load.x2<DataType, Bitmap> x2Var) {
        this.f62902toq = (Resources) com.bumptech.glide.util.qrj.m11262q(resources);
        this.f18715k = (com.bumptech.glide.load.x2) com.bumptech.glide.util.qrj.m11262q(x2Var);
    }
}
