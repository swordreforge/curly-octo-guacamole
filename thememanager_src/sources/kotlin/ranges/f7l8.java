package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface f7l8<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: kotlin.ranges.f7l8$k */
    /* JADX INFO: compiled from: Range.kt */
    public static final class C6340k {
        /* JADX INFO: renamed from: k */
        public static <T extends Comparable<? super T>> boolean m23290k(@InterfaceC7396q f7l8<T> f7l8Var, @InterfaceC7396q T value) {
            d2ok.m23075h(value, "value");
            return value.compareTo(f7l8Var.mo2951k()) >= 0 && value.compareTo(f7l8Var.zy()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean toq(@InterfaceC7396q f7l8<T> f7l8Var) {
            return f7l8Var.mo2951k().compareTo(f7l8Var.zy()) > 0;
        }
    }

    boolean contains(@InterfaceC7396q T t2);

    boolean isEmpty();

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    T mo2951k();

    @InterfaceC7396q
    T zy();
}
