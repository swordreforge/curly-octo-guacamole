package androidx.core.widget;

import android.widget.ListView;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ListViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class kja0 {

    /* JADX INFO: renamed from: androidx.core.widget.kja0$k */
    /* JADX INFO: compiled from: ListViewCompat.java */
    @hyr(19)
    static class C0753k {
        private C0753k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3657k(ListView listView, int i2) {
            return listView.canScrollList(i2);
        }

        @InterfaceC7830i
        static void toq(ListView listView, int i2) {
            listView.scrollListBy(i2);
        }
    }

    private kja0() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3656k(@lvui ListView listView, int i2) {
        return C0753k.m3657k(listView, i2);
    }

    public static void toq(@lvui ListView listView, int i2) {
        C0753k.toq(listView, i2);
    }
}
