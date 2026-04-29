package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy extends FilterInputStream {

    /* JADX INFO: renamed from: g */
    private static final int f19101g = -1;

    /* JADX INFO: renamed from: n */
    private static final String f19102n = "ContentLengthStream";

    /* JADX INFO: renamed from: k */
    private final long f19103k;

    /* JADX INFO: renamed from: q */
    private int f19104q;

    private zy(@lvui InputStream inputStream, long j2) {
        super(inputStream);
        this.f19103k = j2;
    }

    /* JADX INFO: renamed from: k */
    private int m11266k(int i2) throws IOException {
        if (i2 >= 0) {
            this.f19104q += i2;
        } else if (this.f19103k - ((long) this.f19104q) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f19103k + ", but read: " + this.f19104q);
        }
        return i2;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static InputStream m11267q(@lvui InputStream inputStream, @dd String str) {
        return zy(inputStream, m11268y(str));
    }

    /* JADX INFO: renamed from: y */
    private static int m11268y(@dd String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e2) {
                if (Log.isLoggable(f19102n, 3)) {
                    Log.d(f19102n, "failed to parse content length header: " + str, e2);
                }
            }
        }
        return -1;
    }

    @lvui
    public static InputStream zy(@lvui InputStream inputStream, long j2) {
        return new zy(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f19103k - ((long) this.f19104q), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i2;
        i2 = super.read();
        m11266k(i2 >= 0 ? 1 : -1);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        return m11266k(super.read(bArr, i2, i3));
    }
}
