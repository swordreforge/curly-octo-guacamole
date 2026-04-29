package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.xiaomi.onetrack.api.at;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/v0af;", "Lkotlinx/coroutines/jp0y;", "Lkotlinx/coroutines/ch;", "Lkotlinx/coroutines/fnq8;", "Lkotlin/was;", "zy", "", "toString", "Lkotlinx/coroutines/etdu;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/etdu;", "b", "()Lkotlinx/coroutines/etdu;", "bf2", "(Lkotlinx/coroutines/etdu;)V", at.f31711e, "", "isActive", "()Z", "Lkotlinx/coroutines/yqrt;", "toq", "()Lkotlinx/coroutines/yqrt;", "list", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class v0af extends jp0y implements ch, fnq8 {

    /* JADX INFO: renamed from: g */
    public etdu f37471g;

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public final etdu m24638b() {
        etdu etduVar = this.f37471g;
        if (etduVar != null) {
            return etduVar;
        }
        kotlin.jvm.internal.d2ok.n5r1(at.f31711e);
        return null;
    }

    public final void bf2(@InterfaceC7396q etdu etduVar) {
        this.f37471g = etduVar;
    }

    @Override // kotlinx.coroutines.fnq8
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '@' + C6551e.toq(this) + "[job@" + C6551e.toq(m24638b()) + ']';
    }

    @Override // kotlinx.coroutines.fnq8
    @InterfaceC7395n
    public yqrt toq() {
        return null;
    }

    @Override // kotlinx.coroutines.ch
    public void zy() {
        m24638b().gc3c(this);
    }
}
