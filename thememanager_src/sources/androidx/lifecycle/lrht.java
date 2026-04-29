package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class lrht {

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final Map<String, Object> f5097k;

    /* JADX INFO: renamed from: n */
    private volatile boolean f5098n;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private final Set<Closeable> f5099q;

    public lrht() {
        this.f5097k = new HashMap();
        this.f5099q = new LinkedHashSet();
        this.f5098n = false;
    }

    private static void dd(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    <T> T m4452l(String str, T t2) {
        Object obj;
        synchronized (this.f5097k) {
            obj = this.f5097k.get(str);
            if (obj == null) {
                this.f5097k.put(str, t2);
            }
        }
        if (obj != null) {
            t2 = (T) obj;
        }
        if (this.f5098n) {
            dd(t2);
        }
        return t2;
    }

    public void lvui(@zy.lvui Closeable closeable) {
        Set<Closeable> set = this.f5099q;
        if (set != null) {
            synchronized (set) {
                this.f5099q.add(closeable);
            }
        }
    }

    protected void ncyb() {
    }

    @zy.oc
    /* JADX INFO: renamed from: r */
    final void m4453r() {
        this.f5098n = true;
        Map<String, Object> map = this.f5097k;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f5097k.values().iterator();
                while (it.hasNext()) {
                    dd(it.next());
                }
            }
        }
        Set<Closeable> set = this.f5099q;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f5099q.iterator();
                while (it2.hasNext()) {
                    dd(it2.next());
                }
            }
        }
        ncyb();
    }

    <T> T x9kr(String str) {
        T t2;
        Map<String, Object> map = this.f5097k;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t2 = (T) this.f5097k.get(str);
        }
        return t2;
    }

    public lrht(@zy.lvui Closeable... closeableArr) {
        this.f5097k = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5099q = linkedHashSet;
        this.f5098n = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}
