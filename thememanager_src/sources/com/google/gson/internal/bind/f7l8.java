package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.ki;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: MapTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 implements InterfaceC4928z {

    /* JADX INFO: renamed from: k */
    private final com.google.gson.internal.zy f27662k;

    /* JADX INFO: renamed from: q */
    final boolean f27663q;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.f7l8$k */
    /* JADX INFO: compiled from: MapTypeAdapterFactory.java */
    private final class C4874k<K, V> extends fu4<Map<K, V>> {

        /* JADX INFO: renamed from: k */
        private final fu4<K> f27664k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final fu4<V> f68721toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.gson.internal.ld6<? extends Map<K, V>> f68722zy;

        public C4874k(C4871g c4871g, Type type, fu4<K> fu4Var, Type type2, fu4<V> fu4Var2, com.google.gson.internal.ld6<? extends Map<K, V>> ld6Var) {
            this.f27664k = new qrj(c4871g, fu4Var, type);
            this.f68721toq = new qrj(c4871g, fu4Var2, type2);
            this.f68722zy = ld6Var;
        }

        /* JADX INFO: renamed from: p */
        private String m17109p(com.google.gson.x2 x2Var) {
            if (!x2Var.zurt()) {
                if (x2Var.m17235i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            ki kiVarN7h = x2Var.n7h();
            if (kiVarN7h.o1t()) {
                return String.valueOf(kiVarN7h.mo17213h());
            }
            if (kiVarN7h.fu4()) {
                return Boolean.toString(kiVarN7h.mo17215n());
            }
            if (kiVarN7h.wvg()) {
                return kiVarN7h.ki();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo7087n(C4924k c4924k) throws IOException {
            com.google.gson.stream.zy zyVarG1 = c4924k.g1();
            if (zyVarG1 == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            Map<K, V> mapMo17167k = this.f68722zy.mo17167k();
            if (zyVarG1 == com.google.gson.stream.zy.BEGIN_ARRAY) {
                c4924k.mo17116k();
                while (c4924k.ki()) {
                    c4924k.mo17116k();
                    K kMo7087n = this.f27664k.mo7087n(c4924k);
                    if (mapMo17167k.put(kMo7087n, this.f68721toq.mo7087n(c4924k)) != null) {
                        throw new zurt("duplicate key: " + kMo7087n);
                    }
                    c4924k.ld6();
                }
                c4924k.ld6();
            } else {
                c4924k.zy();
                while (c4924k.ki()) {
                    com.google.gson.internal.f7l8.f27740k.mo17160k(c4924k);
                    K kMo7087n2 = this.f27664k.mo7087n(c4924k);
                    if (mapMo17167k.put(kMo7087n2, this.f68721toq.mo7087n(c4924k)) != null) {
                        throw new zurt("duplicate key: " + kMo7087n2);
                    }
                }
                c4924k.x2();
            }
            return mapMo17167k;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Map<K, V> map) throws IOException {
            if (map == null) {
                c4926q.hyr();
                return;
            }
            if (!f7l8.this.f27663q) {
                c4926q.mo17112y();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c4926q.mo17111t(String.valueOf(entry.getKey()));
                    this.f68721toq.mo7089s(c4926q, entry.getValue());
                }
                c4926q.x2();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.x2 x2VarM17090y = this.f27664k.m17090y(entry2.getKey());
                arrayList.add(x2VarM17090y);
                arrayList2.add(entry2.getValue());
                z2 |= x2VarM17090y.t8r() || x2VarM17090y.fn3e();
            }
            if (!z2) {
                c4926q.mo17112y();
                int size = arrayList.size();
                while (i2 < size) {
                    c4926q.mo17111t(m17109p((com.google.gson.x2) arrayList.get(i2)));
                    this.f68721toq.mo7089s(c4926q, (V) arrayList2.get(i2));
                    i2++;
                }
                c4926q.x2();
                return;
            }
            c4926q.mo17110q();
            int size2 = arrayList.size();
            while (i2 < size2) {
                c4926q.mo17110q();
                com.google.gson.internal.n7h.toq((com.google.gson.x2) arrayList.get(i2), c4926q);
                this.f68721toq.mo7089s(c4926q, (V) arrayList2.get(i2));
                c4926q.ld6();
                i2++;
            }
            c4926q.ld6();
        }
    }

    public f7l8(com.google.gson.internal.zy zyVar, boolean z2) {
        this.f27662k = zyVar;
        this.f27663q = z2;
    }

    private fu4<?> toq(C4871g c4871g, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n7h.f27676g : c4871g.m17097h(C4922k.get(type));
    }

    @Override // com.google.gson.InterfaceC4928z
    /* JADX INFO: renamed from: k */
    public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
        Type type = c4922k.getType();
        if (!Map.class.isAssignableFrom(c4922k.getRawType())) {
            return null;
        }
        Type[] typeArrM17201p = com.google.gson.internal.toq.m17201p(type, com.google.gson.internal.toq.ld6(type));
        return new C4874k(c4871g, typeArrM17201p[0], toq(c4871g, typeArrM17201p[0]), typeArrM17201p[1], c4871g.m17097h(C4922k.get(typeArrM17201p[1])), this.f27662k.m17209k(c4922k));
    }
}
