package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC6232i;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.ranges.z */
/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@yz(version = "1.5")
public class C6357z implements Iterable<ikck>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final k f36556g = new k(null);

    /* JADX INFO: renamed from: k */
    private final long f36557k;

    /* JADX INFO: renamed from: n */
    private final long f36558n;

    /* JADX INFO: renamed from: q */
    private final long f36559q;

    /* JADX INFO: renamed from: kotlin.ranges.z$k */
    /* JADX INFO: compiled from: ULongRange.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C6357z m23371k(long j2, long j3, long j4) {
            return new C6357z(j2, j3, j4, null);
        }
    }

    private C6357z(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36557k = j2;
        this.f36559q = kotlin.internal.ki.zy(j2, j3, j4);
        this.f36558n = j4;
    }

    public /* synthetic */ C6357z(long j2, long j3, long j4, kotlin.jvm.internal.ni7 ni7Var) {
        this(j2, j3, j4);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6357z) {
            if (!isEmpty() || !((C6357z) obj).isEmpty()) {
                C6357z c6357z = (C6357z) obj;
                if (this.f36557k != c6357z.f36557k || this.f36559q != c6357z.f36559q || this.f36558n != c6357z.f36558n) {
                }
            }
            return true;
        }
        return false;
    }

    public final long f7l8() {
        return this.f36557k;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.f36557k;
        int iLd6 = ((int) ikck.ld6(j2 ^ ikck.ld6(j2 >>> 32))) * 31;
        long j3 = this.f36559q;
        int iLd62 = (iLd6 + ((int) ikck.ld6(j3 ^ ikck.ld6(j3 >>> 32)))) * 31;
        long j4 = this.f36558n;
        return iLd62 + ((int) ((j4 >>> 32) ^ j4));
    }

    public boolean isEmpty() {
        long j2 = this.f36558n;
        long j3 = this.f36557k;
        long j4 = this.f36559q;
        if (j2 > 0) {
            if (Long.compareUnsigned(j3, j4) > 0) {
                return true;
            }
        } else if (Long.compareUnsigned(j3, j4) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    public final Iterator<ikck> iterator() {
        return new o1t(this.f36557k, this.f36559q, this.f36558n, null);
    }

    /* JADX INFO: renamed from: s */
    public final long m23369s() {
        return this.f36558n;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f36558n > 0) {
            sb = new StringBuilder();
            sb.append((Object) ikck.yz(this.f36557k));
            sb.append("..");
            sb.append((Object) ikck.yz(this.f36559q));
            sb.append(" step ");
            j2 = this.f36558n;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ikck.yz(this.f36557k));
            sb.append(" downTo ");
            sb.append((Object) ikck.yz(this.f36559q));
            sb.append(" step ");
            j2 = -this.f36558n;
        }
        sb.append(j2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final long m23370y() {
        return this.f36559q;
    }
}
