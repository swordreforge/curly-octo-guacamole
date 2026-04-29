package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.e */
/* JADX INFO: compiled from: MutablePropertyReference2Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6288e extends vyq {
    public C6288e(InterfaceC6380y interfaceC6380y, String str, String str2) {
        super(((InterfaceC6293i) interfaceC6380y).cdj(), str, str2, !(interfaceC6380y instanceof InterfaceC6374q) ? 1 : 0);
    }

    @Override // kotlin.reflect.ki
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.qrj
    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @kotlin.yz(version = "1.4")
    public C6288e(Class cls, String str, String str2, int i2) {
        super(cls, str, str2, i2);
    }
}
