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
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.utils.BaseLineSpaceView;
import gcp.C6064q;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class MagazineCClockPreviewView extends MiuiClockPreviewBaseView {

    /* JADX INFO: renamed from: a */
    private Typeface f29141a;

    /* JADX INFO: renamed from: b */
    private MiuiTextGlassView f29142b;

    /* JADX INFO: renamed from: c */
    private BaseLineSpaceView f29143c;

    /* JADX INFO: renamed from: e */
    private BaseLineSpaceView f29144e;

    /* JADX INFO: renamed from: f */
    private Space f29145f;

    /* JADX INFO: renamed from: h */
    private ViewGroup f29146h;

    /* JADX INFO: renamed from: i */
    private TextView f29147i;

    /* JADX INFO: renamed from: j */
    private BaseLineSpaceView f29148j;

    /* JADX INFO: renamed from: l */
    private Space f29149l;

    /* JADX INFO: renamed from: m */
    private MiuiTextGlassView f29150m;

    /* JADX INFO: renamed from: o */
    private ViewGroup f29151o;

    /* JADX INFO: renamed from: p */
    private ViewGroup f29152p;

    /* JADX INFO: renamed from: r */
    private MiuiTextGlassView f29153r;

    /* JADX INFO: renamed from: t */
    private MiuiTextGlassView f29154t;

    /* JADX INFO: renamed from: x */
    private Typeface f29155x;

    /* JADX INFO: renamed from: z */
    private TextView f29156z;

    public MagazineCClockPreviewView(@lvui Context context) {
        super(context);
    }

    private void f7l8() {
        View viewInflate = View.inflate(this.f28643n, C5049g.f7l8.f70930f7l8, this);
        this.f29151o = (ViewGroup) viewInflate.findViewById(C5049g.g.f71015ld6);
        this.f29150m = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f28959t);
        this.f29142b = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f71009jp0y);
        this.f29148j = (BaseLineSpaceView) viewInflate.findViewById(C5049g.g.f71063wx16);
    }

    /* JADX INFO: renamed from: g */
    private void m17695g() {
        View viewInflate = View.inflate(this.f28643n, C5049g.f7l8.f28926g, this);
        this.f29152p = (ViewGroup) viewInflate.findViewById(C5049g.g.f28955p);
        this.f29146h = (ViewGroup) viewInflate.findViewById(C5049g.g.f70966bek6);
        this.f29147i = (TextView) viewInflate.findViewById(C5049g.g.f71076zurt);
        this.f29156z = (TextView) viewInflate.findViewById(C5049g.g.f70977d3);
        this.f29154t = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f71062wvg);
        this.f29149l = (Space) findViewById(C5049g.g.f71049uc);
        this.f29145f = (Space) findViewById(C5049g.g.f71054vep5);
        this.f29143c = (BaseLineSpaceView) viewInflate.findViewById(C5049g.g.f70998h4b);
        this.f29144e = (BaseLineSpaceView) viewInflate.findViewById(C5049g.g.f71028ncyb);
        this.f29153r = (MiuiTextGlassView) viewInflate.findViewById(C5049g.g.f70990fti);
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public float getScaleRadio() {
        return this.f28641g == 5 ? 0.185f : 0.174f;
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
        String strM22334k = C6064q.m22334k(this.f28644q ? "HHmm" : "hhmm");
        for (int i2 = 0; i2 < strM22334k.length(); i2++) {
            this.f28646y[i2] = Integer.parseInt(String.valueOf(strM22334k.charAt(i2)));
        }
        if (this.f28641g != 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29151o.getLayoutParams();
            layoutParams.topMargin = m17547k(C5049g.q.f71661wx16);
            layoutParams.gravity = 1;
            this.f29151o.setLayoutParams(layoutParams);
            MiuiTextGlassView miuiTextGlassView = this.f29150m;
            Resources resources = getResources();
            int i3 = C5049g.zy.f71850x2;
            miuiTextGlassView.setTextColor(resources.getColor(i3));
            if (this.f28641g == 6) {
                this.f29142b.setTextColor(getResources().getColor(i3));
            } else {
                this.f29142b.setTextColor(getResources().getColor(C5049g.zy.f71845f7l8));
            }
            float qVar = toq(C5049g.q.fbr) * 1.0f;
            this.f29150m.setTextSize(0, qVar);
            this.f29142b.setTextSize(0, qVar);
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.toq) this.f29148j.getLayoutParams())).topMargin = (int) (toq(C5049g.q.rlj) * 1.0f);
            int i4 = this.f28641g;
            if (i4 == 6) {
                this.f29142b.setFontFeatureSettings(this.f28645s[this.f28646y[2]] + "," + this.f28645s[this.f28646y[3]]);
            } else if (i4 == 7) {
                this.f29142b.setFontFeatureSettings("");
            }
            MiuiTextGlassView miuiTextGlassView2 = this.f29150m;
            Locale locale = Locale.ENGLISH;
            miuiTextGlassView2.setText(String.format(locale, "%d%d", Integer.valueOf(this.f28646y[0]), Integer.valueOf(this.f28646y[1])));
            this.f29142b.setText(String.format(locale, "%d%d", Integer.valueOf(this.f28646y[2]), Integer.valueOf(this.f28646y[3])));
            this.f29151o.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f28643n, System.currentTimeMillis(), (this.f28644q ? 32 : 16) | 12 | 64));
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29152p.getLayoutParams();
        marginLayoutParams.setMarginStart(m17547k(C5049g.q.f71671yl));
        marginLayoutParams.topMargin = m17547k(C5049g.q.f71638uc);
        this.f29152p.setLayoutParams(marginLayoutParams);
        this.f29146h.getLayoutParams().width = toq(C5049g.q.bb);
        float qVar2 = toq(C5049g.q.a7zh);
        this.f29147i.setTextSize(0, qVar2);
        this.f29154t.setTextSize(0, qVar2);
        this.f29153r.setTextSize(0, qVar2);
        this.f29146h.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f28643n, System.currentTimeMillis(), (this.f28644q ? 32 : 16) | 12 | 64));
        TextView textView = this.f29147i;
        Resources resources2 = getResources();
        int i5 = C5049g.zy.f71850x2;
        textView.setTextColor(resources2.getColor(i5));
        this.f29156z.setTextColor(getResources().getColor(i5));
        this.f29154t.setTextColor(getResources().getColor(i5));
        this.f29153r.setTextColor(getResources().getColor(C5049g.zy.f71845f7l8));
        this.f29147i.setText(C6064q.m22334k(this.f28643n.getString(C5049g.s.f71765r8s8)).toUpperCase());
        TextView textView2 = this.f29147i;
        C7230k c7230k = this.f28642k;
        Context context = this.f28643n;
        textView2.setContentDescription(c7230k.format(context, context.getString(C5049g.s.f71744m4)));
        C7230k c7230k2 = this.f28642k;
        Context context2 = this.f28643n;
        String str = c7230k2.format(context2, context2.getString(C5049g.s.f71761py));
        this.f29156z.setContentDescription(str);
        this.f29156z.setText(str.toUpperCase());
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.f29143c.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.f29144e.getLayoutParams();
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) this.f29156z.getLayoutParams();
        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) this.f29149l.getLayoutParams();
        ConstraintLayout.toq toqVar5 = (ConstraintLayout.toq) this.f29145f.getLayoutParams();
        if (gcp.f7l8.m22298h(str)) {
            this.f29156z.setTextSize(0, toq(r0));
            this.f29156z.setTypeface(this.f29141a);
            if (gcp.f7l8.qrj(str) || !gcp.f7l8.n7h(str)) {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = toq(C5049g.q.cyg);
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = toq(C5049g.q.xnu);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = toq(C5049g.q.ahb);
                ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = toq(C5049g.q.vymi);
            }
            toqVar3.f48509qrj = C5049g.g.f70998h4b;
            toqVar3.f2653s = -1;
        } else {
            if ("bo".equals(Locale.getDefault().getLanguage())) {
                this.f29156z.setTextSize(0, toq(C5049g.q.mq));
                ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = toq(C5049g.q.wkrb);
            } else {
                this.f29156z.setTextSize(0, toq(C5049g.q.b3fl));
                ((ViewGroup.MarginLayoutParams) toqVar5).topMargin = toq(C5049g.q.fupf);
            }
            toqVar3.f48509qrj = -1;
            toqVar3.f2653s = C5049g.g.f71054vep5;
            this.f29156z.setTypeface(this.f29155x);
            ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = toq(C5049g.q.wh);
        }
        ((ViewGroup.MarginLayoutParams) toqVar4).bottomMargin = toq(C5049g.q.ma8k);
        MiuiTextGlassView miuiTextGlassView3 = this.f29154t;
        Locale locale2 = Locale.ENGLISH;
        miuiTextGlassView3.setText(String.format(locale2, "%d%d", Integer.valueOf(this.f28646y[0]), Integer.valueOf(this.f28646y[1])));
        this.f29153r.setText(String.format(locale2, "%d%d", Integer.valueOf(this.f28646y[2]), Integer.valueOf(this.f28646y[3])));
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public void setStyle(int i2) {
        super.setStyle(i2);
        if (this.f28641g == 5) {
            m17695g();
        } else {
            f7l8();
        }
    }

    @Override // com.miui.clock.MiuiClockPreviewBaseView
    public void zy() {
        super.zy();
        this.f29141a = Typeface.create("miclock-neue-matic-compressed-black", 0);
        this.f29155x = gcp.f7l8.f7l8();
    }

    public MagazineCClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagazineCClockPreviewView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
