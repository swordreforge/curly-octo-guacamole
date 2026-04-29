package kq2f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import miuix.animation.utils.EaseManager;
import miuix.device.C7106k;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: kq2f.k */
/* JADX INFO: compiled from: FragmentAnimator.java */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnLayoutChangeListenerC6751k extends ValueAnimator implements View.OnLayoutChangeListener, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: i */
    private static final float f37494i = 0.15f;

    /* JADX INFO: renamed from: r */
    private static final long f37496r = 500;

    /* JADX INFO: renamed from: t */
    private static final float f37497t = -0.25f;

    /* JADX INFO: renamed from: z */
    private static final float f37498z = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f37499g;

    /* JADX INFO: renamed from: k */
    private WeakReference<Object> f37500k;

    /* JADX INFO: renamed from: n */
    private float f37501n;

    /* JADX INFO: renamed from: p */
    private int f37502p;

    /* JADX INFO: renamed from: q */
    private float f37503q;

    /* JADX INFO: renamed from: s */
    private int f37504s;

    /* JADX INFO: renamed from: y */
    private float f37505y;

    /* JADX INFO: renamed from: h */
    private static final boolean f37493h = !C7106k.d2ok();

    /* JADX INFO: renamed from: l */
    private static final TimeInterpolator f37495l = new EaseManager.SpringInterpolator().setDamping(0.95f).setResponse(0.8f);

    public ViewOnLayoutChangeListenerC6751k(Fragment fragment, boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                m24675n(1.0f, 0.0f);
            } else {
                m24675n(0.0f, f37497t);
                if (f37493h) {
                    this.f37502p = Math.round(38.25f);
                }
            }
        } else if (z3) {
            m24675n(f37497t, 0.0f);
            if (f37493h) {
                this.f37504s = Math.round(38.25f);
            }
        } else {
            m24675n(0.0f, 1.0f);
        }
        addListener(this);
        addUpdateListener(this);
        setFloatValues(0.0f, 1.0f);
        setInterpolator(f37495l);
        setDuration(500L);
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: g */
    private void m24673g(View view, int i2) {
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 255) {
            i2 = 255;
        }
        Drawable foreground = view.getForeground();
        if (foreground == null) {
            foreground = new ColorDrawable(-16777216);
            view.setForeground(foreground);
        }
        foreground.setAlpha(i2);
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: k */
    private void m24674k(View view) {
        view.setForeground(null);
    }

    /* JADX INFO: renamed from: n */
    private void m24675n(float f2, float f3) {
        this.f37503q = f2;
        this.f37501n = f3;
    }

    /* JADX INFO: renamed from: y */
    private void m24676y() {
        Object objM24677q = m24677q();
        float width = objM24677q instanceof View ? ((View) objM24677q).getWidth() : 0;
        this.f37499g = this.f37503q * width;
        this.f37505y = this.f37501n * width;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@lvui Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@lvui Animator animator) {
        if (m24677q() instanceof View) {
            View view = (View) m24677q();
            view.removeOnLayoutChangeListener(this);
            view.setTranslationX(0.0f);
            if (this.f37504s != this.f37502p) {
                m24674k(view);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@lvui Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@lvui Animator animator) {
        if (m24677q() instanceof View) {
            View view = (View) m24677q();
            m24676y();
            view.addOnLayoutChangeListener(this);
            view.setTranslationX(this.f37499g);
            int i2 = this.f37504s;
            if (i2 != this.f37502p) {
                m24673g(view, i2);
            }
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
        if (m24677q() instanceof View) {
            View view = (View) m24677q();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f2 = this.f37499g;
            float f3 = this.f37505y;
            if (f2 != f3) {
                f2 += (f3 - f2) * fFloatValue;
            }
            view.setTranslationX(f2);
            int i2 = this.f37504s;
            if (i2 != this.f37502p) {
                m24673g(view, Math.round(i2 + ((r2 - i2) * fFloatValue)));
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m24676y();
        if (isRunning()) {
            onAnimationUpdate(this);
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public Object m24677q() {
        WeakReference<Object> weakReference = this.f37500k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.animation.Animator
    public void setTarget(@dd Object obj) {
        Object objM24677q = m24677q();
        if (objM24677q != obj) {
            if (isStarted()) {
                cancel();
            }
            if (objM24677q instanceof View) {
                ((View) objM24677q).removeOnLayoutChangeListener(this);
            }
            this.f37500k = obj == null ? null : new WeakReference<>(obj);
        }
    }
}
