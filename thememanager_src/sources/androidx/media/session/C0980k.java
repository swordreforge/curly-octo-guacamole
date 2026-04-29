package androidx.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.content.C0498q;
import androidx.media.AbstractServiceC0970g;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: androidx.media.session.k */
/* JADX INFO: compiled from: MediaButtonReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class C0980k extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f5371k = "MediaButtonReceiver";

    /* JADX INFO: renamed from: androidx.media.session.k$k */
    /* JADX INFO: compiled from: MediaButtonReceiver.java */
    private static class k extends MediaBrowserCompat.ConnectionCallback {

        /* JADX INFO: renamed from: k */
        private final Context f5372k;

        /* JADX INFO: renamed from: q */
        private MediaBrowserCompat f5373q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Intent f51735toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f51736zy;

        k(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f5372k = context;
            this.f51735toq = intent;
            this.f51736zy = pendingResult;
        }

        /* JADX INFO: renamed from: k */
        private void m4630k() {
            this.f5373q.disconnect();
            this.f51736zy.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            new MediaControllerCompat(this.f5372k, this.f5373q.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f51735toq.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m4630k();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            m4630k();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            m4630k();
        }

        void toq(MediaBrowserCompat mediaBrowser) {
            this.f5373q = mediaBrowser;
        }
    }

    /* JADX INFO: renamed from: k */
    public static PendingIntent m4627k(Context context, long action) {
        ComponentName componentNameZy = zy(context);
        if (componentNameZy != null) {
            return toq(context, componentNameZy, action);
        }
        Log.w(f5371k, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static KeyEvent m4628n(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    /* JADX INFO: renamed from: q */
    private static ComponentName m4629q(Context context, String action) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(action);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + action + ", found " + listQueryIntentServices.size());
    }

    @SuppressLint({"WrongConstant"})
    public static PendingIntent toq(Context context, ComponentName mbrComponent, long action) {
        if (mbrComponent == null) {
            Log.w(f5371k, "The component name of media button receiver should be provided.");
            return null;
        }
        int keyCode = PlaybackStateCompat.toKeyCode(action);
        if (keyCode == 0) {
            Log.w(f5371k, "Cannot build a media button pending intent with the given action: " + action);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(mbrComponent);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, keyCode, intent, MediaSessionCompat.PENDING_INTENT_FLAG_MUTABLE);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public static ComponentName zy(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w(f5371k, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(f5371k, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameM4629q = m4629q(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM4629q != null) {
            intent.setComponent(componentNameM4629q);
            C0498q.fn3e(context, intent);
            return;
        }
        ComponentName componentNameM4629q2 = m4629q(context, AbstractServiceC0970g.f5232t);
        if (componentNameM4629q2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM4629q2, kVar, null);
        kVar.toq(mediaBrowserCompat);
        mediaBrowserCompat.connect();
    }
}
