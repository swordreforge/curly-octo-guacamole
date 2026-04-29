package androidx.lifecycle;

import com.market.sdk.reflect.C4991s;
import java.io.Closeable;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.m4;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/q;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/f;", "Lkotlin/was;", "close", "Lkotlin/coroutines/f7l8;", "k", "Lkotlin/coroutines/f7l8;", "i1", "()Lkotlin/coroutines/f7l8;", "coroutineContext", "context", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;)V", "lifecycle-viewmodel-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C0945q implements Closeable, InterfaceC6556f {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f5115k;

    public C0945q(@InterfaceC7396q kotlin.coroutines.f7l8 context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        this.f5115k = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4.m24497s(i1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.InterfaceC6556f
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 i1() {
        return this.f5115k;
    }
}
