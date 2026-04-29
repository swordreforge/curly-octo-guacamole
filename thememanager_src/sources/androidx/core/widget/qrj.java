package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ListPopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj {

    /* JADX INFO: renamed from: androidx.core.widget.qrj$k */
    /* JADX INFO: compiled from: ListPopupWindowCompat.java */
    @hyr(19)
    static class C0761k {
        private C0761k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static View.OnTouchListener m3670k(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    private qrj() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static View.OnTouchListener m3669k(@lvui ListPopupWindow listPopupWindow, @lvui View view) {
        return C0761k.m3670k(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener toq(Object obj, View view) {
        return m3669k((ListPopupWindow) obj, view);
    }
}
