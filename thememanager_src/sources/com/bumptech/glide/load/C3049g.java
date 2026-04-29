package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C3114t;
import com.bumptech.glide.util.C3201k;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.g */
/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3049g {

    /* JADX INFO: renamed from: k */
    private static final int f18543k = 5242880;

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$f7l8 */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    private interface f7l8 {
        /* JADX INFO: renamed from: k */
        int mo10843k(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$g */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class g implements f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ParcelFileDescriptorRewinder f18544k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.toq f62825toq;

        g(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18544k = parcelFileDescriptorRewinder;
            this.f62825toq = toqVar;
        }

        @Override // com.bumptech.glide.load.C3049g.f7l8
        /* JADX INFO: renamed from: k */
        public int mo10843k(ImageHeaderParser imageHeaderParser) throws Throwable {
            C3114t c3114t = null;
            try {
                C3114t c3114t2 = new C3114t(new FileInputStream(this.f18544k.mo10630k().getFileDescriptor()), this.f62825toq);
                try {
                    int iMo10629q = imageHeaderParser.mo10629q(c3114t2, this.f62825toq);
                    c3114t2.m11006q();
                    this.f18544k.mo10630k();
                    return iMo10629q;
                } catch (Throwable th) {
                    th = th;
                    c3114t = c3114t2;
                    if (c3114t != null) {
                        c3114t.m11006q();
                    }
                    this.f18544k.mo10630k();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$k */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class k implements y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InputStream f18545k;

        k(InputStream inputStream) {
            this.f18545k = inputStream;
        }

        @Override // com.bumptech.glide.load.C3049g.y
        /* JADX INFO: renamed from: k */
        public ImageHeaderParser.ImageType mo10844k(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.zy(this.f18545k);
            } finally {
                this.f18545k.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$n */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class n implements f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InputStream f18546k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.toq f62826toq;

        n(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18546k = inputStream;
            this.f62826toq = toqVar;
        }

        @Override // com.bumptech.glide.load.C3049g.f7l8
        /* JADX INFO: renamed from: k */
        public int mo10843k(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo10629q(this.f18546k, this.f62826toq);
            } finally {
                this.f18546k.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$q */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class q implements f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ByteBuffer f18547k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.toq f62827toq;

        q(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18547k = byteBuffer;
            this.f62827toq = toqVar;
        }

        @Override // com.bumptech.glide.load.C3049g.f7l8
        /* JADX INFO: renamed from: k */
        public int mo10843k(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.toq(this.f18547k, this.f62827toq);
            } finally {
                C3201k.m11223q(this.f18547k);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$toq */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class toq implements y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ByteBuffer f18548k;

        toq(ByteBuffer byteBuffer) {
            this.f18548k = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C3049g.y
        /* JADX INFO: renamed from: k */
        public ImageHeaderParser.ImageType mo10844k(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo10628k(this.f18548k);
            } finally {
                C3201k.m11223q(this.f18548k);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$y */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    private interface y {
        /* JADX INFO: renamed from: k */
        ImageHeaderParser.ImageType mo10844k(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.g$zy */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    class zy implements y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ParcelFileDescriptorRewinder f18549k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.toq f62828toq;

        zy(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18549k = parcelFileDescriptorRewinder;
            this.f62828toq = toqVar;
        }

        @Override // com.bumptech.glide.load.C3049g.y
        /* JADX INFO: renamed from: k */
        public ImageHeaderParser.ImageType mo10844k(ImageHeaderParser imageHeaderParser) throws Throwable {
            C3114t c3114t = null;
            try {
                C3114t c3114t2 = new C3114t(new FileInputStream(this.f18549k.mo10630k().getFileDescriptor()), this.f62828toq);
                try {
                    ImageHeaderParser.ImageType imageTypeZy = imageHeaderParser.zy(c3114t2);
                    c3114t2.m11006q();
                    this.f18549k.mo10630k();
                    return imageTypeZy;
                } catch (Throwable th) {
                    th = th;
                    c3114t = c3114t2;
                    if (c3114t != null) {
                        c3114t.m11006q();
                    }
                    this.f18549k.mo10630k();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private C3049g() {
    }

    @lvui
    public static ImageHeaderParser.ImageType f7l8(@lvui List<ImageHeaderParser> list, @dd ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m10842y(list, new toq(byteBuffer));
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static ImageHeaderParser.ImageType m10838g(@lvui List<ImageHeaderParser> list, @dd InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3114t(inputStream, toqVar);
        }
        inputStream.mark(f18543k);
        return m10842y(list, new k(inputStream));
    }

    @hyr(21)
    /* JADX INFO: renamed from: k */
    public static int m10839k(@lvui List<ImageHeaderParser> list, @lvui ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        return m10841q(list, new g(parcelFileDescriptorRewinder, toqVar));
    }

    @hyr(21)
    @lvui
    /* JADX INFO: renamed from: n */
    public static ImageHeaderParser.ImageType m10840n(@lvui List<ImageHeaderParser> list, @lvui ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        return m10842y(list, new zy(parcelFileDescriptorRewinder, toqVar));
    }

    /* JADX INFO: renamed from: q */
    private static int m10841q(@lvui List<ImageHeaderParser> list, f7l8 f7l8Var) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iMo10843k = f7l8Var.mo10843k(list.get(i2));
            if (iMo10843k != -1) {
                return iMo10843k;
            }
        }
        return -1;
    }

    public static int toq(@lvui List<ImageHeaderParser> list, @dd InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3114t(inputStream, toqVar);
        }
        inputStream.mark(f18543k);
        return m10841q(list, new n(inputStream, toqVar));
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private static ImageHeaderParser.ImageType m10842y(@lvui List<ImageHeaderParser> list, y yVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType imageTypeMo10844k = yVar.mo10844k(list.get(i2));
            if (imageTypeMo10844k != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo10844k;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int zy(@lvui List<ImageHeaderParser> list, @dd ByteBuffer byteBuffer, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m10841q(list, new q(byteBuffer, toqVar));
    }
}
