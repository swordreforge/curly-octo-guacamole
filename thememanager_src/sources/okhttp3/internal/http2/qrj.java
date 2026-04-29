package okhttp3.internal.http2;

import kotlin.collections.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f93967f7l8 = 4;

    /* JADX INFO: renamed from: g */
    public static final int f43289g = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f93968ld6 = 10;

    /* JADX INFO: renamed from: n */
    public static final int f43290n = 1;

    /* JADX INFO: renamed from: p */
    public static final int f43291p = 7;

    /* JADX INFO: renamed from: q */
    public static final int f43292q = 65535;

    /* JADX INFO: renamed from: s */
    public static final int f43293s = 6;

    /* JADX INFO: renamed from: y */
    public static final int f43294y = 5;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final C7477k f93969zy = new C7477k(null);

    /* JADX INFO: renamed from: k */
    private int f43295k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final int[] f93970toq = new int[10];

    /* JADX INFO: renamed from: okhttp3.internal.http2.qrj$k */
    /* JADX INFO: compiled from: Settings.kt */
    public static final class C7477k {
        private C7477k() {
        }

        public /* synthetic */ C7477k(ni7 ni7Var) {
            this();
        }
    }

    public final int f7l8(int i2) {
        return (this.f43295k & 32) != 0 ? this.f93970toq[5] : i2;
    }

    /* JADX INFO: renamed from: g */
    public final int m27162g() {
        if ((this.f43295k & 16) != 0) {
            return this.f93970toq[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: k */
    public final void m27163k() {
        this.f43295k = 0;
        kja0.cnbm(this.f93970toq, 0, 0, 0, 6, null);
    }

    @InterfaceC7396q
    public final qrj ld6(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f93970toq;
            if (i2 < iArr.length) {
                this.f43295k = (1 << i2) | this.f43295k;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final int m27164n() {
        if ((this.f43295k & 128) != 0) {
            return this.f93970toq[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: p */
    public final void m27165p(@InterfaceC7396q qrj other) {
        d2ok.m23075h(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (other.m27167s(i2)) {
                ld6(i2, other.toq(i2));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m27166q() {
        if ((this.f43295k & 2) != 0) {
            return this.f93970toq[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m27167s(int i2) {
        return ((1 << i2) & this.f43295k) != 0;
    }

    public final int toq(int i2) {
        return this.f93970toq[i2];
    }

    public final int x2() {
        return Integer.bitCount(this.f43295k);
    }

    /* JADX INFO: renamed from: y */
    public final int m27168y(int i2) {
        return (this.f43295k & 64) != 0 ? this.f93970toq[6] : i2;
    }

    public final boolean zy(boolean z2) {
        return (this.f43295k & 4) != 0 ? this.f93970toq[2] == 1 : z2;
    }
}
