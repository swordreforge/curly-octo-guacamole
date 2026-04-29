package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class eqxt<T> implements com.bumptech.glide.load.x2<T, Bitmap> {

    /* JADX INFO: renamed from: g */
    @yz
    static final int f18675g = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f62876ld6 = "video/webm";

    /* JADX INFO: renamed from: n */
    public static final long f18676n = -1;

    /* JADX INFO: renamed from: q */
    private static final String f18678q = "VideoDecoder";

    /* JADX INFO: renamed from: k */
    private final InterfaceC3092n<T> f18681k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3008n f62877toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3090g f62878zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final C3138s<Long> f62875f7l8 = C3138s.toq("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C3091k());

    /* JADX INFO: renamed from: y */
    public static final C3138s<Integer> f18680y = C3138s.toq("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new toq());

    /* JADX INFO: renamed from: s */
    private static final C3090g f18679s = new C3090g();

    /* JADX INFO: renamed from: p */
    private static final List<String> f18677p = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: compiled from: VideoDecoder.java */
    static final class f7l8 implements InterfaceC3092n<ParcelFileDescriptor> {
        f7l8() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void toq(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo10949k(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$g */
    /* JADX INFO: compiled from: VideoDecoder.java */
    @yz
    static class C3090g {
        C3090g() {
        }

        /* JADX INFO: renamed from: k */
        public MediaMetadataRetriever m10951k() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$k */
    /* JADX INFO: compiled from: VideoDecoder.java */
    class C3091k implements C3138s.toq<Long> {

        /* JADX INFO: renamed from: k */
        private final ByteBuffer f18682k = ByteBuffer.allocate(8);

        C3091k() {
        }

        @Override // com.bumptech.glide.load.C3138s.toq
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo10952k(@lvui byte[] bArr, @lvui Long l2, @lvui MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f18682k) {
                this.f18682k.position(0);
                messageDigest.update(this.f18682k.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$n */
    /* JADX INFO: compiled from: VideoDecoder.java */
    @yz
    interface InterfaceC3092n<T> {
        /* JADX INFO: renamed from: k */
        void mo10949k(MediaExtractor mediaExtractor, T t2) throws IOException;

        void toq(MediaMetadataRetriever mediaMetadataRetriever, T t2);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$q */
    /* JADX INFO: compiled from: VideoDecoder.java */
    @hyr(23)
    static final class C3093q implements InterfaceC3092n<ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$q$k */
        /* JADX INFO: compiled from: VideoDecoder.java */
        class k extends MediaDataSource {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ByteBuffer f18683k;

            k(ByteBuffer byteBuffer) {
                this.f18683k = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f18683k.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j2, byte[] bArr, int i2, int i3) {
                if (j2 >= this.f18683k.limit()) {
                    return -1;
                }
                this.f18683k.position((int) j2);
                int iMin = Math.min(i3, this.f18683k.remaining());
                this.f18683k.get(bArr, i2, iMin);
                return iMin;
            }
        }

        C3093q() {
        }

        private MediaDataSource zy(ByteBuffer byteBuffer) {
            return new k(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void toq(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(zy(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo10949k(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(zy(byteBuffer));
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    class toq implements C3138s.toq<Integer> {

        /* JADX INFO: renamed from: k */
        private final ByteBuffer f18685k = ByteBuffer.allocate(4);

        toq() {
        }

        @Override // com.bumptech.glide.load.C3138s.toq
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo10952k(@lvui byte[] bArr, @lvui Integer num, @lvui MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f18685k) {
                this.f18685k.position(0);
                messageDigest.update(this.f18685k.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.eqxt$y */
    /* JADX INFO: compiled from: VideoDecoder.java */
    private static final class C3094y extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        C3094y() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* JADX INFO: compiled from: VideoDecoder.java */
    private static final class zy implements InterfaceC3092n<AssetFileDescriptor> {
        private zy() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void toq(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.eqxt.InterfaceC3092n
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo10949k(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ zy(C3091k c3091k) {
            this();
        }
    }

    eqxt(InterfaceC3008n interfaceC3008n, InterfaceC3092n<T> interfaceC3092n) {
        this(interfaceC3008n, interfaceC3092n, f18679s);
    }

    private static Bitmap f7l8(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
        return mediaMetadataRetriever.getFrameAtTime(j2, i2);
    }

    @dd
    /* JADX INFO: renamed from: g */
    private Bitmap m10942g(@lvui T t2, MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC3101h abstractC3101h) {
        if (x2(t2, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapF7l8 = null;
        if (Build.VERSION.SDK_INT >= 27 && i3 != Integer.MIN_VALUE && i4 != Integer.MIN_VALUE && abstractC3101h != AbstractC3101h.f18698g) {
            bitmapF7l8 = m10947y(mediaMetadataRetriever, j2, i2, i3, i4, abstractC3101h);
        }
        if (bitmapF7l8 == null) {
            bitmapF7l8 = f7l8(mediaMetadataRetriever, j2, i2);
        }
        Bitmap bitmapM10943n = m10943n(mediaMetadataRetriever, bitmapF7l8);
        if (bitmapM10943n != null) {
            return bitmapM10943n;
        }
        throw new C3094y();
    }

    private static boolean ld6() {
        Iterator<String> it = f18677p.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private static Bitmap m10943n(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m10944p()) {
            return bitmap;
        }
        boolean z2 = false;
        try {
            if (m10946s(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z2 = true;
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable(f18678q, 3)) {
                Log.d(f18678q, "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z2) {
            return bitmap;
        }
        if (Log.isLoggable(f18678q, 3)) {
            Log.d(f18678q, "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @yz
    /* JADX INFO: renamed from: p */
    static boolean m10944p() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return ld6();
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 30 && i2 < 33;
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: q */
    public static com.bumptech.glide.load.x2<ByteBuffer, Bitmap> m10945q(InterfaceC3008n interfaceC3008n) {
        return new eqxt(interfaceC3008n, new C3093q());
    }

    public static com.bumptech.glide.load.x2<ParcelFileDescriptor, Bitmap> qrj(InterfaceC3008n interfaceC3008n) {
        return new eqxt(interfaceC3008n, new f7l8());
    }

    @hyr(30)
    /* JADX INFO: renamed from: s */
    private static boolean m10946s(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i2 = Integer.parseInt(strExtractMetadata);
        return (i2 == 7 || i2 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:27:0x0059, B:29:0x005f), top: B:41:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean x2(@zy.lvui T r7, android.media.MediaMetadataRetriever r8) {
        /*
            r6 = this;
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.DEVICE
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.String r4 = ".+_cheets|cheets_.+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L12
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 != 0) goto L16
            return r3
        L16:
            r1 = 0
            r4 = 12
            java.lang.String r8 = r8.extractMetadata(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "video/webm"
            boolean r8 = r4.equals(r8)     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L26
            return r3
        L26:
            android.media.MediaExtractor r8 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L57
            r8.<init>()     // Catch: java.lang.Throwable -> L57
            com.bumptech.glide.load.resource.bitmap.eqxt$n<T> r1 = r6.f18681k     // Catch: java.lang.Throwable -> L54
            r1.mo10949k(r8, r7)     // Catch: java.lang.Throwable -> L54
            int r7 = r8.getTrackCount()     // Catch: java.lang.Throwable -> L54
            r1 = r3
        L35:
            if (r1 >= r7) goto L50
            android.media.MediaFormat r4 = r8.getTrackFormat(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4d
            r8.release()
            return r2
        L4d:
            int r1 = r1 + 1
            goto L35
        L50:
            r8.release()
            goto L69
        L54:
            r7 = move-exception
            r1 = r8
            goto L58
        L57:
            r7 = move-exception
        L58:
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L64
            java.lang.String r8 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r0, r8, r7)     // Catch: java.lang.Throwable -> L6a
        L64:
            if (r1 == 0) goto L69
            r1.release()
        L69:
            return r3
        L6a:
            r7 = move-exception
            if (r1 == 0) goto L70
            r1.release()
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.eqxt.x2(java.lang.Object, android.media.MediaMetadataRetriever):boolean");
    }

    @TargetApi(27)
    @dd
    /* JADX INFO: renamed from: y */
    private static Bitmap m10947y(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC3101h abstractC3101h) {
        try {
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 == 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float qVar = abstractC3101h.toq(i5, i6, i3, i4);
            return mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, Math.round(i5 * qVar), Math.round(qVar * i6));
        } catch (Throwable th) {
            if (!Log.isLoggable(f18678q, 3)) {
                return null;
            }
            Log.d(f18678q, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    public static com.bumptech.glide.load.x2<AssetFileDescriptor, Bitmap> zy(InterfaceC3008n interfaceC3008n) {
        return new eqxt(interfaceC3008n, new zy(null));
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: k */
    public boolean mo10948k(@lvui T t2, @lvui C3087p c3087p) {
        return true;
    }

    @Override // com.bumptech.glide.load.x2
    public com.bumptech.glide.load.engine.zurt<Bitmap> toq(@lvui T t2, int i2, int i3, @lvui C3087p c3087p) throws IOException {
        long jLongValue = ((Long) c3087p.zy(f62875f7l8)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c3087p.zy(f18680y);
        if (num == null) {
            num = 2;
        }
        AbstractC3101h abstractC3101h = (AbstractC3101h) c3087p.zy(AbstractC3101h.f18703y);
        if (abstractC3101h == null) {
            abstractC3101h = AbstractC3101h.f62893f7l8;
        }
        AbstractC3101h abstractC3101h2 = abstractC3101h;
        MediaMetadataRetriever mediaMetadataRetrieverM10951k = this.f62878zy.m10951k();
        try {
            this.f18681k.toq(mediaMetadataRetrieverM10951k, t2);
            return com.bumptech.glide.load.resource.bitmap.f7l8.m10956g(m10942g(t2, mediaMetadataRetrieverM10951k, jLongValue, num.intValue(), i2, i3, abstractC3101h2), this.f62877toq);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverM10951k.close();
            } else {
                mediaMetadataRetrieverM10951k.release();
            }
        }
    }

    @yz
    eqxt(InterfaceC3008n interfaceC3008n, InterfaceC3092n<T> interfaceC3092n, C3090g c3090g) {
        this.f62877toq = interfaceC3008n;
        this.f18681k = interfaceC3092n;
        this.f62878zy = c3090g;
    }
}
