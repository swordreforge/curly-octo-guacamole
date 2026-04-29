package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.n */
/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3065n<Model, Data> implements kja0<Model, Data> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62844toq = "data:image";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62845zy = ";base64";

    /* JADX INFO: renamed from: k */
    private final k<Data> f18601k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.n$k */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public interface k<Data> {
        /* JADX INFO: renamed from: k */
        Class<Data> mo10883k();

        void toq(Data data) throws IOException;

        Data zy(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.n$toq */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    private static final class toq<Data> implements InterfaceC3000q<Data> {

        /* JADX INFO: renamed from: k */
        private final String f18602k;

        /* JADX INFO: renamed from: n */
        private Data f18603n;

        /* JADX INFO: renamed from: q */
        private final k<Data> f18604q;

        toq(String str, k<Data> kVar) {
            this.f18602k = str;
            this.f18604q = kVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super Data> kVar) {
            try {
                Data dataZy = this.f18604q.zy(this.f18602k);
                this.f18603n = dataZy;
                kVar.mo10657q(dataZy);
            } catch (IllegalArgumentException e2) {
                kVar.zy(e2);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Data> mo10634k() {
            return this.f18604q.mo10883k();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
            try {
                this.f18604q.toq(this.f18603n);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.n$zy */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class zy<Model> implements InterfaceC3059h<Model, InputStream> {

        /* JADX INFO: renamed from: k */
        private final k<InputStream> f18605k = new k();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.n$zy$k */
        /* JADX INFO: compiled from: DataUrlLoader.java */
        class k implements k<InputStream> {
            k() {
            }

            @Override // com.bumptech.glide.load.model.C3065n.k
            /* JADX INFO: renamed from: k */
            public Class<InputStream> mo10883k() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.C3065n.k
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public InputStream zy(String str) {
                if (!str.startsWith(C3065n.f62844toq)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(C3065n.f62845zy)) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // com.bumptech.glide.load.model.C3065n.k
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public void toq(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Model, InputStream> mo10618n(@lvui t8r t8rVar) {
            return new C3065n(this.f18605k);
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    public C3065n(k<Data> kVar) {
        this.f18601k = kVar;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: k */
    public boolean mo10615k(@lvui Model model) {
        return model.toString().startsWith(f62844toq);
    }

    @Override // com.bumptech.glide.load.model.kja0
    public kja0.C3063k<Data> toq(@lvui Model model, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(model), new toq(model.toString(), this.f18601k));
    }
}
