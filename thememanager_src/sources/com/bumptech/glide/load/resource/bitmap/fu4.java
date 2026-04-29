package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C3049g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.util.C3201k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes2.dex */
interface fu4 {

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.fu4$k */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class C3096k implements fu4 {

        /* JADX INFO: renamed from: k */
        private final byte[] f18691k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<ImageHeaderParser> f62882toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62883zy;

        C3096k(byte[] bArr, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18691k = bArr;
            this.f62882toq = list;
            this.f62883zy = toqVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        @dd
        /* JADX INFO: renamed from: k */
        public Bitmap mo10959k(BitmapFactory.Options options) {
            byte[] bArr = this.f18691k;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        /* JADX INFO: renamed from: q */
        public ImageHeaderParser.ImageType mo10960q() throws IOException {
            return C3049g.f7l8(this.f62882toq, ByteBuffer.wrap(this.f18691k));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public void toq() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public int zy() throws IOException {
            return C3049g.zy(this.f62882toq, ByteBuffer.wrap(this.f18691k), this.f62883zy);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.fu4$n */
    /* JADX INFO: compiled from: ImageReader.java */
    @hyr(21)
    public static final class C3097n implements fu4 {

        /* JADX INFO: renamed from: k */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18692k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<ImageHeaderParser> f62884toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f62885zy;

        C3097n(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18692k = (com.bumptech.glide.load.engine.bitmap_recycle.toq) com.bumptech.glide.util.qrj.m11262q(toqVar);
            this.f62884toq = (List) com.bumptech.glide.util.qrj.m11262q(list);
            this.f62885zy = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        @dd
        /* JADX INFO: renamed from: k */
        public Bitmap mo10959k(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f62885zy.mo10630k().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        /* JADX INFO: renamed from: q */
        public ImageHeaderParser.ImageType mo10960q() throws IOException {
            return C3049g.m10840n(this.f62884toq, this.f62885zy, this.f18692k);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public void toq() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public int zy() throws IOException {
            return C3049g.m10839k(this.f62884toq, this.f62885zy, this.f18692k);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.fu4$q */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class C3098q implements fu4 {

        /* JADX INFO: renamed from: k */
        private final com.bumptech.glide.load.data.ld6 f18693k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62886toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final List<ImageHeaderParser> f62887zy;

        C3098q(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f62886toq = (com.bumptech.glide.load.engine.bitmap_recycle.toq) com.bumptech.glide.util.qrj.m11262q(toqVar);
            this.f62887zy = (List) com.bumptech.glide.util.qrj.m11262q(list);
            this.f18693k = new com.bumptech.glide.load.data.ld6(inputStream, toqVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        @dd
        /* JADX INFO: renamed from: k */
        public Bitmap mo10959k(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f18693k.mo10630k(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        /* JADX INFO: renamed from: q */
        public ImageHeaderParser.ImageType mo10960q() throws IOException {
            return C3049g.m10838g(this.f62887zy, this.f18693k.mo10630k(), this.f62886toq);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public void toq() {
            this.f18693k.zy();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public int zy() throws IOException {
            return C3049g.toq(this.f62887zy, this.f18693k.mo10630k(), this.f62886toq);
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class toq implements fu4 {

        /* JADX INFO: renamed from: k */
        private final ByteBuffer f18694k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<ImageHeaderParser> f62888toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62889zy;

        toq(ByteBuffer byteBuffer, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18694k = byteBuffer;
            this.f62888toq = list;
            this.f62889zy = toqVar;
        }

        /* JADX INFO: renamed from: n */
        private InputStream m10961n() {
            return C3201k.f7l8(C3201k.m11223q(this.f18694k));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        @dd
        /* JADX INFO: renamed from: k */
        public Bitmap mo10959k(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m10961n(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        /* JADX INFO: renamed from: q */
        public ImageHeaderParser.ImageType mo10960q() throws IOException {
            return C3049g.f7l8(this.f62888toq, C3201k.m11223q(this.f18694k));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public void toq() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public int zy() throws IOException {
            return C3049g.zy(this.f62888toq, C3201k.m11223q(this.f18694k), this.f62889zy);
        }
    }

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class zy implements fu4 {

        /* JADX INFO: renamed from: k */
        private final File f18695k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<ImageHeaderParser> f62890toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62891zy;

        zy(File file, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
            this.f18695k = file;
            this.f62890toq = list;
            this.f62891zy = toqVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        @dd
        /* JADX INFO: renamed from: k */
        public Bitmap mo10959k(BitmapFactory.Options options) throws Throwable {
            C3114t c3114t = null;
            try {
                C3114t c3114t2 = new C3114t(new FileInputStream(this.f18695k), this.f62891zy);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c3114t2, null, options);
                    try {
                        c3114t2.close();
                    } catch (IOException unused) {
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    th = th;
                    c3114t = c3114t2;
                    if (c3114t != null) {
                        try {
                            c3114t.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        /* JADX INFO: renamed from: q */
        public ImageHeaderParser.ImageType mo10960q() throws Throwable {
            C3114t c3114t;
            Throwable th;
            try {
                c3114t = new C3114t(new FileInputStream(this.f18695k), this.f62891zy);
                try {
                    ImageHeaderParser.ImageType imageTypeM10838g = C3049g.m10838g(this.f62890toq, c3114t, this.f62891zy);
                    try {
                        c3114t.close();
                    } catch (IOException unused) {
                    }
                    return imageTypeM10838g;
                } catch (Throwable th2) {
                    th = th2;
                    if (c3114t != null) {
                        try {
                            c3114t.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c3114t = null;
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public void toq() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.fu4
        public int zy() throws Throwable {
            C3114t c3114t;
            Throwable th;
            try {
                c3114t = new C3114t(new FileInputStream(this.f18695k), this.f62891zy);
                try {
                    int qVar = C3049g.toq(this.f62890toq, c3114t, this.f62891zy);
                    try {
                        c3114t.close();
                    } catch (IOException unused) {
                    }
                    return qVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (c3114t != null) {
                        try {
                            c3114t.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c3114t = null;
                th = th3;
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: k */
    Bitmap mo10959k(BitmapFactory.Options options) throws IOException;

    /* JADX INFO: renamed from: q */
    ImageHeaderParser.ImageType mo10960q() throws IOException;

    void toq();

    int zy() throws IOException;
}
