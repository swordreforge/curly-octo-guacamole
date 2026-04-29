package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0481h;
import com.android.thememanager.util.r8s8;
import java.util.Calendar;
import zy.lrht;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: androidx.appcompat.app.h */
/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes.dex */
class C0095h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static C0095h f46591f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final int f267g = 22;

    /* JADX INFO: renamed from: n */
    private static final int f268n = 6;

    /* JADX INFO: renamed from: q */
    private static final String f269q = "TwilightManager";

    /* JADX INFO: renamed from: k */
    private final Context f270k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final LocationManager f46592toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final k f46593zy = new k();

    /* JADX INFO: renamed from: androidx.appcompat.app.h$k */
    /* JADX INFO: compiled from: TwilightManager.java */
    private static class k {

        /* JADX INFO: renamed from: g */
        long f271g;

        /* JADX INFO: renamed from: k */
        boolean f272k;

        /* JADX INFO: renamed from: n */
        long f273n;

        /* JADX INFO: renamed from: q */
        long f274q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        long f46594toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f46595zy;

        k() {
        }
    }

    @yz
    C0095h(@lvui Context context, @lvui LocationManager locationManager) {
        this.f270k = context;
        this.f46592toq = locationManager;
    }

    private void f7l8(@lvui Location location) {
        long j2;
        k kVar = this.f46593zy;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kja0 qVar = kja0.toq();
        qVar.m203k(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = qVar.f288k;
        qVar.m203k(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = qVar.f46605zy == 1;
        long j4 = qVar.f46604toq;
        long j5 = qVar.f288k;
        qVar.m203k(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = qVar.f46604toq;
        if (j4 == -1 || j5 == -1) {
            j2 = r8s8.f16781z + jCurrentTimeMillis;
        } else {
            j2 = (jCurrentTimeMillis > j5 ? 0 + j6 : jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        kVar.f272k = z2;
        kVar.f46594toq = j3;
        kVar.f46595zy = j4;
        kVar.f274q = j5;
        kVar.f273n = j6;
        kVar.f271g = j2;
    }

    @yz
    /* JADX INFO: renamed from: g */
    static void m197g(C0095h c0095h) {
        f46591f7l8 = c0095h;
    }

    /* JADX INFO: renamed from: k */
    static C0095h m198k(@lvui Context context) {
        if (f46591f7l8 == null) {
            Context applicationContext = context.getApplicationContext();
            f46591f7l8 = new C0095h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f46591f7l8;
    }

    /* JADX INFO: renamed from: n */
    private boolean m199n() {
        return this.f46593zy.f271g > System.currentTimeMillis();
    }

    @SuppressLint({"MissingPermission"})
    private Location toq() {
        Location locationZy = C0481h.m2178q(this.f270k, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? zy("network") : null;
        Location locationZy2 = C0481h.m2178q(this.f270k, "android.permission.ACCESS_FINE_LOCATION") == 0 ? zy("gps") : null;
        return (locationZy2 == null || locationZy == null) ? locationZy2 != null ? locationZy2 : locationZy : locationZy2.getTime() > locationZy.getTime() ? locationZy2 : locationZy;
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location zy(String str) {
        try {
            if (this.f46592toq.isProviderEnabled(str)) {
                return this.f46592toq.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d(f269q, "Failed to get last known location", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    boolean m200q() {
        k kVar = this.f46593zy;
        if (m199n()) {
            return kVar.f272k;
        }
        Location qVar = toq();
        if (qVar != null) {
            f7l8(qVar);
            return kVar.f272k;
        }
        Log.i(f269q, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
