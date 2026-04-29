package com.miui.lockscreeninfo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.core.util.SystemProperties;
import o05.C7418g;

/* JADX INFO: renamed from: com.miui.lockscreeninfo.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5118q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f72119f7l8;

    /* JADX INFO: renamed from: g */
    public static final boolean f29437g;

    /* JADX INFO: renamed from: k */
    protected static final String f29438k = "com.miui.lockscreeninfo.c";

    /* JADX INFO: renamed from: n */
    public static final boolean f29439n;

    /* JADX INFO: renamed from: q */
    public static final boolean f29440q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static List<String> f72120toq = Arrays.asList("corot");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f72121zy = "tablet".equals(SystemProperties.get("ro.build.characteristics", "default"));

    static {
        f29440q = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
        f29439n = SystemProperties.getBoolean("persist.sys.background_blur_supported", false);
        f29437g = SystemProperties.getBoolean("persist.sys.background_blur_keyguard_disabled", false);
        f72119f7l8 = SystemProperties.getInt("persist.sys.background_blur_version", 0);
    }

    public static boolean cdj(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static boolean f7l8(int i2) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(i2);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || unicodeBlockOf == Character.UnicodeBlock.HANGUL_SYLLABLES || unicodeBlockOf == Character.UnicodeBlock.HANGUL_JAMO || unicodeBlockOf == Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO || unicodeBlockOf == Character.UnicodeBlock.HIRAGANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || unicodeBlockOf == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlockOf == Character.UnicodeBlock.GENERAL_PUNCTUATION;
    }

    public static boolean fn3e(Context context) {
        return "com.android.systemui".equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17818g(char c2) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c2);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17819h(int i2) {
        return Character.toString((char) i2).matches("[\\uD83C-\\uDBFF\\uDC00-\\uDFFF]+");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17820i(Context context) {
        String str = Build.DEVICE;
        return (TextUtils.equals(str, "zizhan") || TextUtils.equals(str, "babylon")) && !cdj(context);
    }

    /* JADX INFO: renamed from: k */
    public static float m17821k(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp / m17825s(context);
    }

    public static boolean ki() {
        return f72119f7l8 >= 2;
    }

    public static boolean kja0(char c2) {
        return c2 >= 3840 && c2 <= 4095;
    }

    public static boolean ld6() {
        String str = SystemProperties.get("persist.sys.miui_resolution");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split(",");
        return strArrSplit[0].equals("1440") && strArrSplit[1].equals("3200");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17822n() {
        if (ld6() && f29437g) {
            return false;
        }
        return !f72120toq.contains(Build.DEVICE) || ki();
    }

    public static boolean n7h() {
        return TextUtils.equals(Build.DEVICE, "cetus");
    }

    /* JADX INFO: renamed from: p */
    public static void m17823p(View view) {
        if (view == null) {
            Log.d(f29438k, "clearMemberBlendColor view is null");
            return;
        }
        try {
            C7418g.f7l8(view, 0);
            C7418g.m26812k(view);
            Log.d(f29438k, "clearMemberBlendColor view :" + view);
        } catch (Exception e2) {
            Log.e(f29438k, "clearMemberBlendColor error , view :" + view);
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m17824q(View view, boolean z2, int i2, int i3, int i4) {
        if (view == null || !f29439n) {
            Log.d(f29438k, "setMemberBlendColor view is null");
            return;
        }
        try {
            C7418g.f7l8(view, 3);
            int iArgb = Color.argb(i3, Color.red(i2), Color.green(i2), Color.blue(i2));
            int iArgb2 = Color.argb(i3, 0, 0, 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Point(iArgb, 101));
            arrayList.add(z2 ? new Point(iArgb2, 105) : new Point(iArgb2, 103));
            if (ki()) {
                arrayList.add(new Point(i4, 1000));
            }
            C7418g.zy(view, arrayList);
            C7418g.m26814q(view, fn3e(view.getContext()));
            Log.i(f29438k, "setMemberBlendColor: view:" + view + ",colorDark:" + z2 + ",color:" + Integer.toHexString(iArgb) + ",labColor:" + Integer.toHexString(iArgb2));
        } catch (Exception e2) {
            Log.e(f29438k, "setMemberBlendColor error , view :" + view);
            e2.printStackTrace();
        }
    }

    public static boolean qrj(int i2) {
        return i2 < 32 || i2 == 127;
    }

    /* JADX INFO: renamed from: s */
    private static float m17825s(Context context) {
        if (n7h() && !cdj(context)) {
            return 320.0f;
        }
        if (n7h() && cdj(context)) {
            return 676.0f;
        }
        if (f29440q && cdj(context)) {
            return 696.0f;
        }
        return f72121zy ? 711.0f : 392.0f;
    }

    public static boolean t8r(char c2) {
        return c2 >= 1536 && c2 <= 1791;
    }

    public static void toq(View view) {
        if (view == null) {
            Log.d(f29438k, "clearContainerMiBackgroundBlur view is null");
            return;
        }
        try {
            C7418g.toq(view, 0);
            boolean zM26811g = C7418g.m26811g(view, false);
            Log.d(f29438k, "clearContainerPassBlur result :" + zM26811g + ", view: " + view);
        } catch (Exception e2) {
            Log.e(f29438k, "clearContainerMiBackgroundBlur error , view :" + view);
            e2.printStackTrace();
        }
    }

    public static boolean x2(char c2) {
        return c2 >= ' ' && c2 <= '~';
    }

    /* JADX INFO: renamed from: y */
    public static boolean m17826y(View view, int i2) {
        if (view == null) {
            Log.d(f29438k, "setPassBlur view is null");
            return false;
        }
        try {
            boolean zM26811g = C7418g.m26811g(view, fn3e(view.getContext()));
            C7418g.toq(view, 1);
            C7418g.m26813n(view, i2);
            Log.i(f29438k, "setContainerPassBlur result :" + zM26811g + ",view : " + view);
            return zM26811g;
        } catch (Exception e2) {
            Log.e(f29438k, "setContainerPassBlur error , view :" + view);
            e2.printStackTrace();
            return false;
        }
    }

    public static void zy(View view, boolean z2, int i2, int i3) {
        m17824q(view, z2, i2, 255, i3);
    }
}
