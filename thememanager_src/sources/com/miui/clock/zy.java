package com.miui.clock;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.C4871g;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.rhombus.C5090g;
import gcp.C6062n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import zy.lvui;

/* JADX INFO: compiled from: MiuiClockController.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: a */
    public static final String f29318a = "android.intent.action.USER_SWITCHED";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final int f72040a98o = 4;

    /* JADX INFO: renamed from: b */
    public static final int f29319b = 1;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f72041bf2 = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f72042bo = 1;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final int f72043c8jq = 0;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final String f72044ch = "constant_lockscreen_info";

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final int f72045dr = 2;

    /* JADX INFO: renamed from: e */
    private static final String f29320e = "MiuiClockController";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f72046ek5k = "miui.systemui_base_version";

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final int f72047gyi = 1;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final String f72048hb = "resident_timezone";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f72049i1 = 3;

    /* JADX INFO: renamed from: j */
    private static final String f29321j = "show_lunar_calendar";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final String f72050lv5 = "power_supersave_mode_open";

    /* JADX INFO: renamed from: m */
    public static final String f29322m = "com.miui.aod";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final String f72051nmn5 = "clockInfo";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final String f72052nn86 = "auto_dual_clock";

    /* JADX INFO: renamed from: o */
    public static final String f29323o = "com.android.systemui";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final String f72053t8iq = "wallpaper_matting_support_2";

    /* JADX INFO: renamed from: u */
    public static final int f29324u = -1;

    /* JADX INFO: renamed from: x */
    public static final int f29325x = 101;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final int f72054xwq3 = 3;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f72055y2 = 0;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f72056y9n = 0;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f72057yz = "selected_keyguard_clock_position";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final String f72058zp = "android.intent.extra.user_handle";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private ContentObserver f72059a9;

    /* JADX INFO: renamed from: c */
    private final Runnable f29326c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f72060cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private BroadcastReceiver f72061d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private ContentObserver f72062d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean f72063dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private ContentObserver f72064eqxt;

    /* JADX INFO: renamed from: f */
    private boolean f29327f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private n7h f72065f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f72066fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private ContentObserver f72067fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private boolean f72068fu4;

    /* JADX INFO: renamed from: g */
    private final int f29328g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private ContentObserver f72069gvn7;

    /* JADX INFO: renamed from: h */
    private int f29329h;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private ClockBean f72070hyr;

    /* JADX INFO: renamed from: i */
    private boolean f29330i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private final boolean f72071jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private ContentObserver f72072jp0y;

    /* JADX INFO: renamed from: k */
    private C4871g f29331k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f72073ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f72074kja0;

    /* JADX INFO: renamed from: l */
    private boolean f29332l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f72075ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private InterfaceC5099h f72076lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private BroadcastReceiver f72077lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private ClockBean f72078mcp;

    /* JADX INFO: renamed from: n */
    private BroadcastReceiver f29333n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f72079n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private String f72080n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private boolean f72081ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f72082ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private ViewGroup f72083o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private ContentObserver f72084oc;

    /* JADX INFO: renamed from: p */
    private boolean f29334p;

    /* JADX INFO: renamed from: q */
    private String f29335q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f72085qrj;

    /* JADX INFO: renamed from: r */
    private boolean f29336r;

    /* JADX INFO: renamed from: s */
    private String f29337s;

    /* JADX INFO: renamed from: t */
    private boolean f29338t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private float f72086t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f72087toq;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private cdj f72088uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private x2 f72089vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private final Handler f72090wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f72091x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private boolean f72092x9kr;

    /* JADX INFO: renamed from: y */
    private String f29339y;

    /* JADX INFO: renamed from: z */
    private Context f29340z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private Map<String, Integer> f72093zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private UserHandle f72094zy;

    /* JADX INFO: compiled from: MiuiClockController.java */
    public interface cdj {
        /* JADX INFO: renamed from: k */
        void m17784k();
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    class f7l8 extends BroadcastReceiver {
        f7l8() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zy.this.f72090wvg.post(zy.this.f29326c);
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$g */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5098g extends BroadcastReceiver {

        /* JADX INFO: renamed from: com.miui.clock.zy$g$k */
        /* JADX INFO: compiled from: MiuiClockController.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (zy.this.f29336r) {
                    zy.this.f29339y = TimeZone.getDefault().getID();
                    Log.d(zy.f29320e, "TimezoneChangeReceiver time zone changed " + zy.this.f29339y);
                    zy.this.jz5();
                    if (zy.this.f72065f7l8 != null) {
                        zy.this.f72065f7l8.fn3e(zy.this.f29339y);
                    }
                }
            }
        }

        C5098g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zy.this.f72090wvg.post(new k());
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$h */
    /* JADX INFO: compiled from: MiuiClockController.java */
    public interface InterfaceC5099h {
        /* JADX INFO: renamed from: g */
        default void m17785g(boolean z2) {
        }

        /* JADX INFO: renamed from: k */
        default void m17786k(boolean z2) {
        }

        /* JADX INFO: renamed from: n */
        void m17787n(ClockBean clockBean);

        /* JADX INFO: renamed from: q */
        void m17788q(boolean z2);

        void toq(ClockBean clockBean);

        default void zy(boolean z2) {
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$k */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5100k extends BroadcastReceiver {
        C5100k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.i(zy.f29320e, "onReceive User Switch Broadcast");
            if (intent != null && zy.f29318a.equals(intent.getAction())) {
                zy.this.ltg8(intent.getIntExtra(zy.f72058zp, 0));
                zy.this.zkd(true, true);
            }
        }
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface kja0 {
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    class ld6 extends ContentObserver {
        ld6(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            Log.i(zy.f29320e, "mClockInfoListener on change");
            zy zyVar = zy.this;
            zyVar.zkd(zyVar.m17772x(), false);
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$n */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5101n extends ContentObserver {
        C5101n(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            boolean zT8iq = zy.this.t8iq();
            if (zy.this.f72081ncyb != zT8iq) {
                zy.this.f72081ncyb = zT8iq;
                if (zy.this.f72065f7l8 != null) {
                    zy.this.f72065f7l8.setWallpaperSupportDepth(zy.this.f72081ncyb);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    public interface n7h {
        default void cdj() {
        }

        View f7l8(EnumC5072n enumC5072n);

        void fn3e(String str);

        void fti();

        int getClockHeight();

        default AbstractC5074q getClockStyleInfo() {
            return null;
        }

        float getClockVisibleHeight();

        default int getGalleryGravity() {
            return androidx.core.view.qrj.f50865toq;
        }

        default String getHealthJson() {
            return "";
        }

        default String getLocalCity() {
            return null;
        }

        default int getMagazineColor() {
            return 0;
        }

        int getNotificationClockBottom();

        default int getNotificationRelativePosition() {
            return 1;
        }

        default TextView getTimeView() {
            return null;
        }

        default String getTimeZone() {
            return null;
        }

        float getTopMargin();

        default String getWeatherJson() {
            return "";
        }

        void jk(boolean z2);

        default int mcp(boolean z2) {
            Log.i(zy.f29320e, "getMagazinePositionY default, this = " + getClass().getSimpleName());
            return getClockHeight();
        }

        /* JADX INFO: renamed from: n */
        default void mo17738n(EnumC5072n enumC5072n, int[] iArr) {
        }

        default void n7h(int i2) {
        }

        /* JADX INFO: renamed from: p */
        void mo17535p(boolean z2);

        /* JADX INFO: renamed from: q */
        default C5090g mo17739q(EnumC5072n enumC5072n) {
            return null;
        }

        default void qrj(boolean z2) {
        }

        /* JADX INFO: renamed from: s */
        default float mo17740s(EnumC5072n enumC5072n) {
            return 0.0f;
        }

        void setClockAlpha(float f2);

        default void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        }

        void setClockStyleInfo(AbstractC5074q abstractC5074q);

        default void setCurrentUserId(int i2) {
        }

        default void setInfoTextColorDark(boolean z2) {
        }

        default void setLocalCity(String str) {
        }

        void setMagazineInfoVisible(boolean z2);

        default void setMinuteColor(int i2, int i3) {
        }

        void setOwnerInfo(String str);

        void setScaleRatio(float f2);

        void setShowLunarCalendar(boolean z2);

        default void setSuperSaveOpen(boolean z2) {
            if (getClockStyleInfo() != null) {
                getClockStyleInfo().oc(z2);
            }
        }

        void setTextColorDark(boolean z2);

        default void setWallpaperSupportDepth(boolean z2) {
        }

        /* JADX INFO: renamed from: t */
        default int mo17741t(EnumC5072n enumC5072n) {
            return 0;
        }

        default void t8r(boolean z2) {
        }

        void wvg(String str);

        default void x2() {
        }

        /* JADX INFO: renamed from: y */
        default int mo17742y(EnumC5072n enumC5072n) {
            return 0;
        }

        default void zy() {
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$p */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5102p extends ContentObserver {
        C5102p(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            boolean zX2 = C6062n.x2(zy.this.f29340z);
            if (zy.this.f29332l != zX2) {
                zy.this.f29332l = zX2;
                if (zy.this.f72076lrht != null) {
                    zy.this.f72076lrht.m17786k(zy.this.f29332l);
                }
                if (zy.this.f72065f7l8 != null) {
                    zy.this.f72065f7l8.t8r(zy.this.f29332l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$q */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5103q extends ContentObserver {
        C5103q(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            zy zyVar = zy.this;
            zyVar.f72092x9kr = Settings.System.getInt(zyVar.f29340z.getContentResolver(), zy.f72050lv5, 0) != 0;
            Log.i(zy.f29320e, "isSurperSaveOpen on change " + zy.this.f72092x9kr);
            if (zy.this.f72076lrht != null) {
                zy.this.f72076lrht.zy(zy.this.f72092x9kr);
            }
            if (zy.this.f72065f7l8 != null) {
                zy.this.f72065f7l8.setSuperSaveOpen(zy.this.f72092x9kr);
            }
        }
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface qrj {
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$s */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5104s extends ContentObserver {
        C5104s(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            if (zy.this.f29336r) {
                zy zyVar = zy.this;
                zyVar.f29337s = zyVar.m17764j(zyVar.m17772x());
                zy.this.jz5();
                if (zy.this.f72065f7l8 != null) {
                    zy.this.f72065f7l8.wvg(zy.this.f29337s);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    class toq extends ContentObserver {
        toq(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            int iM22320p = C6062n.m22320p(zy.this.f29340z);
            C6062n.kja0(iM22320p);
            if (zy.this.f72079n5r1 != iM22320p) {
                zy.this.f72079n5r1 = iM22320p;
                if (zy.this.f72076lrht != null) {
                    zy.this.f72076lrht.m17785g(zy.this.f72079n5r1 == 1);
                }
                if (zy.this.f72065f7l8 != null) {
                    if (zy.this.f72079n5r1 != 1) {
                        zy.this.f72065f7l8.cdj();
                    }
                    zy.this.f72065f7l8.setClockPalette(zy.this.f72066fn3e, zy.this.f29330i, zy.this.f72093zurt, zy.this.t8iq());
                }
            }
        }
    }

    /* JADX INFO: compiled from: MiuiClockController.java */
    public interface x2 {
        /* JADX INFO: renamed from: k */
        void m17789k(boolean z2);

        void toq(boolean z2, boolean z3);
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$y */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class C5105y extends ContentObserver {
        C5105y(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            if (zy.this.f29336r) {
                zy zyVar = zy.this;
                zyVar.f72075ld6 = zyVar.jp0y(zyVar.m17772x()) != 0;
                zy.this.jz5();
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.clock.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiuiClockController.java */
    class RunnableC8027zy implements Runnable {
        RunnableC8027zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zy.this.f72065f7l8 != null) {
                String timeZone = zy.this.f72065f7l8.getTimeZone();
                if (!TextUtils.equals(timeZone, zy.this.f29339y)) {
                    zy.this.f29339y = TimeZone.getDefault().getID();
                    Log.d(zy.f29320e, "fixed clock timezone, clockTimezone is " + timeZone + " mCurrentTimezone is " + zy.this.f29339y);
                    zy.this.f72065f7l8.fn3e(zy.this.f29339y);
                }
                zy.this.f72065f7l8.fti();
                if (zy.this.f72088uv6 != null) {
                    zy.this.f72088uv6.m17784k();
                }
            }
        }
    }

    public zy(Context context, ViewGroup viewGroup) {
        this(context, viewGroup, null, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m17759a() {
        this.f29329h = Settings.System.getInt(this.f29340z.getContentResolver(), f72057yz, 0);
        this.f72075ld6 = jp0y(m17772x()) != 0;
        String strM17764j = m17764j(m17772x());
        this.f29337s = strM17764j;
        this.f72091x2 = (!this.f72075ld6 || strM17764j == null || strM17764j.equals(this.f29339y)) ? false : true;
        this.f72092x9kr = Settings.System.getInt(this.f29340z.getContentResolver(), f72050lv5, 0) != 0;
        this.f72081ncyb = t8iq();
        this.f29332l = C6062n.x2(this.f29340z);
        int iM22320p = C6062n.m22320p(this.f29340z);
        this.f72079n5r1 = iM22320p;
        C6062n.kja0(iM22320p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a9(@lvui ClockBean clockBean) {
        View viewInflate;
        if (this.f72078mcp != clockBean) {
            this.f72078mcp = clockBean;
        }
        if (this.f72091x2 && !gc3c()) {
            String dualClockLocalCity = clockBean.getDualClockLocalCity();
            ClockBean clockBean2 = new ClockBean(AbstractC5074q.f71952lvui);
            clockBean2.setDualClockLocalCity(dualClockLocalCity);
            clockBean = clockBean2;
        }
        this.f72083o1t.removeView((View) this.f72065f7l8);
        AbstractC5074q abstractC5074qM17720k = null;
        if (AbstractC5074q.f29194r.equals(clockBean.getTemplateId())) {
            viewInflate = a98o();
        } else {
            abstractC5074qM17720k = AbstractC5074q.m17720k(this.f29340z, clockBean, this.f29328g);
            viewInflate = LayoutInflater.from(this.f29340z).inflate(abstractC5074qM17720k.mo17647y(), this.f72083o1t, false);
        }
        this.f72083o1t.addView(viewInflate);
        n7h n7hVar = (n7h) viewInflate;
        this.f72065f7l8 = n7hVar;
        if (n7hVar != null) {
            n7hVar.setCurrentUserId(this.f72087toq);
            this.f72065f7l8.qrj(this.f29327f);
            if (abstractC5074qM17720k != null) {
                abstractC5074qM17720k.oc(this.f72092x9kr);
            }
            this.f72065f7l8.setClockStyleInfo(abstractC5074qM17720k);
            this.f72065f7l8.setClockPalette(this.f72066fn3e, this.f29330i, this.f72093zurt, t8iq());
            this.f72065f7l8.setInfoTextColorDark(this.f72068fu4);
            this.f72065f7l8.wvg(this.f29337s);
            this.f72065f7l8.fn3e(this.f29339y);
            this.f72065f7l8.setShowLunarCalendar(yz());
            this.f72065f7l8.setScaleRatio(this.f72086t8r);
            this.f72065f7l8.setTextColorDark(this.f29330i);
            this.f72065f7l8.mo17535p(this.f72085qrj);
            this.f72065f7l8.setOwnerInfo(this.f72080n7h);
        }
        InterfaceC5099h interfaceC5099h = this.f72076lrht;
        if (interfaceC5099h != null) {
            interfaceC5099h.m17787n(this.f72078mcp);
        }
    }

    private void c8jq() {
        if (this.f72084oc == null) {
            this.f72084oc = new C5102p(new Handler());
        }
        uj2j();
        UserHandle userHandle = null;
        try {
            userHandle = (UserHandle) UserHandle.class.getConstructor(Integer.TYPE).newInstance(UserHandle.class.getField("USER_ALL").get(null));
        } catch (Exception e2) {
            Log.e(f29320e, "constructor user handler fail", e2);
        }
        if (!m17772x() || userHandle == null) {
            this.f29340z.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(C6062n.f35041g), false, this.f72084oc);
        } else {
            try {
                ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.Secure.getUriFor(C6062n.f35041g), Boolean.FALSE, this.f72084oc, userHandle);
            } catch (Exception e3) {
                Log.e(f29320e, "register content observer as user fail", e3);
            }
        }
        this.f72084oc.onChange(false);
    }

    /* JADX INFO: renamed from: d */
    private void m17760d() {
        if (this.f72084oc != null) {
            this.f29340z.getContentResolver().unregisterContentObserver(this.f72084oc);
        }
    }

    private ClockBean d3(String str) {
        try {
            String string = new JSONObject(str).getString(f72051nmn5);
            if (this.f29331k == null) {
                this.f29331k = new C4871g();
            }
            return (ClockBean) this.f29331k.n7h(string, ClockBean.class);
        } catch (Exception e2) {
            Log.e(f29320e, "getClockBeanFromSetting fail, msg = " + e2);
            return ClockBean.getClassicDefaultBean(this.f29340z);
        }
    }

    private void dr(boolean z2) {
        if (this.f72063dd) {
            Log.i(f29320e, "registerClockInfoListener has register, return isCrossUser = " + z2);
            return;
        }
        this.f72063dd = true;
        Log.i(f29320e, "registerClockInfoListener isCrossUser = " + z2 + ", this = " + this);
        if (this.f72059a9 == null) {
            this.f72059a9 = new ld6(this.f72090wvg);
        }
        if (!z2) {
            this.f29340z.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("constant_lockscreen_info"), false, this.f72059a9);
            return;
        }
        this.f29333n = new C5100k();
        uj2j();
        try {
            this.f72094zy = (UserHandle) UserHandle.class.getConstructor(Integer.TYPE).newInstance(UserHandle.class.getField("USER_ALL").get(null));
        } catch (Exception e2) {
            Log.e(f29320e, "constructor user handler fail", e2);
        }
        try {
            Context.class.getMethod("registerReceiverAsUser", BroadcastReceiver.class, UserHandle.class, IntentFilter.class, String.class, Handler.class).invoke(this.f29340z, this.f29333n, this.f72094zy, new IntentFilter(f29318a), null, null);
        } catch (Exception e3) {
            Log.e(f29320e, "register receiver as user fail", e3);
        }
        try {
            ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.Secure.getUriFor("constant_lockscreen_info"), Boolean.FALSE, this.f72059a9, this.f72094zy);
        } catch (Exception e4) {
            Log.e(f29320e, "register content observer as user fail", e4);
        }
    }

    private String eqxt(boolean z2) {
        String str;
        Exception e2;
        if (!z2) {
            return Settings.Secure.getString(this.f29340z.getContentResolver(), "constant_lockscreen_info");
        }
        try {
            str = (String) Settings.Secure.class.getMethod("getStringForUser", ContentResolver.class, String.class, Integer.TYPE).invoke(null, this.f29340z.getContentResolver(), "constant_lockscreen_info", Integer.valueOf(this.f72087toq));
        } catch (Exception e3) {
            str = "";
            e2 = e3;
        }
        try {
            Log.i(f29320e, "getStringForUser, mCurrentUserId = " + this.f72087toq + ", json = " + str);
        } catch (Exception e4) {
            e2 = e4;
            Log.e(f29320e, "getStringForUser fail", e2);
        }
        return str;
    }

    private void fnq8() {
        if (this.f72069gvn7 != null) {
            this.f29340z.getContentResolver().unregisterContentObserver(this.f72069gvn7);
        }
    }

    private void gbni(ClockBean clockBean, boolean z2, boolean z3) {
        if (clockBean == null) {
            Log.i(f29320e, "bean is null");
            return;
        }
        if (z2 && clockBean.equals(this.f72078mcp) && !z3) {
            Log.i(f29320e, "bean is same with now value");
            return;
        }
        if (z3) {
            a9(clockBean);
            return;
        }
        Log.i(f29320e, "setClockBean = " + clockBean + ", mClockBean = " + this.f72078mcp);
        if (!TextUtils.equals(clockBean.getTemplateId(), this.f72078mcp.getTemplateId())) {
            a9(clockBean);
            return;
        }
        this.f72078mcp = clockBean;
        if (this.f72091x2 && !gc3c()) {
            String dualClockLocalCity = clockBean.getDualClockLocalCity();
            ClockBean clockBean2 = new ClockBean(AbstractC5074q.f71952lvui);
            clockBean2.setDualClockLocalCity(dualClockLocalCity);
            clockBean = clockBean2;
        }
        if ((this.f72065f7l8 instanceof MiuiDualClock) && !AbstractC5074q.f71952lvui.equals(clockBean.getTemplateId())) {
            a9(this.f72078mcp);
        }
        AbstractC5074q abstractC5074qM17720k = AbstractC5074q.m17720k(this.f29340z, clockBean, this.f29328g);
        if (abstractC5074qM17720k != null) {
            abstractC5074qM17720k.oc(this.f72092x9kr);
        }
        this.f72065f7l8.setClockStyleInfo(abstractC5074qM17720k);
        this.f72065f7l8.setClockPalette(this.f72066fn3e, this.f29330i, this.f72093zurt, t8iq());
        this.f72065f7l8.setInfoTextColorDark(this.f72068fu4);
        InterfaceC5099h interfaceC5099h = this.f72076lrht;
        if (interfaceC5099h != null) {
            interfaceC5099h.m17787n(this.f72078mcp);
        }
    }

    private boolean gc3c() {
        ClockBean clockBean = this.f72078mcp;
        if (clockBean != null) {
            return AbstractC5074q.f71950jp0y.equals(clockBean.getTemplateId());
        }
        return false;
    }

    private void gyi() {
        if (this.f72064eqxt == null) {
            this.f72064eqxt = new toq(new Handler());
        }
        uj2j();
        UserHandle userHandle = null;
        try {
            userHandle = (UserHandle) UserHandle.class.getConstructor(Integer.TYPE).newInstance(UserHandle.class.getField("USER_ALL").get(null));
        } catch (Exception e2) {
            Log.e(f29320e, "constructor user handler fail", e2);
        }
        if (!m17772x() || userHandle == null) {
            this.f29340z.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(C6062n.f77039x2), false, this.f72064eqxt);
        } else {
            try {
                ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.Secure.getUriFor(C6062n.f77039x2), Boolean.FALSE, this.f72064eqxt, userHandle);
            } catch (Exception e3) {
                Log.e(f29320e, "register content observer as user fail", e3);
            }
        }
        this.f72064eqxt.onChange(false);
    }

    private void ikck() {
        if (this.f72062d3 == null) {
            this.f72062d3 = new C5101n(new Handler());
        }
        uj2j();
        UserHandle userHandle = null;
        try {
            userHandle = (UserHandle) UserHandle.class.getConstructor(Integer.TYPE).newInstance(UserHandle.class.getField("USER_ALL").get(null));
        } catch (Exception e2) {
            Log.e(f29320e, "constructor user handler fail", e2);
        }
        if (!m17772x() || userHandle == null) {
            this.f29340z.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(f72053t8iq), false, this.f72062d3);
        } else {
            try {
                ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.Secure.getUriFor(f72053t8iq), Boolean.FALSE, this.f72062d3, userHandle);
            } catch (Exception e3) {
                Log.e(f29320e, "register content observer as user fail", e3);
            }
        }
        this.f72062d3.onChange(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public String m17764j(boolean z2) {
        if (!z2) {
            return Settings.System.getString(this.f29340z.getContentResolver(), f72048hb);
        }
        try {
            return (String) Settings.System.class.getMethod("getStringForUser", ContentResolver.class, String.class, Integer.TYPE).invoke(null, this.f29340z.getContentResolver(), f72048hb, Integer.valueOf(this.f72087toq));
        } catch (Exception e2) {
            Log.e(f29320e, "getIntForUser fail", e2);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jp0y(boolean z2) {
        if (!z2) {
            return Settings.System.getInt(this.f29340z.getContentResolver(), f72052nn86, 0);
        }
        try {
            Class cls = Integer.TYPE;
            return ((Integer) Settings.System.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, this.f29340z.getContentResolver(), f72052nn86, 0, Integer.valueOf(this.f72087toq))).intValue();
        } catch (Exception e2) {
            Log.e(f29320e, "getIntForUser fail", e2);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jz5() {
        String str;
        Log.d(f29320e, "updateDualClock mAutoDualClock = " + this.f29334p + ", mDualClockOpen = " + this.f72075ld6 + ", mResidentTimezone = " + this.f29337s + ", mCurrentTimezone = " + this.f29339y);
        this.f72091x2 = this.f29334p && this.f72075ld6 && (str = this.f29337s) != null && !str.equals(this.f29339y);
        b3e();
        InterfaceC5099h interfaceC5099h = this.f72076lrht;
        if (interfaceC5099h != null) {
            interfaceC5099h.m17788q(this.f72091x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ltg8(int i2) {
        Log.i(f29320e, "set current user id = " + i2);
        this.f72087toq = i2;
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setCurrentUserId(i2);
        }
    }

    private void mu() {
        if (this.f72064eqxt != null) {
            this.f29340z.getContentResolver().unregisterContentObserver(this.f72064eqxt);
        }
    }

    private boolean nmn5() {
        return "com.android.systemui".equals(this.f29340z.getPackageName());
    }

    private void qo() {
        BroadcastReceiver broadcastReceiver;
        if (!this.f29336r) {
            Log.i(f29320e, "removeTimeListener, un register return");
            return;
        }
        Log.i(f29320e, "removeTimeListener, this = " + this);
        this.f29336r = false;
        BroadcastReceiver broadcastReceiver2 = this.f72061d2ok;
        if (broadcastReceiver2 != null) {
            this.f29340z.unregisterReceiver(broadcastReceiver2);
        }
        if (this.f29338t && (broadcastReceiver = this.f72077lvui) != null) {
            this.f29340z.unregisterReceiver(broadcastReceiver);
        }
        ContentResolver contentResolver = this.f29340z.getContentResolver();
        ContentObserver contentObserver = this.f72067fti;
        if (contentObserver != null) {
            contentResolver.unregisterContentObserver(contentObserver);
        }
        ContentObserver contentObserver2 = this.f72072jp0y;
        if (contentObserver2 != null) {
            contentResolver.unregisterContentObserver(contentObserver2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t8iq() {
        /*
            r11 = this;
            int r0 = r11.f72082ni7
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto La
        L9:
            r1 = r2
        La:
            return r1
        Lb:
            boolean r0 = r11.m17772x()
            java.lang.String r3 = "MiuiClockController"
            java.lang.String r4 = "wallpaper_matting_support_2"
            if (r0 == 0) goto L5f
            java.lang.Class<android.provider.Settings$Secure> r0 = android.provider.Settings.Secure.class
            java.lang.String r5 = "getIntForUser"
            r6 = 4
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L58
            java.lang.Class<android.content.ContentResolver> r8 = android.content.ContentResolver.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L58
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8     // Catch: java.lang.Exception -> L58
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L58
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Exception -> L58
            r10 = 3
            r7[r10] = r8     // Catch: java.lang.Exception -> L58
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch: java.lang.Exception -> L58
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L58
            android.content.Context r7 = r11.f29340z     // Catch: java.lang.Exception -> L58
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Exception -> L58
            r6[r2] = r7     // Catch: java.lang.Exception -> L58
            r6[r1] = r4     // Catch: java.lang.Exception -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L58
            r6[r9] = r4     // Catch: java.lang.Exception -> L58
            int r4 = r11.f72087toq     // Catch: java.lang.Exception -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L58
            r6[r10] = r4     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L58
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L58
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L58
            if (r0 != r1) goto L6c
            goto L6d
        L58:
            r0 = move-exception
            java.lang.String r1 = "getIntForUser fail"
            android.util.Log.e(r3, r1, r0)
            goto L6e
        L5f:
            android.content.Context r0 = r11.f29340z
            android.content.ContentResolver r0 = r0.getContentResolver()
            int r0 = android.provider.Settings.Secure.getInt(r0, r4, r2)
            if (r0 != r1) goto L6c
            goto L6d
        L6c:
            r1 = r2
        L6d:
            r2 = r1
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isWallpaperSupportDepth on change "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.clock.zy.t8iq():boolean");
    }

    private void tfm() {
        if (this.f72062d3 != null) {
            this.f29340z.getContentResolver().unregisterContentObserver(this.f72062d3);
        }
    }

    private void uj2j() {
        try {
            ltg8(((Integer) ActivityManager.class.getMethod("getCurrentUser", new Class[0]).invoke(null, new Object[0])).intValue());
        } catch (Exception e2) {
            Log.e(f29320e, "get current user id fail", e2);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m17771v() {
        if (this.f29336r) {
            Log.i(f29320e, "registerTimeListener, has register return");
            return;
        }
        Log.i(f29320e, "registerTimeListener, this = " + this);
        this.f29336r = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        if (this.f72061d2ok == null) {
            this.f72061d2ok = new C5098g();
        }
        this.f29340z.registerReceiver(this.f72061d2ok, intentFilter);
        if (this.f29338t) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.TIME_TICK");
            intentFilter2.addAction("android.intent.action.TIME_SET");
            Log.d(f29320e, "---registerReceiver---");
            if (this.f72077lvui == null) {
                this.f72077lvui = new f7l8();
            }
            this.f29340z.registerReceiver(this.f72077lvui, intentFilter2);
        }
        uj2j();
        UserHandle userHandle = null;
        try {
            userHandle = (UserHandle) UserHandle.class.getConstructor(Integer.TYPE).newInstance(UserHandle.class.getField("USER_ALL").get(null));
        } catch (Exception e2) {
            Log.e(f29320e, "constructor user handler fail", e2);
        }
        ContentResolver contentResolver = this.f29340z.getContentResolver();
        if (this.f72067fti == null) {
            this.f72067fti = new C5105y(new Handler());
        }
        if (!m17772x() || userHandle == null) {
            contentResolver.registerContentObserver(Settings.System.getUriFor(f72052nn86), false, this.f72067fti);
        } else {
            try {
                ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.System.getUriFor(f72052nn86), Boolean.FALSE, this.f72067fti, userHandle);
            } catch (Exception e3) {
                Log.e(f29320e, "register content observer as user fail", e3);
            }
        }
        this.f72067fti.onChange(false);
        if (this.f72072jp0y == null) {
            this.f72072jp0y = new C5104s(new Handler());
        }
        if (!m17772x() || userHandle == null) {
            contentResolver.registerContentObserver(Settings.System.getUriFor(f72048hb), false, this.f72072jp0y);
        } else {
            try {
                ContentResolver.class.getMethod("registerContentObserverAsUser", Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class).invoke(this.f29340z.getContentResolver(), Settings.System.getUriFor(f72048hb), Boolean.FALSE, this.f72072jp0y, userHandle);
            } catch (Exception e4) {
                Log.e(f29320e, "register content observer as user fail", e4);
            }
        }
        this.f72072jp0y.onChange(false);
    }

    private void vq() {
        if (!this.f72063dd) {
            Log.i(f29320e, "removeClockInfoListener un register, return, this = " + this);
            return;
        }
        Log.i(f29320e, "removeClockInfoListener, this = " + this);
        this.f72063dd = false;
        if (this.f72059a9 != null) {
            this.f29340z.getContentResolver().unregisterContentObserver(this.f72059a9);
        }
        BroadcastReceiver broadcastReceiver = this.f29333n;
        if (broadcastReceiver != null) {
            this.f29340z.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public boolean m17772x() {
        return nmn5() || zp();
    }

    private void xwq3() {
        if (this.f72069gvn7 == null) {
            this.f72069gvn7 = new C5103q(new Handler());
        }
        this.f29340z.getContentResolver().registerContentObserver(Settings.System.getUriFor(f72050lv5), false, this.f72069gvn7);
        this.f72069gvn7.onChange(false);
    }

    private boolean yz() {
        int i2 = this.f72073ki;
        return i2 != -1 ? i2 == 1 : Settings.System.getInt(this.f29340z.getContentResolver(), f29321j, 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zkd(boolean z2, boolean z3) {
        m17759a();
        String strEqxt = eqxt(z2);
        if (z2) {
            if (TextUtils.equals(strEqxt, this.f29335q)) {
                Log.i(f29320e, "last json equals current json");
                return;
            }
            this.f29335q = strEqxt;
        }
        ClockBean clockBeanD3 = d3(strEqxt);
        gbni(clockBeanD3, true, z3);
        InterfaceC5099h interfaceC5099h = this.f72076lrht;
        if (interfaceC5099h != null) {
            interfaceC5099h.toq(clockBeanD3);
        }
    }

    private boolean zp() {
        return "com.miui.aod".equals(this.f29340z.getPackageName());
    }

    public View a98o() {
        int i2;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int iM17782r = m17782r();
        if (iM17782r == 1) {
            i2 = C5049g.f7l8.f70958x2;
        } else if (iM17782r == 2) {
            i2 = C5049g.f7l8.f70951oc;
        } else if (iM17782r == 3) {
            i2 = C5049g.f7l8.f70926d2ok;
        } else if (iM17782r == 4) {
            i2 = C5049g.f7l8.f70929eqxt;
        } else if (iM17782r != 101) {
            try {
                packageInfo = this.f29340z.getPackageManager().getPackageInfo("com.android.systemui", 128);
            } catch (Exception e2) {
                Log.e(f29320e, "Context.getPackageManager().getPackageInfo not found", e2);
            }
            int i3 = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) ? 0 : bundle.getInt(f72046ek5k, 0);
            i2 = i3 < 11 ? C5049g.f7l8.f70958x2 : C5049g.f7l8.f70929eqxt;
        } else {
            i2 = C5049g.f7l8.f70927d3;
        }
        return LayoutInflater.from(this.f29340z).inflate(i2, this.f72083o1t, false);
    }

    /* JADX INFO: renamed from: b */
    public float m17775b() {
        return this.f72065f7l8.getTopMargin();
    }

    public void b3e() {
        if (m17782r() != this.f72060cdj) {
            this.f72060cdj = m17782r();
            ClockBean clockBean = this.f72078mcp;
            if (clockBean != null) {
                a9(clockBean);
            }
        }
    }

    public void bek6(int i2) {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.n7h(i2);
        }
    }

    public String bf2() {
        n7h n7hVar = this.f72065f7l8;
        return n7hVar != null ? n7hVar.getWeatherJson() : "";
    }

    public void bo() {
        if (AbstractC5074q.zurt(this.f29328g)) {
            return;
        }
        qo();
        fnq8();
        tfm();
        m17760d();
        if (C6062n.f35042h) {
            mu();
        }
        if (this.f72071jk) {
            vq();
        }
    }

    public void bwp(cdj cdjVar) {
        this.f72088uv6 = cdjVar;
    }

    public void bz2() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.x2();
        }
    }

    /* JADX INFO: renamed from: c */
    public View m17776c(EnumC5072n enumC5072n) {
        return this.f72065f7l8.f7l8(enumC5072n);
    }

    public void cfr(InterfaceC5099h interfaceC5099h) {
        this.f72076lrht = interfaceC5099h;
    }

    public boolean ch() {
        return this.f72091x2;
    }

    public void cv06() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.fti();
            cdj cdjVar = this.f72088uv6;
            if (cdjVar != null) {
                cdjVar.m17784k();
            }
        }
    }

    public Map<String, Integer> d2ok() {
        return this.f72093zurt;
    }

    public void d8wk(boolean z2) {
        this.f29338t = z2;
    }

    public AbstractC5074q dd() {
        return this.f72065f7l8.getClockStyleInfo();
    }

    /* JADX INFO: renamed from: e */
    public int m17777e(boolean z2) {
        return this.f72065f7l8.mcp(z2);
    }

    public C5090g ek5k(EnumC5072n enumC5072n) {
        return this.f72065f7l8.mo17739q(enumC5072n);
    }

    public void etdu(boolean z2) {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setMagazineInfoVisible(z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public String m17778f() {
        n7h n7hVar = this.f72065f7l8;
        return n7hVar != null ? n7hVar.getHealthJson() : "";
    }

    public void fti() {
        ClockBean clockBean = this.f72070hyr;
        if (clockBean != null) {
            a9(clockBean);
        }
    }

    public void g1(float f2) {
        this.f72065f7l8.setClockAlpha(f2);
    }

    public ClockBean gvn7() {
        return this.f72078mcp;
    }

    public int hb() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            return n7hVar.getNotificationRelativePosition();
        }
        return 1;
    }

    public int hyr() {
        n7h n7hVar = this.f72065f7l8;
        return n7hVar != null ? n7hVar.getGalleryGravity() : androidx.core.view.qrj.f50865toq;
    }

    public void i1(boolean z2) {
        this.f29327f = z2;
    }

    public void i9jn(int i2) {
        if (this.f72074kja0 != i2) {
            this.f72074kja0 = i2;
            b3e();
        }
    }

    public void kcsr(boolean z2) {
        if (this.f29330i != z2) {
            this.f29330i = z2;
            n7h n7hVar = this.f72065f7l8;
            if (n7hVar != null) {
                n7hVar.setTextColorDark(z2);
            }
        }
    }

    public void ktq(boolean z2) {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.jk(z2);
        }
    }

    /* JADX INFO: renamed from: l */
    public float m17779l() {
        return this.f72065f7l8.getClockVisibleHeight();
    }

    public n7h lrht() {
        return this.f72065f7l8;
    }

    public boolean lv5() {
        return this.f29330i;
    }

    public int lvui() {
        return this.f72066fn3e;
    }

    /* JADX INFO: renamed from: m */
    public int m17780m(EnumC5072n enumC5072n) {
        return this.f72065f7l8.mo17741t(enumC5072n);
    }

    public void m4(boolean z2) {
        this.f72068fu4 = z2;
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setInfoTextColorDark(z2);
        }
        x2 x2Var = this.f72089vyq;
        if (x2Var != null) {
            x2Var.m17789k(z2);
        }
    }

    public int n5r1() {
        String str = Build.DEVICE;
        return ("davinci".equals(str) || "davinciin".equals(str) || "raphael".equals(str) || "raphaelin".equals(str) || "chiron".equals(str) || "polaris".equals(str)) ? 3 : 0;
    }

    public float ncyb(EnumC5072n enumC5072n) {
        return this.f72065f7l8.mo17740s(enumC5072n);
    }

    public int nn86() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            return n7hVar.getNotificationClockBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int m17781o(EnumC5072n enumC5072n) {
        return this.f72065f7l8.mo17742y(enumC5072n);
    }

    public int oc() {
        return this.f72065f7l8.getClockHeight();
    }

    public void py(x2 x2Var) {
        this.f72089vyq = x2Var;
    }

    public void qkj8() {
        Object obj;
        ViewGroup viewGroup = this.f72083o1t;
        if (viewGroup == null || (obj = this.f72065f7l8) == null) {
            return;
        }
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: r */
    public int m17782r() {
        if (this.f72091x2) {
            return 101;
        }
        int i2 = this.f72074kja0;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f29329h;
        return i3 != 0 ? i3 : n5r1();
    }

    public void r8s8(boolean z2) {
        if (this.f72085qrj != z2) {
            this.f72085qrj = z2;
            n7h n7hVar = this.f72065f7l8;
            if (n7hVar != null) {
                n7hVar.mo17535p(z2);
            }
        }
    }

    public void se(boolean z2) {
        this.f72082ni7 = z2 ? 1 : 2;
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setWallpaperSupportDepth(z2);
        }
    }

    public void sok(int i2, int i3) {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setMinuteColor(i2, i3);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m17783u() {
        if (AbstractC5074q.zurt(this.f29328g)) {
            return;
        }
        m17771v();
        xwq3();
        ikck();
        c8jq();
        if (C6062n.f35042h) {
            gyi();
        }
        if (this.f72071jk) {
            dr(m17772x());
        }
    }

    public String uv6() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            return n7hVar.getLocalCity();
        }
        return null;
    }

    public void v0af(String str) {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setLocalCity(str);
        }
    }

    public int vyq() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            return n7hVar.getMagazineColor();
        }
        return 0;
    }

    public void w831(String str) {
        if (TextUtils.equals(this.f72080n7h, str)) {
            return;
        }
        this.f72080n7h = str;
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.setOwnerInfo(str);
        }
    }

    public void was(ClockBean clockBean) {
        gbni(clockBean, false, false);
    }

    public void wo(boolean z2) {
        this.f29334p = z2;
        jz5();
    }

    public void x9kr(EnumC5072n enumC5072n, int[] iArr) {
        this.f72065f7l8.mo17738n(enumC5072n, iArr);
    }

    public void y2() {
        n7h n7hVar = this.f72065f7l8;
        if (n7hVar != null) {
            n7hVar.zy();
        }
    }

    public TextView y9n() {
        return this.f72065f7l8.getTimeView();
    }

    public void yqrt(int i2) {
        if (this.f72073ki != i2) {
            this.f72073ki = i2;
            n7h n7hVar = this.f72065f7l8;
            if (n7hVar != null) {
                n7hVar.setShowLunarCalendar(yz());
            }
        }
    }

    public void z4(float f2) {
        if (this.f72086t8r != f2) {
            this.f72086t8r = f2;
            n7h n7hVar = this.f72065f7l8;
            if (n7hVar != null) {
                n7hVar.setScaleRatio(f2);
            }
        }
    }

    public void zsr0(int i2, boolean z2, Map<String, Integer> map) {
        this.f72066fn3e = i2;
        this.f29330i = z2;
        this.f72093zurt = map;
        if (this.f72065f7l8 != null) {
            this.f72065f7l8.setClockPalette(i2, z2, map, t8iq());
        }
        x2 x2Var = this.f72089vyq;
        if (x2Var != null) {
            ClockBean clockBean = this.f72078mcp;
            if (clockBean != null) {
                x2Var.toq(clockBean.isAutoPrimaryColor(), this.f72078mcp.isAutoSecondaryColor());
            } else {
                x2Var.toq(false, false);
            }
        }
    }

    public zy(Context context, ViewGroup viewGroup, int i2) {
        this(context, viewGroup, null, i2);
    }

    public zy(Context context, ViewGroup viewGroup, ClockBean clockBean) {
        this(context, viewGroup, clockBean, 0);
    }

    public zy(Context context, ViewGroup viewGroup, ClockBean clockBean, int i2) {
        this.f29339y = TimeZone.getDefault().getID();
        this.f29334p = true;
        this.f72075ld6 = false;
        this.f72091x2 = false;
        this.f72085qrj = true;
        this.f72080n7h = null;
        this.f72074kja0 = 0;
        this.f29329h = 0;
        this.f72060cdj = 0;
        this.f72073ki = -1;
        this.f72086t8r = 1.0f;
        this.f29330i = false;
        this.f72066fn3e = 0;
        this.f72068fu4 = false;
        this.f72090wvg = new Handler();
        this.f29338t = true;
        this.f72092x9kr = false;
        this.f72081ncyb = false;
        this.f29332l = false;
        this.f72079n5r1 = -1;
        this.f29327f = false;
        this.f29326c = new RunnableC8027zy();
        this.f29340z = context;
        this.f72083o1t = viewGroup;
        boolean zM17772x = m17772x();
        if (zM17772x) {
            uj2j();
        }
        this.f29328g = i2;
        Log.i(f29320e, "new MiuiClockController setClockBean = " + clockBean + ", type = " + i2);
        m17759a();
        StringBuilder sb = new StringBuilder();
        sb.append("pkg name = ");
        sb.append(context.getPackageName());
        Log.i(f29320e, sb.toString());
        if (clockBean == null) {
            this.f72071jk = true;
            String strEqxt = eqxt(zM17772x);
            if (zM17772x) {
                this.f29335q = strEqxt;
            }
            clockBean = d3(strEqxt);
        } else {
            this.f72071jk = false;
        }
        this.f72070hyr = clockBean;
    }
}
