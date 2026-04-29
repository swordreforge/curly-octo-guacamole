package kotlin.reflect;

import kotlin.reflect.kja0;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface cdj<T, V> extends kja0<V>, cyoe.x2<T, V> {

    /* JADX INFO: renamed from: kotlin.reflect.cdj$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface InterfaceC6360k<T, V> extends kja0.zy<V>, cyoe.x2<T, V> {
    }

    V get(T t2);

    @InterfaceC7395n
    @yz(version = "1.1")
    Object getDelegate(T t2);

    @Override // 
    @InterfaceC7396q
    InterfaceC6360k<T, V> getGetter();
}
