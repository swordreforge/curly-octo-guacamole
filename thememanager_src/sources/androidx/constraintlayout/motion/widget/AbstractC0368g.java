package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.AbstractC0352q;
import androidx.constraintlayout.widget.C0395k;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.g */
/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0368g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f48066cdj = "wavePeriod";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f48067f7l8 = "alpha";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f48068fn3e = "translationX";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f48069fu4 = "progress";

    /* JADX INFO: renamed from: g */
    public static int f2232g = -1;

    /* JADX INFO: renamed from: h */
    public static final String f2233h = "scaleY";

    /* JADX INFO: renamed from: i */
    public static final String f2234i = "waveVariesBy";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f48070ki = "waveOffset";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f48071kja0 = "scaleX";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f48072ld6 = "rotationY";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f48073mcp = "visibility";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f48074n7h = "transitionPathRotate";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f48075ni7 = "translationZ";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f48076o1t = "curveFit";

    /* JADX INFO: renamed from: p */
    public static final String f2235p = "rotationX";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f48077qrj = "transformPivotY";

    /* JADX INFO: renamed from: s */
    public static final String f2236s = "rotation";

    /* JADX INFO: renamed from: t */
    public static final String f2237t = "transitionEasing";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f48078t8r = "wavePhase";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f48079wvg = "motionProgress";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f48080x2 = "transformPivotX";

    /* JADX INFO: renamed from: y */
    public static final String f2238y = "elevation";

    /* JADX INFO: renamed from: z */
    public static final String f2239z = "CUSTOM";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f48081zurt = "translationY";

    /* JADX INFO: renamed from: k */
    int f2240k;

    /* JADX INFO: renamed from: n */
    HashMap<String, C0395k> f2241n;

    /* JADX INFO: renamed from: q */
    protected int f2242q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f48082toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    String f48083zy;

    public AbstractC0368g() {
        int i2 = f2232g;
        this.f2240k = i2;
        this.f48082toq = i2;
        this.f48083zy = null;
    }

    boolean f7l8(String constraintTag) {
        String str = this.f48083zy;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    /* JADX INFO: renamed from: g */
    abstract void mo1431g(Context context, AttributeSet attrs);

    /* JADX INFO: renamed from: k */
    public abstract void mo1432k(HashMap<String, AbstractC0352q> splines);

    public AbstractC0368g ld6(int id) {
        this.f48082toq = id;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public int m1444n() {
        return this.f2240k;
    }

    int n7h(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1433p(String tag, Object value);

    /* JADX INFO: renamed from: q */
    abstract void mo1434q(HashSet<String> attributes);

    float qrj(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    /* JADX INFO: renamed from: s */
    public void mo1435s(HashMap<String, Integer> interpolation) {
    }

    @Override // 
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0368g clone();

    boolean x2(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    /* JADX INFO: renamed from: y */
    public void m1445y(int pos) {
        this.f2240k = pos;
    }

    public AbstractC0368g zy(AbstractC0368g src) {
        this.f2240k = src.f2240k;
        this.f48082toq = src.f48082toq;
        this.f48083zy = src.f48083zy;
        this.f2242q = src.f2242q;
        this.f2241n = src.f2241n;
        return this;
    }
}
