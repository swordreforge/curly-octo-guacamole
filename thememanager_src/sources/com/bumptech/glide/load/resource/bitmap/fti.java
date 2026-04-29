package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.resource.bitmap.cdj;
import com.bumptech.glide.util.C3203n;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class fti implements com.bumptech.glide.load.x2<InputStream, Bitmap> {

    /* JADX INFO: renamed from: k */
    private final cdj f18689k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62880toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.fti$k */
    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    static class C3095k implements cdj.toq {

        /* JADX INFO: renamed from: k */
        private final C3114t f18690k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C3203n f62881toq;

        C3095k(C3114t c3114t, C3203n c3203n) {
            this.f18690k = c3114t;
            this.f62881toq = c3203n;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.cdj.toq
        /* JADX INFO: renamed from: k */
        public void mo10941k(InterfaceC3008n interfaceC3008n, Bitmap bitmap) throws IOException {
            IOException iOExceptionZy = this.f62881toq.zy();
            if (iOExceptionZy != null) {
                if (bitmap == null) {
                    throw iOExceptionZy;
                }
                interfaceC3008n.mo10669q(bitmap);
                throw iOExceptionZy;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.cdj.toq
        public void toq() {
            this.f18690k.zy();
        }
    }

    public fti(cdj cdjVar, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18689k = cdjVar;
        this.f62880toq = toqVar;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui InputStream inputStream, @lvui C3087p c3087p) {
        return this.f18689k.t8r(inputStream);
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui InputStream inputStream, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        boolean z2;
        C3114t c3114t;
        if (inputStream instanceof C3114t) {
            c3114t = (C3114t) inputStream;
            z2 = false;
        } else {
            z2 = true;
            c3114t = new C3114t(inputStream, this.f62880toq);
        }
        C3203n c3203nM11237q = C3203n.m11237q(c3114t);
        try {
            return this.f18689k.f7l8(new com.bumptech.glide.util.ld6(c3203nM11237q), i2, i3, c3087p, new C3095k(c3114t, c3203nM11237q));
        } finally {
            c3203nM11237q.m11239y();
            if (z2) {
                c3114t.m11006q();
            }
        }
    }
}
