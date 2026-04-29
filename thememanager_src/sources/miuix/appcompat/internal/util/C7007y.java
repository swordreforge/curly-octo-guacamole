package miuix.appcompat.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseArray;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: miuix.appcompat.internal.util.y */
/* JADX INFO: compiled from: SinglePopControl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7007y {

    /* JADX INFO: renamed from: k */
    private static SparseArray<WeakReference<Object>> f39348k = new SparseArray<>();

    /* JADX INFO: renamed from: k */
    private static Activity m25245k(Context context) {
        Activity activity = null;
        while (activity == null && context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return activity;
    }

    /* JADX INFO: renamed from: n */
    public static void m25246n(Context context, Object obj) {
        Object obj2;
        int qVar = toq(context);
        if (f39348k.get(qVar) != null && (obj2 = f39348k.get(qVar).get()) != null && obj2 != obj) {
            zy(obj2);
        }
        f39348k.put(qVar, new WeakReference<>(obj));
    }

    /* JADX INFO: renamed from: q */
    public static void m25247q(Context context, Object obj) {
        f39348k.remove(toq(context));
    }

    private static int toq(Context context) {
        Activity activityM25245k = m25245k(context);
        return activityM25245k != null ? activityM25245k.hashCode() : context.hashCode();
    }

    private static void zy(Object obj) {
        if (obj instanceof PopupWindow) {
            PopupWindow popupWindow = (PopupWindow) obj;
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        }
    }
}
