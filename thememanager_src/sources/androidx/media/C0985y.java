package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.C0974p;
import androidx.media.ld6;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.media.y */
/* JADX INFO: compiled from: MediaSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0985y {

    /* JADX INFO: renamed from: n */
    private static volatile C0985y f5396n = null;

    /* JADX INFO: renamed from: k */
    k f5398k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f51757toq = "MediaSessionManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final boolean f51758zy = Log.isLoggable(f51757toq, 3);

    /* JADX INFO: renamed from: q */
    private static final Object f5397q = new Object();

    /* JADX INFO: renamed from: androidx.media.y$k */
    /* JADX INFO: compiled from: MediaSessionManager.java */
    interface k {
        Context getContext();

        /* JADX INFO: renamed from: k */
        boolean mo4616k(zy userInfo);
    }

    /* JADX INFO: renamed from: androidx.media.y$zy */
    /* JADX INFO: compiled from: MediaSessionManager.java */
    interface zy {
        String getPackageName();

        /* JADX INFO: renamed from: k */
        int mo4617k();

        int toq();
    }

    private C0985y(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5398k = new C0974p(context);
        } else {
            this.f5398k = new C0979s(context);
        }
    }

    @lvui
    public static C0985y toq(@lvui Context context) {
        C0985y c0985y;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f5397q) {
            if (f5396n == null) {
                f5396n = new C0985y(context.getApplicationContext());
            }
            c0985y = f5396n;
        }
        return c0985y;
    }

    /* JADX INFO: renamed from: k */
    Context m4635k() {
        return this.f5398k.getContext();
    }

    public boolean zy(@lvui toq userInfo) {
        if (userInfo != null) {
            return this.f5398k.mo4616k(userInfo.f5400k);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* JADX INFO: renamed from: androidx.media.y$toq */
    /* JADX INFO: compiled from: MediaSessionManager.java */
    public static final class toq {

        /* JADX INFO: renamed from: q */
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public static final int f5399q = -1;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f51759toq = "android.media.session.MediaController";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public static final int f51760zy = -1;

        /* JADX INFO: renamed from: k */
        zy f5400k;

        public toq(@lvui String packageName, int pid, int uid) {
            if (packageName == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(packageName)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f5400k = new C0974p.k(packageName, pid, uid);
            } else {
                this.f5400k = new ld6.C0972k(packageName, pid, uid);
            }
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof toq) {
                return this.f5400k.equals(((toq) obj).f5400k);
            }
            return false;
        }

        public int hashCode() {
            return this.f5400k.hashCode();
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public String m4636k() {
            return this.f5400k.getPackageName();
        }

        public int toq() {
            return this.f5400k.toq();
        }

        public int zy() {
            return this.f5400k.mo4617k();
        }

        @hyr(28)
        @uv6({uv6.EnumC7844k.LIBRARY})
        public toq(MediaSessionManager$RemoteUserInfo remoteUserInfo) {
            String strZy = C0974p.k.zy(remoteUserInfo);
            if (strZy != null) {
                if (!TextUtils.isEmpty(strZy)) {
                    this.f5400k = new C0974p.k(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
