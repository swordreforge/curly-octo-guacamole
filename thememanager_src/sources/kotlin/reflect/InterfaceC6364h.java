package kotlin.reflect;

import cyoe.InterfaceC5981k;
import kotlin.reflect.kja0;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.reflect.h */
/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6364h<V> extends kja0<V>, InterfaceC5981k<V> {

    /* JADX INFO: renamed from: kotlin.reflect.h$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface k<V> extends kja0.zy<V>, InterfaceC5981k<V> {
    }

    V get();

    @InterfaceC7395n
    @yz(version = "1.1")
    Object getDelegate();

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    @InterfaceC7396q
    k<V> getGetter();
}
