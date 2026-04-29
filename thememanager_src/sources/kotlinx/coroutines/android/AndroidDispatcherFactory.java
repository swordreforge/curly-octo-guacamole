package kotlinx.coroutines.android;

import android.os.Looper;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import kotlin.d3;
import kotlinx.coroutines.internal.C6692t;
import kotlinx.coroutines.internal.jk;
import kotlinx.coroutines.z4;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/jk;", "", "allFactories", "Lkotlinx/coroutines/z4;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", C4991s.f28129n, "()V", "kotlinx-coroutines-android"}, m22787k = 1, mv = {1, 6, 0})
public final class AndroidDispatcherFactory implements jk {
    @Override // kotlinx.coroutines.internal.jk
    @InterfaceC7396q
    public z4 createDispatcher(@InterfaceC7396q List<? extends jk> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new toq(C6483n.m23822q(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.jk
    public int getLoadPriority() {
        return C6692t.f37242p;
    }

    @Override // kotlinx.coroutines.internal.jk
    @InterfaceC7396q
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
