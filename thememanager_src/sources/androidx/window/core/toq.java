package androidx.window.core;

import android.graphics.Rect;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.android.thememanager.util.hb;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Bounds.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/window/core/toq;", "", "Landroid/graphics/Rect;", C7704k.y.toq.f44691k, "", "toString", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "k", com.market.sdk.reflect.toq.f28131g, "zy", "()I", "left", "toq", "n", "top", "q", "right", hb.f61266fu4, C7704k.y.toq.f95579toq, "width", InterfaceC1925p.byf, "f7l8", "()Z", "isEmpty", AnimatedProperty.PROPERTY_NAME_Y, "isZero", C4991s.f28129n, "(IIII)V", "rect", "(Landroid/graphics/Rect;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class toq {

    /* JADX INFO: renamed from: k */
    private final int f7093k;

    /* JADX INFO: renamed from: q */
    private final int f7094q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f53701toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f53702zy;

    public toq(int i2, int i3, int i4, int i5) {
        this.f7093k = i2;
        this.f53701toq = i3;
        this.f53702zy = i4;
        this.f7094q = i5;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d2ok.f7l8(toq.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        toq toqVar = (toq) obj;
        return this.f7093k == toqVar.f7093k && this.f53701toq == toqVar.f53701toq && this.f53702zy == toqVar.f53702zy && this.f7094q == toqVar.f7094q;
    }

    public final boolean f7l8() {
        return toq() == 0 || m5600g() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m5600g() {
        return this.f53702zy - this.f7093k;
    }

    public int hashCode() {
        return (((((this.f7093k * 31) + this.f53701toq) * 31) + this.f53702zy) * 31) + this.f7094q;
    }

    /* JADX INFO: renamed from: k */
    public final int m5601k() {
        return this.f7094q;
    }

    /* JADX INFO: renamed from: n */
    public final int m5602n() {
        return this.f53701toq;
    }

    /* JADX INFO: renamed from: q */
    public final int m5603q() {
        return this.f53702zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final Rect m5604s() {
        return new Rect(this.f7093k, this.f53701toq, this.f53702zy, this.f7094q);
    }

    @InterfaceC7396q
    public String toString() {
        return ((Object) toq.class.getSimpleName()) + " { [" + this.f7093k + ',' + this.f53701toq + ',' + this.f53702zy + ',' + this.f7094q + "] }";
    }

    public final int toq() {
        return this.f7094q - this.f53701toq;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5605y() {
        return toq() == 0 && m5600g() == 0;
    }

    public final int zy() {
        return this.f7093k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public toq(@InterfaceC7396q Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        d2ok.m23075h(rect, "rect");
    }
}
