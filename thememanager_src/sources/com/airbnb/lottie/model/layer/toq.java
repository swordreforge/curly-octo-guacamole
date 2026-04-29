package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.content.InterfaceC1412n;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1420h;
import com.airbnb.lottie.animation.keyframe.C1425q;
import com.airbnb.lottie.animation.keyframe.C1427y;
import com.airbnb.lottie.ld6;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.InterfaceC1460g;
import com.airbnb.lottie.model.content.C1452k;
import com.airbnb.lottie.model.content.C1459y;
import com.airbnb.lottie.model.content.n7h;
import com.airbnb.lottie.model.layer.C1464n;
import com.airbnb.lottie.parser.C1494p;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7842s;
import zy.dd;
import zy.zurt;

/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq implements InterfaceC1412n, AbstractC1421k.toq, InterfaceC1460g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f56067a9 = 16;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f56068fti = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f56069jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f56070jp0y = 19;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    final C1464n f56071cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Paint f56072f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @dd
    private toq f56073fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    final C1420h f56074fu4;

    /* JADX INFO: renamed from: h */
    final C1504r f8073h;

    /* JADX INFO: renamed from: i */
    @dd
    private toq f8074i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private C1427y f56075ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    final Matrix f56076kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final RectF f56077ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @dd
    BlurMaskFilter f56078mcp;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final String f56079n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final List<AbstractC1421k<?, ?>> f56080ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private boolean f56081o1t;

    /* JADX INFO: renamed from: p */
    private final RectF f8077p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final RectF f56082qrj;

    /* JADX INFO: renamed from: s */
    private final RectF f8079s;

    /* JADX INFO: renamed from: t */
    float f8080t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @dd
    private C1425q f56083t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @dd
    private Paint f56085wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final RectF f56086x2;

    /* JADX INFO: renamed from: y */
    private final Paint f8081y;

    /* JADX INFO: renamed from: z */
    private boolean f8082z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private List<toq> f56087zurt;

    /* JADX INFO: renamed from: k */
    private final Path f8075k = new Path();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Matrix f56084toq = new Matrix();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix f56088zy = new Matrix();

    /* JADX INFO: renamed from: q */
    private final Paint f8078q = new C1418k(1);

    /* JADX INFO: renamed from: n */
    private final Paint f8076n = new C1418k(1, PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: g */
    private final Paint f8072g = new C1418k(1, PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.toq$k */
    /* JADX INFO: compiled from: BaseLayer.java */
    static /* synthetic */ class C1468k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8083k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f56089toq;

        static {
            int[] iArr = new int[C1459y.k.values().length];
            f56089toq = iArr;
            try {
                iArr[C1459y.k.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56089toq[C1459y.k.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56089toq[C1459y.k.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56089toq[C1459y.k.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C1464n.k.values().length];
            f8083k = iArr2;
            try {
                iArr2[C1464n.k.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8083k[C1464n.k.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8083k[C1464n.k.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8083k[C1464n.k.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8083k[C1464n.k.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8083k[C1464n.k.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8083k[C1464n.k.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    toq(C1504r c1504r, C1464n c1464n) {
        C1418k c1418k = new C1418k(1);
        this.f56072f7l8 = c1418k;
        this.f8081y = new C1418k(PorterDuff.Mode.CLEAR);
        this.f8079s = new RectF();
        this.f8077p = new RectF();
        this.f56077ld6 = new RectF();
        this.f56086x2 = new RectF();
        this.f56082qrj = new RectF();
        this.f56076kja0 = new Matrix();
        this.f56080ni7 = new ArrayList();
        this.f8082z = true;
        this.f8080t = 0.0f;
        this.f8073h = c1504r;
        this.f56071cdj = c1464n;
        this.f56079n7h = c1464n.m6072s() + "#draw";
        if (c1464n.m6073y() == C1464n.toq.INVERT) {
            c1418k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c1418k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1420h qVar = c1464n.ni7().toq();
        this.f56074fu4 = qVar;
        qVar.toq(this);
        if (c1464n.f7l8() != null && !c1464n.f7l8().isEmpty()) {
            C1427y c1427y = new C1427y(c1464n.f7l8());
            this.f56075ki = c1427y;
            Iterator<AbstractC1421k<n7h, Path>> it = c1427y.m5942k().iterator();
            while (it.hasNext()) {
                it.next().m5922k(this);
            }
            for (AbstractC1421k<Integer, Integer> abstractC1421k : this.f56075ki.zy()) {
                m6084s(abstractC1421k);
                abstractC1421k.m5922k(this);
            }
        }
        m6082r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a9() {
        lvui(this.f56083t8r.m5936h() == 1.0f);
    }

    private boolean cdj() {
        if (this.f56075ki.m5942k().isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f56075ki.toq().size(); i2++) {
            if (this.f56075ki.toq().get(i2).m6055k() != C1459y.k.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    @dd
    static toq fn3e(zy zyVar, C1464n c1464n, C1504r c1504r, ld6 ld6Var) {
        switch (C1468k.f8083k[c1464n.m6065g().ordinal()]) {
            case 1:
                return new f7l8(c1504r, c1464n, zyVar);
            case 2:
                return new zy(c1504r, c1464n, ld6Var.m5972h(c1464n.qrj()), ld6Var);
            case 3:
                return new C1469y(c1504r, c1464n);
            case 4:
                return new C1466q(c1504r, c1464n);
            case 5:
                return new C1462g(c1504r, c1464n);
            case 6:
                return new C1467s(c1504r, c1464n);
            default:
                C1510q.m6255n("Unknown layer type " + c1464n.m6065g());
                return null;
        }
    }

    private void fti(float f2) {
        this.f8073h.x9kr().kja0().m6271n(this.f56071cdj.m6072s(), f2);
    }

    /* JADX INFO: renamed from: h */
    private void m6080h(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k) {
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        canvas.drawPath(this.f8075k, this.f8072g);
    }

    private void jk() {
        this.f8073h.invalidateSelf();
    }

    private void ki() {
        if (this.f56087zurt != null) {
            return;
        }
        if (this.f56073fn3e == null) {
            this.f56087zurt = Collections.emptyList();
            return;
        }
        this.f56087zurt = new ArrayList();
        for (toq toqVar = this.f56073fn3e; toqVar != null; toqVar = toqVar.f56073fn3e) {
            this.f56087zurt.add(toqVar);
        }
    }

    private void kja0(Canvas canvas, Matrix matrix) {
        C1476n.m6103k("Layer#saveLayer");
        C1512y.kja0(canvas, this.f8079s, this.f8076n, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t8r(canvas);
        }
        C1476n.toq("Layer#saveLayer");
        for (int i2 = 0; i2 < this.f56075ki.toq().size(); i2++) {
            C1459y c1459y = this.f56075ki.toq().get(i2);
            AbstractC1421k<n7h, Path> abstractC1421k = this.f56075ki.m5942k().get(i2);
            AbstractC1421k<Integer, Integer> abstractC1421k2 = this.f56075ki.zy().get(i2);
            int i3 = C1468k.f56089toq[c1459y.m6055k().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (i2 == 0) {
                        this.f8078q.setColor(-16777216);
                        this.f8078q.setAlpha(255);
                        canvas.drawRect(this.f8079s, this.f8078q);
                    }
                    if (c1459y.m6056q()) {
                        n7h(canvas, matrix, abstractC1421k, abstractC1421k2);
                    } else {
                        m6080h(canvas, matrix, abstractC1421k);
                    }
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        if (c1459y.m6056q()) {
                            x2(canvas, matrix, abstractC1421k, abstractC1421k2);
                        } else {
                            m6081p(canvas, matrix, abstractC1421k, abstractC1421k2);
                        }
                    }
                } else if (c1459y.m6056q()) {
                    qrj(canvas, matrix, abstractC1421k, abstractC1421k2);
                } else {
                    ld6(canvas, matrix, abstractC1421k, abstractC1421k2);
                }
            } else if (cdj()) {
                this.f8078q.setAlpha(255);
                canvas.drawRect(this.f8079s, this.f8078q);
            }
        }
        C1476n.m6103k("Layer#restoreLayer");
        canvas.restore();
        C1476n.toq("Layer#restoreLayer");
    }

    private void ld6(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k, AbstractC1421k<Integer, Integer> abstractC1421k2) {
        C1512y.n7h(canvas, this.f8079s, this.f8076n);
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        this.f8078q.setAlpha((int) (abstractC1421k2.mo5912y().intValue() * 2.55f));
        canvas.drawPath(this.f8075k, this.f8078q);
        canvas.restore();
    }

    private void lvui(boolean z2) {
        if (z2 != this.f8082z) {
            this.f8082z = z2;
            jk();
        }
    }

    private void mcp(RectF rectF, Matrix matrix) {
        if (wvg() && this.f56071cdj.m6073y() != C1464n.toq.INVERT) {
            this.f56086x2.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f8074i.mo5886g(this.f56086x2, matrix, true);
            if (rectF.intersect(this.f56086x2)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void n7h(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k, AbstractC1421k<Integer, Integer> abstractC1421k2) {
        C1512y.n7h(canvas, this.f8079s, this.f8072g);
        canvas.drawRect(this.f8079s, this.f8078q);
        this.f8072g.setAlpha((int) (abstractC1421k2.mo5912y().intValue() * 2.55f));
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        canvas.drawPath(this.f8075k, this.f8072g);
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private void m6081p(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k, AbstractC1421k<Integer, Integer> abstractC1421k2) {
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        this.f8078q.setAlpha((int) (abstractC1421k2.mo5912y().intValue() * 2.55f));
        canvas.drawPath(this.f8075k, this.f8078q);
    }

    private void qrj(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k, AbstractC1421k<Integer, Integer> abstractC1421k2) {
        C1512y.n7h(canvas, this.f8079s, this.f8076n);
        canvas.drawRect(this.f8079s, this.f8078q);
        this.f8072g.setAlpha((int) (abstractC1421k2.mo5912y().intValue() * 2.55f));
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        canvas.drawPath(this.f8075k, this.f8072g);
        canvas.restore();
    }

    /* JADX INFO: renamed from: r */
    private void m6082r() {
        if (this.f56071cdj.m6069n().isEmpty()) {
            lvui(true);
            return;
        }
        C1425q c1425q = new C1425q(this.f56071cdj.m6069n());
        this.f56083t8r = c1425q;
        c1425q.x2();
        this.f56083t8r.m5922k(new AbstractC1421k.toq() { // from class: com.airbnb.lottie.model.layer.k
            @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
            /* JADX INFO: renamed from: k */
            public final void mo5887k() {
                this.f8052k.a9();
            }
        });
        lvui(this.f56083t8r.mo5912y().floatValue() == 1.0f);
        m6084s(this.f56083t8r);
    }

    /* JADX INFO: renamed from: t */
    private void m6083t(RectF rectF, Matrix matrix) {
        this.f56077ld6.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (o1t()) {
            int size = this.f56075ki.toq().size();
            for (int i2 = 0; i2 < size; i2++) {
                C1459y c1459y = this.f56075ki.toq().get(i2);
                Path pathMo5912y = this.f56075ki.m5942k().get(i2).mo5912y();
                if (pathMo5912y != null) {
                    this.f8075k.set(pathMo5912y);
                    this.f8075k.transform(matrix);
                    int i3 = C1468k.f56089toq[c1459y.m6055k().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        return;
                    }
                    if ((i3 == 3 || i3 == 4) && c1459y.m6056q()) {
                        return;
                    }
                    this.f8075k.computeBounds(this.f56082qrj, false);
                    if (i2 == 0) {
                        this.f56077ld6.set(this.f56082qrj);
                    } else {
                        RectF rectF2 = this.f56077ld6;
                        rectF2.set(Math.min(rectF2.left, this.f56082qrj.left), Math.min(this.f56077ld6.top, this.f56082qrj.top), Math.max(this.f56077ld6.right, this.f56082qrj.right), Math.max(this.f56077ld6.bottom, this.f56082qrj.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f56077ld6)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void t8r(Canvas canvas) {
        C1476n.m6103k("Layer#clearLayer");
        RectF rectF = this.f8079s;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f8081y);
        C1476n.toq("Layer#clearLayer");
    }

    private void x2(Canvas canvas, Matrix matrix, AbstractC1421k<n7h, Path> abstractC1421k, AbstractC1421k<Integer, Integer> abstractC1421k2) {
        C1512y.n7h(canvas, this.f8079s, this.f8078q);
        canvas.drawRect(this.f8079s, this.f8078q);
        this.f8075k.set(abstractC1421k.mo5912y());
        this.f8075k.transform(matrix);
        this.f8078q.setAlpha((int) (abstractC1421k2.mo5912y().intValue() * 2.55f));
        canvas.drawPath(this.f8075k, this.f8072g);
        canvas.restore();
    }

    void d2ok(@zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f56074fu4.m5918p(f2);
        if (this.f56075ki != null) {
            for (int i2 = 0; i2 < this.f56075ki.m5942k().size(); i2++) {
                this.f56075ki.m5942k().get(i2).qrj(f2);
            }
        }
        C1425q c1425q = this.f56083t8r;
        if (c1425q != null) {
            c1425q.qrj(f2);
        }
        toq toqVar = this.f8074i;
        if (toqVar != null) {
            toqVar.d2ok(f2);
        }
        for (int i3 = 0; i3 < this.f56080ni7.size(); i3++) {
            this.f56080ni7.get(i3).qrj(f2);
        }
    }

    void d3(@dd toq toqVar) {
        this.f8074i = toqVar;
    }

    void eqxt(@dd toq toqVar) {
        this.f56073fn3e = toqVar;
    }

    @dd
    public C1494p fu4() {
        return this.f56071cdj.zy();
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    @InterfaceC7842s
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        this.f8079s.set(0.0f, 0.0f, 0.0f, 0.0f);
        ki();
        this.f56076kja0.set(matrix);
        if (z2) {
            List<toq> list = this.f56087zurt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f56076kja0.preConcat(this.f56087zurt.get(size).f56074fu4.m5915g());
                }
            } else {
                toq toqVar = this.f56073fn3e;
                if (toqVar != null) {
                    this.f56076kja0.preConcat(toqVar.f56074fu4.m5915g());
                }
            }
        }
        this.f56076kja0.preConcat(this.f56074fu4.m5915g());
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f56071cdj.m6072s();
    }

    void gvn7(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
    }

    /* JADX INFO: renamed from: i */
    abstract void mo6064i(Canvas canvas, Matrix matrix, int i2);

    public void jp0y(AbstractC1421k<?, ?> abstractC1421k) {
        this.f56080ni7.remove(abstractC1421k);
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        jk();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        toq toqVar = this.f8074i;
        if (toqVar != null) {
            C1471n c1471nM6087k = c1471n2.m6087k(toqVar.getName());
            if (c1471n.zy(this.f8074i.getName(), i2)) {
                list.add(c1471nM6087k.m6089p(this.f8074i));
            }
            if (c1471n.m6091s(getName(), i2)) {
                this.f8074i.gvn7(c1471n, c1471n.m6088n(this.f8074i.getName(), i2) + i2, list, c1471nM6087k);
            }
        }
        if (c1471n.m6092y(getName(), i2)) {
            if (!"__container".equals(getName())) {
                c1471n2 = c1471n2.m6087k(getName());
                if (c1471n.zy(getName(), i2)) {
                    list.add(c1471n2.m6089p(this));
                }
            }
            if (c1471n.m6091s(getName(), i2)) {
                gvn7(c1471n, i2 + c1471n.m6088n(getName(), i2), list, c1471n2);
            }
        }
    }

    public BlurMaskFilter ni7(float f2) {
        if (this.f8080t == f2) {
            return this.f56078mcp;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f56078mcp = blurMaskFilter;
        this.f8080t = f2;
        return blurMaskFilter;
    }

    boolean o1t() {
        C1427y c1427y = this.f56075ki;
        return (c1427y == null || c1427y.m5942k().isEmpty()) ? false : true;
    }

    void oc(boolean z2) {
        if (z2 && this.f56085wvg == null) {
            this.f56085wvg = new C1418k();
        }
        this.f56081o1t = z2;
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        this.f56074fu4.zy(t2, c1517p);
    }

    /* JADX INFO: renamed from: s */
    public void m6084s(@dd AbstractC1421k<?, ?> abstractC1421k) {
        if (abstractC1421k == null) {
            return;
        }
        this.f56080ni7.add(abstractC1421k);
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<com.airbnb.lottie.animation.content.zy> list, List<com.airbnb.lottie.animation.content.zy> list2) {
    }

    boolean wvg() {
        return this.f8074i != null;
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        Paint paint;
        C1476n.m6103k(this.f56079n7h);
        if (!this.f8082z || this.f56071cdj.fu4()) {
            C1476n.toq(this.f56079n7h);
            return;
        }
        ki();
        C1476n.m6103k("Layer#parentMatrix");
        this.f56084toq.reset();
        this.f56084toq.set(matrix);
        for (int size = this.f56087zurt.size() - 1; size >= 0; size--) {
            this.f56084toq.preConcat(this.f56087zurt.get(size).f56074fu4.m5915g());
        }
        C1476n.toq("Layer#parentMatrix");
        int iIntValue = (int) ((((i2 / 255.0f) * (this.f56074fu4.m5920y() == null ? 100 : this.f56074fu4.m5920y().mo5912y().intValue())) / 100.0f) * 255.0f);
        if (!wvg() && !o1t()) {
            this.f56084toq.preConcat(this.f56074fu4.m5915g());
            C1476n.m6103k("Layer#drawLayer");
            mo6064i(canvas, this.f56084toq, iIntValue);
            C1476n.toq("Layer#drawLayer");
            fti(C1476n.toq(this.f56079n7h));
            return;
        }
        C1476n.m6103k("Layer#computeBounds");
        mo5886g(this.f8079s, this.f56084toq, false);
        mcp(this.f8079s, matrix);
        this.f56084toq.preConcat(this.f56074fu4.m5915g());
        m6083t(this.f8079s, this.f56084toq);
        this.f8077p.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f56088zy);
        if (!this.f56088zy.isIdentity()) {
            Matrix matrix2 = this.f56088zy;
            matrix2.invert(matrix2);
            this.f56088zy.mapRect(this.f8077p);
        }
        if (!this.f8079s.intersect(this.f8077p)) {
            this.f8079s.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C1476n.toq("Layer#computeBounds");
        if (this.f8079s.width() >= 1.0f && this.f8079s.height() >= 1.0f) {
            C1476n.m6103k("Layer#saveLayer");
            this.f8078q.setAlpha(255);
            C1512y.n7h(canvas, this.f8079s, this.f8078q);
            C1476n.toq("Layer#saveLayer");
            t8r(canvas);
            C1476n.m6103k("Layer#drawLayer");
            mo6064i(canvas, this.f56084toq, iIntValue);
            C1476n.toq("Layer#drawLayer");
            if (o1t()) {
                kja0(canvas, this.f56084toq);
            }
            if (wvg()) {
                C1476n.m6103k("Layer#drawMatte");
                C1476n.m6103k("Layer#saveLayer");
                C1512y.kja0(canvas, this.f8079s, this.f56072f7l8, 19);
                C1476n.toq("Layer#saveLayer");
                t8r(canvas);
                this.f8074i.mo5890y(canvas, matrix, iIntValue);
                C1476n.m6103k("Layer#restoreLayer");
                canvas.restore();
                C1476n.toq("Layer#restoreLayer");
                C1476n.toq("Layer#drawMatte");
            }
            C1476n.m6103k("Layer#restoreLayer");
            canvas.restore();
            C1476n.toq("Layer#restoreLayer");
        }
        if (this.f56081o1t && (paint = this.f56085wvg) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f56085wvg.setColor(-251901);
            this.f56085wvg.setStrokeWidth(4.0f);
            canvas.drawRect(this.f8079s, this.f56085wvg);
            this.f56085wvg.setStyle(Paint.Style.FILL);
            this.f56085wvg.setColor(1357638635);
            canvas.drawRect(this.f8079s, this.f56085wvg);
        }
        fti(C1476n.toq(this.f56079n7h));
    }

    /* JADX INFO: renamed from: z */
    C1464n m6085z() {
        return this.f56071cdj;
    }

    @dd
    public C1452k zurt() {
        return this.f56071cdj.m6068k();
    }
}
