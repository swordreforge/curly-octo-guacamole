package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class wvg extends fti {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50486f7l8 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: g */
    private static final String f3593g = "addFontWeightStyle";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Method f50487ld6 = null;

    /* JADX INFO: renamed from: n */
    private static final String f3594n = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: p */
    private static Method f3595p = null;

    /* JADX INFO: renamed from: q */
    private static final String f3596q = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: s */
    private static Constructor<?> f3597s = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static boolean f50488x2 = false;

    /* JADX INFO: renamed from: y */
    private static Class<?> f3598y;

    wvg() {
    }

    private static Object kja0() throws NoSuchMethodException {
        n7h();
        try {
            return f3597s.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean ld6(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException {
        n7h();
        try {
            return ((Boolean) f3595p.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void n7h() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f50488x2) {
            return;
        }
        f50488x2 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f3594n);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f3593g, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(f50486f7l8, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(f3596q, e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3597s = constructor;
        f3598y = cls;
        f3595p = method2;
        f50487ld6 = method;
    }

    private File qrj(@lvui ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static Typeface x2(Object obj) throws NoSuchMethodException {
        n7h();
        try {
            Object objNewInstance = Array.newInstance(f3598y, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f50487ld6.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.graphics.fti
    public Typeface toq(Context context, C0500g.q qVar, Resources resources, int i2) throws NoSuchMethodException {
        Object objKja0 = kja0();
        for (C0500g.n nVar : qVar.m2284k()) {
            File fileM2491n = jp0y.m2491n(context);
            if (fileM2491n == null) {
                return null;
            }
            try {
                if (!jp0y.zy(fileM2491n, resources, nVar.toq())) {
                    return null;
                }
                if (!ld6(objKja0, fileM2491n.getPath(), nVar.m2282n(), nVar.m2280g())) {
                    return null;
                }
                fileM2491n.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM2491n.delete();
            }
        }
        return x2(objKja0);
    }

    @Override // androidx.core.graphics.fti
    public Typeface zy(Context context, CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) {
        if (zyVarArr.length < 1) {
            return null;
        }
        C0605y.zy zyVarMo2386y = mo2386y(zyVarArr, i2);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(zyVarMo2386y.m2823q(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileQrj = qrj(parcelFileDescriptorOpenFileDescriptor);
                if (fileQrj != null && fileQrj.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileQrj);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceMo2385q = super.mo2385q(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo2385q;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
