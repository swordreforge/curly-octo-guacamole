package androidx.recyclerview.widget;

import androidx.collection.C0252s;

/* JADX INFO: compiled from: StableIdStorage.java */
/* JADX INFO: loaded from: classes.dex */
interface d2ok {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d2ok$k */
    /* JADX INFO: compiled from: StableIdStorage.java */
    public static class C1070k implements d2ok {

        /* JADX INFO: renamed from: k */
        long f5825k = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d2ok$k$k */
        /* JADX INFO: compiled from: StableIdStorage.java */
        class k implements InterfaceC1071q {

            /* JADX INFO: renamed from: k */
            private final C0252s<Long> f5826k = new C0252s<>();

            k() {
            }

            @Override // androidx.recyclerview.widget.d2ok.InterfaceC1071q
            /* JADX INFO: renamed from: k */
            public long mo4940k(long j2) {
                Long lN7h = this.f5826k.n7h(j2);
                if (lN7h == null) {
                    lN7h = Long.valueOf(C1070k.this.toq());
                    this.f5826k.fn3e(j2, lN7h);
                }
                return lN7h.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.d2ok
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC1071q mo4939k() {
            return new k();
        }

        long toq() {
            long j2 = this.f5825k;
            this.f5825k = 1 + j2;
            return j2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d2ok$q */
    /* JADX INFO: compiled from: StableIdStorage.java */
    public interface InterfaceC1071q {
        /* JADX INFO: renamed from: k */
        long mo4940k(long j2);
    }

    /* JADX INFO: compiled from: StableIdStorage.java */
    public static class toq implements d2ok {

        /* JADX INFO: renamed from: k */
        private final InterfaceC1071q f5827k = new C1072k();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d2ok$toq$k */
        /* JADX INFO: compiled from: StableIdStorage.java */
        class C1072k implements InterfaceC1071q {
            C1072k() {
            }

            @Override // androidx.recyclerview.widget.d2ok.InterfaceC1071q
            /* JADX INFO: renamed from: k */
            public long mo4940k(long j2) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.d2ok
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC1071q mo4939k() {
            return this.f5827k;
        }
    }

    /* JADX INFO: compiled from: StableIdStorage.java */
    public static class zy implements d2ok {

        /* JADX INFO: renamed from: k */
        private final InterfaceC1071q f5829k = new C1073k();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d2ok$zy$k */
        /* JADX INFO: compiled from: StableIdStorage.java */
        class C1073k implements InterfaceC1071q {
            C1073k() {
            }

            @Override // androidx.recyclerview.widget.d2ok.InterfaceC1071q
            /* JADX INFO: renamed from: k */
            public long mo4940k(long j2) {
                return j2;
            }
        }

        @Override // androidx.recyclerview.widget.d2ok
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC1071q mo4939k() {
            return this.f5829k;
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    InterfaceC1071q mo4939k();
}
