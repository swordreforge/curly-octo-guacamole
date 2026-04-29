package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.android.thememanager.util.ltg8;
import com.google.android.exoplayer2.text.span.C3662k;
import com.google.android.exoplayer2.text.span.C3664q;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.text.webvtt.C3684g;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.xiaomi.onetrack.util.C5814z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.g */
/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3684g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final Map<String, Integer> f65900a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f65901cdj = "nbsp";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65903fn3e = "lang";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f65904fu4 = "u";

    /* JADX INFO: renamed from: h */
    private static final String f22087h = "amp";

    /* JADX INFO: renamed from: i */
    private static final String f22088i = "i";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final Map<String, Integer> f65905jk;

    /* JADX INFO: renamed from: k */
    private static final int f22089k = 1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f65906ki = "b";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f65907kja0 = "gt";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final char f65908ld6 = '&';

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f65909mcp = "WebvttCueParser";

    /* JADX INFO: renamed from: n */
    private static final int f22090n = 5;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f65910n7h = "lt";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f65911ni7 = "rt";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65912o1t = 1;

    /* JADX INFO: renamed from: p */
    private static final char f22091p = '/';

    /* JADX INFO: renamed from: q */
    private static final int f22092q = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final char f65913qrj = ' ';

    /* JADX INFO: renamed from: s */
    private static final char f22093s = '>';

    /* JADX INFO: renamed from: t */
    static final float f22094t = 0.5f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f65914t8r = "c";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f65915toq = 2;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f65916wvg = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final char f65917x2 = ';';

    /* JADX INFO: renamed from: y */
    private static final char f22095y = '<';

    /* JADX INFO: renamed from: z */
    private static final String f22096z = "v";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f65918zurt = "ruby";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f65919zy = 3;

    /* JADX INFO: renamed from: g */
    public static final Pattern f22086g = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final Pattern f65902f7l8 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.g$n */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class n {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public CharSequence f65923zy;

        /* JADX INFO: renamed from: k */
        public long f22098k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f65922toq = 0;

        /* JADX INFO: renamed from: q */
        public int f22101q = 2;

        /* JADX INFO: renamed from: n */
        public float f22099n = -3.4028235E38f;

        /* JADX INFO: renamed from: g */
        public int f22097g = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f65920f7l8 = 0;

        /* JADX INFO: renamed from: y */
        public float f22103y = -3.4028235E38f;

        /* JADX INFO: renamed from: s */
        public int f22102s = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: p */
        public float f22100p = 1.0f;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f65921ld6 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: g */
        private static int m12984g(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: renamed from: n */
        private static float m12985n(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: q */
        private static float m12986q(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 == 1) {
                return f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
            }
            if (i2 == 2) {
                return f2;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        private static float toq(float f2, int i2) {
            if (f2 == -3.4028235E38f || i2 != 0 || (f2 >= 0.0f && f2 <= 1.0f)) {
                return f2 != -3.4028235E38f ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        @dd
        private static Layout.Alignment zy(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Unknown textAlignment: ");
                            sb.append(i2);
                            ni7.qrj(C3684g.f65909mcp, sb.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public toq.zy f7l8() {
            float fM12985n = this.f22103y;
            if (fM12985n == -3.4028235E38f) {
                fM12985n = m12985n(this.f22101q);
            }
            int iM12984g = this.f22102s;
            if (iM12984g == Integer.MIN_VALUE) {
                iM12984g = m12984g(this.f22101q);
            }
            toq.zy zyVarJk = new toq.zy().m12943t(zy(this.f22101q)).m12937i(toq(this.f22099n, this.f22097g), this.f22097g).fn3e(this.f65920f7l8).ni7(fM12985n).fu4(iM12984g).o1t(Math.min(this.f22100p, m12986q(iM12984g, fM12985n))).jk(this.f65921ld6);
            CharSequence charSequence = this.f65923zy;
            if (charSequence != null) {
                zyVarJk.wvg(charSequence);
            }
            return zyVarJk;
        }

        /* JADX INFO: renamed from: k */
        public C3686n m12987k() {
            return new C3686n(f7l8().m12938k(), this.f22098k, this.f65922toq);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.g$q */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class q implements Comparable<q> {

        /* JADX INFO: renamed from: k */
        public final int f22104k;

        /* JADX INFO: renamed from: q */
        public final C3688q f22105q;

        public q(int i2, C3688q c3688q) {
            this.f22104k = i2;
            this.f22105q = c3688q;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(q qVar) {
            return Integer.compare(this.f22104k, qVar.f22104k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.g$toq */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    static class toq {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final Comparator<toq> f65924zy = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.f7l8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3684g.toq.m12989n((C3684g.toq) obj, (C3684g.toq) obj2);
            }
        };

        /* JADX INFO: renamed from: k */
        private final zy f22106k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f65925toq;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ int m12989n(toq toqVar, toq toqVar2) {
            return Integer.compare(toqVar.f22106k.f65926toq, toqVar2.f22106k.f65926toq);
        }

        private toq(zy zyVar, int i2) {
            this.f22106k = zyVar;
            this.f65925toq = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.g$zy */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        public final String f22107k;

        /* JADX INFO: renamed from: q */
        public final Set<String> f22108q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65926toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f65927zy;

        private zy(String str, int i2, String str2, Set<String> set) {
            this.f65926toq = i2;
            this.f22107k = str;
            this.f65927zy = str2;
            this.f22108q = set;
        }

        /* JADX INFO: renamed from: k */
        public static zy m12991k(String str, int i2) {
            String str2;
            String strTrim = str.trim();
            C3844k.m13629k(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrMbx = lrht.mbx(strTrim, C5814z.f32495a);
            String str3 = strArrMbx[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < strArrMbx.length; i3++) {
                hashSet.add(strArrMbx[i3]);
            }
            return new zy(str3, i2, str2, hashSet);
        }

        public static zy toq() {
            return new zy("", 0, "", Collections.emptySet());
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(ltg8.f61336x2, Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put(ltg8.f61332n7h, Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put(ltg8.f61330kja0, Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(ltg8.f61333qrj, Integer.valueOf(Color.rgb(0, 0, 0)));
        f65905jk = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f65900a9 = Collections.unmodifiableMap(map2);
    }

    static SpannedString cdj(@dd String str, String str2, List<C3688q> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    toq(str2.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int iM12975g = i2 + 1;
                if (iM12975g < str2.length()) {
                    boolean z2 = str2.charAt(iM12975g) == '/';
                    iM12975g = m12975g(str2, iM12975g);
                    int i3 = iM12975g - 2;
                    boolean z3 = str2.charAt(i3) == '/';
                    int i4 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = iM12975g - 1;
                    }
                    String strSubstring = str2.substring(i4, i3);
                    if (!strSubstring.trim().isEmpty()) {
                        String strM12980p = m12980p(strSubstring);
                        if (ld6(strM12980p)) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    zy zyVar = (zy) arrayDeque.pop();
                                    m12981q(str, zyVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new toq(zyVar, spannableStringBuilder.length()));
                                    }
                                    if (zyVar.f22107k.equals(strM12980p)) {
                                        break;
                                    }
                                }
                            } else if (!z3) {
                                arrayDeque.push(zy.m12991k(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i2 = iM12975g;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m12981q(str, (zy) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m12981q(str, zy.toq(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int f7l8(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    private static void fn3e(String str, n nVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            nVar.f22102s = m12977i(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        nVar.f22103y = C3689s.zy(str);
    }

    /* JADX INFO: renamed from: g */
    private static int m12975g(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX INFO: renamed from: h */
    private static void m12976h(String str, n nVar) {
        Matcher matcher = f65902f7l8.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C3844k.f7l8(matcher.group(1));
            String str3 = (String) C3844k.f7l8(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t8r(str3, nVar);
                } else if ("align".equals(str2)) {
                    nVar.f22101q = zurt(str3);
                } else if ("position".equals(str2)) {
                    fn3e(str3, nVar);
                } else if ("size".equals(str2)) {
                    nVar.f22100p = C3689s.zy(str3);
                } else if ("vertical".equals(str2)) {
                    nVar.f65921ld6 = ni7(str3);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb.append("Unknown cue setting ");
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str3);
                    ni7.qrj(f65909mcp, sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                ni7.qrj(f65909mcp, strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static int m12977i(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                ni7.qrj(f65909mcp, str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m12978k(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        for (String str : set) {
            Map<String, Integer> map = f65905jk;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i2, i3, 33);
            } else {
                Map<String, Integer> map2 = f65900a9;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i2, i3, 33);
                }
            }
        }
    }

    private static int ki(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                ni7.qrj(f65909mcp, str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    static toq.zy kja0(String str) {
        n nVar = new n();
        m12976h(str, nVar);
        return nVar.f7l8();
    }

    private static boolean ld6(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m12979n(SpannableStringBuilder spannableStringBuilder, C3688q c3688q, int i2, int i3) {
        if (c3688q == null) {
            return;
        }
        if (c3688q.m13002s() != -1) {
            C3664q.m12922k(spannableStringBuilder, new StyleSpan(c3688q.m13002s()), i2, i3, 33);
        }
        if (c3688q.x2()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (c3688q.qrj()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (c3688q.ld6()) {
            C3664q.m12922k(spannableStringBuilder, new ForegroundColorSpan(c3688q.zy()), i2, i3, 33);
        }
        if (c3688q.m13000p()) {
            C3664q.m12922k(spannableStringBuilder, new BackgroundColorSpan(c3688q.m12998k()), i2, i3, 33);
        }
        if (c3688q.m13001q() != null) {
            C3664q.m12922k(spannableStringBuilder, new TypefaceSpan(c3688q.m13001q()), i2, i3, 33);
        }
        int iM12995g = c3688q.m12995g();
        if (iM12995g == 1) {
            C3664q.m12922k(spannableStringBuilder, new AbsoluteSizeSpan((int) c3688q.m12999n(), true), i2, i3, 33);
        } else if (iM12995g == 2) {
            C3664q.m12922k(spannableStringBuilder, new RelativeSizeSpan(c3688q.m12999n()), i2, i3, 33);
        } else if (iM12995g == 3) {
            C3664q.m12922k(spannableStringBuilder, new RelativeSizeSpan(c3688q.m12999n() / 100.0f), i2, i3, 33);
        }
        if (c3688q.toq()) {
            spannableStringBuilder.setSpan(new C3662k(), i2, i3, 33);
        }
    }

    @dd
    private static C3686n n7h(@dd String str, Matcher matcher, gvn7 gvn7Var, List<C3688q> list) {
        n nVar = new n();
        try {
            nVar.f22098k = C3689s.m13008q((String) C3844k.f7l8(matcher.group(1)));
            nVar.f65922toq = C3689s.m13008q((String) C3844k.f7l8(matcher.group(2)));
            m12976h((String) C3844k.f7l8(matcher.group(3)), nVar);
            StringBuilder sb = new StringBuilder();
            String strCdj = gvn7Var.cdj();
            while (!TextUtils.isEmpty(strCdj)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strCdj.trim());
                strCdj = gvn7Var.cdj();
            }
            nVar.f65923zy = cdj(str, sb.toString(), list);
            return nVar.m12987k();
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            ni7.qrj(f65909mcp, strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    private static int ni7(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        ni7.qrj(f65909mcp, str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: p */
    private static String m12980p(String str) {
        String strTrim = str.trim();
        C3844k.m13629k(!strTrim.isEmpty());
        return lrht.jbh(strTrim, "[ \\.]")[0];
    }

    /* JADX INFO: renamed from: q */
    private static void m12981q(@dd String str, zy zyVar, List<toq> list, SpannableStringBuilder spannableStringBuilder, List<C3688q> list2) {
        int i2;
        int length;
        i2 = zyVar.f65926toq;
        length = spannableStringBuilder.length();
        String str2 = zyVar.f22107k;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case "c":
                m12978k(spannableStringBuilder, zyVar.f22108q, i2, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case "ruby":
                zy(spannableStringBuilder, str, zyVar, list, list2);
                break;
            default:
                return;
        }
        List<q> listM12983y = m12983y(list2, str, zyVar);
        for (int i3 = 0; i3 < listM12983y.size(); i3++) {
            m12979n(spannableStringBuilder, listM12983y.get(i3).f22105q, i2, length);
        }
    }

    @dd
    public static C3686n qrj(gvn7 gvn7Var, List<C3688q> list) {
        String strCdj = gvn7Var.cdj();
        if (strCdj == null) {
            return null;
        }
        Pattern pattern = f22086g;
        Matcher matcher = pattern.matcher(strCdj);
        if (matcher.matches()) {
            return n7h(null, matcher, gvn7Var, list);
        }
        String strCdj2 = gvn7Var.cdj();
        if (strCdj2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strCdj2);
        if (matcher2.matches()) {
            return n7h(strCdj.trim(), matcher2, gvn7Var, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private static int m12982s(List<C3688q> list, @dd String str, zy zyVar) {
        List<q> listM12983y = m12983y(list, str, zyVar);
        for (int i2 = 0; i2 < listM12983y.size(); i2++) {
            C3688q c3688q = listM12983y.get(i2).f22105q;
            if (c3688q.f7l8() != -1) {
                return c3688q.f7l8();
            }
        }
        return -1;
    }

    private static void t8r(String str, n nVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            nVar.f65920f7l8 = ki(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            nVar.f22099n = C3689s.zy(str);
            nVar.f22097g = 0;
        } else {
            nVar.f22099n = Integer.parseInt(str);
            nVar.f22097g = 1;
        }
    }

    private static void toq(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(f65913qrj);
                break;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 33);
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                ni7.qrj(f65909mcp, sb.toString());
                break;
        }
    }

    static com.google.android.exoplayer2.text.toq x2(CharSequence charSequence) {
        n nVar = new n();
        nVar.f65923zy = charSequence;
        return nVar.f7l8().m12938k();
    }

    /* JADX INFO: renamed from: y */
    private static List<q> m12983y(List<C3688q> list, @dd String str, zy zyVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3688q c3688q = list.get(i2);
            int iM13004y = c3688q.m13004y(str, zyVar.f22107k, zyVar.f22108q, zyVar.f65927zy);
            if (iM13004y > 0) {
                arrayList.add(new q(iM13004y, c3688q));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int zurt(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                ni7.qrj(f65909mcp, str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static void zy(SpannableStringBuilder spannableStringBuilder, @dd String str, zy zyVar, List<toq> list, List<C3688q> list2) {
        int iM12982s = m12982s(list2, str, zyVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, toq.f65924zy);
        int i2 = zyVar.f65926toq;
        int length = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (f65911ni7.equals(((toq) arrayList.get(i3)).f22106k.f22107k)) {
                toq toqVar = (toq) arrayList.get(i3);
                int iF7l8 = f7l8(m12982s(list2, str, toqVar.f22106k), iM12982s, 1);
                int i4 = toqVar.f22106k.f65926toq - length;
                int i5 = toqVar.f65925toq - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new com.google.android.exoplayer2.text.span.zy(charSequenceSubSequence.toString(), iF7l8), i2, i4, 33);
                length += charSequenceSubSequence.length();
                i2 = i4;
            }
        }
    }
}
