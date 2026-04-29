package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: MotionKey.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq implements zurt {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f47217cdj = "rotationX";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f47218fn3e = "translationX";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f47219fu4 = "visibility";

    /* JADX INFO: renamed from: h */
    public static final String f1496h = "rotationZ";

    /* JADX INFO: renamed from: i */
    public static final String f1497i = "scaleY";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f47220ki = "transitionPathRotate";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f47221kja0 = "elevation";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f47222n7h = "alpha";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f47223ni7 = "CUSTOM";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static int f47224qrj = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f47225t8r = "scaleX";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f47226zurt = "translationY";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public int f47227ld6;

    /* JADX INFO: renamed from: p */
    String f1498p;

    /* JADX INFO: renamed from: s */
    int f1499s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.core.motion.toq> f47228x2;

    /* JADX INFO: renamed from: y */
    public int f1500y;

    public toq() {
        int i2 = f47224qrj;
        this.f1500y = i2;
        this.f1499s = i2;
        this.f1498p = null;
    }

    public void cdj(HashMap<String, Integer> map) {
    }

    @Override // 
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public abstract toq clone();

    int fn3e(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo950g(HashMap<String, kja0> map);

    /* JADX INFO: renamed from: h */
    public void m956h(int i2) {
        this.f1500y = i2;
    }

    /* JADX INFO: renamed from: i */
    float m957i(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public toq ki(int i2) {
        this.f1499s = i2;
        return this;
    }

    public void kja0(String str, int i2, boolean z2) {
        this.f47228x2.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, z2));
    }

    boolean ld6(String str) {
        String str2 = this.f1498p;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 != 101) {
            return false;
        }
        this.f1498p = str;
        return true;
    }

    public void n7h(String str, int i2, String str2) {
        this.f47228x2.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, str2));
    }

    /* JADX INFO: renamed from: p */
    public int m958p() {
        return this.f1500y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: q */
    public boolean mo937q(int i2, boolean z2) {
        return false;
    }

    public void qrj(String str, int i2, int i3) {
        this.f47228x2.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, i3));
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo951s(HashSet<String> hashSet);

    boolean t8r(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        if (i2 != 100) {
            return false;
        }
        this.f1500y = i3;
        return true;
    }

    public void x2(String str, int i2, float f2) {
        this.f47228x2.put(str, new androidx.constraintlayout.core.motion.toq(str, i2, f2));
    }

    /* JADX INFO: renamed from: y */
    public toq mo952y(toq toqVar) {
        this.f1500y = toqVar.f1500y;
        this.f1499s = toqVar.f1499s;
        this.f1498p = toqVar.f1498p;
        this.f47227ld6 = toqVar.f47227ld6;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        return false;
    }
}
