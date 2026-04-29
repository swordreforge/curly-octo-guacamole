package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.internal.C6675i;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/z4;", "Lkotlinx/coroutines/dd;", "", "toString", "", "parallelism", "ga", "vy", "dxef", "()Lkotlinx/coroutines/z4;", "immediate", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class z4 extends dd {
    @InterfaceC7396q
    public abstract z4 dxef();

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public dd ga(int i2) {
        C6675i.m24351k(i2);
        return this;
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        String strVy = vy();
        if (strVy != null) {
            return strVy;
        }
        return C6551e.m24040k(this) + '@' + C6551e.toq(this);
    }

    @InterfaceC7395n
    @tfm
    protected final String vy() {
        z4 z4VarDxef;
        z4 z4VarM23813n = C6481a.m23813n();
        if (this == z4VarM23813n) {
            return "Dispatchers.Main";
        }
        try {
            z4VarDxef = z4VarM23813n.dxef();
        } catch (UnsupportedOperationException unused) {
            z4VarDxef = null;
        }
        if (this == z4VarDxef) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
