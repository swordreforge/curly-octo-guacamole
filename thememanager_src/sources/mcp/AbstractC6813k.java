package mcp;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: renamed from: mcp.k */
/* JADX INFO: compiled from: WakefulBroadcastReceiver.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC6813k extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f38346k = "androidx.contentpager.content.wakelockid";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f85542toq = new SparseArray<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f85543zy = 1;

    /* JADX INFO: renamed from: k */
    public static boolean m24745k(Intent intent) {
        int intExtra = intent.getIntExtra(f38346k, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f85542toq;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName toq(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f85542toq;
        synchronized (sparseArray) {
            int i2 = f85543zy;
            int i3 = i2 + 1;
            f85543zy = i3;
            if (i3 <= 0) {
                f85543zy = 1;
            }
            intent.putExtra(f38346k, i2);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i2, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }
}
