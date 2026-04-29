package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.lv5;
import kotlin.qo;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.t */
/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class C7576t implements nn86 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final a9 f43834g;

    /* JADX INFO: renamed from: k */
    private byte f43835k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Inflater f43836n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C7544f f43837q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final CRC32 f43838y;

    public C7576t(@InterfaceC7396q nn86 source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        C7544f c7544f = new C7544f(source);
        this.f43837q = c7544f;
        Inflater inflater = new Inflater(true);
        this.f43836n = inflater;
        this.f43834g = new a9((n7h) c7544f, inflater);
        this.f43838y = new CRC32();
    }

    /* JADX INFO: renamed from: k */
    private final void m27860k(String str, int i2, int i3) throws IOException {
        if (i3 == i2) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        kotlin.jvm.internal.d2ok.kja0(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    /* JADX INFO: renamed from: q */
    private final void m27861q() throws IOException {
        m27860k("CRC", this.f43837q.cv06(), (int) this.f43838y.getValue());
        m27860k("ISIZE", this.f43837q.cv06(), (int) this.f43836n.getBytesWritten());
    }

    /* JADX INFO: renamed from: y */
    private final void m27862y(x2 x2Var, long j2, long j3) {
        C7541c c7541c = x2Var.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        while (true) {
            int i2 = c7541c.f94264zy;
            int i3 = c7541c.f94263toq;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
        }
        while (j3 > 0) {
            int i4 = (int) (((long) c7541c.f94263toq) + j2);
            int iMin = (int) Math.min(c7541c.f94264zy - i4, j3);
            this.f43838y.update(c7541c.f43687k, i4, iMin);
            j3 -= (long) iMin;
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            j2 = 0;
        }
    }

    private final void zy() throws IOException {
        this.f43837q.dr(10L);
        byte bG1 = this.f43837q.f43703q.g1(3L);
        boolean z2 = ((bG1 >> 1) & 1) == 1;
        if (z2) {
            m27862y(this.f43837q.f43703q, 0L, 10L);
        }
        m27860k("ID1ID2", 8075, this.f43837q.readShort());
        this.f43837q.skip(8L);
        if (((bG1 >> 2) & 1) == 1) {
            this.f43837q.dr(2L);
            if (z2) {
                m27862y(this.f43837q.f43703q, 0L, 2L);
            }
            long jBo = this.f43837q.f43703q.bo() & qo.f36486g;
            this.f43837q.dr(jBo);
            if (z2) {
                m27862y(this.f43837q.f43703q, 0L, jBo);
            }
            this.f43837q.skip(jBo);
        }
        if (((bG1 >> 3) & 1) == 1) {
            long jIkck = this.f43837q.ikck((byte) 0);
            if (jIkck == -1) {
                throw new EOFException();
            }
            if (z2) {
                m27862y(this.f43837q.f43703q, 0L, jIkck + 1);
            }
            this.f43837q.skip(jIkck + 1);
        }
        if (((bG1 >> 4) & 1) == 1) {
            long jIkck2 = this.f43837q.ikck((byte) 0);
            if (jIkck2 == -1) {
                throw new EOFException();
            }
            if (z2) {
                m27862y(this.f43837q.f43703q, 0L, jIkck2 + 1);
            }
            this.f43837q.skip(jIkck2 + 1);
        }
        if (z2) {
            m27860k("FHCRC", this.f43837q.bo(), (short) this.f43838y.getValue());
            this.f43838y.reset();
        }
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43834g.close();
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43837q.toq();
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f43835k == 0) {
            zy();
            this.f43835k = (byte) 1;
        }
        if (this.f43835k == 1) {
            long size = sink.size();
            long jWx16 = this.f43834g.wx16(sink, j2);
            if (jWx16 != -1) {
                m27862y(sink, size, jWx16);
                return jWx16;
            }
            this.f43835k = (byte) 2;
        }
        if (this.f43835k == 2) {
            m27861q();
            this.f43835k = (byte) 3;
            if (!this.f43837q.py()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
