package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.xiaomi.onetrack.util.C5814z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f65959cdj = "text-decoration";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f65960f7l8 = "background-color";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65961fn3e = "italic";

    /* JADX INFO: renamed from: g */
    private static final String f22128g = "color";

    /* JADX INFO: renamed from: h */
    private static final String f22129h = "digits";

    /* JADX INFO: renamed from: i */
    private static final String f22130i = "font-style";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f65962ki = "bold";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f65963kja0 = "all";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f65964ld6 = "ruby-position";

    /* JADX INFO: renamed from: n */
    private static final String f22131n = "}";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f65965n7h = "text-combine-upright";

    /* JADX INFO: renamed from: p */
    private static final String f22132p = "font-size";

    /* JADX INFO: renamed from: q */
    private static final String f22133q = "{";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f65967qrj = "under";

    /* JADX INFO: renamed from: s */
    private static final String f22134s = "font-weight";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f65968t8r = "underline";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f65969x2 = "over";

    /* JADX INFO: renamed from: y */
    private static final String f22135y = "font-family";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f65971zy = "WebvttCssParser";

    /* JADX INFO: renamed from: k */
    private final gvn7 f22136k = new gvn7();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final StringBuilder f65972toq = new StringBuilder();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final Pattern f65970zurt = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final Pattern f65966ni7 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    @dd
    static String f7l8(gvn7 gvn7Var, StringBuilder sb) {
        n7h(gvn7Var);
        if (gvn7Var.m13594k() == 0) {
            return null;
        }
        String strM13010g = m13010g(gvn7Var, sb);
        if (!"".equals(strM13010g)) {
            return strM13010g;
        }
        char cJp0y = (char) gvn7Var.jp0y();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cJp0y);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    private static String m13010g(gvn7 gvn7Var, StringBuilder sb) {
        boolean z2 = false;
        sb.setLength(0);
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        while (iM13596n < iM13591g && !z2) {
            char c2 = (char) gvn7Var.m13598q()[iM13596n];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z2 = true;
            } else {
                iM13596n++;
                sb.append(c2);
            }
        }
        gvn7Var.hyr(iM13596n - gvn7Var.m13596n());
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private void m13011k(C3688q c3688q, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f65970zurt.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                c3688q.wvg((String) C3844k.f7l8(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrMbx = lrht.mbx(str, C5814z.f32495a);
        String str2 = strArrMbx[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            c3688q.o1t(str2.substring(0, iIndexOf2));
            c3688q.m13005z(str2.substring(iIndexOf2 + 1));
        } else {
            c3688q.o1t(str2);
        }
        if (strArrMbx.length > 1) {
            c3688q.fu4((String[]) lrht.yqrt(strArrMbx, 1, strArrMbx.length));
        }
    }

    private static char ld6(gvn7 gvn7Var, int i2) {
        return (char) gvn7Var.m13598q()[i2];
    }

    /* JADX INFO: renamed from: n */
    private static void m13012n(String str, C3688q c3688q) {
        Matcher matcher = f65966ni7.matcher(com.google.common.base.zy.f7l8(str));
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("Invalid font-size: '");
            sb.append(str);
            sb.append("'.");
            ni7.qrj(f65971zy, sb.toString());
            return;
        }
        String str2 = (String) C3844k.f7l8(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                c3688q.m12997i(3);
                break;
            case "em":
                c3688q.m12997i(2);
                break;
            case "px":
                c3688q.m12997i(1);
                break;
            default:
                throw new IllegalStateException();
        }
        c3688q.t8r(Float.parseFloat((String) C3844k.f7l8(matcher.group(1))));
    }

    static void n7h(gvn7 gvn7Var) {
        while (true) {
            for (boolean z2 = true; gvn7Var.m13594k() > 0 && z2; z2 = false) {
                if (zy(gvn7Var) || toq(gvn7Var)) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m13013p(gvn7 gvn7Var, C3688q c3688q, StringBuilder sb) {
        n7h(gvn7Var);
        String strM13010g = m13010g(gvn7Var, sb);
        if (!"".equals(strM13010g) && ":".equals(f7l8(gvn7Var, sb))) {
            n7h(gvn7Var);
            String strM13015y = m13015y(gvn7Var, sb);
            if (strM13015y == null || "".equals(strM13015y)) {
                return;
            }
            int iM13596n = gvn7Var.m13596n();
            String strF7l8 = f7l8(gvn7Var, sb);
            if (!";".equals(strF7l8)) {
                if (!f22131n.equals(strF7l8)) {
                    return;
                } else {
                    gvn7Var.n5r1(iM13596n);
                }
            }
            if ("color".equals(strM13010g)) {
                c3688q.cdj(com.google.android.exoplayer2.util.f7l8.toq(strM13015y));
                return;
            }
            if (f65960f7l8.equals(strM13010g)) {
                c3688q.n7h(com.google.android.exoplayer2.util.f7l8.toq(strM13015y));
                return;
            }
            boolean z2 = true;
            if (f65964ld6.equals(strM13010g)) {
                if (f65969x2.equals(strM13015y)) {
                    c3688q.ni7(1);
                    return;
                } else {
                    if (f65967qrj.equals(strM13015y)) {
                        c3688q.ni7(2);
                        return;
                    }
                    return;
                }
            }
            if (f65965n7h.equals(strM13010g)) {
                if (!"all".equals(strM13015y) && !strM13015y.startsWith(f22129h)) {
                    z2 = false;
                }
                c3688q.m12996h(z2);
                return;
            }
            if (f65959cdj.equals(strM13010g)) {
                if ("underline".equals(strM13015y)) {
                    c3688q.m13003t(true);
                    return;
                }
                return;
            }
            if (f22135y.equals(strM13010g)) {
                c3688q.ki(strM13015y);
                return;
            }
            if (f22134s.equals(strM13010g)) {
                if ("bold".equals(strM13015y)) {
                    c3688q.kja0(true);
                }
            } else if (f22130i.equals(strM13010g)) {
                if ("italic".equals(strM13015y)) {
                    c3688q.fn3e(true);
                }
            } else if (f22132p.equals(strM13010g)) {
                m13012n(strM13015y, c3688q);
            }
        }
    }

    static void qrj(gvn7 gvn7Var) {
        while (!TextUtils.isEmpty(gvn7Var.cdj())) {
        }
    }

    @dd
    /* JADX INFO: renamed from: s */
    private static String m13014s(gvn7 gvn7Var, StringBuilder sb) {
        n7h(gvn7Var);
        if (gvn7Var.m13594k() < 5 || !"::cue".equals(gvn7Var.jk(5))) {
            return null;
        }
        int iM13596n = gvn7Var.m13596n();
        String strF7l8 = f7l8(gvn7Var, sb);
        if (strF7l8 == null) {
            return null;
        }
        if (f22133q.equals(strF7l8)) {
            gvn7Var.n5r1(iM13596n);
            return "";
        }
        String strX2 = "(".equals(strF7l8) ? x2(gvn7Var) : null;
        if (")".equals(f7l8(gvn7Var, sb))) {
            return strX2;
        }
        return null;
    }

    private static boolean toq(gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        byte[] bArrM13598q = gvn7Var.m13598q();
        if (iM13596n + 2 > iM13591g) {
            return false;
        }
        int i2 = iM13596n + 1;
        if (bArrM13598q[iM13596n] != 47) {
            return false;
        }
        int i3 = i2 + 1;
        if (bArrM13598q[i2] != 42) {
            return false;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iM13591g) {
                gvn7Var.hyr(iM13591g - gvn7Var.m13596n());
                return true;
            }
            if (((char) bArrM13598q[i3]) == '*' && ((char) bArrM13598q[i4]) == '/') {
                i3 = i4 + 1;
                iM13591g = i3;
            } else {
                i3 = i4;
            }
        }
    }

    private static String x2(gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        boolean z2 = false;
        while (iM13596n < iM13591g && !z2) {
            int i2 = iM13596n + 1;
            z2 = ((char) gvn7Var.m13598q()[iM13596n]) == ')';
            iM13596n = i2;
        }
        return gvn7Var.jk((iM13596n - 1) - gvn7Var.m13596n()).trim();
    }

    @dd
    /* JADX INFO: renamed from: y */
    private static String m13015y(gvn7 gvn7Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        while (!z2) {
            int iM13596n = gvn7Var.m13596n();
            String strF7l8 = f7l8(gvn7Var, sb);
            if (strF7l8 == null) {
                return null;
            }
            if (f22131n.equals(strF7l8) || ";".equals(strF7l8)) {
                gvn7Var.n5r1(iM13596n);
                z2 = true;
            } else {
                sb2.append(strF7l8);
            }
        }
        return sb2.toString();
    }

    private static boolean zy(gvn7 gvn7Var) {
        char cLd6 = ld6(gvn7Var, gvn7Var.m13596n());
        if (cLd6 != '\t' && cLd6 != '\n' && cLd6 != '\f' && cLd6 != '\r' && cLd6 != ' ') {
            return false;
        }
        gvn7Var.hyr(1);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public List<C3688q> m13016q(gvn7 gvn7Var) {
        this.f65972toq.setLength(0);
        int iM13596n = gvn7Var.m13596n();
        qrj(gvn7Var);
        this.f22136k.ncyb(gvn7Var.m13598q(), gvn7Var.m13596n());
        this.f22136k.n5r1(iM13596n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM13014s = m13014s(this.f22136k, this.f65972toq);
            if (strM13014s == null) {
                return arrayList;
            }
            if (!f22133q.equals(f7l8(this.f22136k, this.f65972toq))) {
                return arrayList;
            }
            C3688q c3688q = new C3688q();
            m13011k(c3688q, strM13014s);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int iM13596n2 = this.f22136k.m13596n();
                String strF7l8 = f7l8(this.f22136k, this.f65972toq);
                boolean z3 = strF7l8 == null || f22131n.equals(strF7l8);
                if (!z3) {
                    this.f22136k.n5r1(iM13596n2);
                    m13013p(this.f22136k, c3688q, this.f65972toq);
                }
                str = strF7l8;
                z2 = z3;
            }
            if (f22131n.equals(str)) {
                arrayList.add(c3688q);
            }
        }
    }
}
