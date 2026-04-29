package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C0252s;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.cdj;
import com.airbnb.lottie.ld6;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.layer.C1464n;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.zurt;

/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends toq {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private final Paint f56096d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final List<toq> f56097d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean f56098dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private final RectF f56099eqxt;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    @dd
    private AbstractC1421k<Float, Float> f56100gvn7;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    @dd
    private Boolean f56101lvui;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private final RectF f56102oc;

    /* JADX INFO: renamed from: r */
    @dd
    private Boolean f8084r;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.zy$k */
    /* JADX INFO: compiled from: CompositionLayer.java */
    static /* synthetic */ class C1470k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8085k;

        static {
            int[] iArr = new int[C1464n.toq.values().length];
            f8085k = iArr;
            try {
                iArr[C1464n.toq.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8085k[C1464n.toq.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public zy(C1504r c1504r, C1464n c1464n, List<C1464n> list, ld6 ld6Var) {
        int i2;
        toq toqVar;
        super(c1504r, c1464n);
        this.f56097d3 = new ArrayList();
        this.f56102oc = new RectF();
        this.f56099eqxt = new RectF();
        this.f56096d2ok = new Paint();
        this.f56098dd = true;
        com.airbnb.lottie.model.animatable.toq toqVarFn3e = c1464n.fn3e();
        if (toqVarFn3e != null) {
            AbstractC1421k<Float, Float> abstractC1421kMo5997k = toqVarFn3e.mo5997k();
            this.f56100gvn7 = abstractC1421kMo5997k;
            m6084s(abstractC1421kMo5997k);
            this.f56100gvn7.m5922k(this);
        } else {
            this.f56100gvn7 = null;
        }
        C0252s c0252s = new C0252s(ld6Var.ld6().size());
        int size = list.size() - 1;
        toq toqVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C1464n c1464n2 = list.get(size);
            toq toqVarFn3e2 = toq.fn3e(this, c1464n2, c1504r, ld6Var);
            if (toqVarFn3e2 != null) {
                c0252s.fn3e(toqVarFn3e2.m6085z().m6071q(), toqVarFn3e2);
                if (toqVar2 != null) {
                    toqVar2.d3(toqVarFn3e2);
                    toqVar2 = null;
                } else {
                    this.f56097d3.add(0, toqVarFn3e2);
                    int i3 = C1470k.f8085k[c1464n2.m6073y().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        toqVar2 = toqVarFn3e2;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < c0252s.jk(); i2++) {
            toq toqVar3 = (toq) c0252s.n7h(c0252s.m877i(i2));
            if (toqVar3 != null && (toqVar = (toq) c0252s.n7h(toqVar3.m6085z().m6070p())) != null) {
                toqVar3.eqxt(toqVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq
    public void d2ok(@zurt(from = 0.0d, to = 1.0d) float f2) {
        super.d2ok(f2);
        if (this.f56100gvn7 != null) {
            f2 = ((this.f56100gvn7.mo5912y().floatValue() * this.f56071cdj.toq().m5978s()) - this.f56071cdj.toq().ki()) / (this.f8073h.x9kr().m5975n() + 0.01f);
        }
        if (this.f56100gvn7 == null) {
            f2 -= this.f56071cdj.ki();
        }
        if (this.f56071cdj.zurt() != 0.0f && !"__container".equals(this.f56071cdj.m6072s())) {
            f2 /= this.f56071cdj.zurt();
        }
        for (int size = this.f56097d3.size() - 1; size >= 0; size--) {
            this.f56097d3.get(size).d2ok(f2);
        }
    }

    public boolean dd() {
        if (this.f8084r == null) {
            for (int size = this.f56097d3.size() - 1; size >= 0; size--) {
                toq toqVar = this.f56097d3.get(size);
                if (toqVar instanceof f7l8) {
                    if (toqVar.o1t()) {
                        this.f8084r = Boolean.TRUE;
                        return true;
                    }
                } else if ((toqVar instanceof zy) && ((zy) toqVar).dd()) {
                    this.f8084r = Boolean.TRUE;
                    return true;
                }
            }
            this.f8084r = Boolean.FALSE;
        }
        return this.f8084r.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        super.mo5886g(rectF, matrix, z2);
        for (int size = this.f56097d3.size() - 1; size >= 0; size--) {
            this.f56102oc.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f56097d3.get(size).mo5886g(this.f56102oc, this.f56076kja0, true);
            rectF.union(this.f56102oc);
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq
    protected void gvn7(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        for (int i3 = 0; i3 < this.f56097d3.size(); i3++) {
            this.f56097d3.get(i3).mo5888n(c1471n, i2, list, c1471n2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq
    /* JADX INFO: renamed from: i */
    void mo6064i(Canvas canvas, Matrix matrix, int i2) {
        C1476n.m6103k("CompositionLayer#draw");
        this.f56099eqxt.set(0.0f, 0.0f, this.f56071cdj.x2(), this.f56071cdj.ld6());
        matrix.mapRect(this.f56099eqxt);
        boolean z2 = this.f8073h.zp() && this.f56097d3.size() > 1 && i2 != 255;
        if (z2) {
            this.f56096d2ok.setAlpha(i2);
            C1512y.n7h(canvas, this.f56099eqxt, this.f56096d2ok);
        } else {
            canvas.save();
        }
        if (z2) {
            i2 = 255;
        }
        for (int size = this.f56097d3.size() - 1; size >= 0; size--) {
            if (((!this.f56098dd && "__container".equals(this.f56071cdj.m6072s())) || this.f56099eqxt.isEmpty()) ? true : canvas.clipRect(this.f56099eqxt)) {
                this.f56097d3.get(size).mo5890y(canvas, matrix, i2);
            }
        }
        canvas.restore();
        C1476n.toq("CompositionLayer#draw");
    }

    public void ncyb(boolean z2) {
        this.f56098dd = z2;
    }

    @Override // com.airbnb.lottie.model.layer.toq
    public void oc(boolean z2) {
        super.oc(z2);
        Iterator<toq> it = this.f56097d3.iterator();
        while (it.hasNext()) {
            it.next().oc(z2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f56121a9) {
            if (c1517p == null) {
                AbstractC1421k<Float, Float> abstractC1421k = this.f56100gvn7;
                if (abstractC1421k != null) {
                    abstractC1421k.n7h(null);
                    return;
                }
                return;
            }
            cdj cdjVar = new cdj(c1517p);
            this.f56100gvn7 = cdjVar;
            cdjVar.m5922k(this);
            m6084s(this.f56100gvn7);
        }
    }

    public boolean x9kr() {
        if (this.f56101lvui == null) {
            if (wvg()) {
                this.f56101lvui = Boolean.TRUE;
                return true;
            }
            for (int size = this.f56097d3.size() - 1; size >= 0; size--) {
                if (this.f56097d3.get(size).wvg()) {
                    this.f56101lvui = Boolean.TRUE;
                    return true;
                }
            }
            this.f56101lvui = Boolean.FALSE;
        }
        return this.f56101lvui.booleanValue();
    }
}
