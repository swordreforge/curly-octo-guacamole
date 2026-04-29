package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.text.ssa.zy;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.ssa.k */
/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3665k extends AbstractC3653g {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final Pattern f65722fn3e = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f65723fu4 = "Dialogue:";

    /* JADX INFO: renamed from: i */
    private static final String f21950i = "SsaDecoder";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final String f65724ni7 = "Style:";

    /* JADX INFO: renamed from: z */
    private static final float f21951z = 0.05f;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final String f65725zurt = "Format:";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Map<String, zy> f65726cdj;

    /* JADX INFO: renamed from: h */
    @dd
    private final toq f21952h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private float f65727ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final boolean f65728kja0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private float f65729t8r;

    public C3665k() {
        this(null);
    }

    private void a9(String str, toq toqVar, List<List<com.google.android.exoplayer2.text.toq>> list, List<Long> list2) {
        int i2;
        C3844k.m13629k(str.startsWith(f65723fu4));
        String[] strArrSplit = str.substring(9).split(",", toqVar.f21956n);
        if (strArrSplit.length != toqVar.f21956n) {
            ni7.qrj(f21950i, str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long jOc = oc(strArrSplit[toqVar.f21955k]);
        if (jOc == C3548p.f65257toq) {
            ni7.qrj(f21950i, str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long jOc2 = oc(strArrSplit[toqVar.f65730toq]);
        if (jOc2 == C3548p.f65257toq) {
            ni7.qrj(f21950i, str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, zy> map = this.f65726cdj;
        zy zyVar = (map == null || (i2 = toqVar.f65731zy) == -1) ? null : map.get(strArrSplit[i2].trim());
        String str2 = strArrSplit[toqVar.f21957q];
        com.google.android.exoplayer2.text.toq toqVarJk = jk(zy.toq.m12931q(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), zyVar, zy.toq.toq(str2), this.f65727ki, this.f65729t8r);
        int iM12923t = m12923t(jOc2, list2, list);
        for (int iM12923t2 = m12923t(jOc, list2, list); iM12923t2 < iM12923t; iM12923t2++) {
            list.get(iM12923t2).add(toqVarJk);
        }
    }

    private static int d2ok(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i2);
                ni7.qrj(f21950i, sb.toString());
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Map<String, zy> d3(gvn7 gvn7Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zy.C3668k c3668kM12929k = null;
        while (true) {
            String strCdj = gvn7Var.cdj();
            if (strCdj == null || (gvn7Var.m13594k() != 0 && gvn7Var.m13602y() == 91)) {
                break;
            }
            if (strCdj.startsWith(f65725zurt)) {
                c3668kM12929k = zy.C3668k.m12929k(strCdj);
            } else if (strCdj.startsWith(f65724ni7)) {
                if (c3668kM12929k == null) {
                    ni7.qrj(f21950i, strCdj.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(strCdj) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    zy qVar = zy.toq(strCdj, c3668kM12929k);
                    if (qVar != null) {
                        linkedHashMap.put(qVar.f21962k, qVar);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int eqxt(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i2);
                ni7.qrj(f21950i, sb.toString());
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private void fti(gvn7 gvn7Var, List<List<com.google.android.exoplayer2.text.toq>> list, List<Long> list2) {
        toq toqVarM12924k = this.f65728kja0 ? this.f21952h : null;
        while (true) {
            String strCdj = gvn7Var.cdj();
            if (strCdj == null) {
                return;
            }
            if (strCdj.startsWith(f65725zurt)) {
                toqVarM12924k = toq.m12924k(strCdj);
            } else if (strCdj.startsWith(f65723fu4)) {
                if (toqVarM12924k == null) {
                    ni7.qrj(f21950i, strCdj.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strCdj) : new String("Skipping dialogue line before complete format: "));
                } else {
                    a9(strCdj, toqVarM12924k, list, list2);
                }
            }
        }
    }

    private void gvn7(gvn7 gvn7Var) {
        while (true) {
            String strCdj = gvn7Var.cdj();
            if (strCdj == null) {
                return;
            }
            if (gvn7Var.m13594k() != 0 && gvn7Var.m13602y() == 91) {
                return;
            }
            String[] strArrSplit = strCdj.split(":");
            if (strArrSplit.length == 2) {
                String strF7l8 = com.google.common.base.zy.f7l8(strArrSplit[0].trim());
                strF7l8.hashCode();
                if (strF7l8.equals("playresx")) {
                    this.f65727ki = Float.parseFloat(strArrSplit[1].trim());
                } else if (strF7l8.equals("playresy")) {
                    try {
                        this.f65729t8r = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static com.google.android.exoplayer2.text.toq jk(String str, @dd zy zyVar, zy.toq toqVar, float f2, float f3) {
        SpannableString spannableString = new SpannableString(str);
        toq.zy zyVarWvg = new toq.zy().wvg(spannableString);
        if (zyVar != null) {
            if (zyVar.f65742zy != null) {
                spannableString.setSpan(new ForegroundColorSpan(zyVar.f65742zy.intValue()), 0, spannableString.length(), 33);
            }
            float f4 = zyVar.f21964q;
            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                zyVarWvg.mcp(f4 / f3, 1);
            }
            boolean z2 = zyVar.f21963n;
            if (z2 && zyVar.f21961g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z2) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (zyVar.f21961g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (zyVar.f65740f7l8) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (zyVar.f21965y) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = toqVar.f21976k;
        if (i2 == -1) {
            i2 = zyVar != null ? zyVar.f65741toq : -1;
        }
        zyVarWvg.m12943t(lvui(i2)).fu4(d2ok(i2)).fn3e(eqxt(i2));
        PointF pointF = toqVar.f65748toq;
        if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
            zyVarWvg.ni7(mcp(zyVarWvg.m12942s()));
            zyVarWvg.m12937i(mcp(zyVarWvg.m12935g()), 0);
        } else {
            zyVarWvg.ni7(pointF.x / f2);
            zyVarWvg.m12937i(toqVar.f65748toq.y / f3, 0);
        }
        return zyVarWvg.m12938k();
    }

    private void jp0y(gvn7 gvn7Var) {
        while (true) {
            String strCdj = gvn7Var.cdj();
            if (strCdj == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strCdj)) {
                gvn7(gvn7Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strCdj)) {
                this.f65726cdj = d3(gvn7Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(strCdj)) {
                ni7.m13704y(f21950i, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strCdj)) {
                return;
            }
        }
    }

    @dd
    private static Layout.Alignment lvui(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i2);
                ni7.qrj(f21950i, sb.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static float mcp(int i2) {
        if (i2 == 0) {
            return f21951z;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static long oc(String str) {
        Matcher matcher = f65722fn3e.matcher(str.trim());
        return !matcher.matches() ? C3548p.f65257toq : (Long.parseLong((String) lrht.ld6(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) lrht.ld6(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) lrht.ld6(matcher.group(3))) * 1000000) + (Long.parseLong((String) lrht.ld6(matcher.group(4))) * 10000);
    }

    /* JADX INFO: renamed from: t */
    private static int m12923t(long j2, List<Long> list, List<List<com.google.android.exoplayer2.text.toq>> list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (list.get(size).longValue() == j2) {
                return size;
            }
            if (list.get(size).longValue() < j2) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected f7l8 o1t(byte[] bArr, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        gvn7 gvn7Var = new gvn7(bArr, i2);
        if (!this.f65728kja0) {
            jp0y(gvn7Var);
        }
        fti(gvn7Var, arrayList, arrayList2);
        return new C3667q(arrayList, arrayList2);
    }

    public C3665k(@dd List<byte[]> list) {
        super(f21950i);
        this.f65727ki = -3.4028235E38f;
        this.f65729t8r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f65728kja0 = false;
            this.f21952h = null;
            return;
        }
        this.f65728kja0 = true;
        String strD3 = lrht.d3(list.get(0));
        C3844k.m13629k(strD3.startsWith(f65725zurt));
        this.f21952h = (toq) C3844k.f7l8(toq.m12924k(strD3));
        jp0y(new gvn7(list.get(1)));
    }
}
