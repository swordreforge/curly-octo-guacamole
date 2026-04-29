package com.miui.clock.rhombus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import gcp.C6061k;
import gcp.C6062n;
import gcp.C6064q;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class RhombusClockPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private View f29285g;

    /* JADX INFO: renamed from: h */
    protected boolean f29286h;

    /* JADX INFO: renamed from: i */
    private Context f29287i;

    /* JADX INFO: renamed from: k */
    private MiuiTextGlassView f29288k;

    /* JADX INFO: renamed from: n */
    private Group f29289n;

    /* JADX INFO: renamed from: p */
    private C7230k f29290p;

    /* JADX INFO: renamed from: q */
    private MiuiTextGlassView f29291q;

    /* JADX INFO: renamed from: s */
    private ViewGroup f29292s;

    /* JADX INFO: renamed from: t */
    private int f29293t;

    /* JADX INFO: renamed from: y */
    private View f29294y;

    /* JADX INFO: renamed from: z */
    private int f29295z;

    public RhombusClockPreviewView(@lvui Context context) {
        super(context);
        this.f29295z = 71;
        this.f29293t = 23;
        m17743q();
    }

    /* JADX INFO: renamed from: q */
    private void m17743q() {
        Context context = getContext();
        this.f29287i = context;
        View viewInflate = View.inflate(context, C5049g.f7l8.f28930k, this);
        this.f29288k = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f71006ixz);
        this.f29291q = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f46224do);
        this.f29285g = viewInflate.findViewById(C5049g.g.f28950k);
        this.f29294y = viewInflate.findViewById(C5049g.g.f71048toq);
        this.f29291q.setSameNumberWidth(true);
        this.f29289n = (Group) viewInflate.findViewById(C5049g.g.f70986etdu);
        this.f29292s = (ViewGroup) viewInflate.findViewById(C5049g.g.f28963y);
    }

    /* JADX INFO: renamed from: k */
    public void m17744k() {
        if (this.f29295z == -1) {
            return;
        }
        m17745n();
    }

    /* JADX INFO: renamed from: n */
    public void m17745n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f29290p == null) {
            this.f29290p = new C7230k(TimeZone.getDefault());
        }
        this.f29290p.setTimeInMillis(jCurrentTimeMillis);
        this.f29286h = C6064q.zy(this.f29287i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29292s.getLayoutParams();
        layoutParams.width = zy(C5049g.q.f71509cv06);
        layoutParams.height = zy(C5049g.q.f71494bek6);
        ViewGroup.LayoutParams layoutParams2 = this.f29285g.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = this.f29294y.getLayoutParams();
        int i2 = C5049g.q.f71582lvui;
        layoutParams2.height = toq(i2);
        layoutParams3.height = toq(i2);
        boolean z2 = this.f29295z == 72;
        this.f29288k.setSameNumberWidth(z2);
        if (z2) {
            this.f29289n.setVisibility(0);
        } else {
            this.f29289n.setVisibility(8);
        }
        C6061k.fn3e(this.f29288k, -1, this.f29293t, this.f29295z, false, true);
        C6061k.fn3e(this.f29291q, -1, this.f29293t, this.f29295z, false, true);
        int iM22311p = C6061k.m22311p(this.f29286h, this.f29290p);
        int i3 = this.f29290p.get(20);
        if (z2) {
            this.f29288k.setText(C6061k.ki(iM22311p, true));
            this.f29291q.setText(C6061k.ki(i3, true));
        } else {
            this.f29288k.setText(this.f29287i.getString(C5049g.s.f71715fu4, C6061k.ki(iM22311p, this.f29286h), C6061k.ki(i3, true)));
            this.f29291q.setText("");
        }
        MiuiTextGlassView miuiTextGlassView = this.f29288k;
        int i4 = C5049g.q.f71652vyq;
        miuiTextGlassView.setTextSize(0, toq(i4));
        this.f29291q.setTextSize(0, toq(i4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(zy(C5049g.q.f71509cv06), zy(C5049g.q.f71494bek6));
    }

    public void setCalendar(C7230k c7230k) {
        this.f29290p = c7230k;
    }

    public void setFontStyle(int i2) {
        this.f29293t = i2;
    }

    public void setStyle(int i2) {
        this.f29295z = i2;
    }

    protected int toq(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * 0.558f);
    }

    protected int zy(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    public RhombusClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29295z = 71;
        this.f29293t = 23;
        m17743q();
    }

    public RhombusClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29295z = 71;
        this.f29293t = 23;
        m17743q();
    }
}
