package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/mcp;", C0846k.d9i, "Lkotlinx/coroutines/channels/ld6;", "Lkotlinx/coroutines/channels/d3;", "f7l8", "Lkotlin/was;", "yqrt", "Lkotlin/coroutines/q;", C7704k.y.toq.f95579toq, "Lkotlin/coroutines/q;", "continuation", "Lkotlin/coroutines/f7l8;", "parentContext", "Lkotlinx/coroutines/channels/s;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/jp0y;", "", "Lkotlin/fn3e;", "block", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/s;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class mcp<E> extends ld6<E> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC6216q<was> f36829g;

    public mcp(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, @InterfaceC7396q InterfaceC5979h<? super jp0y<? super E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        super(f7l8Var, interfaceC6511s, false);
        this.f36829g = kotlin.coroutines.intrinsics.zy.zy(interfaceC5979h, this, this);
    }

    @Override // kotlinx.coroutines.channels.ld6, kotlinx.coroutines.channels.InterfaceC6511s
    @InterfaceC7396q
    public d3<E> f7l8() {
        d3<E> d3VarF7l8 = ebn().f7l8();
        start();
        return d3VarF7l8;
    }

    @Override // kotlinx.coroutines.etdu
    protected void yqrt() throws Throwable {
        C7677k.m28036n(this.f36829g, this);
    }
}
