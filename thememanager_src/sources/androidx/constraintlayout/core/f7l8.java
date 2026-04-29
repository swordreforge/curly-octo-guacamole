package androidx.constraintlayout.core;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final boolean f1413k = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.f7l8$k */
    /* JADX INFO: compiled from: Pools.java */
    interface InterfaceC0262k<T> {
        /* JADX INFO: renamed from: k */
        T mo915k();

        boolean toq(T t2);

        void zy(T[] tArr, int i2);
    }

    /* JADX INFO: compiled from: Pools.java */
    static class toq<T> implements InterfaceC0262k<T> {

        /* JADX INFO: renamed from: k */
        private final Object[] f1414k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f47051toq;

        toq(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1414k = new Object[i2];
        }

        /* JADX INFO: renamed from: q */
        private boolean m916q(T t2) {
            for (int i2 = 0; i2 < this.f47051toq; i2++) {
                if (this.f1414k[i2] == t2) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.f7l8.InterfaceC0262k
        /* JADX INFO: renamed from: k */
        public T mo915k() {
            int i2 = this.f47051toq;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f1414k;
            T t2 = (T) objArr[i3];
            objArr[i3] = null;
            this.f47051toq = i2 - 1;
            return t2;
        }

        @Override // androidx.constraintlayout.core.f7l8.InterfaceC0262k
        public boolean toq(T t2) {
            int i2 = this.f47051toq;
            Object[] objArr = this.f1414k;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t2;
            this.f47051toq = i2 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.f7l8.InterfaceC0262k
        public void zy(T[] tArr, int i2) {
            if (i2 > tArr.length) {
                i2 = tArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                T t2 = tArr[i3];
                int i4 = this.f47051toq;
                Object[] objArr = this.f1414k;
                if (i4 < objArr.length) {
                    objArr[i4] = t2;
                    this.f47051toq = i4 + 1;
                }
            }
        }
    }

    private f7l8() {
    }
}
