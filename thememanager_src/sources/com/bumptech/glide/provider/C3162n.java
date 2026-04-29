package com.bumptech.glide.provider;

import com.bumptech.glide.load.x2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.provider.n */
/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3162n {

    /* JADX INFO: renamed from: k */
    private final List<String> f18924k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<String, List<k<?, ?>>> f63001toq = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.n$k */
    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    private static class k<T, R> {

        /* JADX INFO: renamed from: k */
        private final Class<T> f18925k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Class<R> f63002toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final x2<T, R> f63003zy;

        public k(@lvui Class<T> cls, @lvui Class<R> cls2, x2<T, R> x2Var) {
            this.f18925k = cls;
            this.f63002toq = cls2;
            this.f63003zy = x2Var;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11131k(@lvui Class<?> cls, @lvui Class<?> cls2) {
            return this.f18925k.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f63002toq);
        }
    }

    @lvui
    private synchronized List<k<?, ?>> zy(@lvui String str) {
        List<k<?, ?>> arrayList;
        if (!this.f18924k.contains(str)) {
            this.f18924k.add(str);
        }
        arrayList = this.f63001toq.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f63001toq.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m11127g(@lvui List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f18924k);
        this.f18924k.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f18924k.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f18924k.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized <T, R> void m11128k(@lvui String str, @lvui x2<T, R> x2Var, @lvui Class<T> cls, @lvui Class<R> cls2) {
        zy(str).add(new k<>(cls, cls2, x2Var));
    }

    /* JADX INFO: renamed from: n */
    public synchronized <T, R> void m11129n(@lvui String str, @lvui x2<T, R> x2Var, @lvui Class<T> cls, @lvui Class<R> cls2) {
        zy(str).add(0, new k<>(cls, cls2, x2Var));
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public synchronized <T, R> List<Class<R>> m11130q(@lvui Class<T> cls, @lvui Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f18924k.iterator();
        while (it.hasNext()) {
            List<k<?, ?>> list = this.f63001toq.get(it.next());
            if (list != null) {
                for (k<?, ?> kVar : list) {
                    if (kVar.m11131k(cls, cls2) && !arrayList.contains(kVar.f63002toq)) {
                        arrayList.add(kVar.f63002toq);
                    }
                }
            }
        }
        return arrayList;
    }

    @lvui
    public synchronized <T, R> List<x2<T, R>> toq(@lvui Class<T> cls, @lvui Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f18924k.iterator();
        while (it.hasNext()) {
            List<k<?, ?>> list = this.f63001toq.get(it.next());
            if (list != null) {
                for (k<?, ?> kVar : list) {
                    if (kVar.m11131k(cls, cls2)) {
                        arrayList.add(kVar.f63003zy);
                    }
                }
            }
        }
        return arrayList;
    }
}
