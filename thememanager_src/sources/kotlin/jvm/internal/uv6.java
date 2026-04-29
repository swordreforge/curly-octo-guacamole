package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: compiled from: MutablePropertyReference1Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public class uv6 extends lrht {
    public uv6(InterfaceC6380y interfaceC6380y, String str, String str2) {
        super(cdj.NO_RECEIVER, ((InterfaceC6293i) interfaceC6380y).cdj(), str, str2, !(interfaceC6380y instanceof InterfaceC6374q) ? 1 : 0);
    }

    @Override // kotlin.reflect.cdj
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.x2
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    @kotlin.yz(version = "1.4")
    public uv6(Class cls, String str, String str2, int i2) {
        super(cdj.NO_RECEIVER, cls, str, str2, i2);
    }

    @kotlin.yz(version = "1.4")
    public uv6(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
