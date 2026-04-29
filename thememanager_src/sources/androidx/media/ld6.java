package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C0642s;
import androidx.media.C0985y;
import zy.lvui;

/* JADX INFO: compiled from: MediaSessionManagerImplBase.java */
/* JADX INFO: loaded from: classes.dex */
class ld6 implements C0985y.k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f51701f7l8 = "enabled_notification_listeners";

    /* JADX INFO: renamed from: g */
    private static final String f5345g = "android.permission.MEDIA_CONTENT_CONTROL";

    /* JADX INFO: renamed from: n */
    private static final String f5346n = "android.permission.STATUS_BAR_SERVICE";

    /* JADX INFO: renamed from: q */
    private static final boolean f5347q = C0985y.f51758zy;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f51702zy = "MediaSessionManager";

    /* JADX INFO: renamed from: k */
    Context f5348k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    ContentResolver f51703toq;

    /* JADX INFO: renamed from: androidx.media.ld6$k */
    /* JADX INFO: compiled from: MediaSessionManagerImplBase.java */
    static class C0972k implements C0985y.zy {

        /* JADX INFO: renamed from: k */
        private String f5349k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f51704toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f51705zy;

        C0972k(String packageName, int pid, int uid) {
            this.f5349k = packageName;
            this.f51704toq = pid;
            this.f51705zy = uid;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0972k)) {
                return false;
            }
            C0972k c0972k = (C0972k) obj;
            return (this.f51704toq < 0 || c0972k.f51704toq < 0) ? TextUtils.equals(this.f5349k, c0972k.f5349k) && this.f51705zy == c0972k.f51705zy : TextUtils.equals(this.f5349k, c0972k.f5349k) && this.f51704toq == c0972k.f51704toq && this.f51705zy == c0972k.f51705zy;
        }

        @Override // androidx.media.C0985y.zy
        public String getPackageName() {
            return this.f5349k;
        }

        public int hashCode() {
            return C0642s.toq(this.f5349k, Integer.valueOf(this.f51705zy));
        }

        @Override // androidx.media.C0985y.zy
        /* JADX INFO: renamed from: k */
        public int mo4617k() {
            return this.f51705zy;
        }

        @Override // androidx.media.C0985y.zy
        public int toq() {
            return this.f51704toq;
        }
    }

    ld6(Context context) {
        this.f5348k = context;
        this.f51703toq = context.getContentResolver();
    }

    private boolean zy(C0985y.zy userInfo, String permission) {
        return userInfo.toq() < 0 ? this.f5348k.getPackageManager().checkPermission(permission, userInfo.getPackageName()) == 0 : this.f5348k.checkPermission(permission, userInfo.toq(), userInfo.mo4617k()) == 0;
    }

    @Override // androidx.media.C0985y.k
    public Context getContext() {
        return this.f5348k;
    }

    @Override // androidx.media.C0985y.k
    /* JADX INFO: renamed from: k */
    public boolean mo4616k(@lvui C0985y.zy userInfo) {
        try {
            if (this.f5348k.getPackageManager().getApplicationInfo(userInfo.getPackageName(), 0) == null) {
                return false;
            }
            return zy(userInfo, f5346n) || zy(userInfo, f5345g) || userInfo.mo4617k() == 1000 || toq(userInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            if (f5347q) {
                Log.d(f51702zy, "Package " + userInfo.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    boolean toq(@lvui C0985y.zy userInfo) {
        String string = Settings.Secure.getString(this.f51703toq, f51701f7l8);
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(userInfo.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
