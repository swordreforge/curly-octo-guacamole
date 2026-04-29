package androidx.core.util;

import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj {

    /* JADX INFO: renamed from: androidx.core.util.qrj$k */
    /* JADX INFO: compiled from: Pools.java */
    public interface InterfaceC0641k<T> {
        @dd
        /* JADX INFO: renamed from: k */
        T mo2983k();

        boolean toq(@lvui T t2);
    }

    /* JADX INFO: compiled from: Pools.java */
    public static class toq<T> implements InterfaceC0641k<T> {

        /* JADX INFO: renamed from: k */
        private final Object[] f3890k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50634toq;

        public toq(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3890k = new Object[i2];
        }

        private boolean zy(@lvui T t2) {
            for (int i2 = 0; i2 < this.f50634toq; i2++) {
                if (this.f3890k[i2] == t2) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.qrj.InterfaceC0641k
        /* JADX INFO: renamed from: k */
        public T mo2983k() {
            int i2 = this.f50634toq;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f3890k;
            T t2 = (T) objArr[i3];
            objArr[i3] = null;
            this.f50634toq = i2 - 1;
            return t2;
        }

        @Override // androidx.core.util.qrj.InterfaceC0641k
        public boolean toq(@lvui T t2) {
            if (zy(t2)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i2 = this.f50634toq;
            Object[] objArr = this.f3890k;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t2;
            this.f50634toq = i2 + 1;
            return true;
        }
    }

    /* JADX INFO: compiled from: Pools.java */
    public static class zy<T> extends toq<T> {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Object f50635zy;

        public zy(int i2) {
            super(i2);
            this.f50635zy = new Object();
        }

        @Override // androidx.core.util.qrj.toq, androidx.core.util.qrj.InterfaceC0641k
        /* JADX INFO: renamed from: k */
        public T mo2983k() {
            T t2;
            synchronized (this.f50635zy) {
                t2 = (T) super.mo2983k();
            }
            return t2;
        }

        @Override // androidx.core.util.qrj.toq, androidx.core.util.qrj.InterfaceC0641k
        public boolean toq(@lvui T t2) {
            boolean qVar;
            synchronized (this.f50635zy) {
                qVar = super.toq(t2);
            }
            return qVar;
        }
    }

    private qrj() {
    }
}
