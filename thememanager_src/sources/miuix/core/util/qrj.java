package miuix.core.util;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import miuix.core.util.concurrent.C7075k;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    private static final HashMap<Class<?>, C7089q<?>> f39892k = new HashMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final HashMap<Class<?>, C7092y<?>> f87366toq = new HashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC7086g<StringBuilder> f87367zy = m25614q(new C7087k(), 4);

    /* JADX INFO: compiled from: Pools.java */
    public static class f7l8<T> extends toq<T> {
        f7l8(AbstractC7088n<T> abstractC7088n, int i2) {
            super(abstractC7088n, i2);
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ void close() {
            super.close();
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ Object mo25617k() {
            return super.mo25617k();
        }

        @Override // miuix.core.util.qrj.toq
        /* JADX INFO: renamed from: n */
        final void mo25618n(zy<T> zyVar, int i2) {
            qrj.m25611g((C7089q) zyVar, i2);
        }

        @Override // miuix.core.util.qrj.toq
        /* JADX INFO: renamed from: q */
        final zy<T> mo25619q(Class<T> cls, int i2) {
            return qrj.f7l8(cls, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ void toq(Object obj) {
            super.toq(obj);
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ int zy() {
            return super.zy();
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$g */
    /* JADX INFO: compiled from: Pools.java */
    public interface InterfaceC7086g<T> {
        void close();

        /* JADX INFO: renamed from: k */
        T mo25617k();

        void toq(T t2);

        int zy();
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$k */
    /* JADX INFO: compiled from: Pools.java */
    class C7087k extends AbstractC7088n<StringBuilder> {
        C7087k() {
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25542q(StringBuilder sb) {
            sb.setLength(0);
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo25540k() {
            return new StringBuilder();
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$n */
    /* JADX INFO: compiled from: Pools.java */
    public static abstract class AbstractC7088n<T> {
        /* JADX INFO: renamed from: k */
        public abstract T mo25540k();

        /* JADX INFO: renamed from: q */
        public void mo25542q(T t2) {
        }

        public void toq(T t2) {
        }

        public void zy(T t2) {
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$q */
    /* JADX INFO: compiled from: Pools.java */
    private static class C7089q<T> implements zy<T> {

        /* JADX INFO: renamed from: k */
        private final Class<T> f39893k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C7075k<T> f87368toq;

        C7089q(Class<T> cls, int i2) {
            this.f39893k = cls;
            this.f87368toq = new C7075k<>(i2, false, true);
        }

        @Override // miuix.core.util.qrj.zy
        public T get() {
            return this.f87368toq.get();
        }

        @Override // miuix.core.util.qrj.zy
        /* JADX INFO: renamed from: k */
        public Class<T> mo25622k() {
            return this.f39893k;
        }

        @Override // miuix.core.util.qrj.zy
        public boolean put(T t2) {
            return this.f87368toq.put(t2);
        }

        @Override // miuix.core.util.qrj.zy
        public synchronized void toq(int i2) {
            int iMo25526k = i2 + this.f87368toq.mo25526k();
            if (iMo25526k <= 0) {
                synchronized (qrj.f39892k) {
                    qrj.f39892k.remove(mo25622k());
                }
            } else {
                if (iMo25526k > 0) {
                    this.f87368toq.m25527q(iMo25526k);
                } else {
                    this.f87368toq.zy(-iMo25526k);
                }
            }
        }

        @Override // miuix.core.util.qrj.zy
        public int zy() {
            return this.f87368toq.mo25526k();
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$s */
    /* JADX INFO: compiled from: Pools.java */
    public static class C7090s<T> extends toq<T> {
        C7090s(AbstractC7088n<T> abstractC7088n, int i2) {
            super(abstractC7088n, i2);
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ void close() {
            super.close();
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ Object mo25617k() {
            return super.mo25617k();
        }

        @Override // miuix.core.util.qrj.toq
        /* JADX INFO: renamed from: n */
        final void mo25618n(zy<T> zyVar, int i2) {
            qrj.m25616y((C7092y) zyVar, i2);
        }

        @Override // miuix.core.util.qrj.toq
        /* JADX INFO: renamed from: q */
        final zy<T> mo25619q(Class<T> cls, int i2) {
            return qrj.m25615s(cls, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ void toq(Object obj) {
            super.toq(obj);
        }

        @Override // miuix.core.util.qrj.toq, miuix.core.util.qrj.InterfaceC7086g
        public /* bridge */ /* synthetic */ int zy() {
            return super.zy();
        }
    }

    /* JADX INFO: compiled from: Pools.java */
    static abstract class toq<T> implements InterfaceC7086g<T> {

        /* JADX INFO: renamed from: k */
        private final AbstractC7088n<T> f39894k;

        /* JADX INFO: renamed from: q */
        private final Object f39895q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f87369toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private zy<T> f87370zy;

        /* JADX INFO: renamed from: miuix.core.util.qrj$toq$k */
        /* JADX INFO: compiled from: Pools.java */
        class C7091k {
            C7091k() {
            }

            protected void finalize() throws Throwable {
                try {
                    toq.this.close();
                } finally {
                    super.finalize();
                }
            }
        }

        public toq(AbstractC7088n<T> abstractC7088n, int i2) {
            C7091k c7091k = new C7091k();
            this.f39895q = c7091k;
            if (abstractC7088n == null || i2 < 1) {
                this.f87369toq = c7091k.hashCode();
                throw new IllegalArgumentException("manager cannot be null and size cannot less then 1");
            }
            this.f39894k = abstractC7088n;
            this.f87369toq = i2;
            T tMo25540k = abstractC7088n.mo25540k();
            if (tMo25540k == null) {
                throw new IllegalStateException("manager create instance cannot return null");
            }
            this.f87370zy = mo25619q(tMo25540k.getClass(), i2);
            f7l8(tMo25540k);
        }

        @Override // miuix.core.util.qrj.InterfaceC7086g
        public void close() {
            zy<T> zyVar = this.f87370zy;
            if (zyVar != null) {
                mo25618n(zyVar, this.f87369toq);
                this.f87370zy = null;
            }
        }

        protected final void f7l8(T t2) {
            if (this.f87370zy == null) {
                throw new IllegalStateException("Cannot release object after close()");
            }
            if (t2 == null) {
                return;
            }
            this.f39894k.mo25542q(t2);
            if (this.f87370zy.put(t2)) {
                return;
            }
            this.f39894k.zy(t2);
        }

        /* JADX INFO: renamed from: g */
        protected final T m25623g() {
            zy<T> zyVar = this.f87370zy;
            if (zyVar == null) {
                throw new IllegalStateException("Cannot acquire object after close()");
            }
            T tMo25540k = zyVar.get();
            if (tMo25540k == null && (tMo25540k = this.f39894k.mo25540k()) == null) {
                throw new IllegalStateException("manager create instance cannot return null");
            }
            this.f39894k.toq(tMo25540k);
            return tMo25540k;
        }

        @Override // miuix.core.util.qrj.InterfaceC7086g
        /* JADX INFO: renamed from: k */
        public T mo25617k() {
            return m25623g();
        }

        /* JADX INFO: renamed from: n */
        abstract void mo25618n(zy<T> zyVar, int i2);

        /* JADX INFO: renamed from: q */
        abstract zy<T> mo25619q(Class<T> cls, int i2);

        @Override // miuix.core.util.qrj.InterfaceC7086g
        public void toq(T t2) {
            f7l8(t2);
        }

        @Override // miuix.core.util.qrj.InterfaceC7086g
        public int zy() {
            if (this.f87370zy == null) {
                return 0;
            }
            return this.f87369toq;
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.qrj$y */
    /* JADX INFO: compiled from: Pools.java */
    private static class C7092y<T> implements zy<T> {

        /* JADX INFO: renamed from: k */
        private final Class<T> f39897k;

        /* JADX INFO: renamed from: q */
        private volatile int f39898q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile SoftReference<T>[] f87371toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private volatile int f87372zy = 0;

        C7092y(Class<T> cls, int i2) {
            this.f39897k = cls;
            this.f39898q = i2;
            this.f87371toq = new SoftReference[i2];
        }

        @Override // miuix.core.util.qrj.zy
        public synchronized T get() {
            int i2 = this.f87372zy;
            SoftReference<T>[] softReferenceArr = this.f87371toq;
            while (i2 != 0) {
                i2--;
                SoftReference<T> softReference = softReferenceArr[i2];
                if (softReference != null) {
                    T t2 = softReference.get();
                    softReferenceArr[i2] = null;
                    if (t2 != null) {
                        this.f87372zy = i2;
                        return t2;
                    }
                }
            }
            return null;
        }

        @Override // miuix.core.util.qrj.zy
        /* JADX INFO: renamed from: k */
        public Class<T> mo25622k() {
            return this.f39897k;
        }

        @Override // miuix.core.util.qrj.zy
        public synchronized boolean put(T t2) {
            int i2;
            int i3 = this.f87372zy;
            SoftReference<T>[] softReferenceArr = this.f87371toq;
            if (i3 < this.f39898q) {
                softReferenceArr[i3] = new SoftReference<>(t2);
                this.f87372zy = i3 + 1;
                return true;
            }
            for (0; i2 < i3; i2 + 1) {
                SoftReference<T> softReference = softReferenceArr[i2];
                i2 = (softReference == null || softReference.get() == null) ? 0 : i2 + 1;
                softReferenceArr[i2] = new SoftReference<>(t2);
                return true;
            }
            return false;
        }

        @Override // miuix.core.util.qrj.zy
        public synchronized void toq(int i2) {
            int i3 = i2 + this.f39898q;
            if (i3 <= 0) {
                synchronized (qrj.f87366toq) {
                    qrj.f87366toq.remove(mo25622k());
                }
                return;
            }
            this.f39898q = i3;
            SoftReference<T>[] softReferenceArr = this.f87371toq;
            int i4 = this.f87372zy;
            if (i3 > softReferenceArr.length) {
                SoftReference<T>[] softReferenceArr2 = new SoftReference[i3];
                System.arraycopy(softReferenceArr, 0, softReferenceArr2, 0, i4);
                this.f87371toq = softReferenceArr2;
            }
        }

        @Override // miuix.core.util.qrj.zy
        public int zy() {
            return this.f39898q;
        }
    }

    /* JADX INFO: compiled from: Pools.java */
    private interface zy<T> {
        T get();

        /* JADX INFO: renamed from: k */
        Class<T> mo25622k();

        boolean put(T t2);

        void toq(int i2);

        int zy();
    }

    static <T> C7089q<T> f7l8(Class<T> cls, int i2) {
        zy zyVar;
        HashMap<Class<?>, C7089q<?>> map = f39892k;
        synchronized (map) {
            zyVar = (C7089q<T>) map.get(cls);
            if (zyVar == null) {
                zyVar = (C7089q<T>) new C7089q(cls, i2);
                map.put((Class<?>) cls, (C7089q<?>) zyVar);
            } else {
                zyVar.toq(i2);
            }
        }
        return (C7089q<T>) zyVar;
    }

    /* JADX INFO: renamed from: g */
    static <T> void m25611g(C7089q<T> c7089q, int i2) {
        synchronized (f39892k) {
            c7089q.toq(-i2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC7086g<StringBuilder> m25613n() {
        return f87367zy;
    }

    /* JADX INFO: renamed from: q */
    public static <T> C7090s<T> m25614q(AbstractC7088n<T> abstractC7088n, int i2) {
        return new C7090s<>(abstractC7088n, i2);
    }

    /* JADX INFO: renamed from: s */
    static <T> C7092y<T> m25615s(Class<T> cls, int i2) {
        zy zyVar;
        HashMap<Class<?>, C7092y<?>> map = f87366toq;
        synchronized (map) {
            zyVar = (C7092y<T>) map.get(cls);
            if (zyVar == null) {
                zyVar = (C7092y<T>) new C7092y(cls, i2);
                map.put((Class<?>) cls, (C7092y<?>) zyVar);
            } else {
                zyVar.toq(i2);
            }
        }
        return (C7092y<T>) zyVar;
    }

    /* JADX INFO: renamed from: y */
    static <T> void m25616y(C7092y<T> c7092y, int i2) {
        synchronized (f87366toq) {
            c7092y.toq(-i2);
        }
    }

    public static <T> f7l8<T> zy(AbstractC7088n<T> abstractC7088n, int i2) {
        return new f7l8<>(abstractC7088n, i2);
    }
}
