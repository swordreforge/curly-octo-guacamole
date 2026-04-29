package yl;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.d2ok;
import miuix.appcompat.app.t8r;
import mub.InterfaceC7395n;

/* JADX INFO: renamed from: yl.q */
/* JADX INFO: compiled from: BlurWindowController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7788q extends zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f100622toq;

    /* JADX INFO: renamed from: g */
    private final WindowManager.LayoutParams m28173g(Window window, String str, Object obj) {
        if (window != null && window.getAttributes() != null && !TextUtils.isEmpty(str)) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = attributes.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(attributes, obj);
                return attributes;
            } catch (Exception e2) {
                Log.w("LargeIcon", "reflectSetWindowAttributes failed, field: " + str + ", value: " + obj, e2);
            }
        }
        return null;
    }

    public final boolean f7l8(@InterfaceC7395n Window window, float f2) {
        return Build.VERSION.SDK_INT >= 31 ? m28175y(window, f2) : m28174s(window, f2);
    }

    @Override // yl.zy
    /* JADX INFO: renamed from: n */
    public void mo28171n(boolean z2) {
        t8r t8rVarM28189k;
        if (this.f100622toq == z2 || (t8rVarM28189k = m28189k()) == null) {
            return;
        }
        if (z2) {
            t8rVarM28189k.getWindow().setFlags(4, 4);
        } else {
            t8rVarM28189k.getWindow().clearFlags(4);
        }
        this.f100622toq = z2;
    }

    @Override // yl.zy
    /* JADX INFO: renamed from: q */
    public void mo28172q(float f2) {
        t8r t8rVarM28189k = m28189k();
        if (t8rVarM28189k == null) {
            return;
        }
        this.f100622toq = f7l8(t8rVarM28189k.getWindow(), f2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m28174s(@InterfaceC7395n Window window, float f2) {
        try {
            WindowManager.LayoutParams layoutParamsM28173g = m28173g(window, "blurRatio", Float.valueOf(f2));
            if (layoutParamsM28173g == null) {
                return false;
            }
            if (f2 <= 0.0f) {
                layoutParamsM28173g.flags &= -5;
            } else {
                layoutParamsM28173g.flags |= 4;
            }
            d2ok.qrj(window);
            window.setAttributes(layoutParamsM28173g);
            return f2 > 0.0f;
        } catch (Exception e2) {
            Log.w("LargeIcon", "setBlurRatio failed", e2);
            return false;
        }
    }

    @Override // yl.zy
    public boolean toq() {
        return this.f100622toq;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m28175y(@InterfaceC7395n Window window, float f2) {
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (f2 <= 0.0f) {
                attributes.flags &= -5;
            } else {
                attributes.flags |= 4;
            }
            Method declaredMethod = attributes.getClass().getDeclaredMethod("setBlurBehindRadius", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(attributes, Integer.valueOf((int) (100 * f2)));
            window.setAttributes(attributes);
            return f2 > 0.0f;
        } catch (Exception e2) {
            Log.e("LargeIcon", "setBlurRadius", e2);
            return false;
        }
    }
}
