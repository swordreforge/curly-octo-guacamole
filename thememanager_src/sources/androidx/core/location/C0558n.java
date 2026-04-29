package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Iterator;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.location.n */
/* JADX INFO: compiled from: GpsStatusWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
class C0558n extends AbstractC0557k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f50510cdj = 64;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f50511fn3e = 193;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f50512fu4 = 35;

    /* JADX INFO: renamed from: h */
    private static final int f3653h = 33;

    /* JADX INFO: renamed from: i */
    private static final int f3654i = 24;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f50513ki = -87;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f50514kja0 = 32;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f50515n7h = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f50516ni7 = 200;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f50517t8r = 64;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f50518zurt = 200;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.o1t("mWrapped")
    private Iterator<GpsSatellite> f50519ld6;

    /* JADX INFO: renamed from: p */
    @zy.o1t("mWrapped")
    private int f3655p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.o1t("mWrapped")
    private GpsSatellite f50520qrj;

    /* JADX INFO: renamed from: s */
    private final GpsStatus f3656s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.o1t("mWrapped")
    private int f50521x2;

    C0558n(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) androidx.core.util.n7h.x2(gpsStatus);
        this.f3656s = gpsStatus2;
        this.f3655p = -1;
        this.f50519ld6 = gpsStatus2.getSatellites().iterator();
        this.f50521x2 = -1;
        this.f50520qrj = null;
    }

    private GpsSatellite cdj(int i2) {
        GpsSatellite gpsSatellite;
        synchronized (this.f3656s) {
            if (i2 < this.f50521x2) {
                this.f50519ld6 = this.f3656s.getSatellites().iterator();
                this.f50521x2 = -1;
            }
            while (true) {
                int i3 = this.f50521x2;
                if (i3 >= i2) {
                    break;
                }
                this.f50521x2 = i3 + 1;
                if (!this.f50519ld6.hasNext()) {
                    this.f50520qrj = null;
                    break;
                }
                this.f50520qrj = this.f50519ld6.next();
            }
            gpsSatellite = this.f50520qrj;
        }
        return (GpsSatellite) androidx.core.util.n7h.x2(gpsSatellite);
    }

    /* JADX INFO: renamed from: h */
    private static int m2649h(int i2) {
        if (i2 > 0 && i2 <= 32) {
            return 1;
        }
        if (i2 >= 33 && i2 <= 64) {
            return 2;
        }
        if (i2 > 64 && i2 <= 88) {
            return 3;
        }
        if (i2 <= 200 || i2 > 235) {
            return (i2 < 193 || i2 > 200) ? 0 : 4;
        }
        return 5;
    }

    private static int ki(int i2) {
        int iM2649h = m2649h(i2);
        return iM2649h != 2 ? iM2649h != 3 ? iM2649h != 5 ? i2 : i2 - 200 : i2 - 64 : i2 + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0558n) {
            return this.f3656s.equals(((C0558n) obj).f3656s);
        }
        return false;
    }

    @Override // androidx.core.location.AbstractC0557k
    public int f7l8() {
        int i2;
        synchronized (this.f3656s) {
            if (this.f3655p == -1) {
                for (GpsSatellite gpsSatellite : this.f3656s.getSatellites()) {
                    this.f3655p++;
                }
                this.f3655p++;
            }
            i2 = this.f3655p;
        }
        return i2;
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: g */
    public float mo2639g(int i2) {
        return cdj(i2).getElevation();
    }

    public int hashCode() {
        return this.f3656s.hashCode();
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: k */
    public float mo2640k(int i2) {
        return cdj(i2).getAzimuth();
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean ld6(int i2) {
        return false;
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: n */
    public int mo2641n(int i2) {
        return m2649h(cdj(i2).getPrn());
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: p */
    public boolean mo2642p(int i2) {
        return false;
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: q */
    public float mo2643q(int i2) {
        return cdj(i2).getSnr();
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean qrj(int i2) {
        return cdj(i2).usedInFix();
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: s */
    public boolean mo2644s(int i2) {
        return cdj(i2).hasAlmanac();
    }

    @Override // androidx.core.location.AbstractC0557k
    public float toq(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0557k
    public boolean x2(int i2) {
        return cdj(i2).hasEphemeris();
    }

    @Override // androidx.core.location.AbstractC0557k
    /* JADX INFO: renamed from: y */
    public int mo2645y(int i2) {
        return ki(cdj(i2).getPrn());
    }

    @Override // androidx.core.location.AbstractC0557k
    public float zy(int i2) {
        throw new UnsupportedOperationException();
    }
}
