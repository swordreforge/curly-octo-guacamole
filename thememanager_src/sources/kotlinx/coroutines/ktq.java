package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/ktq;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/was;", "run", "Lkotlinx/coroutines/dd;", "k", "Lkotlinx/coroutines/dd;", "dispatcher", "Lkotlinx/coroutines/cdj;", "q", "Lkotlinx/coroutines/cdj;", "continuation", C4991s.f28129n, "(Lkotlinx/coroutines/dd;Lkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class ktq implements Runnable {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final dd f37288k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final cdj<kotlin.was> f37289q;

    /* JADX WARN: Multi-variable type inference failed */
    public ktq(@InterfaceC7396q dd ddVar, @InterfaceC7396q cdj<? super kotlin.was> cdjVar) {
        this.f37288k = ddVar;
        this.f37289q = cdjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37289q.jk(this.f37288k, kotlin.was.f36763k);
    }
}
