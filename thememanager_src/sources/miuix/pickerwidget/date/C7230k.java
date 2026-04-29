package miuix.pickerwidget.date;

import ab.C0006k;
import android.content.Context;
import androidx.room.AbstractC1141t;
import com.google.android.exoplayer2.t8r;
import com.miui.clock.module.toq;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.Serializable;
import java.util.TimeZone;
import miuix.core.util.qrj;

/* JADX INFO: renamed from: miuix.pickerwidget.date.k */
/* JADX INFO: compiled from: Calendar.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7230k implements Serializable, Cloneable, Comparable<C7230k> {
    public static final int AD = 1;
    public static final int AFTERNOON = 4;
    public static final int AM = 0;
    public static final int AM_PM = 17;
    public static final int APRIL = 3;
    public static final int AUGUST = 7;
    public static final int AUTUMN_BEGINS = 15;
    public static final int AUTUMN_EQUINOX = 18;
    public static final int BC = 0;
    public static final int CHICKEN = 9;
    public static final int CHINESE_ERA_DAY = 11;
    public static final int CHINESE_ERA_HOUR = 19;
    public static final int CHINESE_ERA_MONTH = 7;
    public static final int CHINESE_ERA_YEAR = 4;
    public static final int CHINESE_MONTH = 6;
    public static final int CHINESE_MONTH_IS_LEAP = 8;
    public static final int CHINESE_YEAR = 2;
    public static final int CHINESE_YEAR_SYMBOL_ANIMAL = 3;
    public static final int CLEAR_AND_BRIGHT = 7;
    public static final int COLD_DEWS = 19;
    public static final int COW = 1;
    public static final int DAY_OF_CHINESE_MONTH = 10;
    public static final int DAY_OF_CHINESE_YEAR = 13;
    public static final int DAY_OF_MONTH = 9;
    public static final int DAY_OF_WEEK = 14;
    public static final int DAY_OF_YEAR = 12;
    public static final int DECEMBER = 11;
    public static final int DETAIL_AM_PM = 16;
    public static final int DOG = 10;
    public static final int DRAGON = 4;
    public static final int DST_OFFSET = 24;
    public static final int EARLY_MORNING = 1;
    public static final int ERA = 0;
    public static final int EVENING = 5;
    public static final int FEBRUARY = 1;
    public static final int FIELD_COUNT = 25;
    public static final int FRIDAY = 6;
    public static final int GRAIN_BUDS = 10;
    public static final int GRAIN_IN_EAR = 11;
    public static final int GRAIN_RAIN = 8;
    public static final int GREAT_COLD = 2;
    public static final int GREAT_HEAT = 14;
    public static final int HEAVY_SNOW = 23;
    public static final int HOAR_FROST_FALLS = 20;
    public static final int HORSE = 6;
    public static final int HOUR = 18;
    public static final int INSECTS_AWAKEN = 5;
    public static final int IS_CHINESE_LEAP_MONTH = 1;
    public static final int JANUARY = 0;
    public static final int JULY = 6;
    public static final int JUNE = 5;
    public static final int LIGHT_SNOW = 22;
    public static final int MARCH = 2;
    public static final int MAY = 4;
    public static final int MIDNIGHT = 0;
    public static final int MILLISECOND = 22;
    public static final int MILLISECOND_OF_DAY = 86400000;
    public static final int MILLISECOND_OF_HOUR = 3600000;
    public static final int MILLISECOND_OF_MINUTE = 60000;
    public static final int MILLISECOND_OF_SECOND = 1000;
    public static final int MINUTE = 20;
    public static final int MONDAY = 2;
    public static final int MONKEY = 8;
    public static final int MONTH = 5;
    public static final int MORNING = 2;
    public static final int MOUSE = 0;
    public static final int NIGHT = 6;
    public static final int NOON = 3;
    public static final int NOT_CHINESE_LEAP_MONTH = 0;
    public static final int NOVEMBER = 10;
    public static final int NO_SOLAR_TERM = 0;
    public static final int OCTOBER = 9;
    public static final int PIG = 11;
    public static final int PM = 1;
    public static final int RABBIT = 3;
    public static final int SATURDAY = 7;
    public static final int SECOND = 21;
    public static final int SEPTEMBER = 8;
    public static final int SHEEP = 7;
    public static final int SLIGHT_COLD = 1;
    public static final int SLIGHT_HEAT = 13;
    public static final int SNAKE = 5;
    public static final int SOLAR_TERM = 15;
    public static final int SPRING_BEGINS = 3;
    public static final int STOPPING_THE_HEAT = 16;
    public static final int SUMMER_BEGINS = 9;
    public static final int SUMMER_SOLSTICE = 12;
    public static final int SUNDAY = 1;
    public static final int THE_RAINS = 4;
    public static final int THURSDAY = 5;
    public static final int TIGER = 2;
    public static final int TUESDAY = 3;
    public static final int VERNAL_EQUINOX = 6;
    public static final int WEDNESDAY = 4;
    public static final int WHITE_DEWS = 17;
    public static final int WINTER_BEGINS = 21;
    public static final int WINTER_SOLSTICE = 24;
    public static final int YEAR = 1;
    public static final int ZONE_OFFSET = 23;

    /* JADX INFO: renamed from: h */
    private static final int f40796h = 2100;

    /* JADX INFO: renamed from: i */
    private static final int f40797i = -25537;

    /* JADX INFO: renamed from: l */
    private static final int f40799l = -25537;

    /* JADX INFO: renamed from: p */
    private static final int f40802p = 1900;

    /* JADX INFO: renamed from: r */
    private static final long f40803r = 4136400000000L;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: t */
    private static final long f40804t = -2206396800000L;

    /* JADX INFO: renamed from: u */
    private static final long f40805u = -12219292800000L;

    /* JADX INFO: renamed from: z */
    private static final int f40807z = 47550;

    /* JADX INFO: renamed from: g */
    private transient int f40808g;

    /* JADX INFO: renamed from: k */
    private transient long f40809k;
    private int[] mFields;
    private long mMillisecond;
    private TimeZone mTimeZone;

    /* JADX INFO: renamed from: n */
    private transient int f40810n;

    /* JADX INFO: renamed from: q */
    private transient int f40811q;

    /* JADX INFO: renamed from: s */
    private transient int f40812s;

    /* JADX INFO: renamed from: y */
    private transient int f40813y;

    /* JADX INFO: renamed from: f */
    private static final byte[] f40795f = {com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68113d3, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68113d3};

    /* JADX INFO: renamed from: c */
    private static final int[] f40793c = {0, 31, 59, 90, 120, 151, 181, toq.zy.f72002qrj, 243, 273, 304, 334, 365};

    /* JADX INFO: renamed from: e */
    private static final String[] f40794e = {"ERA", "YEAR", "CHINESE_YEAR", "CHINESE_YEAR_SYMBOL_ANIMAL", "CHINESE_ERA_YEAR", "MONTH", "CHINESE_MONTH", "CHINESE_ERA_MONTH", "CHINESE_MONTH_IS_LEAP", "DAY_OF_MONTH", "DAY_OF_CHINESE_MONTH", "CHINESE_ERA_DAY", "DAY_OF_YEAR", "DAY_OF_CHINESE_YEAR", "DAY_OF_WEEK", "SOLAR_TERM", "DETAIL_AM_PM", "AM_PM", "HOUR", "CHINESE_ERA_HOUR", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET", "DST_OFFSET"};

    /* JADX INFO: renamed from: j */
    private static final int[] f40798j = {3, -1, -1, 12, 14, 26, 0, 18, 19, -1, 18, 5, 5, 7, -1, -1, -1, -1, 22, -1, -1, -1, 26, -1, 4, 25, -1, -1, -1, -1, -1, -1, 16, -1, 14, 9, 7, -1, -1, 18, -1, -1, 18, -1, 20, -1, -1, -1, -1, -1, 21, 15, -1, -1, 26, -1, 1, 25};

    /* JADX INFO: renamed from: o */
    private static final int[] f40801o = {0, 384, 738, 1093, 1476, 1830, 2185, 2569, 2923, 3278, 3662, 4016, 4400, 4754, 5108, 5492, 5846, 6201, 6585, 6940, 7324, 7678, 8032, 8416, 8770, 9124, 9509, 9863, 10218, 10602, 10956, 11339, 11693, 12048, 12432, 12787, 13141, 13525, 13879, 14263, 14617, 14971, 15355, 15710, 16064, 16449, 16803, 17157, 17541, 17895, 18279, 18633, 18988, 19372, 19726, 20081, 20465, 20819, 21202, 21557, 21911, 22295, 22650, 23004, 23388, 23743, 24096, 24480, 24835, 25219, 25573, 25928, 26312, 26666, 27020, 27404, 27758, 28142, 28496, 28851, 29235, 29590, 29944, 30328, 30682, 31066, 31420, 31774, 32158, 32513, 32868, 33252, 33606, 33960, 34343, 34698, 35082, 35436, 35791, 36175, 36529, 36883, 37267, 37621, 37976, 38360, 38714, 39099, 39453, 39807, 40191, 40545, 40899, 41283, 41638, 42022, 42376, 42731, 43115, 43469, 43823, 44207, 44561, 44916, 45300, 45654, 46038, 46392, 46746, 47130, 47485, 47839, 48223, 48578, 48962, 49316, 49670, 50054, 50408, 50762, 51146, 51501, 51856, 52240, 52594, 52978, 53332, 53686, 54070, 54424, 54779, 55163, 55518, 55902, 56256, 56610, 56993, 57348, 57702, 58086, 58441, 58795, 59179, 59533, 59917, 60271, 60626, 61010, 61364, 61719, 62103, 62457, 62841, 63195, 63549, 63933, 64288, 64642, 65026, 65381, 65735, 66119, 66473, 66857, 67211, 67566, 67950, 68304, 68659, 69042, 69396, 69780, 70134, 70489, 70873, 71228, 71582, 71966, 72320, 72674, 73058, 73412};

    /* JADX INFO: renamed from: m */
    private static final int[] f40800m = {19416, 19168, 42352, 21717, 53856, 55632, 21844, 22191, 39632, 21970, 19168, 42422, 42192, 53840, 53909, 46415, 54944, 44450, 38320, 18807, 18815, 42160, 46261, 27216, 27968, 43860, 11119, 38256, 21234, 18800, 25958, 54432, 59984, 27285, 23263, 11104, 34531, 37615, 51415, 51551, 54432, 55462, 46431, 22176, 42420, 9695, 37584, 53938, 43344, 46423, 27808, 46416, 21333, 19887, 42416, 17779, 21183, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 38310, 38335, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 23232, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 20854, 21183, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 53430, 53855, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 45653, 27951, 44448, 19299, 37759, 18936, 18800, 25776, 26790, 59999, 27424, 42692, 43759, 37600, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 19285, 19311, 42352, 21732, 53856, 59752, 54560, 55968, 27302, 22239, 19168, 43476, 42192, 53584, 62034, 54560};

    /* JADX INFO: renamed from: b */
    private static final int[] f40792b = {4, 19, 3, 18, 4, 19, 4, 19, 4, 20, 4, 20, 6, 22, 6, 22, 6, 22, 7, 22, 6, 21, 6, 21};

    /* JADX INFO: renamed from: a */
    private static final byte[] f40791a = "0123415341536789:;<9:=<>:=1>?012@015@015@015AB78CDE8CD=1FD01GH01GH01IH01IJ0KLMN;LMBEOPDQRST0RUH0RVH0RWH0RWM0XYMNZ[MB\\]PT^_ST`_WH`_WH`_WM`_WM`aYMbc[Mde]Sfe]gfh_gih_Wih_WjhaWjka[jkl[jmn]ope]qph_qrh_sth_W".getBytes();

    /* JADX INFO: renamed from: x */
    private static final byte[] f40806x = "211122112122112121222211221122122222212222222221222122222232222222222222222233223232223232222222322222112122112121222211222122222222222222222222322222112122112121222111211122122222212221222221221122122222222222222222222223222232222232222222222222112122112121122111211122122122212221222221221122122222222222222221211122112122212221222211222122222232222232222222222222112122112121111111222222112121112121111111222222111121112121111111211122112122112121122111222212111121111121111111111122112122112121122111211122112122212221222221222211111121111121111111222111111121111111111111111122112121112121111111222111111111111111111111111122111121112121111111221122122222212221222221222111011111111111111111111122111121111121111111211122112122112121122211221111011111101111111111111112111121111121111111211122112122112221222211221111011111101111111110111111111121111111111111111122112121112121122111111011111121111111111111111011111111112111111111111011111111111111111111221111011111101110111110111011011111111111111111221111011011101110111110111011011111101111111111211111001011101110111110110011011111101111111111211111001011001010111110110011011111101111111110211111001011001010111100110011011011101110111110211111001011001010011100110011001011101110111110211111001010001010011000100011001011001010111110111111001010001010011000111111111111111111111111100011001011001010111100111111001010001010000000111111000010000010000000100011001011001010011100110011001011001110111110100011001010001010011000110011001011001010111110111100000010000000000000000011001010001010011000111100000000000000000000000011001010001010000000111000000000000000000000000011001010000010000000".getBytes();

    public C7230k() {
        this(null);
    }

    private void a9() {
        int[] iArr = this.mFields;
        int i2 = iArr[1];
        long jNi7 = ni7(i2) + ((long) ((o1t(isLeapYear(i2), iArr[5]) + iArr[9]) - 1));
        this.mFields[14] = mcp(jNi7 - 3, 7) + 1;
        int[] iArr2 = this.mFields;
        long j2 = (jNi7 * 86400000) + ((long) ((iArr2[18] * 3600000) + (iArr2[20] * 60000) + (iArr2[21] * 1000) + iArr2[22]));
        this.mMillisecond = j2;
        long offset = this.mTimeZone.getOffset(j2);
        long j3 = this.mMillisecond;
        if (i2 <= 0) {
            offset = 0;
        }
        this.mMillisecond = j3 - offset;
        n7h();
    }

    private void cdj(long j2) {
        int[] iArr = this.mFields;
        int i2 = iArr[2] - 1900;
        iArr[3] = mcp(i2 + 12, 12);
        this.mFields[4] = mcp(i2 + 36, 60);
        int[] iArr2 = this.mFields;
        int iSolarTermDaysOfMonth = solarTermDaysOfMonth(iArr2[1], iArr2[5]) >> 8;
        int[] iArr3 = this.mFields;
        int i3 = ((iArr3[1] - 1900) * 12) + iArr3[5];
        if (iArr3[9] >= iSolarTermDaysOfMonth) {
            i3++;
        }
        iArr3[7] = mcp(i3 + 12, 60);
        int i4 = (int) (j2 - (-25537));
        this.mFields[11] = mcp(i4 + 40, 60);
        this.mFields[19] = mcp((i4 * 12) + (((r10[18] + 1) % 24) / 2), 60);
    }

    static int daysInChineseMonth(int i2, int i3) {
        return (f40800m[i2 + (-1900)] & (65536 >> (i3 + 1))) != 0 ? 30 : 29;
    }

    static int daysInChineseYear(int i2) {
        int[] iArr = f40801o;
        int i3 = i2 - 1900;
        return iArr[i3 + 1] - iArr[i3];
    }

    private void fn3e() {
        int[] iArr = this.mFields;
        int iSolarTermDaysOfMonth = solarTermDaysOfMonth(iArr[1], iArr[5]);
        int[] iArr2 = this.mFields;
        int i2 = iArr2[9];
        if (i2 == (iSolarTermDaysOfMonth >> 8)) {
            iArr2[15] = (iArr2[5] * 2) + 1;
        } else if (i2 == (iSolarTermDaysOfMonth & 255)) {
            iArr2[15] = (iArr2[5] * 2) + 2;
        } else {
            iArr2[15] = 0;
        }
    }

    private void fti() {
        long jM26286i = m26286i();
        if (jM26286i > 47550) {
            setChineseTime(f40796h, 0, 30, false, 12, 0, 0, 0);
            jM26286i = 47550;
        }
        if (jM26286i < -25537) {
            setChineseTime(f40802p, 0, 1, false, 12, 0, 0, 0);
            jM26286i = -25537;
        }
        if (outOfChineseCalendarRange()) {
            return;
        }
        kja0(jM26286i);
        fn3e();
        cdj(jM26286i);
    }

    private static int fu4(boolean z2, int i2) {
        return (z2 && i2 == 1) ? f40795f[i2] + 1 : f40795f[i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: i */
    private long m26286i() {
        long j2;
        this.mFields[23] = this.mTimeZone.getRawOffset();
        long j3 = this.mMillisecond;
        long j4 = j3 / 86400000;
        int i2 = (int) (j3 % 86400000);
        if (i2 < 0) {
            i2 += 86400000;
            j4--;
        }
        int i3 = i2 + this.mFields[23];
        while (i3 < 0) {
            i3 += 86400000;
            j4--;
        }
        while (i3 >= 86400000) {
            i3 -= 86400000;
            j4++;
        }
        int i4 = this.mFields[23];
        long j5 = this.mMillisecond;
        long j6 = ((long) i4) + j5;
        if (j5 > 0 && j6 < 0 && i4 > 0) {
            j6 = Long.MAX_VALUE;
        } else if (j5 < 0 && j6 > 0 && i4 < 0) {
            j6 = Long.MIN_VALUE;
        }
        ki(j4, j6);
        int iWvg = wvg(i3);
        int[] iArr = this.mFields;
        iArr[24] = iWvg;
        if (iWvg != 0) {
            i3 += iWvg;
            if (i3 < 0) {
                i3 += 86400000;
                j2 = j4 - 1;
            } else if (i3 >= 86400000) {
                i3 -= 86400000;
                j2 = 1 + j4;
            } else {
                j2 = j4;
            }
            if (j4 != j2) {
                int i5 = iWvg - iArr[23];
                long j7 = this.mMillisecond;
                long j8 = ((long) i5) + j7;
                if (j7 > 0 && j8 < 0 && i5 > 0) {
                    j8 = Long.MAX_VALUE;
                } else if (j7 < 0 && j8 > 0 && i5 < 0) {
                    j8 = Long.MIN_VALUE;
                }
                ki(j2, j8);
            }
            j4 = j2;
        }
        int[] iArr2 = this.mFields;
        int i6 = iArr2[1];
        if (i6 <= 0) {
            iArr2[0] = 0;
            iArr2[1] = 1 - i6;
        } else {
            iArr2[0] = 1;
        }
        iArr2[22] = i3 % 1000;
        int i7 = i3 / 1000;
        iArr2[21] = i7 % 60;
        int i8 = i7 / 60;
        iArr2[20] = i8 % 60;
        int i9 = (i8 / 60) % 24;
        iArr2[18] = i9;
        iArr2[17] = i9 > 11 ? 1 : 0;
        switch (i9) {
            case 0:
                iArr2[16] = 0;
                return j4;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                iArr2[16] = 1;
                return j4;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                iArr2[16] = 2;
                return j4;
            case 12:
                iArr2[16] = 3;
                return j4;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                iArr2[16] = 4;
                return j4;
            case 18:
                iArr2[16] = 5;
                return j4;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                iArr2[16] = 6;
                return j4;
            default:
                return j4;
        }
    }

    private void jk() {
        int[] iArr;
        int i2;
        int iLeapDaysInChineseYear;
        long jDaysInChineseMonth = ((long) f40801o[this.mFields[2] - 1900]) - 25537;
        int i3 = 0;
        while (true) {
            iArr = this.mFields;
            i2 = iArr[6];
            if (i3 >= i2) {
                break;
            }
            jDaysInChineseMonth += (long) daysInChineseMonth(iArr[2], i3);
            i3++;
        }
        if (iArr[8] != 1) {
            int iM26290t = m26290t(iArr[2]);
            if (iM26290t >= 0) {
                int[] iArr2 = this.mFields;
                if (iM26290t < iArr2[6]) {
                    iLeapDaysInChineseYear = leapDaysInChineseYear(iArr2[2]);
                }
            }
            ki(jDaysInChineseMonth + ((long) (this.mFields[10] - 1)), 0L);
            a9();
        }
        iLeapDaysInChineseYear = daysInChineseMonth(iArr[2], i2);
        jDaysInChineseMonth += (long) iLeapDaysInChineseYear;
        ki(jDaysInChineseMonth + ((long) (this.mFields[10] - 1)), 0L);
        a9();
    }

    private void ki(long j2, long j3) {
        int iZurt = zurt(j2, j3);
        int[] iArr = this.mFields;
        iArr[12] = iZurt;
        int i2 = iArr[1];
        if (i2 == this.f40811q && this.f40809k <= j3) {
            iZurt += this.f40813y;
        }
        int i3 = iZurt / 32;
        boolean zIsLeapYear = isLeapYear(i2);
        int iO1t = iZurt - o1t(zIsLeapYear, i3);
        if (iO1t > fu4(zIsLeapYear, i3)) {
            iO1t -= fu4(zIsLeapYear, i3);
            i3++;
        }
        int[] iArr2 = this.mFields;
        iArr2[5] = i3;
        iArr2[9] = iO1t;
        iArr2[14] = mcp(j2 - 3, 7) + 1;
    }

    private void kja0(long j2) {
        int i2 = (int) (j2 - (-25537));
        int i3 = this.mFields[1];
        int i4 = f40796h;
        if (i3 < f40796h) {
            i4 = i3 + 1;
        }
        int iDaysInChineseYear = i2 - f40801o[i4 - 1900];
        if (iDaysInChineseYear < 0) {
            i4--;
            iDaysInChineseYear += daysInChineseYear(i4);
        }
        if (iDaysInChineseYear < 0) {
            i4--;
            iDaysInChineseYear += daysInChineseYear(i4);
        }
        int[] iArr = this.mFields;
        iArr[2] = i4;
        iArr[13] = iDaysInChineseYear + 1;
        int iM26290t = m26290t(i4);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iDaysInChineseMonth = 0;
        while (i6 < 12 && iDaysInChineseYear > 0) {
            if (iM26290t >= 0 && i6 == iM26290t + 1 && i7 == 0) {
                i6--;
                iDaysInChineseMonth = leapDaysInChineseYear(i4);
                i7 = 1;
            } else {
                iDaysInChineseMonth = daysInChineseMonth(i4, i6);
            }
            if (i7 != 0 && i6 == iM26290t + 1) {
                i7 = 0;
            }
            iDaysInChineseYear -= iDaysInChineseMonth;
            i6++;
        }
        if (iDaysInChineseYear != 0 || iM26290t <= 0 || i6 != iM26290t + 1) {
            i5 = i7;
        } else if (i7 == 0) {
            i6--;
            i5 = 1;
        }
        if (iDaysInChineseYear < 0) {
            iDaysInChineseYear += iDaysInChineseMonth;
            i6--;
        }
        int[] iArr2 = this.mFields;
        iArr2[8] = i5;
        iArr2[6] = i6;
        iArr2[10] = iDaysInChineseYear + 1;
    }

    static int leapDaysInChineseYear(int i2) {
        if (m26290t(i2) >= 0) {
            return (f40800m[(i2 + (-1900)) + 1] & 15) == 15 ? 30 : 29;
        }
        return 0;
    }

    private static int mcp(long j2, int i2) {
        int i3 = (int) (j2 % ((long) i2));
        return (j2 >= 0 || i3 >= 0) ? i3 : i3 + i2;
    }

    /* JADX INFO: renamed from: n */
    private static void m26287n(StringBuilder sb, int i2, int i3) {
        sb.append(C0006k.zy(i2, i3));
    }

    private void n7h() {
        long jM26286i = m26286i();
        if (outOfChineseCalendarRange()) {
            return;
        }
        kja0(jM26286i);
        fn3e();
        cdj(jM26286i);
    }

    private long ni7(long j2) {
        long j3;
        long j4;
        if (j2 >= 1970) {
            long j5 = ((j2 - 1970) * 365) + ((j2 - 1969) / 4);
            int i2 = this.f40811q;
            if (j2 > i2) {
                return j5 - (((j2 - 1901) / 100) - ((j2 - 1601) / 400));
            }
            return j5 + ((long) (j2 == ((long) i2) ? this.f40813y : j2 == ((long) (i2 + (-1))) ? this.f40812s : this.f40808g));
        }
        if (j2 <= this.f40811q) {
            j3 = ((j2 - 1970) * 365) + ((j2 - 1972) / 4);
            j4 = this.f40808g;
        } else {
            long j6 = ((j2 - 1970) * 365) + ((j2 - 1972) / 4);
            long j7 = j2 - t8r.f65475toq;
            j3 = j6 - (j7 / 100);
            j4 = j7 / 400;
        }
        return j3 + j4;
    }

    private static int o1t(boolean z2, int i2) {
        return (!z2 || i2 <= 1) ? f40793c[i2] : f40793c[i2] + 1;
    }

    /* JADX INFO: renamed from: q */
    private void m26288q(StringBuilder sb, boolean z2, boolean z3) {
        char c2;
        int i2 = get(23) + get(24);
        if (i2 < 0) {
            c2 = '-';
            i2 = -i2;
        } else {
            c2 = '+';
        }
        if (z2) {
            sb.append("GMT");
        }
        sb.append(c2);
        m26287n(sb, 2, i2 / 3600000);
        if (z3) {
            sb.append(':');
        }
        m26287n(sb, 2, (i2 % 3600000) / 60000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void qrj(StringBuilder sb, toq toqVar, char c2, int i2, int i3) {
        if (c2 == 'A') {
            sb.append(toqVar.f7l8()[this.mFields[3]]);
            return;
        }
        if (c2 != 'S') {
            if (c2 == 'a') {
                if (i2 != 2) {
                    sb.append(toqVar.toq()[this.mFields[17]]);
                    return;
                } else {
                    sb.append(toqVar.m26300y()[this.mFields[16]]);
                    return;
                }
            }
            if (c2 == 'h') {
                int i4 = this.mFields[18] % 12;
                m26287n(sb, i2, i4 != 0 ? i4 : 12);
                return;
            }
            if (c2 == 'k') {
                m26287n(sb, i2, this.mFields[18]);
                return;
            }
            if (c2 != 'm' && c2 != 'D') {
                if (c2 != 'E') {
                    if (c2 == 'Y') {
                        if (i2 == 2) {
                            sb.append(toqVar.ld6()[this.mFields[4] % 10]);
                            sb.append(toqVar.m26299s()[this.mFields[4] % 12]);
                            return;
                        }
                        String[] strArrM26298q = toqVar.m26298q();
                        int i5 = this.mFields[2];
                        int length = sb.length();
                        while (i5 > 0) {
                            int i6 = i5 % 10;
                            i5 /= 10;
                            sb.insert(length, strArrM26298q[i6]);
                        }
                        return;
                    }
                    if (c2 == 'Z') {
                        if (i2 == 4) {
                            m26288q(sb, true, true);
                            return;
                        } else if (i2 == 5) {
                            m26288q(sb, false, true);
                            return;
                        } else {
                            m26288q(sb, false, false);
                            return;
                        }
                    }
                    if (c2 != 's') {
                        if (c2 == 't') {
                            sb.append(toqVar.t8r()[this.mFields[15]]);
                            return;
                        }
                        if (c2 == 'y') {
                            if (i2 == 2) {
                                m26287n(sb, i2, this.mFields[1] % 100);
                                return;
                            } else {
                                m26287n(sb, i2, this.mFields[1]);
                                return;
                            }
                        }
                        if (c2 == 'z') {
                            m26289s(sb, toqVar, i2);
                            return;
                        }
                        switch (c2) {
                            case 'G':
                                sb.append(toqVar.m26297p()[this.mFields[0]]);
                                break;
                            case 'H':
                                break;
                            case 'I':
                                if (i2 == 2) {
                                    sb.append(toqVar.ld6()[this.mFields[19] % 10]);
                                }
                                sb.append(toqVar.m26299s()[this.mFields[19] % 12]);
                                break;
                            default:
                                switch (c2) {
                                    case 'K':
                                        m26287n(sb, i2, this.mFields[18] % 12);
                                        break;
                                    case 'L':
                                    case 'M':
                                        if (i2 < 3) {
                                            m26287n(sb, i2, this.mFields[5] + 1);
                                        } else if (i2 == 4) {
                                            sb.append(toqVar.qrj()[this.mFields[5]]);
                                        } else if (i2 != 5) {
                                            sb.append(toqVar.kja0()[this.mFields[5]]);
                                        } else {
                                            sb.append(toqVar.cdj()[this.mFields[5]]);
                                        }
                                        break;
                                    case 'N':
                                        if (i2 == 2) {
                                            sb.append(toqVar.ld6()[this.mFields[7] % 10]);
                                            sb.append(toqVar.m26299s()[this.mFields[7] % 12]);
                                        } else {
                                            sb.append(toqVar.m26296n()[this.mFields[8]]);
                                            sb.append(toqVar.m26293g()[this.mFields[6]]);
                                        }
                                        break;
                                    default:
                                        switch (c2) {
                                            case 'e':
                                                if (i2 == 2) {
                                                    sb.append(toqVar.ld6()[this.mFields[11] % 10]);
                                                    sb.append(toqVar.m26299s()[this.mFields[11] % 12]);
                                                } else {
                                                    sb.append(toqVar.zy()[this.mFields[10] - 1]);
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                }
                if (i2 == 4) {
                    sb.append(toqVar.m26295i()[this.mFields[14] - 1]);
                    return;
                } else if (i2 == 5) {
                    sb.append(toqVar.ki()[this.mFields[14] - 1]);
                    return;
                } else {
                    sb.append(toqVar.m26294h()[this.mFields[14] - 1]);
                    return;
                }
            }
        }
        m26287n(sb, i2, this.mFields[i3]);
    }

    /* JADX INFO: renamed from: s */
    private void m26289s(StringBuilder sb, toq toqVar, int i2) {
        String displayName = this.mTimeZone.getDisplayName(this.mFields[24] != 0, i2 != 4 ? 0 : 1, toqVar.x2());
        if (displayName != null) {
            sb.append(displayName);
        } else {
            m26288q(sb, false, false);
        }
    }

    static int solarTermDaysOfMonth(int i2, int i3) {
        if (i2 > f40796h) {
            return 0;
        }
        int i4 = i3 * 2;
        int i5 = ((f40791a[i2 - 1900] - 48) * 24) + i4;
        int i6 = i5 + 1;
        int i7 = f40806x[i5] - 48;
        int[] iArr = f40792b;
        return ((i7 + iArr[i4]) << 8) + (r1[i6] - 48) + iArr[i4 + 1];
    }

    /* JADX INFO: renamed from: t */
    private static int m26290t(int i2) {
        int i3 = f40800m[i2 - 1900] & 15;
        if (i3 == 15) {
            return -1;
        }
        return i3 - 1;
    }

    private int wvg(int i2) {
        int[] iArr = this.mFields;
        int i3 = iArr[1];
        int offset = i3 <= 0 ? 0 : this.mTimeZone.getOffset(1, i3, iArr[5], iArr[9], iArr[14], i2);
        int[] iArr2 = this.mFields;
        if (iArr2[1] > 0) {
            return offset - iArr2[23];
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    private int m26291z(int i2) {
        int i3 = isLeapYear(i2) ? 366 : 365;
        int i4 = this.f40811q;
        if (i2 == i4) {
            i3 -= this.f40813y;
        }
        return i2 == i4 + (-1) ? i3 - this.f40812s : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0016 -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int zurt(long r5, long r7) {
        /*
            r4 = this;
            long r0 = r4.f40809k
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 1970(0x7b2, float:2.76E-42)
            if (r7 >= 0) goto Le
            int r7 = r4.f40808g
            long r0 = (long) r7
        Lb:
            long r0 = r5 - r0
            goto Lf
        Le:
            r0 = r5
        Lf:
            r2 = 365(0x16d, double:1.803E-321)
            long r2 = r0 / r2
            int r7 = (int) r2
            if (r7 == 0) goto L1d
            int r8 = r8 + r7
            long r0 = (long) r8
            long r0 = r4.ni7(r0)
            goto Lb
        L1d:
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2b
            int r8 = r8 + (-1)
            int r5 = r4.m26291z(r8)
            long r5 = (long) r5
            long r0 = r0 + r5
        L2b:
            int[] r5 = r4.mFields
            r6 = 1
            r5[r6] = r8
            int r5 = (int) r0
            int r5 = r5 + r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.date.C7230k.zurt(long, long):int");
    }

    public C7230k add(int i2, int i3) {
        if (i2 < 0 || i2 >= 25) {
            throw new IllegalArgumentException("Field out of range [0-25]: " + i2);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13) {
                                if (i3 != 0) {
                                    long j2 = this.mMillisecond;
                                    long j3 = (((long) i3) * 86400000) + j2;
                                    if ((i3 > 0) != (j3 > j2)) {
                                        throw new IllegalArgumentException("out of range");
                                    }
                                    this.mMillisecond = j3;
                                    n7h();
                                }
                            } else if (i2 != 18) {
                                switch (i2) {
                                    case 20:
                                        if (i3 != 0) {
                                            long j4 = this.mMillisecond;
                                            long j5 = (((long) i3) * 60000) + j4;
                                            if ((i3 > 0) != (j5 > j4)) {
                                                throw new IllegalArgumentException("out of range");
                                            }
                                            this.mMillisecond = j5;
                                            n7h();
                                        }
                                        break;
                                    case 21:
                                        if (i3 != 0) {
                                            long j6 = this.mMillisecond;
                                            long j7 = (((long) i3) * 1000) + j6;
                                            if ((i3 > 0) != (j7 > j6)) {
                                                throw new IllegalArgumentException("out of range");
                                            }
                                            this.mMillisecond = j7;
                                            n7h();
                                        }
                                        break;
                                    case 22:
                                        if (i3 != 0) {
                                            long j8 = this.mMillisecond;
                                            long j9 = ((long) i3) + j8;
                                            if ((i3 > 0) != (j9 > j8)) {
                                                throw new IllegalArgumentException("out of range");
                                            }
                                            this.mMillisecond = j9;
                                            n7h();
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("unsupported set field:" + f40794e[i2]);
                                }
                            } else if (i3 != 0) {
                                long j10 = this.mMillisecond;
                                long j11 = (((long) i3) * 3600000) + j10;
                                if ((i3 > 0) != (j11 > j10)) {
                                    throw new IllegalArgumentException("out of range");
                                }
                                this.mMillisecond = j11;
                                n7h();
                            }
                        } else if (i3 != 0) {
                            if (outOfChineseCalendarRange()) {
                                throw new IllegalArgumentException("out of range of Chinese Lunar Year");
                            }
                            int iM26290t = m26290t(this.mFields[2]);
                            while (i3 > 0) {
                                int[] iArr = this.mFields;
                                int i4 = iArr[6];
                                if (i4 == iM26290t && iArr[8] == 0) {
                                    iArr[8] = 1;
                                } else {
                                    int i5 = i4 + 1;
                                    iArr[6] = i5;
                                    iArr[8] = 0;
                                    if (i5 > 11) {
                                        iArr[6] = 0;
                                        int i6 = iArr[2] + 1;
                                        iArr[2] = i6;
                                        if (i6 > f40796h) {
                                            throw new IllegalArgumentException("out of range of Chinese Lunar Year");
                                        }
                                        iM26290t = m26290t(i6);
                                    } else {
                                        continue;
                                    }
                                }
                                i3--;
                            }
                            while (i3 < 0) {
                                int[] iArr2 = this.mFields;
                                int i7 = iArr2[6];
                                if (i7 == iM26290t && iArr2[8] == 1) {
                                    iArr2[8] = 0;
                                } else {
                                    int i8 = i7 - 1;
                                    iArr2[6] = i8;
                                    if (i8 < 0) {
                                        iArr2[6] = 11;
                                        iArr2[6] = 11 - 1;
                                        if (iArr2[2] < f40802p) {
                                            throw new IllegalArgumentException("out of range of Chinese Lunar Year");
                                        }
                                        iM26290t = m26290t(iArr2[1]);
                                    }
                                    int[] iArr3 = this.mFields;
                                    if (iArr3[6] == iM26290t) {
                                        iArr3[8] = 1;
                                    }
                                }
                                i3++;
                            }
                            int[] iArr4 = this.mFields;
                            int iLeapDaysInChineseYear = iArr4[8] == 1 ? leapDaysInChineseYear(iArr4[2]) : daysInChineseMonth(iArr4[2], iArr4[6]);
                            int[] iArr5 = this.mFields;
                            if (iArr5[10] > iLeapDaysInChineseYear) {
                                iArr5[10] = iLeapDaysInChineseYear;
                            }
                            jk();
                        }
                    } else if (i3 != 0) {
                        int[] iArr6 = this.mFields;
                        int i9 = i3 + iArr6[5];
                        int i10 = i9 / 12;
                        int i11 = i9 % 12;
                        if (i11 < 0) {
                            i11 += 12;
                            i10--;
                        }
                        iArr6[5] = i11;
                        if (i10 == 0) {
                            if (iArr6[0] == 0) {
                                iArr6[1] = (-1) - iArr6[1];
                            }
                            int iFu4 = fu4(isLeapYear(iArr6[1]), this.mFields[5]);
                            int[] iArr7 = this.mFields;
                            if (iArr7[9] > iFu4) {
                                iArr7[9] = iFu4;
                            }
                            a9();
                        } else {
                            add(1, i10);
                        }
                    }
                } else if (i3 != 0) {
                    int i12 = i3 + this.mFields[2];
                    if (outOfChineseCalendarRange() || i12 < f40802p || i12 > f40796h) {
                        throw new IllegalArgumentException("out of range of Chinese Lunar Year");
                    }
                    int[] iArr8 = this.mFields;
                    iArr8[2] = i12;
                    if (iArr8[8] == 1 && iArr8[6] == m26290t(i12)) {
                        this.mFields[8] = 0;
                    }
                    int[] iArr9 = this.mFields;
                    int iLeapDaysInChineseYear2 = iArr9[8] == 1 ? leapDaysInChineseYear(iArr9[2]) : daysInChineseMonth(iArr9[2], iArr9[6]);
                    int[] iArr10 = this.mFields;
                    if (iArr10[10] > iLeapDaysInChineseYear2) {
                        iArr10[10] = iLeapDaysInChineseYear2;
                    }
                    jk();
                }
            } else if (i3 != 0) {
                int[] iArr11 = this.mFields;
                if (iArr11[0] == 0) {
                    iArr11[1] = (-1) - iArr11[1];
                }
                int i13 = iArr11[1] + i3;
                iArr11[1] = i13;
                int iFu42 = fu4(isLeapYear(i13), this.mFields[5]);
                int[] iArr12 = this.mFields;
                if (iArr12[9] > iFu42) {
                    iArr12[9] = iFu42;
                }
                a9();
            }
        } else if (i3 != 0) {
            int[] iArr13 = this.mFields;
            int i14 = iArr13[0];
            if (i14 != (i3 + i14) % 2 && i14 == 0) {
                iArr13[1] = (-1) - iArr13[1];
                a9();
            }
        }
        return this;
    }

    public boolean after(C7230k c7230k) {
        return getTimeInMillis() > c7230k.getTimeInMillis();
    }

    public boolean before(C7230k c7230k) {
        return getTimeInMillis() < c7230k.getTimeInMillis();
    }

    public final Object clone() {
        try {
            C7230k c7230k = (C7230k) super.clone();
            c7230k.mFields = (int[]) this.mFields.clone();
            c7230k.mTimeZone = (TimeZone) this.mTimeZone.clone();
            return c7230k;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C7230k) && this.mMillisecond == ((C7230k) obj).mMillisecond);
    }

    public String format(Context context, CharSequence charSequence) {
        return format(context, charSequence, (toq) null);
    }

    public int get(int i2) {
        if (i2 >= 0 && i2 < 25) {
            return this.mFields[i2];
        }
        throw new IllegalArgumentException("Field out of range [0-25]: " + i2);
    }

    public int getActualMaximum(int i2) {
        if (i2 < 0 || i2 >= 25) {
            throw new IllegalArgumentException("Field out of range [0-25]: " + i2);
        }
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return this.mFields[0] == 1 ? 292278994 : 292269055;
            case 2:
                return f40796h;
            case 3:
                return 11;
            case 4:
            case 7:
            case 11:
            case 19:
                return 59;
            case 5:
            case 6:
                return 11;
            case 8:
                return 1;
            case 9:
                return fu4(isLeapYear(this.mFields[1]), this.mFields[5]);
            case 10:
                if (outOfChineseCalendarRange()) {
                    return 0;
                }
                if (isChineseLeapMonth()) {
                    return leapDaysInChineseYear(this.mFields[2]);
                }
                int[] iArr = this.mFields;
                return daysInChineseMonth(iArr[2], iArr[6]);
            case 12:
                return m26291z(this.mFields[1]);
            case 13:
                if (outOfChineseCalendarRange()) {
                    return 0;
                }
                return daysInChineseYear(this.mFields[2]);
            case 14:
                return 7;
            case 15:
                return 24;
            case 16:
                return 6;
            case 17:
                return 1;
            case 18:
                return 23;
            case 20:
            case 21:
                return 59;
            case 22:
                return AbstractC1141t.f52393qrj;
            default:
                throw new IllegalArgumentException("unsupported field: " + f40794e[i2]);
        }
    }

    public int getActualMinimum(int i2) {
        if (i2 < 0 || i2 >= 25) {
            throw new IllegalArgumentException("Field out of range [0-25]: " + i2);
        }
        switch (i2) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return f40802p;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 19:
                return 0;
            case 9:
                return 1;
            case 10:
                return !outOfChineseCalendarRange() ? 1 : 0;
            case 12:
                return 1;
            case 13:
                return !outOfChineseCalendarRange() ? 1 : 0;
            case 14:
                return 1;
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
                return 0;
            default:
                throw new IllegalArgumentException("unsupported field: " + f40794e[i2]);
        }
    }

    public int getChineseLeapMonth() {
        return m26290t(this.mFields[2]);
    }

    public long getTimeInMillis() {
        return this.mMillisecond;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        long j2 = this.mMillisecond;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public boolean isChineseLeapMonth() {
        return this.mFields[8] == 1;
    }

    public boolean isLeapYear(int i2) {
        return i2 > this.f40811q ? i2 % 4 == 0 && (i2 % 100 != 0 || i2 % 400 == 0) : i2 % 4 == 0;
    }

    public boolean outOfChineseCalendarRange() {
        long j2 = this.mMillisecond;
        int[] iArr = this.mFields;
        int i2 = iArr[23];
        long j3 = f40804t - ((long) i2);
        int i3 = iArr[24];
        return j2 < j3 - ((long) i3) || j2 >= (f40803r - ((long) i2)) - ((long) i3);
    }

    public C7230k set(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException("Year " + i2 + " has no month " + i3);
        }
        if (i4 <= 0 || i4 > fu4(isLeapYear(i2), i3)) {
            throw new IllegalArgumentException("Year " + i2 + " month " + i3 + " has no day " + i4);
        }
        if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException("Invalid hour " + i5);
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException("Invalid minute " + i6);
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException("Invalid second " + i7);
        }
        if (i8 < 0 || i8 > 999) {
            throw new IllegalArgumentException("Invalid millisecond " + i8);
        }
        int[] iArr = this.mFields;
        iArr[1] = i2;
        iArr[5] = i3;
        iArr[9] = i4;
        iArr[18] = i5;
        iArr[20] = i6;
        iArr[21] = i7;
        iArr[22] = i8;
        a9();
        return this;
    }

    public C7230k setChineseTime(int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8) {
        if (i2 < f40802p || i2 > f40796h) {
            throw new IllegalArgumentException("Date out of range [1900 - 2100] expected, but year is " + i2);
        }
        if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException("Year " + i2 + " has no month " + i3);
        }
        if (z2 && m26290t(i2) != i3) {
            throw new IllegalArgumentException("Year " + i2 + " has no leap month " + i3);
        }
        if (z2) {
            if (i4 <= 0 || i4 > leapDaysInChineseYear(i2)) {
                throw new IllegalArgumentException("Year " + i2 + " month " + i3 + " has no day " + i4);
            }
        } else if (i4 <= 0 || i4 > daysInChineseMonth(i2, i3)) {
            throw new IllegalArgumentException("Year " + i2 + " month " + i3 + " has no day " + i4);
        }
        if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException("Invalid hour " + i5);
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException("Invalid minute " + i6);
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException("Invalid second " + i7);
        }
        if (i8 < 0 || i8 > 1000) {
            throw new IllegalArgumentException("Invalid millisecond " + i8);
        }
        int[] iArr = this.mFields;
        iArr[2] = i2;
        iArr[6] = i3;
        iArr[10] = i4;
        iArr[8] = z2 ? 1 : 0;
        iArr[18] = i5;
        iArr[20] = i6;
        iArr[21] = i7;
        iArr[22] = i8;
        jk();
        return this;
    }

    public void setGregorianChange(long j2) {
        this.f40809k = j2;
        C7230k c7230k = new C7230k(TimeZone.getTimeZone("GMT"));
        c7230k.setTimeInMillis(j2);
        this.f40811q = c7230k.get(1);
        if (c7230k.get(0) == 0) {
            this.f40811q = 1 - this.f40811q;
        }
        int i2 = this.f40811q;
        int i3 = ((i2 / 100) - (i2 / 400)) - 2;
        this.f40810n = i3;
        this.f40808g = (((i2 - 2000) / 400) + i3) - ((i2 - 2000) / 100);
        int i4 = c7230k.get(12);
        int i5 = this.f40808g;
        if (i4 < i5) {
            this.f40813y = i4 - 1;
            this.f40812s = (i5 - i4) + 1;
        } else {
            this.f40812s = 0;
            this.f40813y = i5;
        }
    }

    public C7230k setSafeTimeInMillis(long j2, boolean z2) {
        if (!z2) {
            setTimeInMillis(j2);
            return this;
        }
        this.mMillisecond = j2;
        fti();
        return this;
    }

    public C7230k setTimeInMillis(long j2) {
        this.mMillisecond = j2;
        n7h();
        return this;
    }

    public C7230k setTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        TimeZone timeZone2 = this.mTimeZone;
        if (timeZone2 == null || !timeZone2.getID().equals(timeZone.getID())) {
            this.mTimeZone = timeZone;
            n7h();
        }
        return this;
    }

    public String toString() {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        sbMo25617k.append(getClass().getName());
        sbMo25617k.append("[time");
        sbMo25617k.append(this.mMillisecond);
        sbMo25617k.append(",zone=");
        sbMo25617k.append(this.mTimeZone.getID());
        for (int i2 = 0; i2 < 25; i2++) {
            sbMo25617k.append(',');
            sbMo25617k.append(f40794e[i2]);
            sbMo25617k.append('=');
            sbMo25617k.append(this.mFields[i2]);
        }
        sbMo25617k.append(']');
        String string = sbMo25617k.toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    public C7230k(TimeZone timeZone) {
        this.mFields = new int[25];
        this.f40809k = f40805u;
        this.f40811q = 1582;
        int i2 = ((1582 / 100) - (1582 / 400)) - 2;
        this.f40810n = i2;
        this.f40808g = (((1582 - 2000) / 400) + i2) - ((1582 - 2000) / 100);
        this.f40813y = 10;
        this.f40812s = 0;
        this.mMillisecond = System.currentTimeMillis();
        setTimeZone(timeZone);
    }

    @Override // java.lang.Comparable
    public int compareTo(C7230k c7230k) {
        long j2 = this.mMillisecond;
        long j3 = c7230k.mMillisecond;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public String format(Context context, CharSequence charSequence, toq toqVar) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        String string = format(context, sbMo25617k, charSequence, toqVar).toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    public StringBuilder format(Context context, StringBuilder sb, CharSequence charSequence) {
        return format(context, sb, charSequence, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StringBuilder format(android.content.Context r11, java.lang.StringBuilder r12, java.lang.CharSequence r13, miuix.pickerwidget.date.toq r14) {
        /*
            r10 = this;
            if (r14 != 0) goto L6
            miuix.pickerwidget.date.toq r14 = miuix.pickerwidget.date.toq.n7h(r11)
        L6:
            int r11 = r13.length()
            r6 = 0
            r0 = r6
            r7 = r0
        Ld:
            if (r0 >= r11) goto L72
            char r3 = r13.charAt(r0)
            r1 = 39
            r8 = 1
            if (r7 == 0) goto L2e
            if (r3 != r1) goto L2a
            int r1 = r0 + 1
            if (r1 >= r11) goto L28
            char r2 = r13.charAt(r1)
            if (r2 != r3) goto L28
            r12.append(r3)
            goto L3d
        L28:
            r7 = r6
            goto L70
        L2a:
            r12.append(r3)
            goto L70
        L2e:
            if (r3 != r1) goto L41
            int r1 = r0 + 1
            if (r1 >= r11) goto L3f
            char r2 = r13.charAt(r1)
            if (r2 != r3) goto L3f
            r12.append(r3)
        L3d:
            r0 = r1
            goto L70
        L3f:
            r7 = r8
            goto L70
        L41:
            r1 = 65
            if (r3 < r1) goto L6d
            r1 = 122(0x7a, float:1.71E-43)
            if (r3 > r1) goto L6d
            int[] r1 = miuix.pickerwidget.date.C7230k.f40798j
            int r2 = r3 + (-65)
            r1 = r1[r2]
            if (r1 < 0) goto L6d
            r9 = r0
            r4 = r8
        L53:
            int r0 = r9 + 1
            if (r0 >= r11) goto L61
            char r1 = r13.charAt(r0)
            if (r1 != r3) goto L61
            int r4 = r4 + 1
            r9 = r0
            goto L53
        L61:
            int[] r0 = miuix.pickerwidget.date.C7230k.f40798j
            r5 = r0[r2]
            r0 = r10
            r1 = r12
            r2 = r14
            r0.qrj(r1, r2, r3, r4, r5)
            r0 = r9
            goto L70
        L6d:
            r12.append(r3)
        L70:
            int r0 = r0 + r8
            goto Ld
        L72:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.date.C7230k.format(android.content.Context, java.lang.StringBuilder, java.lang.CharSequence, miuix.pickerwidget.date.toq):java.lang.StringBuilder");
    }

    public C7230k set(int i2, int i3) {
        int iDaysInChineseMonth;
        if (i2 == 6) {
            if (i3 < 0) {
                i3 = -i3;
                if (i3 == m26290t(this.mFields[2])) {
                    this.mFields[8] = 1;
                } else {
                    throw new IllegalArgumentException("year " + this.mFields[2] + " has no such leap month:" + i3);
                }
            } else {
                if (i3 < getActualMinimum(i2) && i3 > getActualMaximum(i2)) {
                    throw new IllegalArgumentException("value is out of date range [" + getActualMinimum(i2) + C5658n.f73185t8r + getActualMaximum(i2) + "]: " + i3);
                }
                this.mFields[8] = 0;
            }
            int[] iArr = this.mFields;
            iArr[6] = i3;
            if (iArr[8] == 1) {
                iDaysInChineseMonth = leapDaysInChineseYear(iArr[2]);
            } else {
                iDaysInChineseMonth = daysInChineseMonth(iArr[2], i3);
            }
            int[] iArr2 = this.mFields;
            if (iArr2[10] > iDaysInChineseMonth) {
                iArr2[10] = iDaysInChineseMonth;
            }
            jk();
            return this;
        }
        if (i3 < getActualMinimum(i2) && i3 > getActualMaximum(i2)) {
            throw new IllegalArgumentException("value is out of date range [" + getActualMinimum(i2) + C5658n.f73185t8r + getActualMaximum(i2) + "]: " + i3);
        }
        try {
            add(i2, i3 - this.mFields[i2]);
            return this;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("unsupported set field:" + f40794e[i2]);
        }
    }
}
