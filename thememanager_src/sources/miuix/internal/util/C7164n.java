package miuix.internal.util;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import zy.dd;

/* JADX INFO: renamed from: miuix.internal.util.n */
/* JADX INFO: compiled from: AttributeResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7164n {

    /* JADX INFO: renamed from: k */
    private static final TypedValue f40376k = new TypedValue();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f87764toq = new ThreadLocal<>();

    protected C7164n() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static float f7l8(Context context, int i2) {
        TypedValue typedValueX2 = x2(context, i2);
        if (typedValueX2 != null && typedValueX2.type == 5) {
            return typedValueX2.resourceId > 0 ? context.getResources().getDimension(typedValueX2.resourceId) : TypedValue.complexToDimension(typedValueX2.data, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public static int m25947g(Context context, int i2, int i3) {
        Integer qVar = toq(context, i2);
        return qVar != null ? qVar.intValue() : i3;
    }

    /* JADX INFO: renamed from: k */
    private static TypedValue m25948k(Context context) {
        if (context.getMainLooper().getThread() == Thread.currentThread()) {
            return f40376k;
        }
        ThreadLocal<TypedValue> threadLocal = f87764toq;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int ld6(Context context, int i2, int i3) {
        int i4;
        TypedValue typedValueM25948k = m25948k(context);
        return (!context.getTheme().resolveAttribute(i2, typedValueM25948k, true) || (i4 = typedValueM25948k.type) < 16 || i4 > 31) ? i3 : typedValueM25948k.data;
    }

    /* JADX INFO: renamed from: n */
    public static int m25949n(Context context, int i2) {
        Integer qVar = toq(context, i2);
        return qVar != null ? qVar.intValue() : context.getResources().getColor(-1);
    }

    /* JADX INFO: renamed from: p */
    public static float m25950p(Context context, int i2, float f2) {
        TypedValue typedValueM25948k = m25948k(context);
        return (context.getTheme().resolveAttribute(i2, typedValueM25948k, true) && typedValueM25948k.type == 4) ? typedValueM25948k.data : f2;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m25951q(Context context, int i2, boolean z2) {
        TypedValue typedValueM25948k = m25948k(context);
        return context.getTheme().resolveAttribute(i2, typedValueM25948k, true) ? typedValueM25948k.type == 18 && typedValueM25948k.data != 0 : z2;
    }

    /* JADX INFO: renamed from: s */
    public static Drawable m25952s(Context context, int i2) {
        TypedValue typedValueM25948k = m25948k(context);
        if (!context.getTheme().resolveAttribute(i2, typedValueM25948k, true)) {
            return null;
        }
        if (typedValueM25948k.resourceId > 0) {
            return context.getResources().getDrawable(typedValueM25948k.resourceId, context.getTheme());
        }
        int i3 = typedValueM25948k.type;
        if (i3 < 28 || i3 > 31) {
            return null;
        }
        return new ColorDrawable(typedValueM25948k.data);
    }

    private static Integer toq(Context context, int i2) {
        TypedValue typedValueM25948k = m25948k(context);
        if (!context.getTheme().resolveAttribute(i2, typedValueM25948k, true)) {
            return null;
        }
        if (typedValueM25948k.resourceId > 0) {
            return Integer.valueOf(context.getResources().getColor(typedValueM25948k.resourceId));
        }
        int i3 = typedValueM25948k.type;
        if (i3 < 28 || i3 > 31) {
            return null;
        }
        return Integer.valueOf(typedValueM25948k.data);
    }

    @dd
    public static TypedValue x2(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static int m25953y(Context context, int i2) {
        TypedValue typedValueX2 = x2(context, i2);
        if (typedValueX2 != null && typedValueX2.type == 5) {
            return typedValueX2.resourceId > 0 ? context.getResources().getDimensionPixelSize(typedValueX2.resourceId) : TypedValue.complexToDimensionPixelSize(typedValueX2.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static int zy(Context context, int i2) {
        TypedValue typedValueM25948k = m25948k(context);
        if (context.getTheme().resolveAttribute(i2, typedValueM25948k, true)) {
            return typedValueM25948k.resourceId;
        }
        return -1;
    }
}
