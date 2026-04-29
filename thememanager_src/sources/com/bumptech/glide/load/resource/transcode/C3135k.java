package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.zurt;
import java.io.ByteArrayOutputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.transcode.k */
/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3135k implements InterfaceC3136n<Bitmap, byte[]> {

    /* JADX INFO: renamed from: k */
    private final Bitmap.CompressFormat f18834k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f62972toq;

    public C3135k() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3136n
    @dd
    /* JADX INFO: renamed from: k */
    public zurt<byte[]> mo11064k(@lvui zurt<Bitmap> zurtVar, @lvui C3087p c3087p) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zurtVar.get().compress(this.f18834k, this.f62972toq, byteArrayOutputStream);
        zurtVar.toq();
        return new p043do.toq(byteArrayOutputStream.toByteArray());
    }

    public C3135k(@lvui Bitmap.CompressFormat compressFormat, int i2) {
        this.f18834k = compressFormat;
        this.f62972toq = i2;
    }
}
