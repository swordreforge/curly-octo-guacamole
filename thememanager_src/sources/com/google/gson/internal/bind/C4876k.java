package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.gson.internal.bind.k */
/* JADX INFO: compiled from: ArrayTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4876k<E> extends fu4<Object> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final InterfaceC4928z f68723zy = new k();

    /* JADX INFO: renamed from: k */
    private final Class<E> f27671k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fu4<E> f68724toq;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$k */
    /* JADX INFO: compiled from: ArrayTypeAdapter.java */
    class k implements InterfaceC4928z {
        k() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            Type type = c4922k.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeF7l8 = com.google.gson.internal.toq.f7l8(type);
            return new C4876k(c4871g, c4871g.m17097h(C4922k.get(typeF7l8)), com.google.gson.internal.toq.ld6(typeF7l8));
        }
    }

    public C4876k(C4871g c4871g, fu4<E> fu4Var, Class<E> cls) {
        this.f68724toq = new qrj(c4871g, fu4Var, cls);
        this.f27671k = cls;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: n */
    public Object mo7087n(C4924k c4924k) throws IOException {
        if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
            c4924k.a98o();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c4924k.mo17116k();
        while (c4924k.ki()) {
            arrayList.add(this.f68724toq.mo7087n(c4924k));
        }
        c4924k.ld6();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f27671k, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: s */
    public void mo7089s(C4926q c4926q, Object obj) throws IOException {
        if (obj == null) {
            c4926q.hyr();
            return;
        }
        c4926q.mo17110q();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f68724toq.mo7089s(c4926q, (E) Array.get(obj, i2));
        }
        c4926q.ld6();
    }
}
