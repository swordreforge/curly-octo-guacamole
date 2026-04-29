package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.network.C1482y;
import com.airbnb.lottie.network.InterfaceC1477g;
import com.airbnb.lottie.network.InterfaceC1479n;
import java.io.File;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.n */
/* JADX INFO: compiled from: L.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public class C1476n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f56116f7l8 = 0;

    /* JADX INFO: renamed from: g */
    private static long[] f8105g = null;

    /* JADX INFO: renamed from: k */
    public static boolean f8106k = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static volatile C1482y f56117ld6 = null;

    /* JADX INFO: renamed from: n */
    private static String[] f8107n = null;

    /* JADX INFO: renamed from: p */
    private static InterfaceC1479n f8108p = null;

    /* JADX INFO: renamed from: q */
    private static boolean f8109q = false;

    /* JADX INFO: renamed from: s */
    private static InterfaceC1477g f8110s = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f56118toq = "LOTTIE";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.f7l8 f56119x2 = null;

    /* JADX INFO: renamed from: y */
    private static int f8111y = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f56120zy = 20;

    /* JADX INFO: renamed from: com.airbnb.lottie.n$k */
    /* JADX INFO: compiled from: L.java */
    class k implements InterfaceC1479n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f8112k;

        k(Context context) {
            this.f8112k = context;
        }

        @Override // com.airbnb.lottie.network.InterfaceC1479n
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public File mo5962k() {
            return new File(this.f8112k.getCacheDir(), "lottie_network_cache");
        }
    }

    private C1476n() {
    }

    public static void f7l8(boolean z2) {
        if (f8109q == z2) {
            return;
        }
        f8109q = z2;
        if (z2) {
            f8107n = new String[20];
            f8105g = new long[20];
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6102g(InterfaceC1477g interfaceC1477g) {
        f8110s = interfaceC1477g;
    }

    /* JADX INFO: renamed from: k */
    public static void m6103k(String str) {
        if (f8109q) {
            int i2 = f56116f7l8;
            if (i2 == 20) {
                f8111y++;
                return;
            }
            f8107n[i2] = str;
            f8105g[i2] = System.nanoTime();
            androidx.core.os.zurt.toq(str);
            f56116f7l8++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6104n(InterfaceC1479n interfaceC1479n) {
        f8108p = interfaceC1479n;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static C1482y m6105q(@zy.lvui Context context) {
        C1482y c1482y = f56117ld6;
        if (c1482y == null) {
            synchronized (C1482y.class) {
                c1482y = f56117ld6;
                if (c1482y == null) {
                    com.airbnb.lottie.network.f7l8 f7l8VarZy = zy(context);
                    InterfaceC1477g toqVar = f8110s;
                    if (toqVar == null) {
                        toqVar = new com.airbnb.lottie.network.toq();
                    }
                    c1482y = new C1482y(f7l8VarZy, toqVar);
                    f56117ld6 = c1482y;
                }
            }
        }
        return c1482y;
    }

    public static float toq(String str) {
        int i2 = f8111y;
        if (i2 > 0) {
            f8111y = i2 - 1;
            return 0.0f;
        }
        if (!f8109q) {
            return 0.0f;
        }
        int i3 = f56116f7l8 - 1;
        f56116f7l8 = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f8107n[i3])) {
            androidx.core.os.zurt.m2775q();
            return (System.nanoTime() - f8105g[f56116f7l8]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f8107n[f56116f7l8] + ".");
    }

    @zy.lvui
    public static com.airbnb.lottie.network.f7l8 zy(@zy.lvui Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f7l8 f7l8Var = f56119x2;
        if (f7l8Var == null) {
            synchronized (com.airbnb.lottie.network.f7l8.class) {
                f7l8Var = f56119x2;
                if (f7l8Var == null) {
                    InterfaceC1479n kVar = f8108p;
                    if (kVar == null) {
                        kVar = new k(applicationContext);
                    }
                    f7l8Var = new com.airbnb.lottie.network.f7l8(kVar);
                    f56119x2 = f7l8Var;
                }
            }
        }
        return f7l8Var;
    }
}
