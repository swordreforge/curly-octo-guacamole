package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import java.util.List;
import kotlinx.coroutines.internal.jk;
import kotlinx.coroutines.tfm;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/gvn7;", "Lkotlinx/coroutines/internal/jk;", "", "allFactories", "Lkotlinx/coroutines/z4;", "createDispatcher", "", "getLoadPriority", "()I", "loadPriority", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public final class gvn7 implements jk {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final gvn7 f37216k = new gvn7();

    private gvn7() {
    }

    @Override // kotlinx.coroutines.internal.jk
    @InterfaceC7396q
    public z4 createDispatcher(@InterfaceC7396q List<? extends jk> list) {
        return new jp0y(null, null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.jk
    public int getLoadPriority() {
        return -1;
    }

    @Override // kotlinx.coroutines.internal.jk
    @InterfaceC7395n
    public String hintOnError() {
        return jk.C6677k.m24353k(this);
    }
}
