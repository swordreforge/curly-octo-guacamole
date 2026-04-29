package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t8r;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0395k;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.util.hb;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.widget.edit.MamlDownloadStatusKt;
import com.xiaomi.onetrack.api.C5694h;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.q */
/* JADX INFO: compiled from: ConstraintSet.java */
/* JADX INFO: loaded from: classes.dex */
public class C0397q {

    /* JADX INFO: renamed from: a */
    private static final int f2923a = 15;

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    private static final int f49690a5id = 94;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f49691a9 = 4;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final int f49692a98o = 14;

    /* JADX INFO: renamed from: b */
    private static final int f2924b = 11;

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    private static final int f49693b3e = 65;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    private static final String f49694b8 = "parent";

    /* JADX INFO: renamed from: b9ub, reason: collision with root package name */
    private static final String f49695b9ub = "ratio";

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    private static final int f49696bap7 = 87;

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    private static final int f49697bek6 = 66;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final int f49698bf2 = 12;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f49699bo = 23;

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    private static final int f49700bwp = 57;

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    private static final int f49701bz2 = 61;

    /* JADX INFO: renamed from: c */
    private static final int f2925c = 1;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final int f49702c8jq = 25;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f49703cdj = 3;

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    private static final int f49704cfr = 52;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final int f49705ch = 18;

    /* JADX INFO: renamed from: cnbm, reason: collision with root package name */
    private static final String f49706cnbm = "weight";

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    private static final int f49707cv06 = 67;

    /* JADX INFO: renamed from: d */
    private static final int f2926d = 31;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f49708d2ok = 6;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f49709d3 = 3;

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private static final int f49710d8wk = 39;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f49711dd = 0;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final int f46166do = 76;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private static final int f49712dr = 27;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    private static final int f49713dxef = 92;

    /* JADX INFO: renamed from: e */
    private static final int f2927e = 2;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private static final int f49714e5 = 91;

    /* JADX INFO: renamed from: ebn, reason: collision with root package name */
    private static final int f49715ebn = 78;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private static final int f49716ek5k = 8;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f49717eqxt = 5;

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    private static final int f49718etdu = 50;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f49719fn3e = -2;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    private static final int f49720fnq8 = 35;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f49721fti = 8;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f49722fu4 = 2;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f49723g1 = 40;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    private static final int f49724ga = 90;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private static final int f49725gbni = 42;

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    private static final int f49726gc3c = 59;

    /* JADX INFO: renamed from: gcp, reason: collision with root package name */
    private static final int f49727gcp = 96;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f49728gvn7 = 2;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private static final int f49729gyi = 26;

    /* JADX INFO: renamed from: h */
    public static final int f2929h = 2;

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    private static final int f49730h4b = 88;

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    private static final int f49731h7am = 68;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final int f49732hb = 4;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final boolean f49733hyr = false;

    /* JADX INFO: renamed from: i */
    public static final int f2930i = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f49734i1 = 13;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private static final int f49735i9jn = 45;

    /* JADX INFO: renamed from: ij, reason: collision with root package name */
    private static final int f49736ij = 80;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    private static final int f49737ikck = 30;

    /* JADX INFO: renamed from: ixz, reason: collision with root package name */
    private static final int f49738ixz = 75;

    /* JADX INFO: renamed from: j */
    private static final int f2931j = 5;

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    private static final int f49739jbh = 71;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f49740jk = 0;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f49741jp0y = 1;

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    private static final int f49742jz5 = 63;

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    private static final int f49743kcsr = 56;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f49744ki = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f49745kja0 = 1;

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    private static final int f49746ktq = 64;

    /* JADX INFO: renamed from: l */
    public static final int f2932l = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f49747ld6 = -2;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final int f49748lh = 86;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private static final int f49750ltg8 = 46;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final int f49751lv5 = 20;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f49752lvui = 7;

    /* JADX INFO: renamed from: lw, reason: collision with root package name */
    private static final int f49753lw = 95;

    /* JADX INFO: renamed from: m */
    private static final int f2933m = 7;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f49754m4 = 48;

    /* JADX INFO: renamed from: m58i, reason: collision with root package name */
    private static final int f49755m58i = 99;

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    private static final int f49756mbx = 70;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f49757mcp = 1;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    private static final int f49758mu = 32;

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    private static final int f49759n2t = 83;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f49760n5r1 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f49761n7h = 0;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f49762ncyb = 0;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    private static final int f49763ngy = 85;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f49764ni7 = 0;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final int f49765nmn5 = 19;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final int f49766nn86 = 3;

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    private static final int f49767nsb = 81;

    /* JADX INFO: renamed from: o */
    private static final int f2934o = 6;

    /* JADX INFO: renamed from: o05, reason: collision with root package name */
    private static final int f49768o05 = 98;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f49769o1t = 0;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f49770oc = 4;

    /* JADX INFO: renamed from: oki, reason: collision with root package name */
    private static final int f49771oki = 97;

    /* JADX INFO: renamed from: p */
    private static final int f2935p = -1;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    private static final int f49772pc = 79;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    private static final int f49773pjz9 = 84;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private static final int f49774py = 44;

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    private static final int f49775qkj8 = 34;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private static final int f49776qo = 36;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f49777qrj = -4;

    /* JADX INFO: renamed from: r */
    public static final int f2936r = 8;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private static final int f49778r8s8 = 47;

    /* JADX INFO: renamed from: s */
    private static final String f2937s = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private static final int f49779se = 58;

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    private static final int f49780sok = 51;

    /* JADX INFO: renamed from: t */
    public static final int f2938t = 0;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final int f49781t8iq = 21;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f49782t8r = -1;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private static final int f49783tfm = 37;

    /* JADX INFO: renamed from: u */
    private static final int f2939u = 22;

    /* JADX INFO: renamed from: uc, reason: collision with root package name */
    private static final int f49784uc = 73;

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    private static final int f49785uj2j = 62;

    /* JADX INFO: renamed from: ukdy, reason: collision with root package name */
    private static final int f49786ukdy = 77;

    /* JADX INFO: renamed from: v */
    private static final int f2940v = 29;

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    private static final int f49788v0af = 49;

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    private static final int f49789vep5 = 69;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    private static final int f49790vq = 33;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    private static final int f49791vy = 93;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f49792vyq = 1;

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    private static final int f49793w831 = 53;

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private static final int f49794was = 41;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    private static final int f49795wlev = 89;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private static final int f49796wo = 38;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f49797wvg = 1;

    /* JADX INFO: renamed from: wx16, reason: collision with root package name */
    private static final int f49798wx16 = 74;

    /* JADX INFO: renamed from: x */
    private static final int f2941x = 17;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f49799x2 = -3;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f49800x9kr = 1;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    private static final int f49801xwq3 = 28;

    /* JADX INFO: renamed from: y */
    private static final String f2942y = "ConstraintSet";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f49802y2 = 24;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private static final int f49803y9n = 10;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private static final int f49804yl = 72;

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    private static final int f49805yqrt = 55;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private static final int f49806yz = 9;

    /* JADX INFO: renamed from: z */
    public static final int f2943z = 0;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final int f49807z4 = 54;

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    private static final int f49808zkd = 60;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final int f49809zp = 16;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private static final int f49810zsr0 = 43;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f49811zurt = 1;

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    private static final int f49812zwy = 82;

    /* JADX INFO: renamed from: k */
    private boolean f2945k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f49814toq;

    /* JADX INFO: renamed from: f */
    private static final int[] f2928f = {0, 4, 8};

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static SparseIntArray f49749lrht = new SparseIntArray();

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static SparseIntArray f49787uv6 = new SparseIntArray();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f49815zy = "";

    /* JADX INFO: renamed from: q */
    public int f2947q = 0;

    /* JADX INFO: renamed from: n */
    private HashMap<String, C0395k> f2946n = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private boolean f2944g = true;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private HashMap<Integer, k> f49813f7l8 = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$f7l8 */
    /* JADX INFO: compiled from: ConstraintSet.java */
    class f7l8 {

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final String f49816kja0 = "\n       ";

        /* JADX INFO: renamed from: k */
        Writer f2949k;

        /* JADX INFO: renamed from: q */
        int f2952q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ConstraintLayout f49821toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Context f49823zy;

        /* JADX INFO: renamed from: n */
        int f2950n = 0;

        /* JADX INFO: renamed from: g */
        final String f2948g = "'left'";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final String f49817f7l8 = "'right'";

        /* JADX INFO: renamed from: y */
        final String f2954y = "'baseline'";

        /* JADX INFO: renamed from: s */
        final String f2953s = "'bottom'";

        /* JADX INFO: renamed from: p */
        final String f2951p = "'top'";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        final String f49818ld6 = "'start'";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final String f49822x2 = "'end'";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        HashMap<Integer, String> f49820qrj = new HashMap<>();

        f7l8(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f2949k = writer;
            this.f49821toq = layout;
            this.f49823zy = layout.getContext();
            this.f2952q = flags;
        }

        private void f7l8(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                this.f2949k.write(f49816kja0 + dimString + "=\"" + dim + "dp\"");
            }
        }

