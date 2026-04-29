package com.bumptech.glide.load.model;

import androidx.core.util.qrj;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.kja0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes2.dex */
class ki<Model, Data> implements kja0<Model, Data> {

    /* JADX INFO: renamed from: k */
    private final List<kja0<Model, Data>> f18586k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final qrj.InterfaceC0641k<List<Throwable>> f62838toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.ki$k */
    /* JADX INFO: compiled from: MultiModelLoader.java */
    static class C3062k<Data> implements InterfaceC3000q<Data>, InterfaceC3000q.k<Data> {

        /* JADX INFO: renamed from: g */
        private EnumC3159p f18587g;

        /* JADX INFO: renamed from: k */
        private final List<InterfaceC3000q<Data>> f18588k;

        /* JADX INFO: renamed from: n */
        private int f18589n;

        /* JADX INFO: renamed from: p */
        private boolean f18590p;

        /* JADX INFO: renamed from: q */
        private final qrj.InterfaceC0641k<List<Throwable>> f18591q;

        /* JADX INFO: renamed from: s */
        @dd
        private List<Throwable> f18592s;

        /* JADX INFO: renamed from: y */
        private InterfaceC3000q.k<? super Data> f18593y;

        C3062k(@lvui List<InterfaceC3000q<Data>> list, @lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
            this.f18591q = interfaceC0641k;
            com.bumptech.glide.util.qrj.zy(list);
            this.f18588k = list;
            this.f18589n = 0;
        }

        private void f7l8() {
            if (this.f18590p) {
                return;
            }
            if (this.f18589n < this.f18588k.size() - 1) {
                this.f18589n++;
                mo10647g(this.f18587g, this.f18593y);
            } else {
                com.bumptech.glide.util.qrj.m11262q(this.f18592s);
                this.f18593y.zy(new com.bumptech.glide.load.engine.cdj("Fetch failed", new ArrayList(this.f18592s)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void cancel() {
            this.f18590p = true;
            Iterator<InterfaceC3000q<Data>> it = this.f18588k.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        /* JADX INFO: renamed from: g */
        public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super Data> kVar) {
            this.f18587g = enumC3159p;
            this.f18593y = kVar;
            this.f18592s = this.f18591q.mo2983k();
            this.f18588k.get(this.f18589n).mo10647g(enumC3159p, this);
            if (this.f18590p) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: k */
        public Class<Data> mo10634k() {
            return this.f18588k.get(0).mo10634k();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        @lvui
        /* JADX INFO: renamed from: n */
        public EnumC3050k mo10648n() {
            return this.f18588k.get(0).mo10648n();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
        /* JADX INFO: renamed from: q */
        public void mo10657q(@dd Data data) {
            if (data != null) {
                this.f18593y.mo10657q(data);
            } else {
                f7l8();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q
        public void toq() {
            List<Throwable> list = this.f18592s;
            if (list != null) {
                this.f18591q.toq(list);
            }
            this.f18592s = null;
            Iterator<InterfaceC3000q<Data>> it = this.f18588k.iterator();
            while (it.hasNext()) {
                it.next().toq();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
        public void zy(@lvui Exception exc) {
            ((List) com.bumptech.glide.util.qrj.m11262q(this.f18592s)).add(exc);
            f7l8();
        }
    }

    ki(@lvui List<kja0<Model, Data>> list, @lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
        this.f18586k = list;
        this.f62838toq = interfaceC0641k;
    }

    @Override // com.bumptech.glide.load.model.kja0
    /* JADX INFO: renamed from: k */
    public boolean mo10615k(@lvui Model model) {
        Iterator<kja0<Model, Data>> it = this.f18586k.iterator();
        while (it.hasNext()) {
            if (it.next().mo10615k(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f18586k.toArray()) + '}';
    }

    @Override // com.bumptech.glide.load.model.kja0
    public kja0.C3063k<Data> toq(@lvui Model model, int i2, int i3, @lvui C3087p c3087p) {
        kja0.C3063k<Data> qVar;
        int size = this.f18586k.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.f7l8 f7l8Var = null;
        for (int i4 = 0; i4 < size; i4++) {
            kja0<Model, Data> kja0Var = this.f18586k.get(i4);
            if (kja0Var.mo10615k(model) && (qVar = kja0Var.toq(model, i2, i3, c3087p)) != null) {
                f7l8Var = qVar.f18594k;
                arrayList.add(qVar.f62840zy);
            }
        }
        if (arrayList.isEmpty() || f7l8Var == null) {
            return null;
        }
        return new kja0.C3063k<>(f7l8Var, new C3062k(arrayList, this.f62838toq));
    }
}
