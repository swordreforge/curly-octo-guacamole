package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.location.AbstractC0557k;
import androidx.core.os.C0579g;
import androidx.core.os.zy;
import androidx.core.util.C0642s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lrht;
import zy.lvui;

/* JADX INFO: compiled from: LocationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final long f3673k = 30000;

    /* JADX INFO: renamed from: n */
    @zy.o1t("sLocationListeners")
    static final WeakHashMap<ld6, WeakReference<C7866x2>> f3674n = new WeakHashMap<>();

    /* JADX INFO: renamed from: q */
    private static Field f3675q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final long f50522toq = 10000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f50523zy = 5;

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        @zy.o1t("sGnssStatusListeners")
        static final androidx.collection.qrj<Object, Object> f3676k = new androidx.collection.qrj<>();

        private f7l8() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.location.x2$g */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    static final class C0564g implements LocationListener {

        /* JADX INFO: renamed from: g */
        @dd
        Runnable f3677g;

        /* JADX INFO: renamed from: k */
        private final LocationManager f3678k;

        /* JADX INFO: renamed from: n */
        @zy.o1t("this")
        private boolean f3679n;

        /* JADX INFO: renamed from: q */
        private androidx.core.util.zy<Location> f3680q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Executor f50524toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Handler f50525zy = new Handler(Looper.getMainLooper());

        C0564g(LocationManager locationManager, Executor executor, androidx.core.util.zy<Location> zyVar) {
            this.f3678k = locationManager;
            this.f50524toq = executor;
            this.f3680q = zyVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m2664g() {
            this.f3677g = null;
            onLocationChanged((Location) null);
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: q */
        private void m2667q() {
            this.f3680q = null;
            this.f3678k.removeUpdates(this);
            Runnable runnable = this.f3677g;
            if (runnable != null) {
                this.f50525zy.removeCallbacks(runnable);
                this.f3677g = null;
            }
        }

        @SuppressLint({"MissingPermission"})
        public void f7l8(long j2) {
            synchronized (this) {
                if (this.f3679n) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: androidx.core.location.fn3e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3627k.m2664g();
                    }
                };
                this.f3677g = runnable;
                this.f50525zy.postDelayed(runnable, j2);
            }
        }

        @Override // android.location.LocationListener
        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@dd final Location location) {
            synchronized (this) {
                if (this.f3679n) {
                    return;
                }
                this.f3679n = true;
                final androidx.core.util.zy<Location> zyVar = this.f3680q;
                this.f50524toq.execute(new Runnable() { // from class: androidx.core.location.zurt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zyVar.accept(location);
                    }
                });
                m2667q();
            }
        }

        @Override // android.location.LocationListener
        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@lvui String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@lvui String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void zy() {
            synchronized (this) {
                if (this.f3679n) {
                    return;
                }
                this.f3679n = true;
                m2667q();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.x2$k */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(19)
    static class C0565k {

        /* JADX INFO: renamed from: k */
        private static Class<?> f3681k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50526toq;

        private C0565k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2668k(LocationManager locationManager, String str, eqxt eqxtVar, InterfaceC0571y interfaceC0571y, Looper looper) {
            try {
                if (f3681k == null) {
                    f3681k = Class.forName("android.location.LocationRequest");
                }
                if (f50526toq == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3681k, LocationListener.class, Looper.class);
                    f50526toq = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestM2611s = eqxtVar.m2611s(str);
                if (locationRequestM2611s != null) {
                    f50526toq.invoke(locationManager, locationRequestM2611s, interfaceC0571y, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC7830i
        static boolean toq(LocationManager locationManager, String str, eqxt eqxtVar, C7866x2 c7866x2) {
            try {
                if (f3681k == null) {
                    f3681k = Class.forName("android.location.LocationRequest");
                }
                if (f50526toq == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3681k, LocationListener.class, Looper.class);
                    f50526toq = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestM2611s = eqxtVar.m2611s(str);
                if (locationRequestM2611s != null) {
                    synchronized (x2.f3674n) {
                        f50526toq.invoke(locationManager, locationRequestM2611s, c7866x2, Looper.getMainLooper());
                        x2.qrj(locationManager, c7866x2);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    private static class ld6 {

        /* JADX INFO: renamed from: k */
        final String f3682k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final InterfaceC0571y f50527toq;

        ld6(String str, InterfaceC0571y interfaceC0571y) {
            this.f3682k = (String) C0642s.m2986n(str, "invalid null provider");
            this.f50527toq = (InterfaceC0571y) C0642s.m2986n(interfaceC0571y, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ld6)) {
                return false;
            }
            ld6 ld6Var = (ld6) obj;
            return this.f3682k.equals(ld6Var.f3682k) && this.f50527toq.equals(ld6Var.f50527toq);
        }

        public int hashCode() {
            return C0642s.toq(this.f3682k, this.f50527toq);
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.x2$n */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(31)
    private static class C0566n {
        private C0566n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2669k(LocationManager locationManager, @lvui String str) {
            return locationManager.hasProvider(str);
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC7830i
        static void toq(LocationManager locationManager, @lvui String str, @lvui LocationRequest locationRequest, @lvui Executor executor, @lvui LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.x2$p */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    private static final class ExecutorC0567p implements Executor {

        /* JADX INFO: renamed from: k */
        private final Handler f3683k;

        ExecutorC0567p(@lvui Handler handler) {
            this.f3683k = (Handler) androidx.core.util.n7h.x2(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@lvui Runnable runnable) {
            if (Looper.myLooper() == this.f3683k.getLooper()) {
                runnable.run();
            } else {
                if (this.f3683k.post((Runnable) androidx.core.util.n7h.x2(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f3683k + " is shutting down");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.x2$q */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(30)
    private static class C0568q {

        /* JADX INFO: renamed from: k */
        private static Class<?> f3684k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50528toq;

        private C0568q() {
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2670k(LocationManager locationManager, @lvui String str, @dd androidx.core.os.zy zyVar, @lvui Executor executor, @lvui final androidx.core.util.zy<Location> zyVar2) {
            CancellationSignal cancellationSignal = zyVar != null ? (CancellationSignal) zyVar.toq() : null;
            Objects.requireNonNull(zyVar2);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.ki
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    zyVar2.accept((Location) obj);
                }
            });
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC7830i
        public static boolean toq(LocationManager locationManager, Handler handler, Executor executor, AbstractC0557k.k kVar) {
            androidx.collection.qrj<Object, Object> qrjVar = f7l8.f3676k;
            synchronized (qrjVar) {
                C0570y c0570y = (C0570y) qrjVar.get(kVar);
                if (c0570y == null) {
                    c0570y = new C0570y(kVar);
                }
                if (!locationManager.registerGnssStatusCallback(executor, c0570y)) {
                    return false;
                }
                qrjVar.put(kVar, c0570y);
                return true;
            }
        }

        @InterfaceC7830i
        public static boolean zy(LocationManager locationManager, String str, eqxt eqxtVar, Executor executor, InterfaceC0571y interfaceC0571y) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f3684k == null) {
                        f3684k = Class.forName("android.location.LocationRequest");
                    }
                    if (f50528toq == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3684k, Executor.class, LocationListener.class);
                        f50528toq = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequestM2611s = eqxtVar.m2611s(str);
                    if (locationRequestM2611s != null) {
                        f50528toq.invoke(locationManager, locationRequestM2611s, executor, interfaceC0571y);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(24)
    static class qrj extends GnssStatus.Callback {

        /* JADX INFO: renamed from: k */
        final AbstractC0557k.k f3685k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        volatile Executor f50529toq;

        qrj(AbstractC0557k.k kVar) {
            androidx.core.util.n7h.toq(kVar != null, "invalid null callback");
            this.f3685k = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8(Executor executor) {
            if (this.f50529toq != executor) {
                return;
            }
            this.f3685k.zy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m2671g(Executor executor, GnssStatus gnssStatus) {
            if (this.f50529toq != executor) {
                return;
            }
            this.f3685k.toq(AbstractC0557k.n7h(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m2673n(Executor executor, int i2) {
            if (this.f50529toq != executor) {
                return;
            }
            this.f3685k.m2646k(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m2675y(Executor executor) {
            if (this.f50529toq != executor) {
                return;
            }
            this.f3685k.m2647q();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i2) {
            final Executor executor = this.f50529toq;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.d3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3609k.m2673n(executor, i2);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f50529toq;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.gvn7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3637k.m2671g(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f50529toq;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.jp0y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3642k.f7l8(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f50529toq;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.oc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3662k.m2675y(executor);
                }
            });
        }

        /* JADX INFO: renamed from: p */
        public void m2676p() {
            this.f50529toq = null;
        }

        /* JADX INFO: renamed from: s */
        public void m2677s(Executor executor) {
            androidx.core.util.n7h.toq(executor != null, "invalid null executor");
            androidx.core.util.n7h.n7h(this.f50529toq == null);
            this.f50529toq = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.location.x2$s */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    static class C0569s implements GpsStatus.Listener {

        /* JADX INFO: renamed from: k */
        private final LocationManager f3686k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final AbstractC0557k.k f50530toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        volatile Executor f50531zy;

        C0569s(LocationManager locationManager, AbstractC0557k.k kVar) {
            androidx.core.util.n7h.toq(kVar != null, "invalid null callback");
            this.f3686k = locationManager;
            this.f50530toq = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8(Executor executor, int i2) {
            if (this.f50531zy != executor) {
                return;
            }
            this.f50530toq.m2646k(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m2678g(Executor executor) {
            if (this.f50531zy != executor) {
                return;
            }
            this.f50530toq.m2647q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m2680n(Executor executor) {
            if (this.f50531zy != executor) {
                return;
            }
            this.f50530toq.zy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m2682y(Executor executor, AbstractC0557k abstractC0557k) {
            if (this.f50531zy != executor) {
                return;
            }
            this.f50530toq.toq(abstractC0557k);
        }

        @Override // android.location.GpsStatus.Listener
        @lrht("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i2) {
            GpsStatus gpsStatus;
            final Executor executor = this.f50531zy;
            if (executor == null) {
                return;
            }
            if (i2 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.ni7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3657k.m2680n(executor);
                    }
                });
                return;
            }
            if (i2 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.fu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3632k.m2678g(executor);
                    }
                });
                return;
            }
            if (i2 != 3) {
                if (i2 == 4 && (gpsStatus = this.f3686k.getGpsStatus(null)) != null) {
                    final AbstractC0557k abstractC0557kKja0 = AbstractC0557k.kja0(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.o1t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3659k.m2682y(executor, abstractC0557kKja0);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f3686k.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3689k.f7l8(executor, timeToFirstFix);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m2683p() {
            this.f50531zy = null;
        }

        /* JADX INFO: renamed from: s */
        public void m2684s(Executor executor) {
            androidx.core.util.n7h.n7h(this.f50531zy == null);
            this.f50531zy = executor;
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(24)
    static class toq {
        private toq() {
        }

        @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2685k(LocationManager locationManager, Handler handler, Executor executor, AbstractC0557k.k kVar) {
            androidx.core.util.n7h.m2975k(handler != null);
            androidx.collection.qrj<Object, Object> qrjVar = f7l8.f3676k;
            synchronized (qrjVar) {
                qrj qrjVar2 = (qrj) qrjVar.get(kVar);
                if (qrjVar2 == null) {
                    qrjVar2 = new qrj(kVar);
                } else {
                    qrjVar2.m2676p();
                }
                qrjVar2.m2677s(executor);
                if (!locationManager.registerGnssStatusCallback(qrjVar2, handler)) {
                    return false;
                }
                qrjVar.put(kVar, qrjVar2);
                return true;
            }
        }

        @InterfaceC7830i
        static void toq(LocationManager locationManager, Object obj) {
            if (obj instanceof qrj) {
                ((qrj) obj).m2676p();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.x2$y */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(30)
    private static class C0570y extends GnssStatus.Callback {

        /* JADX INFO: renamed from: k */
        final AbstractC0557k.k f3688k;

        C0570y(AbstractC0557k.k kVar) {
            androidx.core.util.n7h.toq(kVar != null, "invalid null callback");
            this.f3688k = kVar;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i2) {
            this.f3688k.m2646k(i2);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f3688k.toq(AbstractC0557k.n7h(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f3688k.zy();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f3688k.m2647q();
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @hyr(28)
    private static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2693k(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @InterfaceC7830i
        static int toq(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @InterfaceC7830i
        static boolean zy(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    private x2() {
    }

    public static void cdj(@lvui LocationManager locationManager, @lvui AbstractC0557k.k kVar) {
        androidx.collection.qrj<Object, Object> qrjVar = f7l8.f3676k;
        synchronized (qrjVar) {
            Object objRemove = qrjVar.remove(kVar);
            if (objRemove != null) {
                toq.toq(locationManager, objRemove);
            }
        }
    }

    public static boolean f7l8(@lvui LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? zy.zy(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2656g(@lvui LocationManager locationManager, @lvui String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0566n.m2669k(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: h */
    public static void m2657h(@lvui LocationManager locationManager, @lvui String str, @lvui eqxt eqxtVar, @lvui Executor executor, @lvui InterfaceC0571y interfaceC0571y) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            C0566n.toq(locationManager, str, eqxtVar.m2612y(), executor, interfaceC0571y);
            return;
        }
        if (i2 < 30 || !C0568q.zy(locationManager, str, eqxtVar, executor, interfaceC0571y)) {
            C7866x2 c7866x2 = new C7866x2(new ld6(str, interfaceC0571y), executor);
            if (C0565k.toq(locationManager, str, eqxtVar, c7866x2)) {
                return;
            }
            synchronized (f3674n) {
                locationManager.requestLocationUpdates(str, eqxtVar.toq(), eqxtVar.m2609n(), c7866x2, Looper.getMainLooper());
                qrj(locationManager, c7866x2);
            }
        }
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void kja0(@lvui LocationManager locationManager, @lvui String str, @lvui eqxt eqxtVar, @lvui InterfaceC0571y interfaceC0571y, @lvui Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C0566n.toq(locationManager, str, eqxtVar.m2612y(), C0579g.m2721k(new Handler(looper)), interfaceC0571y);
        } else {
            if (C0565k.m2668k(locationManager, str, eqxtVar, interfaceC0571y, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, eqxtVar.toq(), eqxtVar.m2609n(), interfaceC0571y, looper);
        }
    }

    @lrht("android.permission.ACCESS_FINE_LOCATION")
    public static boolean ld6(@lvui LocationManager locationManager, @lvui AbstractC0557k.k kVar, @lvui Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? x2(locationManager, C0579g.m2721k(handler), kVar) : x2(locationManager, new ExecutorC0567p(handler), kVar);
    }

    /* JADX INFO: renamed from: n */
    public static int m2659n(@lvui LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zy.toq(locationManager);
        }
        return 0;
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void n7h(@lvui LocationManager locationManager, @lvui InterfaceC0571y interfaceC0571y) {
        WeakHashMap<ld6, WeakReference<C7866x2>> weakHashMap = f3674n;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            Iterator<WeakReference<C7866x2>> it = weakHashMap.values().iterator();
            while (it.hasNext()) {
                C7866x2 c7866x2 = it.next().get();
                if (c7866x2 != null) {
                    ld6 ld6VarF7l8 = c7866x2.f7l8();
                    if (ld6VarF7l8.f50527toq == interfaceC0571y) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ld6VarF7l8);
                        c7866x2.n7h();
                        locationManager.removeUpdates(c7866x2);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f3674n.remove((ld6) it2.next());
                }
            }
        }
        locationManager.removeUpdates(interfaceC0571y);
    }

    @lrht("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: p */
    private static boolean m2660p(LocationManager locationManager, Handler handler, Executor executor, AbstractC0557k.k kVar) {
        return Build.VERSION.SDK_INT >= 30 ? C0568q.toq(locationManager, handler, executor, kVar) : toq.m2685k(locationManager, handler, executor, kVar);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static String m2661q(@lvui LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zy.m2693k(locationManager);
        }
        return null;
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @zy.o1t("sLocationListeners")
    static void qrj(LocationManager locationManager, C7866x2 c7866x2) {
        WeakReference<C7866x2> weakReferencePut = f3674n.put(c7866x2.f7l8(), new WeakReference<>(c7866x2));
        C7866x2 c7866x22 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (c7866x22 != null) {
            c7866x22.n7h();
            locationManager.removeUpdates(c7866x22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m2662s(LocationManager locationManager, C0569s c0569s) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c0569s));
    }

    @lrht("android.permission.ACCESS_FINE_LOCATION")
    public static boolean x2(@lvui LocationManager locationManager, @lvui Executor executor, @lvui AbstractC0557k.k kVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m2660p(locationManager, null, executor, kVar);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return m2660p(locationManager, new Handler(looperMyLooper), executor, kVar);
    }

    @lrht(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void zy(@lvui LocationManager locationManager, @lvui String str, @dd androidx.core.os.zy zyVar, @lvui Executor executor, @lvui final androidx.core.util.zy<Location> zyVar2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0568q.m2670k(locationManager, str, zyVar, executor, zyVar2);
            return;
        }
        if (zyVar != null) {
            zyVar.m2781n();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - C0554g.toq(lastKnownLocation) < f50522toq) {
            executor.execute(new Runnable() { // from class: androidx.core.location.p
                @Override // java.lang.Runnable
                public final void run() {
                    zyVar2.accept(lastKnownLocation);
                }
            });
            return;
        }
        final C0564g c0564g = new C0564g(locationManager, executor, zyVar2);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, c0564g, Looper.getMainLooper());
        if (zyVar != null) {
            zyVar.m2782q(new zy.toq() { // from class: androidx.core.location.ld6
                @Override // androidx.core.os.zy.toq
                public final void onCancel() {
                    c0564g.zy();
                }
            });
        }
        c0564g.f7l8(f3673k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.location.x2$x2, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocationManagerCompat.java */
    static class C7866x2 implements LocationListener {

        /* JADX INFO: renamed from: k */
        @dd
        volatile ld6 f3687k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Executor f50532toq;

        C7866x2(@dd ld6 ld6Var, Executor executor) {
            this.f3687k = ld6Var;
            this.f50532toq = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ld6(String str) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m2689p(List list) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void qrj(String str, int i2, Bundle bundle) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onStatusChanged(str, i2, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m2691s(Location location) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x2(String str) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m2692y(int i2) {
            ld6 ld6Var = this.f3687k;
            if (ld6Var == null) {
                return;
            }
            ld6Var.f50527toq.onFlushComplete(i2);
        }

        public ld6 f7l8() {
            return (ld6) C0642s.m2987q(this.f3687k);
        }

        public void n7h() {
            this.f3687k = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i2) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3668k.m2692y(i2);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@lvui final Location location) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.a9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3607k.m2691s(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@lvui final String str) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.jk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3640k.ld6(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@lvui final String str) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.wvg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3671k.x2(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i2, final Bundle bundle) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.fti
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3629k.qrj(str, i2, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@lvui final List<Location> list) {
            if (this.f3687k == null) {
                return;
            }
            this.f50532toq.execute(new Runnable() { // from class: androidx.core.location.mcp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3651k.m2689p(list);
                }
            });
        }
    }
}
