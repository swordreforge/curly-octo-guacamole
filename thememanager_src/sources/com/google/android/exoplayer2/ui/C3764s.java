package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.s */
/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3764s implements InterfaceC3746f {

    /* JADX INFO: renamed from: k */
    private final Resources f22843k;

    public C3764s(Resources resources) {
        this.f22843k = (Resources) C3844k.f7l8(resources);
    }

    private String f7l8(xwq3 xwq3Var) {
        int i2 = xwq3Var.f23674j;
        int i3 = xwq3Var.f23679o;
        return (i2 == -1 || i3 == -1) ? "" : this.f22843k.getString(C3748h.ld6.f22654r, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: g */
    private String m13330g(xwq3 xwq3Var) {
        String str = xwq3Var.f23678n;
        if (TextUtils.isEmpty(str) || C3548p.f65138bwp.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = com.google.android.exoplayer2.util.lrht.f23230k >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeM13656e = com.google.android.exoplayer2.util.lrht.m13656e();
        String displayName = localeForLanguageTag.getDisplayName(localeM13656e);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String strValueOf = String.valueOf(displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeM13656e));
            String strValueOf2 = String.valueOf(displayName.substring(iOffsetByCodePoints));
            displayName = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    /* JADX INFO: renamed from: n */
    private String m13331n(xwq3 xwq3Var) {
        String strM13332p = m13332p(m13330g(xwq3Var), m13335y(xwq3Var));
        return TextUtils.isEmpty(strM13332p) ? m13333q(xwq3Var) : strM13332p;
    }

    /* JADX INFO: renamed from: p */
    private String m13332p(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f22843k.getString(C3748h.ld6.f66240eqxt, string, str);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: q */
    private String m13333q(xwq3 xwq3Var) {
        return TextUtils.isEmpty(xwq3Var.f23681q) ? "" : xwq3Var.f23681q;
    }

    /* JADX INFO: renamed from: s */
    private static int m13334s(xwq3 xwq3Var) {
        int iX2 = com.google.android.exoplayer2.util.wvg.x2(xwq3Var.f23682r);
        if (iX2 != -1) {
            return iX2;
        }
        if (com.google.android.exoplayer2.util.wvg.kja0(xwq3Var.f23673i) != null) {
            return 2;
        }
        if (com.google.android.exoplayer2.util.wvg.zy(xwq3Var.f23673i) != null) {
            return 1;
        }
        if (xwq3Var.f23674j == -1 && xwq3Var.f23679o == -1) {
            return (xwq3Var.f23686v == -1 && xwq3Var.f23668d == -1) ? -1 : 1;
        }
        return 2;
    }

    private String toq(xwq3 xwq3Var) {
        int i2 = xwq3Var.f23686v;
        return (i2 == -1 || i2 < 1) ? "" : i2 != 1 ? i2 != 2 ? (i2 == 6 || i2 == 7) ? this.f22843k.getString(C3748h.ld6.f22643e) : i2 != 8 ? this.f22843k.getString(C3748h.ld6.f66267vyq) : this.f22843k.getString(C3748h.ld6.f66260nn86) : this.f22843k.getString(C3748h.ld6.f66266uv6) : this.f22843k.getString(C3748h.ld6.f66254lvui);
    }

    /* JADX INFO: renamed from: y */
    private String m13335y(xwq3 xwq3Var) {
        String string = (xwq3Var.f23689y & 2) != 0 ? this.f22843k.getString(C3748h.ld6.f66239dd) : "";
        if ((xwq3Var.f23689y & 4) != 0) {
            string = m13332p(string, this.f22843k.getString(C3748h.ld6.f22650l));
        }
        if ((xwq3Var.f23689y & 8) != 0) {
            string = m13332p(string, this.f22843k.getString(C3748h.ld6.f66258ncyb));
        }
        return (xwq3Var.f23689y & 1088) != 0 ? m13332p(string, this.f22843k.getString(C3748h.ld6.f66270x9kr)) : string;
    }

    private String zy(xwq3 xwq3Var) {
        int i2 = xwq3Var.f23672h;
        return i2 == -1 ? "" : this.f22843k.getString(C3748h.ld6.f66237d2ok, Float.valueOf(i2 / 1000000.0f));
    }

    @Override // com.google.android.exoplayer2.ui.InterfaceC3746f
    /* JADX INFO: renamed from: k */
    public String mo13291k(xwq3 xwq3Var) {
        int iM13334s = m13334s(xwq3Var);
        String strM13332p = iM13334s == 2 ? m13332p(m13335y(xwq3Var), f7l8(xwq3Var), zy(xwq3Var)) : iM13334s == 1 ? m13332p(m13331n(xwq3Var), toq(xwq3Var), zy(xwq3Var)) : m13331n(xwq3Var);
        return strM13332p.length() == 0 ? this.f22843k.getString(C3748h.ld6.f66246hb) : strM13332p;
    }
}
