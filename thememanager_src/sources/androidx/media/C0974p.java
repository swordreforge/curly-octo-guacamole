package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import androidx.media.C0985y;
import androidx.media.ld6;
import zy.hyr;

/* JADX INFO: renamed from: androidx.media.p */
/* JADX INFO: compiled from: MediaSessionManagerImplApi28.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(28)
class C0974p extends C0979s {

    /* JADX INFO: renamed from: y */
    MediaSessionManager f5361y;

    C0974p(Context context) {
        super(context);
        this.f5361y = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.C0979s, androidx.media.ld6, androidx.media.C0985y.k
    /* JADX INFO: renamed from: k */
    public boolean mo4616k(C0985y.zy userInfo) {
        return super.mo4616k(userInfo);
    }

    /* JADX INFO: renamed from: androidx.media.p$k */
    /* JADX INFO: compiled from: MediaSessionManagerImplApi28.java */
    @hyr(28)
    static final class k extends ld6.C0972k {

        /* JADX INFO: renamed from: q */
        final MediaSessionManager$RemoteUserInfo f5362q;

        k(String packageName, int pid, int uid) {
            super(packageName, pid, uid);
            this.f5362q = new MediaSessionManager$RemoteUserInfo(packageName, pid, uid);
        }

        static String zy(MediaSessionManager$RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        k(MediaSessionManager$RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.f5362q = remoteUserInfo;
        }
    }
}
