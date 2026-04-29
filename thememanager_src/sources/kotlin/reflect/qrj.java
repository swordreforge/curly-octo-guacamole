package kotlin.reflect;

import kotlin.reflect.InterfaceC6373p;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface qrj<D, E, V> extends ki<D, E, V>, InterfaceC6373p<V> {

    /* JADX INFO: renamed from: kotlin.reflect.qrj$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface InterfaceC6375k<D, E, V> extends InterfaceC6373p.k<V>, cyoe.cdj<D, E, V, was> {
    }

    @Override // kotlin.reflect.InterfaceC6373p, kotlin.reflect.ld6
    @InterfaceC7396q
    InterfaceC6375k<D, E, V> getSetter();

    void set(D d2, E e2, V v2);
}
