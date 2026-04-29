package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.core.view.h */
/* JADX INFO: compiled from: LayoutInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0690h {

    /* JADX INFO: renamed from: k */
    private static final String f4033k = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Field f50819toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f50820zy;

    /* JADX INFO: renamed from: androidx.core.view.h$k */
    /* JADX INFO: compiled from: LayoutInflaterCompat.java */
    static class k implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: k */
        final cdj f4034k;

        k(cdj cdjVar) {
            this.f4034k = cdjVar;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f4034k.onCreateView(null, str, context, attributeSet);
        }

        @zy.lvui
        public String toString() {
            return getClass().getName() + "{" + this.f4034k + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f4034k.onCreateView(view, str, context, attributeSet);
        }
    }

    private C0690h() {
    }

    /* JADX INFO: renamed from: k */
    private static void m3308k(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f50820zy) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f50819toq = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f4033k, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e2);
            }
            f50820zy = true;
        }
        Field field = f50819toq;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e(f4033k, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3309q(@zy.lvui LayoutInflater layoutInflater, @zy.lvui LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }

    @Deprecated
    public static cdj toq(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof k) {
            return ((k) factory).f4034k;
        }
        return null;
    }

    @Deprecated
    public static void zy(@zy.lvui LayoutInflater layoutInflater, @zy.lvui cdj cdjVar) {
        layoutInflater.setFactory2(new k(cdjVar));
    }
}
