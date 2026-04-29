package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.q */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/q;", "Lkotlinx/coroutines/scheduling/s;", "Lkotlin/was;", "o05", "()V", "close", "", "toString", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6717q extends C6718s {

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    public static final C6717q f37386h = new C6717q();

    private C6717q() {
        super(kja0.f82062zy, kja0.f37375q, kja0.f37373n, kja0.f37372k);
    }

    @Override // kotlinx.coroutines.scheduling.C6718s, kotlinx.coroutines.xwq3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void o05() {
        super.close();
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        return "Dispatchers.Default";
    }
}
