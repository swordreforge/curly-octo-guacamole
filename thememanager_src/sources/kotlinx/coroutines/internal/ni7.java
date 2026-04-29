package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/ni7;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", C0846k.zaso, "Lkotlin/Function1;", "Lkotlin/was;", "block", "y9n", "", "bf2", "e", "i1", "()V", "", "b", "()Z", "isEmpty", "uv6", "isRemoved", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class ni7 extends C6694z {
    /* JADX INFO: renamed from: b */
    public final boolean m24383b() {
        return n5r1() == this;
    }

    @InterfaceC7396q
    public final Void bf2() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7395n
    /* JADX INFO: renamed from: e */
    protected C6694z mo24384e() {
        return null;
    }

    public final void i1() {
        C6694z c6694z = (C6694z) n5r1();
        C6694z c6694z2 = this;
        while (!kotlin.jvm.internal.d2ok.f7l8(c6694z, this)) {
            C6694z c6694zHyr = c6694z.hyr();
            c6694z.yz(c6694z2, c6694zHyr);
            c6694z2 = c6694z;
            c6694z = c6694zHyr;
        }
        yz(c6694z2, (C6694z) n5r1());
    }

    @Override // kotlinx.coroutines.internal.C6694z
    public /* bridge */ /* synthetic */ boolean nn86() {
        return ((Boolean) bf2()).booleanValue();
    }

    @Override // kotlinx.coroutines.internal.C6694z
    public boolean uv6() {
        return false;
    }

    public final /* synthetic */ <T extends C6694z> void y9n(cyoe.x2<? super T, was> x2Var) {
        for (C6694z c6694zHyr = (C6694z) n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, this); c6694zHyr = c6694zHyr.hyr()) {
            kotlin.jvm.internal.d2ok.m23086z(3, C0846k.zaso);
            if (c6694zHyr instanceof C6694z) {
                x2Var.invoke(c6694zHyr);
            }
        }
    }
}
