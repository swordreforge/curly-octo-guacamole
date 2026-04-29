package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class cjaj extends alcv {

    /* JADX INFO: renamed from: k */
    protected InputStream f32775k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected OutputStream f73292toq;

    protected cjaj() {
        this.f32775k = null;
        this.f73292toq = null;
    }

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: q */
    public void mo20581q(byte[] bArr, int i2, int i3) throws z1r {
        OutputStream outputStream = this.f73292toq;
        if (outputStream == null) {
            throw new z1r(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i2, i3);
        } catch (IOException e2) {
            throw new z1r(0, e2);
        }
    }

    @Override // com.xiaomi.push.alcv
    public int toq(byte[] bArr, int i2, int i3) throws z1r {
        InputStream inputStream = this.f32775k;
        if (inputStream == null) {
            throw new z1r(1, "Cannot read from null inputStream");
        }
        try {
            int i4 = inputStream.read(bArr, i2, i3);
            if (i4 >= 0) {
                return i4;
            }
            throw new z1r(4);
        } catch (IOException e2) {
            throw new z1r(0, e2);
        }
    }

    public cjaj(OutputStream outputStream) {
        this.f32775k = null;
        this.f73292toq = outputStream;
    }
}
