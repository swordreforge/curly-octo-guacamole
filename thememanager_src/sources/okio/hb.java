package okio;

import com.google.android.exoplayer2.C3548p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.was;
import l05.InterfaceC6768s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class hb {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Condition f43722g;

    /* JADX INFO: renamed from: k */
    private long f43723k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ReentrantLock f43724n;

    /* JADX INFO: renamed from: q */
    private long f43725q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f94271toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f94272zy;

    /* JADX INFO: renamed from: okio.hb$k */
    /* JADX INFO: compiled from: Throttler.kt */
    public static final class C7547k extends fu4 {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ hb f43726q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7547k(vyq vyqVar, hb hbVar) {
            super(vyqVar);
            this.f43726q = hbVar;
        }

        @Override // okio.fu4, okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            while (j2 > 0) {
                try {
                    long jX2 = this.f43726q.x2(j2);
                    super.mo26936j(source, jX2);
                    j2 -= jX2;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* JADX INFO: compiled from: Throttler.kt */
    public static final class toq extends AbstractC7579z {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ hb f43727q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(nn86 nn86Var, hb hbVar) {
            super(nn86Var);
            this.f43727q = hbVar;
        }

        @Override // okio.AbstractC7579z, okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws InterruptedIOException {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            try {
                return super.wx16(sink, this.f43727q.x2(j2));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public hb(long j2) {
        this.f43723k = j2;
        this.f94272zy = 8192L;
        this.f43725q = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f43724n = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.d2ok.kja0(conditionNewCondition, "newCondition(...)");
        this.f43722g = conditionNewCondition;
    }

    /* JADX INFO: renamed from: g */
    private final long m27630g(long j2) {
        return (j2 * C3548p.f21101p) / this.f94271toq;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m27631n(hb hbVar, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = hbVar.f94272zy;
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            j4 = hbVar.f43725q;
        }
        hbVar.m27635q(j2, j5, j4);
    }

    /* JADX INFO: renamed from: s */
    private final long m27632s(long j2) {
        return (j2 * this.f94271toq) / C3548p.f21101p;
    }

    @InterfaceC7396q
    public final Condition f7l8() {
        return this.f43722g;
    }

    /* JADX INFO: renamed from: k */
    public final long m27633k(long j2, long j3) {
        if (this.f94271toq == 0) {
            return j3;
        }
        long jMax = Math.max(this.f43723k - j2, 0L);
        long jM27632s = this.f43725q - m27632s(jMax);
        if (jM27632s >= j3) {
            this.f43723k = j2 + jMax + m27630g(j3);
            return j3;
        }
        long j4 = this.f94272zy;
        if (jM27632s >= j4) {
            this.f43723k = j2 + m27630g(this.f43725q);
            return jM27632s;
        }
        long jMin = Math.min(j4, j3);
        long jM27630g = jMax + m27630g(jMin - this.f43725q);
        if (jM27630g != 0) {
            return -jM27630g;
        }
        this.f43723k = j2 + m27630g(this.f43725q);
        return jMin;
    }

    @InterfaceC7396q
    public final nn86 ld6(@InterfaceC7396q nn86 source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        return new toq(source, this);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final vyq m27634p(@InterfaceC7396q vyq sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return new C7547k(sink, this);
    }

    @InterfaceC6768s
    /* JADX INFO: renamed from: q */
    public final void m27635q(long j2, long j3, long j4) {
        ReentrantLock reentrantLock = this.f43724n;
        reentrantLock.lock();
        try {
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j3 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j4 >= j3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f94271toq = j2;
            this.f94272zy = j3;
            this.f43725q = j4;
            this.f43722g.signalAll();
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }

    @InterfaceC6768s
    public final void toq(long j2) {
        m27631n(this, j2, 0L, 0L, 6, null);
    }

    public final long x2(long j2) {
        if (!(j2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.f43724n;
        reentrantLock.lock();
        while (true) {
            try {
                long jM27633k = m27633k(System.nanoTime(), j2);
                if (jM27633k >= 0) {
                    return jM27633k;
                }
                this.f43722g.awaitNanos(-jM27633k);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final ReentrantLock m27636y() {
        return this.f43724n;
    }

    @InterfaceC6768s
    public final void zy(long j2, long j3) {
        m27631n(this, j2, j3, 0L, 4, null);
    }

    public hb() {
        this(System.nanoTime());
    }
}
