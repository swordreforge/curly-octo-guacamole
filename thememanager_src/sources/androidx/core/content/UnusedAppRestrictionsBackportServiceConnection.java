package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.C0258n;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: n */
    private final Context f3437n;

    /* JADX INFO: renamed from: q */
    @lvui
    C0258n<Integer> f3438q;

    /* JADX INFO: renamed from: k */
    @dd
    @yz
    IUnusedAppRestrictionsBackportService f3436k = null;

    /* JADX INFO: renamed from: g */
    private boolean f3435g = false;

    UnusedAppRestrictionsBackportServiceConnection(@lvui Context context) {
        this.f3437n = context;
    }

    private IUnusedAppRestrictionsBackportCallback zy() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z2, boolean z3) throws RemoteException {
                if (!z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f3438q.t8r(0);
                    Log.e(kja0.f3445k, "Unable to retrieve the permission revocation setting from the backport");
                } else if (z3) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f3438q.t8r(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.f3438q.t8r(2);
                }
            }
        };
    }

    /* JADX INFO: renamed from: k */
    public void m2171k(@lvui C0258n<Integer> c0258n) {
        if (this.f3435g) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f3435g = true;
        this.f3438q = c0258n;
        this.f3437n.bindService(new Intent(UnusedAppRestrictionsBackportService.f3433q).setPackage(kja0.toq(this.f3437n.getPackageManager())), this, 1);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceAsInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.f3436k = iUnusedAppRestrictionsBackportServiceAsInterface;
        try {
            iUnusedAppRestrictionsBackportServiceAsInterface.isPermissionRevocationEnabledForApp(zy());
        } catch (RemoteException unused) {
            this.f3438q.t8r(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f3436k = null;
    }

    public void toq() {
        if (!this.f3435g) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f3435g = false;
        this.f3437n.unbindService(this);
    }
}
