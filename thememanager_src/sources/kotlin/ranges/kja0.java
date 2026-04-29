package kotlin.ranges;

import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class kja0 extends qrj implements f7l8<Long>, ki<Long> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6347k f36515y = new C6347k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final kja0 f36514s = new kja0(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.kja0$k */
    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class C6347k {
        private C6347k() {
        }

        public /* synthetic */ C6347k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final kja0 m23328k() {
            return kja0.f36514s;
        }
    }

    public kja0(long j2, long j3) {
        super(j2, j3, 1L);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.ld6(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @yz(version = "1.9")
    public static /* synthetic */ void n7h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return x2(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.qrj
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof kja0) {
            if (!isEmpty() || !((kja0) obj).isEmpty()) {
                kja0 kja0Var = (kja0) obj;
                if (f7l8() != kja0Var.f7l8() || m23360y() != kja0Var.m23360y()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Long mo2951k() {
        return Long.valueOf(f7l8());
    }

    @Override // kotlin.ranges.qrj
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (f7l8() ^ (f7l8() >>> 32))) + (m23360y() ^ (m23360y() >>> 32)));
    }

    @Override // kotlin.ranges.qrj, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return f7l8() > m23360y();
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Long zy() {
        return Long.valueOf(m23360y());
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public Long mo23287g() {
        if (m23360y() != Long.MAX_VALUE) {
            return Long.valueOf(m23360y() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.qrj
    @InterfaceC7396q
    public String toString() {
        return f7l8() + ".." + m23360y();
    }

    public boolean x2(long j2) {
        return f7l8() <= j2 && j2 <= m23360y();
    }
}
