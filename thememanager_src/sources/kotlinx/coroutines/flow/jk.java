package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/jk;", C0846k.zaso, "Lkotlinx/coroutines/flow/d3;", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "toq", "(Ljava/lang/Object;)Z", "f7l8", "Lkotlinx/coroutines/flow/hyr;", "", "zy", "()Lkotlinx/coroutines/flow/hyr;", "subscriptionCount", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface jk<T> extends d3<T>, InterfaceC6618p<T> {
    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    @InterfaceC6533d
    void f7l8();

    boolean toq(T t2);

    @InterfaceC7396q
    hyr<Integer> zy();
}