        /* JADX INFO: renamed from: q */
        private void m1670q(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                this.f2949k.write(f49816kja0 + dimString + "=\"" + val + "dp\"");
            }
        }

        /* JADX INFO: renamed from: y */
        private void m1671y(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                this.f2949k.write(f49816kja0 + dimString + "=\"" + types[val] + "\"");
            }
        }

        private void zy(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                if (dim == -2) {
                    this.f2949k.write(f49816kja0 + dimString + "=\"wrap_content\"");
                    return;
                }
                if (dim == -1) {
                    this.f2949k.write(f49816kja0 + dimString + "=\"match_parent\"");
                    return;
                }
                this.f2949k.write(f49816kja0 + dimString + "=\"" + dim + "dp\"");
            }
        }

        /* JADX INFO: renamed from: g */
        void m1672g(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2949k.write(f49816kja0 + my);
            this.f2949k.write(":[");
            this.f2949k.write(m1673k(leftToLeft));
            this.f2949k.write(" , ");
            this.f2949k.write(other);
            if (margin != 0) {
                this.f2949k.write(" , " + margin);
            }
            this.f2949k.write("],\n");
        }

        /* JADX INFO: renamed from: k */
        String m1673k(int id) {
            if (this.f49820qrj.containsKey(Integer.valueOf(id))) {
                return "@+id/" + this.f49820qrj.get(Integer.valueOf(id)) + "";
            }
            if (id == 0) {
                return C0397q.f49694b8;
            }
            String qVar = toq(id);
            this.f49820qrj.put(Integer.valueOf(id), qVar);
            return "@+id/" + qVar + "";
        }

        void kja0(String str, int leftToLeft) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2949k.write(f49816kja0 + str);
            this.f2949k.write("=\"" + m1673k(leftToLeft) + "\"");
        }

        void ld6(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f2949k.write(f49816kja0 + name + "=\"" + value + "\"\n");
        }

        /* JADX INFO: renamed from: n */
        void m1674n(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f2949k.write(C3678q.f65845xwq3);
            this.f2949k.write(":[");
            this.f2949k.write(m1673k(circleConstraint));
            this.f2949k.write(", " + circleAngle);
            this.f2949k.write(circleRadius + "]");
        }

        void n7h(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2949k.write(f49816kja0 + name);
            this.f2949k.write(":");
            int i2 = 0;
            while (i2 < value.length) {
                Writer writer = this.f2949k;
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "[" : ", ");
                sb.append(m1673k(value[i2]));
                writer.write(sb.toString());
                i2++;
            }
            this.f2949k.write("],\n");
        }

        /* JADX INFO: renamed from: p */
        void m1675p(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2949k.write(f49816kja0 + name);
            this.f2949k.write("=\"" + value + "\"");
        }

        void qrj(String name, String value, String def) throws IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            this.f2949k.write(f49816kja0 + name);
            this.f2949k.write("=\"" + value + "\"");
        }

        /* JADX INFO: renamed from: s */
        void m1676s() throws IOException {
            this.f2949k.write("\n<ConstraintSet>\n");
            for (Integer num : C0397q.this.f49813f7l8.keySet()) {
                k kVar = (k) C0397q.this.f49813f7l8.get(num);
                String strM1673k = m1673k(num.intValue());
                this.f2949k.write("  <Constraint");
                this.f2949k.write("\n       android:id=\"" + strM1673k + "\"");
                toq toqVar = kVar.f2964n;
                zy("android:layout_width", toqVar.f3006q, -5);
                zy("android:layout_height", toqVar.f3003n, -5);
                m1675p("app:layout_constraintGuide_begin", (float) toqVar.f2996g, -1.0f);
                m1675p("app:layout_constraintGuide_end", toqVar.f49939f7l8, -1.0f);
                m1675p("app:layout_constraintGuide_percent", toqVar.f3011y, -1.0f);
                m1675p("app:layout_constraintHorizontal_bias", toqVar.f3012z, 0.5f);
                m1675p("app:layout_constraintVertical_bias", toqVar.f49961o1t, 0.5f);
                qrj("app:layout_constraintDimensionRatio", toqVar.f49968wvg, null);
                kja0("app:layout_constraintCircle", toqVar.f3009t);
                m1675p("app:layout_constraintCircleRadius", toqVar.f49954mcp, 0.0f);
                m1675p("app:layout_constraintCircleAngle", toqVar.f49947jk, 0.0f);
                m1675p("android:orientation", toqVar.f49948jp0y, -1.0f);
                m1675p("app:layout_constraintVertical_weight", toqVar.f2993c, -1.0f);
                m1675p("app:layout_constraintHorizontal_weight", toqVar.f49952lrht, -1.0f);
                m1675p("app:layout_constraintHorizontal_chainStyle", toqVar.f49966uv6, 0.0f);
                m1675p("app:layout_constraintVertical_chainStyle", toqVar.f49967vyq, 0.0f);
                m1675p("app:barrierDirection", toqVar.f49971y9n, -1.0f);
                m1675p("app:barrierMargin", toqVar.f2992b, 0.0f);
                f7l8("app:layout_marginLeft", toqVar.f49943gvn7, 0);
                f7l8("app:layout_goneMarginLeft", toqVar.f49936dd, Integer.MIN_VALUE);
                f7l8("app:layout_marginRight", toqVar.f49935d3, 0);
                f7l8("app:layout_goneMarginRight", toqVar.f49957ncyb, Integer.MIN_VALUE);
                f7l8("app:layout_marginStart", toqVar.f49953lvui, 0);
                f7l8("app:layout_goneMarginStart", toqVar.f49945hyr, Integer.MIN_VALUE);
                f7l8("app:layout_marginEnd", toqVar.f49934d2ok, 0);
                f7l8("app:layout_goneMarginEnd", toqVar.f49955n5r1, Integer.MIN_VALUE);
                f7l8("app:layout_marginTop", toqVar.f49962oc, 0);
                f7l8("app:layout_goneMarginTop", toqVar.f49970x9kr, Integer.MIN_VALUE);
                f7l8("app:layout_marginBottom", toqVar.f49938eqxt, 0);
                f7l8("app:layout_goneMarginBottom", toqVar.f3001l, Integer.MIN_VALUE);
                f7l8("app:goneBaselineMargin", toqVar.f2995f, Integer.MIN_VALUE);
                f7l8("app:baselineMargin", toqVar.f3007r, 0);
                m1670q("app:layout_constrainedWidth", toqVar.f49973zp, false);
                m1670q("app:layout_constrainedHeight", toqVar.f3010x, false);
                m1670q("app:barrierAllowsGoneWidgets", toqVar.f49933ch, true);
                m1675p("app:layout_wrapBehaviorInParent", toqVar.f49959nmn5, 0.0f);
                kja0("app:baselineToBaseline", toqVar.f49949ki);
                kja0("app:baselineToBottom", toqVar.f2998i);
                kja0("app:baselineToTop", toqVar.f49964t8r);
                kja0("app:layout_constraintBottom_toBottomOf", toqVar.f49932cdj);
                kja0("app:layout_constraintBottom_toTopOf", toqVar.f2997h);
                kja0("app:layout_constraintEnd_toEndOf", toqVar.f49942fu4);
                kja0("app:layout_constraintEnd_toStartOf", toqVar.f49958ni7);
                kja0("app:layout_constraintLeft_toLeftOf", toqVar.f3005p);
                kja0("app:layout_constraintLeft_toRightOf", toqVar.f49951ld6);
                kja0("app:layout_constraintRight_toLeftOf", toqVar.f49969x2);
                kja0("app:layout_constraintRight_toRightOf", toqVar.f49963qrj);
                kja0("app:layout_constraintStart_toEndOf", toqVar.f49940fn3e);
                kja0("app:layout_constraintStart_toStartOf", toqVar.f49974zurt);
                kja0("app:layout_constraintTop_toBottomOf", toqVar.f49950kja0);
                kja0("app:layout_constraintTop_toTopOf", toqVar.f49956n7h);
                String[] strArr = {"spread", "wrap", MamlDownloadStatusKt.EXTRA_PERCENT};
                m1671y("app:layout_constraintHeight_default", toqVar.f49960nn86, strArr, 0);
                m1675p("app:layout_constraintHeight_percent", toqVar.f49972yz, 1.0f);
                f7l8("app:layout_constraintHeight_min", toqVar.f3002m, 0);
                f7l8("app:layout_constraintHeight_max", toqVar.f2999j, 0);
                m1670q("android:layout_constrainedHeight", toqVar.f3010x, false);
                m1671y("app:layout_constraintWidth_default", toqVar.f2994e, strArr, 0);
                m1675p("app:layout_constraintWidth_percent", toqVar.f49937ek5k, 1.0f);
                f7l8("app:layout_constraintWidth_min", toqVar.f3004o, 0);
                f7l8("app:layout_constraintWidth_max", toqVar.f49944hb, 0);
                m1670q("android:layout_constrainedWidth", toqVar.f49973zp, false);
                m1675p("app:layout_constraintVertical_weight", toqVar.f2993c, -1.0f);
                m1675p("app:layout_constraintHorizontal_weight", toqVar.f49952lrht, -1.0f);
                ld6("app:layout_constraintHorizontal_chainStyle", toqVar.f49966uv6);
                ld6("app:layout_constraintVertical_chainStyle", toqVar.f49967vyq);
                m1671y("app:barrierDirection", toqVar.f49971y9n, new String[]{"left", "right", "top", hb.f61266fu4, "start", C3678q.f65807ch}, -1);
                qrj("app:layout_constraintTag", toqVar.f2991a, null);
                int[] iArr = toqVar.f49946i1;
                if (iArr != null) {
                    n7h("'ReferenceIds'", iArr);
                }
                this.f2949k.write(" />\n");
            }
            this.f2949k.write("</ConstraintSet>\n");
        }

        String toq(int id) {
            try {
                if (id != -1) {
                    return this.f49823zy.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i2 = this.f2950n + 1;
                this.f2950n = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.f2950n + 1;
                this.f2950n = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        void x2(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2949k.write(name);
            this.f2949k.write(":");
            this.f2949k.write(", " + value);
            this.f2949k.write("\n");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$g */
    /* JADX INFO: compiled from: ConstraintSet.java */
    class g {

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final String f49824kja0 = "       ";

        /* JADX INFO: renamed from: k */
        Writer f2956k;

        /* JADX INFO: renamed from: q */
        int f2959q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ConstraintLayout f49829toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Context f49831zy;

        /* JADX INFO: renamed from: n */
        int f2957n = 0;

        /* JADX INFO: renamed from: g */
        final String f2955g = "'left'";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final String f49825f7l8 = "'right'";

        /* JADX INFO: renamed from: y */
        final String f2961y = "'baseline'";

        /* JADX INFO: renamed from: s */
        final String f2960s = "'bottom'";

        /* JADX INFO: renamed from: p */
        final String f2958p = "'top'";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        final String f49826ld6 = "'start'";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final String f49830x2 = "'end'";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        HashMap<Integer, String> f49828qrj = new HashMap<>();

        g(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f2956k = writer;
            this.f49829toq = layout;
            this.f49831zy = layout.getContext();
            this.f2959q = flags;
        }

        /* JADX INFO: renamed from: g */
        private void m1677g(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        /* JADX INFO: renamed from: n */
        private void m1678n(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws IOException {
            if (dim != 0) {
                if (dim == -2) {
                    this.f2956k.write(f49824kja0 + dimString + ": 'wrap'\n");
                    return;
                }
                if (dim == -1) {
                    this.f2956k.write(f49824kja0 + dimString + ": 'parent'\n");
                    return;
                }
                this.f2956k.write(f49824kja0 + dimString + ": " + dim + ",\n");
                return;
            }
            if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    this.f2956k.write(f49824kja0 + dimString + ": '???????????',\n");
                    return;
                }
                if (dimDefault != 2) {
                    return;
                }
                this.f2956k.write(f49824kja0 + dimString + ": '" + dimPercent + "%',\n");
                return;
            }
            if (dimDefault == 0) {
                this.f2956k.write(f49824kja0 + dimString + ": {'spread' ," + dimMin + ", " + dimMax + "}\n");
                return;
            }
            if (dimDefault == 1) {
                this.f2956k.write(f49824kja0 + dimString + ": {'wrap' ," + dimMin + ", " + dimMax + "}\n");
                return;
            }
            if (dimDefault != 2) {
                return;
            }
            this.f2956k.write(f49824kja0 + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
        }

        void f7l8() throws IOException {
            this.f2956k.write("\n'ConstraintSet':{\n");
            for (Integer num : C0397q.this.f49813f7l8.keySet()) {
                k kVar = (k) C0397q.this.f49813f7l8.get(num);
                String strM1679k = m1679k(num.intValue());
                this.f2956k.write(strM1679k + ":{\n");
                toq toqVar = kVar.f2964n;
                m1678n(InterfaceC1925p.byf, toqVar.f3003n, toqVar.f49960nn86, toqVar.f49972yz, toqVar.f3002m, toqVar.f2999j, toqVar.f3010x);
                m1678n("width", toqVar.f3006q, toqVar.f2994e, toqVar.f49937ek5k, toqVar.f3004o, toqVar.f49944hb, toqVar.f49973zp);
                m1681q("'left'", toqVar.f3005p, "'left'", toqVar.f49943gvn7, toqVar.f49936dd);
                m1681q("'left'", toqVar.f49951ld6, "'right'", toqVar.f49943gvn7, toqVar.f49936dd);
                m1681q("'right'", toqVar.f49969x2, "'left'", toqVar.f49935d3, toqVar.f49957ncyb);
                m1681q("'right'", toqVar.f49963qrj, "'right'", toqVar.f49935d3, toqVar.f49957ncyb);
                m1681q("'baseline'", toqVar.f49949ki, "'baseline'", -1, toqVar.f2995f);
                m1681q("'baseline'", toqVar.f49964t8r, "'top'", -1, toqVar.f2995f);
                m1681q("'baseline'", toqVar.f2998i, "'bottom'", -1, toqVar.f2995f);
                m1681q("'top'", toqVar.f49950kja0, "'bottom'", toqVar.f49962oc, toqVar.f49970x9kr);
                m1681q("'top'", toqVar.f49956n7h, "'top'", toqVar.f49962oc, toqVar.f49970x9kr);
                m1681q("'bottom'", toqVar.f49932cdj, "'bottom'", toqVar.f49938eqxt, toqVar.f3001l);
                m1681q("'bottom'", toqVar.f2997h, "'top'", toqVar.f49938eqxt, toqVar.f3001l);
                m1681q("'start'", toqVar.f49974zurt, "'start'", toqVar.f49953lvui, toqVar.f49945hyr);
                m1681q("'start'", toqVar.f49940fn3e, "'end'", toqVar.f49953lvui, toqVar.f49945hyr);
                m1681q("'end'", toqVar.f49958ni7, "'start'", toqVar.f49934d2ok, toqVar.f49955n5r1);
                m1681q("'end'", toqVar.f49942fu4, "'end'", toqVar.f49934d2ok, toqVar.f49955n5r1);
                m1682s("'horizontalBias'", toqVar.f3012z, 0.5f);
                m1682s("'verticalBias'", toqVar.f49961o1t, 0.5f);
                zy(toqVar.f3009t, toqVar.f49947jk, toqVar.f49954mcp);
                m1677g(toqVar.f49948jp0y, toqVar.f2996g, toqVar.f49939f7l8, toqVar.f3011y);
                ld6("'dimensionRatio'", toqVar.f49968wvg);
                m1680p("'barrierMargin'", toqVar.f2992b);
                m1680p("'type'", toqVar.f49931bf2);
                ld6("'ReferenceId'", toqVar.f49930a98o);
                qrj("'mBarrierAllowsGoneWidgets'", toqVar.f49933ch, true);
                m1680p("'WrapBehavior'", toqVar.f49959nmn5);
                m1683y("'verticalWeight'", toqVar.f2993c);
                m1683y("'horizontalWeight'", toqVar.f49952lrht);
                m1680p("'horizontalChainStyle'", toqVar.f49966uv6);
                m1680p("'verticalChainStyle'", toqVar.f49967vyq);
                m1680p("'barrierDirection'", toqVar.f49971y9n);
                int[] iArr = toqVar.f49946i1;
                if (iArr != null) {
                    n7h("'ReferenceIds'", iArr);
                }
                this.f2956k.write("}\n");
            }
            this.f2956k.write("}\n");
        }

        /* JADX INFO: renamed from: k */
        String m1679k(int id) {
            if (this.f49828qrj.containsKey(Integer.valueOf(id))) {
                return "'" + this.f49828qrj.get(Integer.valueOf(id)) + "'";
            }
            if (id == 0) {
                return "'parent'";
            }
            String qVar = toq(id);
            this.f49828qrj.put(Integer.valueOf(id), qVar);
            return "'" + qVar + "'";
        }

        void ld6(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(":");
            this.f2956k.write(", " + value);
            this.f2956k.write("\n");
        }

        void n7h(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(": ");
            int i2 = 0;
            while (i2 < value.length) {
                Writer writer = this.f2956k;
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "[" : ", ");
                sb.append(m1679k(value[i2]));
                writer.write(sb.toString());
                i2++;
            }
            this.f2956k.write("],\n");
        }

        /* JADX INFO: renamed from: p */
        void m1680p(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(":");
            this.f2956k.write(", " + value);
            this.f2956k.write("\n");
        }

        /* JADX INFO: renamed from: q */
        void m1681q(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2956k.write(f49824kja0 + my);
            this.f2956k.write(":[");
            this.f2956k.write(m1679k(leftToLeft));
            this.f2956k.write(" , ");
            this.f2956k.write(other);
            if (margin != 0) {
                this.f2956k.write(" , " + margin);
            }
            this.f2956k.write("],\n");
        }

        void qrj(String name, boolean value, boolean def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(": " + value);
            this.f2956k.write(",\n");
        }

        /* JADX INFO: renamed from: s */
        void m1682s(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(": " + value);
            this.f2956k.write(",\n");
        }

        String toq(int id) {
            try {
                if (id != -1) {
                    return this.f49831zy.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i2 = this.f2957n + 1;
                this.f2957n = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i3 = this.f2957n + 1;
                this.f2957n = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        void x2(String name, boolean value) throws IOException {
            if (value) {
                this.f2956k.write(f49824kja0 + name);
                this.f2956k.write(": " + value);
                this.f2956k.write(",\n");
            }
        }

        /* JADX INFO: renamed from: y */
        void m1683y(String name, float value) throws IOException {
            if (value == -1.0f) {
                return;
            }
            this.f2956k.write(f49824kja0 + name);
            this.f2956k.write(": " + value);
            this.f2956k.write(",\n");
        }

        void zy(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f2956k.write("       circle");
            this.f2956k.write(":[");
            this.f2956k.write(m1679k(circleConstraint));
            this.f2956k.write(", " + circleAngle);
            this.f2956k.write(circleRadius + "]");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$k */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        int f2963k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f49833toq;

        /* JADX INFO: renamed from: y */
        C7857k f2966y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final q f49834zy = new q();

        /* JADX INFO: renamed from: q */
        public final zy f2965q = new zy();

        /* JADX INFO: renamed from: n */
        public final toq f2964n = new toq();

        /* JADX INFO: renamed from: g */
        public final n f2962g = new n();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public HashMap<String, C0395k> f49832f7l8 = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConstraintSet.java */
        static class C7857k {

            /* JADX INFO: renamed from: h */
            private static final int f2967h = 5;

            /* JADX INFO: renamed from: kja0, reason: collision with root package name */
            private static final int f49835kja0 = 10;

            /* JADX INFO: renamed from: n7h, reason: collision with root package name */
            private static final int f49836n7h = 10;

            /* JADX INFO: renamed from: qrj, reason: collision with root package name */
            private static final int f49837qrj = 4;

            /* JADX INFO: renamed from: k */
            int[] f2969k = new int[10];

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            int[] f49840toq = new int[10];

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            int f49842zy = 0;

            /* JADX INFO: renamed from: q */
            int[] f2972q = new int[10];

            /* JADX INFO: renamed from: n */
            float[] f2970n = new float[10];

            /* JADX INFO: renamed from: g */
            int f2968g = 0;

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            int[] f49838f7l8 = new int[5];

            /* JADX INFO: renamed from: y */
            String[] f2974y = new String[5];

            /* JADX INFO: renamed from: s */
            int f2973s = 0;

            /* JADX INFO: renamed from: p */
            int[] f2971p = new int[4];

            /* JADX INFO: renamed from: ld6, reason: collision with root package name */
            boolean[] f49839ld6 = new boolean[4];

            /* JADX INFO: renamed from: x2, reason: collision with root package name */
            int f49841x2 = 0;

            C7857k() {
            }

            @SuppressLint({"LogConditional"})
            /* JADX INFO: renamed from: g */
            void m1692g(String tag) {
                Log.v(tag, "int");
                for (int i2 = 0; i2 < this.f49842zy; i2++) {
                    Log.v(tag, this.f2969k[i2] + " = " + this.f49840toq[i2]);
                }
                Log.v(tag, zurt.toq.f47471zy);
                for (int i3 = 0; i3 < this.f2968g; i3++) {
                    Log.v(tag, this.f2972q[i3] + " = " + this.f2970n[i3]);
                }
                Log.v(tag, "strings");
                for (int i4 = 0; i4 < this.f2973s; i4++) {
                    Log.v(tag, this.f49838f7l8[i4] + " = " + this.f2974y[i4]);
                }
                Log.v(tag, zurt.toq.f1755g);
                for (int i5 = 0; i5 < this.f49841x2; i5++) {
                    Log.v(tag, this.f2971p[i5] + " = " + this.f49839ld6[i5]);
                }
            }

            /* JADX INFO: renamed from: k */
            void m1693k(int type, float value) {
                int i2 = this.f2968g;
                int[] iArr = this.f2972q;
                if (i2 >= iArr.length) {
                    this.f2972q = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2970n;
                    this.f2970n = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2972q;
                int i3 = this.f2968g;
                iArr2[i3] = type;
                float[] fArr2 = this.f2970n;
                this.f2968g = i3 + 1;
                fArr2[i3] = value;
            }

            /* JADX INFO: renamed from: n */
            void m1694n(k c2) {
                for (int i2 = 0; i2 < this.f49842zy; i2++) {
                    C0397q.r8s8(c2, this.f2969k[i2], this.f49840toq[i2]);
                }
                for (int i3 = 0; i3 < this.f2968g; i3++) {
                    C0397q.ltg8(c2, this.f2972q[i3], this.f2970n[i3]);
                }
                for (int i4 = 0; i4 < this.f2973s; i4++) {
                    C0397q.m4(c2, this.f49838f7l8[i4], this.f2974y[i4]);
                }
                for (int i5 = 0; i5 < this.f49841x2; i5++) {
                    C0397q.v0af(c2, this.f2971p[i5], this.f49839ld6[i5]);
                }
            }

            /* JADX INFO: renamed from: q */
            void m1695q(int type, boolean value) {
                int i2 = this.f49841x2;
                int[] iArr = this.f2971p;
                if (i2 >= iArr.length) {
                    this.f2971p = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f49839ld6;
                    this.f49839ld6 = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2971p;
                int i3 = this.f49841x2;
                iArr2[i3] = type;
                boolean[] zArr2 = this.f49839ld6;
                this.f49841x2 = i3 + 1;
                zArr2[i3] = value;
            }

            void toq(int type, int value) {
                int i2 = this.f49842zy;
                int[] iArr = this.f2969k;
                if (i2 >= iArr.length) {
                    this.f2969k = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f49840toq;
                    this.f49840toq = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2969k;
                int i3 = this.f49842zy;
                iArr3[i3] = type;
                int[] iArr4 = this.f49840toq;
                this.f49842zy = i3 + 1;
                iArr4[i3] = value;
            }

            void zy(int type, String value) {
                int i2 = this.f2973s;
                int[] iArr = this.f49838f7l8;
                if (i2 >= iArr.length) {
                    this.f49838f7l8 = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2974y;
                    this.f2974y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f49838f7l8;
                int i3 = this.f2973s;
                iArr2[i3] = type;
                String[] strArr2 = this.f2974y;
                this.f2973s = i3 + 1;
                strArr2[i3] = value;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cdj(String attributeName, float value) {
            n7h(attributeName, C0395k.toq.FLOAT_TYPE).m1638i(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m1685h(String attributeName, int value) {
            n7h(attributeName, C0395k.toq.COLOR_TYPE).t8r(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ki(String attributeName, int value) {
            n7h(attributeName, C0395k.toq.INT_TYPE).fn3e(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ld6(int viewId, ConstraintLayout.toq param) {
            this.f2963k = viewId;
            toq toqVar = this.f2964n;
            toqVar.f3005p = param.f2648n;
            toqVar.f49951ld6 = param.f2641g;
            toqVar.f49969x2 = param.f48484f7l8;
            toqVar.f49963qrj = param.f2657y;
            toqVar.f49956n7h = param.f2653s;
            toqVar.f49950kja0 = param.f2650p;
            toqVar.f2997h = param.f48496ld6;
            toqVar.f49932cdj = param.f48516x2;
            toqVar.f49949ki = param.f48509qrj;
            toqVar.f49964t8r = param.f48502n7h;
            toqVar.f2998i = param.f48495kja0;
            toqVar.f49940fn3e = param.f48511t8r;
            toqVar.f49974zurt = param.f2643i;
            toqVar.f49958ni7 = param.f48485fn3e;
            toqVar.f49942fu4 = param.f48522zurt;
            toqVar.f3012z = param.f48493jp0y;
            toqVar.f49961o1t = param.f48488gvn7;
            toqVar.f49968wvg = param.f48480d3;
            toqVar.f3009t = param.f2642h;
            toqVar.f49954mcp = param.f48477cdj;
            toqVar.f49947jk = param.f48494ki;
            toqVar.f49929a9 = param.f48513uv6;
            toqVar.f49941fti = param.f48514vyq;
            toqVar.f49948jp0y = param.f2639e;
            toqVar.f3011y = param.f48523zy;
            toqVar.f2996g = param.f2645k;
            toqVar.f49939f7l8 = param.f48512toq;
            toqVar.f3006q = ((ViewGroup.MarginLayoutParams) param).width;
            toqVar.f3003n = ((ViewGroup.MarginLayoutParams) param).height;
            toqVar.f49943gvn7 = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            toqVar.f49935d3 = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            toqVar.f49962oc = ((ViewGroup.MarginLayoutParams) param).topMargin;
            toqVar.f49938eqxt = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            toqVar.f3007r = param.f48492jk;
            toqVar.f2993c = param.f48499lvui;
            toqVar.f49952lrht = param.f48479d2ok;
            toqVar.f49967vyq = param.f48481dd;
            toqVar.f49966uv6 = param.f2652r;
            toqVar.f49973zp = param.f48506nn86;
            toqVar.f3010x = param.f48489hb;
            toqVar.f2994e = param.f48517x9kr;
            toqVar.f49960nn86 = param.f48503ncyb;
            toqVar.f49944hb = param.f48490hyr;
            toqVar.f2999j = param.f2640f;
            toqVar.f3004o = param.f2646l;
            toqVar.f3002m = param.f48501n5r1;
            toqVar.f49937ek5k = param.f2638c;
            toqVar.f49972yz = param.f48497lrht;
            toqVar.f2991a = param.f2644j;
            toqVar.f49970x9kr = param.f48487fu4;
            toqVar.f3001l = param.f48507o1t;
            toqVar.f49936dd = param.f48504ni7;
            toqVar.f49957ncyb = param.f2658z;
            toqVar.f49945hyr = param.f48515wvg;
            toqVar.f49955n5r1 = param.f2654t;
            toqVar.f2995f = param.f48500mcp;
            toqVar.f49959nmn5 = param.f2649o;
            toqVar.f49934d2ok = param.getMarginEnd();
            this.f2964n.f49953lvui = param.getMarginStart();
        }

        private C0395k n7h(String attributeName, C0395k.toq attributeType) {
            if (!this.f49832f7l8.containsKey(attributeName)) {
                C0395k c0395k = new C0395k(attributeName, attributeType);
                this.f49832f7l8.put(attributeName, c0395k);
                return c0395k;
            }
            C0395k c0395k2 = this.f49832f7l8.get(attributeName);
            if (c0395k2.m1641p() == attributeType) {
                return c0395k2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + c0395k2.m1641p().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qrj(ConstraintHelper helper, int viewId, Constraints.C0392k param) {
            x2(viewId, param);
            if (helper instanceof Barrier) {
                toq toqVar = this.f2964n;
                toqVar.f49931bf2 = 1;
                Barrier barrier = (Barrier) helper;
                toqVar.f49971y9n = barrier.getType();
                this.f2964n.f49946i1 = barrier.getReferencedIds();
                this.f2964n.f2992b = barrier.getMargin();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t8r(String attributeName, String value) {
            n7h(attributeName, C0395k.toq.STRING_TYPE).zurt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x2(int viewId, Constraints.C0392k param) {
            ld6(viewId, param);
            this.f49834zy.f2987q = param.f48571etdu;
            n nVar = this.f2962g;
            nVar.f49857toq = param.f48577w831;
            nVar.f49859zy = param.f48579z4;
            nVar.f2982q = param.f48578yqrt;
            nVar.f2980n = param.f48573kcsr;
            nVar.f2978g = param.f48568bwp;
            nVar.f49853f7l8 = param.f48574se;
            nVar.f2984y = param.f48572gc3c;
            nVar.f2981p = param.f48580zkd;
            nVar.f49854ld6 = param.f48569bz2;
            nVar.f49858x2 = param.f48576uj2j;
            nVar.f49855n7h = param.f48570cfr;
            nVar.f49856qrj = param.f48575sok;
        }

        public void kja0(String tag) {
            C7857k c7857k = this.f2966y;
            if (c7857k != null) {
                c7857k.m1692g(tag);
            } else {
                Log.v(tag, "DELTA IS NULL");
            }
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public k clone() {
            k kVar = new k();
            kVar.f2964n.m1698k(this.f2964n);
            kVar.f2965q.m1699k(this.f2965q);
            kVar.f49834zy.m1697k(this.f49834zy);
            kVar.f2962g.m1696k(this.f2962g);
            kVar.f2963k = this.f2963k;
            kVar.f2966y = this.f2966y;
            return kVar;
        }

        /* JADX INFO: renamed from: s */
        public void m1690s(ConstraintLayout.toq param) {
            toq toqVar = this.f2964n;
            param.f2648n = toqVar.f3005p;
            param.f2641g = toqVar.f49951ld6;
            param.f48484f7l8 = toqVar.f49969x2;
            param.f2657y = toqVar.f49963qrj;
            param.f2653s = toqVar.f49956n7h;
            param.f2650p = toqVar.f49950kja0;
            param.f48496ld6 = toqVar.f2997h;
            param.f48516x2 = toqVar.f49932cdj;
            param.f48509qrj = toqVar.f49949ki;
            param.f48502n7h = toqVar.f49964t8r;
            param.f48495kja0 = toqVar.f2998i;
            param.f48511t8r = toqVar.f49940fn3e;
            param.f2643i = toqVar.f49974zurt;
            param.f48485fn3e = toqVar.f49958ni7;
            param.f48522zurt = toqVar.f49942fu4;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = toqVar.f49943gvn7;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = toqVar.f49935d3;
            ((ViewGroup.MarginLayoutParams) param).topMargin = toqVar.f49962oc;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = toqVar.f49938eqxt;
            param.f48515wvg = toqVar.f49945hyr;
            param.f2654t = toqVar.f49955n5r1;
            param.f48487fu4 = toqVar.f49970x9kr;
            param.f48507o1t = toqVar.f3001l;
            param.f48493jp0y = toqVar.f3012z;
            param.f48488gvn7 = toqVar.f49961o1t;
            param.f2642h = toqVar.f3009t;
            param.f48477cdj = toqVar.f49954mcp;
            param.f48494ki = toqVar.f49947jk;
            param.f48480d3 = toqVar.f49968wvg;
            param.f48513uv6 = toqVar.f49929a9;
            param.f48514vyq = toqVar.f49941fti;
            param.f48499lvui = toqVar.f2993c;
            param.f48479d2ok = toqVar.f49952lrht;
            param.f48481dd = toqVar.f49967vyq;
            param.f2652r = toqVar.f49966uv6;
            param.f48506nn86 = toqVar.f49973zp;
            param.f48489hb = toqVar.f3010x;
            param.f48517x9kr = toqVar.f2994e;
            param.f48503ncyb = toqVar.f49960nn86;
            param.f48490hyr = toqVar.f49944hb;
            param.f2640f = toqVar.f2999j;
            param.f2646l = toqVar.f3004o;
            param.f48501n5r1 = toqVar.f3002m;
            param.f2638c = toqVar.f49937ek5k;
            param.f48497lrht = toqVar.f49972yz;
            param.f2639e = toqVar.f49948jp0y;
            param.f48523zy = toqVar.f3011y;
            param.f2645k = toqVar.f2996g;
            param.f48512toq = toqVar.f49939f7l8;
            ((ViewGroup.MarginLayoutParams) param).width = toqVar.f3006q;
            ((ViewGroup.MarginLayoutParams) param).height = toqVar.f3003n;
            String str = toqVar.f2991a;
            if (str != null) {
                param.f2644j = str;
            }
            param.f2649o = toqVar.f49959nmn5;
            param.setMarginStart(toqVar.f49953lvui);
            param.setMarginEnd(this.f2964n.f49934d2ok);
            param.m1625n();
        }

        /* JADX INFO: renamed from: y */
        public void m1691y(k c2) {
            C7857k c7857k = this.f2966y;
            if (c7857k != null) {
                c7857k.m1694n(c2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$n */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class n {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f49843cdj = 2;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final int f49844fn3e = 6;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final int f49845fu4 = 9;

        /* JADX INFO: renamed from: h */
        private static final int f2975h = 1;

        /* JADX INFO: renamed from: i */
        private static final int f2976i = 5;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final int f49846ki = 3;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static SparseIntArray f49847kja0 = null;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final int f49848ni7 = 8;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final int f49849o1t = 11;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f49850t8r = 4;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private static final int f49851wvg = 12;

        /* JADX INFO: renamed from: z */
        private static final int f2977z = 10;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static final int f49852zurt = 7;

        /* JADX INFO: renamed from: k */
        public boolean f2979k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public float f49857toq = 0.0f;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public float f49859zy = 0.0f;

        /* JADX INFO: renamed from: q */
        public float f2982q = 0.0f;

        /* JADX INFO: renamed from: n */
        public float f2980n = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f2978g = 1.0f;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public float f49853f7l8 = Float.NaN;

        /* JADX INFO: renamed from: y */
        public float f2984y = Float.NaN;

        /* JADX INFO: renamed from: s */
        public int f2983s = -1;

        /* JADX INFO: renamed from: p */
        public float f2981p = 0.0f;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public float f49854ld6 = 0.0f;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public float f49858x2 = 0.0f;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public boolean f49856qrj = false;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public float f49855n7h = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f49847kja0 = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.ol6, 1);
            f49847kja0.append(C0394g.qrj.qjdr, 2);
            f49847kja0.append(C0394g.qrj.usxh, 3);
            f49847kja0.append(C0394g.qrj.oct, 4);
            f49847kja0.append(C0394g.qrj.yc, 5);
            f49847kja0.append(C0394g.qrj.f6ja, 6);
            f49847kja0.append(C0394g.qrj.y53, 7);
            f49847kja0.append(C0394g.qrj.f32v, 8);
            f49847kja0.append(C0394g.qrj.ada, 9);
            f49847kja0.append(C0394g.qrj.ol, 10);
            f49847kja0.append(C0394g.qrj.o703, 11);
            f49847kja0.append(C0394g.qrj.xx8g, 12);
        }

        /* JADX INFO: renamed from: k */
        public void m1696k(n src) {
            this.f2979k = src.f2979k;
            this.f49857toq = src.f49857toq;
            this.f49859zy = src.f49859zy;
            this.f2982q = src.f2982q;
            this.f2980n = src.f2980n;
            this.f2978g = src.f2978g;
            this.f49853f7l8 = src.f49853f7l8;
            this.f2984y = src.f2984y;
            this.f2983s = src.f2983s;
            this.f2981p = src.f2981p;
            this.f49854ld6 = src.f49854ld6;
            this.f49858x2 = src.f49858x2;
            this.f49856qrj = src.f49856qrj;
            this.f49855n7h = src.f49855n7h;
        }

        void toq(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.dr6w);
            this.f2979k = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f49847kja0.get(index)) {
                    case 1:
                        this.f49857toq = typedArrayObtainStyledAttributes.getFloat(index, this.f49857toq);
                        break;
                    case 2:
                        this.f49859zy = typedArrayObtainStyledAttributes.getFloat(index, this.f49859zy);
                        break;
                    case 3:
                        this.f2982q = typedArrayObtainStyledAttributes.getFloat(index, this.f2982q);
                        break;
                    case 4:
                        this.f2980n = typedArrayObtainStyledAttributes.getFloat(index, this.f2980n);
                        break;
                    case 5:
                        this.f2978g = typedArrayObtainStyledAttributes.getFloat(index, this.f2978g);
                        break;
                    case 6:
                        this.f49853f7l8 = typedArrayObtainStyledAttributes.getDimension(index, this.f49853f7l8);
                        break;
                    case 7:
                        this.f2984y = typedArrayObtainStyledAttributes.getDimension(index, this.f2984y);
                        break;
                    case 8:
                        this.f2981p = typedArrayObtainStyledAttributes.getDimension(index, this.f2981p);
                        break;
                    case 9:
                        this.f49854ld6 = typedArrayObtainStyledAttributes.getDimension(index, this.f49854ld6);
                        break;
                    case 10:
                        this.f49858x2 = typedArrayObtainStyledAttributes.getDimension(index, this.f49858x2);
                        break;
                    case 11:
                        this.f49856qrj = true;
                        this.f49855n7h = typedArrayObtainStyledAttributes.getDimension(index, this.f49855n7h);
                        break;
                    case 12:
                        this.f2983s = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f2983s);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$q */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class q {

        /* JADX INFO: renamed from: k */
        public boolean f2985k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f49860toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f49861zy = 0;

        /* JADX INFO: renamed from: q */
        public float f2987q = 1.0f;

        /* JADX INFO: renamed from: n */
        public float f2986n = Float.NaN;

        /* JADX INFO: renamed from: k */
        public void m1697k(q src) {
            this.f2985k = src.f2985k;
            this.f49860toq = src.f49860toq;
            this.f2987q = src.f2987q;
            this.f2986n = src.f2986n;
            this.f49861zy = src.f49861zy;
        }

        void toq(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.z79v);
            this.f2985k = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.f2) {
                    this.f2987q = typedArrayObtainStyledAttributes.getFloat(index, this.f2987q);
                } else if (index == C0394g.qrj.cz) {
                    this.f49860toq = typedArrayObtainStyledAttributes.getInt(index, this.f49860toq);
                    this.f49860toq = C0397q.f2928f[this.f49860toq];
                } else if (index == C0394g.qrj.d7) {
                    this.f49861zy = typedArrayObtainStyledAttributes.getInt(index, this.f49861zy);
                } else if (index == C0394g.qrj.q8n) {
                    this.f2986n = typedArrayObtainStyledAttributes.getFloat(index, this.f2986n);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$toq */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class toq {

        /* JADX INFO: renamed from: b3e, reason: collision with root package name */
        private static final int f49862b3e = 61;

        /* JADX INFO: renamed from: bap7, reason: collision with root package name */
        private static final int f49863bap7 = 88;

        /* JADX INFO: renamed from: bek6, reason: collision with root package name */
        private static final int f49864bek6 = 62;

        /* JADX INFO: renamed from: bo, reason: collision with root package name */
        private static final int f49865bo = 1;

        /* JADX INFO: renamed from: bwp, reason: collision with root package name */
        private static final int f49866bwp = 35;

        /* JADX INFO: renamed from: bz2, reason: collision with root package name */
        private static final int f49867bz2 = 39;

        /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
        private static final int f49868c8jq = 3;

        /* JADX INFO: renamed from: cfr, reason: collision with root package name */
        private static final int f49869cfr = 30;

        /* JADX INFO: renamed from: cv06, reason: collision with root package name */
        private static final int f49870cv06 = 63;

        /* JADX INFO: renamed from: d */
        private static final int f2988d = 9;

        /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
        private static final int f49871d8wk = 17;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        private static final int f46167do = 77;

        /* JADX INFO: renamed from: dr, reason: collision with root package name */
        private static final int f49872dr = 5;

        /* JADX INFO: renamed from: ebn, reason: collision with root package name */
        private static final int f49873ebn = 79;

        /* JADX INFO: renamed from: etdu, reason: collision with root package name */
        private static final int f49874etdu = 28;

        /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
        private static final int f49875fnq8 = 13;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final int f49876g1 = 18;

        /* JADX INFO: renamed from: ga, reason: collision with root package name */
        private static final int f49877ga = 91;

        /* JADX INFO: renamed from: gbni, reason: collision with root package name */
        private static final int f49878gbni = 20;

        /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
        private static final int f49879gc3c = 37;

        /* JADX INFO: renamed from: gyi, reason: collision with root package name */
        private static final int f49880gyi = 4;

        /* JADX INFO: renamed from: h4b, reason: collision with root package name */
        private static final int f49881h4b = 89;

        /* JADX INFO: renamed from: h7am, reason: collision with root package name */
        private static final int f49882h7am = 69;

        /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
        private static final int f49883i9jn = 23;

        /* JADX INFO: renamed from: ij, reason: collision with root package name */
        private static final int f49884ij = 81;

        /* JADX INFO: renamed from: ikck, reason: collision with root package name */
        private static final int f49885ikck = 8;

        /* JADX INFO: renamed from: ixz, reason: collision with root package name */
        private static final int f49886ixz = 76;

        /* JADX INFO: renamed from: jbh, reason: collision with root package name */
        private static final int f49887jbh = 72;

        /* JADX INFO: renamed from: jz5, reason: collision with root package name */
        private static final int f49888jz5 = 41;

        /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
        private static final int f49889kcsr = 34;

        /* JADX INFO: renamed from: ktq, reason: collision with root package name */
        private static final int f49890ktq = 42;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private static final int f49891lh = 87;

        /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
        private static final int f49892ltg8 = 24;

        /* JADX INFO: renamed from: lv5, reason: collision with root package name */
        public static final int f49893lv5 = -1;

        /* JADX INFO: renamed from: m4, reason: collision with root package name */
        private static final int f49894m4 = 26;

        /* JADX INFO: renamed from: mbx, reason: collision with root package name */
        private static final int f49895mbx = 71;

        /* JADX INFO: renamed from: mu, reason: collision with root package name */
        private static final int f49896mu = 10;

        /* JADX INFO: renamed from: n2t, reason: collision with root package name */
        private static final int f49897n2t = 84;

        /* JADX INFO: renamed from: ngy, reason: collision with root package name */
        private static final int f49898ngy = 86;

        /* JADX INFO: renamed from: nsb, reason: collision with root package name */
        private static final int f49899nsb = 82;

        /* JADX INFO: renamed from: pc, reason: collision with root package name */
        private static final int f49900pc = 80;

        /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
        private static final int f49901pjz9 = 85;

        /* JADX INFO: renamed from: py, reason: collision with root package name */
        private static final int f49902py = 22;

        /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
        private static final int f49903qkj8 = 12;

        /* JADX INFO: renamed from: qo, reason: collision with root package name */
        private static final int f49904qo = 14;

        /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
        private static final int f49905r8s8 = 25;

        /* JADX INFO: renamed from: se, reason: collision with root package name */
        private static final int f49906se = 36;

        /* JADX INFO: renamed from: sok, reason: collision with root package name */
        private static final int f49907sok = 29;

        /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
        public static final int f49908t8iq = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: tfm, reason: collision with root package name */
        private static final int f49909tfm = 15;

        /* JADX INFO: renamed from: u */
        private static SparseIntArray f2989u = null;

        /* JADX INFO: renamed from: uc, reason: collision with root package name */
        private static final int f49910uc = 74;

        /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
        private static final int f49911uj2j = 40;

        /* JADX INFO: renamed from: ukdy, reason: collision with root package name */
        private static final int f49912ukdy = 78;

        /* JADX INFO: renamed from: v */
        private static final int f2990v = 7;

        /* JADX INFO: renamed from: v0af, reason: collision with root package name */
        private static final int f49913v0af = 27;

        /* JADX INFO: renamed from: vep5, reason: collision with root package name */
        private static final int f49914vep5 = 70;

        /* JADX INFO: renamed from: vq, reason: collision with root package name */
        private static final int f49915vq = 11;

        /* JADX INFO: renamed from: w831, reason: collision with root package name */
        private static final int f49916w831 = 31;

        /* JADX INFO: renamed from: was, reason: collision with root package name */
        private static final int f49917was = 19;

        /* JADX INFO: renamed from: wlev, reason: collision with root package name */
        private static final int f49918wlev = 90;

        /* JADX INFO: renamed from: wo, reason: collision with root package name */
        private static final int f49919wo = 16;

        /* JADX INFO: renamed from: wx16, reason: collision with root package name */
        private static final int f49920wx16 = 75;

        /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
        private static final int f49921xwq3 = 6;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        private static final int f49922y2 = 2;

        /* JADX INFO: renamed from: yl, reason: collision with root package name */
        private static final int f49923yl = 73;

        /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
        private static final int f49924yqrt = 33;

        /* JADX INFO: renamed from: z4, reason: collision with root package name */
        private static final int f49925z4 = 32;

        /* JADX INFO: renamed from: zkd, reason: collision with root package name */
        private static final int f49926zkd = 38;

        /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
        private static final int f49927zsr0 = 21;

        /* JADX INFO: renamed from: zwy, reason: collision with root package name */
        private static final int f49928zwy = 83;

        /* JADX INFO: renamed from: a */
        public String f2991a;

        /* JADX INFO: renamed from: a98o, reason: collision with root package name */
        public String f49930a98o;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public int[] f49946i1;

        /* JADX INFO: renamed from: n */
        public int f3003n;

        /* JADX INFO: renamed from: q */
        public int f3006q;

        /* JADX INFO: renamed from: k */
        public boolean f3000k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f49965toq = false;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f49975zy = false;

        /* JADX INFO: renamed from: g */
        public int f2996g = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f49939f7l8 = -1;

        /* JADX INFO: renamed from: y */
        public float f3011y = -1.0f;

        /* JADX INFO: renamed from: s */
        public boolean f3008s = true;

        /* JADX INFO: renamed from: p */
        public int f3005p = -1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f49951ld6 = -1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public int f49969x2 = -1;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public int f49963qrj = -1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public int f49956n7h = -1;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public int f49950kja0 = -1;

        /* JADX INFO: renamed from: h */
        public int f2997h = -1;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public int f49932cdj = -1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public int f49949ki = -1;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public int f49964t8r = -1;

        /* JADX INFO: renamed from: i */
        public int f2998i = -1;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public int f49940fn3e = -1;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public int f49974zurt = -1;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public int f49958ni7 = -1;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public int f49942fu4 = -1;

        /* JADX INFO: renamed from: z */
        public float f3012z = 0.5f;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public float f49961o1t = 0.5f;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public String f49968wvg = null;

        /* JADX INFO: renamed from: t */
        public int f3009t = -1;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public int f49954mcp = 0;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public float f49947jk = 0.0f;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public int f49929a9 = -1;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public int f49941fti = -1;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public int f49948jp0y = -1;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public int f49943gvn7 = 0;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public int f49935d3 = 0;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        public int f49962oc = 0;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        public int f49938eqxt = 0;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public int f49934d2ok = 0;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public int f49953lvui = 0;

        /* JADX INFO: renamed from: r */
        public int f3007r = 0;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public int f49936dd = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public int f49970x9kr = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        public int f49957ncyb = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: l */
        public int f3001l = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        public int f49955n5r1 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        public int f49945hyr = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: f */
        public int f2995f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public float f2993c = -1.0f;

        /* JADX INFO: renamed from: lrht, reason: collision with root package name */
        public float f49952lrht = -1.0f;

        /* JADX INFO: renamed from: uv6, reason: collision with root package name */
        public int f49966uv6 = 0;

        /* JADX INFO: renamed from: vyq, reason: collision with root package name */
        public int f49967vyq = 0;

        /* JADX INFO: renamed from: e */
        public int f2994e = 0;

        /* JADX INFO: renamed from: nn86, reason: collision with root package name */
        public int f49960nn86 = 0;

        /* JADX INFO: renamed from: hb, reason: collision with root package name */
        public int f49944hb = 0;

        /* JADX INFO: renamed from: j */
        public int f2999j = 0;

        /* JADX INFO: renamed from: o */
        public int f3004o = 0;

        /* JADX INFO: renamed from: m */
        public int f3002m = 0;

        /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
        public float f49937ek5k = 1.0f;

        /* JADX INFO: renamed from: yz, reason: collision with root package name */
        public float f49972yz = 1.0f;

        /* JADX INFO: renamed from: y9n, reason: collision with root package name */
        public int f49971y9n = -1;

        /* JADX INFO: renamed from: b */
        public int f2992b = 0;

        /* JADX INFO: renamed from: bf2, reason: collision with root package name */
        public int f49931bf2 = -1;

        /* JADX INFO: renamed from: zp, reason: collision with root package name */
        public boolean f49973zp = false;

        /* JADX INFO: renamed from: x */
        public boolean f3010x = false;

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        public boolean f49933ch = true;

        /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
        public int f49959nmn5 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2989u = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.qode, 24);
            f2989u.append(C0394g.qrj.dcmf, 25);
            f2989u.append(C0394g.qrj.zwh, 28);
            f2989u.append(C0394g.qrj.o7w, 29);
            f2989u.append(C0394g.qrj.y0yf, 35);
            f2989u.append(C0394g.qrj.lq96, 34);
            f2989u.append(C0394g.qrj.dmt, 4);
            f2989u.append(C0394g.qrj.zq, 3);
            f2989u.append(C0394g.qrj.f5k, 1);
            f2989u.append(C0394g.qrj.xz, 6);
            f2989u.append(C0394g.qrj.yir, 7);
            f2989u.append(C0394g.qrj.kxe, 17);
            f2989u.append(C0394g.qrj.k68d, 18);
            f2989u.append(C0394g.qrj.cj, 19);
            f2989u.append(C0394g.qrj.pwca, 90);
            f2989u.append(C0394g.qrj.xdbo, 26);
            f2989u.append(C0394g.qrj.hxtt, 31);
            f2989u.append(C0394g.qrj.l6, 32);
            f2989u.append(C0394g.qrj.jun, 10);
            f2989u.append(C0394g.qrj.w6, 9);
            f2989u.append(C0394g.qrj.lnj, 13);
            f2989u.append(C0394g.qrj.qx, 16);
            f2989u.append(C0394g.qrj.cmzf, 14);
            f2989u.append(C0394g.qrj.rz, 11);
            f2989u.append(C0394g.qrj.jo, 15);
            f2989u.append(C0394g.qrj.h3, 12);
            f2989u.append(C0394g.qrj.gkj, 38);
            f2989u.append(C0394g.qrj.ga8, 37);
            f2989u.append(C0394g.qrj.o9qk, 39);
            f2989u.append(C0394g.qrj.daa, 40);
            f2989u.append(C0394g.qrj.w5fh, 20);
            f2989u.append(C0394g.qrj.dizt, 36);
            f2989u.append(C0394g.qrj.lbq, 5);
            f2989u.append(C0394g.qrj.u02j, 91);
            f2989u.append(C0394g.qrj.ac, 91);
            f2989u.append(C0394g.qrj.cnx, 91);
            f2989u.append(C0394g.qrj.fyt, 91);
            f2989u.append(C0394g.qrj.kxp3, 91);
            f2989u.append(C0394g.qrj.lb8, 23);
            f2989u.append(C0394g.qrj.bhh, 27);
            f2989u.append(C0394g.qrj.gj, 30);
            f2989u.append(C0394g.qrj.mpq, 8);
            f2989u.append(C0394g.qrj.jf5c, 33);
            f2989u.append(C0394g.qrj.nngj, 2);
            f2989u.append(C0394g.qrj.rv, 22);
            f2989u.append(C0394g.qrj.qp0k, 21);
            f2989u.append(C0394g.qrj.q04, 41);
            f2989u.append(C0394g.qrj.leq, 42);
            f2989u.append(C0394g.qrj.nfw3, 41);
            f2989u.append(C0394g.qrj.lb, 42);
            f2989u.append(C0394g.qrj.y5s, 76);
            f2989u.append(C0394g.qrj.z7, 61);
            f2989u.append(C0394g.qrj.n96, 62);
            f2989u.append(C0394g.qrj.g7, 63);
            f2989u.append(C0394g.qrj.s7uw, 69);
            f2989u.append(C0394g.qrj.rugz, 70);
            f2989u.append(C0394g.qrj.tsz9, 71);
            f2989u.append(C0394g.qrj.olea, 72);
            f2989u.append(C0394g.qrj.vy5c, 73);
            f2989u.append(C0394g.qrj.upv, 74);
            f2989u.append(C0394g.qrj.e1, 75);
        }

        /* JADX INFO: renamed from: k */
        public void m1698k(toq src) {
            this.f3000k = src.f3000k;
            this.f3006q = src.f3006q;
            this.f49965toq = src.f49965toq;
            this.f3003n = src.f3003n;
            this.f2996g = src.f2996g;
            this.f49939f7l8 = src.f49939f7l8;
            this.f3011y = src.f3011y;
            this.f3008s = src.f3008s;
            this.f3005p = src.f3005p;
            this.f49951ld6 = src.f49951ld6;
            this.f49969x2 = src.f49969x2;
            this.f49963qrj = src.f49963qrj;
            this.f49956n7h = src.f49956n7h;
            this.f49950kja0 = src.f49950kja0;
            this.f2997h = src.f2997h;
            this.f49932cdj = src.f49932cdj;
            this.f49949ki = src.f49949ki;
            this.f49964t8r = src.f49964t8r;
            this.f2998i = src.f2998i;
            this.f49940fn3e = src.f49940fn3e;
            this.f49974zurt = src.f49974zurt;
            this.f49958ni7 = src.f49958ni7;
            this.f49942fu4 = src.f49942fu4;
            this.f3012z = src.f3012z;
            this.f49961o1t = src.f49961o1t;
            this.f49968wvg = src.f49968wvg;
            this.f3009t = src.f3009t;
            this.f49954mcp = src.f49954mcp;
            this.f49947jk = src.f49947jk;
            this.f49929a9 = src.f49929a9;
            this.f49941fti = src.f49941fti;
            this.f49948jp0y = src.f49948jp0y;
            this.f49943gvn7 = src.f49943gvn7;
            this.f49935d3 = src.f49935d3;
            this.f49962oc = src.f49962oc;
            this.f49938eqxt = src.f49938eqxt;
            this.f49934d2ok = src.f49934d2ok;
            this.f49953lvui = src.f49953lvui;
            this.f3007r = src.f3007r;
            this.f49936dd = src.f49936dd;
            this.f49970x9kr = src.f49970x9kr;
            this.f49957ncyb = src.f49957ncyb;
            this.f3001l = src.f3001l;
            this.f49955n5r1 = src.f49955n5r1;
            this.f49945hyr = src.f49945hyr;
            this.f2995f = src.f2995f;
            this.f2993c = src.f2993c;
            this.f49952lrht = src.f49952lrht;
            this.f49966uv6 = src.f49966uv6;
            this.f49967vyq = src.f49967vyq;
            this.f2994e = src.f2994e;
            this.f49960nn86 = src.f49960nn86;
            this.f49944hb = src.f49944hb;
            this.f2999j = src.f2999j;
            this.f3004o = src.f3004o;
            this.f3002m = src.f3002m;
            this.f49937ek5k = src.f49937ek5k;
            this.f49972yz = src.f49972yz;
            this.f49971y9n = src.f49971y9n;
            this.f2992b = src.f2992b;
            this.f49931bf2 = src.f49931bf2;
            this.f2991a = src.f2991a;
            int[] iArr = src.f49946i1;
            if (iArr == null || src.f49930a98o != null) {
                this.f49946i1 = null;
            } else {
                this.f49946i1 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f49930a98o = src.f49930a98o;
            this.f49973zp = src.f49973zp;
            this.f3010x = src.f3010x;
            this.f49933ch = src.f49933ch;
            this.f49959nmn5 = src.f49959nmn5;
        }

        public void toq(t8r t8rVar, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objUv6 = t8rVar.uv6(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objUv6 == null ? num : objUv6);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f2 = (Float) obj;
                            if (f2.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f2);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        void zy(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.kx);
            this.f49965toq = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = f2989u.get(index);
                switch (i3) {
                    case 1:
                        this.f49949ki = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49949ki);
                        break;
                    case 2:
                        this.f49938eqxt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49938eqxt);
                        break;
                    case 3:
                        this.f49932cdj = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49932cdj);
                        break;
                    case 4:
                        this.f2997h = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f2997h);
                        break;
                    case 5:
                        this.f49968wvg = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f49929a9 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f49929a9);
                        break;
                    case 7:
                        this.f49941fti = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f49941fti);
                        break;
                    case 8:
                        this.f49934d2ok = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49934d2ok);
                        break;
                    case 9:
                        this.f49942fu4 = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49942fu4);
                        break;
                    case 10:
                        this.f49958ni7 = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49958ni7);
                        break;
                    case 11:
                        this.f3001l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3001l);
                        break;
                    case 12:
                        this.f49955n5r1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49955n5r1);
                        break;
                    case 13:
                        this.f49936dd = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49936dd);
                        break;
                    case 14:
                        this.f49957ncyb = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49957ncyb);
                        break;
                    case 15:
                        this.f49945hyr = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49945hyr);
                        break;
                    case 16:
                        this.f49970x9kr = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49970x9kr);
                        break;
                    case 17:
                        this.f2996g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2996g);
                        break;
                    case 18:
                        this.f49939f7l8 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f49939f7l8);
                        break;
                    case 19:
                        this.f3011y = typedArrayObtainStyledAttributes.getFloat(index, this.f3011y);
                        break;
                    case 20:
                        this.f3012z = typedArrayObtainStyledAttributes.getFloat(index, this.f3012z);
                        break;
                    case 21:
                        this.f3003n = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3003n);
                        break;
                    case 22:
                        this.f3006q = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3006q);
                        break;
                    case 23:
                        this.f49943gvn7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49943gvn7);
                        break;
                    case 24:
                        this.f3005p = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f3005p);
                        break;
                    case 25:
                        this.f49951ld6 = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49951ld6);
                        break;
                    case 26:
                        this.f49948jp0y = typedArrayObtainStyledAttributes.getInt(index, this.f49948jp0y);
                        break;
                    case 27:
                        this.f49935d3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49935d3);
                        break;
                    case 28:
                        this.f49969x2 = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49969x2);
                        break;
                    case 29:
                        this.f49963qrj = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49963qrj);
                        break;
                    case 30:
                        this.f49953lvui = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49953lvui);
                        break;
                    case 31:
                        this.f49940fn3e = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49940fn3e);
                        break;
                    case 32:
                        this.f49974zurt = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49974zurt);
                        break;
                    case 33:
                        this.f49962oc = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49962oc);
                        break;
                    case 34:
                        this.f49950kja0 = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49950kja0);
                        break;
                    case 35:
                        this.f49956n7h = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49956n7h);
                        break;
                    case 36:
                        this.f49961o1t = typedArrayObtainStyledAttributes.getFloat(index, this.f49961o1t);
                        break;
                    case 37:
                        this.f49952lrht = typedArrayObtainStyledAttributes.getFloat(index, this.f49952lrht);
                        break;
                    case 38:
                        this.f2993c = typedArrayObtainStyledAttributes.getFloat(index, this.f2993c);
                        break;
                    case 39:
                        this.f49966uv6 = typedArrayObtainStyledAttributes.getInt(index, this.f49966uv6);
                        break;
                    case 40:
                        this.f49967vyq = typedArrayObtainStyledAttributes.getInt(index, this.f49967vyq);
                        break;
                    case 41:
                        C0397q.m1654v(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0397q.m1654v(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                this.f3009t = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f3009t);
                                break;
                            case 62:
                                this.f49954mcp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49954mcp);
                                break;
                            case 63:
                                this.f49947jk = typedArrayObtainStyledAttributes.getFloat(index, this.f49947jk);
                                break;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.f49937ek5k = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f49972yz = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e(C0397q.f2942y, "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f49971y9n = typedArrayObtainStyledAttributes.getInt(index, this.f49971y9n);
                                        break;
                                    case 73:
                                        this.f2992b = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2992b);
                                        break;
                                    case 74:
                                        this.f49930a98o = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f49933ch = typedArrayObtainStyledAttributes.getBoolean(index, this.f49933ch);
                                        break;
                                    case 76:
                                        this.f49959nmn5 = typedArrayObtainStyledAttributes.getInt(index, this.f49959nmn5);
                                        break;
                                    case 77:
                                        this.f49964t8r = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49964t8r);
                                        break;
                                    case 78:
                                        this.f2998i = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f2998i);
                                        break;
                                    case 79:
                                        this.f2995f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2995f);
                                        break;
                                    case 80:
                                        this.f3007r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3007r);
                                        break;
                                    case 81:
                                        this.f2994e = typedArrayObtainStyledAttributes.getInt(index, this.f2994e);
                                        break;
                                    case 82:
                                        this.f49960nn86 = typedArrayObtainStyledAttributes.getInt(index, this.f49960nn86);
                                        break;
                                    case 83:
                                        this.f2999j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2999j);
                                        break;
                                    case 84:
                                        this.f49944hb = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f49944hb);
                                        break;
                                    case 85:
                                        this.f3002m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3002m);
                                        break;
                                    case 86:
                                        this.f3004o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3004o);
                                        break;
                                    case 87:
                                        this.f49973zp = typedArrayObtainStyledAttributes.getBoolean(index, this.f49973zp);
                                        break;
                                    case 88:
                                        this.f3010x = typedArrayObtainStyledAttributes.getBoolean(index, this.f3010x);
                                        break;
                                    case 89:
                                        this.f2991a = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f3008s = typedArrayObtainStyledAttributes.getBoolean(index, this.f3008s);
                                        break;
                                    case 91:
                                        Log.w(C0397q.f2942y, "unused attribute 0x" + Integer.toHexString(index) + "   " + f2989u.get(index));
                                        break;
                                    default:
                                        Log.w(C0397q.f2942y, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2989u.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.q$zy */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f49976cdj = -3;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final int f49977fn3e = 3;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final int f49978fu4 = 6;

        /* JADX INFO: renamed from: h */
        private static final int f3013h = -1;

        /* JADX INFO: renamed from: i */
        private static final int f3014i = 2;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static SparseIntArray f49979ki = null;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f49980kja0 = -2;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final int f49981ni7 = 5;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final int f49982o1t = 8;

        /* JADX INFO: renamed from: t */
        private static final int f3015t = 10;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f49983t8r = 1;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private static final int f49984wvg = 9;

        /* JADX INFO: renamed from: z */
        private static final int f3016z = 7;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static final int f49985zurt = 4;

        /* JADX INFO: renamed from: k */
        public boolean f3018k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f49990toq = -1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f49992zy = 0;

        /* JADX INFO: renamed from: q */
        public String f3021q = null;

        /* JADX INFO: renamed from: n */
        public int f3019n = -1;

        /* JADX INFO: renamed from: g */
        public int f3017g = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public float f49986f7l8 = Float.NaN;

        /* JADX INFO: renamed from: y */
        public int f3023y = -1;

        /* JADX INFO: renamed from: s */
        public float f3022s = Float.NaN;

        /* JADX INFO: renamed from: p */
        public float f3020p = Float.NaN;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f49987ld6 = -1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public String f49991x2 = null;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public int f49989qrj = -3;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public int f49988n7h = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f49979ki = sparseIntArray;
            sparseIntArray.append(C0394g.qrj.ph, 1);
            f49979ki.append(C0394g.qrj.qmbf, 2);
            f49979ki.append(C0394g.qrj.ioq6, 3);
            f49979ki.append(C0394g.qrj.elg, 4);
            f49979ki.append(C0394g.qrj.uux, 5);
            f49979ki.append(C0394g.qrj.rnro, 6);
            f49979ki.append(C0394g.qrj.ci1g, 7);
            f49979ki.append(C0394g.qrj.kus, 8);
            f49979ki.append(C0394g.qrj.y3rt, 9);
            f49979ki.append(C0394g.qrj.re, 10);
        }

        /* JADX INFO: renamed from: k */
        public void m1699k(zy src) {
            this.f3018k = src.f3018k;
            this.f49990toq = src.f49990toq;
            this.f3021q = src.f3021q;
            this.f3019n = src.f3019n;
            this.f3017g = src.f3017g;
            this.f3022s = src.f3022s;
            this.f49986f7l8 = src.f49986f7l8;
            this.f3023y = src.f3023y;
        }

        void toq(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.bt9);
            this.f3018k = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f49979ki.get(index)) {
                    case 1:
                        this.f3022s = typedArrayObtainStyledAttributes.getFloat(index, this.f3022s);
                        break;
                    case 2:
                        this.f3019n = typedArrayObtainStyledAttributes.getInt(index, this.f3019n);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3021q = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f3021q = C0284q.f47317kja0[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f3017g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f49990toq = C0397q.dr(typedArrayObtainStyledAttributes, index, this.f49990toq);
                        break;
                    case 6:
                        this.f49992zy = typedArrayObtainStyledAttributes.getInteger(index, this.f49992zy);
                        break;
                    case 7:
                        this.f49986f7l8 = typedArrayObtainStyledAttributes.getFloat(index, this.f49986f7l8);
                        break;
                    case 8:
                        this.f49987ld6 = typedArrayObtainStyledAttributes.getInteger(index, this.f49987ld6);
                        break;
                    case 9:
                        this.f3020p = typedArrayObtainStyledAttributes.getFloat(index, this.f3020p);
                        break;
                    case 10:
                        int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f49988n7h = resourceId;
                            if (resourceId != -1) {
                                this.f49989qrj = -2;
                            }
                        } else if (i3 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f49991x2 = string;
                            if (string.indexOf("/") > 0) {
                                this.f49988n7h = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f49989qrj = -2;
                            } else {
                                this.f49989qrj = -1;
                            }
                        } else {
                            this.f49989qrj = typedArrayObtainStyledAttributes.getInteger(index, this.f49988n7h);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f49749lrht.append(C0394g.qrj.olj, 25);
        f49749lrht.append(C0394g.qrj.i0, 26);
        f49749lrht.append(C0394g.qrj.cc1, 29);
        f49749lrht.append(C0394g.qrj.wtm, 30);
        f49749lrht.append(C0394g.qrj.yh8z, 36);
        f49749lrht.append(C0394g.qrj.fq, 35);
        f49749lrht.append(C0394g.qrj.xknm, 4);
        f49749lrht.append(C0394g.qrj.a4ph, 3);
        f49749lrht.append(C0394g.qrj.tvn8, 1);
        f49749lrht.append(C0394g.qrj.km9o, 91);
        f49749lrht.append(C0394g.qrj.ze, 92);
        f49749lrht.append(C0394g.qrj.w2bz, 6);
        f49749lrht.append(C0394g.qrj.gl8t, 7);
        f49749lrht.append(C0394g.qrj.gg7, 17);
        f49749lrht.append(C0394g.qrj.ff8y, 18);
        f49749lrht.append(C0394g.qrj.te, 19);
        f49749lrht.append(C0394g.qrj.yvs, 99);
        f49749lrht.append(C0394g.qrj.jog, 27);
        f49749lrht.append(C0394g.qrj.ex76, 32);
        f49749lrht.append(C0394g.qrj.hczd, 33);
        f49749lrht.append(C0394g.qrj.dmw0, 10);
        f49749lrht.append(C0394g.qrj.s9de, 9);
        f49749lrht.append(C0394g.qrj.p68f, 13);
        f49749lrht.append(C0394g.qrj.zalf, 16);
        f49749lrht.append(C0394g.qrj.w6w4, 14);
        f49749lrht.append(C0394g.qrj.fm, 11);
        f49749lrht.append(C0394g.qrj.ebaq, 15);
        f49749lrht.append(C0394g.qrj.l0u, 12);
        f49749lrht.append(C0394g.qrj.wqg, 40);
        f49749lrht.append(C0394g.qrj.c7g, 39);
        f49749lrht.append(C0394g.qrj.kho, 41);
        f49749lrht.append(C0394g.qrj.g8, 42);
        f49749lrht.append(C0394g.qrj.x8, 20);
        f49749lrht.append(C0394g.qrj.lm5, 37);
        f49749lrht.append(C0394g.qrj.bao0, 5);
        f49749lrht.append(C0394g.qrj.fpn, 87);
        f49749lrht.append(C0394g.qrj.y84, 87);
        f49749lrht.append(C0394g.qrj.rq, 87);
        f49749lrht.append(C0394g.qrj.li5y, 87);
        f49749lrht.append(C0394g.qrj.j1s, 87);
        f49749lrht.append(C0394g.qrj.jglj, 24);
        f49749lrht.append(C0394g.qrj.xo, 28);
        f49749lrht.append(C0394g.qrj.p6, 31);
        f49749lrht.append(C0394g.qrj.b3fl, 8);
        f49749lrht.append(C0394g.qrj.ybb, 34);
        f49749lrht.append(C0394g.qrj.zaso, 2);
        f49749lrht.append(C0394g.qrj.zi4o, 23);
        f49749lrht.append(C0394g.qrj.sm, 21);
        f49749lrht.append(C0394g.qrj.bv, 95);
        f49749lrht.append(C0394g.qrj.t8o, 96);
        f49749lrht.append(C0394g.qrj.rig, 22);
        f49749lrht.append(C0394g.qrj.bmt3, 43);
        f49749lrht.append(C0394g.qrj.ma8k, 44);
        f49749lrht.append(C0394g.qrj.je1q, 45);
        f49749lrht.append(C0394g.qrj.zxa9, 46);
        f49749lrht.append(C0394g.qrj.drpy, 60);
        f49749lrht.append(C0394g.qrj.jre, 47);
        f49749lrht.append(C0394g.qrj.py7, 48);
        f49749lrht.append(C0394g.qrj.mq, 49);
        f49749lrht.append(C0394g.qrj.xnu, 50);
        f49749lrht.append(C0394g.qrj.wh, 51);
        f49749lrht.append(C0394g.qrj.vymi, 52);
        f49749lrht.append(C0394g.qrj.a7zh, 53);
        f49749lrht.append(C0394g.qrj.vf, 54);
        f49749lrht.append(C0394g.qrj.ym, 55);
        f49749lrht.append(C0394g.qrj.xx, 56);
        f49749lrht.append(C0394g.qrj.qyk, 57);
        f49749lrht.append(C0394g.qrj.w0, 58);
        f49749lrht.append(C0394g.qrj.jp, 59);
        f49749lrht.append(C0394g.qrj.b6i9, 61);
        f49749lrht.append(C0394g.qrj.uew, 62);
        f49749lrht.append(C0394g.qrj.bp, 63);
        f49749lrht.append(C0394g.qrj.wkrb, 64);
        f49749lrht.append(C0394g.qrj.a5rs, 65);
        f49749lrht.append(C0394g.qrj.wen, 66);
        f49749lrht.append(C0394g.qrj.rb7, 67);
        f49749lrht.append(C0394g.qrj.m4ll, 79);
        f49749lrht.append(C0394g.qrj.l0, 38);
        f49749lrht.append(C0394g.qrj.fjcj, 68);
        f49749lrht.append(C0394g.qrj.td, 69);
        f49749lrht.append(C0394g.qrj.b972, 70);
        f49749lrht.append(C0394g.qrj.ffy, 97);
        f49749lrht.append(C0394g.qrj.bb, 71);
        f49749lrht.append(C0394g.qrj.fupf, 72);
        f49749lrht.append(C0394g.qrj.ahb, 73);
        f49749lrht.append(C0394g.qrj.l92, 74);
        f49749lrht.append(C0394g.qrj.cyg, 75);
        f49749lrht.append(C0394g.qrj.ue, 76);
        f49749lrht.append(C0394g.qrj.twzk, 77);
        f49749lrht.append(C0394g.qrj.mqs, 78);
        f49749lrht.append(C0394g.qrj.dm, 80);
        f49749lrht.append(C0394g.qrj.t8fp, 81);
        f49749lrht.append(C0394g.qrj.f1, 82);
        f49749lrht.append(C0394g.qrj.n358, 83);
        f49749lrht.append(C0394g.qrj.ym8, 84);
        f49749lrht.append(C0394g.qrj.fai, 85);
        f49749lrht.append(C0394g.qrj.crha, 86);
        SparseIntArray sparseIntArray = f49787uv6;
        int i2 = C0394g.qrj.syl2;
        sparseIntArray.append(i2, 6);
        f49787uv6.append(i2, 7);
        f49787uv6.append(C0394g.qrj.iks, 27);
        f49787uv6.append(C0394g.qrj.fe, 13);
        f49787uv6.append(C0394g.qrj.fpx, 16);
        f49787uv6.append(C0394g.qrj.ebmm, 14);
        f49787uv6.append(C0394g.qrj.gge, 11);
        f49787uv6.append(C0394g.qrj.bl, 15);
        f49787uv6.append(C0394g.qrj.um, 12);
        f49787uv6.append(C0394g.qrj.b1, 40);
        f49787uv6.append(C0394g.qrj.afv, 39);
        f49787uv6.append(C0394g.qrj.v2t, 41);
        f49787uv6.append(C0394g.qrj.lbeq, 42);
        f49787uv6.append(C0394g.qrj.o3, 20);
        f49787uv6.append(C0394g.qrj.wwr9, 37);
        f49787uv6.append(C0394g.qrj.ca, 5);
        f49787uv6.append(C0394g.qrj.gb7o, 87);
        f49787uv6.append(C0394g.qrj.w8w, 87);
        f49787uv6.append(C0394g.qrj.yz5, 87);
        f49787uv6.append(C0394g.qrj.wk, 87);
        f49787uv6.append(C0394g.qrj.w82, 87);
        f49787uv6.append(C0394g.qrj.sgh1, 24);
        f49787uv6.append(C0394g.qrj.so, 28);
        f49787uv6.append(C0394g.qrj.lzd, 31);
        f49787uv6.append(C0394g.qrj.xrg, 8);
        f49787uv6.append(C0394g.qrj.c3, 34);
        f49787uv6.append(C0394g.qrj.ul, 2);
        f49787uv6.append(C0394g.qrj.i7, 23);
        f49787uv6.append(C0394g.qrj.yyel, 21);
        f49787uv6.append(C0394g.qrj.t4, 95);
        f49787uv6.append(C0394g.qrj.zxe, 96);
        f49787uv6.append(C0394g.qrj.qyp7, 22);
        f49787uv6.append(C0394g.qrj.yw7, 43);
        f49787uv6.append(C0394g.qrj.xzk6, 44);
        f49787uv6.append(C0394g.qrj.mjed, 45);
        f49787uv6.append(C0394g.qrj.ahy0, 46);
        f49787uv6.append(C0394g.qrj.yaw, 60);
        f49787uv6.append(C0394g.qrj.fw, 47);
        f49787uv6.append(C0394g.qrj.hf7, 48);
        f49787uv6.append(C0394g.qrj.wy, 49);
        f49787uv6.append(C0394g.qrj.ew08, 50);
        f49787uv6.append(C0394g.qrj.zlo, 51);
        f49787uv6.append(C0394g.qrj.vt4y, 52);
        f49787uv6.append(C0394g.qrj.sa, 53);
        f49787uv6.append(C0394g.qrj.in, 54);
        f49787uv6.append(C0394g.qrj.peir, 55);
        f49787uv6.append(C0394g.qrj.gai, 56);
        f49787uv6.append(C0394g.qrj.mle, 57);
        f49787uv6.append(C0394g.qrj.e1c, 58);
        f49787uv6.append(C0394g.qrj.xypo, 59);
        f49787uv6.append(C0394g.qrj.os3j, 62);
        f49787uv6.append(C0394g.qrj.t2et, 63);
        f49787uv6.append(C0394g.qrj.f4f, 64);
        f49787uv6.append(C0394g.qrj.z8l, 65);
        f49787uv6.append(C0394g.qrj.xnf, 66);
        f49787uv6.append(C0394g.qrj.e10, 67);
        f49787uv6.append(C0394g.qrj.czxz, 79);
        f49787uv6.append(C0394g.qrj.re9, 38);
        f49787uv6.append(C0394g.qrj.vz, 98);
        f49787uv6.append(C0394g.qrj.ct, 68);
        f49787uv6.append(C0394g.qrj.dw, 69);
        f49787uv6.append(C0394g.qrj.n6, 70);
        f49787uv6.append(C0394g.qrj.hcy, 71);
        f49787uv6.append(C0394g.qrj.m24, 72);
        f49787uv6.append(C0394g.qrj.pri, 73);
        f49787uv6.append(C0394g.qrj.cns, 74);
        f49787uv6.append(C0394g.qrj.a46k, 75);
        f49787uv6.append(C0394g.qrj.oqy, 76);
        f49787uv6.append(C0394g.qrj.jhn, 77);
        f49787uv6.append(C0394g.qrj.yuzy, 78);
        f49787uv6.append(C0394g.qrj.c4my, 80);
        f49787uv6.append(C0394g.qrj.sr0i, 81);
        f49787uv6.append(C0394g.qrj.dzm, 82);
        f49787uv6.append(C0394g.qrj.gs9, 83);
        f49787uv6.append(C0394g.qrj.bhar, 84);
        f49787uv6.append(C0394g.qrj.s8, 85);
        f49787uv6.append(C0394g.qrj.ptry, 86);
        f49787uv6.append(C0394g.qrj.c8n3, 97);
    }

    /* JADX INFO: renamed from: a */
    static String m1645a(int v2) {
        for (Field field : C0397q.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v2) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    /* JADX INFO: renamed from: b */
    private k m1646b(int id) {
        if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
            this.f49813f7l8.put(Integer.valueOf(id), new k());
        }
        return this.f49813f7l8.get(Integer.valueOf(id));
    }

    private static String[] bap7(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c2 = charArray[i3];
            if (c2 == ',' && !z2) {
                arrayList.add(new String(charArray, i2, i3 - i2));
                i2 = i3 + 1;
            } else if (c2 == '\"') {
                z2 = !z2;
            }
        }
        arrayList.add(new String(charArray, i2, charArray.length - i2));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    static String ch(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.zy.m1601s(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    /* JADX INFO: renamed from: d */
    static void m1647d(ConstraintLayout.toq params, String value) {
        float fAbs = Float.NaN;
        int i2 = -1;
        if (value != null) {
            int length = value.length();
            int iIndexOf = value.indexOf(44);
            int i3 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = value.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(C0846k.ae4)) {
                    i2 = 0;
                } else if (strSubstring.equalsIgnoreCase(C5694h.f31812b)) {
                    i2 = 1;
                }
                i3 = iIndexOf + 1;
            }
            int iIndexOf2 = value.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = value.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = value.substring(i3, iIndexOf2);
                    String strSubstring4 = value.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            fAbs = i2 == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.f48480d3 = value;
        params.f48508oc = fAbs;
        params.f48483eqxt = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dr(TypedArray a2, int index, int def) {
        int resourceId = a2.getResourceId(index, def);
        return resourceId == -1 ? a2.getInt(index, -1) : resourceId;
    }

    /* JADX INFO: renamed from: e */
    private int[] m1648e(View view, String referenceIdString) {
        int iIntValue;
        Object objLvui;
        String[] strArrSplit = referenceIdString.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = C0394g.f7l8.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objLvui = ((ConstraintLayout) view.getParent()).lvui(0, strTrim)) != null && (objLvui instanceof Integer)) {
                iIntValue = ((Integer) objLvui).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private void fnq8(Context ctx, k c2, TypedArray a2, boolean override) {
        if (override) {
            qo(ctx, c2, a2);
            return;
        }
        int indexCount = a2.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            if (index != C0394g.qrj.l0 && C0394g.qrj.p6 != index && C0394g.qrj.b3fl != index) {
                c2.f2965q.f3018k = true;
                c2.f2964n.f49965toq = true;
                c2.f49834zy.f2985k = true;
                c2.f2962g.f2979k = true;
            }
            switch (f49749lrht.get(index)) {
                case 1:
                    toq toqVar = c2.f2964n;
                    toqVar.f49949ki = dr(a2, index, toqVar.f49949ki);
                    break;
                case 2:
                    toq toqVar2 = c2.f2964n;
                    toqVar2.f49938eqxt = a2.getDimensionPixelSize(index, toqVar2.f49938eqxt);
                    break;
                case 3:
                    toq toqVar3 = c2.f2964n;
                    toqVar3.f49932cdj = dr(a2, index, toqVar3.f49932cdj);
                    break;
                case 4:
                    toq toqVar4 = c2.f2964n;
                    toqVar4.f2997h = dr(a2, index, toqVar4.f2997h);
                    break;
                case 5:
                    c2.f2964n.f49968wvg = a2.getString(index);
                    break;
                case 6:
                    toq toqVar5 = c2.f2964n;
                    toqVar5.f49929a9 = a2.getDimensionPixelOffset(index, toqVar5.f49929a9);
                    break;
                case 7:
                    toq toqVar6 = c2.f2964n;
                    toqVar6.f49941fti = a2.getDimensionPixelOffset(index, toqVar6.f49941fti);
                    break;
                case 8:
                    toq toqVar7 = c2.f2964n;
                    toqVar7.f49934d2ok = a2.getDimensionPixelSize(index, toqVar7.f49934d2ok);
                    break;
                case 9:
                    toq toqVar8 = c2.f2964n;
                    toqVar8.f49942fu4 = dr(a2, index, toqVar8.f49942fu4);
                    break;
                case 10:
                    toq toqVar9 = c2.f2964n;
                    toqVar9.f49958ni7 = dr(a2, index, toqVar9.f49958ni7);
                    break;
                case 11:
                    toq toqVar10 = c2.f2964n;
                    toqVar10.f3001l = a2.getDimensionPixelSize(index, toqVar10.f3001l);
                    break;
                case 12:
                    toq toqVar11 = c2.f2964n;
                    toqVar11.f49955n5r1 = a2.getDimensionPixelSize(index, toqVar11.f49955n5r1);
                    break;
                case 13:
                    toq toqVar12 = c2.f2964n;
                    toqVar12.f49936dd = a2.getDimensionPixelSize(index, toqVar12.f49936dd);
                    break;
                case 14:
                    toq toqVar13 = c2.f2964n;
                    toqVar13.f49957ncyb = a2.getDimensionPixelSize(index, toqVar13.f49957ncyb);
                    break;
                case 15:
                    toq toqVar14 = c2.f2964n;
                    toqVar14.f49945hyr = a2.getDimensionPixelSize(index, toqVar14.f49945hyr);
                    break;
                case 16:
                    toq toqVar15 = c2.f2964n;
                    toqVar15.f49970x9kr = a2.getDimensionPixelSize(index, toqVar15.f49970x9kr);
                    break;
                case 17:
                    toq toqVar16 = c2.f2964n;
                    toqVar16.f2996g = a2.getDimensionPixelOffset(index, toqVar16.f2996g);
                    break;
                case 18:
                    toq toqVar17 = c2.f2964n;
                    toqVar17.f49939f7l8 = a2.getDimensionPixelOffset(index, toqVar17.f49939f7l8);
                    break;
                case 19:
                    toq toqVar18 = c2.f2964n;
                    toqVar18.f3011y = a2.getFloat(index, toqVar18.f3011y);
                    break;
                case 20:
                    toq toqVar19 = c2.f2964n;
                    toqVar19.f3012z = a2.getFloat(index, toqVar19.f3012z);
                    break;
                case 21:
                    toq toqVar20 = c2.f2964n;
                    toqVar20.f3003n = a2.getLayoutDimension(index, toqVar20.f3003n);
                    break;
                case 22:
                    q qVar = c2.f49834zy;
                    qVar.f49860toq = a2.getInt(index, qVar.f49860toq);
                    q qVar2 = c2.f49834zy;
                    qVar2.f49860toq = f2928f[qVar2.f49860toq];
                    break;
                case 23:
                    toq toqVar21 = c2.f2964n;
                    toqVar21.f3006q = a2.getLayoutDimension(index, toqVar21.f3006q);
                    break;
                case 24:
                    toq toqVar22 = c2.f2964n;
                    toqVar22.f49943gvn7 = a2.getDimensionPixelSize(index, toqVar22.f49943gvn7);
                    break;
                case 25:
                    toq toqVar23 = c2.f2964n;
                    toqVar23.f3005p = dr(a2, index, toqVar23.f3005p);
                    break;
                case 26:
                    toq toqVar24 = c2.f2964n;
                    toqVar24.f49951ld6 = dr(a2, index, toqVar24.f49951ld6);
                    break;
                case 27:
                    toq toqVar25 = c2.f2964n;
                    toqVar25.f49948jp0y = a2.getInt(index, toqVar25.f49948jp0y);
                    break;
                case 28:
                    toq toqVar26 = c2.f2964n;
                    toqVar26.f49935d3 = a2.getDimensionPixelSize(index, toqVar26.f49935d3);
                    break;
                case 29:
                    toq toqVar27 = c2.f2964n;
                    toqVar27.f49969x2 = dr(a2, index, toqVar27.f49969x2);
                    break;
                case 30:
                    toq toqVar28 = c2.f2964n;
                    toqVar28.f49963qrj = dr(a2, index, toqVar28.f49963qrj);
                    break;
                case 31:
                    toq toqVar29 = c2.f2964n;
                    toqVar29.f49953lvui = a2.getDimensionPixelSize(index, toqVar29.f49953lvui);
                    break;
                case 32:
                    toq toqVar30 = c2.f2964n;
                    toqVar30.f49940fn3e = dr(a2, index, toqVar30.f49940fn3e);
                    break;
                case 33:
                    toq toqVar31 = c2.f2964n;
                    toqVar31.f49974zurt = dr(a2, index, toqVar31.f49974zurt);
                    break;
                case 34:
                    toq toqVar32 = c2.f2964n;
                    toqVar32.f49962oc = a2.getDimensionPixelSize(index, toqVar32.f49962oc);
                    break;
                case 35:
                    toq toqVar33 = c2.f2964n;
                    toqVar33.f49950kja0 = dr(a2, index, toqVar33.f49950kja0);
                    break;
                case 36:
                    toq toqVar34 = c2.f2964n;
                    toqVar34.f49956n7h = dr(a2, index, toqVar34.f49956n7h);
                    break;
                case 37:
                    toq toqVar35 = c2.f2964n;
                    toqVar35.f49961o1t = a2.getFloat(index, toqVar35.f49961o1t);
                    break;
                case 38:
                    c2.f2963k = a2.getResourceId(index, c2.f2963k);
                    break;
                case 39:
                    toq toqVar36 = c2.f2964n;
                    toqVar36.f49952lrht = a2.getFloat(index, toqVar36.f49952lrht);
                    break;
                case 40:
                    toq toqVar37 = c2.f2964n;
                    toqVar37.f2993c = a2.getFloat(index, toqVar37.f2993c);
                    break;
                case 41:
                    toq toqVar38 = c2.f2964n;
                    toqVar38.f49966uv6 = a2.getInt(index, toqVar38.f49966uv6);
                    break;
                case 42:
                    toq toqVar39 = c2.f2964n;
                    toqVar39.f49967vyq = a2.getInt(index, toqVar39.f49967vyq);
                    break;
                case 43:
                    q qVar3 = c2.f49834zy;
                    qVar3.f2987q = a2.getFloat(index, qVar3.f2987q);
                    break;
                case 44:
                    n nVar = c2.f2962g;
                    nVar.f49856qrj = true;
                    nVar.f49855n7h = a2.getDimension(index, nVar.f49855n7h);
                    break;
                case 45:
                    n nVar2 = c2.f2962g;
                    nVar2.f49859zy = a2.getFloat(index, nVar2.f49859zy);
                    break;
                case 46:
                    n nVar3 = c2.f2962g;
                    nVar3.f2982q = a2.getFloat(index, nVar3.f2982q);
                    break;
                case 47:
                    n nVar4 = c2.f2962g;
                    nVar4.f2980n = a2.getFloat(index, nVar4.f2980n);
                    break;
                case 48:
                    n nVar5 = c2.f2962g;
                    nVar5.f2978g = a2.getFloat(index, nVar5.f2978g);
                    break;
                case 49:
                    n nVar6 = c2.f2962g;
                    nVar6.f49853f7l8 = a2.getDimension(index, nVar6.f49853f7l8);
                    break;
                case 50:
                    n nVar7 = c2.f2962g;
                    nVar7.f2984y = a2.getDimension(index, nVar7.f2984y);
                    break;
                case 51:
                    n nVar8 = c2.f2962g;
                    nVar8.f2981p = a2.getDimension(index, nVar8.f2981p);
                    break;
                case 52:
                    n nVar9 = c2.f2962g;
                    nVar9.f49854ld6 = a2.getDimension(index, nVar9.f49854ld6);
                    break;
                case 53:
                    n nVar10 = c2.f2962g;
                    nVar10.f49858x2 = a2.getDimension(index, nVar10.f49858x2);
                    break;
                case 54:
                    toq toqVar40 = c2.f2964n;
                    toqVar40.f2994e = a2.getInt(index, toqVar40.f2994e);
                    break;
                case 55:
                    toq toqVar41 = c2.f2964n;
                    toqVar41.f49960nn86 = a2.getInt(index, toqVar41.f49960nn86);
                    break;
                case 56:
                    toq toqVar42 = c2.f2964n;
                    toqVar42.f49944hb = a2.getDimensionPixelSize(index, toqVar42.f49944hb);
                    break;
                case 57:
                    toq toqVar43 = c2.f2964n;
                    toqVar43.f2999j = a2.getDimensionPixelSize(index, toqVar43.f2999j);
                    break;
                case 58:
                    toq toqVar44 = c2.f2964n;
                    toqVar44.f3004o = a2.getDimensionPixelSize(index, toqVar44.f3004o);
                    break;
                case 59:
                    toq toqVar45 = c2.f2964n;
                    toqVar45.f3002m = a2.getDimensionPixelSize(index, toqVar45.f3002m);
                    break;
                case 60:
                    n nVar11 = c2.f2962g;
                    nVar11.f49857toq = a2.getFloat(index, nVar11.f49857toq);
                    break;
                case 61:
                    toq toqVar46 = c2.f2964n;
                    toqVar46.f3009t = dr(a2, index, toqVar46.f3009t);
                    break;
                case 62:
                    toq toqVar47 = c2.f2964n;
                    toqVar47.f49954mcp = a2.getDimensionPixelSize(index, toqVar47.f49954mcp);
                    break;
                case 63:
                    toq toqVar48 = c2.f2964n;
                    toqVar48.f49947jk = a2.getFloat(index, toqVar48.f49947jk);
                    break;
                case 64:
                    zy zyVar = c2.f2965q;
                    zyVar.f49990toq = dr(a2, index, zyVar.f49990toq);
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        c2.f2965q.f3021q = a2.getString(index);
                    } else {
                        c2.f2965q.f3021q = C0284q.f47317kja0[a2.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c2.f2965q.f3017g = a2.getInt(index, 0);
                    break;
                case 67:
                    zy zyVar2 = c2.f2965q;
                    zyVar2.f3022s = a2.getFloat(index, zyVar2.f3022s);
                    break;
                case 68:
                    q qVar4 = c2.f49834zy;
                    qVar4.f2986n = a2.getFloat(index, qVar4.f2986n);
                    break;
                case 69:
                    c2.f2964n.f49937ek5k = a2.getFloat(index, 1.0f);
                    break;
                case 70:
                    c2.f2964n.f49972yz = a2.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(f2942y, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    toq toqVar49 = c2.f2964n;
                    toqVar49.f49971y9n = a2.getInt(index, toqVar49.f49971y9n);
                    break;
                case 73:
                    toq toqVar50 = c2.f2964n;
                    toqVar50.f2992b = a2.getDimensionPixelSize(index, toqVar50.f2992b);
                    break;
                case 74:
                    c2.f2964n.f49930a98o = a2.getString(index);
                    break;
                case 75:
                    toq toqVar51 = c2.f2964n;
                    toqVar51.f49933ch = a2.getBoolean(index, toqVar51.f49933ch);
                    break;
                case 76:
                    zy zyVar3 = c2.f2965q;
                    zyVar3.f3019n = a2.getInt(index, zyVar3.f3019n);
                    break;
                case 77:
                    c2.f2964n.f2991a = a2.getString(index);
                    break;
                case 78:
                    q qVar5 = c2.f49834zy;
                    qVar5.f49861zy = a2.getInt(index, qVar5.f49861zy);
                    break;
                case 79:
                    zy zyVar4 = c2.f2965q;
                    zyVar4.f49986f7l8 = a2.getFloat(index, zyVar4.f49986f7l8);
                    break;
                case 80:
                    toq toqVar52 = c2.f2964n;
                    toqVar52.f49973zp = a2.getBoolean(index, toqVar52.f49973zp);
                    break;
                case 81:
                    toq toqVar53 = c2.f2964n;
                    toqVar53.f3010x = a2.getBoolean(index, toqVar53.f3010x);
                    break;
                case 82:
                    zy zyVar5 = c2.f2965q;
                    zyVar5.f49992zy = a2.getInteger(index, zyVar5.f49992zy);
                    break;
                case 83:
                    n nVar12 = c2.f2962g;
                    nVar12.f2983s = dr(a2, index, nVar12.f2983s);
                    break;
                case 84:
                    zy zyVar6 = c2.f2965q;
                    zyVar6.f49987ld6 = a2.getInteger(index, zyVar6.f49987ld6);
                    break;
                case 85:
                    zy zyVar7 = c2.f2965q;
                    zyVar7.f3020p = a2.getFloat(index, zyVar7.f3020p);
                    break;
                case 86:
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        c2.f2965q.f49988n7h = a2.getResourceId(index, -1);
                        zy zyVar8 = c2.f2965q;
                        if (zyVar8.f49988n7h != -1) {
                            zyVar8.f49989qrj = -2;
                        }
                    } else if (i3 == 3) {
                        c2.f2965q.f49991x2 = a2.getString(index);
                        if (c2.f2965q.f49991x2.indexOf("/") > 0) {
                            c2.f2965q.f49988n7h = a2.getResourceId(index, -1);
                            c2.f2965q.f49989qrj = -2;
                        } else {
                            c2.f2965q.f49989qrj = -1;
                        }
                    } else {
                        zy zyVar9 = c2.f2965q;
                        zyVar9.f49989qrj = a2.getInteger(index, zyVar9.f49988n7h);
                    }
                    break;
                case 87:
                    Log.w(f2942y, "unused attribute 0x" + Integer.toHexString(index) + "   " + f49749lrht.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w(f2942y, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f49749lrht.get(index));
                    break;
                case 91:
                    toq toqVar54 = c2.f2964n;
                    toqVar54.f49964t8r = dr(a2, index, toqVar54.f49964t8r);
                    break;
                case 92:
                    toq toqVar55 = c2.f2964n;
                    toqVar55.f2998i = dr(a2, index, toqVar55.f2998i);
                    break;
                case 93:
                    toq toqVar56 = c2.f2964n;
                    toqVar56.f3007r = a2.getDimensionPixelSize(index, toqVar56.f3007r);
                    break;
                case 94:
                    toq toqVar57 = c2.f2964n;
                    toqVar57.f2995f = a2.getDimensionPixelSize(index, toqVar57.f2995f);
                    break;
                case 95:
                    m1654v(c2.f2964n, a2, index, 0);
                    break;
                case 96:
                    m1654v(c2.f2964n, a2, index, 1);
                    break;
                case 97:
                    toq toqVar58 = c2.f2964n;
                    toqVar58.f49959nmn5 = a2.getInt(index, toqVar58.f49959nmn5);
                    break;
            }
        }
        toq toqVar59 = c2.f2964n;
        if (toqVar59.f49930a98o != null) {
            toqVar59.f49946i1 = null;
        }
    }

    static void ikck(Object data, String value, int orientation) {
        if (value == null) {
            return;
        }
        int iIndexOf = value.indexOf(61);
        int length = value.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = value.substring(0, iIndexOf);
        String strSubstring2 = value.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if (f49695b9ub.equalsIgnoreCase(strTrim)) {
                if (data instanceof ConstraintLayout.toq) {
                    ConstraintLayout.toq toqVar = (ConstraintLayout.toq) data;
                    if (orientation == 0) {
                        ((ViewGroup.MarginLayoutParams) toqVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) toqVar).height = 0;
                    }
                    m1647d(toqVar, strTrim2);
                    return;
                }
                if (data instanceof toq) {
                    ((toq) data).f49968wvg = strTrim2;
                    return;
                } else {
                    if (data instanceof k.C7857k) {
                        ((k.C7857k) data).zy(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if (f49706cnbm.equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (data instanceof ConstraintLayout.toq) {
                        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) toqVar2).width = 0;
                            toqVar2.f48479d2ok = f2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) toqVar2).height = 0;
                            toqVar2.f48499lvui = f2;
                        }
                    } else if (data instanceof toq) {
                        toq toqVar3 = (toq) data;
                        if (orientation == 0) {
                            toqVar3.f3006q = 0;
                            toqVar3.f49952lrht = f2;
                        } else {
                            toqVar3.f3003n = 0;
                            toqVar3.f2993c = f2;
                        }
                    } else if (data instanceof k.C7857k) {
                        k.C7857k c7857k = (k.C7857k) data;
                        if (orientation == 0) {
                            c7857k.toq(23, 0);
                            c7857k.m1693k(39, f2);
                        } else {
                            c7857k.toq(21, 0);
                            c7857k.m1693k(40, f2);
                        }
                    }
                } else {
                    if (!f49694b8.equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (data instanceof ConstraintLayout.toq) {
                        ConstraintLayout.toq toqVar4 = (ConstraintLayout.toq) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) toqVar4).width = 0;
                            toqVar4.f2638c = fMax;
                            toqVar4.f48517x9kr = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) toqVar4).height = 0;
                            toqVar4.f48497lrht = fMax;
                            toqVar4.f48503ncyb = 2;
                        }
                    } else if (data instanceof toq) {
                        toq toqVar5 = (toq) data;
                        if (orientation == 0) {
                            toqVar5.f3006q = 0;
                            toqVar5.f49937ek5k = fMax;
                            toqVar5.f2994e = 2;
                        } else {
                            toqVar5.f3003n = 0;
                            toqVar5.f49972yz = fMax;
                            toqVar5.f49960nn86 = 2;
                        }
                    } else if (data instanceof k.C7857k) {
                        k.C7857k c7857k2 = (k.C7857k) data;
                        if (orientation == 0) {
                            c7857k2.toq(23, 0);
                            c7857k2.toq(54, 2);
                        } else {
                            c7857k2.toq(21, 0);
                            c7857k2.toq(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    private String lh(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return hb.f61266fu4;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return C3678q.f65807ch;
            default:
                return "undefined";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ltg8(k c2, int type, float value) {
        if (type == 19) {
            c2.f2964n.f3011y = value;
        }
        if (type == 20) {
            c2.f2964n.f3012z = value;
            return;
        }
        if (type == 37) {
            c2.f2964n.f49961o1t = value;
            return;
        }
        if (type == 60) {
            c2.f2962g.f49857toq = value;
            return;
        }
        if (type == 63) {
            c2.f2964n.f49947jk = value;
            return;
        }
        if (type == 79) {
            c2.f2965q.f49986f7l8 = value;
            return;
        }
        if (type == 85) {
            c2.f2965q.f3020p = value;
            return;
        }
        if (type != 87) {
            if (type == 39) {
                c2.f2964n.f49952lrht = value;
                return;
            }
            if (type == 40) {
                c2.f2964n.f2993c = value;
                return;
            }
            switch (type) {
                case 43:
                    c2.f49834zy.f2987q = value;
                    break;
                case 44:
                    n nVar = c2.f2962g;
                    nVar.f49855n7h = value;
                    nVar.f49856qrj = true;
                    break;
                case 45:
                    c2.f2962g.f49859zy = value;
                    break;
                case 46:
                    c2.f2962g.f2982q = value;
                    break;
                case 47:
                    c2.f2962g.f2980n = value;
                    break;
                case 48:
                    c2.f2962g.f2978g = value;
                    break;
                case 49:
                    c2.f2962g.f49853f7l8 = value;
                    break;
                case 50:
                    c2.f2962g.f2984y = value;
                    break;
                case 51:
                    c2.f2962g.f2981p = value;
                    break;
                case 52:
                    c2.f2962g.f49854ld6 = value;
                    break;
                case 53:
                    c2.f2962g.f49858x2 = value;
                    break;
                default:
                    switch (type) {
                        case 67:
                            c2.f2965q.f3022s = value;
                            break;
                        case 68:
                            c2.f49834zy.f2986n = value;
                            break;
                        case 69:
                            c2.f2964n.f49937ek5k = value;
                            break;
                        case 70:
                            c2.f2964n.f49972yz = value;
                            break;
                        default:
                            Log.w(f2942y, "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m4(k c2, int type, String value) {
        if (type == 5) {
            c2.f2964n.f49968wvg = value;
            return;
        }
        if (type == 65) {
            c2.f2965q.f3021q = value;
            return;
        }
        if (type == 74) {
            toq toqVar = c2.f2964n;
            toqVar.f49930a98o = value;
            toqVar.f49946i1 = null;
        } else if (type == 77) {
            c2.f2964n.f2991a = value;
        } else if (type != 87) {
            if (type != 90) {
                Log.w(f2942y, "Unknown attribute 0x");
            } else {
                c2.f2965q.f49991x2 = value;
            }
        }
    }

    public static k ni7(Context context, XmlPullParser parser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, C0394g.qrj.j9nl);
        qo(context, kVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    /* JADX INFO: renamed from: o */
    private void m1652o(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            m1646b(chainIds[0]).f2964n.f49952lrht = weights[0];
        }
        m1646b(chainIds[0]).f2964n.f49966uv6 = style;
        d2ok(chainIds[0], left, leftId, leftSide, -1);
        for (int i2 = 1; i2 < chainIds.length; i2++) {
            int i3 = i2 - 1;
            d2ok(chainIds[i2], left, chainIds[i3], right, -1);
            d2ok(chainIds[i3], right, chainIds[i2], left, -1);
            if (weights != null) {
                m1646b(chainIds[i2]).f2964n.f49952lrht = weights[i2];
            }
        }
        d2ok(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
    }

    private static void qo(Context ctx, k c2, TypedArray a2) {
        int indexCount = a2.getIndexCount();
        k.C7857k c7857k = new k.C7857k();
        c2.f2966y = c7857k;
        c2.f2965q.f3018k = false;
        c2.f2964n.f49965toq = false;
        c2.f49834zy.f2985k = false;
        c2.f2962g.f2979k = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            switch (f49787uv6.get(index)) {
                case 2:
                    c7857k.toq(2, a2.getDimensionPixelSize(index, c2.f2964n.f49938eqxt));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w(f2942y, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f49749lrht.get(index));
                    break;
                case 5:
                    c7857k.zy(5, a2.getString(index));
                    break;
                case 6:
                    c7857k.toq(6, a2.getDimensionPixelOffset(index, c2.f2964n.f49929a9));
                    break;
                case 7:
                    c7857k.toq(7, a2.getDimensionPixelOffset(index, c2.f2964n.f49941fti));
                    break;
                case 8:
                    c7857k.toq(8, a2.getDimensionPixelSize(index, c2.f2964n.f49934d2ok));
                    break;
                case 11:
                    c7857k.toq(11, a2.getDimensionPixelSize(index, c2.f2964n.f3001l));
                    break;
                case 12:
                    c7857k.toq(12, a2.getDimensionPixelSize(index, c2.f2964n.f49955n5r1));
                    break;
                case 13:
                    c7857k.toq(13, a2.getDimensionPixelSize(index, c2.f2964n.f49936dd));
                    break;
                case 14:
                    c7857k.toq(14, a2.getDimensionPixelSize(index, c2.f2964n.f49957ncyb));
                    break;
                case 15:
                    c7857k.toq(15, a2.getDimensionPixelSize(index, c2.f2964n.f49945hyr));
                    break;
                case 16:
                    c7857k.toq(16, a2.getDimensionPixelSize(index, c2.f2964n.f49970x9kr));
                    break;
                case 17:
                    c7857k.toq(17, a2.getDimensionPixelOffset(index, c2.f2964n.f2996g));
                    break;
                case 18:
                    c7857k.toq(18, a2.getDimensionPixelOffset(index, c2.f2964n.f49939f7l8));
                    break;
                case 19:
                    c7857k.m1693k(19, a2.getFloat(index, c2.f2964n.f3011y));
                    break;
                case 20:
                    c7857k.m1693k(20, a2.getFloat(index, c2.f2964n.f3012z));
                    break;
                case 21:
                    c7857k.toq(21, a2.getLayoutDimension(index, c2.f2964n.f3003n));
                    break;
                case 22:
                    c7857k.toq(22, f2928f[a2.getInt(index, c2.f49834zy.f49860toq)]);
                    break;
                case 23:
                    c7857k.toq(23, a2.getLayoutDimension(index, c2.f2964n.f3006q));
                    break;
                case 24:
                    c7857k.toq(24, a2.getDimensionPixelSize(index, c2.f2964n.f49943gvn7));
                    break;
                case 27:
                    c7857k.toq(27, a2.getInt(index, c2.f2964n.f49948jp0y));
                    break;
                case 28:
                    c7857k.toq(28, a2.getDimensionPixelSize(index, c2.f2964n.f49935d3));
                    break;
                case 31:
                    c7857k.toq(31, a2.getDimensionPixelSize(index, c2.f2964n.f49953lvui));
                    break;
                case 34:
                    c7857k.toq(34, a2.getDimensionPixelSize(index, c2.f2964n.f49962oc));
                    break;
                case 37:
                    c7857k.m1693k(37, a2.getFloat(index, c2.f2964n.f49961o1t));
                    break;
                case 38:
                    int resourceId = a2.getResourceId(index, c2.f2963k);
                    c2.f2963k = resourceId;
                    c7857k.toq(38, resourceId);
                    break;
                case 39:
                    c7857k.m1693k(39, a2.getFloat(index, c2.f2964n.f49952lrht));
                    break;
                case 40:
                    c7857k.m1693k(40, a2.getFloat(index, c2.f2964n.f2993c));
                    break;
                case 41:
                    c7857k.toq(41, a2.getInt(index, c2.f2964n.f49966uv6));
                    break;
                case 42:
                    c7857k.toq(42, a2.getInt(index, c2.f2964n.f49967vyq));
                    break;
                case 43:
                    c7857k.m1693k(43, a2.getFloat(index, c2.f49834zy.f2987q));
                    break;
                case 44:
                    c7857k.m1695q(44, true);
                    c7857k.m1693k(44, a2.getDimension(index, c2.f2962g.f49855n7h));
                    break;
                case 45:
                    c7857k.m1693k(45, a2.getFloat(index, c2.f2962g.f49859zy));
                    break;
                case 46:
                    c7857k.m1693k(46, a2.getFloat(index, c2.f2962g.f2982q));
                    break;
                case 47:
                    c7857k.m1693k(47, a2.getFloat(index, c2.f2962g.f2980n));
                    break;
                case 48:
                    c7857k.m1693k(48, a2.getFloat(index, c2.f2962g.f2978g));
                    break;
                case 49:
                    c7857k.m1693k(49, a2.getDimension(index, c2.f2962g.f49853f7l8));
                    break;
                case 50:
                    c7857k.m1693k(50, a2.getDimension(index, c2.f2962g.f2984y));
                    break;
                case 51:
                    c7857k.m1693k(51, a2.getDimension(index, c2.f2962g.f2981p));
                    break;
                case 52:
                    c7857k.m1693k(52, a2.getDimension(index, c2.f2962g.f49854ld6));
                    break;
                case 53:
                    c7857k.m1693k(53, a2.getDimension(index, c2.f2962g.f49858x2));
                    break;
                case 54:
                    c7857k.toq(54, a2.getInt(index, c2.f2964n.f2994e));
                    break;
                case 55:
                    c7857k.toq(55, a2.getInt(index, c2.f2964n.f49960nn86));
                    break;
                case 56:
                    c7857k.toq(56, a2.getDimensionPixelSize(index, c2.f2964n.f49944hb));
                    break;
                case 57:
                    c7857k.toq(57, a2.getDimensionPixelSize(index, c2.f2964n.f2999j));
                    break;
                case 58:
                    c7857k.toq(58, a2.getDimensionPixelSize(index, c2.f2964n.f3004o));
                    break;
                case 59:
                    c7857k.toq(59, a2.getDimensionPixelSize(index, c2.f2964n.f3002m));
                    break;
                case 60:
                    c7857k.m1693k(60, a2.getFloat(index, c2.f2962g.f49857toq));
                    break;
                case 62:
                    c7857k.toq(62, a2.getDimensionPixelSize(index, c2.f2964n.f49954mcp));
                    break;
                case 63:
                    c7857k.m1693k(63, a2.getFloat(index, c2.f2964n.f49947jk));
                    break;
                case 64:
                    c7857k.toq(64, dr(a2, index, c2.f2965q.f49990toq));
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        c7857k.zy(65, a2.getString(index));
                    } else {
                        c7857k.zy(65, C0284q.f47317kja0[a2.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c7857k.toq(66, a2.getInt(index, 0));
                    break;
                case 67:
                    c7857k.m1693k(67, a2.getFloat(index, c2.f2965q.f3022s));
                    break;
                case 68:
                    c7857k.m1693k(68, a2.getFloat(index, c2.f49834zy.f2986n));
                    break;
                case 69:
                    c7857k.m1693k(69, a2.getFloat(index, 1.0f));
                    break;
                case 70:
                    c7857k.m1693k(70, a2.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(f2942y, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c7857k.toq(72, a2.getInt(index, c2.f2964n.f49971y9n));
                    break;
                case 73:
                    c7857k.toq(73, a2.getDimensionPixelSize(index, c2.f2964n.f2992b));
                    break;
                case 74:
                    c7857k.zy(74, a2.getString(index));
                    break;
                case 75:
                    c7857k.m1695q(75, a2.getBoolean(index, c2.f2964n.f49933ch));
                    break;
                case 76:
                    c7857k.toq(76, a2.getInt(index, c2.f2965q.f3019n));
                    break;
                case 77:
                    c7857k.zy(77, a2.getString(index));
                    break;
                case 78:
                    c7857k.toq(78, a2.getInt(index, c2.f49834zy.f49861zy));
                    break;
                case 79:
                    c7857k.m1693k(79, a2.getFloat(index, c2.f2965q.f49986f7l8));
                    break;
                case 80:
                    c7857k.m1695q(80, a2.getBoolean(index, c2.f2964n.f49973zp));
                    break;
                case 81:
                    c7857k.m1695q(81, a2.getBoolean(index, c2.f2964n.f3010x));
                    break;
                case 82:
                    c7857k.toq(82, a2.getInteger(index, c2.f2965q.f49992zy));
                    break;
                case 83:
                    c7857k.toq(83, dr(a2, index, c2.f2962g.f2983s));
                    break;
                case 84:
                    c7857k.toq(84, a2.getInteger(index, c2.f2965q.f49987ld6));
                    break;
                case 85:
                    c7857k.m1693k(85, a2.getFloat(index, c2.f2965q.f3020p));
                    break;
                case 86:
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        c2.f2965q.f49988n7h = a2.getResourceId(index, -1);
                        c7857k.toq(89, c2.f2965q.f49988n7h);
                        zy zyVar = c2.f2965q;
                        if (zyVar.f49988n7h != -1) {
                            zyVar.f49989qrj = -2;
                            c7857k.toq(88, -2);
                        }
                    } else if (i3 == 3) {
                        c2.f2965q.f49991x2 = a2.getString(index);
                        c7857k.zy(90, c2.f2965q.f49991x2);
                        if (c2.f2965q.f49991x2.indexOf("/") > 0) {
                            c2.f2965q.f49988n7h = a2.getResourceId(index, -1);
                            c7857k.toq(89, c2.f2965q.f49988n7h);
                            c2.f2965q.f49989qrj = -2;
                            c7857k.toq(88, -2);
                        } else {
                            c2.f2965q.f49989qrj = -1;
                            c7857k.toq(88, -1);
                        }
                    } else {
                        zy zyVar2 = c2.f2965q;
                        zyVar2.f49989qrj = a2.getInteger(index, zyVar2.f49988n7h);
                        c7857k.toq(88, c2.f2965q.f49989qrj);
                    }
                    break;
                case 87:
                    Log.w(f2942y, "unused attribute 0x" + Integer.toHexString(index) + "   " + f49749lrht.get(index));
                    break;
                case 93:
                    c7857k.toq(93, a2.getDimensionPixelSize(index, c2.f2964n.f3007r));
                    break;
                case 94:
                    c7857k.toq(94, a2.getDimensionPixelSize(index, c2.f2964n.f2995f));
                    break;
                case 95:
                    m1654v(c7857k, a2, index, 0);
                    break;
                case 96:
                    m1654v(c7857k, a2, index, 1);
                    break;
                case 97:
                    c7857k.toq(97, a2.getInt(index, c2.f2964n.f49959nmn5));
                    break;
                case 98:
                    if (MotionLayout.faqz) {
                        int resourceId2 = a2.getResourceId(index, c2.f2963k);
                        c2.f2963k = resourceId2;
                        if (resourceId2 == -1) {
                            c2.f49833toq = a2.getString(index);
                        }
                    } else if (a2.peekValue(index).type == 3) {
                        c2.f49833toq = a2.getString(index);
                    } else {
                        c2.f2963k = a2.getResourceId(index, c2.f2963k);
                    }
                    break;
                case 99:
                    c7857k.m1695q(99, a2.getBoolean(index, c2.f2964n.f3008s));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r8s8(k c2, int type, int value) {
        if (type == 6) {
            c2.f2964n.f49929a9 = value;
        }
        if (type == 7) {
            c2.f2964n.f49941fti = value;
            return;
        }
        if (type == 8) {
            c2.f2964n.f49934d2ok = value;
            return;
        }
        if (type == 27) {
            c2.f2964n.f49948jp0y = value;
            return;
        }
        if (type == 28) {
            c2.f2964n.f49935d3 = value;
            return;
        }
        if (type == 41) {
            c2.f2964n.f49966uv6 = value;
            return;
        }
        if (type == 42) {
            c2.f2964n.f49967vyq = value;
            return;
        }
        if (type == 61) {
            c2.f2964n.f3009t = value;
            return;
        }
        if (type == 62) {
            c2.f2964n.f49954mcp = value;
            return;
        }
        if (type == 72) {
            c2.f2964n.f49971y9n = value;
            return;
        }
        if (type == 73) {
            c2.f2964n.f2992b = value;
            return;
        }
        switch (type) {
            case 2:
                c2.f2964n.f49938eqxt = value;
                break;
            case 11:
                c2.f2964n.f3001l = value;
                break;
            case 12:
                c2.f2964n.f49955n5r1 = value;
                break;
            case 13:
                c2.f2964n.f49936dd = value;
                break;
            case 14:
                c2.f2964n.f49957ncyb = value;
                break;
            case 15:
                c2.f2964n.f49945hyr = value;
                break;
            case 16:
                c2.f2964n.f49970x9kr = value;
                break;
            case 17:
                c2.f2964n.f2996g = value;
                break;
            case 18:
                c2.f2964n.f49939f7l8 = value;
                break;
            case 31:
                c2.f2964n.f49953lvui = value;
                break;
            case 34:
                c2.f2964n.f49962oc = value;
                break;
            case 38:
                c2.f2963k = value;
                break;
            case 64:
                c2.f2965q.f49990toq = value;
                break;
            case 66:
                c2.f2965q.f3017g = value;
                break;
            case 76:
                c2.f2965q.f3019n = value;
                break;
            case 78:
                c2.f49834zy.f49861zy = value;
                break;
            case 93:
                c2.f2964n.f3007r = value;
                break;
            case 94:
                c2.f2964n.f2995f = value;
                break;
            case 97:
                c2.f2964n.f49959nmn5 = value;
                break;
            default:
                switch (type) {
                    case 21:
                        c2.f2964n.f3003n = value;
                        break;
                    case 22:
                        c2.f49834zy.f49860toq = value;
                        break;
                    case 23:
                        c2.f2964n.f3006q = value;
                        break;
                    case 24:
                        c2.f2964n.f49943gvn7 = value;
                        break;
                    default:
                        switch (type) {
                            case 54:
                                c2.f2964n.f2994e = value;
                                break;
                            case 55:
                                c2.f2964n.f49960nn86 = value;
                                break;
                            case 56:
                                c2.f2964n.f49944hb = value;
                                break;
                            case 57:
                                c2.f2964n.f2999j = value;
                                break;
                            case 58:
                                c2.f2964n.f3004o = value;
                                break;
                            case 59:
                                c2.f2964n.f3002m = value;
                                break;
                            default:
                                switch (type) {
                                    case 82:
                                        c2.f2965q.f49992zy = value;
                                        break;
                                    case 83:
                                        c2.f2962g.f2983s = value;
                                        break;
                                    case 84:
                                        c2.f2965q.f49987ld6 = value;
                                        break;
                                    default:
                                        switch (type) {
                                            case 87:
                                                break;
                                            case 88:
                                                c2.f2965q.f49989qrj = value;
                                                break;
                                            case 89:
                                                c2.f2965q.f49988n7h = value;
                                                break;
                                            default:
                                                Log.w(f2942y, "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    static void m1654v(Object data, TypedArray a2, int attr, int orientation) {
        if (data == null) {
            return;
        }
        int i2 = a2.peekValue(attr).type;
        if (i2 == 3) {
            ikck(data, a2.getString(attr), orientation);
            return;
        }
        int dimensionPixelSize = -2;
        boolean z2 = false;
        if (i2 != 5) {
            int i3 = a2.getInt(attr, 0);
            if (i3 != -4) {
                dimensionPixelSize = (i3 == -3 || !(i3 == -2 || i3 == -1)) ? 0 : i3;
            } else {
                z2 = true;
            }
        } else {
            dimensionPixelSize = a2.getDimensionPixelSize(attr, 0);
        }
        if (data instanceof ConstraintLayout.toq) {
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) data;
            if (orientation == 0) {
                ((ViewGroup.MarginLayoutParams) toqVar).width = dimensionPixelSize;
                toqVar.f48506nn86 = z2;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).height = dimensionPixelSize;
                toqVar.f48489hb = z2;
                return;
            }
        }
        if (data instanceof toq) {
            toq toqVar2 = (toq) data;
            if (orientation == 0) {
                toqVar2.f3006q = dimensionPixelSize;
                toqVar2.f49973zp = z2;
                return;
            } else {
                toqVar2.f3003n = dimensionPixelSize;
                toqVar2.f3010x = z2;
                return;
            }
        }
        if (data instanceof k.C7857k) {
            k.C7857k c7857k = (k.C7857k) data;
            if (orientation == 0) {
                c7857k.toq(23, dimensionPixelSize);
                c7857k.m1695q(80, z2);
            } else {
                c7857k.toq(21, dimensionPixelSize);
                c7857k.m1695q(81, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v0af(k c2, int type, boolean value) {
        if (type == 44) {
            c2.f2962g.f49856qrj = value;
            return;
        }
        if (type == 75) {
            c2.f2964n.f49933ch = value;
            return;
        }
        if (type != 87) {
            if (type == 80) {
                c2.f2964n.f49973zp = value;
            } else if (type != 81) {
                Log.w(f2942y, "Unknown attribute 0x");
            } else {
                c2.f2964n.f3010x = value;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1655y(C0395k.toq attributeType, String... attributeName) {
        for (int i2 = 0; i2 < attributeName.length; i2++) {
            if (this.f2946n.containsKey(attributeName[i2])) {
                C0395k c0395k = this.f2946n.get(attributeName[i2]);
                if (c0395k != null && c0395k.m1641p() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + c0395k.m1641p().name());
                }
            } else {
                this.f2946n.put(attributeName[i2], new C0395k(attributeName[i2], attributeType));
            }
        }
    }

    private k y9n(Context context, AttributeSet attrs, boolean override) {
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? C0394g.qrj.j9nl : C0394g.qrj.ie);
        fnq8(context, kVar, typedArrayObtainStyledAttributes, override);
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    public void a9(int viewId) {
        this.f49813f7l8.remove(Integer.valueOf(viewId));
    }

    public HashMap<String, C0395k> a98o() {
        return this.f2946n;
    }

    public void b3e(int viewId, int anchor, int value) {
        k kVarM1646b = m1646b(viewId);
        switch (anchor) {
            case 1:
                kVarM1646b.f2964n.f49943gvn7 = value;
                return;
            case 2:
                kVarM1646b.f2964n.f49935d3 = value;
                return;
            case 3:
                kVarM1646b.f2964n.f49962oc = value;
                return;
            case 4:
                kVarM1646b.f2964n.f49938eqxt = value;
                return;
            case 5:
                kVarM1646b.f2964n.f3007r = value;
                return;
            case 6:
                kVarM1646b.f2964n.f49953lvui = value;
                return;
            case 7:
                kVarM1646b.f2964n.f49934d2ok = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void bek6(int id, int... referenced) {
        m1646b(id).f2964n.f49946i1 = referenced;
    }

    public boolean bf2(int viewId) {
        return m1646b(viewId).f2962g.f49856qrj;
    }

    public int bo(int viewId) {
        return m1646b(viewId).f2964n.f3006q;
    }

    public void bwp(int guidelineID, int margin) {
        m1646b(guidelineID).f2964n.f2996g = margin;
        m1646b(guidelineID).f2964n.f49939f7l8 = -1;
        m1646b(guidelineID).f2964n.f3011y = -1.0f;
    }

    public void bz2(int viewId, int chainStyle) {
        m1646b(viewId).f2964n.f49966uv6 = chainStyle;
    }

    /* JADX INFO: renamed from: c */
    public void m1656c(int viewId, float percent) {
        m1646b(viewId).f2964n.f49937ek5k = percent;
    }

    public void c8jq(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    k kVarY9n = y9n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        kVarY9n.f2964n.f3000k = true;
                    }
                    this.f49813f7l8.put(Integer.valueOf(kVarY9n.f2963k), kVarY9n);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void cdj(C0397q cs) {
        for (k kVar : cs.f49813f7l8.values()) {
            if (kVar.f2966y != null) {
                if (kVar.f49833toq != null) {
                    Iterator<Integer> it = this.f49813f7l8.keySet().iterator();
                    while (it.hasNext()) {
                        k kVarI1 = i1(it.next().intValue());
                        String str = kVarI1.f2964n.f2991a;
                        if (str != null && kVar.f49833toq.matches(str)) {
                            kVar.f2966y.m1694n(kVarI1);
                            kVarI1.f49832f7l8.putAll((HashMap) kVar.f49832f7l8.clone());
                        }
                    }
                } else {
                    kVar.f2966y.m1694n(i1(kVar.f2963k));
                }
            }
        }
    }

    public void cfr(int viewId, int position) {
        m1646b(viewId).f2964n.f49941fti = position;
    }

    public void cv06(int viewId, float rotation) {
        m1646b(viewId).f2962g.f49857toq = rotation;
    }

    public void d2ok(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.f49813f7l8.containsKey(Integer.valueOf(startID))) {
            this.f49813f7l8.put(Integer.valueOf(startID), new k());
        }
        k kVar = this.f49813f7l8.get(Integer.valueOf(startID));
        if (kVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    toq toqVar = kVar.f2964n;
                    toqVar.f3005p = endID;
                    toqVar.f49951ld6 = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("Left to " + lh(endSide) + " undefined");
                    }
                    toq toqVar2 = kVar.f2964n;
                    toqVar2.f49951ld6 = endID;
                    toqVar2.f3005p = -1;
                }
                kVar.f2964n.f49943gvn7 = margin;
                return;
            case 2:
                if (endSide == 1) {
                    toq toqVar3 = kVar.f2964n;
                    toqVar3.f49969x2 = endID;
                    toqVar3.f49963qrj = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                    }
                    toq toqVar4 = kVar.f2964n;
                    toqVar4.f49963qrj = endID;
                    toqVar4.f49969x2 = -1;
                }
                kVar.f2964n.f49935d3 = margin;
                return;
            case 3:
                if (endSide == 3) {
                    toq toqVar5 = kVar.f2964n;
                    toqVar5.f49956n7h = endID;
                    toqVar5.f49950kja0 = -1;
                    toqVar5.f49949ki = -1;
                    toqVar5.f49964t8r = -1;
                    toqVar5.f2998i = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                    }
                    toq toqVar6 = kVar.f2964n;
                    toqVar6.f49950kja0 = endID;
                    toqVar6.f49956n7h = -1;
                    toqVar6.f49949ki = -1;
                    toqVar6.f49964t8r = -1;
                    toqVar6.f2998i = -1;
                }
                kVar.f2964n.f49962oc = margin;
                return;
            case 4:
                if (endSide == 4) {
                    toq toqVar7 = kVar.f2964n;
                    toqVar7.f49932cdj = endID;
                    toqVar7.f2997h = -1;
                    toqVar7.f49949ki = -1;
                    toqVar7.f49964t8r = -1;
                    toqVar7.f2998i = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                    }
                    toq toqVar8 = kVar.f2964n;
                    toqVar8.f2997h = endID;
                    toqVar8.f49932cdj = -1;
                    toqVar8.f49949ki = -1;
                    toqVar8.f49964t8r = -1;
                    toqVar8.f2998i = -1;
                }
                kVar.f2964n.f49938eqxt = margin;
                return;
            case 5:
                if (endSide == 5) {
                    toq toqVar9 = kVar.f2964n;
                    toqVar9.f49949ki = endID;
                    toqVar9.f49932cdj = -1;
                    toqVar9.f2997h = -1;
                    toqVar9.f49956n7h = -1;
                    toqVar9.f49950kja0 = -1;
                    return;
                }
                if (endSide == 3) {
                    toq toqVar10 = kVar.f2964n;
                    toqVar10.f49964t8r = endID;
                    toqVar10.f49932cdj = -1;
                    toqVar10.f2997h = -1;
                    toqVar10.f49956n7h = -1;
                    toqVar10.f49950kja0 = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
                toq toqVar11 = kVar.f2964n;
                toqVar11.f2998i = endID;
                toqVar11.f49932cdj = -1;
                toqVar11.f2997h = -1;
                toqVar11.f49956n7h = -1;
                toqVar11.f49950kja0 = -1;
                return;
            case 6:
                if (endSide == 6) {
                    toq toqVar12 = kVar.f2964n;
                    toqVar12.f49974zurt = endID;
                    toqVar12.f49940fn3e = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                    }
                    toq toqVar13 = kVar.f2964n;
                    toqVar13.f49940fn3e = endID;
                    toqVar13.f49974zurt = -1;
                }
                kVar.f2964n.f49953lvui = margin;
                return;
            case 7:
                if (endSide == 7) {
                    toq toqVar14 = kVar.f2964n;
                    toqVar14.f49942fu4 = endID;
                    toqVar14.f49958ni7 = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                    }
                    toq toqVar15 = kVar.f2964n;
                    toqVar15.f49958ni7 = endID;
                    toqVar15.f49942fu4 = -1;
                }
                kVar.f2964n.f49934d2ok = margin;
                return;
            default:
                throw new IllegalArgumentException(lh(startSide) + " to " + lh(endSide) + " unknown");
        }
    }

    public void d3(C0397q set) {
        this.f49813f7l8.clear();
        for (Integer num : set.f49813f7l8.keySet()) {
            k kVar = set.f49813f7l8.get(num);
            if (kVar != null) {
                this.f49813f7l8.put(num, kVar.clone());
            }
        }
    }

    public void d8wk(String attributeName) {
        this.f2946n.remove(attributeName);
    }

    public void dd(int viewId, int width) {
        m1646b(viewId).f2964n.f2994e = width;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28241do(int viewId, float translationX, float translationY) {
        n nVar = m1646b(viewId).f2962g;
        nVar.f2981p = translationX;
        nVar.f49854ld6 = translationY;
    }

    public void ebn(int viewId, float translationY) {
        m1646b(viewId).f2962g.f49854ld6 = translationY;
    }

    public void ek5k(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            m1646b(chainIds[0]).f2964n.f2993c = weights[0];
        }
        m1646b(chainIds[0]).f2964n.f49967vyq = style;
        d2ok(chainIds[0], 3, topId, topSide, 0);
        for (int i2 = 1; i2 < chainIds.length; i2++) {
            int i3 = i2 - 1;
            d2ok(chainIds[i2], 3, chainIds[i3], 4, 0);
            d2ok(chainIds[i3], 4, chainIds[i2], 3, 0);
            if (weights != null) {
                m1646b(chainIds[i2]).f2964n.f2993c = weights[i2];
            }
        }
        d2ok(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
    }

    public void eqxt(int startID, int startSide, int endID, int endSide) {
        if (!this.f49813f7l8.containsKey(Integer.valueOf(startID))) {
            this.f49813f7l8.put(Integer.valueOf(startID), new k());
        }
        k kVar = this.f49813f7l8.get(Integer.valueOf(startID));
        if (kVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    toq toqVar = kVar.f2964n;
                    toqVar.f3005p = endID;
                    toqVar.f49951ld6 = -1;
                    return;
                } else if (endSide == 2) {
                    toq toqVar2 = kVar.f2964n;
                    toqVar2.f49951ld6 = endID;
                    toqVar2.f3005p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + lh(endSide) + " undefined");
                }
            case 2:
                if (endSide == 1) {
                    toq toqVar3 = kVar.f2964n;
                    toqVar3.f49969x2 = endID;
                    toqVar3.f49963qrj = -1;
                    return;
                } else if (endSide == 2) {
                    toq toqVar4 = kVar.f2964n;
                    toqVar4.f49963qrj = endID;
                    toqVar4.f49969x2 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
            case 3:
                if (endSide == 3) {
                    toq toqVar5 = kVar.f2964n;
                    toqVar5.f49956n7h = endID;
                    toqVar5.f49950kja0 = -1;
                    toqVar5.f49949ki = -1;
                    toqVar5.f49964t8r = -1;
                    toqVar5.f2998i = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
                toq toqVar6 = kVar.f2964n;
                toqVar6.f49950kja0 = endID;
                toqVar6.f49956n7h = -1;
                toqVar6.f49949ki = -1;
                toqVar6.f49964t8r = -1;
                toqVar6.f2998i = -1;
                return;
            case 4:
                if (endSide == 4) {
                    toq toqVar7 = kVar.f2964n;
                    toqVar7.f49932cdj = endID;
                    toqVar7.f2997h = -1;
                    toqVar7.f49949ki = -1;
                    toqVar7.f49964t8r = -1;
                    toqVar7.f2998i = -1;
                    return;
                }
                if (endSide != 3) {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
                toq toqVar8 = kVar.f2964n;
                toqVar8.f2997h = endID;
                toqVar8.f49932cdj = -1;
                toqVar8.f49949ki = -1;
                toqVar8.f49964t8r = -1;
                toqVar8.f2998i = -1;
                return;
            case 5:
                if (endSide == 5) {
                    toq toqVar9 = kVar.f2964n;
                    toqVar9.f49949ki = endID;
                    toqVar9.f49932cdj = -1;
                    toqVar9.f2997h = -1;
                    toqVar9.f49956n7h = -1;
                    toqVar9.f49950kja0 = -1;
                    return;
                }
                if (endSide == 3) {
                    toq toqVar10 = kVar.f2964n;
                    toqVar10.f49964t8r = endID;
                    toqVar10.f49932cdj = -1;
                    toqVar10.f2997h = -1;
                    toqVar10.f49956n7h = -1;
                    toqVar10.f49950kja0 = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
                toq toqVar11 = kVar.f2964n;
                toqVar11.f2998i = endID;
                toqVar11.f49932cdj = -1;
                toqVar11.f2997h = -1;
                toqVar11.f49956n7h = -1;
                toqVar11.f49950kja0 = -1;
                return;
            case 6:
                if (endSide == 6) {
                    toq toqVar12 = kVar.f2964n;
                    toqVar12.f49974zurt = endID;
                    toqVar12.f49940fn3e = -1;
                    return;
                } else if (endSide == 7) {
                    toq toqVar13 = kVar.f2964n;
                    toqVar13.f49940fn3e = endID;
                    toqVar13.f49974zurt = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
            case 7:
                if (endSide == 7) {
                    toq toqVar14 = kVar.f2964n;
                    toqVar14.f49942fu4 = endID;
                    toqVar14.f49958ni7 = -1;
                    return;
                } else if (endSide == 6) {
                    toq toqVar15 = kVar.f2964n;
                    toqVar15.f49958ni7 = endID;
                    toqVar15.f49942fu4 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + lh(endSide) + " undefined");
                }
            default:
                throw new IllegalArgumentException(lh(startSide) + " to " + lh(endSide) + " unknown");
        }
    }

    public void etdu(int viewId, String ratio) {
        m1646b(viewId).f2964n.f49968wvg = ratio;
    }

    /* JADX INFO: renamed from: f */
    public void m1657f(int viewId, float percent) {
        m1646b(viewId).f2964n.f49972yz = percent;
    }

    public void fn3e(int id, ConstraintLayout.toq layoutParams) {
        k kVar;
        if (!this.f49813f7l8.containsKey(Integer.valueOf(id)) || (kVar = this.f49813f7l8.get(Integer.valueOf(id))) == null) {
            return;
        }
        kVar.m1690s(layoutParams);
    }

    public void fti(int viewId, int anchor) {
        k kVar;
        if (!this.f49813f7l8.containsKey(Integer.valueOf(viewId)) || (kVar = this.f49813f7l8.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                toq toqVar = kVar.f2964n;
                toqVar.f49951ld6 = -1;
                toqVar.f3005p = -1;
                toqVar.f49943gvn7 = -1;
                toqVar.f49936dd = Integer.MIN_VALUE;
                return;
            case 2:
                toq toqVar2 = kVar.f2964n;
                toqVar2.f49963qrj = -1;
                toqVar2.f49969x2 = -1;
                toqVar2.f49935d3 = -1;
                toqVar2.f49957ncyb = Integer.MIN_VALUE;
                return;
            case 3:
                toq toqVar3 = kVar.f2964n;
                toqVar3.f49950kja0 = -1;
                toqVar3.f49956n7h = -1;
                toqVar3.f49962oc = 0;
                toqVar3.f49970x9kr = Integer.MIN_VALUE;
                return;
            case 4:
                toq toqVar4 = kVar.f2964n;
                toqVar4.f2997h = -1;
                toqVar4.f49932cdj = -1;
                toqVar4.f49938eqxt = 0;
                toqVar4.f3001l = Integer.MIN_VALUE;
                return;
            case 5:
                toq toqVar5 = kVar.f2964n;
                toqVar5.f49949ki = -1;
                toqVar5.f49964t8r = -1;
                toqVar5.f2998i = -1;
                toqVar5.f3007r = 0;
                toqVar5.f2995f = Integer.MIN_VALUE;
                return;
            case 6:
                toq toqVar6 = kVar.f2964n;
                toqVar6.f49940fn3e = -1;
                toqVar6.f49974zurt = -1;
                toqVar6.f49953lvui = 0;
                toqVar6.f49945hyr = Integer.MIN_VALUE;
                return;
            case 7:
                toq toqVar7 = kVar.f2964n;
                toqVar7.f49958ni7 = -1;
                toqVar7.f49942fu4 = -1;
                toqVar7.f49934d2ok = 0;
                toqVar7.f49955n5r1 = Integer.MIN_VALUE;
                return;
            case 8:
                toq toqVar8 = kVar.f2964n;
                toqVar8.f49947jk = -1.0f;
                toqVar8.f49954mcp = -1;
                toqVar8.f3009t = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void fu4(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            d2ok(centerID, 1, firstID, firstSide, firstMargin);
            d2ok(centerID, 2, secondId, secondSide, secondMargin);
            k kVar = this.f49813f7l8.get(Integer.valueOf(centerID));
            if (kVar != null) {
                kVar.f2964n.f3012z = bias;
                return;
            }
            return;
        }
        if (firstSide == 6 || firstSide == 7) {
            d2ok(centerID, 6, firstID, firstSide, firstMargin);
            d2ok(centerID, 7, secondId, secondSide, secondMargin);
            k kVar2 = this.f49813f7l8.get(Integer.valueOf(centerID));
            if (kVar2 != null) {
                kVar2.f2964n.f3012z = bias;
                return;
            }
            return;
        }
        d2ok(centerID, 3, firstID, firstSide, firstMargin);
        d2ok(centerID, 4, secondId, secondSide, secondMargin);
        k kVar3 = this.f49813f7l8.get(Integer.valueOf(centerID));
        if (kVar3 != null) {
            kVar3.f2964n.f49961o1t = bias;
        }
    }

    public void g1(int viewId) {
        k kVar;
        if (!this.f49813f7l8.containsKey(Integer.valueOf(viewId)) || (kVar = this.f49813f7l8.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        toq toqVar = kVar.f2964n;
        int i2 = toqVar.f49951ld6;
        int i3 = toqVar.f49969x2;
        if (i2 != -1 || i3 != -1) {
            if (i2 == -1 || i3 == -1) {
                int i4 = toqVar.f49963qrj;
                if (i4 != -1) {
                    d2ok(i2, 2, i4, 2, 0);
                } else {
                    int i5 = toqVar.f3005p;
                    if (i5 != -1) {
                        d2ok(i3, 1, i5, 1, 0);
                    }
                }
            } else {
                d2ok(i2, 2, i3, 1, 0);
                d2ok(i3, 1, i2, 2, 0);
            }
            fti(viewId, 1);
            fti(viewId, 2);
            return;
        }
        int i6 = toqVar.f49940fn3e;
        int i7 = toqVar.f49958ni7;
        if (i6 != -1 || i7 != -1) {
            if (i6 != -1 && i7 != -1) {
                d2ok(i6, 7, i7, 6, 0);
                d2ok(i7, 6, i2, 7, 0);
            } else if (i7 != -1) {
                int i8 = toqVar.f49963qrj;
                if (i8 != -1) {
                    d2ok(i2, 7, i8, 7, 0);
                } else {
                    int i9 = toqVar.f3005p;
                    if (i9 != -1) {
                        d2ok(i7, 6, i9, 6, 0);
                    }
                }
            }
        }
        fti(viewId, 6);
        fti(viewId, 7);
    }

    public void gbni(int viewId, float alpha) {
        m1646b(viewId).f49834zy.f2987q = alpha;
    }

    public void gc3c(int guidelineID, float ratio) {
        m1646b(guidelineID).f2964n.f3011y = ratio;
        m1646b(guidelineID).f2964n.f49939f7l8 = -1;
        m1646b(guidelineID).f2964n.f2996g = -1;
    }

    public void gvn7(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f49813f7l8.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2944g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                this.f49813f7l8.put(Integer.valueOf(id), new k());
            }
            k kVar = this.f49813f7l8.get(Integer.valueOf(id));
            if (kVar != null) {
                kVar.f49832f7l8 = C0395k.m1635q(this.f2946n, childAt);
                kVar.ld6(id, toqVar);
                kVar.f49834zy.f49860toq = childAt.getVisibility();
                kVar.f49834zy.f2987q = childAt.getAlpha();
                kVar.f2962g.f49857toq = childAt.getRotation();
                kVar.f2962g.f49859zy = childAt.getRotationX();
                kVar.f2962g.f2982q = childAt.getRotationY();
                kVar.f2962g.f2980n = childAt.getScaleX();
                kVar.f2962g.f2978g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    n nVar = kVar.f2962g;
                    nVar.f49853f7l8 = pivotX;
                    nVar.f2984y = pivotY;
                }
                kVar.f2962g.f2981p = childAt.getTranslationX();
                kVar.f2962g.f49854ld6 = childAt.getTranslationY();
                kVar.f2962g.f49858x2 = childAt.getTranslationZ();
                n nVar2 = kVar.f2962g;
                if (nVar2.f49856qrj) {
                    nVar2.f49855n7h = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    kVar.f2964n.f49933ch = barrier.getAllowsGoneWidget();
                    kVar.f2964n.f49946i1 = barrier.getReferencedIds();
                    kVar.f2964n.f49971y9n = barrier.getType();
                    kVar.f2964n.f2992b = barrier.getMargin();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gyi(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0397q.gyi(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX INFO: renamed from: h */
    public void m1658h(ConstraintLayout constraintLayout) {
        k kVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                Log.w(f2942y, "id unknown " + androidx.constraintlayout.motion.widget.zy.ld6(childAt));
            } else {
                if (this.f2944g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f49813f7l8.containsKey(Integer.valueOf(id)) && (kVar = this.f49813f7l8.get(Integer.valueOf(id))) != null) {
                    C0395k.ki(childAt, kVar.f49832f7l8);
                }
            }
        }
    }

    public void h4b(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new f7l8(writer, layout, flags).m1676s();
        } else {
            new g(writer, layout, flags).f7l8();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void h7am(int viewId, float rotationX) {
        m1646b(viewId).f2962g.f49859zy = rotationX;
    }

    public void hb(int id, int direction, int margin, int... referenced) {
        toq toqVar = m1646b(id).f2964n;
        toqVar.f49931bf2 = 1;
        toqVar.f49971y9n = direction;
        toqVar.f2992b = margin;
        toqVar.f3000k = false;
        toqVar.f49946i1 = referenced;
    }

    public void hyr(int viewId, int width) {
        m1646b(viewId).f2964n.f3004o = width;
    }

    /* JADX INFO: renamed from: i */
    void m1659i(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f49813f7l8.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                Log.w(f2942y, "id unknown " + androidx.constraintlayout.motion.widget.zy.ld6(childAt));
            } else {
                if (this.f2944g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        k kVar = this.f49813f7l8.get(Integer.valueOf(id));
                        if (kVar != null) {
                            if (childAt instanceof Barrier) {
                                kVar.f2964n.f49931bf2 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(kVar.f2964n.f49971y9n);
                                barrier.setMargin(kVar.f2964n.f2992b);
                                barrier.setAllowsGoneWidget(kVar.f2964n.f49933ch);
                                toq toqVar = kVar.f2964n;
                                int[] iArr = toqVar.f49946i1;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = toqVar.f49930a98o;
                                    if (str != null) {
                                        toqVar.f49946i1 = m1648e(barrier, str);
                                        barrier.setReferencedIds(kVar.f2964n.f49946i1);
                                    }
                                }
                            }
                            ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) childAt.getLayoutParams();
                            toqVar2.m1625n();
                            kVar.m1690s(toqVar2);
                            if (applyPostLayout) {
                                C0395k.ki(childAt, kVar.f49832f7l8);
                            }
                            childAt.setLayoutParams(toqVar2);
                            q qVar = kVar.f49834zy;
                            if (qVar.f49861zy == 0) {
                                childAt.setVisibility(qVar.f49860toq);
                            }
                            childAt.setAlpha(kVar.f49834zy.f2987q);
                            childAt.setRotation(kVar.f2962g.f49857toq);
                            childAt.setRotationX(kVar.f2962g.f49859zy);
                            childAt.setRotationY(kVar.f2962g.f2982q);
                            childAt.setScaleX(kVar.f2962g.f2980n);
                            childAt.setScaleY(kVar.f2962g.f2978g);
                            n nVar = kVar.f2962g;
                            if (nVar.f2983s != -1) {
                                if (((View) childAt.getParent()).findViewById(kVar.f2962g.f2983s) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f49853f7l8)) {
                                    childAt.setPivotX(kVar.f2962g.f49853f7l8);
                                }
                                if (!Float.isNaN(kVar.f2962g.f2984y)) {
                                    childAt.setPivotY(kVar.f2962g.f2984y);
                                }
                            }
                            childAt.setTranslationX(kVar.f2962g.f2981p);
                            childAt.setTranslationY(kVar.f2962g.f49854ld6);
                            childAt.setTranslationZ(kVar.f2962g.f49858x2);
                            n nVar2 = kVar.f2962g;
                            if (nVar2.f49856qrj) {
                                childAt.setElevation(nVar2.f49855n7h);
                            }
                        }
                    } else {
                        Log.v(f2942y, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            k kVar2 = this.f49813f7l8.get(num);
            if (kVar2 != null) {
                if (kVar2.f2964n.f49931bf2 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    toq toqVar3 = kVar2.f2964n;
                    int[] iArr2 = toqVar3.f49946i1;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = toqVar3.f49930a98o;
                        if (str2 != null) {
                            toqVar3.f49946i1 = m1648e(barrier2, str2);
                            barrier2.setReferencedIds(kVar2.f2964n.f49946i1);
                        }
                    }
                    barrier2.setType(kVar2.f2964n.f49971y9n);
                    barrier2.setMargin(kVar2.f2964n.f2992b);
                    ConstraintLayout.toq toqVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.d3();
                    kVar2.m1690s(toqVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, toqVarGenerateDefaultLayoutParams);
                }
                if (kVar2.f2964n.f3000k) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.toq toqVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    kVar2.m1690s(toqVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, toqVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).ki(constraintLayout);
            }
        }
    }

    public k i1(int id) {
        if (this.f49813f7l8.containsKey(Integer.valueOf(id))) {
            return this.f49813f7l8.get(Integer.valueOf(id));
        }
        return null;
    }

    public void i9jn(int viewId, String attributeName, int value) {
        m1646b(viewId).m1685h(attributeName, value);
    }

    public void ij(boolean validate) {
        this.f2945k = validate;
    }

    public void ixz(int viewId, float transformPivotY) {
        m1646b(viewId).f2962g.f2984y = transformPivotY;
    }

    /* JADX INFO: renamed from: j */
    public void m1660j(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        m1652o(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void jbh(int viewId, float scaleY) {
        m1646b(viewId).f2962g.f2978g = scaleY;
    }

    public void jk(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        d2ok(centerID, 3, topId, topSide, topMargin);
        d2ok(centerID, 4, bottomId, bottomSide, bottomMargin);
        k kVar = this.f49813f7l8.get(Integer.valueOf(centerID));
        if (kVar != null) {
            kVar.f2964n.f49961o1t = bias;
        }
    }

    public void jp0y(Context context, int constraintLayoutId) {
        gvn7((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void jz5(int viewId, String attributeName, int value) {
        m1646b(viewId).ki(attributeName, value);
    }

    public void kcsr(int viewId, int anchor, int value) {
        k kVarM1646b = m1646b(viewId);
        switch (anchor) {
            case 1:
                kVarM1646b.f2964n.f49936dd = value;
                return;
            case 2:
                kVarM1646b.f2964n.f49957ncyb = value;
                return;
            case 3:
                kVarM1646b.f2964n.f49970x9kr = value;
                return;
            case 4:
                kVarM1646b.f2964n.f3001l = value;
                return;
            case 5:
                kVarM1646b.f2964n.f2995f = value;
                return;
            case 6:
                kVarM1646b.f2964n.f49945hyr = value;
                return;
            case 7:
                kVarM1646b.f2964n.f49955n5r1 = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void ki(ConstraintLayout constraintLayout) {
        m1659i(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void kja0(int viewId, int topId, int bottomId) {
        d2ok(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        d2ok(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            d2ok(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            d2ok(bottomId, 3, viewId, 4, 0);
        }
    }

    public void ktq(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        m1646b(viewId).f2964n.f49959nmn5 = behavior;
    }

    /* JADX INFO: renamed from: l */
    public void m1661l(int viewId, int width) {
        m1646b(viewId).f2964n.f49944hb = width;
    }

    public void ld6(String... attributeName) {
        m1655y(C0395k.toq.INT_TYPE, attributeName);
    }

    public void lrht(int viewId, int width) {
        m1646b(viewId).f2964n.f3006q = width;
    }

    public int[] lv5(int id) {
        int[] iArr = m1646b(id).f2964n.f49946i1;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void lvui(int viewId, int id, int radius, float angle) {
        toq toqVar = m1646b(viewId).f2964n;
        toqVar.f3009t = id;
        toqVar.f49954mcp = radius;
        toqVar.f49947jk = angle;
    }

    /* JADX INFO: renamed from: m */
    public void m1662m(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        m1652o(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    public void mbx(int viewId, float scaleX) {
        m1646b(viewId).f2962g.f2980n = scaleX;
    }

    public void mcp(int viewId, int toView) {
        if (toView == 0) {
            fu4(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            fu4(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void mu(k set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2942y, " Unable to parse " + strArrSplit[i2]);
            } else {
                set.cdj(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void n2t(int viewId, float weight) {
        m1646b(viewId).f2964n.f2993c = weight;
    }

    public void n5r1(int viewId, int height) {
        m1646b(viewId).f2964n.f3002m = height;
    }

    public void n7h(int viewId, int leftId, int rightId) {
        d2ok(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        d2ok(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            d2ok(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            d2ok(rightId, 6, viewId, 7, 0);
        }
    }

    public void ncyb(int viewId, int height) {
        m1646b(viewId).f2964n.f2999j = height;
    }

    public void ngy(int viewId, int visibilityMode) {
        m1646b(viewId).f49834zy.f49861zy = visibilityMode;
    }

    public k nmn5(int mId) {
        return m1646b(mId);
    }

    public void nn86(int guidelineID, int orientation) {
        toq toqVar = m1646b(guidelineID).f2964n;
        toqVar.f3000k = true;
        toqVar.f49948jp0y = orientation;
    }

    public void nsb(int viewId, float bias) {
        m1646b(viewId).f2964n.f49961o1t = bias;
    }

    public void o1t(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        d2ok(centerID, 1, leftId, leftSide, leftMargin);
        d2ok(centerID, 2, rightId, rightSide, rightMargin);
        k kVar = this.f49813f7l8.get(Integer.valueOf(centerID));
        if (kVar != null) {
            kVar.f2964n.f3012z = bias;
        }
    }

    public void oc(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f49813f7l8.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraints.getChildAt(i2);
            Constraints.C0392k c0392k = (Constraints.C0392k) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2944g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                this.f49813f7l8.put(Integer.valueOf(id), new k());
            }
            k kVar = this.f49813f7l8.get(Integer.valueOf(id));
            if (kVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    kVar.qrj((ConstraintHelper) childAt, id, c0392k);
                }
                kVar.x2(id, c0392k);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1663p(String... attributeName) {
        m1655y(C0395k.toq.FLOAT_TYPE, attributeName);
    }

    public void pc(int viewId, float translationZ) {
        m1646b(viewId).f2962g.f49858x2 = translationZ;
    }

    public void pjz9(int viewId, int visibility) {
        m1646b(viewId).f49834zy.f49860toq = visibility;
    }

    public void py(int id, int type) {
        m1646b(id).f2964n.f49931bf2 = type;
    }

    public void qkj8(k set, String attributes) {
        String[] strArrBap7 = bap7(attributes);
        for (int i2 = 0; i2 < strArrBap7.length; i2++) {
            String[] strArrSplit = strArrBap7[i2].split("=");
            Log.w(f2942y, " Unable to parse " + strArrBap7[i2]);
            set.t8r(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void qrj(int viewId, int leftId, int rightId) {
        d2ok(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        d2ok(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            d2ok(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            d2ok(rightId, 1, viewId, 2, 0);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1664r(int viewId, int height) {
        m1646b(viewId).f2964n.f49960nn86 = height;
    }

    /* JADX INFO: renamed from: s */
    public void m1665s(String... attributeName) {
        m1655y(C0395k.toq.COLOR_TYPE, attributeName);
    }

    public void se(int guidelineID, int margin) {
        m1646b(guidelineID).f2964n.f49939f7l8 = margin;
        m1646b(guidelineID).f2964n.f2996g = -1;
        m1646b(guidelineID).f2964n.f3011y = -1.0f;
    }

    public void sok(int viewId, int position) {
        m1646b(viewId).f2964n.f49929a9 = position;
    }

    /* JADX INFO: renamed from: t */
    public void m1666t(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        d2ok(centerID, 6, startId, startSide, startMargin);
        d2ok(centerID, 7, endId, endSide, endMargin);
        k kVar = this.f49813f7l8.get(Integer.valueOf(centerID));
        if (kVar != null) {
            kVar.f2964n.f3012z = bias;
        }
    }

    public int t8iq(int viewId) {
        return m1646b(viewId).f49834zy.f49860toq;
    }

    public void t8r(ConstraintHelper helper, C0341n child, ConstraintLayout.toq layoutParams, SparseArray<C0341n> mapIdToWidget) {
        k kVar;
        int id = helper.getId();
        if (this.f49813f7l8.containsKey(Integer.valueOf(id)) && (kVar = this.f49813f7l8.get(Integer.valueOf(id))) != null && (child instanceof C0342p)) {
            helper.o1t(kVar, (C0342p) child, layoutParams, mapIdToWidget);
        }
    }

    public void tfm(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2944g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f49813f7l8.containsKey(Integer.valueOf(id))) {
                this.f49813f7l8.put(Integer.valueOf(id), new k());
            }
            k kVar = this.f49813f7l8.get(Integer.valueOf(id));
            if (kVar != null) {
                if (!kVar.f2964n.f49965toq) {
                    kVar.ld6(id, toqVar);
                    if (childAt instanceof ConstraintHelper) {
                        kVar.f2964n.f49946i1 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            kVar.f2964n.f49933ch = barrier.getAllowsGoneWidget();
                            kVar.f2964n.f49971y9n = barrier.getType();
                            kVar.f2964n.f2992b = barrier.getMargin();
                        }
                    }
                    kVar.f2964n.f49965toq = true;
                }
                q qVar = kVar.f49834zy;
                if (!qVar.f2985k) {
                    qVar.f49860toq = childAt.getVisibility();
                    kVar.f49834zy.f2987q = childAt.getAlpha();
                    kVar.f49834zy.f2985k = true;
                }
                n nVar = kVar.f2962g;
                if (!nVar.f2979k) {
                    nVar.f2979k = true;
                    nVar.f49857toq = childAt.getRotation();
                    kVar.f2962g.f49859zy = childAt.getRotationX();
                    kVar.f2962g.f2982q = childAt.getRotationY();
                    kVar.f2962g.f2980n = childAt.getScaleX();
                    kVar.f2962g.f2978g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        n nVar2 = kVar.f2962g;
                        nVar2.f49853f7l8 = pivotX;
                        nVar2.f2984y = pivotY;
                    }
                    kVar.f2962g.f2981p = childAt.getTranslationX();
                    kVar.f2962g.f49854ld6 = childAt.getTranslationY();
                    kVar.f2962g.f49858x2 = childAt.getTranslationZ();
                    n nVar3 = kVar.f2962g;
                    if (nVar3.f49856qrj) {
                        nVar3.f49855n7h = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public int m1667u(int viewId) {
        return m1646b(viewId).f49834zy.f49861zy;
    }

    public void uc(int viewId, float transformPivotX, float transformPivotY) {
        n nVar = m1646b(viewId).f2962g;
        nVar.f2984y = transformPivotY;
        nVar.f49853f7l8 = transformPivotX;
    }

    public void uj2j(int viewId, float weight) {
        m1646b(viewId).f2964n.f49952lrht = weight;
    }

    public void ukdy(int viewId, float translationX) {
        m1646b(viewId).f2962g.f2981p = translationX;
    }

    public void uv6(int viewId, boolean constrained) {
        m1646b(viewId).f2964n.f3010x = constrained;
    }

    public void vep5(int viewId, float rotationY) {
        m1646b(viewId).f2962g.f2982q = rotationY;
    }

    public void vq(k set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2942y, " Unable to parse " + strArrSplit[i2]);
            } else {
                set.cdj(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void vyq(int viewId, boolean constrained) {
        m1646b(viewId).f2964n.f49973zp = constrained;
    }

    public void w831(int viewId, float elevation) {
        m1646b(viewId).f2962g.f49855n7h = elevation;
        m1646b(viewId).f2962g.f49856qrj = true;
    }

    public void was(int viewId) {
        if (this.f49813f7l8.containsKey(Integer.valueOf(viewId))) {
            k kVar = this.f49813f7l8.get(Integer.valueOf(viewId));
            if (kVar == null) {
                return;
            }
            toq toqVar = kVar.f2964n;
            int i2 = toqVar.f49950kja0;
            int i3 = toqVar.f2997h;
            if (i2 != -1 || i3 != -1) {
                if (i2 == -1 || i3 == -1) {
                    int i4 = toqVar.f49932cdj;
                    if (i4 != -1) {
                        d2ok(i2, 4, i4, 4, 0);
                    } else {
                        int i5 = toqVar.f49956n7h;
                        if (i5 != -1) {
                            d2ok(i3, 3, i5, 3, 0);
                        }
                    }
                } else {
                    d2ok(i2, 4, i3, 3, 0);
                    d2ok(i3, 3, i2, 4, 0);
                }
            }
        }
        fti(viewId, 3);
        fti(viewId, 4);
    }

    public void wo(C0397q set) {
        for (Integer num : set.f49813f7l8.keySet()) {
            int iIntValue = num.intValue();
            k kVar = set.f49813f7l8.get(num);
            if (!this.f49813f7l8.containsKey(Integer.valueOf(iIntValue))) {
                this.f49813f7l8.put(Integer.valueOf(iIntValue), new k());
            }
            k kVar2 = this.f49813f7l8.get(Integer.valueOf(iIntValue));
            if (kVar2 != null) {
                toq toqVar = kVar2.f2964n;
                if (!toqVar.f49965toq) {
                    toqVar.m1698k(kVar.f2964n);
                }
                q qVar = kVar2.f49834zy;
                if (!qVar.f2985k) {
                    qVar.m1697k(kVar.f49834zy);
                }
                n nVar = kVar2.f2962g;
                if (!nVar.f2979k) {
                    nVar.m1696k(kVar.f2962g);
                }
                zy zyVar = kVar2.f2965q;
                if (!zyVar.f3018k) {
                    zyVar.m1699k(kVar.f2965q);
                }
                for (String str : kVar.f49832f7l8.keySet()) {
                    if (!kVar2.f49832f7l8.containsKey(str)) {
                        kVar2.f49832f7l8.put(str, kVar.f49832f7l8.get(str));
                    }
                }
            }
        }
    }

    public void wvg(int viewId, int toView) {
        if (toView == 0) {
            fu4(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            fu4(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void wx16(int viewId, float transformPivotX) {
        m1646b(viewId).f2962g.f49853f7l8 = transformPivotX;
    }

    /* JADX INFO: renamed from: x */
    public int[] m1668x() {
        Integer[] numArr = (Integer[]) this.f49813f7l8.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public void x2(String... attributeName) {
        m1655y(C0395k.toq.STRING_TYPE, attributeName);
    }

    public void x9kr(int viewId, int height) {
        m1646b(viewId).f2964n.f3003n = height;
    }

    public void xwq3(k set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f2942y, " Unable to parse " + strArrSplit[i2]);
            } else {
                set.m1685h(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public boolean y2() {
        return this.f2944g;
    }

    public void yl(int viewId, String attributeName, String value) {
        m1646b(viewId).t8r(attributeName, value);
    }

    public void yqrt(boolean forceId) {
        this.f2944g = forceId;
    }

    public void yz(t8r scene, int... ids) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f49813f7l8.keySet();
        if (ids.length != 0) {
            hashSet = new HashSet();
            for (int i2 : ids) {
                hashSet.add(Integer.valueOf(i2));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            k kVar = this.f49813f7l8.get(num);
            if (kVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                kVar.f2964n.toq(scene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    /* JADX INFO: renamed from: z */
    public void m1669z(int viewId, int toView) {
        if (toView == 0) {
            fu4(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            fu4(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void z4(int viewId, String attributeName, float value) {
        m1646b(viewId).cdj(attributeName, value);
    }

    public void zkd(int viewId, float bias) {
        m1646b(viewId).f2964n.f3012z = bias;
    }

    public int zp(int viewId) {
        return m1646b(viewId).f2964n.f3003n;
    }

    public void zsr0(int viewId, boolean apply) {
        m1646b(viewId).f2962g.f49856qrj = apply;
    }

    public void zurt(ConstraintLayout constraintLayout) {
        m1659i(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void zwy(int viewId, int chainStyle) {
        m1646b(viewId).f2964n.f49967vyq = chainStyle;
    }
}
