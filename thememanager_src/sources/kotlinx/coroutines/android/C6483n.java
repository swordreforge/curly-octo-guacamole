package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.ld6;
import kotlin.qrj;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ki;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.yz;

/* JADX INFO: renamed from: kotlinx.coroutines.android.n */
/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/zy;", "f7l8", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/zy;", "Landroid/os/Looper;", "", "async", "q", "", "n", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/cdj;", "cont", "Lkotlin/was;", "x2", "Landroid/view/Choreographer;", "choreographer", "p", "k", com.market.sdk.reflect.toq.f68928f7l8, "MAX_DELAY", "toq", "Lkotlinx/coroutines/android/zy;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m22787k = 2, mv = {1, 6, 0})
public final class C6483n {

    @InterfaceC7395n
    private static volatile Choreographer choreographer = null;

    /* JADX INFO: renamed from: k */
    private static final long f36778k = 4611686018427387903L;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public static final zy f81955toq;

    /* JADX INFO: renamed from: kotlinx.coroutines.android.n$k */
    /* JADX INFO: compiled from: Runnable.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "run", "()V", "kotlinx/coroutines/b3e$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cdj f36779k;

        public k(cdj cdjVar) {
            this.f36779k = cdjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6483n.x2(this.f36779k);
        }
    }

    static {
        Object objM28280constructorimpl;
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(new toq(m23822q(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        f81955toq = (zy) (C6323o.m28285isFailureimpl(objM28280constructorimpl) ? null : objM28280constructorimpl);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @InterfaceC6769y(name = "from")
    public static final zy f7l8(@InterfaceC7396q Handler handler, @InterfaceC7395n String str) {
        return new toq(handler, str);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @InterfaceC6769y(name = "from")
    /* JADX INFO: renamed from: g */
    public static final zy m23818g(@InterfaceC7396q Handler handler) {
        return m23824y(handler, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ld6(cdj cdjVar, long j2) {
        cdjVar.jk(C6481a.m23813n(), Long.valueOf(j2));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public static final Object m23820n(@InterfaceC7396q InterfaceC6216q<? super Long> interfaceC6216q) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
            kiVar.a9();
            m23821p(choreographer2, kiVar);
            Object objM24474z = kiVar.m24474z();
            if (objM24474z == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            return objM24474z;
        }
        ki kiVar2 = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar2.a9();
        C6481a.m23813n().bap7(C6217s.INSTANCE, new k(kiVar2));
        Object objM24474z2 = kiVar2.m24474z();
        if (objM24474z2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m23821p(Choreographer choreographer2, final cdj<? super Long> cdjVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.q
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                C6483n.ld6(cdjVar, j2);
            }
        });
    }

    @InterfaceC7396q
    @yz
    /* JADX INFO: renamed from: q */
    public static final Handler m23822q(@InterfaceC7396q Looper looper, boolean z2) throws IllegalAccessException, InvocationTargetException {
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }

    @ld6(level = qrj.HIDDEN, message = "Use Dispatchers.Main instead")
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m23823s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(cdj<? super Long> cdjVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            d2ok.qrj(choreographer2);
            choreographer = choreographer2;
        }
        m23821p(choreographer2, cdjVar);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ zy m23824y(Handler handler, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return f7l8(handler, str);
    }
}
