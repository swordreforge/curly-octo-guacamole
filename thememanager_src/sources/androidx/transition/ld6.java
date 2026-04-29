package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.transition.jk;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: ChangeTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 extends oc {
    private static final String bd = "android:changeTransform:parent";
    private static final String tgs = "android:changeTransform:intermediateMatrix";
    private static final String w97r = "android:changeTransform:intermediateParentMatrix";
    private Matrix ar;
    boolean bs;
    private boolean k0;
    private static final String bc = "android:changeTransform:matrix";
    private static final String bu = "android:changeTransform:transforms";
    private static final String tlhn = "android:changeTransform:parentMatrix";
    private static final String[] yl25 = {bc, bu, tlhn};
    private static final Property<C1228n, float[]> zmmu = new C1227k(float[].class, "nonTranslations");
    private static final Property<C1228n, PointF> sk1t = new toq(PointF.class, "translations");
    private static final boolean dy = true;

    /* JADX INFO: renamed from: androidx.transition.ld6$g */
    /* JADX INFO: compiled from: ChangeTransform.java */
    private static class C1226g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final float f53504f7l8;

        /* JADX INFO: renamed from: g */
        final float f6687g;

        /* JADX INFO: renamed from: k */
        final float f6688k;

        /* JADX INFO: renamed from: n */
        final float f6689n;

        /* JADX INFO: renamed from: q */
        final float f6690q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final float f53505toq;

        /* JADX INFO: renamed from: y */
        final float f6691y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final float f53506zy;

        C1226g(View view) {
            this.f6688k = view.getTranslationX();
            this.f53505toq = view.getTranslationY();
            this.f53506zy = C0683f.m3176v(view);
            this.f6690q = view.getScaleX();
            this.f6689n = view.getScaleY();
            this.f6687g = view.getRotationX();
            this.f53504f7l8 = view.getRotationY();
            this.f6691y = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1226g)) {
                return false;
            }
            C1226g c1226g = (C1226g) obj;
            return c1226g.f6688k == this.f6688k && c1226g.f53505toq == this.f53505toq && c1226g.f53506zy == this.f53506zy && c1226g.f6690q == this.f6690q && c1226g.f6689n == this.f6689n && c1226g.f6687g == this.f6687g && c1226g.f53504f7l8 == this.f53504f7l8 && c1226g.f6691y == this.f6691y;
        }

        public int hashCode() {
            float f2 = this.f6688k;
            int iFloatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.f53505toq;
            int iFloatToIntBits2 = (iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f53506zy;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f6690q;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f6689n;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f6687g;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f53504f7l8;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f6691y;
            return iFloatToIntBits7 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0);
        }

        /* JADX INFO: renamed from: k */
        public void m5371k(View view) {
            ld6.i9jn(view, this.f6688k, this.f53505toq, this.f53506zy, this.f6690q, this.f6689n, this.f6687g, this.f53504f7l8, this.f6691y);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ld6$k */
    /* JADX INFO: compiled from: ChangeTransform.java */
    class C1227k extends Property<C1228n, float[]> {
        C1227k(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] get(C1228n c1228n) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(C1228n c1228n, float[] fArr) {
            c1228n.m5374q(fArr);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ld6$n */
    /* JADX INFO: compiled from: ChangeTransform.java */
    private static class C1228n {

        /* JADX INFO: renamed from: k */
        private final Matrix f6692k = new Matrix();

        /* JADX INFO: renamed from: n */
        private float f6693n;

        /* JADX INFO: renamed from: q */
        private float f6694q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final View f53507toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final float[] f53508zy;

        C1228n(View view, float[] fArr) {
            this.f53507toq = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f53508zy = fArr2;
            this.f6694q = fArr2[2];
            this.f6693n = fArr2[5];
            toq();
        }

        private void toq() {
            float[] fArr = this.f53508zy;
            fArr[2] = this.f6694q;
            fArr[5] = this.f6693n;
            this.f6692k.setValues(fArr);
            C1231m.m5388g(this.f53507toq, this.f6692k);
        }

        /* JADX INFO: renamed from: k */
        Matrix m5373k() {
            return this.f6692k;
        }

        /* JADX INFO: renamed from: q */
        void m5374q(float[] fArr) {
            System.arraycopy(fArr, 0, this.f53508zy, 0, fArr.length);
            toq();
        }

        void zy(PointF pointF) {
            this.f6694q = pointF.x;
            this.f6693n = pointF.y;
            toq();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ld6$q */
    /* JADX INFO: compiled from: ChangeTransform.java */
    private static class C1229q extends d2ok {

        /* JADX INFO: renamed from: k */
        private View f6695k;

        /* JADX INFO: renamed from: q */
        private cdj f6696q;

        C1229q(View view, cdj cdjVar) {
            this.f6695k = view;
            this.f6696q = cdjVar;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
            this.f6696q.setVisibility(0);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            ocVar.mo5320x(this);
            fn3e.toq(this.f6695k);
            this.f6695k.setTag(jk.f7l8.f52504b8, null);
            this.f6695k.setTag(jk.f7l8.f52563ltg8, null);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
            this.f6696q.setVisibility(4);
        }
    }

    /* JADX INFO: compiled from: ChangeTransform.java */
    class toq extends Property<C1228n, PointF> {
        toq(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(C1228n c1228n) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(C1228n c1228n, PointF pointF) {
            c1228n.zy(pointF);
        }
    }

    /* JADX INFO: compiled from: ChangeTransform.java */
    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Matrix f6697g;

        /* JADX INFO: renamed from: k */
        private boolean f6699k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f6700n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ C1228n f6701p;

        /* JADX INFO: renamed from: q */
        private Matrix f6702q = new Matrix();

        /* JADX INFO: renamed from: s */
        final /* synthetic */ C1226g f6703s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ View f6704y;

        zy(boolean z2, Matrix matrix, View view, C1226g c1226g, C1228n c1228n) {
            this.f6700n = z2;
            this.f6697g = matrix;
            this.f6704y = view;
            this.f6703s = c1226g;
            this.f6701p = c1228n;
        }

        /* JADX INFO: renamed from: k */
        private void m5376k(Matrix matrix) {
            this.f6702q.set(matrix);
            this.f6704y.setTag(jk.f7l8.f52504b8, this.f6702q);
            this.f6703s.m5371k(this.f6704y);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6699k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f6699k) {
                if (this.f6700n && ld6.this.bs) {
                    m5376k(this.f6697g);
                } else {
                    this.f6704y.setTag(jk.f7l8.f52504b8, null);
                    this.f6704y.setTag(jk.f7l8.f52563ltg8, null);
                }
            }
            C1231m.m5388g(this.f6704y, null);
            this.f6703s.m5371k(this.f6704y);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m5376k(this.f6701p.m5373k());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ld6.was(this.f6704y);
        }
    }

    public ld6() {
        this.bs = true;
        this.k0 = true;
        this.ar = new Matrix();
    }

    private void fnq8(C1225l c1225l) {
        View view = c1225l.f53502toq;
        if (view.getVisibility() == 8) {
            return;
        }
        c1225l.f6686k.put(bd, view.getParent());
        c1225l.f6686k.put(bu, new C1226g(view));
        Matrix matrix = view.getMatrix();
        c1225l.f6686k.put(bc, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.k0) {
            Matrix matrix2 = new Matrix();
            C1231m.m5391p((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            c1225l.f6686k.put(tlhn, matrix2);
            c1225l.f6686k.put(tgs, view.getTag(jk.f7l8.f52504b8));
            c1225l.f6686k.put(w97r, view.getTag(jk.f7l8.f52563ltg8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g1(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.m5412m(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.m5412m(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.l r4 = r3.ncyb(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f53502toq
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ld6.g1(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    private void gbni(C1225l c1225l, C1225l c1225l2) {
        Matrix matrix = (Matrix) c1225l2.f6686k.get(tlhn);
        c1225l2.f53502toq.setTag(jk.f7l8.f52563ltg8, matrix);
        Matrix matrix2 = this.ar;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) c1225l.f6686k.get(bc);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            c1225l.f6686k.put(bc, matrix3);
        }
        matrix3.postConcat((Matrix) c1225l.f6686k.get(tlhn));
        matrix3.postConcat(matrix2);
    }

    static void i9jn(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        C0683f.wt(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    private void qo(ViewGroup viewGroup, C1225l c1225l, C1225l c1225l2) {
        View view = c1225l2.f53502toq;
        Matrix matrix = new Matrix((Matrix) c1225l2.f6686k.get(tlhn));
        C1231m.ld6(viewGroup, matrix);
        cdj cdjVarM5338k = fn3e.m5338k(view, viewGroup, matrix);
        if (cdjVarM5338k == null) {
            return;
        }
        cdjVarM5338k.mo5307k((ViewGroup) c1225l.f6686k.get(bd), c1225l.f53502toq);
        oc ocVar = this;
        while (true) {
            dd ddVar = ocVar.f6747o;
            if (ddVar == null) {
                break;
            } else {
                ocVar = ddVar;
            }
        }
        ocVar.mo5316k(new C1229q(view, cdjVarM5338k));
        if (dy) {
            View view2 = c1225l.f53502toq;
            if (view2 != c1225l2.f53502toq) {
                C1231m.m5394y(view2, 0.0f);
            }
            C1231m.m5394y(view, 1.0f);
        }
    }

    private ObjectAnimator tfm(C1225l c1225l, C1225l c1225l2, boolean z2) {
        Matrix matrix = (Matrix) c1225l.f6686k.get(bc);
        Matrix matrix2 = (Matrix) c1225l2.f6686k.get(bc);
        if (matrix == null) {
            matrix = fu4.f6429k;
        }
        if (matrix2 == null) {
            matrix2 = fu4.f6429k;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C1226g c1226g = (C1226g) c1225l2.f6686k.get(bu);
        View view = c1225l2.f53502toq;
        was(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1228n c1228n = new C1228n(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c1228n, PropertyValuesHolder.ofObject(zmmu, new kja0(new float[9]), fArr, fArr2), mcp.m5397k(sk1t, n5r1().mo5403k(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        zy zyVar = new zy(z2, matrix3, view, c1226g, c1228n);
        objectAnimatorOfPropertyValuesHolder.addListener(zyVar);
        C1224k.m5365k(objectAnimatorOfPropertyValuesHolder, zyVar);
        return objectAnimatorOfPropertyValuesHolder;
    }

    static void was(View view) {
        i9jn(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    public boolean d8wk() {
        return this.bs;
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        if (c1225l == null || c1225l2 == null || !c1225l.f6686k.containsKey(bd) || !c1225l2.f6686k.containsKey(bd)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) c1225l.f6686k.get(bd);
        boolean z2 = this.k0 && !g1(viewGroup2, (ViewGroup) c1225l2.f6686k.get(bd));
        Matrix matrix = (Matrix) c1225l.f6686k.get(tgs);
        if (matrix != null) {
            c1225l.f6686k.put(bc, matrix);
        }
        Matrix matrix2 = (Matrix) c1225l.f6686k.get(w97r);
        if (matrix2 != null) {
            c1225l.f6686k.put(tlhn, matrix2);
        }
        if (z2) {
            gbni(c1225l, c1225l2);
        }
        ObjectAnimator objectAnimatorTfm = tfm(c1225l, c1225l2, z2);
        if (z2 && objectAnimatorTfm != null && this.bs) {
            qo(viewGroup, c1225l, c1225l2);
        } else if (!dy) {
            viewGroup2.endViewTransition(c1225l.f53502toq);
        }
        return objectAnimatorTfm;
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
        if (dy) {
            return;
        }
        ((ViewGroup) c1225l.f53502toq.getParent()).startViewTransition(c1225l.f53502toq);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public String[] nn86() {
        return yl25;
    }

    public void py(boolean z2) {
        this.bs = z2;
    }

    public boolean wo() {
        return this.k0;
    }

    public void zsr0(boolean z2) {
        this.k0 = z2;
    }

    @SuppressLint({"RestrictedApi"})
    public ld6(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bs = true;
        this.k0 = true;
        this.ar = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f52473f7l8);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.bs = androidx.core.content.res.kja0.m2304n(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.k0 = androidx.core.content.res.kja0.m2304n(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
