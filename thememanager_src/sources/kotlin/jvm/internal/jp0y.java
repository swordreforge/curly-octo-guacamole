package kotlin.jvm.internal;

import com.market.sdk.reflect.C4991s;
import kotlin.reflect.InterfaceC6376s;

/* JADX INFO: compiled from: FunctionReference.java */
/* JADX INFO: loaded from: classes3.dex */
public class jp0y extends cdj implements a9, InterfaceC6376s {
    private final int arity;

    @kotlin.yz(version = "1.4")
    private final int flags;

    public jp0y(int i2) {
        this(i2, cdj.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.cdj
    @kotlin.yz(version = "1.1")
    protected kotlin.reflect.zy computeReflected() {
        return a98o.zy(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jp0y) {
            jp0y jp0yVar = (jp0y) obj;
            return getName().equals(jp0yVar.getName()) && getSignature().equals(jp0yVar.getSignature()) && this.flags == jp0yVar.flags && this.arity == jp0yVar.arity && d2ok.f7l8(getBoundReceiver(), jp0yVar.getBoundReceiver()) && d2ok.f7l8(getOwner(), jp0yVar.getOwner());
        }
        if (obj instanceof InterfaceC6376s) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.a9
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC6376s
    @kotlin.yz(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC6376s
    @kotlin.yz(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC6376s
    @kotlin.yz(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.InterfaceC6376s
    @kotlin.yz(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.cdj, kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.zy zyVarCompute = compute();
        if (zyVarCompute != this) {
            return zyVarCompute.toString();
        }
        if (C4991s.f28129n.equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @kotlin.yz(version = "1.1")
    public jp0y(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.cdj
    @kotlin.yz(version = "1.1")
    public InterfaceC6376s getReflected() {
        return (InterfaceC6376s) super.getReflected();
    }

    @kotlin.yz(version = "1.4")
    public jp0y(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = i3 >> 1;
    }
}
