package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import kotlin.C6231h;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import kotlinx.coroutines.C6697l;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {C0846k.d9i, "Lkotlin/Function1;", "Lkotlin/was;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/o;", "undeliveredElementException", "zy", "(Lcyoe/x2;Ljava/lang/Object;Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/internal/o;", "Lkotlin/coroutines/f7l8;", "context", "toq", "(Lcyoe/x2;Ljava/lang/Object;Lkotlin/coroutines/f7l8;)V", "", "k", "(Lcyoe/x2;Ljava/lang/Object;Lkotlin/coroutines/f7l8;)Lcyoe/x2;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class d3 {

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.d3$k */
    /* JADX INFO: compiled from: OnUndeliveredElement.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.d9i, "", "<anonymous parameter 0>", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6670k extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ kotlin.coroutines.f7l8 $context;
        final /* synthetic */ E $element;
        final /* synthetic */ cyoe.x2<E, was> $this_bindCancellationFun;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6670k(cyoe.x2<? super E, was> x2Var, E e2, kotlin.coroutines.f7l8 f7l8Var) {
            super(1);
            this.$this_bindCancellationFun = x2Var;
            this.$element = e2;
            this.$context = f7l8Var;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Throwable th) {
            d3.toq(this.$this_bindCancellationFun, this.$element, this.$context);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <E> cyoe.x2<Throwable, was> m24325k(@InterfaceC7396q cyoe.x2<? super E, was> x2Var, E e2, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return new C6670k(x2Var, e2, f7l8Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C6687o m24326q(cyoe.x2 x2Var, Object obj, C6687o c6687o, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            c6687o = null;
        }
        return zy(x2Var, obj, c6687o);
    }

    public static final <E> void toq(@InterfaceC7396q cyoe.x2<? super E, was> x2Var, E e2, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        C6687o c6687oZy = zy(x2Var, e2, null);
        if (c6687oZy == null) {
            return;
        }
        C6697l.toq(f7l8Var, c6687oZy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7395n
    public static final <E> C6687o zy(@InterfaceC7396q cyoe.x2<? super E, was> x2Var, E e2, @InterfaceC7395n C6687o c6687o) {
        try {
            x2Var.invoke(e2);
        } catch (Throwable th) {
            if (c6687o == null || c6687o.getCause() == th) {
                return new C6687o(kotlin.jvm.internal.d2ok.mcp("Exception in undelivered element handler for ", e2), th);
            }
            C6231h.m22845k(c6687o, th);
        }
        return c6687o;
    }
}
