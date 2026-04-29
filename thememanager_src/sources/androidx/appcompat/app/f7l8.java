package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.toq;
import androidx.appcompat.view.toq;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ch;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import zy.InterfaceC7842s;
import zy.InterfaceC7843t;
import zy.dd;
import zy.gvn7;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f7l8 {

    /* JADX INFO: renamed from: c */
    public static final int f252c = 10;

    /* JADX INFO: renamed from: f */
    public static final int f253f = 109;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f254g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f255h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f256i = -100;

    /* JADX INFO: renamed from: k */
    static final boolean f257k = false;

    /* JADX INFO: renamed from: l */
    public static final int f258l = 108;

    /* JADX INFO: renamed from: n */
    public static final int f259n = -1;

    /* JADX INFO: renamed from: p */
    public static final int f260p = 2;

    /* JADX INFO: renamed from: q */
    static final String f261q = "AppCompatDelegate";

    /* JADX INFO: renamed from: s */
    public static final int f263s = 1;

    /* JADX INFO: renamed from: y */
    @Deprecated
    public static final int f265y = 0;

    /* JADX INFO: renamed from: z */
    private static int f266z = -100;

    /* JADX INFO: renamed from: t */
    private static final androidx.collection.zy<WeakReference<f7l8>> f264t = new androidx.collection.zy<>();

    /* JADX INFO: renamed from: r */
    private static final Object f262r = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.f7l8$k */
    /* JADX INFO: compiled from: AppCompatDelegate.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0093k {
    }

    f7l8() {
    }

    /* JADX INFO: renamed from: g */
    private static void m192g() {
        synchronized (f262r) {
            Iterator<WeakReference<f7l8>> it = f264t.iterator();
            while (it.hasNext()) {
                f7l8 f7l8Var = it.next().get();
                if (f7l8Var != null) {
                    f7l8Var.mo119n();
                }
            }
        }
    }

    private static void gvn7(@lvui f7l8 f7l8Var) {
        synchronized (f262r) {
            Iterator<WeakReference<f7l8>> it = f264t.iterator();
            while (it.hasNext()) {
                f7l8 f7l8Var2 = it.next().get();
                if (f7l8Var2 == f7l8Var || f7l8Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    static void jp0y(@lvui f7l8 f7l8Var) {
        synchronized (f262r) {
            gvn7(f7l8Var);
        }
    }

    public static int kja0() {
        return f266z;
    }

    @lvui
    public static f7l8 ld6(@lvui Context context, @lvui Activity activity, @dd InterfaceC0094g interfaceC0094g) {
        return new AppCompatDelegateImpl(context, activity, interfaceC0094g);
    }

    public static boolean ni7() {
        return ch.toq();
    }

    public static void oc(boolean z2) {
        ch.zy(z2);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public static f7l8 m193p(@lvui Dialog dialog, @dd InterfaceC0094g interfaceC0094g) {
        return new AppCompatDelegateImpl(dialog, interfaceC0094g);
    }

    /* JADX INFO: renamed from: r */
    public static void m194r(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d(f261q, "setDefaultNightMode() called with an unknown mode");
        } else if (f266z != i2) {
            f266z = i2;
            m192g();
        }
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public static f7l8 m195s(@lvui Activity activity, @dd InterfaceC0094g interfaceC0094g) {
        return new AppCompatDelegateImpl(activity, interfaceC0094g);
    }

    @lvui
    public static f7l8 x2(@lvui Context context, @lvui Window window, @dd InterfaceC0094g interfaceC0094g) {
        return new AppCompatDelegateImpl(context, window, interfaceC0094g);
    }

    static void zy(@lvui f7l8 f7l8Var) {
        synchronized (f262r) {
            gvn7(f7l8Var);
            f264t.add(new WeakReference<>(f7l8Var));
        }
    }

    public abstract void a9();

    public int cdj() {
        return -100;
    }

    public abstract void d2ok(View view);

    public abstract boolean d3(int i2);

    public abstract void dd(boolean z2);

    public abstract void eqxt(@gvn7 int i2);

    @Deprecated
    public void f7l8(Context context) {
    }

    public abstract void fn3e();

    public abstract void fti();

    public abstract boolean fu4();

    @dd
    /* JADX INFO: renamed from: h */
    public abstract toq.InterfaceC7850toq mo114h();

    @dd
    public abstract androidx.appcompat.view.toq hyr(@lvui toq.InterfaceC0138k interfaceC0138k);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo115i(int i2);

    public abstract void jk(Bundle bundle);

    public abstract MenuInflater ki();

    /* JADX INFO: renamed from: l */
    public void mo118l(@hb int i2) {
    }

    public abstract void lvui(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void mcp();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo119n();

    public abstract void n5r1(@dd CharSequence charSequence);

    @dd
    public abstract <T extends View> T n7h(@InterfaceC7843t int i2);

    public abstract void ncyb(@dd Toolbar toolbar);

    public abstract void o1t(Bundle bundle);

    /* JADX INFO: renamed from: q */
    public abstract void mo120q(View view, ViewGroup.LayoutParams layoutParams);

    public abstract View qrj(@dd View view, String str, @lvui Context context, @lvui AttributeSet attributeSet);

    /* JADX INFO: renamed from: t */
    public abstract void mo121t(Bundle bundle);

    @dd
    public abstract AbstractC0096k t8r();

    public abstract void wvg();

    @hyr(17)
    public abstract void x9kr(int i2);

    @lvui
    @InterfaceC7842s
    /* JADX INFO: renamed from: y */
    public Context mo123y(@lvui Context context) {
        f7l8(context);
        return context;
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo124z(Configuration configuration);

    public abstract void zurt();
}
