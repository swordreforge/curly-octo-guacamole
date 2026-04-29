package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.android.thememanager.router.recommend.entity.UICard;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.cea.zy;
import com.google.android.exoplayer2.text.qrj;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.text.x2;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.jp0y;
import com.google.android.exoplayer2.util.ni7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.eqxt;
import okio.C7571o;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy extends AbstractC3643n {

    /* JADX INFO: renamed from: a */
    private static final int f21817a = 153;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65542a9 = 159;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final int f65543a98o = 152;

    /* JADX INFO: renamed from: b */
    private static final int f21818b = 145;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final int f65544bf2 = 146;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f65545bo = 32;

    /* JADX INFO: renamed from: c */
    private static final int f21819c = 132;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final int f65546c8jq = 37;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final int f65547ch = 156;

    /* JADX INFO: renamed from: d */
    private static final int f21820d = 51;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f65548d2ok = 14;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f65549d3 = 8;

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private static final int f65550d8wk = 118;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f65551dd = 23;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private static final int f65552dr = 44;

    /* JADX INFO: renamed from: e */
    private static final int f21821e = 136;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private static final int f65553ek5k = 142;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f65554eqxt = 13;

    /* JADX INFO: renamed from: f */
    private static final int f21822f = 131;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65555fn3e = 8;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    private static final int f65556fnq8 = 58;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f65557fti = 255;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f65558fu4 = 4;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f65559g1 = 119;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private static final int f65560gbni = 121;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f65561gvn7 = 3;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private static final int f65562gyi = 42;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final int f65563hb = 138;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final int f65564hyr = 130;

    /* JADX INFO: renamed from: i */
    private static final String f21823i = "Cea708Decoder";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f65565i1 = 151;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private static final int f65566i9jn = 124;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    private static final int f65567ikck = 50;

    /* JADX INFO: renamed from: j */
    private static final int f21824j = 139;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65568jk = 127;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f65569jp0y = 0;

    /* JADX INFO: renamed from: l */
    private static final int f21825l = 128;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f65570lrht = 133;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private static final int f65571ltg8 = 125;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final int f65572lv5 = 158;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f65573lvui = 16;

    /* JADX INFO: renamed from: m */
    private static final int f21826m = 141;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f65574m4 = 127;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65575mcp = 31;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    private static final int f65576mu = 52;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f65577n5r1 = 129;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f65578ncyb = 31;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f65579ni7 = 3;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final int f65580nmn5 = 157;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final int f65581nn86 = 137;

    /* JADX INFO: renamed from: o */
    private static final int f21827o = 140;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65582o1t = 127;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f65583oc = 12;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private static final int f65584py = 123;

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    private static final int f65585qkj8 = 57;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private static final int f65586qo = 60;

    /* JADX INFO: renamed from: r */
    private static final int f21828r = 17;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private static final int f65587r8s8 = 126;

    /* JADX INFO: renamed from: t */
    private static final int f21829t = 255;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final int f65588t8iq = 159;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private static final int f65589tfm = 61;

    /* JADX INFO: renamed from: u */
    private static final int f21830u = 127;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f65590uv6 = 134;

    /* JADX INFO: renamed from: v */
    private static final int f21831v = 49;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    private static final int f65591vq = 53;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f65592vyq = 135;

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private static final int f65593was = 120;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private static final int f65594wo = 63;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f65595wvg = 159;

    /* JADX INFO: renamed from: x */
    private static final int f21832x = 155;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f65596x9kr = 24;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    private static final int f65597xwq3 = 48;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f65598y2 = 33;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private static final int f65599y9n = 144;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private static final int f65600yz = 143;

    /* JADX INFO: renamed from: z */
    private static final int f21833z = 31;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final int f65601zp = 154;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private static final int f65602zsr0 = 122;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f65603zurt = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private List<com.google.android.exoplayer2.text.toq> f65604cdj;

    /* JADX INFO: renamed from: h */
    @dd
    private List<com.google.android.exoplayer2.text.toq> f21834h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private C7960zy f65605ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private toq f65606kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final toq[] f65608n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f65609qrj;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f65610t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final boolean f65611x2;

    /* JADX INFO: renamed from: s */
    private final gvn7 f21836s = new gvn7();

    /* JADX INFO: renamed from: p */
    private final jp0y f21835p = new jp0y();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f65607ld6 = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.zy$k */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    static final class C3645k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final Comparator<C3645k> f65612zy = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.toq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zy.C3645k.zy((zy.C3645k) obj, (zy.C3645k) obj2);
            }
        };

        /* JADX INFO: renamed from: k */
        public final com.google.android.exoplayer2.text.toq f21837k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65613toq;

        public C3645k(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z2, int i5, int i6) {
            toq.zy zyVarO1t = new toq.zy().wvg(charSequence).m12943t(alignment).m12937i(f2, i2).fn3e(i3).ni7(f3).fu4(i4).o1t(f4);
            if (z2) {
                zyVarO1t.a9(i5);
            }
            this.f21837k = zyVarO1t.m12938k();
            this.f65613toq = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int zy(C3645k c3645k, C3645k c3645k2) {
            return Integer.compare(c3645k2.f65613toq, c3645k.f65613toq);
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    private static final class toq {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private static final int f65614a9 = 3;

        /* JADX INFO: renamed from: c */
        private static final int[] f21838c;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public static final int f65615d2ok = m12885y(2, 2, 2, 0);

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private static final int f65616d3 = 3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private static final int f65617dd = 1;

        /* JADX INFO: renamed from: e */
        private static final int[] f21839e;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private static final int f65618eqxt = 3;

        /* JADX INFO: renamed from: f */
        private static final int f21840f = 1;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private static final int f65619fti = 0;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final int f65620fu4 = 74;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private static final int f65621gvn7 = 2;

        /* JADX INFO: renamed from: hb, reason: collision with root package name */
        private static final int[] f65622hb;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        private static final int f65623hyr = 4;

        /* JADX INFO: renamed from: j */
        private static final int[] f21841j;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private static final int f65624jk = 2;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private static final int f65625jp0y = 1;

        /* JADX INFO: renamed from: l */
        private static final int f21842l = 2;

        /* JADX INFO: renamed from: lrht, reason: collision with root package name */
        private static final int[] f65626lrht;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public static final int f65627lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private static final int f65628mcp = 1;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        private static final int f65629n5r1 = 3;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        private static final int f65630ncyb = 1;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final int f65631ni7 = 99;

        /* JADX INFO: renamed from: nn86, reason: collision with root package name */
        private static final int[] f65632nn86;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final int f65633o1t = 4;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private static final int f65634oc = 0;

        /* JADX INFO: renamed from: r */
        public static final int f21843r;

        /* JADX INFO: renamed from: t */
        private static final int f21844t = 0;

        /* JADX INFO: renamed from: uv6, reason: collision with root package name */
        private static final int[] f65635uv6;

        /* JADX INFO: renamed from: vyq, reason: collision with root package name */
        private static final boolean[] f65636vyq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private static final int f65637wvg = 15;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        private static final int f65638x9kr = 0;

        /* JADX INFO: renamed from: z */
        private static final int f21845z = 209;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private int f65639cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f65640f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private int f65641fn3e;

        /* JADX INFO: renamed from: g */
        private boolean f21846g;

        /* JADX INFO: renamed from: h */
        private int f21847h;

        /* JADX INFO: renamed from: i */
        private int f21848i;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private int f65642ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f65643kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f65644ld6;

        /* JADX INFO: renamed from: n */
        private int f21850n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private int f65645n7h;

        /* JADX INFO: renamed from: p */
        private int f21851p;

        /* JADX INFO: renamed from: q */
        private boolean f21852q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f65646qrj;

        /* JADX INFO: renamed from: s */
        private int f21853s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private int f65647t8r;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f65649x2;

        /* JADX INFO: renamed from: y */
        private int f21854y;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private int f65650zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f65651zy;

        /* JADX INFO: renamed from: k */
        private final List<SpannableString> f21849k = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final SpannableStringBuilder f65648toq = new SpannableStringBuilder();

        static {
            int iM12885y = m12885y(0, 0, 0, 0);
            f65627lvui = iM12885y;
            int iM12885y2 = m12885y(0, 0, 0, 3);
            f21843r = iM12885y2;
            f21838c = new int[]{0, 0, 0, 0, 0, 2, 0};
            f65626lrht = new int[]{0, 0, 0, 0, 0, 0, 2};
            f65635uv6 = new int[]{3, 3, 3, 3, 3, 3, 1};
            f65636vyq = new boolean[]{false, false, false, true, true, true, false};
            f21839e = new int[]{iM12885y, iM12885y2, iM12885y, iM12885y, iM12885y2, iM12885y, iM12885y};
            f65632nn86 = new int[]{0, 1, 2, 3, 4, 3, 4};
            f65622hb = new int[]{0, 0, 0, 0, 0, 3, 3};
            f21841j = new int[]{iM12885y, iM12885y, iM12885y, iM12885y, iM12885y, iM12885y2, iM12885y2};
        }

        public toq() {
            x2();
        }

        public static int f7l8(int i2, int i3, int i4) {
            return m12885y(i2, i3, i4, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /* JADX INFO: renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m12885y(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.google.android.exoplayer2.util.C3844k.zy(r4, r0, r1)
                com.google.android.exoplayer2.util.C3844k.zy(r5, r0, r1)
                com.google.android.exoplayer2.util.C3844k.zy(r6, r0, r1)
                com.google.android.exoplayer2.util.C3844k.zy(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.zy.toq.m12885y(int, int, int, int):int");
        }

        public void cdj(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.f65643kja0 = i2;
            this.f65649x2 = i7;
        }

        /* JADX INFO: renamed from: g */
        public void m12886g(boolean z2, boolean z3, boolean z5, int i2, boolean z6, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f65651zy = true;
            this.f21852q = z2;
            this.f65644ld6 = z3;
            this.f21850n = i2;
            this.f21846g = z6;
            this.f65640f7l8 = i3;
            this.f21854y = i4;
            this.f21853s = i7;
            int i10 = i5 + 1;
            if (this.f21851p != i10) {
                this.f21851p = i10;
                while (true) {
                    if ((!z3 || this.f21849k.size() < this.f21851p) && this.f21849k.size() < 15) {
                        break;
                    } else {
                        this.f21849k.remove(0);
                    }
                }
            }
            if (i8 != 0 && this.f65646qrj != i8) {
                this.f65646qrj = i8;
                int i11 = i8 - 1;
                cdj(f21839e[i11], f21843r, f65636vyq[i11], 0, f65626lrht[i11], f65635uv6[i11], f21838c[i11]);
            }
            if (i9 == 0 || this.f65645n7h == i9) {
                return;
            }
            this.f65645n7h = i9;
            int i12 = i9 - 1;
            qrj(0, 1, 1, false, false, f65622hb[i12], f65632nn86[i12]);
            n7h(f65615d2ok, f21841j[i12], f65627lvui);
        }

        /* JADX INFO: renamed from: h */
        public void m12887h(boolean z2) {
            this.f21852q = z2;
        }

        /* JADX INFO: renamed from: k */
        public void m12888k(char c2) {
            if (c2 != '\n') {
                this.f65648toq.append(c2);
                return;
            }
            this.f21849k.add(m12891q());
            this.f65648toq.clear();
            if (this.f21847h != -1) {
                this.f21847h = 0;
            }
            if (this.f65639cdj != -1) {
                this.f65639cdj = 0;
            }
            if (this.f65642ki != -1) {
                this.f65642ki = 0;
            }
            if (this.f21848i != -1) {
                this.f21848i = 0;
            }
            while (true) {
                if ((!this.f65644ld6 || this.f21849k.size() < this.f21851p) && this.f21849k.size() < 15) {
                    return;
                } else {
                    this.f21849k.remove(0);
                }
            }
        }

        public void kja0(int i2, int i3) {
            if (this.f65650zurt != i2) {
                m12888k('\n');
            }
            this.f65650zurt = i2;
        }

        public boolean ld6() {
            return this.f21852q;
        }

        /* JADX INFO: renamed from: n */
        public void m12889n() {
            this.f21849k.clear();
            this.f65648toq.clear();
            this.f21847h = -1;
            this.f65639cdj = -1;
            this.f65642ki = -1;
            this.f21848i = -1;
            this.f65650zurt = 0;
        }

        public void n7h(int i2, int i3, int i4) {
            if (this.f65642ki != -1 && this.f65647t8r != i2) {
                this.f65648toq.setSpan(new ForegroundColorSpan(this.f65647t8r), this.f65642ki, this.f65648toq.length(), 33);
            }
            if (i2 != f65615d2ok) {
                this.f65642ki = this.f65648toq.length();
                this.f65647t8r = i2;
            }
            if (this.f21848i != -1 && this.f65641fn3e != i3) {
                this.f65648toq.setSpan(new BackgroundColorSpan(this.f65641fn3e), this.f21848i, this.f65648toq.length(), 33);
            }
            if (i3 != f65627lvui) {
                this.f21848i = this.f65648toq.length();
                this.f65641fn3e = i3;
            }
        }

        /* JADX INFO: renamed from: p */
        public boolean m12890p() {
            return !m12892s() || (this.f21849k.isEmpty() && this.f65648toq.length() == 0);
        }

        /* JADX INFO: renamed from: q */
        public SpannableString m12891q() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f65648toq);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f21847h != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f21847h, length, 33);
                }
                if (this.f65639cdj != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f65639cdj, length, 33);
                }
                if (this.f65642ki != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f65647t8r), this.f65642ki, length, 33);
                }
                if (this.f21848i != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f65641fn3e), this.f21848i, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void qrj(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.f21847h != -1) {
                if (!z2) {
                    this.f65648toq.setSpan(new StyleSpan(2), this.f21847h, this.f65648toq.length(), 33);
                    this.f21847h = -1;
                }
            } else if (z2) {
                this.f21847h = this.f65648toq.length();
            }
            if (this.f65639cdj == -1) {
                if (z3) {
                    this.f65639cdj = this.f65648toq.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.f65648toq.setSpan(new UnderlineSpan(), this.f65639cdj, this.f65648toq.length(), 33);
                this.f65639cdj = -1;
            }
        }

        /* JADX INFO: renamed from: s */
        public boolean m12892s() {
            return this.f65651zy;
        }

        public void toq() {
            int length = this.f65648toq.length();
            if (length > 0) {
                this.f65648toq.delete(length - 1, length);
            }
        }

        public void x2() {
            m12889n();
            this.f65651zy = false;
            this.f21852q = false;
            this.f21850n = 4;
            this.f21846g = false;
            this.f65640f7l8 = 0;
            this.f21854y = 0;
            this.f21853s = 0;
            this.f21851p = 15;
            this.f65644ld6 = true;
            this.f65649x2 = 0;
            this.f65646qrj = 0;
            this.f65645n7h = 0;
            int i2 = f65627lvui;
            this.f65643kja0 = i2;
            this.f65647t8r = f65615d2ok;
            this.f65641fn3e = i2;
        }

        @dd
        public C3645k zy() {
            Layout.Alignment alignment;
            float f2;
            float f3;
            if (m12890p()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f21849k.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f21849k.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m12891q());
            int i3 = this.f65649x2;
            if (i3 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i3 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    int i4 = this.f65649x2;
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("Unexpected justification value: ");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f21846g) {
                f2 = this.f21854y / 99.0f;
                f3 = this.f65640f7l8 / 99.0f;
            } else {
                f2 = this.f21854y / 209.0f;
                f3 = this.f65640f7l8 / 74.0f;
            }
            float f4 = (f2 * 0.9f) + 0.05f;
            float f5 = (f3 * 0.9f) + 0.05f;
            int i5 = this.f21853s;
            return new C3645k(spannableStringBuilder, alignment2, f5, 0, i5 / 3 == 0 ? 0 : i5 / 3 == 1 ? 1 : 2, f4, i5 % 3 == 0 ? 0 : i5 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f65643kja0 != f65627lvui, this.f65643kja0, this.f21850n);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    private static final class C7960zy {

        /* JADX INFO: renamed from: k */
        public final int f21855k;

        /* JADX INFO: renamed from: q */
        int f21856q = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65652toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final byte[] f65653zy;

        public C7960zy(int i2, int i3) {
            this.f21855k = i2;
            this.f65652toq = i3;
            this.f65653zy = new byte[(i3 * 2) - 1];
        }
    }

    public zy(int i2, @dd List<byte[]> list) {
        this.f65609qrj = i2 == -1 ? 1 : i2;
        this.f65611x2 = list != null && C3838g.m13590y(list);
        this.f65608n7h = new toq[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f65608n7h[i3] = new toq();
        }
        this.f65606kja0 = this.f65608n7h[0];
    }

    private void a9() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f65608n7h[i2].x2();
        }
    }

    private void cdj(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.f21834h = m12880h();
            }
            if (i2 == 8) {
                this.f65606kja0.toq();
                return;
            }
            switch (i2) {
                case 12:
                    a9();
                    break;
                case 13:
                    this.f65606kja0.m12888k('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i2 >= 17 && i2 <= 23) {
                        StringBuilder sb = new StringBuilder(55);
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i2);
                        ni7.qrj(f21823i, sb.toString());
                        this.f21835p.t8r(8);
                    } else if (i2 >= 24 && i2 <= 31) {
                        StringBuilder sb2 = new StringBuilder(54);
                        sb2.append("Currently unsupported COMMAND_P16 Command: ");
                        sb2.append(i2);
                        ni7.qrj(f21823i, sb2.toString());
                        this.f21835p.t8r(16);
                    } else {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(i2);
                        ni7.qrj(f21823i, sb3.toString());
                    }
                    break;
            }
        }
    }

    private void fn3e(int i2) {
        toq toqVar = this.f65608n7h[i2];
        this.f21835p.t8r(2);
        boolean zF7l8 = this.f21835p.f7l8();
        boolean zF7l82 = this.f21835p.f7l8();
        boolean zF7l83 = this.f21835p.f7l8();
        int iM13627y = this.f21835p.m13627y(3);
        boolean zF7l84 = this.f21835p.f7l8();
        int iM13627y2 = this.f21835p.m13627y(7);
        int iM13627y3 = this.f21835p.m13627y(8);
        int iM13627y4 = this.f21835p.m13627y(4);
        int iM13627y5 = this.f21835p.m13627y(4);
        this.f21835p.t8r(2);
        int iM13627y6 = this.f21835p.m13627y(6);
        this.f21835p.t8r(2);
        toqVar.m12886g(zF7l8, zF7l82, zF7l83, iM13627y, zF7l84, iM13627y2, iM13627y3, iM13627y5, iM13627y6, iM13627y4, this.f21835p.m13627y(3), this.f21835p.m13627y(3));
    }

    private void fu4(int i2) {
        if (i2 == 32) {
            this.f65606kja0.m12888k(' ');
        }
        if (i2 == 33) {
            this.f65606kja0.m12888k(eqxt.f81895f7l8);
            return;
        }
        if (i2 == 37) {
            this.f65606kja0.m12888k(eqxt.f81897fti);
            return;
        }
        if (i2 == 42) {
            this.f65606kja0.m12888k((char) 352);
            return;
        }
        if (i2 == 44) {
            this.f65606kja0.m12888k((char) 338);
            return;
        }
        if (i2 == 63) {
            this.f65606kja0.m12888k((char) 376);
            return;
        }
        if (i2 == 57) {
            this.f65606kja0.m12888k(eqxt.f81910oc);
            return;
        }
        if (i2 == 58) {
            this.f65606kja0.m12888k((char) 353);
            return;
        }
        if (i2 == 60) {
            this.f65606kja0.m12888k((char) 339);
            return;
        }
        if (i2 == 61) {
            this.f65606kja0.m12888k((char) 8480);
            return;
        }
        switch (i2) {
            case 48:
                this.f65606kja0.m12888k((char) 9608);
                break;
            case 49:
                this.f65606kja0.m12888k(eqxt.f81908ni7);
                break;
            case 50:
                this.f65606kja0.m12888k(eqxt.f81898fu4);
                break;
            case 51:
                this.f65606kja0.m12888k(eqxt.f81909o1t);
                break;
            case 52:
                this.f65606kja0.m12888k(eqxt.f81914wvg);
                break;
            case 53:
                this.f65606kja0.m12888k(eqxt.f81889a9);
                break;
            default:
                switch (i2) {
                    case 118:
                        this.f65606kja0.m12888k((char) 8539);
                        break;
                    case 119:
                        this.f65606kja0.m12888k((char) 8540);
                        break;
                    case 120:
                        this.f65606kja0.m12888k((char) 8541);
                        break;
                    case 121:
                        this.f65606kja0.m12888k((char) 8542);
                        break;
                    case 122:
                        this.f65606kja0.m12888k((char) 9474);
                        break;
                    case 123:
                        this.f65606kja0.m12888k((char) 9488);
                        break;
                    case 124:
                        this.f65606kja0.m12888k((char) 9492);
                        break;
                    case 125:
                        this.f65606kja0.m12888k((char) 9472);
                        break;
                    case 126:
                        this.f65606kja0.m12888k((char) 9496);
                        break;
                    case 127:
                        this.f65606kja0.m12888k((char) 9484);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Invalid G2 character: ");
                        sb.append(i2);
                        ni7.qrj(f21823i, sb.toString());
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    private List<com.google.android.exoplayer2.text.toq> m12880h() {
        C3645k c3645kZy;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.f65608n7h[i2].m12890p() && this.f65608n7h[i2].ld6() && (c3645kZy = this.f65608n7h[i2].zy()) != null) {
                arrayList.add(c3645kZy);
            }
        }
        Collections.sort(arrayList, C3645k.f65612zy);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((C3645k) arrayList.get(i3)).f21837k);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: i */
    private void m12881i(int i2) {
        if (i2 <= 135) {
            this.f21835p.t8r(32);
            return;
        }
        if (i2 <= 143) {
            this.f21835p.t8r(40);
        } else if (i2 <= 159) {
            this.f21835p.t8r(2);
            this.f21835p.t8r(this.f21835p.m13627y(6) * 8);
        }
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    private void jk() {
        C7960zy c7960zy = this.f65605ki;
        int i2 = c7960zy.f21856q;
        int i3 = c7960zy.f65652toq;
        if (i2 != (i3 * 2) - 1) {
            int i4 = c7960zy.f21855k;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((i3 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(i2);
            sb.append(" (sequence number ");
            sb.append(i4);
            sb.append(");");
            ni7.toq(f21823i, sb.toString());
        }
        jp0y jp0yVar = this.f21835p;
        C7960zy c7960zy2 = this.f65605ki;
        jp0yVar.m13621h(c7960zy2.f65653zy, c7960zy2.f21856q);
        int iM13627y = this.f21835p.m13627y(3);
        int iM13627y2 = this.f21835p.m13627y(5);
        if (iM13627y == 7) {
            this.f21835p.t8r(2);
            iM13627y = this.f21835p.m13627y(6);
            if (iM13627y < 7) {
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Invalid extended service number: ");
                sb2.append(iM13627y);
                ni7.qrj(f21823i, sb2.toString());
            }
        }
        if (iM13627y2 == 0) {
            if (iM13627y != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(iM13627y);
                sb3.append(") when blockSize is 0");
                ni7.qrj(f21823i, sb3.toString());
                return;
            }
            return;
        }
        if (iM13627y != this.f65609qrj) {
            return;
        }
        boolean z2 = false;
        while (this.f21835p.toq() > 0) {
            int iM13627y3 = this.f21835p.m13627y(8);
            if (iM13627y3 == 16) {
                int iM13627y4 = this.f21835p.m13627y(8);
                if (iM13627y4 <= 31) {
                    t8r(iM13627y4);
                } else {
                    if (iM13627y4 <= 127) {
                        fu4(iM13627y4);
                    } else if (iM13627y4 <= 159) {
                        m12881i(iM13627y4);
                    } else if (iM13627y4 <= 255) {
                        m12883z(iM13627y4);
                    } else {
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("Invalid extended command: ");
                        sb4.append(iM13627y4);
                        ni7.qrj(f21823i, sb4.toString());
                    }
                    z2 = true;
                }
            } else if (iM13627y3 <= 31) {
                cdj(iM13627y3);
            } else {
                if (iM13627y3 <= 127) {
                    zurt(iM13627y3);
                } else if (iM13627y3 <= 159) {
                    ki(iM13627y3);
                } else if (iM13627y3 <= 255) {
                    ni7(iM13627y3);
                } else {
                    StringBuilder sb5 = new StringBuilder(33);
                    sb5.append("Invalid base command: ");
                    sb5.append(iM13627y3);
                    ni7.qrj(f21823i, sb5.toString());
                }
                z2 = true;
            }
        }
        if (z2) {
            this.f21834h = m12880h();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void ki(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i2 - 128;
                if (this.f65610t8r != i4) {
                    this.f65610t8r = i4;
                    this.f65606kja0 = this.f65608n7h[i4];
                }
                break;
            case 136:
                while (i3 <= 8) {
                    if (this.f21835p.f7l8()) {
                        this.f65608n7h[8 - i3].m12889n();
                    }
                    i3++;
                }
                break;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f21835p.f7l8()) {
                        this.f65608n7h[8 - i5].m12887h(true);
                    }
                }
                break;
            case 138:
                while (i3 <= 8) {
                    if (this.f21835p.f7l8()) {
                        this.f65608n7h[8 - i3].m12887h(false);
                    }
                    i3++;
                }
                break;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f21835p.f7l8()) {
                        this.f65608n7h[8 - i6].m12887h(!r0.ld6());
                    }
                }
                break;
            case f21827o /* 140 */:
                while (i3 <= 8) {
                    if (this.f21835p.f7l8()) {
                        this.f65608n7h[8 - i3].x2();
                    }
                    i3++;
                }
                break;
            case f21826m /* 141 */:
                this.f21835p.t8r(8);
                break;
            case f65553ek5k /* 142 */:
                break;
            case 143:
                a9();
                break;
            case 144:
                if (this.f65606kja0.m12892s()) {
                    o1t();
                } else {
                    this.f21835p.t8r(16);
                }
                break;
            case 145:
                if (this.f65606kja0.m12892s()) {
                    wvg();
                } else {
                    this.f21835p.t8r(24);
                }
                break;
            case 146:
                if (this.f65606kja0.m12892s()) {
                    m12882t();
                } else {
                    this.f21835p.t8r(16);
                }
                break;
            case 147:
            case UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD /* 148 */:
            case UICard.HOME_PAGE_HYBRID_MARQUEE_CARD /* 149 */:
            case 150:
            default:
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid C1 command: ");
                sb.append(i2);
                ni7.qrj(f21823i, sb.toString());
                break;
            case f65565i1 /* 151 */:
                if (this.f65606kja0.m12892s()) {
                    mcp();
                } else {
                    this.f21835p.t8r(32);
                }
                break;
            case f65543a98o /* 152 */:
            case f21817a /* 153 */:
            case f65601zp /* 154 */:
            case f21832x /* 155 */:
            case f65547ch /* 156 */:
            case f65580nmn5 /* 157 */:
            case f65572lv5 /* 158 */:
            case 159:
                int i7 = i2 - 152;
                fn3e(i7);
                if (this.f65610t8r != i7) {
                    this.f65610t8r = i7;
                    this.f65606kja0 = this.f65608n7h[i7];
                }
                break;
        }
    }

    private void kja0() {
        if (this.f65605ki == null) {
            return;
        }
        jk();
        this.f65605ki = null;
    }

    private void mcp() {
        int iM12885y = toq.m12885y(this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2));
        int iM13627y = this.f21835p.m13627y(2);
        int iF7l8 = toq.f7l8(this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2));
        if (this.f21835p.f7l8()) {
            iM13627y |= 4;
        }
        boolean zF7l8 = this.f21835p.f7l8();
        int iM13627y2 = this.f21835p.m13627y(2);
        int iM13627y3 = this.f21835p.m13627y(2);
        int iM13627y4 = this.f21835p.m13627y(2);
        this.f21835p.t8r(8);
        this.f65606kja0.cdj(iM12885y, iF7l8, zF7l8, iM13627y, iM13627y2, iM13627y3, iM13627y4);
    }

    private void ni7(int i2) {
        this.f65606kja0.m12888k((char) (i2 & 255));
    }

    private void o1t() {
        this.f65606kja0.qrj(this.f21835p.m13627y(4), this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.f7l8(), this.f21835p.f7l8(), this.f21835p.m13627y(3), this.f21835p.m13627y(3));
    }

    /* JADX INFO: renamed from: t */
    private void m12882t() {
        this.f21835p.t8r(4);
        int iM13627y = this.f21835p.m13627y(4);
        this.f21835p.t8r(2);
        this.f65606kja0.kja0(iM13627y, this.f21835p.m13627y(6));
    }

    private void t8r(int i2) {
        if (i2 <= 7) {
            return;
        }
        if (i2 <= 15) {
            this.f21835p.t8r(8);
        } else if (i2 <= 23) {
            this.f21835p.t8r(16);
        } else if (i2 <= 31) {
            this.f21835p.t8r(24);
        }
    }

    private void wvg() {
        int iM12885y = toq.m12885y(this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2));
        int iM12885y2 = toq.m12885y(this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2));
        this.f21835p.t8r(2);
        this.f65606kja0.n7h(iM12885y, iM12885y2, toq.f7l8(this.f21835p.m13627y(2), this.f21835p.m13627y(2), this.f21835p.m13627y(2)));
    }

    /* JADX INFO: renamed from: z */
    private void m12883z(int i2) {
        if (i2 == 160) {
            this.f65606kja0.m12888k((char) 13252);
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid G3 character: ");
        sb.append(i2);
        ni7.qrj(f21823i, sb.toString());
        this.f65606kja0.m12888k('_');
    }

    private void zurt(int i2) {
        if (i2 == 127) {
            this.f65606kja0.m12888k((char) 9835);
        } else {
            this.f65606kja0.m12888k((char) (i2 & 255));
        }
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
        this.f21834h = null;
        this.f65604cdj = null;
        this.f65610t8r = 0;
        this.f65606kja0 = this.f65608n7h[0];
        a9();
        this.f65605ki = null;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: g */
    protected void mo12865g(x2 x2Var) {
        ByteBuffer byteBuffer = (ByteBuffer) C3844k.f7l8(x2Var.f19612g);
        this.f21836s.ncyb(byteBuffer.array(), byteBuffer.limit());
        while (this.f21836s.m13594k() >= 3) {
            int iJp0y = this.f21836s.jp0y() & 7;
            int i2 = iJp0y & 3;
            boolean z2 = (iJp0y & 4) == 4;
            byte bJp0y = (byte) this.f21836s.jp0y();
            byte bJp0y2 = (byte) this.f21836s.jp0y();
            if (i2 == 2 || i2 == 3) {
                if (z2) {
                    if (i2 == 3) {
                        kja0();
                        int i3 = (bJp0y & 192) >> 6;
                        int i4 = this.f65607ld6;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            a9();
                            int i5 = this.f65607ld6;
                            StringBuilder sb = new StringBuilder(71);
                            sb.append("Sequence number discontinuity. previous=");
                            sb.append(i5);
                            sb.append(" current=");
                            sb.append(i3);
                            ni7.qrj(f21823i, sb.toString());
                        }
                        this.f65607ld6 = i3;
                        int i6 = bJp0y & C7571o.f43818k;
                        if (i6 == 0) {
                            i6 = 64;
                        }
                        C7960zy c7960zy = new C7960zy(i3, i6);
                        this.f65605ki = c7960zy;
                        byte[] bArr = c7960zy.f65653zy;
                        int i7 = c7960zy.f21856q;
                        c7960zy.f21856q = i7 + 1;
                        bArr[i7] = bJp0y2;
                    } else {
                        C3844k.m13629k(i2 == 2);
                        C7960zy c7960zy2 = this.f65605ki;
                        if (c7960zy2 == null) {
                            ni7.m13702q(f21823i, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c7960zy2.f65653zy;
                            int i8 = c7960zy2.f21856q;
                            int i9 = i8 + 1;
                            bArr2[i8] = bJp0y;
                            c7960zy2.f21856q = i9 + 1;
                            bArr2[i9] = bJp0y2;
                        }
                    }
                    C7960zy c7960zy3 = this.f65605ki;
                    if (c7960zy3.f21856q == (c7960zy3.f65652toq * 2) - 1) {
                        kja0();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    public String getName() {
        return f21823i;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.text.InterfaceC3691y
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo12866k(long j2) {
        super.mo12866k(j2);
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    protected boolean ld6() {
        return this.f21834h != this.f65604cdj;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: n */
    protected com.google.android.exoplayer2.text.f7l8 mo12867n() {
        List<com.google.android.exoplayer2.text.toq> list = this.f21834h;
        this.f65604cdj = list;
        return new C3641g((List) C3844k.f7l8(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n, com.google.android.exoplayer2.decoder.InterfaceC3289g
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    /* JADX INFO: renamed from: x2 */
    public /* bridge */ /* synthetic */ void zy(x2 x2Var) throws C3660s {
        super.zy(x2Var);
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC3643n
    @dd
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ qrj toq() throws C3660s {
        return super.toq();
    }
}
