package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import zy.lvui;

/* JADX INFO: compiled from: DefaultImageHeaderParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 implements ImageHeaderParser {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f62904cdj = 1464156752;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f62905f7l8 = 18761;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f62906fn3e = 88;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f62907fu4 = 16;

    /* JADX INFO: renamed from: g */
    private static final int f18717g = 19789;

    /* JADX INFO: renamed from: h */
    private static final int f18718h = 1380533830;

    /* JADX INFO: renamed from: i */
    private static final int f18719i = 255;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f62908ki = 1448097792;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f62910ld6 = 217;

    /* JADX INFO: renamed from: n */
    static final int f18720n = 65496;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f62911n7h = 274;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f62912ni7 = 2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f62913o1t = 1718909296;

    /* JADX INFO: renamed from: p */
    private static final int f18721p = 218;

    /* JADX INFO: renamed from: q */
    private static final int f18722q = -1991225785;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f62914qrj = 225;

    /* JADX INFO: renamed from: t */
    private static final int f18724t = 1635150195;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f62915t8r = -256;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62916toq = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f62917wvg = 1635150182;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final int f62918x2 = 255;

    /* JADX INFO: renamed from: z */
    private static final int f18726z = 8;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f62919zurt = 76;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f62920zy = 4671814;

    /* JADX INFO: renamed from: y */
    private static final String f18725y = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: s */
    static final byte[] f18723s = f18725y.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int[] f62909kja0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.kja0$k */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    private static final class C3107k implements zy {

        /* JADX INFO: renamed from: k */
        private final ByteBuffer f18727k;

        C3107k(ByteBuffer byteBuffer) {
            this.f18727k = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        /* JADX INFO: renamed from: k */
        public int mo10982k() throws zy.C3109k {
            return (zy() << 8) | zy();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public long skip(long j2) {
            int iMin = (int) Math.min(this.f18727k.remaining(), j2);
            ByteBuffer byteBuffer = this.f18727k;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public int toq(byte[] bArr, int i2) {
            int iMin = Math.min(i2, this.f18727k.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f18727k.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public short zy() throws zy.C3109k {
            if (this.f18727k.remaining() >= 1) {
                return (short) (this.f18727k.get() & 255);
            }
            throw new zy.C3109k();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.kja0$q */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    private static final class C3108q implements zy {

        /* JADX INFO: renamed from: k */
        private final InputStream f18728k;

        C3108q(InputStream inputStream) {
            this.f18728k = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        /* JADX INFO: renamed from: k */
        public int mo10982k() throws IOException {
            return (zy() << 8) | zy();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public long skip(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long jSkip = this.f18728k.skip(j3);
                if (jSkip <= 0) {
                    if (this.f18728k.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j3 -= jSkip;
            }
            return j2 - j3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public int toq(byte[] bArr, int i2) throws IOException {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.f18728k.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 == 0 && i4 == -1) {
                throw new zy.C3109k();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.kja0.zy
        public short zy() throws IOException {
            int i2 = this.f18728k.read();
            if (i2 != -1) {
                return (short) i2;
            }
            throw new zy.C3109k();
        }
    }

    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        private final ByteBuffer f18729k;

        toq(byte[] bArr, int i2) {
            this.f18729k = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        private boolean zy(int i2, int i3) {
            return this.f18729k.remaining() - i2 >= i3;
        }

        /* JADX INFO: renamed from: k */
        short m10983k(int i2) {
            if (zy(i2, 2)) {
                return this.f18729k.getShort(i2);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: n */
        void m10984n(ByteOrder byteOrder) {
            this.f18729k.order(byteOrder);
        }

        /* JADX INFO: renamed from: q */
        int m10985q() {
            return this.f18729k.remaining();
        }

        int toq(int i2) {
            if (zy(i2, 4)) {
                return this.f18729k.getInt(i2);
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    private interface zy {

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.kja0$zy$k */
        /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
        public static final class C3109k extends IOException {
            private static final long serialVersionUID = 1;

            C3109k() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: k */
        int mo10982k() throws IOException;

        long skip(long j2) throws IOException;

        int toq(byte[] bArr, int i2) throws IOException;

        short zy() throws IOException;
    }

    @lvui
    private ImageHeaderParser.ImageType f7l8(zy zyVar) throws IOException {
        try {
            int iMo10982k = zyVar.mo10982k();
            if (iMo10982k == f18720n) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iZy = (iMo10982k << 8) | zyVar.zy();
            if (iZy == f62920zy) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iZy2 = (iZy << 8) | zyVar.zy();
            if (iZy2 == f18722q) {
                zyVar.skip(21L);
                try {
                    return zyVar.zy() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (zy.C3109k unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iZy2 != 1380533830) {
                return qrj(zyVar, iZy2);
            }
            zyVar.skip(4L);
            if (((zyVar.mo10982k() << 16) | zyVar.mo10982k()) != f62904cdj) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo10982k2 = (zyVar.mo10982k() << 16) | zyVar.mo10982k();
            if ((iMo10982k2 & (-256)) != f62908ki) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i2 = iMo10982k2 & 255;
            if (i2 == 88) {
                zyVar.skip(4L);
                short sZy = zyVar.zy();
                return (sZy & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sZy & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i2 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            zyVar.skip(4L);
            return (zyVar.zy() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (zy.C3109k unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: g */
    private int m10977g(zy zyVar, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        try {
            int iMo10982k = zyVar.mo10982k();
            if (!m10981y(iMo10982k)) {
                if (Log.isLoggable(f62916toq, 3)) {
                    Log.d(f62916toq, "Parser doesn't handle magic number: " + iMo10982k);
                }
                return -1;
            }
            int iM10979p = m10979p(zyVar);
            if (iM10979p == -1) {
                if (Log.isLoggable(f62916toq, 3)) {
                    Log.d(f62916toq, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) toqVar.zy(iM10979p, byte[].class);
            try {
                return x2(zyVar, bArr, iM10979p);
            } finally {
                toqVar.put(bArr);
            }
        } catch (zy.C3109k unused) {
            return -1;
        }
    }

    private static int ld6(toq toqVar) {
        ByteOrder byteOrder;
        short sM10983k = toqVar.m10983k(6);
        if (sM10983k != f62905f7l8) {
            if (sM10983k != f18717g && Log.isLoggable(f62916toq, 3)) {
                Log.d(f62916toq, "Unknown endianness = " + ((int) sM10983k));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        toqVar.m10984n(byteOrder);
        int qVar = toqVar.toq(10) + 6;
        short sM10983k2 = toqVar.m10983k(qVar);
        for (int i2 = 0; i2 < sM10983k2; i2++) {
            int iM10978n = m10978n(qVar, i2);
            short sM10983k3 = toqVar.m10983k(iM10978n);
            if (sM10983k3 == f62911n7h) {
                short sM10983k4 = toqVar.m10983k(iM10978n + 2);
                if (sM10983k4 >= 1 && sM10983k4 <= 12) {
                    int qVar2 = toqVar.toq(iM10978n + 4);
                    if (qVar2 >= 0) {
                        if (Log.isLoggable(f62916toq, 3)) {
                            Log.d(f62916toq, "Got tagIndex=" + i2 + " tagType=" + ((int) sM10983k3) + " formatCode=" + ((int) sM10983k4) + " componentCount=" + qVar2);
                        }
                        int i3 = qVar2 + f62909kja0[sM10983k4];
                        if (i3 <= 4) {
                            int i4 = iM10978n + 8;
                            if (i4 >= 0 && i4 <= toqVar.m10985q()) {
                                if (i3 >= 0 && i3 + i4 <= toqVar.m10985q()) {
                                    return toqVar.m10983k(i4);
                                }
                                if (Log.isLoggable(f62916toq, 3)) {
                                    Log.d(f62916toq, "Illegal number of bytes for TI tag data tagType=" + ((int) sM10983k3));
                                }
                            } else if (Log.isLoggable(f62916toq, 3)) {
                                Log.d(f62916toq, "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) sM10983k3));
                            }
                        } else if (Log.isLoggable(f62916toq, 3)) {
                            Log.d(f62916toq, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM10983k4));
                        }
                    } else if (Log.isLoggable(f62916toq, 3)) {
                        Log.d(f62916toq, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f62916toq, 3)) {
                    Log.d(f62916toq, "Got invalid format code = " + ((int) sM10983k4));
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    private static int m10978n(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    /* JADX INFO: renamed from: p */
    private int m10979p(zy zyVar) throws IOException {
        short sZy;
        int iMo10982k;
        long j2;
        long jSkip;
        do {
            short sZy2 = zyVar.zy();
            if (sZy2 != 255) {
                if (Log.isLoggable(f62916toq, 3)) {
                    Log.d(f62916toq, "Unknown segmentId=" + ((int) sZy2));
                }
                return -1;
            }
            sZy = zyVar.zy();
            if (sZy == f18721p) {
                return -1;
            }
            if (sZy == f62910ld6) {
                if (Log.isLoggable(f62916toq, 3)) {
                    Log.d(f62916toq, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo10982k = zyVar.mo10982k() - 2;
            if (sZy == f62914qrj) {
                return iMo10982k;
            }
            j2 = iMo10982k;
            jSkip = zyVar.skip(j2);
        } while (jSkip == j2);
        if (Log.isLoggable(f62916toq, 3)) {
            Log.d(f62916toq, "Unable to skip enough data, type: " + ((int) sZy) + ", wanted to skip: " + iMo10982k + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private ImageHeaderParser.ImageType qrj(zy zyVar, int i2) throws IOException {
        if (((zyVar.mo10982k() << 16) | zyVar.mo10982k()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo10982k = (zyVar.mo10982k() << 16) | zyVar.mo10982k();
        if (iMo10982k == f18724t) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i3 = 0;
        boolean z2 = iMo10982k == f62917wvg;
        zyVar.skip(4L);
        int i4 = i2 - 16;
        if (i4 % 4 == 0) {
            while (i3 < 5 && i4 > 0) {
                int iMo10982k2 = (zyVar.mo10982k() << 16) | zyVar.mo10982k();
                if (iMo10982k2 == f18724t) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo10982k2 == f62917wvg) {
                    z2 = true;
                }
                i3++;
                i4 -= 4;
            }
        }
        return z2 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: s */
    private boolean m10980s(byte[] bArr, int i2) {
        boolean z2 = bArr != null && i2 > f18723s.length;
        if (z2) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = f18723s;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
        return z2;
    }

    private int x2(zy zyVar, byte[] bArr, int i2) throws IOException {
        int qVar = zyVar.toq(bArr, i2);
        if (qVar == i2) {
            if (m10980s(bArr, i2)) {
                return ld6(new toq(bArr, i2));
            }
            if (Log.isLoggable(f62916toq, 3)) {
                Log.d(f62916toq, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(f62916toq, 3)) {
            Log.d(f62916toq, "Unable to read exif segment data, length: " + i2 + ", actually read: " + qVar);
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m10981y(int i2) {
        return (i2 & f18720n) == f18720n || i2 == f18717g || i2 == f62905f7l8;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @lvui
    /* JADX INFO: renamed from: k */
    public ImageHeaderParser.ImageType mo10628k(@lvui ByteBuffer byteBuffer) throws IOException {
        return f7l8(new C3107k((ByteBuffer) com.bumptech.glide.util.qrj.m11262q(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: q */
    public int mo10629q(@lvui InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        return m10977g(new C3108q((InputStream) com.bumptech.glide.util.qrj.m11262q(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.toq) com.bumptech.glide.util.qrj.m11262q(toqVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int toq(@lvui ByteBuffer byteBuffer, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) throws IOException {
        return m10977g(new C3107k((ByteBuffer) com.bumptech.glide.util.qrj.m11262q(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.toq) com.bumptech.glide.util.qrj.m11262q(toqVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @lvui
    public ImageHeaderParser.ImageType zy(@lvui InputStream inputStream) throws IOException {
        return f7l8(new C3108q((InputStream) com.bumptech.glide.util.qrj.m11262q(inputStream)));
    }
}
