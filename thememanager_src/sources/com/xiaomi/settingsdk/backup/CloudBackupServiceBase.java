package com.xiaomi.settingsdk.backup;

import android.app.IntentService;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.xiaomi.settingsdk.backup.IBackupRestoreSettings;
import com.xiaomi.settingsdk.backup.data.DataPackage;
import com.xiaomi.settingsdk.backup.data.SettingItem;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CloudBackupServiceBase extends IntentService {

    /* JADX INFO: renamed from: g */
    private static final int f34344g = 1;

    /* JADX INFO: renamed from: h */
    private static final ExecutorService f34345h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: n */
    private static final int f34346n = 0;

    /* JADX INFO: renamed from: p */
    public static final String f34347p = "result_receiver";

    /* JADX INFO: renamed from: q */
    private static final String f34348q = "SettingsBackup";

    /* JADX INFO: renamed from: s */
    public static final String f34349s = "miui.action.CLOUD_RESTORE_SETTINGS";

    /* JADX INFO: renamed from: y */
    public static final String f34350y = "miui.action.CLOUD_BACKUP_SETTINGS";

    /* JADX INFO: renamed from: k */
    private final IBackupRestoreSettings.Stub f34351k;

    /* JADX INFO: renamed from: com.xiaomi.settingsdk.backup.CloudBackupServiceBase$k */
    private class RunnableC5970k implements Runnable {

        /* JADX INFO: renamed from: k */
        private final Intent f34352k;

        /* JADX INFO: renamed from: q */
        private final Integer f34354q;

        public RunnableC5970k(Intent intent, Integer num) {
            this.f34352k = intent;
            this.f34354q = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudBackupServiceBase.this.f7l8(this.f34352k, this.f34354q);
        }
    }

    public CloudBackupServiceBase() {
        super("SettingsBackup");
        this.f34351k = new IBackupRestoreSettings.Stub() { // from class: com.xiaomi.settingsdk.backup.CloudBackupServiceBase.1
            @Override // com.xiaomi.settingsdk.backup.IBackupRestoreSettings
            public void handleSettingsIntent(Intent intent) throws RemoteException {
                CloudBackupServiceBase.f34345h.submit(CloudBackupServiceBase.this.new RunnableC5970k(intent, null));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(Intent intent, Integer num) {
        boolean zM22198s;
        Log.d("SettingsBackup", "new_version_check_backup");
        if (intent == null) {
            if (num != null) {
                stopSelf(num.intValue());
                return;
            }
            return;
        }
        Log.d("SettingsBackup", m22199y("myPid: " + Process.myPid()));
        Log.d("SettingsBackup", m22199y("intent: " + intent));
        Log.d("SettingsBackup", m22199y("extras: " + intent.getExtras()));
        String action = intent.getAction();
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        if ("miui.action.CLOUD_BACKUP_SETTINGS".equals(action)) {
            if (resultReceiver != null) {
                Bundle bundleZy = zy();
                if (bundleZy == null) {
                    Log.e("SettingsBackup", m22199y("bundle result is null after backupSettings"));
                }
                resultReceiver.send(0, bundleZy);
            }
        } else if ("miui.action.CLOUD_RESTORE_SETTINGS".equals(action) && resultReceiver != null) {
            IBinder binder = intent.getExtras().getBinder(DataPackage.f34355k);
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    binder.transact(2, parcelObtain, parcelObtain2, 0);
                    zM22198s = m22198s((DataPackage) parcelObtain2.readParcelable(getClass().getClassLoader()), intent.getIntExtra("version", -1));
                } catch (BadParcelableException e2) {
                    Log.e("SettingsBackup", "BadParcelableException when read readParcelable", e2);
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    zM22198s = false;
                } catch (RemoteException e3) {
                    Log.e("SettingsBackup", "RemoteException in onHandleIntent()", e3);
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    zM22198s = false;
                } catch (ClassCastException unused) {
                    Log.e("SettingsBackup", "ClassCastException when cast DataPackage");
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    zM22198s = false;
                }
                if (zM22198s) {
                    resultReceiver.send(0, new Bundle());
                } else {
                    resultReceiver.send(1, null);
                }
                Log.d("SettingsBackup", m22199y("r.send()" + Thread.currentThread()));
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
        if (num != null) {
            stopSelf(num.intValue());
        }
    }

    /* JADX INFO: renamed from: n */
    protected static void m22196n(DataPackage dataPackage) {
        for (Map.Entry<String, SettingItem<?>> entry : dataPackage.getDataItems().entrySet()) {
            Log.d("SettingsBackup", "key: " + entry.getKey() + ", value: " + entry.getValue().getValue());
        }
    }

    /* JADX INFO: renamed from: q */
    private InterfaceC5976k m22197q() {
        InterfaceC5976k interfaceC5976kMo7405g = mo7405g();
        if (interfaceC5976kMo7405g != null) {
            return interfaceC5976kMo7405g;
        }
        throw new IllegalArgumentException("backuper must not be null");
    }

    /* JADX INFO: renamed from: s */
    private boolean m22198s(DataPackage dataPackage, int i2) {
        Log.d("SettingsBackup", m22199y("SettingsBackupServiceBase:restoreSettings"));
        InterfaceC5976k interfaceC5976kM22197q = m22197q();
        int iZy = interfaceC5976kM22197q.zy(getApplicationContext());
        if (i2 <= iZy) {
            interfaceC5976kM22197q.toq(getApplicationContext(), dataPackage, i2);
            return true;
        }
        Log.w("SettingsBackup", "drop restore data because dataVersion is higher than currentAppVersion, dataVersion: " + i2 + ", currentAppVersion: " + iZy);
        return false;
    }

    /* JADX INFO: renamed from: y */
    private String m22199y(String str) {
        return getPackageName() + ": " + str;
    }

    private Bundle zy() {
        Log.d("SettingsBackup", m22199y("SettingsBackupServiceBase:backupSettings"));
        InterfaceC5976k interfaceC5976kM22197q = m22197q();
        DataPackage dataPackage = new DataPackage();
        interfaceC5976kM22197q.mo7413k(getApplicationContext(), dataPackage);
        Bundle bundle = new Bundle();
        dataPackage.m22204y(bundle);
        bundle.putInt("version", interfaceC5976kM22197q.zy(getApplicationContext()));
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    protected abstract InterfaceC5976k mo7405g();

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f34351k;
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        Log.d("SettingsBackup", "@Deprecated :: onHandleIntent(" + intent + ")");
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        f34345h.submit(new RunnableC5970k(intent, Integer.valueOf(i3)));
        return 2;
    }
}
