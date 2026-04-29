package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6364h;

/* JADX INFO: renamed from: kotlin.jvm.internal.o */
/* JADX INFO: compiled from: PropertyReference0.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6305o extends bf2 implements InterfaceC6364h {
    public AbstractC6305o() {
    }

    @Override // kotlin.jvm.internal.cdj
    protected kotlin.reflect.zy computeReflected() {
        return a98o.m23046i(this);
    }

    @Override // kotlin.reflect.InterfaceC6364h
    @kotlin.yz(version = "1.1")
    public Object getDelegate() {
        return ((InterfaceC6364h) getReflected()).getDelegate();
    }

    @Override // cyoe.InterfaceC5981k
    public Object invoke() {
        return get();
    }

    @kotlin.yz(version = "1.1")
    public AbstractC6305o(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.kja0, kotlin.reflect.cdj
    public InterfaceC6364h.k getGetter() {
        return ((InterfaceC6364h) getReflected()).getGetter();
    }

    @kotlin.yz(version = "1.4")
    public AbstractC6305o(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
