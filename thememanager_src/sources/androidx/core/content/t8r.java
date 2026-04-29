package androidx.core.content;

import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: UnusedAppRestrictionsBackportCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: k */
    private IUnusedAppRestrictionsBackportCallback f3521k;

    @uv6({uv6.EnumC7844k.LIBRARY})
    public t8r(@lvui IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.f3521k = iUnusedAppRestrictionsBackportCallback;
    }

    /* JADX INFO: renamed from: k */
    public void m2365k(boolean z2, boolean z3) throws RemoteException {
        this.f3521k.onIsPermissionRevocationEnabledForAppResult(z2, z3);
    }
}
