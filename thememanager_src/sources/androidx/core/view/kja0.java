package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.uv6;

/* JADX INFO: compiled from: KeyEventDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class kja0 {

    /* JADX INFO: renamed from: k */
    private static boolean f4058k = false;

    /* JADX INFO: renamed from: q */
    private static Field f4059q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50837toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f50838zy = false;

    /* JADX INFO: renamed from: androidx.core.view.kja0$k */
    /* JADX INFO: compiled from: KeyEventDispatcher.java */
    public interface InterfaceC0703k {
        boolean superDispatchKeyEvent(@zy.lvui KeyEvent keyEvent);
    }

    private kja0() {
    }

    /* JADX INFO: renamed from: g */
    private static DialogInterface.OnKeyListener m3358g(Dialog dialog) {
        if (!f50838zy) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f4059q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f50838zy = true;
        }
        Field field = f4059q;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static boolean m3359k(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f4058k) {
            try {
                f50837toq = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f4058k = true;
        }
        Method method = f50837toq;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: n */
    public static boolean m3360n(@zy.lvui InterfaceC0703k interfaceC0703k, @zy.dd View view, @zy.dd Window.Callback callback, @zy.lvui KeyEvent keyEvent) {
        if (interfaceC0703k == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC0703k.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? toq((Activity) callback, keyEvent) : callback instanceof Dialog ? zy((Dialog) callback, keyEvent) : (view != null && C0683f.o1t(view, keyEvent)) || interfaceC0703k.superDispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3361q(@zy.lvui View view, @zy.lvui KeyEvent keyEvent) {
        return C0683f.wvg(view, keyEvent);
    }

    private static boolean toq(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3359k(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0683f.o1t(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean zy(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM3358g = m3358g(dialog);
        if (onKeyListenerM3358g != null && onKeyListenerM3358g.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0683f.o1t(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
