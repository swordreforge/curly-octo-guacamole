package androidx.window.layout;

import android.graphics.Rect;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.uv6;

/* JADX INFO: renamed from: androidx.window.layout.z */
/* JADX INFO: compiled from: WindowMetrics.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/z;", "", "", "toString", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "Landroidx/window/core/toq;", "k", "Landroidx/window/core/toq;", "_bounds", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "bounds", C4991s.f28129n, "(Landroidx/window/core/toq;)V", "(Landroid/graphics/Rect;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1353z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final androidx.window.core.toq f7187k;

    public C1353z(@InterfaceC7396q androidx.window.core.toq _bounds) {
        d2ok.m23075h(_bounds, "_bounds");
        this.f7187k = _bounds;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d2ok.f7l8(C1353z.class, obj.getClass())) {
            return false;
        }
        return d2ok.f7l8(this.f7187k, ((C1353z) obj).f7187k);
    }

    public int hashCode() {
        return this.f7187k.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Rect m5736k() {
        return this.f7187k.m5604s();
    }

    @InterfaceC7396q
    public String toString() {
        return "WindowMetrics { bounds: " + m5736k() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @uv6({uv6.EnumC7844k.TESTS})
    public C1353z(@InterfaceC7396q Rect bounds) {
        this(new androidx.window.core.toq(bounds));
        d2ok.m23075h(bounds, "bounds");
    }
}
