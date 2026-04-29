package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5717e;
import cyoe.InterfaceC5981k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6480z;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.internal.C6679l;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010X\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bZ\u0010\u001fJ#\u0010[\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010TJ\u001b\u0010e\u001a\u00020\u000e*\u00020d2\u0006\u0010U\u001a\u00028\u0000H\u0016¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020\u000e*\u00020d2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020mH\u0014¢\u0006\u0004\bp\u0010oR \u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010|\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010{R\u0014\u0010~\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010oR\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010BR\u0016\u0010\u0080\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0082\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0086\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/ki;", C0846k.zaso, "Lkotlinx/coroutines/bf2;", "Lkotlinx/coroutines/cdj;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "mcp", "()Z", "", "cause", "t8r", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lkotlin/was;", "block", AnimatedProperty.PROPERTY_NAME_H, "(Lcyoe/k;)V", "Lkotlin/Function1;", "Lkotlin/c;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "ld6", "(Lcyoe/x2;Ljava/lang/Throwable;)V", "n5r1", "ncyb", "Lkotlinx/coroutines/ch;", "t", "()Lkotlinx/coroutines/ch;", "oc", "()V", "", "state", "jp0y", "(Lcyoe/x2;Ljava/lang/Object;)V", "Lkotlinx/coroutines/kja0;", "fti", "(Lcyoe/x2;)Lkotlinx/coroutines/kja0;", "", "mode", "zurt", "(I)V", "Lkotlinx/coroutines/se;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "x9kr", "(Lkotlinx/coroutines/se;Ljava/lang/Object;ILcyoe/x2;Ljava/lang/Object;)Ljava/lang/Object;", "d2ok", "(Ljava/lang/Object;ILcyoe/x2;)V", "Lkotlinx/coroutines/internal/l;", C5717e.f31929a, "(Ljava/lang/Object;Ljava/lang/Object;Lcyoe/x2;)Lkotlinx/coroutines/internal/l;", "", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Void;", "fn3e", "a9", "eqxt", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/lang/Object;", "takenState", "zy", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "k", "d3", "(Ljava/lang/Throwable;)V", "x2", "(Lkotlinx/coroutines/kja0;Ljava/lang/Throwable;)V", "ki", "Lkotlinx/coroutines/gbni;", "parent", "fu4", "(Lkotlinx/coroutines/gbni;)Ljava/lang/Throwable;", "z", "Lkotlin/o;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "n7h", "(Ljava/lang/Object;Lcyoe/x2;)V", "ni7", "(Lcyoe/x2;)V", "i", "qrj", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "lvui", "(Ljava/lang/Object;Ljava/lang/Object;Lcyoe/x2;)Ljava/lang/Object;", "exception", "kja0", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "r", "Lkotlinx/coroutines/dd;", "jk", "(Lkotlinx/coroutines/dd;Ljava/lang/Object;)V", "cdj", "(Lkotlinx/coroutines/dd;Ljava/lang/Throwable;)V", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;)Ljava/lang/Object;", "n", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "gvn7", "Lkotlin/coroutines/q;", "Lkotlin/coroutines/q;", "q", "()Lkotlin/coroutines/q;", "delegate", "Lkotlin/coroutines/f7l8;", "Lkotlin/coroutines/f7l8;", "getContext", "()Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/ch;", "parentHandle", "wvg", "stateDebugRepresentation", "o1t", "isActive", "p", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", C4991s.f28129n, "(Lkotlin/coroutines/q;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@kotlin.nn86
public class ki<T> extends bf2<T> implements cdj<T>, InterfaceC6207n {

    @InterfaceC7396q
    private volatile /* synthetic */ int _decision;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC6216q<T> f37285g;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private ch f37286s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f37287y;

    /* JADX INFO: renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37284p = AtomicIntegerFieldUpdater.newUpdater(ki.class, "_decision");

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37283h = AtomicReferenceFieldUpdater.newUpdater(ki.class, Object.class, "_state");

    /* JADX WARN: Multi-variable type inference failed */
    public ki(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, int i2) {
        super(i2);
        this.f37285g = interfaceC6216q;
        this.f37287y = interfaceC6216q.getContext();
        this._decision = 0;
        this._state = C6709q.f37318k;
    }

