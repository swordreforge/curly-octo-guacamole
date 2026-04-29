package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.WeakHashMap;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.hardware.display.k */
/* JADX INFO: compiled from: DisplayManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0549k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final WeakHashMap<Context, C0549k> f50491toq = new WeakHashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f50492zy = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: k */
    private final Context f3602k;

    /* JADX INFO: renamed from: androidx.core.hardware.display.k$k */
    /* JADX INFO: compiled from: DisplayManagerCompat.java */
    @hyr(17)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Display m2592k(DisplayManager displayManager, int i2) {
            return displayManager.getDisplay(i2);
        }

        @InterfaceC7830i
        static Display[] toq(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    private C0549k(Context context) {
        this.f3602k = context;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static C0549k m2590q(@lvui Context context) {
        C0549k c0549k;
        WeakHashMap<Context, C0549k> weakHashMap = f50491toq;
        synchronized (weakHashMap) {
            c0549k = weakHashMap.get(context);
            if (c0549k == null) {
                c0549k = new C0549k(context);
                weakHashMap.put(context, c0549k);
            }
        }
        return c0549k;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public Display m2591k(int i2) {
        return k.m2592k((DisplayManager) this.f3602k.getSystemService("display"), i2);
    }

    @lvui
    public Display[] toq() {
        return k.toq((DisplayManager) this.f3602k.getSystemService("display"));
    }

    @lvui
    public Display[] zy(@dd String str) {
        return k.toq((DisplayManager) this.f3602k.getSystemService("display"));
    }
}
