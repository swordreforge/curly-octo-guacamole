package okhttp3.internal.http2;

import b7.C1359g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.http2.C7476q;

/* JADX INFO: renamed from: okhttp3.internal.http2.p */
/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class C7475p implements Closeable {

    /* JADX INFO: renamed from: g */
    private int f43265g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final okio.qrj f43266k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final okio.x2 f43267n;

    /* JADX INFO: renamed from: q */
    private final boolean f43268q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final C7476q.toq f43269s;

    /* JADX INFO: renamed from: y */
    private boolean f43270y;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final k f43264p = new k(null);

    /* JADX INFO: renamed from: h */
    private static final Logger f43263h = Logger.getLogger(C7474n.class.getName());

    /* JADX INFO: renamed from: okhttp3.internal.http2.p$k */
    /* JADX INFO: compiled from: Http2Writer.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C7475p(@InterfaceC7396q okio.qrj sink, boolean z2) {
        d2ok.m23075h(sink, "sink");
        this.f43266k = sink;
        this.f43268q = z2;
        okio.x2 x2Var = new okio.x2();
        this.f43267n = x2Var;
        this.f43265g = 16384;
        this.f43269s = new C7476q.toq(0, false, x2Var, 3, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m27140f(int i2, long j2) throws IOException {
        while (j2 > 0) {
            long jMin = Math.min(this.f43265g, j2);
            j2 -= jMin;
            m27143p(i2, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.f43266k.mo26936j(this.f43267n, jMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f43270y = true;
        this.f43266k.close();
    }

    public final synchronized void d2ok(@InterfaceC7396q qrj settings) throws IOException {
        d2ok.m23075h(settings, "settings");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m27143p(0, settings.x2() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.m27167s(i2)) {
                this.f43266k.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                this.f43266k.writeInt(settings.toq(i2));
            }
            i2++;
        }
        this.f43266k.flush();
    }

    public final synchronized void flush() throws IOException {
        if (this.f43270y) {
            throw new IOException("closed");
        }
        this.f43266k.flush();
    }

    public final synchronized void fu4(boolean z2, int i2, int i3) throws IOException {
        if (this.f43270y) {
            throw new IOException("closed");
        }
        m27143p(0, 8, 6, z2 ? 1 : 0);
        this.f43266k.writeInt(i2);
        this.f43266k.writeInt(i3);
        this.f43266k.flush();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m27141h(boolean z2, int i2, @InterfaceC7396q List<zy> headerBlock) throws IOException {
        d2ok.m23075h(headerBlock, "headerBlock");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        this.f43269s.f7l8(headerBlock);
        long size = this.f43267n.size();
        long jMin = Math.min(this.f43265g, size);
        int i3 = size == jMin ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        m27143p(i2, (int) jMin, 1, i3);
        this.f43266k.mo26936j(this.f43267n, jMin);
        if (size > jMin) {
            m27140f(i2, size - jMin);
        }
    }

    public final synchronized void hyr(int i2, long j2) throws IOException {
        if (this.f43270y) {
            throw new IOException("closed");
        }
        if (!(j2 != 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        m27143p(i2, 4, 8, 0);
        this.f43266k.writeInt((int) j2);
        this.f43266k.flush();
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m27142k(@InterfaceC7396q qrj peerSettings) throws IOException {
        d2ok.m23075h(peerSettings, "peerSettings");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        this.f43265g = peerSettings.f7l8(this.f43265g);
        if (peerSettings.m27166q() != -1) {
            this.f43269s.m27160n(peerSettings.m27166q());
        }
        m27143p(0, 0, 4, 1);
        this.f43266k.flush();
    }

    public final int ki() {
        return this.f43265g;
    }

    @InterfaceC7396q
    public final C7476q.toq ld6() {
        return this.f43269s;
    }

    /* JADX INFO: renamed from: p */
    public final void m27143p(int i2, int i3, int i4, int i5) throws IOException {
        Logger logger = f43263h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C7474n.f43257k.zy(false, i2, i3, i4, i5));
        }
        if (!(i3 <= this.f43265g)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f43265g + ": " + i3).toString());
        }
        if (!((Integer.MIN_VALUE & i2) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i2).toString());
        }
        C1359g.ch(this.f43266k, i3);
        this.f43266k.writeByte(i4 & 255);
        this.f43266k.writeByte(i5 & 255);
        this.f43266k.writeInt(i2 & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m27144q(boolean z2, int i2, @InterfaceC7395n okio.x2 x2Var, int i3) throws IOException {
        if (this.f43270y) {
            throw new IOException("closed");
        }
        m27146y(i2, z2 ? 1 : 0, x2Var, i3);
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m27145t(int i2, @InterfaceC7396q toq errorCode) throws IOException {
        d2ok.m23075h(errorCode, "errorCode");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m27143p(i2, 4, 3, 0);
        this.f43266k.writeInt(errorCode.getHttpCode());
        this.f43266k.flush();
    }

    public final synchronized void wvg(int i2, int i3, @InterfaceC7396q List<zy> requestHeaders) throws IOException {
        d2ok.m23075h(requestHeaders, "requestHeaders");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        this.f43269s.f7l8(requestHeaders);
        long size = this.f43267n.size();
        int iMin = (int) Math.min(((long) this.f43265g) - 4, size);
        long j2 = iMin;
        m27143p(i2, iMin + 4, 5, size == j2 ? 4 : 0);
        this.f43266k.writeInt(i3 & Integer.MAX_VALUE);
        this.f43266k.mo26936j(this.f43267n, j2);
        if (size > j2) {
            m27140f(i2, size - j2);
        }
    }

    public final synchronized void x2(int i2, @InterfaceC7396q toq errorCode, @InterfaceC7396q byte[] debugData) throws IOException {
        d2ok.m23075h(errorCode, "errorCode");
        d2ok.m23075h(debugData, "debugData");
        if (this.f43270y) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m27143p(0, debugData.length + 8, 7, 0);
        this.f43266k.writeInt(i2);
        this.f43266k.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.f43266k.write(debugData);
        }
        this.f43266k.flush();
    }

    /* JADX INFO: renamed from: y */
    public final void m27146y(int i2, int i3, @InterfaceC7395n okio.x2 x2Var, int i4) throws IOException {
        m27143p(i2, i4, 0, i3);
        if (i4 > 0) {
            okio.qrj qrjVar = this.f43266k;
            d2ok.qrj(x2Var);
            qrjVar.mo26936j(x2Var, i4);
        }
    }

    public final synchronized void zy() throws IOException {
        if (this.f43270y) {
            throw new IOException("closed");
        }
        if (this.f43268q) {
            Logger logger = f43263h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C1359g.m5769z(">> CONNECTION " + C7474n.f93954toq.hex(), new Object[0]));
            }
            this.f43266k.uc(C7474n.f93954toq);
            this.f43266k.flush();
        }
    }
}
