package com.miui.clock.magazine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiClockPreviewBaseView;
import gcp.C6064q;
import miuix.pickerwidget.date.C7230k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class MagazineAClockPreviewView extends MiuiClockPreviewBaseView {

    /* JADX INFO: renamed from: c */
    private ViewGroup f29131c;

    /* JADX INFO: renamed from: e */
    private ViewGroup f29132e;

    /* JADX INFO: renamed from: f */
    private Space f29133f;

    /* JADX INFO: renamed from: h */
    protected TextView f29134h;

    /* JADX INFO: renamed from: i */
    protected TextView f29135i;

    /* JADX INFO: renamed from: l */
    private Space f29136l;

    /* JADX INFO: renamed from: p */
    protected TextView f29137p;

    /* JADX INFO: renamed from: r */
    private View f29138r;

    /* JADX INFO: renamed from: t */
    private View f29139t;

    /* JADX INFO: renamed from: z */
    private View f29140z;

    public MagazineAClockPreviewView(@lvui Context context) {
        super(context);
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public float getScaleRadio() {
        return 0.486f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(m17547k(C5049g.q.f71641ukdy), m17547k(C5049g.q.f46227do));
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    /* JADX INFO: renamed from: q */
    protected void mo17549q() {
        super.mo17549q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29132e.getLayoutParams();
        layoutParams.width = m17547k(C5049g.q.f71641ukdy);
        layoutParams.height = m17547k(C5049g.q.f46227do);
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.f29131c.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.f29134h.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.f29137p.getLayoutParams();
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.f29135i.getLayoutParams();
        Typeface typefaceCreate = Typeface.create("miclock-chamberi-display-semibold", 0);
        Typeface typefaceCreate2 = Typeface.create("miclock-chamberi-display-semibold-italic", 0);
        Typeface typefaceCreate3 = Typeface.create("miclock-qinghe-75w", 0);
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.f29140z.getLayoutParams();
        ConstraintLayout.toq toqVar6 = (ConstraintLayout.toq) this.f29139t.getLayoutParams();
        ConstraintLayout.toq toqVar7 = (ConstraintLayout.toq) this.f29138r.getLayoutParams();
        if (this.f28641g == 2) {
            int i2 = C5049g.q.zxq;
            ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = toq(i2);
            int i3 = C5049g.q.dbf;
            ((ViewGroup.MarginLayoutParams) toqVar6).topMargin = toq(i3);
            ((ViewGroup.MarginLayoutParams) toqVar7).topMargin = toq(C5049g.q.gw);
            ConstraintLayout.toq toqVar8 = (ConstraintLayout.toq) this.f29136l.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) toqVar8).topMargin = toq(i2);
            toqVar8.setMarginStart(toq(C5049g.q.vg));
            this.f29136l.setLayoutParams(toqVar8);
            ConstraintLayout.toq toqVar9 = (ConstraintLayout.toq) this.f29133f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) toqVar9).topMargin = toq(i3);
            toqVar9.setMarginStart(toq(C5049g.q.izu));
            this.f29133f.setLayoutParams(toqVar9);
            int i4 = C5049g.q.e4e;
            ((ViewGroup.MarginLayoutParams) toqVar3).width = toq(i4);
            ((ViewGroup.MarginLayoutParams) toqVar3).height = toq(C5049g.q.nc);
            ((ViewGroup.MarginLayoutParams) toqVar2).width = toq(i4);
            ((ViewGroup.MarginLayoutParams) toqVar2).height = toq(C5049g.q.ap23);
            ((ViewGroup.MarginLayoutParams) toqVar4).width = -1;
            ((ViewGroup.MarginLayoutParams) toqVar4).height = toq(C5049g.q.cjaj);
            toqVar3.f48509qrj = C5049g.g.f71065x9kr;
            toqVar2.f48509qrj = C5049g.g.f71069yl;
            toqVar4.f48509qrj = C5049g.g.f70965bap7;
            int i5 = C5049g.g.f71020lvui;
            toqVar3.f2643i = i5;
            int i6 = C5049g.g.f71014ktq;
            toqVar2.f2643i = i6;
            toqVar4.f2643i = 0;
            toqVar3.f48522zurt = i5;
            toqVar2.f48522zurt = i6;
            toqVar4.f48522zurt = 0;
            toqVar3.setMarginStart(0);
            toqVar2.setMarginStart(0);
            toqVar4.setMarginStart(0);
            toqVar3.setMarginEnd(0);
            toqVar2.setMarginEnd(0);
            toqVar4.setMarginEnd(0);
            this.f29137p.setLayoutParams(toqVar3);
            this.f29134h.setLayoutParams(toqVar2);
            this.f29135i.setLayoutParams(toqVar4);
            this.f29137p.setTextSize(0, toq(C5049g.q.nod));
            this.f29134h.setTextSize(0, toq(C5049g.q.es7));
            this.f29135i.setTextSize(0, toq(C5049g.q.alcv));
            this.f29137p.setTypeface(typefaceCreate2);
            this.f29134h.setTypeface(typefaceCreate2);
            this.f29135i.setTypeface(typefaceCreate3);
            this.f29137p.setLetterSpacing(0.0f);
            this.f29134h.setLetterSpacing(0.0f);
            this.f29137p.setGravity(1);
            this.f29134h.setGravity(1);
            this.f29135i.setGravity(1);
            toqVar.f2643i = 0;
            toqVar.f48522zurt = 0;
            toqVar.f2653s = 0;
            toqVar.setMarginStart(0);
            toqVar.setMarginEnd(0);
            ((ViewGroup.MarginLayoutParams) toqVar).topMargin = m17547k(C5049g.q.y3);
        } else {
            ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = toq(C5049g.q.m28);
            ((ViewGroup.MarginLayoutParams) toqVar6).topMargin = toq(C5049g.q.vahq);
            ((ViewGroup.MarginLayoutParams) toqVar7).topMargin = toq(C5049g.q.s31);
            ((ViewGroup.MarginLayoutParams) toqVar3).width = -2;
            ((ViewGroup.MarginLayoutParams) toqVar3).height = toq(C5049g.q.zma);
            ((ViewGroup.MarginLayoutParams) toqVar2).width = -2;
            ((ViewGroup.MarginLayoutParams) toqVar2).height = toq(C5049g.q.sb);
            ((ViewGroup.MarginLayoutParams) toqVar4).width = -2;
            ((ViewGroup.MarginLayoutParams) toqVar4).height = toq(C5049g.q.zah1);
            toqVar3.f48509qrj = C5049g.g.f71065x9kr;
            toqVar2.f48509qrj = C5049g.g.f71069yl;
            toqVar4.f48509qrj = C5049g.g.f70965bap7;
            if (this.f28641g == 1) {
                toqVar3.f2643i = 0;
                toqVar2.f2643i = 0;
                toqVar4.f2643i = 0;
                toqVar3.f48522zurt = -1;
                toqVar2.f48522zurt = -1;
                toqVar4.f48522zurt = -1;
                toqVar3.setMarginStart(toq(C5049g.q.kjd));
                toqVar2.setMarginStart(toq(C5049g.q.eklw));
                toqVar4.setMarginStart(toq(C5049g.q.oei));
                toqVar3.setMarginEnd(0);
                toqVar2.setMarginEnd(0);
                toqVar4.setMarginEnd(0);
                toqVar.f2643i = 0;
                toqVar.f48522zurt = -1;
                toqVar.f2653s = 0;
                toqVar.setMarginStart(m17547k(C5049g.q.mla));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = m17547k(C5049g.q.wu);
                toqVar.setMarginEnd(0);
            } else {
                toqVar3.f48522zurt = 0;
                toqVar2.f48522zurt = 0;
                toqVar4.f48522zurt = 0;
                toqVar3.f2643i = -1;
                toqVar2.f2643i = -1;
                toqVar4.f2643i = -1;
                toqVar3.setMarginStart(0);
                toqVar2.setMarginStart(0);
                toqVar4.setMarginStart(0);
                toqVar3.setMarginEnd(toq(C5049g.q.kjd));
                toqVar2.setMarginEnd(toq(C5049g.q.eklw));
                toqVar4.setMarginEnd(toq(C5049g.q.koj));
                toqVar.f48522zurt = 0;
                toqVar.f2643i = -1;
                toqVar.f2653s = 0;
                toqVar.setMarginStart(0);
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = m17547k(C5049g.q.wu);
                toqVar.setMarginEnd(m17547k(C5049g.q.l7o));
            }
            this.f29137p.setLayoutParams(toqVar3);
            this.f29134h.setLayoutParams(toqVar2);
            this.f29135i.setLayoutParams(toqVar4);
            this.f29137p.setTextSize(0, toq(C5049g.q.k4jz));
            this.f29134h.setTextSize(0, toq(C5049g.q.vc));
            this.f29135i.setTextSize(0, toq(C5049g.q.owi));
            this.f29137p.setTypeface(typefaceCreate);
            this.f29134h.setTypeface(typefaceCreate);
            this.f29135i.setTypeface(typefaceCreate3);
            this.f29137p.setLetterSpacing(0.03f);
            this.f29134h.setLetterSpacing(0.03f);
        }
        this.f29131c.setLayoutParams(toqVar);
        TextView textView = this.f29134h;
        Resources resources = getResources();
        int i7 = C5049g.zy.f71850x2;
        textView.setTextColor(resources.getColor(i7));
        this.f29137p.setTextColor(getResources().getColor(i7));
        this.f29135i.setTextColor(getResources().getColor(C5049g.zy.f29094g));
        this.f29134h.setText(C6064q.m22334k(this.f28643n.getString(this.f28644q ? C5049g.s.f29045b : C5049g.s.f71789y9n)));
        this.f29137p.setText(C6064q.m22334k(this.f28643n.getString(C5049g.s.f71765r8s8)).toUpperCase());
        TextView textView2 = this.f29137p;
        C7230k c7230k = this.f28642k;
        Context context = this.f28643n;
        textView2.setContentDescription(c7230k.format(context, context.getString(C5049g.s.f71744m4)));
        TextView textView3 = this.f29135i;
        C7230k c7230k2 = this.f28642k;
        Context context2 = this.f28643n;
        textView3.setText(c7230k2.format(context2, context2.getString(C5049g.s.f71776v0af)).toUpperCase());
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public void zy() {
        super.zy();
        View viewInflate = View.inflate(this.f28643n, C5049g.f7l8.f70954toq, this);
        this.f29137p = (TextView) viewInflate.findViewById(C5049g.g.f28948i);
        this.f29135i = (TextView) viewInflate.findViewById(C5049g.g.f70996gvn7);
        this.f29134h = (TextView) viewInflate.findViewById(C5049g.g.f70991fu4);
        this.f29140z = viewInflate.findViewById(C5049g.g.f71065x9kr);
        this.f29139t = viewInflate.findViewById(C5049g.g.f71069yl);
        this.f29138r = viewInflate.findViewById(C5049g.g.f70965bap7);
        this.f29136l = (Space) viewInflate.findViewById(C5049g.g.f71020lvui);
        this.f29133f = (Space) viewInflate.findViewById(C5049g.g.f71014ktq);
        this.f29131c = (ViewGroup) viewInflate.findViewById(C5049g.g.f28958s);
        this.f29132e = (ViewGroup) viewInflate.findViewById(C5049g.g.f28963y);
    }

    public MagazineAClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagazineAClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
