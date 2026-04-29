package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: SQLiteCursorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: androidx.core.database.sqlite.toq$k */
    /* JADX INFO: compiled from: SQLiteCursorCompat.java */
    @hyr(28)
    static class C0513k {
        private C0513k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2378k(SQLiteCursor sQLiteCursor, boolean z2) {
            sQLiteCursor.setFillWindowForwardOnly(z2);
        }
    }

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static void m2377k(@lvui SQLiteCursor sQLiteCursor, boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0513k.m2378k(sQLiteCursor, z2);
        }
    }
}
