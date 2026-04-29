package okio.internal;

import java.util.Arrays;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.a9;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.C7562k;
import okio.C7575s;
import okio.ek5k;
import okio.kja0;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
@InterfaceC6769y(name = "-ByteString")
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final char[] f43761k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @InterfaceC7396q
    public static final kja0 a9(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        d2ok.m23075h(bArr, "<this>");
        int iQrj = C7575s.qrj(bArr, i3);
        C7575s.m27855n(bArr.length, i2, iQrj);
        return new kja0(kotlin.collections.kja0.zkd(bArr, i2, iQrj + i2));
    }

    @InterfaceC7396q
    public static final String cdj(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        char[] cArr = new char[kja0Var.getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : kja0Var.getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = oc()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = oc()[b2 & com.google.common.base.zy.f68111cdj];
        }
        return a9.wx16(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d3(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if (!('A' <= c2 && c2 < 'G')) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static /* synthetic */ void eqxt() {
    }

    public static final void f7l8(@InterfaceC7396q kja0 kja0Var, int i2, @InterfaceC7396q byte[] target, int i3, int i4) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(target, "target");
        kotlin.collections.kja0.y2(kja0Var.getData$okio(), target, i3, i2, i4 + i2);
    }

    public static final int fn3e(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q byte[] other, int i2) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        for (int iMin = Math.min(C7575s.x2(kja0Var, i2), kja0Var.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (C7575s.m27857q(kja0Var.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final String fti(@InterfaceC7396q kja0 kja0Var) {
        kja0 kja0Var2 = kja0Var;
        d2ok.m23075h(kja0Var2, "<this>");
        if (kja0Var.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iZy = zy(kja0Var.getData$okio(), 64);
        if (iZy != -1) {
            String strUtf8 = kja0Var.utf8();
            String strSubstring = strUtf8.substring(0, iZy);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strUf = a9.uf(a9.uf(a9.uf(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iZy >= strUtf8.length()) {
                return "[text=" + strUf + ']';
            }
            return "[size=" + kja0Var.getData$okio().length + " text=" + strUf + "…]";
        }
        if (kja0Var.getData$okio().length <= 64) {
            return "[hex=" + kja0Var.hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(kja0Var.getData$okio().length);
        sb.append(" hex=");
        int iX2 = C7575s.x2(kja0Var2, 64);
        if (!(iX2 <= kja0Var.getData$okio().length)) {
            throw new IllegalArgumentException(("endIndex > length(" + kja0Var.getData$okio().length + ')').toString());
        }
        if (!(iX2 + 0 >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (iX2 != kja0Var.getData$okio().length) {
            kja0Var2 = new kja0(kotlin.collections.kja0.zkd(kja0Var.getData$okio(), 0, iX2));
        }
        sb.append(kja0Var2.hex());
        sb.append("…]");
        return sb.toString();
    }

    public static final boolean fu4(@InterfaceC7396q kja0 kja0Var, int i2, @InterfaceC7396q byte[] other, int i3, int i4) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        return i2 >= 0 && i2 <= kja0Var.getData$okio().length - i4 && i3 >= 0 && i3 <= other.length - i4 && C7575s.m27857q(kja0Var.getData$okio(), i2, other, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static final int m27731g(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0 other) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        int size = kja0Var.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = kja0Var.getByte(i2) & 255;
            int i4 = other.getByte(i2) & 255;
            if (i3 != i4) {
                return i3 < i4 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void gvn7(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q okio.x2 buffer, int i2, int i3) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(buffer, "buffer");
        buffer.write(kja0Var.getData$okio(), i2, i3);
    }

    /* JADX INFO: renamed from: h */
    public static final int m27732h(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        int hashCode$okio = kja0Var.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(kja0Var.getData$okio());
        kja0Var.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public static final int m27733i(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0 other, int i2) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        return kja0Var.lastIndexOf(other.internalArray$okio(), i2);
    }

    @InterfaceC7396q
    public static final byte[] jk(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        byte[] data$okio = kja0Var.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC7396q
    public static final String jp0y(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        String utf8$okio = kja0Var.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String strZy = ek5k.zy(kja0Var.internalArray$okio());
        kja0Var.setUtf8$okio(strZy);
        return strZy;
    }

    public static final int ki(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q byte[] other, int i2) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        int length = kja0Var.getData$okio().length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax > length) {
            return -1;
        }
        while (!C7575s.m27857q(kja0Var.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final int kja0(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return kja0Var.getData$okio().length;
    }

    public static final boolean ld6(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0 suffix) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(suffix, "suffix");
        return kja0Var.rangeEquals(kja0Var.size() - suffix.size(), suffix, 0, suffix.size());
    }

    @InterfaceC7396q
    public static final kja0 mcp(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        for (int i2 = 0; i2 < kja0Var.getData$okio().length; i2++) {
            byte b2 = kja0Var.getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = kja0Var.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArrCopyOf[i3] = (byte) (b3 - 32);
                    }
                }
                return new kja0(bArrCopyOf);
            }
        }
        return kja0Var;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final String m27735n(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return C7562k.toq(kja0Var.getData$okio(), C7562k.m27771g());
    }

    public static final byte n7h(@InterfaceC7396q kja0 kja0Var, int i2) {
        d2ok.m23075h(kja0Var, "<this>");
        return kja0Var.getData$okio()[i2];
    }

    public static final boolean ni7(@InterfaceC7396q kja0 kja0Var, int i2, @InterfaceC7396q kja0 other, int i3, int i4) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(other, "other");
        return other.rangeEquals(i3, kja0Var.getData$okio(), i2, i4);
    }

    public static final boolean o1t(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q byte[] prefix) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(prefix, "prefix");
        return kja0Var.rangeEquals(0, prefix, 0, prefix.length);
    }

    @InterfaceC7396q
    public static final char[] oc() {
        return f43761k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final kja0 m27736p(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        kja0 kja0Var = new kja0(ek5k.m27605k(str));
        kja0Var.setUtf8$okio(str);
        return kja0Var;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final String m27737q(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return C7562k.zy(kja0Var.getData$okio(), null, 1, null);
    }

    public static final boolean qrj(@InterfaceC7396q kja0 kja0Var, @InterfaceC7395n Object obj) {
        d2ok.m23075h(kja0Var, "<this>");
        if (obj == kja0Var) {
            return true;
        }
        if (obj instanceof kja0) {
            kja0 kja0Var2 = (kja0) obj;
            if (kja0Var2.size() == kja0Var.getData$okio().length && kja0Var2.rangeEquals(0, kja0Var.getData$okio(), 0, kja0Var.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final kja0 m27738s(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((d3(str.charAt(i3)) << 4) + d3(str.charAt(i3 + 1)));
        }
        return new kja0(bArr);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public static final kja0 m27739t(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        for (int i2 = 0; i2 < kja0Var.getData$okio().length; i2++) {
            byte b2 = kja0Var.getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = kja0Var.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new kja0(bArrCopyOf);
            }
        }
        return kja0Var;
    }

    @InterfaceC7396q
    public static final byte[] t8r(@InterfaceC7396q kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return kja0Var.getData$okio();
    }

    @InterfaceC7396q
    public static final kja0 wvg(@InterfaceC7396q kja0 kja0Var, int i2, int i3) {
        d2ok.m23075h(kja0Var, "<this>");
        int iX2 = C7575s.x2(kja0Var, i3);
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iX2 <= kja0Var.getData$okio().length) {
            if (iX2 - i2 >= 0) {
                return (i2 == 0 && iX2 == kja0Var.getData$okio().length) ? kja0Var : new kja0(kotlin.collections.kja0.zkd(kja0Var.getData$okio(), i2, iX2));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + kja0Var.getData$okio().length + ')').toString());
    }

    public static final boolean x2(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q byte[] suffix) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(suffix, "suffix");
        return kja0Var.rangeEquals(kja0Var.size() - suffix.length, suffix, 0, suffix.length);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final kja0 m27740y(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        byte[] bArrM27772k = C7562k.m27772k(str);
        if (bArrM27772k != null) {
            return new kja0(bArrM27772k);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m27741z(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0 prefix) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(prefix, "prefix");
        return kja0Var.rangeEquals(0, prefix, 0, prefix.size());
    }

    @InterfaceC7396q
    public static final kja0 zurt(@InterfaceC7396q byte[] data) {
        d2ok.m23075h(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return new kja0(bArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0081 A[EDGE_INSN: B:261:0x0081->B:55:0x0081 BREAK  A[LOOP:1: B:31:0x0051->B:59:0x0088, LOOP_LABEL: LOOP:0: B:3:0x0008->B:289:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int zy(byte[] r19, int r20) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.toq.zy(byte[], int):int");
    }
}
