package miuix.appcompat.internal.view.menu.context;

import android.view.ContextMenu;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ContextMenuHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final Field f39507k = miuix.reflect.toq.m26539q("android.view.View$ListenerInfo", "mOnCreateContextMenuListener");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Method f87007toq = miuix.reflect.toq.m26537n(View.class, "getContextMenuInfo", new Class[0]);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Method f87008zy = miuix.reflect.toq.m26537n(View.class, "onCreateContextMenu", ContextMenu.class);

    /* JADX INFO: renamed from: q */
    private static final Field f39508q = miuix.reflect.toq.zy(View.class, "mListenerInfo");

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static void m25330k(View view, toq toqVar) {
        View.OnCreateContextMenuListener onCreateContextMenuListener;
        ContextMenu.ContextMenuInfo contextMenuInfo = (ContextMenu.ContextMenuInfo) miuix.reflect.toq.ld6(view, f87007toq, new Object[0]);
        toqVar.uv6(contextMenuInfo);
        miuix.reflect.toq.ld6(view, f87008zy, toqVar);
        Object qVar = miuix.reflect.toq.toq(view, f39508q);
        if (qVar != null && (onCreateContextMenuListener = (View.OnCreateContextMenuListener) miuix.reflect.toq.toq(qVar, f39507k)) != null) {
            onCreateContextMenuListener.onCreateContextMenu(toqVar, view, contextMenuInfo);
        }
        toqVar.uv6(null);
        Object parent = view.getParent();
        if (parent instanceof View) {
            m25330k((View) parent, toqVar);
        }
    }
}
