package kotlin;

import cyoe.InterfaceC5981k;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
class vyq extends uv6 {
    @InterfaceC6234g
    private static final Void f7l8(Object message) {
        kotlin.jvm.internal.d2ok.m23075h(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final <T> T m23792g(T t2, InterfaceC5981k<? extends Object> lazyMessage) {
        kotlin.jvm.internal.d2ok.m23075h(lazyMessage, "lazyMessage");
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @InterfaceC6234g
    private static final <T> T ld6(T t2, InterfaceC5981k<? extends Object> lazyMessage) {
        kotlin.jvm.internal.d2ok.m23075h(lazyMessage, "lazyMessage");
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final <T> T m23793n(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final <T> T m23794p(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final void m23795q(boolean z2, InterfaceC5981k<? extends Object> lazyMessage) {
        kotlin.jvm.internal.d2ok.m23075h(lazyMessage, "lazyMessage");
        if (!z2) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final void m23796s(boolean z2, InterfaceC5981k<? extends Object> lazyMessage) {
        kotlin.jvm.internal.d2ok.m23075h(lazyMessage, "lazyMessage");
        if (!z2) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final void m23797y(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @InterfaceC6234g
    private static final void zy(boolean z2) {
        if (!z2) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
