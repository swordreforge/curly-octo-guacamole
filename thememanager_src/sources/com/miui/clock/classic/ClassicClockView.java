package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.UserHandle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.C0541p;
import com.google.gson.C4871g;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.HealthBean;
import com.miui.clock.module.WeatherBean;
import com.miui.clock.module.fu4;
import com.miui.clock.module.ni7;
import com.miui.clock.module.toq;
import gcp.C6061k;
import gcp.C6062n;
import gcp.C6064q;
import gcp.C6065s;
import gcp.f7l8;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicClockView extends ClassicClockBaseView {
    private static final String zr5t = "ClassicClockView";
    private MiuiTextGlassView bc;
    private ClassicContentAreaView bd;
    private ClassicContentAreaView bu;
    private Constructor<UserHandle> cw14;
    private boolean d1cy;
    private C4871g dy;
    private Method hp;
    private boolean k6e;
    private final HashSet<Integer> mjvl;
    private boolean ndjo;
    private toq q7k9;
    private boolean s8y;
    private WeatherBean sk1t;
    private Group tgs;
    private zy th6;
    private TextView tlhn;
    private boolean vb6;
    private Group w97r;
    private int xk5;
    private TextPaint xqx;
    private int xy8;
    private ni7 yl25;
    private HealthBean zmmu;

    /* JADX INFO: renamed from: com.miui.clock.classic.ClassicClockView$k */
    static /* synthetic */ class C5043k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28715k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f28715k = iArr;
            try {
                iArr[EnumC5072n.TEXT_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28715k[EnumC5072n.TIME_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28715k[EnumC5072n.CONTENT_AREA1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28715k[EnumC5072n.CONTENT_AREA2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28715k[EnumC5072n.SIGNATURE_AREA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class toq extends AsyncTask<Void, Void, HealthBean> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<ClassicClockView> f28716k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final WeakReference<Context> f70909toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f70910zy;

        public toq(Context context, ClassicClockView classicClockView, HashSet<Integer> hashSet) {
            this.f28716k = new WeakReference<>(classicClockView);
            this.f70909toq = new WeakReference<>(context);
            this.f70910zy = new int[hashSet.size()];
            Iterator<Integer> it = hashSet.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                this.f70910zy[i2] = it.next().intValue();
                i2++;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public HealthBean doInBackground(Void... voidArr) {
            HealthBean qVar = null;
            for (int i2 : this.f70910zy) {
                qVar = gcp.zy.toq(this.f70909toq, i2, qVar);
            }
            return qVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HealthBean healthBean) {
            ClassicClockView classicClockView;
            super.onPostExecute(healthBean);
            WeakReference<ClassicClockView> weakReference = this.f28716k;
            if (weakReference == null || (classicClockView = weakReference.get()) == null) {
                return;
            }
            classicClockView.mu(healthBean);
        }
    }

    public static class zy extends AsyncTask<Void, Void, WeatherBean> {

        /* JADX INFO: renamed from: k */
        private WeakReference<ClassicClockView> f28717k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final WeakReference<Context> f70911toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f70912zy;

        public zy(Context context, ClassicClockView classicClockView, boolean z2) {
            this.f28717k = new WeakReference<>(classicClockView);
            this.f70911toq = new WeakReference<>(context);
            this.f70912zy = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public WeatherBean doInBackground(Void... voidArr) {
            return gcp.zy.m22353y(this.f70911toq, this.f70912zy ? "2" : "1");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(WeatherBean weatherBean) {
            ClassicClockView classicClockView;
            super.onPostExecute(weatherBean);
            WeakReference<ClassicClockView> weakReference = this.f28717k;
            if (weakReference == null || (classicClockView = weakReference.get()) == null) {
                return;
            }
            classicClockView.qkj8(weatherBean);
        }
    }

    public ClassicClockView(Context context) {
        super(context);
        this.s8y = true;
        this.mjvl = new HashSet<>();
        this.xqx = new TextPaint();
    }

    private boolean bo() {
        return gyi(this.yl25.lvui()) || gyi(this.yl25.m17714c()) || gyi(this.yl25.lrht());
    }

    private boolean c8jq() {
        ni7 ni7Var = this.yl25;
        return ni7Var != null && AbstractC5074q.m17719h(ni7Var.dd());
    }

    private void ch(ni7 ni7Var) {
        if (ni7Var.vyq() == null) {
            return;
        }
        boolean zM17733k = toq.C8026toq.m17733k(ni7Var.vyq().getClassicLine1());
        boolean zM17730k = toq.f7l8.m17730k(ni7Var.vyq().getClassicLine1());
        boolean zM22350p = gcp.zy.m22350p(this.bl);
        boolean zX2 = gcp.zy.x2(this.bl);
        int iF7l8 = C6064q.f7l8();
        if (zM17733k && !zM22350p) {
            ni7Var.m17706l(ClockBean.getClassicDefaultLine1(this.bl, iF7l8));
        } else if (!zM17730k || zX2) {
            ni7Var.m17706l(ni7Var.vyq().getClassicLine1());
        } else {
            ni7Var.m17706l(ClockBean.getClassicDefaultLine1(this.bl, iF7l8));
        }
        boolean zM17733k2 = toq.C8026toq.m17733k(ni7Var.vyq().getClassicLine3());
        boolean zM17730k2 = toq.f7l8.m17730k(ni7Var.vyq().getClassicLine3());
        if (zM17733k2 && !zM22350p) {
            ni7Var.m17718o(0);
        } else if (zM17730k2 && !zX2) {
            ni7Var.m17718o(0);
        } else if (ni7Var.m17714c() == 0) {
            int classicLine3 = ni7Var.vyq().getClassicLine3();
            ni7Var.m17718o(classicLine3);
            this.bu.wvg(ni7Var, classicLine3, false);
        }
        boolean zM17733k3 = toq.C8026toq.m17733k(ni7Var.vyq().getClassicLine4());
        boolean zM17730k3 = toq.f7l8.m17730k(ni7Var.vyq().getClassicLine4());
        if (zM17733k3 && !zM22350p) {
            ni7Var.m17717m(0);
            return;
        }
        if (zM17730k3 && !zX2) {
            ni7Var.m17717m(0);
        } else if (ni7Var.lrht() == 0) {
            int classicLine4 = ni7Var.vyq().getClassicLine4();
            ni7Var.m17717m(classicLine4);
            this.bd.wvg(ni7Var, classicLine4, false);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m17577d() {
        vq();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context contextT8iq = t8iq(this.bl);
        HealthBean healthBeanLv5 = this.mjvl.size() > 0 ? lv5(contextT8iq) : null;
        Log.i(zr5t, "getHealthBeanSync use time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        WeatherBean weatherBeanM17578u = y2() ? m17578u(contextT8iq) : null;
        Log.i(zr5t, "getWeatherBeanSync use time = " + (System.currentTimeMillis() - jCurrentTimeMillis2));
        this.ad.cdj(healthBeanLv5, weatherBeanM17578u);
        this.bu.lvui(healthBeanLv5, weatherBeanM17578u);
        this.bd.lvui(healthBeanLv5, weatherBeanM17578u);
    }

    private boolean dr() {
        ni7 ni7Var = this.yl25;
        return ni7Var != null && AbstractC5074q.zurt(ni7Var.dd());
    }

    private boolean gyi(int i2) {
        return i2 == 302 || i2 == 303;
    }

    private void ikck() {
        Context contextT8iq = t8iq(this.bl);
        if (y2()) {
            zy zyVar = this.th6;
            if (zyVar != null) {
                zyVar.cancel(true);
                this.th6 = null;
            }
            zy zyVar2 = new zy(contextT8iq, this, this.k6e);
            this.th6 = zyVar2;
            zyVar2.execute(new Void[0]);
        }
        vq();
        if (this.mjvl.size() > 0) {
            toq toqVar = this.q7k9;
            if (toqVar != null) {
                toqVar.cancel(true);
                this.q7k9 = null;
            }
            toq toqVar2 = new toq(contextT8iq, this, this.mjvl);
            this.q7k9 = toqVar2;
            toqVar2.execute(new Void[0]);
        }
    }

    private HealthBean lv5(Context context) {
        WeakReference weakReference = new WeakReference(context);
        Iterator<Integer> it = this.mjvl.iterator();
        HealthBean qVar = null;
        while (it.hasNext()) {
            qVar = gcp.zy.toq(weakReference, it.next().intValue(), qVar);
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mu(HealthBean healthBean) {
        HealthBean healthBean2 = this.zmmu;
        if (healthBean2 != null) {
            healthBean2.updateData(healthBean, this.mjvl);
        } else {
            this.zmmu = healthBean;
        }
        if (toq.C8026toq.m17733k(this.yl25.d2ok())) {
            this.ad.fn3e(this.zmmu);
        }
        if (toq.C8026toq.m17733k(this.yl25.m17714c())) {
            this.bu.nn86(this.zmmu);
            this.bu.vyq(this.yl25.m17707r());
        }
        if (toq.C8026toq.m17733k(this.yl25.lrht())) {
            this.bd.nn86(this.zmmu);
            this.bd.vyq(this.yl25.m17707r());
        }
    }

    private int nmn5(int i2) {
        return hb(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qkj8(WeatherBean weatherBean) {
        this.sk1t = weatherBean;
        if (toq.f7l8.m17730k(this.yl25.d2ok())) {
            this.ad.m17613z(weatherBean);
        }
        if (toq.f7l8.m17730k(this.yl25.m17714c())) {
            this.bu.m17601o(weatherBean);
            this.bu.vyq(this.yl25.m17707r());
        }
        if (toq.f7l8.m17730k(this.yl25.lrht())) {
            this.bd.m17601o(weatherBean);
            this.bd.vyq(this.yl25.m17707r());
        }
    }

    private Context t8iq(Context context) {
        if (this.xy8 == 0) {
            return context;
        }
        String packageName = context.getPackageName();
        if (!"com.android.systemui".equals(packageName) && !"com.miui.aod".equals(packageName)) {
            return context;
        }
        try {
            if (this.hp == null) {
                this.hp = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
            }
            if (this.cw14 == null) {
                this.cw14 = UserHandle.class.getConstructor(Integer.TYPE);
            }
            return (Context) this.hp.invoke(context, this.cw14.newInstance(Integer.valueOf(this.xy8)), 1);
        } catch (Exception e2) {
            Log.e(zr5t, "get special context fail", e2);
            return context;
        }
    }

    /* JADX INFO: renamed from: u */
    private WeatherBean m17578u(Context context) {
        return gcp.zy.m22353y(new WeakReference(context), "2");
    }

    /* JADX INFO: renamed from: v */
    private void m17579v(String str, String str2) {
        WeatherBean weatherBean;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        Log.i(zr5t, "presetData this = " + this + ", weatherEmpty = " + zIsEmpty + ", healthEmpty = " + zIsEmpty2);
        if (zIsEmpty && zIsEmpty2) {
            return;
        }
        m17580x();
        HealthBean healthBean = null;
        if (zIsEmpty) {
            weatherBean = null;
        } else {
            try {
                weatherBean = (WeatherBean) this.dy.n7h(str, WeatherBean.class);
            } catch (Exception unused) {
                Log.i(zr5t, "presetData weather convert fail");
                weatherBean = null;
            }
        }
        if (!zIsEmpty2) {
            try {
                healthBean = (HealthBean) this.dy.n7h(str2, HealthBean.class);
            } catch (Exception unused2) {
                Log.i(zr5t, "presetData health convert fail");
            }
        }
        if (healthBean == null && weatherBean == null) {
            return;
        }
        this.k6e = true;
        this.ad.cdj(healthBean, weatherBean);
        this.bu.lvui(healthBean, weatherBean);
        this.bd.lvui(healthBean, weatherBean);
    }

    private void vq() {
        this.mjvl.clear();
        zp(this.yl25.d2ok());
        zp(this.yl25.m17714c());
        zp(this.yl25.lrht());
    }

    /* JADX INFO: renamed from: x */
    private void m17580x() {
        if (this.dy == null) {
            this.dy = new C4871g();
        }
    }

    private boolean y2() {
        return toq.f7l8.m17730k(this.yl25.d2ok()) || toq.f7l8.m17730k(this.yl25.m17714c()) || toq.f7l8.m17730k(this.yl25.lrht());
    }

    private void zp(int i2) {
        if (toq.C8026toq.m17733k(i2)) {
            if (i2 != 507) {
                this.mjvl.add(Integer.valueOf(i2));
                return;
            }
            this.mjvl.add(502);
            this.mjvl.add(500);
            this.mjvl.add(508);
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    /* JADX INFO: renamed from: b */
    protected boolean mo17574b() {
        return false;
    }

    @Override // com.miui.clock.zy.n7h
    public void cdj() {
        fu4 fu4Var = this.ay;
        if (fu4Var == null) {
            return;
        }
        if (!fu4Var.cdj() || !C6062n.m22317h(this.bl) || C6062n.x2(this.bl)) {
            C6065s.toq(this);
            C6065s.zy(this.ad);
            C6065s.zy(this.bc);
            C6065s.zy(this.bu);
            C6065s.zy(this.bd);
        }
        if (this.ay.ki()) {
            return;
        }
        C6065s.zy(this.bu);
        C6065s.zy(this.bd);
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5043k.f28715k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.f7l8(enumC5072n) : this.tlhn : this.bd : this.bu : this.bc : this.ad;
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void fti() {
        ch(this.yl25);
        super.fti();
        this.bc.setText(C6061k.m22310n(this.bl, this.as, this.bg, this.ay.lvui(), this.vb6));
        this.bu.hb(this.bg);
        this.bd.hb(this.bg);
        if (!this.ndjo) {
            this.w97r.setVisibility(this.yl25.m17714c() == 0 ? 8 : 0);
        }
        if (this.d1cy) {
            return;
        }
        this.tgs.setVisibility(this.yl25.lrht() != 0 ? 0 : 8);
    }

    @Override // com.miui.clock.zy.n7h
    public String getHealthJson() {
        HealthBean healthBean = this.zmmu;
        return healthBean == null ? super.getHealthJson() : healthBean.toJsonString();
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationRelativePosition() {
        return (C6062n.f35046q && getResources().getConfiguration().orientation == 2) ? 2 : 1;
    }

    @Override // com.miui.clock.zy.n7h
    public String getTimeZone() {
        return this.as.getTimeZone().getID();
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.f71597ncyb);
    }

    @Override // com.miui.clock.zy.n7h
    public String getWeatherJson() {
        WeatherBean weatherBean = this.sk1t;
        return weatherBean == null ? super.getWeatherJson() : weatherBean.toJsonString();
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    public void i1(AbstractC5074q abstractC5074q) {
        super.i1(abstractC5074q);
        if (abstractC5074q == null) {
            return;
        }
        ni7 ni7Var = (ni7) abstractC5074q;
        ch(ni7Var);
        this.yl25 = ni7Var;
        C6061k.zurt(this.bc, this.ay);
        this.bu.vyq(this.yl25.m17707r());
        this.bd.vyq(this.yl25.m17707r());
        int iM17726s = this.ay.m17726s();
        if (iM17726s != 0) {
            this.tlhn.setTextColor(C0541p.m2542t(iM17726s, 153));
        }
        fti();
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        float f2;
        float fY9n = y9n(C5049g.q.f29028k);
        float fY9n2 = y9n(C5049g.q.f29034q);
        float fY9n3 = y9n(C5049g.q.f71597ncyb);
        float fY9n4 = y9n(C5049g.q.f29035r);
        float fY9n5 = y9n(C5049g.q.f71513d3);
        float viewHeight = this.ad != null ? r6.getViewHeight() : y9n(C5049g.q.f71595n5r1);
        TextView textView = this.tlhn;
        if (textView == null || textView.getVisibility() != 0 || z2) {
            f2 = fY9n3 + viewHeight + fY9n + fY9n2 + fY9n4;
        } else {
            int lineHeight = this.tlhn.getLineHeight();
            String string = this.tlhn.getText().toString();
            float fMeasureText = this.tlhn.getPaint().measureText(string);
            int iNmn5 = nmn5(C5049g.q.f29020c);
            this.xqx.set(this.tlhn.getPaint());
            StaticLayout staticLayout = new StaticLayout(string, this.xqx, iNmn5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            boolean z3 = true;
            if (fMeasureText <= iNmn5 && staticLayout.getLineCount() <= 1) {
                z3 = false;
            }
            if (z3) {
                lineHeight *= 2;
            }
            f2 = fY9n3 + viewHeight + fY9n + fY9n2 + fY9n4 + lineHeight + fY9n5;
        }
        if (!z2) {
            ClassicContentAreaView classicContentAreaView = this.bu;
            if (classicContentAreaView != null && classicContentAreaView.getVisibility() == 0) {
                f2 += fY9n2;
            }
            ClassicContentAreaView classicContentAreaView2 = this.bd;
            if (classicContentAreaView2 != null && classicContentAreaView2.getVisibility() == 0) {
                f2 += fY9n2;
            }
        }
        return (int) (f2 + 0.5f);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: o */
    protected void mo17538o() {
        super.mo17538o();
        fu4 fu4Var = this.ay;
        if (fu4Var == null) {
            return;
        }
        C6061k.zurt(this.bc, fu4Var);
        this.bu.fti(true);
        this.bd.fti(true);
        this.tlhn.setTypeface(f7l8.m22300n(380));
        if (toq.zy.zy(this.yl25.m17714c())) {
            this.bu.jp0y();
            this.bu.vyq(this.yl25.m17707r());
        }
        if (toq.zy.zy(this.yl25.lrht())) {
            this.bd.jp0y();
            this.bd.vyq(this.yl25.m17707r());
        }
        fti();
        if (dr() || this.k6e) {
            m17577d();
        } else {
            ikck();
        }
    }

    @Override // com.miui.clock.MiuiBaseClock2, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int iWidth = C6062n.f7l8(this.bl).width();
        if (this.xk5 != iWidth) {
            this.xk5 = iWidth;
            xwq3();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zy zyVar = this.th6;
        if (zyVar != null) {
            zyVar.cancel(true);
            this.th6 = null;
        }
        toq toqVar = this.q7k9;
        if (toqVar != null) {
            toqVar.cancel(true);
            this.q7k9 = null;
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.xk5 = C6062n.f7l8(this.bl).width();
        this.bc = (MiuiTextGlassView) findViewById(C5049g.g.f71006ixz);
        this.bu = (ClassicContentAreaView) findViewById(C5049g.g.f70972cdj);
        this.bd = (ClassicContentAreaView) findViewById(C5049g.g.f71012ki);
        this.tlhn = (TextView) findViewById(C5049g.g.f71044sok);
        this.w97r = (Group) findViewById(C5049g.g.f71002i1);
        this.tgs = (Group) findViewById(C5049g.g.f70963a98o);
        this.tlhn.setTypeface(f7l8.m22300n(380));
        this.bu.setCalendar(this.as);
        this.bd.setCalendar(this.as);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        fu4 fu4Var;
        super.setClockPalette(i2, z2, map, z3);
        if (!C6062n.x2(this.bl) && (fu4Var = this.ay) != null && fu4Var.cdj() && C6062n.m22317h(this.bl)) {
            if (AbstractC5074q.m17719h(this.ay.dd())) {
                fu4 fu4Var2 = this.ay;
                fu4Var2.m17728z(fu4Var2.toq());
                return;
            }
            int iM17721g = this.ay.m17721g();
            if (!this.ay.t8r()) {
                C6065s.f7l8(this, hb(C5049g.q.f71571ktq));
            }
            C6065s.m22344y(this.ad, z2, iM17721g);
            C6065s.m22341p(this.bc, z2, iM17721g, this.ay.qrj());
            if (this.ay.ki()) {
                C6065s.m22344y(this.bu, z2, iM17721g);
                C6065s.m22344y(this.bd, z2, iM17721g);
            }
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        ni7 ni7Var = (ni7) abstractC5074q;
        ch(ni7Var);
        this.yl25 = ni7Var;
        if (this.s8y) {
            this.s8y = false;
            xwq3();
        }
        boolean zBo = bo();
        if (!this.k6e && !this.yl25.m17716j()) {
            m17579v(this.yl25.hb(), this.yl25.m17715e());
        }
        if (dr()) {
            m17577d();
        } else {
            ikck();
        }
        super.setClockStyleInfo(abstractC5074q);
        cdj();
        this.bc.setSameNumberWidth(com.miui.clock.module.toq.m17729k(this.yl25.lvui(), zBo));
        C6061k.zurt(this.bc, this.ay);
        int iM17714c = this.yl25.m17714c();
        int iLrht = this.yl25.lrht();
        if (!this.ndjo) {
            this.w97r.setVisibility(iM17714c == 0 ? 8 : 0);
        }
        if (!this.d1cy) {
            this.tgs.setVisibility(iLrht == 0 ? 8 : 0);
        }
        this.bu.wvg(this.yl25, iM17714c, zBo);
        this.bd.wvg(this.yl25, iLrht, zBo);
        int iM17726s = this.ay.m17726s();
        if (iM17726s != 0) {
            this.tlhn.setTextColor(C0541p.m2542t(iM17726s, 153));
        }
        if (this.yl25.uv6() == 0 || c8jq()) {
            this.tlhn.setVisibility(8);
            this.tlhn.setText("");
        } else {
            String strNn86 = this.yl25.nn86();
            if (TextUtils.isEmpty(strNn86)) {
                this.tlhn.setVisibility(8);
            } else {
                this.tlhn.setVisibility(0);
                this.tlhn.setText(strNn86);
            }
        }
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void setCurrentUserId(int i2) {
        this.xy8 = i2;
    }

    public void setLine2ExtraMarginTop(int i2) {
        bf2(C5049g.g.f28950k, nmn5(this.ar ? C5049g.q.f71597ncyb : C5049g.q.f29028k) + nmn5(i2));
    }

    public void setLine3ExtraMarginTop(int i2) {
        bf2(C5049g.g.f71048toq, nmn5(i2));
    }

    public void setLine4ExtraMarginTop(int i2) {
        bf2(C5049g.g.f71078zy, nmn5(i2));
    }

    public void setLine5ExtraMarginTop(int i2) {
        bf2(C5049g.g.f70973cfr, nmn5(C5049g.q.f29035r) + nmn5(i2));
    }

    public void setLineExtraMarginTop(int i2, int i3, int i4, int i5) {
        this.am.gvn7(this);
        this.am.b3e(C5049g.g.f28950k, 3, nmn5(this.ar ? C5049g.q.f71597ncyb : C5049g.q.f29028k) + nmn5(i2));
        this.am.b3e(C5049g.g.f71048toq, 3, nmn5(i3));
        this.am.b3e(C5049g.g.f71078zy, 3, nmn5(i4));
        this.am.b3e(C5049g.g.f70973cfr, 3, nmn5(C5049g.q.f29035r) + nmn5(i5));
        this.am.ki(this);
    }

    public void setShowFullTime(boolean z2) {
        Log.i(zr5t, "setShowFullTime = " + z2);
        this.vb6 = z2;
        this.bc.setText(C6061k.m22310n(this.bl, this.as, this.bg, this.ay.lvui(), this.vb6));
    }

    public void setUserDefineShowLine3(boolean z2) {
        this.ndjo = z2;
    }

    public void setUserDefineShowLine4(boolean z2) {
        this.d1cy = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void t8r(boolean z2) {
        super.t8r(z2);
        if (z2) {
            cdj();
        } else {
            setClockPalette(this.be, this.aj, this.bs, this.k0);
        }
    }

    public void xwq3() {
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        int i2 = C5049g.g.f71010jz5;
        c0397q.b3e(i2, 3, nmn5(C5049g.q.f71597ncyb));
        int i3 = C5049g.q.f71515dd;
        c0397q.b3e(i2, 6, nmn5(i3));
        c0397q.b3e(i2, 7, nmn5(i3));
        int i4 = C5049g.g.f28950k;
        c0397q.b3e(i4, 3, nmn5(C5049g.q.f29028k));
        int i5 = C5049g.g.f71006ixz;
        int i6 = C5049g.q.f71687zy;
        c0397q.b3e(i5, 6, nmn5(i6));
        c0397q.b3e(i5, 7, nmn5(i6));
        int i7 = C5049g.q.f71635toq;
        c0397q.b3e(i5, 4, nmn5(i7));
        int i8 = C5049g.g.f70972cdj;
        c0397q.b3e(i8, 6, nmn5(i6));
        c0397q.b3e(i8, 7, nmn5(i6));
        c0397q.b3e(i8, 4, nmn5(i7));
        int i9 = C5049g.g.f71012ki;
        c0397q.b3e(i9, 6, nmn5(i6));
        c0397q.b3e(i9, 7, nmn5(i6));
        c0397q.b3e(i9, 4, nmn5(i7));
        int i10 = C5049g.g.f70973cfr;
        int i11 = C5049g.q.f29035r;
        c0397q.b3e(i10, 3, nmn5(i11));
        int i12 = C5049g.q.f29023f;
        c0397q.b3e(i10, 6, nmn5(i12));
        c0397q.b3e(i10, 7, nmn5(i12));
        int i13 = C5049g.g.f71031nmn5;
        c0397q.b3e(i13, 6, nmn5(i12));
        c0397q.b3e(i13, 7, nmn5(i12));
        c0397q.b3e(i13, 3, nmn5(C5049g.q.f71513d3));
        c0397q.kcsr(i13, 3, nmn5(i11));
        int i14 = C5049g.q.f29034q;
        c0397q.x9kr(i4, nmn5(i14));
        c0397q.x9kr(C5049g.g.f71048toq, nmn5(i14));
        c0397q.x9kr(C5049g.g.f71078zy, nmn5(i14));
        c0397q.ki(this);
        this.ad.m17611h();
        this.tlhn.setTextSize(0, y9n(C5049g.q.f71579lrht));
        this.tlhn.setMaxWidth(nmn5(C5049g.q.f29020c));
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            C6061k.zurt(this.bc, fu4Var);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void zy() {
        if (dr()) {
            return;
        }
        ikck();
    }

    public ClassicClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s8y = true;
        this.mjvl = new HashSet<>();
        this.xqx = new TextPaint();
    }

    public ClassicClockView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.s8y = true;
        this.mjvl = new HashSet<>();
        this.xqx = new TextPaint();
    }
}
