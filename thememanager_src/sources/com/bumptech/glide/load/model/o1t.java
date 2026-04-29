package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.kja0;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.lvui;

/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class o1t<Data> implements kja0<Uri, Data> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Set<String> f62849toq = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: k */
    private final kja0<C3084y, Data> f18612k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.o1t$k */
    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class C3068k implements InterfaceC3059h<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(t8r t8rVar) {
            return new o1t(t8rVar.m10912q(C3084y.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public o1t(kja0<C3084y, Data> kja0Var) {
        this.f18612k = kja0Var;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return f62849toq.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        return this.f18612k.toq(new C3084y(uri.toString()), i2, i3, c3087p);
    }
}
