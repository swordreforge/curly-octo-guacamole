package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 {

    /* JADX INFO: renamed from: n */
    private static final String f5855n = "ChildrenHelper";

    /* JADX INFO: renamed from: q */
    private static final boolean f5856q = false;

    /* JADX INFO: renamed from: k */
    final toq f5857k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final C1077k f52126toq = new C1077k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final List<View> f52127zy = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f7l8$k */
    /* JADX INFO: compiled from: ChildHelper.java */
    static class C1077k {

        /* JADX INFO: renamed from: q */
        static final long f5858q = Long.MIN_VALUE;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final int f52128zy = 64;

        /* JADX INFO: renamed from: k */
        long f5859k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C1077k f52129toq;

        C1077k() {
        }

        private void zy() {
            if (this.f52129toq == null) {
                this.f52129toq = new C1077k();
            }
        }

        void f7l8() {
            this.f5859k = 0L;
            C1077k c1077k = this.f52129toq;
            if (c1077k != null) {
                c1077k.f7l8();
            }
        }

        /* JADX INFO: renamed from: g */
        boolean m4971g(int i2) {
            if (i2 >= 64) {
                zy();
                return this.f52129toq.m4971g(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f5859k;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f5859k = j4;
            long j5 = j2 - 1;
            this.f5859k = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            C1077k c1077k = this.f52129toq;
            if (c1077k != null) {
                if (c1077k.m4974q(0)) {
                    m4975y(63);
                }
                this.f52129toq.m4971g(0);
            }
            return z2;
        }

        /* JADX INFO: renamed from: k */
        void m4972k(int i2) {
            if (i2 < 64) {
                this.f5859k &= ~(1 << i2);
                return;
            }
            C1077k c1077k = this.f52129toq;
            if (c1077k != null) {
                c1077k.m4972k(i2 - 64);
            }
        }

        /* JADX INFO: renamed from: n */
        void m4973n(int i2, boolean z2) {
            if (i2 >= 64) {
                zy();
                this.f52129toq.m4973n(i2 - 64, z2);
                return;
            }
            long j2 = this.f5859k;
            boolean z3 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f5859k = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z2) {
                m4975y(i2);
            } else {
                m4972k(i2);
            }
            if (z3 || this.f52129toq != null) {
                zy();
                this.f52129toq.m4973n(0, z3);
            }
        }

        /* JADX INFO: renamed from: q */
        boolean m4974q(int i2) {
            if (i2 < 64) {
                return (this.f5859k & (1 << i2)) != 0;
            }
            zy();
            return this.f52129toq.m4974q(i2 - 64);
        }

        public String toString() {
            if (this.f52129toq == null) {
                return Long.toBinaryString(this.f5859k);
            }
            return this.f52129toq.toString() + "xx" + Long.toBinaryString(this.f5859k);
        }

        int toq(int i2) {
            C1077k c1077k = this.f52129toq;
            return c1077k == null ? i2 >= 64 ? Long.bitCount(this.f5859k) : Long.bitCount(this.f5859k & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.f5859k & ((1 << i2) - 1)) : c1077k.toq(i2 - 64) + Long.bitCount(this.f5859k);
        }

        /* JADX INFO: renamed from: y */
        void m4975y(int i2) {
            if (i2 < 64) {
                this.f5859k |= 1 << i2;
            } else {
                zy();
                this.f52129toq.m4975y(i2 - 64);
            }
        }
    }

    /* JADX INFO: compiled from: ChildHelper.java */
    interface toq {
        void f7l8();

        /* JADX INFO: renamed from: g */
        void mo4825g(View view, int i2);

        /* JADX INFO: renamed from: k */
        View mo4826k(int i2);

        void ld6(View view, int i2, ViewGroup.LayoutParams layoutParams);

        /* JADX INFO: renamed from: n */
        void mo4827n(int i2);

        /* JADX INFO: renamed from: p */
        void mo4828p(int i2);

        /* JADX INFO: renamed from: q */
        RecyclerView.fti mo4829q(View view);

        /* JADX INFO: renamed from: s */
        void mo4830s(View view);

        void toq(View view);

        /* JADX INFO: renamed from: y */
        int mo4831y(View view);

        int zy();
    }

    f7l8(toq toqVar) {
        this.f5857k = toqVar;
    }

    /* JADX INFO: renamed from: i */
    private boolean m4962i(View view) {
        if (!this.f52127zy.remove(view)) {
            return false;
        }
        this.f5857k.mo4830s(view);
        return true;
    }

    private void x2(View view) {
        this.f52127zy.add(view);
        this.f5857k.toq(view);
    }

    /* JADX INFO: renamed from: y */
    private int m4963y(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iZy = this.f5857k.zy();
        int i3 = i2;
        while (i3 < iZy) {
            int qVar = i2 - (i3 - this.f52126toq.toq(i3));
            if (qVar == 0) {
                while (this.f52126toq.m4974q(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += qVar;
        }
        return -1;
    }

    void cdj(int i2) {
        int iM4963y = m4963y(i2);
        View viewMo4826k = this.f5857k.mo4826k(iM4963y);
        if (viewMo4826k == null) {
            return;
        }
        if (this.f52126toq.m4971g(iM4963y)) {
            m4962i(viewMo4826k);
        }
        this.f5857k.mo4828p(iM4963y);
    }

    int f7l8() {
        return this.f5857k.zy() - this.f52127zy.size();
    }

    /* JADX INFO: renamed from: g */
    View m4964g(int i2) {
        return this.f5857k.mo4826k(m4963y(i2));
    }

    /* JADX INFO: renamed from: h */
    void m4965h(View view) {
        int iMo4831y = this.f5857k.mo4831y(view);
        if (iMo4831y < 0) {
            return;
        }
        if (this.f52126toq.m4971g(iMo4831y)) {
            m4962i(view);
        }
        this.f5857k.mo4828p(iMo4831y);
    }

    /* JADX INFO: renamed from: k */
    void m4966k(View view, int i2, boolean z2) {
        int iZy = i2 < 0 ? this.f5857k.zy() : m4963y(i2);
        this.f52126toq.m4973n(iZy, z2);
        if (z2) {
            x2(view);
        }
        this.f5857k.mo4825g(view, iZy);
    }

    boolean ki(View view) {
        int iMo4831y = this.f5857k.mo4831y(view);
        if (iMo4831y == -1) {
            m4962i(view);
            return true;
        }
        if (!this.f52126toq.m4974q(iMo4831y)) {
            return false;
        }
        this.f52126toq.m4971g(iMo4831y);
        m4962i(view);
        this.f5857k.mo4828p(iMo4831y);
        return true;
    }

    void kja0() {
        this.f52126toq.f7l8();
        for (int size = this.f52127zy.size() - 1; size >= 0; size--) {
            this.f5857k.mo4830s(this.f52127zy.get(size));
            this.f52127zy.remove(size);
        }
        this.f5857k.f7l8();
    }

    void ld6(View view) {
        int iMo4831y = this.f5857k.mo4831y(view);
        if (iMo4831y >= 0) {
            this.f52126toq.m4975y(iMo4831y);
            x2(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: n */
    View m4967n(int i2) {
        int size = this.f52127zy.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f52127zy.get(i3);
            RecyclerView.fti ftiVarMo4829q = this.f5857k.mo4829q(view);
            if (ftiVarMo4829q.getLayoutPosition() == i2 && !ftiVarMo4829q.isInvalid() && !ftiVarMo4829q.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    boolean n7h(View view) {
        return this.f52127zy.contains(view);
    }

    /* JADX INFO: renamed from: p */
    int m4968p() {
        return this.f5857k.zy();
    }

    /* JADX INFO: renamed from: q */
    void m4969q(int i2) {
        int iM4963y = m4963y(i2);
        this.f52126toq.m4971g(iM4963y);
        this.f5857k.mo4827n(iM4963y);
    }

    int qrj(View view) {
        int iMo4831y = this.f5857k.mo4831y(view);
        if (iMo4831y == -1 || this.f52126toq.m4974q(iMo4831y)) {
            return -1;
        }
        return iMo4831y - this.f52126toq.toq(iMo4831y);
    }

    /* JADX INFO: renamed from: s */
    View m4970s(int i2) {
        return this.f5857k.mo4826k(i2);
    }

    void t8r(View view) {
        int iMo4831y = this.f5857k.mo4831y(view);
        if (iMo4831y < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f52126toq.m4974q(iMo4831y)) {
            this.f52126toq.m4972k(iMo4831y);
            m4962i(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f52126toq.toString() + ", hidden list:" + this.f52127zy.size();
    }

    void toq(View view, boolean z2) {
        m4966k(view, -1, z2);
    }

    void zy(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int iZy = i2 < 0 ? this.f5857k.zy() : m4963y(i2);
        this.f52126toq.m4973n(iZy, z2);
        if (z2) {
            x2(view);
        }
        this.f5857k.ld6(view, iZy, layoutParams);
    }
}
