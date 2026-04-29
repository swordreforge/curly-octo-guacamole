package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import cyoe.x2;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.eqxt;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.g */
/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6197g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.coroutines.g$k */
    /* JADX INFO: compiled from: Continuation.kt */
    @lv5({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class k<T> implements InterfaceC6216q<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f36249k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ x2<C6323o<? extends T>, was> f36250q;

        /* JADX WARN: Multi-variable type inference failed */
        public k(f7l8 f7l8Var, x2<? super C6323o<? extends T>, was> x2Var) {
            this.f36249k = f7l8Var;
            this.f36250q = x2Var;
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        @InterfaceC7396q
        public f7l8 getContext() {
            return this.f36249k;
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        public void resumeWith(@InterfaceC7396q Object obj) {
            this.f36250q.invoke(C6323o.m28279boximpl(obj));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <T> void f7l8(InterfaceC6216q<? super T> interfaceC6216q, Throwable exception) {
        d2ok.m23075h(interfaceC6216q, "<this>");
        d2ok.m23075h(exception, "exception");
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(exception)));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: g */
    private static final <T> void m22737g(InterfaceC6216q<? super T> interfaceC6216q, T t2) {
        d2ok.m23075h(interfaceC6216q, "<this>");
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(t2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    private static final <T> InterfaceC6216q<T> m22738k(f7l8 context, x2<? super C6323o<? extends T>, was> resumeWith) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(resumeWith, "resumeWith");
        return new k(context, resumeWith);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m22739n() {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: p */
    private static final <T> Object m22740p(x2<? super InterfaceC6216q<? super T>, was> x2Var, InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        d3.m23089n(0);
        ld6 ld6Var = new ld6(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q));
        x2Var.invoke(ld6Var);
        Object qVar = ld6Var.toq();
        if (qVar == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        d3.m23089n(1);
        return qVar;
    }

    /* JADX INFO: renamed from: q */
    private static final f7l8 m22741q() {
        throw new eqxt("Implemented as intrinsic");
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: s */
    public static final <R, T> void m22742s(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(interfaceC5979h, "<this>");
        d2ok.m23075h(completion, "completion");
        InterfaceC6216q interfaceC6216qM22747n = kotlin.coroutines.intrinsics.zy.m22747n(kotlin.coroutines.intrinsics.zy.zy(interfaceC5979h, r2, completion));
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216qM22747n.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <T> InterfaceC6216q<was> toq(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(completion, "completion");
        return new ld6(kotlin.coroutines.intrinsics.zy.m22747n(kotlin.coroutines.intrinsics.zy.toq(x2Var, completion)), C6199q.x2());
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: y */
    public static final <T> void m22743y(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(completion, "completion");
        InterfaceC6216q interfaceC6216qM22747n = kotlin.coroutines.intrinsics.zy.m22747n(kotlin.coroutines.intrinsics.zy.toq(x2Var, completion));
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216qM22747n.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <R, T> InterfaceC6216q<was> zy(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(interfaceC5979h, "<this>");
        d2ok.m23075h(completion, "completion");
        return new ld6(kotlin.coroutines.intrinsics.zy.m22747n(kotlin.coroutines.intrinsics.zy.zy(interfaceC5979h, r2, completion)), C6199q.x2());
    }
}
