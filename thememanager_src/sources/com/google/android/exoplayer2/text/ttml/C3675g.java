package com.google.android.exoplayer2.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.span.C3661g;
import com.google.android.exoplayer2.text.span.C3662k;
import com.google.android.exoplayer2.text.span.C3664q;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.miui.maml.elements.MusicLyricParser;
import java.util.ArrayDeque;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.g */
/* JADX INFO: compiled from: TtmlRenderUtil.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3675g {

    /* JADX INFO: renamed from: k */
    private static final String f22028k = "TtmlRenderUtil";

    private C3675g() {
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static f7l8 m12957g(@dd f7l8 f7l8Var, @dd String[] strArr, Map<String, f7l8> map) {
        int i2 = 0;
        if (f7l8Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f7l8 f7l8Var2 = new f7l8();
                int length = strArr.length;
                while (i2 < length) {
                    f7l8Var2.m12949k(map.get(strArr[i2]));
                    i2++;
                }
                return f7l8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return f7l8Var.m12949k(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    f7l8Var.m12949k(map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return f7l8Var;
    }

    /* JADX INFO: renamed from: k */
    public static void m12958k(Spannable spannable, int i2, int i3, f7l8 f7l8Var, @dd C3678q c3678q, Map<String, f7l8> map, int i4) {
        C3678q c3678qM12959n;
        f7l8 f7l8VarM12957g;
        int i5;
        if (f7l8Var.x2() != -1) {
            spannable.setSpan(new StyleSpan(f7l8Var.x2()), i2, i3, 33);
        }
        if (f7l8Var.m12948i()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (f7l8Var.fn3e()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (f7l8Var.cdj()) {
            C3664q.m12922k(spannable, new ForegroundColorSpan(f7l8Var.zy()), i2, i3, 33);
        }
        if (f7l8Var.m12947h()) {
            C3664q.m12922k(spannable, new BackgroundColorSpan(f7l8Var.toq()), i2, i3, 33);
        }
        if (f7l8Var.m12952q() != null) {
            C3664q.m12922k(spannable, new TypefaceSpan(f7l8Var.m12952q()), i2, i3, 33);
        }
        if (f7l8Var.kja0() != null) {
            toq toqVar = (toq) C3844k.f7l8(f7l8Var.kja0());
            int i6 = toqVar.f22066k;
            if (i6 == -1) {
                i6 = (i4 == 2 || i4 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i5 = toqVar.f65858toq;
            }
            int i7 = toqVar.f65859zy;
            if (i7 == -2) {
                i7 = 1;
            }
            C3664q.m12922k(spannable, new C3661g(i6, i5, i7), i2, i3, 33);
        }
        int iM12951p = f7l8Var.m12951p();
        if (iM12951p == 2) {
            C3678q c3678qM12960q = m12960q(c3678q, map);
            if (c3678qM12960q != null && (c3678qM12959n = m12959n(c3678qM12960q, map)) != null) {
                if (c3678qM12959n.f7l8() != 1 || c3678qM12959n.m12965g(0).f65854toq == null) {
                    ni7.m13704y(f22028k, "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) lrht.ld6(c3678qM12959n.m12965g(0).f65854toq);
                    f7l8 f7l8VarM12957g2 = m12957g(c3678qM12959n.f22053g, c3678qM12959n.x2(), map);
                    int iM12953s = f7l8VarM12957g2 != null ? f7l8VarM12957g2.m12953s() : -1;
                    if (iM12953s == -1 && (f7l8VarM12957g = m12957g(c3678qM12960q.f22053g, c3678qM12960q.x2(), map)) != null) {
                        iM12953s = f7l8VarM12957g.m12953s();
                    }
                    spannable.setSpan(new com.google.android.exoplayer2.text.span.zy(str, iM12953s), i2, i3, 33);
                }
            }
        } else if (iM12951p == 3 || iM12951p == 4) {
            spannable.setSpan(new C3676k(), i2, i3, 33);
        }
        if (f7l8Var.n7h()) {
            C3664q.m12922k(spannable, new C3662k(), i2, i3, 33);
        }
        int iM12946g = f7l8Var.m12946g();
        if (iM12946g == 1) {
            C3664q.m12922k(spannable, new AbsoluteSizeSpan((int) f7l8Var.m12950n(), true), i2, i3, 33);
        } else if (iM12946g == 2) {
            C3664q.m12922k(spannable, new RelativeSizeSpan(f7l8Var.m12950n()), i2, i3, 33);
        } else {
            if (iM12946g != 3) {
                return;
            }
            C3664q.m12922k(spannable, new RelativeSizeSpan(f7l8Var.m12950n() / 100.0f), i2, i3, 33);
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static C3678q m12959n(C3678q c3678q, Map<String, f7l8> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c3678q);
        while (!arrayDeque.isEmpty()) {
            C3678q c3678q2 = (C3678q) arrayDeque.pop();
            f7l8 f7l8VarM12957g = m12957g(c3678q2.f22053g, c3678q2.x2(), map);
            if (f7l8VarM12957g != null && f7l8VarM12957g.m12951p() == 3) {
                return c3678q2;
            }
            for (int iF7l8 = c3678q2.f7l8() - 1; iF7l8 >= 0; iF7l8--) {
                arrayDeque.push(c3678q2.m12965g(iF7l8));
            }
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static C3678q m12960q(@dd C3678q c3678q, Map<String, f7l8> map) {
        while (c3678q != null) {
            f7l8 f7l8VarM12957g = m12957g(c3678q.f22053g, c3678q.x2(), map);
            if (f7l8VarM12957g != null && f7l8VarM12957g.m12951p() == 1) {
                return c3678q;
            }
            c3678q = c3678q.f22056p;
        }
        return null;
    }

    static String toq(String str) {
        return str.replaceAll(MusicLyricParser.CRLF, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void zy(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }
}
