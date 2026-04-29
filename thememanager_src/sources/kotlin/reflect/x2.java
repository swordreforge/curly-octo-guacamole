package kotlin.reflect;

import cyoe.InterfaceC5979h;
import kotlin.reflect.InterfaceC6373p;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface x2<T, V> extends cdj<T, V>, InterfaceC6373p<V> {

    /* JADX INFO: renamed from: kotlin.reflect.x2$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface InterfaceC6379k<T, V> extends InterfaceC6373p.k<V>, InterfaceC5979h<T, V, was> {
    }

    @Override // kotlin.reflect.InterfaceC6373p, kotlin.reflect.ld6
    @InterfaceC7396q
    InterfaceC6379k<T, V> getSetter();

    void set(T t2, V v2);
}
