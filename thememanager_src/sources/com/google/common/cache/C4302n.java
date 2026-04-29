package com.google.common.cache;

import com.google.common.base.C4280z;
import com.google.common.base.d3;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.cache.ld6;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.cache.n */
/* JADX INFO: compiled from: CacheBuilderSpec.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class C4302n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final zkd<String, qrj> f68154cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    Boolean f68156f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    ld6.EnumC4290i f25899g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    Integer f25900k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    TimeUnit f68157ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    ld6.EnumC4290i f25901n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final String f68158n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7732q
    long f25902p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    Integer f25903q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    TimeUnit f68159qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    TimeUnit f25904s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    Long f68160toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7732q
    long f68161x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7732q
    long f25905y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7732q
    @MonotonicNonNullDecl
    Long f68162zy;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final d3 f68155kja0 = d3.m15307y(',').cdj();

    /* JADX INFO: renamed from: h */
    private static final d3 f25898h = d3.m15307y('=').cdj();

    /* JADX INFO: renamed from: com.google.common.cache.n$f7l8 */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class f7l8 implements qrj {

        /* JADX INFO: renamed from: k */
        private final ld6.EnumC4290i f25906k;

        public f7l8(ld6.EnumC4290i enumC4290i) {
            this.f25906k = enumC4290i;
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, @NullableDecl String str2) {
            jk.fn3e(str2 == null, "key %s does not take values", str);
            ld6.EnumC4290i enumC4290i = c4302n.f25901n;
            jk.m15391z(enumC4290i == null, "%s was already set to %s", str, enumC4290i);
            c4302n.f25901n = this.f25906k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$g */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static abstract class g implements qrj {
        g() {
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, String str2) {
            jk.fn3e((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                toq(c4302n, Integer.parseInt(str2));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(C4302n.m15508q("key %s value set to %s, must be integer", str, str2), e2);
            }
        }

        protected abstract void toq(C4302n c4302n, int i2);
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$k */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f25907k;

        static {
            int[] iArr = new int[ld6.EnumC4290i.values().length];
            f25907k = iArr;
            try {
                iArr[ld6.EnumC4290i.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25907k[ld6.EnumC4290i.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$kja0 */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class kja0 extends q {
        kja0() {
        }

        @Override // com.google.common.cache.C4302n.q
        protected void toq(C4302n c4302n, long j2, TimeUnit timeUnit) {
            jk.m15380n(c4302n.f25904s == null, "expireAfterWrite already set");
            c4302n.f25905y = j2;
            c4302n.f25904s = timeUnit;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$ld6 */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class ld6 implements qrj {
        ld6() {
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, @NullableDecl String str2) {
            jk.m15380n(str2 == null, "recordStats does not take values");
            jk.m15380n(c4302n.f68156f7l8 == null, "recordStats already set");
            c4302n.f68156f7l8 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$n */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class n extends g {
        n() {
        }

        @Override // com.google.common.cache.C4302n.g
        protected void toq(C4302n c4302n, int i2) {
            Integer num = c4302n.f25900k;
            jk.fn3e(num == null, "initial capacity was already set to ", num);
            c4302n.f25900k = Integer.valueOf(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$n7h */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class n7h implements qrj {

        /* JADX INFO: renamed from: k */
        private final ld6.EnumC4290i f25908k;

        public n7h(ld6.EnumC4290i enumC4290i) {
            this.f25908k = enumC4290i;
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, @NullableDecl String str2) {
            jk.fn3e(str2 == null, "key %s does not take values", str);
            ld6.EnumC4290i enumC4290i = c4302n.f25899g;
            jk.m15391z(enumC4290i == null, "%s was already set to %s", str, enumC4290i);
            c4302n.f25899g = this.f25908k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$p */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class p extends y {
        p() {
        }

        @Override // com.google.common.cache.C4302n.y
        protected void toq(C4302n c4302n, long j2) {
            Long l2 = c4302n.f68162zy;
            jk.fn3e(l2 == null, "maximum weight was already set to ", l2);
            Long l3 = c4302n.f68160toq;
            jk.fn3e(l3 == null, "maximum size was already set to ", l3);
            c4302n.f68162zy = Long.valueOf(j2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$q */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static abstract class q implements qrj {
        q() {
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, String str2) {
            TimeUnit timeUnit;
            jk.fn3e((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                char cCharAt = str2.charAt(str2.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(C4302n.m15508q("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", str, str2));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                toq(c4302n, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(C4302n.m15508q("key %s value set to %s, must be integer", str, str2));
            }
        }

        protected abstract void toq(C4302n c4302n, long j2, TimeUnit timeUnit);
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$qrj */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    private interface qrj {
        /* JADX INFO: renamed from: k */
        void mo15510k(C4302n c4302n, String str, @NullableDecl String str2);
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$s */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class s extends y {
        s() {
        }

        @Override // com.google.common.cache.C4302n.y
        protected void toq(C4302n c4302n, long j2) {
            Long l2 = c4302n.f68160toq;
            jk.fn3e(l2 == null, "maximum size was already set to ", l2);
            Long l3 = c4302n.f68162zy;
            jk.fn3e(l3 == null, "maximum weight was already set to ", l3);
            c4302n.f68160toq = Long.valueOf(j2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$toq */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class toq extends q {
        toq() {
        }

        @Override // com.google.common.cache.C4302n.q
        protected void toq(C4302n c4302n, long j2, TimeUnit timeUnit) {
            jk.m15380n(c4302n.f68157ld6 == null, "expireAfterAccess already set");
            c4302n.f25902p = j2;
            c4302n.f68157ld6 = timeUnit;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$x2 */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class x2 extends q {
        x2() {
        }

        @Override // com.google.common.cache.C4302n.q
        protected void toq(C4302n c4302n, long j2, TimeUnit timeUnit) {
            jk.m15380n(c4302n.f68159qrj == null, "refreshAfterWrite already set");
            c4302n.f68161x2 = j2;
            c4302n.f68159qrj = timeUnit;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$y */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static abstract class y implements qrj {
        y() {
        }

        @Override // com.google.common.cache.C4302n.qrj
        /* JADX INFO: renamed from: k */
        public void mo15510k(C4302n c4302n, String str, String str2) {
            jk.fn3e((str2 == null || str2.isEmpty()) ? false : true, "value of key %s omitted", str);
            try {
                toq(c4302n, Long.parseLong(str2));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(C4302n.m15508q("key %s value set to %s, must be integer", str, str2), e2);
            }
        }

        protected abstract void toq(C4302n c4302n, long j2);
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$zy */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    static class zy extends g {
        zy() {
        }

        @Override // com.google.common.cache.C4302n.g
        protected void toq(C4302n c4302n, int i2) {
            Integer num = c4302n.f25903q;
            jk.fn3e(num == null, "concurrency level was already set to ", num);
            c4302n.f25903q = Integer.valueOf(i2);
        }
    }

    static {
        zkd.toq toqVarMo15592q = zkd.builder().mo15592q("initialCapacity", new n()).mo15592q("maximumSize", new s()).mo15592q("maximumWeight", new p()).mo15592q("concurrencyLevel", new zy());
        ld6.EnumC4290i enumC4290i = ld6.EnumC4290i.WEAK;
        f68154cdj = toqVarMo15592q.mo15592q("weakKeys", new f7l8(enumC4290i)).mo15592q("softValues", new n7h(ld6.EnumC4290i.SOFT)).mo15592q("weakValues", new n7h(enumC4290i)).mo15592q("recordStats", new ld6()).mo15592q("expireAfterAccess", new toq()).mo15592q("expireAfterWrite", new kja0()).mo15592q("refreshAfterWrite", new x2()).mo15592q("refreshInterval", new x2()).mo15589k();
    }

    private C4302n(String str) {
        this.f68158n7h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static C4302n m15507n(String str) {
        C4302n c4302n = new C4302n(str);
        if (!str.isEmpty()) {
            for (String str2 : f68155kja0.n7h(str)) {
                se seVarCopyOf = se.copyOf(f25898h.n7h(str2));
                jk.m15380n(!seVarCopyOf.isEmpty(), "blank key-value pair");
                jk.fn3e(seVarCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                String str3 = (String) seVarCopyOf.get(0);
                qrj qrjVar = f68154cdj.get(str3);
                jk.fn3e(qrjVar != null, "unknown key %s", str3);
                qrjVar.mo15510k(c4302n, str3, seVarCopyOf.size() == 1 ? null : (String) seVarCopyOf.get(1));
            }
        }
        return c4302n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m15508q(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static C4302n toq() {
        return m15507n("maximumSize=0");
    }

    @NullableDecl
    private static Long zy(long j2, @NullableDecl TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4302n)) {
            return false;
        }
        C4302n c4302n = (C4302n) obj;
        return C4280z.m15455k(this.f25900k, c4302n.f25900k) && C4280z.m15455k(this.f68160toq, c4302n.f68160toq) && C4280z.m15455k(this.f68162zy, c4302n.f68162zy) && C4280z.m15455k(this.f25903q, c4302n.f25903q) && C4280z.m15455k(this.f25901n, c4302n.f25901n) && C4280z.m15455k(this.f25899g, c4302n.f25899g) && C4280z.m15455k(this.f68156f7l8, c4302n.f68156f7l8) && C4280z.m15455k(zy(this.f25905y, this.f25904s), zy(c4302n.f25905y, c4302n.f25904s)) && C4280z.m15455k(zy(this.f25902p, this.f68157ld6), zy(c4302n.f25902p, c4302n.f68157ld6)) && C4280z.m15455k(zy(this.f68161x2, this.f68159qrj), zy(c4302n.f68161x2, c4302n.f68159qrj));
    }

    public String f7l8() {
        return this.f68158n7h;
    }

    /* JADX INFO: renamed from: g */
    C4304q<Object, Object> m15509g() {
        C4304q<Object, Object> c4304qJk = C4304q.jk();
        Integer num = this.f25900k;
        if (num != null) {
            c4304qJk.fu4(num.intValue());
        }
        Long l2 = this.f68160toq;
        if (l2 != null) {
            c4304qJk.m15521t(l2.longValue());
        }
        Long l3 = this.f68162zy;
        if (l3 != null) {
            c4304qJk.mcp(l3.longValue());
        }
        Integer num2 = this.f25903q;
        if (num2 != null) {
            c4304qJk.m15518n(num2.intValue());
        }
        ld6.EnumC4290i enumC4290i = this.f25901n;
        if (enumC4290i != null) {
            if (k.f25907k[enumC4290i.ordinal()] != 1) {
                throw new AssertionError();
            }
            c4304qJk.lvui();
        }
        ld6.EnumC4290i enumC4290i2 = this.f25899g;
        if (enumC4290i2 != null) {
            int i2 = k.f25907k[enumC4290i2.ordinal()];
            if (i2 == 1) {
                c4304qJk.m15520r();
            } else {
                if (i2 != 2) {
                    throw new AssertionError();
                }
                c4304qJk.oc();
            }
        }
        Boolean bool = this.f68156f7l8;
        if (bool != null && bool.booleanValue()) {
            c4304qJk.a9();
        }
        TimeUnit timeUnit = this.f25904s;
        if (timeUnit != null) {
            c4304qJk.f7l8(this.f25905y, timeUnit);
        }
        TimeUnit timeUnit2 = this.f68157ld6;
        if (timeUnit2 != null) {
            c4304qJk.m15514g(this.f25902p, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f68159qrj;
        if (timeUnit3 != null) {
            c4304qJk.fti(this.f68161x2, timeUnit3);
        }
        return c4304qJk;
    }

    public int hashCode() {
        return C4280z.toq(this.f25900k, this.f68160toq, this.f68162zy, this.f25903q, this.f25901n, this.f25899g, this.f68156f7l8, zy(this.f25905y, this.f25904s), zy(this.f25902p, this.f68157ld6), zy(this.f68161x2, this.f68159qrj));
    }

    public String toString() {
        return fu4.zy(this).m15357h(f7l8()).toString();
    }
}
