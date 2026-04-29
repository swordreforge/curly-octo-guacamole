package kotlin.ranges;

import kotlin.InterfaceC6232i;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@yz(version = "1.5")
public final class wvg extends C6357z implements f7l8<ikck>, ki<ikck> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6354k f36551y = new C6354k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final wvg f36550s = new wvg(-1, 0, null);

    /* JADX INFO: renamed from: kotlin.ranges.wvg$k */
    /* JADX INFO: compiled from: ULongRange.kt */
    public static final class C6354k {
        private C6354k() {
        }

        public /* synthetic */ C6354k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final wvg m23366k() {
            return wvg.f36550s;
        }
    }

    private wvg(long j2, long j3) {
        super(j2, j3, 1L, null);
    }

    public /* synthetic */ wvg(long j2, long j3, kotlin.jvm.internal.ni7 ni7Var) {
        this(j2, j3);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.ld6(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @yz(version = "1.9")
    public static /* synthetic */ void qrj() {
    }

    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return ld6(((ikck) comparable).a98o());
    }

    @Override // kotlin.ranges.C6357z
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof wvg) {
            if (!isEmpty() || !((wvg) obj).isEmpty()) {
                wvg wvgVar = (wvg) obj;
                if (f7l8() != wvgVar.f7l8() || m23370y() != wvgVar.m23370y()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ki
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Comparable mo23287g() {
        return ikck.zy(x2());
    }

    @Override // kotlin.ranges.C6357z
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) ikck.ld6(f7l8() ^ ikck.ld6(f7l8() >>> 32))) * 31) + ((int) ikck.ld6(m23370y() ^ ikck.ld6(m23370y() >>> 32)));
    }

    @Override // kotlin.ranges.C6357z, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return Long.compareUnsigned(f7l8(), m23370y()) > 0;
    }

    @Override // kotlin.ranges.f7l8
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Comparable mo2951k() {
        return ikck.zy(kja0());
    }

    public long kja0() {
        return f7l8();
    }

    public boolean ld6(long j2) {
        return Long.compareUnsigned(f7l8(), j2) <= 0 && Long.compareUnsigned(j2, m23370y()) <= 0;
    }

    public long n7h() {
        return m23370y();
    }

    @Override // kotlin.ranges.C6357z
    @InterfaceC7396q
    public String toString() {
        return ((Object) ikck.yz(f7l8())) + ".." + ((Object) ikck.yz(m23370y()));
    }

    public long x2() {
        if (m23370y() != -1) {
            return ikck.ld6(m23370y() + ikck.ld6(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ Comparable zy() {
        return ikck.zy(n7h());
    }
}
