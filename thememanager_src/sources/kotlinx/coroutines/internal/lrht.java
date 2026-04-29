package kotlinx.coroutines.internal;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.AbstractC6308r;
import kotlinx.coroutines.uc;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/f7l8;", "context", "", "toq", "countOrElement", "zy", "oldState", "Lkotlin/was;", "k", "Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/internal/l;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/f7l8$toq;", "Lcyoe/h;", "countAll", "Lkotlinx/coroutines/uc;", "findOne", "Lkotlinx/coroutines/internal/j;", "q", "updateState", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class lrht {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f37225k = new C6679l("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final InterfaceC5979h<Object, f7l8.toq, Object> f82018toq = C6680k.INSTANCE;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final InterfaceC5979h<uc<?>, f7l8.toq, uc<?>> f82019zy = toq.INSTANCE;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final InterfaceC5979h<C6676j, f7l8.toq, C6676j> f37226q = zy.INSTANCE;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.lrht$k */
    /* JADX INFO: compiled from: ThreadContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/f7l8$toq;)Ljava/lang/Object;", "<no name provided>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6680k extends AbstractC6308r implements InterfaceC5979h<Object, f7l8.toq, Object> {
        public static final C6680k INSTANCE = new C6680k();

        C6680k() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7395n Object obj, @InterfaceC7396q f7l8.toq toqVar) {
            if (!(toqVar instanceof uc)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num == null ? 1 : num.intValue();
            return iIntValue == 0 ? toqVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: compiled from: ThreadContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/uc;", "found", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(Lkotlinx/coroutines/uc;Lkotlin/coroutines/f7l8$toq;)Lkotlinx/coroutines/uc;", "<no name provided>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements InterfaceC5979h<uc<?>, f7l8.toq, uc<?>> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final uc<?> invoke(@InterfaceC7395n uc<?> ucVar, @InterfaceC7396q f7l8.toq toqVar) {
            if (ucVar != null) {
                return ucVar;
            }
            if (toqVar instanceof uc) {
                return (uc) toqVar;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ThreadContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/j;", "state", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(Lkotlinx/coroutines/internal/j;Lkotlin/coroutines/f7l8$toq;)Lkotlinx/coroutines/internal/j;", "<no name provided>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends AbstractC6308r implements InterfaceC5979h<C6676j, f7l8.toq, C6676j> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final C6676j invoke(@InterfaceC7396q C6676j c6676j, @InterfaceC7396q f7l8.toq toqVar) {
            if (toqVar instanceof uc) {
                uc<?> ucVar = (uc) toqVar;
                c6676j.m24352k(ucVar, ucVar.nsb(c6676j.f37218k));
            }
            return c6676j;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m24365k(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n Object obj) {
        if (obj == f37225k) {
            return;
        }
        if (obj instanceof C6676j) {
            ((C6676j) obj).toq(f7l8Var);
            return;
        }
        Object objFold = f7l8Var.fold(null, f82019zy);
        if (objFold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((uc) objFold).mo24416x(f7l8Var, obj);
    }

    @InterfaceC7396q
    public static final Object toq(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        Object objFold = f7l8Var.fold(0, f82018toq);
        kotlin.jvm.internal.d2ok.qrj(objFold);
        return objFold;
    }

    @InterfaceC7395n
    public static final Object zy(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n Object obj) {
        if (obj == null) {
            obj = toq(f7l8Var);
        }
        return obj == 0 ? f37225k : obj instanceof Integer ? f7l8Var.fold(new C6676j(f7l8Var, ((Number) obj).intValue()), f37226q) : ((uc) obj).nsb(f7l8Var);
    }
}
