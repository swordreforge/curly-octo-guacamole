package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.InterfaceC6376s;

/* JADX INFO: compiled from: FunInterfaceConstructorReference.java */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.7")
public class mcp extends jp0y implements Serializable {
    private final Class funInterface;

    public mcp(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // kotlin.jvm.internal.jp0y
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mcp) {
            return this.funInterface.equals(((mcp) obj).funInterface);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.jp0y
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // kotlin.jvm.internal.jp0y
    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.jp0y, kotlin.jvm.internal.cdj
    public InterfaceC6376s getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
