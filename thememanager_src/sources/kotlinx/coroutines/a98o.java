package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.Executor;
import kotlin.coroutines.C6217s;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/a98o;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "execute", "", "toString", "Lkotlinx/coroutines/dd;", "k", "Lkotlinx/coroutines/dd;", "dispatcher", C4991s.f28129n, "(Lkotlinx/coroutines/dd;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class a98o implements Executor {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final dd f36775k;

    public a98o(@InterfaceC7396q dd ddVar) {
        this.f36775k = ddVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC7396q Runnable runnable) {
        this.f36775k.bap7(C6217s.INSTANCE, runnable);
    }

    @InterfaceC7396q
    public String toString() {
        return this.f36775k.toString();
    }
}
