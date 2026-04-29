package com.miui.clock.rhombus;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiClockNumberView;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.C5070i;
import com.miui.clock.module.C5073p;
import com.miui.clock.module.C5075s;
import com.miui.clock.module.C5081y;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.cdj;
import com.miui.clock.module.ki;
import com.miui.clock.module.kja0;
import com.miui.clock.module.n7h;
import com.miui.clock.module.t8r;
import com.miui.clock.zy;
import gcp.C6062n;
import gcp.C6064q;
import java.util.Map;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiRhombusBase extends RelativeLayout implements zy.n7h {

    /* JADX INFO: renamed from: a */
    private static final String f29247a = "face_unlcok_apply_for_lock";

    /* JADX INFO: renamed from: x */
    private static final int f29248x = 0;

    /* JADX INFO: renamed from: b */
    protected boolean f29249b;

    /* JADX INFO: renamed from: c */
    protected toq f29250c;

    /* JADX INFO: renamed from: e */
    protected boolean f29251e;

    /* JADX INFO: renamed from: f */
    protected MiuiClockNumberView f29252f;

    /* JADX INFO: renamed from: g */
    protected boolean f29253g;

    /* JADX INFO: renamed from: h */
    private DisplayMetrics f29254h;

    /* JADX INFO: renamed from: i */
    protected AbstractC5071k f29255i;

    /* JADX INFO: renamed from: j */
    protected int f29256j;

    /* JADX INFO: renamed from: k */
    protected Context f29257k;

    /* JADX INFO: renamed from: l */
    protected MiuiClockNumberView f29258l;

    /* JADX INFO: renamed from: m */
    protected Map<String, Integer> f29259m;

    /* JADX INFO: renamed from: n */
    protected C7230k f29260n;

    /* JADX INFO: renamed from: o */
    protected boolean f29261o;

    /* JADX INFO: renamed from: p */
    protected float f29262p;

    /* JADX INFO: renamed from: q */
    protected Resources f29263q;

    /* JADX INFO: renamed from: r */
    protected MiuiClockNumberView f29264r;

    /* JADX INFO: renamed from: s */
    protected int f29265s;

    /* JADX INFO: renamed from: t */
    protected MiuiClockNumberView f29266t;

    /* JADX INFO: renamed from: y */
    protected String f29267y;

    /* JADX INFO: renamed from: z */
    protected int[] f29268z;

    /* JADX INFO: renamed from: com.miui.clock.rhombus.MiuiRhombusBase$k */
    static /* synthetic */ class C5085k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29269k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29269k = iArr;
            try {
                iArr[EnumC5072n.HOUR1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29269k[EnumC5072n.HOUR2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29269k[EnumC5072n.MIN1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29269k[EnumC5072n.MIN2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29269k[EnumC5072n.ALL_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MiuiRhombusBase(Context context) {
        this(context, null);
    }

    @Override // com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5085k.f29269k[enumC5072n.ordinal()];
        if (i2 == 1) {
            return this.f29266t;
        }
        if (i2 == 2) {
            return this.f29264r;
        }
        if (i2 == 3) {
            return this.f29258l;
        }
        if (i2 == 4) {
            return this.f29252f;
        }
        if (i2 != 5) {
            return null;
        }
        return this;
    }

    @Override // com.miui.clock.zy.n7h
    public void fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29260n = new C7230k(TimeZone.getTimeZone(str));
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.f29260n.setTimeInMillis(System.currentTimeMillis());
        String strM22334k = C6064q.m22334k(this.f29253g ? "HHmm" : "hhmm");
        for (int i2 = 0; i2 < strM22334k.length(); i2++) {
            this.f29268z[i2] = Integer.parseInt(String.valueOf(strM22334k.charAt(i2)));
        }
    }

    /* JADX INFO: renamed from: g */
    protected void m17736g(String str) {
    }

    @Override // com.miui.clock.zy.n7h
    public int getClockHeight() {
        return Math.max(getHeight(), 0);
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.f29250c;
    }

    @Override // com.miui.clock.zy.n7h
    public float getClockVisibleHeight() {
        return Math.max(getHeight(), 0);
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        int iM17737k = m17737k(C5049g.q.km9o) + m17737k(C5049g.q.krto) + m17737k(C5049g.q.li5y) + ((int) (this.f29255i.mo17704z() * this.f29262p * ((!C6062n.qrj() || C6062n.m22322s(this.f29257k)) ? 1.0f : 0.8f))) + m17737k(C5049g.q.fai);
        return this.f29251e ? iM17737k + m17737k(C5049g.q.zidq) + m17737k(C5049g.q.xzk4) : iM17737k;
    }

    public AbstractC5071k getStyle() {
        return this.f29255i;
    }

    @Override // com.miui.clock.zy.n7h
    public float getTopMargin() {
        return 0.0f;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.miui.clock.zy.n7h
    public void jk(boolean z2) {
    }

    /* JADX INFO: renamed from: k */
    protected int m17737k(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    public void ld6() {
        this.f29253g = C6064q.zy(this.f29257k);
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: n */
    public void mo17738n(EnumC5072n enumC5072n, int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        int[] iArr2 = this.f29268z;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        int i4 = iArr2[2];
        int i5 = iArr2[3];
        int[] iArr3 = this.f29255i.ld6()[i2][i3];
        int[] iArr4 = this.f29255i.ki()[i4][i5];
        if (this.f29255i.mo17701p() == AbstractC5071k.k.Copperplate) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        int i6 = C5085k.f29269k[enumC5072n.ordinal()];
        if (i6 == 1) {
            float f2 = iArr3[0];
            float f3 = this.f29262p;
            iArr[0] = (int) (f2 * f3);
            iArr[1] = (int) (iArr3[1] * f3);
            return;
        }
        if (i6 == 2) {
            float f4 = iArr3[2];
            float f5 = this.f29262p;
            iArr[0] = (int) (f4 * f5);
            iArr[1] = (int) (iArr3[3] * f5);
            return;
        }
        if (i6 == 3) {
            float f6 = iArr4[0];
            float f7 = this.f29262p;
            iArr[0] = (int) (f6 * f7);
            iArr[1] = (int) (iArr4[1] * f7);
            return;
        }
        if (i6 != 4) {
            iArr[0] = 0;
            iArr[1] = 0;
        } else {
            float f8 = iArr4[2];
            float f9 = this.f29262p;
            iArr[0] = (int) (f8 * f9);
            iArr[1] = (int) (iArr4[3] * f9);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.densityDpi;
        if (this.f29265s != i2) {
            this.f29262p = this.f29254h.density * C6062n.m22318k(getContext());
            this.f29265s = i2;
        }
        String language = configuration.locale.getLanguage();
        if (!TextUtils.isEmpty(language) && !language.equals(this.f29267y)) {
            this.f29267y = language;
            m17736g(language);
        }
        fti();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f29254h = displayMetrics;
        this.f29262p = displayMetrics.density * C6062n.m22318k(getContext());
        this.f29260n = new C7230k();
        this.f29266t = (MiuiClockNumberView) findViewById(C5049g.g.f71032nn86);
        this.f29264r = (MiuiClockNumberView) findViewById(C5049g.g.f71000hb);
        this.f29258l = (MiuiClockNumberView) findViewById(C5049g.g.f71045t8iq);
        this.f29252f = (MiuiClockNumberView) findViewById(C5049g.g.f28960u);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        boolean zZy;
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0 || (zZy = C6064q.zy(this.f29257k)) == this.f29253g) {
            return;
        }
        this.f29253g = zZy;
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: p */
    public void mo17535p(boolean z2) {
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: q */
    public C5090g mo17739q(EnumC5072n enumC5072n) {
        int i2;
        if (!this.f29255i.mo17710k()) {
            return null;
        }
        int[] iArr = this.f29268z;
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = C5085k.f29269k[enumC5072n.ordinal()];
        if (i8 == 1) {
            i3 = this.f29255i.kja0()[i4];
            i2 = this.f29255i.n7h()[i4];
        } else if (i8 == 2) {
            i3 = this.f29255i.kja0()[i5];
            i2 = this.f29255i.n7h()[i5];
        } else if (i8 == 3) {
            i3 = this.f29255i.kja0()[i6];
            i2 = this.f29255i.n7h()[i6];
        } else if (i8 != 4) {
            i2 = 0;
        } else {
            i3 = this.f29255i.kja0()[i7];
            i2 = this.f29255i.n7h()[i7];
        }
        double radians = Math.toRadians(this.f29255i.cdj());
        double d2 = i3;
        double d4 = i2;
        double dCos = (Math.cos(radians) * d2) + (Math.sin(radians) * d4);
        double dCos2 = (Math.cos(radians) * d4) + (Math.sin(radians) * d2);
        C5090g c5090g = new C5090g();
        c5090g.f29304k = i3;
        c5090g.f72025toq = i2;
        c5090g.f72026zy = (int) dCos;
        c5090g.f29306q = (int) dCos2;
        c5090g.f29305n = (int) ((dCos - d2) * 0.5d);
        c5090g.f29303g = (int) ((dCos2 - d4) * 0.5d);
        return c5090g;
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: s */
    public float mo17740s(EnumC5072n enumC5072n) {
        int[] iArr = this.f29268z;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        float[] fArr = this.f29255i.x2()[i2][i3];
        float[] fArr2 = this.f29255i.t8r()[i4][i5];
        if (this.f29255i.mo17710k()) {
            int i6 = C5085k.f29269k[enumC5072n.ordinal()];
            if (i6 == 1) {
                return fArr[0];
            }
            if (i6 == 2) {
                return fArr[1];
            }
            if (i6 == 3) {
                return fArr2[0];
            }
            if (i6 == 4) {
                return fArr2[1];
            }
        }
        return 0.0f;
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockAlpha(float f2) {
        setAlpha(f2);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        toq toqVar;
        this.f29256j = i2;
        this.f29261o = z2;
        this.f29259m = map;
        this.f29249b = z3;
        if (map != null) {
            str = "secondary20=" + map.get("secondary20") + ",secondary90=" + map.get("secondary90") + ",secondary15=" + map.get("secondary15");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        if (C6062n.x2(this.f29257k) || (toqVar = this.f29250c) == null) {
            return;
        }
        toqVar.jp0y(map);
        this.f29250c.a9(z2);
        int iQrj = !z2 ? -1 : (map == null || map.get("secondary20") == null) ? this.f29250c.qrj() : map.get("secondary20").intValue();
        int color = Color.parseColor("#EE3434");
        if (this.f29250c.cdj()) {
            if (!C6062n.m22317h(this.f29257k) || AbstractC5074q.m17719h(this.f29250c.n5r1())) {
                this.f29250c.gvn7(iQrj);
            } else {
                this.f29250c.gvn7(-1);
                if (z2 && map != null && map.get("neutral-variant30") != null) {
                    this.f29250c.m17727t(map.get("neutral-variant30").intValue());
                } else if (!z2) {
                    this.f29250c.m17727t(-4605511);
                }
            }
            this.f29250c.fti(iQrj);
        }
        if (map != null && map.get("secondary90") != null) {
            this.f29250c.y9n(map.get("secondary90").intValue());
        }
        if (map != null && map.get("secondary15") != null) {
            this.f29250c.m17752m(map.get("secondary15").intValue());
        }
        if (this.f29250c.ki()) {
            this.f29250c.d3(color);
        }
    }

    protected void setClockStyle(int i2) {
        switch (i2) {
            case 1:
                this.f29255i = new C5070i();
                break;
            case 2:
                this.f29255i = new ki();
                break;
            case 3:
                this.f29255i = new n7h();
                break;
            case 4:
                this.f29255i = new t8r();
                break;
            case 5:
                this.f29255i = new com.miui.clock.module.f7l8();
                break;
            case 6:
                this.f29255i = new C5073p();
                break;
            case 7:
                this.f29255i = new kja0();
                break;
            case 8:
                this.f29255i = new cdj();
                break;
            case 9:
                this.f29255i = new C5075s();
                break;
            case 10:
                this.f29255i = new C5081y();
                break;
            default:
                this.f29255i = new C5070i();
                break;
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        this.f29250c = (toq) abstractC5074q;
    }

    public void setIs24HourFormat(boolean z2) {
        this.f29253g = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        this.f29251e = z2;
    }

    @Override // com.miui.clock.zy.n7h
    public void setMinuteColor(int i2, int i3) {
        toq toqVar = this.f29250c;
        if (toqVar != null) {
            toqVar.y9n(i2);
            this.f29250c.m17752m(i3);
            x2();
        }
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
    /* JADX INFO: renamed from: t */
    public int mo17741t(EnumC5072n enumC5072n) {
        int[] iArr = this.f29268z;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = C5085k.f29269k[enumC5072n.ordinal()];
        if (i6 == 1) {
            return this.f29255i.kja0()[i2];
        }
        if (i6 == 2) {
            return this.f29255i.kja0()[i3];
        }
        if (i6 == 3) {
            return this.f29255i.kja0()[i4];
        }
        if (i6 != 4) {
            return 0;
        }
        return this.f29255i.kja0()[i5];
    }

    protected boolean toq() {
        return Settings.Secure.getInt(this.f29257k.getContentResolver(), f29247a, 0) != 0;
    }

    @Override // com.miui.clock.zy.n7h
    public void wvg(String str) {
    }

    @Override // com.miui.clock.zy.n7h
    public void x2() {
    }

    @Override // com.miui.clock.zy.n7h
    /* JADX INFO: renamed from: y */
    public int mo17742y(EnumC5072n enumC5072n) {
        int[] iArr = this.f29268z;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = C5085k.f29269k[enumC5072n.ordinal()];
        if (i6 == 1) {
            return this.f29255i.n7h()[i2];
        }
        if (i6 == 2) {
            return this.f29255i.n7h()[i3];
        }
        if (i6 == 3) {
            return this.f29255i.n7h()[i4];
        }
        if (i6 != 4) {
            return 0;
        }
        return this.f29255i.n7h()[i5];
    }

    public MiuiRhombusBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29263q = null;
        this.f29268z = new int[4];
        this.f29257k = context;
        this.f29263q = context.getResources();
        ld6();
    }
}
