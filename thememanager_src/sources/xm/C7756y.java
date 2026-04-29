package xm;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.t8r;
import gb.toq;
import miuix.appcompat.internal.view.ColorTransitionTextView;
import miuix.internal.util.C7164n;

/* JADX INFO: renamed from: xm.y */
/* JADX INFO: compiled from: ExpandTitle.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7756y {

    /* JADX INFO: renamed from: k */
    private Context f45670k;

    /* JADX INFO: renamed from: q */
    private ColorTransitionTextView f45672q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private LinearLayout f99965toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ColorTransitionTextView f99966zy;

    /* JADX INFO: renamed from: n */
    private boolean f45671n = true;

    /* JADX INFO: renamed from: y */
    private boolean f45673y = false;

    /* JADX INFO: renamed from: g */
    private int f45669g = toq.cdj.nc;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f99964f7l8 = toq.cdj.nod;

    public C7756y(Context context) {
        this.f45670k = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m28138g() {
        this.f99965toq.setBackground(C7164n.m25952s(this.f45670k, R.attr.actionBarItemBackground));
    }

    private LinearLayout.LayoutParams toq() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public void cdj(int i2) {
        this.f45669g = i2;
        t8r.a9(this.f99966zy, i2);
        this.f99966zy.invalidate();
    }

    public void f7l8(Configuration configuration) {
        this.f99966zy.setTextAppearance(this.f45669g);
        this.f45672q.setTextAppearance(this.f99964f7l8);
    }

    public void fn3e(boolean z2, boolean z3) {
        if (this.f45673y) {
            this.f99966zy.m25251n(z2, z3);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m28140h(CharSequence charSequence) {
        this.f99966zy.setText(charSequence);
        m28145s(!TextUtils.isEmpty(charSequence));
    }

    /* JADX INFO: renamed from: i */
    public void m28141i(boolean z2) {
        if (this.f45671n != z2) {
            this.f45671n = z2;
            this.f99965toq.setVisibility(z2 ? 0 : 4);
        }
    }

    public void ki(int i2) {
        this.f99966zy.setVisibility(i2);
    }

    public void kja0(boolean z2, int i2) {
        if (this.f45673y != z2) {
            if (!z2) {
                this.f99966zy.m25251n(false, false);
            }
            this.f45673y = z2;
            if (z2 && i2 == 1) {
                this.f99966zy.m25251n(true, false);
            }
        }
    }

    public void ld6(CharSequence charSequence) {
        this.f45672q.setText(charSequence);
        n7h(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* JADX INFO: renamed from: n */
    public void m28142n() {
        LinearLayout linearLayout = new LinearLayout(this.f45670k);
        this.f99965toq = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        this.f99965toq.setOrientation(1);
        this.f99965toq.post(new Runnable() { // from class: xm.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f45657k.m28138g();
            }
        });
        ColorTransitionTextView colorTransitionTextView = new ColorTransitionTextView(this.f45670k, null, toq.C6055q.ym);
        this.f99966zy = colorTransitionTextView;
        colorTransitionTextView.setId(toq.C6054p.f76306ek5k);
        this.f99966zy.setVerticalScrollBarEnabled(false);
        this.f99966zy.setHorizontalScrollBarEnabled(false);
        this.f99965toq.addView(this.f99966zy, toq());
        ColorTransitionTextView colorTransitionTextView2 = new ColorTransitionTextView(this.f45670k, null, toq.C6055q.te);
        this.f45672q = colorTransitionTextView2;
        colorTransitionTextView2.setId(toq.C6054p.f34901o);
        this.f45672q.setVisibility(8);
        this.f45672q.setVerticalScrollBarEnabled(false);
        this.f45672q.setHorizontalScrollBarEnabled(false);
        this.f99965toq.addView(this.f45672q, toq());
        Resources resources = this.f45670k.getResources();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f45672q.getLayoutParams();
        layoutParams.topMargin = resources.getDimensionPixelOffset(toq.f7l8.f75533vq);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(toq.f7l8.f75477mu);
    }

    public void n7h(int i2) {
        this.f45672q.setVisibility(i2);
    }

    /* JADX INFO: renamed from: p */
    public void m28143p(View.OnClickListener onClickListener) {
        this.f99965toq.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: q */
    public int m28144q() {
        return this.f99965toq.getVisibility();
    }

    public void qrj(int i2) {
        this.f99964f7l8 = i2;
        t8r.a9(this.f45672q, i2);
        this.f45672q.invalidate();
    }

    /* JADX INFO: renamed from: s */
    public void m28145s(boolean z2) {
        this.f99965toq.setEnabled(z2);
    }

    public void t8r(int i2) {
        if (this.f45671n || i2 != 0) {
            this.f99965toq.setVisibility(i2);
        } else {
            this.f99965toq.setVisibility(4);
        }
    }

    public void x2(View.OnClickListener onClickListener) {
        ColorTransitionTextView colorTransitionTextView = this.f45672q;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m28146y(boolean z2) {
        LinearLayout linearLayout = this.f99965toq;
        if (linearLayout != null) {
            linearLayout.setClickable(z2);
        }
        ColorTransitionTextView colorTransitionTextView = this.f45672q;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z2);
        }
    }

    public View zy() {
        return this.f99965toq;
    }
}
