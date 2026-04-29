package com.google.android.exoplayer2.util;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import com.google.common.base.C4258g;
import com.market.sdk.utils.C5016s;
import com.miui.clock.module.toq;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import miuix.view.C7385p;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class lrht {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int[] f67033cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f67034f7l8 = "Util";

    /* JADX INFO: renamed from: g */
    public static final byte[] f23228g;

    /* JADX INFO: renamed from: h */
    private static final String[] f23229h;

    /* JADX INFO: renamed from: k */
    public static final int f23230k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int[] f67035ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String[] f67036kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Pattern f67037ld6;

    /* JADX INFO: renamed from: n */
    public static final String f23231n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @zy.dd
    private static HashMap<String, String> f67038n7h = null;

    /* JADX INFO: renamed from: p */
    private static final Pattern f23232p;

    /* JADX INFO: renamed from: q */
    public static final String f23233q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f67039qrj = "format=mpd-time-csf";

    /* JADX INFO: renamed from: s */
    private static final Pattern f23234s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f67040toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f67041x2 = "format=m3u8-aapl";

    /* JADX INFO: renamed from: y */
    private static final Pattern f23235y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f67042zy;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f23230k = i2;
        String str = Build.DEVICE;
        f67040toq = str;
        String str2 = Build.MANUFACTURER;
        f67042zy = str2;
        String str3 = Build.MODEL;
        f23233q = str3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i2);
        f23231n = sb.toString();
        f23228g = new byte[0];
        f23235y = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f23234s = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f23232p = Pattern.compile("%([A-Fa-f0-9]{2})");
        f67037ld6 = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f67036kja0 = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", C5016s.f69017toq, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f23229h = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f67033cdj = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f67035ki = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, toq.zy.f29237p, C7385p.f92249o1t, C7385p.f42281z, 202, 205, 144, 151, 158, 153, 140, UICard.LARGE_ICONS_APP_SEARCH_CARD, 130, UIElement.PURE_AD_DSP_BANNER, 168, 175, 166, 161, 180, 179, 186, com.google.android.exoplayer2.extractor.ts.wvg.f64656ni7, 199, com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4, 201, toq.zy.f72000f7l8, 219, 220, 213, toq.zy.f72001ld6, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, com.google.android.exoplayer2.extractor.ts.gvn7.f64459eqxt, 165, 162, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM, 136, 129, 134, 147, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, UIElement.HOMEPAGE_SILDE_AD_CARD, 142, 135, 128, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD, ThemeStatus.Try.END, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, 229, 226, 235, 236, C7385p.f92248ni7, 198, toq.zy.f29240y, 200, 221, 218, toq.zy.f72004x2, toq.zy.f72002qrj, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, ThemeStatus.Redeem.REDEEMING, 167, 178, 181, com.google.android.exoplayer2.extractor.ts.gvn7.f64478wvg, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, toq.zy.f29239s, 215, C7385p.f92239fu4, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private lrht() {
    }

    /* JADX INFO: renamed from: a */
    public static int m13652a(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 == 24) {
            return 536870912;
        }
        if (i2 != 32) {
            return 0;
        }
        return C3548p.f65193jp0y;
    }

    public static File a9(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) C3844k.f7l8(context.getCacheDir()));
    }

    public static long a98o(long j2) {
        return j2 == C3548p.f65257toq ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public static String m13653b(Locale locale) {
        return f23230k >= 21 ? bf2(locale) : locale.toString();
    }

    public static long[] b3e(List<Long> list, long j2, long j3) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j4;
                i2++;
            }
        } else if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = (long) (list.get(i2).longValue() * d2);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j5;
                i2++;
            }
        }
        return jArr;
    }

    public static void bek6(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
            return;
        }
        long j5 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] * j5;
            i2++;
        }
    }

    @zy.hyr(21)
    private static String bf2(Locale locale) {
        return locale.toLanguageTag();
    }

    @zy.hyr(24)
    private static String[] bo(Configuration configuration) {
        return mbx(configuration.getLocales().toLanguageTags(), ",");
    }

    public static long bwp(String str) throws sok {
        Matcher matcher = f23235y.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw sok.createForMalformedContainer(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "), null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase(com.market.sdk.reflect.toq.f68929toq)) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (C5658n.f73185t8r.equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
    }

    public static void bz2(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                bz2(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static Point m13654c(Context context) {
        DisplayManager displayManager;
        Display display = (f23230k < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) C3844k.f7l8((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return lrht(context, display);
    }

    public static String c8jq(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
            default:
                if (i2 < 10000) {
                    return "?";
                }
                StringBuilder sb = new StringBuilder(20);
                sb.append("custom (");
                sb.append(i2);
                sb.append(")");
                return sb.toString();
            case 0:
                return "default";
            case 1:
                return wvg.f67137toq;
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return C3678q.f22052z;
            case 6:
                return "camera motion";
        }
    }

    public static int cdj(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static <T> T[] cfr(T[] tArr, T t2) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t2;
        return (T[]) x2(objArrCopyOf);
    }

    public static long ch(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    private static boolean cv06(char c2) {
        return c2 == '\"' || c2 == '%' || c2 == '*' || c2 == '/' || c2 == ':' || c2 == '<' || c2 == '\\' || c2 == '|' || c2 == '>' || c2 == '?';
    }

    /* JADX INFO: renamed from: d */
    public static int m13655d(String str) {
        String strF7l8 = com.google.common.base.zy.f7l8(str);
        if (strF7l8.endsWith(".mpd")) {
            return 0;
        }
        if (strF7l8.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f67037ld6.matcher(strF7l8);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains(f67039qrj)) {
            return 0;
        }
        return strGroup.contains(f67041x2) ? 2 : 1;
    }

    @zy.dd
    public static String d2ok(int i2) {
        if (i2 == 0) {
            return wvg.f23295a;
        }
        if (i2 == 1) {
            return wvg.f23317x;
        }
        if (i2 != 2) {
            return null;
        }
        return wvg.f67149zp;
    }

    public static String d3(byte[] bArr) {
        return new String(bArr, C4258g.f68103zy);
    }

    @zy.hyr(api = 24)
    private static boolean d8wk(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) C3844k.f7l8(uri.getHost()));
    }

    public static int dd(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 1) {
            return 13;
        }
        if (i2 == 2) {
            return 6;
        }
        int i3 = 4;
        if (i2 != 4) {
            i3 = 5;
            if (i2 != 5) {
                return i2 != 8 ? 1 : 3;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static byte[] m28265do(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static byte[] dr(String str) {
        return str.getBytes(C4258g.f68103zy);
    }

    /* JADX INFO: renamed from: e */
    public static Locale m13656e() {
        return f23230k >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static long ebn(int i2, int i3) {
        return pc(i3) | (pc(i2) << 32);
    }

    public static int ek5k(@zy.dd String str) {
        String[] strArrMbx;
        int length;
        if (str == null || (length = (strArrMbx = mbx(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrMbx[length - 1];
        boolean z2 = length >= 3 && "neg".equals(strArrMbx[length - 2]);
        try {
            int i2 = Integer.parseInt((String) C3844k.f7l8(str2));
            return z2 ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @zy.hyr(21)
    public static int eqxt(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(wvg.f67137toq);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static ExecutorService etdu(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return lrht.was(str, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static String m13657f(@zy.dd Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.zy.m15459p(networkCountryIso);
            }
        }
        return com.google.common.base.zy.m15459p(Locale.getDefault().getCountry());
    }

    public static int f7l8(fu4 fu4Var, long j2, boolean z2, boolean z3) {
        int i2;
        int iZy = fu4Var.zy() - 1;
        int i3 = 0;
        while (i3 <= iZy) {
            int i4 = (i3 + iZy) >>> 1;
            if (fu4Var.toq(i4) < j2) {
                i3 = i4 + 1;
            } else {
                iZy = i4 - 1;
            }
        }
        if (z2 && (i2 = iZy + 1) < fu4Var.zy() && fu4Var.toq(i2) == j2) {
            return i2;
        }
        if (z3 && iZy == -1) {
            return 0;
        }
        return iZy;
    }

    public static boolean fn3e(Object[] objArr, @zy.dd Object obj) {
        for (Object obj2 : objArr) {
            if (zy(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean fnq8(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static String fti(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (cv06(str.charAt(i4))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i3 * 2) + length);
        while (i3 > 0) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cv06(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i3--;
            } else {
                sb.append(cCharAt);
            }
            i2 = i5;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        return sb.toString();
    }

    public static Handler fu4(Looper looper, @zy.dd Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* JADX INFO: renamed from: g */
    public static int m13658g(long[] jArr, long j2, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = z2 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z3 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static boolean g1(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int gbni(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static boolean gc3c(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String gvn7(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String gyi(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(str3);
        sb.append(") ");
        sb.append(c8jq.f63544zy);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m13659h(@zy.dd Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void h7am(Throwable th) throws Throwable {
        vep5(th);
    }

    @zy.hyr(17)
    private static void hb(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String hyr(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static long m13660i(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long i1(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static boolean i9jn(Activity activity, Uri... uriArr) {
        if (f23230k < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (wo(uri)) {
                return jz5(activity);
            }
        }
        return false;
    }

    public static CharSequence ij(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static int ikck(Uri uri, @zy.dd String str) {
        if (TextUtils.isEmpty(str)) {
            return m13673v(uri);
        }
        String strValueOf = String.valueOf(str);
        return m13655d(strValueOf.length() != 0 ? ".".concat(strValueOf) : new String("."));
    }

    public static boolean ixz(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    @zy.hyr(23)
    /* JADX INFO: renamed from: j */
    private static void m13661j(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static String[] jbh(String str, String str2) {
        return str.split(str2, 2);
    }

    public static File jk(Context context, String str) throws IOException {
        File fileA9 = a9(context, str);
        fileA9.delete();
        fileA9.mkdir();
        return fileA9;
    }

    public static Uri jp0y(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f67037ld6.matcher(com.google.common.base.zy.f7l8(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    @zy.hyr(api = 23)
    private static boolean jz5(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static <T> void kcsr(List<T> list, T[] tArr) {
        C3844k.m13633s(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static float ki(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean kja0(tfm... tfmVarArr) {
        if (f23230k < 24) {
            return true;
        }
        for (tfm tfmVar : tfmVarArr) {
            tfm.C3701y c3701y = tfmVar.f22150q;
            if (c3701y != null) {
                if (d8wk(c3701y.f22207k)) {
                    return false;
                }
                for (int i2 = 0; i2 < tfmVar.f22150q.f65990f7l8.size(); i2++) {
                    if (d8wk(tfmVar.f22150q.f65990f7l8.get(i2).f22181k)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static long ktq(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (j2 * (j3 / j4));
    }

    /* JADX INFO: renamed from: l */
    public static int m13663l(@zy.dd String str, int i2) {
        int i3 = 0;
        for (String str2 : yl(str)) {
            if (i2 == wvg.n7h(str2)) {
                i3++;
            }
        }
        return i3;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T ld6(@zy.dd T t2) {
        return t2;
    }

    public static Point lrht(Context context, Display display) {
        if (display.getDisplayId() == 0 && g1(context)) {
            String strY2 = f23230k < 28 ? y2("sys.display-size") : y2("vendor.display-size");
            if (!TextUtils.isEmpty(strY2)) {
                try {
                    String[] strArrMbx = mbx(strY2.trim(), AnimatedProperty.PROPERTY_NAME_X);
                    if (strArrMbx.length == 2) {
                        int i2 = Integer.parseInt(strArrMbx[0]);
                        int i3 = Integer.parseInt(strArrMbx[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strY2);
                ni7.m13702q(f67034f7l8, strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f67042zy) && f23233q.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i4 = f23230k;
        if (i4 >= 23) {
            m13661j(display, point);
        } else if (i4 >= 17) {
            hb(display, point);
        } else {
            nn86(display, point);
        }
        return point;
    }

    public static boolean ltg8(Activity activity, tfm... tfmVarArr) {
        if (f23230k < 23) {
            return false;
        }
        for (tfm tfmVar : tfmVarArr) {
            tfm.C3701y c3701y = tfmVar.f22150q;
            if (c3701y != null) {
                if (wo(c3701y.f22207k)) {
                    return jz5(activity);
                }
                for (int i2 = 0; i2 < tfmVar.f22150q.f65990f7l8.size(); i2++) {
                    if (wo(tfmVar.f22150q.f65990f7l8.get(i2).f22181k)) {
                        return jz5(activity);
                    }
                }
            }
        }
        return false;
    }

    public static String lv5(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == C3548p.f65257toq) {
            j2 = 0;
        }
        String str = j2 < 0 ? C5658n.f73185t8r : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static int lvui(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 8) ? 4 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: m */
    public static int m13664m(int i2) {
        if (i2 == 2 || i2 == 4) {
            return yqrt.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return yqrt.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return yqrt.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return yqrt.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static <T> void m4(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static String[] mbx(String str, String str2) {
        return str.split(str2, -1);
    }

    private static HashMap<String, String> mcp() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f67036kja0.length);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f67036kja0;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int mu(Uri uri, @zy.dd String str) {
        if (str == null) {
            return m13673v(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m13665n(int[] iArr, int i2, boolean z2, boolean z3) {
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= iArr.length) {
                    break;
                }
            } while (iArr[iBinarySearch] == i2);
            i3 = z2 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z3 ? Math.min(iArr.length - 1, i3) : i3;
    }

    public static void n2t(Parcel parcel, boolean z2) {
        parcel.writeInt(z2 ? 1 : 0);
    }

    @zy.dd
    public static String n5r1(@zy.dd String str, int i2) {
        String[] strArrYl = yl(str);
        if (strArrYl.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrYl) {
            if (i2 == wvg.n7h(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static long n7h(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static byte[] ncyb(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static int ni7(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = f67035ki[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static int nmn5(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    private static void nn86(Display display, Point point) {
        display.getSize(point);
    }

    @zy.dd
    public static String nsb(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f23232p.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char c2 = (char) Integer.parseInt((String) C3844k.f7l8(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    @zy.dd
    /* JADX INFO: renamed from: o */
    public static UUID m13666o(String str) {
        String strF7l8 = com.google.common.base.zy.f7l8(str);
        strF7l8.hashCode();
        switch (strF7l8) {
            case "playready":
                return C3548p.f65162ew;
            case "widevine":
                return C3548p.f65247r25n;
            case "clearkey":
                return C3548p.f65226nme;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static Handler o1t(@zy.dd Handler.Callback callback) {
        return fu4((Looper) C3844k.ld6(Looper.myLooper()), callback);
    }

    public static String oc(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, C4258g.f68103zy);
    }

    /* JADX INFO: renamed from: p */
    public static int m13667p(long[] jArr, long j2, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = z2 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z3 ? Math.max(0, i2) : i2;
    }

    public static long pc(int i2) {
        return ((long) i2) & 4294967295L;
    }

    private static String py(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = f23229h;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                String strValueOf = String.valueOf(strArr[i2 + 1]);
                String strValueOf2 = String.valueOf(str.substring(strArr[i2].length()));
                return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            }
            i2 += 2;
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T extends Comparable<? super T>> int m13668q(List<? extends Comparable<? super T>> list, T t2, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t2);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t2) == 0);
            i2 = z2 ? iBinarySearch - 1 : iBinarySearch;
        }
        return z3 ? Math.min(list.size() - 1, i2) : i2;
    }

    public static boolean qkj8(Context context) {
        return f23230k >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean qo(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static int qrj(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    /* JADX INFO: renamed from: r */
    public static int m13669r(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = f23230k;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    @zy.hyr(18)
    public static long r8s8(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
        }
        return jMin;
    }

    /* JADX INFO: renamed from: s */
    public static int m13670s(int[] iArr, int i2, boolean z2, boolean z3) {
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i2);
            i3 = z2 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z3 ? Math.max(0, i3) : i3;
    }

    public static long se(String str) {
        Matcher matcher = f23234s.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d4 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d5 = d4 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d7 = d6 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d7 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static String sok(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C3548p.f65138bwp)) {
            str = strReplace;
        }
        String strF7l8 = com.google.common.base.zy.f7l8(str);
        String str2 = jbh(strF7l8, C5658n.f73185t8r)[0];
        if (f67038n7h == null) {
            f67038n7h = mcp();
        }
        String str3 = f67038n7h.get(str2);
        if (str3 != null) {
            String strValueOf = String.valueOf(strF7l8.substring(str2.length()));
            strF7l8 = strValueOf.length() != 0 ? str3.concat(strValueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? py(strF7l8) : strF7l8;
    }

    /* JADX INFO: renamed from: t */
    public static Handler m13671t(@zy.dd Handler.Callback callback) {
        return fu4(uv6(), callback);
    }

    public static String[] t8iq() {
        String[] strArrM13672u = m13672u();
        for (int i2 = 0; i2 < strArrM13672u.length; i2++) {
            strArrM13672u[i2] = sok(strArrM13672u[i2]);
        }
        return strArrM13672u;
    }

    public static int t8r(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static boolean tfm(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static long toq(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    /* JADX INFO: renamed from: u */
    private static String[] m13672u() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f23230k >= 24 ? bo(configuration) : new String[]{m13653b(configuration.locale)};
    }

    @zy.dd
    public static ComponentName uc(Context context, Intent intent) {
        return f23230k >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static <T> void uj2j(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static String ukdy(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i2] & com.google.common.base.zy.f68111cdj, 16));
        }
        return sb.toString();
    }

    public static Looper uv6() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: v */
    public static int m13673v(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && com.google.common.base.zy.m15457k("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        return m13655d(path);
    }

    public static long v0af(long j2) {
        return (j2 == C3548p.f65257toq || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static boolean vq(gvn7 gvn7Var, gvn7 gvn7Var2, @zy.dd Inflater inflater) {
        if (gvn7Var.m13594k() <= 0) {
            return false;
        }
        if (gvn7Var2.toq() < gvn7Var.m13594k()) {
            gvn7Var2.zy(gvn7Var.m13594k() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(gvn7Var.m13598q(), gvn7Var.m13596n(), gvn7Var.m13594k());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(gvn7Var2.m13598q(), iInflate, gvn7Var2.toq() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == gvn7Var2.toq()) {
                        gvn7Var2.zy(gvn7Var2.toq() * 2);
                    }
                } else {
                    gvn7Var2.m13595l(iInflate);
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static Uri vyq(String str, String str2) {
        String strEncodeToString = Base64.encodeToString(str2.getBytes(), 2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(strEncodeToString).length());
        sb.append("data:");
        sb.append(str);
        sb.append(";base64,");
        sb.append(strEncodeToString);
        return Uri.parse(sb.toString());
    }

    public static <T> T[] w831(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread was(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static boolean wo(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Handler wvg() {
        return m13671t(null);
    }

    public static long wx16(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    /* JADX INFO: renamed from: x */
    public static int m13674x(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] x2(T[] tArr) {
        return tArr;
    }

    public static int x9kr(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static byte[] xwq3(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static <T extends Comparable<? super T>> int m13675y(List<? extends Comparable<? super T>> list, T t2, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t2) == 0);
            i2 = z2 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z3 ? Math.max(0, i2) : i2;
    }

    @zy.dd
    private static String y2(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(str);
            ni7.m13700n(f67034f7l8, strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    public static int y9n(String str) {
        int length = str.length();
        C3844k.m13629k(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    public static String[] yl(@zy.dd String str) {
        return TextUtils.isEmpty(str) ? new String[0] : mbx(str.trim(), "(\\s*,\\s*)");
    }

    public static <T> T[] yqrt(T[] tArr, int i2, int i3) {
        C3844k.m13629k(i2 >= 0);
        C3844k.m13629k(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static String yz(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: z */
    public static Handler m13676z() {
        return o1t(null);
    }

    public static <T> T[] z4(T[] tArr, int i2) {
        C3844k.m13629k(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static boolean zkd(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static xwq3 zp(int i2, int i3, int i4) {
        return new xwq3.toq().m13945m(wvg.f67095d3).gvn7(i3).ek5k(i4).vyq(i2).a9();
    }

    public static int zsr0(long[] jArr, long j2) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (jArr[i2] == j2) {
                return i2;
            }
        }
        return -1;
    }

    public static int zurt(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = f67033cdj[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static long zwy(long j2) {
        return (j2 == C3548p.f65257toq || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static boolean zy(@zy.dd Object obj, @zy.dd Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static <T extends Throwable> void vep5(Throwable th) throws Throwable {
        throw th;
    }
}
