package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.jvm.internal.a9;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public abstract class ld6 extends AbstractC6208p implements a9<Object>, n7h {
    private final int arity;

    public ld6(int i2, @InterfaceC7395n InterfaceC6216q<Object> interfaceC6216q) {
        super(interfaceC6216q);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.a9
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
    @InterfaceC7396q
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strNi7 = a98o.ni7(this);
        d2ok.kja0(strNi7, "renderLambdaToString(this)");
        return strNi7;
    }

    public ld6(int i2) {
        this(i2, null);
    }
}
