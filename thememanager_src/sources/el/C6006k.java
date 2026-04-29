package el;

import cyoe.InterfaceC5981k;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.a98o;
import kotlin.collections.i1;
import kotlin.collections.ni7;
import kotlin.collections.zurt;
import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.ki;
import kotlin.sequences.qrj;
import kotlin.sequences.t8r;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: el.k */
/* JADX INFO: compiled from: Optionals.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6006k {
    @i9jn(markerClass = {ki.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    public static final <T> Set<T> f7l8(@InterfaceC7396q Optional<? extends T> optional) {
        d2ok.m23075h(optional, "<this>");
        return optional.isPresent() ? i1.m22499g(optional.get()) : a98o.ld6();
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: g */
    public static final <T> List<T> m22249g(@InterfaceC7396q Optional<? extends T> optional) {
        d2ok.m23075h(optional, "<this>");
        return optional.isPresent() ? zurt.ld6(optional.get()) : ni7.a9();
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: k */
    public static final <T> qrj<T> m22250k(@InterfaceC7396q Optional<? extends T> optional) {
        d2ok.m23075h(optional, "<this>");
        return optional.isPresent() ? t8r.cdj(optional.get()) : t8r.f7l8();
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: n */
    public static final <T, C extends Collection<? super T>> C m22251n(@InterfaceC7396q Optional<T> optional, @InterfaceC7396q C destination) {
        d2ok.m23075h(optional, "<this>");
        d2ok.m23075h(destination, "destination");
        if (optional.isPresent()) {
            T t2 = optional.get();
            d2ok.kja0(t2, "get()");
            destination.add(t2);
        }
        return destination;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7395n
    @yz(version = "1.8")
    /* JADX INFO: renamed from: q */
    public static final <T> T m22252q(@InterfaceC7396q Optional<T> optional) {
        d2ok.m23075h(optional, "<this>");
        return optional.orElse(null);
    }

    @i9jn(markerClass = {ki.class})
    @yz(version = "1.8")
    public static final <T> T toq(@InterfaceC7396q Optional<? extends T> optional, T t2) {
        d2ok.m23075h(optional, "<this>");
        return optional.isPresent() ? optional.get() : t2;
    }

    @i9jn(markerClass = {ki.class})
    @yz(version = "1.8")
    public static final <T> T zy(@InterfaceC7396q Optional<? extends T> optional, @InterfaceC7396q InterfaceC5981k<? extends T> defaultValue) {
        d2ok.m23075h(optional, "<this>");
        d2ok.m23075h(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }
}
