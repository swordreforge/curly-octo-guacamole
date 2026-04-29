package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.kja0;
import java.io.InputStream;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ResourceUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class fn3e<DataT> implements kja0<Uri, DataT> {

    /* JADX INFO: renamed from: q */
    private static final String f18560q = "ResourceUriLoader";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f62831zy = 0;

    /* JADX INFO: renamed from: k */
    private final Context f18561k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0<Integer, DataT> f62832toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.fn3e$k */
    /* JADX INFO: compiled from: ResourceUriLoader.java */
    private static final class C3056k implements InterfaceC3059h<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final Context f18562k;

        C3056k(Context context) {
            this.f18562k = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, AssetFileDescriptor> mo10618n(@lvui t8r t8rVar) {
            return new fn3e(this.f18562k, t8rVar.m10912q(Integer.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: compiled from: ResourceUriLoader.java */
    private static final class toq implements InterfaceC3059h<Uri, InputStream> {

        /* JADX INFO: renamed from: k */
        private final Context f18563k;

        toq(Context context) {
            this.f18563k = context;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Uri, InputStream> mo10618n(@lvui t8r t8rVar) {
            return new fn3e(this.f18563k, t8rVar.m10912q(Integer.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    fn3e(Context context, kja0<Integer, DataT> kja0Var) {
        this.f18561k = context.getApplicationContext();
        this.f62832toq = kja0Var;
    }

    @dd
    private kja0.C3063k<DataT> f7l8(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        try {
            int i4 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i4 != 0) {
                return this.f62832toq.toq(Integer.valueOf(i4), i2, i3, c3087p);
            }
            if (Log.isLoggable(f18560q, 5)) {
                Log.w(f18560q, "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e2) {
            if (Log.isLoggable(f18560q, 5)) {
                Log.w(f18560q, "Failed to parse resource id from: " + uri, e2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC3059h<Uri, InputStream> m10859g(Context context) {
        return new toq(context);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC3059h<Uri, AssetFileDescriptor> m10860n(Context context) {
        return new C3056k(context);
    }

    @dd
    /* JADX INFO: renamed from: y */
    private kja0.C3063k<DataT> m10861y(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f18561k.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f18561k.getPackageName());
        if (identifier != 0) {
            return this.f62832toq.toq(Integer.valueOf(identifier), i2, i3, c3087p);
        }
        if (!Log.isLoggable(f18560q, 5)) {
            return null;
        }
        Log.w(f18560q, "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f18561k.getPackageName().equals(uri.getAuthority());
    }

    @Override // com.bumptech.glide.load.model.kja0
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<DataT> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return f7l8(uri, i2, i3, c3087p);
        }
        if (pathSegments.size() == 2) {
            return m10861y(uri, i2, i3, c3087p);
        }
        if (!Log.isLoggable(f18560q, 5)) {
            return null;
        }
        Log.w(f18560q, "Failed to parse resource uri: " + uri);
        return null;
    }
}
