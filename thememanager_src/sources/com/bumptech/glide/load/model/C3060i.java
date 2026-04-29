package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.kja0;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.i */
/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3060i<Data> implements kja0<Integer, Data> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62834zy = "ResourceLoader";

    /* JADX INFO: renamed from: k */
    private final kja0<Uri, Data> f18576k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Resources f62835toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.i$k */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class k implements InterfaceC3059h<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final Resources f18577k;

        public k(Resources resources) {
            this.f18577k = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: n */
        public kja0<Integer, AssetFileDescriptor> mo10618n(t8r t8rVar) {
            return new C3060i(this.f18577k, t8rVar.m10912q(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.i$q */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class q implements InterfaceC3059h<Integer, Uri> {

        /* JADX INFO: renamed from: k */
        private final Resources f18578k;

        public q(Resources resources) {
            this.f18578k = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, Uri> mo10618n(t8r t8rVar) {
            return new C3060i(this.f18578k, fu4.zy());
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.i$toq */
    /* JADX INFO: compiled from: ResourceLoader.java */
    @Deprecated
    public static class toq implements InterfaceC3059h<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final Resources f18579k;

        public toq(Resources resources) {
            this.f18579k = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, ParcelFileDescriptor> mo10618n(t8r t8rVar) {
            return new C3060i(this.f18579k, t8rVar.m10912q(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.i$zy */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class zy implements InterfaceC3059h<Integer, InputStream> {

        /* JADX INFO: renamed from: k */
        private final Resources f18580k;

        public zy(Resources resources) {
            this.f18580k = resources;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, InputStream> mo10618n(t8r t8rVar) {
            return new C3060i(this.f18580k, t8rVar.m10912q(Uri.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3060i(Resources resources, kja0<Uri, Data> kja0Var) {
        this.f62835toq = resources;
        this.f18576k = kja0Var;
    }

    @dd
    /* JADX INFO: renamed from: q */
    private Uri m10871q(Integer num) {
        try {
            return Uri.parse(com.android.thememanager.basemodule.resource.constants.toq.hze4 + this.f62835toq.getResourcePackageName(num.intValue()) + '/' + this.f62835toq.getResourceTypeName(num.intValue()) + '/' + this.f62835toq.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable(f62834zy, 5)) {
                return null;
            }
            Log.w(f62834zy, "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui Integer num, int i2, int i3, @lvui C3087p c3087p) {
        Uri uriM10871q = m10871q(num);
        if (uriM10871q == null) {
            return null;
        }
        return this.f18576k.toq(uriM10871q, i2, i3, c3087p);
    }
}
