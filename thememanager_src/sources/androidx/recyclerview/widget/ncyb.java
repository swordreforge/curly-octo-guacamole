package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ViewTypeStorage.java */
/* JADX INFO: loaded from: classes.dex */
interface ncyb {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ncyb$k */
    /* JADX INFO: compiled from: ViewTypeStorage.java */
    public static class C1101k implements ncyb {

        /* JADX INFO: renamed from: k */
        SparseArray<fu4> f5989k = new SparseArray<>();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52227toq = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ncyb$k$k */
        /* JADX INFO: compiled from: ViewTypeStorage.java */
        class k implements zy {

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final fu4 f52229zy;

            /* JADX INFO: renamed from: k */
            private SparseIntArray f5990k = new SparseIntArray(1);

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private SparseIntArray f52228toq = new SparseIntArray(1);

            k(fu4 fu4Var) {
                this.f52229zy = fu4Var;
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            /* JADX INFO: renamed from: n */
            public int mo5075n(int i2) {
                int iIndexOfKey = this.f5990k.indexOfKey(i2);
                if (iIndexOfKey > -1) {
                    return this.f5990k.valueAt(iIndexOfKey);
                }
                int iZy = C1101k.this.zy(this.f52229zy);
                this.f5990k.put(i2, iZy);
                this.f52228toq.put(iZy, i2);
                return iZy;
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            /* JADX INFO: renamed from: q */
            public int mo5076q(int i2) {
                int iIndexOfKey = this.f52228toq.indexOfKey(i2);
                if (iIndexOfKey >= 0) {
                    return this.f52228toq.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.f52229zy.f52131zy);
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            public void zy() {
                C1101k.this.m5074q(this.f52229zy);
            }
        }

        @Override // androidx.recyclerview.widget.ncyb
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public fu4 mo5073k(int i2) {
            fu4 fu4Var = this.f5989k.get(i2);
            if (fu4Var != null) {
                return fu4Var;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
        }

        /* JADX INFO: renamed from: q */
        void m5074q(@zy.lvui fu4 fu4Var) {
            for (int size = this.f5989k.size() - 1; size >= 0; size--) {
                if (this.f5989k.valueAt(size) == fu4Var) {
                    this.f5989k.removeAt(size);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ncyb
        @zy.lvui
        public zy toq(@zy.lvui fu4 fu4Var) {
            return new k(fu4Var);
        }

        int zy(fu4 fu4Var) {
            int i2 = this.f52227toq;
            this.f52227toq = i2 + 1;
            this.f5989k.put(i2, fu4Var);
            return i2;
        }
    }

    /* JADX INFO: compiled from: ViewTypeStorage.java */
    public static class toq implements ncyb {

        /* JADX INFO: renamed from: k */
        SparseArray<List<fu4>> f5992k = new SparseArray<>();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ncyb$toq$k */
        /* JADX INFO: compiled from: ViewTypeStorage.java */
        class C1102k implements zy {

            /* JADX INFO: renamed from: k */
            final fu4 f5993k;

            C1102k(fu4 fu4Var) {
                this.f5993k = fu4Var;
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            /* JADX INFO: renamed from: n */
            public int mo5075n(int i2) {
                List<fu4> arrayList = toq.this.f5992k.get(i2);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    toq.this.f5992k.put(i2, arrayList);
                }
                if (!arrayList.contains(this.f5993k)) {
                    arrayList.add(this.f5993k);
                }
                return i2;
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            /* JADX INFO: renamed from: q */
            public int mo5076q(int i2) {
                return i2;
            }

            @Override // androidx.recyclerview.widget.ncyb.zy
            public void zy() {
                toq.this.zy(this.f5993k);
            }
        }

        @Override // androidx.recyclerview.widget.ncyb
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public fu4 mo5073k(int i2) {
            List<fu4> list = this.f5992k.get(i2);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
        }

        @Override // androidx.recyclerview.widget.ncyb
        @zy.lvui
        public zy toq(@zy.lvui fu4 fu4Var) {
            return new C1102k(fu4Var);
        }

        void zy(@zy.lvui fu4 fu4Var) {
            for (int size = this.f5992k.size() - 1; size >= 0; size--) {
                List<fu4> listValueAt = this.f5992k.valueAt(size);
                if (listValueAt.remove(fu4Var) && listValueAt.isEmpty()) {
                    this.f5992k.removeAt(size);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewTypeStorage.java */
    public interface zy {
        /* JADX INFO: renamed from: n */
        int mo5075n(int i2);

        /* JADX INFO: renamed from: q */
        int mo5076q(int i2);

        void zy();
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    fu4 mo5073k(int i2);

    @zy.lvui
    zy toq(@zy.lvui fu4 fu4Var);
}
