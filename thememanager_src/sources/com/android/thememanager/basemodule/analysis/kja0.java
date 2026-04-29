package com.android.thememanager.basemodule.analysis;

import android.util.ArrayMap;
import android.util.Log;
import com.google.gson.C4871g;
import com.google.gson.zurt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: V9StatisticsUploadManager.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    public static ThreadPoolExecutor f9714g = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1700k());

    /* JADX INFO: renamed from: n */
    private static final String f9715n = "V9StatisticsUploadManager";

    /* JADX INFO: renamed from: y */
    public static final int f9716y = 1000;

    /* JADX INFO: renamed from: k */
    private ArrayMap<String, Long> f9717k = new ArrayMap<>();

    /* JADX INFO: renamed from: q */
    private ArrayList<String> f9718q = new ArrayList<>();

    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class f7l8 implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f9719g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9720k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f9721n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f9722q;

        f7l8(final String val$trackId, final String val$actionType, final String val$pageId, final String val$extra) {
            this.f9720k = val$trackId;
            this.f9722q = val$actionType;
            this.f9721n = val$pageId;
            this.f9719g = val$extra;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap<String, Long> map = new HashMap<>();
            map.put(this.f9720k, Long.valueOf(System.currentTimeMillis()));
            n7h.m6648k().toq(this.f9722q, this.f9721n, map, null, this.f9719g);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.kja0$g */
    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class RunnableC1699g implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9723k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f9725q;

        RunnableC1699g(final String val$pageId, final String val$extra) {
            this.f9723k = val$pageId;
            this.f9725q = val$extra;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap<String, Long> map = new HashMap<>();
            for (String str : kja0.this.f9717k.keySet()) {
                Long l2 = (Long) kja0.this.f9717k.get(str);
                if (jCurrentTimeMillis - l2.longValue() >= 1000) {
                    map.put(str, l2);
                    kja0.this.f9718q.add(str);
                }
            }
            kja0.this.f9717k.clear();
            n7h.m6648k().toq("T_EXPOSE", this.f9723k, map, null, this.f9725q);
            for (String str2 : kja0.this.f9718q) {
                if (C1706p.cdj(this.f9725q)) {
                    ArrayMap<String, Object> arrayMapN7h = null;
                    try {
                        arrayMapN7h = C1706p.n7h(this.f9723k, str2, (ArrayMap) new C4871g().n7h(this.f9725q, ArrayMap.class));
                    } catch (zurt unused) {
                        Log.w(kja0.f9715n, "extra is not fromJson to ArrayMap");
                    }
                    if (arrayMapN7h != null) {
                        C1708s.f7l8().ld6().cdj(arrayMapN7h);
                    }
                } else {
                    C1708s.f7l8().ld6().cdj(C1706p.kja0(this.f9723k, str2, this.f9725q));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.kja0$k */
    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class ThreadFactoryC1700k implements ThreadFactory {
        ThreadFactoryC1700k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            return new Thread(r2, "V9Stat thread");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.kja0$n */
    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class RunnableC1701n implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9726k;

        RunnableC1701n(final String val$trackId) {
            this.f9726k = val$trackId;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l2 = (Long) kja0.this.f9717k.get(this.f9726k);
            if (this.f9726k == null || l2 == null || System.currentTimeMillis() - l2.longValue() >= 1000) {
                return;
            }
            kja0.this.f9717k.remove(this.f9726k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.kja0$q */
    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class RunnableC1702q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Collection f9728k;

        RunnableC1702q(final Collection val$trackIds) {
            this.f9728k = val$trackIds;
        }

        @Override // java.lang.Runnable
        public void run() {
            Collection collection = this.f9728k;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    kja0.this.m6643n((String) it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Collection f9730k;

        toq(final Collection val$trackIds) {
            this.f9730k = val$trackIds;
        }

        @Override // java.lang.Runnable
        public void run() {
            Collection collection = this.f9730k;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    kja0.this.zy((String) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.kja0$y */
    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class RunnableC1703y implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f9732g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9733k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f9734n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f9735q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f9736y;

        RunnableC1703y(final String val$trackId, final String val$actionType, final String val$pageId, final String val$userId, final String val$extra) {
            this.f9733k = val$trackId;
            this.f9735q = val$actionType;
            this.f9734n = val$pageId;
            this.f9732g = val$userId;
            this.f9736y = val$extra;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap<String, Long> map = new HashMap<>();
            map.put(this.f9733k, Long.valueOf(System.currentTimeMillis()));
            n7h.m6648k().toq(this.f9735q, this.f9734n, map, this.f9732g, this.f9736y);
        }
    }

    /* JADX INFO: compiled from: V9StatisticsUploadManager.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9737k;

        zy(final String val$trackId) {
            this.f9737k = val$trackId;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9737k == null || kja0.this.f9717k.containsKey(this.f9737k) || kja0.this.f9718q.contains(this.f9737k)) {
                return;
            }
            kja0.this.f9717k.put(this.f9737k, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void f7l8(String pageId, String trackId, String extra) {
        m6641s("T_CLICK", pageId, trackId, extra);
    }

    /* JADX INFO: renamed from: p */
    public static void m6640p(String actionType, String pageId, String trackId, String userId, String extra) {
        f9714g.execute(new RunnableC1703y(trackId, actionType, pageId, userId, extra));
    }

    /* JADX INFO: renamed from: s */
    public static void m6641s(String actionType, String pageId, String trackId, String extra) {
        f9714g.execute(new f7l8(trackId, actionType, pageId, extra));
    }

    /* JADX INFO: renamed from: g */
    public void m6642g(Collection<String> trackIds) {
        f9714g.execute(new RunnableC1702q(trackIds));
    }

    /* JADX INFO: renamed from: n */
    public void m6643n(String trackId) {
        f9714g.execute(new RunnableC1701n(trackId));
    }

    /* JADX INFO: renamed from: q */
    public void m6644q(Collection<String> trackIds) {
        f9714g.execute(new toq(trackIds));
    }

    /* JADX INFO: renamed from: y */
    public void m6645y(String pageId, String extra) {
        f9714g.execute(new RunnableC1699g(pageId, extra));
    }

    public void zy(String trackId) {
        f9714g.execute(new zy(trackId));
    }
}
