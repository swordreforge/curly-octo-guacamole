package cnbm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.Log;
import com.miui.miwallpaper.material.hct.toq;
import com.miui.miwallpaper.material.utils.C5284q;
import com.miui.miwallpaper.material.utils.zy;
import java.util.HashMap;
import java.util.Map;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: cnbm.k */
/* JADX INFO: compiled from: MiuiColorScheme.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1404k {

    /* JADX INFO: renamed from: g */
    private static double[] f7767g = null;

    /* JADX INFO: renamed from: k */
    private static String f7768k = "MiuiColorScheme";

    /* JADX INFO: renamed from: n */
    private static double[] f7769n;

    /* JADX INFO: renamed from: q */
    private static double[] f7770q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static double[] f55834toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static double[] f55835zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Map<String, double[]> f55833f7l8 = new HashMap();

    /* JADX INFO: renamed from: y */
    private static int[] f7771y = {0, 4, 7, 10, 12, 15, 18, 20, 30, 40, 50, 60, 70, 80, 85, 90, 93, 95, 97, 98, 99, 100};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @hyr(api = 30)
    public static Map f7l8(Context context, Bitmap bitmap, String str, int[] iArr) {
        HashMap map = new HashMap();
        if (str != null) {
            for (Map.Entry<String, Rect> entry : C5284q.t8r(context, str, iArr, bitmap.getWidth(), bitmap.getHeight()).entrySet()) {
                String key = entry.getKey();
                int iM5864g = -1;
                if (!entry.getValue().isEmpty()) {
                    iM5864g = m5864g(bitmap, false, entry.getValue());
                }
                map.put(key, Integer.valueOf(iM5864g));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5864g(Bitmap bitmap, boolean z2, Rect rect) {
        return (bitmap == null || (zy.x2(bitmap, z2, rect) & 1) == 1) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static String m5865k(int i2) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.alpha(i2)), Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)));
    }

    private static void ld6(int i2) {
        toq qVar = toq.toq(i2);
        double dM17889q = qVar.m17889q();
        double[] dArr = {dM17889q, Math.max(56.0d, qVar.zy())};
        f55834toq = dArr;
        f55835zy = new double[]{dM17889q, 24.0d};
        f7770q = new double[]{60.0d + dM17889q, 24.0d};
        f7769n = new double[]{dM17889q, 4.0d};
        f7767g = new double[]{dM17889q, 8.0d};
        f55833f7l8.put("primary", dArr);
        f55833f7l8.put("secondary", f55835zy);
        f55833f7l8.put("tertiary", f7770q);
        f55833f7l8.put("neutral", f7769n);
        f55833f7l8.put("neutral-variant", f7767g);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5866n(Bitmap bitmap, boolean z2) {
        return m5864g(bitmap, z2, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    /* JADX INFO: renamed from: p */
    public static Map<String, Map<String, Integer>> m5867p(Bitmap bitmap, @dd Map<String, Rect> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Rect> entry : map.entrySet()) {
            String key = entry.getKey();
            Map map3 = new HashMap();
            try {
                map3 = m5869s(bitmap, entry.getValue());
            } catch (Exception e2) {
                Log.d(f7768k, "getMiuiWallpaperPalette failed" + e2);
            }
            map2.put(key, map3);
        }
        return map2;
    }

    @hyr(api = 30)
    /* JADX INFO: renamed from: q */
    public static boolean m5868q(Context context, Bitmap bitmap, String str, int i2, int i3, String str2) {
        return str == null ? m5866n(bitmap, false) : m5864g(bitmap, false, C5284q.t8r(context, str, new int[]{i2, i3}, bitmap.getWidth(), bitmap.getHeight()).get(str2));
    }

    /* JADX INFO: renamed from: s */
    public static Map<String, Integer> m5869s(Bitmap bitmap, @dd Rect rect) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return (rect == null || rect.isEmpty()) ? zy(zy.f7l8(bitmap)) : zy(zy.m17984y(bitmap, rect));
    }

    public static Bitmap toq(Bitmap bitmap, Rect rect) {
        int i2 = rect.right;
        int i3 = rect.left;
        int i4 = i2 - i3;
        int i5 = rect.bottom;
        int i6 = rect.top;
        try {
            return Bitmap.createBitmap(bitmap, i3, i6, i4, i5 - i6);
        } catch (Exception e2) {
            Log.d(f7768k, "crop bitmap failed" + e2);
            return null;
        }
    }

    public static boolean x2(String str) {
        return str.startsWith("status_bar_rect");
    }

    @hyr(api = 30)
    /* JADX INFO: renamed from: y */
    public static Map m5870y(Context context, Bitmap bitmap, String str, int i2, int i3, String str2, @dd Rect rect) {
        return str == null ? m5869s(bitmap, rect) : ("doodle".equals(str) || "smart_frame".equals(str)) ? m5869s(bitmap, null) : m5869s(bitmap, C5284q.t8r(context, str, new int[]{i2, i3}, bitmap.getWidth(), bitmap.getHeight()).get(str2));
    }

    public static Map<String, Integer> zy(int i2) {
        ld6(i2);
        HashMap map = new HashMap();
        for (Map.Entry<String, double[]> entry : f55833f7l8.entrySet()) {
            String key = entry.getKey();
            for (int i3 = 0; i3 < f7771y.length; i3++) {
                double[] value = entry.getValue();
                map.put(key + f7771y[i3], Integer.valueOf(com.miui.miwallpaper.material.hct.zy.ki(value[0], value[1], f7771y[i3])));
            }
        }
        Log.d(f7768k, "generatePalette: miuiPalette =  " + map.toString());
        return map;
    }
}
