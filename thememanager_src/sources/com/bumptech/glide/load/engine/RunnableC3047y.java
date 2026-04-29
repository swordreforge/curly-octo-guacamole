package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.qrj;
import com.bumptech.glide.C3157n;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.engine.C3043s;
import com.bumptech.glide.load.engine.InterfaceC3030g;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.util.C3208s;
import com.bumptech.glide.util.pool.C3205k;
import com.bumptech.glide.x2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.y */
/* JADX INFO: compiled from: DecodeJob.java */
/* JADX INFO: loaded from: classes2.dex */
class RunnableC3047y<R> implements InterfaceC3030g.k, Runnable, Comparable<RunnableC3047y<?>>, C3205k.g {
    private static final String id = "DecodeJob";

    /* JADX INFO: renamed from: a */
    private boolean f18499a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private InterfaceC3000q<?> f62814ab;
    private boolean an;

    /* JADX INFO: renamed from: b */
    private long f18500b;
    private volatile InterfaceC3030g bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private com.bumptech.glide.load.f7l8 f62815bo;
    private volatile boolean bp;
    private volatile boolean bv;

    /* JADX INFO: renamed from: c */
    private C3087p f18501c;

    /* JADX INFO: renamed from: d */
    private Object f18502d;

    /* JADX INFO: renamed from: e */
    private toq<R> f18503e;

    /* JADX INFO: renamed from: f */
    private AbstractC3039p f18504f;

    /* JADX INFO: renamed from: g */
    private final n f18505g;

    /* JADX INFO: renamed from: h */
    private C3157n f18506h;

    /* JADX INFO: renamed from: i */
    private com.bumptech.glide.load.f7l8 f18507i;

    /* JADX INFO: renamed from: j */
    private int f18508j;

    /* JADX INFO: renamed from: l */
    private int f18510l;

    /* JADX INFO: renamed from: m */
    private f7l8 f18511m;

    /* JADX INFO: renamed from: o */
    private y f18513o;

    /* JADX INFO: renamed from: r */
    private int f18516r;

    /* JADX INFO: renamed from: t */
    private n7h f18518t;

    /* JADX INFO: renamed from: u */
    private Thread f18519u;

    /* JADX INFO: renamed from: v */
    private com.bumptech.glide.load.f7l8 f18520v;

    /* JADX INFO: renamed from: w */
    private EnumC3050k f18521w;

    /* JADX INFO: renamed from: x */
    private Object f18522x;

    /* JADX INFO: renamed from: y */
    private final qrj.InterfaceC0641k<RunnableC3047y<?>> f18523y;

    /* JADX INFO: renamed from: z */
    private EnumC3159p f18524z;

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.engine.f7l8<R> f18509k = new com.bumptech.glide.load.engine.f7l8<>();

    /* JADX INFO: renamed from: q */
    private final List<Throwable> f18515q = new ArrayList();

    /* JADX INFO: renamed from: n */
    private final com.bumptech.glide.util.pool.zy f18512n = com.bumptech.glide.util.pool.zy.m11255k();

    /* JADX INFO: renamed from: s */
    private final q<?> f18517s = new q<>();

    /* JADX INFO: renamed from: p */
    private final g f18514p = new g();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$f7l8 */
    /* JADX INFO: compiled from: DecodeJob.java */
    private enum f7l8 {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$g */
    /* JADX INFO: compiled from: DecodeJob.java */
    private static class g {

        /* JADX INFO: renamed from: k */
        private boolean f18526k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f62816toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f62817zy;

        g() {
        }

        /* JADX INFO: renamed from: k */
        private boolean m10832k(boolean z2) {
            return (this.f62817zy || z2 || this.f62816toq) && this.f18526k;
        }

        /* JADX INFO: renamed from: n */
        synchronized void m10833n() {
            this.f62816toq = false;
            this.f18526k = false;
            this.f62817zy = false;
        }

        /* JADX INFO: renamed from: q */
        synchronized boolean m10834q(boolean z2) {
            this.f18526k = true;
            return m10832k(z2);
        }

        synchronized boolean toq() {
            this.f62816toq = true;
            return m10832k(false);
        }

