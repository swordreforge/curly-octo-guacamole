package okio.internal;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6452q;
import kotlin.text.eqxt;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.C7544f;
import okio.C7560j;
import okio.C7564l;
import okio.C7575s;
import okio.dd;
import okio.kja0;
import okio.n7h;
import okio.vyq;

/* JADX INFO: renamed from: okio.internal.g */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
@InterfaceC6769y(name = "-RealBufferedSource")
public final class C7550g {
    public static final boolean a9(@InterfaceC7396q C7544f c7544f, long j2) {
        d2ok.m23075h(c7544f, "<this>");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (c7544f.f43703q.size() < j2) {
            if (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void cdj(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q okio.x2 sink, long j2) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(sink, "sink");
        try {
            c7544f.dr(j2);
            c7544f.f43703q.jp0y(sink, j2);
        } catch (EOFException e2) {
            sink.ek5k(c7544f.f43703q);
            throw e2;
        }
    }

    @InterfaceC7396q
    public static final C7560j d3(@InterfaceC7396q C7544f c7544f) {
        d2ok.m23075h(c7544f, "<this>");
        return c7544f.f43701k.toq();
    }

    public static final boolean f7l8(@InterfaceC7396q C7544f c7544f, long j2, @InterfaceC7396q kja0 bytes, int i2, int i3) {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(bytes, "bytes");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 < 0 || i2 < 0 || i3 < 0 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            long j3 = ((long) i4) + j2;
            if (!c7544f.bf2(1 + j3) || c7544f.f43703q.g1(j3) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public static final int fn3e(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(4L);
        return c7544f.f43703q.cv06();
    }

    public static final void fti(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        if (!c7544f.bf2(j2)) {
            throw new EOFException();
        }
    }

    public static final short fu4(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(2L);
        return c7544f.f43703q.readShort();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final n7h m27662g(@InterfaceC7396q C7544f c7544f) {
        d2ok.m23075h(c7544f, "<this>");
        return okio.d2ok.m27592n(new C7564l(c7544f));
    }

    public static final void gvn7(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (c7544f.f43703q.size() == 0 && c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, c7544f.f43703q.size());
            c7544f.f43703q.skip(jMin);
            j2 -= jMin;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final long m27663h(@InterfaceC7396q C7544f c7544f) throws EOFException {
        byte bG1;
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!c7544f.bf2(j3)) {
                break;
            }
            bG1 = c7544f.f43703q.g1(j2);
            if ((bG1 < 48 || bG1 > 57) && !(j2 == 0 && bG1 == 45)) {
                break;
            }
            j2 = j3;
        }
        if (j2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bG1, C6452q.m23604k(C6452q.m23604k(16)));
            d2ok.kja0(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return c7544f.f43703q.r8s8();
    }

    /* JADX INFO: renamed from: i */
    public static final int m27664i(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(4L);
        return c7544f.f43703q.readInt();
    }

    @InterfaceC7396q
    public static final String jk(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jGvn7 = c7544f.gvn7((byte) 10, 0L, j3);
        if (jGvn7 != -1) {
            return C7551k.bf2(c7544f.f43703q, jGvn7);
        }
        if (j3 < Long.MAX_VALUE && c7544f.bf2(j3) && c7544f.f43703q.g1(j3 - 1) == 13 && c7544f.bf2(1 + j3) && c7544f.f43703q.g1(j3) == 10) {
            return C7551k.bf2(c7544f.f43703q, j3);
        }
        okio.x2 x2Var = new okio.x2();
        okio.x2 x2Var2 = c7544f.f43703q;
        x2Var2.yz(x2Var, 0L, Math.min(32, x2Var2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(c7544f.f43703q.size(), j2) + " content=" + x2Var.uj2j().hex() + eqxt.f81897fti);
    }

    public static final int jp0y(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q dd options) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(options, "options");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iA98o = C7551k.a98o(c7544f.f43703q, options, true);
            if (iA98o != -2) {
                if (iA98o == -1) {
                    return -1;
                }
                c7544f.f43703q.skip(options.zy()[iA98o].size());
                return iA98o;
            }
        } while (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) != -1);
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static final void m27665k(@InterfaceC7396q C7544f c7544f) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        if (c7544f.f43702n) {
            return;
        }
        c7544f.f43702n = true;
        c7544f.f43701k.close();
        c7544f.f43703q.m27873y();
    }

    public static final void ki(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q byte[] sink) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(sink, "sink");
        try {
            c7544f.dr(sink.length);
            c7544f.f43703q.readFully(sink);
        } catch (EOFException e2) {
            int i2 = 0;
            while (c7544f.f43703q.size() > 0) {
                okio.x2 x2Var = c7544f.f43703q;
                int i3 = x2Var.read(sink, i2, (int) x2Var.size());
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
            throw e2;
        }
    }

    @InterfaceC7396q
    public static final kja0 kja0(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(j2);
        return c7544f.f43703q.fnq8(j2);
    }

    public static final byte ld6(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(1L);
        return c7544f.f43703q.readByte();
    }

    @InterfaceC7395n
    public static final String mcp(@InterfaceC7396q C7544f c7544f) {
        d2ok.m23075h(c7544f, "<this>");
        long jIkck = c7544f.ikck((byte) 10);
        if (jIkck != -1) {
            return C7551k.bf2(c7544f.f43703q, jIkck);
        }
        if (c7544f.f43703q.size() != 0) {
            return c7544f.mo27610d(c7544f.f43703q.size());
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final long m27666n(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q kja0 targetBytes, long j2) {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(targetBytes, "targetBytes");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jGyi = c7544f.f43703q.gyi(targetBytes, j2);
            if (jGyi != -1) {
                return jGyi;
            }
            long size = c7544f.f43703q.size();
            if (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    @InterfaceC7396q
    public static final kja0 n7h(@InterfaceC7396q C7544f c7544f) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.f43703q.ek5k(c7544f.f43701k);
        return c7544f.f43703q.uj2j();
    }

    public static final long ni7(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(8L);
        return c7544f.f43703q.y2();
    }

    @InterfaceC7396q
    public static final String o1t(@InterfaceC7396q C7544f c7544f) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.f43703q.ek5k(c7544f.f43701k);
        return c7544f.f43703q.jbh();
    }

    @InterfaceC7396q
    public static final String oc(@InterfaceC7396q C7544f c7544f) {
        d2ok.m23075h(c7544f, "<this>");
        return "buffer(" + c7544f.f43701k + ')';
    }

    /* JADX INFO: renamed from: p */
    public static final long m27667p(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q vyq sink) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(sink, "sink");
        long j2 = 0;
        while (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) != -1) {
            long jFu4 = c7544f.f43703q.fu4();
            if (jFu4 > 0) {
                j2 += jFu4;
                sink.mo26936j(c7544f.f43703q, jFu4);
            }
        }
        if (c7544f.f43703q.size() <= 0) {
            return j2;
        }
        long size = j2 + c7544f.f43703q.size();
        okio.x2 x2Var = c7544f.f43703q;
        sink.mo26936j(x2Var, x2Var.size());
        return size;
    }

    /* JADX INFO: renamed from: q */
    public static final long m27668q(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q kja0 bytes, long j2) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(bytes, "bytes");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jKja0 = c7544f.f43703q.kja0(bytes, j2);
            if (jKja0 != -1) {
                return jKja0;
            }
            long size = c7544f.f43703q.size();
            if (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - ((long) bytes.size())) + 1);
        }
    }

