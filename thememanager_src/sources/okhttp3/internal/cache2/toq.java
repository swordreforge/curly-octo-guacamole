package okhttp3.internal.cache2;

import b7.C1359g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.C7560j;
import okio.kja0;
import okio.nn86;
import okio.x2;

/* JADX INFO: compiled from: Relay.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class toq {

    /* JADX INFO: renamed from: h */
    private static final long f43030h = 32;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93851kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    public static final C7443k f93852ld6 = new C7443k(null);

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93853n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f93854qrj = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f93855x2 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final x2 f93856f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private Thread f43031g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private RandomAccessFile f43032k;

    /* JADX INFO: renamed from: n */
    private final long f43033n;

    /* JADX INFO: renamed from: p */
    private int f43034p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kja0 f43035q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final x2 f43036s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private nn86 f93857toq;

    /* JADX INFO: renamed from: y */
    private boolean f43037y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f93858zy;

    /* JADX INFO: renamed from: okhttp3.internal.cache2.toq$k */
    /* JADX INFO: compiled from: Relay.kt */
    public static final class C7443k {
        private C7443k() {
        }

        public /* synthetic */ C7443k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final toq m26980k(@InterfaceC7396q File file, @InterfaceC7396q nn86 upstream, @InterfaceC7396q kja0 metadata, long j2) throws IOException {
            d2ok.m23075h(file, "file");
            d2ok.m23075h(upstream, "upstream");
            d2ok.m23075h(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            toq toqVar = new toq(randomAccessFile, upstream, 0L, metadata, j2, null);
            randomAccessFile.setLength(0L);
            toqVar.fn3e(toq.f93851kja0, -1L, -1L);
            return toqVar;
        }

        @InterfaceC7396q
        public final toq toq(@InterfaceC7396q File file) throws IOException {
            d2ok.m23075h(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            d2ok.kja0(channel, "randomAccessFile.channel");
            C7442k c7442k = new C7442k(channel);
            x2 x2Var = new x2();
            c7442k.m26970k(0L, x2Var, 32L);
            if (!d2ok.f7l8(x2Var.fnq8(r1.size()), toq.f93853n7h)) {
                throw new IOException("unreadable cache file");
            }
            long j2 = x2Var.readLong();
            long j3 = x2Var.readLong();
            x2 x2Var2 = new x2();
            c7442k.m26970k(j2 + 32, x2Var2, j3);
            return new toq(randomAccessFile, null, j2, x2Var2.uj2j(), 0L, null);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache2.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Relay.kt */
    @lv5({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class C8121toq implements nn86 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7560j f43039k = new C7560j();

        /* JADX INFO: renamed from: n */
        private long f43040n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private C7442k f43041q;

        public C8121toq() {
            RandomAccessFile randomAccessFileM26972g = toq.this.m26972g();
            d2ok.qrj(randomAccessFileM26972g);
            FileChannel channel = randomAccessFileM26972g.getChannel();
            d2ok.kja0(channel, "file!!.channel");
            this.f43041q = new C7442k(channel);
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43041q == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f43041q = null;
            toq toqVar = toq.this;
            synchronized (toqVar) {
                toqVar.cdj(toqVar.f7l8() - 1);
                if (toqVar.f7l8() == 0) {
                    RandomAccessFile randomAccessFileM26972g = toqVar.m26972g();
                    toqVar.m26973h(null);
                    randomAccessFile = randomAccessFileM26972g;
                }
                was wasVar = was.f36763k;
            }
            if (randomAccessFile != null) {
                C1359g.kja0(randomAccessFile);
            }
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f43039k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            if (r4 != 2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            r8 = java.lang.Math.min(r21, r19.f43038g.m26976p() - r19.f43040n);
            r2 = r19.f43041q;
            kotlin.jvm.internal.d2ok.qrj(r2);
            r2.m26970k(r19.f43040n + 32, r20, r8);
            r19.f43040n += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        
            r0 = r19.f43038g.m26979y();
            kotlin.jvm.internal.d2ok.qrj(r0);
            r14 = r0.wx16(r19.f43038g.m26978s(), r19.f43038g.m26977q());
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        
            if (r14 != (-1)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        
            r0 = r19.f43038g;
            r0.toq(r0.m26976p());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        
            r2 = r19.f43038g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        
            r2.m26974i(null);
            kotlin.jvm.internal.d2ok.n7h(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = kotlin.was.f36763k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
        
            r9 = java.lang.Math.min(r14, r21);
            r19.f43038g.m26978s().yz(r20, 0, r9);
            r19.f43040n += r9;
            r13 = r19.f43041q;
            kotlin.jvm.internal.d2ok.qrj(r13);
            r13.toq(r19.f43038g.m26976p() + 32, r19.f43038g.m26978s().clone(), r14);
            r2 = r19.f43038g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            r2.zy().mo26936j(r2.m26978s(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
        
            if (r2.zy().size() <= r2.m26977q()) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
        
            r2.zy().skip(r2.zy().size() - r2.m26977q());
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
        
            r2.t8r(r2.m26976p() + r14);
            r0 = kotlin.was.f36763k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
        
            r2 = r19.f43038g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
        
            r2.m26974i(null);
            kotlin.jvm.internal.d2ok.n7h(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x013f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
        
            r2 = r19.f43038g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
        
            r2.m26974i(null);
            kotlin.jvm.internal.d2ok.n7h(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = kotlin.was.f36763k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0151, code lost:
        
            throw r0;
         */
        @Override // okio.nn86
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long wx16(@mub.InterfaceC7396q okio.x2 r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.toq.C8121toq.wx16(okio.x2, long):long");
        }
    }

    static {
        kja0.C7563k c7563k = kja0.Companion;
        f93853n7h = c7563k.x2("OkHttp cache v1\n");
        f93851kja0 = c7563k.x2("OkHttp DIRTY :(\n");
    }

    private toq(RandomAccessFile randomAccessFile, nn86 nn86Var, long j2, kja0 kja0Var, long j3) {
        this.f43032k = randomAccessFile;
        this.f93857toq = nn86Var;
        this.f93858zy = j2;
        this.f43035q = kja0Var;
        this.f43033n = j3;
        this.f93856f7l8 = new x2();
        this.f43037y = this.f93857toq == null;
        this.f43036s = new x2();
    }

    public /* synthetic */ toq(RandomAccessFile randomAccessFile, nn86 nn86Var, long j2, kja0 kja0Var, long j3, ni7 ni7Var) {
        this(randomAccessFile, nn86Var, j2, kja0Var, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fn3e(kja0 kja0Var, long j2, long j3) throws IOException {
        x2 x2Var = new x2();
        x2Var.uc(kja0Var);
        x2Var.writeLong(j2);
        x2Var.writeLong(j3);
        if (!(x2Var.size() == 32)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.f43032k;
        d2ok.qrj(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        d2ok.kja0(channel, "file!!.channel");
        new C7442k(channel).toq(0L, x2Var, 32L);
    }

    private final void zurt(long j2) throws IOException {
        x2 x2Var = new x2();
        x2Var.uc(this.f43035q);
        RandomAccessFile randomAccessFile = this.f43032k;
        d2ok.qrj(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        d2ok.kja0(channel, "file!!.channel");
        new C7442k(channel).toq(32 + j2, x2Var, this.f43035q.size());
    }

    public final void cdj(int i2) {
        this.f43034p = i2;
    }

    public final int f7l8() {
        return this.f43034p;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final RandomAccessFile m26972g() {
        return this.f43032k;
    }

    /* JADX INFO: renamed from: h */
    public final void m26973h(@InterfaceC7395n RandomAccessFile randomAccessFile) {
        this.f43032k = randomAccessFile;
    }

    /* JADX INFO: renamed from: i */
    public final void m26974i(@InterfaceC7395n Thread thread) {
        this.f43031g = thread;
    }

    public final void ki(@InterfaceC7395n nn86 nn86Var) {
        this.f93857toq = nn86Var;
    }

    public final void kja0(boolean z2) {
        this.f43037y = z2;
    }

    @InterfaceC7395n
    public final Thread ld6() {
        return this.f43031g;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m26975n() {
        return this.f43037y;
    }

    @InterfaceC7395n
    public final nn86 n7h() {
        synchronized (this) {
            if (this.f43032k == null) {
                return null;
            }
            this.f43034p++;
            return new C8121toq();
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m26976p() {
        return this.f93858zy;
    }

    /* JADX INFO: renamed from: q */
    public final long m26977q() {
        return this.f43033n;
    }

    @InterfaceC7396q
    public final kja0 qrj() {
        return this.f43035q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final x2 m26978s() {
        return this.f93856f7l8;
    }

    public final void t8r(long j2) {
        this.f93858zy = j2;
    }

    public final void toq(long j2) throws IOException {
        zurt(j2);
        RandomAccessFile randomAccessFile = this.f43032k;
        d2ok.qrj(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        fn3e(f93853n7h, j2, this.f43035q.size());
        RandomAccessFile randomAccessFile2 = this.f43032k;
        d2ok.qrj(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f43037y = true;
            was wasVar = was.f36763k;
        }
        nn86 nn86Var = this.f93857toq;
        if (nn86Var != null) {
            C1359g.kja0(nn86Var);
        }
        this.f93857toq = null;
    }

    public final boolean x2() {
        return this.f43032k == null;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final nn86 m26979y() {
        return this.f93857toq;
    }

    @InterfaceC7396q
    public final x2 zy() {
        return this.f43036s;
    }
}
