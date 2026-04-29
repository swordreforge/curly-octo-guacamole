package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C3087p;
import zy.lvui;

/* JADX INFO: compiled from: UnitBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gvn7 implements com.bumptech.glide.load.x2<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.gvn7$k */
    /* JADX INFO: compiled from: UnitBitmapDecoder.java */
    private static final class C3100k implements com.bumptech.glide.load.engine.zurt<Bitmap> {

        /* JADX INFO: renamed from: k */
        private final Bitmap f18697k;

        C3100k(@lvui Bitmap bitmap) {
            this.f18697k = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f18697k;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: n */
        public Class<Bitmap> mo10765n() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public void toq() {
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public int zy() {
            return com.bumptech.glide.util.kja0.m11233y(this.f18697k);
        }
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui Bitmap bitmap, @lvui C3087p c3087p) {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui Bitmap bitmap, int i2, int i3, @lvui C3087p c3087p) {
        return new C3100k(bitmap);
    }
}
