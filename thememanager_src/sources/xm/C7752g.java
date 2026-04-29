package xm;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.t8r;
import gb.toq;
import miuix.appcompat.internal.view.ColorTransitionTextView;
import miuix.core.util.C7085q;
import miuix.internal.util.C7164n;

/* JADX INFO: renamed from: xm.g */
/* JADX INFO: compiled from: CollapseTitle.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7752g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f99959f7l8;

    /* JADX INFO: renamed from: k */
    private Context f45659k;

    /* JADX INFO: renamed from: q */
    private ColorTransitionTextView f45662q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private LinearLayout f99961toq;

    /* JADX INFO: renamed from: y */
    private int f45664y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ColorTransitionTextView f99963zy;

    /* JADX INFO: renamed from: n */
    private boolean f45660n = true;

    /* JADX INFO: renamed from: g */
    private float f45658g = 0.0f;

    /* JADX INFO: renamed from: s */
    private boolean f45663s = false;

    /* JADX INFO: renamed from: p */
    private float f45661p = 0.0f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f99960ld6 = true;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f99962x2 = false;

    public C7752g(Context context, int i2, int i3) {
        this.f45659k = context;
        this.f99959f7l8 = i2;
        this.f45664y = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdj() {
        wvg(m28133p());
    }

    private LinearLayout.LayoutParams f7l8() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m28127h() {
        this.f45662q.setBackgroundResource(toq.C6057y.f76855i3x9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m28128i() {
        Resources resources = this.f45659k.getResources();
        this.f99961toq.setOrientation(1);
        this.f45662q.setTextAppearance(this.f45659k, this.f45664y);
        this.f45662q.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f45662q.getLayoutParams();
        layoutParams.setMarginStart(0);
        layoutParams.topMargin = resources.getDimensionPixelOffset(toq.f7l8.f75533vq);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(toq.f7l8.f75477mu);
        this.f45662q.setPadding(0, 0, 0, 0);
        this.f45662q.setLayoutParams(layoutParams);
        this.f99960ld6 = true;
        wvg(m28133p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0() {
        this.f99961toq.setBackground(C7164n.m25952s(this.f45659k, R.attr.actionBarItemBackground));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        Resources resources = this.f45659k.getResources();
        this.f99961toq.setOrientation(0);
        this.f45662q.setTextAppearance(this.f45659k, this.f99959f7l8);
        this.f45662q.setBackgroundResource(toq.C6057y.f76855i3x9);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f45662q.getLayoutParams();
        layoutParams.setMarginStart(resources.getDimensionPixelOffset(toq.f7l8.f75556yl));
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.f45662q.setLayoutParams(layoutParams);
        this.f99960ld6 = false;
    }

    public void a9(int i2) {
        this.f99959f7l8 = i2;
        t8r.a9(this.f99963zy, i2);
        this.f99963zy.invalidate();
    }

    public void d3(boolean z2, boolean z3) {
        if (this.f99962x2) {
            this.f99963zy.m25251n(z2, z3);
        }
    }

    public void fn3e(boolean z2) {
        LinearLayout linearLayout = this.f99961toq;
        if (linearLayout != null) {
            linearLayout.setClickable(z2);
        }
        ColorTransitionTextView colorTransitionTextView = this.f45662q;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z2);
        }
    }

    public void fti(int i2) {
        this.f99963zy.setVisibility(i2);
    }

    public void fu4(CharSequence charSequence) {
        this.f45662q.setText(charSequence);
        m28135t(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m28132g(String str) {
        if (this.f45663s) {
            this.f45661p = this.f99963zy.getPaint().measureText(str);
            this.f45663s = false;
        }
        return this.f99963zy.getMeasuredWidth() == 0 || this.f45661p <= ((float) this.f99963zy.getMeasuredWidth());
    }

    public void gvn7(boolean z2) {
        if (this.f45660n != z2) {
            this.f45660n = z2;
            this.f99961toq.setVisibility(z2 ? 0 : 4);
        }
    }

    public void jk(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f99963zy.getText())) {
            return;
        }
        this.f99963zy.setText(charSequence);
        zurt(!TextUtils.isEmpty(charSequence));
        this.f45663s = true;
    }

    public void jp0y(int i2) {
        if (this.f45660n || i2 != 0) {
            this.f99961toq.setVisibility(i2);
        } else {
            this.f99961toq.setVisibility(4);
        }
    }

    public void ki(Configuration configuration) {
        int i2 = 1;
        this.f45663s = true;
        miuix.core.util.t8r t8rVarM25605p = C7085q.m25605p(this.f45659k, configuration);
        if (t8rVarM25605p.f39903g == 1) {
            Point point = t8rVarM25605p.f39906q;
            if (point.y < 650 && point.x > 640) {
                i2 = 0;
            }
        }
        if (i2 == this.f99961toq.getOrientation()) {
            this.f45662q.post(new Runnable() { // from class: xm.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45666k.cdj();
                }
            });
        } else if (i2 == 0) {
            this.f45662q.post(new Runnable() { // from class: xm.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45674k.t8r();
                }
            });
        } else {
            this.f45662q.post(new Runnable() { // from class: xm.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45667k.m28128i();
                }
            });
        }
    }

    public ViewGroup ld6() {
        return (ViewGroup) this.f99963zy.getParent();
    }

    public void mcp(boolean z2, int i2) {
        if (this.f99962x2 != z2) {
            if (!z2) {
                this.f99963zy.m25251n(false, false);
            }
            this.f99962x2 = z2;
            if (z2 && i2 == 0) {
                this.f99963zy.m25251n(true, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n7h() {
        Resources resources = this.f45659k.getResources();
        Point point = C7085q.m25607s(this.f45659k).f87381zy;
        int i2 = (miuix.os.zy.m26179k(this.f45659k) == 1 && (point.x > point.y)) ? 1 : 0;
        int dimensionPixelOffset = this.f45659k.getResources().getDimensionPixelOffset(toq.f7l8.f75402dxef);
        this.f99960ld6 = i2 ^ 1;
        this.f45658g = resources.getDimensionPixelSize(toq.f7l8.y4wo);
        LinearLayout linearLayout = new LinearLayout(this.f45659k);
        this.f99961toq = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        this.f99961toq.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        Context context = this.f45659k;
        int i3 = toq.C6055q.nod;
        ColorTransitionTextView colorTransitionTextView = new ColorTransitionTextView(context, null, i3);
        this.f99963zy = colorTransitionTextView;
        colorTransitionTextView.setVerticalScrollBarEnabled(false);
        this.f99963zy.setHorizontalScrollBarEnabled(false);
        int i4 = toq.C6055q.e4e;
        if (i2 == 0) {
            i3 = i4;
        }
        ColorTransitionTextView colorTransitionTextView2 = new ColorTransitionTextView(this.f45659k, null, i3);
        this.f45662q = colorTransitionTextView2;
        colorTransitionTextView2.setVerticalScrollBarEnabled(false);
        this.f45662q.setHorizontalScrollBarEnabled(false);
        this.f99961toq.setOrientation(i2 ^ 1);
        this.f99961toq.post(new Runnable() { // from class: xm.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f45665k.kja0();
            }
        });
        this.f99963zy.setId(toq.C6054p.f34899m);
        this.f99961toq.addView(this.f99963zy, f7l8());
        this.f45662q.setId(toq.C6054p.f34896j);
        this.f45662q.setVisibility(8);
        if (i2 != 0) {
            this.f45662q.post(new Runnable() { // from class: xm.toq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45668k.m28127h();
                }
            });
        }
        this.f99961toq.addView(this.f45662q, f7l8());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f45662q.getLayoutParams();
        if (i2 != 0) {
            layoutParams.setMarginStart(resources.getDimensionPixelOffset(toq.f7l8.f75556yl));
        } else {
            layoutParams.topMargin = resources.getDimensionPixelOffset(toq.f7l8.f75533vq);
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(toq.f7l8.f75477mu);
        }
    }

    public void ni7(View.OnClickListener onClickListener) {
        this.f99961toq.setOnClickListener(onClickListener);
    }

    public void o1t(int i2) {
        this.f45664y = i2;
        t8r.a9(this.f45662q, i2);
        this.f99963zy.invalidate();
    }

    public void oc(boolean z2) {
        ViewGroup viewGroupLd6 = ld6();
        if (viewGroupLd6 instanceof LinearLayout) {
            ((LinearLayout) viewGroupLd6).setGravity((z2 ? 1 : 8388611) | 16);
        }
        this.f99963zy.setGravity((z2 ? 1 : 8388611) | 16);
        this.f99963zy.setEllipsize(TextUtils.TruncateAt.END);
        this.f45662q.setGravity((z2 ? 1 : 8388611) | 16);
        this.f45662q.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: renamed from: p */
    public float m28133p() {
        float f2 = this.f45658g;
        Resources resources = this.f45659k.getResources();
        int measuredHeight = ((this.f99961toq.getMeasuredHeight() - this.f99963zy.getMeasuredHeight()) - this.f45662q.getPaddingTop()) - this.f45662q.getPaddingBottom();
        if (measuredHeight <= 0) {
            return f2;
        }
        TextPaint textPaint = new TextPaint(this.f45662q.getPaint());
        textPaint.setTextSize(f2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int iCeil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        float f3 = f2 / 2.0f;
        float f4 = resources.getDisplayMetrics().scaledDensity;
        while (iCeil > measuredHeight && f2 >= f3) {
            f2 -= f4;
            textPaint.setTextSize(f2);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            iCeil = (int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
        }
        return f2;
    }

    public int qrj() {
        return this.f99961toq.getVisibility();
    }

    /* JADX INFO: renamed from: s */
    public View m28134s() {
        return this.f99961toq;
    }

    /* JADX INFO: renamed from: t */
    public void m28135t(int i2) {
        this.f45662q.setVisibility(i2);
    }

    public void wvg(float f2) {
        if (this.f99960ld6) {
            this.f45662q.setTextSize(0, f2);
        }
    }

    public int x2() {
        return this.f99963zy.getVisibility();
    }

    /* JADX INFO: renamed from: y */
    public Rect m28136y() {
        Rect rect = new Rect();
        this.f99961toq.getHitRect(rect);
        return rect;
    }

    /* JADX INFO: renamed from: z */
    public void m28137z(View.OnClickListener onClickListener) {
        ColorTransitionTextView colorTransitionTextView = this.f45662q;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setOnClickListener(onClickListener);
        }
    }

    public void zurt(boolean z2) {
        this.f99961toq.setEnabled(z2);
    }
}
