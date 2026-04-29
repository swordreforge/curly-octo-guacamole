package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC6215p;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
@InterfaceC6215p
public abstract class kja0<T> {
    @InterfaceC7395n
    public final Object f7l8(@InterfaceC7396q qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo23450g = mo23450g(qrjVar.iterator(), interfaceC6216q);
        return objMo23450g == C6199q.x2() ? objMo23450g : was.f36763k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public abstract Object mo23450g(@InterfaceC7396q Iterator<? extends T> it, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    @InterfaceC7395n
    public abstract Object toq(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    @InterfaceC7395n
    public final Object zy(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return was.f36763k;
        }
        Object objMo23450g = mo23450g(iterable.iterator(), interfaceC6216q);
        return objMo23450g == C6199q.x2() ? objMo23450g : was.f36763k;
    }
}
