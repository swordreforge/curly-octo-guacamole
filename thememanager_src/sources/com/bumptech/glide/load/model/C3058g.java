package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.IOException;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.g */
/* JADX INFO: compiled from: DirectResourceLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3058g<DataT> implements kja0<Integer, DataT> {

    /* JADX INFO: renamed from: k */
    private final Context f18567k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final n<DataT> f62833toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.g$k */
    /* JADX INFO: compiled from: DirectResourceLoader.java */
    private static final class k implements InterfaceC3059h<Integer, AssetFileDescriptor>, n<AssetFileDescriptor> {

        /* JADX INFO: renamed from: k */
        private final Context f18568k;

        k(Context context) {
            this.f18568k = context;
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor zy(@dd Resources.Theme theme, Resources resources, int i2) {
            return resources.openRawResourceFd(i2);
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void toq(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: k */
        public Class<AssetFileDescriptor> mo10868k() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, AssetFileDescriptor> mo10618n(@lvui t8r t8rVar) {
            return new C3058g(this.f18568k, this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.g$n */
    /* JADX INFO: compiled from: DirectResourceLoader.java */
    private interface n<DataT> {
        /* JADX INFO: renamed from: k */
        Class<DataT> mo10868k();

        void toq(DataT datat) throws IOException;

        DataT zy(@dd Resources.Theme theme, Resources resources, int i2);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.g$q */
    /* JADX INFO: compiled from: DirectResourceLoader.java */
    private static final class q<DataT> implements InterfaceC3000q<DataT> {

        /* JADX INFO: renamed from: g */
        private final int f18569g;

        /* JADX INFO: renamed from: k */
        @dd
        private final Resources.Theme f18570k;

        /* JADX INFO: renamed from: n */
        private final n<DataT> f18571n;

        /* JADX INFO: renamed from: q */
        private final Resources f18572q;

        /* JADX INFO: renamed from: y */
        @dd
        private DataT f18573y;

        q(@dd Resources.Theme theme, Resources resources, n<DataT> nVar, int i2) {
            this.f18570k = theme;
            this.f18572q = resources;
            this.f18571n = nVar;
            this.f18569g = i2;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super DataT> kVar) {
            try {
                DataT datatZy = this.f18571n.zy(this.f18570k, this.f18572q, this.f18569g);
                this.f18573y = datatZy;
                kVar.mo10657q(datatZy);
            } catch (Resources.NotFoundException e2) {
                kVar.zy(e2);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<DataT> mo10634k() {
            return this.f18571n.mo10868k();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
            DataT datat = this.f18573y;
            if (datat != null) {
                try {
                    this.f18571n.toq(datat);
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.g$toq */
    /* JADX INFO: compiled from: DirectResourceLoader.java */
    private static final class toq implements InterfaceC3059h<Integer, Drawable>, n<Drawable> {

        /* JADX INFO: renamed from: k */
        private final Context f18574k;

        toq(Context context) {
            this.f18574k = context;
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public Drawable zy(@dd Resources.Theme theme, Resources resources, int i2) {
            return com.bumptech.glide.load.resource.drawable.zy.m11033k(this.f18574k, i2, theme);
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void toq(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: k */
        public Class<Drawable> mo10868k() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, Drawable> mo10618n(@lvui t8r t8rVar) {
            return new C3058g(this.f18574k, this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.g$zy */
    /* JADX INFO: compiled from: DirectResourceLoader.java */
    private static final class zy implements InterfaceC3059h<Integer, InputStream>, n<InputStream> {

        /* JADX INFO: renamed from: k */
        private final Context f18575k;

        zy(Context context) {
            this.f18575k = context;
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public InputStream zy(@dd Resources.Theme theme, Resources resources, int i2) {
            return resources.openRawResource(i2);
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void toq(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.model.C3058g.n
        /* JADX INFO: renamed from: k */
        public Class<InputStream> mo10868k() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Integer, InputStream> mo10618n(@lvui t8r t8rVar) {
            return new C3058g(this.f18575k, this);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    C3058g(Context context, n<DataT> nVar) {
        this.f18567k = context.getApplicationContext();
        this.f62833toq = nVar;
    }

    public static InterfaceC3059h<Integer, InputStream> f7l8(Context context) {
        return new zy(context);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC3059h<Integer, Drawable> m10864n(Context context) {
        return new toq(context);
    }

    public static InterfaceC3059h<Integer, AssetFileDescriptor> zy(Context context) {
        return new k(context);
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<DataT> toq(@lvui Integer num, int i2, int i3, @lvui C3087p c3087p) {
        Resources.Theme theme = (Resources.Theme) c3087p.zy(com.bumptech.glide.load.resource.drawable.f7l8.f62944toq);
        return new kja0.C3063k<>(new C3197n(num), new q(theme, theme != null ? theme.getResources() : this.f18567k.getResources(), this.f62833toq, num.intValue()));
    }
}
