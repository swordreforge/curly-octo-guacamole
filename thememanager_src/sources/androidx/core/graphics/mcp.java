package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(26)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class mcp extends wvg {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f50466fn3e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f50467fu4 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: i */
    private static final String f3576i = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f50468ni7 = "addFontFromBuffer";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f50469o1t = "abortCreation";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f50470wvg = -1;

    /* JADX INFO: renamed from: z */
    private static final String f3577z = "freeze";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f50471zurt = "addFontFromAssetManager";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected final Method f50472cdj;

    /* JADX INFO: renamed from: h */
    protected final Method f3578h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected final Method f50473ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected final Method f50474kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected final Constructor<?> f50475n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected final Class<?> f50476qrj;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected final Method f50477t8r;

    public mcp() throws NoSuchMethodException {
        Method methodFu4;
        Constructor<?> constructorO1t;
        Method methodZurt;
        Method methodNi7;
        Method methodWvg;
        Method methodFn3e;
        Class<?> cls = null;
        try {
            Class<?> clsM2509z = m2509z();
            constructorO1t = o1t(clsM2509z);
            methodZurt = zurt(clsM2509z);
            methodNi7 = ni7(clsM2509z);
            methodWvg = wvg(clsM2509z);
            methodFn3e = fn3e(clsM2509z);
            methodFu4 = fu4(clsM2509z);
            cls = clsM2509z;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(f3576i, "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            methodFu4 = null;
            constructorO1t = null;
            methodZurt = null;
            methodNi7 = null;
            methodWvg = null;
            methodFn3e = null;
        }
        this.f50476qrj = cls;
        this.f50475n7h = constructorO1t;
        this.f50474kja0 = methodZurt;
        this.f3578h = methodNi7;
        this.f50472cdj = methodWvg;
        this.f50473ki = methodFn3e;
        this.f50477t8r = methodFu4;
    }

    private boolean cdj(Context context, Object obj, String str, int i2, int i3, int i4, @dd FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f50474kja0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2507h(Object obj) {
        try {
            this.f50473ki.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m2508i() {
        if (this.f50474kja0 == null) {
            Log.w(f3576i, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f50474kja0 != null;
    }

    private boolean ki(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f3578h.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @dd
    private Object kja0() {
        try {
            return this.f50475n7h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean t8r(Object obj) {
        try {
            return ((Boolean) this.f50472cdj.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Method fn3e(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f50469o1t, new Class[0]);
    }

    protected Method fu4(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f50467fu4, Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.fti
    @dd
    /* JADX INFO: renamed from: n */
    public Typeface mo2384n(Context context, Resources resources, int i2, String str, int i3) {
        if (!m2508i()) {
            return super.mo2384n(context, resources, i2, str, i3);
        }
        Object objKja0 = kja0();
        if (objKja0 == null) {
            return null;
        }
        if (!cdj(context, objKja0, str, 0, -1, -1, null)) {
            m2507h(objKja0);
            return null;
        }
        if (t8r(objKja0)) {
            return x2(objKja0);
        }
        return null;
    }

    protected Method ni7(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f50468ni7, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Constructor<?> o1t(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    @Override // androidx.core.graphics.wvg, androidx.core.graphics.fti
    @dd
    public Typeface toq(Context context, C0500g.q qVar, Resources resources, int i2) {
        if (!m2508i()) {
            return super.toq(context, qVar, resources, i2);
        }
        Object objKja0 = kja0();
        if (objKja0 == null) {
            return null;
        }
        for (C0500g.n nVar : qVar.m2284k()) {
            if (!cdj(context, objKja0, nVar.m2281k(), nVar.zy(), nVar.m2282n(), nVar.m2280g() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(nVar.m2283q()))) {
                m2507h(objKja0);
                return null;
            }
        }
        if (t8r(objKja0)) {
            return x2(objKja0);
        }
        return null;
    }

    protected Method wvg(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f3577z, new Class[0]);
    }

    @dd
    protected Typeface x2(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f50476qrj, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f50477t8r.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    protected Class<?> m2509z() throws ClassNotFoundException {
        return Class.forName(f50466fn3e);
    }

    protected Method zurt(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(f50471zurt, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.wvg, androidx.core.graphics.fti
    @dd
    public Typeface zy(Context context, @dd CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) {
        Typeface typefaceX2;
        if (zyVarArr.length < 1) {
            return null;
        }
        if (!m2508i()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(zyVarMo2386y.m2822n()).setItalic(zyVarMo2386y.m2821g()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM2493y = jp0y.m2493y(context, zyVarArr, cancellationSignal);
        Object objKja0 = kja0();
        if (objKja0 == null) {
            return null;
        }
        boolean z2 = false;
        for (C0605y.zy zyVar : zyVarArr) {
            ByteBuffer byteBuffer = mapM2493y.get(zyVar.m2823q());
            if (byteBuffer != null) {
                if (!ki(objKja0, byteBuffer, zyVar.zy(), zyVar.m2822n(), zyVar.m2821g() ? 1 : 0)) {
                    m2507h(objKja0);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m2507h(objKja0);
            return null;
        }
        if (t8r(objKja0) && (typefaceX2 = x2(objKja0)) != null) {
            return Typeface.create(typefaceX2, i2);
        }
        return null;
    }
}
