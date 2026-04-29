package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.graphics.t */
/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(24)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class C0544t extends fti {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50484f7l8 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: g */
    private static final String f3587g = "addFontWeightStyle";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Method f50485ld6;

    /* JADX INFO: renamed from: n */
    private static final String f3588n = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: p */
    private static final Method f3589p;

    /* JADX INFO: renamed from: q */
    private static final String f3590q = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: s */
    private static final Constructor<?> f3591s;

    /* JADX INFO: renamed from: y */
    private static final Class<?> f3592y;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f3588n);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(f3587g, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(f50484f7l8, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(f3590q, e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f3591s = constructor;
        f3592y = cls;
        f3589p = method2;
        f50485ld6 = method;
    }

    C0544t() {
    }

    private static boolean ld6(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f3589p.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Object n7h() {
        try {
            return f3591s.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean qrj() {
        Method method = f3589p;
        if (method == null) {
            Log.w(f3590q, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Typeface x2(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f3592y, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f50485ld6.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.fti
    @dd
    public Typeface toq(Context context, C0500g.q qVar, Resources resources, int i2) {
        Object objN7h = n7h();
        if (objN7h == null) {
            return null;
        }
        for (C0500g.n nVar : qVar.m2284k()) {
            ByteBuffer qVar2 = jp0y.toq(context, resources, nVar.toq());
            if (qVar2 == null || !ld6(objN7h, qVar2, nVar.zy(), nVar.m2282n(), nVar.m2280g())) {
                return null;
            }
        }
        return x2(objN7h);
    }

    @Override // androidx.core.graphics.fti
    @dd
    public Typeface zy(Context context, @dd CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) {
        Object objN7h = n7h();
        if (objN7h == null) {
            return null;
        }
        androidx.collection.qrj qrjVar = new androidx.collection.qrj();
        for (C0605y.zy zyVar : zyVarArr) {
            Uri uriM2823q = zyVar.m2823q();
            ByteBuffer byteBufferM2489g = (ByteBuffer) qrjVar.get(uriM2823q);
            if (byteBufferM2489g == null) {
                byteBufferM2489g = jp0y.m2489g(context, cancellationSignal, uriM2823q);
                qrjVar.put(uriM2823q, byteBufferM2489g);
            }
            if (byteBufferM2489g == null || !ld6(objN7h, byteBufferM2489g, zyVar.zy(), zyVar.m2822n(), zyVar.m2821g())) {
                return null;
            }
        }
        Typeface typefaceX2 = x2(objN7h);
        if (typefaceX2 == null) {
            return null;
        }
        return Typeface.create(typefaceX2, i2);
    }
}
