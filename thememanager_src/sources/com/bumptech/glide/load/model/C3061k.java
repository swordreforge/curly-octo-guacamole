package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.data.C3002y;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.k */
/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3061k<Data> implements kja0<Uri, Data> {

    /* JADX INFO: renamed from: n */
    private static final int f18581n = 22;

    /* JADX INFO: renamed from: q */
    private static final String f18582q = "file:///android_asset/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62836zy = "android_asset";

    /* JADX INFO: renamed from: k */
    private final AssetManager f18583k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k<Data> f62837toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.k$k */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface k<Data> {
        /* JADX INFO: renamed from: k */
        InterfaceC3000q<Data> mo10874k(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.k$toq */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class toq implements InterfaceC3059h<Uri, AssetFileDescriptor>, k<AssetFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final AssetManager f18584k;

        public toq(AssetManager assetManager) {
            this.f18584k = assetManager;
        }

        @Override // com.bumptech.glide.load.model.C3061k.k
        /* JADX INFO: renamed from: k */
        public InterfaceC3000q<AssetFileDescriptor> mo10874k(AssetManager assetManager, String str) {
            return new C3002y(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, AssetFileDescriptor> mo10618n(t8r t8rVar) {
            return new C3061k(this.f18584k, this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.k$zy */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class zy implements InterfaceC3059h<Uri, InputStream>, k<InputStream> {

        /* JADX INFO: renamed from: k */
        private final AssetManager f18585k;

        public zy(AssetManager assetManager) {
            this.f18585k = assetManager;
        }

        @Override // com.bumptech.glide.load.model.C3061k.k
        /* JADX INFO: renamed from: k */
        public InterfaceC3000q<InputStream> mo10874k(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.qrj(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(t8r t8rVar) {
            return new C3061k(this.f18585k, this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3061k(AssetManager assetManager, k<Data> kVar) {
        this.f18583k = assetManager;
        this.f62837toq = kVar;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f62836zy.equals(uri.getPathSegments().get(0));
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(uri), this.f62837toq.mo10874k(this.f18583k, uri.toString().substring(f18581n)));
    }
}
