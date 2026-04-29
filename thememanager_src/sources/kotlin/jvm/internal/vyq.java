package kotlin.jvm.internal;

import kotlin.reflect.ki;
import kotlin.reflect.qrj;

/* JADX INFO: compiled from: MutablePropertyReference2.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vyq extends nn86 implements kotlin.reflect.qrj {
    public vyq() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.x2(this);
    }

    @Override // kotlin.reflect.ki
    @kotlin.yz(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.qrj) getReflected()).getDelegate(obj, obj2);
    }

    @Override // cyoe.InterfaceC5979h
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @kotlin.yz(version = "1.4")
    public vyq(Class cls, String str, String str2, int i2) {
        super(cdj.NO_RECEIVER, cls, str, str2, i2);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public ki.InterfaceC6367k getGetter() {
        return ((kotlin.reflect.qrj) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.InterfaceC6373p, kotlin.reflect.ld6
    public qrj.InterfaceC6375k getSetter() {
        return ((kotlin.reflect.qrj) getReflected()).getSetter();
    }
}
