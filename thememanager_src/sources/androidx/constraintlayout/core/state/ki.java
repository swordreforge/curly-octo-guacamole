package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.C0266k;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.core.parser.C0299g;
import androidx.constraintlayout.core.parser.C0301n;
import androidx.constraintlayout.core.parser.C0303q;
import androidx.constraintlayout.core.parser.C0305y;
import androidx.constraintlayout.core.state.cdj;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import com.android.thememanager.util.hb;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: WidgetFrame.java */
/* JADX INFO: loaded from: classes.dex */
public class ki {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final boolean f47663fn3e = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static float f47664zurt = Float.NaN;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public float f47665cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public float f47666f7l8;

    /* JADX INFO: renamed from: g */
    public float f1924g;

    /* JADX INFO: renamed from: h */
    public float f1925h;

    /* JADX INFO: renamed from: i */
    public String f1926i;

    /* JADX INFO: renamed from: k */
    public C0341n f1927k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public int f47667ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public float f47668kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public float f47669ld6;

    /* JADX INFO: renamed from: n */
    public int f1928n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public float f47670n7h;

    /* JADX INFO: renamed from: p */
    public float f1929p;

    /* JADX INFO: renamed from: q */
    public int f1930q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public float f47671qrj;

    /* JADX INFO: renamed from: s */
    public float f1931s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.core.motion.toq> f47672t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f47673toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public float f47674x2;

    /* JADX INFO: renamed from: y */
    public float f1932y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f47675zy;

    public ki() {
        this.f1927k = null;
        this.f47673toq = 0;
        this.f47675zy = 0;
        this.f1930q = 0;
        this.f1928n = 0;
        this.f1924g = Float.NaN;
        this.f47666f7l8 = Float.NaN;
        this.f1932y = Float.NaN;
        this.f1931s = Float.NaN;
        this.f1929p = Float.NaN;
        this.f47669ld6 = Float.NaN;
        this.f47674x2 = Float.NaN;
        this.f47671qrj = Float.NaN;
        this.f47670n7h = Float.NaN;
        this.f47668kja0 = Float.NaN;
        this.f1925h = Float.NaN;
        this.f47665cdj = Float.NaN;
        this.f47667ki = 0;
        this.f47672t8r = new HashMap<>();
        this.f1926i = null;
    }

