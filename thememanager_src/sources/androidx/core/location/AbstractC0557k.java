package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import com.android.thememanager.superwallpaper.view.SuperWallpaperPreviewLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.location.k */
/* JADX INFO: compiled from: GnssStatusCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f50507f7l8 = 6;

    /* JADX INFO: renamed from: g */
    @SuppressLint({"InlinedApi"})
    public static final int f3644g = 5;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"InlinedApi"})
    public static final int f3645k = 0;

    /* JADX INFO: renamed from: n */
    @SuppressLint({"InlinedApi"})
    public static final int f3646n = 4;

    /* JADX INFO: renamed from: q */
    @SuppressLint({"InlinedApi"})
    public static final int f3647q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f50508toq = 1;

    /* JADX INFO: renamed from: y */
    @SuppressLint({"InlinedApi"})
    public static final int f3648y = 7;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f50509zy = 2;

    /* JADX INFO: renamed from: androidx.core.location.k$k */
    /* JADX INFO: compiled from: GnssStatusCompat.java */
    public static abstract class k {
        /* JADX INFO: renamed from: k */
        public void m2646k(@zy.a9(from = 0) int i2) {
        }

        /* JADX INFO: renamed from: q */
        public void m2647q() {
        }

        public void toq(@lvui AbstractC0557k abstractC0557k) {
        }

        public void zy() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.k$toq */
    /* JADX INFO: compiled from: GnssStatusCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface toq {
    }

    AbstractC0557k() {
    }

    @lvui
    @SuppressLint({"ReferencesDeprecated"})
    public static AbstractC0557k kja0(@lvui GpsStatus gpsStatus) {
        return new C0558n(gpsStatus);
    }

    @hyr(24)
    @lvui
    public static AbstractC0557k n7h(@lvui GnssStatus gnssStatus) {
        return new androidx.core.location.toq(gnssStatus);
    }

    @zy.a9(from = 0)
    public abstract int f7l8();

    @zy.zurt(from = -90.0d, to = 90.0d)
    /* JADX INFO: renamed from: g */
    public abstract float mo2639g(@zy.a9(from = 0) int i2);

    @zy.zurt(from = 0.0d, to = 360.0d)
    /* JADX INFO: renamed from: k */
    public abstract float mo2640k(@zy.a9(from = 0) int i2);

    public abstract boolean ld6(@zy.a9(from = 0) int i2);

    /* JADX INFO: renamed from: n */
    public abstract int mo2641n(@zy.a9(from = 0) int i2);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo2642p(@zy.a9(from = 0) int i2);

    @zy.zurt(from = 0.0d, to = 63.0d)
    /* JADX INFO: renamed from: q */
    public abstract float mo2643q(@zy.a9(from = 0) int i2);

    public abstract boolean qrj(@zy.a9(from = 0) int i2);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo2644s(@zy.a9(from = 0) int i2);

    @zy.zurt(from = 0.0d, to = 63.0d)
    public abstract float toq(@zy.a9(from = 0) int i2);

    public abstract boolean x2(@zy.a9(from = 0) int i2);

    @zy.a9(from = 1, to = SuperWallpaperPreviewLayout.f16173c)
    /* JADX INFO: renamed from: y */
    public abstract int mo2645y(@zy.a9(from = 0) int i2);

    @zy.zurt(from = 0.0d)
    public abstract float zy(@zy.a9(from = 0) int i2);
}
