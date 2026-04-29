package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.C4872h;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4920p;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.internal.C4899k;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.t8r;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: TreeTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x2<T> extends fu4<T> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private fu4<T> f68775f7l8;

    /* JADX INFO: renamed from: g */
    private final x2<T>.toq f27727g = new toq();

    /* JADX INFO: renamed from: k */
    private final InterfaceC4873i<T> f27728k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC4928z f27729n;

    /* JADX INFO: renamed from: q */
    private final C4922k<T> f27730q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.gson.ld6<T> f68776toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final C4871g f68777zy;

    /* JADX INFO: compiled from: TreeTypeAdapter.java */
    private final class toq implements t8r, InterfaceC4920p {
        private toq() {
        }

        @Override // com.google.gson.t8r
        /* JADX INFO: renamed from: k */
        public com.google.gson.x2 mo17158k(Object obj, Type type) {
            return x2.this.f68777zy.gvn7(obj, type);
        }

        @Override // com.google.gson.InterfaceC4920p
        public <R> R toq(com.google.gson.x2 x2Var, Type type) throws C4872h {
            return (R) x2.this.f68777zy.m17098p(x2Var, type);
        }

        @Override // com.google.gson.t8r
        public com.google.gson.x2 zy(Object obj) {
            return x2.this.f68777zy.jp0y(obj);
        }
    }

    /* JADX INFO: compiled from: TreeTypeAdapter.java */
    private static final class zy implements InterfaceC4928z {

        /* JADX INFO: renamed from: g */
        private final InterfaceC4873i<?> f27732g;

        /* JADX INFO: renamed from: k */
        private final C4922k<?> f27733k;

        /* JADX INFO: renamed from: n */
        private final Class<?> f27734n;

        /* JADX INFO: renamed from: q */
        private final boolean f27735q;

        /* JADX INFO: renamed from: y */
        private final com.google.gson.ld6<?> f27736y;

        zy(Object obj, C4922k<?> c4922k, boolean z2, Class<?> cls) {
            InterfaceC4873i<?> interfaceC4873i = obj instanceof InterfaceC4873i ? (InterfaceC4873i) obj : null;
            this.f27732g = interfaceC4873i;
            com.google.gson.ld6<?> ld6Var = obj instanceof com.google.gson.ld6 ? (com.google.gson.ld6) obj : null;
            this.f27736y = ld6Var;
            C4899k.m17165k((interfaceC4873i == null && ld6Var == null) ? false : true);
            this.f27733k = c4922k;
            this.f27735q = z2;
            this.f27734n = cls;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            C4922k<?> c4922k2 = this.f27733k;
            if (c4922k2 != null ? c4922k2.equals(c4922k) || (this.f27735q && this.f27733k.getType() == c4922k.getRawType()) : this.f27734n.isAssignableFrom(c4922k.getRawType())) {
                return new x2(this.f27732g, this.f27736y, c4871g, c4922k, this);
            }
            return null;
        }
    }

    public x2(InterfaceC4873i<T> interfaceC4873i, com.google.gson.ld6<T> ld6Var, C4871g c4871g, C4922k<T> c4922k, InterfaceC4928z interfaceC4928z) {
        this.f27728k = interfaceC4873i;
        this.f68776toq = ld6Var;
        this.f68777zy = c4871g;
        this.f27730q = c4922k;
        this.f27729n = interfaceC4928z;
    }

    public static InterfaceC4928z ld6(C4922k<?> c4922k, Object obj) {
        return new zy(obj, c4922k, false, null);
    }

    /* JADX INFO: renamed from: p */
    private fu4<T> m17157p() {
        fu4<T> fu4Var = this.f68775f7l8;
        if (fu4Var != null) {
            return fu4Var;
        }
        fu4<T> fu4VarKi = this.f68777zy.ki(this.f27729n, this.f27730q);
        this.f68775f7l8 = fu4VarKi;
        return fu4VarKi;
    }

    public static InterfaceC4928z qrj(Class<?> cls, Object obj) {
        return new zy(obj, null, false, cls);
    }

    public static InterfaceC4928z x2(C4922k<?> c4922k, Object obj) {
        return new zy(obj, c4922k, c4922k.getType() == c4922k.getRawType(), null);
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: n */
    public T mo7087n(C4924k c4924k) throws IOException {
        if (this.f68776toq == null) {
            return m17157p().mo7087n(c4924k);
        }
        com.google.gson.x2 x2VarM17168k = com.google.gson.internal.n7h.m17168k(c4924k);
        if (x2VarM17168k.m17235i()) {
            return null;
        }
        return this.f68776toq.mo8034k(x2VarM17168k, this.f27730q.getType(), this.f27727g);
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: s */
    public void mo7089s(C4926q c4926q, T t2) throws IOException {
        InterfaceC4873i<T> interfaceC4873i = this.f27728k;
        if (interfaceC4873i == null) {
            m17157p().mo7089s(c4926q, t2);
        } else if (t2 == null) {
            c4926q.hyr();
        } else {
            com.google.gson.internal.n7h.toq(interfaceC4873i.toq(t2, this.f27730q.getType(), this.f27727g), c4926q);
        }
    }
}
