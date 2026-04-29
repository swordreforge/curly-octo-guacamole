package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.q */
/* JADX INFO: compiled from: ConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0587q {

    /* JADX INFO: renamed from: androidx.core.os.q$k */
    /* JADX INFO: compiled from: ConfigurationCompat.java */
    @hyr(24)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static LocaleList m2746k(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private C0587q() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static x2 m2745k(@lvui Configuration configuration) {
        return x2.n7h(k.m2746k(configuration));
    }
}
