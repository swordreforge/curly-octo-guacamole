package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq implements InterfaceC4928z {

    /* JADX INFO: renamed from: k */
    private final com.google.gson.internal.zy f27725k;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.toq$k */
    /* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
    private static final class C4894k<E> extends fu4<Collection<E>> {

        /* JADX INFO: renamed from: k */
        private final fu4<E> f27726k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.google.gson.internal.ld6<? extends Collection<E>> f68774toq;

        public C4894k(C4871g c4871g, Type type, fu4<E> fu4Var, com.google.gson.internal.ld6<? extends Collection<E>> ld6Var) {
            this.f27726k = new qrj(c4871g, fu4Var, type);
            this.f68774toq = ld6Var;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Collection<E> collection) throws IOException {
            if (collection == null) {
                c4926q.hyr();
                return;
            }
            c4926q.mo17110q();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f27726k.mo7089s(c4926q, it.next());
            }
            c4926q.ld6();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            Collection<E> collectionMo17167k = this.f68774toq.mo17167k();
            c4924k.mo17116k();
            while (c4924k.ki()) {
                collectionMo17167k.add(this.f27726k.mo7087n(c4924k));
            }
            c4924k.ld6();
            return collectionMo17167k;
        }
    }

    public toq(com.google.gson.internal.zy zyVar) {
        this.f27725k = zyVar;
    }

    @Override // com.google.gson.InterfaceC4928z
    /* JADX INFO: renamed from: k */
    public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
        Type type = c4922k.getType();
        Class<? super T> rawType = c4922k.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeM17204y = com.google.gson.internal.toq.m17204y(type, rawType);
        return new C4894k(c4871g, typeM17204y, c4871g.m17097h(C4922k.get(typeM17204y)), this.f27725k.m17209k(c4922k));
    }
}
