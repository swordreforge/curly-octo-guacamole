package okio.internal;

import cyoe.cdj;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.C7541c;
import okio.C7575s;
import okio.kja0;
import okio.uv6;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
@InterfaceC6769y(name = "-SegmentedByteString")
public final class f7l8 {
    public static final boolean f7l8(@InterfaceC7396q uv6 uv6Var, int i2, @InterfaceC7396q kja0 other, int i3, int i4) {
        d2ok.m23075h(uv6Var, "<this>");
        d2ok.m23075h(other, "other");
        if (i2 < 0 || i2 > uv6Var.size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iN7h = n7h(uv6Var, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1];
            int i7 = uv6Var.getDirectory$okio()[iN7h] - i6;
            int i8 = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!other.rangeEquals(i3, uv6Var.getSegments$okio()[iN7h], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final byte m27655g(@InterfaceC7396q uv6 uv6Var, int i2) {
        d2ok.m23075h(uv6Var, "<this>");
        C7575s.m27855n(uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length - 1], i2, 1L);
        int iN7h = n7h(uv6Var, i2);
        return uv6Var.getSegments$okio()[iN7h][(i2 - (iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1])) + uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h]];
    }

    /* JADX INFO: renamed from: k */
    public static final int m27656k(@InterfaceC7396q int[] iArr, int i2, int i3, int i4) {
        d2ok.m23075h(iArr, "<this>");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final void ld6(@InterfaceC7396q uv6 uv6Var, @InterfaceC7396q okio.x2 buffer, int i2, int i3) {
        d2ok.m23075h(uv6Var, "<this>");
        d2ok.m23075h(buffer, "buffer");
        int i4 = i2 + i3;
        int iN7h = n7h(uv6Var, i2);
        while (i2 < i4) {
            int i5 = iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1];
            int i6 = uv6Var.getDirectory$okio()[iN7h] - i5;
            int i7 = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            C7541c c7541c = new C7541c(uv6Var.getSegments$okio()[iN7h], i8, i8 + iMin, true, false);
            C7541c c7541c2 = buffer.f43846k;
            if (c7541c2 == null) {
                c7541c.f94262f7l8 = c7541c;
                c7541c.f43686g = c7541c;
                buffer.f43846k = c7541c;
            } else {
                d2ok.qrj(c7541c2);
                C7541c c7541c3 = c7541c2.f94262f7l8;
                d2ok.qrj(c7541c3);
                c7541c3.zy(c7541c);
            }
            i2 += iMin;
            iN7h++;
        }
        buffer.vy(buffer.size() + ((long) i3));
    }

    /* JADX INFO: renamed from: n */
    public static final int m27657n(@InterfaceC7396q uv6 uv6Var) {
        d2ok.m23075h(uv6Var, "<this>");
        int hashCode$okio = uv6Var.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = uv6Var.getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = uv6Var.getDirectory$okio()[length + i2];
            int i6 = uv6Var.getDirectory$okio()[i2];
            byte[] bArr = uv6Var.getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        uv6Var.setHashCode$okio(i3);
        return i3;
    }

