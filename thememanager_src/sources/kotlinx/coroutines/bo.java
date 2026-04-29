package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.internal.C6692t;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489\u001c:B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006;"}, d2 = {"Lkotlinx/coroutines/bo;", "Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/m;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "v5yj", "(Ljava/lang/Runnable;)Z", "u38j", "()Ljava/lang/Runnable;", "Lkotlin/was;", "m2t", "()V", "Lkotlinx/coroutines/bo$zy;", "ec", "(Lkotlinx/coroutines/bo$zy;)Z", "", "now", "delayedTask", "", "kiv", "(JLkotlinx/coroutines/bo$zy;)I", "ra", "shutdown", "timeMillis", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "(JLkotlinx/coroutines/cdj;)V", "block", "Lkotlinx/coroutines/ch;", "z4t", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/ch;", "b8", "()J", "Lkotlin/coroutines/f7l8;", "context", "bap7", "(Lkotlin/coroutines/f7l8;Ljava/lang/Runnable;)V", "ps", "(Ljava/lang/Runnable;)V", "uf", "(JLkotlinx/coroutines/bo$zy;)V", "nnh", "value", "p", "()Z", "bih", "(Z)V", "isCompleted", "m58i", "isEmpty", "gcp", "nextTime", C4991s.f28129n, "k", "toq", "q", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class bo extends y2 implements InterfaceC6699m {

    /* JADX INFO: renamed from: y */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36791y = AtomicReferenceFieldUpdater.newUpdater(bo.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36790s = AtomicReferenceFieldUpdater.newUpdater(bo.class, Object.class, "_delayed");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _queue = null;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _delayed = null;

    @InterfaceC7396q
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.bo$k */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/bo$k;", "Lkotlinx/coroutines/bo$zy;", "Lkotlin/was;", "run", "", "toString", "Lkotlinx/coroutines/cdj;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/cdj;", "cont", "", "nanoTime", C4991s.f28129n, "(Lkotlinx/coroutines/bo;JLkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class C6488k extends zy {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final cdj<kotlin.was> f36792g;

        /* JADX WARN: Multi-variable type inference failed */
        public C6488k(long j2, @InterfaceC7396q cdj<? super kotlin.was> cdjVar) {
            super(j2);
            this.f36792g = cdjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36792g.jk(bo.this, kotlin.was.f36763k);
        }

        @Override // kotlinx.coroutines.bo.zy
        @InterfaceC7396q
        public String toString() {
            return kotlin.jvm.internal.d2ok.mcp(super.toString(), this.f36792g);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.bo$q */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/bo$q;", "Lkotlinx/coroutines/internal/nn86;", "Lkotlinx/coroutines/bo$zy;", "", "toq", com.market.sdk.reflect.toq.f68928f7l8, "timeNow", C4991s.f28129n, "(J)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6489q extends kotlinx.coroutines.internal.nn86<zy> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        public long f81956toq;

        public C6489q(long j2) {
            this.f81956toq = j2;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/bo$toq;", "Lkotlinx/coroutines/bo$zy;", "Lkotlin/was;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", C7704k.y.toq.f95579toq, "Ljava/lang/Runnable;", "block", "", "nanoTime", C4991s.f28129n, "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class toq extends zy {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final Runnable f36794g;

        public toq(long j2, @InterfaceC7396q Runnable runnable) {
            super(j2);
            this.f36794g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36794g.run();
        }

        @Override // kotlinx.coroutines.bo.zy
        @InterfaceC7396q
        public String toString() {
            return kotlin.jvm.internal.d2ok.mcp(super.toString(), this.f36794g);
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lkotlinx/coroutines/bo$zy;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/ch;", "Lkotlinx/coroutines/internal/hb;", C2690k.k.f61039ld6, "", "n", "", "now", "", "p", "Lkotlinx/coroutines/bo$q;", "delayed", "Lkotlinx/coroutines/bo;", "eventLoop", C7704k.y.toq.f44691k, "Lkotlin/was;", "zy", "", "toString", "k", com.market.sdk.reflect.toq.f68928f7l8, "nanoTime", "", "q", "Ljava/lang/Object;", "_heap", com.market.sdk.reflect.toq.f28131g, "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/nn86;", "value", "()Lkotlinx/coroutines/internal/nn86;", "toq", "(Lkotlinx/coroutines/internal/nn86;)V", "heap", C4991s.f28129n, "(J)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static abstract class zy implements Runnable, Comparable<zy>, ch, kotlinx.coroutines.internal.hb {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        public long f36795k;

        /* JADX INFO: renamed from: n */
        private int f36796n = -1;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private Object f36797q;

        public zy(long j2) {
            this.f36795k = j2;
        }

        @Override // kotlinx.coroutines.internal.hb
        public int getIndex() {
            return this.f36796n;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(@InterfaceC7396q zy zyVar) {
            long j2 = this.f36795k - zyVar.f36795k;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m23834p(long j2) {
            return j2 - this.f36795k >= 0;
        }

        @Override // kotlinx.coroutines.internal.hb
        @InterfaceC7395n
        /* JADX INFO: renamed from: q */
        public kotlinx.coroutines.internal.nn86<?> mo23835q() {
            Object obj = this.f36797q;
            if (obj instanceof kotlinx.coroutines.internal.nn86) {
                return (kotlinx.coroutines.internal.nn86) obj;
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public final synchronized int m23836s(long j2, @InterfaceC7396q C6489q c6489q, @InterfaceC7396q bo boVar) {
            if (this.f36797q == gyi.f37191k) {
                return 2;
            }
            synchronized (c6489q) {
                zy zyVarM24389n = c6489q.m24389n();
                if (boVar.m23831p()) {
                    return 1;
                }
                if (zyVarM24389n == null) {
                    c6489q.f81956toq = j2;
                } else {
                    long j3 = zyVarM24389n.f36795k;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - c6489q.f81956toq > 0) {
                        c6489q.f81956toq = j2;
                    }
                }
                long j4 = this.f36795k;
                long j5 = c6489q.f81956toq;
                if (j4 - j5 < 0) {
                    this.f36795k = j5;
                }
                c6489q.m24388k(this);
                return 0;
            }
        }

        @Override // kotlinx.coroutines.internal.hb
        public void setIndex(int i2) {
            this.f36796n = i2;
        }

        @InterfaceC7396q
        public String toString() {
            return "Delayed[nanos=" + this.f36795k + ']';
        }

        @Override // kotlinx.coroutines.internal.hb
        public void toq(@InterfaceC7395n kotlinx.coroutines.internal.nn86<?> nn86Var) {
            if (!(this.f36797q != gyi.f37191k)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f36797q = nn86Var;
        }

        @Override // kotlinx.coroutines.ch
        public final synchronized void zy() {
            Object obj = this.f36797q;
            if (obj == gyi.f37191k) {
                return;
            }
            C6489q c6489q = obj instanceof C6489q ? (C6489q) obj : null;
            if (c6489q != null) {
                c6489q.m24390p(this);
            }
            this.f36797q = gyi.f37191k;
        }
    }

    private final void bih(boolean z2) {
        this._isCompleted = z2 ? 1 : 0;
    }

    private final boolean ec(zy zyVar) {
        C6489q c6489q = (C6489q) this._delayed;
        return (c6489q == null ? null : c6489q.m24392y()) == zyVar;
    }

    private final int kiv(long j2, zy zyVar) {
        if (m23831p()) {
            return 1;
        }
        C6489q c6489q = (C6489q) this._delayed;
        if (c6489q == null) {
            androidx.concurrent.futures.toq.m906k(f36790s, this, null, new C6489q(j2));
            Object obj = this._delayed;
            kotlin.jvm.internal.d2ok.qrj(obj);
            c6489q = (C6489q) obj;
        }
        return zyVar.m23836s(j2, c6489q, this);
    }

    private final void m2t() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (androidx.concurrent.futures.toq.m906k(f36791y, this, null, gyi.f37194y)) {
                    return;
                }
            } else if (obj instanceof C6692t) {
                ((C6692t) obj).m24408q();
                return;
            } else {
                if (obj == gyi.f37194y) {
                    return;
                }
                C6692t c6692t = new C6692t(8, true);
                c6692t.m24407k((Runnable) obj);
                if (androidx.concurrent.futures.toq.m906k(f36791y, this, obj, c6692t)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: p */
    public final boolean m23831p() {
        return this._isCompleted;
    }

    private final void ra() {
        kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
        Long lValueOf = qVar == null ? null : Long.valueOf(qVar.toq());
        long jNanoTime = lValueOf == null ? System.nanoTime() : lValueOf.longValue();
        while (true) {
            C6489q c6489q = (C6489q) this._delayed;
            zy zyVarQrj = c6489q == null ? null : c6489q.qrj();
            if (zyVarQrj == null) {
                return;
            } else {
                ix(jNanoTime, zyVarQrj);
            }
        }
    }

    private final Runnable u38j() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C6692t) {
                C6692t c6692t = (C6692t) obj;
                Object objX2 = c6692t.x2();
                if (objX2 != C6692t.f37240i) {
                    return (Runnable) objX2;
                }
                androidx.concurrent.futures.toq.m906k(f36791y, this, obj, c6692t.ld6());
            } else {
                if (obj == gyi.f37194y) {
                    return null;
                }
                if (androidx.concurrent.futures.toq.m906k(f36791y, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean v5yj(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m23831p()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.toq.m906k(f36791y, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C6692t) {
                C6692t c6692t = (C6692t) obj;
                int iM24407k = c6692t.m24407k(runnable);
                if (iM24407k == 0) {
                    return true;
                }
                if (iM24407k == 1) {
                    androidx.concurrent.futures.toq.m906k(f36791y, this, obj, c6692t.ld6());
                } else if (iM24407k == 2) {
                    return false;
                }
            } else {
                if (obj == gyi.f37194y) {
                    return false;
                }
                C6692t c6692t2 = new C6692t(8, true);
                c6692t2.m24407k((Runnable) obj);
                c6692t2.m24407k(runnable);
                if (androidx.concurrent.futures.toq.m906k(f36791y, this, obj, c6692t2)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC6741u
    public long b8() {
        zy zyVarLd6;
        if (nme()) {
            return 0L;
        }
        C6489q c6489q = (C6489q) this._delayed;
        if (c6489q != null && !c6489q.f7l8()) {
            kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
            Long lValueOf = qVar == null ? null : Long.valueOf(qVar.toq());
            long jNanoTime = lValueOf == null ? System.nanoTime() : lValueOf.longValue();
            do {
                synchronized (c6489q) {
                    zy zyVarM24389n = c6489q.m24389n();
                    if (zyVarM24389n == null) {
                        zyVarLd6 = null;
                    } else {
                        zy zyVar = zyVarM24389n;
                        zyVarLd6 = zyVar.m23834p(jNanoTime) ? v5yj(zyVar) : false ? c6489q.ld6(0) : null;
                    }
                }
            } while (zyVarLd6 != null);
        }
        Runnable runnableU38j = u38j();
        if (runnableU38j == null) {
            return gcp();
        }
        runnableU38j.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.dd
    public final void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        ps(runnable);
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        return InterfaceC6699m.k.m24489k(this, j2, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.AbstractC6741u
    protected long gcp() {
        if (super.gcp() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C6692t)) {
                return obj == gyi.f37194y ? Long.MAX_VALUE : 0L;
            }
            if (!((C6692t) obj).m24410y()) {
                return 0L;
            }
        }
        C6489q c6489q = (C6489q) this._delayed;
        zy zyVarM24392y = c6489q == null ? null : c6489q.m24392y();
        if (zyVarM24392y == null) {
            return Long.MAX_VALUE;
        }
        long j2 = zyVarM24392y.f36795k;
        kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
        Long lValueOf = qVar != null ? Long.valueOf(qVar.toq()) : null;
        return kotlin.ranges.fn3e.zurt(j2 - (lValueOf == null ? System.nanoTime() : lValueOf.longValue()), 0L);
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return InterfaceC6699m.k.toq(this, j2, runnable, f7l8Var);
    }

    @Override // kotlinx.coroutines.AbstractC6741u
    protected boolean m58i() {
        if (!b9ub()) {
            return false;
        }
        C6489q c6489q = (C6489q) this._delayed;
        if (c6489q != null && !c6489q.f7l8()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C6692t) {
                return ((C6692t) obj).m24410y();
            }
            if (obj != gyi.f37194y) {
                return false;
            }
        }
        return true;
    }

    protected final void nnh() {
        this._queue = null;
        this._delayed = null;
    }

    public void ps(@InterfaceC7396q Runnable runnable) {
        if (v5yj(runnable)) {
            kx3();
        } else {
            nn86.f37313p.ps(runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC6741u
    public void shutdown() {
        ixz.f37275k.zy();
        bih(true);
        m2t();
        while (b8() <= 0) {
        }
        ra();
    }

    public final void uf(long j2, @InterfaceC7396q zy zyVar) {
        int iKiv = kiv(j2, zyVar);
        if (iKiv == 0) {
            if (ec(zyVar)) {
                kx3();
            }
        } else if (iKiv == 1) {
            ix(j2, zyVar);
        } else if (iKiv != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @InterfaceC7396q
    protected final ch z4t(long j2, @InterfaceC7396q Runnable runnable) {
        long jM24300q = gyi.m24300q(j2);
        if (jM24300q >= kotlin.time.f7l8.f81943zy) {
            return bwp.f36798k;
        }
        kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
        Long lValueOf = qVar == null ? null : Long.valueOf(qVar.toq());
        long jNanoTime = lValueOf == null ? System.nanoTime() : lValueOf.longValue();
        toq toqVar = new toq(jM24300q + jNanoTime, runnable);
        uf(jNanoTime, toqVar);
        return toqVar;
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    public void zy(long j2, @InterfaceC7396q cdj<? super kotlin.was> cdjVar) {
        long jM24300q = gyi.m24300q(j2);
        if (jM24300q < kotlin.time.f7l8.f81943zy) {
            kotlinx.coroutines.toq qVar = kotlinx.coroutines.zy.toq();
            Long lValueOf = qVar == null ? null : Long.valueOf(qVar.toq());
            long jNanoTime = lValueOf == null ? System.nanoTime() : lValueOf.longValue();
            C6488k c6488k = new C6488k(jM24300q + jNanoTime, cdjVar);
            C6668i.m24303k(cdjVar, c6488k);
            uf(jNanoTime, c6488k);
        }
    }
}
