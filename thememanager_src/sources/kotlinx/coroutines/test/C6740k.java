package kotlinx.coroutines.test;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.x2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.d3;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.ld6;
import kotlin.qrj;
import kotlin.was;
import kotlinx.coroutines.AbstractC6741u;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.internal.nn86;
import kotlinx.coroutines.x9kr;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.test.k */
/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0013\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bH\u0010IJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0002J7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J$\u0010(\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010)\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010*\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J*\u0010,\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0+\u0012\u0004\u0012\u00020&0$J\b\u0010-\u001a\u00020\"H\u0016R\u0016\u00100\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020%018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010AR\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020%0+8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lkotlinx/coroutines/test/k;", "Lkotlin/coroutines/f7l8;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "jk", "", "delayTime", "Lkotlinx/coroutines/test/zy;", "gvn7", "d3", "targetTime", "eqxt", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/f7l8$toq;", "operation", "fold", "(Ljava/lang/Object;Lcyoe/h;)Ljava/lang/Object;", C0846k.d9i, "Lkotlin/coroutines/f7l8$zy;", InterfaceC1925p.qn, "get", "(Lkotlin/coroutines/f7l8$zy;)Lkotlin/coroutines/f7l8$toq;", "minusKey", "Ljava/util/concurrent/TimeUnit;", "unit", "fti", C7704k.y.toq.f44691k, "n7h", "oc", "mcp", "", "message", "Lkotlin/Function1;", "", "", "predicate", "z", "cdj", "i", "", "zurt", "toString", "k", "Ljava/lang/String;", "name", "", "q", "Ljava/util/List;", "uncaughtExceptions", "Lkotlinx/coroutines/test/k$k;", "n", "Lkotlinx/coroutines/test/k$k;", "ctxDispatcher", "Lkotlinx/coroutines/x9kr;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/x9kr;", "ctxHandler", "Lkotlinx/coroutines/internal/nn86;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/internal/nn86;", "queue", com.market.sdk.reflect.toq.f68928f7l8, "counter", "p", "time", "a9", "()Ljava/util/List;", "exceptions", C4991s.f28129n, "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@ld6(level = qrj.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @hb(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
public final class C6740k implements f7l8 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final x9kr f37448g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final String f37449k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final k f37450n;

    /* JADX INFO: renamed from: p */
    private long f37451p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final List<Throwable> f37452q;

    /* JADX INFO: renamed from: s */
    private long f37453s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final nn86<zy> f37454y;

    /* JADX INFO: renamed from: kotlinx.coroutines.test.k$k */
    /* JADX INFO: compiled from: TestCoroutineContext.kt */
    @d3(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/test/k$k;", "Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/m;", "Lkotlin/coroutines/f7l8;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "", "r25n", "", "timeMillis", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "Lkotlinx/coroutines/ch;", "i1", "b8", "", "toString", C4991s.f28129n, "(Lkotlinx/coroutines/test/k;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class k extends AbstractC6741u implements InterfaceC6699m {

        /* JADX INFO: renamed from: kotlinx.coroutines.test.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TestCoroutineContext.kt */
        @d3(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"kotlinx/coroutines/test/k$k$k", "Lkotlinx/coroutines/ch;", "Lkotlin/was;", "zy", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C8091k implements ch {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C6740k f37456k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ zy f37457q;

            C8091k(C6740k c6740k, zy zyVar) {
                this.f37456k = c6740k;
                this.f37457q = zyVar;
            }

            @Override // kotlinx.coroutines.ch
            public void zy() {
                this.f37456k.f37454y.m24390p(this.f37457q);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.test.k$k$toq */
        /* JADX INFO: compiled from: Runnable.kt */
        @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "run", "()V", "kotlinx/coroutines/b3e$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cdj f37458k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ k f37459q;

            public toq(cdj cdjVar, k kVar) {
                this.f37458k = cdjVar;
                this.f37459q = kVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f37458k.jk(this.f37459q, was.f36763k);
            }
        }

        public k() {
            AbstractC6741u.o05(this, false, 1, null);
        }

        @Override // kotlinx.coroutines.AbstractC6741u
        public long b8() {
            return C6740k.this.d3();
        }

        @Override // kotlinx.coroutines.dd
        public void bap7(@InterfaceC7396q f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
            C6740k.this.jk(runnable);
        }

        @Override // kotlinx.coroutines.InterfaceC6699m
        @InterfaceC7395n
        @ld6(level = qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            return InterfaceC6699m.k.m24489k(this, j2, interfaceC6216q);
        }

        @Override // kotlinx.coroutines.InterfaceC6699m
        @InterfaceC7396q
        public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q f7l8 f7l8Var) {
            return new C8091k(C6740k.this, C6740k.this.gvn7(runnable, j2));
        }

        @Override // kotlinx.coroutines.AbstractC6741u
        public boolean r25n() {
            return true;
        }

        @Override // kotlinx.coroutines.dd
        @InterfaceC7396q
        public String toString() {
            return "Dispatcher(" + C6740k.this + ')';
        }

        @Override // kotlinx.coroutines.InterfaceC6699m
        public void zy(long j2, @InterfaceC7396q cdj<? super was> cdjVar) {
            C6740k.this.gvn7(new toq(cdjVar, this), j2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.test.k$toq */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @d3(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/l$k", "Lkotlin/coroutines/k;", "Lkotlinx/coroutines/x9kr;", "Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "handleException", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq extends AbstractC6212k implements x9kr {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C6740k f37460k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(x9kr.toq toqVar, C6740k c6740k) {
            super(toqVar);
            this.f37460k = c6740k;
        }

        @Override // kotlinx.coroutines.x9kr
        public void handleException(@InterfaceC7396q f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
            this.f37460k.f37452q.add(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6740k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C6740k(@InterfaceC7395n String str) {
        this.f37449k = str;
        this.f37452q = new ArrayList();
        this.f37450n = new k();
        this.f37448g = new toq(x9kr.mdr8, this);
        this.f37454y = new nn86<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long d3() {
        zy zyVar = (zy) this.f37454y.m24392y();
        if (zyVar != null) {
            eqxt(zyVar.f37463n);
        }
        return this.f37454y.f7l8() ? Long.MAX_VALUE : 0L;
    }

    private final void eqxt(long j2) {
        kotlinx.coroutines.internal.hb hbVarLd6;
        while (true) {
            nn86<zy> nn86Var = this.f37454y;
            synchronized (nn86Var) {
                kotlinx.coroutines.internal.hb hbVarM24389n = nn86Var.m24389n();
                if (hbVarM24389n != null) {
                    hbVarLd6 = (((zy) hbVarM24389n).f37463n > j2 ? 1 : (((zy) hbVarM24389n).f37463n == j2 ? 0 : -1)) <= 0 ? nn86Var.ld6(0) : null;
                }
            }
            zy zyVar = (zy) hbVarLd6;
            if (zyVar == null) {
                return;
            }
            long j3 = zyVar.f37463n;
            if (j3 != 0) {
                this.f37451p = j3;
            }
            zyVar.run();
        }
    }

    public static /* synthetic */ void fn3e(C6740k c6740k, String str, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        c6740k.m24624i(str, x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zy gvn7(Runnable runnable, long j2) {
        long j3 = this.f37453s;
        this.f37453s = 1 + j3;
        zy zyVar = new zy(runnable, j3, this.f37451p + TimeUnit.MILLISECONDS.toNanos(j2));
        this.f37454y.toq(zyVar);
        return zyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jk(Runnable runnable) {
        nn86<zy> nn86Var = this.f37454y;
        long j2 = this.f37453s;
        this.f37453s = 1 + j2;
        nn86Var.toq(new zy(runnable, j2, 0L, 4, null));
    }

    public static /* synthetic */ long jp0y(C6740k c6740k, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return c6740k.fti(timeUnit);
    }

    public static /* synthetic */ void kja0(C6740k c6740k, long j2, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        c6740k.n7h(j2, timeUnit);
    }

    public static /* synthetic */ void ni7(C6740k c6740k, String str, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        c6740k.zurt(str, x2Var);
    }

    public static /* synthetic */ void o1t(C6740k c6740k, String str, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        c6740k.m24626z(str, x2Var);
    }

    public static /* synthetic */ long qrj(C6740k c6740k, long j2, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return c6740k.m24625s(j2, timeUnit);
    }

    public static /* synthetic */ void t8r(C6740k c6740k, String str, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        c6740k.cdj(str, x2Var);
    }

    @InterfaceC7396q
    public final List<Throwable> a9() {
        return this.f37452q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cdj(@InterfaceC7396q String str, @InterfaceC7396q x2<? super Throwable, Boolean> x2Var) {
        List<Throwable> list = this.f37452q;
        boolean z2 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!x2Var.invoke(it.next()).booleanValue()) {
                    z2 = false;
                    break;
                }
            }
        }
        if (!z2) {
            throw new AssertionError(str);
        }
        this.f37452q.clear();
    }

    @Override // kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
        return interfaceC5979h.invoke(interfaceC5979h.invoke(r2, this.f37450n), this.f37448g);
    }

    public final long fti(@InterfaceC7396q TimeUnit timeUnit) {
        return timeUnit.convert(this.f37451p, TimeUnit.NANOSECONDS);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        if (zyVar == InterfaceC6214n.ep) {
            return this.f37450n;
        }
        if (zyVar == x9kr.mdr8) {
            return this.f37448g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m24624i(@InterfaceC7396q String str, @InterfaceC7396q x2<? super Throwable, Boolean> x2Var) {
        List<Throwable> list = this.f37452q;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (x2Var.invoke(it.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z2) {
            throw new AssertionError(str);
        }
        this.f37452q.clear();
    }

    public final void mcp() {
        if (this.f37454y.f7l8()) {
            return;
        }
        this.f37454y.m24391q();
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return zyVar == InterfaceC6214n.ep ? this.f37448g : zyVar == x9kr.mdr8 ? this.f37450n : this;
    }

    public final void n7h(long j2, @InterfaceC7396q TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        eqxt(nanos);
        if (nanos > this.f37451p) {
            this.f37451p = nanos;
        }
    }

    public final void oc() {
        eqxt(this.f37451p);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 plus(@InterfaceC7396q f7l8 f7l8Var) {
        return f7l8.C6195k.m22734k(this, f7l8Var);
    }

    /* JADX INFO: renamed from: s */
    public final long m24625s(long j2, @InterfaceC7396q TimeUnit timeUnit) {
        long j3 = this.f37451p;
        long nanos = timeUnit.toNanos(j2) + j3;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        n7h(nanos, timeUnit2);
        return timeUnit.convert(this.f37451p - j3, timeUnit2);
    }

    @InterfaceC7396q
    public String toString() {
        String str = this.f37449k;
        return str == null ? d2ok.mcp("TestCoroutineContext@", C6551e.toq(this)) : str;
    }

    /* JADX INFO: renamed from: z */
    public final void m24626z(@InterfaceC7396q String str, @InterfaceC7396q x2<? super Throwable, Boolean> x2Var) {
        if (this.f37452q.size() != 1 || !x2Var.invoke(this.f37452q.get(0)).booleanValue()) {
            throw new AssertionError(str);
        }
        this.f37452q.clear();
    }

    public final void zurt(@InterfaceC7396q String str, @InterfaceC7396q x2<? super List<? extends Throwable>, Boolean> x2Var) {
        if (!x2Var.invoke(this.f37452q).booleanValue()) {
            throw new AssertionError(str);
        }
        this.f37452q.clear();
    }

    public /* synthetic */ C6740k(String str, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? null : str);
    }
}
