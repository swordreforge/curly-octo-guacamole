package okhttp3.internal.ws;

import b7.C1359g;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.zurt;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.x2;
import kotlin.text.a9;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.InterfaceC7435g;
import okhttp3.InterfaceC7519n;
import okhttp3.eqxt;
import okhttp3.fti;
import okhttp3.internal.concurrent.AbstractC7444k;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.connection.C7450n;
import okhttp3.internal.ws.C7510y;
import okhttp3.jk;
import okhttp3.ki;
import okhttp3.mcp;
import okhttp3.oc;
import okio.kja0;
import okio.n7h;
import okio.qrj;

/* JADX INFO: renamed from: okhttp3.internal.ws.n */
/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class C7507n implements oc, C7510y.k {

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final long f94034jk = 1024;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final long f94035mcp = 60000;

    /* JADX INFO: renamed from: t */
    private static final long f43406t = 16777216;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f94038cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94039f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f94040fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f94041fu4;

    /* JADX INFO: renamed from: g */
    private long f43407g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final ArrayDeque<Object> f43408h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private String f43409i;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final jk f43410k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f94042ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    private final ArrayDeque<kja0> f94043kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7395n
    private C7509s f94044ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private C7505g f43411n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7395n
    private q f94045n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f94046ni7;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private C7510y f43412p;

    /* JADX INFO: renamed from: q */
    private final long f43413q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7395n
    private String f94047qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private AbstractC7444k f43414s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f94048t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final eqxt f94049toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private okhttp3.internal.concurrent.zy f94050x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private InterfaceC7519n f43415y;

    /* JADX INFO: renamed from: z */
    private boolean f43416z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f94051zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final Random f94052zy;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f94036o1t = new toq(null);

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @InterfaceC7396q
    private static final List<mcp> f94037wvg = zurt.ld6(mcp.HTTP_1_1);

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$f7l8 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n270#2,2:219\n*E\n"})
    public static final class f7l8 extends AbstractC7444k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f43417g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7507n f43418n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f7l8(String str, C7507n c7507n, long j2) {
            super(str, false, 2, null);
            this.f43418n = c7507n;
            this.f43417g = j2;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43418n.jp0y();
            return this.f43417g;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$g */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class g implements InterfaceC7435g {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ jk f43420q;

        g(jk jkVar) {
            this.f43420q = jkVar;
        }

        @Override // okhttp3.InterfaceC7435g
        /* JADX INFO: renamed from: q */
        public void mo22383q(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q fti response) throws IOException {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(response, "response");
            okhttp3.internal.connection.zy zyVarA98o = response.a98o();
            try {
                C7507n.this.m27282h(response, zyVarA98o);
                d2ok.qrj(zyVarA98o);
                q qVarN7h = zyVarA98o.n7h();
                C7505g c7505gM27278k = C7505g.f94031f7l8.m27278k(response.ltg8());
                C7507n.this.f43411n = c7505gM27278k;
                if (!C7507n.this.zurt(c7505gM27278k)) {
                    C7507n c7507n = C7507n.this;
                    synchronized (c7507n) {
                        c7507n.f43408h.clear();
                        c7507n.mo27288s(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C7507n.this.fn3e(C1359g.f7244s + " WebSocket " + this.f43420q.cdj().m27510c(), qVarN7h);
                    C7507n.this.m27283i().m26844g(C7507n.this, response);
                    C7507n.this.ni7();
                } catch (Exception e2) {
                    C7507n.this.t8r(e2, null);
                }
            } catch (IOException e3) {
                C7507n.this.t8r(e3, response);
                C1359g.kja0(response);
                if (zyVarA98o != null) {
                    zyVarA98o.ni7();
                }
            }
        }

        @Override // okhttp3.InterfaceC7435g
        public void zy(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q IOException e2) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(e2, "e");
            C7507n.this.t8r(e2, null);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$k */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class k {

        /* JADX INFO: renamed from: k */
        private final int f43421k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private final kja0 f94053toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final long f94054zy;

        public k(int i2, @InterfaceC7395n kja0 kja0Var, long j2) {
            this.f43421k = i2;
            this.f94053toq = kja0Var;
            this.f94054zy = j2;
        }

        /* JADX INFO: renamed from: k */
        public final long m27291k() {
            return this.f94054zy;
        }

        public final int toq() {
            return this.f43421k;
        }

        @InterfaceC7395n
        public final kja0 zy() {
            return this.f94053toq;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$n */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    private final class n extends AbstractC7444k {
        public n() {
            super(C7507n.this.f94047qrj + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            try {
                return C7507n.this.fti() ? 0L : -1L;
            } catch (IOException e2) {
                C7507n.this.t8r(e2, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$q */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static abstract class q implements Closeable {

        /* JADX INFO: renamed from: k */
        private final boolean f43423k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final qrj f43424n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final n7h f43425q;

        public q(boolean z2, @InterfaceC7396q n7h source, @InterfaceC7396q qrj sink) {
            d2ok.m23075h(source, "source");
            d2ok.m23075h(sink, "sink");
            this.f43423k = z2;
            this.f43425q = source;
            this.f43424n = sink;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27292k() {
            return this.f43423k;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final n7h m27293q() {
            return this.f43425q;
        }

        @InterfaceC7396q
        public final qrj zy() {
            return this.f43424n;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$toq */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$y */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n513#2,2:219\n*E\n"})
    public static final class y extends AbstractC7444k {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7507n f43426n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, boolean z2, C7507n c7507n) {
            super(str, z2);
            this.f43426n = c7507n;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43426n.cancel();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.n$zy */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final int f43427k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final kja0 f94055toq;

        public zy(int i2, @InterfaceC7396q kja0 data) {
            d2ok.m23075h(data, "data");
            this.f43427k = i2;
            this.f94055toq = data;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final kja0 m27294k() {
            return this.f94055toq;
        }

        public final int toq() {
            return this.f43427k;
        }
    }

    public C7507n(@InterfaceC7396q C7445q taskRunner, @InterfaceC7396q jk originalRequest, @InterfaceC7396q eqxt listener, @InterfaceC7396q Random random, long j2, @InterfaceC7395n C7505g c7505g, long j3) {
        d2ok.m23075h(taskRunner, "taskRunner");
        d2ok.m23075h(originalRequest, "originalRequest");
        d2ok.m23075h(listener, "listener");
        d2ok.m23075h(random, "random");
        this.f43410k = originalRequest;
        this.f94049toq = listener;
        this.f94052zy = random;
        this.f43413q = j2;
        this.f43411n = c7505g;
        this.f43407g = j3;
        this.f94050x2 = taskRunner.m26989p();
        this.f94043kja0 = new ArrayDeque<>();
        this.f43408h = new ArrayDeque<>();
        this.f94048t8r = -1;
        if (!d2ok.f7l8("GET", originalRequest.qrj())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.qrj()).toString());
        }
        kja0.C7563k c7563k = kja0.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        was wasVar = was.f36763k;
        this.f94039f7l8 = kja0.C7563k.m27776h(c7563k, bArr, 0, 0, 3, null).base64();
    }

    private final synchronized boolean mcp(kja0 kja0Var, int i2) {
        if (!this.f94040fn3e && !this.f94042ki) {
            if (this.f94038cdj + ((long) kja0Var.size()) > 16777216) {
                mo27288s(1001, null);
                return false;
            }
            this.f94038cdj += (long) kja0Var.size();
            this.f43408h.add(new zy(i2, kja0Var));
            m27280t();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    private final void m27280t() {
        if (!C1359g.f7245y || Thread.holdsLock(this)) {
            AbstractC7444k abstractC7444k = this.f43414s;
            if (abstractC7444k != null) {
                okhttp3.internal.concurrent.zy.m26999h(this.f94050x2, abstractC7444k, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zurt(C7505g c7505g) {
        if (!c7505g.f43398g && c7505g.f94032toq == null) {
            return c7505g.f43401q == null || new x2(8, 15).x2(c7505g.f43401q.intValue());
        }
        return false;
    }

    public final void a9() throws InterruptedException {
        this.f94050x2.fn3e();
        this.f94050x2.x2().await(10L, TimeUnit.SECONDS);
    }

    @Override // okhttp3.oc
    public void cancel() {
        InterfaceC7519n interfaceC7519n = this.f43415y;
        d2ok.qrj(interfaceC7519n);
        interfaceC7519n.cancel();
    }

    public final synchronized boolean cdj(int i2, @InterfaceC7395n String str, long j2) {
        okhttp3.internal.ws.f7l8.f43391k.m27271q(i2);
        kja0 kja0VarX2 = null;
        if (str != null) {
            kja0VarX2 = kja0.Companion.x2(str);
            if (!(((long) kja0VarX2.size()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        }
        if (!this.f94040fn3e && !this.f94042ki) {
            this.f94042ki = true;
            this.f43408h.add(new k(i2, kja0VarX2, j2));
            m27280t();
            return true;
        }
        return false;
    }

    @Override // okhttp3.oc
    public synchronized long f7l8() {
        return this.f94038cdj;
    }

    public final void fn3e(@InterfaceC7396q String name, @InterfaceC7396q q streams) throws IOException {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(streams, "streams");
        C7505g c7505g = this.f43411n;
        d2ok.qrj(c7505g);
        synchronized (this) {
            this.f94047qrj = name;
            this.f94045n7h = streams;
            this.f94044ld6 = new C7509s(streams.m27292k(), streams.zy(), this.f94052zy, c7505g.f43399k, c7505g.m27277s(streams.m27292k()), this.f43407g);
            this.f43414s = new n();
            long j2 = this.f43413q;
            if (j2 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                this.f94050x2.n7h(new f7l8(name + " ping", this, nanos), nanos);
            }
            if (!this.f43408h.isEmpty()) {
                m27280t();
            }
            was wasVar = was.f36763k;
        }
        this.f43412p = new C7510y(streams.m27292k(), streams.m27293q(), this, c7505g.f43399k, c7505g.m27277s(!streams.m27292k()));
    }

    public final boolean fti() throws IOException {
        q qVar;
        String str;
        C7510y c7510y;
        Closeable closeable;
        synchronized (this) {
            if (this.f94040fn3e) {
                return false;
            }
            C7509s c7509s = this.f94044ld6;
            kja0 kja0VarPoll = this.f94043kja0.poll();
            int i2 = -1;
            Object obj = null;
            if (kja0VarPoll == null) {
                Object objPoll = this.f43408h.poll();
                if (objPoll instanceof k) {
                    int i3 = this.f94048t8r;
                    str = this.f43409i;
                    if (i3 != -1) {
                        q qVar2 = this.f94045n7h;
                        this.f94045n7h = null;
                        c7510y = this.f43412p;
                        this.f43412p = null;
                        closeable = this.f94044ld6;
                        this.f94044ld6 = null;
                        this.f94050x2.fn3e();
                        obj = objPoll;
                        i2 = i3;
                        qVar = qVar2;
                    } else {
                        long jM27291k = ((k) objPoll).m27291k();
                        this.f94050x2.n7h(new y(this.f94047qrj + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(jM27291k));
                        i2 = i3;
                        qVar = null;
                        c7510y = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    qVar = null;
                    str = null;
                    c7510y = null;
                }
                closeable = c7510y;
                obj = objPoll;
            } else {
                qVar = null;
                str = null;
                c7510y = null;
                closeable = null;
            }
            was wasVar = was.f36763k;
            try {
                if (kja0VarPoll != null) {
                    d2ok.qrj(c7509s);
                    c7509s.x2(kja0VarPoll);
                } else if (obj instanceof zy) {
                    zy zyVar = (zy) obj;
                    d2ok.qrj(c7509s);
                    c7509s.m27297p(zyVar.toq(), zyVar.m27294k());
                    synchronized (this) {
                        this.f94038cdj -= (long) zyVar.m27294k().size();
                    }
                } else {
                    if (!(obj instanceof k)) {
                        throw new AssertionError();
                    }
                    k kVar = (k) obj;
                    d2ok.qrj(c7509s);
                    c7509s.m27298q(kVar.toq(), kVar.zy());
                    if (qVar != null) {
                        eqxt eqxtVar = this.f94049toq;
                        d2ok.qrj(str);
                        eqxtVar.m26845k(this, i2, str);
                    }
                }
                return true;
            } finally {
                if (qVar != null) {
                    C1359g.kja0(qVar);
                }
                if (c7510y != null) {
                    C1359g.kja0(c7510y);
                }
                if (closeable != null) {
                    C1359g.kja0(closeable);
                }
            }
        }
    }

    public final synchronized boolean fu4(@InterfaceC7396q kja0 payload) {
        d2ok.m23075h(payload, "payload");
        if (!this.f94040fn3e && (!this.f94042ki || !this.f43408h.isEmpty())) {
            this.f94043kja0.add(payload);
            m27280t();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.C7510y.k
    /* JADX INFO: renamed from: g */
    public synchronized void mo27281g(@InterfaceC7396q kja0 payload) {
        d2ok.m23075h(payload, "payload");
        if (!this.f94040fn3e && (!this.f94042ki || !this.f43408h.isEmpty())) {
            this.f94043kja0.add(payload);
            m27280t();
            this.f94046ni7++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m27282h(@InterfaceC7396q fti response, @InterfaceC7395n okhttp3.internal.connection.zy zyVar) throws IOException {
        d2ok.m23075h(response, "response");
        if (response.i1() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.i1() + ' ' + response.bek6() + '\'');
        }
        String strG1 = fti.g1(response, com.google.common.net.zy.f68524kja0, null, 2, null);
        if (!a9.e5(com.google.common.net.zy.f68497d2ok, strG1, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strG1 + '\'');
        }
        String strG12 = fti.g1(response, com.google.common.net.zy.f68497d2ok, null, 2, null);
        if (!a9.e5("websocket", strG12, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strG12 + '\'');
        }
        String strG13 = fti.g1(response, "Sec-WebSocket-Accept", null, 2, null);
        String strBase64 = kja0.Companion.x2(this.f94039f7l8 + okhttp3.internal.ws.f7l8.f94027toq).sha1().base64();
        if (d2ok.f7l8(strBase64, strG13)) {
            if (zyVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strG13 + '\'');
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final eqxt m27283i() {
        return this.f94049toq;
    }

    public final synchronized int jk() {
        return this.f94051zurt;
    }

    public final void jp0y() {
        synchronized (this) {
            if (this.f94040fn3e) {
                return;
            }
            C7509s c7509s = this.f94044ld6;
            if (c7509s == null) {
                return;
            }
            int i2 = this.f43416z ? this.f94051zurt : -1;
            this.f94051zurt++;
            this.f43416z = true;
            was wasVar = was.f36763k;
            if (i2 == -1) {
                try {
                    c7509s.ld6(kja0.EMPTY);
                    return;
                } catch (IOException e2) {
                    t8r(e2, null);
                    return;
                }
            }
            t8r(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f43413q + "ms (after " + (i2 - 1) + " successful ping/pongs)"), null);
        }
    }

    @Override // okhttp3.oc
    /* JADX INFO: renamed from: k */
    public boolean mo27284k(@InterfaceC7396q kja0 bytes) {
        d2ok.m23075h(bytes, "bytes");
        return mcp(bytes, 2);
    }

    public final void ki(@InterfaceC7396q C7529t client) {
        d2ok.m23075h(client, "client");
        if (this.f43410k.m27311s("Sec-WebSocket-Extensions") != null) {
            t8r(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        C7529t c7529tM27450g = client.ek5k().ki(ki.f94065toq).ek5k(f94037wvg).m27450g();
        jk qVar = this.f43410k.n7h().n7h(com.google.common.net.zy.f68497d2ok, "websocket").n7h(com.google.common.net.zy.f68524kja0, com.google.common.net.zy.f68497d2ok).n7h("Sec-WebSocket-Key", this.f94039f7l8).n7h("Sec-WebSocket-Version", "13").n7h("Sec-WebSocket-Extensions", "permessage-deflate").toq();
        C7450n c7450n = new C7450n(c7529tM27450g, qVar, true);
        this.f43415y = c7450n;
        d2ok.qrj(c7450n);
        c7450n.mo27031h(new g(qVar));
    }

    public final void kja0(long j2, @InterfaceC7396q TimeUnit timeUnit) throws InterruptedException {
        d2ok.m23075h(timeUnit, "timeUnit");
        this.f94050x2.x2().await(j2, timeUnit);
    }

    @Override // okhttp3.internal.ws.C7510y.k
    /* JADX INFO: renamed from: n */
    public void mo27285n(@InterfaceC7396q String text) throws IOException {
        d2ok.m23075h(text, "text");
        this.f94049toq.m26847q(this, text);
    }

    public final void ni7() throws IOException {
        while (this.f94048t8r == -1) {
            C7510y c7510y = this.f43412p;
            d2ok.qrj(c7510y);
            c7510y.zy();
        }
    }

    public final synchronized int o1t() {
        return this.f94046ni7;
    }

    @Override // okhttp3.internal.ws.C7510y.k
    /* JADX INFO: renamed from: p */
    public void mo27286p(int i2, @InterfaceC7396q String reason) {
        q qVar;
        C7510y c7510y;
        C7509s c7509s;
        d2ok.m23075h(reason, "reason");
        boolean z2 = true;
        if (!(i2 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f94048t8r != -1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f94048t8r = i2;
            this.f43409i = reason;
            qVar = null;
            if (this.f94042ki && this.f43408h.isEmpty()) {
                q qVar2 = this.f94045n7h;
                this.f94045n7h = null;
                c7510y = this.f43412p;
                this.f43412p = null;
                c7509s = this.f94044ld6;
                this.f94044ld6 = null;
                this.f94050x2.fn3e();
                qVar = qVar2;
            } else {
                c7510y = null;
                c7509s = null;
            }
            was wasVar = was.f36763k;
        }
        try {
            this.f94049toq.toq(this, i2, reason);
            if (qVar != null) {
                this.f94049toq.m26845k(this, i2, reason);
            }
        } finally {
            if (qVar != null) {
                C1359g.kja0(qVar);
            }
            if (c7510y != null) {
                C1359g.kja0(c7510y);
            }
            if (c7509s != null) {
                C1359g.kja0(c7509s);
            }
        }
    }

    @Override // okhttp3.internal.ws.C7510y.k
    /* JADX INFO: renamed from: q */
    public void mo27287q(@InterfaceC7396q kja0 bytes) throws IOException {
        d2ok.m23075h(bytes, "bytes");
        this.f94049toq.m26846n(this, bytes);
    }

    @Override // okhttp3.oc
    /* JADX INFO: renamed from: s */
    public boolean mo27288s(int i2, @InterfaceC7395n String str) {
        return cdj(i2, str, 60000L);
    }

    public final void t8r(@InterfaceC7396q Exception e2, @InterfaceC7395n fti ftiVar) {
        d2ok.m23075h(e2, "e");
        synchronized (this) {
            if (this.f94040fn3e) {
                return;
            }
            this.f94040fn3e = true;
            q qVar = this.f94045n7h;
            this.f94045n7h = null;
            C7510y c7510y = this.f43412p;
            this.f43412p = null;
            C7509s c7509s = this.f94044ld6;
            this.f94044ld6 = null;
            this.f94050x2.fn3e();
            was wasVar = was.f36763k;
            try {
                this.f94049toq.zy(this, e2, ftiVar);
            } finally {
                if (qVar != null) {
                    C1359g.kja0(qVar);
                }
                if (c7510y != null) {
                    C1359g.kja0(c7510y);
                }
                if (c7509s != null) {
                    C1359g.kja0(c7509s);
                }
            }
        }
    }

    @Override // okhttp3.oc
    public boolean toq(@InterfaceC7396q String text) {
        d2ok.m23075h(text, "text");
        return mcp(kja0.Companion.x2(text), 1);
    }

    public final synchronized int wvg() {
        return this.f94041fu4;
    }

    @Override // okhttp3.internal.ws.C7510y.k
    /* JADX INFO: renamed from: y */
    public synchronized void mo27289y(@InterfaceC7396q kja0 payload) {
        d2ok.m23075h(payload, "payload");
        this.f94041fu4++;
        this.f43416z = false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m27290z() throws IOException {
        try {
            C7510y c7510y = this.f43412p;
            d2ok.qrj(c7510y);
            c7510y.zy();
            return this.f94048t8r == -1;
        } catch (Exception e2) {
            t8r(e2, null);
            return false;
        }
    }

    @Override // okhttp3.oc
    @InterfaceC7396q
    public jk zy() {
        return this.f43410k;
    }
}
