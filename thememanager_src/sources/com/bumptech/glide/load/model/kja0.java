package com.bumptech.glide.load.model;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.data.InterfaceC3000q;
import java.util.Collections;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ModelLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface kja0<Model, Data> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.kja0$k */
    /* JADX INFO: compiled from: ModelLoader.java */
    public static class C3063k<Data> {

        /* JADX INFO: renamed from: k */
        public final com.bumptech.glide.load.f7l8 f18594k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final List<com.bumptech.glide.load.f7l8> f62839toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final InterfaceC3000q<Data> f62840zy;

        public C3063k(@lvui com.bumptech.glide.load.f7l8 f7l8Var, @lvui InterfaceC3000q<Data> interfaceC3000q) {
            this(f7l8Var, Collections.emptyList(), interfaceC3000q);
        }

        public C3063k(@lvui com.bumptech.glide.load.f7l8 f7l8Var, @lvui List<com.bumptech.glide.load.f7l8> list, @lvui InterfaceC3000q<Data> interfaceC3000q) {
            this.f18594k = (com.bumptech.glide.load.f7l8) com.bumptech.glide.util.qrj.m11262q(f7l8Var);
            this.f62839toq = (List) com.bumptech.glide.util.qrj.m11262q(list);
            this.f62840zy = (InterfaceC3000q) com.bumptech.glide.util.qrj.m11262q(interfaceC3000q);
        }
    }

    /* JADX INFO: renamed from: k */
    boolean mo10615k(@lvui Model model);

    @dd
    C3063k<Data> toq(@lvui Model model, int i2, int i3, @lvui C3087p c3087p);
}
