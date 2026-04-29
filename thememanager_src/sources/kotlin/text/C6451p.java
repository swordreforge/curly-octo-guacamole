package kotlin.text;

import java.util.Arrays;
import kotlin.ikck;
import kotlin.jvm.internal.lv5;
import kotlin.text.ld6;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.p */
/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,594:1\n1#2:595\n1183#3,3:596\n1183#3,3:599\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n16#1:596,3\n17#1:599,3\n*E\n"})
public final class C6451p {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f36716k = "0123456789abcdef";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f81937toq = "0123456789ABCDEF";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final int[] f81938zy;

    static {
        int[] iArr = new int[128];
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            iArr[i3] = -1;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < f36716k.length()) {
            iArr[f36716k.charAt(i4)] = i5;
            i4++;
            i5++;
        }
        int i6 = 0;
        while (i2 < f81937toq.length()) {
            iArr[f81937toq.charAt(i2)] = i6;
            i2++;
            i6++;
        }
        f81938zy = iArr;
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final String a9(byte b2, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ncyb(b2, format, 8);
    }

    @kotlin.ki
    @yz(version = "1.9")
    public static final int cdj(@InterfaceC7396q String str, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return m23589h(str, 0, str.length(), format);
    }

    public static /* synthetic */ String d2ok(int i2, ld6 ld6Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return fti(i2, ld6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC] */
    @mub.InterfaceC7396q
    @kotlin.ki
    @kotlin.yz(version = "1.9")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d3(@mub.InterfaceC7396q byte[] r17, int r18, int r19, @mub.InterfaceC7396q kotlin.text.ld6 r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            kotlin.jvm.internal.d2ok.m23075h(r4, r3)
            kotlin.collections.zy$k r3 = kotlin.collections.zy.Companion
            int r5 = r0.length
            r3.m22681k(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.m23542n()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.ld6$toq r4 = r20.zy()
            int r12 = r4.f7l8()
            int r13 = r4.m23557g()
            java.lang.String r14 = r4.zy()
            java.lang.String r15 = r4.m23558n()
            java.lang.String r11 = r4.m23559q()
            java.lang.String r4 = r4.m23560y()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = m23588g(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r7 = r0[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r11 = r7 >> 4
            char r11 = r3.charAt(r11)
            r6.append(r11)
            r7 = r7 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            r7 = 1
            int r9 = r9 + r7
            int r8 = r8 + 1
            goto L68
        La2:
            r7 = 1
            int r0 = r6.length()
            if (r5 != r0) goto Laa
            goto Lab
        Laa:
            r7 = 0
        Lab:
            if (r7 == 0) goto Lb7
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.d2ok.kja0(r0, r1)
            return r0
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C6451p.d3(byte[], int, int, kotlin.text.ld6):java.lang.String");
    }

    public static /* synthetic */ String dd(byte[] bArr, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return d3(bArr, i2, i3, ld6Var);
    }

    public static /* synthetic */ String eqxt(byte b2, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return a9(b2, ld6Var);
    }

    private static /* synthetic */ void f7l8() {
    }

    @kotlin.ki
    @yz(version = "1.9")
    public static final long fn3e(@InterfaceC7396q String str, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return m23590i(str, 0, str.length(), format);
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final String fti(int i2, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ncyb(i2, format, 32);
    }

    @kotlin.ki
    private static final long fu4(String str, int i2, int i3, ld6 ld6Var, int i4) {
        kotlin.collections.zy.Companion.m22681k(i2, i3, str.length());
        String strZy = ld6Var.m23543q().zy();
        String strM23549n = ld6Var.m23543q().m23549n();
        if (strZy.length() + strM23549n.length() < i3 - i2) {
            int qVar = toq(str, strZy, i2, i3, "prefix");
            int length = i3 - strM23549n.length();
            toq(str, strM23549n, length, i3, "suffix");
            zy(str, qVar, length, i4, false);
            long jM23593n = 0;
            while (qVar < length) {
                jM23593n = (jM23593n << 4) | ((long) m23593n(str, qVar));
                qVar++;
            }
            return jM23593n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a hexadecimal number with prefix \"");
        sb.append(strZy);
        sb.append("\" and suffix \"");
        sb.append(strM23549n);
        sb.append("\", but was ");
        kotlin.jvm.internal.d2ok.n7h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public static final int m23588g(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i9 = i2 - 1;
        int i10 = i9 / i3;
        int i11 = (i3 - 1) / i4;
        int i12 = i2 % i3;
        if (i12 != 0) {
            i3 = i12;
        }
        int i13 = (i11 * i10) + ((i3 - 1) / i4);
        long j2 = ((long) i10) + (((long) i13) * ((long) i5)) + (((long) ((i9 - i10) - i13)) * ((long) i6)) + (((long) i2) * (((long) i7) + 2 + ((long) i8)));
        if (kotlin.ranges.fn3e.d8wk(new kotlin.ranges.x2(0, Integer.MAX_VALUE), j2)) {
            return (int) j2;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ikck.yz(ikck.ld6(j2))));
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final String gvn7(short s2, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ncyb(s2, format, 16);
    }

    @kotlin.ki
    /* JADX INFO: renamed from: h */
    private static final int m23589h(String str, int i2, int i3, ld6 ld6Var) {
        return (int) fu4(str, i2, i3, ld6Var, 8);
    }

    @kotlin.ki
    /* JADX INFO: renamed from: i */
    private static final long m23590i(String str, int i2, int i3, ld6 ld6Var) {
        return fu4(str, i2, i3, ld6Var, 16);
    }

    public static final int jk(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jM23591k;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = ((long) i7) + 2 + ((long) i8);
        long jM23591k2 = m23591k(j2, i4, i6);
        if (i3 <= i4) {
            jM23591k = m23591k(j2, i3, i6);
        } else {
            jM23591k = m23591k(jM23591k2, i3 / i4, i5);
            int i9 = i3 % i4;
            if (i9 != 0) {
                jM23591k = jM23591k + ((long) i5) + m23591k(j2, i9, i6);
            }
        }
        long j3 = i2;
        long jM23592l = m23592l(j3, jM23591k, 1);
        long j4 = j3 - ((jM23591k + 1) * jM23592l);
        long jM23592l2 = m23592l(j4, jM23591k2, i5);
        long j5 = j4 - ((jM23591k2 + ((long) i5)) * jM23592l2);
        long jM23592l3 = m23592l(j5, j2, i6);
        return (int) (((long) (j5 - ((j2 + ((long) i6)) * jM23592l3) > 0 ? 1 : 0)) + (jM23592l * ((long) i3)) + (jM23592l2 * ((long) i4)) + jM23592l3);
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final String jp0y(long j2, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return ncyb(j2, format, 64);
    }

    /* JADX INFO: renamed from: k */
    private static final long m23591k(long j2, int i2, int i3) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j3 = i2;
        return (j2 * j3) + (((long) i3) * (j3 - 1));
    }

    static /* synthetic */ int ki(String str, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return m23589h(str, i2, i3, ld6Var);
    }

    public static /* synthetic */ byte[] kja0(String str, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return qrj(str, ld6Var);
    }

    /* JADX INFO: renamed from: l */
    private static final long m23592l(long j2, long j3, int i2) {
        if (j2 <= 0 || j3 <= 0) {
            return 0L;
        }
        long j4 = i2;
        return (j2 + j4) / (j3 + j4);
    }

    public static /* synthetic */ byte ld6(String str, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return m23597s(str, ld6Var);
    }

    public static /* synthetic */ String lvui(long j2, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return jp0y(j2, ld6Var);
    }

    public static /* synthetic */ short mcp(String str, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return wvg(str, ld6Var);
    }

    /* JADX INFO: renamed from: n */
    private static final int m23593n(String str, int i2) {
        int i3;
        char cCharAt = str.charAt(i2);
        if (cCharAt <= 127 && (i3 = f81938zy[cCharAt]) >= 0) {
            return i3;
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i2 + ", but was " + str.charAt(i2));
    }

    static /* synthetic */ byte[] n7h(String str, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return x2(str, i2, i3, ld6Var);
    }

    @kotlin.ki
    private static final String ncyb(long j2, ld6 ld6Var, int i2) {
        if (!((i2 & 3) == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String str = ld6Var.m23542n() ? f81937toq : f36716k;
        String strZy = ld6Var.m23543q().zy();
        String strM23549n = ld6Var.m23543q().m23549n();
        int length = strZy.length() + (i2 >> 2) + strM23549n.length();
        boolean zM23550q = ld6Var.m23543q().m23550q();
        StringBuilder sb = new StringBuilder(length);
        sb.append(strZy);
        while (i2 > 0) {
            i2 -= 4;
            int i3 = (int) ((j2 >> i2) & 15);
            zM23550q = zM23550q && i3 == 0 && i2 > 0;
            if (!zM23550q) {
                sb.append(str.charAt(i3));
            }
        }
        sb.append(strM23549n);
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static /* synthetic */ long ni7(String str, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return fn3e(str, ld6Var);
    }

    @kotlin.ki
    private static final short o1t(String str, int i2, int i3, ld6 ld6Var) {
        return (short) fu4(str, i2, i3, ld6Var, 4);
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final String oc(@InterfaceC7396q byte[] bArr, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return d3(bArr, 0, bArr.length, format);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ byte m23594p(String str, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return m23599y(str, i2, i3, ld6Var);
    }

    /* JADX INFO: renamed from: q */
    private static final int m23595q(String str, int i2, int i3) {
        if (str.charAt(i2) == '\r') {
            int i4 = i2 + 1;
            return (i4 >= i3 || str.charAt(i4) != '\n') ? i4 : i2 + 2;
        }
        if (str.charAt(i2) == '\n') {
            return i2 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i2 + ", but was " + str.charAt(i2));
    }

    @InterfaceC7396q
    @kotlin.ki
    @yz(version = "1.9")
    public static final byte[] qrj(@InterfaceC7396q String str, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return x2(str, 0, str.length(), format);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m23596r(short s2, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return gvn7(s2, ld6Var);
    }

    @kotlin.ki
    @yz(version = "1.9")
    /* JADX INFO: renamed from: s */
    public static final byte m23597s(@InterfaceC7396q String str, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return m23599y(str, 0, str.length(), format);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ short m23598t(String str, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return o1t(str, i2, i3, ld6Var);
    }

    public static /* synthetic */ int t8r(String str, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return cdj(str, ld6Var);
    }

    private static final int toq(String str, String str2, int i2, int i3, String str3) {
        int length = str2.length() + i2;
        if (length <= i3 && a9.m23503w(str, i2, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i2);
        sb.append(", but was ");
        int iM23305t = kotlin.ranges.fn3e.m23305t(length, i3);
        kotlin.jvm.internal.d2ok.n7h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, iM23305t);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    @kotlin.ki
    @yz(version = "1.9")
    public static final short wvg(@InterfaceC7396q String str, @InterfaceC7396q ld6 format) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        return o1t(str, 0, str.length(), format);
    }

    @kotlin.ki
    private static final byte[] x2(String str, int i2, int i3, ld6 ld6Var) {
        int qVar = i2;
        kotlin.collections.zy.Companion.m22681k(qVar, i3, str.length());
        if (qVar == i3) {
            return new byte[0];
        }
        ld6.toq toqVarZy = ld6Var.zy();
        int iF7l8 = toqVarZy.f7l8();
        int iM23557g = toqVarZy.m23557g();
        String strZy = toqVarZy.zy();
        String strM23558n = toqVarZy.m23558n();
        String strM23559q = toqVarZy.m23559q();
        String strM23560y = toqVarZy.m23560y();
        String str2 = strM23559q;
        int iJk = jk(i3 - qVar, iF7l8, iM23557g, strM23560y.length(), strM23559q.length(), strZy.length(), strM23558n.length());
        byte[] bArr = new byte[iJk];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (qVar < i3) {
            if (i5 == iF7l8) {
                qVar = m23595q(str, qVar, i3);
                i5 = 0;
            } else if (i6 == iM23557g) {
                qVar = toq(str, strM23560y, qVar, i3, "group separator");
            } else {
                if (i6 != 0) {
                    qVar = toq(str, str2, qVar, i3, "byte separator");
                }
                i5++;
                i6++;
                int qVar2 = toq(str, strZy, qVar, i3, "byte prefix");
                zy(str, qVar2, kotlin.ranges.fn3e.m23305t(qVar2 + 2, i3), 2, true);
                int i7 = qVar2 + 1;
                bArr[i4] = (byte) ((m23593n(str, qVar2) << 4) | m23593n(str, i7));
                qVar = toq(str, strM23558n, i7 + 1, i3, "byte suffix");
                i4++;
                str2 = str2;
            }
            i6 = 0;
            i5++;
            i6++;
            int qVar22 = toq(str, strZy, qVar, i3, "byte prefix");
            zy(str, qVar22, kotlin.ranges.fn3e.m23305t(qVar22 + 2, i3), 2, true);
            int i72 = qVar22 + 1;
            bArr[i4] = (byte) ((m23593n(str, qVar22) << 4) | m23593n(str, i72));
            qVar = toq(str, strM23558n, i72 + 1, i3, "byte suffix");
            i4++;
            str2 = str2;
        }
        if (i4 == iJk) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static /* synthetic */ String x9kr(byte[] bArr, ld6 ld6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return oc(bArr, ld6Var);
    }

    @kotlin.ki
    /* JADX INFO: renamed from: y */
    private static final byte m23599y(String str, int i2, int i3, ld6 ld6Var) {
        return (byte) fu4(str, i2, i3, ld6Var, 2);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ long m23600z(String str, int i2, int i3, ld6 ld6Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        return fu4(str, i2, i3, ld6Var, i4);
    }

    static /* synthetic */ long zurt(String str, int i2, int i3, ld6 ld6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            ld6Var = ld6.f36700q.m23569k();
        }
        return m23590i(str, i2, i3, ld6Var);
    }

    private static final void zy(String str, int i2, int i3, int i4, boolean z2) {
        int i5 = i3 - i2;
        boolean z3 = true;
        if (!z2 ? i5 > i4 : i5 != i4) {
            z3 = false;
        }
        if (z3) {
            return;
        }
        String str2 = z2 ? "exactly" : "at most";
        kotlin.jvm.internal.d2ok.n7h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i4 + " hexadecimal digits at index " + i2 + ", but was " + strSubstring + " of length " + i5);
    }
}
