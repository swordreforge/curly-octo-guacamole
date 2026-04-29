package kotlin;

import cyoe.InterfaceC5981k;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: renamed from: kotlin.b */
/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6124b {
    @InterfaceC6234g
    private static final <R> R f7l8(InterfaceC5981k<? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return block.invoke();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final void m22405g(int i2, cyoe.x2<? super Integer, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (int i3 = 0; i3 < i2; i3++) {
            action.invoke(Integer.valueOf(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final Void m22406k() {
        throw new eqxt(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6234g
    private static final <T, R> R ld6(T t2, cyoe.x2<? super T, ? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return block.invoke(t2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final <T, R> R m22407n(T t2, cyoe.x2<? super T, ? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return block.invoke(t2);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: p */
    private static final <T> T m22408p(T t2, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (predicate.invoke(t2).booleanValue()) {
            return null;
        }
        return t2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final <T> T m22409q(T t2, cyoe.x2<? super T, was> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        block.invoke(t2);
        return t2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: s */
    private static final <T> T m22410s(T t2, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (predicate.invoke(t2).booleanValue()) {
            return t2;
        }
        return null;
    }

    @InterfaceC6234g
    private static final Void toq(String reason) {
        kotlin.jvm.internal.d2ok.m23075h(reason, "reason");
        throw new eqxt("An operation is not implemented: " + reason);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final <T, R> R m22411y(T t2, cyoe.x2<? super T, ? extends R> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return block.invoke(t2);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final <T> T zy(T t2, cyoe.x2<? super T, was> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        block.invoke(t2);
        return t2;
    }
}
