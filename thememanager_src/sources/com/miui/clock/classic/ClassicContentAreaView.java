package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.graphics.C0541p;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.HealthBean;
import com.miui.clock.module.WeatherBean;
import com.miui.clock.module.ni7;
import com.miui.clock.module.toq;
import gcp.C6061k;
import gcp.C6062n;
import gcp.C6064q;
import gcp.f7l8;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicContentAreaView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private ImageView f28718a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private HealthMsgTextView f70913ab;
    private ViewStub ac;
    private ViewStub ad;
    private ViewStub aj;
    private ViewStub am;
    private ViewStub an;
    private boolean ar;
    private ViewStub as;
    private ViewStub ax;
    private ViewStub ay;
    private ViewStub az;

    /* JADX INFO: renamed from: b */
    private ImageView f28719b;
    private ViewStub ba;
    private HealthMsgChartView bb;
    private boolean bc;
    private boolean bd;
    private ViewStub be;
    private ViewStub bg;
    private ViewStub bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ImageView f70914bo;
    private HealthMsgSleepChartView bp;
    private ViewStub bq;
    private ViewStub bs;
    private boolean bu;
    private ViewStub bv;

    /* JADX INFO: renamed from: c */
    private TextView f28720c;

    /* JADX INFO: renamed from: d */
    private HumidityIconView f28721d;
    private boolean dy;

    /* JADX INFO: renamed from: e */
    private TextView f28722e;

    /* JADX INFO: renamed from: f */
    private TextView f28723f;

    /* JADX INFO: renamed from: g */
    private int f28724g;

    /* JADX INFO: renamed from: h */
    private String f28725h;

    /* JADX INFO: renamed from: i */
    private String f28726i;
    private ViewStub id;
    private ViewStub in;

    /* JADX INFO: renamed from: j */
    private TextView f28727j;

    /* JADX INFO: renamed from: k */
    private Context f28728k;
    private boolean k0;

    /* JADX INFO: renamed from: l */
    private MiuiTextGlassView f28729l;

    /* JADX INFO: renamed from: m */
    private TextView f28730m;

    /* JADX INFO: renamed from: n */
    private C7230k f28731n;

    /* JADX INFO: renamed from: o */
    private TextView f28732o;

    /* JADX INFO: renamed from: p */
    private ni7 f28733p;

    /* JADX INFO: renamed from: q */
    private Resources f28734q;

    /* JADX INFO: renamed from: r */
    private WeatherBean f28735r;

    /* JADX INFO: renamed from: s */
    private int f28736s;
    private boolean sk1t;

    /* JADX INFO: renamed from: t */
    private HealthBean f28737t;
    private boolean tgs;
    private boolean tlhn;

    /* JADX INFO: renamed from: u */
    private ImageView f28738u;

    /* JADX INFO: renamed from: v */
    private ImageView f28739v;

    /* JADX INFO: renamed from: w */
    private SunMoveView f28740w;
    private boolean w97r;

    /* JADX INFO: renamed from: x */
    private ImageView f28741x;

    /* JADX INFO: renamed from: y */
    private int f28742y;
    private boolean yl25;

    /* JADX INFO: renamed from: z */
    private boolean f28743z;
    private boolean zmmu;

    public ClassicContentAreaView(Context context) {
        super(context);
        this.k0 = true;
        this.ar = false;
        this.bc = false;
        this.bu = false;
        this.bd = false;
        this.tlhn = false;
        this.w97r = false;
        this.tgs = false;
        this.yl25 = false;
        this.zmmu = false;
        this.sk1t = false;
        this.dy = false;
        m17599z(context);
    }

    private void a9(SunMoveView sunMoveView, int i2, int i3, int i4, int i5) {
        if (sunMoveView != null) {
            sunMoveView.m17640y(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m17583c(final View view, final int i2, final int i3, final int i4, final int i5) {
        TextView textView;
        if (f7l8.cdj() || (textView = this.f28723f) == null) {
            ncyb(view, i2, i3, i4, i5);
        } else {
            textView.post(new Runnable() { // from class: com.miui.clock.classic.toq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28917k.gvn7(i5, view, i2, i3, i4);
                }
            });
        }
    }

    private void cdj() {
        if (this.f28729l == null) {
            this.f28729l = (MiuiTextGlassView) this.bv.inflate();
        }
    }

    private void d2ok() {
        ni7 ni7Var = this.f28733p;
        if (ni7Var == null) {
            Log.d("ClassicContentAreaView", "onSizeChanged mClockStyleInfo is null");
            return;
        }
        MiuiTextGlassView miuiTextGlassView = this.f28729l;
        if (miuiTextGlassView != null) {
            C6061k.fn3e(miuiTextGlassView, ni7Var.m17707r(), this.f28733p.x9kr(), this.f28724g, this.f28733p.ncyb(), false);
        }
        TextView textView = this.f28723f;
        if (textView != null) {
            C6061k.t8r(textView, this.f28742y, this.f28724g);
        }
        TextView textView2 = this.f28720c;
        if (textView2 != null) {
            textView2.setTextSize(0, zurt(C5049g.q.f71607o1t));
            ncyb(this.f28720c, zurt(C5049g.q.f71599ni7), zurt(C6061k.n7h(this.f28742y)), 0, 0);
        } else {
            ncyb(this.id, zurt(C5049g.q.f71599ni7), zurt(C6061k.n7h(this.f28742y)), 0, 0);
        }
        TextView textView3 = this.f28722e;
        if (textView3 != null) {
            textView3.setTextSize(0, zurt(C5049g.q.f71607o1t));
            ncyb(this.f28722e, zurt(C5049g.q.f71535fu4), zurt(C6061k.n7h(this.f28742y)), 0, 0);
        } else {
            ncyb(this.in, zurt(C5049g.q.f71535fu4), zurt(C6061k.n7h(this.f28742y)), 0, 0);
        }
        TextView textView4 = this.f28732o;
        if (textView4 != null) {
            textView4.setTextSize(0, zurt(C5049g.q.f71560jk));
            ncyb(this.f28732o, zurt(C5049g.q.f29037t), zurt(C6061k.kja0(this.f28742y)), 0, 0);
        } else {
            ncyb(this.bl, zurt(C5049g.q.f29037t), zurt(C5049g.q.f71589mcp), 0, 0);
        }
        TextView textView5 = this.f28727j;
        if (textView5 != null) {
            textView5.setTextSize(0, zurt(C5049g.q.f71632t8r));
            m17583c(this.f28727j, zurt(C5049g.q.f71565ki), 0, 0, zurt(C5049g.q.f71504cdj));
        } else {
            ncyb(this.as, zurt(C5049g.q.f71565ki), 0, 0, zurt(C5049g.q.f71504cdj));
        }
        if (this.f28719b != null) {
            int iZurt = zurt(C5049g.q.fvqg);
            lrht(this.f28719b, zurt(C5049g.q.f29025h), 0, 0, zurt(C5049g.q.f71567kja0), iZurt, iZurt);
        } else {
            ncyb(this.bg, zurt(C5049g.q.f29025h), 0, 0, zurt(C5049g.q.f71567kja0));
        }
        if (this.f28718a != null) {
            int iZurt2 = zurt(C5049g.q.fvqg);
            lrht(this.f28718a, zurt(C5049g.q.eh), 0, 0, zurt(C5049g.q.f71567kja0), iZurt2, iZurt2);
        } else {
            ncyb(this.az, zurt(C5049g.q.eh), 0, 0, zurt(C5049g.q.f71567kja0));
        }
        if (this.f28739v != null) {
            int iZurt3 = zurt(C5049g.q.fn9);
            lrht(this.f28739v, zurt(C5049g.q.qspg), 0, 0, zurt(C5049g.q.u3gu), iZurt3, iZurt3);
        } else {
            ncyb(this.ba, zurt(C5049g.q.qspg), 0, 0, zurt(C5049g.q.u3gu));
        }
        ImageView imageView = this.f28741x;
        if (imageView != null) {
            m17590l(imageView, zurt(C5049g.q.f71532fn3e), 0, 0, zurt(C5049g.q.f71567kja0), zurt(C5049g.q.an), zurt(C5049g.q.nrcs));
        } else {
            ncyb(this.ax, zurt(C5049g.q.f71532fn3e), 0, 0, zurt(C5049g.q.f71567kja0));
        }
        ImageView imageView2 = this.f28738u;
        if (imageView2 != null) {
            imageView2.setPadding(0, zurt(C5049g.q.c2lu), 0, zurt(C5049g.q.r8k));
            m17590l(this.f28738u, zurt(C5049g.q.jerf), 0, 0, 0, zurt(C5049g.q.ep5q), zurt(C5049g.q.h8k));
        } else {
            ncyb(this.bq, zurt(C5049g.q.jerf), 0, 0, 0);
        }
        TextView textView6 = this.f28730m;
        if (textView6 != null) {
            textView6.setTextSize(0, zurt(C5049g.q.f71607o1t));
            ncyb(this.f28730m, zurt(C5049g.q.f71561jp0y), zurt(C5049g.q.f71543gvn7), 0, 0);
        } else {
            ncyb(this.ac, zurt(C5049g.q.f71561jp0y), zurt(C5049g.q.f71543gvn7), 0, 0);
        }
        HumidityIconView humidityIconView = this.f28721d;
        if (humidityIconView != null) {
            humidityIconView.m17631n();
            n5r1(this.f28721d, -2, zurt(C5049g.q.f71681zkd));
            this.f28721d.requestLayout();
            this.f28721d.invalidate();
        }
        SunMoveView sunMoveView = this.f28740w;
        if (sunMoveView != null) {
            sunMoveView.ld6();
            n5r1(this.f28740w, zurt(C5049g.q.mv), zurt(C5049g.q.n358));
            this.f28740w.setStyle(this.f28733p.x9kr());
            this.f28740w.f7l8((this.f28731n.get(18) * 60) + this.f28731n.get(20));
        }
        if (this.f70914bo != null) {
            int iZurt4 = zurt(C5049g.q.f71648vq);
            m17590l(this.f70914bo, zurt(C5049g.q.f71620qkj8), zurt(C5049g.q.f71533fnq8), 0, 0, iZurt4, iZurt4);
        } else {
            ncyb(this.ay, zurt(C5049g.q.f71620qkj8), zurt(C5049g.q.f71533fnq8), 0, 0);
        }
        HealthMsgTextView healthMsgTextView = this.f70913ab;
        if (healthMsgTextView != null) {
            healthMsgTextView.m17628s();
            this.f70913ab.m17629y();
            this.f70913ab.requestLayout();
            this.f70913ab.invalidate();
        }
        HealthMsgChartView healthMsgChartView = this.bb;
        if (healthMsgChartView != null) {
            healthMsgChartView.f7l8();
            this.bb.m17617g();
            this.bb.requestLayout();
            this.bb.invalidate();
        }
        HealthMsgSleepChartView healthMsgSleepChartView = this.bp;
        if (healthMsgSleepChartView != null) {
            healthMsgSleepChartView.m17621g();
            this.bp.m17622n(eqxt(this.f28724g) ? -1 : this.f28737t.getSleepDurationMinute());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(int i2, View view, int i3, int i4, int i5, int i6, int i7) {
        int lineHeight = this.f28723f.getLineHeight();
        int iNi7 = ni7(this.f28723f);
        if (iNi7 > 0 && lineHeight > 0) {
            i2 = lineHeight - iNi7;
        }
        m17590l(view, i3, i4, i5, i2, i6, i7);
    }

    private void dd(HumidityIconView humidityIconView, int i2) {
        if (humidityIconView != null) {
            humidityIconView.setHumidity(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m17584e(ImageView imageView, int i2) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null || i2 == 0) {
            return;
        }
        drawable.setTint(i2);
    }

    private boolean eqxt(int i2) {
        HealthBean healthBean = this.f28737t;
        if (healthBean == null) {
            return true;
        }
        switch (i2) {
            case 500:
            case 501:
                return !healthBean.hasStepCountData();
            case 502:
            case 503:
                return !healthBean.hasCaloriesData();
            case 504:
                return !healthBean.hasStandCountData();
            case 505:
            case 508:
                return !healthBean.hasSportTimeData();
            case 506:
                return !healthBean.hasSleepDurationData();
            case 507:
            default:
                return (healthBean.hasSportTimeData() || this.f28737t.hasCaloriesData() || this.f28737t.hasStepCountData()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m17585f(TextView textView, int i2) {
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    private void f7l8() {
        if (this.f28721d == null) {
            this.f28721d = (HumidityIconView) this.ad.inflate();
        }
    }

    private void fn3e(ImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    private void fu4() {
        uv6(this.f28729l, 8);
        uv6(this.f28723f, 8);
        uv6(this.f28720c, 8);
        uv6(this.f28722e, 8);
        uv6(this.f28732o, 8);
        uv6(this.f28727j, 8);
        uv6(this.f28719b, 8);
        uv6(this.f28718a, 8);
        uv6(this.f28739v, 8);
        uv6(this.f28741x, 8);
        uv6(this.f28738u, 8);
        uv6(this.f28730m, 8);
        uv6(this.f28721d, 8);
        uv6(this.f28740w, 8);
        uv6(this.f70914bo, 8);
        uv6(this.f70913ab, 8);
        uv6(this.bb, 8);
        uv6(this.bp, 8);
    }

    /* JADX INFO: renamed from: g */
    private void m17586g() {
        if (this.f70913ab == null) {
            this.f70913ab = (HealthMsgTextView) this.be.inflate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gvn7(int i2, View view, int i3, int i4, int i5) {
        int lineHeight = this.f28723f.getLineHeight();
        int iNi7 = ni7(this.f28723f);
        if (iNi7 > 0 && lineHeight > 0) {
            i2 = lineHeight - iNi7;
        }
        ncyb(view, i3, i4, i5, i2);
    }

    /* JADX INFO: renamed from: h */
    private void m17587h() {
        if (this.f28740w == null) {
            this.f28740w = (SunMoveView) this.am.inflate();
        }
    }

    private void hyr(TextView textView, String str) {
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m17588i() {
        if (this.f28718a == null) {
            this.f28718a = (ImageView) this.az.inflate();
        }
    }

    private void jk(HealthMsgTextView healthMsgTextView, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (healthMsgTextView != null) {
            healthMsgTextView.f7l8(i2, i3, i4, i5, i6, i7);
        }
    }

    private void ki() {
        if (this.f70914bo == null) {
            this.f70914bo = (ImageView) this.ay.inflate();
        }
    }

    private void kja0() {
        if (this.f28730m == null) {
            this.f28730m = (TextView) this.ac.inflate();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m17590l(View view, int i2, int i3, int i4, int i5, int i6, int i7) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i2, i3, i4, i5);
        layoutParams.width = i6;
        layoutParams.height = i7;
        view.setLayoutParams(layoutParams);
    }

    private void ld6() {
        if (this.f28720c == null) {
            this.f28720c = (TextView) this.id.inflate();
        }
    }

    private void lrht(final View view, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        TextView textView;
        if (view == null) {
            return;
        }
        if (f7l8.cdj() || (textView = this.f28723f) == null) {
            m17590l(view, i2, i3, i4, i5, i6, i7);
        } else {
            textView.post(new Runnable() { // from class: com.miui.clock.classic.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28909k.d3(i5, view, i2, i3, i4, i6, i7);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m17591m() {
        return this.f28735r == null;
    }

    private void mcp(HealthMsgSleepChartView healthMsgSleepChartView, int i2) {
        if (healthMsgSleepChartView != null) {
            healthMsgSleepChartView.m17622n(i2);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m17592n() {
        if (this.bp == null) {
            this.bp = (HealthMsgSleepChartView) this.bs.inflate();
        }
    }

    private void n5r1(View view, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }

    private void n7h() {
        if (this.f28738u == null) {
            this.f28738u = (ImageView) this.bq.inflate();
        }
    }

    private void ncyb(View view, int i2, int i3, int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i2, i3, i4, i5);
        view.setLayoutParams(layoutParams);
    }

    private int ni7(TextView textView) {
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        Rect rect = new Rect();
        textView.getDrawingRect(rect);
        float f2 = rect.top + ((rect.bottom - r4) / 2.0f);
        float f3 = fontMetrics.bottom;
        return (int) ((f2 + ((f3 - fontMetrics.top) / 2.0f)) - f3);
    }

    private boolean oc() {
        return (Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage()) || Locale.ENGLISH.getLanguage().equals(Locale.getDefault().getLanguage())) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    private void m17593p() {
        if (this.f28727j == null) {
            this.f28727j = (TextView) this.as.inflate();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m17594q() {
        if (this.bb == null) {
            this.bb = (HealthMsgChartView) this.aj.inflate();
        }
    }

    private void qrj() {
        if (this.f28722e == null) {
            this.f28722e = (TextView) this.in.inflate();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m17595r() {
        hyr(this.f28723f, "");
        hyr(this.f28720c, "");
        hyr(this.f28727j, "");
    }

    /* JADX INFO: renamed from: s */
    private void m17596s() {
        if (this.f28741x == null) {
            this.f28741x = (ImageView) this.ax.inflate();
        }
    }

    private void setBigMsgText(String str) {
        if (this.f28723f == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || !str.contains(this.f28726i)) {
            this.f28723f.setText(str);
            return;
        }
        int iIndexOf = str.indexOf(this.f28726i);
        SpannableString spannableString = new SpannableString(str);
        int iM2542t = (C6062n.m22317h(this.f28728k) && this.f28733p.ki() && this.f28733p.cdj() && !AbstractC5074q.m17719h(this.f28733p.dd())) ? Color.parseColor("#FF999999") : C0541p.m2542t(this.f28733p.m17707r(), 153);
        spannableString.setSpan(new ForegroundColorSpan(iM2542t), iIndexOf, iIndexOf + 1, 17);
        this.f28723f.setText(spannableString);
    }

    private void setTextSameWidth(boolean z2) {
        MiuiTextGlassView miuiTextGlassView = this.f28729l;
        if (miuiTextGlassView != null) {
            miuiTextGlassView.setFontFeatureSettings(z2 ? "tnum" : "");
        }
        TextView textView = this.f28723f;
        if (textView != null) {
            textView.setFontFeatureSettings(z2 ? "tnum" : "");
        }
    }

    /* JADX INFO: renamed from: t */
    private void m17597t(HealthMsgChartView healthMsgChartView, int i2, int i3, int i4, List<Integer> list) {
        if (healthMsgChartView != null) {
            healthMsgChartView.m17618n(i2, i3, i4, list);
        }
    }

    private void t8r() {
        if (this.f28719b == null) {
            this.f28719b = (ImageView) this.bg.inflate();
        }
    }

    private void uv6(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    private void x2() {
        if (this.f28732o == null) {
            this.f28732o = (TextView) this.bl.inflate();
        }
    }

    private void x9kr(ImageView imageView, int i2) {
        if (imageView != null) {
            imageView.setImageResource(i2);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m17598y() {
        if (this.f28739v == null) {
            this.f28739v = (ImageView) this.ba.inflate();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m17599z(Context context) {
        this.f28728k = context;
        Resources resources = getResources();
        this.f28734q = resources;
        this.f28725h = resources.getString(C5049g.s.f71766se);
        this.f28726i = this.f28734q.getString(C5049g.s.f71730jbh);
        this.f28736s = C6062n.f7l8(this.f28728k).width();
    }

    private int zurt(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    private void zy() {
        if (this.f28723f == null) {
            this.f28723f = (TextView) this.an.inflate();
        }
    }

    protected void fti(boolean z2) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        HealthMsgTextView healthMsgTextView;
        HumidityIconView humidityIconView;
        HealthMsgChartView healthMsgChartView;
        HealthMsgSleepChartView healthMsgSleepChartView;
        SunMoveView sunMoveView;
        TextView textView5;
        int iX9kr = this.f28733p.x9kr();
        TextView textView6 = this.f28723f;
        if (textView6 != null) {
            C6061k.t8r(textView6, iX9kr, this.f28724g);
        }
        boolean z3 = false;
        if (this.f28742y != iX9kr || z2) {
            this.f28742y = iX9kr;
            z3 = true;
        }
        Typeface typefaceLd6 = f7l8.ld6(iX9kr);
        if ((!this.bc || z3) && (textView = this.f28720c) != null) {
            this.bc = true;
            textView.setTypeface(typefaceLd6);
        }
        if ((!this.bu || z3) && (textView2 = this.f28722e) != null) {
            this.bu = true;
            textView2.setTypeface(typefaceLd6);
        }
        if ((!this.bd || z3) && (textView3 = this.f28727j) != null) {
            this.bd = true;
            textView3.setTypeface(typefaceLd6);
        }
        if ((!this.tlhn || z3) && (textView4 = this.f28730m) != null) {
            this.tlhn = true;
            textView4.setTypeface(typefaceLd6);
        }
        if ((!this.w97r || z3) && (healthMsgTextView = this.f70913ab) != null) {
            this.w97r = true;
            healthMsgTextView.setTypeface(typefaceLd6);
        }
        if ((!this.tgs || z3) && (humidityIconView = this.f28721d) != null) {
            this.tgs = true;
            humidityIconView.setTypeface(typefaceLd6);
        }
        if ((!this.yl25 || z3) && (healthMsgChartView = this.bb) != null) {
            this.yl25 = true;
            healthMsgChartView.setTypeface(typefaceLd6);
        }
        if ((!this.zmmu || z3) && (healthMsgSleepChartView = this.bp) != null) {
            this.zmmu = true;
            healthMsgSleepChartView.setTypeface(typefaceLd6);
        }
        if ((!this.sk1t || z3) && (sunMoveView = this.f28740w) != null) {
            this.sk1t = true;
            sunMoveView.setTypeface(typefaceLd6);
        }
        if ((!this.dy || z3) && (textView5 = this.f28732o) != null) {
            this.dy = true;
            textView5.setTypeface(f7l8.x2(iX9kr));
        }
    }

    public void hb(boolean z2) {
        String string;
        if (this.f28724g == 0) {
            return;
        }
        boolean zEquals = Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage());
        if (toq.C5079n.toq(this.f28724g)) {
            hyr(this.f28729l, C6061k.m22310n(this.f28728k, this.f28731n, z2, this.f28724g, false));
            setContentDescription(C6061k.m22306g(this.f28728k, this.f28731n, z2, this.f28724g));
            return;
        }
        if (toq.zy.toq(this.f28724g)) {
            int iM17734k = oc() ? toq.zy.m17734k(this.f28724g) : this.f28724g;
            String strCdj = C6061k.cdj(this.f28728k, this.f28731n);
            boolean z3 = !TextUtils.isEmpty(strCdj);
            switch (iM17734k) {
                case 201:
                    setBigMsgText(zEquals ? this.f28734q.getString(C5049g.s.f29051h, Integer.valueOf(C6061k.qrj(this.f28731n)), Integer.valueOf(C6061k.f7l8(this.f28731n))) : this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71714fti)).toUpperCase());
                    string = getResources().getString(C5049g.s.f71731jk, this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)));
                    break;
                case 202:
                    hyr(this.f28720c, C6061k.m22314y(this.f28728k, this.f28731n));
                    setBigMsgText(C6064q.m22334k(this.f28734q.getString(C5049g.s.f71732jp0y)).toUpperCase());
                    string = getResources().getString(C5049g.s.f71703d3, this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)), this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71797zurt)));
                    break;
                case 203:
                    hyr(this.f28720c, C6061k.m22314y(this.f28728k, this.f28731n));
                    setBigMsgText(zEquals ? this.f28734q.getString(C5049g.s.f29051h, Integer.valueOf(C6061k.qrj(this.f28731n)), Integer.valueOf(C6061k.f7l8(this.f28731n))) : this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71714fti)).toUpperCase());
                    string = getResources().getString(C5049g.s.f71703d3, this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)), this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71797zurt)));
                    break;
                case 204:
                    setBigMsgText(this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f29061r)).toUpperCase());
                    Resources resources = this.f28734q;
                    string = resources.getString(C5049g.s.f71705dd, this.f28731n.format(this.f28728k, resources.getString(C5049g.s.f71797zurt)), String.valueOf(C6061k.f7l8(this.f28731n)));
                    break;
                case 205:
                    hyr(this.f28720c, C6061k.m22314y(this.f28728k, this.f28731n));
                    String strValueOf = String.valueOf(C6061k.f7l8(this.f28731n));
                    hyr(this.f28723f, strValueOf);
                    Resources resources2 = this.f28734q;
                    string = resources2.getString(C5049g.s.f71712fn3e, strValueOf, this.f28731n.format(this.f28728k, resources2.getString(C5049g.s.f71797zurt)));
                    break;
                case toq.zy.f72000f7l8 /* 206 */:
                    hyr(this.f28723f, C6061k.m22314y(this.f28728k, this.f28731n));
                    string = this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71738ld6));
                    break;
                case toq.zy.f29240y /* 207 */:
                    hyr(this.f28723f, zEquals ? this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71753ni7)) : this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71785x2)).toUpperCase());
                    string = this.f28731n.format(this.f28728k, this.f28734q.getString(C5049g.s.f71753ni7));
                    break;
                case toq.zy.f29239s /* 208 */:
                    int iF7l8 = C6061k.f7l8(this.f28731n);
                    if (zEquals) {
                        hyr(this.f28723f, this.f28734q.getString(C5049g.s.f71764qrj, C6061k.zy(iF7l8, false)));
                    } else {
                        hyr(this.f28720c, C6061k.m22313s(iF7l8));
                        hyr(this.f28723f, String.valueOf(iF7l8));
                    }
                    string = this.f28734q.getString(C5049g.s.f29052i, String.valueOf(iF7l8));
                    break;
                case toq.zy.f29237p /* 209 */:
                    String strLd6 = C6061k.ld6(this.f28728k, this.f28731n);
                    hyr(this.f28720c, strLd6);
                    m17593p();
                    if (z3) {
                        uv6(this.f28727j, 0);
                        hyr(this.f28727j, strCdj);
                    } else {
                        uv6(this.f28727j, 8);
                        hyr(this.f28727j, "");
                    }
                    setBigMsgText(C6064q.m22334k(this.f28734q.getString(C5049g.s.f71732jp0y)).toUpperCase());
                    Resources resources3 = this.f28734q;
                    string = resources3.getString(C5049g.s.f71688a9, this.f28731n.format(this.f28728k, resources3.getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)), strLd6, strCdj);
                    break;
                case toq.zy.f72001ld6 /* 210 */:
                    hyr(this.f28720c, C6061k.m22314y(this.f28728k, this.f28731n));
                    if (z3) {
                        hyr(this.f28727j, strCdj);
                        Resources resources4 = this.f28734q;
                        string = resources4.getString(C5049g.s.f71709eqxt, this.f28731n.format(this.f28728k, resources4.getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)), this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71797zurt)), strCdj);
                    } else {
                        String strLd62 = C6061k.ld6(this.f28728k, this.f28731n);
                        hyr(this.f28727j, strLd62);
                        Resources resources5 = this.f28734q;
                        string = resources5.getString(C5049g.s.f71758oc, this.f28731n.format(this.f28728k, resources5.getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)), this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71797zurt)), strLd62);
                    }
                    setBigMsgText(C6064q.m22334k(this.f28734q.getString(C5049g.s.f71732jp0y)).toUpperCase());
                    break;
                case toq.zy.f72004x2 /* 211 */:
                    String strLd63 = C6061k.ld6(this.f28728k, this.f28731n);
                    ld6();
                    if (!z3) {
                        uv6(this.f28720c, 8);
                        hyr(this.f28720c, "");
                        hyr(this.f28723f, strLd63);
                        string = this.f28734q.getString(C5049g.s.f71757o1t, strLd63);
                    } else {
                        uv6(this.f28720c, 0);
                        hyr(this.f28720c, strLd63);
                        hyr(this.f28723f, strCdj);
                        string = this.f28734q.getString(C5049g.s.f71743lvui, strCdj, strLd63);
                    }
                    break;
                case toq.zy.f72002qrj /* 212 */:
                    string = C6061k.m22307h(this.f28728k, this.f28731n);
                    hyr(this.f28723f, string);
                    break;
                default:
                    setBigMsgText(C6064q.m22334k(this.f28734q.getString(C5049g.s.f71732jp0y)));
                    string = getResources().getString(C5049g.s.f71731jk, this.f28731n.format(this.f28728k, getResources().getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28731n)));
                    break;
            }
            setContentDescription(string);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17600j(boolean z2, int i2) {
        MiuiTextGlassView miuiTextGlassView = this.f28729l;
        if (miuiTextGlassView != null) {
            miuiTextGlassView.setTimeLayoutDirection(i2);
        }
        TextView textView = this.f28723f;
        if (textView != null) {
            textView.setTextDirection(i2);
        }
        hb(z2);
    }

    protected void jp0y() {
        fu4();
        m17595r();
        int iM17734k = this.f28724g;
        if (toq.C5079n.toq(iM17734k)) {
            cdj();
            uv6(this.f28729l, 0);
        } else if (toq.zy.toq(this.f28724g)) {
            zy();
            uv6(this.f28723f, 0);
            if (oc()) {
                iM17734k = toq.zy.m17734k(this.f28724g);
            }
            switch (iM17734k) {
                case 202:
                case 203:
                case 205:
                    ld6();
                    uv6(this.f28720c, 0);
                    break;
                case toq.zy.f29239s /* 208 */:
                    if (!Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage())) {
                        ld6();
                        uv6(this.f28720c, 0);
                    }
                    break;
                case toq.zy.f29237p /* 209 */:
                    ld6();
                    uv6(this.f28720c, 0);
                    if (!TextUtils.isEmpty(C6061k.cdj(this.f28728k, this.f28731n))) {
                        m17593p();
                        uv6(this.f28727j, 0);
                    }
                    break;
                case toq.zy.f72001ld6 /* 210 */:
                    ld6();
                    uv6(this.f28720c, 0);
                    m17593p();
                    uv6(this.f28727j, 0);
                    break;
                case toq.zy.f72004x2 /* 211 */:
                    if (!TextUtils.isEmpty(C6061k.cdj(this.f28728k, this.f28731n))) {
                        ld6();
                        uv6(this.f28720c, 0);
                    }
                    break;
            }
        } else if (toq.f7l8.m17730k(this.f28724g)) {
            switch (this.f28724g) {
                case 401:
                    zy();
                    uv6(this.f28723f, 0);
                    ld6();
                    uv6(this.f28720c, 0);
                    hyr(this.f28720c, this.f28734q.getString(C5049g.s.f29050g));
                    break;
                case 402:
                    zy();
                    uv6(this.f28723f, 0);
                    qrj();
                    uv6(this.f28722e, 0);
                    hyr(this.f28722e, this.f28734q.getString(C5049g.s.f71773uj2j));
                    m17596s();
                    uv6(this.f28741x, 0);
                    break;
                case 403:
                case toq.f7l8.f29213n /* 404 */:
                    m17587h();
                    this.f28740w.setStyle(this.f28733p.x9kr());
                    uv6(this.f28740w, 0);
                    break;
                case toq.f7l8.f29211g /* 405 */:
                    zy();
                    uv6(this.f28723f, 0);
                    ld6();
                    uv6(this.f28720c, 0);
                    hyr(this.f28720c, this.f28734q.getString(C5049g.s.f71790yl));
                    m17593p();
                    uv6(this.f28727j, 0);
                    break;
                case toq.f7l8.f71987f7l8 /* 406 */:
                    n7h();
                    uv6(this.f28738u, 0);
                    kja0();
                    uv6(this.f28730m, 0);
                    break;
                case 407:
                    zy();
                    uv6(this.f28723f, 0);
                    ld6();
                    uv6(this.f28720c, 0);
                    m17588i();
                    uv6(this.f28718a, 0);
                    break;
                case 408:
                    f7l8();
                    uv6(this.f28721d, 0);
                    break;
                case toq.f7l8.f29214p /* 409 */:
                    zy();
                    uv6(this.f28723f, 0);
                    ld6();
                    uv6(this.f28720c, 0);
                    hyr(this.f28720c, this.f28734q.getString(C5049g.s.f29059p));
                    m17598y();
                    uv6(this.f28739v, 0);
                    break;
                default:
                    zy();
                    uv6(this.f28723f, 0);
                    x2();
                    uv6(this.f28732o, 0);
                    t8r();
                    uv6(this.f28719b, 0);
                    break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("initViewVisible updateWeather data null ? ");
            sb.append(this.f28735r == null);
            sb.append(", parent = ");
            sb.append(getParent());
            Log.i("ClassicContentAreaView", sb.toString());
            m17601o(this.f28735r);
        } else if (toq.C8026toq.m17733k(this.f28724g)) {
            switch (this.f28724g) {
                case 500:
                case 502:
                case 504:
                case 508:
                    zy();
                    uv6(this.f28723f, 0);
                    ki();
                    uv6(this.f70914bo, 0);
                    x9kr(this.f70914bo, HealthBean.getHealthIconByType(this.f28724g));
                    m17593p();
                    uv6(this.f28727j, 0);
                    break;
                case 501:
                case 503:
                case 505:
                    m17594q();
                    uv6(this.bb, 0);
                    break;
                case 506:
                    m17592n();
                    uv6(this.bp, 0);
                    break;
                case 507:
                    m17586g();
                    uv6(this.f70913ab, 0);
                    break;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("initViewVisible updateHealth data = null ? ");
            sb2.append(this.f28737t == null);
            sb2.append(", parent = ");
            sb2.append(getParent());
            Log.i("ClassicContentAreaView", sb2.toString());
            nn86(this.f28737t);
        }
        setTextSameWidth(com.miui.clock.module.toq.m17729k(iM17734k, this.f28743z));
    }

    public void lvui(HealthBean healthBean, WeatherBean weatherBean) {
        this.f28737t = healthBean;
        this.f28735r = weatherBean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void nn86(HealthBean healthBean) {
        String string;
        this.f28737t = healthBean;
        int i2 = this.f28724g;
        switch (i2) {
            case 500:
                if (!eqxt(i2)) {
                    hyr(this.f28723f, healthBean.getStepCountNowString());
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, healthBean.getStepCountTargetString()));
                    string = getResources().getString(C5049g.s.f71779vyq, getResources().getQuantityString(C5049g.y.f71839ld6, this.f28737t.getStepCountNow(), this.f28737t.getStepCountNowString()), getResources().getQuantityString(C5049g.y.f71843x2, this.f28737t.getStepCountTarget(), this.f28737t.getStepCountTargetString()));
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, this.f28725h));
                    string = null;
                }
                break;
            case 501:
                if (!eqxt(i2)) {
                    m17597t(this.bb, this.f28724g, healthBean.getStepCountNow(), healthBean.getStepCountTarget(), null);
                    string = getResources().getString(C5049g.s.f71779vyq, getResources().getQuantityString(C5049g.y.f71839ld6, this.f28737t.getStepCountNow(), this.f28737t.getStepCountNowString()), getResources().getQuantityString(C5049g.y.f71843x2, this.f28737t.getStepCountTarget(), this.f28737t.getStepCountTargetString()));
                } else {
                    m17597t(this.bb, this.f28724g, -1, -1, null);
                    string = null;
                }
                break;
            case 502:
                if (!eqxt(i2)) {
                    hyr(this.f28723f, healthBean.getCaloriesNowString());
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, healthBean.getCaloriesTargetString()));
                    string = getResources().getString(C5049g.s.f71786x9kr, getResources().getQuantityString(C5049g.y.f71842toq, this.f28737t.getCaloriesNow(), this.f28737t.getCaloriesNowString()), getResources().getQuantityString(C5049g.y.f71844zy, this.f28737t.getCaloriesTarget(), this.f28737t.getCaloriesTargetString()));
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, this.f28725h));
                    string = null;
                }
                break;
            case 503:
                if (!eqxt(i2)) {
                    m17597t(this.bb, this.f28724g, healthBean.getCaloriesNow(), healthBean.getCaloriesTarget(), null);
                    string = getResources().getString(C5049g.s.f71786x9kr, getResources().getQuantityString(C5049g.y.f71842toq, this.f28737t.getCaloriesNow(), this.f28737t.getCaloriesNowString()), getResources().getQuantityString(C5049g.y.f71844zy, this.f28737t.getCaloriesTarget(), this.f28737t.getCaloriesTargetString()));
                } else {
                    m17597t(this.bb, this.f28724g, -1, -1, null);
                    string = null;
                }
                break;
            case 504:
                if (!eqxt(i2)) {
                    hyr(this.f28723f, healthBean.getStandCountNowString());
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, healthBean.getStandCountTargetString()));
                    string = getResources().getString(C5049g.s.f71775uv6, getResources().getQuantityString(C5049g.y.f29093y, this.f28737t.getStandCountNow(), this.f28737t.getStandCountNowString()), getResources().getQuantityString(C5049g.y.f29092s, this.f28737t.getStandCountTarget(), this.f28737t.getStandCountTargetString()));
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, this.f28725h));
                    string = null;
                }
                break;
            case 505:
                if (!eqxt(i2)) {
                    m17597t(this.bb, this.f28724g, healthBean.getSportTimeNow(), healthBean.getSportTimeTarget(), null);
                    string = getResources().getString(C5049g.s.f71740lrht, getResources().getQuantityString(C5049g.y.f29089n, this.f28737t.getSportTimeNow(), this.f28737t.getSportTimeNowString()), getResources().getQuantityString(C5049g.y.f29087g, this.f28737t.getSportTimeTarget(), this.f28737t.getSportTimeTargetString()));
                } else {
                    m17597t(this.bb, this.f28724g, -1, -1, null);
                    string = null;
                }
                break;
            case 506:
                if (!eqxt(i2)) {
                    mcp(this.bp, healthBean.getSleepDurationMinute());
                    if (this.bp != null) {
                        string = getResources().getString(C5049g.s.f71723hb, this.bp.getSleepMinute(), this.bp.getSleepDesc());
                    }
                } else {
                    mcp(this.bp, -1);
                }
                string = null;
                break;
            case 507:
                if (!eqxt(i2)) {
                    jk(this.f70913ab, healthBean.getCaloriesNow(), healthBean.getCaloriesTarget(), healthBean.getStepCountNow(), healthBean.getStepCountTarget(), healthBean.getSportTimeNow(), healthBean.getSportTimeTarget());
                    String string2 = getResources().getString(C5049g.s.f71779vyq, getResources().getQuantityString(C5049g.y.f71839ld6, this.f28737t.getStepCountNow(), this.f28737t.getStepCountNowString()), getResources().getQuantityString(C5049g.y.f71843x2, this.f28737t.getStepCountTarget(), this.f28737t.getStepCountTargetString()));
                    string = getResources().getString(C5049g.s.f71786x9kr, getResources().getQuantityString(C5049g.y.f71842toq, this.f28737t.getCaloriesNow(), this.f28737t.getCaloriesNowString()), getResources().getQuantityString(C5049g.y.f71844zy, this.f28737t.getCaloriesTarget(), this.f28737t.getCaloriesTargetString())) + "," + string2 + "," + getResources().getString(C5049g.s.f71740lrht, getResources().getQuantityString(C5049g.y.f29089n, this.f28737t.getSportTimeNow(), this.f28737t.getSportTimeNowString()), getResources().getQuantityString(C5049g.y.f29087g, this.f28737t.getSportTimeTarget(), this.f28737t.getSportTimeTargetString()));
                } else {
                    jk(this.f70913ab, -1, -1, -1, -1, -1, -1);
                    string = null;
                }
                break;
            case 508:
                if (!eqxt(i2)) {
                    hyr(this.f28723f, healthBean.getSportTimeNowString());
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, healthBean.getSportTimeTargetString()));
                    string = getResources().getString(C5049g.s.f71740lrht, getResources().getQuantityString(C5049g.y.f29089n, this.f28737t.getSportTimeNow(), this.f28737t.getSportTimeNowString()), getResources().getQuantityString(C5049g.y.f29087g, this.f28737t.getSportTimeTarget(), this.f28737t.getSportTimeTargetString()));
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28727j, this.f28734q.getString(C5049g.s.f71735ki, this.f28725h));
                    string = null;
                }
                break;
            default:
                string = null;
                break;
        }
        if (string == null) {
            string = getResources().getString(C5049g.s.f71755nn86);
        }
        setContentDescription(string);
    }

    /* JADX INFO: renamed from: o */
    public void m17601o(WeatherBean weatherBean) {
        this.f28735r = weatherBean;
        this.f28731n.setTimeInMillis(System.currentTimeMillis());
        int i2 = (this.f28731n.get(18) * 60) + this.f28731n.get(20);
        String string = null;
        switch (this.f28724g) {
            case 401:
                if (m17591m() || !weatherBean.isAQIDateValid()) {
                    hyr(this.f28723f, this.f28725h);
                } else {
                    hyr(this.f28723f, weatherBean.getAQILevel());
                    string = getResources().getString(C5049g.s.f29062s, weatherBean.getAQILevel());
                }
                break;
            case 402:
                if (!m17591m()) {
                    hyr(this.f28723f, weatherBean.getRainProbability());
                    string = getResources().getString(C5049g.s.f71733jz5, NumberFormat.getPercentInstance().format(weatherBean.getRainProbabilityInt() / 100.0f));
                } else {
                    hyr(this.f28723f, this.f28725h);
                }
                break;
            case 403:
            case toq.f7l8.f29213n /* 404 */:
                if (!m17591m()) {
                    a9(this.f28740w, weatherBean.getSunriseMinuteTime(), weatherBean.getSunriseTomorrowMinuteTime(), weatherBean.getSunsetMinuteTime(), i2);
                    SunMoveView sunMoveView = this.f28740w;
                    if (sunMoveView != null) {
                        string = sunMoveView.getDesc();
                    }
                } else {
                    a9(this.f28740w, -1, -1, -1, -1);
                }
                break;
            case toq.f7l8.f29211g /* 405 */:
                if (!m17591m()) {
                    hyr(this.f28723f, weatherBean.getUVILevel());
                    hyr(this.f28727j, this.f28734q.getString(weatherBean.getUVILevelDescResID()));
                    string = getResources().getString(C5049g.s.f71784wx16, weatherBean.getUVILevel(), getResources().getString(weatherBean.getUVILevelDescResID()));
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28727j, "");
                }
                break;
            case toq.f7l8.f71987f7l8 /* 406 */:
                boolean z2 = weatherBean != null && weatherBean.getFeelTemperatureValid();
                if (!m17591m() && z2) {
                    x9kr(this.f28738u, weatherBean.getSomatosensoryResId(this.f28733p.x9kr()));
                    hyr(this.f28730m, weatherBean.getSomatosensoryTemperatureWithUnit());
                    string = getResources().getString(C5049g.s.f71737ktq, Integer.toString(weatherBean.getSomatosensoryTemperature()));
                    m17584e(this.f28738u, this.f28733p.m17707r());
                } else {
                    x9kr(this.f28738u, WeatherBean.getSomatosensoryEmptyResId(this.f28742y));
                    hyr(this.f28730m, getResources().getString(C5049g.s.f71794zkd));
                }
                break;
            case 407:
                if (!m17591m()) {
                    hyr(this.f28723f, weatherBean.getWindStrength());
                    hyr(this.f28720c, this.f28734q.getString(weatherBean.getWindDescResId()));
                    x9kr(this.f28718a, weatherBean.getWindIconResId());
                    string = getResources().getString(C5049g.s.f71721h4b, getResources().getString(weatherBean.getWindDescResIdFull()), weatherBean.getWindStrength());
                    m17584e(this.f28718a, this.f28733p.m17707r());
                } else {
                    hyr(this.f28723f, this.f28725h);
                    hyr(this.f28720c, "");
                    x9kr(this.f28718a, C5049g.n.f28976k);
                }
                break;
            case 408:
                if (!m17591m()) {
                    dd(this.f28721d, weatherBean.getHumidity());
                    string = getResources().getString(C5049g.s.f29053j, NumberFormat.getPercentInstance().format(weatherBean.getHumidity() / 100.0f));
                } else {
                    dd(this.f28721d, -1);
                }
                break;
            case toq.f7l8.f29214p /* 409 */:
                if (!m17591m()) {
                    hyr(this.f28723f, weatherBean.getPressureString());
                    x9kr(this.f28739v, weatherBean.getPressureIconResId());
                    m17584e(this.f28739v, this.f28733p.m17707r());
                    string = getResources().getQuantityString(C5049g.y.f29088k, weatherBean.getPressure(), weatherBean.getPressureString());
                } else {
                    hyr(this.f28723f, this.f28725h);
                    x9kr(this.f28739v, C5049g.n.f28976k);
                }
                break;
            default:
                boolean z3 = C6062n.m22317h(this.f28728k) && this.f28733p.ki() && this.f28733p.cdj() && !AbstractC5074q.m17719h(this.f28733p.dd());
                boolean z5 = weatherBean != null && weatherBean.getTemperatureValid();
                if (m17591m() || !z5) {
                    hyr(this.f28723f, getResources().getString(C5049g.s.f71695bwp));
                    x9kr(this.f28719b, C5049g.n.f28976k);
                    uv6(this.f28719b, 8);
                } else {
                    this.f28731n.setTimeInMillis(System.currentTimeMillis());
                    boolean z6 = i2 < weatherBean.getSunriseMinuteTime() || i2 > weatherBean.getSunsetMinuteTime();
                    hyr(this.f28723f, weatherBean.getTemperatureWithoutUnit());
                    x9kr(this.f28719b, weatherBean.getIconResId(z6, z3));
                    uv6(this.f28719b, 0);
                    string = getResources().getQuantityString(C5049g.y.f71840n7h, weatherBean.getTemperature(), weatherBean.getTemperatureWithoutUnit(), weatherBean.getDescription());
                }
                if (!z3) {
                    m17584e(this.f28719b, this.f28733p.m17707r());
                } else {
                    fn3e(this.f28719b);
                }
                break;
        }
        if (string == null) {
            string = getResources().getString(C5049g.s.f71729ixz);
        }
        setContentDescription(string);
    }

    public void o1t(int i2, int i3, int i4, boolean z2) {
        this.ar = true;
        ni7 ni7Var = new ni7();
        ni7Var.gvn7(i2);
        ni7Var.m17705f(i4);
        ni7Var.hyr(z2);
        wvg(ni7Var, i3, false);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int iWidth = C6062n.f7l8(this.f28728k).width();
        if (this.f28736s != iWidth) {
            this.f28736s = iWidth;
            d2ok();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.bv = (ViewStub) findViewById(C5049g.g.f71051ukdy);
        this.an = (ViewStub) findViewById(C5049g.g.f28953n);
        this.id = (ViewStub) findViewById(C5049g.g.f71003i9jn);
        this.in = (ViewStub) findViewById(C5049g.g.f71053v0af);
        this.bl = (ViewStub) findViewById(C5049g.g.f71042r8s8);
        this.as = (ViewStub) findViewById(C5049g.g.f71075zsr0);
        this.bg = (ViewStub) findViewById(C5049g.g.f71029ngy);
        this.az = (ViewStub) findViewById(C5049g.g.f70981dxef);
        this.ba = (ViewStub) findViewById(C5049g.g.f71039qkj8);
        this.ax = (ViewStub) findViewById(C5049g.g.f71040qo);
        this.bq = (ViewStub) findViewById(C5049g.g.f71072z4);
        this.ac = (ViewStub) findViewById(C5049g.g.f71011kcsr);
        this.ad = (ViewStub) findViewById(C5049g.g.f70984ek5k);
        this.am = (ViewStub) findViewById(C5049g.g.f71050uj2j);
        this.ay = (ViewStub) findViewById(C5049g.g.f71004ij);
        this.be = (ViewStub) findViewById(C5049g.g.f28944e);
        this.aj = (ViewStub) findViewById(C5049g.g.f28942c);
        this.bs = (ViewStub) findViewById(C5049g.g.f71052uv6);
    }

    public void setCalendar(C7230k c7230k) {
        this.f28731n = c7230k;
    }

    public void vyq(int i2) {
        int iM2542t;
        int iM2542t2;
        if (i2 == 0) {
            return;
        }
        boolean z2 = C6062n.m22317h(this.f28728k) && this.f28733p.ki() && this.f28733p.cdj() && !AbstractC5074q.m17719h(this.f28733p.dd());
        if (!z2 || AbstractC5074q.m17719h(this.f28733p.dd())) {
            iM2542t = C0541p.m2542t(i2, 153);
            iM2542t2 = C0541p.m2542t(i2, 77);
        } else {
            iM2542t = Color.parseColor("#FF999999");
            iM2542t2 = Color.parseColor("#4D4D4D");
        }
        m17585f(this.f28729l, i2);
        if (toq.f7l8.m17730k(this.f28724g)) {
            WeatherBean weatherBean = this.f28735r;
            int i3 = (weatherBean != null || this.ar) ? i2 : iM2542t;
            if (this.f28724g == 400) {
                m17585f(this.f28723f, (weatherBean != null || this.ar) ? i2 : iM2542t2);
            } else {
                m17585f(this.f28723f, i3);
            }
            m17584e(this.f28741x, i3);
            if (z2) {
                fn3e(this.f28719b);
            } else {
                m17584e(this.f28719b, i3);
            }
            m17584e(this.f28718a, i3);
            m17584e(this.f28738u, i3);
            m17584e(this.f28739v, i3);
        } else if (toq.C8026toq.m17733k(this.f28724g)) {
            int i4 = eqxt(this.f28724g) ? iM2542t : i2;
            m17584e(this.f70914bo, i4);
            m17585f(this.f28723f, i4);
            m17584e(this.f28718a, i2);
            m17584e(this.f28738u, i2);
            m17584e(this.f28739v, i2);
        } else {
            m17585f(this.f28723f, i2);
            m17584e(this.f28718a, i2);
            m17584e(this.f28738u, i2);
            m17584e(this.f28739v, i2);
        }
        m17585f(this.f28720c, iM2542t);
        m17585f(this.f28722e, iM2542t);
        TextView textView = this.f28732o;
        if (this.f28735r != null || this.ar) {
            iM2542t2 = iM2542t;
        }
        m17585f(textView, iM2542t2);
        m17585f(this.f28727j, iM2542t);
        m17585f(this.f28730m, iM2542t);
        HealthMsgTextView healthMsgTextView = this.f70913ab;
        if (healthMsgTextView != null) {
            healthMsgTextView.m17627g(i2, iM2542t);
        }
        HumidityIconView humidityIconView = this.f28721d;
        if (humidityIconView != null) {
            humidityIconView.m17632q(i2, iM2542t);
        }
        HealthMsgChartView healthMsgChartView = this.bb;
        if (healthMsgChartView != null) {
            healthMsgChartView.m17619q(i2, iM2542t);
        }
        HealthMsgSleepChartView healthMsgSleepChartView = this.bp;
        if (healthMsgSleepChartView != null) {
            healthMsgSleepChartView.m17623q(i2, iM2542t);
        }
        SunMoveView sunMoveView = this.f28740w;
        if (sunMoveView != null) {
            sunMoveView.m17638g(i2, iM2542t);
        }
    }

    public void wvg(ni7 ni7Var, int i2, boolean z2) {
        boolean z3;
        MiuiTextGlassView miuiTextGlassView;
        this.f28743z = z2;
        this.f28733p = ni7Var;
        if (this.f28724g != i2) {
            this.f28724g = i2;
            jp0y();
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = this.f28742y == this.f28733p.x9kr() ? z3 : true;
        if (!toq.C5079n.toq(i2) || (miuiTextGlassView = this.f28729l) == null) {
            fti(false);
        } else {
            C6061k.fn3e(miuiTextGlassView, this.f28733p.m17707r(), this.f28733p.x9kr(), i2, this.f28733p.ncyb(), false);
        }
        if (z5 || this.k0) {
            this.k0 = false;
            d2ok();
        }
        vyq(ni7Var.m17707r());
    }

    public ClassicContentAreaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k0 = true;
        this.ar = false;
        this.bc = false;
        this.bu = false;
        this.bd = false;
        this.tlhn = false;
        this.w97r = false;
        this.tgs = false;
        this.yl25 = false;
        this.zmmu = false;
        this.sk1t = false;
        this.dy = false;
        m17599z(context);
    }

    public ClassicContentAreaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k0 = true;
        this.ar = false;
        this.bc = false;
        this.bu = false;
        this.bd = false;
        this.tlhn = false;
        this.w97r = false;
        this.tgs = false;
        this.yl25 = false;
        this.zmmu = false;
        this.sk1t = false;
        this.dy = false;
        m17599z(context);
    }
}
