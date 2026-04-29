package com.xiaomi.analytics.internal.util;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: IOUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final String f31198k = "IOUtil";

    /* JADX INFO: renamed from: k */
    public static void m19236k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Log.e(C5609k.m19240k(f31198k), "closeSafely e", e2);
            }
        }
    }

    public static byte[] toq(InputStream inputStream) throws IOException {
        return zy(inputStream, 1024);
    }

    public static byte[] zy(InputStream inputStream, int i2) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i2];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
    }
}
