package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ld6;
import androidx.recyclerview.widget.zy;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: compiled from: AsyncListDiffer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1108q<T> {

    /* JADX INFO: renamed from: y */
    private static final Executor f6059y = new zy();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int f52256f7l8;

    /* JADX INFO: renamed from: g */
    @zy.lvui
    private List<T> f6060g;

    /* JADX INFO: renamed from: k */
    private final zurt f6061k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private List<T> f6062n;

    /* JADX INFO: renamed from: q */
    private final List<toq<T>> f6063q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final androidx.recyclerview.widget.zy<T> f52257toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    Executor f52258zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.q$k */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Runnable f6064g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f6065k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f6066n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ List f6067q;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AsyncListDiffer.java */
        class C7891k extends ld6.toq {
            C7891k() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: k */
            public boolean mo4703k(int i2, int i3) {
                Object obj = k.this.f6065k.get(i2);
                Object obj2 = k.this.f6067q.get(i3);
                if (obj != null && obj2 != null) {
                    return C1108q.this.f52257toq.toq().mo5028k(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: n */
            public int mo4704n() {
                return k.this.f6065k.size();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: q */
            public int mo4705q() {
                return k.this.f6067q.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.ld6.toq
            public boolean toq(int i2, int i3) {
                Object obj = k.this.f6065k.get(i2);
                Object obj2 = k.this.f6067q.get(i3);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C1108q.this.f52257toq.toq().toq(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.ld6.toq
            @zy.dd
            public Object zy(int i2, int i3) {
                Object obj = k.this.f6065k.get(i2);
                Object obj2 = k.this.f6067q.get(i3);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C1108q.this.f52257toq.toq().zy(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.q$k$toq */
        /* JADX INFO: compiled from: AsyncListDiffer.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ld6.C1094n f6070k;

            toq(ld6.C1094n c1094n) {
                this.f6070k = c1094n;
            }

            @Override // java.lang.Runnable
            public void run() {
                k kVar = k.this;
                C1108q c1108q = C1108q.this;
                if (c1108q.f52256f7l8 == kVar.f6066n) {
                    c1108q.zy(kVar.f6067q, this.f6070k, kVar.f6064g);
                }
            }
        }

        k(List list, List list2, int i2, Runnable runnable) {
            this.f6065k = list;
            this.f6067q = list2;
            this.f6066n = i2;
            this.f6064g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1108q.this.f52258zy.execute(new toq(ld6.toq(new C7891k())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.q$toq */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public interface toq<T> {
        /* JADX INFO: renamed from: k */
        void mo4976k(@zy.lvui List<T> list, @zy.lvui List<T> list2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.q$zy */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    private static class zy implements Executor {

        /* JADX INFO: renamed from: k */
        final Handler f6072k = new Handler(Looper.getMainLooper());

        zy() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@zy.lvui Runnable runnable) {
            this.f6072k.post(runnable);
        }
    }

    public C1108q(@zy.lvui RecyclerView.AbstractC1060y abstractC1060y, @zy.lvui ld6.AbstractC1092g<T> abstractC1092g) {
        this(new androidx.recyclerview.widget.toq(abstractC1060y), new zy.C1118k(abstractC1092g).m5139k());
    }

    /* JADX INFO: renamed from: q */
    private void m5098q(@zy.lvui List<T> list, @zy.dd Runnable runnable) {
        Iterator<toq<T>> it = this.f6063q.iterator();
        while (it.hasNext()) {
            it.next().mo4976k(list, this.f6060g);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void f7l8(@zy.dd List<T> list, @zy.dd Runnable runnable) {
        int i2 = this.f52256f7l8 + 1;
        this.f52256f7l8 = i2;
        List<T> list2 = this.f6062n;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f6060g;
        if (list == null) {
            int size = list2.size();
            this.f6062n = null;
            this.f6060g = Collections.emptyList();
            this.f6061k.toq(0, size);
            m5098q(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f52257toq.m5138k().execute(new k(list2, list, i2, runnable));
            return;
        }
        this.f6062n = list;
        this.f6060g = Collections.unmodifiableList(list);
        this.f6061k.mo4953k(0, list.size());
        m5098q(list3, runnable);
    }

    /* JADX INFO: renamed from: g */
    public void m5099g(@zy.dd List<T> list) {
        f7l8(list, null);
    }

    /* JADX INFO: renamed from: k */
    public void m5100k(@zy.lvui toq<T> toqVar) {
        this.f6063q.add(toqVar);
    }

    /* JADX INFO: renamed from: n */
    public void m5101n(@zy.lvui toq<T> toqVar) {
        this.f6063q.remove(toqVar);
    }

    @zy.lvui
    public List<T> toq() {
        return this.f6060g;
    }

    void zy(@zy.lvui List<T> list, @zy.lvui ld6.C1094n c1094n, @zy.dd Runnable runnable) {
        List<T> list2 = this.f6060g;
        this.f6062n = list;
        this.f6060g = Collections.unmodifiableList(list);
        c1094n.m5035q(this.f6061k);
        m5098q(list2, runnable);
    }

    public C1108q(@zy.lvui zurt zurtVar, @zy.lvui androidx.recyclerview.widget.zy<T> zyVar) {
        this.f6063q = new CopyOnWriteArrayList();
        this.f6060g = Collections.emptyList();
        this.f6061k = zurtVar;
        this.f52257toq = zyVar;
        if (zyVar.zy() != null) {
            this.f52258zy = zyVar.zy();
        } else {
            this.f52258zy = f6059y;
        }
    }
}
