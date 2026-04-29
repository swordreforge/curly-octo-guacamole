package com.android.thememanager.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2763c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import miui.util.InputStreamLoader;

/* JADX INFO: compiled from: ImageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class hyr {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f61296kja0 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f61297n7h = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f61298qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f61299x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f61300f7l8;

    /* JADX INFO: renamed from: g */
    private int f16545g;

    /* JADX INFO: renamed from: k */
    private Map<String, C2787y> f16546k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Handler f61301ld6;

    /* JADX INFO: renamed from: n */
    private Set<String> f16547n;

    /* JADX INFO: renamed from: p */
    private zy f16548p;

    /* JADX INFO: renamed from: q */
    private Map<String, Long> f16549q;

    /* JADX INFO: renamed from: s */
    private WeakReference<InterfaceC2785n> f16550s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private LinkedList<C2775f> f61302toq;

    /* JADX INFO: renamed from: y */
    private boolean f16551y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private LinkedList<C2775f> f61303zy;

    /* JADX INFO: renamed from: h */
    private static zy f16544h = new zy(4, 2);

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static Set<String> f61295cdj = new HashSet();

    /* JADX INFO: compiled from: ImageDecoder.java */
    private class f7l8 implements Runnable {

        /* JADX INFO: renamed from: k */
        private C2775f f16552k;

        /* JADX INFO: renamed from: q */
        private C2783g f16554q;

        public f7l8(C2775f jobInfo) {
            this.f16552k = jobInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16554q = hyr.this.f7l8(this.f16552k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.hyr$g */
    /* JADX INFO: compiled from: ImageDecoder.java */
    protected static class C2783g {

        /* JADX INFO: renamed from: k */
        public boolean f16555k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f61304toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Bitmap f61305zy;

        public C2783g(boolean cancelJob, boolean result, Bitmap bitmap) {
            this.f16555k = cancelJob;
            this.f61304toq = result;
            this.f61305zy = bitmap;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.hyr$k */
    /* JADX INFO: compiled from: ImageDecoder.java */
    class HandlerC2784k extends Handler {
        HandlerC2784k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                hyr.this.qrj();
                return;
            }
            Object obj = msg.obj;
            hyr.this.x2((C2775f) ((Pair) obj).first, (C2783g) ((Pair) obj).second);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.hyr$n */
    /* JADX INFO: compiled from: ImageDecoder.java */
    public interface InterfaceC2785n {
        /* JADX INFO: renamed from: k */
        void m9813k(boolean result, C2775f decodeInfo);

        void toq(boolean result, C2775f decodeInfo, Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.hyr$q */
    /* JADX INFO: compiled from: ImageDecoder.java */
    public interface InterfaceC2786q {
        /* JADX INFO: renamed from: k */
        void m9814k(boolean result, C2775f decodeInfo);

        void toq(boolean result, C2775f decodeInfo, Bitmap bitmap);
    }

    /* JADX INFO: compiled from: ImageDecoder.java */
    class toq extends FutureTask<Void> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f16557k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Runnable runnable, Void result, final f7l8 val$jobRun) {
            super(runnable, result);
            this.f16557k = val$jobRun;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                get();
            } catch (InterruptedException | CancellationException unused) {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            hyr.this.t8r(this.f16557k.f16552k, this.f16557k.f16554q);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.hyr$y */
    /* JADX INFO: compiled from: ImageDecoder.java */
    protected static class C2787y {

        /* JADX INFO: renamed from: k */
        private LinkedList<InterfaceC2786q> f16559k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Future<?> f61306toq;

        public C2787y(InterfaceC2786q cb) {
            m9816q(cb);
        }

        /* JADX INFO: renamed from: q */
        public void m9816q(InterfaceC2786q cb) {
            if (cb == null) {
                return;
            }
            if (this.f16559k == null) {
                this.f16559k = new LinkedList<>();
            }
            if (this.f16559k.contains(cb)) {
                return;
            }
            this.f16559k.add(cb);
        }
    }

    /* JADX INFO: compiled from: ImageDecoder.java */
    protected static class zy {

        /* JADX INFO: renamed from: k */
        private ThreadPoolExecutor f16560k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ThreadPoolExecutor f61307toq;

        public zy(int downloadThreadNum, int decodingThreadNum) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(downloadThreadNum, downloadThreadNum, 60L, timeUnit, new LinkedBlockingQueue());
            this.f16560k = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(decodingThreadNum, decodingThreadNum, 60L, timeUnit, new LinkedBlockingQueue());
            this.f61307toq = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        }

        /* JADX INFO: renamed from: q */
        public void m9818q() {
            this.f16560k.shutdownNow();
            this.f61307toq.shutdownNow();
        }

        public boolean zy() {
            return this.f16560k.isShutdown() || this.f61307toq.isShutdown();
        }
    }

    public hyr() {
        this(1024, true);
    }

    /* JADX INFO: renamed from: i */
    private void m9802i() {
        if (!this.f16551y || this.f61301ld6.hasMessages(0)) {
            return;
        }
        this.f61301ld6.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r(C2775f jobInfo, C2783g jobResult) {
        Message messageObtainMessage = this.f61301ld6.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = new Pair(jobInfo, jobResult);
        this.f61301ld6.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: y */
    private boolean m9804y(C2775f jobInfo) {
        if (TextUtils.isEmpty(jobInfo.f61235zy)) {
            return false;
        }
        try {
            synchronized (f61295cdj) {
                while (f61295cdj.contains(jobInfo.m9715n())) {
                    f61295cdj.wait();
                }
                this.f16547n.add(jobInfo.m9715n());
                f61295cdj.add(jobInfo.m9715n());
            }
            if (jobInfo.toq()) {
                return true;
            }
            new com.android.thememanager.controller.online.toq(jobInfo.f61235zy).zy(zurt.EnumC1946k.FILE_PROXY, new PathEntry(jobInfo.f61234toq, jobInfo.f61235zy));
            return jobInfo.toq();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m9805z(int remainCount, boolean stopRunngingJob) {
        boolean z2 = false;
        while (this.f61303zy.size() > remainCount) {
            C2787y c2787y = this.f16546k.get(this.f61303zy.removeLast().m9713g());
            if (c2787y != null && c2787y.f61306toq != null && !c2787y.f61306toq.isDone()) {
                c2787y.f61306toq.cancel(stopRunngingJob);
                z2 = true;
            }
        }
        if (z2) {
            this.f16548p.f16560k.purge();
            this.f16548p.f61307toq.purge();
        }
    }

    public void cdj(InterfaceC2785n l2) {
        this.f16550s = new WeakReference<>(l2);
    }

    protected C2783g f7l8(C2775f jobInfo) {
        boolean zM9804y = true;
        Bitmap bitmapZy = null;
        if (!n7h(jobInfo)) {
            return new C2783g(true, false, null);
        }
        if (jobInfo.m9718s()) {
            bitmapZy = zy(jobInfo);
            if (bitmapZy == null) {
                zM9804y = false;
            }
        } else {
            zM9804y = m9804y(jobInfo);
            this.f16549q.remove(jobInfo.m9715n());
            if (!zM9804y) {
                this.f16549q.put(jobInfo.m9715n(), Long.valueOf(System.currentTimeMillis()));
            }
        }
        return new C2783g(false, zM9804y, bitmapZy);
    }

    public void fn3e(boolean fifoExecuteMode) {
        this.f61300f7l8 = fifoExecuteMode;
    }

    public void fu4() {
        zy zyVar = this.f16548p;
        if (zyVar != f16544h) {
            zyVar.m9818q();
        }
    }

    /* JADX INFO: renamed from: g */
    protected Future<?> m9806g(C2775f jobInfo) {
        f7l8 f7l8Var = new f7l8(jobInfo);
        toq toqVar = new toq(f7l8Var, null, f7l8Var);
        if (m9811s(toqVar, jobInfo)) {
            return toqVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m9807h(String key, Bitmap bitmap) {
    }

    public void ki() {
        this.f16551y = true;
        m9802i();
    }

    public void kja0() {
        this.f16551y = false;
    }

    protected void ld6(List<InterfaceC2786q> callbackList, boolean result, C2775f decodeInfo) {
        InterfaceC2785n interfaceC2785n;
        if (callbackList != null) {
            Iterator<InterfaceC2786q> it = callbackList.iterator();
            while (it.hasNext()) {
                it.next().m9814k(result, decodeInfo);
            }
        }
        WeakReference<InterfaceC2785n> weakReference = this.f16550s;
        if (weakReference == null || (interfaceC2785n = weakReference.get()) == null) {
            return;
        }
        interfaceC2785n.m9813k(result, decodeInfo);
    }

    /* JADX INFO: renamed from: n */
    public boolean m9808n(C2775f jobInfo, InterfaceC2786q callback) {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        jobInfo.m9719y();
        if (!jobInfo.m9716p() || this.f16548p.zy()) {
            return false;
        }
        C2787y c2787y = this.f16546k.get(jobInfo.m9713g());
        if (c2787y != null) {
            c2787y.m9816q(callback);
            return true;
        }
        if (this.f61302toq.size() >= this.f16545g) {
            if (this.f61300f7l8) {
                return false;
            }
            this.f16546k.remove(this.f61302toq.removeLast().m9713g());
        }
        if (this.f61300f7l8) {
            this.f61302toq.addLast(jobInfo);
        } else {
            this.f61302toq.addFirst(jobInfo);
        }
        this.f16546k.put(jobInfo.m9713g(), new C2787y(callback));
        m9802i();
        return true;
    }

    protected boolean n7h(C2775f jobInfo) {
        if (!jobInfo.m9718s()) {
            Long l2 = this.f16549q.get(jobInfo.m9715n());
            if (l2 == null) {
                l2 = 0L;
            }
            if (System.currentTimeMillis() - l2.longValue() < 10000) {
                return false;
            }
        }
        return !jobInfo.m9718s() || jobInfo.m9718s() == jobInfo.toq();
    }

    public void ni7(zy threadPool) {
        this.f16548p = threadPool;
    }

    /* JADX INFO: renamed from: p */
    protected void m9809p(List<InterfaceC2786q> callbackList, boolean result, C2775f decodeInfo, Bitmap bitmap) {
        InterfaceC2785n interfaceC2785n;
        if (callbackList != null) {
            Iterator<InterfaceC2786q> it = callbackList.iterator();
            while (it.hasNext()) {
                it.next().toq(result, decodeInfo, bitmap);
            }
        }
        WeakReference<InterfaceC2785n> weakReference = this.f16550s;
        if (weakReference == null || (interfaceC2785n = weakReference.get()) == null) {
            return;
        }
        interfaceC2785n.toq(result, decodeInfo, bitmap);
    }

    /* JADX INFO: renamed from: q */
    public boolean m9810q(C2775f jobInfo) {
        return m9808n(jobInfo, null);
    }

    protected void qrj() {
        if (!this.f16551y || this.f61302toq.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (!this.f61302toq.isEmpty()) {
            C2775f c2775fRemoveFirst = this.f61302toq.removeFirst();
            if (n7h(c2775fRemoveFirst)) {
                m9805z(this.f16545g - 1, false);
                C2787y c2787y = this.f16546k.get(c2775fRemoveFirst.m9713g());
                c2787y.f61306toq = m9806g(c2775fRemoveFirst);
                if (c2787y.f61306toq == null) {
                    this.f16546k.remove(c2775fRemoveFirst.m9713g());
                } else if (this.f61300f7l8) {
                    this.f61303zy.addLast(c2775fRemoveFirst);
                } else {
                    this.f61303zy.add(i2, c2775fRemoveFirst);
                    i2++;
                }
            } else {
                this.f16546k.remove(c2775fRemoveFirst.m9713g());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    protected boolean m9811s(RunnableFuture<?> jobTask, C2775f jobInfo) {
        if (jobInfo.m9718s()) {
            this.f16548p.f61307toq.execute(jobTask);
            return true;
        }
        this.f16548p.f16560k.execute(jobTask);
        return true;
    }

    public void toq(boolean stopRunngingJob) {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        m9805z(0, stopRunngingJob);
        this.f61301ld6.removeMessages(0);
        this.f61301ld6.removeMessages(1);
        this.f16546k.clear();
        this.f61302toq.clear();
        this.f61303zy.clear();
        this.f16549q.clear();
        synchronized (f61295cdj) {
            f61295cdj.removeAll(this.f16547n);
            this.f16547n.clear();
            f61295cdj.notifyAll();
        }
    }

    protected void x2(C2775f jobInfo, C2783g jobResult) {
        if (!jobInfo.m9718s()) {
            synchronized (f61295cdj) {
                f61295cdj.remove(jobInfo.m9715n());
                this.f16547n.remove(jobInfo.m9715n());
                f61295cdj.notifyAll();
            }
        }
        this.f61303zy.remove(jobInfo);
        C2787y c2787yRemove = this.f16546k.remove(jobInfo.m9713g());
        if (c2787yRemove == null || jobResult == null || jobResult.f16555k) {
            return;
        }
        if (jobInfo.m9718s()) {
            m9809p(c2787yRemove.f16559k, jobResult.f61304toq, jobInfo, jobResult.f61305zy);
        } else {
            ld6(c2787yRemove.f16559k, jobResult.f61304toq, jobInfo);
        }
    }

    public void zurt(int maxJobSize) {
        if (maxJobSize <= 0) {
            maxJobSize = 128;
        }
        this.f16545g = maxJobSize;
    }

    protected Bitmap zy(C2775f jobInfo) {
        Bitmap bitmapLd6 = C2763c.ld6(new InputStreamLoader(jobInfo.f61234toq), jobInfo.f16419q, jobInfo.f16418n, jobInfo.f16420y);
        if (bitmapLd6 == null || jobInfo.f61233f7l8 == null) {
            return bitmapLd6;
        }
        int width = bitmapLd6.getWidth();
        int height = bitmapLd6.getHeight();
        C2763c.k kVar = jobInfo.f61233f7l8;
        kVar.f16349g = true;
        return C2763c.a9(bitmapLd6, width, height, kVar);
    }

    public hyr(int maxJobSize) {
        this(maxJobSize, true);
    }

    public hyr(int maxJobSize, boolean fifoExecuteMode) {
        this.f16546k = new HashMap();
        this.f61302toq = new LinkedList<>();
        this.f61303zy = new LinkedList<>();
        this.f16549q = new ConcurrentHashMap();
        this.f16547n = new HashSet();
        this.f16551y = true;
        this.f16548p = f16544h;
        this.f61301ld6 = new HandlerC2784k(Looper.getMainLooper());
        zurt(maxJobSize);
        fn3e(fifoExecuteMode);
    }
}
