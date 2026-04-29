package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.a9;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.http.C7463y;
import okhttp3.internal.http.InterfaceC7461q;
import okhttp3.internal.ws.C7507n;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.ki;
import okio.AbstractC7579z;
import okio.fu4;
import okio.nn86;
import okio.vyq;
import okio.x2;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final C7448g f93890f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f43116g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7450n f43117k;

    /* JADX INFO: renamed from: n */
    private boolean f43118n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final InterfaceC7461q f43119q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final ki f93891toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C7452q f93892zy;

    /* JADX INFO: renamed from: okhttp3.internal.connection.zy$k */
    /* JADX INFO: compiled from: Exchange.kt */
    @lv5({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    private final class C7455k extends fu4 {

        /* JADX INFO: renamed from: g */
        private long f43120g;

        /* JADX INFO: renamed from: n */
        private boolean f43121n;

        /* JADX INFO: renamed from: q */
        private final long f43122q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ zy f43123s;

        /* JADX INFO: renamed from: y */
        private boolean f43124y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7455k(@InterfaceC7396q zy zyVar, vyq delegate, long j2) {
            super(delegate);
            d2ok.m23075h(delegate, "delegate");
            this.f43123s = zyVar;
            this.f43122q = j2;
        }

        /* JADX INFO: renamed from: q */
        private final <E extends IOException> E m27064q(E e2) {
            if (this.f43121n) {
                return e2;
            }
            this.f43121n = true;
            return (E) this.f43123s.m27058k(this.f43120g, false, true, e2);
        }

        @Override // okio.fu4, okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43124y) {
                return;
            }
            this.f43124y = true;
            long j2 = this.f43122q;
            if (j2 != -1 && this.f43120g != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m27064q(null);
            } catch (IOException e2) {
                throw m27064q(e2);
            }
        }

        @Override // okio.fu4, okio.vyq, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw m27064q(e2);
            }
        }

        @Override // okio.fu4, okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            d2ok.m23075h(source, "source");
            if (!(!this.f43124y)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f43122q;
            if (j3 == -1 || this.f43120g + j2 <= j3) {
                try {
                    super.mo26936j(source, j2);
                    this.f43120g += j2;
                    return;
                } catch (IOException e2) {
                    throw m27064q(e2);
                }
            }
            throw new ProtocolException("expected " + this.f43122q + " bytes but received " + (this.f43120g + j2));
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    @lv5({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class toq extends AbstractC7579z {

        /* JADX INFO: renamed from: g */
        private boolean f43125g;

        /* JADX INFO: renamed from: n */
        private long f43126n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ zy f43127p;

        /* JADX INFO: renamed from: q */
        private final long f43128q;

        /* JADX INFO: renamed from: s */
        private boolean f43129s;

        /* JADX INFO: renamed from: y */
        private boolean f43130y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(@InterfaceC7396q zy zyVar, nn86 delegate, long j2) {
            super(delegate);
            d2ok.m23075h(delegate, "delegate");
            this.f43127p = zyVar;
            this.f43128q = j2;
            this.f43125g = true;
            if (j2 == 0) {
                m27065q(null);
            }
        }

        @Override // okio.AbstractC7579z, okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43129s) {
                return;
            }
            this.f43129s = true;
            try {
                super.close();
                m27065q(null);
            } catch (IOException e2) {
                throw m27065q(e2);
            }
        }

        /* JADX INFO: renamed from: q */
        public final <E extends IOException> E m27065q(E e2) {
            if (this.f43130y) {
                return e2;
            }
            this.f43130y = true;
            if (e2 == null && this.f43125g) {
                this.f43125g = false;
                this.f43127p.m27062s().ni7(this.f43127p.f7l8());
            }
            return (E) this.f43127p.m27058k(this.f43126n, true, false, e2);
        }

        @Override // okio.AbstractC7579z, okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            if (!(!this.f43129s)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jWx16 = zy().wx16(sink, j2);
                if (this.f43125g) {
                    this.f43125g = false;
                    this.f43127p.m27062s().ni7(this.f43127p.f7l8());
                }
                if (jWx16 == -1) {
                    m27065q(null);
                    return -1L;
                }
                long j3 = this.f43126n + jWx16;
                long j4 = this.f43128q;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f43128q + " bytes but received " + j3);
                }
                this.f43126n = j3;
                if (j3 == j4) {
                    m27065q(null);
                }
                return jWx16;
            } catch (IOException e2) {
                throw m27065q(e2);
            }
        }
    }

    public zy(@InterfaceC7396q C7450n call, @InterfaceC7396q ki eventListener, @InterfaceC7396q C7452q finder, @InterfaceC7396q InterfaceC7461q codec) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(eventListener, "eventListener");
        d2ok.m23075h(finder, "finder");
        d2ok.m23075h(codec, "codec");
        this.f43117k = call;
        this.f93891toq = eventListener;
        this.f93892zy = finder;
        this.f43119q = codec;
        this.f93890f7l8 = codec.zy();
    }

    private final void fn3e(IOException iOException) {
        this.f43116g = true;
        this.f93892zy.m27052y(iOException);
        this.f43119q.zy().d2ok(this.f43117k, iOException);
    }

    @InterfaceC7396q
    public final jp0y cdj(@InterfaceC7396q fti response) throws IOException {
        d2ok.m23075h(response, "response");
        try {
            String strG1 = fti.g1(response, com.google.common.net.zy.f68571zy, null, 2, null);
            long jMo27090q = this.f43119q.mo27090q(response);
            return new C7463y(strG1, jMo27090q, okio.d2ok.m27592n(new toq(this, this.f43119q.toq(response), jMo27090q)));
        } catch (IOException e2) {
            this.f93891toq.fu4(this.f43117k, e2);
            fn3e(e2);
            throw e2;
        }
    }

    @InterfaceC7396q
    public final C7450n f7l8() {
        return this.f43117k;
    }

    public final void fu4(@InterfaceC7396q jk request) throws IOException {
        d2ok.m23075h(request, "request");
        try {
            this.f93891toq.fn3e(this.f43117k);
            this.f43119q.mo27087g(request);
            this.f93891toq.mo27348i(this.f43117k, request);
        } catch (IOException e2) {
            this.f93891toq.t8r(this.f43117k, e2);
            fn3e(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m27055g() throws IOException {
        try {
            this.f43119q.mo27092y();
        } catch (IOException e2) {
            this.f93891toq.t8r(this.f43117k, e2);
            fn3e(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m27056h() {
        this.f43117k.o1t(this, true, false, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m27057i() {
        this.f93891toq.o1t(this.f43117k);
    }

    /* JADX INFO: renamed from: k */
    public final <E extends IOException> E m27058k(long j2, boolean z2, boolean z3, E e2) {
        if (e2 != null) {
            fn3e(e2);
        }
        if (z3) {
            if (e2 != null) {
                this.f93891toq.t8r(this.f43117k, e2);
            } else {
                this.f93891toq.cdj(this.f43117k, j2);
            }
        }
        if (z2) {
            if (e2 != null) {
                this.f93891toq.fu4(this.f43117k, e2);
            } else {
                this.f93891toq.zurt(this.f43117k, j2);
            }
        }
        return (E) this.f43117k.o1t(this, z3, z2, e2);
    }

    @InterfaceC7395n
    public final fti.C7433k ki(boolean z2) throws IOException {
        try {
            fti.C7433k c7433kF7l8 = this.f43119q.f7l8(z2);
            if (c7433kF7l8 != null) {
                c7433kF7l8.fu4(this);
            }
            return c7433kF7l8;
        } catch (IOException e2) {
            this.f93891toq.fu4(this.f43117k, e2);
            fn3e(e2);
            throw e2;
        }
    }

    public final void kja0() {
        this.f43119q.zy().a9();
    }

    public final boolean ld6() {
        return this.f43116g;
    }

    /* JADX INFO: renamed from: n */
    public final void m27059n() throws IOException {
        try {
            this.f43119q.mo27088k();
        } catch (IOException e2) {
            this.f93891toq.t8r(this.f43117k, e2);
            fn3e(e2);
            throw e2;
        }
    }

    @InterfaceC7396q
    public final C7507n.q n7h() throws SocketException {
        this.f43117k.jp0y();
        return this.f43119q.zy().mcp(this);
    }

    public final void ni7() {
        m27058k(-1L, true, true, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final C7452q m27060p() {
        return this.f93892zy;
    }

    /* JADX INFO: renamed from: q */
    public final void m27061q() {
        this.f43119q.cancel();
        this.f43117k.o1t(this, true, true, null);
    }

    public final boolean qrj() {
        return this.f43118n;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final ki m27062s() {
        return this.f93891toq;
    }

    public final void t8r(@InterfaceC7396q fti response) {
        d2ok.m23075h(response, "response");
        this.f93891toq.mo27356z(this.f43117k, response);
    }

    public final void toq() {
        this.f43119q.cancel();
    }

    public final boolean x2() {
        return !d2ok.f7l8(this.f93892zy.m27051q().ni7().fti(), this.f93890f7l8.toq().m26913q().ni7().fti());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final C7448g m27063y() {
        return this.f93890f7l8;
    }

    @InterfaceC7396q
    public final fn3e zurt() throws IOException {
        return this.f43119q.mo27091s();
    }

    @InterfaceC7396q
    public final vyq zy(@InterfaceC7396q jk request, boolean z2) throws IOException {
        d2ok.m23075h(request, "request");
        this.f43118n = z2;
        a9 a9VarM27305g = request.m27305g();
        d2ok.qrj(a9VarM27305g);
        long jMo26833k = a9VarM27305g.mo26833k();
        this.f93891toq.ki(this.f43117k);
        return new C7455k(this, this.f43119q.mo27089n(request, jMo26833k), jMo26833k);
    }
}
