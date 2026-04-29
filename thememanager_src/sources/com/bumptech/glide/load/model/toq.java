package com.bumptech.glide.load.model;

import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq<Data> implements kja0<byte[], Data> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC7946toq<Data> f18643k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.toq$k */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class C3081k implements InterfaceC3059h<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.toq$k$k */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        class k implements InterfaceC7946toq<ByteBuffer> {
            k() {
            }

            @Override // com.bumptech.glide.load.model.toq.InterfaceC7946toq
            /* JADX INFO: renamed from: k */
            public Class<ByteBuffer> mo10917k() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.toq.InterfaceC7946toq
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public ByteBuffer toq(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<byte[], ByteBuffer> mo10618n(@lvui t8r t8rVar) {
            return new toq(new k());
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.toq$q */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class C3082q implements InterfaceC3059h<byte[], InputStream> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.toq$q$k */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        class k implements InterfaceC7946toq<InputStream> {
            k() {
            }

            @Override // com.bumptech.glide.load.model.toq.InterfaceC7946toq
            /* JADX INFO: renamed from: k */
            public Class<InputStream> mo10917k() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.toq.InterfaceC7946toq
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public InputStream toq(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<byte[], InputStream> mo10618n(@lvui t8r t8rVar) {
            return new toq(new k());
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface InterfaceC7946toq<Data> {
        /* JADX INFO: renamed from: k */
        Class<Data> mo10917k();

        Data toq(byte[] bArr);
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    private static class zy<Data> implements InterfaceC3000q<Data> {

        /* JADX INFO: renamed from: k */
        private final byte[] f18646k;

        /* JADX INFO: renamed from: q */
        private final InterfaceC7946toq<Data> f18647q;

        zy(byte[] bArr, InterfaceC7946toq<Data> interfaceC7946toq) {
            this.f18646k = bArr;
            this.f18647q = interfaceC7946toq;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super Data> kVar) {
            kVar.mo10657q(this.f18647q.toq(this.f18646k));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Data> mo10634k() {
            return this.f18647q.mo10917k();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return EnumC3050k.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
        }
    }

    public toq(InterfaceC7946toq<Data> interfaceC7946toq) {
        this.f18643k = interfaceC7946toq;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui byte[] bArr) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<Data> toq(@lvui byte[] bArr, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(bArr), new zy(bArr, this.f18643k));
    }
}
