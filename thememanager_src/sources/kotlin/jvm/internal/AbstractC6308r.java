package kotlin.jvm.internal;

import java.io.Serializable;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.r */
/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6308r<R> implements a9<R>, Serializable {
    private final int arity;

    public AbstractC6308r(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.a9
    public int getArity() {
        return this.arity;
    }

    @InterfaceC7396q
    public String toString() {
        String strFu4 = a98o.fu4(this);
        d2ok.kja0(strFu4, "renderLambdaToString(this)");
        return strFu4;
    }
}
