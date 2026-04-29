package com.bumptech.glide.provider;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: ImageHeaderParserRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private final List<ImageHeaderParser> f18927k = new ArrayList();

    /* JADX INFO: renamed from: k */
    public synchronized void m11133k(@lvui ImageHeaderParser imageHeaderParser) {
        this.f18927k.add(imageHeaderParser);
    }

    @lvui
    public synchronized List<ImageHeaderParser> toq() {
        return this.f18927k;
    }
}
