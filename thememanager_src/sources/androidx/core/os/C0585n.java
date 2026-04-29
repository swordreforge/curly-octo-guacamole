package androidx.core.os;

import android.os.Environment;
import java.io.File;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.n */
/* JADX INFO: compiled from: EnvironmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0585n {

    /* JADX INFO: renamed from: k */
    private static final String f3708k = "EnvironmentCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50543toq = "unknown";

    /* JADX INFO: renamed from: androidx.core.os.n$k */
    /* JADX INFO: compiled from: EnvironmentCompat.java */
    @hyr(19)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2740k(File file) {
            return Environment.getStorageState(file);
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.n$toq */
    /* JADX INFO: compiled from: EnvironmentCompat.java */
    @hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2741k(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private C0585n() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static String m2739k(@lvui File file) {
        return toq.m2741k(file);
    }
}
