package com.miui.clock;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.util.dd;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.zy;
import gcp.C6064q;
import java.util.Locale;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiBaseClock extends LinearLayout implements zy.n7h {

    /* JADX INFO: renamed from: j */
    private static final String f28595j = "face_unlcok_apply_for_lock";

    /* JADX INFO: renamed from: o */
    private static final int f28596o = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f28597c;

    /* JADX INFO: renamed from: e */
    protected float f28598e;

    /* JADX INFO: renamed from: f */
    private boolean f28599f;

    /* JADX INFO: renamed from: g */
    private int f28600g;

    /* JADX INFO: renamed from: h */
    protected TextView f28601h;

    /* JADX INFO: renamed from: i */
    protected boolean f28602i;

    /* JADX INFO: renamed from: k */
    protected Context f28603k;

    /* JADX INFO: renamed from: l */
    protected boolean f28604l;

    /* JADX INFO: renamed from: n */
    protected C7230k f28605n;

    /* JADX INFO: renamed from: p */
    protected TextView f28606p;

    /* JADX INFO: renamed from: q */
    protected Resources f28607q;

    /* JADX INFO: renamed from: r */
    protected String f28608r;

    /* JADX INFO: renamed from: s */
    protected TextView f28609s;

    /* JADX INFO: renamed from: t */
    protected int f28610t;

    /* JADX INFO: renamed from: y */
    protected int f28611y;

    /* JADX INFO: renamed from: z */
    protected float f28612z;

    public MiuiBaseClock(Context context) {
        this(context, null);
    }

    @Override // com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return this;
    }

    @Override // com.miui.clock.zy.n7h
    public void fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f28605n = new C7230k(TimeZone.getTimeZone(str));
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.f28605n.setTimeInMillis(System.currentTimeMillis());
        int i2 = this.f28602i ? C5049g.s.f71689a98o : C5049g.s.f29044a;
        TextView textView = this.f28609s;
        C7230k c7230k = this.f28605n;
        Context context = this.f28603k;
        textView.setText(c7230k.format(context, context.getString(i2)));
        int i3 = this.f28605n.get(14);
        if (i3 != this.f28600g) {
            kja0();
            this.f28600g = i3;
        }
    }

    /* JADX INFO: renamed from: g */
    protected void m17532g(boolean z2, TextView textView) {
        Typeface typefaceCreate = Typeface.create("miclock-time-thin", 0);
        Typeface typefaceCreate2 = Typeface.create("miclock-time", 0);
        if (z2) {
            typefaceCreate = typefaceCreate2;
        }
        textView.setTypeface(typefaceCreate);
    }

    @Override // com.miui.clock.zy.n7h
    public int getClockHeight() {
        if (getHeight() > 0) {
            return getHeight();
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public float getClockVisibleHeight() {
        if (getHeight() > 0) {
            return getHeight();
        }
        return 0.0f;
    }

    public View getLunarCalendarView() {
        return this.f28606p;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return getBottom() + getResources().getDimensionPixelSize(C5049g.q.fai);
    }

    @Override // com.miui.clock.zy.n7h
    public float getTopMargin() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    protected void mo17533h() {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    /* JADX INFO: renamed from: k */
    protected boolean m17534k() {
        return Settings.Secure.getInt(this.f28603k.getContentResolver(), f28595j, 0) != 0;
    }

    protected void ki() {
        Resources resources = this.f28603k.getResources();
        float f2 = this.f28598e;
        int i2 = C5049g.q.f71588mbx;
        float dimensionPixelSize = (int) (f2 * resources.getDimensionPixelSize(i2));
        this.f28609s.setTextSize(0, dimensionPixelSize);
        this.f28606p.setTextSize(0, dimensionPixelSize);
        this.f28601h.setTextSize(0, (int) (this.f28598e * resources.getDimensionPixelSize(i2)));
    }

    public void kja0() {
        if (!Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage()) || !this.f28599f) {
            this.f28606p.setVisibility(8);
            return;
        }
        C7230k c7230k = new C7230k();
        this.f28606p.setVisibility(0);
        this.f28606p.setText(c7230k.format(this.f28603k, "YY年 N月e"));
    }

    public void ld6() {
        this.f28602i = C6064q.zy(this.f28603k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo17533h();
        ki();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        float f2 = configuration.fontScale;
        if (this.f28612z != f2) {
            this.f28604l = true;
            ki();
            this.f28612z = f2;
        }
        int i2 = configuration.densityDpi;
        if (this.f28610t != i2) {
            this.f28604l = true;
            ki();
            mo17533h();
            this.f28610t = i2;
        }
        String language = configuration.locale.getLanguage();
        if (TextUtils.isEmpty(language) || language.equals(this.f28608r)) {
            return;
        }
        this.f28608r = language;
        toq(language);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f28609s = (TextView) findViewById(C5049g.g.f28948i);
        this.f28606p = (TextView) findViewById(C5049g.g.f71033nsb);
        this.f28601h = (TextView) findViewById(C5049g.g.f71077zwy);
        this.f28605n = new C7230k();
        kja0();
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: p */
    public void mo17535p(boolean z2) {
        this.f28597c = z2;
        try {
            mo17533h();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockAlpha(float f2) {
        setAlpha(f2);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
    }

    protected void setInfoDarkMode(int i2) {
        this.f28609s.setTextColor(i2);
        this.f28606p.setTextColor(i2);
    }

    public void setIs24HourFormat(boolean z2) {
        this.f28602i = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setOwnerInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f28601h.setVisibility(8);
        } else {
            this.f28601h.setVisibility(0);
            this.f28601h.setText(str);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setScaleRatio(float f2) {
        this.f28598e = f2;
        ki();
        try {
            mo17533h();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setShowLunarCalendar(boolean z2) {
        this.f28599f = z2;
        kja0();
    }

    @Override // com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
        this.f28601h.setTextColor(z2 ? getContext().getResources().getColor(C5049g.zy.f29097p) : getContext().getResources().getColor(C5049g.zy.f71846ld6));
        setTextFontDark(z2);
    }

    public void setTextFontDark(boolean z2) {
        Typeface typefaceCreate = Typeface.create("mipro-regular", 0);
        Typeface typefaceCreate2 = Typeface.create(dd.f16402k, 0);
        if (z2) {
            typefaceCreate = typefaceCreate2;
        }
        this.f28609s.setTypeface(typefaceCreate);
        this.f28606p.setTypeface(typefaceCreate);
    }

    protected void toq(String str) {
    }

    @Override // com.miui.clock.zy.n7h
    public void wvg(String str) {
    }

    public MiuiBaseClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28607q = null;
        this.f28597c = true;
        this.f28598e = 1.0f;
        this.f28603k = context;
        this.f28607q = context.getResources();
        ld6();
    }
}
