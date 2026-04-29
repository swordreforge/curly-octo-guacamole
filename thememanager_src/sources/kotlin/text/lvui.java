package kotlin.text;

import kotlin.C6475u;
import kotlin.C6480z;
import kotlin.InterfaceC6232i;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.py;
import kotlin.qo;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "UStringsKt")
public final class lvui {
    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final short cdj(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        qo qoVarT8r = t8r(str);
        if (qoVarT8r != null) {
            return qoVarT8r.bf2();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final C6475u f7l8(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return m23578y(str, 10);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    public static final byte m23570g(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6475u c6475uM23578y = m23578y(str, i2);
        if (c6475uM23578y != null) {
            return c6475uM23578y.bf2();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    /* JADX INFO: renamed from: h */
    public static final ikck m23571h(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6452q.m23604k(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j2 = -1;
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i3 = 1;
        }
        long jLd6 = ikck.ld6(i2);
        long j3 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i3 < length) {
            int qVar = C6452q.toq(str.charAt(i3), i2);
            if (qVar < 0) {
                return null;
            }
            if (Long.compareUnsigned(j3, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(j2, jLd6);
                    if (Long.compareUnsigned(j3, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jLd62 = ikck.ld6(j3 * jLd6);
            long jLd63 = ikck.ld6(ikck.ld6(((long) gyi.ld6(qVar)) & 4294967295L) + jLd62);
            if (Long.compareUnsigned(jLd63, jLd62) < 0) {
                return null;
            }
            i3++;
            j3 = jLd63;
            j2 = -1;
        }
        return ikck.zy(j3);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    /* JADX INFO: renamed from: i */
    public static final qo m23572i(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        gyi gyiVarX2 = x2(str, i2);
        if (gyiVarX2 == null) {
            return null;
        }
        int iA98o = gyiVarX2.a98o();
        if (Integer.compareUnsigned(iA98o, gyi.ld6(65535)) > 0) {
            return null;
        }
        return qo.zy(qo.ld6((short) iA98o));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    public static final String m23573k(long j2, int i2) {
        return py.x2(j2, C6452q.m23604k(i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final short ki(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        qo qoVarM23572i = m23572i(str, i2);
        if (qoVarM23572i != null) {
            return qoVarM23572i.bf2();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final ikck kja0(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return m23571h(str, 10);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final gyi ld6(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return x2(str, 10);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: n */
    public static final byte m23574n(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6475u c6475uF7l8 = f7l8(str);
        if (c6475uF7l8 != null) {
            return c6475uF7l8.bf2();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long n7h(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        ikck ikckVarM23571h = m23571h(str, i2);
        if (ikckVarM23571h != null) {
            return ikckVarM23571h.a98o();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    public static final int m23575p(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        gyi gyiVarX2 = x2(str, i2);
        if (gyiVarX2 != null) {
            return gyiVarX2.a98o();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: q */
    public static final String m23576q(short s2, int i2) {
        String string = Integer.toString(s2 & qo.f36486g, C6452q.m23604k(i2));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long qrj(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        ikck ikckVarKja0 = kja0(str);
        if (ikckVarKja0 != null) {
            return ikckVarKja0.a98o();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: s */
    public static final int m23577s(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        gyi gyiVarLd6 = ld6(str);
        if (gyiVarLd6 != null) {
            return gyiVarLd6.a98o();
        }
        jk.v0af(str);
        throw new C6480z();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final qo t8r(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return m23572i(str, 10);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final String toq(byte b2, int i2) {
        String string = Integer.toString(b2 & 255, C6452q.m23604k(i2));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final gyi x2(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6452q.m23604k(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = 1;
        if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 48) >= 0) {
            i4 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iLd6 = gyi.ld6(i2);
        int iDivideUnsigned = 119304647;
        while (i4 < length) {
            int qVar = C6452q.toq(str.charAt(i4), i2);
            if (qVar < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iLd6);
                    if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iLd62 = gyi.ld6(i3 * iLd6);
            int iLd63 = gyi.ld6(gyi.ld6(qVar) + iLd62);
            if (Integer.compareUnsigned(iLd63, iLd62) < 0) {
                return null;
            }
            i4++;
            i3 = iLd63;
        }
        return gyi.zy(i3);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    /* JADX INFO: renamed from: y */
    public static final C6475u m23578y(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        gyi gyiVarX2 = x2(str, i2);
        if (gyiVarX2 == null) {
            return null;
        }
        int iA98o = gyiVarX2.a98o();
        if (Integer.compareUnsigned(iA98o, gyi.ld6(255)) > 0) {
            return null;
        }
        return C6475u.zy(C6475u.ld6((byte) iA98o));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final String zy(int i2, int i3) {
        String string = Long.toString(((long) i2) & 4294967295L, C6452q.m23604k(i3));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }
}
