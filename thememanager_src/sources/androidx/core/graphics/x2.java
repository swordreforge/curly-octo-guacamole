package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: n */
    @lvui
    public static final x2 f3599n = new x2(0, 0, 0, 0);

    /* JADX INFO: renamed from: k */
    public final int f3600k;

    /* JADX INFO: renamed from: q */
    public final int f3601q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f50489toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f50490zy;

    /* JADX INFO: renamed from: androidx.core.graphics.x2$k */
    /* JADX INFO: compiled from: Insets.java */
    @hyr(29)
    static class C0546k {
        private C0546k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Insets m2578k(int i2, int i3, int i4, int i5) {
            return Insets.of(i2, i3, i4, i5);
        }
    }

    private x2(int i2, int i3, int i4, int i5) {
        this.f3600k = i2;
        this.f50489toq = i3;
        this.f50490zy = i4;
        this.f3601q = i5;
    }

    @hyr(api = 29)
    @lvui
    public static x2 f7l8(@lvui Insets insets) {
        return m2575q(insets.left, insets.top, insets.right, insets.bottom);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static x2 m2572g(@lvui x2 x2Var, @lvui x2 x2Var2) {
        return m2575q(x2Var.f3600k - x2Var2.f3600k, x2Var.f50489toq - x2Var2.f50489toq, x2Var.f50490zy - x2Var2.f50490zy, x2Var.f3601q - x2Var2.f3601q);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static x2 m2573k(@lvui x2 x2Var, @lvui x2 x2Var2) {
        return m2575q(x2Var.f3600k + x2Var2.f3600k, x2Var.f50489toq + x2Var2.f50489toq, x2Var.f50490zy + x2Var2.f50490zy, x2Var.f3601q + x2Var2.f3601q);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static x2 m2574n(@lvui Rect rect) {
        return m2575q(rect.left, rect.top, rect.right, rect.bottom);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static x2 m2575q(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3599n : new x2(i2, i3, i4, i5);
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @hyr(api = 29)
    @lvui
    /* JADX INFO: renamed from: s */
    public static x2 m2576s(@lvui Insets insets) {
        return f7l8(insets);
    }

    @lvui
    public static x2 toq(@lvui x2 x2Var, @lvui x2 x2Var2) {
        return m2575q(Math.max(x2Var.f3600k, x2Var2.f3600k), Math.max(x2Var.f50489toq, x2Var2.f50489toq), Math.max(x2Var.f50490zy, x2Var2.f50490zy), Math.max(x2Var.f3601q, x2Var2.f3601q));
    }

    @lvui
    public static x2 zy(@lvui x2 x2Var, @lvui x2 x2Var2) {
        return m2575q(Math.min(x2Var.f3600k, x2Var2.f3600k), Math.min(x2Var.f50489toq, x2Var2.f50489toq), Math.min(x2Var.f50490zy, x2Var2.f50490zy), Math.min(x2Var.f3601q, x2Var2.f3601q));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x2.class != obj.getClass()) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.f3601q == x2Var.f3601q && this.f3600k == x2Var.f3600k && this.f50490zy == x2Var.f50490zy && this.f50489toq == x2Var.f50489toq;
    }

    public int hashCode() {
        return (((((this.f3600k * 31) + this.f50489toq) * 31) + this.f50490zy) * 31) + this.f3601q;
    }

    @lvui
    public String toString() {
        return "Insets{left=" + this.f3600k + ", top=" + this.f50489toq + ", right=" + this.f50490zy + ", bottom=" + this.f3601q + '}';
    }

    @hyr(29)
    @lvui
    /* JADX INFO: renamed from: y */
    public Insets m2577y() {
        return C0546k.m2578k(this.f3600k, this.f50489toq, this.f50490zy, this.f3601q);
    }
}
