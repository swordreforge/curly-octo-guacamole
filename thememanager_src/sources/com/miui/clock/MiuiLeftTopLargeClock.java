package com.miui.clock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.clock.C5049g;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiLeftTopLargeClock extends MiuiBaseClock {

    /* JADX INFO: renamed from: a */
    private TextView f28688a;

    /* JADX INFO: renamed from: b */
    private FrameLayout f28689b;

    /* JADX INFO: renamed from: m */
    private TextView f28690m;

    /* JADX INFO: renamed from: u */
    private String f28691u;

    /* JADX INFO: renamed from: x */
    private boolean f28692x;

    public MiuiLeftTopLargeClock(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m17566i(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        this.f28690m.setText(miuix.pickerwidget.date.zy.m26303k(this.f28603k, System.currentTimeMillis(), (this.f28602i ? 32 : 16) | 12 | 64));
        int i2 = this.f28602i ? C5049g.s.f71700ch : C5049g.s.f71754nmn5;
        this.f28688a.setContentDescription(this.f28609s.getText());
        TextView textView = this.f28688a;
        C7230k c7230k = this.f28605n;
        Context context = this.f28603k;
        textView.setText(c7230k.format(context, context.getString(i2)).toUpperCase());
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return this.f28603k.getResources().getDimensionPixelSize(C5049g.q.kq);
    }

    @Override // com.miui.clock.MiuiBaseClock
    /* JADX INFO: renamed from: h */
    protected void mo17533h() {
        int i2;
        float f2;
        int dimensionPixelSize;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (this.f28597c) {
            if (m17534k()) {
                f2 = this.f28598e;
                dimensionPixelSize = this.f28607q.getDimensionPixelSize(C5049g.q.anhx);
            } else {
                f2 = this.f28598e;
                dimensionPixelSize = this.f28607q.getDimensionPixelSize(C5049g.q.kq);
            }
            i2 = (int) (f2 * dimensionPixelSize);
        } else {
            i2 = 0;
        }
        layoutParams.topMargin = i2;
        layoutParams.setMarginStart((int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71531fh)));
        setLayoutParams(layoutParams);
        String language = this.f28603k.getResources().getConfiguration().locale.getLanguage();
        if (language.equals(this.f28691u)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f28689b.getLayoutParams();
            layoutParams2.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.b2));
            this.f28689b.setLayoutParams(layoutParams2);
        } else {
            toq(language);
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f28606p.getLayoutParams();
        layoutParams3.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71559jbh));
        float f3 = this.f28598e;
        Resources resources = this.f28607q;
        int i3 = C5049g.q.f71640uj2j;
        layoutParams3.setMarginStart((int) (f3 * resources.getDimensionPixelSize(i3)));
        this.f28606p.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f28601h.getLayoutParams();
        layoutParams4.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.f71558ixz));
        layoutParams4.setMarginStart((int) (this.f28598e * this.f28607q.getDimensionPixelSize(i3)));
        this.f28601h.setLayoutParams(layoutParams4);
    }

    @Override // com.miui.clock.MiuiBaseClock, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.miui.clock.MiuiBaseClock
    protected void ki() {
        super.ki();
        Resources resources = this.f28603k.getResources();
        this.f28690m.setTextSize(0, (int) (this.f28598e * resources.getDimensionPixelSize(C5049g.q.j3y2)));
        this.f28688a.setTextSize(0, (int) (this.f28598e * resources.getDimensionPixelSize(C5049g.q.sb1e)));
    }

    @Override // com.miui.clock.MiuiBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f28690m = (TextView) findViewById(C5049g.g.f70991fu4);
        this.f28689b = (FrameLayout) findViewById(C5049g.g.f70967bf2);
        this.f28688a = (TextView) findViewById(C5049g.g.f70988fn3e);
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock, com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
        this.f28692x = z2;
        int color = z2 ? getContext().getResources().getColor(C5049g.zy.f29099s) : -1;
        this.f28690m.setTextColor(color);
        this.f28688a.setTextColor(color);
        setInfoDarkMode(color);
        this.f28601h.setTextColor(getContext().getResources().getColor(z2 ? C5049g.zy.f29097p : C5049g.zy.f71846ld6));
        setTextFontDark(z2);
    }

    @Override // com.miui.clock.MiuiBaseClock
    public void setTextFontDark(boolean z2) {
        super.setTextFontDark(z2);
        m17532g(z2, this.f28690m);
        if (zurt()) {
            return;
        }
        Typeface typefaceCreate = Typeface.create("miclock-date-thin", 0);
        Typeface typefaceCreate2 = Typeface.create("miclock-date", 0);
        if (z2) {
            typefaceCreate = typefaceCreate2;
        }
        this.f28688a.setTypeface(typefaceCreate);
    }

    @Override // com.miui.clock.MiuiBaseClock
    protected void toq(String str) {
        Typeface typefaceCreate;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f28689b.getLayoutParams();
        this.f28691u = str;
        if (zurt()) {
            if ("bo".equals(str)) {
                layoutParams.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.x7o));
                layoutParams.bottomMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.z5));
                this.f28688a.setAlpha(0.65f);
                typefaceCreate = Typeface.create("miclock-thin-tibetan", 0);
            } else {
                layoutParams.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.z8));
                layoutParams.bottomMargin = 0;
                this.f28688a.setAlpha(1.0f);
                typefaceCreate = Typeface.create("miclock-thin-ug", 0);
            }
            this.f28688a.setLineSpacing(0.0f, 1.0f);
            this.f28688a.setTypeface(typefaceCreate);
            this.f28688a.setIncludeFontPadding(false);
        } else {
            this.f28688a.setTypeface(Typeface.create(this.f28692x ? "miclock-date" : "miclock-date-thin", 0));
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = (int) (this.f28598e * this.f28607q.getDimensionPixelSize(C5049g.q.b2));
            this.f28688a.setLineSpacing(0.0f, 0.75f);
            this.f28688a.setAlpha(0.7f);
            this.f28688a.setIncludeFontPadding(true);
        }
        this.f28689b.setLayoutParams(layoutParams);
    }

    public boolean zurt() {
        return (Build.VERSION.SDK_INT >= 30 && "bo".equals(this.f28691u)) || "ug".equals(this.f28691u);
    }

    public MiuiLeftTopLargeClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28692x = false;
        this.f28691u = null;
    }
}
