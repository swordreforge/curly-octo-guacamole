package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.h */
/* JADX INFO: compiled from: MessageCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0580h {

    /* JADX INFO: renamed from: k */
    private static boolean f3704k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static boolean f50542toq = true;

    /* JADX INFO: renamed from: androidx.core.os.h$k */
    /* JADX INFO: compiled from: MessageCompat.java */
    @hyr(22)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2723k(Message message) {
            return message.isAsynchronous();
        }

        @InterfaceC7830i
        static void toq(Message message, boolean z2) {
            message.setAsynchronous(z2);
        }
    }

    private C0580h() {
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: k */
    public static boolean m2722k(@lvui Message message) {
        return k.m2723k(message);
    }

    @SuppressLint({"NewApi"})
    public static void toq(@lvui Message message, boolean z2) {
        k.toq(message, z2);
    }
}
