package kotlin.jvm.internal;

import kotlin.reflect.cdj;

/* JADX INFO: compiled from: PropertyReference1.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ek5k extends bf2 implements kotlin.reflect.cdj {
    public ek5k() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.fn3e(this);
    }

    @Override // kotlin.reflect.cdj
    @kotlin.yz(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.cdj) getReflected()).getDelegate(obj);
    }

    @Override // cyoe.x2
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.yz(version = "1.1")
    public ek5k(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public cdj.InterfaceC6360k getGetter() {
        return ((kotlin.reflect.cdj) getReflected()).getGetter();
    }

    @kotlin.yz(version = "1.4")
    public ek5k(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
