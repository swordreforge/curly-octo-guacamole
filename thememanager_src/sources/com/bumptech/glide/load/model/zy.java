package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.InterfaceC3088q;
import com.bumptech.glide.util.C3201k;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: compiled from: ByteBufferEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements InterfaceC3088q<ByteBuffer> {

    /* JADX INFO: renamed from: k */
    private static final String f18664k = "ByteBufferEncoder";

    @Override // com.bumptech.glide.load.InterfaceC3088q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo10926k(@lvui ByteBuffer byteBuffer, @lvui File file, @lvui C3087p c3087p) throws Throwable {
        try {
            C3201k.m11220g(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable(f18664k, 3)) {
                Log.d(f18664k, "Failed to write data", e2);
            }
            return false;
        }
    }
}
