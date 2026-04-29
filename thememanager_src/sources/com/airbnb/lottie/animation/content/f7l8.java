package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.C0683f;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 implements InterfaceC1412n, AbstractC1421k.toq, ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AbstractC1421k<Integer, Integer> f55841f7l8;

    /* JADX INFO: renamed from: g */
    private final List<n7h> f7807g;

    /* JADX INFO: renamed from: k */
    private final Path f7808k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f55842ld6;

    /* JADX INFO: renamed from: n */
    private final boolean f7809n;

    /* JADX INFO: renamed from: p */
    private final C1504r f7810p;

    /* JADX INFO: renamed from: q */
    private final String f7811q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private com.airbnb.lottie.animation.keyframe.zy f55843qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f7812s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Paint f55844toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    float f55845x2;

    /* JADX INFO: renamed from: y */
    private final AbstractC1421k<Integer, Integer> f7813y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.toq f55846zy;

    public f7l8(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.kja0 kja0Var) {
        Path path = new Path();
        this.f7808k = path;
        this.f55844toq = new C1418k(1);
        this.f7807g = new ArrayList();
        this.f55846zy = toqVar;
        this.f7811q = kja0Var.m6024q();
        this.f7809n = kja0Var.m6022g();
        this.f7810p = c1504r;
        if (toqVar.zurt() != null) {
            AbstractC1421k<Float, Float> abstractC1421kMo5997k = toqVar.zurt().m6015k().mo5997k();
            this.f55842ld6 = abstractC1421kMo5997k;
            abstractC1421kMo5997k.m5922k(this);
            toqVar.m6084s(this.f55842ld6);
        }
        if (toqVar.fu4() != null) {
            this.f55843qrj = new com.airbnb.lottie.animation.keyframe.zy(this, toqVar, toqVar.fu4());
        }
        if (kja0Var.toq() == null || kja0Var.m6023n() == null) {
            this.f55841f7l8 = null;
            this.f7813y = null;
            return;
        }
        path.setFillType(kja0Var.zy());
        AbstractC1421k<Integer, Integer> abstractC1421kMo5997k2 = kja0Var.toq().mo5997k();
        this.f55841f7l8 = abstractC1421kMo5997k2;
        abstractC1421kMo5997k2.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k2);
        AbstractC1421k<Integer, Integer> abstractC1421kMo5997k3 = kja0Var.m6023n().mo5997k();
        this.f7813y = abstractC1421kMo5997k3;
        abstractC1421kMo5997k3.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k3);
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        this.f7808k.reset();
        for (int i2 = 0; i2 < this.f7807g.size(); i2++) {
            this.f7808k.addPath(this.f7807g.get(i2).getPath(), matrix);
        }
        this.f7808k.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7811q;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f7810p.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        com.airbnb.lottie.animation.keyframe.zy zyVar;
        com.airbnb.lottie.animation.keyframe.zy zyVar2;
        com.airbnb.lottie.animation.keyframe.zy zyVar3;
        com.airbnb.lottie.animation.keyframe.zy zyVar4;
        com.airbnb.lottie.animation.keyframe.zy zyVar5;
        if (t2 == n5r1.f8116k) {
            this.f55841f7l8.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f8119q) {
            this.f7813y.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56126eqxt) {
            AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f7812s;
            if (abstractC1421k != null) {
                this.f55846zy.jp0y(abstractC1421k);
            }
            if (c1517p == null) {
                this.f7812s = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f7812s = cdjVar;
            cdjVar.m5922k(this);
            this.f55846zy.m6084s(this.f7812s);
            return;
        }
        if (t2 == n5r1.f8118p) {
            AbstractC1421k<Float, Float> abstractC1421k2 = this.f55842ld6;
            if (abstractC1421k2 != null) {
                abstractC1421k2.n7h(c1517p);
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar2 = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55842ld6 = cdjVar2;
            cdjVar2.m5922k(this);
            this.f55846zy.m6084s(this.f55842ld6);
            return;
        }
        if (t2 == n5r1.f8117n && (zyVar5 = this.f55843qrj) != null) {
            zyVar5.zy(c1517p);
            return;
        }
        if (t2 == n5r1.f56133jp0y && (zyVar4 = this.f55843qrj) != null) {
            zyVar4.m5943g(c1517p);
            return;
        }
        if (t2 == n5r1.f56131gvn7 && (zyVar3 = this.f55843qrj) != null) {
            zyVar3.m5945q(c1517p);
            return;
        }
        if (t2 == n5r1.f56124d3 && (zyVar2 = this.f55843qrj) != null) {
            zyVar2.m5944n(c1517p);
        } else {
            if (t2 != n5r1.f56142oc || (zyVar = this.f55843qrj) == null) {
                return;
            }
            zyVar.f7l8(c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            zy zyVar = list2.get(i2);
            if (zyVar instanceof n7h) {
                this.f7807g.add((n7h) zyVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        if (this.f7809n) {
            return;
        }
        C1476n.m6103k("FillContent#draw");
        this.f55844toq.setColor((com.airbnb.lottie.utils.f7l8.m6240q((int) ((((i2 / 255.0f) * this.f7813y.mo5912y().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.toq) this.f55841f7l8).m5940h() & C0683f.f50797t8r));
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f7812s;
        if (abstractC1421k != null) {
            this.f55844toq.setColorFilter(abstractC1421k.mo5912y());
        }
        AbstractC1421k<Float, Float> abstractC1421k2 = this.f55842ld6;
        if (abstractC1421k2 != null) {
            float fFloatValue = abstractC1421k2.mo5912y().floatValue();
            if (fFloatValue == 0.0f) {
                this.f55844toq.setMaskFilter(null);
            } else if (fFloatValue != this.f55845x2) {
                this.f55844toq.setMaskFilter(this.f55846zy.ni7(fFloatValue));
            }
            this.f55845x2 = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.zy zyVar = this.f55843qrj;
        if (zyVar != null) {
            zyVar.toq(this.f55844toq);
        }
        this.f7808k.reset();
        for (int i3 = 0; i3 < this.f7807g.size(); i3++) {
            this.f7808k.addPath(this.f7807g.get(i3).getPath(), matrix);
        }
        canvas.drawPath(this.f7808k, this.f55844toq);
        C1476n.toq("FillContent#draw");
    }
}
