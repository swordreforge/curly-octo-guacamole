package kotlin;

import java.io.Serializable;
import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6761g;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.o */
/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6761g
@yz(version = "1.3")
public final class C6323o<T> implements Serializable {

    @InterfaceC7396q
    public static final k Companion = new k(null);

    @InterfaceC7395n
    private final Object value;

    /* JADX INFO: renamed from: kotlin.o$k */
    /* JADX INFO: compiled from: Result.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC6234g
        @InterfaceC6769y(name = "failure")
        /* JADX INFO: renamed from: k */
        private final <T> Object m23232k(Throwable exception) {
            kotlin.jvm.internal.d2ok.m23075h(exception, "exception");
            return C6323o.m28280constructorimpl(C6318m.m23191k(exception));
        }

        @InterfaceC6234g
        @InterfaceC6769y(name = "success")
        private final <T> Object toq(T t2) {
            return C6323o.m28280constructorimpl(t2);
        }
    }

    /* JADX INFO: renamed from: kotlin.o$toq */
    /* JADX INFO: compiled from: Result.kt */
    public static final class toq implements Serializable {

        @InterfaceC7396q
        @InterfaceC6765n
        public final Throwable exception;

        public toq(@InterfaceC7396q Throwable exception) {
            kotlin.jvm.internal.d2ok.m23075h(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            return (obj instanceof toq) && kotlin.jvm.internal.d2ok.f7l8(this.exception, ((toq) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @InterfaceC7396q
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    @nn86
    private /* synthetic */ C6323o(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C6323o m28279boximpl(Object obj) {
        return new C6323o(obj);
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m28280constructorimpl(@InterfaceC7395n Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28281equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C6323o) && kotlin.jvm.internal.d2ok.f7l8(obj, ((C6323o) obj2).m28288unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28282equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.d2ok.f7l8(obj, obj2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m28283exceptionOrNullimpl(Object obj) {
        if (obj instanceof toq) {
            return ((toq) obj).exception;
        }
        return null;
    }

    @nn86
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28284hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m28285isFailureimpl(Object obj) {
        return obj instanceof toq;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m28286isSuccessimpl(Object obj) {
        return !(obj instanceof toq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final T m23231k(Object obj) {
        if (m28285isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28287toStringimpl(Object obj) {
        if (obj instanceof toq) {
            return ((toq) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m28281equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28284hashCodeimpl(this.value);
    }

    @InterfaceC7396q
    public String toString() {
        return m28287toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m28288unboximpl() {
        return this.value;
    }
}
