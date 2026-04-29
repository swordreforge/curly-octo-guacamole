package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.k */
/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020&\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/k;", C0846k.zaso, "Lkotlinx/coroutines/etdu;", "Lkotlinx/coroutines/gbni;", "Lkotlin/coroutines/q;", "Lkotlinx/coroutines/f;", "value", "Lkotlin/was;", "do", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "ixz", "", "m", "", "state", "z4", "Lkotlin/o;", "result", "resumeWith", "uc", "exception", "qkj8", "(Ljava/lang/Throwable;)V", "m4", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/lrht;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/fn3e;", "block", "ukdy", "(Lkotlinx/coroutines/lrht;Ljava/lang/Object;Lcyoe/h;)V", "Lkotlin/coroutines/f7l8;", "q", "Lkotlin/coroutines/f7l8;", "getContext", "()Lkotlin/coroutines/f7l8;", "getContext$annotations", "()V", "context", "i1", "coroutineContext", "isActive", "()Z", "parentContext", "initParentJob", C7704k.q.f95568zurt, C4991s.f28129n, "(Lkotlin/coroutines/f7l8;ZZ)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public abstract class AbstractC6696k<T> extends etdu implements gbni, InterfaceC6216q<T>, InterfaceC6556f {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f37280q;

    public AbstractC6696k(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            fnq8((gbni) f7l8Var.get(gbni.ygy));
        }
        this.f37280q = f7l8Var.plus(this);
    }

    public static /* synthetic */ void wx16() {
    }

    /* JADX INFO: renamed from: do */
    protected void mo28293do(T t2) {
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public final kotlin.coroutines.f7l8 getContext() {
        return this.f37280q;
    }

    @Override // kotlinx.coroutines.InterfaceC6556f
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 i1() {
        return this.f37280q;
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni
    public boolean isActive() {
        return super.isActive();
    }

    protected void ixz(@InterfaceC7396q Throwable th, boolean z2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.etdu
    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public String mo24058m() {
        return kotlin.jvm.internal.d2ok.mcp(C6551e.m24040k(this), " was cancelled");
    }

    @Override // kotlinx.coroutines.etdu
    @InterfaceC7396q
    public String m4() {
        String qVar = C6710r.toq(this.f37280q);
        if (qVar == null) {
            return super.m4();
        }
        return kotlin.text.eqxt.f81913toq + qVar + "\":" + super.m4();
    }

    @Override // kotlinx.coroutines.etdu
    public final void qkj8(@InterfaceC7396q Throwable th) {
        C6697l.toq(this.f37280q, th);
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public final void resumeWith(@InterfaceC7396q Object obj) {
        Object objLtg8 = ltg8(eqxt.m24047q(obj, null, 1, null));
        if (objLtg8 == sok.f82068toq) {
            return;
        }
        uc(objLtg8);
    }

    protected void uc(@InterfaceC7395n Object obj) {
        lrht(obj);
    }

    public final <R> void ukdy(@InterfaceC7396q lrht lrhtVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) {
        lrhtVar.invoke(interfaceC5979h, r2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.etdu
    protected final void z4(@InterfaceC7395n Object obj) {
        if (!(obj instanceof a9)) {
            mo28293do(obj);
        } else {
            a9 a9Var = (a9) obj;
            ixz(a9Var.f36774k, a9Var.m23817k());
        }
    }
}
