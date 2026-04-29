package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.k */
/* JADX INFO: compiled from: AnimatedImageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(28)
public final class C3118k {

    /* JADX INFO: renamed from: k */
    private final List<ImageHeaderParser> f18770k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62946toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.k$k */
    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    private static final class k implements zurt<Drawable> {

        /* JADX INFO: renamed from: q */
        private static final int f18771q = 2;

        /* JADX INFO: renamed from: k */
        private final AnimatedImageDrawable f18772k;

        k(AnimatedImageDrawable animatedImageDrawable) {
            this.f18772k = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f18772k;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        @lvui
        /* JADX INFO: renamed from: n */
        public Class<Drawable> mo10765n() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public void toq() {
            this.f18772k.stop();
            this.f18772k.clearAnimationCallbacks();
        }

        @Override // com.bumptech.glide.load.engine.zurt
        public int zy() {
            return this.f18772k.getIntrinsicWidth() * this.f18772k.getIntrinsicHeight() * kja0.m11232s(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.k$toq */
    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    private static final class toq implements x2<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: k */
        private final C3118k f18773k;

        toq(C3118k c3118k) {
            this.f18773k = c3118k;
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo10948k(@lvui ByteBuffer byteBuffer, @lvui C3087p c3087p) throws IOException {
            return this.f18773k.m11019q(byteBuffer);
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public zurt<Drawable> toq(@lvui ByteBuffer byteBuffer, int i2, int i3, @lvui C3087p c3087p) throws IOException {
            return this.f18773k.toq(ImageDecoder.createSource(byteBuffer), i2, i3, c3087p);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.k$zy */
    /* JADX INFO: compiled from: AnimatedImageDecoder.java */
    private static final class zy implements x2<InputStream, Drawable> {

        /* JADX INFO: renamed from: k */
        private final C3118k f18774k;

        zy(C3118k c3118k) {
            this.f18774k = c3118k;
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo10948k(@lvui InputStream inputStream, @lvui C3087p c3087p) throws IOException {
            return this.f18774k.zy(inputStream);
        }

        @Override // com.bumptech.glide.load.x2
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public zurt<Drawable> toq(@lvui InputStream inputStream, int i2, int i3, @lvui C3087p c3087p) throws IOException {
            return this.f18774k.toq(ImageDecoder.createSource(C3201k.toq(inputStream)), i2, i3, c3087p);
        }
    }

    private C3118k(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18770k = list;
        this.f62946toq = toqVar;
    }

    /* JADX INFO: renamed from: g */
    public static x2<InputStream, Drawable> m11016g(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        return new zy(new C3118k(list, toqVar));
    }

    /* JADX INFO: renamed from: k */
    public static x2<ByteBuffer, Drawable> m11017k(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        return new toq(new C3118k(list, toqVar));
    }

    /* JADX INFO: renamed from: n */
    private boolean m11018n(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    /* JADX INFO: renamed from: q */
    boolean m11019q(ByteBuffer byteBuffer) throws IOException {
        return m11018n(C3049g.f7l8(this.f18770k, byteBuffer));
    }

    zurt<Drawable> toq(@lvui ImageDecoder.Source source, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C3133k(i2, i3, c3087p));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new k((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean zy(InputStream inputStream) throws IOException {
        return m11018n(C3049g.m10838g(this.f18770k, inputStream, this.f62946toq));
    }
}
