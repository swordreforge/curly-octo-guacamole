package o05;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.UserHandle;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class zy {
    /* JADX INFO: renamed from: k */
    public static Intent m26819k(Context context, BroadcastReceiver broadcastReceiver, UserHandle userHandle, IntentFilter intentFilter, @dd String str, @dd Handler handler) {
        return (Intent) com.miui.lockscreeninfo.toq.zy(Context.class, context, "registerReceiverAsUser", Intent.class, new Class[]{BroadcastReceiver.class, UserHandle.class, IntentFilter.class, String.class, Handler.class}, broadcastReceiver, userHandle, intentFilter, str, handler);
    }
}
