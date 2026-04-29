package androidx.core.location;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: LocationRequestCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class eqxt {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50495ld6 = 104;

    /* JADX INFO: renamed from: p */
    public static final int f3612p = 102;

    /* JADX INFO: renamed from: s */
    public static final int f3613s = 100;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f50496x2 = -1;

    /* JADX INFO: renamed from: y */
    public static final long f3614y = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final long f50497f7l8;

    /* JADX INFO: renamed from: g */
    final float f3615g;

    /* JADX INFO: renamed from: k */
    final int f3616k;

    /* JADX INFO: renamed from: n */
    final int f3617n;

    /* JADX INFO: renamed from: q */
    final long f3618q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final long f50498toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final long f50499zy;

    /* JADX INFO: renamed from: androidx.core.location.eqxt$k */
    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @hyr(19)
    private static class C0552k {

        /* JADX INFO: renamed from: g */
        private static Method f3619g;

        /* JADX INFO: renamed from: k */
        private static Class<?> f3620k;

        /* JADX INFO: renamed from: n */
        private static Method f3621n;

        /* JADX INFO: renamed from: q */
        private static Method f3622q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static Method f50500toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static Method f50501zy;

        private C0552k() {
        }

        /* JADX INFO: renamed from: k */
        public static Object m2613k(eqxt eqxtVar, String str) {
            try {
                if (f3620k == null) {
                    f3620k = Class.forName("android.location.LocationRequest");
                }
                if (f50500toq == null) {
                    Method declaredMethod = f3620k.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f50500toq = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f50500toq.invoke(null, str, Long.valueOf(eqxtVar.toq()), Float.valueOf(eqxtVar.m2609n()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                if (f50501zy == null) {
                    Method declaredMethod2 = f3620k.getDeclaredMethod("setQuality", Integer.TYPE);
                    f50501zy = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f50501zy.invoke(objInvoke, Integer.valueOf(eqxtVar.f7l8()));
                if (f3622q == null) {
                    Method declaredMethod3 = f3620k.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f3622q = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f3622q.invoke(objInvoke, Long.valueOf(eqxtVar.m2607g()));
                if (eqxtVar.m2610q() < Integer.MAX_VALUE) {
                    if (f3621n == null) {
                        Method declaredMethod4 = f3620k.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f3621n = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f3621n.invoke(objInvoke, Integer.valueOf(eqxtVar.m2610q()));
                }
                if (eqxtVar.m2608k() < Long.MAX_VALUE) {
                    if (f3619g == null) {
                        Method declaredMethod5 = f3620k.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f3619g = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f3619g.invoke(objInvoke, Long.valueOf(eqxtVar.m2608k()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.eqxt$q */
    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface InterfaceC0553q {
    }

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @hyr(31)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static LocationRequest m2614k(eqxt eqxtVar) {
            return new Object(eqxtVar.toq()) { // from class: android.location.LocationRequest.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(long j2) {
                }

                @NonNull
                public native /* synthetic */ LocationRequest build();

                @NonNull
                public native /* synthetic */ Builder setDurationMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdateDelayMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdates(int i2);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateDistanceMeters(float f2);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateIntervalMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setQuality(int i2);
            }.setQuality(eqxtVar.f7l8()).setMinUpdateIntervalMillis(eqxtVar.m2607g()).setDurationMillis(eqxtVar.m2608k()).setMaxUpdates(eqxtVar.m2610q()).setMinUpdateDistanceMeters(eqxtVar.m2609n()).setMaxUpdateDelayMillis(eqxtVar.zy()).build();
        }
    }

    eqxt(long j2, int i2, long j3, int i3, long j4, float f2, long j5) {
        this.f50498toq = j2;
        this.f3616k = i2;
        this.f50499zy = j4;
        this.f3618q = j3;
        this.f3617n = i3;
        this.f3615g = f2;
        this.f50497f7l8 = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqxt)) {
            return false;
        }
        eqxt eqxtVar = (eqxt) obj;
        return this.f3616k == eqxtVar.f3616k && this.f50498toq == eqxtVar.f50498toq && this.f50499zy == eqxtVar.f50499zy && this.f3618q == eqxtVar.f3618q && this.f3617n == eqxtVar.f3617n && Float.compare(eqxtVar.f3615g, this.f3615g) == 0 && this.f50497f7l8 == eqxtVar.f50497f7l8;
    }

    public int f7l8() {
        return this.f3616k;
    }

    @zy.a9(from = 0)
    /* JADX INFO: renamed from: g */
    public long m2607g() {
        long j2 = this.f50499zy;
        return j2 == -1 ? this.f50498toq : j2;
    }

    public int hashCode() {
        int i2 = this.f3616k * 31;
        long j2 = this.f50498toq;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f50499zy;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    @zy.a9(from = 1)
    /* JADX INFO: renamed from: k */
    public long m2608k() {
        return this.f3618q;
    }

    @zy.zurt(from = 0.0d, to = 3.4028234663852886E38d)
    /* JADX INFO: renamed from: n */
    public float m2609n() {
        return this.f3615g;
    }

    @zy.a9(from = 1, to = 2147483647L)
    /* JADX INFO: renamed from: q */
    public int m2610q() {
        return this.f3617n;
    }

    @hyr(19)
    @SuppressLint({"NewApi"})
    @dd
    /* JADX INFO: renamed from: s */
    public LocationRequest m2611s(@lvui String str) {
        return Build.VERSION.SDK_INT >= 31 ? m2612y() : (LocationRequest) C0552k.m2613k(this, str);
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f50498toq != Long.MAX_VALUE) {
            sb.append("@");
            androidx.core.util.fu4.m2944n(this.f50498toq, sb);
            int i2 = this.f3616k;
            if (i2 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i2 == 102) {
                sb.append(" BALANCED");
            } else if (i2 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f3618q != Long.MAX_VALUE) {
            sb.append(", duration=");
            androidx.core.util.fu4.m2944n(this.f3618q, sb);
        }
        if (this.f3617n != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f3617n);
        }
        long j2 = this.f50499zy;
        if (j2 != -1 && j2 < this.f50498toq) {
            sb.append(", minUpdateInterval=");
            androidx.core.util.fu4.m2944n(this.f50499zy, sb);
        }
        if (this.f3615g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f3615g);
        }
        if (this.f50497f7l8 / 2 > this.f50498toq) {
            sb.append(", maxUpdateDelay=");
            androidx.core.util.fu4.m2944n(this.f50497f7l8, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    @zy.a9(from = 0)
    public long toq() {
        return this.f50498toq;
    }

    @hyr(31)
    @lvui
    /* JADX INFO: renamed from: y */
    public LocationRequest m2612y() {
        return toq.m2614k(this);
    }

    @zy.a9(from = 0)
    public long zy() {
        return this.f50497f7l8;
    }

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    public static final class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f50502f7l8;

        /* JADX INFO: renamed from: g */
        private float f3623g;

        /* JADX INFO: renamed from: k */
        private long f3624k;

        /* JADX INFO: renamed from: n */
        private long f3625n;

        /* JADX INFO: renamed from: q */
        private int f3626q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50503toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f50504zy;

        public zy(long j2) {
            m2618q(j2);
            this.f50503toq = 102;
            this.f50504zy = Long.MAX_VALUE;
            this.f3626q = Integer.MAX_VALUE;
            this.f3625n = -1L;
            this.f3623g = 0.0f;
            this.f50502f7l8 = 0L;
        }

        @lvui
        public zy f7l8(@zy.zurt(from = 0.0d, to = 3.4028234663852886E38d) float f2) {
            this.f3623g = f2;
            this.f3623g = androidx.core.util.n7h.m2973g(f2, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public zy m2615g(@zy.a9(from = 1, to = 2147483647L) int i2) {
            this.f3626q = androidx.core.util.n7h.f7l8(i2, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public eqxt m2616k() {
            androidx.core.util.n7h.kja0((this.f3624k == Long.MAX_VALUE && this.f3625n == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j2 = this.f3624k;
            return new eqxt(j2, this.f50503toq, this.f50504zy, this.f3626q, Math.min(this.f3625n, j2), this.f3623g, this.f50502f7l8);
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public zy m2617n(@zy.a9(from = 0) long j2) {
            this.f50502f7l8 = j2;
            this.f50502f7l8 = androidx.core.util.n7h.m2980y(j2, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public zy m2618q(@zy.a9(from = 0) long j2) {
            this.f3624k = androidx.core.util.n7h.m2980y(j2, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: s */
        public zy m2619s(int i2) {
            androidx.core.util.n7h.zy(i2 == 104 || i2 == 102 || i2 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i2));
            this.f50503toq = i2;
            return this;
        }

        @lvui
        public zy toq() {
            this.f3625n = -1L;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: y */
        public zy m2620y(@zy.a9(from = 0) long j2) {
            this.f3625n = androidx.core.util.n7h.m2980y(j2, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @lvui
        public zy zy(@zy.a9(from = 1) long j2) {
            this.f50504zy = androidx.core.util.n7h.m2980y(j2, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public zy(@lvui eqxt eqxtVar) {
            this.f3624k = eqxtVar.f50498toq;
            this.f50503toq = eqxtVar.f3616k;
            this.f50504zy = eqxtVar.f3618q;
            this.f3626q = eqxtVar.f3617n;
            this.f3625n = eqxtVar.f50499zy;
            this.f3623g = eqxtVar.f3615g;
            this.f50502f7l8 = eqxtVar.f50497f7l8;
        }
    }
}
