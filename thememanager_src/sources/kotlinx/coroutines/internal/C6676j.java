package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.uc;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.j */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/j;", "", "Lkotlinx/coroutines/uc;", "element", "value", "Lkotlin/was;", "k", "Lkotlin/coroutines/f7l8;", "context", "toq", "Lkotlin/coroutines/f7l8;", "", "[Ljava/lang/Object;", "values", "zy", "[Lkotlinx/coroutines/uc;", "elements", "", "q", com.market.sdk.reflect.toq.f28131g, "i", "n", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6676j {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlin.coroutines.f7l8 f37218k;

    /* JADX INFO: renamed from: q */
    private int f37219q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Object[] f82013toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final uc<Object>[] f82014zy;

    public C6676j(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2) {
        this.f37218k = f7l8Var;
        this.f82013toq = new Object[i2];
        this.f82014zy = new uc[i2];
    }

    /* JADX INFO: renamed from: k */
    public final void m24352k(@InterfaceC7396q uc<?> ucVar, @InterfaceC7395n Object obj) {
        Object[] objArr = this.f82013toq;
        int i2 = this.f37219q;
        objArr[i2] = obj;
        uc<Object>[] ucVarArr = this.f82014zy;
        this.f37219q = i2 + 1;
        ucVarArr[i2] = ucVar;
    }

    public final void toq(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        int length = this.f82014zy.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            uc<Object> ucVar = this.f82014zy[length];
            kotlin.jvm.internal.d2ok.qrj(ucVar);
            ucVar.mo24416x(f7l8Var, this.f82013toq[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}
