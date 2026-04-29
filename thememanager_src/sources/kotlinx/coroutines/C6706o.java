package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.o */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/o;", C0846k.zaso, "Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/j;", "Lkotlinx/coroutines/selects/q;", AnimatedProperty.PROPERTY_NAME_H, "()Ljava/lang/Object;", "hyr", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "eqxt", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "g1", "()Lkotlinx/coroutines/selects/q;", "onAwait", "Lkotlin/coroutines/f7l8;", "parentContext", "", C7704k.q.f95568zurt, C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
class C6706o<T> extends AbstractC6696k<T> implements InterfaceC6695j<T>, InterfaceC6725q<T> {
    public C6706o(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, boolean z2) {
        super(f7l8Var, true, z2);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6725q
    public <R> void eqxt(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        se(interfaceC6720g, interfaceC5979h);
    }

    @Override // kotlinx.coroutines.InterfaceC6695j
    @InterfaceC7396q
    public InterfaceC6725q<T> g1() {
        return this;
    }

    @Override // kotlinx.coroutines.InterfaceC6695j
    /* JADX INFO: renamed from: h */
    public T mo24457h() {
        return (T) bo();
    }

    @Override // kotlinx.coroutines.InterfaceC6695j
    @InterfaceC7395n
    public Object hyr(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return uv6(interfaceC6216q);
    }
}
