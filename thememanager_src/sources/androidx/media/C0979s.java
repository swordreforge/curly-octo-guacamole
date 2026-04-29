package androidx.media;

import android.content.Context;
import androidx.media.C0985y;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.media.s */
/* JADX INFO: compiled from: MediaSessionManagerImplApi21.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class C0979s extends ld6 {
    C0979s(Context context) {
        super(context);
        this.f5348k = context;
    }

    /* JADX INFO: renamed from: q */
    private boolean m4626q(@lvui C0985y.zy userInfo) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", userInfo.toq(), userInfo.mo4617k()) == 0;
    }

    @Override // androidx.media.ld6, androidx.media.C0985y.k
    /* JADX INFO: renamed from: k */
    public boolean mo4616k(@lvui C0985y.zy userInfo) {
        return m4626q(userInfo) || super.mo4616k(userInfo);
    }
}
