package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.n7h;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.ts.wvg;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.qrj;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.text.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.miui.clock.module.toq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import miuix.view.C7385p;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.k */
/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3642k extends AbstractC3643n {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65493a9 = 1;

    /* JADX INFO: renamed from: c */
    private static final byte f21787c = 33;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f65496d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f65497d3 = 1;

    /* JADX INFO: renamed from: e */
    private static final byte f21788e = 39;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private static final byte f65499ek5k = 46;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f65500eqxt = 1;

    /* JADX INFO: renamed from: f */
    private static final byte f21789f = 32;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f65501fti = 0;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f65502gvn7 = 0;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final byte f65503hb = 42;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final byte f65504hyr = -4;

    /* JADX INFO: renamed from: j */
    private static final byte f21790j = 43;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65506jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f65507jp0y = 1;

    /* JADX INFO: renamed from: l */
    private static final int f21791l = 8;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final byte f65508lrht = 36;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f65509lvui = 3;

    /* JADX INFO: renamed from: m */
    private static final byte f21792m = 45;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65510mcp = 4;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f65511n5r1 = 4;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f65512ncyb = 7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final byte f65513nn86 = 41;

    /* JADX INFO: renamed from: o */
    private static final byte f21793o = 44;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f65514oc = 0;

    /* JADX INFO: renamed from: t */
    private static final String f21795t = "Cea608Decoder";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final byte f65515uv6 = 37;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final byte f65516vyq = 38;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final long f65517wvg = 16000;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private static final byte f65520yz = 47;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private List<com.google.android.exoplayer2.text.toq> f65521cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f65522fn3e;

    /* JADX INFO: renamed from: h */
    @dd
    private List<com.google.android.exoplayer2.text.toq> f21796h;

    /* JADX INFO: renamed from: i */
    private boolean f21797i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f65524ki;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int f65526ld6;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private byte f65528ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private long f65529o1t;

    /* JADX INFO: renamed from: p */
    private final int f21798p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final long f65530qrj;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f65531t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f65532x2;

    /* JADX INFO: renamed from: z */
    private boolean f21800z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private byte f65533zurt;

    /* JADX INFO: renamed from: r */
    private static final int[] f21794r = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int[] f65498dd = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int[] f65518x9kr = {-1, -16711936, -16776961, -16711681, -65536, n7h.f50847fn3e, -65281};

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private static final int[] f65519y9n = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, toq.zy.f29237p, 241, 9632};

    /* JADX INFO: renamed from: b */
    private static final int[] f21786b = {174, 176, wvg.f64656ni7, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final int[] f65495bf2 = {C7385p.f92248ni7, 201, toq.zy.f72004x2, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, wvg.f64653fu4, C7385p.f92239fu4, 199, 200, 202, 203, 235, toq.zy.f72000f7l8, toq.zy.f29240y, 239, toq.zy.f72002qrj, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int[] f65505i1 = {C7385p.f42281z, 227, 205, 204, 236, toq.zy.f72001ld6, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, C7385p.f92249o1t, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final boolean[] f65494a98o = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: s */
    private final gvn7 f21799s = new gvn7();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final ArrayList<k> f65527n7h = new ArrayList<>();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private k f65525kja0 = new k(0, 4);

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f65523fu4 = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.k$k */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    private static final class k {

        /* JADX INFO: renamed from: p */
        private static final int f21801p = 15;

        /* JADX INFO: renamed from: s */
        private static final int f21802s = 32;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f65534f7l8;

        /* JADX INFO: renamed from: g */
        private int f21803g;

        /* JADX INFO: renamed from: n */
        private int f21805n;

        /* JADX INFO: renamed from: q */
        private int f21806q;

        /* JADX INFO: renamed from: y */
        private int f21807y;

        /* JADX INFO: renamed from: k */
        private final List<C7959k> f21804k = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<SpannableString> f65535toq = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final StringBuilder f65536zy = new StringBuilder();

        /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        private static class C7959k {

            /* JADX INFO: renamed from: k */
            public final int f21808k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public final boolean f65537toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            public int f65538zy;

            public C7959k(int i2, boolean z2, int i3) {
                this.f21808k = i2;
                this.f65537toq = z2;
                this.f65538zy = i3;
            }
        }

        public k(int i2, int i3) {
            m12875p(i2);
            this.f21807y = i3;
        }

        private static void cdj(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        private static void kja0(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        private static void n7h(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        /* JADX INFO: renamed from: y */
        private SpannableString m12871y() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f65536zy);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = 0;
            boolean z2 = false;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (i2 < this.f21804k.size()) {
                C7959k c7959k = this.f21804k.get(i2);
                boolean z3 = c7959k.f65537toq;
                int i8 = c7959k.f21808k;
                if (i8 != 8) {
                    boolean z5 = i8 == 7;
                    if (i8 != 7) {
                        i7 = C3642k.f65518x9kr[i8];
                    }
                    z2 = z5;
                }
                int i9 = c7959k.f65538zy;
                i2++;
                if (i9 != (i2 < this.f21804k.size() ? this.f21804k.get(i2).f65538zy : length)) {
                    if (i4 != -1 && !z3) {
                        cdj(spannableStringBuilder, i4, i9);
                        i4 = -1;
                    } else if (i4 == -1 && z3) {
                        i4 = i9;
                    }
                    if (i5 != -1 && !z2) {
                        kja0(spannableStringBuilder, i5, i9);
                        i5 = -1;
                    } else if (i5 == -1 && z2) {
                        i5 = i9;
                    }
                    if (i7 != i6) {
                        n7h(spannableStringBuilder, i3, i9, i6);
                        i6 = i7;
                        i3 = i9;
                    }
                }
            }
            if (i4 != -1 && i4 != length) {
                cdj(spannableStringBuilder, i4, length);
            }
            if (i5 != -1 && i5 != length) {
                kja0(spannableStringBuilder, i5, length);
            }
            if (i3 != length) {
                n7h(spannableStringBuilder, i3, length, i6);
            }
            return new SpannableString(spannableStringBuilder);
        }

        @dd
        public com.google.android.exoplayer2.text.toq f7l8(int i2) {
            float f2;
            int i3 = this.f21805n + this.f21803g;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f65535toq.size(); i5++) {
                spannableStringBuilder.append(lrht.ij(this.f65535toq.get(i5), i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(lrht.ij(m12871y(), i4));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i4 - spannableStringBuilder.length();
            int i6 = i3 - length;
            if (i2 == Integer.MIN_VALUE) {
                i2 = (this.f65534f7l8 != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.f65534f7l8 != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length;
                }
                f2 = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i7 = this.f21806q;
            if (i7 > 7) {
                i7 = (i7 - 15) - 2;
            } else if (this.f65534f7l8 == 1) {
                i7 -= this.f21807y - 1;
            }
            return new toq.zy().wvg(spannableStringBuilder).m12943t(Layout.Alignment.ALIGN_NORMAL).m12937i(i7, 1).ni7(f2).fu4(i2).m12938k();
        }

        /* JADX INFO: renamed from: g */
        public void m12872g() {
            int length = this.f65536zy.length();
            if (length > 0) {
                this.f65536zy.delete(length - 1, length);
                for (int size = this.f21804k.size() - 1; size >= 0; size--) {
                    C7959k c7959k = this.f21804k.get(size);
                    int i2 = c7959k.f65538zy;
                    if (i2 != length) {
                        return;
                    }
                    c7959k.f65538zy = i2 - 1;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m12873h(int i2, boolean z2) {
            this.f21804k.add(new C7959k(i2, z2, this.f65536zy.length()));
        }

        public void ld6() {
            this.f65535toq.add(m12871y());
            this.f65536zy.setLength(0);
            this.f21804k.clear();
            int iMin = Math.min(this.f21807y, this.f21806q);
            while (this.f65535toq.size() >= iMin) {
                this.f65535toq.remove(0);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m12874n(char c2) {
            if (this.f65536zy.length() < 32) {
                this.f65536zy.append(c2);
            }
        }

        /* JADX INFO: renamed from: p */
        public void m12875p(int i2) {
            this.f65534f7l8 = i2;
            this.f21804k.clear();
            this.f65535toq.clear();
            this.f65536zy.setLength(0);
            this.f21806q = 15;
            this.f21805n = 0;
            this.f21803g = 0;
        }

        public void qrj(int i2) {
            this.f21807y = i2;
        }

        /* JADX INFO: renamed from: s */
        public boolean m12876s() {
            return this.f21804k.isEmpty() && this.f65535toq.isEmpty() && this.f65536zy.length() == 0;
        }

        public void x2(int i2) {
            this.f65534f7l8 = i2;
        }
    }

    public C3642k(String str, int i2, long j2) {
        this.f65530qrj = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.f21798p = com.google.android.exoplayer2.util.wvg.f67091c8jq.equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.f65532x2 = 0;
            this.f65526ld6 = 0;
        } else if (i2 == 2) {
            this.f65532x2 = 1;
            this.f65526ld6 = 0;
        } else if (i2 == 3) {
            this.f65532x2 = 0;
            this.f65526ld6 = 1;
        } else if (i2 != 4) {
            ni7.qrj(f21795t, "Invalid channel. Defaulting to CC1.");
            this.f65532x2 = 0;
            this.f65526ld6 = 0;
        } else {
            this.f65532x2 = 1;
            this.f65526ld6 = 1;
        }
        lvui(0);
        d2ok();
        this.f21800z = true;
        this.f65529o1t = C3548p.f65257toq;
    }

    private static boolean a9(byte b2) {
        return (b2 & 240) == 16;
    }

    private static int cdj(byte b2) {
        return (b2 >> 3) & 1;
    }

    private void d2ok() {
        this.f65525kja0.m12875p(this.f65524ki);
        this.f65527n7h.clear();
        this.f65527n7h.add(this.f65525kja0);
    }

    private static boolean d3(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private boolean dd() {
        return (this.f65530qrj == C3548p.f65257toq || this.f65529o1t == C3548p.f65257toq || m12877p() - this.f65529o1t < this.f65530qrj) ? false : true;
    }

    private void eqxt(byte b2, byte b3) {
        if (oc(b2)) {
            this.f21800z = false;
            return;
        }
        if (jp0y(b2)) {
            if (b3 != 32 && b3 != 47) {
                switch (b3) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b3) {
                            case 42:
                            case 43:
                                this.f21800z = false;
                                break;
                        }
                }
            }
            this.f21800z = true;
        }
    }

    private static char fn3e(byte b2, byte b3) {
        return (b2 & 1) == 0 ? t8r(b3) : m12861i(b3);
    }

    private boolean fti(boolean z2, byte b2, byte b3) {
        if (!z2 || !a9(b2)) {
            this.f65522fn3e = false;
        } else {
            if (this.f65522fn3e && this.f65533zurt == b2 && this.f65528ni7 == b3) {
                this.f65522fn3e = false;
                return true;
            }
            this.f65522fn3e = true;
            this.f65533zurt = b2;
            this.f65528ni7 = b3;
        }
        return false;
    }

    private void fu4(byte b2) {
        if (b2 == 32) {
            lvui(2);
            return;
        }
        if (b2 == 41) {
            lvui(3);
            return;
        }
        switch (b2) {
            case 37:
                lvui(1);
                m12862r(2);
                break;
            case 38:
                lvui(1);
                m12862r(3);
                break;
            case 39:
                lvui(1);
                m12862r(4);
                break;
            default:
                int i2 = this.f65524ki;
                if (i2 != 0) {
                    if (b2 != 33) {
                        switch (b2) {
                            case 44:
                                this.f21796h = Collections.emptyList();
                                int i3 = this.f65524ki;
                                if (i3 == 1 || i3 == 3) {
                                    d2ok();
                                }
                                break;
                            case 45:
                                if (i2 == 1 && !this.f65525kja0.m12876s()) {
                                    this.f65525kja0.ld6();
                                    break;
                                }
                                break;
                            case 46:
                                d2ok();
                                break;
                            case 47:
                                this.f21796h = ki();
                                d2ok();
                                break;
                        }
                    } else {
                        this.f65525kja0.m12872g();
                        break;
                    }
                }
                break;
        }
    }

    private static boolean gvn7(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    /* JADX INFO: renamed from: h */
    private static char m12860h(byte b2) {
        return (char) f65519y9n[(b2 & 127) - 32];
    }

    /* JADX INFO: renamed from: i */
    private static char m12861i(byte b2) {
        return (char) f65505i1[b2 & com.google.common.base.zy.f68113d3];
    }

    private static boolean jk(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean jp0y(byte b2) {
        return (b2 & 247) == 20;
    }

    private List<com.google.android.exoplayer2.text.toq> ki() {
        int size = this.f65527n7h.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.exoplayer2.text.toq toqVarF7l8 = this.f65527n7h.get(i2).f7l8(Integer.MIN_VALUE);
            arrayList.add(toqVarF7l8);
            if (toqVarF7l8 != null) {
                iMin = Math.min(iMin, toqVarF7l8.f21997i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            com.google.android.exoplayer2.text.toq toqVar = (com.google.android.exoplayer2.text.toq) arrayList.get(i3);
            if (toqVar != null) {
                if (toqVar.f21997i != iMin) {
                    toqVar = (com.google.android.exoplayer2.text.toq) C3844k.f7l8(this.f65527n7h.get(i3).f7l8(iMin));
                }
                arrayList2.add(toqVar);
            }
        }
        return arrayList2;
    }

    private void lvui(int i2) {
        int i3 = this.f65524ki;
        if (i3 == i2) {
            return;
        }
        this.f65524ki = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.f65527n7h.size(); i4++) {
                this.f65527n7h.get(i4).x2(i2);
            }
            return;
        }
        d2ok();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.f21796h = Collections.emptyList();
        }
    }

    private static boolean mcp(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    private void ni7(byte b2) {
        this.f65525kja0.m12874n(' ');
        this.f65525kja0.m12873h((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private static boolean o1t(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean oc(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    /* JADX INFO: renamed from: r */
    private void m12862r(int i2) {
        this.f65531t8r = i2;
        this.f65525kja0.qrj(i2);
    }

    /* JADX INFO: renamed from: t */
    private static boolean m12863t(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static char t8r(byte b2) {
        return (char) f65495bf2[b2 & com.google.common.base.zy.f68113d3];
    }

    private static boolean wvg(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    private boolean x9kr(byte b2) {
        if (o1t(b2)) {
            this.f65523fu4 = cdj(b2);
        }
        return this.f65523fu4 == this.f65532x2;
    }

    /* JADX INFO: renamed from: z */
    private void m12864z(byte b2, byte b3) {
        int i2 = f21794r[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.f65525kja0.f21806q) {
            if (this.f65524ki != 1 && !this.f65525kja0.m12876s()) {
                k kVar = new k(this.f65524ki, this.f65531t8r);
                this.f65525kja0 = kVar;
                this.f65527n7h.add(kVar);
            }
            this.f65525kja0.f21806q = i2;
        }
        boolean z2 = (b3 & 16) == 16;
        boolean z3 = (b3 & 1) == 1;
        int i3 = (b3 >> 1) & 7;
        this.f65525kja0.m12873h(z2 ? 8 : i3, z3);
        if (z2) {
            this.f65525kja0.f21805n = f65498dd[i3];
        }
    }

    private static char zurt(byte b2) {
        return (char) f21786b[b2 & com.google.common.base.zy.f68111cdj];
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    @dd
    /* JADX INFO: renamed from: f7l8 */
    public /* bridge */ /* synthetic */ x2 mo11564q() throws C3660s {
        return super.mo11564q();
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void flush() {
        super.flush();
        this.f21796h = null;
        this.f65521cdj = null;
        lvui(0);
        m12862r(4);
        d2ok();
        this.f21797i = false;
        this.f65522fn3e = false;
        this.f65533zurt = (byte) 0;
        this.f65528ni7 = (byte) 0;
        this.f65523fu4 = 0;
        this.f21800z = true;
        this.f65529o1t = C3548p.f65257toq;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void mo12865g(com.google.android.exoplayer2.text.x2 r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.C3642k.mo12865g(com.google.android.exoplayer2.text.x2):void");
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    public String getName() {
        return f21795t;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.text.InterfaceC3691y
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo12866k(long j2) {
        super.mo12866k(j2);
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    protected boolean ld6() {
        return this.f21796h != this.f65521cdj;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: n */
    protected com.google.android.exoplayer2.text.f7l8 mo12867n() {
        List<com.google.android.exoplayer2.text.toq> list = this.f21796h;
        this.f65521cdj = list;
        return new C3641g((List) C3844k.f7l8(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: x2 */
    public /* bridge */ /* synthetic */ void zy(x2 x2Var) throws C3660s {
        super.zy(x2Var);
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    @dd
    /* JADX INFO: renamed from: y */
    public qrj toq() throws C3660s {
        qrj qrjVarM12878s;
        qrj qVar = super.toq();
        if (qVar != null) {
            return qVar;
        }
        if (!dd() || (qrjVarM12878s = m12878s()) == null) {
            return null;
        }
        this.f21796h = Collections.emptyList();
        this.f65529o1t = C3548p.f65257toq;
        qrjVarM12878s.ki(m12877p(), mo12867n(), Long.MAX_VALUE);
        return qrjVarM12878s;
    }
}
