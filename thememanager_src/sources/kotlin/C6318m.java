package kotlin;

import cyoe.InterfaceC5981k;
import kotlin.C6323o;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.m */
/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class C6318m {
    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R, T> Object f7l8(Object obj, cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        if (!C6323o.m28286isSuccessimpl(obj)) {
            return C6323o.m28280constructorimpl(obj);
        }
        try {
            C6323o.k kVar = C6323o.Companion;
            return C6323o.m28280constructorimpl(transform.invoke(obj));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            return C6323o.m28280constructorimpl(m23191k(th));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: g */
    private static final <R, T> Object m23190g(Object obj, cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        if (!C6323o.m28286isSuccessimpl(obj)) {
            return C6323o.m28280constructorimpl(obj);
        }
        C6323o.k kVar = C6323o.Companion;
        return C6323o.m28280constructorimpl(transform.invoke(obj));
    }

    @nn86
    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static final Object m23191k(@InterfaceC7396q Throwable exception) {
        kotlin.jvm.internal.d2ok.m23075h(exception, "exception");
        return new C6323o.toq(exception);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R, T extends R> Object ld6(Object obj, cyoe.x2<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        if (thM28283exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            C6323o.k kVar = C6323o.Companion;
            return C6323o.m28280constructorimpl(transform.invoke(thM28283exceptionOrNullimpl));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            return C6323o.m28280constructorimpl(m23191k(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    private static final <T> T m23192n(Object obj) {
        n7h(obj);
        return obj;
    }

    @nn86
    @yz(version = "1.3")
    public static final void n7h(@InterfaceC7396q Object obj) {
        if (obj instanceof C6323o.toq) {
            throw ((C6323o.toq) obj).exception;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: p */
    private static final <R, T extends R> Object m23193p(Object obj, cyoe.x2<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        if (thM28283exceptionOrNullimpl == null) {
            return obj;
        }
        C6323o.k kVar = C6323o.Companion;
        return C6323o.m28280constructorimpl(transform.invoke(thM28283exceptionOrNullimpl));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: q */
    private static final <R, T extends R> R m23194q(Object obj, cyoe.x2<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.d2ok.m23075h(onFailure, "onFailure");
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        return thM28283exceptionOrNullimpl == null ? obj : onFailure.invoke(thM28283exceptionOrNullimpl);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <T, R> Object qrj(T t2, cyoe.x2<? super T, ? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        try {
            C6323o.k kVar = C6323o.Companion;
            return C6323o.m28280constructorimpl(block.invoke(t2));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            return C6323o.m28280constructorimpl(m23191k(th));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: s */
    private static final <T> Object m23195s(Object obj, cyoe.x2<? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        if (C6323o.m28286isSuccessimpl(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R, T> R toq(Object obj, cyoe.x2<? super T, ? extends R> onSuccess, cyoe.x2<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.d2ok.m23075h(onSuccess, "onSuccess");
        kotlin.jvm.internal.d2ok.m23075h(onFailure, "onFailure");
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        return thM28283exceptionOrNullimpl == null ? onSuccess.invoke(obj) : onFailure.invoke(thM28283exceptionOrNullimpl);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R> Object x2(InterfaceC5981k<? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        try {
            C6323o.k kVar = C6323o.Companion;
            return C6323o.m28280constructorimpl(block.invoke());
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            return C6323o.m28280constructorimpl(m23191k(th));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: y */
    private static final <T> Object m23196y(Object obj, cyoe.x2<? super Throwable, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        if (thM28283exceptionOrNullimpl != null) {
            action.invoke(thM28283exceptionOrNullimpl);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R, T extends R> R zy(Object obj, R r2) {
        return C6323o.m28285isFailureimpl(obj) ? r2 : obj;
    }
}
