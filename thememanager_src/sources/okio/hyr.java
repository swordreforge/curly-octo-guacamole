package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class hyr implements qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final vyq f43728k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public boolean f43729n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public final x2 f43730q;

    public hyr(@InterfaceC7396q vyq sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        this.f43728k = sink;
        this.f43730q = new x2();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m27637k() {
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj bz2(long j2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.bz2(j2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj c8jq(@InterfaceC7396q String string, int i2, int i3, @InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.c8jq(string, i2, i3, charset);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj cfr(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.cfr(i2);
        return eqxt();
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f43729n) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f43730q.size() > 0) {
                vyq vyqVar = this.f43728k;
                x2 x2Var = this.f43730q;
                vyqVar.mo26936j(x2Var, x2Var.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f43728k.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f43729n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.qrj
    public long ek5k(@InterfaceC7396q nn86 source) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        long j2 = 0;
        while (true) {
            long jWx16 = source.wx16(this.f43730q, 8192L);
            if (jWx16 == -1) {
                return j2;
            }
            j2 += jWx16;
            eqxt();
        }
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj eqxt() throws IOException {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        long jFu4 = this.f43730q.fu4();
        if (jFu4 > 0) {
            this.f43728k.mo26936j(this.f43730q, jFu4);
        }
        return this;
    }

    @Override // okio.qrj, okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f43730q.size() > 0) {
            vyq vyqVar = this.f43728k;
            x2 x2Var = this.f43730q;
            vyqVar.mo26936j(x2Var, x2Var.size());
        }
        this.f43728k.flush();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj fn3e() {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.f43730q.size();
        if (size > 0) {
            this.f43728k.mo26936j(this.f43730q, size);
        }
        return this;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public x2 mo27638g() {
        return this.f43730q;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43729n;
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.mo26936j(source, j2);
        eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj jz5(@InterfaceC7396q String string, @InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.jz5(string, charset);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj ktq(@InterfaceC7396q nn86 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        while (j2 > 0) {
            long jWx16 = source.wx16(this.f43730q, j2);
            if (jWx16 == -1) {
                throw new EOFException();
            }
            j2 -= jWx16;
            eqxt();
        }
        return this;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj lrht(@InterfaceC7396q String string) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.lrht(string);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public qrj mo27639m(@InterfaceC7396q String string, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.mo27639m(string, i2, i3);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public x2 mo27640n() {
        return this.f43730q;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj ni7(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.ni7(i2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj o1t(long j2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.o1t(j2);
        return eqxt();
    }

    @InterfaceC7396q
    public String toString() {
        return "buffer(" + this.f43728k + ')';
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43728k.toq();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj uc(@InterfaceC7396q kja0 byteString) {
        kotlin.jvm.internal.d2ok.m23075h(byteString, "byteString");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.uc(byteString);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj wo(@InterfaceC7396q kja0 byteString, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(byteString, "byteString");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.wo(byteString, i2, i3);
        return eqxt();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@InterfaceC7396q ByteBuffer source) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f43730q.write(source);
        eqxt();
        return iWrite;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj writeByte(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.writeByte(i2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj writeInt(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.writeInt(i2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj writeLong(long j2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.writeLong(j2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj writeShort(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.writeShort(i2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj xwq3(long j2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.xwq3(j2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj zsr0(int i2) {
        if (!(!this.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f43730q.zsr0(i2);
        return eqxt();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public OutputStream zwy() {
        return new C7548k();
    }

    /* JADX INFO: renamed from: okio.hyr$k */
    /* JADX INFO: compiled from: RealBufferedSink.kt */
    @lv5({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    public static final class C7548k extends OutputStream {
        C7548k() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            hyr.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            hyr hyrVar = hyr.this;
            if (hyrVar.f43729n) {
                return;
            }
            hyrVar.flush();
        }

        @InterfaceC7396q
        public String toString() {
            return hyr.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            hyr hyrVar = hyr.this;
            if (hyrVar.f43729n) {
                throw new IOException("closed");
            }
            hyrVar.f43730q.writeByte((byte) i2);
            hyr.this.eqxt();
        }

        @Override // java.io.OutputStream
        public void write(@InterfaceC7396q byte[] data, int i2, int i3) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(data, "data");
            hyr hyrVar = hyr.this;
            if (!hyrVar.f43729n) {
                hyrVar.f43730q.write(data, i2, i3);
                hyr.this.eqxt();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj write(@InterfaceC7396q byte[] source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!this.f43729n) {
            this.f43730q.write(source);
            return eqxt();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public qrj write(@InterfaceC7396q byte[] source, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!this.f43729n) {
            this.f43730q.write(source, i2, i3);
            return eqxt();
        }
        throw new IllegalStateException("closed".toString());
    }
}
