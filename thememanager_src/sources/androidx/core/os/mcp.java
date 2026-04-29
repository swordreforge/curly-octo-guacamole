package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: UserManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class mcp {

    /* JADX INFO: renamed from: androidx.core.os.mcp$k */
    /* JADX INFO: compiled from: UserManagerCompat.java */
    @hyr(24)
    static class C0584k {
        private C0584k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2738k(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private mcp() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2737k(@lvui Context context) {
        return C0584k.m2738k(context);
    }
}
