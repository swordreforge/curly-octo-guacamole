package com.android.thememanager.basemodule.analysis;

import android.util.ArrayMap;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.C1822q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k */
/* JADX INFO: compiled from: AdStatisticsUploadManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1698k {

    /* JADX INFO: renamed from: n */
    public static ThreadPoolExecutor f9701n = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k());

    /* JADX INFO: renamed from: q */
    private static final String f9702q = "AdStatisticsUploadManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57479zy = 1000;

    /* JADX INFO: renamed from: k */
    private final ArrayMap<String, Long> f9703k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<AdInfo> f57480toq;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$f7l8 */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        private static final C1698k f9704k = new C1698k(null);

        private f7l8() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$g */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : C1698k.this.f9703k.keySet()) {
                if (jCurrentTimeMillis - ((Long) C1698k.this.f9703k.get(str)).longValue() >= 1000) {
                    Iterator it = C1698k.this.f57480toq.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AdInfo adInfo = (AdInfo) it.next();
                            if (Objects.equals(C1822q.zy(adInfo.ex), str)) {
                                arrayList.add(adInfo);
                                break;
                            }
                        }
                    }
                }
            }
            C1698k.this.f9703k.clear();
            C1698k.this.f57480toq.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1708s.f7l8().x2(4001).qrj((AdInfo) it2.next(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$k */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class k implements ThreadFactory {
        k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            return new Thread(r2, "AdStat thread");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$n */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class n implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AdInfo f9706k;

        n(final AdInfo val$adInfo) {
            this.f9706k = val$adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strZy = C1822q.zy(this.f9706k.ex);
            Long l2 = (Long) C1698k.this.f9703k.get(strZy);
            if (strZy == null || l2 == null || System.currentTimeMillis() - l2.longValue() >= 1000) {
                return;
            }
            C1698k.this.f9703k.remove(strZy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$q */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Collection f9708k;

        q(final Collection val$adInfos) {
            this.f9708k = val$adInfos;
        }

        @Override // java.lang.Runnable
        public void run() {
            Collection collection = this.f9708k;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C1698k.this.m6635g((AdInfo) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$toq */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Collection f9710k;

        toq(final Collection val$adInfos) {
            this.f9710k = val$adInfos;
        }

        @Override // java.lang.Runnable
        public void run() {
            Collection collection = this.f9710k;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C1698k.this.zy((AdInfo) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.k$zy */
    /* JADX INFO: compiled from: AdStatisticsUploadManager.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AdInfo f9712k;

        zy(final AdInfo val$adInfo) {
            this.f9712k = val$adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdInfo adInfo = this.f9712k;
            if (adInfo != null) {
                String strZy = C1822q.zy(adInfo.ex);
                if (C1698k.this.f9703k.containsKey(strZy) || C1698k.this.f57480toq.contains(this.f9712k)) {
                    return;
                }
                C1698k.this.f9703k.put(strZy, Long.valueOf(System.currentTimeMillis()));
                C1698k.this.f57480toq.add(this.f9712k);
            }
        }
    }

    /* synthetic */ C1698k(k kVar) {
        this();
    }

    /* JADX INFO: renamed from: n */
    public static C1698k m6634n() {
        return f7l8.f9704k;
    }

    public void f7l8(Collection<AdInfo> adInfos) {
        f9701n.execute(new q(adInfos));
    }

    /* JADX INFO: renamed from: g */
    public void m6635g(AdInfo adInfo) {
        f9701n.execute(new n(adInfo));
    }

    /* JADX INFO: renamed from: q */
    public void m6636q(Collection<AdInfo> adInfos) {
        f9701n.execute(new toq(adInfos));
    }

    /* JADX INFO: renamed from: y */
    public void m6637y() {
        f9701n.execute(new g());
    }

    public void zy(AdInfo adInfo) {
        f9701n.execute(new zy(adInfo));
    }

    private C1698k() {
        this.f9703k = new ArrayMap<>();
        this.f57480toq = new ArrayList<>();
    }
}
