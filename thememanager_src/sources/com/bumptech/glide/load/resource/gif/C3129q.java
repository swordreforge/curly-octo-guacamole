package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.qrj;
import com.bumptech.glide.util.C3201k;
import java.io.File;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.q */
/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3129q implements qrj<zy> {

    /* JADX INFO: renamed from: k */
    private static final String f18805k = "GifEncoder";

    @Override // com.bumptech.glide.load.qrj
    @lvui
    public com.bumptech.glide.load.zy toq(@lvui C3087p c3087p) {
        return com.bumptech.glide.load.zy.SOURCE;
    }

    @Override // com.bumptech.glide.load.InterfaceC3088q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo10926k(@lvui zurt<zy> zurtVar, @lvui File file, @lvui C3087p c3087p) throws Throwable {
        try {
            C3201k.m11220g(zurtVar.get().m11060n(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable(f18805k, 5)) {
                Log.w(f18805k, "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }
}
