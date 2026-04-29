package kotlinx.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.C6231h;
import kotlin.coroutines.AbstractC6212k;
import kotlinx.coroutines.x9kr;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.l */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "toq", "originalException", "thrownException", "zy", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/x9kr;", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6697l {

    /* JADX INFO: renamed from: kotlinx.coroutines.l$k */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/l$k", "Lkotlin/coroutines/k;", "Lkotlinx/coroutines/x9kr;", "Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "handleException", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k extends AbstractC6212k implements x9kr {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h<kotlin.coroutines.f7l8, Throwable, kotlin.was> f37290k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(InterfaceC5979h<? super kotlin.coroutines.f7l8, ? super Throwable, kotlin.was> interfaceC5979h, x9kr.toq toqVar) {
            super(toqVar);
            this.f37290k = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.x9kr
        public void handleException(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
            this.f37290k.invoke(f7l8Var, th);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final x9kr m24475k(@InterfaceC7396q InterfaceC5979h<? super kotlin.coroutines.f7l8, ? super Throwable, kotlin.was> interfaceC5979h) {
        return new k(interfaceC5979h, x9kr.mdr8);
    }

    @tfm
    public static final void toq(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
        try {
            x9kr x9krVar = (x9kr) f7l8Var.get(x9kr.mdr8);
            if (x9krVar == null) {
                ncyb.m24507k(f7l8Var, th);
            } else {
                x9krVar.handleException(f7l8Var, th);
            }
        } catch (Throwable th2) {
            ncyb.m24507k(f7l8Var, zy(th, th2));
        }
    }

    @InterfaceC7396q
    public static final Throwable zy(@InterfaceC7396q Throwable th, @InterfaceC7396q Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C6231h.m22845k(runtimeException, th);
        return runtimeException;
    }
}
