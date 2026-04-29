package kotlin.jvm.internal;

import kotlin.reflect.cdj;
import kotlin.reflect.x2;

/* JADX INFO: compiled from: MutablePropertyReference1.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lrht extends nn86 implements kotlin.reflect.x2 {
    public lrht() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.ld6(this);
    }

    @Override // kotlin.reflect.cdj
    @kotlin.yz(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.x2) getReflected()).getDelegate(obj);
    }

    @Override // cyoe.x2
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.yz(version = "1.1")
    public lrht(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public cdj.InterfaceC6360k getGetter() {
        return ((kotlin.reflect.x2) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.InterfaceC6373p, kotlin.reflect.ld6
    public x2.InterfaceC6379k getSetter() {
        return ((kotlin.reflect.x2) getReflected()).getSetter();
    }

    @kotlin.yz(version = "1.4")
    public lrht(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
