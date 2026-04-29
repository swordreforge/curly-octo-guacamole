package androidx.core.util;

import android.util.SizeF;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: SizeFCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class cdj {

    /* JADX INFO: renamed from: k */
    private final float f3867k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f50628toq;

    /* JADX INFO: renamed from: androidx.core.util.cdj$k */
    /* JADX INFO: compiled from: SizeFCompat.java */
    @hyr(21)
    private static final class C0631k {
        private C0631k() {
        }

        @InterfaceC7830i
        @lvui
        /* JADX INFO: renamed from: k */
        static SizeF m2923k(@lvui cdj cdjVar) {
            n7h.x2(cdjVar);
            return new SizeF(cdjVar.toq(), cdjVar.m2922k());
        }

        @InterfaceC7830i
        @lvui
        static cdj toq(@lvui SizeF sizeF) {
            n7h.x2(sizeF);
            return new cdj(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public cdj(float f2, float f3) {
        this.f3867k = n7h.m2978q(f2, "width");
        this.f50628toq = n7h.m2978q(f3, InterfaceC1925p.byf);
    }

    @hyr(21)
    @lvui
    /* JADX INFO: renamed from: q */
    public static cdj m2921q(@lvui SizeF sizeF) {
        return C0631k.toq(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdj)) {
            return false;
        }
        cdj cdjVar = (cdj) obj;
        return cdjVar.f3867k == this.f3867k && cdjVar.f50628toq == this.f50628toq;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f3867k) ^ Float.floatToIntBits(this.f50628toq);
    }

    /* JADX INFO: renamed from: k */
    public float m2922k() {
        return this.f50628toq;
    }

    @lvui
    public String toString() {
        return this.f3867k + AnimatedProperty.PROPERTY_NAME_X + this.f50628toq;
    }

    public float toq() {
        return this.f3867k;
    }

    @hyr(21)
    @lvui
    public SizeF zy() {
        return C0631k.m2923k(this);
    }
}
