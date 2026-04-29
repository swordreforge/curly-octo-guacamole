package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.k */
/* JADX INFO: compiled from: AdaptedFunctionReference.java */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.4")
public class C6301k implements a9, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C6301k(int i2, Class cls, String str, String str2, int i3) {
        this(i2, cdj.NO_RECEIVER, cls, str, str2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6301k)) {
            return false;
        }
        C6301k c6301k = (C6301k) obj;
        return this.isTopLevel == c6301k.isTopLevel && this.arity == c6301k.arity && this.flags == c6301k.flags && d2ok.f7l8(this.receiver, c6301k.receiver) && d2ok.f7l8(this.owner, c6301k.owner) && this.name.equals(c6301k.name) && this.signature.equals(c6301k.signature);
    }

    @Override // kotlin.jvm.internal.a9
    public int getArity() {
        return this.arity;
    }

    public InterfaceC6380y getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? a98o.f7l8(cls) : a98o.m23050q(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return a98o.ni7(this);
    }

    public C6301k(int i2, Object obj, Class cls, String str, String str2, int i3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i3 & 1) == 1;
        this.arity = i2;
        this.flags = i3 >> 1;
    }
}
