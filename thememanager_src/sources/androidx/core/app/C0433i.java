package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.app.i */
/* JADX INFO: compiled from: FrameMetricsAggregator.java */
/* JADX INFO: loaded from: classes.dex */
public class C0433i {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50072cdj = 32;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50073f7l8 = 5;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50074fn3e = 511;

    /* JADX INFO: renamed from: g */
    public static final int f3182g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f3183h = 16;

    /* JADX INFO: renamed from: i */
    public static final int f3184i = 256;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50075ki = 64;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50076kja0 = 8;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f50077ld6 = 8;

    /* JADX INFO: renamed from: n */
    public static final int f3185n = 3;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50078n7h = 4;

    /* JADX INFO: renamed from: p */
    public static final int f3186p = 8;

    /* JADX INFO: renamed from: q */
    public static final int f3187q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50079qrj = 2;

    /* JADX INFO: renamed from: s */
    public static final int f3188s = 7;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50080t8r = 128;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50081toq = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50082x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final int f3189y = 6;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50083zy = 1;

    /* JADX INFO: renamed from: k */
    private final toq f3190k;

    /* JADX INFO: renamed from: androidx.core.app.i$k */
    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    @zy.hyr(24)
    private static class k extends toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static HandlerThread f50084f7l8 = null;

        /* JADX INFO: renamed from: g */
        private static final int f3191g = 500000;

        /* JADX INFO: renamed from: n */
        private static final int f3192n = 1000000;

        /* JADX INFO: renamed from: y */
        private static Handler f3193y;

        /* JADX INFO: renamed from: k */
        int f3194k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        SparseIntArray[] f50085toq = new SparseIntArray[9];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f50086zy = new ArrayList<>();

        /* JADX INFO: renamed from: q */
        Window.OnFrameMetricsAvailableListener f3195q = new WindowOnFrameMetricsAvailableListenerC7859k();

        /* JADX INFO: renamed from: androidx.core.app.i$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FrameMetricsAggregator.java */
        class WindowOnFrameMetricsAvailableListenerC7859k implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC7859k() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                k kVar = k.this;
                if ((kVar.f3194k & 1) != 0) {
                    kVar.m1894g(kVar.f50085toq[0], frameMetrics.getMetric(8));
                }
                k kVar2 = k.this;
                if ((kVar2.f3194k & 2) != 0) {
                    kVar2.m1894g(kVar2.f50085toq[1], frameMetrics.getMetric(1));
                }
                k kVar3 = k.this;
                if ((kVar3.f3194k & 4) != 0) {
                    kVar3.m1894g(kVar3.f50085toq[2], frameMetrics.getMetric(3));
                }
                k kVar4 = k.this;
                if ((kVar4.f3194k & 8) != 0) {
                    kVar4.m1894g(kVar4.f50085toq[3], frameMetrics.getMetric(4));
                }
                k kVar5 = k.this;
                if ((kVar5.f3194k & 16) != 0) {
                    kVar5.m1894g(kVar5.f50085toq[4], frameMetrics.getMetric(5));
                }
                k kVar6 = k.this;
                if ((kVar6.f3194k & 64) != 0) {
                    kVar6.m1894g(kVar6.f50085toq[6], frameMetrics.getMetric(7));
                }
                k kVar7 = k.this;
                if ((kVar7.f3194k & 32) != 0) {
                    kVar7.m1894g(kVar7.f50085toq[5], frameMetrics.getMetric(6));
                }
                k kVar8 = k.this;
                if ((kVar8.f3194k & 128) != 0) {
                    kVar8.m1894g(kVar8.f50085toq[7], frameMetrics.getMetric(0));
                }
                k kVar9 = k.this;
                if ((kVar9.f3194k & 256) != 0) {
                    kVar9.m1894g(kVar9.f50085toq[8], frameMetrics.getMetric(2));
                }
            }
        }

        k(int i2) {
            this.f3194k = i2;
        }

        /* JADX INFO: renamed from: g */
        void m1894g(SparseIntArray sparseIntArray, long j2) {
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + j2) / 1000000);
                if (j2 >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }

        @Override // androidx.core.app.C0433i.toq
        /* JADX INFO: renamed from: k */
        public void mo1895k(Activity activity) {
            if (f50084f7l8 == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f50084f7l8 = handlerThread;
                handlerThread.start();
                f3193y = new Handler(f50084f7l8.getLooper());
            }
            for (int i2 = 0; i2 <= 8; i2++) {
                SparseIntArray[] sparseIntArrayArr = this.f50085toq;
                if (sparseIntArrayArr[i2] == null && (this.f3194k & (1 << i2)) != 0) {
                    sparseIntArrayArr[i2] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3195q, f3193y);
            this.f50086zy.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.C0433i.toq
        /* JADX INFO: renamed from: n */
        public SparseIntArray[] mo1896n() {
            for (int size = this.f50086zy.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f50086zy.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3195q);
                    this.f50086zy.remove(size);
                }
            }
            return this.f50085toq;
        }

        @Override // androidx.core.app.C0433i.toq
        /* JADX INFO: renamed from: q */
        public SparseIntArray[] mo1897q() {
            SparseIntArray[] sparseIntArrayArr = this.f50085toq;
            this.f50085toq = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.C0433i.toq
        public SparseIntArray[] toq() {
            return this.f50085toq;
        }

        @Override // androidx.core.app.C0433i.toq
        public SparseIntArray[] zy(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f50086zy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f50086zy.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3195q);
            return this.f50085toq;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.i$toq */
    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    private static class toq {
        toq() {
        }

        /* JADX INFO: renamed from: k */
        public void mo1895k(Activity activity) {
        }

        /* JADX INFO: renamed from: n */
        public SparseIntArray[] mo1896n() {
            return null;
        }

        /* JADX INFO: renamed from: q */
        public SparseIntArray[] mo1897q() {
            return null;
        }

        public SparseIntArray[] toq() {
            return null;
        }

        public SparseIntArray[] zy(Activity activity) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.i$zy */
    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    public C0433i() {
        this(1);
    }

    /* JADX INFO: renamed from: k */
    public void m1891k(@zy.lvui Activity activity) {
        this.f3190k.mo1895k(activity);
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public SparseIntArray[] m1892n() {
        return this.f3190k.mo1896n();
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public SparseIntArray[] m1893q() {
        return this.f3190k.mo1897q();
    }

    @zy.dd
    public SparseIntArray[] toq() {
        return this.f3190k.toq();
    }

    @zy.dd
    public SparseIntArray[] zy(@zy.lvui Activity activity) {
        return this.f3190k.zy(activity);
    }

    public C0433i(int i2) {
        this.f3190k = new k(i2);
    }
}
