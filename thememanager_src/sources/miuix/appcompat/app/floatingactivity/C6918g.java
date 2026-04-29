package miuix.appcompat.app.floatingactivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import miuix.appcompat.app.floatingactivity.multiapp.C6934k;
import miuix.appcompat.app.floatingactivity.multiapp.IFloatingService;

/* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.g */
/* JADX INFO: compiled from: MemoryFileUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6918g {

    /* JADX INFO: renamed from: k */
    private static final String f38823k = "MemoryFileUtil";

    /* JADX INFO: renamed from: n */
    public static final String f38824n = "key_height";

    /* JADX INFO: renamed from: q */
    public static final String f38825q = "key_width";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f86845toq = "parcelFile";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f86846zy = "parcelFileLength";

    /* JADX INFO: renamed from: k */
    public static Bitmap m24910k(Bundle bundle) throws Throwable {
        HashMap map = (HashMap) bundle.getSerializable(f86845toq);
        int i2 = bundle.getInt(f86846zy);
        int i3 = bundle.getInt(f38825q);
        int i4 = bundle.getInt(f38824n);
        byte[] qVar = toq(map, i2);
        Bitmap bitmapCreateBitmap = null;
        if (qVar == null) {
            Log.d(f38823k, "getSnapShot with data is null");
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(qVar));
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException e2) {
            Log.w(f38823k, "catch illegal argument exception", e2);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e3) {
            Log.w(f38823k, "catch oom exception", e3);
            return bitmapCreateBitmap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.ParcelFileDescriptor m24911q(byte[] r4, int r5) throws java.lang.Throwable {
        /*
            r0 = 0
            android.os.MemoryFile r1 = new android.os.MemoryFile     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.String r2 = ""
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2 = 0
            r1.writeBytes(r4, r2, r2, r5)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            java.lang.Class<android.os.MemoryFile> r4 = android.os.MemoryFile.class
            java.lang.String r5 = "getFileDescriptor"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            java.io.FileDescriptor r4 = (java.io.FileDescriptor) r4     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.dup(r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L3b
        L26:
            r1.close()
            goto L3a
        L2a:
            r4 = move-exception
            goto L30
        L2c:
            r4 = move-exception
            goto L3d
        L2e:
            r4 = move-exception
            r1 = r0
        L30:
            java.lang.String r5 = "MemoryFileUtil"
            java.lang.String r2 = "catch write to memory error"
            android.util.Log.w(r5, r2, r4)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3a
            goto L26
        L3a:
            return r0
        L3b:
            r4 = move-exception
            r0 = r1
        L3d:
            if (r0 == 0) goto L42
            r0.close()
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.floatingactivity.C6918g.m24911q(byte[], int):android.os.ParcelFileDescriptor");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] toq(java.util.HashMap<java.lang.String, android.os.ParcelFileDescriptor> r5, int r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "catch close fd error"
            java.lang.String r1 = "MemoryFileUtil"
            java.lang.String r2 = "parcelFile"
            java.lang.Object r5 = r5.get(r2)
            android.os.ParcelFileDescriptor r5 = (android.os.ParcelFileDescriptor) r5
            r2 = 0
            if (r5 == 0) goto L49
            byte[] r6 = new byte[r6]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            java.io.FileDescriptor r4 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r3.read(r6)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L3c
            r5.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L25:
            return r6
        L26:
            r6 = move-exception
            goto L2c
        L28:
            r6 = move-exception
            goto L3e
        L2a:
            r6 = move-exception
            r3 = r2
        L2c:
            java.lang.String r4 = "catch read from memory error"
            android.util.Log.w(r1, r4, r6)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L37
            goto L49
        L37:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
            goto L49
        L3c:
            r6 = move-exception
            r2 = r3
        L3e:
            if (r2 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L48:
            throw r6
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.floatingactivity.C6918g.toq(java.util.HashMap, int):byte[]");
    }

    public static void zy(IFloatingService iFloatingService, byte[] bArr, int i2, int i3, int i4, String str, int i5) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorM24911q = m24911q(bArr, i2);
        HashMap map = new HashMap(1);
        map.put(f86845toq, parcelFileDescriptorM24911q);
        Bundle bundle = new Bundle();
        bundle.putSerializable(f86845toq, map);
        bundle.putInt(f86846zy, i2);
        bundle.putInt(f38825q, i3);
        bundle.putInt(f38824n, i4);
        bundle.putInt(C6934k.f86877qrj, i5);
        bundle.putString(C6934k.f86879x2, str);
        if (iFloatingService != null) {
            try {
                iFloatingService.callServiceMethod(7, bundle);
            } catch (RemoteException e2) {
                Log.w(f38823k, "catch stash snapshot to service error", e2);
            }
        }
    }
}
