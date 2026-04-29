package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.C1461k;
import com.airbnb.lottie.utils.C1510q;
import java.util.ArrayList;
import java.util.List;
import zy.zurt;

/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h {

    /* JADX INFO: renamed from: k */
    private final List<C1461k> f8023k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private PointF f56008toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f56009zy;

    public n7h(PointF pointF, boolean z2, List<C1461k> list) {
        this.f56008toq = pointF;
        this.f56009zy = z2;
        this.f8023k = new ArrayList(list);
    }

    /* JADX INFO: renamed from: g */
    public void m6033g(float f2, float f3) {
        if (this.f56008toq == null) {
            this.f56008toq = new PointF();
        }
        this.f56008toq.set(f2, f3);
    }

    /* JADX INFO: renamed from: k */
    public List<C1461k> m6034k() {
        return this.f8023k;
    }

    /* JADX INFO: renamed from: n */
    public void m6035n(boolean z2) {
        this.f56009zy = z2;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6036q() {
        return this.f56009zy;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f8023k.size() + "closed=" + this.f56009zy + '}';
    }

    public PointF toq() {
        return this.f56008toq;
    }

    public void zy(n7h n7hVar, n7h n7hVar2, @zurt(from = 0.0d, to = 1.0d) float f2) {
        if (this.f56008toq == null) {
            this.f56008toq = new PointF();
        }
        this.f56009zy = n7hVar.m6036q() || n7hVar2.m6036q();
        if (n7hVar.m6034k().size() != n7hVar2.m6034k().size()) {
            C1510q.m6255n("Curves must have the same number of control points. Shape 1: " + n7hVar.m6034k().size() + "\tShape 2: " + n7hVar2.m6034k().size());
        }
        int iMin = Math.min(n7hVar.m6034k().size(), n7hVar2.m6034k().size());
        if (this.f8023k.size() < iMin) {
            for (int size = this.f8023k.size(); size < iMin; size++) {
                this.f8023k.add(new C1461k());
            }
        } else if (this.f8023k.size() > iMin) {
            for (int size2 = this.f8023k.size() - 1; size2 >= iMin; size2--) {
                List<C1461k> list = this.f8023k;
                list.remove(list.size() - 1);
            }
        }
        PointF qVar = n7hVar.toq();
        PointF qVar2 = n7hVar2.toq();
        m6033g(com.airbnb.lottie.utils.f7l8.ld6(qVar.x, qVar2.x, f2), com.airbnb.lottie.utils.f7l8.ld6(qVar.y, qVar2.y, f2));
        for (int size3 = this.f8023k.size() - 1; size3 >= 0; size3--) {
            C1461k c1461k = n7hVar.m6034k().get(size3);
            C1461k c1461k2 = n7hVar2.m6034k().get(size3);
            PointF pointFM6061k = c1461k.m6061k();
            PointF qVar3 = c1461k.toq();
            PointF pointFZy = c1461k.zy();
            PointF pointFM6061k2 = c1461k2.m6061k();
            PointF qVar4 = c1461k2.toq();
            PointF pointFZy2 = c1461k2.zy();
            this.f8023k.get(size3).m6063q(com.airbnb.lottie.utils.f7l8.ld6(pointFM6061k.x, pointFM6061k2.x, f2), com.airbnb.lottie.utils.f7l8.ld6(pointFM6061k.y, pointFM6061k2.y, f2));
            this.f8023k.get(size3).m6062n(com.airbnb.lottie.utils.f7l8.ld6(qVar3.x, qVar4.x, f2), com.airbnb.lottie.utils.f7l8.ld6(qVar3.y, qVar4.y, f2));
            this.f8023k.get(size3).f7l8(com.airbnb.lottie.utils.f7l8.ld6(pointFZy.x, pointFZy2.x, f2), com.airbnb.lottie.utils.f7l8.ld6(pointFZy.y, pointFZy2.y, f2));
        }
    }

    public n7h() {
        this.f8023k = new ArrayList();
    }
}