    private void fn3e(StringBuilder sb, C0343q.toq toqVar) {
        C0343q c0343qKi = this.f1927k.ki(toqVar);
        if (c0343qKi == null || c0343qKi.f2068g == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(toqVar.name());
        sb.append(": ['");
        String str = c0343qKi.f2068g.m1341s().f47894kja0;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(c0343qKi.f2068g.x2().name());
        sb.append("', '");
        sb.append(c0343qKi.f47953f7l8);
        sb.append("'],\n");
    }

    /* JADX INFO: renamed from: k */
    private static void m1214k(StringBuilder sb, String str, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void n7h(int i2, int i3, ki kiVar, ki kiVar2, ki kiVar3, cdj cdjVar, float f2) {
        int i4;
        float f3;
        int i5;
        float f4;
        float f5;
        int i6;
        float f6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f7 = 100.0f * f2;
        int i11 = (int) f7;
        int i12 = kiVar2.f47673toq;
        int i13 = kiVar2.f47675zy;
        int i14 = kiVar3.f47673toq;
        int i15 = kiVar3.f47675zy;
        int i16 = kiVar2.f1930q - i12;
        int i17 = kiVar2.f1928n - i13;
        int i18 = kiVar3.f1930q - i14;
        int i19 = kiVar3.f1928n - i15;
        float f8 = kiVar2.f1925h;
        float f9 = kiVar3.f1925h;
        if (kiVar2.f47667ki == 8) {
            i12 = (int) (i12 - (i18 / 2.0f));
            i13 = (int) (i13 - (i19 / 2.0f));
            if (Float.isNaN(f8)) {
                i5 = i19;
                i4 = i18;
                f3 = 0.0f;
            } else {
                f3 = f8;
                i4 = i18;
                i5 = i19;
            }
        } else {
            i4 = i16;
            f3 = f8;
            i5 = i17;
        }
        if (kiVar3.f47667ki == 8) {
            i14 = (int) (i14 - (i4 / 2.0f));
            i15 = (int) (i15 - (i5 / 2.0f));
            i18 = i4;
            i19 = i5;
            if (Float.isNaN(f9)) {
                f9 = 0.0f;
            }
        }
        if (Float.isNaN(f3) && !Float.isNaN(f9)) {
            f3 = 1.0f;
        }
        if (!Float.isNaN(f3) && Float.isNaN(f9)) {
            f9 = 1.0f;
        }
        if (kiVar2.f47667ki == 4) {
            f5 = f9;
            f4 = 0.0f;
        } else {
            f4 = f3;
            f5 = f9;
        }
        float f10 = kiVar3.f47667ki == 4 ? 0.0f : f5;
        if (kiVar.f1927k == null || !cdjVar.m1165r()) {
            i6 = i12;
            f6 = f2;
        } else {
            cdj.C0308k c0308kFu4 = cdjVar.fu4(kiVar.f1927k.f47894kja0, i11);
            i6 = i12;
            cdj.C0308k c0308kNi7 = cdjVar.ni7(kiVar.f1927k.f47894kja0, i11);
            if (c0308kFu4 == c0308kNi7) {
                c0308kNi7 = null;
            }
            if (c0308kFu4 != null) {
                i6 = (int) (c0308kFu4.f1885q * i2);
                i8 = i3;
                i13 = (int) (c0308kFu4.f1884n * i8);
                i9 = c0308kFu4.f1883k;
                i7 = i2;
            } else {
                i7 = i2;
                i8 = i3;
                i9 = 0;
            }
            if (c0308kNi7 != null) {
                i14 = (int) (c0308kNi7.f1885q * i7);
                i15 = (int) (c0308kNi7.f1884n * i8);
                i10 = c0308kNi7.f1883k;
            } else {
                i10 = 100;
            }
            f6 = (f7 - i9) / (i10 - i9);
        }
        kiVar.f1927k = kiVar2.f1927k;
        int i20 = (int) (i6 + ((i14 - r9) * f6));
        kiVar.f47673toq = i20;
        int i21 = (int) (i13 + (f6 * (i15 - i13)));
        kiVar.f47675zy = i21;
        float f11 = 1.0f - f2;
        kiVar.f1930q = i20 + ((int) ((i4 * f11) + (i18 * f2)));
        kiVar.f1928n = i21 + ((int) ((f11 * i5) + (i19 * f2)));
        kiVar.f1924g = qrj(kiVar2.f1924g, kiVar3.f1924g, 0.5f, f2);
        kiVar.f47666f7l8 = qrj(kiVar2.f47666f7l8, kiVar3.f47666f7l8, 0.5f, f2);
        kiVar.f1932y = qrj(kiVar2.f1932y, kiVar3.f1932y, 0.0f, f2);
        kiVar.f1931s = qrj(kiVar2.f1931s, kiVar3.f1931s, 0.0f, f2);
        kiVar.f1929p = qrj(kiVar2.f1929p, kiVar3.f1929p, 0.0f, f2);
        kiVar.f47670n7h = qrj(kiVar2.f47670n7h, kiVar3.f47670n7h, 1.0f, f2);
        kiVar.f47668kja0 = qrj(kiVar2.f47668kja0, kiVar3.f47668kja0, 1.0f, f2);
        kiVar.f47669ld6 = qrj(kiVar2.f47669ld6, kiVar3.f47669ld6, 0.0f, f2);
        kiVar.f47674x2 = qrj(kiVar2.f47674x2, kiVar3.f47674x2, 0.0f, f2);
        kiVar.f47671qrj = qrj(kiVar2.f47671qrj, kiVar3.f47671qrj, 0.0f, f2);
        kiVar.f1925h = qrj(f4, f10, 1.0f, f2);
        Set<String> setKeySet = kiVar3.f47672t8r.keySet();
        kiVar.f47672t8r.clear();
        for (String str : setKeySet) {
            if (kiVar2.f47672t8r.containsKey(str)) {
                androidx.constraintlayout.core.motion.toq toqVar = kiVar2.f47672t8r.get(str);
                androidx.constraintlayout.core.motion.toq toqVar2 = kiVar3.f47672t8r.get(str);
                androidx.constraintlayout.core.motion.toq toqVar3 = new androidx.constraintlayout.core.motion.toq(toqVar);
                kiVar.f47672t8r.put(str, toqVar3);
                if (toqVar.ki() == 1) {
                    toqVar3.m983z(Float.valueOf(qrj(toqVar.n7h(), toqVar2.n7h(), 0.0f, f2)));
                } else {
                    int iKi = toqVar.ki();
                    float[] fArr = new float[iKi];
                    float[] fArr2 = new float[iKi];
                    toqVar.kja0(fArr);
                    toqVar2.kja0(fArr2);
                    for (int i22 = 0; i22 < iKi; i22++) {
                        fArr[i22] = qrj(fArr[i22], fArr2[i22], 0.0f, f2);
                        toqVar3.o1t(fArr);
                    }
                }
            }
        }
    }

    private static float qrj(float f2, float f3, float f4, float f5) {
        boolean zIsNaN = Float.isNaN(f2);
        boolean zIsNaN2 = Float.isNaN(f3);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f2 = f4;
        }
        if (zIsNaN2) {
            f3 = f4;
        }
        return f2 + (f5 * (f3 - f2));
    }

    private static void toq(StringBuilder sb, String str, int i2) {
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(",\n");
    }

    public int a9() {
        return Math.max(0, this.f1930q - this.f47673toq);
    }

    void cdj(androidx.constraintlayout.core.parser.zy zyVar) throws C0305y {
        C0299g c0299g = (C0299g) zyVar;
        int size = c0299g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0303q c0303q = (C0303q) c0299g.ni7(i2);
            c0303q.toq();
            androidx.constraintlayout.core.parser.zy zyVarVyq = c0303q.vyq();
            String qVar = zyVarVyq.toq();
            if (qVar.matches("#[0-9a-fA-F]+")) {
                ni7(c0303q.toq(), zurt.toq.f47470x2, Integer.parseInt(qVar.substring(1), 16));
            } else if (zyVarVyq instanceof C0301n) {
                zurt(c0303q.toq(), zurt.toq.f47466ld6, zyVarVyq.f7l8());
            } else {
                fu4(c0303q.toq(), zurt.toq.f47468qrj, qVar);
            }
        }
    }

