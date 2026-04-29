package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.utils.C0281n;
import androidx.constraintlayout.core.motion.utils.kja0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: MotionKeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends toq {

    /* JADX INFO: renamed from: a */
    public static final int f1459a = 309;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final int f47123a98o = 308;

    /* JADX INFO: renamed from: b */
    public static final int f1460b = 305;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f47124bf2 = 306;

    /* JADX INFO: renamed from: c */
    public static final String f1461c = "postLayout";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final int f47125ch = 312;

    /* JADX INFO: renamed from: e */
    public static final String f1462e = "triggerID";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f47126ek5k = 302;

    /* JADX INFO: renamed from: f */
    public static final String f1463f = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f47127hb = "negativeCross";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f47128hyr = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f47129i1 = 307;

    /* JADX INFO: renamed from: j */
    public static final String f1464j = "triggerReceiver";

    /* JADX INFO: renamed from: l */
    private static final String f1465l = "KeyTrigger";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f47130lrht = "triggerSlack";

    /* JADX INFO: renamed from: m */
    public static final int f1466m = 301;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f47131n5r1 = "viewTransitionOnCross";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final int f47132nmn5 = 5;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f47133nn86 = "positiveCross";

    /* JADX INFO: renamed from: o */
    public static final String f1467o = "CROSS";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f47134uv6 = "triggerCollisionView";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f47135vyq = "triggerCollisionId";

    /* JADX INFO: renamed from: x */
    public static final int f1468x = 311;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f47136y9n = 304;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f47137yz = 303;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final int f47138zp = 310;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f47139a9;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private boolean f47140d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f47141d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    int f47142dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f47143eqxt;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    float f47144fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f47145gvn7;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f47146jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f47147jp0y;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    int f47148lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private String f47149mcp;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    C0281n f47150ncyb;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f47152oc;

    /* JADX INFO: renamed from: r */
    int f1469r;

    /* JADX INFO: renamed from: t */
    private String f1470t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f47153wvg;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    C0281n f47154x9kr;

    /* JADX INFO: renamed from: z */
    private int f1471z = -1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private String f47151o1t = null;

    public f7l8() {
        int i2 = toq.f47224qrj;
        this.f47153wvg = i2;
        this.f1470t = null;
        this.f47149mcp = null;
        this.f47146jk = i2;
        this.f47139a9 = i2;
        this.f47144fti = 0.1f;
        this.f47147jp0y = true;
        this.f47145gvn7 = true;
        this.f47141d3 = true;
        this.f47152oc = Float.NaN;
        this.f47140d2ok = false;
        this.f47148lvui = i2;
        this.f1469r = i2;
        this.f47142dd = i2;
        this.f47154x9kr = new C0281n();
        this.f47150ncyb = new C0281n();
        this.f47227ld6 = 5;
        this.f47228x2 = new HashMap<>();
    }

    private void fu4(String str, C0265g c0265g) {
        boolean z2 = str.length() == 1;
        if (!z2) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f47228x2.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z2 || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.toq toqVar = this.f47228x2.get(str2);
                if (toqVar != null) {
                    toqVar.m977k(c0265g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: f7l8 */
    public toq clone() {
        return new f7l8().mo952y(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: g */
    public void mo950g(HashMap<String, kja0> map) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        str.hashCode();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 == 309) {
            this.f47149mcp = str;
            return true;
        }
        if (i2 == 310) {
            this.f1470t = str;
            return true;
        }
        if (i2 != 312) {
            return super.mo935n(i2, str);
        }
        this.f47151o1t = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public f7l8 mo952y(toq toqVar) {
        super.mo952y(toqVar);
        f7l8 f7l8Var = (f7l8) toqVar;
        this.f1471z = f7l8Var.f1471z;
        this.f47151o1t = f7l8Var.f47151o1t;
        this.f47153wvg = f7l8Var.f47153wvg;
        this.f1470t = f7l8Var.f1470t;
        this.f47149mcp = f7l8Var.f47149mcp;
        this.f47146jk = f7l8Var.f47146jk;
        this.f47139a9 = f7l8Var.f47139a9;
        this.f47144fti = f7l8Var.f47144fti;
        this.f47147jp0y = f7l8Var.f47147jp0y;
        this.f47145gvn7 = f7l8Var.f47145gvn7;
        this.f47141d3 = f7l8Var.f47141d3;
        this.f47152oc = f7l8Var.f47152oc;
        this.f47143eqxt = f7l8Var.f47143eqxt;
        this.f47140d2ok = f7l8Var.f47140d2ok;
        this.f47154x9kr = f7l8Var.f47154x9kr;
        this.f47150ncyb = f7l8Var.f47150ncyb;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: q */
    public boolean mo937q(int i2, boolean z2) {
        if (i2 != 304) {
            return super.mo937q(i2, z2);
        }
        this.f47140d2ok = z2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: s */
    public void mo951s(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        if (i2 == 307) {
            this.f47139a9 = i3;
            return true;
        }
        if (i2 == 308) {
            this.f47146jk = fn3e(Integer.valueOf(i3));
            return true;
        }
        if (i2 == 311) {
            this.f47153wvg = i3;
            return true;
        }
        switch (i2) {
            case 301:
                this.f47142dd = i3;
                return true;
            case 302:
                this.f1469r = i3;
                return true;
            case 303:
                this.f47148lvui = i3;
                return true;
            default:
                return super.toq(i2, i3);
        }
    }

    public void zurt(float f2, C0265g c0265g) {
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        if (i2 != 305) {
            return super.zy(i2, f2);
        }
        this.f47144fti = f2;
        return true;
    }
}
