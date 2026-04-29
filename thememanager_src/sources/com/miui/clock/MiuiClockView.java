package com.miui.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.qrj;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.rhombus.C5090g;
import com.miui.clock.zy;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiClockView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int f28647f = 3;

    /* JADX INFO: renamed from: h */
    public static final int f28648h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f28649i = 16;

    /* JADX INFO: renamed from: l */
    public static final int f28650l = 2;

    /* JADX INFO: renamed from: p */
    public static final int f28651p = 2;

    /* JADX INFO: renamed from: r */
    public static final int f28652r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f28653s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f28654t = 10;

    /* JADX INFO: renamed from: y */
    public static final int f28655y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f28656z = 9;

    /* JADX INFO: renamed from: g */
    private boolean f28657g;

    /* JADX INFO: renamed from: k */
    private Context f28658k;

    /* JADX INFO: renamed from: n */
    private boolean f28659n;

    /* JADX INFO: renamed from: q */
    private zy f28660q;

    public MiuiClockView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private MiuiClockView m17550k(ClockBean clockBean, int i2) {
        zy zyVar = this.f28660q;
        if (zyVar != null && this.f28657g) {
            zyVar.bo();
            this.f28660q = null;
        }
        zy zyVar2 = new zy(this.f28658k, this, clockBean, i2);
        this.f28660q = zyVar2;
        zyVar2.i1(this.f28659n);
        this.f28660q.fti();
        if (this.f28657g) {
            this.f28660q.m17783u();
        }
        return this;
    }

    public void cdj(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.ktq(z2);
        }
    }

    public int f7l8(EnumC5072n enumC5072n) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.m17780m(enumC5072n);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public int m17551g(EnumC5072n enumC5072n) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.m17781o(enumC5072n);
        }
        return 0;
    }

    public ClockBean getClockBean() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.gvn7();
        }
        return null;
    }

    public int getClockHeight() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.oc();
        }
        return 0;
    }

    public Map<String, Integer> getClockPalette() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.d2ok();
        }
        return null;
    }

    public int getClockPaletteType() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.lvui();
        }
        return 0;
    }

    public AbstractC5074q getClockStyleInfo() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.dd();
        }
        return null;
    }

    public float getClockVisibleHeight() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.m17779l();
        }
        return 0.0f;
    }

    public int getGalleryGravity() {
        zy zyVar = this.f28660q;
        return zyVar != null ? zyVar.hyr() : qrj.f50865toq;
    }

    public String getHealthJson() {
        zy zyVar = this.f28660q;
        return zyVar != null ? zyVar.m17778f() : "";
    }

    public String getLocalCity() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.uv6();
        }
        return null;
    }

    public int getMagazineColor() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.vyq();
        }
        return 0;
    }

    public int getNotificationClockBottom() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.nn86();
        }
        return 0;
    }

    public int getNotificationRelativePosition() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.hb();
        }
        return 1;
    }

    public float getTopMargin() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.m17775b();
        }
        return 0.0f;
    }

    public String getWeatherJson() {
        zy zyVar = this.f28660q;
        return zyVar != null ? zyVar.bf2() : "";
    }

    /* JADX INFO: renamed from: h */
    public void m17552h() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.y2();
        }
    }

    public void ki() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.b3e();
        }
    }

    public boolean kja0() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.lv5();
        }
        return false;
    }

    public MiuiClockView ld6(int i2) {
        return m17550k(null, i2);
    }

    /* JADX INFO: renamed from: n */
    public int m17553n(boolean z2) {
        zy zyVar = this.f28660q;
        return zyVar != null ? zyVar.m17777e(z2) : getClockHeight();
    }

    public boolean n7h() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.ch();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28657g = true;
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.m17783u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28657g = false;
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.bo();
        }
    }

    /* JADX INFO: renamed from: p */
    public MiuiClockView m17554p() {
        return m17550k(null, 0);
    }

    /* JADX INFO: renamed from: q */
    public View m17555q(EnumC5072n enumC5072n) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.m17776c(enumC5072n);
        }
        return null;
    }

    public MiuiClockView qrj(ClockBean clockBean, int i2) {
        if (clockBean == null) {
            clockBean = ClockBean.getClassicDefaultBean(this.f28658k);
        }
        return m17550k(clockBean, i2);
    }

    /* JADX INFO: renamed from: s */
    public void m17556s(boolean z2) {
        this.f28659n = z2;
    }

    public void setAutoDualClock(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.wo(z2);
        }
    }

    public void setAutoUpdateTime(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.d8wk(z2);
        }
    }

    public void setClockAlpha(float f2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.g1(f2);
        }
    }

    public void setClockBean(ClockBean clockBean) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.was(clockBean);
        }
    }

    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map) {
        zy zyVar = this.f28660q;
        if (zyVar == null || map == null) {
            return;
        }
        zyVar.zsr0(i2, z2, map);
    }

    public void setClockPaletteChangeListener(zy.x2 x2Var) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.py(x2Var);
        }
    }

    public void setClockStyle(int i2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.i9jn(i2);
        }
    }

    public void setContext(Context context) {
        this.f28658k = context;
    }

    public void setHasTopMargin(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.r8s8(z2);
        }
    }

    public void setInfoTextColorDark(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.m4(z2);
        }
    }

    public void setLocalCity(String str) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.v0af(str);
        }
    }

    public void setMagazineInfoVisible(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.etdu(z2);
        }
    }

    public void setMinuteColor(int i2, int i3) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.sok(i2, i3);
        }
    }

    public void setMiuiClockInfoListener(zy.InterfaceC5099h interfaceC5099h) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.cfr(interfaceC5099h);
        }
    }

    public void setOwnerInfo(String str) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.w831(str);
        }
    }

    public void setScaleRatio(float f2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.z4(f2);
        }
    }

    public void setShowLunarCalendar(int i2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.yqrt(i2);
        }
    }

    public void setTextColorDark(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.kcsr(z2);
        }
    }

    public void setTimeUpdateListener(zy.cdj cdjVar) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.bwp(cdjVar);
        }
    }

    public void setWallpaperSupportDepth(boolean z2) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.se(z2);
        }
    }

    public void t8r() {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.cv06();
        }
    }

    public void toq(EnumC5072n enumC5072n, int[] iArr) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            zyVar.x9kr(enumC5072n, iArr);
        }
    }

    public MiuiClockView x2(ClockBean clockBean) {
        return qrj(clockBean, 0);
    }

    /* JADX INFO: renamed from: y */
    public C5090g m17557y(EnumC5072n enumC5072n) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.ek5k(enumC5072n);
        }
        return null;
    }

    public float zy(EnumC5072n enumC5072n) {
        zy zyVar = this.f28660q;
        if (zyVar != null) {
            return zyVar.ncyb(enumC5072n);
        }
        return 0.0f;
    }

    public MiuiClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28659n = false;
        if (context.getApplicationContext() != null) {
            this.f28658k = context.getApplicationContext();
        } else {
            this.f28658k = context;
        }
    }
}
