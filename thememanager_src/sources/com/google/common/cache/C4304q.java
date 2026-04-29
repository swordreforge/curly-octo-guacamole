package com.google.common.cache;

import com.google.common.base.C4271r;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.base.lvui;
import com.google.common.base.x9kr;
import com.google.common.cache.AbstractC4285k;
import com.google.common.cache.ld6;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: renamed from: com.google.common.cache.q */
/* JADX INFO: compiled from: CacheBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4304q<K, V> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f68163cdj = 16;

    /* JADX INFO: renamed from: i */
    private static final int f25909i = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f68166ki = 4;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f68168o1t = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f68169t8r = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @MonotonicNonNullDecl
    ld6.EnumC4290i f68171f7l8;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    fn3e<? super K, ? super V> f25911g;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @MonotonicNonNullDecl
    x9kr f68172kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @MonotonicNonNullDecl
    cdj<? super K, ? super V> f68174n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @MonotonicNonNullDecl
    com.google.common.base.x2<Object> f68175qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @MonotonicNonNullDecl
    com.google.common.base.x2<Object> f68177x2;

    /* JADX INFO: renamed from: y */
    @MonotonicNonNullDecl
    ld6.EnumC4290i f25918y;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    static final lvui<? extends AbstractC4285k.toq> f68164fn3e = C4271r.m15453q(new k());

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final f7l8 f68170zurt = new f7l8(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final lvui<AbstractC4285k.toq> f68167ni7 = new toq();

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static final x9kr f68165fu4 = new zy();

    /* JADX INFO: renamed from: z */
    private static final Logger f25910z = Logger.getLogger(C4304q.class.getName());

    /* JADX INFO: renamed from: k */
    boolean f25913k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f68176toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f68178zy = -1;

    /* JADX INFO: renamed from: q */
    long f25916q = -1;

    /* JADX INFO: renamed from: n */
    long f25914n = -1;

    /* JADX INFO: renamed from: s */
    long f25917s = -1;

    /* JADX INFO: renamed from: p */
    long f25915p = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    long f68173ld6 = -1;

    /* JADX INFO: renamed from: h */
    lvui<? extends AbstractC4285k.toq> f25912h = f68164fn3e;

    /* JADX INFO: renamed from: com.google.common.cache.q$k */
    /* JADX INFO: compiled from: CacheBuilder.java */
    static class k implements AbstractC4285k.toq {
        k() {
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: g */
        public f7l8 mo15473g() {
            return C4304q.f68170zurt;
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: k */
        public void mo15474k(int i2) {
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: n */
        public void mo15475n(long j2) {
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        /* JADX INFO: renamed from: q */
        public void mo15476q(long j2) {
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        public void toq(int i2) {
        }

        @Override // com.google.common.cache.AbstractC4285k.toq
        public void zy() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.q$n */
    /* JADX INFO: compiled from: CacheBuilder.java */
    enum n implements fn3e<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.fn3e
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.q$q */
    /* JADX INFO: compiled from: CacheBuilder.java */
    enum q implements cdj<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.cdj
        public void onRemoval(t8r<Object, Object> t8rVar) {
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.q$toq */
    /* JADX INFO: compiled from: CacheBuilder.java */
    static class toq implements lvui<AbstractC4285k.toq> {
        toq() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC4285k.toq get() {
            return new AbstractC4285k.k();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.q$zy */
    /* JADX INFO: compiled from: CacheBuilder.java */
    static class zy extends x9kr {
        zy() {
        }

        @Override // com.google.common.base.x9kr
        /* JADX INFO: renamed from: k */
        public long mo15454k() {
            return 0L;
        }
    }

    private C4304q() {
    }

    public static C4304q<Object, Object> jk() {
        return new C4304q<>();
    }

    /* JADX INFO: renamed from: q */
    private void m15511q() {
        if (this.f25911g == null) {
            jk.y9n(this.f25914n == -1, "maximumWeight requires weigher");
        } else if (this.f25913k) {
            jk.y9n(this.f25914n != -1, "weigher requires maximumWeight");
        } else if (this.f25914n == -1) {
            f25910z.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    public static C4304q<Object, Object> m15512s(String str) {
        return m15513y(C4302n.m15507n(str));
    }

    @wlev.zy
    /* JADX INFO: renamed from: y */
    public static C4304q<Object, Object> m15513y(C4302n c4302n) {
        return c4302n.m15509g().wvg();
    }

    private void zy() {
        jk.y9n(this.f68173ld6 == -1, "refreshAfterWrite requires a LoadingCache");
    }

    public C4304q<K, V> a9() {
        this.f25912h = f68167ni7;
        return this;
    }

    long cdj() {
        long j2 = this.f68173ld6;
        if (j2 == -1) {
            return 0L;
        }
        return j2;
    }

    @wlev.zy
    C4304q<K, V> d2ok(com.google.common.base.x2<Object> x2Var) {
        com.google.common.base.x2<Object> x2Var2 = this.f68175qrj;
        jk.gyi(x2Var2 == null, "value equivalence was already set to %s", x2Var2);
        this.f68175qrj = (com.google.common.base.x2) jk.a9(x2Var);
        return this;
    }

    C4304q<K, V> d3(ld6.EnumC4290i enumC4290i) {
        ld6.EnumC4290i enumC4290i2 = this.f25918y;
        jk.gyi(enumC4290i2 == null, "Value strength was already set to %s", enumC4290i2);
        this.f25918y = (ld6.EnumC4290i) jk.a9(enumC4290i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    public <K1 extends K, V1 extends V> C4304q<K1, V1> dd(fn3e<? super K1, ? super V1> fn3eVar) {
        jk.yz(this.f25911g == null);
        if (this.f25913k) {
            long j2 = this.f25916q;
            jk.t8iq(j2 == -1, "weigher can not be combined with maximum size", j2);
        }
        this.f25911g = (fn3e) jk.a9(fn3eVar);
        return this;
    }

    public C4304q<K, V> eqxt(x9kr x9krVar) {
        jk.yz(this.f68172kja0 == null);
        this.f68172kja0 = (x9kr) jk.a9(x9krVar);
        return this;
    }

    public C4304q<K, V> f7l8(long j2, TimeUnit timeUnit) {
        long j3 = this.f25917s;
        jk.t8iq(j3 == -1, "expireAfterWrite was already set to %s ns", j3);
        jk.m15375i(j2 >= 0, "duration cannot be negative: %s %s", j2, timeUnit);
        this.f25917s = timeUnit.toNanos(j2);
        return this;
    }

    com.google.common.base.x2<Object> fn3e() {
        return (com.google.common.base.x2) fu4.m15351k(this.f68175qrj, zurt().defaultEquivalence());
    }

    @wlev.zy
    public C4304q<K, V> fti(long j2, TimeUnit timeUnit) {
        jk.a9(timeUnit);
        long j3 = this.f68173ld6;
        jk.t8iq(j3 == -1, "refresh was already set to %s ns", j3);
        jk.m15375i(j2 > 0, "duration must be positive: %s %s", j2, timeUnit);
        this.f68173ld6 = timeUnit.toNanos(j2);
        return this;
    }

    public C4304q<K, V> fu4(int i2) {
        int i3 = this.f68176toq;
        jk.zp(i3 == -1, "initial capacity was already set to %s", i3);
        jk.m15383q(i2 >= 0);
        this.f68176toq = i2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C4304q<K, V> m15514g(long j2, TimeUnit timeUnit) {
        long j3 = this.f25915p;
        jk.t8iq(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
        jk.m15375i(j2 >= 0, "duration cannot be negative: %s %s", j2, timeUnit);
        this.f25915p = timeUnit.toNanos(j2);
        return this;
    }

    C4304q<K, V> gvn7(ld6.EnumC4290i enumC4290i) {
        ld6.EnumC4290i enumC4290i2 = this.f68171f7l8;
        jk.gyi(enumC4290i2 == null, "Key strength was already set to %s", enumC4290i2);
        this.f68171f7l8 = (ld6.EnumC4290i) jk.a9(enumC4290i);
        return this;
    }

    /* JADX INFO: renamed from: h */
    long m15515h() {
        if (this.f25917s == 0 || this.f25915p == 0) {
            return 0L;
        }
        return this.f25911g == null ? this.f25916q : this.f25914n;
    }

    /* JADX INFO: renamed from: i */
    x9kr m15516i(boolean z2) {
        x9kr x9krVar = this.f68172kja0;
        return x9krVar != null ? x9krVar : z2 ? x9kr.toq() : f68165fu4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    public <K1 extends K, V1 extends V> C4304q<K1, V1> jp0y(cdj<? super K1, ? super V1> cdjVar) {
        jk.yz(this.f68174n7h == null);
        this.f68174n7h = (cdj) jk.a9(cdjVar);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public <K1 extends K, V1 extends V> com.google.common.cache.zy<K1, V1> m15517k() {
        m15511q();
        zy();
        return new ld6.kja0(this);
    }

    <K1 extends K, V1 extends V> cdj<K1, V1> ki() {
        return (cdj) fu4.m15351k(this.f68174n7h, q.INSTANCE);
    }

    ld6.EnumC4290i kja0() {
        return (ld6.EnumC4290i) fu4.m15351k(this.f68171f7l8, ld6.EnumC4290i.STRONG);
    }

    long ld6() {
        long j2 = this.f25915p;
        if (j2 == -1) {
            return 0L;
        }
        return j2;
    }

    @wlev.zy
    public C4304q<K, V> lvui() {
        return gvn7(ld6.EnumC4290i.WEAK);
    }

    @wlev.zy
    public C4304q<K, V> mcp(long j2) {
        long j3 = this.f25914n;
        jk.t8iq(j3 == -1, "maximum weight was already set to %s", j3);
        long j4 = this.f25916q;
        jk.t8iq(j4 == -1, "maximum size was already set to %s", j4);
        this.f25914n = j2;
        jk.m15380n(j2 >= 0, "maximum weight must not be negative");
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C4304q<K, V> m15518n(int i2) {
        int i3 = this.f68178zy;
        jk.zp(i3 == -1, "concurrency level was already set to %s", i3);
        jk.m15383q(i2 > 0);
        this.f68178zy = i2;
        return this;
    }

    com.google.common.base.x2<Object> n7h() {
        return (com.google.common.base.x2) fu4.m15351k(this.f68177x2, kja0().defaultEquivalence());
    }

    <K1 extends K, V1 extends V> fn3e<K1, V1> ni7() {
        return (fn3e) fu4.m15351k(this.f25911g, n.INSTANCE);
    }

    @wlev.zy
    C4304q<K, V> o1t(com.google.common.base.x2<Object> x2Var) {
        com.google.common.base.x2<Object> x2Var2 = this.f68177x2;
        jk.gyi(x2Var2 == null, "key equivalence was already set to %s", x2Var2);
        this.f68177x2 = (com.google.common.base.x2) jk.a9(x2Var);
        return this;
    }

    @wlev.zy
    public C4304q<K, V> oc() {
        return d3(ld6.EnumC4290i.SOFT);
    }

    /* JADX INFO: renamed from: p */
    int m15519p() {
        int i2 = this.f68178zy;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    int qrj() {
        int i2 = this.f68176toq;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    @wlev.zy
    /* JADX INFO: renamed from: r */
    public C4304q<K, V> m15520r() {
        return d3(ld6.EnumC4290i.WEAK);
    }

    /* JADX INFO: renamed from: t */
    public C4304q<K, V> m15521t(long j2) {
        long j3 = this.f25916q;
        jk.t8iq(j3 == -1, "maximum size was already set to %s", j3);
        long j4 = this.f25914n;
        jk.t8iq(j4 == -1, "maximum weight was already set to %s", j4);
        jk.y9n(this.f25911g == null, "maximum size can not be combined with weigher");
        jk.m15380n(j2 >= 0, "maximum size must not be negative");
        this.f25916q = j2;
        return this;
    }

    lvui<? extends AbstractC4285k.toq> t8r() {
        return this.f25912h;
    }

    public String toString() {
        fu4.toq toqVarZy = fu4.zy(this);
        int i2 = this.f68176toq;
        if (i2 != -1) {
            toqVarZy.m15360q("initialCapacity", i2);
        }
        int i3 = this.f68178zy;
        if (i3 != -1) {
            toqVarZy.m15360q("concurrencyLevel", i3);
        }
        long j2 = this.f25916q;
        if (j2 != -1) {
            toqVarZy.m15359n("maximumSize", j2);
        }
        long j3 = this.f25914n;
        if (j3 != -1) {
            toqVarZy.m15359n("maximumWeight", j3);
        }
        if (this.f25917s != -1) {
            toqVarZy.m15356g("expireAfterWrite", this.f25917s + "ns");
        }
        if (this.f25915p != -1) {
            toqVarZy.m15356g("expireAfterAccess", this.f25915p + "ns");
        }
        ld6.EnumC4290i enumC4290i = this.f68171f7l8;
        if (enumC4290i != null) {
            toqVarZy.m15356g("keyStrength", com.google.common.base.zy.f7l8(enumC4290i.toString()));
        }
        ld6.EnumC4290i enumC4290i2 = this.f25918y;
        if (enumC4290i2 != null) {
            toqVarZy.m15356g("valueStrength", com.google.common.base.zy.f7l8(enumC4290i2.toString()));
        }
        if (this.f68177x2 != null) {
            toqVarZy.m15357h("keyEquivalence");
        }
        if (this.f68175qrj != null) {
            toqVarZy.m15357h("valueEquivalence");
        }
        if (this.f68174n7h != null) {
            toqVarZy.m15357h("removalListener");
        }
        return toqVarZy.toString();
    }

    public <K1 extends K, V1 extends V> InterfaceC4303p<K1, V1> toq(AbstractC4282g<? super K1, V1> abstractC4282g) {
        m15511q();
        return new ld6.n7h(this, abstractC4282g);
    }

    @wlev.zy
    C4304q<K, V> wvg() {
        this.f25913k = false;
        return this;
    }

    long x2() {
        long j2 = this.f25917s;
        if (j2 == -1) {
            return 0L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: z */
    boolean m15522z() {
        return this.f25912h == f68167ni7;
    }

    ld6.EnumC4290i zurt() {
        return (ld6.EnumC4290i) fu4.m15351k(this.f25918y, ld6.EnumC4290i.STRONG);
    }
}
