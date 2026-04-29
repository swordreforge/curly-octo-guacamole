package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: DialogCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: androidx.core.app.t8r$k */
    /* JADX INFO: compiled from: DialogCompat.java */
    @zy.hyr(28)
    static class C0449k {
        private C0449k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static <T> T m1983k(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }

    private t8r() {
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static View m1982k(@zy.lvui Dialog dialog, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C0449k.m1983k(dialog, i2);
        }
        View viewFindViewById = dialog.findViewById(i2);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
