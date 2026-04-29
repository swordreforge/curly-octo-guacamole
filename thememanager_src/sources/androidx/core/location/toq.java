package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.uv6;

/* JADX INFO: compiled from: GnssStatusWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(24)
@uv6({uv6.EnumC7844k.LIBRARY})
class toq extends AbstractC0557k {

    /* JADX INFO: renamed from: s */
    private final GnssStatus f3670s;

    /* JADX INFO: renamed from: androidx.core.location.toq$k */
    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @hyr(26)
    static class C0563k {
        private C0563k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float m2654k(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getCarrierFrequencyHz(i2);
        }

        @InterfaceC7830i
        static boolean toq(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasCarrierFrequencyHz(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @hyr(30)
    static class C7865toq {
        private C7865toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float m2655k(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getBasebandCn0DbHz(i2);
        }

        @InterfaceC7830i
        static boolean toq(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasBasebandCn0DbHz(i2);
        }
    }

    toq(Object obj) {
        this.f3670s = (GnssStatus) androidx.core.util.n7h.x2((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof toq) {
            return this.f3670s.equals(((toq) obj).f3670s);
        }
        return false;
    }

    @Override // androidx.core.location.AbstractC0557k
    public int f7l8() {
        return this.f3670s.getSatelliteCount();
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: g */
    public float mo2639g(int i2) {
        return this.f3670s.getElevationDegrees(i2);
    }

    public int hashCode() {
        return this.f3670s.hashCode();
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: k */
    public float mo2640k(int i2) {
        return this.f3670s.getAzimuthDegrees(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean ld6(int i2) {
        return C0563k.toq(this.f3670s, i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: n */
    public int mo2641n(int i2) {
        return this.f3670s.getConstellationType(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: p */
    public boolean mo2642p(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7865toq.toq(this.f3670s, i2);
        }
        return false;
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: q */
    public float mo2643q(int i2) {
        return this.f3670s.getCn0DbHz(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean qrj(int i2) {
        return this.f3670s.usedInFix(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: s */
    public boolean mo2644s(int i2) {
        return this.f3670s.hasAlmanacData(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    public float toq(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7865toq.m2655k(this.f3670s, i2);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean x2(int i2) {
        return this.f3670s.hasEphemerisData(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: y */
    public int mo2645y(int i2) {
        return this.f3670s.getSvid(i2);
    }

    @Override // androidx.core.location.AbstractC0557k
    public float zy(int i2) {
        return C0563k.m2654k(this.f3670s, i2);
    }
}
