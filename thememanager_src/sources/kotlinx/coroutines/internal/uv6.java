package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.uc;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/uv6;", C0846k.zaso, "Lkotlinx/coroutines/uc;", "Lkotlin/coroutines/f7l8;", "context", "nsb", "(Lkotlin/coroutines/f7l8;)Ljava/lang/Object;", "oldState", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_X, "(Lkotlin/coroutines/f7l8;Ljava/lang/Object;)V", "Lkotlin/coroutines/f7l8$zy;", InterfaceC1925p.qn, "minusKey", "Lkotlin/coroutines/f7l8$toq;", C0846k.d9i, "get", "(Lkotlin/coroutines/f7l8$zy;)Lkotlin/coroutines/f7l8$toq;", "", "toString", "k", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "q", "Ljava/lang/ThreadLocal;", "threadLocal", "n", "Lkotlin/coroutines/f7l8$zy;", "getKey", "()Lkotlin/coroutines/f7l8$zy;", C4991s.f28129n, "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class uv6<T> implements uc<T> {

    /* JADX INFO: renamed from: k */
    private final T f37254k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final f7l8.zy<?> f37255n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ThreadLocal<T> f37256q;

    public uv6(T t2, @InterfaceC7396q ThreadLocal<T> threadLocal) {
        this.f37254k = t2;
        this.f37256q = threadLocal;
        this.f37255n = new vyq(threadLocal);
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
        return (R) uc.C6742k.m24634k(this, r2, interfaceC5979h);
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        if (kotlin.jvm.internal.d2ok.f7l8(getKey(), zyVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.f7l8.toq
    @InterfaceC7396q
    public f7l8.zy<?> getKey() {
        return this.f37255n;
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return kotlin.jvm.internal.d2ok.f7l8(getKey(), zyVar) ? C6217s.INSTANCE : this;
    }

    @Override // kotlinx.coroutines.uc
    public T nsb(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        T t2 = this.f37256q.get();
        this.f37256q.set(this.f37254k);
        return t2;
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 plus(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return uc.C6742k.m24635q(this, f7l8Var);
    }

    @InterfaceC7396q
    public String toString() {
        return "ThreadLocal(value=" + this.f37254k + ", threadLocal = " + this.f37256q + ')';
    }

    @Override // kotlinx.coroutines.uc
    /* JADX INFO: renamed from: x */
    public void mo24416x(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, T t2) {
        this.f37256q.set(t2);
    }
}
