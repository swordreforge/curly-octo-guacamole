package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0500g;
import androidx.core.content.res.C0506s;
import androidx.core.provider.C0605y;
import zy.dd;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class o1t {

    /* JADX INFO: renamed from: k */
    private static final fti f3580k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final androidx.collection.ld6<String, Typeface> f50480toq;

    /* JADX INFO: renamed from: androidx.core.graphics.o1t$k */
    /* JADX INFO: compiled from: TypefaceCompat.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class C0540k extends C0605y.q {

        /* JADX INFO: renamed from: p */
        @dd
        private C0506s.f7l8 f3581p;

        public C0540k(@dd C0506s.f7l8 f7l8Var) {
            this.f3581p = f7l8Var;
        }

        @Override // androidx.core.provider.C0605y.q
        /* JADX INFO: renamed from: k */
        public void mo2533k(int i2) {
            C0506s.f7l8 f7l8Var = this.f3581p;
            if (f7l8Var != null) {
                f7l8Var.m2335g(i2);
            }
        }

        @Override // androidx.core.provider.C0605y.q
        public void toq(@lvui Typeface typeface) {
            C0506s.f7l8 f7l8Var = this.f3581p;
            if (f7l8Var != null) {
                f7l8Var.f7l8(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3580k = new a9();
        } else if (i2 >= 28) {
            f3580k = new jk();
        } else {
            f3580k = new mcp();
        }
        f50480toq = new androidx.collection.ld6<>(16);
    }

    private o1t() {
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static Typeface f7l8(@lvui Context context, @lvui Resources resources, int i2, String str, int i3, int i4) {
        Typeface typefaceMo2384n = f3580k.mo2384n(context, resources, i2, str, i4);
        if (typefaceMo2384n != null) {
            f50480toq.m840p(m2532y(resources, i2, str, i3, i4), typefaceMo2384n);
        }
        return typefaceMo2384n;
    }

    @Deprecated
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public static Typeface m2526g(@lvui Context context, @lvui Resources resources, int i2, String str, int i3) {
        return f7l8(context, resources, i2, str, 0, i3);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @yz
    /* JADX INFO: renamed from: k */
    public static void m2527k() {
        f50480toq.m841q();
    }

    @dd
    private static Typeface ld6(Context context, Typeface typeface, int i2) {
        fti ftiVar = f3580k;
        C0500g.q qVarM2472s = ftiVar.m2472s(typeface);
        if (qVarM2472s == null) {
            return null;
        }
        return ftiVar.toq(context, qVarM2472s, context.getResources(), i2);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: n */
    public static Typeface m2528n(@lvui Context context, @lvui C0500g.toq toqVar, @lvui Resources resources, int i2, @dd String str, int i3, int i4, @dd C0506s.f7l8 f7l8Var, @dd Handler handler, boolean z2) {
        Typeface qVar;
        if (toqVar instanceof C0500g.g) {
            C0500g.g gVar = (C0500g.g) toqVar;
            Typeface typefaceX2 = x2(gVar.zy());
            if (typefaceX2 != null) {
                if (f7l8Var != null) {
                    f7l8Var.m2338q(typefaceX2, handler);
                }
                return typefaceX2;
            }
            boolean z3 = !z2 ? f7l8Var != null : gVar.m2277k() != 0;
            int iM2278q = z2 ? gVar.m2278q() : -1;
            qVar = C0605y.m2813g(context, gVar.toq(), i4, z3, iM2278q, C0506s.f7l8.m2337n(handler), new C0540k(f7l8Var));
        } else {
            qVar = f3580k.toq(context, (C0500g.q) toqVar, resources, i4);
            if (f7l8Var != null) {
                if (qVar != null) {
                    f7l8Var.m2338q(qVar, handler);
                } else {
                    f7l8Var.zy(-3, handler);
                }
            }
        }
        if (qVar != null) {
            f50480toq.m840p(m2532y(resources, i2, str, i3, i4), qVar);
        }
        return qVar;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: p */
    public static Typeface m2529p(@lvui Resources resources, int i2, @dd String str, int i3, int i4) {
        return f50480toq.m836g(m2532y(resources, i2, str, i3, i4));
    }

    @Deprecated
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public static Typeface m2530q(@lvui Context context, @lvui C0500g.toq toqVar, @lvui Resources resources, int i2, int i3, @dd C0506s.f7l8 f7l8Var, @dd Handler handler, boolean z2) {
        return m2528n(context, toqVar, resources, i2, null, 0, i3, f7l8Var, handler, z2);
    }

    @Deprecated
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public static Typeface m2531s(@lvui Resources resources, int i2, int i3) {
        return m2529p(resources, i2, null, 0, i3);
    }

    @lvui
    public static Typeface toq(@lvui Context context, @dd Typeface typeface, int i2) {
        if (context != null) {
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    private static Typeface x2(@dd String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    /* JADX INFO: renamed from: y */
    private static String m2532y(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static Typeface zy(@lvui Context context, @dd CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) {
        return f3580k.zy(context, cancellationSignal, zyVarArr, i2);
    }
}
