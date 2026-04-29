package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0184b;
import androidx.core.view.C0683f;
import androidx.core.view.ki;
import androidx.core.view.qrj;
import androidx.core.widget.t8r;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.CheckableImageButton;
import ij.C6095k;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.p */
/* JADX INFO: compiled from: StartCompoundLayout.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
class C4159p extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private final CheckableImageButton f25283g;

    /* JADX INFO: renamed from: h */
    private boolean f25284h;

    /* JADX INFO: renamed from: k */
    private final TextInputLayout f25285k;

    /* JADX INFO: renamed from: n */
    @dd
    private CharSequence f25286n;

    /* JADX INFO: renamed from: p */
    private View.OnLongClickListener f25287p;

    /* JADX INFO: renamed from: q */
    private final TextView f25288q;

    /* JADX INFO: renamed from: s */
    private PorterDuff.Mode f25289s;

    /* JADX INFO: renamed from: y */
    private ColorStateList f25290y;

    C4159p(TextInputLayout textInputLayout, C0184b c0184b) {
        super(textInputLayout.getContext());
        this.f25285k = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, qrj.f50865toq));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C6095k.ld6.f35606l, (ViewGroup) this, false);
        this.f25283g = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f25288q = appCompatTextView;
        f7l8(c0184b);
        m15070g(c0184b);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void f7l8(C0184b c0184b) {
        if (com.google.android.material.resources.zy.m14757s(getContext())) {
            ki.f7l8((ViewGroup.MarginLayoutParams) this.f25283g.getLayoutParams(), 0);
        }
        ki(null);
        t8r(null);
        int i2 = C6095k.kja0.k2gn;
        if (c0184b.mcp(i2)) {
            this.f25290y = com.google.android.material.resources.zy.toq(getContext(), c0184b, i2);
        }
        int i3 = C6095k.kja0.s9y;
        if (c0184b.mcp(i3)) {
            this.f25289s = C4058z.x2(c0184b.kja0(i3, -1), null);
        }
        int i4 = C6095k.kja0.hhpi;
        if (c0184b.mcp(i4)) {
            cdj(c0184b.m553y(i4));
            int i5 = C6095k.kja0.mkxg;
            if (c0184b.mcp(i5)) {
                m15072h(c0184b.fu4(i5));
            }
            kja0(c0184b.m547k(C6095k.kja0.i99y, true));
        }
    }

    /* JADX INFO: renamed from: g */
    private void m15070g(C0184b c0184b) {
        this.f25288q.setVisibility(8);
        this.f25288q.setId(C6095k.y.g41);
        this.f25288q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C0683f.pjz9(this.f25288q, 1);
        qrj(c0184b.fn3e(C6095k.kja0.ru8, 0));
        int i2 = C6095k.kja0.i2en;
        if (c0184b.mcp(i2)) {
            n7h(c0184b.m550q(i2));
        }
        x2(c0184b.fu4(C6095k.kja0.jar));
    }

    /* JADX INFO: renamed from: z */
    private void m15071z() {
        int i2 = (this.f25286n == null || this.f25284h) ? 8 : 0;
        setVisibility(this.f25283g.getVisibility() == 0 || i2 == 0 ? 0 : 8);
        this.f25288q.setVisibility(i2);
        this.f25285k.qkj8();
    }

    void cdj(@dd Drawable drawable) {
        this.f25283g.setImageDrawable(drawable);
        if (drawable != null) {
            C4156g.m15060k(this.f25285k, this.f25283g, this.f25290y, this.f25289s);
            zurt(true);
            ld6();
        } else {
            zurt(false);
            ki(null);
            t8r(null);
            m15072h(null);
        }
    }

    void fn3e(@dd PorterDuff.Mode mode) {
        if (this.f25289s != mode) {
            this.f25289s = mode;
            C4156g.m15060k(this.f25285k, this.f25283g, this.f25290y, mode);
        }
    }

    void fu4() {
        EditText editText = this.f25285k.f25236y;
        if (editText == null) {
            return;
        }
        C0683f.u38j(this.f25288q, m15078s() ? 0 : C0683f.i1(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C6095k.g.p996), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: h */
    void m15072h(@dd CharSequence charSequence) {
        if (m15077q() != charSequence) {
            this.f25283g.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: i */
    void m15073i(@dd ColorStateList colorStateList) {
        if (this.f25290y != colorStateList) {
            this.f25290y = colorStateList;
            C4156g.m15060k(this.f25285k, this.f25283g, colorStateList, this.f25289s);
        }
    }

    @dd
    /* JADX INFO: renamed from: k */
    CharSequence m15074k() {
        return this.f25286n;
    }

    void ki(@dd View.OnClickListener onClickListener) {
        C4156g.m15061n(this.f25283g, onClickListener, this.f25287p);
    }

    void kja0(boolean z2) {
        this.f25283g.setCheckable(z2);
    }

    void ld6() {
        C4156g.zy(this.f25285k, this.f25283g, this.f25290y);
    }

    @dd
    /* JADX INFO: renamed from: n */
    Drawable m15075n() {
        return this.f25283g.getDrawable();
    }

    void n7h(@lvui ColorStateList colorStateList) {
        this.f25288q.setTextColor(colorStateList);
    }

    void ni7(@lvui androidx.core.view.accessibility.ki kiVar) {
        if (this.f25288q.getVisibility() != 0) {
            kiVar.oki(this.f25283g);
        } else {
            kiVar.vep5(this.f25288q);
            kiVar.oki(this.f25288q);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        fu4();
    }

    /* JADX INFO: renamed from: p */
    void m15076p(boolean z2) {
        this.f25284h = z2;
        m15071z();
    }

    @dd
    /* JADX INFO: renamed from: q */
    CharSequence m15077q() {
        return this.f25283g.getContentDescription();
    }

    void qrj(@hb int i2) {
        t8r.a9(this.f25288q, i2);
    }

    /* JADX INFO: renamed from: s */
    boolean m15078s() {
        return this.f25283g.getVisibility() == 0;
    }

    void t8r(@dd View.OnLongClickListener onLongClickListener) {
        this.f25287p = onLongClickListener;
        C4156g.m15059g(this.f25283g, onLongClickListener);
    }

    @dd
    ColorStateList toq() {
        return this.f25288q.getTextColors();
    }

    void x2(@dd CharSequence charSequence) {
        this.f25286n = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f25288q.setText(charSequence);
        m15071z();
    }

    /* JADX INFO: renamed from: y */
    boolean m15079y() {
        return this.f25283g.m14522k();
    }

    void zurt(boolean z2) {
        if (m15078s() != z2) {
            this.f25283g.setVisibility(z2 ? 0 : 8);
            fu4();
            m15071z();
        }
    }

    @lvui
    TextView zy() {
        return this.f25288q;
    }
}
