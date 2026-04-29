package com.miui.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gcp.C6062n;
import gcp.C6064q;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MiuiClockPreviewBaseView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    protected int f28641g;

    /* JADX INFO: renamed from: k */
    protected C7230k f28642k;

    /* JADX INFO: renamed from: n */
    protected Context f28643n;

    /* JADX INFO: renamed from: q */
    protected boolean f28644q;

    /* JADX INFO: renamed from: s */
    protected final String[] f28645s;

    /* JADX INFO: renamed from: y */
    protected int[] f28646y;

    public MiuiClockPreviewBaseView(@lvui Context context) {
        super(context);
        this.f28641g = -1;
        this.f28646y = new int[4];
        this.f28645s = new String[]{"ss01", "ss02", "ss03", "ss04", "ss05", "ss06", "ss07", "ss08", "ss09", "ss10"};
        zy();
    }

    public abstract float getScaleRadio();

    /* JADX INFO: renamed from: k */
    protected int m17547k(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()) * ((!C6062n.qrj() || C6062n.m22322s(getContext())) ? 1.0f : 0.8f));
    }

    /* JADX INFO: renamed from: n */
    public void m17548n() {
        if (this.f28641g == -1) {
            return;
        }
        mo17549q();
    }

    /* JADX INFO: renamed from: q */
    protected void mo17549q() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f28642k == null) {
            this.f28642k = new C7230k(TimeZone.getDefault());
        }
        this.f28642k.setTimeInMillis(jCurrentTimeMillis);
        this.f28644q = C6064q.zy(this.f28643n);
    }

    public void setCalendar(C7230k c7230k) {
        this.f28642k = c7230k;
    }

    public void setStyle(int i2) {
        this.f28641g = i2;
    }

    protected int toq(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()) * getScaleRadio() * ((!C6062n.qrj() || C6062n.m22322s(getContext())) ? 1.0f : 0.8f));
    }

    public void zy() {
        this.f28643n = getContext();
    }

    public MiuiClockPreviewBaseView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28641g = -1;
        this.f28646y = new int[4];
        this.f28645s = new String[]{"ss01", "ss02", "ss03", "ss04", "ss05", "ss06", "ss07", "ss08", "ss09", "ss10"};
        zy();
    }

    public MiuiClockPreviewBaseView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28641g = -1;
        this.f28646y = new int[4];
        this.f28645s = new String[]{"ss01", "ss02", "ss03", "ss04", "ss05", "ss06", "ss07", "ss08", "ss09", "ss10"};
        zy();
    }
}
