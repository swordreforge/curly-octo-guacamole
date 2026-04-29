package com.miui.maml;

import com.miui.maml.ResourceManager;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleResourceManager extends ResourceManager {
    private static final String LOG_TAG = "LifecycleResourceManager";
    public static final int TIME_DAY = 86400000;
    public static final int TIME_HOUR = 3600000;
    private static long mLastCheckCacheTime;
    private long mCheckTime;
    private long mInactiveTime;

    public LifecycleResourceManager(ResourceLoader resourceLoader, long j2, long j3) {
        super(resourceLoader);
        this.mInactiveTime = j2;
        this.mCheckTime = j3;
    }

    public void checkCache() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - mLastCheckCacheTime < this.mCheckTime) {
            return;
        }
        MamlLog.m17850d(LOG_TAG, "begin check cache... ");
        ArrayList<String> arrayList = new ArrayList();
        synchronized (this.mBitmapKeysLock) {
            for (String str : this.mBitmapKeys) {
                ResourceManager.BitmapInfo bitmapInfo = ResourceManager.sBitmapsCache.get(str);
                if (bitmapInfo != null && jCurrentTimeMillis - bitmapInfo.mLastVisitTime > this.mInactiveTime) {
                    arrayList.add(str);
                }
            }
            for (String str2 : arrayList) {
                MamlLog.m17850d(LOG_TAG, "remove cache: " + str2);
                ResourceManager.sBitmapsCache.remove(str2);
                this.mBitmapKeys.remove(str2);
            }
        }
        mLastCheckCacheTime = jCurrentTimeMillis;
    }

    @Override // com.miui.maml.ResourceManager
    public void finish(boolean z2) {
        if (z2) {
            checkCache();
        }
        super.finish(z2);
    }

    @Override // com.miui.maml.ResourceManager
    public void pause() {
        checkCache();
    }
}
