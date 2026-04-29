package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/i9jn;", "Lkotlinx/coroutines/etdu;", "Lkotlinx/coroutines/mcp;", "", "uc", "ld6", "", "exception", AnimatedProperty.PROPERTY_NAME_Y, "q", com.market.sdk.reflect.toq.f68929toq, "xwq3", "()Z", "handlesException", "v", "onCancelComplete", "Lkotlinx/coroutines/gbni;", "parent", C4991s.f28129n, "(Lkotlinx/coroutines/gbni;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class i9jn extends etdu implements mcp {

    /* JADX INFO: renamed from: q */
    private final boolean f37203q;

    public i9jn(@InterfaceC7395n gbni gbniVar) {
        super(true);
        fnq8(gbniVar);
        this.f37203q = uc();
    }

    private final boolean uc() {
        ni7 ni7VarM24055d = m24055d();
        fu4 fu4Var = ni7VarM24055d instanceof fu4 ? (fu4) ni7VarM24055d : null;
        etdu etduVarM24638b = fu4Var == null ? null : fu4Var.m24638b();
        if (etduVarM24638b == null) {
            return false;
        }
        while (!etduVarM24638b.xwq3()) {
            ni7 ni7VarM24055d2 = etduVarM24638b.m24055d();
            fu4 fu4Var2 = ni7VarM24055d2 instanceof fu4 ? (fu4) ni7VarM24055d2 : null;
            etduVarM24638b = fu4Var2 == null ? null : fu4Var2.m24638b();
            if (etduVarM24638b == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.mcp
    public boolean ld6() {
        return i9jn(kotlin.was.f36763k);
    }

    @Override // kotlinx.coroutines.etdu
    /* JADX INFO: renamed from: v */
    public boolean mo24061v() {
        return true;
    }

    @Override // kotlinx.coroutines.etdu
    public boolean xwq3() {
        return this.f37203q;
    }

    @Override // kotlinx.coroutines.mcp
    /* JADX INFO: renamed from: y */
    public boolean mo24311y(@InterfaceC7396q Throwable th) {
        return i9jn(new a9(th, false, 2, null));
    }
}
