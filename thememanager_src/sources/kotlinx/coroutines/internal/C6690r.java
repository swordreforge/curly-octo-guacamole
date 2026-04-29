package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlinx.coroutines.AbstractC6696k;
import kotlinx.coroutines.gbni;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.r */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/r;", C0846k.zaso, "Lkotlinx/coroutines/k;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", "state", "Lkotlin/was;", "lrht", "uc", "Lkotlin/coroutines/q;", "n", "Lkotlin/coroutines/q;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", "", "wo", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/gbni;", "ebn", "()Lkotlinx/coroutines/gbni;", "parent", "Lkotlin/coroutines/f7l8;", "context", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class C6690r<T> extends AbstractC6696k<T> implements InterfaceC6207n {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC6216q<T> f37237n;

    /* JADX WARN: Multi-variable type inference failed */
    public C6690r(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        super(f7l8Var, true, true);
        this.f37237n = interfaceC6216q;
    }

    @InterfaceC7395n
    public final gbni ebn() {
        kotlinx.coroutines.ni7 ni7VarM24055d = m24055d();
        if (ni7VarM24055d == null) {
            return null;
        }
        return ni7VarM24055d.getParent();
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public final InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<T> interfaceC6216q = this.f37237n;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.etdu
    protected void lrht(@InterfaceC7395n Object obj) {
        qrj.f7l8(kotlin.coroutines.intrinsics.zy.m22747n(this.f37237n), kotlinx.coroutines.eqxt.m24046k(obj, this.f37237n), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC6696k
    protected void uc(@InterfaceC7395n Object obj) {
        InterfaceC6216q<T> interfaceC6216q = this.f37237n;
        interfaceC6216q.resumeWith(kotlinx.coroutines.eqxt.m24046k(obj, interfaceC6216q));
    }

    @Override // kotlinx.coroutines.etdu
    protected final boolean wo() {
        return true;
    }
}
