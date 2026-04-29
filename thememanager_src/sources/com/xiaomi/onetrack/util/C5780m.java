package com.xiaomi.onetrack.util;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.m */
/* JADX INFO: loaded from: classes3.dex */
public class C5780m {

    /* JADX INFO: renamed from: a */
    public static final int f32317a = -1;

    /* JADX INFO: renamed from: b */
    private static final String f32318b = "onetrack";

    /* JADX INFO: renamed from: c */
    private static final int f32319c = 4096;

    /* JADX INFO: renamed from: a */
    public static void m20280a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("onetrack", "close e", e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m20282b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m20274a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static void m20278a(InputStream inputStream) {
        m20277a((Closeable) inputStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m20279a(OutputStream outputStream) {
        m20277a((Closeable) outputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m20281b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Log.e("onetrack", "closeSafely e", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20277a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Log.e("onetrack", "closeQuietly e", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m20274a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m20275a(inputStream, outputStream, 4096);
    }

    /* JADX INFO: renamed from: a */
    public static long m20275a(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        long j2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (-1 == i3) {
                return j2;
            }
            outputStream.write(bArr, 0, i3);
            j2 += (long) i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20276a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
