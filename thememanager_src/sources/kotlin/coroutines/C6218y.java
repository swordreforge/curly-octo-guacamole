package kotlin.coroutines;

import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.d2ok;
import kotlin.ki;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.y */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6218y {
    /* JADX WARN: Multi-variable type inference failed */
    @ki
    @InterfaceC7395n
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static final <E extends f7l8.toq> E m22777k(@InterfaceC7396q f7l8.toq toqVar, @InterfaceC7396q f7l8.zy<E> key) {
        d2ok.m23075h(toqVar, "<this>");
        d2ok.m23075h(key, "key");
        if (!(key instanceof toq)) {
            if (toqVar.getKey() == key) {
                return toqVar;
            }
            return null;
        }
        toq toqVar2 = (toq) key;
        if (!toqVar2.m22776k(toqVar.getKey())) {
            return null;
        }
        E e2 = (E) toqVar2.toq(toqVar);
        if (e2 instanceof f7l8.toq) {
            return e2;
        }
        return null;
    }

    @InterfaceC7396q
    @ki
    @yz(version = "1.3")
    public static final f7l8 toq(@InterfaceC7396q f7l8.toq toqVar, @InterfaceC7396q f7l8.zy<?> key) {
        d2ok.m23075h(toqVar, "<this>");
        d2ok.m23075h(key, "key");
        if (!(key instanceof toq)) {
            return toqVar.getKey() == key ? C6217s.INSTANCE : toqVar;
        }
        toq toqVar2 = (toq) key;
        return (!toqVar2.m22776k(toqVar.getKey()) || toqVar2.toq(toqVar) == null) ? toqVar : C6217s.INSTANCE;
    }
}
