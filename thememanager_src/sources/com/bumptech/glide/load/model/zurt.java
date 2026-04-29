package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.InterfaceC3088q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: StreamEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class zurt implements InterfaceC3088q<InputStream> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62863toq = "StreamEncoder";

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18663k;

    public zurt(com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18663k = toqVar;
    }

    @Override // com.bumptech.glide.load.InterfaceC3088q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo10926k(@lvui InputStream inputStream, @lvui File file, @lvui C3087p c3087p) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = (byte[]) this.f18663k.zy(65536, byte[].class);
        boolean z2 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException unused) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    if (Log.isLoggable(f62863toq, 3)) {
                        Log.d(f62863toq, "Failed to encode data onto the OutputStream", e);
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    this.f18663k.put(bArr);
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f18663k.put(bArr);
                    throw th;
                }
                this.f18663k.put(bArr);
                return z2;
            }
            fileOutputStream.close();
            z2 = true;
            fileOutputStream.close();
            this.f18663k.put(bArr);
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