    public androidx.constraintlayout.core.motion.toq f7l8(String str) {
        return this.f47672t8r.get(str);
    }

    public void fu4(String str, int i2, String str2) {
        if (this.f47672t8r.containsKey(str)) {
            this.f47672t8r.get(str).fu4(str2);
        } else {
            this.f47672t8r.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, str2));
        }
    }

    /* JADX INFO: renamed from: g */
    public float m1215g() {
        return this.f47675zy + ((this.f1928n - r0) / 2.0f);
    }

    /* JADX INFO: renamed from: h */
    void m1216h(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f1927k != null) {
            str2 = str3 + "/" + (this.f1927k.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    /* JADX INFO: renamed from: i */
    public StringBuilder m1217i(StringBuilder sb, boolean z2) {
        sb.append("{\n");
        toq(sb, "left", this.f47673toq);
        toq(sb, "top", this.f47675zy);
        toq(sb, "right", this.f1930q);
        toq(sb, hb.f61266fu4, this.f1928n);
        m1214k(sb, "pivotX", this.f1924g);
        m1214k(sb, "pivotY", this.f47666f7l8);
        m1214k(sb, "rotationX", this.f1932y);
        m1214k(sb, "rotationY", this.f1931s);
        m1214k(sb, "rotationZ", this.f1929p);
        m1214k(sb, "translationX", this.f47669ld6);
        m1214k(sb, "translationY", this.f47674x2);
        m1214k(sb, "translationZ", this.f47671qrj);
        m1214k(sb, "scaleX", this.f47670n7h);
        m1214k(sb, "scaleY", this.f47668kja0);
        m1214k(sb, "alpha", this.f1925h);
        toq(sb, "visibility", this.f47667ki);
        m1214k(sb, "interpolatedPos", this.f47665cdj);
        if (this.f1927k != null) {
            for (C0343q.toq toqVar : C0343q.toq.values()) {
                fn3e(sb, toqVar);
            }
        }
        if (z2) {
            m1214k(sb, "phone_orientation", f47664zurt);
        }
        if (z2) {
            m1214k(sb, "phone_orientation", f47664zurt);
        }
        if (this.f47672t8r.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f47672t8r.keySet()) {
                androidx.constraintlayout.core.motion.toq toqVar2 = this.f47672t8r.get(str);
                sb.append(str);
                sb.append(": ");
                switch (toqVar2.qrj()) {
                    case zurt.toq.f1759p /* 900 */:
                        sb.append(toqVar2.m981s());
                        sb.append(",\n");
                        break;
                    case zurt.toq.f47466ld6 /* 901 */:
                    case zurt.toq.f47465kja0 /* 905 */:
                        sb.append(toqVar2.m982y());
                        sb.append(",\n");
                        break;
                    case zurt.toq.f47470x2 /* 902 */:
                        sb.append("'");
                        sb.append(androidx.constraintlayout.core.motion.toq.zy(toqVar2.m981s()));
                        sb.append("',\n");
                        break;
                    case zurt.toq.f47468qrj /* 903 */:
                        sb.append("'");
                        sb.append(toqVar2.x2());
                        sb.append("',\n");
                        break;
                    case zurt.toq.f47467n7h /* 904 */:
                        sb.append("'");
                        sb.append(toqVar2.m975g());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void jk(ki kiVar) {
        this.f1924g = kiVar.f1924g;
        this.f47666f7l8 = kiVar.f47666f7l8;
        this.f1932y = kiVar.f1932y;
        this.f1931s = kiVar.f1931s;
        this.f1929p = kiVar.f1929p;
        this.f47669ld6 = kiVar.f47669ld6;
        this.f47674x2 = kiVar.f47674x2;
        this.f47671qrj = kiVar.f47671qrj;
        this.f47670n7h = kiVar.f47670n7h;
        this.f47668kja0 = kiVar.f47668kja0;
        this.f1925h = kiVar.f1925h;
        this.f47667ki = kiVar.f47667ki;
        this.f47672t8r.clear();
        for (androidx.constraintlayout.core.motion.toq toqVar : kiVar.f47672t8r.values()) {
            this.f47672t8r.put(toqVar.ld6(), toqVar.m980q());
        }
    }

    void ki() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        String str2 = this.f1927k != null ? str + "/" + (this.f1927k.hashCode() % 1000) + " " : str + "/NULL ";
        HashMap<String, androidx.constraintlayout.core.motion.toq> map = this.f47672t8r;
        if (map != null) {
            for (String str3 : map.keySet()) {
                System.out.println(str2 + this.f47672t8r.get(str3).toString());
            }
        }
    }

    public boolean kja0() {
        return Float.isNaN(this.f1932y) && Float.isNaN(this.f1931s) && Float.isNaN(this.f1929p) && Float.isNaN(this.f47669ld6) && Float.isNaN(this.f47674x2) && Float.isNaN(this.f47671qrj) && Float.isNaN(this.f47670n7h) && Float.isNaN(this.f47668kja0) && Float.isNaN(this.f1925h);
    }

    public String ld6() {
        C0341n c0341n = this.f1927k;
        return c0341n == null ? "unknown" : c0341n.f47894kja0;
    }

    public ki mcp(C0341n c0341n) {
        if (c0341n == null) {
            return this;
        }
        this.f1927k = c0341n;
        m1222t();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public float m1218n() {
        return this.f47673toq + ((this.f1930q - r0) / 2.0f);
    }

    public void ni7(String str, int i2, int i3) {
        if (this.f47672t8r.containsKey(str)) {
            this.f47672t8r.get(str).zurt(i3);
        } else {
            this.f47672t8r.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, i3));
        }
    }

    public void o1t(C0266k c0266k, float[] fArr) {
    }

    /* JADX INFO: renamed from: p */
    public float m1219p(String str) {
        if (this.f47672t8r.containsKey(str)) {
            return this.f47672t8r.get(str).m982y();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: q */
    public void m1220q(String str, float f2) {
        zurt(str, zurt.toq.f47466ld6, f2);
    }

    /* JADX INFO: renamed from: s */
    public int m1221s(String str) {
        if (this.f47672t8r.containsKey(str)) {
            return this.f47672t8r.get(str).f7l8();
        }
        return -21880;
    }

    /* JADX INFO: renamed from: t */
    public ki m1222t() {
        C0341n c0341n = this.f1927k;
        if (c0341n != null) {
            this.f47673toq = c0341n.d2ok();
            this.f47675zy = this.f1927k.m1323m();
            this.f1930q = this.f1927k.uv6();
            this.f1928n = this.f1927k.zurt();
            jk(this.f1927k.f47904n7h);
        }
        return this;
    }

    public StringBuilder t8r(StringBuilder sb) {
        return m1217i(sb, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean wvg(String str, androidx.constraintlayout.core.parser.zy zyVar) throws C0305y {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    b2 = 0;
                }
                break;
            case -1383228885:
                if (str.equals(hb.f61266fu4)) {
                    b2 = 1;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    b2 = 2;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 3;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 4;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b2 = 5;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b2 = 6;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b2 = 7;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 8;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b2 = 9;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b2 = 10;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    b2 = 16;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    b2 = 17;
                }
                break;
        }
        switch (b2) {
            case 0:
                f47664zurt = zyVar.f7l8();
                return true;
            case 1:
                this.f1928n = zyVar.mo1135y();
                return true;
            case 2:
                cdj(zyVar);
                return true;
            case 3:
                this.f1932y = zyVar.f7l8();
                return true;
            case 4:
                this.f1931s = zyVar.f7l8();
                return true;
            case 5:
                this.f1929p = zyVar.f7l8();
                return true;
            case 6:
                this.f47669ld6 = zyVar.f7l8();
                return true;
            case 7:
                this.f47674x2 = zyVar.f7l8();
                return true;
            case 8:
                this.f47671qrj = zyVar.f7l8();
                return true;
            case 9:
                this.f1924g = zyVar.f7l8();
                return true;
            case 10:
                this.f47666f7l8 = zyVar.f7l8();
                return true;
            case 11:
                this.f47670n7h = zyVar.f7l8();
                return true;
            case 12:
                this.f47668kja0 = zyVar.f7l8();
                return true;
            case 13:
                this.f47675zy = zyVar.mo1135y();
                return true;
            case 14:
                this.f47673toq = zyVar.mo1135y();
                return true;
            case 15:
                this.f1925h = zyVar.f7l8();
                return true;
            case 16:
                this.f1930q = zyVar.mo1135y();
                return true;
            case 17:
                this.f47665cdj = zyVar.f7l8();
                return true;
            default:
                return false;
        }
    }

    public int x2() {
        return Math.max(0, this.f1928n - this.f47675zy);
    }

    /* JADX INFO: renamed from: y */
    public Set<String> m1223y() {
        return this.f47672t8r.keySet();
    }

    /* JADX INFO: renamed from: z */
    public void m1224z(String str, int i2, boolean z2) {
        if (this.f47672t8r.containsKey(str)) {
            this.f47672t8r.get(str).m976i(z2);
        } else {
            this.f47672t8r.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, z2));
        }
    }

    public void zurt(String str, int i2, float f2) {
        if (this.f47672t8r.containsKey(str)) {
            this.f47672t8r.get(str).fn3e(f2);
        } else {
            this.f47672t8r.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, f2));
        }
    }

    public void zy(String str, int i2) {
        ni7(str, zurt.toq.f47470x2, i2);
    }

    public ki(C0341n c0341n) {
        this.f1927k = null;
        this.f47673toq = 0;
        this.f47675zy = 0;
        this.f1930q = 0;
        this.f1928n = 0;
        this.f1924g = Float.NaN;
        this.f47666f7l8 = Float.NaN;
        this.f1932y = Float.NaN;
        this.f1931s = Float.NaN;
        this.f1929p = Float.NaN;
        this.f47669ld6 = Float.NaN;
        this.f47674x2 = Float.NaN;
        this.f47671qrj = Float.NaN;
        this.f47670n7h = Float.NaN;
        this.f47668kja0 = Float.NaN;
        this.f1925h = Float.NaN;
        this.f47665cdj = Float.NaN;
        this.f47667ki = 0;
        this.f47672t8r = new HashMap<>();
        this.f1926i = null;
        this.f1927k = c0341n;
    }

    public ki(ki kiVar) {
        this.f1927k = null;
        this.f47673toq = 0;
        this.f47675zy = 0;
        this.f1930q = 0;
        this.f1928n = 0;
        this.f1924g = Float.NaN;
        this.f47666f7l8 = Float.NaN;
        this.f1932y = Float.NaN;
        this.f1931s = Float.NaN;
        this.f1929p = Float.NaN;
        this.f47669ld6 = Float.NaN;
        this.f47674x2 = Float.NaN;
        this.f47671qrj = Float.NaN;
        this.f47670n7h = Float.NaN;
        this.f47668kja0 = Float.NaN;
        this.f1925h = Float.NaN;
        this.f47665cdj = Float.NaN;
        this.f47667ki = 0;
        this.f47672t8r = new HashMap<>();
        this.f1926i = null;
        this.f1927k = kiVar.f1927k;
        this.f47673toq = kiVar.f47673toq;
        this.f47675zy = kiVar.f47675zy;
        this.f1930q = kiVar.f1930q;
        this.f1928n = kiVar.f1928n;
        jk(kiVar);
    }
}
