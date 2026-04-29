package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.hyr;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(28)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class jk extends mcp {

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f50461jk = "sans-serif";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f50462mcp = -1;

    /* JADX INFO: renamed from: t */
    private static final String f3570t = "createFromFamiliesWithDefault";

    @Override // androidx.core.graphics.mcp
    protected Method fu4(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f3570t, Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.mcp
    protected Typeface x2(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f50476qrj, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f50477t8r.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
