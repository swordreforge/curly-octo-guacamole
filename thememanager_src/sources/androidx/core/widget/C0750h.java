package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.widget.h */
/* JADX INFO: compiled from: PopupMenuCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0750h {

    /* JADX INFO: renamed from: androidx.core.widget.h$k */
    /* JADX INFO: compiled from: PopupMenuCompat.java */
    @hyr(19)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static View.OnTouchListener m3629k(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    private C0750h() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static View.OnTouchListener m3628k(@lvui Object obj) {
        return k.m3629k((PopupMenu) obj);
    }
}
