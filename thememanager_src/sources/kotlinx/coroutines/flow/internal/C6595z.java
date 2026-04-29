package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.z */
/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/z;", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/lvui;", "k", "Lkotlinx/coroutines/channels/lvui;", "channel", C4991s.f28129n, "(Lkotlinx/coroutines/channels/lvui;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public final class C6595z<T> implements InterfaceC6618p<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final lvui<T> f37026k;

    /* JADX WARN: Multi-variable type inference failed */
    public C6595z(@InterfaceC7396q lvui<? super T> lvuiVar) {
        this.f37026k = lvuiVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objD3 = this.f37026k.d3(t2, interfaceC6216q);
        return objD3 == C6199q.x2() ? objD3 : was.f36763k;
    }
}
