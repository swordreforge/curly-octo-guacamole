package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/x9kr;", "Lkotlin/coroutines/f7l8$toq;", "Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "handleException", "mdr8", "toq", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface x9kr extends f7l8.toq {

    @InterfaceC7396q
    public static final toq mdr8 = toq.f37485k;

    /* JADX INFO: renamed from: kotlinx.coroutines.x9kr$k */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6746k {
        /* JADX INFO: renamed from: k */
        public static <R> R m24653k(@InterfaceC7396q x9kr x9krVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) f7l8.toq.C6196k.m22735k(x9krVar, r2, interfaceC5979h);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static kotlin.coroutines.f7l8 m24654q(@InterfaceC7396q x9kr x9krVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return f7l8.toq.C6196k.m22736q(x9krVar, f7l8Var);
        }

        @InterfaceC7395n
        public static <E extends f7l8.toq> E toq(@InterfaceC7396q x9kr x9krVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) f7l8.toq.C6196k.toq(x9krVar, zyVar);
        }

        @InterfaceC7396q
        public static kotlin.coroutines.f7l8 zy(@InterfaceC7396q x9kr x9krVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return f7l8.toq.C6196k.zy(x9krVar, zyVar);
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/x9kr$toq;", "Lkotlin/coroutines/f7l8$zy;", "Lkotlinx/coroutines/x9kr;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements f7l8.zy<x9kr> {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ toq f37485k = new toq();

        private toq() {
        }
    }

    void handleException(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Throwable th);
}
