package y2;

import android.app.Activity;
import com.android.thememanager.basemodule.utils.C1807g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import yz.C7794k;

/* JADX INFO: renamed from: y2.k */
/* JADX INFO: compiled from: ActivityCounter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7776k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f100559f7l8 = "k";

    /* JADX INFO: renamed from: s */
    public static C7776k f45905s;

    /* JADX INFO: renamed from: y */
    private static final int f45906y;

    /* JADX INFO: renamed from: g */
    private LinkedBlockingQueue<WeakReference<Activity>> f45907g;

    /* JADX INFO: renamed from: k */
    private LinkedBlockingQueue<WeakReference<Activity>> f45908k;

    /* JADX INFO: renamed from: n */
    private LinkedBlockingQueue<WeakReference<Activity>> f45909n;

    /* JADX INFO: renamed from: q */
    private LinkedBlockingQueue<WeakReference<Activity>> f45910q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private LinkedBlockingQueue<WeakReference<Activity>> f100560toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private LinkedBlockingQueue<WeakReference<Activity>> f100561zy;

    static {
        f45906y = C1807g.a9() ? 1 : 3;
    }

    private C7776k() {
        int i2 = f45906y;
        this.f45908k = new LinkedBlockingQueue<>(i2);
        this.f100560toq = new LinkedBlockingQueue<>(i2);
        this.f100561zy = new LinkedBlockingQueue<>(i2);
        this.f45910q = new LinkedBlockingQueue<>(i2);
        this.f45909n = new LinkedBlockingQueue<>(i2);
        this.f45907g = new LinkedBlockingQueue<>(3);
    }

    /* JADX INFO: renamed from: k */
    private void m28155k(Activity activity, LinkedBlockingQueue<WeakReference<Activity>> queue) {
        Activity activity2;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        int size = queue.size();
        while (true) {
            int i2 = size - 1;
            if (size >= f45906y) {
                WeakReference<Activity> weakReferencePoll = queue.poll();
                if (weakReferencePoll != null && (activity2 = weakReferencePoll.get()) != null && (!activity2.isFinishing() || !activity2.isDestroyed())) {
                    break;
                } else {
                    size = i2;
                }
            } else {
                break;
            }
        }
        activity2.finish();
        C7794k.m28194k(f100559f7l8, "ActivityCounter,finish");
        queue.offer(new WeakReference<>(activity));
    }

    /* JADX INFO: renamed from: s */
    private void m28156s(Activity activity, LinkedBlockingQueue<WeakReference<Activity>> queue) {
        if (activity == null) {
            return;
        }
        Iterator<WeakReference<Activity>> it = queue.iterator();
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (next == null || next.get() == null) {
                it.remove();
            } else if (activity == next.get()) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static C7776k m28157y() {
        if (f45905s == null) {
            synchronized (C7776k.class) {
                if (f45905s == null) {
                    f45905s = new C7776k();
                }
            }
        }
        return f45905s;
    }

    public void f7l8(Activity activity) {
        m28155k(activity, this.f45907g);
    }

    /* JADX INFO: renamed from: g */
    public void m28158g(Activity activity) {
        m28155k(activity, this.f45909n);
    }

    public void kja0(Activity activity) {
        m28156s(activity, this.f45907g);
    }

    public void ld6(Activity activity) {
        m28156s(activity, this.f100561zy);
    }

    /* JADX INFO: renamed from: n */
    public void m28159n(Activity activity) {
        m28155k(activity, this.f45908k);
    }

    public void n7h(Activity activity) {
        m28156s(activity, this.f45909n);
    }

    /* JADX INFO: renamed from: p */
    public void m28160p(Activity activity) {
        m28156s(activity, this.f100560toq);
    }

    /* JADX INFO: renamed from: q */
    public void m28161q(Activity activity) {
        m28155k(activity, this.f45910q);
    }

    public void qrj(Activity activity) {
        m28156s(activity, this.f45908k);
    }

    public void toq(Activity activity) {
        m28155k(activity, this.f100560toq);
    }

    public void x2(Activity activity) {
        m28156s(activity, this.f45910q);
    }

    public void zy(Activity activity) {
        m28155k(activity, this.f100561zy);
    }
}
