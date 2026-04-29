package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.common.base.C4258g;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.tx3g.k */
/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3683k extends AbstractC3653g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65879a9 = 12;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f65880d2ok = -1;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f65881d3 = 16711680;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f65882eqxt = 0;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f65883fti = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final char f65884fu4 = 65534;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f65885gvn7 = 4;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65886jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f65887jp0y = 2;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f65888lvui = "sans-serif";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65889mcp = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final char f65890ni7 = 65279;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65891o1t = 1952608120;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f65892oc = 0;

    /* JADX INFO: renamed from: r */
    private static final float f22079r = 0.85f;

    /* JADX INFO: renamed from: t */
    private static final int f22080t = 8;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f65893wvg = "Serif";

    /* JADX INFO: renamed from: z */
    private static final int f22081z = 1937013100;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f65894zurt = "Tx3gDecoder";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final int f65895cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final int f65896fn3e;

    /* JADX INFO: renamed from: h */
    private final boolean f22082h;

    /* JADX INFO: renamed from: i */
    private final float f22083i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final int f65897ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f65898kja0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final String f65899t8r;

    public C3683k(List<byte[]> list) {
        super(f65894zurt);
        this.f65898kja0 = new gvn7();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f65895cdj = 0;
            this.f65897ki = -1;
            this.f65899t8r = "sans-serif";
            this.f22082h = false;
            this.f22083i = f22079r;
            this.f65896fn3e = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f65895cdj = bArr[24];
        this.f65897ki = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f65899t8r = f65893wvg.equals(lrht.oc(bArr, 43, bArr.length - 43)) ? C3548p.f65197ki : "sans-serif";
        int i2 = bArr[25] * com.google.common.base.zy.f68119fu4;
        this.f65896fn3e = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f22082h = z2;
        if (z2) {
            this.f22083i = lrht.ki(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f22083i = f22079r;
        }
    }

    private static void a9(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z2 = (i2 & 1) != 0;
            boolean z3 = (i2 & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z5 = (i2 & 4) != 0;
            if (z5) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z5 || z2 || z3) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    private static void fti(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, i3, 16711713);
        }
    }

    private static void jk(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    private static String jp0y(gvn7 gvn7Var) throws C3660s {
        char cF7l8;
        mcp(gvn7Var.m13594k() >= 2);
        int iLvui = gvn7Var.lvui();
        return iLvui == 0 ? "" : (gvn7Var.m13594k() < 2 || !((cF7l8 = gvn7Var.f7l8()) == 65279 || cF7l8 == 65534)) ? gvn7Var.a9(iLvui, C4258g.f68103zy) : gvn7Var.a9(iLvui, C4258g.f25662g);
    }

    private static void mcp(boolean z2) throws C3660s {
        if (!z2) {
            throw new C3660s("Unexpected subtitle format.");
        }
    }

    /* JADX INFO: renamed from: t */
    private void m12974t(gvn7 gvn7Var, SpannableStringBuilder spannableStringBuilder) throws C3660s {
        int length;
        mcp(gvn7Var.m13594k() >= 12);
        int iLvui = gvn7Var.lvui();
        int iLvui2 = gvn7Var.lvui();
        gvn7Var.hyr(2);
        int iJp0y = gvn7Var.jp0y();
        gvn7Var.hyr(1);
        int iKja0 = gvn7Var.kja0();
        if (iLvui2 > spannableStringBuilder.length()) {
            int length2 = spannableStringBuilder.length();
            StringBuilder sb = new StringBuilder(68);
            sb.append("Truncating styl end (");
            sb.append(iLvui2);
            sb.append(") to cueText.length() (");
            sb.append(length2);
            sb.append(").");
            ni7.qrj(f65894zurt, sb.toString());
            length = spannableStringBuilder.length();
        } else {
            length = iLvui2;
        }
        if (iLvui < length) {
            int i2 = length;
            a9(spannableStringBuilder, iJp0y, this.f65895cdj, iLvui, i2, 0);
            jk(spannableStringBuilder, iKja0, this.f65897ki, iLvui, i2, 0);
            return;
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("Ignoring styl with start (");
        sb2.append(iLvui);
        sb2.append(") >= end (");
        sb2.append(length);
        sb2.append(").");
        ni7.qrj(f65894zurt, sb2.toString());
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s {
        this.f65898kja0.ncyb(bArr, i2);
        String strJp0y = jp0y(this.f65898kja0);
        if (strJp0y.isEmpty()) {
            return toq.f22084q;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJp0y);
        a9(spannableStringBuilder, this.f65895cdj, 0, 0, spannableStringBuilder.length(), 16711680);
        jk(spannableStringBuilder, this.f65897ki, -1, 0, spannableStringBuilder.length(), 16711680);
        fti(spannableStringBuilder, this.f65899t8r, 0, spannableStringBuilder.length());
        float fKi = this.f22083i;
        while (this.f65898kja0.m13594k() >= 8) {
            int iM13596n = this.f65898kja0.m13596n();
            int iKja0 = this.f65898kja0.kja0();
            int iKja02 = this.f65898kja0.kja0();
            if (iKja02 == f22081z) {
                mcp(this.f65898kja0.m13594k() >= 2);
                int iLvui = this.f65898kja0.lvui();
                for (int i3 = 0; i3 < iLvui; i3++) {
                    m12974t(this.f65898kja0, spannableStringBuilder);
                }
            } else if (iKja02 == f65891o1t && this.f22082h) {
                mcp(this.f65898kja0.m13594k() >= 2);
                fKi = lrht.ki(this.f65898kja0.lvui() / this.f65896fn3e, 0.0f, 0.95f);
            }
            this.f65898kja0.n5r1(iM13596n + iKja0);
        }
        return new toq(new toq.zy().wvg(spannableStringBuilder).m12937i(fKi, 0).fn3e(0).m12938k());
    }
}
