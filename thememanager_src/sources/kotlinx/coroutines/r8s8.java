package kotlinx.coroutines;

import java.util.concurrent.Future;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/gbni;", "Ljava/util/concurrent/Future;", "future", "Lkotlinx/coroutines/ch;", "toq", "Lkotlinx/coroutines/cdj;", "Lkotlin/was;", "k", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class r8s8 {
    /* JADX INFO: renamed from: k */
    public static final void m24530k(@InterfaceC7396q cdj<?> cdjVar, @InterfaceC7396q Future<?> future) {
        cdjVar.ni7(new qrj(future));
    }

    @InterfaceC7396q
    @tfm
    public static final ch toq(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q Future<?> future) {
        return gbniVar.yz(new n7h(future));
    }
}
