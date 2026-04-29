package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import zy.dd;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.p */
/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3009p implements com.bumptech.glide.load.engine.bitmap_recycle.toq {

    /* JADX INFO: renamed from: p */
    private static final int f18276p = 2;

    /* JADX INFO: renamed from: s */
    @yz
    static final int f18277s = 8;

    /* JADX INFO: renamed from: y */
    private static final int f18278y = 4194304;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f62718f7l8;

    /* JADX INFO: renamed from: g */
    private final int f18279g;

    /* JADX INFO: renamed from: n */
    private final Map<Class<?>, InterfaceC3005k<?>> f18280n;

    /* JADX INFO: renamed from: q */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f18281q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3012y<k, Object> f62719toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq f62720zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.p$k */
    /* JADX INFO: compiled from: LruArrayPool.java */
    private static final class k implements qrj {

        /* JADX INFO: renamed from: k */
        private final toq f18282k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f62721toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Class<?> f62722zy;

        k(toq toqVar) {
            this.f18282k = toqVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f62721toq == kVar.f62721toq && this.f62722zy == kVar.f62722zy;
        }

        public int hashCode() {
            int i2 = this.f62721toq * 31;
            Class<?> cls = this.f62722zy;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.qrj
        /* JADX INFO: renamed from: k */
        public void mo10675k() {
            this.f18282k.zy(this);
        }

        public String toString() {
            return "Key{size=" + this.f62721toq + "array=" + this.f62722zy + '}';
        }

        void toq(int i2, Class<?> cls) {
            this.f62721toq = i2;
            this.f62722zy = cls;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.p$toq */
    /* JADX INFO: compiled from: LruArrayPool.java */
    private static final class toq extends AbstractC3010q<k> {
        toq() {
        }

        /* JADX INFO: renamed from: n */
        k m10699n(int i2, Class<?> cls) {
            k qVar = toq();
            qVar.toq(i2, cls);
            return qVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3010q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public k mo10676k() {
            return new k(this);
        }
    }

    @yz
    public C3009p() {
        this.f62719toq = new C3012y<>();
        this.f62720zy = new toq();
        this.f18281q = new HashMap();
        this.f18280n = new HashMap();
        this.f18279g = 4194304;
    }

    private boolean cdj(int i2, Integer num) {
        return num != null && (kja0() || num.intValue() <= i2 * 8);
    }

    private void f7l8() {
        m10695y(this.f18279g);
    }

    /* JADX INFO: renamed from: g */
    private void m10691g(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapN7h = n7h(cls);
        Integer num = navigableMapN7h.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapN7h.remove(Integer.valueOf(i2));
                return;
            } else {
                navigableMapN7h.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    /* JADX INFO: renamed from: h */
    private boolean m10692h(int i2) {
        return i2 <= this.f18279g / 2;
    }

    private boolean kja0() {
        int i2 = this.f62718f7l8;
        return i2 == 0 || this.f18279g / i2 >= 2;
    }

    @dd
    private <T> T ld6(k kVar) {
        return (T) this.f62719toq.m10704k(kVar);
    }

    private NavigableMap<Integer, Integer> n7h(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f18281q.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f18281q.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: p */
    private <T> InterfaceC3005k<T> m10693p(Class<T> cls) {
        InterfaceC3005k<T> f7l8Var = (InterfaceC3005k) this.f18280n.get(cls);
        if (f7l8Var == null) {
            if (cls.equals(int[].class)) {
                f7l8Var = new C3011s();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                f7l8Var = new f7l8();
            }
            this.f18280n.put(cls, f7l8Var);
        }
        return f7l8Var;
    }

    private <T> T qrj(k kVar, Class<T> cls) {
        InterfaceC3005k<T> interfaceC3005kM10693p = m10693p(cls);
        T t2 = (T) ld6(kVar);
        if (t2 != null) {
            this.f62718f7l8 -= interfaceC3005kM10693p.toq(t2) * interfaceC3005kM10693p.mo10664k();
            m10691g(interfaceC3005kM10693p.toq(t2), cls);
        }
        if (t2 != null) {
            return t2;
        }
        if (Log.isLoggable(interfaceC3005kM10693p.getTag(), 2)) {
            Log.v(interfaceC3005kM10693p.getTag(), "Allocated " + kVar.f62721toq + " bytes");
        }
        return interfaceC3005kM10693p.newArray(kVar.f62721toq);
    }

    /* JADX INFO: renamed from: s */
    private <T> InterfaceC3005k<T> m10694s(T t2) {
        return m10693p(t2.getClass());
    }

    /* JADX INFO: renamed from: y */
    private void m10695y(int i2) {
        while (this.f62718f7l8 > i2) {
            Object objM10703g = this.f62719toq.m10703g();
            com.bumptech.glide.util.qrj.m11262q(objM10703g);
            InterfaceC3005k interfaceC3005kM10694s = m10694s(objM10703g);
            this.f62718f7l8 -= interfaceC3005kM10694s.toq(objM10703g) * interfaceC3005kM10694s.mo10664k();
            m10691g(interfaceC3005kM10694s.toq(objM10703g), objM10703g.getClass());
            if (Log.isLoggable(interfaceC3005kM10694s.getTag(), 2)) {
                Log.v(interfaceC3005kM10694s.getTag(), "evicted: " + interfaceC3005kM10694s.toq(objM10703g));
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    /* JADX INFO: renamed from: k */
    public synchronized void mo10696k(int i2) {
        try {
            if (i2 >= 40) {
                toq();
            } else if (i2 >= 20 || i2 == 15) {
                m10695y(this.f18279g / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    @Deprecated
    /* JADX INFO: renamed from: n */
    public <T> void mo10697n(T t2, Class<T> cls) {
        put(t2);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    public synchronized <T> void put(T t2) {
        Class<?> cls = t2.getClass();
        InterfaceC3005k<T> interfaceC3005kM10693p = m10693p(cls);
        int qVar = interfaceC3005kM10693p.toq(t2);
        int iMo10664k = interfaceC3005kM10693p.mo10664k() * qVar;
        if (m10692h(iMo10664k)) {
            k kVarM10699n = this.f62720zy.m10699n(qVar, cls);
            this.f62719toq.m10705q(kVarM10699n, t2);
            NavigableMap<Integer, Integer> navigableMapN7h = n7h(cls);
            Integer num = navigableMapN7h.get(Integer.valueOf(kVarM10699n.f62721toq));
            Integer numValueOf = Integer.valueOf(kVarM10699n.f62721toq);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapN7h.put(numValueOf, Integer.valueOf(iIntValue));
            this.f62718f7l8 += iMo10664k;
            f7l8();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    /* JADX INFO: renamed from: q */
    public synchronized <T> T mo10698q(int i2, Class<T> cls) {
        return (T) qrj(this.f62720zy.m10699n(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    public synchronized void toq() {
        m10695y(0);
    }

    int x2() {
        int iIntValue = 0;
        for (Class<?> cls : this.f18281q.keySet()) {
            for (Integer num : this.f18281q.get(cls).keySet()) {
                iIntValue += num.intValue() * this.f18281q.get(cls).get(num).intValue() * m10693p(cls).mo10664k();
            }
        }
        return iIntValue;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.toq
    public synchronized <T> T zy(int i2, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = n7h(cls).ceilingKey(Integer.valueOf(i2));
        return (T) qrj(cdj(i2, numCeilingKey) ? this.f62720zy.m10699n(numCeilingKey.intValue(), cls) : this.f62720zy.m10699n(i2, cls), cls);
    }

    public C3009p(int i2) {
        this.f62719toq = new C3012y<>();
        this.f62720zy = new toq();
        this.f18281q = new HashMap();
        this.f18280n = new HashMap();
        this.f18279g = i2;
    }
}
