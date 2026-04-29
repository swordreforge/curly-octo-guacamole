package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.g */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.1")
public interface InterfaceC6342g<T extends Comparable<? super T>> extends f7l8<T> {

    /* JADX INFO: renamed from: kotlin.ranges.g$k */
    /* JADX INFO: compiled from: Ranges.kt */
    public static final class k {
        /* JADX INFO: renamed from: k */
        public static <T extends Comparable<? super T>> boolean m23313k(@InterfaceC7396q InterfaceC6342g<T> interfaceC6342g, @InterfaceC7396q T value) {
            d2ok.m23075h(value, "value");
            return interfaceC6342g.toq(interfaceC6342g.mo2951k(), value) && interfaceC6342g.toq(value, interfaceC6342g.zy());
        }

        public static <T extends Comparable<? super T>> boolean toq(@InterfaceC7396q InterfaceC6342g<T> interfaceC6342g) {
            return !interfaceC6342g.toq(interfaceC6342g.mo2951k(), interfaceC6342g.zy());
        }
    }

    @Override // kotlin.ranges.f7l8
    boolean contains(@InterfaceC7396q T t2);

    @Override // kotlin.ranges.f7l8
    boolean isEmpty();

    boolean toq(@InterfaceC7396q T t2, @InterfaceC7396q T t3);
}
