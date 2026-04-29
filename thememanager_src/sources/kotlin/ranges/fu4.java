package kotlin.ranges;

import kotlin.InterfaceC6232i;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@yz(version = "1.5")
public final class fu4 extends zurt implements f7l8<gyi>, ki<gyi> {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final fu4 f36506s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6341k f36507y;

    /* JADX INFO: renamed from: kotlin.ranges.fu4$k */
    /* JADX INFO: compiled from: UIntRange.kt */
    public static final class C6341k {
        private C6341k() {
        }

        public /* synthetic */ C6341k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final fu4 m23312k() {
            return fu4.f36506s;
        }
    }

    static {
        kotlin.jvm.internal.ni7 ni7Var = null;
        f36507y = new C6341k(ni7Var);
        f36506s = new fu4(-1, 0, ni7Var);
    }

    private fu4(int i2, int i3) {
        super(i2, i3, 1, null);
    }

    public /* synthetic */ fu4(int i2, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(i2, i3);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.ld6(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @yz(version = "1.9")
    public static /* synthetic */ void qrj() {
    }

    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return ld6(((gyi) comparable).a98o());
    }

    @Override // kotlin.ranges.zurt
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof fu4) {
            if (!isEmpty() || !((fu4) obj).isEmpty()) {
                fu4 fu4Var = (fu4) obj;
                if (f7l8() != fu4Var.f7l8() || m23373y() != fu4Var.m23373y()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ki
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Comparable mo23287g() {
        return gyi.zy(x2());
    }

    @Override // kotlin.ranges.zurt
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f7l8() * 31) + m23373y();
    }

    @Override // kotlin.ranges.zurt, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return Integer.compareUnsigned(f7l8(), m23373y()) > 0;
    }

    @Override // kotlin.ranges.f7l8
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Comparable mo2951k() {
        return gyi.zy(kja0());
    }

    public int kja0() {
        return f7l8();
    }

    public boolean ld6(int i2) {
        return Integer.compareUnsigned(f7l8(), i2) <= 0 && Integer.compareUnsigned(i2, m23373y()) <= 0;
    }

    public int n7h() {
        return m23373y();
    }

    @Override // kotlin.ranges.zurt
    @InterfaceC7396q
    public String toString() {
        return ((Object) gyi.yz(f7l8())) + ".." + ((Object) gyi.yz(m23373y()));
    }

    public int x2() {
        if (m23373y() != -1) {
            return gyi.ld6(m23373y() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ Comparable zy() {
        return gyi.zy(n7h());
    }
}
