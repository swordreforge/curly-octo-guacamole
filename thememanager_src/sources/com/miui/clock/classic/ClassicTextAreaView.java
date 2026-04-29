package com.miui.clock.classic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import androidx.core.content.C0498q;
import androidx.core.graphics.C0541p;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.HealthBean;
import com.miui.clock.module.WeatherBean;
import com.miui.clock.module.fu4;
import com.miui.clock.module.ni7;
import com.miui.clock.module.toq;
import gcp.C6061k;
import gcp.C6062n;
import gcp.f7l8;
import java.text.NumberFormat;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class ClassicTextAreaView extends TextView {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f70915bo = "ClassicTextAreaView";

    /* JADX INFO: renamed from: d */
    private static final String f28753d = "constant_carrier_status";

    /* JADX INFO: renamed from: v */
    private static final String f28754v = "constant_carrier_info";

    /* JADX INFO: renamed from: a */
    private int f28755a;

    /* JADX INFO: renamed from: b */
    private int f28756b;

    /* JADX INFO: renamed from: c */
    private ContentObserver f28757c;

    /* JADX INFO: renamed from: e */
    private ContentObserver f28758e;

    /* JADX INFO: renamed from: f */
    private int f28759f;

    /* JADX INFO: renamed from: g */
    private boolean f28760g;

    /* JADX INFO: renamed from: h */
    private String f28761h;

    /* JADX INFO: renamed from: i */
    private String f28762i;

    /* JADX INFO: renamed from: j */
    private boolean f28763j;

    /* JADX INFO: renamed from: k */
    private Context f28764k;

    /* JADX INFO: renamed from: l */
    private String f28765l;

    /* JADX INFO: renamed from: m */
    private int f28766m;

    /* JADX INFO: renamed from: n */
    private C7230k f28767n;

    /* JADX INFO: renamed from: o */
    private Paint f28768o;

    /* JADX INFO: renamed from: p */
    private String f28769p;

    /* JADX INFO: renamed from: q */
    private fu4 f28770q;

    /* JADX INFO: renamed from: r */
    private boolean f28771r;

    /* JADX INFO: renamed from: s */
    private float f28772s;

    /* JADX INFO: renamed from: t */
    private WeatherBean f28773t;

    /* JADX INFO: renamed from: u */
    private boolean f28774u;

    /* JADX INFO: renamed from: x */
    private int f28775x;

    /* JADX INFO: renamed from: y */
    private Drawable f28776y;

    /* JADX INFO: renamed from: z */
    private HealthBean f28777z;

    /* JADX INFO: renamed from: com.miui.clock.classic.ClassicTextAreaView$k */
    class C5046k extends ContentObserver {
        C5046k(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            ClassicTextAreaView.this.ni7();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            ClassicTextAreaView.this.post(new Runnable() { // from class: com.miui.clock.classic.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28922k.toq();
                }
            });
        }
    }

    class toq extends ContentObserver {
        toq(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            ClassicTextAreaView.this.zurt();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            ClassicTextAreaView.this.post(new Runnable() { // from class: com.miui.clock.classic.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28915k.toq();
                }
            });
        }
    }

    public ClassicTextAreaView(Context context) {
        super(context);
        this.f28774u = false;
        m17608p(context);
    }

    private boolean f7l8() {
        HealthBean healthBean = this.f28777z;
        return healthBean != null && healthBean.hasSportTimeData();
    }

    /* JADX INFO: renamed from: g */
    private boolean m17604g() {
        HealthBean healthBean = this.f28777z;
        return healthBean != null && healthBean.hasCaloriesData();
    }

    /* JADX INFO: renamed from: i */
    private void m17605i() {
        if (!this.f28771r) {
            Log.i(f70915bo, "unRegisterServiceProviderListener un register, this = " + this);
            return;
        }
        Log.i(f70915bo, "unRegisterServiceProviderListener this = " + this);
        this.f28771r = false;
        this.f28764k.getContentResolver().unregisterContentObserver(this.f28757c);
        this.f28764k.getContentResolver().unregisterContentObserver(this.f28758e);
        this.f28757c = null;
        this.f28758e = null;
    }

    private void ki() {
        if (this.f28771r) {
            Log.i(f70915bo, "registerServiceProviderListener has register, this = " + this);
            return;
        }
        Log.i(f70915bo, "registerServiceProviderListener this = " + this);
        if (this.f28757c == null) {
            this.f28757c = new C5046k(null);
        }
        if (this.f28758e == null) {
            this.f28758e = new toq(null);
        }
        this.f28771r = true;
        this.f28764k.getContentResolver().registerContentObserver(Settings.Global.getUriFor(f28754v), false, this.f28757c);
        this.f28764k.getContentResolver().registerContentObserver(Settings.Global.getUriFor(f28753d), false, this.f28758e);
        ni7();
        zurt();
    }

    /* JADX INFO: renamed from: n */
    private SpannableString m17607n(int i2, int i3, String str, String str2) {
        String quantityString = getResources().getQuantityString(i2, i3, str, str2);
        int iIndexOf = quantityString.indexOf(this.f28769p);
        int length = quantityString.length();
        SpannableString spannableString = new SpannableString(quantityString);
        spannableString.setSpan(new ForegroundColorSpan((C6062n.m22317h(this.f28764k) && this.f28770q.cdj()) ? this.f28770q.qrj() : C0541p.m2542t(this.f28770q.qrj(), 153)), iIndexOf, length, 17);
        return spannableString;
    }

    private void n7h() {
        setTextSize(0, m17612q(C5049g.q.f71549hyr));
        this.f28772s = m17612q(C5049g.q.f71592mu);
        this.f28766m = zy(C5049g.q.ivs);
        this.f28756b = zy(C5049g.q.e9);
        this.f28755a = zy(C5049g.q.h4g);
        this.f28775x = zy(C5049g.q.ngvg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7() {
        this.f28765l = Settings.Global.getString(this.f28764k.getContentResolver(), f28754v);
        fu4 fu4Var = this.f28770q;
        if (fu4Var != null && fu4Var.d2ok() == 11) {
            setText(this.f28765l);
        }
        Log.i(f70915bo, "updateServiceProviderName = " + this.f28765l);
    }

    private boolean o1t() {
        return this.f28773t == null;
    }

    /* JADX INFO: renamed from: p */
    private void m17608p(Context context) {
        this.f28764k = context;
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextDirection(5);
        setTypeface(f7l8.m22300n(380));
        setFontFeatureSettings("ss01");
        Paint paint = new Paint();
        this.f28768o = paint;
        paint.setColor(C0541p.m2542t(getPaint().getColor(), 153));
        this.f28768o.setStyle(Paint.Style.FILL);
        this.f28769p = getResources().getString(C5049g.s.f71730jbh);
        this.f28761h = getResources().getString(C5049g.s.f71766se);
        this.f28762i = getResources().getString(C5049g.s.f71718gc3c);
        n7h();
    }

    private void qrj() {
        if (this.f28760g) {
            int iZy = zy(C5049g.q.f71602nn86);
            setPadding(iZy, 0, iZy, 0);
        } else if (!this.f28763j) {
            setPadding(0, 0, 0, 0);
        } else if (C6062n.n7h()) {
            setPadding(this.f28766m, 0, 0, 0);
        } else {
            setPadding(0, 0, this.f28766m, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m17609s() {
        HealthBean healthBean = this.f28777z;
        return healthBean != null && healthBean.hasStepCountData();
    }

    private void t8r() {
        fu4 fu4Var = this.f28770q;
        if (fu4Var == null) {
            return;
        }
        int iQrj = fu4Var.qrj();
        if (this.f28759f == 1 || this.f28774u) {
            setTextColor(iQrj);
        } else {
            setTextColor((C6062n.m22317h(this.f28764k) && this.f28770q.cdj()) ? AbstractC5074q.m17719h(this.f28770q.dd()) ? C0541p.m2542t(this.f28770q.qrj(), 77) : Color.parseColor("#4D4D4D") : C0541p.m2542t(iQrj, 77));
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m17610y() {
        HealthBean healthBean = this.f28777z;
        return healthBean != null && healthBean.hasStandCountData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zurt() {
        this.f28759f = Settings.Global.getInt(this.f28764k.getContentResolver(), f28753d, 0);
        fu4 fu4Var = this.f28770q;
        if (fu4Var != null && fu4Var.d2ok() == 11) {
            t8r();
        }
        Log.i(f70915bo, "updateServiceProviderStatus = " + this.f28759f);
    }

    public void cdj(HealthBean healthBean, WeatherBean weatherBean) {
        this.f28777z = healthBean;
        this.f28773t = weatherBean;
    }

    public void fn3e(HealthBean healthBean) {
        String string;
        String stepCountTargetString;
        SpannableString spannableStringM17607n;
        String caloriesTargetString;
        String standCountTargetString;
        String sportTimeTargetString;
        this.f28777z = healthBean;
        String str = this.f28761h;
        int iD2ok = this.f28770q.d2ok();
        int i2 = 0;
        if (iD2ok == 500) {
            if (m17609s()) {
                int stepCountNow = this.f28777z.getStepCountNow();
                int stepCountTarget = this.f28777z.getStepCountTarget();
                String stepCountNowString = this.f28777z.getStepCountNowString();
                stepCountTargetString = this.f28777z.getStepCountTargetString();
                string = getResources().getString(C5049g.s.f71779vyq, getResources().getQuantityString(C5049g.y.f71839ld6, stepCountNow, stepCountNowString), getResources().getQuantityString(C5049g.y.f71843x2, stepCountTarget, stepCountTargetString));
                i2 = stepCountNow;
                str = stepCountNowString;
            } else {
                string = null;
                stepCountTargetString = str;
            }
            spannableStringM17607n = m17607n(C5049g.y.f71841qrj, i2, str, stepCountTargetString);
        } else if (iD2ok == 502) {
            if (m17604g()) {
                int caloriesNow = this.f28777z.getCaloriesNow();
                int caloriesTarget = this.f28777z.getCaloriesTarget();
                String caloriesNowString = this.f28777z.getCaloriesNowString();
                caloriesTargetString = this.f28777z.getCaloriesTargetString();
                string = getResources().getString(C5049g.s.f71786x9kr, getResources().getQuantityString(C5049g.y.f71842toq, caloriesNow, caloriesNowString), getResources().getQuantityString(C5049g.y.f71844zy, caloriesTarget, caloriesTargetString));
                i2 = caloriesNow;
                str = caloriesNowString;
            } else {
                string = null;
                caloriesTargetString = str;
            }
            spannableStringM17607n = m17607n(C5049g.y.f29091q, i2, str, caloriesTargetString);
        } else if (iD2ok != 504) {
            if (f7l8()) {
                int sportTimeNow = this.f28777z.getSportTimeNow();
                int sportTimeTarget = this.f28777z.getSportTimeTarget();
                String sportTimeNowString = this.f28777z.getSportTimeNowString();
                sportTimeTargetString = this.f28777z.getSportTimeTargetString();
                string = getResources().getString(C5049g.s.f71740lrht, getResources().getQuantityString(C5049g.y.f29089n, sportTimeNow, sportTimeNowString), getResources().getQuantityString(C5049g.y.f29087g, sportTimeTarget, sportTimeTargetString));
                i2 = sportTimeNow;
                str = sportTimeNowString;
            } else {
                string = null;
                sportTimeTargetString = str;
            }
            spannableStringM17607n = m17607n(C5049g.y.f71838f7l8, i2, str, sportTimeTargetString);
        } else {
            if (m17610y()) {
                int standCountNow = this.f28777z.getStandCountNow();
                int standCountTarget = this.f28777z.getStandCountTarget();
                String standCountNowString = this.f28777z.getStandCountNowString();
                standCountTargetString = this.f28777z.getStandCountTargetString();
                string = getResources().getString(C5049g.s.f71775uv6, getResources().getQuantityString(C5049g.y.f29093y, standCountNow, standCountNowString), getResources().getQuantityString(C5049g.y.f29092s, standCountTarget, standCountTargetString));
                i2 = standCountNow;
                str = standCountNowString;
            } else {
                string = null;
                standCountTargetString = str;
            }
            spannableStringM17607n = m17607n(C5049g.y.f29090p, i2, str, standCountTargetString);
        }
        setText(spannableStringM17607n);
        if (string == null) {
            string = getResources().getString(C5049g.s.f71755nn86);
        }
        setContentDescription(string);
    }

    public void fu4() {
        String string;
        String str;
        this.f28767n.setTimeInMillis(System.currentTimeMillis());
        if (this.f28770q.d2ok() == 11) {
            this.f28760g = false;
            this.f28763j = false;
            t8r();
        } else {
            setTextColor(this.f28770q.qrj());
        }
        int iD2ok = this.f28770q.d2ok();
        if (iD2ok == 11) {
            setText(this.f28765l);
            setContentDescription(this.f28765l);
            return;
        }
        if (iD2ok == 100) {
            setText(this.f28767n.format(this.f28764k, getResources().getString(C5049g.s.f71719gvn7)));
            setContentDescription(getResources().getString(C5049g.s.f71703d3, this.f28767n.format(this.f28764k, getResources().getString(C5049g.s.f71753ni7)), String.valueOf(C6061k.f7l8(this.f28767n)), this.f28767n.format(this.f28764k, getResources().getString(C5049g.s.f71797zurt))));
            return;
        }
        if (iD2ok != 101) {
            return;
        }
        String strCdj = C6061k.cdj(this.f28764k, this.f28767n);
        String strLd6 = C6061k.ld6(this.f28764k, this.f28767n);
        if (TextUtils.isEmpty(strCdj)) {
            String strM22307h = C6061k.m22307h(this.f28764k, this.f28767n);
            string = getResources().getString(C5049g.s.f71783wvg, strM22307h, strLd6);
            str = strM22307h + "," + strLd6;
        } else {
            string = getResources().getString(C5049g.s.f71783wvg, strLd6, strCdj);
            str = strLd6 + "," + strCdj;
        }
        setText(string);
        setContentDescription(str);
    }

    public int getViewHeight() {
        if (this.f28770q == null) {
            return getLineHeight();
        }
        return ((float) C6062n.f7l8(getContext()).width()) < (((float) (getPaddingStart() + getPaddingEnd())) + getPaint().measureText(getText().toString())) + (m17612q(C5049g.q.f71515dd) * 2.0f) ? getLineHeight() * 2 : getLineHeight();
    }

    /* JADX INFO: renamed from: h */
    public void m17611h() {
        n7h();
        qrj();
    }

    public void kja0() {
        Log.d(f70915bo, "onLanguageChanged");
        setTypeface(f7l8.m22300n(380));
    }

    public void ld6(int i2, int i3) {
        this.f28774u = true;
        ni7 ni7Var = new ni7();
        ni7Var.gvn7(i2);
        ni7Var.m17706l(i3);
        x2(ni7Var);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ki();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m17605i();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        if (this.f28760g && this.f28776y != null) {
            float measuredHeight = (getMeasuredHeight() - this.f28772s) / 2.0f;
            float f2 = C6062n.n7h() ? measuredWidth - this.f28772s : 0.0f;
            canvas.save();
            canvas.translate(f2, measuredHeight);
            float intrinsicWidth = this.f28772s / this.f28776y.getIntrinsicWidth();
            canvas.scale(intrinsicWidth, intrinsicWidth);
            this.f28776y.draw(canvas);
            canvas.restore();
        }
        if (this.f28763j) {
            float height = ((getHeight() - this.f28756b) + (this.f28755a * 2)) / 2.0f;
            float fMeasureText = getPaint().measureText(getText().toString());
            float paddingStart = C6062n.n7h() ? ((measuredWidth - getPaddingStart()) - fMeasureText) - this.f28766m : getPaddingStart() + fMeasureText;
            int i2 = this.f28755a;
            int i3 = this.f28775x;
            canvas.drawRoundRect(paddingStart + i2, height, (paddingStart + this.f28766m) - i2, (this.f28756b + height) - (i2 * 2), i3, i3, this.f28768o);
        }
    }

    /* JADX INFO: renamed from: q */
    protected float m17612q(int i2) {
        return getResources().getDimension(i2) * C6062n.m22318k(getContext());
    }

    public void setCalendar(C7230k c7230k) {
        this.f28767n = c7230k;
    }

    public void x2(fu4 fu4Var) {
        this.f28770q = fu4Var;
        int iD2ok = fu4Var.d2ok();
        boolean zM17733k = toq.C8026toq.m17733k(iD2ok);
        boolean zM17730k = toq.f7l8.m17730k(iD2ok);
        this.f28760g = zM17733k;
        if (zM17733k) {
            int iZy = zy(C5049g.q.f71602nn86);
            setPadding(iZy, 0, iZy, 0);
            Drawable drawableM2259s = C0498q.m2259s(this.f28764k, HealthBean.getHealthIconByType(iD2ok));
            this.f28776y = drawableM2259s;
            if (drawableM2259s != null) {
                drawableM2259s.setBounds(0, 0, drawableM2259s.getIntrinsicWidth(), this.f28776y.getIntrinsicHeight());
            }
        } else {
            this.f28776y = null;
        }
        int iQrj = fu4Var.qrj();
        if (iQrj != 0) {
            if (iD2ok == 11) {
                t8r();
            } else {
                setTextColor(iQrj);
            }
            if (C6062n.m22317h(this.f28764k) && this.f28770q.cdj() && !AbstractC5074q.m17719h(this.f28770q.dd())) {
                this.f28768o.setColor(Color.parseColor("#FF999999"));
            } else {
                this.f28768o.setColor(C0541p.m2542t(iQrj, 153));
            }
            Drawable drawable = this.f28776y;
            if (drawable != null) {
                drawable.setTint(iQrj);
            }
        }
        if (zM17730k) {
            m17613z(this.f28773t);
        } else {
            this.f28763j = false;
        }
        if (zM17733k) {
            fn3e(this.f28777z);
        }
        if (zM17730k || zM17733k) {
            return;
        }
        setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: z */
    public void m17613z(WeatherBean weatherBean) {
        this.f28773t = weatherBean;
        this.f28763j = false;
        String str = "";
        if (!o1t()) {
            switch (this.f28770q.d2ok()) {
                case 400:
                    if (!weatherBean.getTemperatureValid()) {
                        setText(getResources().getString(C5049g.s.f71696bz2, this.f28761h, ""));
                        this.f28763j = true;
                        setContentDescription(getResources().getString(C5049g.s.f71729ixz));
                    } else {
                        String string = getResources().getString(C5049g.s.f71696bz2, weatherBean.getTemperatureWithoutUnit(), weatherBean.getDescription());
                        setText(string);
                        setContentDescription(string);
                    }
                    break;
                case 401:
                    if (!weatherBean.isAQIDateValid()) {
                        setText(getResources().getString(C5049g.s.f29067y, this.f28761h));
                        setContentDescription(getResources().getString(C5049g.s.f71729ixz));
                    } else {
                        setText(getResources().getString(C5049g.s.f29067y, weatherBean.getAQILevel()));
                        setContentDescription(getResources().getString(C5049g.s.f29062s, weatherBean.getAQILevel()));
                    }
                    break;
                case 402:
                default:
                    setText("");
                    setContentDescription("");
                    break;
                case 403:
                case toq.f7l8.f29213n /* 404 */:
                    int i2 = (this.f28767n.get(18) * 60) + this.f28767n.get(20);
                    if (weatherBean.getSunriseMinuteTime() == 0 && weatherBean.getSunsetMinuteTime() == 0 && weatherBean.getSunriseTomorrowMinuteTime() == 0) {
                        Resources resources = getResources();
                        int i3 = C5049g.s.f71690b3e;
                        Resources resources2 = getResources();
                        int i4 = C5049g.s.f71715fu4;
                        String str2 = this.f28761h;
                        setText(resources.getString(i3, resources2.getString(i4, str2, str2)));
                        setContentDescription(getResources().getString(C5049g.s.f71729ixz));
                    } else if (i2 < weatherBean.getSunriseMinuteTime()) {
                        setText(getResources().getString(C5049g.s.f71690b3e, weatherBean.getSunriseTimeString()));
                        setContentDescription(getResources().getString(C5049g.s.f71692bek6, weatherBean.getSunriseTimeString()));
                    } else if (i2 >= weatherBean.getSunsetMinuteTime()) {
                        setText(getResources().getString(C5049g.s.f71690b3e, weatherBean.getSunriseTomorrowTimeString()));
                        setContentDescription(getResources().getString(C5049g.s.f71701cv06, weatherBean.getSunriseTomorrowTimeString()));
                    } else {
                        setText(getResources().getString(C5049g.s.f71722h7am, weatherBean.getSunsetTimeString()));
                        setContentDescription(getResources().getString(C5049g.s.f71777vep5, weatherBean.getSunsetTimeString()));
                    }
                    break;
                case toq.f7l8.f29211g /* 405 */:
                    setText(getResources().getString(C5049g.s.f71772uc, weatherBean.getUVILevel(), getResources().getString(weatherBean.getUVILevelDescResID())));
                    setContentDescription(getResources().getString(C5049g.s.f71784wx16, weatherBean.getUVILevel(), getResources().getString(weatherBean.getUVILevelDescResID())));
                    break;
                case toq.f7l8.f71987f7l8 /* 406 */:
                    String string2 = getResources().getString(C5049g.s.f71737ktq, Integer.toString(weatherBean.getSomatosensoryTemperature()));
                    setText(string2);
                    setContentDescription(string2);
                    break;
                case 407:
                    String string3 = getResources().getString(C5049g.s.f71721h4b, getResources().getString(weatherBean.getWindDescResIdFull()), weatherBean.getWindStrength());
                    setText(string3);
                    setContentDescription(string3);
                    break;
                case 408:
                    String string4 = getResources().getString(C5049g.s.f29053j, NumberFormat.getPercentInstance().format(weatherBean.getHumidity() / 100.0f));
                    setText(string4);
                    setContentDescription(string4);
                    break;
            }
        } else {
            String string5 = getResources().getString(C5049g.s.f71729ixz);
            switch (this.f28770q.d2ok()) {
                case 400:
                    setText(getResources().getString(C5049g.s.f71696bz2, this.f28761h, ""));
                    this.f28763j = true;
                    str = string5;
                    break;
                case 401:
                    setText(getResources().getString(C5049g.s.f29067y, this.f28761h));
                    str = string5;
                    break;
                case 402:
                default:
                    setText("");
                    break;
                case 403:
                case toq.f7l8.f29213n /* 404 */:
                    Resources resources3 = getResources();
                    int i5 = C5049g.s.f71690b3e;
                    Resources resources4 = getResources();
                    int i6 = C5049g.s.f71715fu4;
                    String str3 = this.f28761h;
                    setText(resources3.getString(i5, resources4.getString(i6, str3, str3)));
                    str = string5;
                    break;
                case toq.f7l8.f29211g /* 405 */:
                    setText(getResources().getString(C5049g.s.f71772uc, this.f28761h, ""));
                    this.f28763j = true;
                    str = string5;
                    break;
                case toq.f7l8.f71987f7l8 /* 406 */:
                    setText(getResources().getString(C5049g.s.f71737ktq, this.f28761h));
                    str = string5;
                    break;
                case 407:
                    setText("");
                    this.f28763j = true;
                    str = string5;
                    break;
                case 408:
                    setText(getResources().getString(C5049g.s.f29053j, this.f28762i));
                    str = string5;
                    break;
            }
            setContentDescription(str);
        }
        if (!this.f28763j) {
            setPadding(0, 0, 0, 0);
        } else if (C6062n.n7h()) {
            setPadding(this.f28766m, 0, 0, 0);
        } else {
            setPadding(0, 0, this.f28766m, 0);
        }
    }

    protected int zy(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    public ClassicTextAreaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28774u = false;
        m17608p(context);
    }

    public ClassicTextAreaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28774u = false;
        m17608p(context);
    }
}