    @InterfaceC7396q
    public static final byte[] qrj(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(j2);
        return c7544f.f43703q.lv5(j2);
    }

    /* JADX INFO: renamed from: s */
    public static final long m27669s(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q okio.x2 sink, long j2) {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (c7544f.f43703q.size() == 0 && c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
            return -1L;
        }
        return c7544f.f43703q.wx16(sink, Math.min(j2, c7544f.f43703q.size()));
    }

    /* JADX INFO: renamed from: t */
    public static final int m27670t(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(1L);
        byte bG1 = c7544f.f43703q.g1(0L);
        if ((bG1 & 224) == 192) {
            c7544f.dr(2L);
        } else if ((bG1 & 240) == 224) {
            c7544f.dr(3L);
        } else if ((bG1 & 248) == 240) {
            c7544f.dr(4L);
        }
        return c7544f.f43703q.zkd();
    }

    public static final long t8r(@InterfaceC7396q C7544f c7544f) throws EOFException {
        byte bG1;
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!c7544f.bf2(i3)) {
                break;
            }
            bG1 = c7544f.f43703q.g1(i2);
            if ((bG1 < 48 || bG1 > 57) && ((bG1 < 97 || bG1 > 102) && (bG1 < 65 || bG1 > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bG1, C6452q.m23604k(C6452q.m23604k(16)));
            d2ok.kja0(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return c7544f.f43703q.n2t();
    }

    public static final boolean toq(@InterfaceC7396q C7544f c7544f) {
        d2ok.m23075h(c7544f, "<this>");
        if (!c7544f.f43702n) {
            return c7544f.f43703q.py() && c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @InterfaceC7396q
    public static final String wvg(@InterfaceC7396q C7544f c7544f, long j2) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(j2);
        return c7544f.f43703q.mo27610d(j2);
    }

    @InterfaceC7396q
    public static final byte[] x2(@InterfaceC7396q C7544f c7544f) throws IOException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.f43703q.ek5k(c7544f.f43701k);
        return c7544f.f43703q.gbni();
    }

    /* JADX INFO: renamed from: y */
    public static final int m27671y(@InterfaceC7396q C7544f c7544f, @InterfaceC7396q byte[] sink, int i2, int i3) {
        d2ok.m23075h(c7544f, "<this>");
        d2ok.m23075h(sink, "sink");
        long j2 = i3;
        C7575s.m27855n(sink.length, i2, j2);
        if (c7544f.f43703q.size() == 0 && c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
            return -1;
        }
        return c7544f.f43703q.read(sink, i2, (int) Math.min(j2, c7544f.f43703q.size()));
    }

    /* JADX INFO: renamed from: z */
    public static final short m27672z(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(2L);
        return c7544f.f43703q.bo();
    }

    public static final long zurt(@InterfaceC7396q C7544f c7544f) throws EOFException {
        d2ok.m23075h(c7544f, "<this>");
        c7544f.dr(8L);
        return c7544f.f43703q.readLong();
    }

    public static final long zy(@InterfaceC7396q C7544f c7544f, byte b2, long j2, long j3) {
        d2ok.m23075h(c7544f, "<this>");
        if (!(!c7544f.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j2 <= j3)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long jGvn7 = c7544f.f43703q.gvn7(b2, j2, j3);
            if (jGvn7 != -1) {
                return jGvn7;
            }
            long size = c7544f.f43703q.size();
            if (size >= j3 || c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                break;
            }
            j2 = Math.max(j2, size);
        }
        return -1L;
    }
}
