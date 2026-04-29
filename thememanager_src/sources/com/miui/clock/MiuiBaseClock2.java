package com.miui.clock;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.zy;
import gcp.C6062n;
import gcp.C6064q;
import java.util.Locale;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MiuiBaseClock2 extends ConstraintLayout implements zy.n7h {
    protected C7230k as;
    private Configuration ax;
    protected String az;
    protected int ba;
    protected boolean bg;
    protected Context bl;

    public MiuiBaseClock2(Context context) {
        super(context);
        mo17536j(context);
    }

    public void ek5k() {
        this.bg = C6064q.zy(this.bl);
    }

    @Override // com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        if (enumC5072n == EnumC5072n.ALL_VIEW) {
            return this;
        }
        return null;
    }

    @Override // com.miui.clock.zy.n7h
    public void fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("MiuiClock", "update clock time zone: " + str);
        TimeZone timeZone = TimeZone.getTimeZone(str);
        this.as.setTimeZone(timeZone);
        mo17537m(timeZone);
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public int getClockHeight() {
        return Math.max(getHeight(), 0);
    }

    @Override // com.miui.clock.zy.n7h
    public float getClockVisibleHeight() {
        return Math.max(getHeight(), 0);
    }

    @Override // com.miui.clock.zy.n7h
    public TextView getTimeView() {
        return null;
    }

    @Override // com.miui.clock.zy.n7h
    public float getTopMargin() {
        return 0.0f;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    protected int hb(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    /* JADX INFO: renamed from: j */
    protected void mo17536j(Context context) {
        this.bl = context;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        this.ax = configuration;
        this.ba = configuration.orientation;
        this.as = new C7230k();
        ek5k();
        this.az = Locale.getDefault().getLanguage();
    }

    @Override // com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    /* JADX INFO: renamed from: m */
    public void mo17537m(TimeZone timeZone) {
    }

    @Override // com.miui.clock.zy.n7h
    public void n7h(int i2) {
    }

    /* JADX INFO: renamed from: o */
    protected void mo17538o() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String language = configuration.locale.getLanguage();
        int iUpdateFrom = this.ax.updateFrom(configuration);
        if ((iUpdateFrom & 4) != 0) {
            this.az = language;
            mo17538o();
        }
        int i2 = configuration.orientation;
        if (i2 != this.ba) {
            this.ba = i2;
            yz();
        }
        if ((iUpdateFrom & 256) != 0) {
            yz();
        }
        fti();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        boolean zZy;
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0 || (zZy = C6064q.zy(this.bl)) == this.bg) {
            return;
        }
        this.bg = zZy;
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: p */
    public void mo17535p(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockAlpha(float f2) {
        setAlpha(f2);
    }

    public void setIs24HourFormat(boolean z2) {
        this.bg = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setOwnerInfo(String str) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setScaleRatio(float f2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setShowLunarCalendar(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void wvg(String str) {
    }

    protected void yz() {
    }

    public MiuiBaseClock2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo17536j(context);
    }

    public MiuiBaseClock2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        mo17536j(context);
    }
}
