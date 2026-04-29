package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.tfm;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MainDispatcherFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/jk;", "", "", "allFactories", "Lkotlinx/coroutines/z4;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public interface jk {

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.jk$k */
    /* JADX INFO: compiled from: MainDispatcherFactory.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6677k {
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public static String m24353k(@InterfaceC7396q jk jkVar) {
            return null;
        }
    }

    @InterfaceC7396q
    z4 createDispatcher(@InterfaceC7396q List<? extends jk> list);

    int getLoadPriority();

    @InterfaceC7395n
    String hintOnError();
}
