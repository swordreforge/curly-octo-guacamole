package kotlinx.coroutines;

import cyoe.InterfaceC5981k;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b*\n\u0010\u0006\"\u00020\u00032\u00020\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lkotlin/was;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "k", "Runnable", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class b3e {

    /* JADX INFO: renamed from: kotlinx.coroutines.b3e$k */
    /* JADX INFO: compiled from: Runnable.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class RunnableC6487k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k<kotlin.was> f36788k;

        public RunnableC6487k(InterfaceC5981k<kotlin.was> interfaceC5981k) {
            this.f36788k = interfaceC5981k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f36788k.invoke();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Runnable m23825k(@InterfaceC7396q InterfaceC5981k<kotlin.was> interfaceC5981k) {
        return new RunnableC6487k(interfaceC5981k);
    }
}
