package okhttp3.internal.http2;

import b7.C1359g;
import cyoe.InterfaceC5981k;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.concurrent.AbstractC7444k;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.concurrent.zy;
import okhttp3.internal.http2.C7481y;
import okhttp3.internal.platform.C7498p;
import okio.kja0;

/* JADX INFO: renamed from: okhttp3.internal.http2.g */
/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class C7471g implements Closeable {

    @InterfaceC7396q
    private static final qrj an;
    public static final int as = 1000000000;
    public static final int bl = 3;

    @InterfaceC7396q
    public static final toq bp = new toq(null);
    public static final int bv = 16777216;
    public static final int id = 1;
    public static final int in = 2;

    /* JADX INFO: renamed from: a */
    @InterfaceC7396q
    private qrj f43190a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @InterfaceC7396q
    private final q f93925ab;

    /* JADX INFO: renamed from: b */
    @InterfaceC7396q
    private final qrj f43191b;

    @InterfaceC7396q
    private final Set<Integer> bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private long f93926bo;

    /* JADX INFO: renamed from: c */
    private long f43192c;

    /* JADX INFO: renamed from: d */
    @InterfaceC7396q
    private final Socket f43193d;

    /* JADX INFO: renamed from: e */
    private long f43194e;

    /* JADX INFO: renamed from: f */
    private long f43195f;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final String f43196g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final C7445q f43197h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    private final okhttp3.internal.concurrent.zy f43198i;

    /* JADX INFO: renamed from: j */
    private long f43199j;

    /* JADX INFO: renamed from: k */
    private final boolean f43200k;

    /* JADX INFO: renamed from: l */
    private long f43201l;

    /* JADX INFO: renamed from: m */
    private long f43202m;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Map<Integer, C7478s> f43203n;

    /* JADX INFO: renamed from: o */
    private long f43204o;

    /* JADX INFO: renamed from: p */
    private boolean f43205p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final zy f43206q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    private final okhttp3.internal.http2.x2 f43207r;

    /* JADX INFO: renamed from: s */
    private int f43208s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7396q
    private final okhttp3.internal.concurrent.zy f43209t;

    /* JADX INFO: renamed from: u */
    private long f43210u;

    /* JADX INFO: renamed from: v */
    private long f43211v;

    /* JADX INFO: renamed from: w */
    @InterfaceC7396q
    private final C7475p f43212w;

    /* JADX INFO: renamed from: x */
    private long f43213x;

    /* JADX INFO: renamed from: y */
    private int f43214y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7396q
    private final okhttp3.internal.concurrent.zy f43215z;

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$f7l8 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"})
    public static final class f7l8 extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ List f93927f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43216g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43217n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f7l8(String str, boolean z2, C7471g c7471g, int i2, List list) {
            super(str, z2);
            this.f43217n = c7471g;
            this.f43216g = i2;
            this.f93927f7l8 = list;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            if (!this.f43217n.f43207r.toq(this.f43216g, this.f93927f7l8)) {
                return -1L;
            }
            try {
                this.f43217n.dxef().m27145t(this.f43216g, okhttp3.internal.http2.toq.CANCEL);
                synchronized (this.f43217n) {
                    this.f43217n.bb.remove(Integer.valueOf(this.f43216g));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$g */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n912#2,2:219\n914#2,7:223\n921#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n913#1:221,2\n913#1:230,3\n*E\n"})
    public static final class g extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ List f93928f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43218g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43219n;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f43220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z2, C7471g c7471g, int i2, List list, boolean z3) {
            super(str, z2);
            this.f43219n = c7471g;
            this.f43218g = i2;
            this.f93928f7l8 = list;
            this.f43220y = z3;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            boolean zZy = this.f43219n.f43207r.zy(this.f43218g, this.f93928f7l8, this.f43220y);
            if (zZy) {
                try {
                    this.f43219n.dxef().m27145t(this.f43218g, okhttp3.internal.http2.toq.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zZy && !this.f43220y) {
                return -1L;
            }
            synchronized (this.f43219n) {
                this.f43219n.bb.remove(Integer.valueOf(this.f43218g));
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$k */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        private zy f93929f7l8;

        /* JADX INFO: renamed from: g */
        public okio.qrj f43221g;

        /* JADX INFO: renamed from: k */
        private boolean f43222k;

        /* JADX INFO: renamed from: n */
        public okio.n7h f43223n;

        /* JADX INFO: renamed from: q */
        public String f43224q;

        /* JADX INFO: renamed from: s */
        private int f43225s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final C7445q f93930toq;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private okhttp3.internal.http2.x2 f43226y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Socket f93931zy;

        public k(boolean z2, @InterfaceC7396q C7445q taskRunner) {
            d2ok.m23075h(taskRunner, "taskRunner");
            this.f43222k = z2;
            this.f93930toq = taskRunner;
            this.f93929f7l8 = zy.f93938toq;
            this.f43226y = okhttp3.internal.http2.x2.f93979toq;
        }

        public static /* synthetic */ k o1t(k kVar, Socket socket, String str, okio.n7h n7hVar, okio.qrj qrjVar, int i2, Object obj) throws IOException {
            if ((i2 & 2) != 0) {
                str = C1359g.n5r1(socket);
            }
            if ((i2 & 4) != 0) {
                n7hVar = okio.d2ok.m27592n(okio.d2ok.zurt(socket));
            }
            if ((i2 & 8) != 0) {
                qrjVar = okio.d2ok.m27594q(okio.d2ok.cdj(socket));
            }
            return kVar.m27127z(socket, str, n7hVar, qrjVar);
        }

        public final void cdj(int i2) {
            this.f43225s = i2;
        }

        @InterfaceC7396q
        public final okio.qrj f7l8() {
            okio.qrj qrjVar = this.f43221g;
            if (qrjVar != null) {
                return qrjVar;
            }
            d2ok.n5r1("sink");
            return null;
        }

        public final void fn3e(@InterfaceC7396q okio.n7h n7hVar) {
            d2ok.m23075h(n7hVar, "<set-?>");
            this.f43223n = n7hVar;
        }

        @InterfaceC6768s
        @InterfaceC7396q
        public final k fu4(@InterfaceC7396q Socket socket, @InterfaceC7396q String peerName, @InterfaceC7396q okio.n7h source) throws IOException {
            d2ok.m23075h(socket, "socket");
            d2ok.m23075h(peerName, "peerName");
            d2ok.m23075h(source, "source");
            return o1t(this, socket, peerName, source, null, 8, null);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final okhttp3.internal.http2.x2 m27118g() {
            return this.f43226y;
        }

        /* JADX INFO: renamed from: h */
        public final void m27119h(@InterfaceC7396q zy zyVar) {
            d2ok.m23075h(zyVar, "<set-?>");
            this.f93929f7l8 = zyVar;
        }

        /* JADX INFO: renamed from: i */
        public final void m27120i(@InterfaceC7396q Socket socket) {
            d2ok.m23075h(socket, "<set-?>");
            this.f93931zy = socket;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7471g m27121k() {
            return new C7471g(this);
        }

        public final void ki(@InterfaceC7396q okhttp3.internal.http2.x2 x2Var) {
            d2ok.m23075h(x2Var, "<set-?>");
            this.f43226y = x2Var;
        }

        public final void kja0(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<set-?>");
            this.f43224q = str;
        }

        @InterfaceC7396q
        public final k ld6(@InterfaceC7396q zy listener) {
            d2ok.m23075h(listener, "listener");
            this.f93929f7l8 = listener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public final int m27122n() {
            return this.f43225s;
        }

        public final void n7h(boolean z2) {
            this.f43222k = z2;
        }

        @InterfaceC6768s
        @InterfaceC7396q
        public final k ni7(@InterfaceC7396q Socket socket, @InterfaceC7396q String peerName) throws IOException {
            d2ok.m23075h(socket, "socket");
            d2ok.m23075h(peerName, "peerName");
            return o1t(this, socket, peerName, null, null, 12, null);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final C7445q m27123p() {
            return this.f93930toq;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final zy m27124q() {
            return this.f93929f7l8;
        }

        @InterfaceC7396q
        public final k qrj(@InterfaceC7396q okhttp3.internal.http2.x2 pushObserver) {
            d2ok.m23075h(pushObserver, "pushObserver");
            this.f43226y = pushObserver;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final okio.n7h m27125s() {
            okio.n7h n7hVar = this.f43223n;
            if (n7hVar != null) {
                return n7hVar;
            }
            d2ok.n5r1("source");
            return null;
        }

        public final void t8r(@InterfaceC7396q okio.qrj qrjVar) {
            d2ok.m23075h(qrjVar, "<set-?>");
            this.f43221g = qrjVar;
        }

        public final boolean toq() {
            return this.f43222k;
        }

        @InterfaceC7396q
        public final k x2(int i2) {
            this.f43225s = i2;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final Socket m27126y() {
            Socket socket = this.f93931zy;
            if (socket != null) {
                return socket;
            }
            d2ok.n5r1("socket");
            return null;
        }

        @InterfaceC6768s
        @InterfaceC7396q
        /* JADX INFO: renamed from: z */
        public final k m27127z(@InterfaceC7396q Socket socket, @InterfaceC7396q String peerName, @InterfaceC7396q okio.n7h source, @InterfaceC7396q okio.qrj sink) throws IOException {
            String str;
            d2ok.m23075h(socket, "socket");
            d2ok.m23075h(peerName, "peerName");
            d2ok.m23075h(source, "source");
            d2ok.m23075h(sink, "sink");
            m27120i(socket);
            if (this.f43222k) {
                str = C1359g.f7244s + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            kja0(str);
            fn3e(source);
            t8r(sink);
            return this;
        }

        @InterfaceC6768s
        @InterfaceC7396q
        public final k zurt(@InterfaceC7396q Socket socket) throws IOException {
            d2ok.m23075h(socket, "socket");
            return o1t(this, socket, null, null, null, 14, null);
        }

        @InterfaceC7396q
        public final String zy() {
            String str = this.f43224q;
            if (str != null) {
                return str;
            }
            d2ok.n5r1("connectionName");
            return null;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$ld6 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n341#2,6:219\n*E\n"})
    public static final class ld6 extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.toq f93932f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43227g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43228n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ld6(String str, boolean z2, C7471g c7471g, int i2, okhttp3.internal.http2.toq toqVar) {
            super(str, z2);
            this.f43228n = c7471g;
            this.f43227g = i2;
            this.f93932f7l8 = toqVar;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            try {
                this.f43228n.o5(this.f43227g, this.f93932f7l8);
                return -1L;
            } catch (IOException e2) {
                this.f43228n.nmn5(e2);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$n */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n939#2:219\n940#2,8:222\n948#2:233\n402#3,2:220\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n939#1:220,2\n939#1:230,3\n*E\n"})
    public static final class n extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ okio.x2 f93933f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43229g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43230n;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ boolean f43231s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f43232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, boolean z2, C7471g c7471g, int i2, okio.x2 x2Var, int i3, boolean z3) {
            super(str, z2);
            this.f43230n = c7471g;
            this.f43229g = i2;
            this.f93933f7l8 = x2Var;
            this.f43232y = i3;
            this.f43231s = z3;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            try {
                boolean zMo27192q = this.f43230n.f43207r.mo27192q(this.f43229g, this.f93933f7l8, this.f43232y, this.f43231s);
                if (zMo27192q) {
                    this.f43230n.dxef().m27145t(this.f43229g, okhttp3.internal.http2.toq.CANCEL);
                }
                if (!zMo27192q && !this.f43231s) {
                    return -1L;
                }
                synchronized (this.f43230n) {
                    this.f43230n.bb.remove(Integer.valueOf(this.f43229g));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$p */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"})
    public static final class p extends AbstractC7444k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f43233g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43234n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, C7471g c7471g, long j2) {
            super(str, false, 2, null);
            this.f43234n = c7471g;
            this.f43233g = j2;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            boolean z2;
            synchronized (this.f43234n) {
                if (this.f43234n.f43195f < this.f43234n.f43201l) {
                    z2 = true;
                } else {
                    this.f43234n.f43201l++;
                    z2 = false;
                }
            }
            if (z2) {
                this.f43234n.nmn5(null);
                return -1L;
            }
            this.f43234n.bih(false, 1, 0);
            return this.f43233g;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$q */
    /* JADX INFO: compiled from: Http2Connection.kt */
    @lv5({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class q implements C7481y.zy, InterfaceC5981k<was> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7481y f43235k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C7471g f43236q;

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$q$k */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n759#2,2:219\n*E\n"})
        public static final class k extends AbstractC7444k {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ i1.C6299y f43237g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C7471g f43238n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String str, boolean z2, C7471g c7471g, i1.C6299y c6299y) {
                super(str, z2);
                this.f43238n = c7471g;
                this.f43237g = c6299y;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // okhttp3.internal.concurrent.AbstractC7444k
            /* JADX INFO: renamed from: g */
            public long mo26947g() {
                this.f43238n.ltg8().mo27021n(this.f43238n, (qrj) this.f43237g.element);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$q$q, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n716#2,2:219\n*E\n"})
        public static final class C8124q extends AbstractC7444k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            final /* synthetic */ qrj f93934f7l8;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ boolean f43239g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ q f43240n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8124q(String str, boolean z2, q qVar, boolean z3, qrj qrjVar) {
                super(str, z2);
                this.f43240n = qVar;
                this.f43239g = z3;
                this.f93934f7l8 = qrjVar;
            }

            @Override // okhttp3.internal.concurrent.AbstractC7444k
            /* JADX INFO: renamed from: g */
            public long mo26947g() {
                this.f43240n.x2(this.f43239g, this.f93934f7l8);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$q$toq */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"})
        public static final class toq extends AbstractC7444k {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ C7478s f43241g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C7471g f43242n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public toq(String str, boolean z2, C7471g c7471g, C7478s c7478s) {
                super(str, z2);
                this.f43242n = c7471g;
                this.f43241g = c7478s;
            }

            @Override // okhttp3.internal.concurrent.AbstractC7444k
            /* JADX INFO: renamed from: g */
            public long mo26947g() {
                try {
                    this.f43242n.ltg8().mo27018g(this.f43241g);
                    return -1L;
                } catch (IOException e2) {
                    C7498p.f43366k.f7l8().qrj("Http2Connection.Listener failure for " + this.f43242n.g1(), 4, e2);
                    try {
                        this.f43241g.m27175q(okhttp3.internal.http2.toq.PROTOCOL_ERROR, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$q$zy */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n807#2,2:219\n*E\n"})
        public static final class zy extends AbstractC7444k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            final /* synthetic */ int f93935f7l8;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f43243g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C7471g f43244n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zy(String str, boolean z2, C7471g c7471g, int i2, int i3) {
                super(str, z2);
                this.f43244n = c7471g;
                this.f43243g = i2;
                this.f93935f7l8 = i3;
            }

            @Override // okhttp3.internal.concurrent.AbstractC7444k
            /* JADX INFO: renamed from: g */
            public long mo26947g() {
                this.f43244n.bih(true, this.f43243g, this.f93935f7l8);
                return -1L;
            }
        }

        public q(@InterfaceC7396q C7471g c7471g, C7481y reader) {
            d2ok.m23075h(reader, "reader");
            this.f43236q = c7471g;
            this.f43235k = reader;
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        public void f7l8(boolean z2, int i2, @InterfaceC7396q okio.n7h source, int i3) throws IOException {
            d2ok.m23075h(source, "source");
            if (this.f43236q.b8(i2)) {
                this.f43236q.oki(i2, source, i3, z2);
                return;
            }
            C7478s c7478sH4b = this.f43236q.h4b(i2);
            if (c7478sH4b == null) {
                this.f43236q.yw(i2, okhttp3.internal.http2.toq.PROTOCOL_ERROR);
                long j2 = i3;
                this.f43236q.nnh(j2);
                source.skip(j2);
                return;
            }
            c7478sH4b.m27179z(source, i3);
            if (z2) {
                c7478sH4b.o1t(C1359g.f53992toq, true);
            }
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: g */
        public void mo27128g() {
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() throws Throwable {
            n7h();
            return was.f36763k;
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: k */
        public void mo27129k(boolean z2, @InterfaceC7396q qrj settings) {
            d2ok.m23075h(settings, "settings");
            this.f43236q.f43198i.n7h(new C8124q(this.f43236q.g1() + " applyAndAckSettings", true, this, z2, settings), 0L);
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        public void ld6(int i2, @InterfaceC7396q okhttp3.internal.http2.toq errorCode, @InterfaceC7396q kja0 debugData) {
            int i3;
            Object[] array;
            d2ok.m23075h(errorCode, "errorCode");
            d2ok.m23075h(debugData, "debugData");
            debugData.size();
            C7471g c7471g = this.f43236q;
            synchronized (c7471g) {
                array = c7471g.wlev().values().toArray(new C7478s[0]);
                c7471g.f43205p = true;
                was wasVar = was.f36763k;
            }
            for (C7478s c7478s : (C7478s[]) array) {
                if (c7478s.ld6() > i2 && c7478s.zurt()) {
                    c7478s.wvg(okhttp3.internal.http2.toq.REFUSED_STREAM);
                    this.f43236q.nme(c7478s.ld6());
                }
            }
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: n */
        public void mo27130n(int i2, int i3, @InterfaceC7396q List<okhttp3.internal.http2.zy> requestHeaders) {
            d2ok.m23075h(requestHeaders, "requestHeaders");
            this.f43236q.m58i(i3, requestHeaders);
        }

        public void n7h() throws Throwable {
            okhttp3.internal.http2.toq toqVar;
            okhttp3.internal.http2.toq toqVar2 = okhttp3.internal.http2.toq.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                this.f43235k.m27198q(this);
                while (this.f43235k.zy(false, this)) {
                }
                toqVar = okhttp3.internal.http2.toq.NO_ERROR;
                try {
                    try {
                        this.f43236q.m27117x(toqVar, okhttp3.internal.http2.toq.CANCEL, null);
                    } catch (IOException e3) {
                        e2 = e3;
                        okhttp3.internal.http2.toq toqVar3 = okhttp3.internal.http2.toq.PROTOCOL_ERROR;
                        this.f43236q.m27117x(toqVar3, toqVar3, e2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f43236q.m27117x(toqVar, toqVar2, e2);
                    C1359g.kja0(this.f43235k);
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
                toqVar = toqVar2;
            } catch (Throwable th2) {
                th = th2;
                toqVar = toqVar2;
                this.f43236q.m27117x(toqVar, toqVar2, e2);
                C1359g.kja0(this.f43235k);
                throw th;
            }
            C1359g.kja0(this.f43235k);
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: p */
        public void mo27131p(int i2, @InterfaceC7396q okhttp3.internal.http2.toq errorCode) {
            d2ok.m23075h(errorCode, "errorCode");
            if (this.f43236q.b8(i2)) {
                this.f43236q.cnbm(i2, errorCode);
                return;
            }
            C7478s c7478sNme = this.f43236q.nme(i2);
            if (c7478sNme != null) {
                c7478sNme.wvg(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: q */
        public void mo27132q(int i2, @InterfaceC7396q String origin, @InterfaceC7396q kja0 protocol, @InterfaceC7396q String host, int i3, long j2) {
            d2ok.m23075h(origin, "origin");
            d2ok.m23075h(protocol, "protocol");
            d2ok.m23075h(host, "host");
        }

        @InterfaceC7396q
        public final C7481y qrj() {
            return this.f43235k;
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: s */
        public void mo27133s(int i2, int i3, int i4, boolean z2) {
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        public void toq(boolean z2, int i2, int i3, @InterfaceC7396q List<okhttp3.internal.http2.zy> headerBlock) {
            d2ok.m23075h(headerBlock, "headerBlock");
            if (this.f43236q.b8(i2)) {
                this.f43236q.o05(i2, headerBlock, z2);
                return;
            }
            C7471g c7471g = this.f43236q;
            synchronized (c7471g) {
                C7478s c7478sH4b = c7471g.h4b(i2);
                if (c7478sH4b != null) {
                    was wasVar = was.f36763k;
                    c7478sH4b.o1t(C1359g.m5756j(headerBlock), z2);
                    return;
                }
                if (c7471g.f43205p) {
                    return;
                }
                if (i2 <= c7471g.was()) {
                    return;
                }
                if (i2 % 2 == c7471g.bwp() % 2) {
                    return;
                }
                C7478s c7478s = new C7478s(i2, c7471g, false, z2, C1359g.m5756j(headerBlock));
                c7471g.ew(i2);
                c7471g.wlev().put(Integer.valueOf(i2), c7478s);
                c7471g.f43197h.m26989p().n7h(new toq(c7471g.g1() + '[' + i2 + "] onStream", true, c7471g, c7478s), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.qrj] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void x2(boolean z2, @InterfaceC7396q qrj settings) {
            ?? r13;
            long jM27164n;
            int i2;
            C7478s[] c7478sArr;
            d2ok.m23075h(settings, "settings");
            i1.C6299y c6299y = new i1.C6299y();
            C7475p c7475pDxef = this.f43236q.dxef();
            C7471g c7471g = this.f43236q;
            synchronized (c7475pDxef) {
                synchronized (c7471g) {
                    qrj qrjVarH7am = c7471g.h7am();
                    if (z2) {
                        r13 = settings;
                    } else {
                        qrj qrjVar = new qrj();
                        qrjVar.m27165p(qrjVarH7am);
                        qrjVar.m27165p(settings);
                        r13 = qrjVar;
                    }
                    c6299y.element = r13;
                    jM27164n = ((long) r13.m27164n()) - ((long) qrjVarH7am.m27164n());
                    c7478sArr = (jM27164n == 0 || c7471g.wlev().isEmpty()) ? null : (C7478s[]) c7471g.wlev().values().toArray(new C7478s[0]);
                    c7471g.kx3((qrj) c6299y.element);
                    c7471g.f43209t.n7h(new k(c7471g.g1() + " onSettings", true, c7471g, c6299y), 0L);
                    was wasVar = was.f36763k;
                }
                try {
                    c7471g.dxef().m27142k((qrj) c6299y.element);
                } catch (IOException e2) {
                    c7471g.nmn5(e2);
                }
                was wasVar2 = was.f36763k;
            }
            if (c7478sArr != null) {
                for (C7478s c7478s : c7478sArr) {
                    synchronized (c7478s) {
                        c7478s.m27173k(jM27164n);
                        was wasVar3 = was.f36763k;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        /* JADX INFO: renamed from: y */
        public void mo27134y(boolean z2, int i2, int i3) {
            if (!z2) {
                this.f43236q.f43198i.n7h(new zy(this.f43236q.g1() + " ping", true, this.f43236q, i2, i3), 0L);
                return;
            }
            C7471g c7471g = this.f43236q;
            synchronized (c7471g) {
                if (i2 == 1) {
                    c7471g.f43195f++;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        c7471g.f43204o++;
                        d2ok.n7h(c7471g, "null cannot be cast to non-null type java.lang.Object");
                        c7471g.notifyAll();
                    }
                    was wasVar = was.f36763k;
                } else {
                    c7471g.f43194e++;
                }
            }
        }

        @Override // okhttp3.internal.http2.C7481y.zy
        public void zy(int i2, long j2) {
            if (i2 == 0) {
                C7471g c7471g = this.f43236q;
                synchronized (c7471g) {
                    c7471g.f43211v = c7471g.ga() + j2;
                    d2ok.n7h(c7471g, "null cannot be cast to non-null type java.lang.Object");
                    c7471g.notifyAll();
                    was wasVar = was.f36763k;
                }
                return;
            }
            C7478s c7478sH4b = this.f43236q.h4b(i2);
            if (c7478sH4b != null) {
                synchronized (c7478sH4b) {
                    c7478sH4b.m27173k(j2);
                    was wasVar2 = was.f36763k;
                }
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$s */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n555#2,2:219\n*E\n"})
    public static final class s extends AbstractC7444k {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43245n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, boolean z2, C7471g c7471g) {
            super(str, z2);
            this.f43245n = c7471g;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43245n.bih(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$toq */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final qrj m27135k() {
            return C7471g.an;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$x2 */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"})
    public static final class x2 extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ long f93936f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43246g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43247n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x2(String str, boolean z2, C7471g c7471g, int i2, long j2) {
            super(str, z2);
            this.f43247n = c7471g;
            this.f43246g = i2;
            this.f93936f7l8 = j2;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            try {
                this.f43247n.dxef().hyr(this.f43246g, this.f93936f7l8);
                return -1L;
            } catch (IOException e2) {
                this.f43247n.nmn5(e2);
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$y */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n953#2,5:219\n*E\n"})
    public static final class y extends AbstractC7444k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.toq f93937f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f43248g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7471g f43249n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, boolean z2, C7471g c7471g, int i2, okhttp3.internal.http2.toq toqVar) {
            super(str, z2);
            this.f43249n = c7471g;
            this.f43248g = i2;
            this.f93937f7l8 = toqVar;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43249n.f43207r.mo27191k(this.f43248g, this.f93937f7l8);
            synchronized (this.f43249n) {
                this.f43249n.bb.remove(Integer.valueOf(this.f43248g));
                was wasVar = was.f36763k;
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.g$zy */
    /* JADX INFO: compiled from: Http2Connection.kt */
    public static abstract class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final toq f43250k = new toq(null);

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final zy f93938toq = new k();

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$zy$k */
        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class k extends zy {
            k() {
            }

            @Override // okhttp3.internal.http2.C7471g.zy
            /* JADX INFO: renamed from: g */
            public void mo27018g(@InterfaceC7396q C7478s stream) throws IOException {
                d2ok.m23075h(stream, "stream");
                stream.m27175q(okhttp3.internal.http2.toq.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: renamed from: okhttp3.internal.http2.g$zy$toq */
        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class toq {
            private toq() {
            }

            public /* synthetic */ toq(ni7 ni7Var) {
                this();
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo27018g(@InterfaceC7396q C7478s c7478s) throws IOException;

        /* JADX INFO: renamed from: n */
        public void mo27021n(@InterfaceC7396q C7471g connection, @InterfaceC7396q qrj settings) {
            d2ok.m23075h(connection, "connection");
            d2ok.m23075h(settings, "settings");
        }
    }

    static {
        qrj qrjVar = new qrj();
        qrjVar.ld6(7, 65535);
        qrjVar.ld6(5, 16384);
        an = qrjVar;
    }

    public C7471g(@InterfaceC7396q k builder) {
        d2ok.m23075h(builder, "builder");
        boolean qVar = builder.toq();
        this.f43200k = qVar;
        this.f43206q = builder.m27124q();
        this.f43203n = new LinkedHashMap();
        String strZy = builder.zy();
        this.f43196g = strZy;
        this.f43208s = builder.toq() ? 3 : 2;
        C7445q c7445qM27123p = builder.m27123p();
        this.f43197h = c7445qM27123p;
        okhttp3.internal.concurrent.zy zyVarM26989p = c7445qM27123p.m26989p();
        this.f43198i = zyVarM26989p;
        this.f43215z = c7445qM27123p.m26989p();
        this.f43209t = c7445qM27123p.m26989p();
        this.f43207r = builder.m27118g();
        qrj qrjVar = new qrj();
        if (builder.toq()) {
            qrjVar.ld6(7, 16777216);
        }
        this.f43191b = qrjVar;
        this.f43190a = an;
        this.f43211v = r2.m27164n();
        this.f43193d = builder.m27126y();
        this.f43212w = new C7475p(builder.f7l8(), qVar);
        this.f93925ab = new q(this, new C7481y(builder.m27125s(), qVar));
        this.bb = new LinkedHashSet();
        if (builder.m27122n() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m27122n());
            zyVarM26989p.n7h(new p(strZy + " ping", this, nanos), nanos);
        }
    }

    private final C7478s a5id(int i2, List<okhttp3.internal.http2.zy> list, boolean z2) throws IOException {
        int i3;
        C7478s c7478s;
        boolean z3;
        boolean z5 = !z2;
        synchronized (this.f43212w) {
            synchronized (this) {
                if (this.f43208s > 1073741823) {
                    m2t(okhttp3.internal.http2.toq.REFUSED_STREAM);
                }
                if (this.f43205p) {
                    throw new C7472k();
                }
                i3 = this.f43208s;
                this.f43208s = i3 + 2;
                c7478s = new C7478s(i3, this, z5, false, null);
                z3 = !z2 || this.f93926bo >= this.f43211v || c7478s.m27172i() >= c7478s.t8r();
                if (c7478s.ni7()) {
                    this.f43203n.put(Integer.valueOf(i3), c7478s);
                }
                was wasVar = was.f36763k;
            }
            if (i2 == 0) {
                this.f43212w.m27141h(z5, i3, list);
            } else {
                if (!(true ^ this.f43200k)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.f43212w.wvg(i2, i3, list);
            }
        }
        if (z3) {
            this.f43212w.flush();
        }
        return c7478s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nmn5(IOException iOException) {
        okhttp3.internal.http2.toq toqVar = okhttp3.internal.http2.toq.PROTOCOL_ERROR;
        m27117x(toqVar, toqVar, iOException);
    }

    public static /* synthetic */ void ra(C7471g c7471g, boolean z2, C7445q c7445q, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            c7445q = C7445q.f43045s;
        }
        c7471g.v5yj(z2, c7445q);
    }

    public final synchronized void a98o() throws InterruptedException {
        while (this.f43204o < this.f43199j) {
            d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    public final boolean b8(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    @InterfaceC7396q
    public final C7478s b9ub(int i2, @InterfaceC7396q List<okhttp3.internal.http2.zy> requestHeaders, boolean z2) throws IOException {
        d2ok.m23075h(requestHeaders, "requestHeaders");
        if (!this.f43200k) {
            return a5id(i2, requestHeaders, z2);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    @InterfaceC7396q
    public final Socket bap7() {
        return this.f43193d;
    }

    @InterfaceC7396q
    public final qrj bek6() {
        return this.f43191b;
    }

    public final void bih(boolean z2, int i2, int i3) {
        try {
            this.f43212w.fu4(z2, i2, i3);
        } catch (IOException e2) {
            nmn5(e2);
        }
    }

    public final int bwp() {
        return this.f43208s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m27117x(okhttp3.internal.http2.toq.NO_ERROR, okhttp3.internal.http2.toq.CANCEL, null);
    }

    public final void cnbm(int i2, @InterfaceC7396q okhttp3.internal.http2.toq errorCode) {
        d2ok.m23075h(errorCode, "errorCode");
        this.f43215z.n7h(new y(this.f43196g + '[' + i2 + "] onReset", true, this, i2, errorCode), 0L);
    }

    @InterfaceC7396q
    public final C7475p dxef() {
        return this.f43212w;
    }

    public final long e5() {
        return this.f93926bo;
    }

    public final void ec() throws InterruptedException {
        z4t();
        a98o();
    }

    public final void ew(int i2) {
        this.f43214y = i2;
    }

    public final void flush() throws IOException {
        this.f43212w.flush();
    }

    @InterfaceC7396q
    public final String g1() {
        return this.f43196g;
    }

    public final long ga() {
        return this.f43211v;
    }

    public final synchronized int gcp() {
        return this.f43203n.size();
    }

    @InterfaceC7395n
    public final synchronized C7478s h4b(int i2) {
        return this.f43203n.get(Integer.valueOf(i2));
    }

    @InterfaceC7396q
    public final qrj h7am() {
        return this.f43190a;
    }

    public final long ij() {
        return this.f43210u;
    }

    public final void ix(int i2) {
        this.f43208s = i2;
    }

    public final void kiv(int i2, boolean z2, @InterfaceC7396q List<okhttp3.internal.http2.zy> alternating) throws IOException {
        d2ok.m23075h(alternating, "alternating");
        this.f43212w.m27141h(z2, i2, alternating);
    }

    public final void kx3(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<set-?>");
        this.f43190a = qrjVar;
    }

    @InterfaceC7396q
    public final zy ltg8() {
        return this.f43206q;
    }

    @InterfaceC7396q
    public final C7478s lw(@InterfaceC7396q List<okhttp3.internal.http2.zy> requestHeaders, boolean z2) throws IOException {
        d2ok.m23075h(requestHeaders, "requestHeaders");
        return a5id(0, requestHeaders, z2);
    }

    public final void m2t(@InterfaceC7396q okhttp3.internal.http2.toq statusCode) throws IOException {
        d2ok.m23075h(statusCode, "statusCode");
        synchronized (this.f43212w) {
            i1.C6294g c6294g = new i1.C6294g();
            synchronized (this) {
                if (this.f43205p) {
                    return;
                }
                this.f43205p = true;
                int i2 = this.f43214y;
                c6294g.element = i2;
                was wasVar = was.f36763k;
                this.f43212w.x2(i2, statusCode, C1359g.f7240k);
            }
        }
    }

    public final void m58i(int i2, @InterfaceC7396q List<okhttp3.internal.http2.zy> requestHeaders) {
        d2ok.m23075h(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.bb.contains(Integer.valueOf(i2))) {
                yw(i2, okhttp3.internal.http2.toq.PROTOCOL_ERROR);
                return;
            }
            this.bb.add(Integer.valueOf(i2));
            this.f43215z.n7h(new f7l8(this.f43196g + '[' + i2 + "] onRequest", true, this, i2, requestHeaders), 0L);
        }
    }

    @InterfaceC7396q
    public final q ngy() {
        return this.f93925ab;
    }

    @InterfaceC7395n
    public final synchronized C7478s nme(int i2) {
        C7478s c7478sRemove;
        c7478sRemove = this.f43203n.remove(Integer.valueOf(i2));
        d2ok.n7h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return c7478sRemove;
    }

    public final synchronized void nnh(long j2) {
        long j3 = this.f43213x + j2;
        this.f43213x = j3;
        long j4 = j3 - this.f43210u;
        if (j4 >= this.f43191b.m27164n() / 2) {
            rp(0, j4);
            this.f43210u += j4;
        }
    }

    public final long nsb() {
        return this.f43213x;
    }

    public final void o05(int i2, @InterfaceC7396q List<okhttp3.internal.http2.zy> requestHeaders, boolean z2) {
        d2ok.m23075h(requestHeaders, "requestHeaders");
        this.f43215z.n7h(new g(this.f43196g + '[' + i2 + "] onHeaders", true, this, i2, requestHeaders, z2), 0L);
    }

    public final void o5(int i2, @InterfaceC7396q okhttp3.internal.http2.toq statusCode) throws IOException {
        d2ok.m23075h(statusCode, "statusCode");
        this.f43212w.m27145t(i2, statusCode);
    }

    public final void oki(int i2, @InterfaceC7396q okio.n7h source, int i3, boolean z2) throws IOException {
        d2ok.m23075h(source, "source");
        okio.x2 x2Var = new okio.x2();
        long j2 = i3;
        source.dr(j2);
        source.wx16(x2Var, j2);
        this.f43215z.n7h(new n(this.f43196g + '[' + i2 + "] onData", true, this, i2, x2Var, i3, z2), 0L);
    }

    @InterfaceC6768s
    public final void ps(boolean z2) throws IOException {
        ra(this, z2, null, 2, null);
    }

    public final void r25n() {
        synchronized (this) {
            long j2 = this.f43194e;
            long j3 = this.f43192c;
            if (j2 < j3) {
                return;
            }
            this.f43192c = j3 + 1;
            this.f43202m = System.nanoTime() + ((long) 1000000000);
            was wasVar = was.f36763k;
            this.f43198i.n7h(new s(this.f43196g + " ping", true, this), 0L);
        }
    }

    public final void rp(int i2, long j2) {
        this.f43198i.n7h(new x2(this.f43196g + '[' + i2 + "] windowUpdate", true, this, i2, j2), 0L);
    }

    public final boolean t8iq() {
        return this.f43200k;
    }

    @InterfaceC6768s
    public final void u38j() throws IOException {
        ra(this, false, null, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f43212w.ki());
        r6 = r2;
        r8.f93926bo += r6;
        r4 = kotlin.was.f36763k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uf(int r9, boolean r10, @mub.InterfaceC7395n okio.x2 r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.p r12 = r8.f43212w
            r12.m27144q(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f93926bo     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            long r6 = r8.f43211v     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L37
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.s> r2 = r8.f43203n     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r2 == 0) goto L2f
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.d2ok.n7h(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L12
        L2f:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
        L37:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L60
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L60
            okhttp3.internal.http2.p r4 = r8.f43212w     // Catch: java.lang.Throwable -> L60
            int r4 = r4.ki()     // Catch: java.lang.Throwable -> L60
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L60
            long r4 = r8.f93926bo     // Catch: java.lang.Throwable -> L60
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L60
            long r4 = r4 + r6
            r8.f93926bo = r4     // Catch: java.lang.Throwable -> L60
            kotlin.was r4 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L60
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.p r4 = r8.f43212w
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.m27144q(r5, r9, r11, r2)
            goto Ld
        L60:
            r9 = move-exception
            goto L6f
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r9.interrupt()     // Catch: java.lang.Throwable -> L60
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L60
            throw r9     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7471g.uf(int, boolean, okio.x2, long):void");
    }

    @InterfaceC6768s
    public final void v5yj(boolean z2, @InterfaceC7396q C7445q taskRunner) throws IOException {
        d2ok.m23075h(taskRunner, "taskRunner");
        if (z2) {
            this.f43212w.zy();
            this.f43212w.d2ok(this.f43191b);
            if (this.f43191b.m27164n() != 65535) {
                this.f43212w.hyr(0, r6 - 65535);
            }
        }
        taskRunner.m26989p().n7h(new zy.toq(this.f43196g, true, this.f93925ab), 0L);
    }

    public final synchronized boolean vy(long j2) {
        if (this.f43205p) {
            return false;
        }
        if (this.f43194e < this.f43192c) {
            if (j2 >= this.f43202m) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m27116w(@InterfaceC7396q qrj settings) throws IOException {
        d2ok.m23075h(settings, "settings");
        synchronized (this.f43212w) {
            synchronized (this) {
                if (this.f43205p) {
                    throw new C7472k();
                }
                this.f43191b.m27165p(settings);
                was wasVar = was.f36763k;
            }
            this.f43212w.d2ok(settings);
        }
    }

    public final int was() {
        return this.f43214y;
    }

    @InterfaceC7396q
    public final Map<Integer, C7478s> wlev() {
        return this.f43203n;
    }

    /* JADX INFO: renamed from: x */
    public final void m27117x(@InterfaceC7396q okhttp3.internal.http2.toq connectionCode, @InterfaceC7396q okhttp3.internal.http2.toq streamCode, @InterfaceC7395n IOException iOException) {
        int i2;
        d2ok.m23075h(connectionCode, "connectionCode");
        d2ok.m23075h(streamCode, "streamCode");
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m2t(connectionCode);
        } catch (IOException unused) {
        }
        Object[] array = null;
        synchronized (this) {
            if (!this.f43203n.isEmpty()) {
                array = this.f43203n.values().toArray(new C7478s[0]);
                this.f43203n.clear();
            }
            was wasVar = was.f36763k;
        }
        C7478s[] c7478sArr = (C7478s[]) array;
        if (c7478sArr != null) {
            for (C7478s c7478s : c7478sArr) {
                try {
                    c7478s.m27175q(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f43212w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f43193d.close();
        } catch (IOException unused4) {
        }
        this.f43198i.fn3e();
        this.f43215z.fn3e();
        this.f43209t.fn3e();
    }

    public final void yw(int i2, @InterfaceC7396q okhttp3.internal.http2.toq errorCode) {
        d2ok.m23075h(errorCode, "errorCode");
        this.f43198i.n7h(new ld6(this.f43196g + '[' + i2 + "] writeSynReset", true, this, i2, errorCode), 0L);
    }

    public final void z4t() throws InterruptedException {
        synchronized (this) {
            this.f43199j++;
        }
        bih(false, 3, 1330343787);
    }
}
