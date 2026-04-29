package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class fti {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50459toq = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f50460zy = 0;

    /* JADX INFO: renamed from: k */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, C0500g.q> f3562k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: androidx.core.graphics.fti$k */
    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    class C0530k implements zy<C0605y.zy> {
        C0530k() {
        }

        @Override // androidx.core.graphics.fti.zy
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo2473k(C0605y.zy zyVar) {
            return zyVar.m2821g();
        }

        @Override // androidx.core.graphics.fti.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public int toq(C0605y.zy zyVar) {
            return zyVar.m2822n();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    class toq implements zy<C0500g.n> {
        toq() {
        }

        @Override // androidx.core.graphics.fti.zy
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo2473k(C0500g.n nVar) {
            return nVar.m2280g();
        }

        @Override // androidx.core.graphics.fti.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public int toq(C0500g.n nVar) {
            return nVar.m2282n();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    private interface zy<T> {
        /* JADX INFO: renamed from: k */
        boolean mo2473k(T t2);

        int toq(T t2);
    }

    fti() {
    }

    private static <T> T f7l8(T[] tArr, int i2, zy<T> zyVar) {
        int i3 = (i2 & 1) == 0 ? 400 : zurt.InterfaceC0294y.f1767p;
        boolean z2 = (i2 & 2) != 0;
        T t2 = null;
        int i4 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int iAbs = (Math.abs(zyVar.toq(t3) - i3) * 2) + (zyVar.mo2473k(t3) == z2 ? 0 : 1);
            if (t2 == null || i4 > iAbs) {
                t2 = t3;
                i4 = iAbs;
            }
        }
        return t2;
    }

    /* JADX INFO: renamed from: g */
    private C0500g.n m2469g(C0500g.q qVar, int i2) {
        return (C0500g.n) f7l8(qVar.m2284k(), i2, new toq());
    }

    /* JADX INFO: renamed from: k */
    private void m2470k(Typeface typeface, C0500g.q qVar) {
        long jM2471p = m2471p(typeface);
        if (jM2471p != 0) {
            this.f3562k.put(Long.valueOf(jM2471p), qVar);
        }
    }

    /* JADX INFO: renamed from: p */
    private static long m2471p(@dd Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e(f50459toq, "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e(f50459toq, "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    public Typeface mo2384n(Context context, Resources resources, int i2, String str, int i3) {
        File fileM2491n = jp0y.m2491n(context);
        if (fileM2491n == null) {
            return null;
        }
        try {
            if (jp0y.zy(fileM2491n, resources, i2)) {
                return Typeface.createFromFile(fileM2491n.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2491n.delete();
        }
    }

    /* JADX INFO: renamed from: q */
    protected Typeface mo2385q(Context context, InputStream inputStream) {
        File fileM2491n = jp0y.m2491n(context);
        if (fileM2491n == null) {
            return null;
        }
        try {
            if (jp0y.m2492q(fileM2491n, inputStream)) {
                return Typeface.createFromFile(fileM2491n.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2491n.delete();
        }
    }

    @dd
    /* JADX INFO: renamed from: s */
    C0500g.q m2472s(Typeface typeface) {
        long jM2471p = m2471p(typeface);
        if (jM2471p == 0) {
            return null;
        }
        return this.f3562k.get(Long.valueOf(jM2471p));
    }

    @dd
    public Typeface toq(Context context, C0500g.q qVar, Resources resources, int i2) {
        C0500g.n nVarM2469g = m2469g(qVar, i2);
        if (nVarM2469g == null) {
            return null;
        }
        Typeface typefaceF7l8 = o1t.f7l8(context, resources, nVarM2469g.toq(), nVarM2469g.m2281k(), 0, i2);
        m2470k(typefaceF7l8, qVar);
        return typefaceF7l8;
    }

    /* JADX INFO: renamed from: y */
    protected C0605y.zy mo2386y(C0605y.zy[] zyVarArr, int i2) {
        return (C0605y.zy) f7l8(zyVarArr, i2, new C0530k());
    }

    @dd
    public Typeface zy(Context context, @dd CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (zyVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mo2386y(zyVarArr, i2).m2823q());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceMo2385q = mo2385q(context, inputStreamOpenInputStream);
            jp0y.m2490k(inputStreamOpenInputStream);
            return typefaceMo2385q;
        } catch (IOException unused2) {
            jp0y.m2490k(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            jp0y.m2490k(inputStream);
            throw th;
        }
    }
}