        synchronized boolean zy() {
            this.f62817zy = true;
            return m10832k(false);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$k */
    /* JADX INFO: compiled from: DecodeJob.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f18527k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f62818toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final /* synthetic */ int[] f62819zy;

        static {
            int[] iArr = new int[com.bumptech.glide.load.zy.values().length];
            f62819zy = iArr;
            try {
                iArr[com.bumptech.glide.load.zy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62819zy[com.bumptech.glide.load.zy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[y.values().length];
            f62818toq = iArr2;
            try {
                iArr2[y.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62818toq[y.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62818toq[y.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62818toq[y.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62818toq[y.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f7l8.values().length];
            f18527k = iArr3;
            try {
                iArr3[f7l8.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18527k[f7l8.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18527k[f7l8.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$n */
    /* JADX INFO: compiled from: DecodeJob.java */
    interface n {
        /* JADX INFO: renamed from: k */
        InterfaceC3016k mo10791k();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$q */
    /* JADX INFO: compiled from: DecodeJob.java */
    private static class q<Z> {

        /* JADX INFO: renamed from: k */
        private com.bumptech.glide.load.f7l8 f18528k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.bumptech.glide.load.qrj<Z> f62820toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private fn3e<Z> f62821zy;

        q() {
        }

        /* JADX INFO: renamed from: k */
        void m10835k() {
            this.f18528k = null;
            this.f62820toq = null;
            this.f62821zy = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: q */
        <X> void m10836q(com.bumptech.glide.load.f7l8 f7l8Var, com.bumptech.glide.load.qrj<X> qrjVar, fn3e<X> fn3eVar) {
            this.f18528k = f7l8Var;
            this.f62820toq = qrjVar;
            this.f62821zy = fn3eVar;
        }

        void toq(n nVar, C3087p c3087p) {
            com.bumptech.glide.util.pool.toq.m11251k("DecodeJob.encode");
            try {
                nVar.mo10791k().mo10711k(this.f18528k, new C3037n(this.f62820toq, this.f62821zy, c3087p));
            } finally {
                this.f62821zy.m10766y();
                com.bumptech.glide.util.pool.toq.m11250g();
            }
        }

        boolean zy() {
            return this.f62821zy != null;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$toq */
    /* JADX INFO: compiled from: DecodeJob.java */
    interface toq<R> {
        /* JADX INFO: renamed from: n */
        void mo10819n(RunnableC3047y<?> runnableC3047y);

        void toq(zurt<R> zurtVar, EnumC3050k enumC3050k, boolean z2);

        void zy(cdj cdjVar);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$y */
    /* JADX INFO: compiled from: DecodeJob.java */
    private enum y {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.y$zy */
    /* JADX INFO: compiled from: DecodeJob.java */
    private final class zy<Z> implements C3043s.k<Z> {

        /* JADX INFO: renamed from: k */
        private final EnumC3050k f18530k;

        zy(EnumC3050k enumC3050k) {
            this.f18530k = enumC3050k;
        }

        @Override // com.bumptech.glide.load.engine.C3043s.k
        @lvui
        /* JADX INFO: renamed from: k */
        public zurt<Z> mo10810k(@lvui zurt<Z> zurtVar) {
            return RunnableC3047y.this.o1t(this.f18530k, zurtVar);
        }
    }

    RunnableC3047y(n nVar, qrj.InterfaceC0641k<RunnableC3047y<?>> interfaceC0641k) {
        this.f18505g = nVar;
        this.f18523y = interfaceC0641k;
    }

    private <Data, ResourceType> zurt<R> a9(Data data, EnumC3050k enumC3050k, C3032i<Data, ResourceType, R> c3032i) throws cdj {
        C3087p c3087pKja0 = kja0(enumC3050k);
        InterfaceC2998n<Data> interfaceC2998nX2 = this.f18506h.m11121s().x2(data);
        try {
            return c3032i.toq(interfaceC2998nX2, c3087pKja0, this.f18516r, this.f18510l, new zy(enumC3050k));
        } finally {
            interfaceC2998nX2.toq();
        }
    }

    private void fn3e(zurt<R> zurtVar, EnumC3050k enumC3050k, boolean z2) {
        jp0y();
        this.f18503e.toq(zurtVar, enumC3050k, z2);
    }

    private void fti() {
        int i2 = k.f18527k[this.f18511m.ordinal()];
        if (i2 == 1) {
            this.f18513o = n7h(y.INITIALIZE);
            this.bb = qrj();
            jk();
        } else if (i2 == 2) {
            jk();
        } else {
            if (i2 == 3) {
                x2();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f18511m);
        }
    }

    private void fu4() {
        if (this.f18514p.toq()) {
            m10829t();
        }
    }

    /* JADX INFO: renamed from: h */
    private int m10826h() {
        return this.f18524z.ordinal();
    }

    /* JADX INFO: renamed from: i */
    private void m10827i(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C3208s.m11263k(j2));
        sb.append(", load key: ");
        sb.append(this.f18518t);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(id, sb.toString());
    }

    private void jk() {
        this.f18519u = Thread.currentThread();
        this.f18500b = C3208s.toq();
        boolean zMo10767k = false;
        while (!this.bv && this.bb != null && !(zMo10767k = this.bb.mo10767k())) {
            this.f18513o = n7h(this.f18513o);
            this.bb = qrj();
            if (this.f18513o == y.SOURCE) {
                mcp(f7l8.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f18513o == y.FINISHED || this.bv) && !zMo10767k) {
            ni7();
        }
    }

    private void jp0y() {
        Throwable th;
        this.f18512n.zy();
        if (!this.bp) {
            this.bp = true;
            return;
        }
        if (this.f18515q.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f18515q;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private void ki(String str, long j2) {
        m10827i(str, j2, null);
    }

    @lvui
    private C3087p kja0(EnumC3050k enumC3050k) {
        C3087p c3087p = this.f18501c;
        boolean z2 = enumC3050k == EnumC3050k.RESOURCE_DISK_CACHE || this.f18509k.fu4();
        C3138s<Boolean> c3138s = com.bumptech.glide.load.resource.bitmap.cdj.f62869ld6;
        Boolean bool = (Boolean) c3087p.zy(c3138s);
        if (bool != null && (!bool.booleanValue() || z2)) {
            return c3087p;
        }
        C3087p c3087p2 = new C3087p();
        c3087p2.m10929q(this.f18501c);
        c3087p2.m10927g(c3138s, Boolean.valueOf(z2));
        return c3087p2;
    }

    private <Data> zurt<R> ld6(Data data, EnumC3050k enumC3050k) throws cdj {
        return a9(data, enumC3050k, this.f18509k.m10761y(data.getClass()));
    }

    private void mcp(f7l8 f7l8Var) {
        this.f18511m = f7l8Var;
        this.f18503e.mo10819n(this);
    }

    private y n7h(y yVar) {
        int i2 = k.f62818toq[yVar.ordinal()];
        if (i2 == 1) {
            return this.f18504f.mo10797k() ? y.DATA_CACHE : n7h(y.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.f18499a ? y.FINISHED : y.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return y.FINISHED;
        }
        if (i2 == 5) {
            return this.f18504f.toq() ? y.RESOURCE_CACHE : n7h(y.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + yVar);
    }

    private void ni7() {
        jp0y();
        this.f18503e.zy(new cdj("Failed to load resource", new ArrayList(this.f18515q)));
        m10830z();
    }

    /* JADX INFO: renamed from: p */
    private <Data> zurt<R> m10828p(InterfaceC3000q<?> interfaceC3000q, Data data, EnumC3050k enumC3050k) throws cdj {
        if (data == null) {
            return null;
        }
        try {
            long qVar = C3208s.toq();
            zurt<R> zurtVarLd6 = ld6(data, enumC3050k);
            if (Log.isLoggable(id, 2)) {
                ki("Decoded result " + zurtVarLd6, qVar);
            }
            return zurtVarLd6;
        } finally {
            interfaceC3000q.toq();
        }
    }

    private InterfaceC3030g qrj() {
        int i2 = k.f62818toq[this.f18513o.ordinal()];
        if (i2 == 1) {
            return new ni7(this.f18509k, this);
        }
        if (i2 == 2) {
            return new com.bumptech.glide.load.engine.zy(this.f18509k, this);
        }
        if (i2 == 3) {
            return new o1t(this.f18509k, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f18513o);
    }

    /* JADX INFO: renamed from: t */
    private void m10829t() {
        this.f18514p.m10833n();
        this.f18517s.m10835k();
        this.f18509k.m10756k();
        this.bp = false;
        this.f18506h = null;
        this.f18507i = null;
        this.f18501c = null;
        this.f18524z = null;
        this.f18518t = null;
        this.f18503e = null;
        this.f18513o = null;
        this.bb = null;
        this.f18519u = null;
        this.f62815bo = null;
        this.f18502d = null;
        this.f18521w = null;
        this.f62814ab = null;
        this.f18500b = 0L;
        this.bv = false;
        this.f18522x = null;
        this.f18515q.clear();
        this.f18523y.toq(this);
    }

    private void x2() {
        if (Log.isLoggable(id, 2)) {
            m10827i("Retrieved data", this.f18500b, "data: " + this.f18502d + ", cache key: " + this.f62815bo + ", fetcher: " + this.f62814ab);
        }
        zurt<R> zurtVarM10828p = null;
        try {
            zurtVarM10828p = m10828p(this.f62814ab, this.f18502d, this.f18521w);
        } catch (cdj e2) {
            e2.setLoggingDetails(this.f18520v, this.f18521w);
            this.f18515q.add(e2);
        }
        if (zurtVarM10828p != null) {
            zurt(zurtVarM10828p, this.f18521w, this.an);
        } else {
            jk();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m10830z() {
        if (this.f18514p.zy()) {
            m10829t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zurt(zurt<R> zurtVar, EnumC3050k enumC3050k, boolean z2) {
        com.bumptech.glide.util.pool.toq.m11251k("DecodeJob.notifyEncodeAndRelease");
        try {
            if (zurtVar instanceof ki) {
                ((ki) zurtVar).mo10781k();
            }
            fn3e fn3eVar = 0;
            if (this.f18517s.zy()) {
                zurtVar = fn3e.m10763g(zurtVar);
                fn3eVar = zurtVar;
            }
            fn3e(zurtVar, enumC3050k, z2);
            this.f18513o = y.ENCODE;
            try {
                if (this.f18517s.zy()) {
                    this.f18517s.toq(this.f18505g, this.f18501c);
                }
                fu4();
            } finally {
                if (fn3eVar != 0) {
                    fn3eVar.m10766y();
                }
            }
        } finally {
            com.bumptech.glide.util.pool.toq.m11250g();
        }
    }

    RunnableC3047y<R> cdj(C3157n c3157n, Object obj, n7h n7hVar, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC3159p enumC3159p, AbstractC3039p abstractC3039p, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, boolean z2, boolean z3, boolean z5, C3087p c3087p, toq<R> toqVar, int i4) {
        this.f18509k.zurt(c3157n, obj, f7l8Var, i2, i3, abstractC3039p, cls, cls2, enumC3159p, c3087p, map, z2, z3, this.f18505g);
        this.f18506h = c3157n;
        this.f18507i = f7l8Var;
        this.f18524z = enumC3159p;
        this.f18518t = n7hVar;
        this.f18516r = i2;
        this.f18510l = i3;
        this.f18504f = abstractC3039p;
        this.f18499a = z5;
        this.f18501c = c3087p;
        this.f18503e = toqVar;
        this.f18508j = i4;
        this.f18511m = f7l8.INITIALIZE;
        this.f18522x = obj;
        return this;
    }

    public void f7l8() {
        this.bv = true;
        InterfaceC3030g interfaceC3030g = this.bb;
        if (interfaceC3030g != null) {
            interfaceC3030g.cancel();
        }
    }

    boolean gvn7() {
        y yVarN7h = n7h(y.INITIALIZE);
        return yVarN7h == y.RESOURCE_CACHE || yVarN7h == y.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    /* JADX INFO: renamed from: n */
    public void mo10768n(com.bumptech.glide.load.f7l8 f7l8Var, Object obj, InterfaceC3000q<?> interfaceC3000q, EnumC3050k enumC3050k, com.bumptech.glide.load.f7l8 f7l8Var2) {
        this.f62815bo = f7l8Var;
        this.f18502d = obj;
        this.f62814ab = interfaceC3000q;
        this.f18521w = enumC3050k;
        this.f18520v = f7l8Var2;
        this.an = f7l8Var != this.f18509k.zy().get(0);
        if (Thread.currentThread() != this.f18519u) {
            mcp(f7l8.DECODE_DATA);
            return;
        }
        com.bumptech.glide.util.pool.toq.m11251k("DecodeJob.decodeFromRetrievedData");
        try {
            x2();
        } finally {
            com.bumptech.glide.util.pool.toq.m11250g();
        }
    }

    @lvui
    <Z> zurt<Z> o1t(EnumC3050k enumC3050k, @lvui zurt<Z> zurtVar) {
        zurt<Z> zurtVarMo6744k;
        com.bumptech.glide.load.n7h<Z> n7hVar;
        com.bumptech.glide.load.zy qVar;
        com.bumptech.glide.load.f7l8 c3042q;
        Class<?> cls = zurtVar.get().getClass();
        com.bumptech.glide.load.qrj<Z> qrjVarN7h = null;
        if (enumC3050k != EnumC3050k.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.n7h<Z> n7hVarT8r = this.f18509k.t8r(cls);
            n7hVar = n7hVarT8r;
            zurtVarMo6744k = n7hVarT8r.mo6744k(this.f18506h, zurtVar, this.f18516r, this.f18510l);
        } else {
            zurtVarMo6744k = zurtVar;
            n7hVar = null;
        }
        if (!zurtVar.equals(zurtVarMo6744k)) {
            zurtVar.toq();
        }
        if (this.f18509k.ni7(zurtVarMo6744k)) {
            qrjVarN7h = this.f18509k.n7h(zurtVarMo6744k);
            qVar = qrjVarN7h.toq(this.f18501c);
        } else {
            qVar = com.bumptech.glide.load.zy.NONE;
        }
        com.bumptech.glide.load.qrj qrjVar = qrjVarN7h;
        if (!this.f18504f.mo10798q(!this.f18509k.m10762z(this.f62815bo), enumC3050k, qVar)) {
            return zurtVarMo6744k;
        }
        if (qrjVar == null) {
            throw new x2.C3212q(zurtVarMo6744k.get().getClass());
        }
        int i2 = k.f62819zy[qVar.ordinal()];
        if (i2 == 1) {
            c3042q = new C3042q(this.f62815bo, this.f18507i);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + qVar);
            }
            c3042q = new fu4(this.f18509k.toq(), this.f62815bo, this.f18507i, this.f18516r, this.f18510l, n7hVar, cls, this.f18501c);
        }
        fn3e fn3eVarM10763g = fn3e.m10763g(zurtVarMo6744k);
        this.f18517s.m10836q(c3042q, qrjVar, fn3eVarM10763g);
        return fn3eVarM10763g;
    }

    @Override // com.bumptech.glide.util.pool.C3205k.g
    @lvui
    /* JADX INFO: renamed from: q */
    public com.bumptech.glide.util.pool.zy mo10724q() {
        return this.f18512n;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.util.pool.toq.m11253q("DecodeJob#run(reason=%s, model=%s)", this.f18511m, this.f18522x);
        InterfaceC3000q<?> interfaceC3000q = this.f62814ab;
        try {
            try {
                try {
                    if (this.bv) {
                        ni7();
                        if (interfaceC3000q != null) {
                            interfaceC3000q.toq();
                        }
                        com.bumptech.glide.util.pool.toq.m11250g();
                        return;
                    }
                    fti();
                    if (interfaceC3000q != null) {
                        interfaceC3000q.toq();
                    }
                    com.bumptech.glide.util.pool.toq.m11250g();
                } catch (Throwable th) {
                    if (Log.isLoggable(id, 3)) {
                        Log.d(id, "DecodeJob threw unexpectedly, isCancelled: " + this.bv + ", stage: " + this.f18513o, th);
                    }
                    if (this.f18513o != y.ENCODE) {
                        this.f18515q.add(th);
                        ni7();
                    }
                    if (!this.bv) {
                        throw th;
                    }
                    throw th;
                }
            } catch (com.bumptech.glide.load.engine.toq e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (interfaceC3000q != null) {
                interfaceC3000q.toq();
            }
            com.bumptech.glide.util.pool.toq.m11250g();
            throw th2;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int compareTo(@lvui RunnableC3047y<?> runnableC3047y) {
        int iM10826h = m10826h() - runnableC3047y.m10826h();
        return iM10826h == 0 ? this.f18508j - runnableC3047y.f18508j : iM10826h;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    public void toq(com.bumptech.glide.load.f7l8 f7l8Var, Exception exc, InterfaceC3000q<?> interfaceC3000q, EnumC3050k enumC3050k) {
        interfaceC3000q.toq();
        cdj cdjVar = new cdj("Fetching data failed", exc);
        cdjVar.setLoggingDetails(f7l8Var, enumC3050k, interfaceC3000q.mo10634k());
        this.f18515q.add(cdjVar);
        if (Thread.currentThread() != this.f18519u) {
            mcp(f7l8.SWITCH_TO_SOURCE_SERVICE);
        } else {
            jk();
        }
    }

    void wvg(boolean z2) {
        if (this.f18514p.m10834q(z2)) {
            m10829t();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    public void zy() {
        mcp(f7l8.SWITCH_TO_SOURCE_SERVICE);
    }
}
