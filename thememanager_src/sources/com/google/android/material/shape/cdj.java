package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected static final float f67806ld6 = 180.0f;

    /* JADX INFO: renamed from: p */
    private static final float f24917p = 270.0f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public float f24918g;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public float f24919k;

    /* JADX INFO: renamed from: n */
    @Deprecated
    public float f24920n;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public float f24921q;

    /* JADX INFO: renamed from: s */
    private boolean f24922s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public float f67808toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public float f67809zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final List<f7l8> f67807f7l8 = new ArrayList();

    /* JADX INFO: renamed from: y */
    private final List<AbstractC4100s> f24923y = new ArrayList();

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class f7l8 {

        /* JADX INFO: renamed from: k */
        protected final Matrix f24924k = new Matrix();

        /* JADX INFO: renamed from: k */
        public abstract void mo14782k(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$g */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class C4096g extends f7l8 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f67810toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f67811zy;

        @Override // com.google.android.material.shape.cdj.f7l8
        /* JADX INFO: renamed from: k */
        public void mo14782k(@lvui Matrix matrix, @lvui Path path) {
            Matrix matrix2 = this.f24924k;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f67810toq, this.f67811zy);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$k */
    /* JADX INFO: compiled from: ShapePath.java */
    class C4097k extends AbstractC4100s {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ List f67812toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Matrix f67813zy;

        C4097k(List list, Matrix matrix) {
            this.f67812toq = list;
            this.f67813zy = matrix;
        }

        @Override // com.google.android.material.shape.cdj.AbstractC4100s
        /* JADX INFO: renamed from: k */
        public void mo14785k(Matrix matrix, com.google.android.material.shadow.toq toqVar, int i2, Canvas canvas) {
            Iterator it = this.f67812toq.iterator();
            while (it.hasNext()) {
                ((AbstractC4100s) it.next()).mo14785k(this.f67813zy, toqVar, i2, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$n */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class C4098n extends f7l8 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private float f67814f7l8;

        /* JADX INFO: renamed from: g */
        private float f24926g;

        /* JADX INFO: renamed from: n */
        private float f24927n;

        /* JADX INFO: renamed from: q */
        private float f24928q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f67815toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f67816zy;

        public C4098n(float f2, float f3, float f4, float f5, float f6, float f7) {
            m14791y(f2);
            m14788p(f3);
            m14790s(f4);
            ld6(f5);
            x2(f6);
            qrj(f7);
        }

        private float f7l8() {
            return this.f67814f7l8;
        }

        /* JADX INFO: renamed from: g */
        private float m14786g() {
            return this.f24926g;
        }

        private void ld6(float f2) {
            this.f24927n = f2;
        }

        /* JADX INFO: renamed from: n */
        private float m14787n() {
            return this.f67816zy;
        }

        /* JADX INFO: renamed from: p */
        private void m14788p(float f2) {
            this.f67816zy = f2;
        }

        /* JADX INFO: renamed from: q */
        private float m14789q() {
            return this.f67816zy;
        }

        private void qrj(float f2) {
            this.f67814f7l8 = f2;
        }

        /* JADX INFO: renamed from: s */
        private void m14790s(float f2) {
            this.f24928q = f2;
        }

        private float toq() {
            return this.f67815toq;
        }

        private void x2(float f2) {
            this.f24926g = f2;
        }

        /* JADX INFO: renamed from: y */
        private void m14791y(float f2) {
            this.f67815toq = f2;
        }

        private float zy() {
            return this.f24928q;
        }

        @Override // com.google.android.material.shape.cdj.f7l8
        /* JADX INFO: renamed from: k */
        public void mo14782k(@lvui Matrix matrix, @lvui Path path) {
            Matrix matrix2 = this.f24924k;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f67815toq, this.f67816zy, this.f24928q, this.f24927n, this.f24926g, this.f67814f7l8);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$q */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class C4099q extends f7l8 {

        /* JADX INFO: renamed from: y */
        private static final RectF f24929y = new RectF();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @Deprecated
        public float f67817f7l8;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f24930g;

        /* JADX INFO: renamed from: n */
        @Deprecated
        public float f24931n;

        /* JADX INFO: renamed from: q */
        @Deprecated
        public float f24932q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @Deprecated
        public float f67818toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @Deprecated
        public float f67819zy;

        public C4099q(float f2, float f3, float f4, float f5) {
            cdj(f2);
            fn3e(f3);
            ki(f4);
            m14793h(f5);
        }

        private void cdj(float f2) {
            this.f67818toq = f2;
        }

        private void fn3e(float f2) {
            this.f67819zy = f2;
        }

        /* JADX INFO: renamed from: h */
        private void m14793h(float f2) {
            this.f24931n = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m14794i(float f2) {
            this.f67817f7l8 = f2;
        }

        private void ki(float f2) {
            this.f24932q = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float kja0() {
            return this.f67819zy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float ld6() {
            return this.f67818toq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n7h() {
            return this.f67817f7l8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public float m14796p() {
            return this.f24931n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float qrj() {
            return this.f24930g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t8r(float f2) {
            this.f24930g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float x2() {
            return this.f24932q;
        }

        @Override // com.google.android.material.shape.cdj.f7l8
        /* JADX INFO: renamed from: k */
        public void mo14782k(@lvui Matrix matrix, @lvui Path path) {
            Matrix matrix2 = this.f24924k;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f24929y;
            rectF.set(ld6(), kja0(), x2(), m14796p());
            path.arcTo(rectF, qrj(), n7h(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$s */
    /* JADX INFO: compiled from: ShapePath.java */
    static abstract class AbstractC4100s {

        /* JADX INFO: renamed from: k */
        static final Matrix f24933k = new Matrix();

        AbstractC4100s() {
        }

        /* JADX INFO: renamed from: k */
        public abstract void mo14785k(Matrix matrix, com.google.android.material.shadow.toq toqVar, int i2, Canvas canvas);

        public final void toq(com.google.android.material.shadow.toq toqVar, int i2, Canvas canvas) {
            mo14785k(f24933k, toqVar, i2, canvas);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    static class toq extends AbstractC4100s {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C4099q f67820toq;

        public toq(C4099q c4099q) {
            this.f67820toq = c4099q;
        }

        @Override // com.google.android.material.shape.cdj.AbstractC4100s
        /* JADX INFO: renamed from: k */
        public void mo14785k(Matrix matrix, @lvui com.google.android.material.shadow.toq toqVar, int i2, @lvui Canvas canvas) {
            toqVar.m14771k(canvas, matrix, new RectF(this.f67820toq.ld6(), this.f67820toq.kja0(), this.f67820toq.x2(), this.f67820toq.m14796p()), i2, this.f67820toq.qrj(), this.f67820toq.n7h());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.cdj$y */
    /* JADX INFO: compiled from: ShapePath.java */
    public static class C4101y extends f7l8 {

        /* JADX INFO: renamed from: n */
        @Deprecated
        public float f24934n;

        /* JADX INFO: renamed from: q */
        @Deprecated
        public float f24935q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @Deprecated
        public float f67821toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @Deprecated
        public float f67822zy;

        private float f7l8() {
            return this.f67822zy;
        }

        /* JADX INFO: renamed from: g */
        private float m14800g() {
            return this.f67821toq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ld6(float f2) {
            this.f67822zy = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public void m14802p(float f2) {
            this.f67821toq = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qrj(float f2) {
            this.f24934n = f2;
        }

        /* JADX INFO: renamed from: s */
        private float m14804s() {
            return this.f24934n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x2(float f2) {
            this.f24935q = f2;
        }

        /* JADX INFO: renamed from: y */
        private float m14805y() {
            return this.f24935q;
        }

        @Override // com.google.android.material.shape.cdj.f7l8
        /* JADX INFO: renamed from: k */
        public void mo14782k(@lvui Matrix matrix, @lvui Path path) {
            Matrix matrix2 = this.f24924k;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m14800g(), f7l8(), m14805y(), m14804s());
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    static class zy extends AbstractC4100s {

        /* JADX INFO: renamed from: q */
        private final float f24936q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C4096g f67823toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final float f67824zy;

        public zy(C4096g c4096g, float f2, float f3) {
            this.f67823toq = c4096g;
            this.f67824zy = f2;
            this.f24936q = f3;
        }

        @Override // com.google.android.material.shape.cdj.AbstractC4100s
        /* JADX INFO: renamed from: k */
        public void mo14785k(Matrix matrix, @lvui com.google.android.material.shadow.toq toqVar, int i2, @lvui Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f67823toq.f67811zy - this.f24936q, this.f67823toq.f67810toq - this.f67824zy), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f67824zy, this.f24936q);
            matrix2.preRotate(zy());
            toqVar.toq(canvas, matrix2, rectF, i2);
        }

        float zy() {
            return (float) Math.toDegrees(Math.atan((this.f67823toq.f67811zy - this.f24936q) / (this.f67823toq.f67810toq - this.f67824zy)));
        }
    }

    public cdj() {
        m14777h(0.0f, 0.0f);
    }

    private void fn3e(float f2) {
        this.f24921q = f2;
    }

    /* JADX INFO: renamed from: i */
    private void m14773i(float f2) {
        this.f67809zy = f2;
    }

    private void ki(float f2) {
        this.f24920n = f2;
    }

    private void ni7(float f2) {
        this.f67808toq = f2;
    }

    /* JADX INFO: renamed from: s */
    private float m14774s() {
        return this.f24918g;
    }

    private void t8r(float f2) {
        this.f24918g = f2;
    }

    private void toq(float f2) {
        if (m14775y() == f2) {
            return;
        }
        float fM14775y = ((f2 - m14775y()) + 360.0f) % 360.0f;
        if (fM14775y > f67806ld6) {
            return;
        }
        C4099q c4099q = new C4099q(m14780p(), ld6(), m14780p(), ld6());
        c4099q.t8r(m14775y());
        c4099q.m14794i(fM14775y);
        this.f24923y.add(new toq(c4099q));
        ki(f2);
    }

    /* JADX INFO: renamed from: y */
    private float m14775y() {
        return this.f24920n;
    }

    private void zurt(float f2) {
        this.f24919k = f2;
    }

    private void zy(AbstractC4100s abstractC4100s, float f2, float f3) {
        toq(f2);
        this.f24923y.add(abstractC4100s);
        ki(f3);
    }

    public void cdj(float f2, float f3, float f4, float f5) {
        zurt(f2);
        ni7(f3);
        m14773i(f2);
        fn3e(f3);
        ki(f4);
        t8r((f4 + f5) % 360.0f);
        this.f67807f7l8.clear();
        this.f24923y.clear();
        this.f24922s = false;
    }

    @hyr(21)
    public void f7l8(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f67807f7l8.add(new C4098n(f2, f3, f4, f5, f6, f7));
        this.f24922s = true;
        m14773i(f6);
        fn3e(f7);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    AbstractC4100s m14776g(Matrix matrix) {
        toq(m14774s());
        return new C4097k(new ArrayList(this.f24923y), new Matrix(matrix));
    }

    /* JADX INFO: renamed from: h */
    public void m14777h(float f2, float f3) {
        cdj(f2, f3, f24917p, 0.0f);
    }

    /* JADX INFO: renamed from: k */
    public void m14778k(float f2, float f3, float f4, float f5, float f6, float f7) {
        C4099q c4099q = new C4099q(f2, f3, f4, f5);
        c4099q.t8r(f6);
        c4099q.m14794i(f7);
        this.f67807f7l8.add(c4099q);
        toq toqVar = new toq(c4099q);
        float f8 = f6 + f7;
        boolean z2 = f7 < 0.0f;
        if (z2) {
            f6 = (f6 + f67806ld6) % 360.0f;
        }
        zy(toqVar, f6, z2 ? (f67806ld6 + f8) % 360.0f : f8);
        double d2 = f8;
        m14773i(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        fn3e(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    @hyr(21)
    public void kja0(float f2, float f3, float f4, float f5) {
        C4101y c4101y = new C4101y();
        c4101y.m14802p(f2);
        c4101y.ld6(f3);
        c4101y.x2(f4);
        c4101y.qrj(f5);
        this.f67807f7l8.add(c4101y);
        this.f24922s = true;
        m14773i(f4);
        fn3e(f5);
    }

    float ld6() {
        return this.f24921q;
    }

    /* JADX INFO: renamed from: n */
    boolean m14779n() {
        return this.f24922s;
    }

    public void n7h(float f2, float f3) {
        C4096g c4096g = new C4096g();
        c4096g.f67810toq = f2;
        c4096g.f67811zy = f3;
        this.f67807f7l8.add(c4096g);
        zy zyVar = new zy(c4096g, m14780p(), ld6());
        zy(zyVar, zyVar.zy() + f24917p, zyVar.zy() + f24917p);
        m14773i(f2);
        fn3e(f3);
    }

    /* JADX INFO: renamed from: p */
    float m14780p() {
        return this.f67809zy;
    }

    /* JADX INFO: renamed from: q */
    public void m14781q(Matrix matrix, Path path) {
        int size = this.f67807f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f67807f7l8.get(i2).mo14782k(matrix, path);
        }
    }

    float qrj() {
        return this.f67808toq;
    }

    float x2() {
        return this.f24919k;
    }

    public cdj(float f2, float f3) {
        m14777h(f2, f3);
    }
}
