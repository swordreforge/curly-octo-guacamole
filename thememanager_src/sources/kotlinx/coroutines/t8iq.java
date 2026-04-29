package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/t8iq;", "Lkotlinx/coroutines/fnq8;", "", "toString", "", "k", com.market.sdk.reflect.toq.f68929toq, "isActive", "()Z", "Lkotlinx/coroutines/yqrt;", "toq", "()Lkotlinx/coroutines/yqrt;", "list", C4991s.f28129n, "(Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class t8iq implements fnq8 {

    /* JADX INFO: renamed from: k */
    private final boolean f37445k;

    public t8iq(boolean z2) {
        this.f37445k = z2;
    }

    @Override // kotlinx.coroutines.fnq8
    public boolean isActive() {
        return this.f37445k;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.fnq8
    @InterfaceC7395n
    public yqrt toq() {
        return null;
    }
}
