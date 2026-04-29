package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1419g;
import com.airbnb.lottie.animation.keyframe.C1425q;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7842s;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.k */
/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1410k implements AbstractC1421k.toq, ld6, InterfaceC1412n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private com.airbnb.lottie.animation.keyframe.zy f55858cdj;

    /* JADX INFO: renamed from: g */
    protected final com.airbnb.lottie.model.layer.toq f7828g;

    /* JADX INFO: renamed from: h */
    float f7829h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f55860kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final AbstractC1421k<?, Integer> f55861ld6;

    /* JADX INFO: renamed from: n */
    private final C1504r f7831n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f55862n7h;

    /* JADX INFO: renamed from: p */
    private final AbstractC1421k<?, Float> f7832p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private final AbstractC1421k<?, Float> f55863qrj;

    /* JADX INFO: renamed from: s */
    final Paint f7834s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final List<AbstractC1421k<?, Float>> f55865x2;

    /* JADX INFO: renamed from: y */
    private final float[] f7835y;

    /* JADX INFO: renamed from: k */
    private final PathMeasure f7830k = new PathMeasure();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f55864toq = new Path();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Path f55866zy = new Path();

    /* JADX INFO: renamed from: q */
    private final RectF f7833q = new RectF();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final List<toq> f55859f7l8 = new ArrayList();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.k$toq */
    /* JADX INFO: compiled from: BaseStrokeContent.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        private final List<n7h> f7836k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private final zurt f55867toq;

        private toq(@dd zurt zurtVar) {
            this.f7836k = new ArrayList();
            this.f55867toq = zurtVar;
        }
    }

    AbstractC1410k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, Paint.Cap cap, Paint.Join join, float f2, C1446q c1446q, com.airbnb.lottie.model.animatable.toq toqVar2, List<com.airbnb.lottie.model.animatable.toq> list, com.airbnb.lottie.model.animatable.toq toqVar3) {
        C1418k c1418k = new C1418k(1);
        this.f7834s = c1418k;
        this.f7829h = 0.0f;
        this.f7831n = c1504r;
        this.f7828g = toqVar;
        c1418k.setStyle(Paint.Style.STROKE);
        c1418k.setStrokeCap(cap);
        c1418k.setStrokeJoin(join);
        c1418k.setStrokeMiter(f2);
        this.f55861ld6 = c1446q.mo5997k();
        this.f7832p = toqVar2.mo5997k();
        if (toqVar3 == null) {
            this.f55863qrj = null;
        } else {
            this.f55863qrj = toqVar3.mo5997k();
        }
        this.f55865x2 = new ArrayList(list.size());
        this.f7835y = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f55865x2.add(list.get(i2).mo5997k());
        }
        toqVar.m6084s(this.f55861ld6);
        toqVar.m6084s(this.f7832p);
        for (int i3 = 0; i3 < this.f55865x2.size(); i3++) {
            toqVar.m6084s(this.f55865x2.get(i3));
        }
        AbstractC1421k<?, Float> abstractC1421k = this.f55863qrj;
        if (abstractC1421k != null) {
            toqVar.m6084s(abstractC1421k);
        }
        this.f55861ld6.m5922k(this);
        this.f7832p.m5922k(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f55865x2.get(i4).m5922k(this);
        }
        AbstractC1421k<?, Float> abstractC1421k2 = this.f55863qrj;
        if (abstractC1421k2 != null) {
            abstractC1421k2.m5922k(this);
        }
        if (toqVar.zurt() != null) {
            AbstractC1421k<Float, Float> abstractC1421kMo5997k = toqVar.zurt().m6015k().mo5997k();
            this.f55860kja0 = abstractC1421kMo5997k;
            abstractC1421kMo5997k.m5922k(this);
            toqVar.m6084s(this.f55860kja0);
        }
        if (toqVar.fu4() != null) {
            this.f55858cdj = new com.airbnb.lottie.animation.keyframe.zy(this, toqVar, toqVar.fu4());
        }
    }

    private void f7l8(Matrix matrix) {
        C1476n.m6103k("StrokeContent#applyDashPattern");
        if (this.f55865x2.isEmpty()) {
            C1476n.toq("StrokeContent#applyDashPattern");
            return;
        }
        float fF7l8 = C1512y.f7l8(matrix);
        for (int i2 = 0; i2 < this.f55865x2.size(); i2++) {
            this.f7835y[i2] = this.f55865x2.get(i2).mo5912y().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.f7835y;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f7835y;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.f7835y;
            fArr3[i2] = fArr3[i2] * fF7l8;
        }
        AbstractC1421k<?, Float> abstractC1421k = this.f55863qrj;
        this.f7834s.setPathEffect(new DashPathEffect(this.f7835y, abstractC1421k == null ? 0.0f : fF7l8 * abstractC1421k.mo5912y().floatValue()));
        C1476n.toq("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5891s(android.graphics.Canvas r17, com.airbnb.lottie.animation.content.AbstractC1410k.toq r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.AbstractC1410k.m5891s(android.graphics.Canvas, com.airbnb.lottie.animation.content.k$toq, android.graphics.Matrix):void");
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        C1476n.m6103k("StrokeContent#getBounds");
        this.f55864toq.reset();
        for (int i2 = 0; i2 < this.f55859f7l8.size(); i2++) {
            toq toqVar = this.f55859f7l8.get(i2);
            for (int i3 = 0; i3 < toqVar.f7836k.size(); i3++) {
                this.f55864toq.addPath(((n7h) toqVar.f7836k.get(i3)).getPath(), matrix);
            }
        }
        this.f55864toq.computeBounds(this.f7833q, false);
        float fM5936h = ((C1425q) this.f7832p).m5936h();
        RectF rectF2 = this.f7833q;
        float f2 = fM5936h / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f7833q);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1476n.toq("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f7831n.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        com.airbnb.lottie.animation.keyframe.zy zyVar;
        com.airbnb.lottie.animation.keyframe.zy zyVar2;
        com.airbnb.lottie.animation.keyframe.zy zyVar3;
        com.airbnb.lottie.animation.keyframe.zy zyVar4;
        com.airbnb.lottie.animation.keyframe.zy zyVar5;
        if (t2 == n5r1.f8119q) {
            this.f55861ld6.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56144t8r) {
            this.f7832p.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56126eqxt) {
            AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55862n7h;
            if (abstractC1421k != null) {
                this.f7828g.jp0y(abstractC1421k);
            }
            if (c1517p == null) {
                this.f55862n7h = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55862n7h = cdjVar;
            cdjVar.m5922k(this);
            this.f7828g.m6084s(this.f55862n7h);
            return;
        }
        if (t2 == n5r1.f8118p) {
            AbstractC1421k<Float, Float> abstractC1421k2 = this.f55860kja0;
            if (abstractC1421k2 != null) {
                abstractC1421k2.n7h(c1517p);
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar2 = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55860kja0 = cdjVar2;
            cdjVar2.m5922k(this);
            this.f7828g.m6084s(this.f55860kja0);
            return;
        }
        if (t2 == n5r1.f8117n && (zyVar5 = this.f55858cdj) != null) {
            zyVar5.zy(c1517p);
            return;
        }
        if (t2 == n5r1.f56133jp0y && (zyVar4 = this.f55858cdj) != null) {
            zyVar4.m5943g(c1517p);
            return;
        }
        if (t2 == n5r1.f56131gvn7 && (zyVar3 = this.f55858cdj) != null) {
            zyVar3.m5945q(c1517p);
            return;
        }
        if (t2 == n5r1.f56124d3 && (zyVar2 = this.f55858cdj) != null) {
            zyVar2.m5944n(c1517p);
        } else {
            if (t2 != n5r1.f56142oc || (zyVar = this.f55858cdj) == null) {
                return;
            }
            zyVar.f7l8(c1517p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.airbnb.lottie.animation.content.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toq(java.util.List<com.airbnb.lottie.animation.content.zy> r8, java.util.List<com.airbnb.lottie.animation.content.zy> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.airbnb.lottie.animation.content.zy r3 = (com.airbnb.lottie.animation.content.zy) r3
            boolean r4 = r3 instanceof com.airbnb.lottie.animation.content.zurt
            if (r4 == 0) goto L1f
            com.airbnb.lottie.animation.content.zurt r3 = (com.airbnb.lottie.animation.content.zurt) r3
            com.airbnb.lottie.model.content.t8r$k r4 = r3.m5908p()
            com.airbnb.lottie.model.content.t8r$k r5 = com.airbnb.lottie.model.content.t8r.EnumC1458k.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.m5909q(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.airbnb.lottie.animation.content.zy r3 = (com.airbnb.lottie.animation.content.zy) r3
            boolean r4 = r3 instanceof com.airbnb.lottie.animation.content.zurt
            if (r4 == 0) goto L55
            r4 = r3
            com.airbnb.lottie.animation.content.zurt r4 = (com.airbnb.lottie.animation.content.zurt) r4
            com.airbnb.lottie.model.content.t8r$k r5 = r4.m5908p()
            com.airbnb.lottie.model.content.t8r$k r6 = com.airbnb.lottie.model.content.t8r.EnumC1458k.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.airbnb.lottie.animation.content.k$toq> r3 = r7.f55859f7l8
            r3.add(r0)
        L4c:
            com.airbnb.lottie.animation.content.k$toq r0 = new com.airbnb.lottie.animation.content.k$toq
            r0.<init>(r4)
            r4.m5909q(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.airbnb.lottie.animation.content.n7h
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.airbnb.lottie.animation.content.k$toq r0 = new com.airbnb.lottie.animation.content.k$toq
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.airbnb.lottie.animation.content.AbstractC1410k.toq.m5892k(r0)
            com.airbnb.lottie.animation.content.n7h r3 = (com.airbnb.lottie.animation.content.n7h) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.airbnb.lottie.animation.content.k$toq> r8 = r7.f55859f7l8
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.AbstractC1410k.toq(java.util.List, java.util.List):void");
    }

    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        C1476n.m6103k("StrokeContent#draw");
        if (C1512y.m6264y(matrix)) {
            C1476n.toq("StrokeContent#draw");
            return;
        }
        this.f7834s.setAlpha(com.airbnb.lottie.utils.f7l8.m6240q((int) ((((i2 / 255.0f) * ((C1419g) this.f55861ld6).m5913h()) / 100.0f) * 255.0f), 0, 255));
        this.f7834s.setStrokeWidth(((C1425q) this.f7832p).m5936h() * C1512y.f7l8(matrix));
        if (this.f7834s.getStrokeWidth() <= 0.0f) {
            C1476n.toq("StrokeContent#draw");
            return;
        }
        f7l8(matrix);
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55862n7h;
        if (abstractC1421k != null) {
            this.f7834s.setColorFilter(abstractC1421k.mo5912y());
        }
        AbstractC1421k<Float, Float> abstractC1421k2 = this.f55860kja0;
        if (abstractC1421k2 != null) {
            float fFloatValue = abstractC1421k2.mo5912y().floatValue();
            if (fFloatValue == 0.0f) {
                this.f7834s.setMaskFilter(null);
            } else if (fFloatValue != this.f7829h) {
                this.f7834s.setMaskFilter(this.f7828g.ni7(fFloatValue));
            }
            this.f7829h = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.zy zyVar = this.f55858cdj;
        if (zyVar != null) {
            zyVar.toq(this.f7834s);
        }
        for (int i3 = 0; i3 < this.f55859f7l8.size(); i3++) {
            toq toqVar = this.f55859f7l8.get(i3);
            if (toqVar.f55867toq != null) {
                m5891s(canvas, toqVar, matrix);
            } else {
                C1476n.m6103k("StrokeContent#buildPath");
                this.f55864toq.reset();
                for (int size = toqVar.f7836k.size() - 1; size >= 0; size--) {
                    this.f55864toq.addPath(((n7h) toqVar.f7836k.get(size)).getPath(), matrix);
                }
                C1476n.toq("StrokeContent#buildPath");
                C1476n.m6103k("StrokeContent#drawPath");
                canvas.drawPath(this.f55864toq, this.f7834s);
                C1476n.toq("StrokeContent#drawPath");
            }
        }
        C1476n.toq("StrokeContent#draw");
    }
}
