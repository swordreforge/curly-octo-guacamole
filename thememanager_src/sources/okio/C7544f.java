package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6452q;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.internal.C7551k;

/* JADX INFO: renamed from: okio.f */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
public final class C7544f implements n7h {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final nn86 f43701k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public boolean f43702n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public final x2 f43703q;

    public C7544f(@InterfaceC7396q nn86 source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        this.f43701k = source;
        this.f43703q = new x2();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m27609k() {
    }

    @Override // okio.n7h
    public boolean bf2(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f43703q.size() < j2) {
            if (this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.n7h
    public short bo() throws EOFException {
        dr(2L);
        return this.f43703q.bo();
    }

    @Override // okio.n7h
    public boolean ch(long j2, @InterfaceC7396q kja0 bytes, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 >= 0 && i2 >= 0 && i3 >= 0 && bytes.size() - i2 >= i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                long j3 = ((long) i4) + j2;
                if (bf2(1 + j3) && this.f43703q.g1(j3) == bytes.getByte(i2 + i4)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f43702n) {
            return;
        }
        this.f43702n = true;
        this.f43701k.close();
        this.f43703q.m27873y();
    }

    @Override // okio.n7h
    public int cv06() throws EOFException {
        dr(4L);
        return this.f43703q.cv06();
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: d */
    public String mo27610d(long j2) throws EOFException {
        dr(j2);
        return this.f43703q.mo27610d(j2);
    }

    @Override // okio.n7h
    public long d3(@InterfaceC7396q kja0 targetBytes) {
        kotlin.jvm.internal.d2ok.m23075h(targetBytes, "targetBytes");
        return gyi(targetBytes, 0L);
    }

    @Override // okio.n7h
    public void dr(long j2) throws EOFException {
        if (!bf2(j2)) {
            throw new EOFException();
        }
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public kja0 fnq8(long j2) throws EOFException {
        dr(j2);
        return this.f43703q.fnq8(j2);
    }

    @Override // okio.n7h
    public long fti(byte b2, long j2) {
        return gvn7(b2, j2, Long.MAX_VALUE);
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public x2 mo27611g() {
        return this.f43703q;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public byte[] gbni() throws IOException {
        this.f43703q.ek5k(this.f43701k);
        return this.f43703q.gbni();
    }

    @Override // okio.n7h
    public long gvn7(byte b2, long j2, long j3) {
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j2 <= j3)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long jGvn7 = this.f43703q.gvn7(b2, j2, j3);
            if (jGvn7 != -1) {
                return jGvn7;
            }
            long size = this.f43703q.size();
            if (size >= j3 || this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
        return -1L;
    }

    @Override // okio.n7h
    public long gyi(@InterfaceC7396q kja0 targetBytes, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(targetBytes, "targetBytes");
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jGyi = this.f43703q.gyi(targetBytes, j2);
            if (jGyi != -1) {
                return jGyi;
            }
            long size = this.f43703q.size();
            if (this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    @Override // okio.n7h
    public long ikck(byte b2) {
        return gvn7(b2, 0L, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43702n;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String jbh() throws IOException {
        this.f43703q.ek5k(this.f43701k);
        return this.f43703q.jbh();
    }

    @Override // okio.n7h
    public long jk(@InterfaceC7396q kja0 bytes) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return kja0(bytes, 0L);
    }

    @Override // okio.n7h
    public void jp0y(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        try {
            dr(j2);
            this.f43703q.jp0y(sink, j2);
        } catch (EOFException e2) {
            sink.ek5k(this.f43703q);
            throw e2;
        }
    }

    @Override // okio.n7h
    public long kja0(@InterfaceC7396q kja0 bytes, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jKja0 = this.f43703q.kja0(bytes, j2);
            if (jKja0 != -1) {
                return jKja0;
            }
            long size = this.f43703q.size();
            if (this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // okio.n7h
    public int lh(@InterfaceC7396q dd options) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iA98o = C7551k.a98o(this.f43703q, options, true);
            if (iA98o != -2) {
                if (iA98o != -1) {
                    this.f43703q.skip(options.zy()[iA98o].size());
                    return iA98o;
                }
            } else if (this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public byte[] lv5(long j2) throws EOFException {
        dr(j2);
        return this.f43703q.lv5(j2);
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public x2 mo27612n() {
        return this.f43703q;
    }

    @Override // okio.n7h
    public long n2t() throws EOFException {
        byte bG1;
        dr(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!bf2(i3)) {
                break;
            }
            bG1 = this.f43703q.g1(i2);
            if ((bG1 < 48 || bG1 > 57) && ((bG1 < 97 || bG1 > 102) && (bG1 < 65 || bG1 > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bG1, C6452q.m23604k(C6452q.m23604k(16)));
            kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f43703q.n2t();
    }

    @Override // okio.n7h
    @InterfaceC7395n
    public String oc() {
        long jIkck = ikck((byte) 10);
        if (jIkck != -1) {
            return C7551k.bf2(this.f43703q, jIkck);
        }
        if (this.f43703q.size() != 0) {
            return mo27610d(this.f43703q.size());
        }
        return null;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public n7h peek() {
        return d2ok.m27592n(new C7564l(this));
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public InputStream pjz9() {
        return new k();
    }

    @Override // okio.n7h
    public boolean py() {
        if (!this.f43702n) {
            return this.f43703q.py() && this.f43701k.wx16(this.f43703q, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    public String mo27613r(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jGvn7 = gvn7((byte) 10, 0L, j3);
        if (jGvn7 != -1) {
            return C7551k.bf2(this.f43703q, jGvn7);
        }
        if (j3 < Long.MAX_VALUE && bf2(j3) && this.f43703q.g1(j3 - 1) == 13 && bf2(1 + j3) && this.f43703q.g1(j3) == 10) {
            return C7551k.bf2(this.f43703q, j3);
        }
        x2 x2Var = new x2();
        x2 x2Var2 = this.f43703q;
        x2Var2.yz(x2Var, 0L, Math.min(32, x2Var2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f43703q.size(), j2) + " content=" + x2Var.uj2j().hex() + kotlin.text.eqxt.f81897fti);
    }

    @Override // okio.n7h
    public long r8s8() throws EOFException {
        byte bG1;
        dr(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!bf2(j3)) {
                break;
            }
            bG1 = this.f43703q.g1(j2);
            if ((bG1 < 48 || bG1 > 57) && !(j2 == 0 && bG1 == 45)) {
                break;
            }
            j2 = j3;
        }
        if (j2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bG1, C6452q.m23604k(C6452q.m23604k(16)));
            kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f43703q.r8s8();
    }

    @Override // okio.n7h
    public int read(@InterfaceC7396q byte[] sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.n7h
    public byte readByte() throws EOFException {
        dr(1L);
        return this.f43703q.readByte();
    }

    @Override // okio.n7h
    public void readFully(@InterfaceC7396q byte[] sink) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        try {
            dr(sink.length);
            this.f43703q.readFully(sink);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f43703q.size() > 0) {
                x2 x2Var = this.f43703q;
                int i3 = x2Var.read(sink, i2, (int) x2Var.size());
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
            throw e2;
        }
    }

    @Override // okio.n7h
    public int readInt() throws EOFException {
        dr(4L);
        return this.f43703q.readInt();
    }

    @Override // okio.n7h
    public long readLong() throws EOFException {
        dr(8L);
        return this.f43703q.readLong();
    }

    @Override // okio.n7h
    public short readShort() throws EOFException {
        dr(2L);
        return this.f43703q.readShort();
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String se(@InterfaceC7396q Charset charset) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        this.f43703q.ek5k(this.f43701k);
        return this.f43703q.se(charset);
    }

    @Override // okio.n7h
    public void skip(long j2) throws IOException {
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.f43703q.size() == 0 && this.f43701k.wx16(this.f43703q, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.f43703q.size());
            this.f43703q.skip(jMin);
            j2 -= jMin;
        }
    }

    @InterfaceC7396q
    public String toString() {
        return "buffer(" + this.f43701k + ')';
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43701k.toq();
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public kja0 uj2j() throws IOException {
        this.f43703q.ek5k(this.f43701k);
        return this.f43703q.uj2j();
    }

    @Override // okio.n7h
    public long ukdy(@InterfaceC7396q vyq sink) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        long j2 = 0;
        while (this.f43701k.wx16(this.f43703q, 8192L) != -1) {
            long jFu4 = this.f43703q.fu4();
            if (jFu4 > 0) {
                j2 += jFu4;
                sink.mo26936j(this.f43703q, jFu4);
            }
        }
        if (this.f43703q.size() <= 0) {
            return j2;
        }
        long size = j2 + this.f43703q.size();
        x2 x2Var = this.f43703q;
        sink.mo26936j(x2Var, x2Var.size());
        return size;
    }

    @Override // okio.n7h
    public boolean vyq(long j2, @InterfaceC7396q kja0 bytes) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return ch(j2, bytes, 0, bytes.size());
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f43702n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f43703q.size() == 0 && this.f43701k.wx16(this.f43703q, 8192L) == -1) {
            return -1L;
        }
        return this.f43703q.wx16(sink, Math.min(j2, this.f43703q.size()));
    }

    @Override // okio.n7h
    public long y2() throws EOFException {
        dr(8L);
        return this.f43703q.y2();
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String yl(long j2, @InterfaceC7396q Charset charset) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        dr(j2);
        return this.f43703q.yl(j2, charset);
    }

    @Override // okio.n7h
    public int zkd() throws EOFException {
        dr(1L);
        byte bG1 = this.f43703q.g1(0L);
        if ((bG1 & 224) == 192) {
            dr(2L);
        } else if ((bG1 & 240) == 224) {
            dr(3L);
        } else if ((bG1 & 248) == 240) {
            dr(4L);
        }
        return this.f43703q.zkd();
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String zp() {
        return mo27613r(Long.MAX_VALUE);
    }

    @Override // okio.n7h
    public int read(@InterfaceC7396q byte[] sink, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        long j2 = i3;
        C7575s.m27855n(sink.length, i2, j2);
        if (this.f43703q.size() == 0 && this.f43701k.wx16(this.f43703q, 8192L) == -1) {
            return -1;
        }
        return this.f43703q.read(sink, i2, (int) Math.min(j2, this.f43703q.size()));
    }

    /* JADX INFO: renamed from: okio.f$k */
    /* JADX INFO: compiled from: RealBufferedSource.kt */
    @lv5({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#2:186\n62#2:187\n62#2:188\n62#2:190\n62#2:191\n62#2:192\n62#2:193\n74#3:189\n86#3:194\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n149#1:186\n150#1:187\n153#1:188\n160#1:190\n161#1:191\n165#1:192\n170#1:193\n153#1:189\n170#1:194\n*E\n"})
    public static final class k extends InputStream {
        k() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C7544f c7544f = C7544f.this;
            if (c7544f.f43702n) {
                throw new IOException("closed");
            }
            return (int) Math.min(c7544f.f43703q.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7544f.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C7544f c7544f = C7544f.this;
            if (c7544f.f43702n) {
                throw new IOException("closed");
            }
            if (c7544f.f43703q.size() == 0) {
                C7544f c7544f2 = C7544f.this;
                if (c7544f2.f43701k.wx16(c7544f2.f43703q, 8192L) == -1) {
                    return -1;
                }
            }
            return C7544f.this.f43703q.readByte() & 255;
        }

        @InterfaceC7396q
        public String toString() {
            return C7544f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@InterfaceC7396q byte[] data, int i2, int i3) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(data, "data");
            if (!C7544f.this.f43702n) {
                C7575s.m27855n(data.length, i2, i3);
                if (C7544f.this.f43703q.size() == 0) {
                    C7544f c7544f = C7544f.this;
                    if (c7544f.f43701k.wx16(c7544f.f43703q, 8192L) == -1) {
                        return -1;
                    }
                }
                return C7544f.this.f43703q.read(data, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@InterfaceC7396q ByteBuffer sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (this.f43703q.size() == 0 && this.f43701k.wx16(this.f43703q, 8192L) == -1) {
            return -1;
        }
        return this.f43703q.read(sink);
    }
}
