package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6723n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.t */
/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010#\u001a\u00020\"\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\u0012-\u0010\u001a\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JX\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lkotlinx/coroutines/channels/t;", C0846k.d9i, "Lkotlinx/coroutines/channels/q;", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/channels/lvui;", "Lkotlin/was;", "yqrt", "element", "d3", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ki;", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "jp0y", "R", "Lkotlinx/coroutines/selects/g;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "i", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", C7704k.y.toq.f95579toq, "Lkotlin/coroutines/q;", "continuation", "()Lkotlinx/coroutines/selects/n;", "onSend", "Lkotlin/coroutines/f7l8;", "parentContext", "Lkotlinx/coroutines/channels/n7h;", "channel", "Lkotlinx/coroutines/channels/g;", "Lkotlin/fn3e;", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/n7h;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6512t<E> extends C6509q<E> implements InterfaceC6723n<E, lvui<? super E>> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private InterfaceC6216q<? super was> f36851g;

    public C6512t(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q n7h<E> n7hVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6496g<E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        super(f7l8Var, n7hVar, false);
        this.f36851g = kotlin.coroutines.intrinsics.zy.zy(interfaceC5979h, this, this);
    }

    @Override // kotlinx.coroutines.channels.kja0, kotlinx.coroutines.channels.lvui
    @InterfaceC7395n
    public Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        start();
        Object objD3 = super.d3(e2, interfaceC6216q);
        return objD3 == C6199q.x2() ? objD3 : was.f36763k;
    }

    @Override // kotlinx.coroutines.channels.kja0, kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public InterfaceC6723n<E, lvui<E>> mo23919g() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.InterfaceC6723n
    /* JADX INFO: renamed from: i */
    public <R> void mo23934i(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, E e2, @InterfaceC7396q InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        start();
        super.mo23919g().mo23934i(interfaceC6720g, e2, interfaceC5979h);
    }

    @Override // kotlinx.coroutines.channels.kja0, kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: jp0y */
    public boolean mo23876k(@InterfaceC7395n Throwable th) {
        boolean zMo23876k = super.mo23876k(th);
        start();
        return zMo23876k;
    }

    @Override // kotlinx.coroutines.channels.kja0, kotlinx.coroutines.channels.lvui
    public boolean offer(E e2) {
        start();
        return super.offer(e2);
    }

    @Override // kotlinx.coroutines.channels.kja0, kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public Object mo23921s(E e2) {
        start();
        return super.mo23921s(e2);
    }

    @Override // kotlinx.coroutines.etdu
    protected void yqrt() throws Throwable {
        C7677k.m28036n(this.f36851g, this);
    }
}
