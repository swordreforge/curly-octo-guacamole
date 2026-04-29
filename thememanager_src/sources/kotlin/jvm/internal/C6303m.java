package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.m */
/* JADX INFO: compiled from: PropertyReference0Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6303m extends AbstractC6305o {
    public C6303m(InterfaceC6380y interfaceC6380y, String str, String str2) {
        super(cdj.NO_RECEIVER, ((InterfaceC6293i) interfaceC6380y).cdj(), str, str2, !(interfaceC6380y instanceof InterfaceC6374q) ? 1 : 0);
    }

    @Override // kotlin.reflect.InterfaceC6364h
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @kotlin.yz(version = "1.4")
    public C6303m(Class cls, String str, String str2, int i2) {
        super(cdj.NO_RECEIVER, cls, str, str2, i2);
    }

    @kotlin.yz(version = "1.4")
    public C6303m(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
