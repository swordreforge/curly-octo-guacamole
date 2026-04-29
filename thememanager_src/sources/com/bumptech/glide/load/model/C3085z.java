package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.data.C2992k;
import com.bumptech.glide.load.data.C3001s;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.z */
/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3085z<Data> implements kja0<Uri, Data> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Set<String> f62862toq = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: k */
    private final zy<Data> f18659k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.z$k */
    /* JADX INFO: compiled from: UriLoader.java */
    public static final class k implements InterfaceC3059h<Uri, AssetFileDescriptor>, zy<AssetFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final ContentResolver f18660k;

        public k(ContentResolver contentResolver) {
            this.f18660k = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3085z.zy
        /* JADX INFO: renamed from: k */
        public InterfaceC3000q<AssetFileDescriptor> mo10925k(Uri uri) {
            return new C2992k(this.f18660k, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: n */
        public kja0<Uri, AssetFileDescriptor> mo10618n(t8r t8rVar) {
            return new C3085z(this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.z$q */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class q implements InterfaceC3059h<Uri, InputStream>, zy<InputStream> {

        /* JADX INFO: renamed from: k */
        private final ContentResolver f18661k;

        public q(ContentResolver contentResolver) {
            this.f18661k = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3085z.zy
        /* JADX INFO: renamed from: k */
        public InterfaceC3000q<InputStream> mo10925k(Uri uri) {
            return new com.bumptech.glide.load.data.n7h(this.f18661k, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(t8r t8rVar) {
            return new C3085z(this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.z$toq */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class toq implements InterfaceC3059h<Uri, ParcelFileDescriptor>, zy<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final ContentResolver f18662k;

        public toq(ContentResolver contentResolver) {
            this.f18662k = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.C3085z.zy
        /* JADX INFO: renamed from: k */
        public InterfaceC3000q<ParcelFileDescriptor> mo10925k(Uri uri) {
            return new C3001s(this.f18662k, uri);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, ParcelFileDescriptor> mo10618n(t8r t8rVar) {
            return new C3085z(this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.z$zy */
    /* JADX INFO: compiled from: UriLoader.java */
    public interface zy<Data> {
        /* JADX INFO: renamed from: k */
        InterfaceC3000q<Data> mo10925k(Uri uri);
    }

    public C3085z(zy<Data> zyVar) {
        this.f18659k = zyVar;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return f62862toq.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(uri), this.f18659k.mo10925k(uri));
    }
}
