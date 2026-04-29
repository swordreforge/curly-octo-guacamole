package miuix.core.util;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.concurrent.ConcurrentHashMap;
import miuix.view.C7389y;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: miuix.core.util.q */
/* JADX INFO: compiled from: EnvStateManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7085q {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static C7389y f87364toq;

    /* JADX INFO: renamed from: k */
    static final Point f39886k = new Point(-1, -1);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final ConcurrentHashMap<Integer, t8r> f87365zy = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: q */
    static final Object f39889q = new Object();

    /* JADX INFO: renamed from: n */
    static final Object f39887n = new Object();

    /* JADX INFO: renamed from: g */
    static final Object f39885g = new Object();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static volatile Boolean f87362f7l8 = null;

    /* JADX INFO: renamed from: y */
    static volatile int f39891y = -1;

    /* JADX INFO: renamed from: s */
    static volatile int f39890s = -1;

    /* JADX INFO: renamed from: p */
    static volatile int f39888p = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static volatile int f87363ld6 = -1;

    public static void a9(Configuration configuration, t8r t8rVar) {
        m25603k(configuration);
        int i2 = configuration.densityDpi;
        float f2 = i2 / 160.0f;
        float f3 = (f87364toq.f42313q * 1.0f) / i2;
        t8rVar.f39905n = f2;
        float f4 = f2 * f3;
        t8rVar.f87381zy.set(ld6.zy(f4, configuration.screenWidthDp), ld6.zy(f4, configuration.screenHeightDp));
        t8rVar.f39906q.set((int) (configuration.screenWidthDp * f3), (int) (configuration.screenHeightDp * f3));
        Point point = t8rVar.f39906q;
        t8rVar.f39903g = z4j7.toq.zy(point.x, point.y);
        t8rVar.f39904k = false;
    }

    public static boolean cdj(Context context) {
        return C7079h.m25550q(toq(context).f87379f7l8);
    }

    public static int f7l8(Context context) {
        m25603k(context.getResources().getConfiguration());
        return (int) (r2.smallestScreenWidthDp * ((f87364toq.f42313q * 1.0f) / r2.densityDpi));
    }

    public static void fn3e(@lvui Point point) {
        if (point.x == -1 && point.y == -1) {
            return;
        }
        point.x = -1;
        point.y = -1;
    }

    public static void fu4(Context context) {
        f87365zy.remove(Integer.valueOf(context.getResources().hashCode()));
    }

    /* JADX INFO: renamed from: g */
    public static Point m25600g(Context context) {
        Point point = f39886k;
        if (t8r(point)) {
            wvg(C7080i.x2(context), context);
        }
        return point;
    }

    /* JADX INFO: renamed from: h */
    public static void m25601h(Application application) {
        f87364toq = new C7389y(application.getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: i */
    public static void m25602i(Context context) {
        Point point = f39886k;
        synchronized (point) {
            fn3e(point);
        }
        synchronized (f39889q) {
            f87362f7l8 = null;
        }
        synchronized (f39885g) {
            f39888p = -1;
            f87363ld6 = -1;
        }
        synchronized (f39887n) {
            f39891y = -1;
            f39890s = -1;
        }
    }

    public static void jk(Context context, t8r t8rVar) {
        C7080i.kja0(context, t8rVar.f87381zy);
        float f2 = context.getResources().getConfiguration().densityDpi / 160.0f;
        t8rVar.f39905n = f2;
        t8rVar.f39906q.set(ld6.m25577i(f2, t8rVar.f87381zy.x), ld6.m25577i(f2, t8rVar.f87381zy.y));
        Point point = t8rVar.f39906q;
        t8rVar.f39903g = z4j7.toq.zy(point.x, point.y);
        t8rVar.f39904k = false;
    }

    /* JADX INFO: renamed from: k */
    private static void m25603k(Configuration configuration) {
        if (f87364toq == null) {
            f87364toq = new C7389y(configuration);
        }
    }

    public static boolean ki(Context context) {
        if (f87362f7l8 == null) {
            synchronized (f39889q) {
                if (f87362f7l8 == null) {
                    f87362f7l8 = Boolean.valueOf(ld6.n7h(context));
                }
            }
        }
        return f87362f7l8.booleanValue();
    }

    public static Point kja0(Context context, Configuration configuration) {
        t8r qVar = toq(context);
        if (qVar.f39904k) {
            m25603k(configuration);
            C7080i.m25552h(configuration, f87364toq.f42313q, qVar.f87381zy);
            qVar.f39904k = false;
        }
        return qVar.f87381zy;
    }

    public static t8r ld6(Context context, @dd Configuration configuration, boolean z2) {
        t8r qVar = toq(context);
        m25608t(context, qVar, configuration, z2);
        return qVar;
    }

    public static void mcp(Context context, t8r t8rVar) {
        if (t8rVar.f39904k) {
            jk(context, t8rVar);
        }
        C7079h.m25548k(context, t8rVar, m25600g(context));
        t8rVar.f87380toq = false;
    }

    /* JADX INFO: renamed from: n */
    public static int m25604n(Context context) {
        Point pointM25600g = m25600g(context);
        return Math.min(pointM25600g.x, pointM25600g.y);
    }

    public static Point n7h(Context context) {
        t8r qVar = toq(context);
        if (qVar.f39904k) {
            jk(context, qVar);
        }
        return qVar.f87381zy;
    }

    public static void ni7(t8r t8rVar) {
        t8rVar.f87380toq = true;
        t8rVar.f39904k = true;
    }

    public static void o1t(WindowManager windowManager, Context context) {
        Point point = f39886k;
        synchronized (point) {
            C7080i.m25557q(windowManager, context, point, n7h(context));
        }
    }

    /* JADX INFO: renamed from: p */
    public static t8r m25605p(Context context, Configuration configuration) {
        return ld6(context, configuration, false);
    }

    /* JADX INFO: renamed from: q */
    public static int m25606q(Context context, boolean z2) {
        if (f39888p == -1) {
            synchronized (f39885g) {
                if (f39888p == -1) {
                    f39888p = ld6.f7l8(context);
                    f87363ld6 = (int) (f39888p / (context.getResources().getConfiguration().densityDpi / 160.0f));
                }
            }
        }
        return z2 ? f87363ld6 : f39888p;
    }

    public static t8r qrj(Context context, @dd Configuration configuration) {
        t8r t8rVarZy = zy(context, false);
        m25608t(context, t8rVarZy, configuration, false);
        return t8rVarZy;
    }

    /* JADX INFO: renamed from: s */
    public static t8r m25607s(Context context) {
        return ld6(context, null, false);
    }

    /* JADX INFO: renamed from: t */
    public static void m25608t(Context context, t8r t8rVar, @dd Configuration configuration, boolean z2) {
        if (t8rVar == null) {
            return;
        }
        if (t8rVar.f39904k || z2) {
            if (configuration != null) {
                a9(configuration, t8rVar);
            } else {
                jk(context, t8rVar);
            }
        }
        if (t8rVar.f87380toq || z2) {
            mcp(context, t8rVar);
        }
    }

    private static boolean t8r(Point point) {
        return point.x == -1 && point.y == -1;
    }

    private static t8r toq(Context context) {
        return zy(context, true);
    }

    public static void wvg(WindowManager windowManager, Context context) {
        Point point = f39886k;
        synchronized (point) {
            C7080i.m25559y(windowManager, context, point);
        }
    }

    public static t8r x2(Context context) {
        return qrj(context, null);
    }

    /* JADX INFO: renamed from: y */
    public static int m25609y(Context context, boolean z2) {
        if (f39891y == -1) {
            synchronized (f39887n) {
                if (f39891y == -1) {
                    f39891y = ld6.ld6(context);
                    f39890s = (int) (f39891y / (context.getResources().getConfiguration().densityDpi / 160.0f));
                }
            }
        }
        return z2 ? f39890s : f39891y;
    }

    /* JADX INFO: renamed from: z */
    public static void m25610z(C7389y c7389y) {
        f87364toq = c7389y;
    }

    public static synchronized void zurt(Context context) {
        ni7(toq(context));
    }

    private static t8r zy(Context context, boolean z2) {
        int iHashCode = context.getResources().hashCode();
        ConcurrentHashMap<Integer, t8r> concurrentHashMap = f87365zy;
        t8r t8rVar = concurrentHashMap.get(Integer.valueOf(iHashCode));
        if (t8rVar == null) {
            t8rVar = new t8r();
            if (z2) {
                concurrentHashMap.put(Integer.valueOf(iHashCode), t8rVar);
            }
        }
        return t8rVar;
    }
}
