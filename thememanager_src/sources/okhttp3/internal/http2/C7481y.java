package okhttp3.internal.http2;

import b7.C1359g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.C6349p;
import kotlin.ranges.fn3e;
import mub.InterfaceC7396q;
import okhttp3.internal.http2.C7476q;
import okio.C7560j;
import okio.kja0;
import okio.nn86;

/* JADX INFO: renamed from: okhttp3.internal.http2.y */
/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7481y implements Closeable {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final Logger f43320s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final k f43321y = new k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final C7476q.k f43322g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final okio.n7h f43323k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final toq f43324n;

    /* JADX INFO: renamed from: q */
    private final boolean f43325q;

    /* JADX INFO: renamed from: okhttp3.internal.http2.y$k */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Logger m27199k() {
            return C7481y.f43320s;
        }

        public final int toq(int i2, int i3, int i4) throws IOException {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.y$toq */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class toq implements nn86 {

        /* JADX INFO: renamed from: g */
        private int f43326g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final okio.n7h f43327k;

        /* JADX INFO: renamed from: n */
        private int f43328n;

        /* JADX INFO: renamed from: q */
        private int f43329q;

        /* JADX INFO: renamed from: s */
        private int f43330s;

        /* JADX INFO: renamed from: y */
        private int f43331y;

        public toq(@InterfaceC7396q okio.n7h source) {
            d2ok.m23075h(source, "source");
            this.f43327k = source;
        }

        private final void ld6() throws IOException {
            int i2 = this.f43326g;
            int iM5750c = C1359g.m5750c(this.f43327k);
            this.f43331y = iM5750c;
            this.f43329q = iM5750c;
            int iM5763q = C1359g.m5763q(this.f43327k.readByte(), 255);
            this.f43328n = C1359g.m5763q(this.f43327k.readByte(), 255);
            k kVar = C7481y.f43321y;
            if (kVar.m27199k().isLoggable(Level.FINE)) {
                kVar.m27199k().fine(C7474n.f43257k.zy(true, this.f43326g, this.f43329q, iM5763q, this.f43328n));
            }
            int i3 = this.f43327k.readInt() & Integer.MAX_VALUE;
            this.f43326g = i3;
            if (iM5763q == 9) {
                if (i3 != i2) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM5763q + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final void fu4(int i2) {
            this.f43330s = i2;
        }

        /* JADX INFO: renamed from: h */
        public final void m27200h(int i2) {
            this.f43331y = i2;
        }

        /* JADX INFO: renamed from: k */
        public final int m27201k() {
            return this.f43328n;
        }

        public final void ki(int i2) {
            this.f43329q = i2;
        }

        /* JADX INFO: renamed from: p */
        public final int m27202p() {
            return this.f43326g;
        }

        /* JADX INFO: renamed from: q */
        public final int m27203q() {
            return this.f43329q;
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43327k.toq();
        }

        public final void wvg(int i2) {
            this.f43326g = i2;
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q okio.x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            while (true) {
                int i2 = this.f43331y;
                if (i2 != 0) {
                    long jWx16 = this.f43327k.wx16(sink, Math.min(j2, i2));
                    if (jWx16 == -1) {
                        return -1L;
                    }
                    this.f43331y -= (int) jWx16;
                    return jWx16;
                }
                this.f43327k.skip(this.f43330s);
                this.f43330s = 0;
                if ((this.f43328n & 4) != 0) {
                    return -1L;
                }
                ld6();
            }
        }

        public final void x2(int i2) {
            this.f43328n = i2;
        }

        /* JADX INFO: renamed from: y */
        public final int m27204y() {
            return this.f43330s;
        }

        public final int zy() {
            return this.f43331y;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.y$zy */
    /* JADX INFO: compiled from: Http2Reader.kt */
    public interface zy {
        void f7l8(boolean z2, int i2, @InterfaceC7396q okio.n7h n7hVar, int i3) throws IOException;

        /* JADX INFO: renamed from: g */
        void mo27128g();

        /* JADX INFO: renamed from: k */
        void mo27129k(boolean z2, @InterfaceC7396q qrj qrjVar);

        void ld6(int i2, @InterfaceC7396q okhttp3.internal.http2.toq toqVar, @InterfaceC7396q kja0 kja0Var);

        /* JADX INFO: renamed from: n */
        void mo27130n(int i2, int i3, @InterfaceC7396q List<okhttp3.internal.http2.zy> list) throws IOException;

        /* JADX INFO: renamed from: p */
        void mo27131p(int i2, @InterfaceC7396q okhttp3.internal.http2.toq toqVar);

        /* JADX INFO: renamed from: q */
        void mo27132q(int i2, @InterfaceC7396q String str, @InterfaceC7396q kja0 kja0Var, @InterfaceC7396q String str2, int i3, long j2);

        /* JADX INFO: renamed from: s */
        void mo27133s(int i2, int i3, int i4, boolean z2);

        void toq(boolean z2, int i2, int i3, @InterfaceC7396q List<okhttp3.internal.http2.zy> list);

        /* JADX INFO: renamed from: y */
        void mo27134y(boolean z2, int i2, int i3);

        void zy(int i2, long j2);
    }

    static {
        Logger logger = Logger.getLogger(C7474n.class.getName());
        d2ok.kja0(logger, "getLogger(Http2::class.java.name)");
        f43320s = logger;
    }

    public C7481y(@InterfaceC7396q okio.n7h source, boolean z2) {
        d2ok.m23075h(source, "source");
        this.f43323k = source;
        this.f43325q = z2;
        toq toqVar = new toq(source);
        this.f43324n = toqVar;
        this.f43322g = new C7476q.k(toqVar, 4096, 0, 4, null);
    }

    private final void d2ok(zy zyVar, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            zyVar.mo27128g();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
        qrj qrjVar = new qrj();
        C6349p c6349pZwy = fn3e.zwy(fn3e.nme(0, i2), 6);
        int iF7l8 = c6349pZwy.f7l8();
        int iM23353y = c6349pZwy.m23353y();
        int iM23352s = c6349pZwy.m23352s();
        if ((iM23352s > 0 && iF7l8 <= iM23353y) || (iM23352s < 0 && iM23353y <= iF7l8)) {
            while (true) {
                int iM5760n = C1359g.m5760n(this.f43323k.readShort(), 65535);
                i5 = this.f43323k.readInt();
                if (iM5760n != 2) {
                    if (iM5760n == 3) {
                        iM5760n = 4;
                    } else if (iM5760n == 4) {
                        iM5760n = 7;
                        if (i5 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (iM5760n == 5 && (i5 < 16384 || i5 > 16777215)) {
                        break;
                    }
                } else if (i5 != 0 && i5 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                qrjVar.ld6(iM5760n, i5);
                if (iF7l8 == iM23353y) {
                    break;
                } else {
                    iF7l8 += iM23352s;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i5);
        }
        zyVar.mo27129k(false, qrjVar);
    }

    private final void fu4(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i2 == 5) {
            if (i4 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            ki(zyVar, i4);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m27193h(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        zyVar.mo27134y((i3 & 1) != 0, this.f43323k.readInt(), this.f43323k.readInt());
    }

    private final void hyr(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
        }
        long jM5753g = C1359g.m5753g(this.f43323k.readInt(), 2147483647L);
        if (jM5753g == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        zyVar.zy(i4, jM5753g);
    }

    private final void ki(zy zyVar, int i2) throws IOException {
        int i3 = this.f43323k.readInt();
        zyVar.mo27133s(i2, i3 & Integer.MAX_VALUE, C1359g.m5763q(this.f43323k.readByte(), 255) + 1, (Integer.MIN_VALUE & i3) != 0);
    }

    private final List<okhttp3.internal.http2.zy> ld6(int i2, int i3, int i4, int i5) throws IOException {
        this.f43324n.m27200h(i2);
        toq toqVar = this.f43324n;
        toqVar.ki(toqVar.zy());
        this.f43324n.fu4(i3);
        this.f43324n.x2(i4);
        this.f43324n.wvg(i5);
        this.f43322g.x2();
        return this.f43322g.m27155n();
    }

    /* JADX INFO: renamed from: p */
    private final void m27195p(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i5 = this.f43323k.readInt();
        int i6 = this.f43323k.readInt();
        int i7 = i2 - 8;
        okhttp3.internal.http2.toq toqVarM27190k = okhttp3.internal.http2.toq.Companion.m27190k(i6);
        if (toqVarM27190k == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i6);
        }
        kja0 kja0VarFnq8 = kja0.EMPTY;
        if (i7 > 0) {
            kja0VarFnq8 = this.f43323k.fnq8(i7);
        }
        zyVar.ld6(i5, toqVarM27190k, kja0VarFnq8);
    }

    /* JADX INFO: renamed from: t */
    private final void m27196t(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i5 = this.f43323k.readInt();
        okhttp3.internal.http2.toq toqVarM27190k = okhttp3.internal.http2.toq.Companion.m27190k(i5);
        if (toqVarM27190k != null) {
            zyVar.mo27131p(i4, toqVarM27190k);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i5);
    }

    private final void wvg(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM5763q = (i3 & 8) != 0 ? C1359g.m5763q(this.f43323k.readByte(), 255) : 0;
        zyVar.mo27130n(i4, this.f43323k.readInt() & Integer.MAX_VALUE, ld6(f43321y.toq(i2 - 4, i3, iM5763q), iM5763q, i3, i4));
    }

    private final void x2(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        int iM5763q = (i3 & 8) != 0 ? C1359g.m5763q(this.f43323k.readByte(), 255) : 0;
        if ((i3 & 32) != 0) {
            ki(zyVar, i4);
            i2 -= 5;
        }
        zyVar.toq(z2, i4, -1, ld6(f43321y.toq(i2, i3, iM5763q), iM5763q, i3, i4));
    }

    /* JADX INFO: renamed from: y */
    private final void m27197y(zy zyVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM5763q = (i3 & 8) != 0 ? C1359g.m5763q(this.f43323k.readByte(), 255) : 0;
        zyVar.f7l8(z2, i4, this.f43323k, f43321y.toq(i2, i3, iM5763q));
        this.f43323k.skip(iM5763q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43323k.close();
    }

    /* JADX INFO: renamed from: q */
    public final void m27198q(@InterfaceC7396q zy handler) throws IOException {
        d2ok.m23075h(handler, "handler");
        if (this.f43325q) {
            if (!zy(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        okio.n7h n7hVar = this.f43323k;
        kja0 kja0Var = C7474n.f93954toq;
        kja0 kja0VarFnq8 = n7hVar.fnq8(kja0Var.size());
        Logger logger = f43320s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C1359g.m5769z("<< CONNECTION " + kja0VarFnq8.hex(), new Object[0]));
        }
        if (d2ok.f7l8(kja0Var, kja0VarFnq8)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + kja0VarFnq8.utf8());
    }

    public final boolean zy(boolean z2, @InterfaceC7396q zy handler) throws IOException {
        d2ok.m23075h(handler, "handler");
        try {
            this.f43323k.dr(9L);
            int iM5750c = C1359g.m5750c(this.f43323k);
            if (iM5750c > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM5750c);
            }
            int iM5763q = C1359g.m5763q(this.f43323k.readByte(), 255);
            int iM5763q2 = C1359g.m5763q(this.f43323k.readByte(), 255);
            int i2 = this.f43323k.readInt() & Integer.MAX_VALUE;
            Logger logger = f43320s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C7474n.f43257k.zy(true, i2, iM5750c, iM5763q, iM5763q2));
            }
            if (z2 && iM5763q != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C7474n.f43257k.toq(iM5763q));
            }
            switch (iM5763q) {
                case 0:
                    m27197y(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 1:
                    x2(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 2:
                    fu4(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 3:
                    m27196t(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 4:
                    d2ok(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 5:
                    wvg(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 6:
                    m27193h(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 7:
                    m27195p(handler, iM5750c, iM5763q2, i2);
                    return true;
                case 8:
                    hyr(handler, iM5750c, iM5763q2, i2);
                    return true;
                default:
                    this.f43323k.skip(iM5750c);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }
}
