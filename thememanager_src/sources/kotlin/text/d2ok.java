package kotlin.text;

import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.gyi;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.qo;
import kotlin.yz;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d2ok {
    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    @InterfaceC6232i
    private static final String cdj(byte[] toHexString, int i2, int i3, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(toHexString, "$this$toHexString");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.d3(toHexString, i2, i3, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final long f7l8(String str, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ikck.ld6(C6451p.fn3e(str, format));
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    @InterfaceC6232i
    private static final String fn3e(byte[] toHexString, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(toHexString, "$this$toHexString");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.oc(toHexString, format);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ int m23512g(String str, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return gyi.ld6(C6451p.cdj(str, format));
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ String m23513h(byte b2, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.a9(b2, format);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ String m23514i(short s2, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.gvn7(s2, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    /* JADX INFO: renamed from: k */
    private static final byte m23515k(String str, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6475u.ld6(C6451p.m23597s(str, format));
    }

    static /* synthetic */ String ki(byte[] toHexString, int i2, int i3, ld6 format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bo.n7h(toHexString);
        }
        if ((i4 & 4) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(toHexString, "$this$toHexString");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.d3(toHexString, i2, i3, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final String kja0(byte b2, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.a9(b2, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final String ld6(int i2, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.fti(i2, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    /* JADX INFO: renamed from: n */
    private static final int m23516n(String str, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return gyi.ld6(C6451p.cdj(str, format));
    }

    static /* synthetic */ String n7h(long j2, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.jp0y(j2, format);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ short m23517p(String str, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return qo.ld6(C6451p.wvg(str, format));
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ byte[] m23518q(String str, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return bo.m22412g(C6451p.qrj(str, format));
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final String qrj(long j2, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.jp0y(j2, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    /* JADX INFO: renamed from: s */
    private static final short m23519s(String str, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return qo.ld6(C6451p.wvg(str, format));
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final String t8r(short s2, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.gvn7(s2, format);
    }

    static /* synthetic */ byte toq(String str, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6475u.ld6(C6451p.m23597s(str, format));
    }

    static /* synthetic */ String x2(int i2, ld6 format, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.fti(i2, format);
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ long m23520y(String str, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ikck.ld6(C6451p.fn3e(str, format));
    }

    static /* synthetic */ String zurt(byte[] toHexString, ld6 format, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            format = ld6.f36700q.m23569k();
        }
        kotlin.jvm.internal.d2ok.m23075h(toHexString, "$this$toHexString");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return C6451p.oc(toHexString, format);
    }

    @kotlin.ki
    @InterfaceC6234g
    @yz(version = "1.9")
    @InterfaceC6232i
    private static final byte[] zy(String str, ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return bo.m22412g(C6451p.qrj(str, format));
    }
}
