package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlin.d3;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/n7h;", "Lkotlin/coroutines/f7l8;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/f7l8$toq;", "operation", "fold", "(Ljava/lang/Object;Lcyoe/h;)Ljava/lang/Object;", C0846k.d9i, "Lkotlin/coroutines/f7l8$zy;", InterfaceC1925p.qn, "get", "(Lkotlin/coroutines/f7l8$zy;)Lkotlin/coroutines/f7l8$toq;", "minusKey", "context", "plus", "", "k", "Ljava/lang/Throwable;", "e", "originalContext", C4991s.f28129n, "(Ljava/lang/Throwable;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class n7h implements kotlin.coroutines.f7l8 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final Throwable f36995k;

    /* JADX INFO: renamed from: q */
    private final /* synthetic */ kotlin.coroutines.f7l8 f36996q;

    public n7h(@InterfaceC7396q Throwable th, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f36995k = th;
        this.f36996q = f7l8Var;
    }

    @Override // kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
        return (R) this.f36996q.fold(r2, interfaceC5979h);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        return (E) this.f36996q.get(zyVar);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return this.f36996q.minusKey(zyVar);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 plus(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return this.f36996q.plus(f7l8Var);
    }
}