    public static final int n7h(@InterfaceC7396q uv6 uv6Var, int i2) {
        d2ok.m23075h(uv6Var, "<this>");
        int iM27656k = m27656k(uv6Var.getDirectory$okio(), i2 + 1, 0, uv6Var.getSegments$okio().length);
        return iM27656k >= 0 ? iM27656k : ~iM27656k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final byte[] m27658p(@InterfaceC7396q uv6 uv6Var) {
        d2ok.m23075h(uv6Var, "<this>");
        byte[] bArr = new byte[uv6Var.size()];
        int length = uv6Var.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = uv6Var.getDirectory$okio()[length + i2];
            int i6 = uv6Var.getDirectory$okio()[i2];
            int i7 = i6 - i3;
            kotlin.collections.kja0.y2(uv6Var.getSegments$okio()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: q */
    public static final int m27659q(@InterfaceC7396q uv6 uv6Var) {
        d2ok.m23075h(uv6Var, "<this>");
        return uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length - 1];
    }

    public static final void qrj(@InterfaceC7396q uv6 uv6Var, @InterfaceC7396q cdj<? super byte[], ? super Integer, ? super Integer, was> action) {
        d2ok.m23075h(uv6Var, "<this>");
        d2ok.m23075h(action, "action");
        int length = uv6Var.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = uv6Var.getDirectory$okio()[length + i2];
            int i5 = uv6Var.getDirectory$okio()[i2];
            action.invoke(uv6Var.getSegments$okio()[i2], Integer.valueOf(i4), Integer.valueOf(i5 - i3));
            i2++;
            i3 = i5;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final kja0 m27660s(@InterfaceC7396q uv6 uv6Var, int i2, int i3) {
        d2ok.m23075h(uv6Var, "<this>");
        int iX2 = C7575s.x2(uv6Var, i3);
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        }
        if (!(iX2 <= uv6Var.size())) {
            throw new IllegalArgumentException(("endIndex=" + iX2 + " > length(" + uv6Var.size() + ')').toString());
        }
        int i4 = iX2 - i2;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iX2 + " < beginIndex=" + i2).toString());
        }
        if (i2 == 0 && iX2 == uv6Var.size()) {
            return uv6Var;
        }
        if (i2 == iX2) {
            return kja0.EMPTY;
        }
        int iN7h = n7h(uv6Var, i2);
        int iN7h2 = n7h(uv6Var, iX2 - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.kja0.bek6(uv6Var.getSegments$okio(), iN7h, iN7h2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iN7h <= iN7h2) {
            int i5 = 0;
            int i6 = iN7h;
            while (true) {
                iArr[i5] = Math.min(uv6Var.getDirectory$okio()[i6] - i2, i4);
                int i7 = i5 + 1;
                iArr[i5 + bArr.length] = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + i6];
                if (i6 == iN7h2) {
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        int i8 = iN7h != 0 ? uv6Var.getDirectory$okio()[iN7h - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i2 - i8);
        return new uv6(bArr, iArr);
    }

    public static final void toq(@InterfaceC7396q uv6 uv6Var, int i2, @InterfaceC7396q byte[] target, int i3, int i4) {
        d2ok.m23075h(uv6Var, "<this>");
        d2ok.m23075h(target, "target");
        long j2 = i4;
        C7575s.m27855n(uv6Var.size(), i2, j2);
        C7575s.m27855n(target.length, i3, j2);
        int i5 = i4 + i2;
        int iN7h = n7h(uv6Var, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1];
            int i7 = uv6Var.getDirectory$okio()[iN7h] - i6;
            int i8 = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            int i9 = i8 + (i2 - i6);
            kotlin.collections.kja0.y2(uv6Var.getSegments$okio()[iN7h], target, i3, i9, i9 + iMin);
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
    }

    private static final void x2(uv6 uv6Var, int i2, int i3, cdj<? super byte[], ? super Integer, ? super Integer, was> cdjVar) {
        int iN7h = n7h(uv6Var, i2);
        while (i2 < i3) {
            int i4 = iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1];
            int i5 = uv6Var.getDirectory$okio()[iN7h] - i4;
            int i6 = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h];
            int iMin = Math.min(i3, i5 + i4) - i2;
            cdjVar.invoke(uv6Var.getSegments$okio()[iN7h], Integer.valueOf(i6 + (i2 - i4)), Integer.valueOf(iMin));
            i2 += iMin;
            iN7h++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m27661y(@InterfaceC7396q uv6 uv6Var, int i2, @InterfaceC7396q byte[] other, int i3, int i4) {
        d2ok.m23075h(uv6Var, "<this>");
        d2ok.m23075h(other, "other");
        if (i2 < 0 || i2 > uv6Var.size() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iN7h = n7h(uv6Var, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : uv6Var.getDirectory$okio()[iN7h - 1];
            int i7 = uv6Var.getDirectory$okio()[iN7h] - i6;
            int i8 = uv6Var.getDirectory$okio()[uv6Var.getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!C7575s.m27857q(uv6Var.getSegments$okio()[iN7h], i8 + (i2 - i6), other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
        return true;
    }

    public static final boolean zy(@InterfaceC7396q uv6 uv6Var, @InterfaceC7395n Object obj) {
        d2ok.m23075h(uv6Var, "<this>");
        if (obj == uv6Var) {
            return true;
        }
        if (obj instanceof kja0) {
            kja0 kja0Var = (kja0) obj;
            if (kja0Var.size() == uv6Var.size() && uv6Var.rangeEquals(0, kja0Var, 0, uv6Var.size())) {
                return true;
            }
        }
        return false;
    }
}
