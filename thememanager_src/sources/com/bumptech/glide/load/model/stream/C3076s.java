package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.t8r;
import java.io.InputStream;
import java.net.URL;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.s */
/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3076s implements kja0<URL, InputStream> {

    /* JADX INFO: renamed from: k */
    private final kja0<C3084y, InputStream> f18635k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.s$k */
    /* JADX INFO: compiled from: UrlLoader.java */
    public static class k implements InterfaceC3059h<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<URL, InputStream> mo10618n(t8r t8rVar) {
            return new C3076s(t8rVar.m10912q(C3084y.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3076s(kja0<C3084y, InputStream> kja0Var) {
        this.f18635k = kja0Var;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui URL url) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<InputStream> toq(@lvui URL url, int i2, int i3, @lvui C3087p c3087p) {
        return this.f18635k.toq(new C3084y(url), i2, i3, c3087p);
    }
}
