package kotlin.reflect;

import cyoe.InterfaceC5979h;
import kotlin.reflect.kja0;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ki<D, E, V> extends kja0<V>, InterfaceC5979h<D, E, V> {

    /* JADX INFO: renamed from: kotlin.reflect.ki$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface InterfaceC6367k<D, E, V> extends kja0.zy<V>, InterfaceC5979h<D, E, V> {
    }

    V get(D d2, E e2);

    @InterfaceC7395n
    @yz(version = "1.1")
    Object getDelegate(D d2, E e2);

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    @InterfaceC7396q
    InterfaceC6367k<D, E, V> getGetter();
}
