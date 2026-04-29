package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3855s;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes2.dex */
final class i1<V> {

    /* JADX INFO: renamed from: k */
    private int f21553k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SparseArray<V> f65413toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3855s<V> f65414zy;

    public i1() {
        this(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.source.bf2
            @Override // com.google.android.exoplayer2.util.InterfaceC3855s
            public final void accept(Object obj) {
                i1.m12736s(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m12736s(Object obj) {
    }

    public V f7l8() {
        return this.f65413toq.valueAt(r0.size() - 1);
    }

    /* JADX INFO: renamed from: g */
    public V m12737g(int i2) {
        if (this.f21553k == -1) {
            this.f21553k = 0;
        }
        while (true) {
            int i3 = this.f21553k;
            if (i3 <= 0 || i2 >= this.f65413toq.keyAt(i3)) {
                break;
            }
            this.f21553k--;
        }
        while (this.f21553k < this.f65413toq.size() - 1 && i2 >= this.f65413toq.keyAt(this.f21553k + 1)) {
            this.f21553k++;
        }
        return this.f65413toq.valueAt(this.f21553k);
    }

    /* JADX INFO: renamed from: n */
    public void m12738n(int i2) {
        int i3 = 0;
        while (i3 < this.f65413toq.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.f65413toq.keyAt(i4)) {
                return;
            }
            this.f65414zy.accept(this.f65413toq.valueAt(i3));
            this.f65413toq.removeAt(i3);
            int i5 = this.f21553k;
            if (i5 > 0) {
                this.f21553k = i5 - 1;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12739q(int i2) {
        for (int size = this.f65413toq.size() - 1; size >= 0 && i2 < this.f65413toq.keyAt(size); size--) {
            this.f65414zy.accept(this.f65413toq.valueAt(size));
            this.f65413toq.removeAt(size);
        }
        this.f21553k = this.f65413toq.size() > 0 ? Math.min(this.f21553k, this.f65413toq.size() - 1) : -1;
    }

    public void toq(int i2, V v2) {
        if (this.f21553k == -1) {
            C3844k.m13633s(this.f65413toq.size() == 0);
            this.f21553k = 0;
        }
        if (this.f65413toq.size() > 0) {
            SparseArray<V> sparseArray = this.f65413toq;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C3844k.m13629k(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                InterfaceC3855s<V> interfaceC3855s = this.f65414zy;
                SparseArray<V> sparseArray2 = this.f65413toq;
                interfaceC3855s.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f65413toq.append(i2, v2);
    }

    /* JADX INFO: renamed from: y */
    public boolean m12740y() {
        return this.f65413toq.size() == 0;
    }

    public void zy() {
        for (int i2 = 0; i2 < this.f65413toq.size(); i2++) {
            this.f65414zy.accept(this.f65413toq.valueAt(i2));
        }
        this.f21553k = -1;
        this.f65413toq.clear();
    }

    public i1(InterfaceC3855s<V> interfaceC3855s) {
        this.f65413toq = new SparseArray<>();
        this.f65414zy = interfaceC3855s;
        this.f21553k = -1;
    }
}
