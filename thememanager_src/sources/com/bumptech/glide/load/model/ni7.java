package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.kja0;
import java.io.File;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7<Data> implements kja0<String, Data> {

    /* JADX INFO: renamed from: k */
    private final kja0<Uri, Data> f18611k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.ni7$k */
    /* JADX INFO: compiled from: StringLoader.java */
    public static final class C3067k implements InterfaceC3059h<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: n */
        public kja0<String, AssetFileDescriptor> mo10618n(@lvui t8r t8rVar) {
            return new ni7(t8rVar.m10912q(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class toq implements InterfaceC3059h<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<String, ParcelFileDescriptor> mo10618n(@lvui t8r t8rVar) {
            return new ni7(t8rVar.m10912q(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class zy implements InterfaceC3059h<String, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<String, InputStream> mo10618n(@lvui t8r t8rVar) {
            return new ni7(t8rVar.m10912q(Uri.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public ni7(kja0<Uri, Data> kja0Var) {
        this.f18611k = kja0Var;
    }

    /* JADX INFO: renamed from: g */
    private static Uri m10888g(String str) {
        return Uri.fromFile(new File(str));
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static Uri m10889n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m10888g(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m10888g(str) : uri;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui String str) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui String str, int i2, int i3, @lvui C3087p c3087p) {
        Uri uriM10889n = m10889n(str);
        if (uriM10889n == null || !this.f18611k.mo10615k(uriM10889n)) {
            return null;
        }
        return this.f18611k.toq(uriM10889n, i2, i3, c3087p);
    }
}
