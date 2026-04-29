package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C0683f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;
import zy.uv6;

/* JADX INFO: compiled from: Slide.java */
/* JADX INFO: loaded from: classes.dex */
public class gvn7 extends t8iq {
    private static final String sk1t = "android:slide:screenPosition";
    private int tgs;
    private f7l8 w97r;
    private static final TimeInterpolator yl25 = new DecelerateInterpolator();
    private static final TimeInterpolator zmmu = new AccelerateInterpolator();
    private static final f7l8 dy = new C1206k();
    private static final f7l8 vb6 = new toq();
    private static final f7l8 k6e = new zy();
    private static final f7l8 xk5 = new C1209q();
    private static final f7l8 s8y = new C1207n();
    private static final f7l8 mjvl = new C1205g();

    /* JADX INFO: compiled from: Slide.java */
    private interface f7l8 {
        /* JADX INFO: renamed from: k */
        float mo5347k(ViewGroup viewGroup, View view);

        float toq(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$g */
    /* JADX INFO: compiled from: Slide.java */
    class C1205g extends AbstractC1210s {
        C1205g() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        /* JADX INFO: renamed from: k */
        public float mo5347k(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$k */
    /* JADX INFO: compiled from: Slide.java */
    class C1206k extends AbstractC1211y {
        C1206k() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        public float toq(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$n */
    /* JADX INFO: compiled from: Slide.java */
    class C1207n extends AbstractC1211y {
        C1207n() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        public float toq(ViewGroup viewGroup, View view) {
            return C0683f.m3159e(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$p */
    /* JADX INFO: compiled from: Slide.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC1208p {
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$q */
    /* JADX INFO: compiled from: Slide.java */
    class C1209q extends AbstractC1211y {
        C1209q() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        public float toq(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$s */
    /* JADX INFO: compiled from: Slide.java */
    private static abstract class AbstractC1210s implements f7l8 {
        private AbstractC1210s() {
        }

        @Override // androidx.transition.gvn7.f7l8
        public float toq(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ AbstractC1210s(C1206k c1206k) {
            this();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    class toq extends AbstractC1211y {
        toq() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        public float toq(ViewGroup viewGroup, View view) {
            return C0683f.m3159e(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.gvn7$y */
    /* JADX INFO: compiled from: Slide.java */
    private static abstract class AbstractC1211y implements f7l8 {
        private AbstractC1211y() {
        }

        @Override // androidx.transition.gvn7.f7l8
        /* JADX INFO: renamed from: k */
        public float mo5347k(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ AbstractC1211y(C1206k c1206k) {
            this();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    class zy extends AbstractC1210s {
        zy() {
            super(null);
        }

        @Override // androidx.transition.gvn7.f7l8
        /* JADX INFO: renamed from: k */
        public float mo5347k(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public gvn7() {
        this.w97r = mjvl;
        this.tgs = 80;
        i9jn(80);
    }

    private void fnq8(C1225l c1225l) {
        int[] iArr = new int[2];
        c1225l.f53502toq.getLocationOnScreen(iArr);
        c1225l.f6686k.put(sk1t, iArr);
    }

    @Override // androidx.transition.t8iq, androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        super.cdj(c1225l);
        fnq8(c1225l);
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        if (c1225l2 == null) {
            return null;
        }
        int[] iArr = (int[]) c1225l2.f6686k.get(sk1t);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return hyr.m5356k(view, c1225l2, iArr[0], iArr[1], this.w97r.toq(viewGroup, view), this.w97r.mo5347k(viewGroup, view), translationX, translationY, yl25, this);
    }

    @Override // androidx.transition.t8iq, androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        super.mo5315i(c1225l);
        fnq8(c1225l);
    }

    public void i9jn(int i2) {
        if (i2 == 3) {
            this.w97r = dy;
        } else if (i2 == 5) {
            this.w97r = xk5;
        } else if (i2 == 48) {
            this.w97r = k6e;
        } else if (i2 == 80) {
            this.w97r = mjvl;
        } else if (i2 == 8388611) {
            this.w97r = vb6;
        } else {
            if (i2 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.w97r = s8y;
        }
        this.tgs = i2;
        jp0y jp0yVar = new jp0y();
        jp0yVar.ld6(i2);
        mo5313d(jp0yVar);
    }

    public int py() {
        return this.tgs;
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        if (c1225l == null) {
            return null;
        }
        int[] iArr = (int[]) c1225l.f6686k.get(sk1t);
        return hyr.m5356k(view, c1225l, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.w97r.toq(viewGroup, view), this.w97r.mo5347k(viewGroup, view), zmmu, this);
    }

    public gvn7(int i2) {
        this.w97r = mjvl;
        this.tgs = 80;
        i9jn(i2);
    }

    @SuppressLint({"RestrictedApi"})
    public gvn7(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w97r = mjvl;
        this.tgs = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6381y);
        int iLd6 = androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        i9jn(iLd6);
    }
}
