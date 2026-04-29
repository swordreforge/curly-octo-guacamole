package gcp;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.kja0;
import com.miui.clock.module.n7h;
import com.miui.clock.module.qrj;
import com.miui.clock.module.x2;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: FontUtils.java */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f77017cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f77018f7l8 = 280;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static SparseArray<Map<String, Typeface>> f77019fn3e = null;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static Map<String, Typeface> f77020fu4 = null;

    /* JADX INFO: renamed from: g */
    public static final int f35031g = 250;

    /* JADX INFO: renamed from: h */
    private static final String f35032h = m22297g();

    /* JADX INFO: renamed from: i */
    private static Map<String, String> f35033i = null;

    /* JADX INFO: renamed from: k */
    private static final String f35034k = "FontUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f77021ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f77022kja0 = 520;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f77023ld6 = 380;

    /* JADX INFO: renamed from: n */
    private static final String f35035n = "miclock-serif-tc-regular";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f77024n7h = 500;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static Map<String, Typeface> f77025ni7 = null;

    /* JADX INFO: renamed from: p */
    public static final int f35036p = 380;

    /* JADX INFO: renamed from: q */
    private static final String f35037q = "miclock-serif-sc-regular";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f77026qrj = 450;

    /* JADX INFO: renamed from: s */
    public static final int f35038s = 330;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f77027t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f77028toq = "miclock-beihaibei-sc-regular";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f77029x2 = 430;

    /* JADX INFO: renamed from: y */
    public static final int f35039y = 305;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static Map<String, Typeface> f77030zurt = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f77031zy = "miclock-beihaibei-tc-regular";

    static {
        String str = Build.VERSION.SDK_INT > 33 ? "/system/product/" : "/system/";
        f77017cdj = str;
        f77021ki = str + "fonts/MiSansRoundedSC.ttf";
        f77027t8r = str + "fonts/MiSansRoundedTC.ttf";
        f35033i = new HashMap();
        f77019fn3e = new SparseArray<>();
        f77030zurt = new HashMap();
        f77025ni7 = new HashMap();
        f77020fu4 = new HashMap();
    }

    public static boolean cdj() {
        return Locale.ENGLISH.getLanguage().equals(Locale.getDefault().getLanguage()) || Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage());
    }

    public static Typeface f7l8() {
        String strM22304y = m22304y();
        Typeface typeface = f77020fu4.get(strM22304y);
        if (typeface != null || TextUtils.isEmpty(strM22304y)) {
            return typeface;
        }
        Typeface typefaceBuild = new Typeface.Builder(strM22304y).setFontVariationSettings("'wght' 630").build();
        f77020fu4.put(strM22304y, typefaceBuild);
        return typefaceBuild;
    }

    /* JADX INFO: renamed from: g */
    private static String m22297g() {
        return SystemProperties.get("ro.miui.ui.font.mi_font_path", "/system/fonts/MiSansVF.ttf");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m22298h(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.toString(str.charAt(i2)).matches("[\\u0021-\\u00FF\\u0100-\\u017F]") && !Character.toString(str.charAt(i2)).matches("[周週一二三四五六日]")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m22299k() {
        Log.d(f35034k, "clear classic clock typeface cache");
    }

    public static void ki(TextView textView, int i2, boolean z2) {
        Typeface typefaceM22300n;
        int i3;
        if (textView == null) {
            return;
        }
        float f2 = -0.06f;
        switch (i2) {
            case 22:
                if (!z2) {
                    typefaceM22300n = m22300n(250);
                    i3 = C5049g.q.f29032o;
                    f2 = -0.02f;
                } else {
                    typefaceM22300n = m22300n(f77018f7l8);
                    i3 = C5049g.q.f29027j;
                }
                break;
            case 23:
                if (!z2) {
                    typefaceM22300n = m22300n(f77026qrj);
                    i3 = C5049g.q.f29032o;
                    f2 = -0.02f;
                } else {
                    typefaceM22300n = m22300n(520);
                    i3 = C5049g.q.f29027j;
                }
                break;
            case 24:
                boolean zKja0 = kja0();
                if (!z2) {
                    typefaceM22300n = m22303s(330, !zKja0);
                    i3 = C5049g.q.f29032o;
                    f2 = -0.02f;
                } else {
                    typefaceM22300n = m22303s(f77029x2, !zKja0);
                    i3 = C5049g.q.f29027j;
                }
                break;
            case 25:
                typefaceM22300n = m22301p(!kja0() ? f77028toq : f77031zy);
                if (!z2) {
                    i3 = C5049g.q.f29030m;
                    f2 = -0.02f;
                } else {
                    i3 = C5049g.q.f29027j;
                    f2 = -0.04f;
                }
                break;
            case 26:
                boolean zKja02 = kja0();
                if (z2) {
                    i3 = C5049g.q.f29027j;
                } else {
                    i3 = C5049g.q.f29032o;
                    f2 = -0.02f;
                }
                typefaceM22300n = m22301p(!zKja02 ? f35037q : f35035n);
                break;
            default:
                if (!z2) {
                    typefaceM22300n = m22300n(305);
                    i3 = C5049g.q.f29032o;
                    f2 = -0.02f;
                } else {
                    typefaceM22300n = m22300n(330);
                    i3 = C5049g.q.f29027j;
                }
                break;
        }
        textView.setLetterSpacing(f2);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(i3) * C6062n.m22318k(textView.getContext()));
        textView.setTypeface(typefaceM22300n);
    }

    public static boolean kja0() {
        return TextUtils.equals("zh_TW", Locale.getDefault().toString()) || TextUtils.equals("zh_HK", Locale.getDefault().toString());
    }

    public static Typeface ld6(int i2) {
        return i2 != 22 ? m22300n(380) : m22300n(330);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[PHI: r1
      0x0049: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v11 java.lang.String) binds: [B:3:0x0017, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m22300n(int r6) {
        /*
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, java.lang.String> r1 = gcp.f7l8.f35033i
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "FontUtils"
            r4 = 0
            if (r2 == 0) goto L49
            java.lang.String r1 = m22304y()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L29
            java.lang.String r6 = "failed to getMiuiFontPathByLocale, defaultFontPath is null"
            android.util.Log.w(r3, r6)
            return r4
        L29:
            java.util.Map<java.lang.String, java.lang.String> r2 = gcp.f7l8.f35033i
            r2.put(r0, r1)
            android.util.SparseArray<java.util.Map<java.lang.String, android.graphics.Typeface>> r0 = gcp.f7l8.f77019fn3e
            int r2 = r1.hashCode()
            boolean r0 = gcp.C6060g.m22305k(r0, r2)
            if (r0 != 0) goto L49
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.util.SparseArray<java.util.Map<java.lang.String, android.graphics.Typeface>> r2 = gcp.f7l8.f77019fn3e
            int r5 = r1.hashCode()
            r2.put(r5, r0)
            goto L4a
        L49:
            r0 = r4
        L4a:
            if (r0 != 0) goto L58
            android.util.SparseArray<java.util.Map<java.lang.String, android.graphics.Typeface>> r0 = gcp.f7l8.f77019fn3e
            int r1 = r1.hashCode()
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
        L58:
            if (r0 != 0) goto L60
            java.lang.String r6 = "failed to load misans, miSansTypefaceMap is null"
            android.util.Log.w(r3, r6)
            return r4
        L60:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.Object r1 = r0.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L79
            android.graphics.Typeface r1 = toq(r6)
            if (r1 == 0) goto L79
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.put(r6, r1)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gcp.f7l8.m22300n(int):android.graphics.Typeface");
    }

    public static boolean n7h(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.toString(str.charAt(i2)).matches("[\\u0061-\\u007A\\u0041-\\u005A]")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static Typeface m22301p(String str) {
        Typeface typeface = f77025ni7.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        f77025ni7.put(str, typefaceCreate);
        return typefaceCreate;
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC5071k m22302q(int i2) {
        switch (i2) {
            case 22:
                return new x2();
            case 23:
                return new com.miui.clock.module.ld6();
            case 24:
                return new n7h();
            case 25:
                return new com.miui.clock.module.f7l8();
            case 26:
                return new kja0();
            default:
                return new qrj();
        }
    }

    public static boolean qrj(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.toString(str.charAt(i2)).matches("[周週一二三四五六日]")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static Typeface m22303s(int i2, boolean z2) {
        String str = String.valueOf(i2) + String.valueOf(z2);
        Typeface typeface = f77030zurt.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceBuild = new Typeface.Builder(z2 ? f77021ki : f77027t8r).setFontVariationSettings("'wght' " + i2).build();
        f77030zurt.put(str, typefaceBuild);
        return typefaceBuild;
    }

    public static void t8r(TextView textView, int i2) {
        Typeface typefaceM22300n;
        if (textView == null) {
            return;
        }
        float f2 = -0.02f;
        switch (i2) {
            case 22:
                typefaceM22300n = m22300n(250);
                break;
            case 23:
                typefaceM22300n = m22300n(f77029x2);
                break;
            case 24:
                typefaceM22300n = m22303s(330, true);
                break;
            case 25:
                typefaceM22300n = m22301p(f77028toq);
                f2 = 0.0f;
                break;
            case 26:
                typefaceM22300n = m22301p(f35037q);
                break;
            default:
                typefaceM22300n = m22300n(305);
                break;
        }
        textView.setLetterSpacing(f2);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(C5049g.q.f71652vyq) * C6062n.m22318k(textView.getContext()));
        textView.setTypeface(typefaceM22300n);
    }

    public static Typeface toq(int i2) {
        Typeface$CustomFallbackBuilder typeface$CustomFallbackBuilder;
        List<String> listZy = zy();
        if (listZy == null) {
            Log.w(f35034k, "failed to getMiproFileList, miproFiles is null");
            return null;
        }
        try {
            typeface$CustomFallbackBuilder = null;
            for (String str : listZy) {
                try {
                    if (new File(str).exists()) {
                        Font.Builder builder = new Font.Builder(new File(str));
                        builder.setFontVariationSettings("'wght' " + i2);
                        FontFamily fontFamilyBuild = new FontFamily.Builder(builder.build()).build();
                        if (fontFamilyBuild != null) {
                            if (typeface$CustomFallbackBuilder == null) {
                                typeface$CustomFallbackBuilder = new Typeface$CustomFallbackBuilder(fontFamilyBuild);
                            } else {
                                typeface$CustomFallbackBuilder.addCustomFallback(fontFamilyBuild);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e(f35034k, "create mipro typeface error, ", e);
                }
            }
        } catch (Exception e3) {
            e = e3;
            typeface$CustomFallbackBuilder = null;
        }
        if (typeface$CustomFallbackBuilder == null) {
            return null;
        }
        return Typeface.create(typeface$CustomFallbackBuilder.build(), i2, false);
    }

    public static Typeface x2(int i2) {
        return i2 != 22 ? m22300n(520) : m22300n(330);
    }

    /* JADX INFO: renamed from: y */
    public static String m22304y() {
        try {
            return (String) Class.forName("miui.util.font.MultiLangHelper").getMethod("getMiuiFontPathByLocale", Locale.class).invoke(null, Locale.getDefault());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static List<String> zy() {
        try {
            return (List) Class.forName("miui.util.font.MultiLangHelper").getMethod("getMiproFileList", Locale.class).invoke(null, Locale.getDefault());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
