package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.xiaomi.onetrack.util.C5814z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.s */
/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3689s {

    /* JADX INFO: renamed from: k */
    private static final Pattern f22124k = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f65951toq = "WEBVTT";

    private C3689s() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Matcher m13006k(gvn7 gvn7Var) {
        String strCdj;
        while (true) {
            String strCdj2 = gvn7Var.cdj();
            if (strCdj2 == null) {
                return null;
            }
            if (f22124k.matcher(strCdj2).matches()) {
                do {
                    strCdj = gvn7Var.cdj();
                    if (strCdj != null) {
                    }
                } while (!strCdj.isEmpty());
            } else {
                Matcher matcher = C3684g.f22086g.matcher(strCdj2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m13007n(gvn7 gvn7Var) throws sok {
        int iM13596n = gvn7Var.m13596n();
        if (toq(gvn7Var)) {
            return;
        }
        gvn7Var.n5r1(iM13596n);
        String strValueOf = String.valueOf(gvn7Var.cdj());
        throw sok.createForMalformedContainer(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "), null);
    }

    /* JADX INFO: renamed from: q */
    public static long m13008q(String str) throws NumberFormatException {
        String[] strArrJbh = lrht.jbh(str, C5814z.f32495a);
        long j2 = 0;
        for (String str2 : lrht.mbx(strArrJbh[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (strArrJbh.length == 2) {
            j3 += Long.parseLong(strArrJbh[1]);
        }
        return j3 * 1000;
    }

    public static boolean toq(gvn7 gvn7Var) {
        String strCdj = gvn7Var.cdj();
        return strCdj != null && strCdj.startsWith(f65951toq);
    }

    public static float zy(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
