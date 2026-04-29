package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.c */
/* JADX INFO: compiled from: MutablePropertyReference0Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6284c extends AbstractC6289f {
    public C6284c(InterfaceC6380y interfaceC6380y, String str, String str2) {
        super(cdj.NO_RECEIVER, ((InterfaceC6293i) interfaceC6380y).cdj(), str, str2, !(interfaceC6380y instanceof InterfaceC6374q) ? 1 : 0);
    }

    @Override // kotlin.reflect.InterfaceC6364h
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.ld6
    public void set(Object obj) {
        getSetter().call(obj);
    }

    @kotlin.yz(version = "1.4")
    public C6284c(Class cls, String str, String str2, int i2) {
        super(cdj.NO_RECEIVER, cls, str, str2, i2);
    }

    @kotlin.yz(version = "1.4")
    public C6284c(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
