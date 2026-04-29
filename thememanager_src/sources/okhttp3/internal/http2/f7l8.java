package okhttp3.internal.http2;

import b7.C1359g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.connection.C7448g;
import okhttp3.internal.http.C7459n;
import okhttp3.internal.http.C7462s;
import okhttp3.internal.http.InterfaceC7461q;
import okhttp3.jk;
import okhttp3.mcp;
import okio.C7560j;
import okio.nn86;
import okio.vyq;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f7l8 implements InterfaceC7461q {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93918ld6 = "host";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final mcp f93923f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private volatile C7478s f43186g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final C7471g f43187n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final okhttp3.internal.http.f7l8 f43188q;

    /* JADX INFO: renamed from: y */
    private volatile boolean f43189y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C7448g f93924zy;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final C7470k f43185s = new C7470k(null);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final String f43184p = "connection";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93922x2 = "keep-alive";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93920qrj = "proxy-connection";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93917kja0 = "te";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93919n7h = "transfer-encoding";

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private static final String f43183h = "encoding";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93915cdj = "upgrade";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @InterfaceC7396q
    private static final List<String> f93916ki = C1359g.mcp(f43184p, "host", f93922x2, f93920qrj, f93917kja0, f93919n7h, f43183h, f93915cdj, zy.f93980f7l8, zy.f43337y, zy.f43336s, zy.f43334p);

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @InterfaceC7396q
    private static final List<String> f93921t8r = C1359g.mcp(f43184p, "host", f93922x2, f93920qrj, f93917kja0, f93919n7h, f43183h, f93915cdj);

    /* JADX INFO: renamed from: okhttp3.internal.http2.f7l8$k */
    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    public static final class C7470k {
        private C7470k() {
        }

        public /* synthetic */ C7470k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final List<zy> m27108k(@InterfaceC7396q jk request) {
            d2ok.m23075h(request, "request");
            fn3e fn3eVarLd6 = request.ld6();
            ArrayList arrayList = new ArrayList(fn3eVarLd6.size() + 4);
            arrayList.add(new zy(zy.f93985x2, request.qrj()));
            arrayList.add(new zy(zy.f93984qrj, C7462s.f43150k.zy(request.cdj())));
            String strM27311s = request.m27311s(com.google.common.net.zy.f68570zurt);
            if (strM27311s != null) {
                arrayList.add(new zy(zy.f93981kja0, strM27311s));
            }
            arrayList.add(new zy(zy.f93983n7h, request.cdj().uv6()));
            int size = fn3eVarLd6.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strM26864y = fn3eVarLd6.m26864y(i2);
                Locale US = Locale.US;
                d2ok.kja0(US, "US");
                String lowerCase = strM26864y.toLowerCase(US);
                d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!f7l8.f93916ki.contains(lowerCase) || (d2ok.f7l8(lowerCase, f7l8.f93917kja0) && d2ok.f7l8(fn3eVarLd6.n7h(i2), "trailers"))) {
                    arrayList.add(new zy(lowerCase, fn3eVarLd6.n7h(i2)));
                }
            }
            return arrayList;
        }

        @InterfaceC7396q
        public final fti.C7433k toq(@InterfaceC7396q fn3e headerBlock, @InterfaceC7396q mcp protocol) throws IOException {
            d2ok.m23075h(headerBlock, "headerBlock");
            d2ok.m23075h(protocol, "protocol");
            fn3e.C7432k c7432k = new fn3e.C7432k();
            int size = headerBlock.size();
            okhttp3.internal.http.ld6 qVar = null;
            for (int i2 = 0; i2 < size; i2++) {
                String strM26864y = headerBlock.m26864y(i2);
                String strN7h = headerBlock.n7h(i2);
                if (d2ok.f7l8(strM26864y, zy.f43332g)) {
                    qVar = okhttp3.internal.http.ld6.f43141q.toq("HTTP/1.1 " + strN7h);
                } else if (!f7l8.f93921t8r.contains(strM26864y)) {
                    c7432k.f7l8(strM26864y, strN7h);
                }
            }
            if (qVar != null) {
                return new fti.C7433k().m26898t(protocol).f7l8(qVar.f93897toq).m26900z(qVar.f93898zy).ni7(c7432k.m26870s());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public f7l8(@InterfaceC7396q C7529t client, @InterfaceC7396q C7448g connection, @InterfaceC7396q okhttp3.internal.http.f7l8 chain, @InterfaceC7396q C7471g http2Connection) {
        d2ok.m23075h(client, "client");
        d2ok.m23075h(connection, "connection");
        d2ok.m23075h(chain, "chain");
        d2ok.m23075h(http2Connection, "http2Connection");
        this.f93924zy = connection;
        this.f43188q = chain;
        this.f43187n = http2Connection;
        List<mcp> listY9n = client.y9n();
        mcp mcpVar = mcp.H2_PRIOR_KNOWLEDGE;
        this.f93923f7l8 = listY9n.contains(mcpVar) ? mcpVar : mcp.HTTP_2;
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    public void cancel() {
        this.f43189y = true;
        C7478s c7478s = this.f43186g;
        if (c7478s != null) {
            c7478s.m27170g(toq.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7395n
    public fti.C7433k f7l8(boolean z2) throws IOException {
        C7478s c7478s = this.f43186g;
        if (c7478s == null) {
            throw new IOException("stream wasn't created");
        }
        fti.C7433k qVar = f43185s.toq(c7478s.gvn7(), this.f93923f7l8);
        if (z2 && qVar.m26894p() == 100) {
            return null;
        }
        return qVar;
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: g */
    public void mo27087g(@InterfaceC7396q jk request) throws IOException {
        d2ok.m23075h(request, "request");
        if (this.f43186g != null) {
            return;
        }
        this.f43186g = this.f43187n.lw(f43185s.m27108k(request), request.m27305g() != null);
        if (this.f43189y) {
            C7478s c7478s = this.f43186g;
            d2ok.qrj(c7478s);
            c7478s.m27170g(toq.CANCEL);
            throw new IOException("Canceled");
        }
        C7478s c7478s2 = this.f43186g;
        d2ok.qrj(c7478s2);
        C7560j c7560jFu4 = c7478s2.fu4();
        long jKja0 = this.f43188q.kja0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7560jFu4.mo27758p(jKja0, timeUnit);
        C7478s c7478s3 = this.f43186g;
        d2ok.qrj(c7478s3);
        c7478s3.d2ok().mo27758p(this.f43188q.cdj(), timeUnit);
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: k */
    public void mo27088k() throws IOException {
        C7478s c7478s = this.f43186g;
        d2ok.qrj(c7478s);
        c7478s.kja0().close();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27089n(@InterfaceC7396q jk request, long j2) {
        d2ok.m23075h(request, "request");
        C7478s c7478s = this.f43186g;
        d2ok.qrj(c7478s);
        return c7478s.kja0();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: q */
    public long mo27090q(@InterfaceC7396q fti response) {
        d2ok.m23075h(response, "response");
        if (C7459n.zy(response)) {
            return C1359g.wvg(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public fn3e mo27091s() {
        C7478s c7478s = this.f43186g;
        d2ok.qrj(c7478s);
        return c7478s.d3();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    public nn86 toq(@InterfaceC7396q fti response) {
        d2ok.m23075h(response, "response");
        C7478s c7478s = this.f43186g;
        d2ok.qrj(c7478s);
        return c7478s.ki();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    /* JADX INFO: renamed from: y */
    public void mo27092y() throws IOException {
        this.f43187n.flush();
    }

    @Override // okhttp3.internal.http.InterfaceC7461q
    @InterfaceC7396q
    public C7448g zy() {
        return this.f93924zy;
    }
}
