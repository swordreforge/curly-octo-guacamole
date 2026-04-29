package com.miui.clock.module;

import android.content.Context;
import android.graphics.Color;
import com.miui.clock.magazine.C5060g;
import com.miui.clock.magazine.C5062n;
import com.miui.clock.magazine.C5065s;
import com.miui.clock.magazine.C5067y;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.rhombus.C5092n;
import com.miui.clock.rhombus.C5093q;
import gcp.C6066y;
import java.util.Map;

/* JADX INFO: renamed from: com.miui.clock.module.q */
/* JADX INFO: compiled from: ClockStyleInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5074q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f71941a9 = "magazine_c_single";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f71942d2ok = "smart_frame_single";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f71943d3 = "doodle_single";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f71944eqxt = "smart_frame_notification";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f71945fn3e = "classic_plus_small";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f71946fti = "magazine_c_notification";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f71947fu4 = "rhombus_notification";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f71948gvn7 = "doodle";

    /* JADX INFO: renamed from: i */
    public static final String f29193i = "classic_plus";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f71949jk = "magazine_c";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f71950jp0y = "magazine_c_date_only";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f71951ki = "classic";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f71952lvui = "dual";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f71953mcp = "magazine_b_notification";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f71954ni7 = "rhombus_single";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f71955o1t = "magazine_a_notification";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f71956oc = "smart_frame";

    /* JADX INFO: renamed from: r */
    public static final String f29194r = "old";

    /* JADX INFO: renamed from: t */
    public static final String f29195t = "magazine_b";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f71957t8r = "classic_small";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f71958wvg = "magazine_a_single";

    /* JADX INFO: renamed from: z */
    public static final String f29196z = "magazine_a";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f71959zurt = "rhombus";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f71960cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f71961f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f29197g;

    /* JADX INFO: renamed from: k */
    protected String f29199k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private Map<String, Integer> f71962kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f71963ld6;

    /* JADX INFO: renamed from: n */
    private boolean f29200n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f71964n7h;

    /* JADX INFO: renamed from: p */
    private int f29201p;

    /* JADX INFO: renamed from: s */
    private int f29203s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private AbstractC5071k.k f71966toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f71968zy = -1;

    /* JADX INFO: renamed from: q */
    private int f29202q = Color.parseColor("#99ffffff");

    /* JADX INFO: renamed from: y */
    private int f29204y = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f71967x2 = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f71965qrj = -1;

    /* JADX INFO: renamed from: h */
    private boolean f29198h = false;

    public static boolean fn3e(int i2) {
        return (i2 & 2) == 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17719h(int i2) {
        return (i2 & 1) == 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public static AbstractC5074q m17720k(Context context, ClockBean clockBean, int i2) {
        if (clockBean == null) {
            clockBean = ClockBean.getClassicDefaultBean(context);
        }
        String templateId = clockBean.getTemplateId();
        templateId.hashCode();
        byte b2 = -1;
        switch (templateId.hashCode()) {
            case -2016031183:
                if (templateId.equals(f71958wvg)) {
                    b2 = 0;
                }
                break;
            case -1835470725:
                if (templateId.equals(f71954ni7)) {
                    b2 = 1;
                }
                break;
            case -1326135015:
                if (templateId.equals("doodle")) {
                    b2 = 2;
                }
                break;
            case -1177233425:
                if (templateId.equals(f71945fn3e)) {
                    b2 = 3;
                }
                break;
            case -1110578026:
                if (templateId.equals(f71950jp0y)) {
                    b2 = 4;
                }
                break;
            case -826817826:
                if (templateId.equals(f71947fu4)) {
                    b2 = 5;
                }
                break;
            case -567074186:
                if (templateId.equals("magazine_a")) {
                    b2 = 6;
                }
                break;
            case -567074185:
                if (templateId.equals("magazine_b")) {
                    b2 = 7;
                }
                break;
            case -567074184:
                if (templateId.equals("magazine_c")) {
                    b2 = 8;
                }
                break;
            case -159946889:
                if (templateId.equals("smart_frame")) {
                    b2 = 9;
                }
                break;
            case -150406374:
                if (templateId.equals(f71957t8r)) {
                    b2 = 10;
                }
                break;
            case -4941529:
                if (templateId.equals("classic_plus")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 3094652:
                if (templateId.equals(f71952lvui)) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 126128978:
                if (templateId.equals(f71946fti)) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 631687603:
                if (templateId.equals(f71953mcp)) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 853620882:
                if (templateId.equals("classic")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 1137246228:
                if (templateId.equals(f71955o1t)) {
                    b2 = 16;
                }
                break;
            case 1179492204:
                if (templateId.equals("rhombus")) {
                    b2 = 17;
                }
                break;
            case 1469589487:
                if (templateId.equals(f71941a9)) {
                    b2 = 18;
                }
                break;
            case 1664787635:
                if (templateId.equals(f71944eqxt)) {
                    b2 = 19;
                }
                break;
            case 1902967342:
                if (templateId.equals(f71943d3)) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 1946883600:
                if (templateId.equals(f71942d2ok)) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
        }
        switch (b2) {
            case 0:
                return new C5060g(clockBean);
            case 1:
                return new C5092n(clockBean);
            case 2:
                return m17719h(i2) ? new com.miui.clock.graffiti.toq(clockBean) : new com.miui.clock.graffiti.zy(clockBean);
            case 3:
                return new wvg(clockBean);
            case 4:
                return new com.miui.clock.magazine.x2(clockBean, i2);
            case 5:
                return new C5093q(clockBean);
            case 6:
                return m17719h(i2) ? new C5060g(clockBean) : fn3e(i2) ? new C5062n(clockBean) : new com.miui.clock.magazine.zy(clockBean);
            case 7:
                return fn3e(i2) ? new C5065s(clockBean, i2) : new C5067y(clockBean, i2);
            case 8:
                return m17719h(i2) ? new com.miui.clock.magazine.n7h(clockBean, i2) : fn3e(i2) ? new com.miui.clock.magazine.qrj(clockBean, i2) : new com.miui.clock.magazine.ld6(clockBean, i2);
            case 9:
            case 19:
                return m17719h(i2) ? new com.miui.clock.smartframe.zy(clockBean) : new com.miui.clock.smartframe.toq(clockBean);
            case 10:
                return new C5082z(clockBean);
            case 11:
                return fn3e(i2) ? new wvg(clockBean) : new o1t(clockBean, i2);
            case 12:
                return new mcp(clockBean);
            case 13:
                return new com.miui.clock.magazine.qrj(clockBean, i2);
            case 14:
                return new C5065s(clockBean, i2);
            case 15:
                return fn3e(i2) ? new C5082z(clockBean) : new ni7(clockBean, i2);
            case 16:
                return new C5062n(clockBean);
            case 17:
                return m17719h(i2) ? new C5092n(clockBean) : fn3e(i2) ? new C5093q(clockBean) : new com.miui.clock.rhombus.zy(clockBean);
            case 18:
                return new com.miui.clock.magazine.n7h(clockBean, i2);
            case 20:
                return new com.miui.clock.graffiti.toq(clockBean);
            case 21:
                return new com.miui.clock.smartframe.zy(clockBean);
            default:
                return new ni7(clockBean, i2);
        }
    }

    public static boolean zurt(int i2) {
        return (i2 & 8) == 8;
    }

    public void a9(boolean z2) {
        this.f29198h = z2;
    }

    public boolean cdj() {
        if (this.f71961f7l8) {
            return false;
        }
        return this.f29200n;
    }

    public void d3(int i2) {
        if (i2 != 0) {
            this.f29204y = i2;
            this.f29201p = C6066y.m22346k(i2);
        }
    }

    public int f7l8() {
        return this.f71961f7l8 ? Color.parseColor("#99ffffff") : this.f29202q;
    }

    public void fti(int i2) {
        this.f71964n7h = i2;
    }

    public void fu4(int i2) {
        if (i2 != 0) {
            this.f71965qrj = i2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m17721g() {
        int i2 = this.f71967x2;
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }

    public void gvn7(int i2) {
        if (i2 != 0) {
            this.f71968zy = i2;
            this.f29203s = C6066y.m22346k(i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m17722i() {
        return this.f29198h;
    }

    public void jk(int i2) {
        if (i2 != 0) {
            this.f29202q = i2;
            this.f71963ld6 = C6066y.m22346k(i2);
        }
    }

    public void jp0y(Map<String, Integer> map) {
        this.f71962kja0 = map;
    }

    public boolean ki() {
        if (this.f71961f7l8) {
            return false;
        }
        return this.f29197g;
    }

    public abstract String kja0();

    public int ld6() {
        return this.f29204y;
    }

    public void mcp(boolean z2) {
        this.f71960cdj = z2;
    }

    /* JADX INFO: renamed from: n */
    public int m17723n() {
        return this.f29201p;
    }

    public int n7h() {
        return this.f29204y;
    }

    public boolean ni7() {
        return this.f71961f7l8;
    }

    public void o1t(boolean z2) {
        this.f29200n = z2;
    }

    public void oc(boolean z2) {
        this.f71961f7l8 = z2;
    }

    /* JADX INFO: renamed from: p */
    public int m17724p() {
        return this.f71968zy;
    }

    /* JADX INFO: renamed from: q */
    public int m17725q() {
        return this.f29203s;
    }

    public int qrj() {
        if (this.f71961f7l8) {
            return -1;
        }
        return this.f71968zy;
    }

    /* JADX INFO: renamed from: s */
    public int m17726s() {
        int i2 = this.f71964n7h;
        return i2 == 0 ? qrj() : i2;
    }

    /* JADX INFO: renamed from: t */
    public void m17727t(int i2) {
        if (i2 != 0) {
            this.f71967x2 = i2;
        }
    }

    public boolean t8r() {
        return this.f71960cdj;
    }

    public int toq() {
        int i2 = this.f71965qrj;
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }

    public void wvg(boolean z2) {
        this.f29197g = z2;
    }

    public Map<String, Integer> x2() {
        return this.f71962kja0;
    }

    /* JADX INFO: renamed from: y */
    public abstract int mo17647y();

    /* JADX INFO: renamed from: z */
    public void m17728z(int i2) {
        this.f29203s = i2;
    }

    public int zy() {
        return this.f71963ld6;
    }
}
