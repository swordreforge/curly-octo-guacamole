package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import java.util.Map;

/* JADX INFO: compiled from: ChangeBounds.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends oc {
    private boolean ar;
    private int[] bs;
    private boolean k0;
    private static final String bc = "android:changeBounds:bounds";
    private static final String bu = "android:changeBounds:clip";
    private static final String bd = "android:changeBounds:parent";
    private static final String tlhn = "android:changeBounds:windowX";
    private static final String w97r = "android:changeBounds:windowY";
    private static final String[] tgs = {bc, bu, bd, tlhn, w97r};
    private static final Property<Drawable, PointF> yl25 = new toq(PointF.class, "boundsOrigin");
    private static final Property<ld6, PointF> zmmu = new zy(PointF.class, "topLeft");
    private static final Property<ld6, PointF> sk1t = new C1200q(PointF.class, "bottomRight");
    private static final Property<View, PointF> dy = new C1198n(PointF.class, "bottomRight");
    private static final Property<View, PointF> vb6 = new C1196g(PointF.class, "topLeft");
    private static final Property<View, PointF> k6e = new C7896f7l8(PointF.class, "position");
    private static a9 xk5 = new a9();

    /* JADX INFO: renamed from: androidx.transition.f7l8$f7l8, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C7896f7l8 extends Property<View, PointF> {
        C7896f7l8(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C1231m.f7l8(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$g */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1196g extends Property<View, PointF> {
        C1196g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C1231m.f7l8(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$k */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1197k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f6402g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f6403k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6404n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ BitmapDrawable f6405q;

        C1197k(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f6403k = viewGroup;
            this.f6405q = bitmapDrawable;
            this.f6404n = view;
            this.f6402g = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1231m.toq(this.f6403k).toq(this.f6405q);
            C1231m.m5394y(this.f6404n, this.f6402g);
        }
    }

    /* JADX INFO: compiled from: ChangeBounds.java */
    private static class ld6 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f52490f7l8;

        /* JADX INFO: renamed from: g */
        private int f6407g;

        /* JADX INFO: renamed from: k */
        private int f6408k;

        /* JADX INFO: renamed from: n */
        private View f6409n;

        /* JADX INFO: renamed from: q */
        private int f6410q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f52491toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f52492zy;

        ld6(View view) {
            this.f6409n = view;
        }

        private void toq() {
            C1231m.f7l8(this.f6409n, this.f6408k, this.f52491toq, this.f52492zy, this.f6410q);
            this.f6407g = 0;
            this.f52490f7l8 = 0;
        }

        /* JADX INFO: renamed from: k */
        void m5333k(PointF pointF) {
            this.f52492zy = Math.round(pointF.x);
            this.f6410q = Math.round(pointF.y);
            int i2 = this.f52490f7l8 + 1;
            this.f52490f7l8 = i2;
            if (this.f6407g == i2) {
                toq();
            }
        }

        void zy(PointF pointF) {
            this.f6408k = Math.round(pointF.x);
            this.f52491toq = Math.round(pointF.y);
            int i2 = this.f6407g + 1;
            this.f6407g = i2;
            if (i2 == this.f52490f7l8) {
                toq();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$n */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1198n extends Property<View, PointF> {
        C1198n(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C1231m.f7l8(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$p */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1199p extends d2ok {

        /* JADX INFO: renamed from: k */
        boolean f6411k = false;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewGroup f6413q;

        C1199p(ViewGroup viewGroup) {
            this.f6413q = viewGroup;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
            C1194e.m5324q(this.f6413q, true);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: n */
        public void mo5310n(@zy.lvui oc ocVar) {
            C1194e.m5324q(this.f6413q, false);
            this.f6411k = true;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            if (!this.f6411k) {
                C1194e.m5324q(this.f6413q, false);
            }
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
            C1194e.m5324q(this.f6413q, false);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$q */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1200q extends Property<ld6, PointF> {
        C1200q(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(ld6 ld6Var) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(ld6 ld6Var, PointF pointF) {
            ld6Var.m5333k(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$s */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1201s extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f6414g;

        /* JADX INFO: renamed from: k */
        private boolean f6416k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Rect f6417n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ int f6418p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f6419q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f6420s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f6421y;

        C1201s(View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f6419q = view;
            this.f6417n = rect;
            this.f6414g = i2;
            this.f6421y = i3;
            this.f6420s = i4;
            this.f6418p = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6416k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6416k) {
                return;
            }
            C0683f.vy(this.f6419q, this.f6417n);
            C1231m.f7l8(this.f6419q, this.f6414g, this.f6421y, this.f6420s, this.f6418p);
        }
    }

    /* JADX INFO: compiled from: ChangeBounds.java */
    class toq extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: k */
        private Rect f6422k;

        toq(Class cls, String str) {
            super(cls, str);
            this.f6422k = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6422k);
            Rect rect = this.f6422k;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6422k);
            this.f6422k.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6422k);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.f7l8$y */
    /* JADX INFO: compiled from: ChangeBounds.java */
    class C1202y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ld6 f6423k;
        private ld6 mViewBounds;

        C1202y(ld6 ld6Var) {
            this.f6423k = ld6Var;
            this.mViewBounds = ld6Var;
        }
    }

    /* JADX INFO: compiled from: ChangeBounds.java */
    class zy extends Property<ld6, PointF> {
        zy(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PointF get(ld6 ld6Var) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(ld6 ld6Var, PointF pointF) {
            ld6Var.zy(pointF);
        }
    }

    public f7l8() {
        this.bs = new int[2];
        this.k0 = false;
        this.ar = false;
    }

    private void fnq8(C1225l c1225l) {
        View view = c1225l.f53502toq;
        if (!C0683f.v0af(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1225l.f6686k.put(bc, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1225l.f6686k.put(bd, c1225l.f53502toq.getParent());
        if (this.ar) {
            c1225l.f53502toq.getLocationInWindow(this.bs);
            c1225l.f6686k.put(tlhn, Integer.valueOf(this.bs[0]));
            c1225l.f6686k.put(w97r, Integer.valueOf(this.bs[1]));
        }
        if (this.k0) {
            c1225l.f6686k.put(bu, C0683f.x9kr(view));
        }
    }

    private boolean tfm(View view, View view2) {
        if (!this.ar) {
            return true;
        }
        C1225l c1225lNcyb = ncyb(view, true);
        if (c1225lNcyb == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == c1225lNcyb.f53502toq) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorZy;
        if (c1225l == null || c1225l2 == null) {
            return null;
        }
        Map<String, Object> map = c1225l.f6686k;
        Map<String, Object> map2 = c1225l2.f6686k;
        ViewGroup viewGroup2 = (ViewGroup) map.get(bd);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(bd);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c1225l2.f53502toq;
        if (!tfm(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) c1225l.f6686k.get(tlhn)).intValue();
            int iIntValue2 = ((Integer) c1225l.f6686k.get(w97r)).intValue();
            int iIntValue3 = ((Integer) c1225l2.f6686k.get(tlhn)).intValue();
            int iIntValue4 = ((Integer) c1225l2.f6686k.get(w97r)).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.bs);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fZy = C1231m.zy(view2);
            C1231m.m5394y(view2, 0.0f);
            C1231m.toq(viewGroup).mo5305k(bitmapDrawable);
            o1t o1tVarN5r1 = n5r1();
            int[] iArr = this.bs;
            int i4 = iArr[0];
            int i5 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, mcp.m5397k(yl25, o1tVarN5r1.mo5403k(iIntValue - i4, iIntValue2 - i5, iIntValue3 - i4, iIntValue4 - i5)));
            objectAnimatorOfPropertyValuesHolder.addListener(new C1197k(viewGroup, bitmapDrawable, view2, fZy));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c1225l.f6686k.get(bc);
        Rect rect3 = (Rect) c1225l2.f6686k.get(bc);
        int i6 = rect2.left;
        int i7 = rect3.left;
        int i8 = rect2.top;
        int i9 = rect3.top;
        int i10 = rect2.right;
        int i11 = rect3.right;
        int i12 = rect2.bottom;
        int i13 = rect3.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect4 = (Rect) c1225l.f6686k.get(bu);
        Rect rect5 = (Rect) c1225l2.f6686k.get(bu);
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i2 = 0;
        } else {
            i2 = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.k0) {
            view = view2;
            C1231m.f7l8(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
            ObjectAnimator objectAnimatorM5441k = (i6 == i7 && i8 == i9) ? null : C1252z.m5441k(view, k6e, n5r1().mo5403k(i6, i8, i7, i9));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i14, i15);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i16, i17) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C0683f.vy(view, rect);
                a9 a9Var = xk5;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", a9Var, objArr);
                objectAnimatorOfObject.addListener(new C1201s(view, rect5, i7, i9, i11, i13));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorZy = ncyb.zy(objectAnimatorM5441k, objectAnimator);
        } else {
            view = view2;
            C1231m.f7l8(view, i6, i8, i10, i12);
            if (i2 != 2) {
                animatorZy = (i6 == i7 && i8 == i9) ? C1252z.m5441k(view, dy, n5r1().mo5403k(i10, i12, i11, i13)) : C1252z.m5441k(view, vb6, n5r1().mo5403k(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorZy = C1252z.m5441k(view, k6e, n5r1().mo5403k(i6, i8, i7, i9));
            } else {
                ld6 ld6Var = new ld6(view);
                ObjectAnimator objectAnimatorM5441k2 = C1252z.m5441k(ld6Var, zmmu, n5r1().mo5403k(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorM5441k3 = C1252z.m5441k(ld6Var, sk1t, n5r1().mo5403k(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM5441k2, objectAnimatorM5441k3);
                animatorSet.addListener(new C1202y(ld6Var));
                animatorZy = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C1194e.m5324q(viewGroup4, true);
            mo5316k(new C1199p(viewGroup4));
        }
        return animatorZy;
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public String[] nn86() {
        return tgs;
    }

    public boolean qo() {
        return this.k0;
    }

    public void wo(boolean z2) {
        this.k0 = z2;
    }

    @SuppressLint({"RestrictedApi"})
    public f7l8(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bs = new int[2];
        this.k0 = false;
        this.ar = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6379q);
        boolean zM2304n = androidx.core.content.res.kja0.m2304n(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        wo(zM2304n);
    }
}
