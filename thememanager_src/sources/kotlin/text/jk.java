package kotlin.text;

import com.google.android.exoplayer2.C3548p;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class jk extends mcp {
    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Short bwp(@InterfaceC7396q String str, int i2) {
        int iIntValue;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        Integer numW831 = w831(str, i2);
        if (numW831 == null || (iIntValue = numW831.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static Integer cfr(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return w831(str, 10);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Byte etdu(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return sok(str, 10);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Short kcsr(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return bwp(str, 10);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Byte sok(@InterfaceC7396q String str, int i2) {
        int iIntValue;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        Integer numW831 = w831(str, i2);
        if (numW831 == null || (iIntValue = numW831.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @InterfaceC7396q
    public static final Void v0af(@InterfaceC7396q String input) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Integer w831(@InterfaceC7396q String str, int i2) {
        boolean z2;
        int i3;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6452q.m23604k(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        int i6 = 1;
        if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 48) >= 0) {
            z2 = false;
            i6 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int qVar = C6452q.toq(str.charAt(i6), i2);
            if (qVar < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i5 / i2))) || (i3 = i4 * i2) < i5 + qVar) {
                return null;
            }
            i4 = i3 - qVar;
            i6++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Long yqrt(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6452q.m23604k(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int iM23076i = kotlin.jvm.internal.d2ok.m23076i(cCharAt, 48);
        long j2 = C3548p.f65257toq;
        boolean z2 = true;
        if (iM23076i >= 0) {
            z2 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j2 = Long.MIN_VALUE;
                i3 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
                i3 = 1;
            }
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i3 < length) {
            int qVar = C6452q.toq(str.charAt(i3), i2);
            if (qVar < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 == j3) {
                    j5 = j2 / ((long) i2);
                    if (j4 < j5) {
                    }
                }
                return null;
            }
            long j6 = j4 * ((long) i2);
            long j7 = qVar;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i3++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static Long z4(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return yqrt(str, 10);
    }
}
