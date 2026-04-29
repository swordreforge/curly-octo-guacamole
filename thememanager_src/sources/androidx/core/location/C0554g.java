package androidx.core.location;

import android.location.Location;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.location.g */
/* JADX INFO: compiled from: LocationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0554g {

    /* JADX INFO: renamed from: k */
    public static final String f3634k = "mockLocation";

    /* JADX INFO: renamed from: n */
    @dd
    private static Method f3635n = null;

    /* JADX INFO: renamed from: q */
    public static final String f3636q = "bearingAccuracy";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50505toq = "verticalAccuracy";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f50506zy = "speedAccuracy";

    /* JADX INFO: renamed from: androidx.core.location.g$k */
    /* JADX INFO: compiled from: LocationCompat.java */
    @hyr(17)
    private static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static long m2629k(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.g$toq */
    /* JADX INFO: compiled from: LocationCompat.java */
    @hyr(18)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2630k(Location location) {
            return location.isFromMockProvider();
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.g$zy */
    /* JADX INFO: compiled from: LocationCompat.java */
    @hyr(26)
    private static class zy {
        private zy() {
        }

        @InterfaceC7830i
        static void f7l8(Location location, float f2) {
            location.setBearingAccuracyDegrees(f2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static boolean m2631g(Location location) {
            return location.hasVerticalAccuracy();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float m2632k(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m2633n(Location location) {
            return location.hasSpeedAccuracy();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m2634q(Location location) {
            return location.hasBearingAccuracy();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static void m2635s(Location location, float f2) {
            location.setVerticalAccuracyMeters(f2);
        }

        @InterfaceC7830i
        static float toq(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m2636y(Location location, float f2) {
            location.setSpeedAccuracyMetersPerSecond(f2);
        }

        @InterfaceC7830i
        static float zy(Location location) {
            return location.getVerticalAccuracyMeters();
        }
    }

    private C0554g() {
    }

    public static boolean f7l8(@lvui Location location) {
        return zy.m2634q(location);
    }

    /* JADX INFO: renamed from: g */
    public static float m2622g(@lvui Location location) {
        return zy.zy(location);
    }

    /* JADX INFO: renamed from: k */
    public static float m2623k(@lvui Location location) {
        return zy.m2632k(location);
    }

    public static void ld6(@lvui Location location, float f2) {
        zy.f7l8(location, f2);
    }

    /* JADX INFO: renamed from: n */
    public static float m2624n(@lvui Location location) {
        return zy.toq(location);
    }

    public static void n7h(@lvui Location location, float f2) {
        zy.m2635s(location, f2);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2625p(@lvui Location location) {
        return toq.m2630k(location);
    }

    /* JADX INFO: renamed from: q */
    private static Method m2626q() throws NoSuchMethodException {
        if (f3635n == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f3635n = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f3635n;
    }

    public static void qrj(@lvui Location location, float f2) {
        zy.m2636y(location, f2);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2627s(@lvui Location location) {
        return zy.m2631g(location);
    }

    public static long toq(@lvui Location location) {
        return TimeUnit.NANOSECONDS.toMillis(k.m2629k(location));
    }

    public static void x2(@lvui Location location, boolean z2) {
        try {
            m2626q().invoke(location, Boolean.valueOf(z2));
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2628y(@lvui Location location) {
        return zy.m2633n(location);
    }

    public static long zy(@lvui Location location) {
        return k.m2629k(location);
    }
}
