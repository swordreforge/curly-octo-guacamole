package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.xiaomi.push.f26p;
import com.xiaomi.push.ydj3;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.xiaomi.push.service.z */
/* JADX INFO: loaded from: classes3.dex */
public class C5946z {

    /* JADX INFO: renamed from: k */
    private static long f33939k;

    /* JADX INFO: renamed from: com.xiaomi.push.service.z$k */
    public static class k {

        /* JADX INFO: renamed from: k */
        byte[] f33940k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f73679toq;

        public k(byte[] bArr, int i2) {
            this.f33940k = bArr;
            this.f73679toq = i2;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.z$toq */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public Bitmap f33941k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f73680toq;

        public toq(Bitmap bitmap, long j2) {
            this.f33941k = bitmap;
            this.f73680toq = j2;
        }
    }

    private static Bitmap f7l8(Context context, String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", com.xiaomi.push.n5r1.toq(str));
        FileInputStream fileInputStream2 = null;
        Bitmap bitmapDecodeStream = null;
        fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
                bitmap = null;
            }
        } catch (Throwable th2) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th = th2;
            fileInputStream = fileInputStream3;
        }
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            file.setLastModified(System.currentTimeMillis());
            f26p.toq(fileInputStream);
            return bitmapDecodeStream;
        } catch (Exception e3) {
            e = e3;
            Bitmap bitmap2 = bitmapDecodeStream;
            fileInputStream2 = fileInputStream;
            bitmap = bitmap2;
            com.xiaomi.channel.commonutils.logger.zy.t8r(e);
            f26p.toq(fileInputStream2);
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            f26p.toq(fileInputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX INFO: renamed from: g */
    private static void m21805g(Context context, byte[] bArr, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (bArr == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("cannot save small icon cause bitmap is null");
            return;
        }
        m21807n(context);
        ?? file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File((File) file, com.xiaomi.push.n5r1.toq(str));
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                file = new FileOutputStream(file2);
                try {
                    bufferedOutputStream = new BufferedOutputStream(file);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
            file = 0;
        } catch (Throwable th2) {
            th = th2;
            file = 0;
        }
        try {
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            f26p.toq(bufferedOutputStream);
            file = file;
        } catch (Exception e4) {
            e = e4;
            bufferedOutputStream2 = bufferedOutputStream;
            com.xiaomi.channel.commonutils.logger.zy.t8r(e);
            f26p.toq(bufferedOutputStream2);
            file = file;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            f26p.toq(bufferedOutputStream2);
            f26p.toq(file);
            throw th;
        }
        f26p.toq(file);
        if (f33939k == 0) {
            f33939k = ydj3.m22051k(new File(context.getCacheDir().getPath() + File.separator + "mipush_icon")) + file2.length();
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m21806k(Context context, InputStream inputStream) {
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("decode dimension failed for bitmap.");
            return 1;
        }
        int iRound = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        int i3 = options.outWidth;
        if (i3 <= iRound || (i2 = options.outHeight) <= iRound) {
            return 1;
        }
        return Math.min(i3 / iRound, i2 / iRound);
    }

    /* JADX INFO: renamed from: n */
    private static void m21807n(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f33939k == 0) {
                f33939k = ydj3.m22051k(file);
            }
            if (f33939k > 15728640) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                        if (!fileArrListFiles[i2].isDirectory() && Math.abs(System.currentTimeMillis() - fileArrListFiles[i2].lastModified()) > 1209600) {
                            fileArrListFiles[i2].delete();
                        }
                    }
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                }
                f33939k = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static toq m21808q(Context context, String str, boolean z2) throws Throwable {
        k kVarZy;
        ByteArrayInputStream byteArrayInputStream = null;
        toq toqVar = new toq(null, 0L);
        Bitmap bitmapF7l8 = f7l8(context, str);
        try {
            if (bitmapF7l8 != null) {
                toqVar.f33941k = bitmapF7l8;
                return toqVar;
            }
            try {
                kVarZy = zy(str, z2);
            } catch (Exception e2) {
                e = e2;
            }
            if (kVarZy == null) {
                f26p.toq(null);
                return toqVar;
            }
            toqVar.f73680toq = kVarZy.f73679toq;
            byte[] bArr = kVarZy.f33940k;
            if (bArr != null) {
                if (z2) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    try {
                        int iM21806k = m21806k(context, byteArrayInputStream2);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = iM21806k;
                        toqVar.f33941k = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        byteArrayInputStream = byteArrayInputStream2;
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayInputStream = byteArrayInputStream2;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        f26p.toq(byteArrayInputStream);
                        throw th;
                    }
                } else {
                    toqVar.f33941k = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            }
            m21805g(context, kVarZy.f33940k, str);
            f26p.toq(byteArrayInputStream);
            return toqVar;
            com.xiaomi.channel.commonutils.logger.zy.t8r(e);
            f26p.toq(byteArrayInputStream);
            return toqVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap toq(Context context, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        Uri uri = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                th = th;
                r0 = context;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamOpenInputStream2 = null;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            int iM21806k = m21806k(context, inputStreamOpenInputStream);
            inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = iM21806k;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                f26p.toq(inputStreamOpenInputStream2);
                f26p.toq(inputStreamOpenInputStream);
                return bitmapDecodeStream;
            } catch (IOException e3) {
                e = e3;
                com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                f26p.toq(inputStreamOpenInputStream2);
                f26p.toq(inputStreamOpenInputStream);
                return null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStreamOpenInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            f26p.toq(r0);
            f26p.toq(inputStreamOpenInputStream);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f7: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:248), block:B:56:0x00f7 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5 A[PHI: r1
      0x00d5: PHI (r1v5 java.net.HttpURLConnection) = (r1v4 java.net.HttpURLConnection), (r1v6 java.net.HttpURLConnection) binds: [B:47:0x00d3, B:52:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.C5946z.k zy(java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C5946z.zy(java.lang.String, boolean):com.xiaomi.push.service.z$k");
    }
}
