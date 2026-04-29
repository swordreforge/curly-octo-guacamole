package androidx.lifecycle;

import android.app.Application;
import androidx.exifinterface.media.C0846k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6144h;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.uv6;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000\"\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "q", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/lrht;", "", "signature", "zy", "k", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "toq", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, m22787k = 2, mv = {1, 6, 0})
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class hyr {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final List<Class<?>> f5088k = kotlin.collections.ni7.d2ok(Application.class, dd.class);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final List<Class<?>> f51582toq = kotlin.collections.zurt.ld6(dd.class);

    /* JADX INFO: renamed from: q */
    public static final <T extends lrht> T m4444q(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q Constructor<T> constructor, @InterfaceC7396q Object... params) {
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        kotlin.jvm.internal.d2ok.m23075h(constructor, "constructor");
        kotlin.jvm.internal.d2ok.m23075h(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + modelClass, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e4.getCause());
        }
    }

    @InterfaceC7395n
    public static final <T> Constructor<T> zy(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q List<? extends Class<?>> signature) {
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        kotlin.jvm.internal.d2ok.m23075h(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.d2ok.kja0(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.d2ok.kja0(parameterTypes, "constructor.parameterTypes");
            List listVyee = C6144h.vyee(parameterTypes);
            if (kotlin.jvm.internal.d2ok.f7l8(signature, listVyee)) {
                return constructor;
            }
            if (signature.size() == listVyee.size() && listVyee.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }
}
