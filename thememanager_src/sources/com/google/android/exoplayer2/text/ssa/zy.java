package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.common.primitives.C4746s;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;
import zy.x2;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f65732cdj = 7;

    /* JADX INFO: renamed from: h */
    public static final int f21958h = 6;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f65733ki = 8;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f65734kja0 = 5;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f65735ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f65736n7h = 4;

    /* JADX INFO: renamed from: p */
    public static final int f21959p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f65737qrj = 3;

    /* JADX INFO: renamed from: s */
    private static final String f21960s = "SsaStyle";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f65738t8r = 9;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f65739x2 = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f65740f7l8;

    /* JADX INFO: renamed from: g */
    public final boolean f21961g;

    /* JADX INFO: renamed from: k */
    public final String f21962k;

    /* JADX INFO: renamed from: n */
    public final boolean f21963n;

    /* JADX INFO: renamed from: q */
    public final float f21964q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f65741toq;

    /* JADX INFO: renamed from: y */
    public final boolean f21965y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @x2
    @dd
    public final Integer f65742zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ssa.zy$k */
    /* JADX INFO: compiled from: SsaStyle.java */
    static final class C3668k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f65743f7l8;

        /* JADX INFO: renamed from: g */
        public final int f21966g;

        /* JADX INFO: renamed from: k */
        public final int f21967k;

        /* JADX INFO: renamed from: n */
        public final int f21968n;

        /* JADX INFO: renamed from: q */
        public final int f21969q;

        /* JADX INFO: renamed from: s */
        public final int f21970s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65744toq;

        /* JADX INFO: renamed from: y */
        public final int f21971y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f65745zy;

        private C3668k(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f21967k = i2;
            this.f65744toq = i3;
            this.f65745zy = i4;
            this.f21969q = i5;
            this.f21968n = i6;
            this.f21966g = i7;
            this.f65743f7l8 = i8;
            this.f21971y = i9;
            this.f21970s = i10;
        }

        @dd
        /* JADX INFO: renamed from: k */
        public static C3668k m12929k(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                String strF7l8 = com.google.common.base.zy.f7l8(strArrSplit[i10].trim());
                strF7l8.hashCode();
                switch (strF7l8) {
                    case "italic":
                        i7 = i10;
                        break;
                    case "underline":
                        i8 = i10;
                        break;
                    case "strikeout":
                        i9 = i10;
                        break;
                    case "primarycolour":
                        i4 = i10;
                        break;
                    case "bold":
                        i6 = i10;
                        break;
                    case "name":
                        i2 = i10;
                        break;
                    case "fontsize":
                        i5 = i10;
                        break;
                    case "alignment":
                        i3 = i10;
                        break;
                }
            }
            if (i2 != -1) {
                return new C3668k(i2, i3, i4, i5, i6, i7, i8, i9, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    static final class toq {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f65747zy = "SsaStyle.Overrides";

        /* JADX INFO: renamed from: k */
        public final int f21976k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public final PointF f65748toq;

        /* JADX INFO: renamed from: q */
        private static final Pattern f21974q = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: n */
        private static final String f21973n = "\\s*\\d+(?:\\.\\d+)?\\s*";

        /* JADX INFO: renamed from: g */
        private static final Pattern f21972g = Pattern.compile(lrht.gvn7("\\\\pos\\((%1$s),(%1$s)\\)", f21973n));

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final Pattern f65746f7l8 = Pattern.compile(lrht.gvn7("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", f21973n));

        /* JADX INFO: renamed from: y */
        private static final Pattern f21975y = Pattern.compile("\\\\an(\\d+)");

        private toq(int i2, @dd PointF pointF) {
            this.f21976k = i2;
            this.f65748toq = pointF;
        }

        /* JADX INFO: renamed from: k */
        private static int m12930k(String str) {
            Matcher matcher = f21975y.matcher(str);
            if (matcher.find()) {
                return zy.m12928q((String) C3844k.f7l8(matcher.group(1)));
            }
            return -1;
        }

        /* JADX INFO: renamed from: q */
        public static String m12931q(String str) {
            return f21974q.matcher(str).replaceAll("");
        }

        public static toq toq(String str) {
            Matcher matcher = f21974q.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) C3844k.f7l8(matcher.group(1));
                try {
                    PointF pointFZy = zy(str2);
                    if (pointFZy != null) {
                        pointF = pointFZy;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iM12930k = m12930k(str2);
                    if (iM12930k != -1) {
                        i2 = iM12930k;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new toq(i2, pointF);
        }

        @dd
        private static PointF zy(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f21972g.matcher(str);
            Matcher matcher2 = f65746f7l8.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    ni7.m13704y(f65747zy, sb.toString());
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C3844k.f7l8(strGroup)).trim()), Float.parseFloat(((String) C3844k.f7l8(strGroup2)).trim()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ssa.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SsaStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7962zy {
    }

    private zy(String str, int i2, @x2 @dd Integer num, float f2, boolean z2, boolean z3, boolean z5, boolean z6) {
        this.f21962k = str;
        this.f65741toq = i2;
        this.f65742zy = num;
        this.f21964q = f2;
        this.f21963n = z2;
        this.f21961g = z3;
        this.f65740f7l8 = z5;
        this.f21965y = z6;
    }

    private static float f7l8(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            ni7.n7h(f21960s, sb.toString(), e2);
            return -3.4028235E38f;
        }
    }

    @x2
    @dd
    /* JADX INFO: renamed from: g */
    public static Integer m12925g(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C3844k.m13629k(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(C4746s.m16718q(((j2 >> 24) & 255) ^ 255), C4746s.m16718q(j2 & 255), C4746s.m16718q((j2 >> 8) & 255), C4746s.m16718q((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            ni7.n7h(f21960s, sb.toString(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static boolean m12927n(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            ni7.n7h(f21960s, sb.toString(), e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static int m12928q(String str) {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (zy(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        ni7.qrj(f21960s, strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    @dd
    public static zy toq(String str, C3668k c3668k) {
        C3844k.m13629k(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = c3668k.f21970s;
        if (length != i2) {
            ni7.qrj(f21960s, lrht.gvn7("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c3668k.f21967k].trim();
            int i3 = c3668k.f65744toq;
            int iM12928q = i3 != -1 ? m12928q(strArrSplit[i3].trim()) : -1;
            int i4 = c3668k.f65745zy;
            Integer numM12925g = i4 != -1 ? m12925g(strArrSplit[i4].trim()) : null;
            int i5 = c3668k.f21969q;
            float fF7l8 = i5 != -1 ? f7l8(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c3668k.f21968n;
            boolean z2 = i6 != -1 && m12927n(strArrSplit[i6].trim());
            int i7 = c3668k.f21966g;
            boolean z3 = i7 != -1 && m12927n(strArrSplit[i7].trim());
            int i8 = c3668k.f65743f7l8;
            boolean z5 = i8 != -1 && m12927n(strArrSplit[i8].trim());
            int i9 = c3668k.f21971y;
            return new zy(strTrim, iM12928q, numM12925g, fF7l8, z2, z3, z5, i9 != -1 && m12927n(strArrSplit[i9].trim()));
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            ni7.n7h(f21960s, sb.toString(), e2);
            return null;
        }
    }

    private static boolean zy(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }
}
