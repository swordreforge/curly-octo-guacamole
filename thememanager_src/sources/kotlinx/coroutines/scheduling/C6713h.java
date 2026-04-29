package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.h */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/dd;", "Lkotlin/coroutines/f7l8;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "h4b", "bap7", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6713h extends dd {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6713h f37333q = new C6713h();

    private C6713h() {
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        C6717q.f37386h.a5id(runnable, kja0.f37374p, false);
    }

    @Override // kotlinx.coroutines.dd
    @tfm
    public void h4b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        C6717q.f37386h.a5id(runnable, kja0.f37374p, true);
    }
}
