package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.fu4;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.ni7;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.subrip.k */
/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3669k extends AbstractC3653g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f65749a9 = "{\\an7}";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f65750cdj = 0.08f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65751fn3e = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f65752fti = "{\\an8}";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f65753fu4 = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: i */
    private static final String f21977i = "SubripDecoder";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f65754jk = "{\\an6}";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f65755jp0y = "{\\an9}";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f65756ki = 0.92f;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f65757mcp = "{\\an5}";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f65759o1t = "{\\an2}";

    /* JADX INFO: renamed from: t */
    private static final String f21978t = "{\\an4}";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f65760t8r = 0.5f;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f65761wvg = "{\\an3}";

    /* JADX INFO: renamed from: z */
    private static final String f21979z = "{\\an1}";

    /* JADX INFO: renamed from: h */
    private final ArrayList<String> f21980h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final StringBuilder f65763kja0;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final Pattern f65762zurt = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final Pattern f65758ni7 = Pattern.compile("\\{\\\\.*?\\}");

    public C3669k() {
        super(f21977i);
        this.f65763kja0 = new StringBuilder();
        this.f21980h = new ArrayList<>();
    }

    private String a9(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f65758ni7.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i2 += length;
        }
        return sb.toString();
    }

    private static long jk(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) C3844k.f7l8(matcher.group(i2 + 2))) * 60 * 1000) + (Long.parseLong((String) C3844k.f7l8(matcher.group(i2 + 3))) * 1000);
        String strGroup2 = matcher.group(i2 + 4);
        if (strGroup2 != null) {
            j2 += Long.parseLong(strGroup2);
        }
        return j2 * 1000;
    }

    static float mcp(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return f65756ki;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.android.exoplayer2.text.toq m12932t(android.text.Spanned r17, @zy.dd java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.subrip.C3669k.m12932t(android.text.Spanned, java.lang.String):com.google.android.exoplayer2.text.toq");
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected f7l8 o1t(byte[] bArr, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        fu4 fu4Var = new fu4();
        gvn7 gvn7Var = new gvn7(bArr, i2);
        while (true) {
            String strCdj = gvn7Var.cdj();
            int i3 = 0;
            if (strCdj == null) {
                break;
            }
            if (strCdj.length() != 0) {
                try {
                    Integer.parseInt(strCdj);
                    String strCdj2 = gvn7Var.cdj();
                    if (strCdj2 == null) {
                        ni7.qrj(f21977i, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f65762zurt.matcher(strCdj2);
                    if (matcher.matches()) {
                        fu4Var.m13583k(jk(matcher, 1));
                        fu4Var.m13583k(jk(matcher, 6));
                        this.f65763kja0.setLength(0);
                        this.f21980h.clear();
                        for (String strCdj3 = gvn7Var.cdj(); !TextUtils.isEmpty(strCdj3); strCdj3 = gvn7Var.cdj()) {
                            if (this.f65763kja0.length() > 0) {
                                this.f65763kja0.append("<br>");
                            }
                            this.f65763kja0.append(a9(strCdj3, this.f21980h));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f65763kja0.toString());
                        String str = null;
                        while (true) {
                            if (i3 >= this.f21980h.size()) {
                                break;
                            }
                            String str2 = this.f21980h.get(i3);
                            if (str2.matches(f65753fu4)) {
                                str = str2;
                                break;
                            }
                            i3++;
                        }
                        arrayList.add(m12932t(spannedFromHtml, str));
                        arrayList.add(com.google.android.exoplayer2.text.toq.f21987o);
                    } else {
                        ni7.qrj(f21977i, strCdj2.length() != 0 ? "Skipping invalid timing: ".concat(strCdj2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    ni7.qrj(f21977i, strCdj.length() != 0 ? "Skipping invalid index: ".concat(strCdj) : new String("Skipping invalid index: "));
                }
            }
        }
        return new toq((com.google.android.exoplayer2.text.toq[]) arrayList.toArray(new com.google.android.exoplayer2.text.toq[0]), fu4Var.m13584q());
    }
}
