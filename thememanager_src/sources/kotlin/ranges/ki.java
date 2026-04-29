package kotlin.ranges;

import java.lang.Comparable;
import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {kotlin.ki.class})
@yz(version = "1.9")
public interface ki<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: kotlin.ranges.ki$k */
    /* JADX INFO: compiled from: Range.kt */
    public static final class C6346k {
        /* JADX INFO: renamed from: k */
        public static <T extends Comparable<? super T>> boolean m23326k(@InterfaceC7396q ki<T> kiVar, @InterfaceC7396q T value) {
            d2ok.m23075h(value, "value");
            return value.compareTo(kiVar.mo23288k()) >= 0 && value.compareTo(kiVar.mo23287g()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean toq(@InterfaceC7396q ki<T> kiVar) {
            return kiVar.mo23288k().compareTo(kiVar.mo23287g()) >= 0;
        }
    }

    boolean contains(@InterfaceC7396q T t2);

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    T mo23287g();

    boolean isEmpty();

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    T mo23288k();
}
