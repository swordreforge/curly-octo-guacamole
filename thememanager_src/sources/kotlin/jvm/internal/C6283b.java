package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.b */
/* JADX INFO: compiled from: PropertyReference2Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6283b extends y9n {
    public C6283b(InterfaceC6380y interfaceC6380y, String str, String str2) {
        super(((InterfaceC6293i) interfaceC6380y).cdj(), str, str2, !(interfaceC6380y instanceof InterfaceC6374q) ? 1 : 0);
    }

    @Override // kotlin.reflect.ki
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @kotlin.yz(version = "1.4")
    public C6283b(Class cls, String str, String str2, int i2) {
        super(cls, str, str2, i2);
    }
}
