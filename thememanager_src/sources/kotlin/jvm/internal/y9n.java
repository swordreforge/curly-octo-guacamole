package kotlin.jvm.internal;

import kotlin.reflect.ki;

/* JADX INFO: compiled from: PropertyReference2.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y9n extends bf2 implements kotlin.reflect.ki {
    public y9n() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.zurt(this);
    }

    @Override // kotlin.reflect.ki
    @kotlin.yz(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.ki) getReflected()).getDelegate(obj, obj2);
    }

    @Override // cyoe.InterfaceC5979h
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @kotlin.yz(version = "1.4")
    public y9n(Class cls, String str, String str2, int i2) {
        super(cdj.NO_RECEIVER, cls, str, str2, i2);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public ki.InterfaceC6367k getGetter() {
        return ((kotlin.reflect.ki) getReflected()).getGetter();
    }
}
