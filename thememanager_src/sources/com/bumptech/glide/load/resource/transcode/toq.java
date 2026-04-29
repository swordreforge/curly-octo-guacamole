package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.resource.bitmap.o1t;
import com.bumptech.glide.util.qrj;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements InterfaceC3136n<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: k */
    private final Resources f18835k;

    public toq(@lvui Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3136n
    @dd
    /* JADX INFO: renamed from: k */
    public zurt<BitmapDrawable> mo11064k(@lvui zurt<Bitmap> zurtVar, @lvui C3087p c3087p) {
        return o1t.m10996g(this.f18835k, zurtVar);
    }

    @Deprecated
    public toq(@lvui Resources resources, InterfaceC3008n interfaceC3008n) {
        this(resources);
    }

    public toq(@lvui Resources resources) {
        this.f18835k = (Resources) qrj.m11262q(resources);
    }
}
