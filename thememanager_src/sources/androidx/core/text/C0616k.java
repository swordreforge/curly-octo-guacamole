package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: androidx.core.text.k */
/* JADX INFO: compiled from: BidiFormatter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0616k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f50579cdj = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final char f50580f7l8 = 8236;

    /* JADX INFO: renamed from: g */
    private static final char f3814g = 8235;

    /* JADX INFO: renamed from: h */
    static final C0616k f3815h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f50581ki = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final C0616k f50582kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50583ld6;

    /* JADX INFO: renamed from: n */
    private static final char f3816n = 8234;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f50584n7h = 2;

    /* JADX INFO: renamed from: p */
    private static final String f3817p;

    /* JADX INFO: renamed from: q */
    static final x2 f3818q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f50585qrj = 2;

    /* JADX INFO: renamed from: s */
    private static final char f3819s = 8207;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f50586t8r = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50587x2 = "";

    /* JADX INFO: renamed from: y */
    private static final char f3820y = 8206;

    /* JADX INFO: renamed from: k */
    private final boolean f3821k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f50588toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final x2 f50589zy;

    /* JADX INFO: renamed from: androidx.core.text.k$toq */
    /* JADX INFO: compiled from: BidiFormatter.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private final CharSequence f3824k;

        /* JADX INFO: renamed from: n */
        private char f3825n;

        /* JADX INFO: renamed from: q */
        private int f3826q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f50593toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50594zy;

        /* JADX INFO: renamed from: g */
        private static final int f3823g = 1792;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final byte[] f50592f7l8 = new byte[f3823g];

        static {
            for (int i2 = 0; i2 < f3823g; i2++) {
                f50592f7l8[i2] = Character.getDirectionality(i2);
            }
        }

        toq(CharSequence charSequence, boolean z2) {
            this.f3824k = charSequence;
            this.f50593toq = z2;
            this.f50594zy = charSequence.length();
        }

        private byte f7l8() {
            char cCharAt;
            do {
                int i2 = this.f3826q;
                if (i2 >= this.f50594zy) {
                    return com.google.common.base.zy.f68128n7h;
                }
                CharSequence charSequence = this.f3824k;
                this.f3826q = i2 + 1;
                cCharAt = charSequence.charAt(i2);
                this.f3825n = cCharAt;
            } while (cCharAt != ';');
            return com.google.common.base.zy.f68128n7h;
        }

        /* JADX INFO: renamed from: g */
        private byte m2871g() {
            char cCharAt;
            int i2 = this.f3826q;
            do {
                int i3 = this.f3826q;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3824k;
                int i4 = i3 - 1;
                this.f3826q = i4;
                cCharAt = charSequence.charAt(i4);
                this.f3825n = cCharAt;
                if (cCharAt == '&') {
                    return com.google.common.base.zy.f68128n7h;
                }
            } while (cCharAt != ';');
            this.f3826q = i2;
            this.f3825n = ';';
            return com.google.common.base.zy.f68124kja0;
        }

        /* JADX INFO: renamed from: s */
        private byte m2872s() {
            char cCharAt;
            int i2 = this.f3826q;
            while (true) {
                int i3 = this.f3826q;
                if (i3 >= this.f50594zy) {
                    this.f3826q = i2;
                    this.f3825n = eqxt.f36672n;
                    return com.google.common.base.zy.f68124kja0;
                }
                CharSequence charSequence = this.f3824k;
                this.f3826q = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                this.f3825n = cCharAt2;
                if (cCharAt2 == '>') {
                    return com.google.common.base.zy.f68128n7h;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f3826q;
                        if (i4 < this.f50594zy) {
                            CharSequence charSequence2 = this.f3824k;
                            this.f3826q = i4 + 1;
                            cCharAt = charSequence2.charAt(i4);
                            this.f3825n = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* JADX INFO: renamed from: y */
        private byte m2873y() {
            char cCharAt;
            int i2 = this.f3826q;
            while (true) {
                int i3 = this.f3826q;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3824k;
                int i4 = i3 - 1;
                this.f3826q = i4;
                char cCharAt2 = charSequence.charAt(i4);
                this.f3825n = cCharAt2;
                if (cCharAt2 == '<') {
                    return com.google.common.base.zy.f68128n7h;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.f3826q;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.f3824k;
                            int i6 = i5 - 1;
                            this.f3826q = i6;
                            cCharAt = charSequence2.charAt(i6);
                            this.f3825n = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f3826q = i2;
            this.f3825n = eqxt.f36668g;
            return com.google.common.base.zy.f68124kja0;
        }

        private static byte zy(char c2) {
            return c2 < f3823g ? f50592f7l8[c2] : Character.getDirectionality(c2);
        }

        /* JADX INFO: renamed from: k */
        byte m2874k() {
            char cCharAt = this.f3824k.charAt(this.f3826q - 1);
            this.f3825n = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f3824k, this.f3826q);
                this.f3826q -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f3826q--;
            byte bZy = zy(this.f3825n);
            if (!this.f50593toq) {
                return bZy;
            }
            char c2 = this.f3825n;
            return c2 == '>' ? m2873y() : c2 == ';' ? m2871g() : bZy;
        }

        /* JADX INFO: renamed from: n */
        int m2875n() {
            this.f3826q = this.f50594zy;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                while (this.f3826q > 0) {
                    byte bM2874k = m2874k();
                    if (bM2874k == 0) {
                        if (i2 == 0) {
                            return -1;
                        }
                        if (i3 == 0) {
                            break;
                        }
                    } else if (bM2874k == 1 || bM2874k == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            break;
                        }
                    } else if (bM2874k != 9) {
                        switch (bM2874k) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        /* JADX INFO: renamed from: q */
        int m2876q() {
            this.f3826q = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f3826q < this.f50594zy && i2 == 0) {
                byte qVar = toq();
                if (qVar != 0) {
                    if (qVar == 1 || qVar == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (qVar != 9) {
                        switch (qVar) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f3826q > 0) {
                switch (m2874k()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        byte toq() {
            char cCharAt = this.f3824k.charAt(this.f3826q);
            this.f3825n = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f3824k, this.f3826q);
                this.f3826q += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f3826q++;
            byte bZy = zy(this.f3825n);
            if (!this.f50593toq) {
                return bZy;
            }
            char c2 = this.f3825n;
            return c2 == '<' ? m2872s() : c2 == '&' ? f7l8() : bZy;
        }
    }

    static {
        x2 x2Var = qrj.f50601zy;
        f3818q = x2Var;
        f3817p = Character.toString(f3820y);
        f50583ld6 = Character.toString(f3819s);
        f50582kja0 = new C0616k(false, 2, x2Var);
        f3815h = new C0616k(true, 2, x2Var);
    }

    C0616k(boolean z2, int i2, x2 x2Var) {
        this.f3821k = z2;
        this.f50588toq = i2;
        this.f50589zy = x2Var;
    }

    /* JADX INFO: renamed from: k */
    private static int m2859k(CharSequence charSequence) {
        return new toq(charSequence, false).m2876q();
    }

    private String ld6(CharSequence charSequence, x2 x2Var) {
        boolean zIsRtl = x2Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f3821k || !(zIsRtl || toq(charSequence) == 1)) ? this.f3821k ? (!zIsRtl || toq(charSequence) == -1) ? f50583ld6 : "" : "" : f3817p;
    }

    /* JADX INFO: renamed from: n */
    public static C0616k m2860n(boolean z2) {
        return new k(z2).m2868k();
    }

    /* JADX INFO: renamed from: p */
    static boolean m2861p(Locale locale) {
        return n7h.toq(locale) == 1;
    }

    /* JADX INFO: renamed from: q */
    public static C0616k m2862q(Locale locale) {
        return new k(locale).m2868k();
    }

    private static int toq(CharSequence charSequence) {
        return new toq(charSequence, false).m2875n();
    }

    private String x2(CharSequence charSequence, x2 x2Var) {
        boolean zIsRtl = x2Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f3821k || !(zIsRtl || m2859k(charSequence) == 1)) ? this.f3821k ? (!zIsRtl || m2859k(charSequence) == -1) ? f50583ld6 : "" : "" : f3817p;
    }

    public static C0616k zy() {
        return new k().m2868k();
    }

    public String cdj(String str) {
        return t8r(str, this.f50589zy, true);
    }

    public boolean f7l8(CharSequence charSequence) {
        return this.f50589zy.isRtl(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: g */
    public boolean m2863g() {
        return (this.f50588toq & 2) != 0;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m2864h(CharSequence charSequence, boolean z2) {
        return kja0(charSequence, this.f50589zy, z2);
    }

    /* JADX INFO: renamed from: i */
    public String m2865i(String str, boolean z2) {
        return t8r(str, this.f50589zy, z2);
    }

    public String ki(String str, x2 x2Var) {
        return t8r(str, x2Var, true);
    }

    public CharSequence kja0(CharSequence charSequence, x2 x2Var, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = x2Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m2863g() && z2) {
            spannableStringBuilder.append((CharSequence) x2(charSequence, zIsRtl ? qrj.f50600toq : qrj.f3830k));
        }
        if (zIsRtl != this.f3821k) {
            spannableStringBuilder.append(zIsRtl ? f3814g : f3816n);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f50580f7l8);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z2) {
            spannableStringBuilder.append((CharSequence) ld6(charSequence, zIsRtl ? qrj.f50600toq : qrj.f3830k));
        }
        return spannableStringBuilder;
    }

    public CharSequence n7h(CharSequence charSequence, x2 x2Var) {
        return kja0(charSequence, x2Var, true);
    }

    public CharSequence qrj(CharSequence charSequence) {
        return kja0(charSequence, this.f50589zy, true);
    }

    /* JADX INFO: renamed from: s */
    public boolean m2866s() {
        return this.f3821k;
    }

    public String t8r(String str, x2 x2Var, boolean z2) {
        if (str == null) {
            return null;
        }
        return kja0(str, x2Var, z2).toString();
    }

    /* JADX INFO: renamed from: y */
    public boolean m2867y(String str) {
        return f7l8(str);
    }

    /* JADX INFO: renamed from: androidx.core.text.k$k */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        private boolean f3822k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50590toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private x2 f50591zy;

        public k() {
            zy(C0616k.m2861p(Locale.getDefault()));
        }

        private static C0616k toq(boolean z2) {
            return z2 ? C0616k.f3815h : C0616k.f50582kja0;
        }

        private void zy(boolean z2) {
            this.f3822k = z2;
            this.f50591zy = C0616k.f3818q;
            this.f50590toq = 2;
        }

        /* JADX INFO: renamed from: k */
        public C0616k m2868k() {
            return (this.f50590toq == 2 && this.f50591zy == C0616k.f3818q) ? toq(this.f3822k) : new C0616k(this.f3822k, this.f50590toq, this.f50591zy);
        }

        /* JADX INFO: renamed from: n */
        public k m2869n(boolean z2) {
            if (z2) {
                this.f50590toq |= 2;
            } else {
                this.f50590toq &= -3;
            }
            return this;
        }

        /* JADX INFO: renamed from: q */
        public k m2870q(x2 x2Var) {
            this.f50591zy = x2Var;
            return this;
        }

        public k(boolean z2) {
            zy(z2);
        }

        public k(Locale locale) {
            zy(C0616k.m2861p(locale));
        }
    }
}
