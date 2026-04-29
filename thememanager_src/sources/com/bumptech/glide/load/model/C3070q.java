package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import com.bumptech.glide.util.C3201k;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.q */
/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3070q implements kja0<File, ByteBuffer> {

    /* JADX INFO: renamed from: k */
    private static final String f18613k = "ByteBufferFileLoader";

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.q$k */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    private static final class k implements InterfaceC3000q<ByteBuffer> {

        /* JADX INFO: renamed from: k */
        private final File f18614k;

        k(File file) {
            this.f18614k = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super ByteBuffer> kVar) {
            try {
                kVar.mo10657q(C3201k.m11221k(this.f18614k));
            } catch (IOException e2) {
                if (Log.isLoggable(C3070q.f18613k, 3)) {
                    Log.d(C3070q.f18613k, "Failed to obtain ByteBuffer for file", e2);
                }
                kVar.zy(e2);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<ByteBuffer> mo10634k() {
            return ByteBuffer.class;
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

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.q$toq */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class toq implements InterfaceC3059h<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<File, ByteBuffer> mo10618n(@lvui t8r t8rVar) {
            return new C3070q();
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo10615k(@lvui File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public kja0.C3063k<ByteBuffer> toq(@lvui File file, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(file), new k(file));
    }
}
