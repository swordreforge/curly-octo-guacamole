package kotlin;

import java.util.List;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "TuplesKt")
public final class nmn5 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <A, B> C6227f<A, B> m23230k(A a2, B b2) {
        return new C6227f<>(a2, b2);
    }

    @InterfaceC7396q
    public static final <T> List<T> toq(@InterfaceC7396q C6227f<? extends T, ? extends T> c6227f) {
        kotlin.jvm.internal.d2ok.m23075h(c6227f, "<this>");
        return kotlin.collections.ni7.d2ok(c6227f.getFirst(), c6227f.getSecond());
    }

    @InterfaceC7396q
    public static final <T> List<T> zy(@InterfaceC7396q ch<? extends T, ? extends T, ? extends T> chVar) {
        kotlin.jvm.internal.d2ok.m23075h(chVar, "<this>");
        return kotlin.collections.ni7.d2ok(chVar.getFirst(), chVar.getSecond(), chVar.getThird());
    }
}
