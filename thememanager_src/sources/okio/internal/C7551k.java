package okio.internal;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.ts.wvg;
import com.google.android.exoplayer2.i9jn;
import cyoe.InterfaceC5979h;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.eqxt;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.connection.C7448g;
import okio.C7541c;
import okio.C7571o;
import okio.C7575s;
import okio.dd;
import okio.ek5k;
import okio.kja0;
import okio.lrht;
import okio.nn86;
import okio.uv6;
import okio.vyq;
import okio.x2;

/* JADX INFO: renamed from: okio.internal.k */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
@InterfaceC6769y(name = "-Buffer")
public final class C7551k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final byte[] f43742k = ek5k.m27605k("0123456789abcdef");

    /* JADX INFO: renamed from: q */
    public static final long f43743q = -7;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f94273toq = 4096;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final long f94274zy = -922337203685477580L;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m27673a(okio.x2 x2Var, dd ddVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return a98o(x2Var, ddVar, z2);
    }

    public static final short a9(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() < 2) {
            throw new EOFException();
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 2) {
            return (short) ((x2Var.readByte() & 255) | ((x2Var.readByte() & 255) << 8));
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        x2Var.vy(x2Var.size() - 2);
        if (i5 == i3) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i5;
        }
        return (short) i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a98o(@mub.InterfaceC7396q okio.x2 r17, @mub.InterfaceC7396q okio.dd r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.d2ok.m23075h(r2, r1)
            okio.c r0 = r0.f43846k
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L19
            if (r19 == 0) goto L17
            goto L18
        L17:
            r1 = r3
        L18:
            return r1
        L19:
            byte[] r4 = r0.f43687k
            int r5 = r0.f94263toq
            int r6 = r0.f94264zy
            int[] r2 = r18.m27600g()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L27:
            int r11 = r8 + 1
            r8 = r2[r8]
            int r12 = r11 + 1
            r11 = r2[r11]
            if (r11 == r3) goto L32
            r10 = r11
        L32:
            if (r9 != 0) goto L35
            goto L65
        L35:
            r11 = 0
            if (r8 >= 0) goto L82
            int r8 = r8 * (-1)
            int r13 = r12 + r8
        L3c:
            int r8 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r12 = r2[r12]
            if (r5 == r12) goto L49
            return r10
        L49:
            if (r14 != r13) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = r7
        L4e:
            if (r8 != r6) goto L6f
            kotlin.jvm.internal.d2ok.qrj(r9)
            okio.c r4 = r9.f43686g
            kotlin.jvm.internal.d2ok.qrj(r4)
            int r6 = r4.f94263toq
            byte[] r8 = r4.f43687k
            int r9 = r4.f94264zy
            if (r4 != r0) goto L69
            if (r5 == 0) goto L65
            r4 = r8
            r8 = r11
            goto L75
        L65:
            if (r19 == 0) goto L68
            return r1
        L68:
            return r10
        L69:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L75
        L6f:
            r16 = r9
            r9 = r6
            r6 = r8
            r8 = r16
        L75:
            if (r5 == 0) goto L7d
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La7
        L7d:
            r5 = r6
            r6 = r9
            r12 = r14
            r9 = r8
            goto L3c
        L82:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + r8
        L8a:
            if (r12 != r14) goto L8d
            return r10
        L8d:
            r15 = r2[r12]
            if (r5 != r15) goto Lae
            int r12 = r12 + r8
            r5 = r2[r12]
            if (r13 != r6) goto La7
            okio.c r9 = r9.f43686g
            kotlin.jvm.internal.d2ok.qrj(r9)
            int r4 = r9.f94263toq
            byte[] r6 = r9.f43687k
            int r8 = r9.f94264zy
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La7
            r9 = r11
        La7:
            if (r5 < 0) goto Laa
            return r5
        Laa:
            int r8 = -r5
            r5 = r13
            goto L27
        Lae:
            int r12 = r12 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C7551k.a98o(okio.x2, okio.dd, boolean):int");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m27674b(@InterfaceC7396q C7541c segment, int i2, @InterfaceC7396q byte[] bytes, int i3, int i4) {
        d2ok.m23075h(segment, "segment");
        d2ok.m23075h(bytes, "bytes");
        int i5 = segment.f94264zy;
        byte[] bArr = segment.f43687k;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.f43686g;
                d2ok.qrj(segment);
                byte[] bArr2 = segment.f43687k;
                bArr = bArr2;
                i2 = segment.f94263toq;
                i5 = segment.f94264zy;
            }
            if (bArr[i2] != bytes[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @InterfaceC7396q
    public static final String bf2(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (x2Var.g1(j3) == 13) {
                String strMo27610d = x2Var.mo27610d(j3);
                x2Var.skip(2L);
                return strMo27610d;
            }
        }
        String strMo27610d2 = x2Var.mo27610d(j2);
        x2Var.skip(1L);
        return strMo27610d2;
    }

    /* JADX INFO: renamed from: c */
    public static final void m27675c(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q okio.x2 source, long j2) {
        C7541c c7541c;
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(source, "source");
        if (!(source != x2Var)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C7575s.m27855n(source.size(), 0L, j2);
        while (j2 > 0) {
            C7541c c7541c2 = source.f43846k;
            d2ok.qrj(c7541c2);
            int i2 = c7541c2.f94264zy;
            d2ok.qrj(source.f43846k);
            if (j2 < i2 - r2.f94263toq) {
                C7541c c7541c3 = x2Var.f43846k;
                if (c7541c3 != null) {
                    d2ok.qrj(c7541c3);
                    c7541c = c7541c3.f94262f7l8;
                } else {
                    c7541c = null;
                }
                if (c7541c != null && c7541c.f43688n) {
                    if ((((long) c7541c.f94264zy) + j2) - ((long) (c7541c.f43689q ? 0 : c7541c.f94263toq)) <= 8192) {
                        C7541c c7541c4 = source.f43846k;
                        d2ok.qrj(c7541c4);
                        c7541c4.f7l8(c7541c, (int) j2);
                        source.vy(source.size() - j2);
                        x2Var.vy(x2Var.size() + j2);
                        return;
                    }
                }
                C7541c c7541c5 = source.f43846k;
                d2ok.qrj(c7541c5);
                source.f43846k = c7541c5.m27583n((int) j2);
            }
            C7541c c7541c6 = source.f43846k;
            d2ok.qrj(c7541c6);
            long j3 = c7541c6.f94264zy - c7541c6.f94263toq;
            source.f43846k = c7541c6.toq();
            C7541c c7541c7 = x2Var.f43846k;
            if (c7541c7 == null) {
                x2Var.f43846k = c7541c6;
                c7541c6.f94262f7l8 = c7541c6;
                c7541c6.f43686g = c7541c6;
            } else {
                d2ok.qrj(c7541c7);
                C7541c c7541c8 = c7541c7.f94262f7l8;
                d2ok.qrj(c7541c8);
                c7541c8.zy(c7541c6).m27582k();
            }
            source.vy(source.size() - j3);
            x2Var.vy(x2Var.size() + j3);
            j2 -= j3;
        }
    }

    public static final long cdj(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q okio.x2 sink, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (x2Var.size() == 0) {
            return -1L;
        }
        if (j2 > x2Var.size()) {
            j2 = x2Var.size();
        }
        sink.mo26936j(x2Var, j2);
        return j2;
    }

    public static final int d2ok(@InterfaceC7396q x2.C7577k c7577k, long j2) {
        C7541c c7541cZy;
        d2ok.m23075h(c7577k, "<this>");
        okio.x2 x2Var = c7577k.f43849k;
        if (x2Var == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j2 < -1 || j2 > x2Var.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + x2Var.size());
        }
        if (j2 == -1 || j2 == x2Var.size()) {
            c7577k.ld6(null);
            c7577k.f43848g = j2;
            c7577k.f43854y = null;
            c7577k.f43853s = -1;
            c7577k.f43851p = -1;
            return -1;
        }
        long j3 = 0;
        long size = x2Var.size();
        C7541c c7541cZy2 = x2Var.f43846k;
        if (c7577k.zy() != null) {
            long j4 = c7577k.f43848g;
            int i2 = c7577k.f43853s;
            C7541c c7541cZy3 = c7577k.zy();
            d2ok.qrj(c7541cZy3);
            long j5 = j4 - ((long) (i2 - c7541cZy3.f94263toq));
            if (j5 > j2) {
                c7541cZy2 = c7577k.zy();
                size = j5;
                c7541cZy = c7541cZy2;
            } else {
                c7541cZy = c7577k.zy();
                j3 = j5;
            }
        } else {
            c7541cZy = c7541cZy2;
        }
        if (size - j2 > j2 - j3) {
            while (true) {
                d2ok.qrj(c7541cZy);
                int i3 = c7541cZy.f94264zy;
                int i4 = c7541cZy.f94263toq;
                if (j2 < ((long) (i3 - i4)) + j3) {
                    break;
                }
                j3 += (long) (i3 - i4);
                c7541cZy = c7541cZy.f43686g;
            }
        } else {
            while (size > j2) {
                d2ok.qrj(c7541cZy2);
                c7541cZy2 = c7541cZy2.f94262f7l8;
                d2ok.qrj(c7541cZy2);
                size -= (long) (c7541cZy2.f94264zy - c7541cZy2.f94263toq);
            }
            j3 = size;
            c7541cZy = c7541cZy2;
        }
        if (c7577k.f43852q) {
            d2ok.qrj(c7541cZy);
            if (c7541cZy.f43689q) {
                C7541c c7541cM27581g = c7541cZy.m27581g();
                if (x2Var.f43846k == c7541cZy) {
                    x2Var.f43846k = c7541cM27581g;
                }
                c7541cZy = c7541cZy.zy(c7541cM27581g);
                C7541c c7541c = c7541cZy.f94262f7l8;
                d2ok.qrj(c7541c);
                c7541c.toq();
            }
        }
        c7577k.ld6(c7541cZy);
        c7577k.f43848g = j2;
        d2ok.qrj(c7541cZy);
        c7577k.f43854y = c7541cZy.f43687k;
        int i5 = c7541cZy.f94263toq + ((int) (j2 - j3));
        c7577k.f43853s = i5;
        int i6 = c7541cZy.f94264zy;
        c7577k.f43851p = i6;
        return i6 - i5;
    }

    @InterfaceC7395n
    public static final String d3(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        long jIkck = x2Var.ikck((byte) 10);
        if (jIkck != -1) {
            return bf2(x2Var, jIkck);
        }
        if (x2Var.size() != 0) {
            return x2Var.mo27610d(x2Var.size());
        }
        return null;
    }

    @InterfaceC7396q
    public static final kja0 dd(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() <= 2147483647L) {
            return x2Var.o05((int) x2Var.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + x2Var.size()).toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: e */
    public static final okio.x2 m27676e(@InterfaceC7396q okio.x2 x2Var, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        if (j2 == 0) {
            return x2Var.writeByte(48);
        }
        boolean z2 = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return x2Var.lrht("-9223372036854775808");
            }
            z2 = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < i9jn.f64793n7h ? j2 < C7448g.f93869ni7 ? j2 < C3548p.f21101p ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        C7541c c7541cM58i = x2Var.m58i(i2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = yz()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        c7541cM58i.f94264zy += i2;
        x2Var.vy(x2Var.size() + ((long) i2));
        return x2Var;
    }

    @InterfaceC7396q
    public static final okio.x2 ek5k(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        if (i2 < 128) {
            x2Var.writeByte(i2);
        } else if (i2 < 2048) {
            C7541c c7541cM58i = x2Var.m58i(2);
            byte[] bArr = c7541cM58i.f43687k;
            int i3 = c7541cM58i.f94264zy;
            bArr[i3] = (byte) ((i2 >> 6) | wvg.f64653fu4);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            c7541cM58i.f94264zy = i3 + 2;
            x2Var.vy(x2Var.size() + 2);
        } else {
            boolean z2 = false;
            if (55296 <= i2 && i2 < 57344) {
                z2 = true;
            }
            if (z2) {
                x2Var.writeByte(63);
            } else if (i2 < 65536) {
                C7541c c7541cM58i2 = x2Var.m58i(3);
                byte[] bArr2 = c7541cM58i2.f43687k;
                int i4 = c7541cM58i2.f94264zy;
                bArr2[i4] = (byte) ((i2 >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
                c7541cM58i2.f94264zy = i4 + 3;
                x2Var.vy(x2Var.size() + 3);
            } else {
                if (i2 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + C7575s.zurt(i2));
                }
                C7541c c7541cM58i3 = x2Var.m58i(4);
                byte[] bArr3 = c7541cM58i3.f43687k;
                int i5 = c7541cM58i3.f94264zy;
                bArr3[i5] = (byte) ((i2 >> 18) | wvg.f64659wvg);
                bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
                c7541cM58i3.f94264zy = i5 + 4;
                x2Var.vy(x2Var.size() + 4);
            }
        }
        return x2Var;
    }

    public static final long eqxt(@InterfaceC7396q x2.C7577k c7577k, long j2) {
        d2ok.m23075h(c7577k, "<this>");
        okio.x2 x2Var = c7577k.f43849k;
        if (x2Var == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!c7577k.f43852q) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = x2Var.size();
        int i2 = 1;
        if (j2 <= size) {
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
            }
            long j3 = size - j2;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                C7541c c7541c = x2Var.f43846k;
                d2ok.qrj(c7541c);
                C7541c c7541c2 = c7541c.f94262f7l8;
                d2ok.qrj(c7541c2);
                int i3 = c7541c2.f94264zy;
                long j4 = i3 - c7541c2.f94263toq;
                if (j4 > j3) {
                    c7541c2.f94264zy = i3 - ((int) j3);
                    break;
                }
                x2Var.f43846k = c7541c2.toq();
                lrht.m27786q(c7541c2);
                j3 -= j4;
            }
            c7577k.ld6(null);
            c7577k.f43848g = j2;
            c7577k.f43854y = null;
            c7577k.f43853s = -1;
            c7577k.f43851p = -1;
        } else if (j2 > size) {
            long j5 = j2 - size;
            boolean z2 = true;
            while (j5 > 0) {
                C7541c c7541cM58i = x2Var.m58i(i2);
                int iMin = (int) Math.min(j5, 8192 - c7541cM58i.f94264zy);
                c7541cM58i.f94264zy += iMin;
                j5 -= (long) iMin;
                if (z2) {
                    c7577k.ld6(c7541cM58i);
                    c7577k.f43848g = size;
                    c7577k.f43854y = c7541cM58i.f43687k;
                    int i4 = c7541cM58i.f94264zy;
                    c7577k.f43853s = i4 - iMin;
                    c7577k.f43851p = i4;
                    z2 = false;
                }
                i2 = 1;
            }
        }
        x2Var.vy(j2);
        return size;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public static final okio.x2 m27677f(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(source, "source");
        long j2 = i3;
        C7575s.m27855n(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            C7541c c7541cM58i = x2Var.m58i(1);
            int iMin = Math.min(i4 - i2, 8192 - c7541cM58i.f94264zy);
            int i5 = i2 + iMin;
            kotlin.collections.kja0.y2(source, c7541cM58i.f43687k, c7541cM58i.f94264zy, i2, i5);
            c7541cM58i.f94264zy += iMin;
            i2 = i5;
        }
        x2Var.vy(x2Var.size() + j2);
        return x2Var;
    }

    public static final long f7l8(@InterfaceC7396q x2.C7577k c7577k, int i2) {
        d2ok.m23075h(c7577k, "<this>");
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i2).toString());
        }
        if (!(i2 <= 8192)) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i2).toString());
        }
        okio.x2 x2Var = c7577k.f43849k;
        if (x2Var == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!c7577k.f43852q) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = x2Var.size();
        C7541c c7541cM58i = x2Var.m58i(i2);
        int i3 = 8192 - c7541cM58i.f94264zy;
        c7541cM58i.f94264zy = 8192;
        long j2 = i3;
        x2Var.vy(size + j2);
        c7577k.ld6(c7541cM58i);
        c7577k.f43848g = size;
        c7577k.f43854y = c7541cM58i.f43687k;
        c7577k.f43853s = 8192 - i3;
        c7577k.f43851p = 8192;
        return j2;
    }

    @InterfaceC7396q
    public static final byte[] fn3e(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        return x2Var.lv5(x2Var.size());
    }

    @InterfaceC7396q
    public static final x2.C7577k fti(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q x2.C7577k unsafeCursor) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(unsafeCursor, "unsafeCursor");
        x2.C7577k c7577kN7h = C7575s.n7h(unsafeCursor);
        if (!(c7577kN7h.f43849k == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c7577kN7h.f43849k = x2Var;
        c7577kN7h.f43852q = false;
        return c7577kN7h;
    }

    @InterfaceC7396q
    public static final kja0 fu4(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (x2Var.size() < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new kja0(x2Var.lv5(j2));
        }
        kja0 kja0VarO05 = x2Var.o05((int) j2);
        x2Var.skip(j2);
        return kja0VarO05;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m27678g(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7395n Object obj) {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var == obj) {
            return true;
        }
        if (!(obj instanceof okio.x2)) {
            return false;
        }
        okio.x2 x2Var2 = (okio.x2) obj;
        if (x2Var.size() != x2Var2.size()) {
            return false;
        }
        if (x2Var.size() == 0) {
            return true;
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        C7541c c7541c2 = x2Var2.f43846k;
        d2ok.qrj(c7541c2);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c2.f94263toq;
        long j2 = 0;
        while (j2 < x2Var.size()) {
            long jMin = Math.min(c7541c.f94264zy - i2, c7541c2.f94264zy - i3);
            long j3 = 0;
            while (j3 < jMin) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (c7541c.f43687k[i2] != c7541c2.f43687k[i3]) {
                    return false;
                }
                j3++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == c7541c.f94264zy) {
                c7541c = c7541c.f43686g;
                d2ok.qrj(c7541c);
                i2 = c7541c.f94263toq;
            }
            if (i3 == c7541c2.f94264zy) {
                c7541c2 = c7541c2.f43686g;
                d2ok.qrj(c7541c2);
                i3 = c7541c2.f94263toq;
            }
            j2 += jMin;
        }
        return true;
    }

    public static final int gvn7(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        int i2;
        int i3;
        int i4;
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() == 0) {
            throw new EOFException();
        }
        byte bG1 = x2Var.g1(0L);
        boolean z2 = false;
        if ((bG1 & 128) == 0) {
            i2 = bG1 & 127;
            i4 = 0;
            i3 = 1;
        } else if ((bG1 & 224) == 192) {
            i2 = bG1 & com.google.common.base.zy.f68113d3;
            i3 = 2;
            i4 = 128;
        } else if ((bG1 & 240) == 224) {
            i2 = bG1 & com.google.common.base.zy.f68111cdj;
            i3 = 3;
            i4 = 2048;
        } else {
            if ((bG1 & 248) != 240) {
                x2Var.skip(1L);
                return C7571o.f94299zy;
            }
            i2 = bG1 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (x2Var.size() < j2) {
            throw new EOFException("size < " + i3 + ": " + x2Var.size() + " (to read code point prefixed 0x" + C7575s.fn3e(bG1) + ')');
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte bG12 = x2Var.g1(j3);
            if ((bG12 & 192) != 128) {
                x2Var.skip(j3);
                return C7571o.f94299zy;
            }
            i2 = (i2 << 6) | (bG12 & C7571o.f43818k);
        }
        x2Var.skip(j2);
        if (i2 > 1114111) {
            return C7571o.f94299zy;
        }
        if (55296 <= i2 && i2 < 57344) {
            z2 = true;
        }
        return (!z2 && i2 >= i4) ? i2 : C7571o.f94299zy;
    }

    /* JADX INFO: renamed from: h */
    public static final int m27679h(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q byte[] sink, int i2, int i3) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        C7575s.m27855n(sink.length, i2, i3);
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            return -1;
        }
        int iMin = Math.min(i3, c7541c.f94264zy - c7541c.f94263toq);
        byte[] bArr = c7541c.f43687k;
        int i4 = c7541c.f94263toq;
        kotlin.collections.kja0.y2(bArr, sink, i2, i4, i4 + iMin);
        c7541c.f94263toq += iMin;
        x2Var.vy(x2Var.size() - ((long) iMin));
        if (c7541c.f94263toq == c7541c.f94264zy) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return iMin;
    }

    @InterfaceC7396q
    public static final okio.x2 hb(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        C7541c c7541cM58i = x2Var.m58i(4);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        c7541cM58i.f94264zy = i6 + 1;
        x2Var.vy(x2Var.size() + 4);
        return x2Var;
    }

    @InterfaceC7396q
    public static final okio.x2 hyr(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q byte[] source) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(source, "source");
        return x2Var.write(source, 0, source.length);
    }

    /* JADX INFO: renamed from: i */
    public static final byte m27680i(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() == 0) {
            throw new EOFException();
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        int i4 = i2 + 1;
        byte b2 = c7541c.f43687k[i2];
        x2Var.vy(x2Var.size() - 1);
        if (i4 == i3) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i4;
        }
        return b2;
    }

    public static final <T> T i1(@InterfaceC7396q okio.x2 x2Var, long j2, @InterfaceC7396q InterfaceC5979h<? super C7541c, ? super Long, ? extends T> lambda) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(lambda, "lambda");
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            return lambda.invoke(null, -1L);
        }
        if (x2Var.size() - j2 < j2) {
            long size = x2Var.size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            return lambda.invoke(c7541c, Long.valueOf(size));
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + j3;
            if (j4 > j2) {
                return lambda.invoke(c7541c, Long.valueOf(j3));
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            j3 = j4;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: j */
    public static final okio.x2 m27681j(@InterfaceC7396q okio.x2 x2Var, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        C7541c c7541cM58i = x2Var.m58i(8);
        byte[] bArr = c7541cM58i.f43687k;
        int i2 = c7541cM58i.f94264zy;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        c7541cM58i.f94264zy = i9 + 1;
        x2Var.vy(x2Var.size() + 8);
        return x2Var;
    }

    public static final long jk(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() < 8) {
            throw new EOFException();
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 8) {
            return ((((long) x2Var.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) x2Var.readInt()));
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 48) | ((((long) bArr[i5]) & 255) << 40);
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        long j4 = j3 | ((((long) bArr[i6]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i8 + 1;
        long j5 = j4 | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i9 + 1;
        long j6 = j5 | ((((long) bArr[i9]) & 255) << 8);
        int i11 = i10 + 1;
        long j7 = j6 | (((long) bArr[i10]) & 255);
        x2Var.vy(x2Var.size() - 8);
        if (i11 == i3) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i11;
        }
        return j7;
    }

    @InterfaceC7396q
    public static final String jp0y(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (x2Var.size() < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        if (((long) i2) + j2 > c7541c.f94264zy) {
            return qrj.zy(x2Var.lv5(j2), 0, 0, 3, null);
        }
        int i3 = (int) j2;
        String qVar = qrj.toq(c7541c.f43687k, i2, i2 + i3);
        c7541c.f94263toq += i3;
        x2Var.vy(x2Var.size() - j2);
        if (c7541c.f94263toq == c7541c.f94264zy) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return qVar;
    }

    /* JADX INFO: renamed from: k */
    public static final void m27682k(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        x2Var.skip(x2Var.size());
    }

    public static final long ki(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q vyq sink) throws IOException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        long size = x2Var.size();
        if (size > 0) {
            sink.mo26936j(x2Var, size);
        }
        return size;
    }

    public static final int kja0(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q byte[] sink) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        return x2Var.read(sink, 0, sink.length);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: l */
    public static final okio.x2 m27683l(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q kja0 byteString, int i2, int i3) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(byteString, "byteString");
        byteString.write$okio(x2Var, i2, i3);
        return x2Var;
    }

    public static final long ld6(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q kja0 bytes, long j2) {
        long j3 = j2;
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            return -1L;
        }
        if (x2Var.size() - j3 < j3) {
            long size = x2Var.size();
            while (size > j3) {
                c7541c = c7541c.f94262f7l8;
                d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b2 = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (x2Var.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = c7541c.f43687k;
                int iMin = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + size3) - size);
                for (int i2 = (int) ((((long) c7541c.f94263toq) + j3) - size); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && m27674b(c7541c, i2 + 1, bArrInternalArray$okio, 1, size2)) {
                        return ((long) (i2 - c7541c.f94263toq)) + size;
                    }
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                d2ok.qrj(c7541c);
                j3 = size;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + j4;
            if (j5 > j3) {
                break;
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            j4 = j5;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b3 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (x2Var.size() - ((long) size4)) + 1;
        while (j4 < size5) {
            byte[] bArr2 = c7541c.f43687k;
            long j6 = j4;
            int iMin2 = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + size5) - j4);
            for (int i3 = (int) ((((long) c7541c.f94263toq) + j3) - j6); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && m27674b(c7541c, i3 + 1, bArrInternalArray$okio2, 1, size4)) {
                    return ((long) (i3 - c7541c.f94263toq)) + j6;
                }
            }
            j4 = j6 + ((long) (c7541c.f94264zy - c7541c.f94263toq));
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            j3 = j4;
        }
        return -1L;
    }

    public static /* synthetic */ okio.x2 lrht(okio.x2 x2Var, kja0 byteString, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = byteString.size();
        }
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(byteString, "byteString");
        byteString.write$okio(x2Var, i2, i3);
        return x2Var;
    }

    public static final int lvui(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q dd options) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(options, "options");
        int iM27673a = m27673a(x2Var, options, false, 2, null);
        if (iM27673a == -1) {
            return -1;
        }
        x2Var.skip(options.zy()[iM27673a].size());
        return iM27673a;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public static final okio.x2 m27684m(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q String string, int i2, int i3) {
        char cCharAt;
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(string, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 < 128) {
                C7541c c7541cM58i = x2Var.m58i(1);
                byte[] bArr = c7541cM58i.f43687k;
                int i4 = c7541cM58i.f94264zy - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = c7541cM58i.f94264zy;
                int i7 = (i4 + i2) - i6;
                c7541cM58i.f94264zy = i6 + i7;
                x2Var.vy(x2Var.size() + ((long) i7));
            } else {
                if (cCharAt2 < 2048) {
                    C7541c c7541cM58i2 = x2Var.m58i(2);
                    byte[] bArr2 = c7541cM58i2.f43687k;
                    int i8 = c7541cM58i2.f94264zy;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | wvg.f64653fu4);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c7541cM58i2.f94264zy = i8 + 2;
                    x2Var.vy(x2Var.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C7541c c7541cM58i3 = x2Var.m58i(3);
                    byte[] bArr3 = c7541cM58i3.f43687k;
                    int i9 = c7541cM58i3.f94264zy;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c7541cM58i3.f94264zy = i9 + 3;
                    x2Var.vy(x2Var.size() + 3);
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            C7541c c7541cM58i4 = x2Var.m58i(4);
                            byte[] bArr4 = c7541cM58i4.f43687k;
                            int i12 = c7541cM58i4.f94264zy;
                            bArr4[i12] = (byte) ((i11 >> 18) | wvg.f64659wvg);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            c7541cM58i4.f94264zy = i12 + 4;
                            x2Var.vy(x2Var.size() + 4);
                            i2 += 2;
                        }
                    }
                    x2Var.writeByte(63);
                    i2 = i10;
                }
                i2++;
            }
        }
        return x2Var;
    }

    public static final int mcp(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() < 4) {
            throw new EOFException();
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 4) {
            return (x2Var.readByte() & 255) | ((x2Var.readByte() & 255) << 24) | ((x2Var.readByte() & 255) << 16) | ((x2Var.readByte() & 255) << 8);
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        x2Var.vy(x2Var.size() - 4);
        if (i9 == i3) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i9;
        }
        return i10;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final okio.x2 m27685n(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q okio.x2 out, long j2, long j3) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(out, "out");
        C7575s.m27855n(x2Var.size(), j2, j3);
        if (j3 == 0) {
            return x2Var;
        }
        out.vy(out.size() + j3);
        C7541c c7541c = x2Var.f43846k;
        while (true) {
            d2ok.qrj(c7541c);
            int i2 = c7541c.f94264zy;
            int i3 = c7541c.f94263toq;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            c7541c = c7541c.f43686g;
        }
        while (j3 > 0) {
            d2ok.qrj(c7541c);
            C7541c c7541cM27584q = c7541c.m27584q();
            int i4 = c7541cM27584q.f94263toq + ((int) j2);
            c7541cM27584q.f94263toq = i4;
            c7541cM27584q.f94264zy = Math.min(i4 + ((int) j3), c7541cM27584q.f94264zy);
            C7541c c7541c2 = out.f43846k;
            if (c7541c2 == null) {
                c7541cM27584q.f94262f7l8 = c7541cM27584q;
                c7541cM27584q.f43686g = c7541cM27584q;
                out.f43846k = c7541cM27584q;
            } else {
                d2ok.qrj(c7541c2);
                C7541c c7541c3 = c7541c2.f94262f7l8;
                d2ok.qrj(c7541c3);
                c7541c3.zy(c7541cM27584q);
            }
            j3 -= (long) (c7541cM27584q.f94264zy - c7541cM27584q.f94263toq);
            c7541c = c7541c.f43686g;
            j2 = 0;
        }
        return x2Var;
    }

    @InterfaceC7396q
    public static final okio.x2 n5r1(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q nn86 source, long j2) throws IOException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(source, "source");
        while (j2 > 0) {
            long jWx16 = source.wx16(x2Var, j2);
            if (jWx16 == -1) {
                throw new EOFException();
            }
            j2 -= jWx16;
        }
        return x2Var;
    }

    public static final boolean n7h(@InterfaceC7396q okio.x2 x2Var, long j2, @InterfaceC7396q kja0 bytes, int i2, int i3) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(bytes, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || x2Var.size() - j2 < i3 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (x2Var.g1(((long) i4) + j2) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final C7541c ncyb(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7541c c7541c = x2Var.f43846k;
        if (c7541c != null) {
            d2ok.qrj(c7541c);
            C7541c c7541c2 = c7541c.f94262f7l8;
            d2ok.qrj(c7541c2);
            return (c7541c2.f94264zy + i2 > 8192 || !c7541c2.f43688n) ? c7541c2.zy(lrht.m27785n()) : c7541c2;
        }
        C7541c c7541cM27785n = lrht.m27785n();
        x2Var.f43846k = c7541cM27785n;
        c7541cM27785n.f94262f7l8 = c7541cM27785n;
        c7541cM27785n.f43686g = c7541cM27785n;
        return c7541cM27785n;
    }

    @InterfaceC7396q
    public static final kja0 ni7(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        return x2Var.fnq8(x2Var.size());
    }

    @InterfaceC7396q
    public static final okio.x2 nn86(@InterfaceC7396q okio.x2 x2Var, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        if (j2 == 0) {
            return x2Var.writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C7541c c7541cM58i = x2Var.m58i(i2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = yz()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        c7541cM58i.f94264zy += i2;
        x2Var.vy(x2Var.size() + ((long) i2));
        return x2Var;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: o */
    public static final okio.x2 m27686o(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        C7541c c7541cM58i = x2Var.m58i(2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        c7541cM58i.f94264zy = i4 + 1;
        x2Var.vy(x2Var.size() + 2);
        return x2Var;
    }

    public static final void o1t(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q okio.x2 sink, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        if (x2Var.size() >= j2) {
            sink.mo26936j(x2Var, j2);
        } else {
            sink.mo26936j(x2Var, x2Var.size());
            throw new EOFException();
        }
    }

    @InterfaceC7396q
    public static final String oc(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jGvn7 = x2Var.gvn7((byte) 10, 0L, j3);
        if (jGvn7 != -1) {
            return bf2(x2Var, jGvn7);
        }
        if (j3 < x2Var.size() && x2Var.g1(j3 - 1) == 13 && x2Var.g1(j3) == 10) {
            return bf2(x2Var, j3);
        }
        okio.x2 x2Var2 = new okio.x2();
        x2Var.yz(x2Var2, 0L, Math.min(32, x2Var.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(x2Var.size(), j2) + " content=" + x2Var2.uj2j().hex() + eqxt.f81897fti);
    }

    /* JADX INFO: renamed from: p */
    public static final long m27687p(@InterfaceC7396q okio.x2 x2Var, byte b2, long j2, long j3) {
        C7541c c7541c;
        int i2;
        d2ok.m23075h(x2Var, "<this>");
        long size = 0;
        boolean z2 = false;
        if (0 <= j2 && j2 <= j3) {
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException(("size=" + x2Var.size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > x2Var.size()) {
            j3 = x2Var.size();
        }
        if (j2 == j3 || (c7541c = x2Var.f43846k) == null) {
            return -1L;
        }
        if (x2Var.size() - j2 < j2) {
            size = x2Var.size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            while (size < j3) {
                byte[] bArr = c7541c.f43687k;
                int iMin = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + j3) - size);
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                while (i2 < iMin) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                d2ok.qrj(c7541c);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + size;
            if (j4 > j2) {
                break;
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            size = j4;
        }
        while (size < j3) {
            byte[] bArr2 = c7541c.f43687k;
            int iMin2 = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + j3) - size);
            i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
            while (i2 < iMin2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            size += (long) (c7541c.f94264zy - c7541c.f94263toq);
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            j2 = size;
        }
        return -1L;
        return ((long) (i2 - c7541c.f94263toq)) + size;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final okio.x2 m27688q(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        okio.x2 x2Var2 = new okio.x2();
        if (x2Var.size() == 0) {
            return x2Var2;
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        C7541c c7541cM27584q = c7541c.m27584q();
        x2Var2.f43846k = c7541cM27584q;
        c7541cM27584q.f94262f7l8 = c7541cM27584q;
        c7541cM27584q.f43686g = c7541cM27584q;
        for (C7541c c7541c2 = c7541c.f43686g; c7541c2 != c7541c; c7541c2 = c7541c2.f43686g) {
            C7541c c7541c3 = c7541cM27584q.f94262f7l8;
            d2ok.qrj(c7541c3);
            d2ok.qrj(c7541c2);
            c7541c3.zy(c7541c2.m27584q());
        }
        x2Var2.vy(x2Var.size());
        return x2Var2;
    }

    public static final int qrj(@InterfaceC7396q x2.C7577k c7577k) {
        d2ok.m23075h(c7577k, "<this>");
        long j2 = c7577k.f43848g;
        okio.x2 x2Var = c7577k.f43849k;
        d2ok.qrj(x2Var);
        if (!(j2 != x2Var.size())) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j3 = c7577k.f43848g;
        return c7577k.m27875p(j3 == -1 ? 0L : j3 + ((long) (c7577k.f43851p - c7577k.f43853s)));
    }

    /* JADX INFO: renamed from: r */
    public static final void m27689r(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        while (j2 > 0) {
            C7541c c7541c = x2Var.f43846k;
            if (c7541c == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            long j3 = iMin;
            x2Var.vy(x2Var.size() - j3);
            j2 -= j3;
            int i2 = c7541c.f94263toq + iMin;
            c7541c.f94263toq = i2;
            if (i2 == c7541c.f94264zy) {
                x2Var.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final int m27690s(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c7541c.f94264zy;
            for (int i4 = c7541c.f94263toq; i4 < i3; i4++) {
                i2 = (i2 * 31) + c7541c.f43687k[i4];
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
        } while (c7541c != x2Var.f43846k);
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[EDGE_INSN: B:44:0x00af->B:38:0x00af BREAK  A[LOOP:0: B:5:0x0012->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m27691t(@mub.InterfaceC7396q okio.x2 r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb9
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.c r6 = r14.f43846k
            kotlin.jvm.internal.d2ok.qrj(r6)
            byte[] r7 = r6.f43687k
            int r8 = r6.f94263toq
            int r9 = r6.f94264zy
        L1d:
            if (r8 >= r9) goto L9b
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L44
        L2c:
            r11 = 97
            if (r10 < r11) goto L39
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L39
            int r11 = r10 + (-97)
        L36:
            int r11 = r11 + 10
            goto L44
        L39:
            r11 = 65
            if (r10 < r11) goto L7c
            r11 = 70
            if (r10 > r11) goto L7c
            int r11 = r10 + (-65)
            goto L36
        L44:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L54
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L54:
            okio.x2 r14 = new okio.x2
            r14.<init>()
            okio.x2 r14 = r14.bz2(r4)
            okio.x2 r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.jbh()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L7c:
            if (r0 == 0) goto L80
            r1 = 1
            goto L9b
        L80:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.C7575s.fn3e(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L9b:
            if (r8 != r9) goto La7
            okio.c r7 = r6.toq()
            r14.f43846k = r7
            okio.lrht.m27786q(r6)
            goto La9
        La7:
            r6.f94263toq = r8
        La9:
            if (r1 != 0) goto Laf
            okio.c r6 = r14.f43846k
            if (r6 != 0) goto L12
        Laf:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.vy(r1)
            return r4
        Lb9:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C7551k.m27691t(okio.x2):long");
    }

    @InterfaceC7396q
    public static final x2.C7577k t8r(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q x2.C7577k unsafeCursor) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(unsafeCursor, "unsafeCursor");
        x2.C7577k c7577kN7h = C7575s.n7h(unsafeCursor);
        if (!(c7577kN7h.f43849k == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c7577kN7h.f43849k = x2Var;
        c7577kN7h.f43852q = true;
        return c7577kN7h;
    }

    public static final void toq(@InterfaceC7396q x2.C7577k c7577k) {
        d2ok.m23075h(c7577k, "<this>");
        if (!(c7577k.f43849k != null)) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        c7577k.f43849k = null;
        c7577k.ld6(null);
        c7577k.f43848g = -1L;
        c7577k.f43854y = null;
        c7577k.f43853s = -1;
        c7577k.f43851p = -1;
    }

    public static final long uv6(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q nn86 source) throws IOException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(source, "source");
        long j2 = 0;
        while (true) {
            long jWx16 = source.wx16(x2Var, 8192L);
            if (jWx16 == -1) {
                return j2;
            }
            j2 += jWx16;
        }
    }

    @InterfaceC7396q
    public static final okio.x2 vyq(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        C7541c c7541cM58i = x2Var.m58i(1);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        c7541cM58i.f94264zy = i3 + 1;
        bArr[i3] = (byte) i2;
        x2Var.vy(x2Var.size() + 1);
        return x2Var;
    }

    public static final void wvg(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q byte[] sink) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(sink, "sink");
        int i2 = 0;
        while (i2 < sink.length) {
            int i3 = x2Var.read(sink, i2, sink.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    public static final long x2(@InterfaceC7396q okio.x2 x2Var, @InterfaceC7396q kja0 targetBytes, long j2) {
        int i2;
        int i3;
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(targetBytes, "targetBytes");
        long size = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            return -1L;
        }
        if (x2Var.size() - j2 < j2) {
            size = x2Var.size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            if (targetBytes.size() == 2) {
                byte b2 = targetBytes.getByte(0);
                byte b3 = targetBytes.getByte(1);
                while (size < x2Var.size()) {
                    byte[] bArr = c7541c.f43687k;
                    i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                    int i4 = c7541c.f94264zy;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (b4 == b2 || b4 == b3) {
                            i3 = c7541c.f94263toq;
                        } else {
                            i2++;
                        }
                    }
                    size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                    c7541c = c7541c.f43686g;
                    d2ok.qrj(c7541c);
                    j2 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < x2Var.size()) {
                    byte[] bArr2 = c7541c.f43687k;
                    i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                    int i5 = c7541c.f94264zy;
                    while (i2 < i5) {
                        byte b5 = bArr2[i2];
                        for (byte b6 : bArrInternalArray$okio) {
                            if (b5 == b6) {
                                i3 = c7541c.f94263toq;
                            }
                        }
                        i2++;
                    }
                    size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                    c7541c = c7541c.f43686g;
                    d2ok.qrj(c7541c);
                    j2 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + size;
            if (j3 > j2) {
                break;
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            size = j3;
        }
        if (targetBytes.size() == 2) {
            byte b9 = targetBytes.getByte(0);
            byte b10 = targetBytes.getByte(1);
            while (size < x2Var.size()) {
                byte[] bArr3 = c7541c.f43687k;
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                int i6 = c7541c.f94264zy;
                while (i2 < i6) {
                    byte b11 = bArr3[i2];
                    if (b11 == b9 || b11 == b10) {
                        i3 = c7541c.f94263toq;
                    } else {
                        i2++;
                    }
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                d2ok.qrj(c7541c);
                j2 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < x2Var.size()) {
                byte[] bArr4 = c7541c.f43687k;
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                int i7 = c7541c.f94264zy;
                while (i2 < i7) {
                    byte b12 = bArr4[i2];
                    for (byte b13 : bArrInternalArray$okio2) {
                        if (b12 == b13) {
                            i3 = c7541c.f94263toq;
                        }
                    }
                    i2++;
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                d2ok.qrj(c7541c);
                j2 = size;
            }
        }
        return -1L;
        return ((long) (i2 - i3)) + size;
    }

    @InterfaceC7396q
    public static final kja0 x9kr(@InterfaceC7396q okio.x2 x2Var, int i2) {
        d2ok.m23075h(x2Var, "<this>");
        if (i2 == 0) {
            return kja0.EMPTY;
        }
        C7575s.m27855n(x2Var.size(), 0L, i2);
        C7541c c7541c = x2Var.f43846k;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            d2ok.qrj(c7541c);
            int i6 = c7541c.f94264zy;
            int i7 = c7541c.f94263toq;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c7541c = c7541c.f43686g;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C7541c c7541c2 = x2Var.f43846k;
        int i8 = 0;
        while (i3 < i2) {
            d2ok.qrj(c7541c2);
            bArr[i8] = c7541c2.f43687k;
            i3 += c7541c2.f94264zy - c7541c2.f94263toq;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c7541c2.f94263toq;
            c7541c2.f43689q = true;
            i8++;
            c7541c2 = c7541c2.f43686g;
        }
        return new uv6(bArr, iArr);
    }

    /* JADX INFO: renamed from: y */
    public static final byte m27692y(@InterfaceC7396q okio.x2 x2Var, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        C7575s.m27855n(x2Var.size(), j2, 1L);
        C7541c c7541c = x2Var.f43846k;
        if (c7541c == null) {
            d2ok.qrj(null);
            throw null;
        }
        if (x2Var.size() - j2 < j2) {
            long size = x2Var.size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            d2ok.qrj(c7541c);
            return c7541c.f43687k[(int) ((((long) c7541c.f94263toq) + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + j3;
            if (j4 > j2) {
                d2ok.qrj(c7541c);
                return c7541c.f43687k[(int) ((((long) c7541c.f94263toq) + j2) - j3)];
            }
            c7541c = c7541c.f43686g;
            d2ok.qrj(c7541c);
            j3 = j4;
        }
    }

    public static /* synthetic */ void y9n() {
    }

    @InterfaceC7396q
    public static final byte[] yz() {
        return f43742k;
    }

    /* JADX INFO: renamed from: z */
    public static final long m27693z(@InterfaceC7396q okio.x2 x2Var) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (x2Var.size() == 0) {
            throw new EOFException();
        }
        long j2 = -7;
        int i2 = 0;
        long j3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        do {
            C7541c c7541c = x2Var.f43846k;
            d2ok.qrj(c7541c);
            byte[] bArr = c7541c.f43687k;
            int i3 = c7541c.f94263toq;
            int i4 = c7541c.f94264zy;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j3 < f94274zy || (j3 == f94274zy && i5 < j2)) {
                        okio.x2 x2VarEw = new okio.x2().xwq3(j3).writeByte(b2);
                        if (!z2) {
                            x2VarEw.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + x2VarEw.jbh());
                    }
                    j3 = (j3 * 10) + ((long) i5);
                } else {
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                x2Var.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            } else {
                c7541c.f94263toq = i3;
            }
            if (z3) {
                break;
            }
        } while (x2Var.f43846k != null);
        x2Var.vy(x2Var.size() - ((long) i2));
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j3 : -j3;
        }
        if (x2Var.size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z2 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C7575s.fn3e(x2Var.g1(0L)));
    }

    @InterfaceC7396q
    public static final byte[] zurt(@InterfaceC7396q okio.x2 x2Var, long j2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (x2Var.size() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        x2Var.readFully(bArr);
        return bArr;
    }

    public static final long zy(@InterfaceC7396q okio.x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        long size = x2Var.size();
        if (size == 0) {
            return 0L;
        }
        C7541c c7541c = x2Var.f43846k;
        d2ok.qrj(c7541c);
        C7541c c7541c2 = c7541c.f94262f7l8;
        d2ok.qrj(c7541c2);
        int i2 = c7541c2.f94264zy;
        return (i2 >= 8192 || !c7541c2.f43688n) ? size : size - ((long) (i2 - c7541c2.f94263toq));
    }
}