    private final void d2ok(Object obj, int i2, cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof se)) {
                if (obj2 instanceof fn3e) {
                    fn3e fn3eVar = (fn3e) obj2;
                    if (fn3eVar.zy()) {
                        if (x2Var == null) {
                            return;
                        }
                        ki(x2Var, fn3eVar.f36774k);
                        return;
                    }
                }
                m24471s(obj);
                throw new C6480z();
            }
        } while (!androidx.concurrent.futures.toq.m906k(f37283h, this, obj2, x9kr((se) obj2, obj, i2, x2Var, null)));
        fn3e();
        zurt(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void dd(ki kiVar, Object obj, int i2, cyoe.x2 x2Var, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            x2Var = null;
        }
        kiVar.d2ok(obj, i2, x2Var);
    }

    private final void fn3e() {
        if (mcp()) {
            return;
        }
        m24473i();
    }

    private final kja0 fti(cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return x2Var instanceof kja0 ? (kja0) x2Var : new d8wk(x2Var);
    }

    /* JADX INFO: renamed from: h */
    private final void m24469h(InterfaceC5981k<kotlin.was> interfaceC5981k) {
        try {
            interfaceC5981k.invoke();
        } catch (Throwable th) {
            C6697l.toq(getContext(), new gvn7(kotlin.jvm.internal.d2ok.mcp("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    private final void jp0y(cyoe.x2<? super Throwable, kotlin.was> x2Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + x2Var + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: l */
    private final C6679l m24470l(Object obj, Object obj2, cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof se)) {
                if ((obj3 instanceof jk) && obj2 != null && ((jk) obj3).f37278q == obj2) {
                    return t8r.f37447q;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.toq.m906k(f37283h, this, obj3, x9kr((se) obj3, obj, this.f36789n, x2Var, obj2)));
        fn3e();
        return t8r.f37447q;
    }

    private final void ld6(cyoe.x2<? super Throwable, kotlin.was> x2Var, Throwable th) {
        try {
            x2Var.invoke(th);
        } catch (Throwable th2) {
            C6697l.toq(getContext(), new gvn7(kotlin.jvm.internal.d2ok.mcp("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean mcp() {
        return i1.m24309q(this.f36789n) && ((kotlinx.coroutines.internal.x2) this.f37285g).t8r();
    }

    private final boolean n5r1() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f37284p.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean ncyb() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f37284p.compareAndSet(this, 0, 2));
        return true;
    }

    private final void oc() {
        InterfaceC6216q<T> interfaceC6216q = this.f37285g;
        kotlinx.coroutines.internal.x2 x2Var = interfaceC6216q instanceof kotlinx.coroutines.internal.x2 ? (kotlinx.coroutines.internal.x2) interfaceC6216q : null;
        Throwable thO1t = x2Var != null ? x2Var.o1t(this) : null;
        if (thO1t == null) {
            return;
        }
        m24473i();
        mo23846k(thO1t);
    }

    /* JADX INFO: renamed from: s */
    private final Void m24471s(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Already resumed, but proposed with update ", obj).toString());
    }

    /* JADX INFO: renamed from: t */
    private final ch m24472t() {
        gbni gbniVar = (gbni) getContext().get(gbni.ygy);
        if (gbniVar == null) {
            return null;
        }
        ch chVarM24291g = gbni.C6665k.m24291g(gbniVar, true, false, new zurt(this), 2, null);
        this.f37286s = chVarM24291g;
        return chVarM24291g;
    }

    private final boolean t8r(Throwable th) {
        if (mcp()) {
            return ((kotlinx.coroutines.internal.x2) this.f37285g).m24423i(th);
        }
        return false;
    }

    private final String wvg() {
        Object objO1t = o1t();
        return objO1t instanceof se ? "Active" : objO1t instanceof fn3e ? "Cancelled" : "Completed";
    }

    private final Object x9kr(se seVar, Object obj, int i2, cyoe.x2<? super Throwable, kotlin.was> x2Var, Object obj2) {
        if (obj instanceof a9) {
            return obj;
        }
        if (!i1.zy(i2) && obj2 == null) {
            return obj;
        }
        if (x2Var != null || (((seVar instanceof kja0) && !(seVar instanceof f7l8)) || obj2 != null)) {
            return new jk(obj, seVar instanceof kja0 ? (kja0) seVar : null, x2Var, obj2, null, 16, null);
        }
        return obj;
    }

    private final void zurt(int i2) {
        if (ncyb()) {
            return;
        }
        i1.m24307k(this, i2);
    }

    @Override // kotlinx.coroutines.cdj
    public void a9() {
        ch chVarM24472t = m24472t();
        if (chVarM24472t != null && mo23847p()) {
            chVarM24472t.zy();
            this.f37286s = bwp.f36798k;
        }
    }

    @Override // kotlinx.coroutines.cdj
    public void cdj(@InterfaceC7396q dd ddVar, @InterfaceC7396q Throwable th) {
        InterfaceC6216q<T> interfaceC6216q = this.f37285g;
        kotlinx.coroutines.internal.x2 x2Var = interfaceC6216q instanceof kotlinx.coroutines.internal.x2 ? (kotlinx.coroutines.internal.x2) interfaceC6216q : null;
        dd(this, new a9(th, false, 2, null), (x2Var != null ? x2Var.f37260g : null) == ddVar ? 4 : this.f36789n, null, 4, null);
    }

    public final void d3(@InterfaceC7396q Throwable th) {
        if (t8r(th)) {
            return;
        }
        mo23846k(th);
        fn3e();
    }

    @InterfaceC6769y(name = "resetStateReusable")
    public final boolean eqxt() {
        Object obj = this._state;
        if ((obj instanceof jk) && ((jk) obj).f37278q != null) {
            m24473i();
            return false;
        }
        this._decision = 0;
        this._state = C6709q.f37318k;
        return true;
    }

    @InterfaceC7396q
    public Throwable fu4(@InterfaceC7396q gbni gbniVar) {
        return gbniVar.d2ok();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.bf2
    /* JADX INFO: renamed from: g */
    public <T> T mo23827g(@InterfaceC7395n Object obj) {
        return obj instanceof jk ? (T) ((jk) obj).f37276k : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<T> interfaceC6216q = this.f37285g;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return this.f37287y;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @InterfaceC7396q
    protected String gvn7() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: i */
    public final void m24473i() {
        ch chVar = this.f37286s;
        if (chVar == null) {
            return;
        }
        chVar.zy();
        this.f37286s = bwp.f36798k;
    }

    @Override // kotlinx.coroutines.cdj
    public boolean isActive() {
        return o1t() instanceof se;
    }

    @Override // kotlinx.coroutines.cdj
    public boolean isCancelled() {
        return o1t() instanceof fn3e;
    }

    @Override // kotlinx.coroutines.cdj
    public void jk(@InterfaceC7396q dd ddVar, T t2) {
        InterfaceC6216q<T> interfaceC6216q = this.f37285g;
        kotlinx.coroutines.internal.x2 x2Var = interfaceC6216q instanceof kotlinx.coroutines.internal.x2 ? (kotlinx.coroutines.internal.x2) interfaceC6216q : null;
        dd(this, t2, (x2Var != null ? x2Var.f37260g : null) == ddVar ? 4 : this.f36789n, null, 4, null);
    }

    @Override // kotlinx.coroutines.cdj
    /* JADX INFO: renamed from: k */
    public boolean mo23846k(@InterfaceC7395n Throwable th) {
        Object obj;
        boolean z2;
        do {
            obj = this._state;
            if (!(obj instanceof se)) {
                return false;
            }
            z2 = obj instanceof kja0;
        } while (!androidx.concurrent.futures.toq.m906k(f37283h, this, obj, new fn3e(this, th, z2)));
        kja0 kja0Var = z2 ? (kja0) obj : null;
        if (kja0Var != null) {
            x2(kja0Var, th);
        }
        fn3e();
        zurt(this.f36789n);
        return true;
    }

    public final void ki(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var, @InterfaceC7396q Throwable th) {
        try {
            x2Var.invoke(th);
        } catch (Throwable th2) {
            C6697l.toq(getContext(), new gvn7(kotlin.jvm.internal.d2ok.mcp("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // kotlinx.coroutines.cdj
    @InterfaceC7395n
    public Object kja0(@InterfaceC7396q Throwable th) {
        return m24470l(new a9(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.cdj
    @InterfaceC7395n
    public Object lvui(T t2, @InterfaceC7395n Object obj, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return m24470l(t2, obj, x2Var);
    }

    @Override // kotlinx.coroutines.bf2
    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public Throwable mo23828n(@InterfaceC7395n Object obj) {
        Throwable thMo23828n = super.mo23828n(obj);
        if (thMo23828n == null) {
            return null;
        }
        mo23829q();
        return thMo23828n;
    }

    @Override // kotlinx.coroutines.cdj
    public void n7h(T t2, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        d2ok(t2, this.f36789n, x2Var);
    }

    @Override // kotlinx.coroutines.cdj
    public void ni7(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        kja0 kja0VarFti = fti(x2Var);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C6709q) {
                if (androidx.concurrent.futures.toq.m906k(f37283h, this, obj, kja0VarFti)) {
                    return;
                }
            } else if (obj instanceof kja0) {
                jp0y(x2Var, obj);
            } else {
                boolean z2 = obj instanceof a9;
                if (z2) {
                    a9 a9Var = (a9) obj;
                    if (!a9Var.toq()) {
                        jp0y(x2Var, obj);
                    }
                    if (obj instanceof fn3e) {
                        if (!z2) {
                            a9Var = null;
                        }
                        ld6(x2Var, a9Var != null ? a9Var.f36774k : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof jk) {
                    jk jkVar = (jk) obj;
                    if (jkVar.f82052toq != null) {
                        jp0y(x2Var, obj);
                    }
                    if (kja0VarFti instanceof f7l8) {
                        return;
                    }
                    if (jkVar.m24468y()) {
                        ld6(x2Var, jkVar.f37277n);
                        return;
                    } else {
                        if (androidx.concurrent.futures.toq.m906k(f37283h, this, obj, jk.f7l8(jkVar, null, kja0VarFti, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (kja0VarFti instanceof f7l8) {
                        return;
                    }
                    if (androidx.concurrent.futures.toq.m906k(f37283h, this, obj, new jk(obj, kja0VarFti, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @InterfaceC7395n
    public final Object o1t() {
        return this._state;
    }

    @Override // kotlinx.coroutines.cdj
    /* JADX INFO: renamed from: p */
    public boolean mo23847p() {
        return !(o1t() instanceof se);
    }

    @Override // kotlinx.coroutines.bf2
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final InterfaceC6216q<T> mo23829q() {
        return this.f37285g;
    }

    @Override // kotlinx.coroutines.cdj
    @InterfaceC7395n
    public Object qrj(T t2, @InterfaceC7395n Object obj) {
        return m24470l(t2, obj, null);
    }

    @Override // kotlinx.coroutines.cdj
    /* JADX INFO: renamed from: r */
    public void mo23848r(@InterfaceC7396q Object obj) {
        zurt(this.f36789n);
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        dd(this, eqxt.zy(obj, this), this.f36789n, null, 4, null);
    }

    @InterfaceC7396q
    public String toString() {
        return gvn7() + '(' + C6551e.zy(this.f37285g) + "){" + wvg() + "}@" + C6551e.toq(this);
    }

    public final void x2(@InterfaceC7396q kja0 kja0Var, @InterfaceC7395n Throwable th) {
        try {
            kja0Var.mo23837k(th);
        } catch (Throwable th2) {
            C6697l.toq(getContext(), new gvn7(kotlin.jvm.internal.d2ok.mcp("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // kotlinx.coroutines.bf2
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public Object mo23830y() {
        return o1t();
    }

    @kotlin.nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: z */
    public final Object m24474z() {
        gbni gbniVar;
        boolean zMcp = mcp();
        if (n5r1()) {
            if (this.f37286s == null) {
                m24472t();
            }
            if (zMcp) {
                oc();
            }
            return C6199q.x2();
        }
        if (zMcp) {
            oc();
        }
        Object objO1t = o1t();
        if (objO1t instanceof a9) {
            throw ((a9) objO1t).f36774k;
        }
        if (!i1.zy(this.f36789n) || (gbniVar = (gbni) getContext().get(gbni.ygy)) == null || gbniVar.isActive()) {
            return mo23827g(objO1t);
        }
        CancellationException cancellationExceptionD2ok = gbniVar.d2ok();
        zy(objO1t, cancellationExceptionD2ok);
        throw cancellationExceptionD2ok;
    }

    @Override // kotlinx.coroutines.bf2
    public void zy(@InterfaceC7395n Object obj, @InterfaceC7396q Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof se) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof a9) {
                return;
            }
            if (obj2 instanceof jk) {
                jk jkVar = (jk) obj2;
                if (!(!jkVar.m24468y())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.toq.m906k(f37283h, this, obj2, jk.f7l8(jkVar, null, null, null, null, th, 15, null))) {
                    jkVar.m24467s(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.toq.m906k(f37283h, this, obj2, new jk(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }
}
