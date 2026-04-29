package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: CursorWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: androidx.core.database.toq$k */
    /* JADX INFO: compiled from: CursorWindowCompat.java */
    @hyr(15)
    static class C0514k {
        private C0514k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static CursorWindow m2381k(String str) {
            return new CursorWindow(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.database.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorWindowCompat.java */
    @hyr(28)
    static class C7863toq {
        private C7863toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static CursorWindow m2382k(String str, long j2) {
            return new CursorWindow(str, j2);
        }
    }

    private toq() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static CursorWindow m2380k(@dd String str, long j2) {
        return Build.VERSION.SDK_INT >= 28 ? C7863toq.m2382k(str, j2) : C0514k.m2381k(str);
    }
}
