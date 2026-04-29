package com.miui.maml;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MiuiSettings;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.maml.data.ConfigChangeVariableUpdater;
import com.miui.maml.util.HideSdkDependencyUtils;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.MobileDataUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public final class NotifierManager {
    private static final String LOG_TAG = "NotifierManager";
    public static String TYPE_CONFIG_CHANGE = "ConfigChange";
    public static String TYPE_DARK_MODE = "DarkMode";
    public static String TYPE_MOBILE_DATA = "MobileData";
    public static String TYPE_TIME_CHANGED = "TimeChanged";
    public static String TYPE_WIFI_STATE = "WifiState";
    private static NotifierManager sInstance;
    private Context mContext;
    private HashMap<String, BaseNotifier> mNotifiers = new HashMap<>();

    public static abstract class BaseNotifier {
        private int mActiveCount;
        protected Context mContext;
        private ArrayList<Listener> mListeners = new ArrayList<>();
        private int mRefCount;
        private boolean mRegistered;

        private static class Listener {
            public Context context;
            public Intent intent;
            public Object obj;
            private boolean paused;
            private boolean pendingNotify;
            public WeakReference<OnNotifyListener> ref;

            public Listener(OnNotifyListener onNotifyListener) {
                this.ref = new WeakReference<>(onNotifyListener);
            }

            public void onNotify(Context context, Intent intent, Object obj) {
                OnNotifyListener onNotifyListener = this.ref.get();
                if (onNotifyListener instanceof ConfigChangeVariableUpdater) {
                    onNotifyListener.onNotify(context, intent, obj);
                    return;
                }
                if (!this.paused) {
                    if (onNotifyListener != null) {
                        onNotifyListener.onNotify(context, intent, obj);
                    }
                } else {
                    this.pendingNotify = true;
                    this.context = context;
                    this.intent = intent;
                    this.obj = obj;
                }
            }

            public void pause() {
                this.paused = true;
            }

            public void resume() {
                OnNotifyListener onNotifyListener;
                this.paused = false;
                if (!this.pendingNotify || (onNotifyListener = this.ref.get()) == null) {
                    return;
                }
                onNotifyListener.onNotify(this.context, this.intent, this.obj);
                this.pendingNotify = false;
                this.context = null;
                this.intent = null;
                this.obj = null;
            }
        }

        public BaseNotifier(Context context) {
            this.mContext = context;
        }

        private final void checkListeners() {
            synchronized (this.mListeners) {
                if (checkListenersLocked() == 0) {
                    pause();
                }
            }
        }

        private final int checkListenersLocked() {
            this.mActiveCount = 0;
            for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                Listener listener = this.mListeners.get(size);
                if (listener.ref.get() == null) {
                    this.mListeners.remove(size);
                } else if (!listener.paused) {
                    this.mActiveCount++;
                }
            }
            int size2 = this.mListeners.size();
            this.mRefCount = size2;
            return size2;
        }

        private final Listener findListenerLocked(OnNotifyListener onNotifyListener) {
            for (Listener listener : this.mListeners) {
                if (listener.ref.get() == onNotifyListener) {
                    return listener;
                }
            }
            return null;
        }

        public final void addListener(OnNotifyListener onNotifyListener) {
            synchronized (this.mListeners) {
                if (findListenerLocked(onNotifyListener) == null) {
                    this.mListeners.add(new Listener(onNotifyListener));
                    checkListenersLocked();
                    onListenerAdded(onNotifyListener);
                }
            }
        }

        public void finish() {
            unregister();
        }

        public final int getActiveCount() {
            checkListeners();
            return this.mActiveCount;
        }

        public final int getRef() {
            checkListeners();
            return this.mRefCount;
        }

        public void init() {
            register();
        }

        protected void onListenerAdded(OnNotifyListener onNotifyListener) {
        }

        protected void onNotify(Context context, Intent intent, Object obj) {
            checkListeners();
            synchronized (this.mListeners) {
                Iterator<Listener> it = this.mListeners.iterator();
                while (it.hasNext()) {
                    it.next().onNotify(context, intent, obj);
                }
            }
        }

        protected abstract void onRegister();

        protected abstract void onUnregister();

        public void pause() {
            unregister();
        }

        public final int pauseListener(OnNotifyListener onNotifyListener) {
            synchronized (this.mListeners) {
                Listener listenerFindListenerLocked = findListenerLocked(onNotifyListener);
                if (listenerFindListenerLocked != null) {
                    listenerFindListenerLocked.pause();
                    return this.mRefCount;
                }
                checkListenersLocked();
                MamlLog.m17854w(NotifierManager.LOG_TAG, "pauseListener, listener not exist");
                return this.mRefCount;
            }
        }

        protected void register() {
            if (this.mRegistered) {
                return;
            }
            onRegister();
            this.mRegistered = true;
            MamlLog.m17853i(NotifierManager.LOG_TAG, "onRegister: " + toString());
        }

        public final void removeListener(OnNotifyListener onNotifyListener) {
            synchronized (this.mListeners) {
                Listener listenerFindListenerLocked = findListenerLocked(onNotifyListener);
                if (listenerFindListenerLocked != null) {
                    this.mListeners.remove(listenerFindListenerLocked);
                    checkListenersLocked();
                }
            }
        }

        public void resume() {
            register();
        }

        public final int resumeListener(OnNotifyListener onNotifyListener) {
            synchronized (this.mListeners) {
                Listener listenerFindListenerLocked = findListenerLocked(onNotifyListener);
                if (listenerFindListenerLocked != null) {
                    listenerFindListenerLocked.resume();
                    return this.mRefCount;
                }
                checkListenersLocked();
                MamlLog.m17854w(NotifierManager.LOG_TAG, "resumeListener, listener not exist");
                return this.mRefCount;
            }
        }

        protected void unregister() {
            if (this.mRegistered) {
                try {
                    onUnregister();
                } catch (IllegalArgumentException e2) {
                    MamlLog.m17854w(NotifierManager.LOG_TAG, e2.toString());
                }
                this.mRegistered = false;
                MamlLog.m17853i(NotifierManager.LOG_TAG, "onUnregister: " + toString());
            }
        }
    }

    public static class ConfigChangeNotifier extends BaseNotifier {
        private ComponentCallbacks2 mComponentCallback;
        private Configuration mConfiguration;

        public ConfigChangeNotifier(Context context) {
            super(context);
            this.mComponentCallback = new ComponentCallbacks2() { // from class: com.miui.maml.NotifierManager.ConfigChangeNotifier.1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@lvui Configuration configuration) {
                    if (ConfigChangeNotifier.this.mConfiguration == null) {
                        return;
                    }
                    if (ConfigChangeNotifier.this.mConfiguration.screenWidthDp != configuration.screenWidthDp || ConfigChangeNotifier.this.mConfiguration.screenLayout != configuration.screenLayout || ConfigChangeNotifier.this.mConfiguration.smallestScreenWidthDp != configuration.smallestScreenWidthDp || ConfigChangeNotifier.this.mConfiguration.densityDpi != configuration.densityDpi) {
                        ConfigChangeNotifier.this.checkIfNeedToNotify(configuration);
                    }
                    ConfigChangeNotifier.this.mConfiguration.updateFrom(configuration);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                }
            };
            this.mConfiguration = new Configuration(context.getResources().getConfiguration());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void checkIfNeedToNotify(Configuration configuration) {
            onNotify(null, null, configuration);
            MamlLog.m17850d(NotifierManager.LOG_TAG, "maml config changed");
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onListenerAdded(OnNotifyListener onNotifyListener) {
            onNotifyListener.onNotify(null, null, this.mConfiguration);
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onRegister() {
            try {
                this.mContext.registerComponentCallbacks(this.mComponentCallback);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            checkIfNeedToNotify(this.mConfiguration);
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onUnregister() {
            try {
                this.mContext.unregisterComponentCallbacks(this.mComponentCallback);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class ContentChangeNotifier extends BaseNotifier {
        protected final ContentObserver mObserver;
        private Uri mUri;

        public ContentChangeNotifier(Context context, Uri uri) {
            super(context);
            this.mObserver = new ContentObserver(null) { // from class: com.miui.maml.NotifierManager.ContentChangeNotifier.1
                @Override // android.database.ContentObserver
                public void onChange(boolean z2) {
                    MamlLog.m17853i(NotifierManager.LOG_TAG, "onNotify: " + ContentChangeNotifier.this.toString());
                    ContentChangeNotifier.this.onNotify(null, null, Boolean.valueOf(z2));
                }
            };
            this.mUri = uri;
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onRegister() {
            this.mContext.getContentResolver().registerContentObserver(this.mUri, false, this.mObserver);
            onNotify(null, null, Boolean.TRUE);
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onUnregister() {
            this.mContext.getContentResolver().unregisterContentObserver(this.mObserver);
        }
    }

    public static class DarkModeNotifier extends BaseNotifier {
        public static final int DARK_MODE = 1;
        public static final int DARK_WALLPAPER_MODE = 2;
        private ComponentCallbacks2 mComponentCallback;
        private String mDarkModeName;
        private ContentObserver mDarkModeObserver;
        private String mDarkWallpaperModeName;
        private ContentObserver mDarkWallpaperModeObserver;
        private boolean mIsDarkMode;
        private boolean mIsDarkWallpaperMode;
        private boolean mIsUIModeNight;
        private int mMamlDarkMode;

        public DarkModeNotifier(Context context) {
            super(context);
            Handler handler = null;
            this.mDarkModeObserver = new ContentObserver(handler) { // from class: com.miui.maml.NotifierManager.DarkModeNotifier.1
                @Override // android.database.ContentObserver
                public void onChange(boolean z2) {
                    DarkModeNotifier.this.updateDarkMode();
                    DarkModeNotifier.this.checkIfNeedToNotify();
                }
            };
            this.mDarkWallpaperModeObserver = new ContentObserver(handler) { // from class: com.miui.maml.NotifierManager.DarkModeNotifier.2
                @Override // android.database.ContentObserver
                public void onChange(boolean z2) {
                    DarkModeNotifier.this.updateDarkWallpaperMode();
                    DarkModeNotifier.this.checkIfNeedToNotify();
                }
            };
            this.mComponentCallback = new ComponentCallbacks2() { // from class: com.miui.maml.NotifierManager.DarkModeNotifier.3
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@lvui Configuration configuration) {
                    DarkModeNotifier.this.updateUIModeNight(configuration);
                    DarkModeNotifier.this.checkIfNeedToNotify();
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                }
            };
            this.mDarkModeName = HideSdkDependencyUtils.SettingsSecure_UI_NIGHT_MODE();
            this.mDarkWallpaperModeName = HideSdkDependencyUtils.SystemSettingsSystem_DARKEN_WALLPAPER_UNDER_DARK_MODE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void checkIfNeedToNotify() {
            int i2 = (this.mIsDarkMode || this.mIsUIModeNight) ? 1 : 0;
            if (this.mIsDarkWallpaperMode) {
                i2 |= 2;
            }
            if (i2 != this.mMamlDarkMode) {
                this.mMamlDarkMode = i2;
                onNotify(null, null, Integer.valueOf(i2));
                MamlLog.m17850d(NotifierManager.LOG_TAG, "maml dark mode " + i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateDarkMode() {
            this.mIsDarkMode = Settings.Secure.getInt(this.mContext.getContentResolver(), this.mDarkModeName, 1) == 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateDarkWallpaperMode() {
            this.mIsDarkWallpaperMode = MiuiSettings.System.getBoolean(this.mContext.getContentResolver(), this.mDarkWallpaperModeName, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateUIModeNight(Configuration configuration) {
            this.mIsUIModeNight = (configuration.uiMode & 48) == 32;
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onListenerAdded(OnNotifyListener onNotifyListener) {
            onNotifyListener.onNotify(null, null, Integer.valueOf(this.mMamlDarkMode));
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onRegister() {
            if (TextUtils.isEmpty(this.mDarkModeName) || TextUtils.isEmpty(this.mDarkWallpaperModeName)) {
                return;
            }
            try {
                this.mContext.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(this.mDarkModeName), false, this.mDarkModeObserver);
                this.mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor(this.mDarkWallpaperModeName), false, this.mDarkWallpaperModeObserver);
                this.mContext.registerComponentCallbacks(this.mComponentCallback);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            updateDarkMode();
            updateDarkWallpaperMode();
            updateUIModeNight(this.mContext.getResources().getConfiguration());
            checkIfNeedToNotify();
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onUnregister() {
            if (TextUtils.isEmpty(this.mDarkModeName) || TextUtils.isEmpty(this.mDarkWallpaperModeName)) {
                return;
            }
            try {
                this.mContext.getContentResolver().unregisterContentObserver(this.mDarkModeObserver);
                this.mContext.getContentResolver().unregisterContentObserver(this.mDarkWallpaperModeObserver);
                this.mContext.unregisterComponentCallbacks(this.mComponentCallback);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class MobileDataNotifier extends ContentChangeNotifier {
        private MobileDataUtils mMobileDataUtils;

        public MobileDataNotifier(Context context) {
            super(context, null);
            this.mMobileDataUtils = MobileDataUtils.getInstance();
        }

        @Override // com.miui.maml.NotifierManager.ContentChangeNotifier, com.miui.maml.NotifierManager.BaseNotifier
        protected void onRegister() {
            this.mMobileDataUtils.registerContentObserver(this.mContext, this.mObserver);
            onNotify(null, null, Boolean.TRUE);
        }
    }

    public static class MultiBroadcastNotifier extends BroadcastNotifier {
        private String[] mIntents;

        public MultiBroadcastNotifier(Context context, String... strArr) {
            super(context);
            this.mIntents = strArr;
        }

        @Override // com.miui.maml.NotifierManager.BroadcastNotifier
        protected IntentFilter createIntentFilter() {
            IntentFilter intentFilter = new IntentFilter();
            for (String str : this.mIntents) {
                intentFilter.addAction(str);
            }
            return intentFilter;
        }
    }

    public interface OnNotifyListener {
        void onNotify(Context context, Intent intent, Object obj);
    }

    private NotifierManager(Context context) {
        this.mContext = context;
    }

    private static BaseNotifier createNotifier(String str, Context context) {
        MamlLog.m17853i(LOG_TAG, "createNotifier:" + str);
        return TYPE_MOBILE_DATA.equals(str) ? new MobileDataNotifier(context) : TYPE_WIFI_STATE.equals(str) ? new MultiBroadcastNotifier(context, "android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.SCAN_RESULTS", "android.net.wifi.STATE_CHANGE") : TYPE_TIME_CHANGED.equals(str) ? new MultiBroadcastNotifier(context, "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET") : TYPE_DARK_MODE.equals(str) ? new DarkModeNotifier(context) : TYPE_CONFIG_CHANGE.equals(str) ? new ConfigChangeNotifier(context) : new BroadcastNotifier(context, str);
    }

    public static synchronized NotifierManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new NotifierManager(context);
        }
        return sInstance;
    }

    private BaseNotifier safeGet(String str) {
        BaseNotifier baseNotifier;
        synchronized (this.mNotifiers) {
            baseNotifier = this.mNotifiers.get(str);
        }
        return baseNotifier;
    }

    public void acquireNotifier(String str, OnNotifyListener onNotifyListener) {
        MamlLog.m17853i(LOG_TAG, "acquireNotifier:" + str + "  " + onNotifyListener.toString());
        synchronized (this.mNotifiers) {
            BaseNotifier baseNotifierCreateNotifier = this.mNotifiers.get(str);
            if (baseNotifierCreateNotifier == null) {
                baseNotifierCreateNotifier = createNotifier(str, this.mContext);
                if (baseNotifierCreateNotifier == null) {
                    return;
                }
                baseNotifierCreateNotifier.init();
                this.mNotifiers.put(str, baseNotifierCreateNotifier);
            }
            baseNotifierCreateNotifier.addListener(onNotifyListener);
        }
    }

    public void pause(String str, OnNotifyListener onNotifyListener) {
        BaseNotifier baseNotifierSafeGet = safeGet(str);
        if (baseNotifierSafeGet != null && baseNotifierSafeGet.pauseListener(onNotifyListener) == 0) {
            baseNotifierSafeGet.pause();
        }
    }

    public void releaseNotifier(String str, OnNotifyListener onNotifyListener) {
        MamlLog.m17853i(LOG_TAG, "releaseNotifier:" + str + "  " + onNotifyListener.toString());
        synchronized (this.mNotifiers) {
            BaseNotifier baseNotifier = this.mNotifiers.get(str);
            if (baseNotifier == null) {
                return;
            }
            baseNotifier.removeListener(onNotifyListener);
            if (baseNotifier.getRef() == 0) {
                baseNotifier.finish();
                this.mNotifiers.remove(str);
            }
        }
    }

    public synchronized void resume(String str, OnNotifyListener onNotifyListener) {
        BaseNotifier baseNotifierSafeGet = safeGet(str);
        if (baseNotifierSafeGet == null) {
            return;
        }
        if (baseNotifierSafeGet.resumeListener(onNotifyListener) == 1) {
            baseNotifierSafeGet.resume();
        }
    }

    public static class BroadcastNotifier extends BaseNotifier {
        private String mAction;
        private IntentFilter mIntentFilter;
        private final BroadcastReceiver mIntentReceiver;

        public BroadcastNotifier(Context context) {
            super(context);
            this.mIntentReceiver = new BroadcastReceiver() { // from class: com.miui.maml.NotifierManager.BroadcastNotifier.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    MamlLog.m17853i(NotifierManager.LOG_TAG, "onNotify: " + BroadcastNotifier.this.toString());
                    BroadcastNotifier.this.onNotify(context2, intent, null);
                }
            };
        }

        protected IntentFilter createIntentFilter() {
            String intentAction = getIntentAction();
            if (intentAction == null) {
                return null;
            }
            return new IntentFilter(intentAction);
        }

        protected String getIntentAction() {
            return this.mAction;
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onRegister() {
            if (this.mIntentFilter == null) {
                this.mIntentFilter = createIntentFilter();
            }
            IntentFilter intentFilter = this.mIntentFilter;
            if (intentFilter == null) {
                MamlLog.m17851e(NotifierManager.LOG_TAG, "onRegister: mIntentFilter is null");
                return;
            }
            Intent intentRegisterReceiver = this.mContext.registerReceiver(this.mIntentReceiver, intentFilter);
            if (intentRegisterReceiver != null) {
                onNotify(this.mContext, intentRegisterReceiver, null);
            }
        }

        @Override // com.miui.maml.NotifierManager.BaseNotifier
        protected void onUnregister() {
            try {
                this.mContext.unregisterReceiver(this.mIntentReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }

        public BroadcastNotifier(Context context, String str) {
            super(context);
            this.mIntentReceiver = new BroadcastReceiver() { // from class: com.miui.maml.NotifierManager.BroadcastNotifier.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    MamlLog.m17853i(NotifierManager.LOG_TAG, "onNotify: " + BroadcastNotifier.this.toString());
                    BroadcastNotifier.this.onNotify(context2, intent, null);
                }
            };
            this.mAction = str;
        }
    }
}
