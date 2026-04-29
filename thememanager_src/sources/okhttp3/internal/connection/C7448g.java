package okhttp3.internal.connection;

import b7.C1359g;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.fu4;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import le7.C6773q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7437i;
import okhttp3.C7514k;
import okhttp3.C7529t;
import okhttp3.InterfaceC7519n;
import okhttp3.InterfaceC7525p;
import okhttp3.fti;
import okhttp3.gvn7;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.http.InterfaceC7461q;
import okhttp3.internal.http2.C7471g;
import okhttp3.internal.http2.C7472k;
import okhttp3.internal.http2.C7478s;
import okhttp3.internal.platform.C7498p;
import okhttp3.internal.ws.C7507n;
import okhttp3.jk;
import okhttp3.ki;
import okhttp3.mcp;
import okhttp3.x2;
import okhttp3.zurt;
import okio.C7560j;
import okio.n7h;
import okio.qrj;

/* JADX INFO: renamed from: okhttp3.internal.connection.g */
/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class C7448g extends C7471g.zy implements InterfaceC7525p {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93868fn3e = "throw with null exception";

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    public static final k f43065i = new k(null);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final long f93869ni7 = 10000000000L;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f93870zurt = 21;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f93871cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private C7437i f93872f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private Socket f43066g;

    /* JADX INFO: renamed from: h */
    private int f43067h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @InterfaceC7396q
    private final List<Reference<C7450n>> f93873ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f93874kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7395n
    private qrj f93875ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private Socket f43068n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f93876n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private n7h f43069p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final gvn7 f43070q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f93877qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private C7471g f43071s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f93878t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f93879x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private mcp f43072y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final f7l8 f93880zy;

    /* JADX INFO: renamed from: okhttp3.internal.connection.g$k */
    /* JADX INFO: compiled from: RealConnection.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7448g m27026k(@InterfaceC7396q f7l8 connectionPool, @InterfaceC7396q gvn7 route, @InterfaceC7396q Socket socket, long j2) {
            d2ok.m23075h(connectionPool, "connectionPool");
            d2ok.m23075h(route, "route");
            d2ok.m23075h(socket, "socket");
            C7448g c7448g = new C7448g(connectionPool, route);
            c7448g.f43066g = socket;
            c7448g.jp0y(j2);
            return c7448g;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.g$n */
    /* JADX INFO: compiled from: RealConnection.kt */
    public static final class n extends C7507n.q {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ okhttp3.internal.connection.zy f43073g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(n7h n7hVar, qrj qrjVar, okhttp3.internal.connection.zy zyVar) {
            super(true, n7hVar, qrjVar);
            this.f43073g = zyVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f43073g.m27058k(-1L, true, true, null);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.g$q */
    /* JADX INFO: compiled from: RealConnection.kt */
    @lv5({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
    static final class q extends AbstractC6308r implements InterfaceC5981k<List<? extends X509Certificate>> {
        q() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final List<? extends X509Certificate> invoke() {
            C7437i c7437i = C7448g.this.f93872f7l8;
            d2ok.qrj(c7437i);
            List<Certificate> listQrj = c7437i.qrj();
            ArrayList arrayList = new ArrayList(fu4.vyq(listQrj, 10));
            for (Certificate certificate : listQrj) {
                d2ok.n7h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.g$toq */
    /* JADX INFO: compiled from: RealConnection.kt */
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f43074k;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43074k = iArr;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.g$zy */
    /* JADX INFO: compiled from: RealConnection.kt */
    static final class zy extends AbstractC6308r implements InterfaceC5981k<List<? extends Certificate>> {
        final /* synthetic */ C7514k $address;
        final /* synthetic */ okhttp3.f7l8 $certificatePinner;
        final /* synthetic */ C7437i $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(okhttp3.f7l8 f7l8Var, C7437i c7437i, C7514k c7514k) {
            super(0);
            this.$certificatePinner = f7l8Var;
            this.$unverifiedHandshake = c7437i;
            this.$address = c7514k;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final List<? extends Certificate> invoke() {
            le7.zy zyVarM26852n = this.$certificatePinner.m26852n();
            d2ok.qrj(zyVarM26852n);
            return zyVarM26852n.mo24707k(this.$unverifiedHandshake.qrj(), this.$address.ni7().fti());
        }
    }

    public C7448g(@InterfaceC7396q f7l8 connectionPool, @InterfaceC7396q gvn7 route) {
        d2ok.m23075h(connectionPool, "connectionPool");
        d2ok.m23075h(route, "route");
        this.f93880zy = connectionPool;
        this.f43070q = route;
        this.f93871cdj = 1;
        this.f93873ki = new ArrayList();
        this.f93878t8r = Long.MAX_VALUE;
    }

    private final jk cdj() throws IOException {
        jk qVar = new jk.C7511k().jk(this.f43070q.m26913q().ni7()).m27314h("CONNECT", null).n7h(com.google.common.net.zy.f68570zurt, C1359g.ek5k(this.f43070q.m26913q().ni7(), true)).n7h("Proxy-Connection", "Keep-Alive").n7h("User-Agent", C1359g.f7242p).toq();
        jk jkVarMo22402k = this.f43070q.m26913q().t8r().mo22402k(this.f43070q, new fti.C7433k().a9(qVar).m26898t(mcp.HTTP_1_1).f7l8(407).m26900z("Preemptive Authenticate").toq(C1359g.f53993zy).fti(-1L).mcp(-1L).zurt(com.google.common.net.zy.f68496ch, "OkHttp-Preemptive").zy());
        return jkVarMo22402k == null ? qVar : jkVarMo22402k;
    }

    private final boolean eqxt(zurt zurtVar) {
        C7437i c7437i;
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        zurt zurtVarNi7 = this.f43070q.m26913q().ni7();
        if (zurtVar.m27520r() != zurtVarNi7.m27520r()) {
            return false;
        }
        if (d2ok.f7l8(zurtVar.fti(), zurtVarNi7.fti())) {
            return true;
        }
        if (this.f93877qrj || (c7437i = this.f93872f7l8) == null) {
            return false;
        }
        d2ok.qrj(c7437i);
        return m27016p(zurtVar, c7437i);
    }

    private final boolean fti(List<gvn7> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (gvn7 gvn7Var : list) {
                if (gvn7Var.m26912n().type() == Proxy.Type.DIRECT && this.f43070q.m26912n().type() == Proxy.Type.DIRECT && d2ok.f7l8(this.f43070q.f7l8(), gvn7Var.f7l8())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private final jk m27015h(int i2, int i3, jk jkVar, zurt zurtVar) throws IOException {
        String str = "CONNECT " + C1359g.ek5k(zurtVar, true) + " HTTP/1.1";
        while (true) {
            n7h n7hVar = this.f43069p;
            d2ok.qrj(n7hVar);
            qrj qrjVar = this.f93875ld6;
            d2ok.qrj(qrjVar);
            okhttp3.internal.http1.toq toqVar = new okhttp3.internal.http1.toq(null, this, n7hVar, qrjVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            n7hVar.toq().mo27758p(i2, timeUnit);
            qrjVar.toq().mo27758p(i3, timeUnit);
            toqVar.mcp(jkVar.ld6(), str);
            toqVar.mo27088k();
            fti.C7433k c7433kF7l8 = toqVar.f7l8(false);
            d2ok.qrj(c7433kF7l8);
            fti ftiVarZy = c7433kF7l8.a9(jkVar).zy();
            toqVar.m27102t(ftiVarZy);
            int iI1 = ftiVarZy.i1();
            if (iI1 == 200) {
                if (n7hVar.mo27611g().py() && qrjVar.mo27638g().py()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iI1 != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + ftiVarZy.i1());
            }
            jk jkVarMo22402k = this.f43070q.m26913q().t8r().mo22402k(this.f43070q, ftiVarZy);
            if (jkVarMo22402k == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (a9.e5("close", fti.g1(ftiVarZy, com.google.common.net.zy.f68524kja0, null, 2, null), true)) {
                return jkVarMo22402k;
            }
            jkVar = jkVarMo22402k;
        }
    }

    private final void ki(okhttp3.internal.connection.toq toqVar, int i2, InterfaceC7519n interfaceC7519n, ki kiVar) throws Throwable {
        if (this.f43070q.m26913q().zurt() != null) {
            kiVar.mcp(interfaceC7519n);
            n7h(toqVar);
            kiVar.mo27354t(interfaceC7519n, this.f93872f7l8);
            if (this.f43072y == mcp.HTTP_2) {
                oc(i2);
                return;
            }
            return;
        }
        List<mcp> listCdj = this.f43070q.m26913q().cdj();
        mcp mcpVar = mcp.H2_PRIOR_KNOWLEDGE;
        if (!listCdj.contains(mcpVar)) {
            this.f43066g = this.f43068n;
            this.f43072y = mcp.HTTP_1_1;
        } else {
            this.f43066g = this.f43068n;
            this.f43072y = mcpVar;
            oc(i2);
        }
    }

    private final void kja0(int i2, int i3, int i4, InterfaceC7519n interfaceC7519n, ki kiVar) throws IOException {
        jk jkVarCdj = cdj();
        zurt zurtVarCdj = jkVarCdj.cdj();
        for (int i5 = 0; i5 < 21; i5++) {
            qrj(i2, i3, interfaceC7519n, kiVar);
            jkVarCdj = m27015h(i3, i4, jkVarCdj, zurtVarCdj);
            if (jkVarCdj == null) {
                return;
            }
            Socket socket = this.f43068n;
            if (socket != null) {
                C1359g.cdj(socket);
            }
            this.f43068n = null;
            this.f93875ld6 = null;
            this.f43069p = null;
            kiVar.mo27355y(interfaceC7519n, this.f43070q.f7l8(), this.f43070q.m26912n(), null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void n7h(okhttp3.internal.connection.toq toqVar) throws Throwable {
        SSLSocket sSLSocket;
        C7514k c7514kM26913q = this.f43070q.m26913q();
        SSLSocketFactory sSLSocketFactoryZurt = c7514kM26913q.zurt();
        SSLSocket sSLSocket2 = null;
        try {
            d2ok.qrj(sSLSocketFactoryZurt);
            Socket socketCreateSocket = sSLSocketFactoryZurt.createSocket(this.f43068n, c7514kM26913q.ni7().fti(), c7514kM26913q.ni7().m27520r(), true);
            d2ok.n7h(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            x2 x2VarM27053k = toqVar.m27053k(sSLSocket);
            if (x2VarM27053k.ld6()) {
                C7498p.f43366k.f7l8().mo27232g(sSLSocket, c7514kM26913q.ni7().fti(), c7514kM26913q.cdj());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            C7437i.k kVar = C7437i.f42962n;
            d2ok.kja0(sslSocketSession, "sslSocketSession");
            C7437i qVar = kVar.toq(sslSocketSession);
            HostnameVerifier hostnameVerifierM27338h = c7514kM26913q.m27338h();
            d2ok.qrj(hostnameVerifierM27338h);
            if (hostnameVerifierM27338h.verify(c7514kM26913q.ni7().fti(), sslSocketSession)) {
                okhttp3.f7l8 f7l8VarX2 = c7514kM26913q.x2();
                d2ok.qrj(f7l8VarX2);
                this.f93872f7l8 = new C7437i(qVar.kja0(), qVar.f7l8(), qVar.ld6(), new zy(f7l8VarX2, qVar, c7514kM26913q));
                f7l8VarX2.zy(c7514kM26913q.ni7().fti(), new q());
                String strMo27233p = x2VarM27053k.ld6() ? C7498p.f43366k.f7l8().mo27233p(sSLSocket) : null;
                this.f43066g = sSLSocket;
                this.f43069p = okio.d2ok.m27592n(okio.d2ok.zurt(sSLSocket));
                this.f93875ld6 = okio.d2ok.m27594q(okio.d2ok.cdj(sSLSocket));
                this.f43072y = strMo27233p != null ? mcp.Companion.m27366k(strMo27233p) : mcp.HTTP_1_1;
                C7498p.f43366k.f7l8().zy(sSLSocket);
                return;
            }
            List<Certificate> listQrj = qVar.qrj();
            if (!(!listQrj.isEmpty())) {
                throw new SSLPeerUnverifiedException("Hostname " + c7514kM26913q.ni7().fti() + " not verified (no certificates)");
            }
            Certificate certificate = listQrj.get(0);
            d2ok.n7h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(kotlin.text.fu4.ki("\n              |Hostname " + c7514kM26913q.ni7().fti() + " not verified:\n              |    certificate: " + okhttp3.f7l8.f93817zy.m26856k(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C6773q.f37603k.m24712k(x509Certificate) + "\n              ", null, 1, null));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C7498p.f43366k.f7l8().zy(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                C1359g.cdj(sSLSocket2);
            }
            throw th;
        }
    }

    private final void oc(int i2) throws IOException {
        Socket socket = this.f43066g;
        d2ok.qrj(socket);
        n7h n7hVar = this.f43069p;
        d2ok.qrj(n7hVar);
        qrj qrjVar = this.f93875ld6;
        d2ok.qrj(qrjVar);
        socket.setSoTimeout(0);
        C7471g c7471gM27121k = new C7471g.k(true, C7445q.f43045s).m27127z(socket, this.f43070q.m26913q().ni7().fti(), n7hVar, qrjVar).ld6(this).x2(i2).m27121k();
        this.f43071s = c7471gM27121k;
        this.f93871cdj = C7471g.bp.m27135k().m27162g();
        C7471g.ra(c7471gM27121k, false, null, 3, null);
    }

    /* JADX INFO: renamed from: p */
    private final boolean m27016p(zurt zurtVar, C7437i c7437i) {
        List<Certificate> listQrj = c7437i.qrj();
        if (!listQrj.isEmpty()) {
            C6773q c6773q = C6773q.f37603k;
            String strFti = zurtVar.fti();
            Certificate certificate = listQrj.get(0);
            d2ok.n7h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (c6773q.m24713n(strFti, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void qrj(int i2, int i3, InterfaceC7519n interfaceC7519n, ki kiVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM26912n = this.f43070q.m26912n();
        C7514k c7514kM26913q = this.f43070q.m26913q();
        Proxy.Type type = proxyM26912n.type();
        int i4 = type == null ? -1 : toq.f43074k[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socketCreateSocket = c7514kM26913q.fn3e().createSocket();
            d2ok.qrj(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyM26912n);
        }
        this.f43068n = socketCreateSocket;
        kiVar.mo27351p(interfaceC7519n, this.f43070q.f7l8(), proxyM26912n);
        socketCreateSocket.setSoTimeout(i3);
        try {
            C7498p.f43366k.f7l8().f7l8(socketCreateSocket, this.f43070q.f7l8(), i2);
            try {
                this.f43069p = okio.d2ok.m27592n(okio.d2ok.zurt(socketCreateSocket));
                this.f93875ld6 = okio.d2ok.m27594q(okio.d2ok.cdj(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (d2ok.f7l8(e2.getMessage(), f93868fn3e)) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f43070q.f7l8());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final synchronized void a9() {
        this.f93879x2 = true;
    }

    public final synchronized void d2ok(@InterfaceC7396q C7450n call, @InterfaceC7395n IOException iOException) {
        d2ok.m23075h(call, "call");
        if (iOException instanceof okhttp3.internal.http2.n7h) {
            if (((okhttp3.internal.http2.n7h) iOException).errorCode == okhttp3.internal.http2.toq.REFUSED_STREAM) {
                int i2 = this.f43067h + 1;
                this.f43067h = i2;
                if (i2 > 1) {
                    this.f93879x2 = true;
                    this.f93876n7h++;
                }
            } else if (((okhttp3.internal.http2.n7h) iOException).errorCode != okhttp3.internal.http2.toq.CANCEL || !call.x2()) {
                this.f93879x2 = true;
                this.f93876n7h++;
            }
        } else if (!wvg() || (iOException instanceof C7472k)) {
            this.f93879x2 = true;
            if (this.f93874kja0 == 0) {
                if (iOException != null) {
                    x2(call.cdj(), this.f43070q, iOException);
                }
                this.f93876n7h++;
            }
        }
    }

    public final void d3(int i2) {
        this.f93876n7h = i2;
    }

    public final long fn3e() {
        return this.f93878t8r;
    }

    public final synchronized void fu4() {
        this.f93874kja0++;
    }

    @Override // okhttp3.internal.http2.C7471g.zy
    /* JADX INFO: renamed from: g */
    public void mo27018g(@InterfaceC7396q C7478s stream) throws IOException {
        d2ok.m23075h(stream, "stream");
        stream.m27175q(okhttp3.internal.http2.toq.REFUSED_STREAM, null);
    }

    public final void gvn7(boolean z2) {
        this.f93879x2 = z2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final f7l8 m27019i() {
        return this.f93880zy;
    }

    public final synchronized void jk() {
        this.f93877qrj = true;
    }

    public final void jp0y(long j2) {
        this.f93878t8r = j2;
    }

    @Override // okhttp3.InterfaceC7525p
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public mcp mo27020k() {
        mcp mcpVar = this.f43072y;
        d2ok.qrj(mcpVar);
        return mcpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ld6(int r17, int r18, int r19, int r20, boolean r21, @mub.InterfaceC7396q okhttp3.InterfaceC7519n r22, @mub.InterfaceC7396q okhttp3.ki r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C7448g.ld6(int, int, int, int, boolean, okhttp3.n, okhttp3.ki):void");
    }

    @InterfaceC7396q
    public final C7507n.q mcp(@InterfaceC7396q okhttp3.internal.connection.zy exchange) throws SocketException {
        d2ok.m23075h(exchange, "exchange");
        Socket socket = this.f43066g;
        d2ok.qrj(socket);
        n7h n7hVar = this.f43069p;
        d2ok.qrj(n7hVar);
        qrj qrjVar = this.f93875ld6;
        d2ok.qrj(qrjVar);
        socket.setSoTimeout(0);
        a9();
        return new n(n7hVar, qrjVar, exchange);
    }

    @Override // okhttp3.internal.http2.C7471g.zy
    /* JADX INFO: renamed from: n */
    public synchronized void mo27021n(@InterfaceC7396q C7471g connection, @InterfaceC7396q okhttp3.internal.http2.qrj settings) {
        d2ok.m23075h(connection, "connection");
        d2ok.m23075h(settings, "settings");
        this.f93871cdj = settings.m27162g();
    }

    public final int ni7() {
        return this.f93876n7h;
    }

    public final boolean o1t(boolean z2) {
        long j2;
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f43068n;
        d2ok.qrj(socket);
        Socket socket2 = this.f43066g;
        d2ok.qrj(socket2);
        n7h n7hVar = this.f43069p;
        d2ok.qrj(n7hVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C7471g c7471g = this.f43071s;
        if (c7471g != null) {
            return c7471g.vy(jNanoTime);
        }
        synchronized (this) {
            j2 = jNanoTime - this.f93878t8r;
        }
        if (j2 < f93869ni7 || !z2) {
            return true;
        }
        return C1359g.m5764r(socket2, n7hVar);
    }

    @Override // okhttp3.InterfaceC7525p
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public Socket mo27022q() {
        Socket socket = this.f43066g;
        d2ok.qrj(socket);
        return socket;
    }

    /* JADX INFO: renamed from: s */
    public final void m27023s() {
        Socket socket = this.f43068n;
        if (socket != null) {
            C1359g.cdj(socket);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public final InterfaceC7461q m27024t(@InterfaceC7396q C7529t client, @InterfaceC7396q okhttp3.internal.http.f7l8 chain) throws SocketException {
        d2ok.m23075h(client, "client");
        d2ok.m23075h(chain, "chain");
        Socket socket = this.f43066g;
        d2ok.qrj(socket);
        n7h n7hVar = this.f43069p;
        d2ok.qrj(n7hVar);
        qrj qrjVar = this.f93875ld6;
        d2ok.qrj(qrjVar);
        C7471g c7471g = this.f43071s;
        if (c7471g != null) {
            return new okhttp3.internal.http2.f7l8(client, this, chain, c7471g);
        }
        socket.setSoTimeout(chain.mo27068k());
        C7560j qVar = n7hVar.toq();
        long jKja0 = chain.kja0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.mo27758p(jKja0, timeUnit);
        qrjVar.toq().mo27758p(chain.cdj(), timeUnit);
        return new okhttp3.internal.http1.toq(client, this, n7hVar, qrjVar);
    }

    @InterfaceC7396q
    public final List<Reference<C7450n>> t8r() {
        return this.f93873ki;
    }

    @InterfaceC7396q
    public String toString() {
        Object objF7l8;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f43070q.m26913q().ni7().fti());
        sb.append(':');
        sb.append(this.f43070q.m26913q().ni7().m27520r());
        sb.append(", proxy=");
        sb.append(this.f43070q.m26912n());
        sb.append(" hostAddress=");
        sb.append(this.f43070q.f7l8());
        sb.append(" cipherSuite=");
        C7437i c7437i = this.f93872f7l8;
        if (c7437i == null || (objF7l8 = c7437i.f7l8()) == null) {
            objF7l8 = "none";
        }
        sb.append(objF7l8);
        sb.append(" protocol=");
        sb.append(this.f43072y);
        sb.append('}');
        return sb.toString();
    }

    @Override // okhttp3.InterfaceC7525p
    @InterfaceC7396q
    public gvn7 toq() {
        return this.f43070q;
    }

    public final boolean wvg() {
        return this.f43071s != null;
    }

    public final void x2(@InterfaceC7396q C7529t client, @InterfaceC7396q gvn7 failedRoute, @InterfaceC7396q IOException failure) {
        d2ok.m23075h(client, "client");
        d2ok.m23075h(failedRoute, "failedRoute");
        d2ok.m23075h(failure, "failure");
        if (failedRoute.m26912n().type() != Proxy.Type.DIRECT) {
            C7514k c7514kM26913q = failedRoute.m26913q();
            c7514kM26913q.m27339i().connectFailed(c7514kM26913q.ni7().m27511e(), failedRoute.m26912n().address(), failure);
        }
        client.nn86().toq(failedRoute);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m27025z(@InterfaceC7396q C7514k address, @InterfaceC7395n List<gvn7> list) {
        d2ok.m23075h(address, "address");
        if (C1359g.f7245y && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f93873ki.size() >= this.f93871cdj || this.f93879x2 || !this.f43070q.m26913q().kja0(address)) {
            return false;
        }
        if (d2ok.f7l8(address.ni7().fti(), toq().m26913q().ni7().fti())) {
            return true;
        }
        if (this.f43071s == null || list == null || !fti(list) || address.m27338h() != C6773q.f37603k || !eqxt(address.ni7())) {
            return false;
        }
        try {
            okhttp3.f7l8 f7l8VarX2 = address.x2();
            d2ok.qrj(f7l8VarX2);
            String strFti = address.ni7().fti();
            C7437i c7437iZy = zy();
            d2ok.qrj(c7437iZy);
            f7l8VarX2.m26851k(strFti, c7437iZy.qrj());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean zurt() {
        return this.f93879x2;
    }

    @Override // okhttp3.InterfaceC7525p
    @InterfaceC7395n
    public C7437i zy() {
        return this.f93872f7l8;
    }
}
