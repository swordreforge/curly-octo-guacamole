package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiClockPreviewBaseView;
import com.miui.clock.MiuiTextGlassView;
import gcp.C6061k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicPlusClockPreviewView extends MiuiClockPreviewBaseView {

    /* JADX INFO: renamed from: h */
    private MiuiTextGlassView f28744h;

    /* JADX INFO: renamed from: i */
    private Group f28745i;

    /* JADX INFO: renamed from: l */
    private int f28746l;

    /* JADX INFO: renamed from: p */
    private MiuiTextGlassView f28747p;

    /* JADX INFO: renamed from: r */
    private ViewGroup f28748r;

    /* JADX INFO: renamed from: t */
    private View f28749t;

    /* JADX INFO: renamed from: z */
    private View f28750z;

    public ClassicPlusClockPreviewView(@lvui Context context) {
        super(context);
        this.f28746l = 23;
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public float getScaleRadio() {
        return 0.558f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(m17547k(C5049g.q.f71509cv06), m17547k(C5049g.q.f71494bek6));
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    /* JADX INFO: renamed from: q */
    protected void mo17549q() {
        super.mo17549q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28748r.getLayoutParams();
        layoutParams.width = m17547k(C5049g.q.f71509cv06);
        layoutParams.height = m17547k(C5049g.q.f71494bek6);
        ViewGroup.LayoutParams layoutParams2 = this.f28750z.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = this.f28749t.getLayoutParams();
        int i2 = C5049g.q.f71582lvui;
        layoutParams2.height = toq(i2);
        layoutParams3.height = toq(i2);
        boolean z2 = this.f28641g == 72;
        this.f28747p.setSameNumberWidth(z2);
        if (z2) {
            this.f28745i.setVisibility(0);
        } else {
            this.f28745i.setVisibility(8);
        }
        MiuiTextGlassView miuiTextGlassView = this.f28747p;
        Resources resources = getResources();
        int i3 = C5049g.zy.f71850x2;
        C6061k.fn3e(miuiTextGlassView, resources.getColor(i3), this.f28746l, this.f28641g, false, true);
        C6061k.fn3e(this.f28744h, getResources().getColor(i3), this.f28746l, this.f28641g, false, true);
        int iM22311p = C6061k.m22311p(this.f28644q, this.f28642k);
        int i4 = this.f28642k.get(20);
        if (z2) {
            this.f28747p.setText(C6061k.ki(iM22311p, true));
            this.f28744h.setText(C6061k.ki(i4, true));
        } else {
            this.f28747p.setText(this.f28643n.getString(C5049g.s.f71715fu4, C6061k.ki(iM22311p, this.f28644q), C6061k.ki(i4, true)));
            this.f28744h.setText("");
        }
        MiuiTextGlassView miuiTextGlassView2 = this.f28747p;
        int i5 = C5049g.q.f71652vyq;
        miuiTextGlassView2.setTextSize(0, toq(i5));
        this.f28744h.setTextSize(0, toq(i5));
    }

    public void setFontStyle(int i2) {
        this.f28746l = i2;
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public void zy() {
        super.zy();
        View viewInflate = View.inflate(this.f28643n, C5049g.f7l8.f28930k, this);
        this.f28747p = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f71006ixz);
        this.f28744h = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f46224do);
        this.f28750z = viewInflate.findViewById(C5049g.g.f28950k);
        this.f28749t = viewInflate.findViewById(C5049g.g.f71048toq);
        this.f28744h.setSameNumberWidth(true);
        this.f28745i = (Group) viewInflate.findViewById(C5049g.g.f70986etdu);
        this.f28748r = (ViewGroup) viewInflate.findViewById(C5049g.g.f28963y);
    }

    public ClassicPlusClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28746l = 23;
    }

    public ClassicPlusClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28746l = 23;
    }
}
