package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C3087p;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(api = 28)
public final class ld6 implements com.bumptech.glide.load.x2<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final C3099g f18730k = new C3099g();

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui ByteBuffer byteBuffer, @lvui C3087p c3087p) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui ByteBuffer byteBuffer, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        return this.f18730k.toq(ImageDecoder.createSource(byteBuffer), i2, i3, c3087p);
    }
}
