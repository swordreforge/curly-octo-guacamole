package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/bwp;", "Lkotlinx/coroutines/ch;", "Lkotlinx/coroutines/ni7;", "Lkotlin/was;", "zy", "", "cause", "", "f7l8", "", "toString", "Lkotlinx/coroutines/gbni;", "getParent", "()Lkotlinx/coroutines/gbni;", "parent", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public final class bwp implements ch, ni7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final bwp f36798k = new bwp();

    private bwp() {
    }

    @Override // kotlinx.coroutines.ni7
    public boolean f7l8(@InterfaceC7396q Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.ni7
    @InterfaceC7395n
    public gbni getParent() {
        return null;
    }

    @InterfaceC7396q
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.ch
    public void zy() {
    }
}
