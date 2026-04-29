package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.InterfaceC3170n;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import java.util.List;
import java.util.Queue;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ListPreloader.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: g */
    private final InterfaceC2970k<T> f17911g;

    /* JADX INFO: renamed from: i */
    private int f17913i;

    /* JADX INFO: renamed from: k */
    private final int f17914k;

    /* JADX INFO: renamed from: n */
    private final kja0 f17915n;

    /* JADX INFO: renamed from: p */
    private int f17916p;

    /* JADX INFO: renamed from: q */
    private final C2971q f17917q;

    /* JADX INFO: renamed from: s */
    private int f17918s;

    /* JADX INFO: renamed from: y */
    private final toq<T> f17919y;

    /* JADX INFO: renamed from: h */
    private int f17912h = -1;

    /* JADX INFO: renamed from: z */
    private boolean f17920z = true;

    /* JADX INFO: renamed from: com.bumptech.glide.f7l8$k */
    /* JADX INFO: compiled from: ListPreloader.java */
    public interface InterfaceC2970k<U> {
        @lvui
        /* JADX INFO: renamed from: k */
        List<U> m10577k(int i2);

        @dd
        n7h<?> toq(@lvui U u2);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.f7l8$q */
    /* JADX INFO: compiled from: ListPreloader.java */
    private static final class C2971q {

        /* JADX INFO: renamed from: k */
        final Queue<zy> f17921k;

        C2971q(int i2) {
            this.f17921k = com.bumptech.glide.util.kja0.m11225g(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f17921k.offer(new zy());
            }
        }

        /* JADX INFO: renamed from: k */
        public zy m10578k(int i2, int i3) {
            zy zyVarPoll = this.f17921k.poll();
            this.f17921k.offer(zyVarPoll);
            zyVarPoll.f17924q = i2;
            zyVarPoll.f17922k = i3;
            return zyVarPoll;
        }
    }

    /* JADX INFO: compiled from: ListPreloader.java */
    public interface toq<T> {
        @dd
        /* JADX INFO: renamed from: k */
        int[] mo10579k(@lvui T t2, int i2, int i3);
    }

    /* JADX INFO: compiled from: ListPreloader.java */
    private static final class zy implements InterfaceC3175h<Object> {

        /* JADX INFO: renamed from: k */
        int f17922k;

        /* JADX INFO: renamed from: n */
        @dd
        private InterfaceC3170n f17923n;

        /* JADX INFO: renamed from: q */
        int f17924q;

        zy() {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@dd Drawable drawable) {
        }

        @Override // com.bumptech.glide.manager.qrj
        /* JADX INFO: renamed from: k */
        public void mo10580k() {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void kja0(@dd InterfaceC3170n interfaceC3170n) {
            this.f17923n = interfaceC3170n;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        @dd
        public InterfaceC3170n ld6() {
            return this.f17923n;
        }

        @Override // com.bumptech.glide.manager.qrj
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.qrj
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: p */
        public void mo6797p(@dd Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void qrj(@lvui Object obj, @dd InterfaceC3185g<? super Object> interfaceC3185g) {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void t8r(@lvui com.bumptech.glide.request.target.kja0 kja0Var) {
            kja0Var.mo11172q(this.f17924q, this.f17922k);
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void toq(@lvui com.bumptech.glide.request.target.kja0 kja0Var) {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void x2(@dd Drawable drawable) {
        }
    }

    public f7l8(@lvui kja0 kja0Var, @lvui InterfaceC2970k<T> interfaceC2970k, @lvui toq<T> toqVar, int i2) {
        this.f17915n = kja0Var;
        this.f17911g = interfaceC2970k;
        this.f17919y = toqVar;
        this.f17914k = i2;
        this.f17917q = new C2971q(i2 + 1);
    }

    /* JADX INFO: renamed from: k */
    private void m10574k() {
        for (int i2 = 0; i2 < this.f17917q.f17921k.size(); i2++) {
            this.f17915n.wvg(this.f17917q.m10578k(0, 0));
        }
    }

    /* JADX INFO: renamed from: n */
    private void m10575n(@dd T t2, int i2, int i3) {
        int[] iArrMo10579k;
        n7h<?> qVar;
        if (t2 == null || (iArrMo10579k = this.f17919y.mo10579k(t2, i2, i3)) == null || (qVar = this.f17911g.toq(t2)) == null) {
            return;
        }
        qVar.yl(this.f17917q.m10578k(iArrMo10579k[0], iArrMo10579k[1]));
    }

    /* JADX INFO: renamed from: q */
    private void m10576q(List<T> list, int i2, boolean z2) {
        int size = list.size();
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                m10575n(list.get(i3), i2, i3);
            }
            return;
        }
        for (int i4 = size - 1; i4 >= 0; i4--) {
            m10575n(list.get(i4), i2, i4);
        }
    }

    private void toq(int i2, int i3) {
        int iMin;
        int iMax;
        if (i2 < i3) {
            iMax = Math.max(this.f17918s, i2);
            iMin = i3;
        } else {
            iMin = Math.min(this.f17916p, i2);
            iMax = i3;
        }
        int iMin2 = Math.min(this.f17913i, iMin);
        int iMin3 = Math.min(this.f17913i, Math.max(0, iMax));
        if (i2 < i3) {
            for (int i4 = iMin3; i4 < iMin2; i4++) {
                m10576q(this.f17911g.m10577k(i4), i4, true);
            }
        } else {
            for (int i5 = iMin2 - 1; i5 >= iMin3; i5--) {
                m10576q(this.f17911g.m10577k(i5), i5, false);
            }
        }
        this.f17916p = iMin3;
        this.f17918s = iMin2;
    }

    private void zy(int i2, boolean z2) {
        if (this.f17920z != z2) {
            this.f17920z = z2;
            m10574k();
        }
        toq(i2, (z2 ? this.f17914k : -this.f17914k) + i2);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        if (this.f17913i == 0 && i4 == 0) {
            return;
        }
        this.f17913i = i4;
        int i5 = this.f17912h;
        if (i2 > i5) {
            zy(i3 + i2, true);
        } else if (i2 < i5) {
            zy(i2, false);
        }
        this.f17912h = i2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
