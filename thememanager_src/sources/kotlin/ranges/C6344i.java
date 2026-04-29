package kotlin.ranges;

import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.i */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6344i {
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    public static final ki<Double> f7l8(double d2, double d4) {
        return new C6343h(d2, d4);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final <T extends Comparable<? super T>> f7l8<T> m23316g(@InterfaceC7396q T t2, @InterfaceC7396q T that) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(that, "that");
        return new C6352s(t2, that);
    }

    /* JADX INFO: renamed from: k */
    public static final void m23317k(boolean z2, @InterfaceC7396q Number step) {
        d2ok.m23075h(step, "step");
        if (z2) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    /* JADX INFO: renamed from: n */
    public static final InterfaceC6342g<Float> m23318n(float f2, float f3) {
        return new C6348n(f2, f3);
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    /* JADX INFO: renamed from: q */
    public static final InterfaceC6342g<Double> m23319q(double d2, double d4) {
        return new C6350q(d2, d4);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: s */
    public static final <T extends Comparable<? super T>> ki<T> m23320s(@InterfaceC7396q T t2, @InterfaceC7396q T that) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(that, "that");
        return new C6356y(t2, that);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/f7l8<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @InterfaceC6234g
    @yz(version = "1.3")
    private static final boolean toq(f7l8 f7l8Var, Object obj) {
        d2ok.m23075h(f7l8Var, "<this>");
        return obj != null && f7l8Var.contains((Comparable) obj);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: y */
    public static final ki<Float> m23321y(float f2, float f3) {
        return new cdj(f2, f3);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/ki<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final boolean zy(ki kiVar, Object obj) {
        d2ok.m23075h(kiVar, "<this>");
        return obj != null && kiVar.contains((Comparable) obj);
    }
}
