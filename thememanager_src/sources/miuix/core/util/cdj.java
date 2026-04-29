package miuix.core.util;

import java.lang.ref.SoftReference;
import zy.lvui;

/* JADX INFO: compiled from: SoftReferenceSingleton.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cdj<T> {

    /* JADX INFO: renamed from: k */
    private SoftReference<T> f39850k = null;

    /* JADX INFO: renamed from: g */
    protected void mo25522g(@lvui T t2, Object obj) {
    }

    /* JADX INFO: renamed from: k */
    protected T m25523k() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    protected void m25524n(@lvui T t2) {
    }

    /* JADX INFO: renamed from: q */
    public final T m25525q(Object obj) {
        T qVar;
        synchronized (this) {
            SoftReference<T> softReference = this.f39850k;
            if (softReference == null || (qVar = softReference.get()) == null) {
                qVar = toq(obj);
                this.f39850k = new SoftReference<>(qVar);
            } else {
                mo25522g(qVar, obj);
            }
        }
        return qVar;
    }

    protected T toq(Object obj) {
        return null;
    }

    public final T zy() {
        T tM25523k;
        synchronized (this) {
            SoftReference<T> softReference = this.f39850k;
            if (softReference == null || (tM25523k = softReference.get()) == null) {
                tM25523k = m25523k();
                this.f39850k = new SoftReference<>(tM25523k);
            } else {
                m25524n(tM25523k);
            }
        }
        return tM25523k;
    }
}
