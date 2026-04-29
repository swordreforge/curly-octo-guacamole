package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k */
/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1421k<K, A> {

    /* JADX INFO: renamed from: n */
    @dd
    protected C1517p<A> f7893n;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final q<K> f55922zy;

    /* JADX INFO: renamed from: k */
    final List<toq> f7892k = new ArrayList(1);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f55921toq = false;

    /* JADX INFO: renamed from: q */
    protected float f7894q = 0.0f;

    /* JADX INFO: renamed from: g */
    @dd
    private A f7891g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f55920f7l8 = -1.0f;

    /* JADX INFO: renamed from: y */
    private float f7895y = -1.0f;

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k$g */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    private static final class g<T> implements q<T> {

        /* JADX INFO: renamed from: k */
        @lvui
        private final C1515k<T> f7896k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f55923toq = -1.0f;

        g(List<? extends C1515k<T>> list) {
            this.f7896k = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: k */
        public boolean mo5926k(float f2) {
            if (this.f55923toq == f2) {
                return true;
            }
            this.f55923toq = f2;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: n */
        public float mo5927n() {
            return this.f7896k.toq();
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: q */
        public float mo5928q() {
            return this.f7896k.m6280n();
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public C1515k<T> toq() {
            return this.f7896k;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean zy(float f2) {
            return !this.f7896k.m6282y();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k$n */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    private static final class n<T> implements q<T> {

        /* JADX INFO: renamed from: k */
        private final List<? extends C1515k<T>> f7897k;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private C1515k<T> f55925zy = null;

        /* JADX INFO: renamed from: q */
        private float f7898q = -1.0f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private C1515k<T> f55924toq = m5929g(0.0f);

        n(List<? extends C1515k<T>> list) {
            this.f7897k = list;
        }

        /* JADX INFO: renamed from: g */
        private C1515k<T> m5929g(float f2) {
            List<? extends C1515k<T>> list = this.f7897k;
            C1515k<T> c1515k = list.get(list.size() - 1);
            if (f2 >= c1515k.m6280n()) {
                return c1515k;
            }
            for (int size = this.f7897k.size() - 2; size >= 1; size--) {
                C1515k<T> c1515k2 = this.f7897k.get(size);
                if (this.f55924toq != c1515k2 && c1515k2.m6279k(f2)) {
                    return c1515k2;
                }
            }
            return this.f7897k.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: k */
        public boolean mo5926k(float f2) {
            C1515k<T> c1515k = this.f55925zy;
            C1515k<T> c1515k2 = this.f55924toq;
            if (c1515k == c1515k2 && this.f7898q == f2) {
                return true;
            }
            this.f55925zy = c1515k2;
            this.f7898q = f2;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: n */
        public float mo5927n() {
            return this.f7897k.get(r0.size() - 1).toq();
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: q */
        public float mo5928q() {
            return this.f7897k.get(0).m6280n();
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        @lvui
        public C1515k<T> toq() {
            return this.f55924toq;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean zy(float f2) {
            if (this.f55924toq.m6279k(f2)) {
                return !this.f55924toq.m6282y();
            }
            this.f55924toq = m5929g(f2);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k$q */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    private interface q<T> {
        boolean isEmpty();

        /* JADX INFO: renamed from: k */
        boolean mo5926k(float f2);

        @zurt(from = 0.0d, to = 1.0d)
        /* JADX INFO: renamed from: n */
        float mo5927n();

        @zurt(from = 0.0d, to = 1.0d)
        /* JADX INFO: renamed from: q */
        float mo5928q();

        C1515k<T> toq();

        boolean zy(float f2);
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k$toq */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo5887k();
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.k$zy */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    private static final class zy<T> implements q<T> {
        private zy() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean isEmpty() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: k */
        public boolean mo5926k(float f2) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: n */
        public float mo5927n() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        /* JADX INFO: renamed from: q */
        public float mo5928q() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public C1515k<T> toq() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.q
        public boolean zy(float f2) {
            return false;
        }
    }

    AbstractC1421k(List<? extends C1515k<K>> list) {
        this.f55922zy = kja0(list);
    }

    @zurt(from = 0.0d, to = 1.0d)
    private float f7l8() {
        if (this.f55920f7l8 == -1.0f) {
            this.f55920f7l8 = this.f55922zy.mo5928q();
        }
        return this.f55920f7l8;
    }

    private static <T> q<T> kja0(List<? extends C1515k<T>> list) {
        return list.isEmpty() ? new zy() : list.size() == 1 ? new g(list) : new n(list);
    }

    /* JADX INFO: renamed from: g */
    public float m5921g() {
        return this.f7894q;
    }

    /* JADX INFO: renamed from: k */
    public void m5922k(toq toqVar) {
        this.f7892k.add(toqVar);
    }

    public void ld6() {
        for (int i2 = 0; i2 < this.f7892k.size(); i2++) {
            this.f7892k.get(i2).mo5887k();
        }
    }

    /* JADX INFO: renamed from: n */
    float m5923n() {
        if (this.f55921toq) {
            return 0.0f;
        }
        C1515k<K> qVar = toq();
        if (qVar.m6282y()) {
            return 0.0f;
        }
        return (this.f7894q - qVar.m6280n()) / (qVar.toq() - qVar.m6280n());
    }

    public void n7h(@dd C1517p<A> c1517p) {
        C1517p<A> c1517p2 = this.f7893n;
        if (c1517p2 != null) {
            c1517p2.zy(null);
        }
        this.f7893n = c1517p;
        if (c1517p != null) {
            c1517p.zy(this);
        }
    }

    /* JADX INFO: renamed from: p */
    protected A mo5924p(C1515k<K> c1515k, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: q */
    protected float m5925q() {
        C1515k<K> qVar = toq();
        if (qVar.m6282y()) {
            return 0.0f;
        }
        return qVar.f8304q.getInterpolation(m5923n());
    }

    public void qrj(@zurt(from = 0.0d, to = 1.0d) float f2) {
        if (this.f55922zy.isEmpty()) {
            return;
        }
        if (f2 < f7l8()) {
            f2 = f7l8();
        } else if (f2 > zy()) {
            f2 = zy();
        }
        if (f2 == this.f7894q) {
            return;
        }
        this.f7894q = f2;
        if (this.f55922zy.zy(f2)) {
            ld6();
        }
    }

    /* JADX INFO: renamed from: s */
    abstract A mo5911s(C1515k<K> c1515k, float f2);

    protected C1515k<K> toq() {
        C1476n.m6103k("BaseKeyframeAnimation#getCurrentKeyframe");
        C1515k<K> qVar = this.f55922zy.toq();
        C1476n.toq("BaseKeyframeAnimation#getCurrentKeyframe");
        return qVar;
    }

    public void x2() {
        this.f55921toq = true;
    }

    /* JADX INFO: renamed from: y */
    public A mo5912y() {
        float fM5923n = m5923n();
        if (this.f7893n == null && this.f55922zy.mo5926k(fM5923n)) {
            return this.f7891g;
        }
        C1515k<K> qVar = toq();
        Interpolator interpolator = qVar.f8302n;
        A aMo5911s = (interpolator == null || qVar.f8299g == null) ? mo5911s(qVar, m5925q()) : mo5924p(qVar, fM5923n, interpolator.getInterpolation(fM5923n), qVar.f8299g.getInterpolation(fM5923n));
        this.f7891g = aMo5911s;
        return aMo5911s;
    }

    @zurt(from = 0.0d, to = 1.0d)
    float zy() {
        if (this.f7895y == -1.0f) {
            this.f7895y = this.f55922zy.mo5927n();
        }
        return this.f7895y;
    }
}
