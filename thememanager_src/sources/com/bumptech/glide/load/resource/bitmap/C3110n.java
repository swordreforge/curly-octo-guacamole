package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.n */
/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3110n implements com.bumptech.glide.load.qrj<Bitmap> {

    /* JADX INFO: renamed from: q */
    private static final String f18732q = "BitmapEncoder";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final C3138s<Integer> f62922toq = C3138s.f7l8("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final C3138s<Bitmap.CompressFormat> f62923zy = C3138s.m11067g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: k */
    @dd
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18733k;

    public C3110n(@lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18733k = toqVar;
    }

    /* JADX INFO: renamed from: q */
    private Bitmap.CompressFormat m10988q(Bitmap bitmap, C3087p c3087p) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c3087p.zy(f62923zy);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.qrj
    @lvui
    public com.bumptech.glide.load.zy toq(@lvui C3087p c3087p) {
        return com.bumptech.glide.load.zy.TRANSFORMED;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:46|3|4|(2:44|5)|(5:50|6|(2:8|9)(1:10)|11|12)|42|13|28|29|(1:31)|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #2 {all -> 0x00c0, blocks: (B:3:0x0021, B:13:0x004d, B:29:0x006a, B:31:0x0070, B:35:0x00bc, B:36:0x00bf), top: B:46:0x0021 }] */
    @Override // com.bumptech.glide.load.InterfaceC3088q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo10926k(@zy.lvui com.bumptech.glide.load.engine.zurt<android.graphics.Bitmap> r9, @zy.lvui java.io.File r10, @zy.lvui com.bumptech.glide.load.C3087p r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m10988q(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.toq.m11252n(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.C3208s.toq()     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.s<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.C3110n.f62922toq     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r11.zy(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc0
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            com.bumptech.glide.load.engine.bitmap_recycle.toq r10 = r8.f18733k     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r10 == 0) goto L45
            com.bumptech.glide.load.data.zy r10 = new com.bumptech.glide.load.data.zy     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            com.bumptech.glide.load.engine.bitmap_recycle.toq r6 = r8.f18733k     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r6 = r10
            goto L46
        L45:
            r6 = r7
        L46:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r6.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5 = 1
        L4d:
            r6.close()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> Lc0
            goto L69
        L51:
            r9 = move-exception
            r6 = r7
            goto Lba
        L54:
            r10 = move-exception
            r6 = r7
            goto L5a
        L57:
            r9 = move-exception
            goto Lba
        L59:
            r10 = move-exception
        L5a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L66
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L57
        L66:
            if (r6 == 0) goto L69
            goto L4d
        L69:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc0
            if (r10 == 0) goto Lb6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r10.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            int r1 = com.bumptech.glide.util.kja0.m11233y(r9)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            double r1 = com.bumptech.glide.util.C3208s.m11263k(r2)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.s<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.C3110n.f62923zy     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r11.zy(r1)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc0
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc0
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc0
        Lb6:
            com.bumptech.glide.util.pool.toq.m11250g()
            return r5
        Lba:
            if (r6 == 0) goto Lbf
            r6.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Lc0
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            com.bumptech.glide.util.pool.toq.m11250g()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3110n.mo10926k(com.bumptech.glide.load.engine.zurt, java.io.File, com.bumptech.glide.load.p):boolean");
    }

    @Deprecated
    public C3110n() {
        this.f18733k = null;
    }
}
