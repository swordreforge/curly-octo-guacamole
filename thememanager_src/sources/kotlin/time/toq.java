package kotlin.time;

import cyoe.InterfaceC5981k;
import kotlin.fti;
import kotlin.i9jn;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.math.C6321q;
import kotlin.time.InterfaceC6469q;
import kotlin.time.t8r;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.9")
public abstract class toq implements t8r.zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final EnumC6474y f81950toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final jk f81951zy;

    /* JADX INFO: renamed from: kotlin.time.toq$k */
    /* JADX INFO: compiled from: TimeSources.kt */
    @lv5({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    private static final class C6473k implements InterfaceC6469q {

        /* JADX INFO: renamed from: k */
        private final long f36750k;

        /* JADX INFO: renamed from: n */
        private final long f36751n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final toq f36752q;

        private C6473k(long j2, toq timeSource, long j3) {
            d2ok.m23075h(timeSource, "timeSource");
            this.f36750k = j2;
            this.f36752q = timeSource;
            this.f36751n = j3;
        }

        public /* synthetic */ C6473k(long j2, toq toqVar, long j3, ni7 ni7Var) {
            this(j2, toqVar, j3);
        }

        @Override // kotlin.time.InterfaceC6469q
        public boolean equals(@InterfaceC7395n Object obj) {
            return (obj instanceof C6473k) && d2ok.f7l8(this.f36752q, ((C6473k) obj).f36752q) && C6467n.cdj(mo23695y((InterfaceC6469q) obj), C6467n.f36743q.lrht());
        }

        @Override // kotlin.time.ki
        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public InterfaceC6469q mo23692g(long j2) {
            return InterfaceC6469q.k.m23751q(this, j2);
        }

        @Override // kotlin.time.InterfaceC6469q
        public int hashCode() {
            return (C6467n.m23704e(this.f36751n) * 37) + Long.hashCode(this.f36750k);
        }

        @Override // kotlin.time.ki
        /* JADX INFO: renamed from: q */
        public boolean mo23694q() {
            return InterfaceC6469q.k.toq(this);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: t8r */
        public int compareTo(@InterfaceC7396q InterfaceC6469q interfaceC6469q) {
            return InterfaceC6469q.k.m23750k(this, interfaceC6469q);
        }

        @InterfaceC7396q
        public String toString() {
            return "LongTimeMark(" + this.f36750k + ld6.m23700y(this.f36752q.m23764q()) + " + " + ((Object) C6467n.bo(this.f36751n)) + ", " + this.f36752q + ')';
        }

        @Override // kotlin.time.ki
        public long toq() {
            return C6467n.yz(qrj.m23756y(this.f36752q.zy(), this.f36750k, this.f36752q.m23764q()), this.f36751n);
        }

        @Override // kotlin.time.InterfaceC6469q
        /* JADX INFO: renamed from: y */
        public long mo23695y(@InterfaceC7396q InterfaceC6469q other) {
            d2ok.m23075h(other, "other");
            if (other instanceof C6473k) {
                C6473k c6473k = (C6473k) other;
                if (d2ok.f7l8(this.f36752q, c6473k.f36752q)) {
                    return C6467n.y9n(qrj.m23756y(this.f36750k, c6473k.f36750k, this.f36752q.m23764q()), C6467n.yz(this.f36751n, c6473k.f36751n));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ki
        public boolean zy() {
            return InterfaceC6469q.k.zy(this);
        }

        @Override // kotlin.time.ki
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public InterfaceC6469q mo23693k(long j2) {
            EnumC6474y enumC6474yM23764q = this.f36752q.m23764q();
            if (C6467n.m23712o(j2)) {
                return new C6473k(qrj.m23755q(this.f36750k, enumC6474yM23764q, j2), this.f36752q, C6467n.f36743q.lrht(), null);
            }
            long jGyi = C6467n.gyi(j2, enumC6474yM23764q);
            long jY9n = C6467n.y9n(C6467n.yz(j2, jGyi), this.f36751n);
            long jM23755q = qrj.m23755q(this.f36750k, enumC6474yM23764q, jGyi);
            long jGyi2 = C6467n.gyi(jY9n, enumC6474yM23764q);
            long jM23755q2 = qrj.m23755q(jM23755q, enumC6474yM23764q, jGyi2);
            long jYz = C6467n.yz(jY9n, jGyi2);
            long jDd = C6467n.dd(jYz);
            if (jM23755q2 != 0 && jDd != 0 && (jM23755q2 ^ jDd) < 0) {
                long jM23661a = f7l8.m23661a(C6321q.m23201c(jDd), enumC6474yM23764q);
                jM23755q2 = qrj.m23755q(jM23755q2, enumC6474yM23764q, jM23661a);
                jYz = C6467n.yz(jYz, jM23661a);
            }
            if ((1 | (jM23755q2 - 1)) == Long.MAX_VALUE) {
                jYz = C6467n.f36743q.lrht();
            }
            return new C6473k(jM23755q2, this.f36752q, jYz, null);
        }
    }

    /* JADX INFO: renamed from: kotlin.time.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeSources.kt */
    static final class C8064toq extends AbstractC6308r implements InterfaceC5981k<Long> {
        C8064toq() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Long invoke() {
            return Long.valueOf(toq.this.mo23659g());
        }
    }

    public toq(@InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        this.f81950toq = unit;
        this.f81951zy = fti.m22825k(new C8064toq());
    }

    /* JADX INFO: renamed from: n */
    private final long m23763n() {
        return ((Number) this.f81951zy.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zy() {
        return mo23659g() - m23763n();
    }

    /* JADX INFO: renamed from: g */
    protected abstract long mo23659g();

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    protected final EnumC6474y m23764q() {
        return this.f81950toq;
    }

    @Override // kotlin.time.t8r
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC6469q mo23685k() {
        return new C6473k(zy(), this, C6467n.f36743q.lrht(), null);
    }
}
