package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6364h;
import kotlin.reflect.ld6;

/* JADX INFO: renamed from: kotlin.jvm.internal.f */
/* JADX INFO: compiled from: MutablePropertyReference0.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6289f extends nn86 implements kotlin.reflect.ld6 {
    public AbstractC6289f() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.m23049p(this);
    }

    @Override // kotlin.reflect.InterfaceC6364h
    @kotlin.yz(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.ld6) getReflected()).getDelegate();
    }

    @Override // cyoe.InterfaceC5981k
    public Object invoke() {
        return get();
    }

    @kotlin.yz(version = "1.1")
    public AbstractC6289f(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public InterfaceC6364h.k getGetter() {
        return ((kotlin.reflect.ld6) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.InterfaceC6373p, kotlin.reflect.ld6
    public ld6.InterfaceC6369k getSetter() {
        return ((kotlin.reflect.ld6) getReflected()).getSetter();
    }

    @kotlin.yz(version = "1.4")
    public AbstractC6289f(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
