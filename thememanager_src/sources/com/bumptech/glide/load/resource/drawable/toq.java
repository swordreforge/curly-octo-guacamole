package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C3049g;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.resource.C3133k;
import com.bumptech.glide.load.x2;
import com.bumptech.glide.util.C3201k;
import com.bumptech.glide.util.kja0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AnimatedWebpDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(28)
@Deprecated
public final class toq {

    /* JADX INFO: renamed from: k */
    private final List<ImageHeaderParser> f18776k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62947toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.toq$k */
    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    private static final class C3121k implements zurt<Drawable> {

        /* JADX INFO: renamed from: q */
        private static final int f18777q = 2;

        /* JADX INFO: renamed from: k */
        private final AnimatedImageDrawable f18778k;

        C3121k(AnimatedImageDrawable animatedImageDrawable) {
            this.f18778k = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f18778k;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: n */
        public Class<Drawable> mo10765n() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public void toq() {
            this.f18778k.stop();
            this.f18778k.clearAnimationCallbacks();
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public int zy() {
            return this.f18778k.getIntrinsicWidth() * this.f18778k.getIntrinsicHeight() * kja0.m11232s(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    private static final class C7947toq implements x2<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: k */
        private final toq f18779k;

        C7947toq(toq toqVar) {
            this.f18779k = toqVar;
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo10948k(@lvui ByteBuffer byteBuffer, @lvui C3087p c3087p) throws IOException {
            return this.f18779k.m11028q(byteBuffer);
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public zurt<Drawable> toq(@lvui ByteBuffer byteBuffer, int i2, int i3, @lvui C3087p c3087p) throws IOException {
            return this.f18779k.toq(ImageDecoder.createSource(byteBuffer), i2, i3, c3087p);
        }
    }

    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    private static final class zy implements x2<InputStream, Drawable> {

        /* JADX INFO: renamed from: k */
        private final toq f18780k;

        zy(toq toqVar) {
            this.f18780k = toqVar;
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo10948k(@lvui InputStream inputStream, @lvui C3087p c3087p) throws IOException {
            return this.f18780k.zy(inputStream);
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public zurt<Drawable> toq(@lvui InputStream inputStream, int i2, int i3, @lvui C3087p c3087p) throws IOException {
            return this.f18780k.toq(ImageDecoder.createSource(C3201k.toq(inputStream)), i2, i3, c3087p);
        }
    }

    private toq(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18776k = list;
        this.f62947toq = toqVar;
    }

    /* JADX INFO: renamed from: g */
    public static x2<InputStream, Drawable> m11025g(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        return new zy(new toq(list, toqVar));
    }

    /* JADX INFO: renamed from: k */
    public static x2<ByteBuffer, Drawable> m11026k(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        return new C7947toq(new toq(list, toqVar));
    }

    /* JADX INFO: renamed from: n */
    private boolean m11027n(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    /* JADX INFO: renamed from: q */
    boolean m11028q(ByteBuffer byteBuffer) throws IOException {
        return m11027n(C3049g.f7l8(this.f18776k, byteBuffer));
    }

    zurt<Drawable> toq(@lvui ImageDecoder.Source source, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C3133k(i2, i3, c3087p));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C3121k((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    boolean zy(InputStream inputStream) throws IOException {
        return m11027n(C3049g.m10838g(this.f18776k, inputStream, this.f62947toq));
    }
}
