package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageHeaderParser {

    /* JADX INFO: renamed from: k */
    public static final int f18202k = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z2) {
            this.hasAlpha = z2;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i2 = C2989k.f18203k[ordinal()];
            return i2 == 1 || i2 == 2 || i2 == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$k */
    static /* synthetic */ class C2989k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f18203k;

        static {
            int[] iArr = new int[ImageType.values().length];
            f18203k = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18203k[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18203k[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    ImageType mo10628k(@lvui ByteBuffer byteBuffer) throws IOException;

    /* JADX INFO: renamed from: q */
    int mo10629q(@lvui InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException;

    int toq(@lvui ByteBuffer byteBuffer, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException;

    @lvui
    ImageType zy(@lvui InputStream inputStream) throws IOException;
}
