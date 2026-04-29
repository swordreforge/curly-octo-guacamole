package com.bumptech.glide.load.model;

import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.signature.C3197n;
import zy.lvui;

/* JADX INFO: compiled from: UnitModelLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4<Model> implements kja0<Model, Model> {

    /* JADX INFO: renamed from: k */
    private static final fu4<?> f18564k = new fu4<>();

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.fu4$k */
    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class C3057k<Model> implements InterfaceC3059h<Model, Model> {

        /* JADX INFO: renamed from: k */
        private static final C3057k<?> f18565k = new C3057k<>();

        @Deprecated
        public C3057k() {
        }

        /* JADX INFO: renamed from: k */
        public static <T> C3057k<T> m10863k() {
            return (C3057k<T>) f18565k;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        @lvui
        /* JADX INFO: renamed from: n */
        public kja0<Model, Model> mo10618n(t8r t8rVar) {
            return fu4.zy();
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3059h
        /* JADX INFO: renamed from: q */
        public void mo10619q() {
        }
    }

    /* JADX INFO: compiled from: UnitModelLoader.java */
    private static class toq<Model> implements InterfaceC3000q<Model> {

        /* JADX INFO: renamed from: k */
        private final Model f18566k;

        toq(Model model) {
            this.f18566k = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super Model> kVar) {
            kVar.mo10657q(this.f18566k);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Model> mo10634k() {
            return (Class<Model>) this.f18566k.getClass();
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

    @Deprecated
    public fu4() {
    }

    public static <T> fu4<T> zy() {
        return (fu4<T>) f18564k;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: k */
    public boolean mo10615k(@lvui Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.kja0
    public kja0.C3063k<Model> toq(@lvui Model model, int i2, int i3, @lvui C3087p c3087p) {
        return new kja0.C3063k<>(new C3197n(model), new toq(model));
    }
}
