package kotlin.time;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.time.InterfaceC6469q;
import kotlin.time.t8r;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.k */
/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes3.dex */
@x2
@kotlin.ld6(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@yz(version = "1.3")
public abstract class AbstractC6464k implements t8r.zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final EnumC6474y f81948toq;

    /* JADX INFO: renamed from: kotlin.time.k$k */
    /* JADX INFO: compiled from: TimeSources.kt */
    private static final class k implements InterfaceC6469q {

        /* JADX INFO: renamed from: k */
        private final double f36737k;

        /* JADX INFO: renamed from: n */
        private final long f36738n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final AbstractC6464k f36739q;

        private k(double d2, AbstractC6464k timeSource, long j2) {
            d2ok.m23075h(timeSource, "timeSource");
            this.f36737k = d2;
            this.f36739q = timeSource;
            this.f36738n = j2;
        }

        public /* synthetic */ k(double d2, AbstractC6464k abstractC6464k, long j2, ni7 ni7Var) {
            this(d2, abstractC6464k, j2);
        }

        @Override // kotlin.time.InterfaceC6469q
        public boolean equals(@InterfaceC7395n Object obj) {
            return (obj instanceof k) && d2ok.f7l8(this.f36739q, ((k) obj).f36739q) && C6467n.cdj(mo23695y((InterfaceC6469q) obj), C6467n.f36743q.lrht());
        }

        @Override // kotlin.time.ki
        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public InterfaceC6469q mo23692g(long j2) {
            return InterfaceC6469q.k.m23751q(this, j2);
        }

        @Override // kotlin.time.InterfaceC6469q
        public int hashCode() {
            return C6467n.m23704e(C6467n.y9n(f7l8.a98o(this.f36737k, this.f36739q.toq()), this.f36738n));
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
            return "DoubleTimeMark(" + this.f36737k + ld6.m23700y(this.f36739q.toq()) + " + " + ((Object) C6467n.bo(this.f36738n)) + ", " + this.f36739q + ')';
        }

        @Override // kotlin.time.ki
        public long toq() {
            return C6467n.yz(f7l8.a98o(this.f36739q.zy() - this.f36737k, this.f36739q.toq()), this.f36738n);
        }

        @Override // kotlin.time.InterfaceC6469q
        /* JADX INFO: renamed from: y */
        public long mo23695y(@InterfaceC7396q InterfaceC6469q other) {
            d2ok.m23075h(other, "other");
            if (other instanceof k) {
                k kVar = (k) other;
                if (d2ok.f7l8(this.f36739q, kVar.f36739q)) {
                    if (C6467n.cdj(this.f36738n, kVar.f36738n) && C6467n.m23712o(this.f36738n)) {
                        return C6467n.f36743q.lrht();
                    }
                    long jYz = C6467n.yz(this.f36738n, kVar.f36738n);
                    long jA98o = f7l8.a98o(this.f36737k - kVar.f36737k, this.f36739q.toq());
                    return C6467n.cdj(jA98o, C6467n.dr(jYz)) ? C6467n.f36743q.lrht() : C6467n.y9n(jA98o, jYz);
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
            return new k(this.f36737k, this.f36739q, C6467n.y9n(this.f36738n, j2), null);
        }
    }

    public AbstractC6464k(@InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        this.f81948toq = unit;
    }

    @InterfaceC7396q
    protected final EnumC6474y toq() {
        return this.f81948toq;
    }

    protected abstract double zy();

    @Override // kotlin.time.t8r
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC6469q mo23685k() {
        return new k(zy(), this, C6467n.f36743q.lrht(), null);
    }
}
