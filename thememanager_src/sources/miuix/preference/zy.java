package miuix.preference;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0498q;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.preference.kja0;
import zy.lvui;

/* JADX INFO: compiled from: ConnectPreferenceHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f90016fn3e = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final float f90017fu4 = 1.5f;

    /* JADX INFO: renamed from: i */
    public static final int f41511i = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f90018ni7 = 300;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int[] f90019o1t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f90020t8r = "ConnectPreferenceHelper";

    /* JADX INFO: renamed from: z */
    private static final int[] f41512z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f90021zurt = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Context f90022cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ColorStateList f90023f7l8;

    /* JADX INFO: renamed from: g */
    private ColorStateList f41513g;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private View f90024ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ValueAnimator f90025kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private AnimatedVectorDrawable f90026ld6;

    /* JADX INFO: renamed from: n */
    private TextView f41516n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private ValueAnimator f90027n7h;

    /* JADX INFO: renamed from: p */
    private Drawable f41517p;

    /* JADX INFO: renamed from: q */
    private TextView f41518q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private ValueAnimator f90028qrj;

    /* JADX INFO: renamed from: s */
    private LayerDrawable f41519s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ValueAnimator f90030x2;

    /* JADX INFO: renamed from: y */
    private ColorStateList f41520y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Preference f90031zy;

    /* JADX INFO: renamed from: k */
    private int f41515k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f90029toq = -1;

    /* JADX INFO: renamed from: h */
    private boolean f41514h = true;

    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class f7l8 extends AnimatorListenerAdapter {
        f7l8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@lvui Animator animator) {
            if (zy.this.f90026ld6 != null && zy.this.f90026ld6.isRunning()) {
                zy.this.f90026ld6.stop();
            }
            if (zy.this.f41515k == 1) {
                zy.this.f41517p.setAlpha(255);
            } else {
                zy.this.f41517p.setAlpha(0);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$g */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C7312g implements ValueAnimator.AnimatorUpdateListener {
        C7312g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (zy.this.f41516n != null) {
                zy.this.f41516n.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$k */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C7313k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41523k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f41525q;

        C7313k(int i2, int i3) {
            this.f41523k = i2;
            this.f41525q = i3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@lvui Animator animator) {
            Drawable drawableCdj = zy.this.f90031zy.cdj();
            if (drawableCdj == null || !zy.this.f41514h) {
                return;
            }
            if (zy.this.f41515k == 1) {
                androidx.core.graphics.drawable.zy.n7h(drawableCdj, this.f41523k);
            } else {
                androidx.core.graphics.drawable.zy.n7h(drawableCdj, this.f41525q);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$n */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C7314n extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41526k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f41528q;

        C7314n(int i2, int i3) {
            this.f41526k = i2;
            this.f41528q = i3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@lvui Animator animator) {
            if (zy.this.f41516n != null) {
                if (zy.this.f41515k == 1) {
                    zy.this.f41516n.setTextColor(this.f41526k);
                } else {
                    zy.this.f41516n.setTextColor(this.f41528q);
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$q */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C7315q implements ValueAnimator.AnimatorUpdateListener {
        C7315q() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (zy.this.f41518q != null) {
                zy.this.f41518q.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Drawable drawableCdj = zy.this.f90031zy.cdj();
            if (drawableCdj == null || !zy.this.f41514h) {
                return;
            }
            androidx.core.graphics.drawable.zy.n7h(drawableCdj, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$y */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C7316y implements ValueAnimator.AnimatorUpdateListener {
        C7316y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            zy.this.f41517p.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: miuix.preference.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConnectPreferenceHelper.java */
    class C8109zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41532k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f41534q;

        C8109zy(int i2, int i3) {
            this.f41532k = i2;
            this.f41534q = i3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@lvui Animator animator) {
            if (zy.this.f41518q != null) {
                if (zy.this.f41515k == 1) {
                    zy.this.f41516n.setTextColor(this.f41532k);
                } else {
                    zy.this.f41516n.setTextColor(this.f41534q);
                }
            }
        }
    }

    static {
        int i2 = kja0.C7297q.n5;
        f41512z = new int[]{i2};
        f90019o1t = new int[]{-i2};
    }

    public zy(Context context, Preference preference) {
        this.f90022cdj = context;
        this.f90031zy = preference;
        this.f41513g = C0498q.f7l8(context, kja0.C7292g.l8s);
        this.f90023f7l8 = C0498q.f7l8(context, kja0.C7292g.frtx);
        this.f41520y = C0498q.f7l8(context, kja0.C7292g.mdr);
        m26501s(context);
    }

    private void cdj(boolean z2) {
        int i2 = this.f41515k;
        if (i2 == 0) {
            m26497i(z2);
        } else if (i2 == 1) {
            ki(z2);
        } else {
            if (i2 != 2) {
                return;
            }
            t8r(z2);
        }
    }

    private void fn3e(int[] iArr) {
        Drawable drawableCdj = this.f90031zy.cdj();
        if (drawableCdj != null && this.f41514h) {
            androidx.core.graphics.drawable.zy.n7h(drawableCdj, this.f41520y.getColorForState(iArr, kja0.C7292g.m7));
        }
        TextView textView = this.f41518q;
        if (textView != null) {
            textView.setTextColor(this.f41513g.getColorForState(iArr, kja0.C7292g.q8d));
        }
        TextView textView2 = this.f41516n;
        if (textView2 != null) {
            textView2.setTextColor(this.f90023f7l8.getColorForState(iArr, kja0.C7292g.que));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m26496h() {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        if (this.f90030x2.isRunning()) {
            this.f90030x2.cancel();
        }
        this.f90030x2.setInterpolator(decelerateInterpolator);
        this.f90030x2.start();
        if (this.f90028qrj.isRunning()) {
            this.f90028qrj.cancel();
        }
        this.f90028qrj.setInterpolator(decelerateInterpolator);
        this.f90028qrj.start();
        if (this.f90027n7h.isRunning()) {
            this.f90027n7h.cancel();
        }
        this.f90027n7h.setInterpolator(decelerateInterpolator);
        this.f90027n7h.start();
        if (this.f90025kja0.isRunning()) {
            this.f90025kja0.cancel();
        }
        this.f90025kja0.setInterpolator(decelerateInterpolator);
        this.f90025kja0.start();
    }

    /* JADX INFO: renamed from: i */
    private void m26497i(boolean z2) {
        if (z2 && this.f90029toq == 1) {
            fn3e(f41512z);
            this.f41517p.setAlpha(255);
            kja0();
        } else {
            this.f41517p.setAlpha(0);
            fn3e(f90019o1t);
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f90026ld6;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
            this.f90026ld6.setAlpha(0);
        }
        zurt(f90019o1t);
    }

    private void ki(boolean z2) {
        if (z2) {
            fn3e(f90019o1t);
            m26496h();
        } else {
            this.f41517p.setAlpha(255);
            fn3e(f41512z);
        }
        zurt(f41512z);
    }

    private void kja0() {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
        if (this.f90030x2.isRunning()) {
            this.f90030x2.cancel();
        }
        this.f90030x2.setInterpolator(accelerateInterpolator);
        this.f90030x2.reverse();
        if (this.f90028qrj.isRunning()) {
            this.f90028qrj.cancel();
        }
        this.f90028qrj.setInterpolator(accelerateInterpolator);
        this.f90028qrj.reverse();
        if (this.f90027n7h.isRunning()) {
            this.f90027n7h.cancel();
        }
        this.f90027n7h.setInterpolator(accelerateInterpolator);
        this.f90027n7h.reverse();
        if (this.f90025kja0.isRunning()) {
            this.f90025kja0.cancel();
        }
        this.f90025kja0.setInterpolator(accelerateInterpolator);
        this.f90025kja0.reverse();
    }

    /* JADX INFO: renamed from: s */
    private void m26501s(Context context) {
        LayerDrawable layerDrawable = (LayerDrawable) C0498q.m2259s(context, kja0.C7299y.a800);
        this.f41519s = layerDrawable;
        if (layerDrawable == null) {
            return;
        }
        this.f90026ld6 = (AnimatedVectorDrawable) layerDrawable.findDrawableByLayerId(kja0.C7296p.f89292ikck);
        this.f41517p = this.f41519s.findDrawableByLayerId(kja0.C7296p.cyg);
        ColorStateList colorStateList = this.f41513g;
        int[] iArr = f90019o1t;
        int colorForState = colorStateList.getColorForState(iArr, kja0.C7292g.q8d);
        ColorStateList colorStateList2 = this.f41513g;
        int[] iArr2 = f41512z;
        int colorForState2 = colorStateList2.getColorForState(iArr2, kja0.C7292g.jv24);
        int colorForState3 = this.f90023f7l8.getColorForState(iArr, kja0.C7292g.que);
        int colorForState4 = this.f90023f7l8.getColorForState(iArr2, kja0.C7292g.wj7e);
        int colorForState5 = this.f41520y.getColorForState(iArr, kja0.C7292g.m7);
        int colorForState6 = this.f41520y.getColorForState(iArr2, kja0.C7292g.ihy);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(colorForState5, colorForState6);
        this.f90025kja0 = valueAnimatorOfArgb;
        valueAnimatorOfArgb.setDuration(300L);
        this.f90025kja0.addListener(new C7313k(colorForState6, colorForState5));
        this.f90025kja0.addUpdateListener(new toq());
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(colorForState, colorForState2);
        this.f90028qrj = valueAnimatorOfArgb2;
        valueAnimatorOfArgb2.setDuration(300L);
        this.f90028qrj.addListener(new C8109zy(colorForState2, colorForState));
        this.f90028qrj.addUpdateListener(new C7315q());
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(colorForState3, colorForState4);
        this.f90027n7h = valueAnimatorOfArgb3;
        valueAnimatorOfArgb3.setDuration(300L);
        this.f90027n7h.addListener(new C7314n(colorForState4, colorForState3));
        this.f90027n7h.addUpdateListener(new C7312g());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        this.f90030x2 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(300L);
        this.f90030x2.addListener(new f7l8());
        this.f90030x2.addUpdateListener(new C7316y());
    }

    private void t8r(boolean z2) {
        this.f41517p.setAlpha(0);
        AnimatedVectorDrawable animatedVectorDrawable = this.f90026ld6;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.setAlpha(255);
            if (!this.f90026ld6.isRunning()) {
                this.f90026ld6.start();
            }
        }
        int[] iArr = f90019o1t;
        fn3e(iArr);
        zurt(iArr);
    }

    private static void x2(View view) {
        if (view == null) {
            return;
        }
        Folme.useAt(view).touch().setAlpha(0.6f, ITouchStyle.TouchType.DOWN).handleTouchOf(view, new AnimConfig[0]);
    }

    private void zurt(int[] iArr) {
        View view = this.f90024ki;
        if (view instanceof ImageView) {
            if (iArr == f41512z) {
                ((ImageView) view).setImageDrawable(C0498q.m2259s(this.f90022cdj, kja0.C7299y.tkle));
                return;
            }
            TypedValue typedValue = new TypedValue();
            this.f90022cdj.getTheme().resolveAttribute(kja0.C7297q.owi, typedValue, true);
            ((ImageView) this.f90024ki).setImageDrawable(C0498q.m2259s(this.f90022cdj, typedValue.resourceId));
        }
    }

    public void ld6(C1016i c1016i, View view) {
        if (view == null || c1016i == null) {
            return;
        }
        view.setBackground(this.f41519s);
        c1016i.itemView.setBackground(null);
        this.f41518q = (TextView) c1016i.fn3e(R.id.title);
        this.f41516n = (TextView) c1016i.fn3e(R.id.summary);
        View viewFn3e = c1016i.fn3e(kja0.C7296p.d6od);
        this.f90024ki = viewFn3e;
        x2(viewFn3e);
        if (this.f90029toq != -1) {
            cdj(false);
            return;
        }
        int i2 = this.f41515k;
        if (i2 == -1) {
            m26502p(0);
            cdj(false);
        } else if (i2 != 2) {
            cdj(false);
        } else {
            cdj(true);
        }
    }

    public void n7h(boolean z2) {
        this.f41514h = z2;
    }

    /* JADX INFO: renamed from: p */
    public void m26502p(int i2) {
        this.f90029toq = this.f41515k;
        this.f41515k = i2;
    }

    public void qrj(int i2) {
        this.f90029toq = this.f41515k;
        this.f41515k = i2;
        cdj(true);
    }

    /* JADX INFO: renamed from: y */
    public int m26503y() {
        return this.f41515k;
    }
}
