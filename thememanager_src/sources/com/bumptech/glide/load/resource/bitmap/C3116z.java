package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.util.C3201k;
import java.io.IOException;
import java.io.InputStream;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.z */
/* JADX INFO: compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(api = 28)
public final class C3116z implements com.bumptech.glide.load.x2<InputStream, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final C3099g f18758k = new C3099g();

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui InputStream inputStream, @lvui C3087p c3087p) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui InputStream inputStream, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        return this.f18758k.toq(ImageDecoder.createSource(C3201k.toq(inputStream)), i2, i3, c3087p);
    }
}
