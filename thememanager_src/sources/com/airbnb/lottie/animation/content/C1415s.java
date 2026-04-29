package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0252s;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.content.C1449g;
import com.airbnb.lottie.model.content.C1456q;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.s */
/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C1415s extends AbstractC1410k {

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f55883mcp = 32;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final C0252s<RadialGradient> f55884fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private final int f55885fu4;

    /* JADX INFO: renamed from: i */
    private final C0252s<LinearGradient> f7856i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final String f55886ki;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.f7l8 f55887ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private final AbstractC1421k<PointF, PointF> f55888o1t;

    /* JADX INFO: renamed from: t */
    @dd
    private com.airbnb.lottie.animation.keyframe.cdj f7857t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final boolean f55889t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private final AbstractC1421k<PointF, PointF> f55890wvg;

    /* JADX INFO: renamed from: z */
    private final AbstractC1421k<C1456q, C1456q> f7858z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final RectF f55891zurt;

    public C1415s(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, C1449g c1449g) {
        super(c1504r, toqVar, c1449g.toq().toPaintCap(), c1449g.f7l8().toPaintJoin(), c1449g.m6012s(), c1449g.ld6(), c1449g.qrj(), c1449g.m6013y(), c1449g.zy());
        this.f7856i = new C0252s<>();
        this.f55884fn3e = new C0252s<>();
        this.f55891zurt = new RectF();
        this.f55886ki = c1449g.m6010p();
        this.f55887ni7 = c1449g.m6008g();
        this.f55889t8r = c1449g.n7h();
        this.f55885fu4 = (int) (c1504r.x9kr().m5977q() / 32.0f);
        AbstractC1421k<C1456q, C1456q> abstractC1421kMo5997k = c1449g.m6009n().mo5997k();
        this.f7858z = abstractC1421kMo5997k;
        abstractC1421kMo5997k.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k);
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k2 = c1449g.x2().mo5997k();
        this.f55888o1t = abstractC1421kMo5997k2;
        abstractC1421kMo5997k2.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k2);
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k3 = c1449g.m6011q().mo5997k();
        this.f55890wvg = abstractC1421kMo5997k3;
        abstractC1421kMo5997k3.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k3);
    }

    private int ld6() {
        int iRound = Math.round(this.f55888o1t.m5921g() * this.f55885fu4);
        int iRound2 = Math.round(this.f55890wvg.m5921g() * this.f55885fu4);
        int iRound3 = Math.round(this.f7858z.m5921g() * this.f55885fu4);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    /* JADX INFO: renamed from: p */
    private int[] m5900p(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.cdj cdjVar = this.f7857t;
        if (cdjVar != null) {
            Integer[] numArr = (Integer[]) cdjVar.mo5912y();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    private RadialGradient qrj() {
        long jLd6 = ld6();
        RadialGradient radialGradientN7h = this.f55884fn3e.n7h(jLd6);
        if (radialGradientN7h != null) {
            return radialGradientN7h;
        }
        PointF pointFMo5912y = this.f55888o1t.mo5912y();
        PointF pointFMo5912y2 = this.f55890wvg.mo5912y();
        C1456q c1456qMo5912y = this.f7858z.mo5912y();
        int[] iArrM5900p = m5900p(c1456qMo5912y.m6043k());
        float[] qVar = c1456qMo5912y.toq();
        RadialGradient radialGradient = new RadialGradient(pointFMo5912y.x, pointFMo5912y.y, (float) Math.hypot(pointFMo5912y2.x - r7, pointFMo5912y2.y - r8), iArrM5900p, qVar, Shader.TileMode.CLAMP);
        this.f55884fn3e.fn3e(jLd6, radialGradient);
        return radialGradient;
    }

    private LinearGradient x2() {
        long jLd6 = ld6();
        LinearGradient linearGradientN7h = this.f7856i.n7h(jLd6);
        if (linearGradientN7h != null) {
            return linearGradientN7h;
        }
        PointF pointFMo5912y = this.f55888o1t.mo5912y();
        PointF pointFMo5912y2 = this.f55890wvg.mo5912y();
        C1456q c1456qMo5912y = this.f7858z.mo5912y();
        LinearGradient linearGradient = new LinearGradient(pointFMo5912y.x, pointFMo5912y.y, pointFMo5912y2.x, pointFMo5912y2.y, m5900p(c1456qMo5912y.m6043k()), c1456qMo5912y.toq(), Shader.TileMode.CLAMP);
        this.f7856i.fn3e(jLd6, linearGradient);
        return linearGradient;
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55886ki;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.AbstractC1410k, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f56123d2ok) {
            com.airbnb.lottie.animation.keyframe.cdj cdjVar = this.f7857t;
            if (cdjVar != null) {
                this.f7828g.jp0y(cdjVar);
            }
            if (c1517p == null) {
                this.f7857t = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar2 = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f7857t = cdjVar2;
            cdjVar2.m5922k(this);
            this.f7828g.m6084s(this.f7857t);
        }
    }

    @Override // com.airbnb.lottie.animation.content.AbstractC1410k, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        if (this.f55889t8r) {
            return;
        }
        mo5886g(this.f55891zurt, matrix, false);
        Shader shaderX2 = this.f55887ni7 == com.airbnb.lottie.model.content.f7l8.LINEAR ? x2() : qrj();
        shaderX2.setLocalMatrix(matrix);
        this.f7834s.setShader(shaderX2);
        super.mo5890y(canvas, matrix, i2);
    }
}
