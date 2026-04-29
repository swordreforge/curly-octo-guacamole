package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1420h;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.InterfaceC1460g;
import com.airbnb.lottie.model.content.C1450h;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.q */
/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class C1414q implements InterfaceC1412n, n7h, AbstractC1421k.toq, InterfaceC1460g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f55879f7l8;

    /* JADX INFO: renamed from: g */
    private final String f7849g;

    /* JADX INFO: renamed from: k */
    private final Paint f7850k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private C1420h f55880ld6;

    /* JADX INFO: renamed from: n */
    private final RectF f7851n;

    /* JADX INFO: renamed from: p */
    @dd
    private List<n7h> f7852p;

    /* JADX INFO: renamed from: q */
    private final Path f7853q;

    /* JADX INFO: renamed from: s */
    private final C1504r f7854s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final RectF f55881toq;

    /* JADX INFO: renamed from: y */
    private final List<zy> f7855y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix f55882zy;

    public C1414q(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, C1450h c1450h) {
        this(c1504r, toqVar, c1450h.zy(), c1450h.m6014q(), f7l8(c1504r, toqVar, c1450h.toq()), m5898s(c1450h.toq()));
    }

    private static List<zy> f7l8(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, List<com.airbnb.lottie.model.content.zy> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zy zyVarMo6000k = list.get(i2).mo6000k(c1504r, toqVar);
            if (zyVarMo6000k != null) {
                arrayList.add(zyVarMo6000k);
            }
        }
        return arrayList;
    }

    @dd
    /* JADX INFO: renamed from: s */
    static com.airbnb.lottie.model.animatable.x2 m5898s(List<com.airbnb.lottie.model.content.zy> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.airbnb.lottie.model.content.zy zyVar = list.get(i2);
            if (zyVar instanceof com.airbnb.lottie.model.animatable.x2) {
                return (com.airbnb.lottie.model.animatable.x2) zyVar;
            }
        }
        return null;
    }

    private boolean x2() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7855y.size(); i3++) {
            if ((this.f7855y.get(i3) instanceof InterfaceC1412n) && (i2 = i2 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        this.f55882zy.set(matrix);
        C1420h c1420h = this.f55880ld6;
        if (c1420h != null) {
            this.f55882zy.preConcat(c1420h.m5915g());
        }
        this.f7851n.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7855y.size() - 1; size >= 0; size--) {
            zy zyVar = this.f7855y.get(size);
            if (zyVar instanceof InterfaceC1412n) {
                ((InterfaceC1412n) zyVar).mo5886g(this.f7851n, this.f55882zy, z2);
                rectF.union(this.f7851n);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7849g;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        this.f55882zy.reset();
        C1420h c1420h = this.f55880ld6;
        if (c1420h != null) {
            this.f55882zy.set(c1420h.m5915g());
        }
        this.f7853q.reset();
        if (this.f55879f7l8) {
            return this.f7853q;
        }
        for (int size = this.f7855y.size() - 1; size >= 0; size--) {
            zy zyVar = this.f7855y.get(size);
            if (zyVar instanceof n7h) {
                this.f7853q.addPath(((n7h) zyVar).getPath(), this.f55882zy);
            }
        }
        return this.f7853q;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f7854s.invalidateSelf();
    }

    Matrix ld6() {
        C1420h c1420h = this.f55880ld6;
        if (c1420h != null) {
            return c1420h.m5915g();
        }
        this.f55882zy.reset();
        return this.f55882zy;
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        if (c1471n.m6092y(getName(), i2) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                c1471n2 = c1471n2.m6087k(getName());
                if (c1471n.zy(getName(), i2)) {
                    list.add(c1471n2.m6089p(this));
                }
            }
            if (c1471n.m6091s(getName(), i2)) {
                int iM6088n = i2 + c1471n.m6088n(getName(), i2);
                for (int i3 = 0; i3 < this.f7855y.size(); i3++) {
                    zy zyVar = this.f7855y.get(i3);
                    if (zyVar instanceof InterfaceC1460g) {
                        ((InterfaceC1460g) zyVar).mo5888n(c1471n, iM6088n, list, c1471n2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    List<n7h> m5899p() {
        if (this.f7852p == null) {
            this.f7852p = new ArrayList();
            for (int i2 = 0; i2 < this.f7855y.size(); i2++) {
                zy zyVar = this.f7855y.get(i2);
                if (zyVar instanceof n7h) {
                    this.f7852p.add((n7h) zyVar);
                }
            }
        }
        return this.f7852p;
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        C1420h c1420h = this.f55880ld6;
        if (c1420h != null) {
            c1420h.zy(t2, c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f7855y.size());
        arrayList.addAll(list);
        for (int size = this.f7855y.size() - 1; size >= 0; size--) {
            zy zyVar = this.f7855y.get(size);
            zyVar.toq(arrayList, this.f7855y.subList(0, size));
            arrayList.add(zyVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        if (this.f55879f7l8) {
            return;
        }
        this.f55882zy.set(matrix);
        C1420h c1420h = this.f55880ld6;
        if (c1420h != null) {
            this.f55882zy.preConcat(c1420h.m5915g());
            i2 = (int) (((((this.f55880ld6.m5920y() == null ? 100 : this.f55880ld6.m5920y().mo5912y().intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z2 = this.f7854s.zp() && x2() && i2 != 255;
        if (z2) {
            this.f55881toq.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo5886g(this.f55881toq, this.f55882zy, true);
            this.f7850k.setAlpha(i2);
            C1512y.n7h(canvas, this.f55881toq, this.f7850k);
        }
        if (z2) {
            i2 = 255;
        }
        for (int size = this.f7855y.size() - 1; size >= 0; size--) {
            zy zyVar = this.f7855y.get(size);
            if (zyVar instanceof InterfaceC1412n) {
                ((InterfaceC1412n) zyVar).mo5890y(canvas, this.f55882zy, i2);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    C1414q(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, String str, boolean z2, List<zy> list, @dd com.airbnb.lottie.model.animatable.x2 x2Var) {
        this.f7850k = new C1418k();
        this.f55881toq = new RectF();
        this.f55882zy = new Matrix();
        this.f7853q = new Path();
        this.f7851n = new RectF();
        this.f7849g = str;
        this.f7854s = c1504r;
        this.f55879f7l8 = z2;
        this.f7855y = list;
        if (x2Var != null) {
            C1420h qVar = x2Var.toq();
            this.f55880ld6 = qVar;
            qVar.m5916k(toqVar);
            this.f55880ld6.toq(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            zy zyVar = list.get(size);
            if (zyVar instanceof InterfaceC1413p) {
                arrayList.add((InterfaceC1413p) zyVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC1413p) arrayList.get(size2)).f7l8(list.listIterator(list.size()));
        }
    }
}
