package com.miui.miwallpaper.material.utils;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import miui.os.Build;
import zy.hyr;

/* JADX INFO: renamed from: com.miui.miwallpaper.material.utils.q */
/* JADX INFO: compiled from: PartRectColorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5284q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final float f72196a9 = 392.0f;

    /* JADX INFO: renamed from: b */
    public static final int f29557b = 1;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f72198bf2 = 2;

    /* JADX INFO: renamed from: c */
    public static final String f29558c = "magazine_script_rect_small_screen";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final float f72200cdj = 560.0f;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f72202d2ok = "magazine_script_rect";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f72203d3 = "clock_style_rect";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f72204dd = "finger_print_rect_landscape";

    /* JADX INFO: renamed from: e */
    public static final String f29559e = "magazine_a";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f72205ek5k = 2;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f72206eqxt = "bottom_icon_rect";

    /* JADX INFO: renamed from: f */
    public static final String f29560f = "bottom_icon_rect_small_screen";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final float f72207f7l8 = 1137.0f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final float f72208fn3e = 536.0f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final float f72209fti = 79.0f;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final float f72210fu4 = 771.0f;

    /* JADX INFO: renamed from: g */
    public static final float f29561g = 871.0f;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f72211gvn7 = "status_bar_rect";

    /* JADX INFO: renamed from: h */
    public static final float f29562h = 320.0f;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f72212hb = "magazine_c";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f72213hyr = "finger_print_rect_small_screen";

    /* JADX INFO: renamed from: i */
    public static final float f29563i = 365.0f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f72214i1 = 3;

    /* JADX INFO: renamed from: j */
    public static final String f29564j = "doodle";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final float f72215jk = 320.0f;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final float f72216jp0y = 80.0f;

    /* JADX INFO: renamed from: k */
    private static final String f29565k = "PartRectColorUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final float f72217ki = 56.0f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final float f72218kja0 = 392.0f;

    /* JADX INFO: renamed from: l */
    public static final String f29566l = "status_bar_rect_small_screen";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final float f72219ld6 = 392.0f;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f72220lrht = "classic";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f72222lvui = "status_bar_rect_landscape";

    /* JADX INFO: renamed from: m */
    public static final int f29567m = 1;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final float f72223mcp = 674.0f;

    /* JADX INFO: renamed from: n */
    public static final float f29568n = 696.0f;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f72224n5r1 = "clock_style_rect_small_screen";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final float f72225n7h = 310.0f;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f72226ncyb = "magazine_script_rect_landscape";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final float f72227ni7 = 424.0f;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f72229nn86 = "magazine_b";

    /* JADX INFO: renamed from: o */
    public static final String f29569o = "smart_frame";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final float f72230o1t = 392.0f;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f72231oc = "finger_print_rect";

    /* JADX INFO: renamed from: p */
    public static final float f29570p = 310.0f;

    /* JADX INFO: renamed from: q */
    public static final float f29571q = 711.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final float f72232qrj = 50.0f;

    /* JADX INFO: renamed from: r */
    public static final String f29572r = "clock_style_rect_landscape";

    /* JADX INFO: renamed from: s */
    public static final float f29573s = 50.0f;

    /* JADX INFO: renamed from: t */
    public static final float f29574t = 320.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final float f72234t8r = 392.0f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f72235toq = "constant_lockscreen_info";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f72236uv6 = "classic_plus";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f72237vyq = "rhombus";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final float f72238wvg = 160.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final float f72239x2 = 241.0f;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f72240x9kr = "bottom_icon_rect_landscape";

    /* JADX INFO: renamed from: y */
    public static final float f29577y = 785.0f;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f72241y9n = 4;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f72242yz = 3;

    /* JADX INFO: renamed from: z */
    public static final float f29578z = 467.0f;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final float f72244zurt = 474.0f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final float f72245zy = 392.0f;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    protected static Rect f72197a98o = new Rect();

    /* JADX INFO: renamed from: a */
    protected static Rect f29556a = new Rect();

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    protected static Rect f72243zp = new Rect();

    /* JADX INFO: renamed from: x */
    protected static Rect f29576x = new Rect();

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    protected static Rect f72201ch = new Rect();

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static Rect f72228nmn5 = new Rect();

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static Rect f72221lv5 = new Rect();

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static Rect f72233t8iq = new Rect();

    /* JADX INFO: renamed from: u */
    public static Rect f29575u = new Rect();

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static Rect f72199bo = new Rect();

    private static void cdj(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        zy(z2, f2, f3, f4, f5, f6, f7);
    }

    private static void f7l8(String str, float f2, float f3) {
        Rect rect;
        rect = new Rect(0, 0, (int) f2, (int) f3);
        str.hashCode();
        switch (str) {
            case "clock_style_rect":
                f29556a = rect;
                break;
            case "status_bar_rect":
                f72197a98o = rect;
                break;
            case "clock_style_rect_landscape":
                f72221lv5 = rect;
                break;
            case "status_bar_rect_landscape":
                f72228nmn5 = rect;
                break;
        }
    }

    private static void fn3e() {
        f72228nmn5.setEmpty();
        f72221lv5.setEmpty();
        f72233t8iq.setEmpty();
        f29575u.setEmpty();
        f72199bo.setEmpty();
    }

    public static boolean fu4(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 3;
    }

    /* JADX INFO: renamed from: g */
    private static void m17962g(Context context, int i2, String str, int[] iArr, float f2, float f3, float f4, float f5, float f6, float f7, Map map) {
        float f8;
        float f9;
        float f10;
        float f11;
        int[] iArrKi = ki(context, false);
        if (iArrKi != null) {
            f10 = iArrKi[0];
            f11 = iArrKi[1];
            f8 = f2;
            f9 = f3;
        } else {
            f8 = f2;
            f9 = f3;
            f10 = f4;
            f11 = f5;
        }
        kja0(false, i2, context, str, iArr, f2, f3, n7h(f8, f9, f10, f11), f6, f7);
        map.put(f29566l, f72197a98o);
        map.put(f72224n5r1, f29556a);
        map.put(f72213hyr, f72243zp);
        map.put(f29560f, f29576x);
        map.put(f29558c, f72201ch);
    }

    /* JADX INFO: renamed from: h */
    private static void m17963h(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (int) ((560.0f * f3) / f7);
        int i2 = ((int) (f3 - f8)) / 2;
        int i3 = ((int) (f8 + f3)) / 2;
        float f9 = (int) ((320.0f * f2) / f6);
        int i4 = ((int) (f2 - f9)) / 2;
        int i5 = ((int) (f9 + f2)) / 2;
        Rect rect = new Rect(i4, i2, i5, i3);
        if (f4 < 1.0f && f5 > 1.0f) {
            int i6 = (int) (f5 / 2.0f);
            rect.set(i4, i2 + i6, i5, i3 + i6);
        }
        Rect rect2 = new Rect(0, 0, (int) f2, (int) f3);
        if (z2) {
            f72228nmn5 = rect2;
            f72221lv5 = rect;
        } else {
            f72197a98o = rect2;
            f29556a = rect;
        }
        m17970y(z2, f2, f3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: i */
    public static int m17964i(Context context, int i2) {
        return Settings.Secure.getInt(context.getContentResolver(), "wallpaper_effect_type_" + i2, 0);
    }

    /* JADX INFO: renamed from: k */
    private static void m17965k(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i2 = (int) ((50.0f * f3) / f7);
        int i3 = (int) ((310.0f * f3) / f7);
        int i4 = (int) ((392.0f * f2) / f6);
        Rect rect = new Rect(0, i2, i4, i3);
        if (f4 >= 1.0f) {
            int i5 = (int) (f4 / 2.0f);
            rect.set(i5, i2, (int) (f2 - i5), i3);
        } else if (f5 > 1.0f) {
            int i6 = (int) (f5 / 2.0f);
            rect.set(0, i2 + i6, i4, i6 + i3);
        }
        if (z2) {
            f72221lv5 = rect;
        } else {
            f29556a = rect;
        }
        m17968q(z2, f2, f3, f4, f5, f6, f7);
        m17970y(z2, f2, f3, f4, f5, f6, f7);
    }

    public static int[] ki(Context context, boolean z2) {
        Display display;
        Display[] displays = ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED");
        if (displays.length != 2 || (display = displays[0]) == null || displays[1] == null) {
            return null;
        }
        Display display2 = display.getMode().getPhysicalWidth() < displays[1].getMode().getPhysicalWidth() ? displays[0] : displays[1];
        Display display3 = displays[0].getMode().getPhysicalWidth() < displays[1].getMode().getPhysicalWidth() ? displays[1] : displays[0];
        if (z2) {
            display2 = display3;
        }
        return new int[]{display2.getMode().getPhysicalWidth(), display2.getMode().getPhysicalHeight()};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void kja0(boolean r18, int r19, android.content.Context r20, java.lang.String r21, int[] r22, float r23, float r24, float[] r25, float r26, float r27) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.miwallpaper.material.utils.C5284q.kja0(boolean, int, android.content.Context, java.lang.String, int[], float, float, float[], float, float):void");
    }

    public static int[] ld6(String str, boolean z2, int i2, int i3, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        int i4;
        if ("clockStyle".equals(str)) {
            f7 = 160.0f;
            f6 = i2 != 2 ? i2 != 4 ? 536.0f : z2 ? 467.0f : 771.0f : z2 ? 424.0f : 474.0f;
        } else {
            f6 = 56.0f;
            f7 = 365.0f;
        }
        float f8 = (f6 * f3) / f5;
        int i5 = (int) (((f3 * f7) / f5) + f8);
        float f9 = (int) ((392.0f * f2) / f4);
        int i6 = (int) f2;
        if (i3 == 2) {
            i6 = (int) ((f2 + f9) / 2.0f);
            i4 = (int) ((f2 - f9) / 2.0f);
        } else if (i3 != 3) {
            i6 = (int) f9;
            i4 = 0;
        } else {
            i4 = (int) (f2 - f9);
        }
        return new int[]{i4, (int) f8, i6, i5};
    }

    /* JADX INFO: renamed from: n */
    private static void m17966n(boolean z2, boolean z3, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (z2) {
            m17968q(z3, f2, f3, f4, f5, f6, f7);
        }
        zy(z3, f2, f3, f4, f5, f6, f7);
        m17970y(z3, f2, f3, f4, f5, f6, f7);
    }

    private static float[] n7h(float f2, float f3, float f4, float f5) {
        float fMin = Math.min(f2 / f4, f3 / f5);
        return new float[]{Math.abs(f4 - (f2 / fMin)) * fMin, Math.abs(f5 - (f3 / fMin)) * fMin};
    }

    private static boolean ni7() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            Log.e(f29565k, "isFoldDevices fail : ", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m17967p(boolean z2, int i2, int[] iArr, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i3;
        int[] iArrLd6 = ld6("clockStyle", z2, i2, iArr[0], f2, f3, f6, f7);
        switch (iArr[1]) {
            case 102:
            case 105:
                i3 = 3;
                break;
            case 103:
            default:
                i3 = 1;
                break;
            case 104:
            case 106:
                i3 = 2;
                break;
        }
        int[] iArrLd62 = ld6("", z2, i2, i3, f2, f3, f6, f7);
        Rect rect = new Rect(iArrLd6[0], iArrLd6[1], iArrLd6[2], iArrLd6[3]);
        Rect rect2 = new Rect(iArrLd62[0], iArrLd62[1], iArrLd62[2], iArrLd62[3]);
        if (f4 < 1.0f && f5 > 1.0f) {
            int i4 = (int) (f5 / 2.0f);
            rect.set(iArrLd6[0], iArrLd6[1] + i4, iArrLd6[2], iArrLd6[3] + i4);
            rect2.set(iArrLd62[0], iArrLd62[1] + i4, iArrLd62[2], iArrLd62[3] + i4);
        }
        if (z2) {
            f72221lv5 = rect;
            f72199bo = rect2;
        } else {
            f29556a = rect;
            f72201ch = rect2;
        }
        m17968q(z2, f2, f3, f4, f5, f6, f7);
        m17970y(z2, f2, f3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: q */
    private static void m17968q(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        f7l8(z2 ? f72222lvui : "status_bar_rect", f2, f3);
    }

    private static void qrj(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        Rect rect = new Rect(0, 0, (int) f2, (int) f3);
        if (z2) {
            f72221lv5 = rect;
        } else {
            f29556a = rect;
        }
        m17970y(z2, f2, f3, f4, f5, f6, f7);
        m17968q(z2, f2, f3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: s */
    private static void m17969s(Context context, int i2, String str, int[] iArr, float f2, float f3, float f4, float f5, float f6, float f7, Map map) {
        float[] fArrN7h = n7h(f2, f3, f4, f5);
        fn3e();
        kja0(true, i2, context, str, iArr, f2, f3, fArrN7h, f6, f7);
        map.put(f72222lvui, f72228nmn5);
        map.put(f29572r, f72221lv5);
        map.put(f72204dd, f72233t8iq);
        map.put(f72240x9kr, f29575u);
        map.put(f72226ncyb, f72199bo);
    }

    @hyr(api = 30)
    public static Map<String, Rect> t8r(Context context, String str, int[] iArr, float f2, float f3) {
        float f4;
        float[] fArr;
        float f5;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        float fMin = Math.min(bounds.width(), bounds.height());
        float fMax = Math.max(bounds.width(), bounds.height());
        HashMap map = new HashMap();
        float[] fArrN7h = n7h(f2, f3, fMin, fMax);
        zurt();
        if (ni7()) {
            int[] iArrKi = ki(context, true);
            if (iArrKi != null) {
                float[] fArrN7h2 = n7h(f2, f3, iArrKi[0], iArrKi[1]);
                float f6 = iArrKi[0];
                f5 = iArrKi[1];
                f4 = f6;
                fArr = fArrN7h2;
            } else {
                f4 = fMin;
                fArr = fArrN7h;
                f5 = fMax;
            }
            m17962g(context, 3, str, iArr, f2, f3, f4, f5, 392.0f, 871.0f, map);
            m17969s(context, 2, str, iArr, f2, f3, f5, f4, 696.0f, 785.0f, map);
            kja0(false, 2, context, str, iArr, f2, f3, fArr, 696.0f, 785.0f);
        } else if (m17971z()) {
            m17969s(context, 4, str, iArr, f2, f3, fMax, fMin, 711.0f, 1137.0f, map);
            kja0(false, 4, context, str, iArr, f2, f3, fArrN7h, 711.0f, 1137.0f);
        } else {
            kja0(false, 1, context, str, iArr, f2, f3, fArrN7h, 392.0f, 871.0f);
        }
        map.put("status_bar_rect", f72197a98o);
        map.put("clock_style_rect", f29556a);
        map.put(f72231oc, f72243zp);
        map.put(f72206eqxt, f29576x);
        map.put("magazine_script_rect", f72201ch);
        Log.d(f29565k, "getPartScreenRectUtils: " + f72197a98o + f29556a + f72243zp + f29576x + f72201ch);
        return map;
    }

    private static void toq(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i2 = (int) ((50.0f * f3) / f7);
        int i3 = (int) ((310.0f * f3) / f7);
        float f8 = (int) ((392.0f * f2) / f6);
        int i4 = ((int) (f2 - f8)) / 2;
        int i5 = ((int) (f8 + f2)) / 2;
        Rect rect = new Rect(i4, i2, i5, i3);
        if (f4 < 1.0f && f5 > 1.0f) {
            int i6 = (int) (f5 / 2.0f);
            rect.set(i4, i2 + i6, i5, i3 + i6);
        }
        if (z2) {
            f72221lv5 = rect;
        } else {
            f29556a = rect;
        }
        m17968q(z2, f2, f3, f4, f5, f6, f7);
        m17970y(z2, f2, f3, f4, f5, f6, f7);
    }

    private static void x2(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i2 = (int) ((79.0f * f3) / f7);
        int i3 = ((int) ((80.0f * f3) / f7)) + i2;
        int i4 = (int) ((320.0f * f3) / f7);
        int i5 = (z2 || !m17971z()) ? i4 : (int) ((674.0f * f3) / f7);
        int i6 = i4 + i5;
        float f8 = (int) ((392.0f * f2) / f6);
        int i7 = (int) ((f2 - f8) / 2.0f);
        int i8 = (int) ((f8 + f2) / 2.0f);
        int i9 = (int) f2;
        Rect rect = new Rect(0, i2, i9, i3);
        Rect rect2 = new Rect(i7, i5, i8, i6);
        if (f4 >= 1.0f) {
            int i10 = (int) (f4 / 2.0f);
            rect.set(i10, i2, (int) (f2 - i10), i3);
        } else if (f5 > 1.0f) {
            int i11 = (int) (f5 / 2.0f);
            rect.set(0, i2 + i11, i9, i3 + i11);
            rect2.set(i7, i5 + i11, i8, i6 + i11);
        }
        if (z2) {
            f72221lv5 = rect;
            f72199bo = rect2;
        } else {
            f29556a = rect;
            f72201ch = rect2;
        }
        m17968q(z2, f2, f3, f4, f5, f6, f7);
        m17970y(z2, f2, f3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: y */
    public static void m17970y(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (int) ((241.0f * f3) / f7);
        int i2 = (int) (f3 - f8);
        int i3 = (int) f2;
        int i4 = (int) f3;
        Rect rect = new Rect(0, i2, i3, i4);
        if (f4 >= 1.0f) {
            int i5 = ((int) f4) / 2;
            rect.set(i5, i2, (int) (f2 - i5), i4);
        } else if (f5 > 1.0f) {
            float f9 = f3 - ((int) (f5 / 2.0f));
            rect.set(0, (int) (f9 - f8), i3, (int) f9);
        }
        if (z2) {
            f29575u = rect;
            f72233t8iq = rect;
        } else {
            f29576x = rect;
            f72243zp = rect;
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m17971z() {
        return Build.IS_TABLET;
    }

    private static void zurt() {
        f72197a98o.setEmpty();
        f29556a.setEmpty();
        f72243zp.setEmpty();
        f29576x.setEmpty();
        f72201ch.setEmpty();
    }

    private static void zy(boolean z2, float f2, float f3, float f4, float f5, float f6, float f7) {
        f7l8(z2 ? f29572r : "clock_style_rect", f2, f3);
    }
}
