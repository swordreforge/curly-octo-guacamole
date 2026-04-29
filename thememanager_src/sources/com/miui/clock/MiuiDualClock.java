package com.miui.clock;

import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.mcp;
import com.miui.clock.zy;
import gcp.C6062n;
import gcp.C6064q;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiDualClock extends RelativeLayout implements zy.n7h {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f70906bo = "content://com.android.settings.provider.MiuiSettingsDataProvider/zone_info";

    /* JADX INFO: renamed from: u */
    private static final String f28661u = "MiuiDualClock";

    /* JADX INFO: renamed from: v */
    private static final String f28662v = "content://com.android.settings.provider.MiuiSettingsDataProvider/dual_zone_info";

    /* JADX INFO: renamed from: a */
    private InterfaceC5040q f28663a;

    /* JADX INFO: renamed from: b */
    private mcp f28664b;

    /* JADX INFO: renamed from: c */
    private boolean f28665c;

    /* JADX INFO: renamed from: e */
    private boolean f28666e;

    /* JADX INFO: renamed from: f */
    private boolean f28667f;

    /* JADX INFO: renamed from: g */
    private String f28668g;

    /* JADX INFO: renamed from: h */
    private LinearLayout f28669h;

    /* JADX INFO: renamed from: i */
    private TextView f28670i;

    /* JADX INFO: renamed from: j */
    private boolean f28671j;

    /* JADX INFO: renamed from: k */
    private C7230k f28672k;

    /* JADX INFO: renamed from: l */
    private String f28673l;

    /* JADX INFO: renamed from: m */
    protected float f28674m;

    /* JADX INFO: renamed from: n */
    private String f28675n;

    /* JADX INFO: renamed from: o */
    private Context f28676o;

    /* JADX INFO: renamed from: p */
    private TextView f28677p;

    /* JADX INFO: renamed from: q */
    private C7230k f28678q;

    /* JADX INFO: renamed from: r */
    private String f28679r;

    /* JADX INFO: renamed from: s */
    private TextView f28680s;

    /* JADX INFO: renamed from: t */
    private TextView f28681t;

    /* JADX INFO: renamed from: x */
    ContentObserver f28682x;

    /* JADX INFO: renamed from: y */
    private TextView f28683y;

    /* JADX INFO: renamed from: z */
    private TextView f28684z;

    /* JADX INFO: renamed from: com.miui.clock.MiuiDualClock$k */
    class C5039k extends ContentObserver {
        C5039k(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            MiuiDualClock miuiDualClock = MiuiDualClock.this;
            miuiDualClock.f28666e = Settings.Global.getInt(miuiDualClock.f28676o.getContentResolver(), "auto_time_zone", 0) > 0;
            MiuiDualClock.this.fu4();
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.MiuiDualClock$q */
    public interface InterfaceC5040q {
        /* JADX INFO: renamed from: k */
        void m17563k(String str);
    }

    static class toq extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: k */
        String f28686k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Context f70907toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        zy f70908zy;

        public toq(String str, Context context, zy zyVar) {
            this.f28686k = str;
            this.f70907toq = context;
            this.f70908zy = zyVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            String string = "";
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = this.f70907toq.getContentResolver().query(Uri.parse(this.f28686k), null, null, null, null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            if (cursorQuery.getColumnIndex("zone_timename") >= 0) {
                                string = cursorQuery.getString(cursorQuery.getColumnIndex("zone_timename"));
                            }
                            if (TextUtils.isEmpty(string) && cursorQuery.getColumnIndex("zone_displayname") >= 0) {
                                string = cursorQuery.getString(cursorQuery.getColumnIndex("zone_displayname"));
                            }
                        }
                    }
                    Log.i(MiuiDualClock.f28661u, "get city name: " + string + ", from: " + this.f28686k);
                } catch (Exception e2) {
                    Log.e(MiuiDualClock.f28661u, "get city from " + this.f28686k + " exception", e2);
                    if (cursorQuery != null) {
                    }
                }
                return string;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            zy zyVar = this.f70908zy;
            if (zyVar != null) {
                zyVar.mo17565k(str);
            }
        }
    }

    interface zy {
        /* JADX INFO: renamed from: k */
        void mo17565k(String str);
    }

    public MiuiDualClock(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fu4() {
        new toq(f70906bo, this.f28676o, new zy() { // from class: com.miui.clock.n
            @Override // com.miui.clock.MiuiDualClock.zy
            /* JADX INFO: renamed from: k */
            public final void mo17565k(String str) {
                this.f29245k.ki(str);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: h */
    private int m17559h(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m17560i(String str) {
        TextView textView = this.f28683y;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str = this.f28676o.getString(C5049g.s.f71708ek5k);
            }
            textView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ki(String str) {
        TextView textView = this.f28670i;
        if (textView != null) {
            textView.setText(TextUtils.isEmpty(str) ? this.f28676o.getString(C5049g.s.f29056m) : str);
        }
        InterfaceC5040q interfaceC5040q = this.f28663a;
        if (interfaceC5040q != null) {
            interfaceC5040q.m17563k(str);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m17562z() {
        new toq(f28662v, this.f28676o, new zy() { // from class: com.miui.clock.q
            @Override // com.miui.clock.MiuiDualClock.zy
            /* JADX INFO: renamed from: k */
            public final void mo17565k(String str) {
                this.f29246k.m17560i(str);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void zurt() {
        boolean z2 = ((float) (((int) this.f28681t.getPaint().measureText(this.f28681t.getText().toString())) + ((int) this.f28677p.getPaint().measureText(this.f28677p.getText().toString())))) > getResources().getDimension(C5049g.q.f71686zwy) * 2.0f;
        if (z2 != this.f28671j) {
            this.f28671j = z2;
            fti();
        }
    }

    protected void a9() {
        this.f28676o.getResources();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = (int) (this.f28674m * m17559h(C5049g.q.f71604nsb));
        setLayoutParams(layoutParams);
        int iM17559h = (int) (this.f28674m * m17559h(C5049g.q.f71594n2t));
        int iM17559h2 = (int) (this.f28674m * m17559h(C5049g.q.f71614pc));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f28684z.getLayoutParams();
        layoutParams2.topMargin = iM17559h;
        this.f28684z.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f28681t.getLayoutParams();
        layoutParams3.topMargin = iM17559h2;
        this.f28681t.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f28680s.getLayoutParams();
        layoutParams4.topMargin = iM17559h;
        this.f28680s.setLayoutParams(layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f28677p.getLayoutParams();
        layoutParams5.topMargin = iM17559h2;
        this.f28677p.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f28669h.getLayoutParams();
        float f2 = this.f28674m;
        int i2 = C5049g.q.i8;
        layoutParams6.setMarginStart((int) (f2 * m17559h(i2)));
        this.f28669h.setLayoutParams(layoutParams6);
        int iWidth = (int) ((C6062n.f7l8(this.f28676o).width() - (this.f28674m * m17559h(i2))) / 2.0f);
        this.f28680s.setMaxWidth(iWidth);
        this.f28677p.setMaxWidth(iWidth);
        this.f28684z.setMaxWidth(iWidth);
        this.f28681t.setMaxWidth(iWidth);
    }

    @Override // com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        return null;
    }

    @Override // com.miui.clock.zy.n7h
    public void fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f28668g = str;
        Log.i(f28661u, "update local timeZone:" + this.f28668g);
        this.f28672k = new C7230k(TimeZone.getTimeZone(this.f28668g));
        fti();
        fu4();
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        o1t(this.f28672k, this.f28684z, this.f28681t);
        o1t(this.f28678q, this.f28680s, this.f28677p);
    }

    @Override // com.miui.clock.zy.n7h
    public int getClockHeight() {
        return getHeight();
    }

    @Override // com.miui.clock.zy.n7h
    public float getClockVisibleHeight() {
        return getHeight();
    }

    @Override // com.miui.clock.zy.n7h
    public String getLocalCity() {
        TextView textView = this.f28670i;
        return textView != null ? textView.getText().toString() : this.f28676o.getString(C5049g.s.f29056m);
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return getBottom() + getResources().getDimensionPixelSize(C5049g.q.fai);
    }

    @Override // com.miui.clock.zy.n7h
    public float getTopMargin() {
        return m17559h(C5049g.q.f71604nsb);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    protected void jp0y() {
        this.f28676o.getResources();
        float fM17559h = (int) (this.f28674m * m17559h(C5049g.q.f71519ebn));
        this.f28670i.setTextSize(0, fM17559h);
        this.f28683y.setTextSize(0, fM17559h);
        this.f28681t.setTextSize(0, fM17559h);
        this.f28677p.setTextSize(0, fM17559h);
        float fM17559h2 = (int) (this.f28674m * m17559h(C5049g.q.f71615pjz9));
        this.f28684z.setTextSize(0, fM17559h2);
        this.f28680s.setTextSize(0, fM17559h2);
    }

    @Override // com.miui.clock.zy.n7h
    public void n7h(int i2) {
        LinearLayout linearLayout = this.f28669h;
        if (linearLayout != null) {
            linearLayout.setVisibility(i2);
        }
    }

    public void ni7() {
        this.f28665c = C6064q.zy(this.f28676o);
    }

    public void o1t(C7230k c7230k, TextView textView, TextView textView2) {
        c7230k.setTimeInMillis(System.currentTimeMillis());
        textView.setText(miuix.pickerwidget.date.zy.toq(this.f28676o, System.currentTimeMillis(), (this.f28665c ? 32 : 16) | 12 | 64, c7230k.getTimeZone()));
        int i2 = this.f28671j ? this.f28665c ? C5049g.s.f71795zp : C5049g.s.f29066x : this.f28665c ? C5049g.s.f71689a98o : C5049g.s.f29044a;
        Context context = this.f28676o;
        textView2.setText(c7230k.format(context, context.getString(i2)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28667f) {
            return;
        }
        this.f28667f = true;
        this.f28676o.getContentResolver().registerContentObserver(Settings.Global.getUriFor("auto_time_zone"), false, this.f28682x);
        this.f28682x.onChange(false);
        a9();
        jp0y();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String language = configuration.locale.getLanguage();
        String country = configuration.locale.getCountry();
        if ((language == null || language.equals(this.f28679r)) && (country == null || country.equals(this.f28673l))) {
            return;
        }
        m17562z();
        fu4();
        this.f28671j = false;
        fti();
        zurt();
        this.f28679r = language;
        this.f28673l = country;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28667f) {
            this.f28667f = false;
            this.f28676o.getContentResolver().unregisterContentObserver(this.f28682x);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f28670i = (TextView) findViewById(C5049g.g.f28940a);
        TextView textView = (TextView) findViewById(C5049g.g.f28962x);
        this.f28684z = textView;
        textView.setAccessibilityDelegate(new com.miui.clock.toq(this.f28676o));
        this.f28681t = (TextView) findViewById(C5049g.g.f71074zp);
        this.f28683y = (TextView) findViewById(C5049g.g.f71047tfm);
        TextView textView2 = (TextView) findViewById(C5049g.g.f70978d8wk);
        this.f28680s = textView2;
        textView2.setAccessibilityDelegate(new com.miui.clock.toq(this.f28676o));
        this.f28677p = (TextView) findViewById(C5049g.g.f71061wo);
        this.f28669h = (LinearLayout) findViewById(C5049g.g.f70992g1);
        this.f28679r = this.f28676o.getResources().getConfiguration().locale.getLanguage();
        TimeZone timeZone = TimeZone.getDefault();
        this.f28668g = timeZone.getID();
        fu4();
        this.f28672k = new C7230k();
        if (TextUtils.isEmpty(this.f28675n)) {
            this.f28675n = timeZone.getID();
        }
        m17562z();
        this.f28678q = new C7230k(TimeZone.getTimeZone(this.f28675n));
        ni7();
        fti();
        zurt();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        boolean zZy;
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0 || (zZy = C6064q.zy(this.f28676o)) == this.f28665c) {
            return;
        }
        this.f28665c = zZy;
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: p */
    public void mo17535p(boolean z2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (z2) {
            layoutParams.topMargin = (int) (this.f28674m * m17559h(C5049g.q.f71604nsb));
        } else {
            layoutParams.topMargin = 0;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockAlpha(float f2) {
        setAlpha(f2);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        Log.d("ClockPalette", "Dualclock setClockPalette: textDark = " + z2);
        setTextColorDark(z2);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        mcp mcpVar = (mcp) abstractC5074q;
        this.f28664b = mcpVar;
        setLocalCity(mcpVar.eqxt());
    }

    public void setIs24HourFormat(boolean z2) {
        this.f28665c = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void setLocalCity(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f28670i.setText(str);
    }

    @Override // com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    public void setOnLocalCityChangeListener(InterfaceC5040q interfaceC5040q) {
        this.f28663a = interfaceC5040q;
    }

    @Override // com.miui.clock.zy.n7h
    public void setOwnerInfo(String str) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setScaleRatio(float f2) {
        this.f28674m = f2;
        jp0y();
        a9();
    }

    @Override // com.miui.clock.zy.n7h
    public void setShowLunarCalendar(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    public void setTextColorDark(boolean z2) {
        Log.d("ClockPalette", "Dualclock setTextColorDark: textDark = " + z2);
        int color = z2 ? getContext().getResources().getColor(C5049g.zy.f29099s) : -1;
        this.f28670i.setTextColor(color);
        this.f28684z.setTextColor(color);
        this.f28681t.setTextColor(color);
        this.f28683y.setTextColor(color);
        this.f28680s.setTextColor(color);
        this.f28677p.setTextColor(color);
    }

    @Override // com.miui.clock.zy.n7h
    public void wvg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f28675n = str;
        Log.i(f28661u, "update resident timeZone:" + this.f28675n);
        this.f28678q = new C7230k(TimeZone.getTimeZone(this.f28675n));
        fti();
        m17562z();
    }

    public MiuiDualClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28679r = "";
        this.f28673l = Locale.getDefault().getCountry();
        this.f28666e = true;
        this.f28671j = false;
        this.f28674m = 1.0f;
        this.f28682x = new C5039k(new Handler());
        this.f28676o = context;
        this.f28666e = Settings.Global.getInt(context.getContentResolver(), "auto_time_zone", 0) > 0;
    }
}
