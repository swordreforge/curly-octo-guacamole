package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.internal.C6694z;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/yqrt;", "Lkotlinx/coroutines/internal/ni7;", "Lkotlinx/coroutines/fnq8;", "", "state", "a98o", "toString", "", "isActive", "()Z", "toq", "()Lkotlinx/coroutines/yqrt;", "list", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class yqrt extends kotlinx.coroutines.internal.ni7 implements fnq8 {
    @InterfaceC7396q
    public final String a98o(@InterfaceC7396q String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z2 = true;
        for (C6694z c6694zHyr = (C6694z) n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, this); c6694zHyr = c6694zHyr.hyr()) {
            if (c6694zHyr instanceof v0af) {
                v0af v0afVar = (v0af) c6694zHyr;
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(v0afVar);
            }
        }
        sb.append("]");
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlinx.coroutines.fnq8
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7396q
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.fnq8
    @InterfaceC7396q
    public yqrt toq() {
        return this;
    }
}
