package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.C6318m;
import kotlin.C6323o;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/uj2j;", C0846k.zaso, "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/ki;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/ki;", "continuation", C4991s.f28129n, "(Lkotlinx/coroutines/ki;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class uj2j<T> extends v0af {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final ki<T> f37469y;

    /* JADX WARN: Multi-variable type inference failed */
    public uj2j(@InterfaceC7396q ki<? super T> kiVar) {
        this.f37469y = kiVar;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) {
        Object objMu = m24638b().mu();
        if (objMu instanceof a9) {
            ki<T> kiVar = this.f37469y;
            C6323o.k kVar = C6323o.Companion;
            kiVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(((a9) objMu).f36774k)));
        } else {
            ki<T> kiVar2 = this.f37469y;
            C6323o.k kVar2 = C6323o.Companion;
            kiVar2.resumeWith(C6323o.m28280constructorimpl(sok.kja0(objMu)));
        }
    }
}
