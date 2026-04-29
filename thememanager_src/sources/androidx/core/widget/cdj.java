package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: PopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class cdj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f50970f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static Field f4243g = null;

    /* JADX INFO: renamed from: k */
    private static final String f4244k = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: n */
    private static boolean f4245n;

    /* JADX INFO: renamed from: q */
    private static Method f4246q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50971toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f50972zy;

    /* JADX INFO: renamed from: androidx.core.widget.cdj$k */
    /* JADX INFO: compiled from: PopupWindowCompat.java */
    @hyr(19)
    static class C0747k {
        private C0747k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3622k(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
        }
    }

    /* JADX INFO: compiled from: PopupWindowCompat.java */
    @hyr(23)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3623k(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3624q(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }

        @InterfaceC7830i
        static int toq(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @InterfaceC7830i
        static void zy(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }
    }

    private cdj() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3619k(@lvui PopupWindow popupWindow) {
        return toq.m3623k(popupWindow);
    }

    /* JADX INFO: renamed from: n */
    public static void m3620n(@lvui PopupWindow popupWindow, @lvui View view, int i2, int i3, int i4) {
        C0747k.m3622k(popupWindow, view, i2, i3, i4);
    }

    /* JADX INFO: renamed from: q */
    public static void m3621q(@lvui PopupWindow popupWindow, int i2) {
        toq.m3624q(popupWindow, i2);
    }

    public static int toq(@lvui PopupWindow popupWindow) {
        return toq.toq(popupWindow);
    }

    public static void zy(@lvui PopupWindow popupWindow, boolean z2) {
        toq.zy(popupWindow, z2);
    }
}
