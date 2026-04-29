package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C3087p;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.p */
/* JADX INFO: compiled from: ByteBufferBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3111p implements com.bumptech.glide.load.x2<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final cdj f18746k;

    public C3111p(cdj cdjVar) {
        this.f18746k = cdjVar;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui ByteBuffer byteBuffer, @lvui C3087p c3087p) {
        return this.f18746k.m10936i(byteBuffer);
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui ByteBuffer byteBuffer, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        return this.f18746k.m10940y(byteBuffer, i2, i3, c3087p);
    }
}
