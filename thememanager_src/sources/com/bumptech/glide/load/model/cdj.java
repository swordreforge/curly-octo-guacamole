package com.bumptech.glide.load.model;

import androidx.core.util.qrj;
import com.bumptech.glide.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private final t8r f18552k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3051k f62829toq;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.cdj$k */
    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    private static class C3051k {

        /* JADX INFO: renamed from: k */
        private final Map<Class<?>, k<?>> f18553k = new HashMap();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.cdj$k$k */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        private static class k<Model> {

            /* JADX INFO: renamed from: k */
            final List<kja0<Model, ?>> f18554k;

            public k(List<kja0<Model, ?>> list) {
                this.f18554k = list;
            }
        }

        C3051k() {
        }

        /* JADX INFO: renamed from: k */
        public void m10852k() {
            this.f18553k.clear();
        }

        @dd
        public <Model> List<kja0<Model, ?>> toq(Class<Model> cls) {
            k<?> kVar = this.f18553k.get(cls);
            if (kVar == null) {
                return null;
            }
            return (List<kja0<Model, ?>>) kVar.f18554k;
        }

        public <Model> void zy(Class<Model> cls, List<kja0<Model, ?>> list) {
            if (this.f18553k.put(cls, new k<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public cdj(@lvui qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
        this(new t8r(interfaceC0641k));
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private synchronized <A> List<kja0<A, ?>> m10845g(@lvui Class<A> cls) {
        List<kja0<A, ?>> qVar;
        qVar = this.f62829toq.toq(cls);
        if (qVar == null) {
            qVar = Collections.unmodifiableList(this.f18552k.m10910n(cls));
            this.f62829toq.zy(cls, qVar);
        }
        return qVar;
    }

    /* JADX INFO: renamed from: p */
    private <Model, Data> void m10846p(@lvui List<InterfaceC3059h<? extends Model, ? extends Data>> list) {
        Iterator<InterfaceC3059h<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo10619q();
        }
    }

    @lvui
    private static <A> Class<A> zy(@lvui A a2) {
        return (Class<A>) a2.getClass();
    }

    public synchronized <Model, Data> void f7l8(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        this.f18552k.m10913s(cls, cls2, interfaceC3059h);
        this.f62829toq.m10852k();
    }

    /* JADX INFO: renamed from: k */
    public synchronized <Model, Data> void m10847k(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        this.f18552k.toq(cls, cls2, interfaceC3059h);
        this.f62829toq.m10852k();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public <A> List<kja0<A, ?>> m10848n(@lvui A a2) {
        List<kja0<A, ?>> listM10845g = m10845g(zy(a2));
        if (listM10845g.isEmpty()) {
            throw new x2.zy(a2);
        }
        int size = listM10845g.size();
        List<kja0<A, ?>> listEmptyList = Collections.emptyList();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            kja0<A, ?> kja0Var = listM10845g.get(i2);
            if (kja0Var.mo10615k(a2)) {
                if (z2) {
                    listEmptyList = new ArrayList<>(size - i2);
                    z2 = false;
                }
                listEmptyList.add(kja0Var);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new x2.zy(a2, listM10845g);
        }
        return listEmptyList;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public synchronized List<Class<?>> m10849q(@lvui Class<?> cls) {
        return this.f18552k.f7l8(cls);
    }

    /* JADX INFO: renamed from: s */
    public synchronized <Model, Data> void m10850s(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        m10846p(this.f18552k.ld6(cls, cls2, interfaceC3059h));
        this.f62829toq.m10852k();
    }

    public synchronized <Model, Data> kja0<Model, Data> toq(@lvui Class<Model> cls, @lvui Class<Data> cls2) {
        return this.f18552k.m10912q(cls, cls2);
    }

    /* JADX INFO: renamed from: y */
    public synchronized <Model, Data> void m10851y(@lvui Class<Model> cls, @lvui Class<Data> cls2) {
        m10846p(this.f18552k.m10911p(cls, cls2));
        this.f62829toq.m10852k();
    }

    private cdj(@lvui t8r t8rVar) {
        this.f62829toq = new C3051k();
        this.f18552k = t8rVar;
    }
}
