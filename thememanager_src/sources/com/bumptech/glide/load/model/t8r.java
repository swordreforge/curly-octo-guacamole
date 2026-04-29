package com.bumptech.glide.load.model;

import androidx.core.util.qrj;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.x2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r {

    /* JADX INFO: renamed from: k */
    private final List<toq<?, ?>> f18640k;

    /* JADX INFO: renamed from: q */
    private final qrj.InterfaceC0641k<List<Throwable>> f18641q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final zy f62856toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Set<toq<?, ?>> f62857zy;

    /* JADX INFO: renamed from: n */
    private static final zy f18639n = new zy();

    /* JADX INFO: renamed from: g */
    private static final kja0<Object, Object> f18638g = new C3080k();

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.t8r$k */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    private static class C3080k implements kja0<Object, Object> {
        C3080k() {
        }

        @Override // com.bumptech.glide.load.model.kja0
        /* JADX INFO: renamed from: k */
        public boolean mo10615k(@lvui Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.kja0
        @dd
        public kja0.C3063k<Object> toq(@lvui Object obj, int i2, int i3, @lvui C3087p c3087p) {
            return null;
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    private static class toq<Model, Data> {

        /* JADX INFO: renamed from: k */
        private final Class<Model> f18642k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Class<Data> f62858toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final InterfaceC3059h<? extends Model, ? extends Data> f62859zy;

        public toq(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
            this.f18642k = cls;
            this.f62858toq = cls2;
            this.f62859zy = interfaceC3059h;
        }

        /* JADX INFO: renamed from: k */
        public boolean m10914k(@lvui Class<?> cls) {
            return this.f18642k.isAssignableFrom(cls);
        }

        public boolean toq(@lvui Class<?> cls, @lvui Class<?> cls2) {
            return m10914k(cls) && this.f62858toq.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    static class zy {
        zy() {
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public <Model, Data> ki<Model, Data> m10915k(@lvui List<kja0<Model, Data>> list, @lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
            return new ki<>(list, interfaceC0641k);
        }
    }

    public t8r(@lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
        this(interfaceC0641k, f18639n);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private static <Model, Data> kja0<Model, Data> m10907g() {
        return (kja0<Model, Data>) f18638g;
    }

    /* JADX INFO: renamed from: k */
    private <Model, Data> void m10908k(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h, boolean z2) {
        toq<?, ?> toqVar = new toq<>(cls, cls2, interfaceC3059h);
        List<toq<?, ?>> list = this.f18640k;
        list.add(z2 ? list.size() : 0, toqVar);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private <Model, Data> InterfaceC3059h<Model, Data> m10909y(@lvui toq<?, ?> toqVar) {
        return (InterfaceC3059h<Model, Data>) toqVar.f62859zy;
    }

    @lvui
    private <Model, Data> kja0<Model, Data> zy(@lvui toq<?, ?> toqVar) {
        return (kja0) com.bumptech.glide.util.qrj.m11262q(toqVar.f62859zy.mo10618n(this));
    }

    @lvui
    synchronized List<Class<?>> f7l8(@lvui Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (toq<?, ?> toqVar : this.f18640k) {
            if (!arrayList.contains(toqVar.f62858toq) && toqVar.m10914k(cls)) {
                arrayList.add(toqVar.f62858toq);
            }
        }
        return arrayList;
    }

    @lvui
    synchronized <Model, Data> List<InterfaceC3059h<? extends Model, ? extends Data>> ld6(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        List<InterfaceC3059h<? extends Model, ? extends Data>> listM10911p;
        listM10911p = m10911p(cls, cls2);
        toq(cls, cls2, interfaceC3059h);
        return listM10911p;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    synchronized <Model> List<kja0<Model, ?>> m10910n(@lvui Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (toq<?, ?> toqVar : this.f18640k) {
                if (!this.f62857zy.contains(toqVar) && toqVar.m10914k(cls)) {
                    this.f62857zy.add(toqVar);
                    arrayList.add(zy(toqVar));
                    this.f62857zy.remove(toqVar);
                }
            }
        } catch (Throwable th) {
            this.f62857zy.clear();
            throw th;
        }
        return arrayList;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    synchronized <Model, Data> List<InterfaceC3059h<? extends Model, ? extends Data>> m10911p(@lvui Class<Model> cls, @lvui Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<toq<?, ?>> it = this.f18640k.iterator();
        while (it.hasNext()) {
            toq<?, ?> next = it.next();
            if (next.toq(cls, cls2)) {
                it.remove();
                arrayList.add(m10909y(next));
            }
        }
        return arrayList;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public synchronized <Model, Data> kja0<Model, Data> m10912q(@lvui Class<Model> cls, @lvui Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (toq<?, ?> toqVar : this.f18640k) {
                if (this.f62857zy.contains(toqVar)) {
                    z2 = true;
                } else if (toqVar.toq(cls, cls2)) {
                    this.f62857zy.add(toqVar);
                    arrayList.add(zy(toqVar));
                    this.f62857zy.remove(toqVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f62856toq.m10915k(arrayList, this.f18641q);
            }
            if (arrayList.size() == 1) {
                return (kja0) arrayList.get(0);
            }
            if (!z2) {
                throw new x2.zy((Class<?>) cls, (Class<?>) cls2);
            }
            return m10907g();
        } catch (Throwable th) {
            this.f62857zy.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    synchronized <Model, Data> void m10913s(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        m10908k(cls, cls2, interfaceC3059h, false);
    }

    synchronized <Model, Data> void toq(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        m10908k(cls, cls2, interfaceC3059h, true);
    }

    @yz
    t8r(@lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k, @lvui zy zyVar) {
        this.f18640k = new ArrayList();
        this.f62857zy = new HashSet();
        this.f18641q = interfaceC0641k;
        this.f62856toq = zyVar;
    }
}
