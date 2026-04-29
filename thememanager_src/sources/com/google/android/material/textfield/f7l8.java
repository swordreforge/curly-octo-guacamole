package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C0683f;
import androidx.core.widget.t8r;
import com.google.android.material.animation.C3910k;
import ij.C6095k;
import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7829h;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8 {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static final int f67922fu4 = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f67923mcp = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f67924ni7 = 167;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f67925o1t = 2;

    /* JADX INFO: renamed from: t */
    private static final int f25248t = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f67926wvg = 0;

    /* JADX INFO: renamed from: z */
    static final int f25249z = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f67927zurt = 217;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f67928cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float f67929f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private Typeface f67930fn3e;

    /* JADX INFO: renamed from: g */
    @dd
    private Animator f25250g;

    /* JADX INFO: renamed from: h */
    private CharSequence f25251h;

    /* JADX INFO: renamed from: i */
    @dd
    private ColorStateList f25252i;

    /* JADX INFO: renamed from: k */
    private final Context f25253k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private TextView f67931ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private ColorStateList f67932kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f67933ld6;

    /* JADX INFO: renamed from: n */
    private FrameLayout f25254n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f67934n7h;

    /* JADX INFO: renamed from: p */
    @dd
    private CharSequence f25255p;

    /* JADX INFO: renamed from: q */
    private int f25256q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private CharSequence f67935qrj;

    /* JADX INFO: renamed from: s */
    private int f25257s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f67936t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final TextInputLayout f67937toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private TextView f67938x2;

    /* JADX INFO: renamed from: y */
    private int f25258y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private LinearLayout f67939zy;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f7l8$k */
    /* JADX INFO: compiled from: IndicatorViewController.java */
    class C4155k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ TextView f25259g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f25260k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f25261n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ TextView f25262q;

        C4155k(int i2, TextView textView, int i3, TextView textView2) {
            this.f25260k = i2;
            this.f25262q = textView;
            this.f25261n = i3;
            this.f25259g = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f7l8.this.f25258y = this.f25260k;
            f7l8.this.f25250g = null;
            TextView textView = this.f25262q;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f25261n == 1 && f7l8.this.f67938x2 != null) {
                    f7l8.this.f67938x2.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f25259g;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f25259g.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f25259g;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: IndicatorViewController.java */
    class toq extends View.AccessibilityDelegate {
        toq() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = f7l8.this.f67937toq.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public f7l8(@lvui TextInputLayout textInputLayout) {
        this.f25253k = textInputLayout.getContext();
        this.f67937toq = textInputLayout;
        this.f67929f7l8 = r0.getResources().getDimensionPixelSize(C6095k.g.f78878e5);
    }

    /* JADX INFO: renamed from: c */
    private void m15044c(int i2, int i3, boolean z2) {
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f25250g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m15049s(arrayList, this.f67928cdj, this.f67931ki, 2, i2, i3);
            m15049s(arrayList, this.f67933ld6, this.f67938x2, 1, i2, i3);
            com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
            animatorSet.addListener(new C4155k(i3, n7h(i2), i2, n7h(i3)));
            animatorSet.start();
        } else {
            gvn7(i2, i3);
        }
        this.f67937toq.fnq8();
        this.f67937toq.g1(z2);
        this.f67937toq.m4();
    }

    private boolean f7l8() {
        return (this.f67939zy == null || this.f67937toq.getEditText() == null) ? false : true;
    }

    private void gvn7(int i2, int i3) {
        TextView textViewN7h;
        TextView textViewN7h2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (textViewN7h2 = n7h(i3)) != null) {
            textViewN7h2.setVisibility(0);
            textViewN7h2.setAlpha(1.0f);
        }
        if (i2 != 0 && (textViewN7h = n7h(i2)) != null) {
            textViewN7h.setVisibility(4);
            if (i2 == 1) {
                textViewN7h.setText((CharSequence) null);
            }
        }
        this.f25258y = i3;
    }

    /* JADX INFO: renamed from: l */
    private void m15046l(@lvui ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private ObjectAnimator ld6(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f67929f7l8, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(C3910k.f23773q);
        return objectAnimatorOfFloat;
    }

    private boolean mcp(int i2) {
        return (i2 != 2 || this.f67931ki == null || TextUtils.isEmpty(this.f25251h)) ? false : true;
    }

    private boolean n5r1(@dd TextView textView, @lvui CharSequence charSequence) {
        return C0683f.v0af(this.f67937toq) && this.f67937toq.isEnabled() && !(this.f25257s == this.f25258y && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    @dd
    private TextView n7h(int i2) {
        if (i2 == 1) {
            return this.f67938x2;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f67931ki;
    }

    private int ni7(boolean z2, @InterfaceC7829h int i2, int i3) {
        return z2 ? this.f25253k.getResources().getDimensionPixelSize(i2) : i3;
    }

    /* JADX INFO: renamed from: p */
    private ObjectAnimator m15047p(TextView textView, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(C3910k.f23771k);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: s */
    private void m15049s(@lvui List<Animator> list, boolean z2, @dd TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            list.add(m15047p(textView, i4 == i2));
            if (i4 == i2) {
                list.add(ld6(textView));
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m15050t(int i2) {
        return (i2 != 1 || this.f67938x2 == null || TextUtils.isEmpty(this.f25255p)) ? false : true;
    }

    private void x9kr(@dd TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    boolean a9() {
        return this.f67933ld6;
    }

    @x2
    int cdj() {
        TextView textView = this.f67938x2;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void d2ok(@dd ColorStateList colorStateList) {
        this.f67932kja0 = colorStateList;
        TextView textView = this.f67938x2;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void d3(@dd CharSequence charSequence) {
        this.f67935qrj = charSequence;
        TextView textView = this.f67938x2;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void dd(@dd ColorStateList colorStateList) {
        this.f25252i = colorStateList;
        TextView textView = this.f67931ki;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void eqxt(@hb int i2) {
        this.f67934n7h = i2;
        TextView textView = this.f67938x2;
        if (textView != null) {
            this.f67937toq.t8iq(textView, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    void m15051f(CharSequence charSequence) {
        m15057y();
        this.f25251h = charSequence;
        this.f67931ki.setText(charSequence);
        int i2 = this.f25258y;
        if (i2 != 2) {
            this.f25257s = 2;
        }
        m15044c(i2, this.f25257s, n5r1(this.f67931ki, charSequence));
    }

    @dd
    ColorStateList fn3e() {
        TextView textView = this.f67931ki;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    boolean fti() {
        return this.f67928cdj;
    }

    boolean fu4() {
        return mcp(this.f25258y);
    }

    /* JADX INFO: renamed from: g */
    void m15052g() {
        if (f7l8()) {
            EditText editText = this.f67937toq.getEditText();
            boolean zM14757s = com.google.android.material.resources.zy.m14757s(this.f25253k);
            LinearLayout linearLayout = this.f67939zy;
            int i2 = C6095k.g.wen;
            C0683f.u38j(linearLayout, ni7(zM14757s, i2, C0683f.i1(editText)), ni7(zM14757s, C6095k.g.mxh, this.f25253k.getResources().getDimensionPixelSize(C6095k.g.pi)), ni7(zM14757s, i2, C0683f.bf2(editText)), 0);
        }
    }

    @dd
    /* JADX INFO: renamed from: h */
    CharSequence m15053h() {
        return this.f25255p;
    }

    void hyr(CharSequence charSequence) {
        m15057y();
        this.f25255p = charSequence;
        this.f67938x2.setText(charSequence);
        int i2 = this.f25258y;
        if (i2 != 1) {
            this.f25257s = 1;
        }
        m15044c(i2, this.f25257s, n5r1(this.f67938x2, charSequence));
    }

    @dd
    /* JADX INFO: renamed from: i */
    View m15054i() {
        return this.f67931ki;
    }

    boolean jk(int i2) {
        return i2 == 0 || i2 == 1;
    }

    void jp0y(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f67939zy == null) {
            return;
        }
        if (!jk(i2) || (frameLayout = this.f25254n) == null) {
            this.f67939zy.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.f25256q - 1;
        this.f25256q = i3;
        m15046l(this.f67939zy, i3);
    }

    @dd
    ColorStateList ki() {
        TextView textView = this.f67938x2;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @dd
    CharSequence kja0() {
        return this.f67935qrj;
    }

    void lvui(@hb int i2) {
        this.f67936t8r = i2;
        TextView textView = this.f67931ki;
        if (textView != null) {
            t8r.a9(textView, i2);
        }
    }

    /* JADX INFO: renamed from: n */
    void m15055n(TextView textView, int i2) {
        if (this.f67939zy == null && this.f25254n == null) {
            LinearLayout linearLayout = new LinearLayout(this.f25253k);
            this.f67939zy = linearLayout;
            linearLayout.setOrientation(0);
            this.f67937toq.addView(this.f67939zy, -1, -2);
            this.f25254n = new FrameLayout(this.f25253k);
            this.f67939zy.addView(this.f25254n, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f67937toq.getEditText() != null) {
                m15052g();
            }
        }
        if (jk(i2)) {
            this.f25254n.setVisibility(0);
            this.f25254n.addView(textView);
        } else {
            this.f67939zy.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f67939zy.setVisibility(0);
        this.f25256q++;
    }

    void ncyb(Typeface typeface) {
        if (typeface != this.f67930fn3e) {
            this.f67930fn3e = typeface;
            x9kr(this.f67938x2, typeface);
            x9kr(this.f67931ki, typeface);
        }
    }

    void o1t() {
        this.f25255p = null;
        m15057y();
        if (this.f25258y == 1) {
            if (!this.f67928cdj || TextUtils.isEmpty(this.f25251h)) {
                this.f25257s = 0;
            } else {
                this.f25257s = 2;
            }
        }
        m15044c(this.f25258y, this.f25257s, n5r1(this.f67938x2, ""));
    }

    void oc(boolean z2) {
        if (this.f67933ld6 == z2) {
            return;
        }
        m15057y();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f25253k);
            this.f67938x2 = appCompatTextView;
            appCompatTextView.setId(C6095k.y.j3px);
            this.f67938x2.setTextAlignment(5);
            Typeface typeface = this.f67930fn3e;
            if (typeface != null) {
                this.f67938x2.setTypeface(typeface);
            }
            eqxt(this.f67934n7h);
            d2ok(this.f67932kja0);
            d3(this.f67935qrj);
            this.f67938x2.setVisibility(4);
            C0683f.pjz9(this.f67938x2, 1);
            m15055n(this.f67938x2, 0);
        } else {
            o1t();
            jp0y(this.f67938x2, 0);
            this.f67938x2 = null;
            this.f67937toq.fnq8();
            this.f67937toq.m4();
        }
        this.f67933ld6 = z2;
    }

    boolean qrj() {
        return m15050t(this.f25257s);
    }

    /* JADX INFO: renamed from: r */
    void m15056r(boolean z2) {
        if (this.f67928cdj == z2) {
            return;
        }
        m15057y();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f25253k);
            this.f67931ki = appCompatTextView;
            appCompatTextView.setId(C6095k.y.i8);
            this.f67931ki.setTextAlignment(5);
            Typeface typeface = this.f67930fn3e;
            if (typeface != null) {
                this.f67931ki.setTypeface(typeface);
            }
            this.f67931ki.setVisibility(4);
            C0683f.pjz9(this.f67931ki, 1);
            lvui(this.f67936t8r);
            dd(this.f25252i);
            m15055n(this.f67931ki, 1);
            this.f67931ki.setAccessibilityDelegate(new toq());
        } else {
            wvg();
            jp0y(this.f67931ki, 1);
            this.f67931ki = null;
            this.f67937toq.fnq8();
            this.f67937toq.m4();
        }
        this.f67928cdj = z2;
    }

    CharSequence t8r() {
        return this.f25251h;
    }

    void wvg() {
        m15057y();
        int i2 = this.f25258y;
        if (i2 == 2) {
            this.f25257s = 0;
        }
        m15044c(i2, this.f25257s, n5r1(this.f67931ki, ""));
    }

    boolean x2() {
        return m15050t(this.f25258y);
    }

    /* JADX INFO: renamed from: y */
    void m15057y() {
        Animator animator = this.f25250g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: z */
    boolean m15058z() {
        return mcp(this.f25257s);
    }

    @x2
    int zurt() {
        TextView textView = this.f67931ki;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }
}
