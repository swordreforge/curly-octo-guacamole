package com.miui.maml.util;

import android.content.Context;
import android.os.Handler;
import com.miui.maml.RendererCore;
import com.miui.maml.ResourceLoader;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.ScreenElementRootFactory;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class RendererCoreCache implements RendererCore.OnReleaseListener {
    private static final String LOG_TAG = "RendererCoreCache";
    public static final int TIME_DAY = 86400000;
    public static final int TIME_HOUR = 3600000;
    public static final int TIME_MIN = 60000;
    private HashMap<Object, RendererCoreInfo> mCaches;
    private Handler mHandler;

    protected class CheckCacheRunnable implements Runnable {
        private Object mKey;

        public CheckCacheRunnable(Object obj) {
            this.mKey = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            RendererCoreCache.this.checkCache(this.mKey);
        }
    }

    public interface OnCreateRootCallback {
        void onCreateRoot(ScreenElementRoot screenElementRoot);
    }

    public static class RendererCoreInfo {
        public long accessTime = Long.MAX_VALUE;
        public long cacheTime;
        public CheckCacheRunnable checkCache;

        /* JADX INFO: renamed from: r */
        public RendererCore f29482r;

        public RendererCoreInfo(RendererCore rendererCore) {
            this.f29482r = rendererCore;
        }
    }

    public RendererCoreCache() {
        this.mCaches = new HashMap<>();
        this.mHandler = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkCache(Object obj) {
        MamlLog.m17850d(LOG_TAG, "checkCache: " + obj);
        RendererCoreInfo rendererCoreInfo = this.mCaches.get(obj);
        if (rendererCoreInfo == null) {
            MamlLog.m17850d(LOG_TAG, "checkCache: the key does not exist, " + obj);
            return;
        }
        if (rendererCoreInfo.accessTime == Long.MAX_VALUE) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - rendererCoreInfo.accessTime;
        if (jCurrentTimeMillis >= rendererCoreInfo.cacheTime) {
            this.mCaches.remove(obj);
            MamlLog.m17850d(LOG_TAG, "checkCache removed: " + obj);
        } else {
            if (jCurrentTimeMillis < 0) {
                rendererCoreInfo.accessTime = System.currentTimeMillis();
                jCurrentTimeMillis = 0;
            }
            this.mHandler.postDelayed(rendererCoreInfo.checkCache, rendererCoreInfo.cacheTime - jCurrentTimeMillis);
            MamlLog.m17850d(LOG_TAG, "checkCache resheduled: " + obj + " after " + (rendererCoreInfo.cacheTime - jCurrentTimeMillis));
        }
    }

    @Override // com.miui.maml.RendererCore.OnReleaseListener
    public synchronized boolean OnRendererCoreReleased(RendererCore rendererCore) {
        Object next;
        RendererCoreInfo rendererCoreInfo;
        MamlLog.m17850d(LOG_TAG, "OnRendererCoreReleased: " + rendererCore);
        Iterator<Object> it = this.mCaches.keySet().iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
            rendererCoreInfo = this.mCaches.get(next);
        } while (rendererCoreInfo.f29482r != rendererCore);
        release(next);
        return rendererCoreInfo.cacheTime == 0;
    }

    public synchronized void clear() {
        this.mCaches.clear();
    }

    public synchronized RendererCoreInfo get(Object obj, long j2) {
        RendererCoreInfo rendererCoreInfo = this.mCaches.get(obj);
        if (rendererCoreInfo == null) {
            return null;
        }
        rendererCoreInfo.accessTime = Long.MAX_VALUE;
        rendererCoreInfo.cacheTime = j2;
        this.mHandler.removeCallbacks(rendererCoreInfo.checkCache);
        return rendererCoreInfo;
    }

    public synchronized void release(Object obj) {
        MamlLog.m17850d(LOG_TAG, "release: " + obj);
        RendererCoreInfo rendererCoreInfo = this.mCaches.get(obj);
        if (rendererCoreInfo != null) {
            rendererCoreInfo.accessTime = System.currentTimeMillis();
            if (rendererCoreInfo.cacheTime == 0) {
                this.mCaches.remove(obj);
                MamlLog.m17850d(LOG_TAG, "removed: " + obj);
            } else {
                MamlLog.m17850d(LOG_TAG, "scheduled release: " + obj + " after " + rendererCoreInfo.cacheTime);
                this.mHandler.removeCallbacks(rendererCoreInfo.checkCache);
                this.mHandler.postDelayed(rendererCoreInfo.checkCache, rendererCoreInfo.cacheTime);
            }
        }
    }

    public RendererCoreCache(Handler handler) {
        this.mCaches = new HashMap<>();
        this.mHandler = handler;
    }

    public synchronized RendererCoreInfo get(Object obj, Context context, long j2, String str, OnCreateRootCallback onCreateRootCallback) {
        return get(obj, context, j2, null, str, onCreateRootCallback);
    }

    public synchronized RendererCoreInfo get(Object obj, Context context, long j2, ResourceLoader resourceLoader, OnCreateRootCallback onCreateRootCallback) {
        return get(obj, context, j2, resourceLoader, null, onCreateRootCallback);
    }

    private RendererCoreInfo get(Object obj, Context context, long j2, ResourceLoader resourceLoader, String str, OnCreateRootCallback onCreateRootCallback) {
        ScreenElementRoot screenElementRootCreate;
        RendererCoreInfo rendererCoreInfo = get(obj, j2);
        if (rendererCoreInfo != null) {
            return rendererCoreInfo;
        }
        if (resourceLoader != null) {
            screenElementRootCreate = ScreenElementRootFactory.create(new ScreenElementRootFactory.Parameter(context, resourceLoader));
        } else {
            screenElementRootCreate = ScreenElementRootFactory.create(new ScreenElementRootFactory.Parameter(context, str));
        }
        RendererCore rendererCore = null;
        if (screenElementRootCreate == null) {
            MamlLog.m17851e(LOG_TAG, "fail to get RendererCoreInfo" + obj);
            return null;
        }
        if (onCreateRootCallback != null) {
            onCreateRootCallback.onCreateRoot(screenElementRootCreate);
        }
        screenElementRootCreate.setDefaultFramerate(0.0f);
        if (screenElementRootCreate.load()) {
            rendererCore = new RendererCore(screenElementRootCreate);
            rendererCore.setLoader(resourceLoader);
            rendererCore.setCacheKey(obj);
            rendererCore.setCacheTime(j2);
        }
        RendererCoreInfo rendererCoreInfo2 = new RendererCoreInfo(rendererCore);
        rendererCoreInfo2.accessTime = Long.MAX_VALUE;
        rendererCoreInfo2.cacheTime = j2;
        if (rendererCore != null) {
            rendererCore.setOnReleaseListener(this);
            rendererCoreInfo2.checkCache = new CheckCacheRunnable(obj);
        }
        this.mCaches.put(obj, rendererCoreInfo2);
        return rendererCoreInfo2;
    }
}
