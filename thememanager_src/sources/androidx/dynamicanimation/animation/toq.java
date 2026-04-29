package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.C0683f;
import androidx.dynamicanimation.animation.C0791k;
import androidx.dynamicanimation.animation.toq;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import zy.uv6;
import zy.zurt;

/* JADX INFO: compiled from: DynamicAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq<T extends toq<T>> implements C0791k.toq {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final float f51045a9 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final float f51048fti = 0.75f;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final float f51050jk = 0.002f;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final float f51053mcp = 0.00390625f;

    /* JADX INFO: renamed from: t */
    public static final float f4408t = 0.1f;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final float f51059wvg = 1.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f51061f7l8;

    /* JADX INFO: renamed from: g */
    boolean f4410g;

    /* JADX INFO: renamed from: k */
    float f4411k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final ArrayList<cdj> f51062ld6;

    /* JADX INFO: renamed from: n */
    final AbstractC0793q f4412n;

    /* JADX INFO: renamed from: p */
    private float f4413p;

    /* JADX INFO: renamed from: q */
    final Object f4414q;

    /* JADX INFO: renamed from: s */
    private long f4415s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    float f51063toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final ArrayList<ki> f51064x2;

    /* JADX INFO: renamed from: y */
    float f4416y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    boolean f51065zy;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final t8r f51057qrj = new f7l8("translationX");

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final t8r f51054n7h = new C0801y("translationY");

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final t8r f51052kja0 = new C0800s("translationZ");

    /* JADX INFO: renamed from: h */
    public static final t8r f4406h = new C0798p("scaleX");

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final t8r f51046cdj = new ld6("scaleY");

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final t8r f51051ki = new x2("rotation");

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final t8r f51058t8r = new qrj("rotationX");

    /* JADX INFO: renamed from: i */
    public static final t8r f4407i = new n7h("rotationY");

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final t8r f51047fn3e = new kja0(AnimatedProperty.PROPERTY_NAME_X);

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final t8r f51060zurt = new C0796k(AnimatedProperty.PROPERTY_NAME_Y);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final t8r f51055ni7 = new C7877toq("z");

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final t8r f51049fu4 = new zy("alpha");

    /* JADX INFO: renamed from: z */
    public static final t8r f4409z = new C0799q("scrollX");

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final t8r f51056o1t = new C0797n("scrollY");

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface cdj {
        /* JADX INFO: renamed from: k */
        void m3820k(toq toqVar, boolean z2, float f2, float f3);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class f7l8 extends t8r {
        f7l8(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setTranslationX(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getTranslationX();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$g */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C0794g extends AbstractC0793q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C0792n f51066toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0794g(String str, C0792n c0792n) {
            super(str);
            this.f51066toq = c0792n;
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        public float toq(Object obj) {
            return this.f51066toq.m3811k();
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        public void zy(Object obj, float f2) {
            this.f51066toq.toq(f2);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$h */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0795h {

        /* JADX INFO: renamed from: k */
        float f4417k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f51068toq;

        C0795h() {
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$k */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0796k extends t8r {
        C0796k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setY(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface ki {
        /* JADX INFO: renamed from: k */
        void m3825k(toq toqVar, float f2, float f3);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class kja0 extends t8r {
        kja0(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setX(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getX();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class ld6 extends t8r {
        ld6(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScaleY(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScaleY();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$n */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0797n extends t8r {
        C0797n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScrollY((int) f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScrollY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class n7h extends t8r {
        n7h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotationY(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotationY();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$p */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0798p extends t8r {
        C0798p(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScaleX(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScaleX();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$q */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0799q extends t8r {
        C0799q(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScrollX((int) f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScrollX();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class qrj extends t8r {
        qrj(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotationX(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotationX();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$s */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0800s extends t8r {
        C0800s(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            C0683f.wt(view, f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return C0683f.m3176v(view);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static abstract class t8r extends AbstractC0793q<View> {
        /* synthetic */ t8r(String str, f7l8 f7l8Var) {
            this(str);
        }

        private t8r(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C7877toq extends t8r {
        C7877toq(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            C0683f.tww7(view, f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return C0683f.qkj8(view);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class x2 extends t8r {
        x2(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotation(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotation();
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.toq$y */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C0801y extends t8r {
        C0801y(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setTranslationY(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class zy extends t8r {
        zy(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setAlpha(f2);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getAlpha();
        }
    }

    toq(C0792n c0792n) {
        this.f4411k = 0.0f;
        this.f51063toq = Float.MAX_VALUE;
        this.f51065zy = false;
        this.f4410g = false;
        this.f51061f7l8 = Float.MAX_VALUE;
        this.f4416y = -Float.MAX_VALUE;
        this.f4415s = 0L;
        this.f51062ld6 = new ArrayList<>();
        this.f51064x2 = new ArrayList<>();
        this.f4414q = null;
        this.f4412n = new C0794g("FloatValueHolder", c0792n);
        this.f4413p = 1.0f;
    }

    private float f7l8() {
        return this.f4412n.toq(this.f4414q);
    }

    private void ni7() {
        if (this.f4410g) {
            return;
        }
        this.f4410g = true;
        if (!this.f51065zy) {
            this.f51063toq = f7l8();
        }
        float f2 = this.f51063toq;
        if (f2 > this.f51061f7l8 || f2 < this.f4416y) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C0791k.m3803n().m3806k(this, 0L);
    }

    /* JADX INFO: renamed from: q */
    private void m3813q(boolean z2) {
        this.f4410g = false;
        C0791k.m3803n().m3808y(this);
        this.f4415s = 0L;
        this.f51065zy = false;
        for (int i2 = 0; i2 < this.f51062ld6.size(); i2++) {
            if (this.f51062ld6.get(i2) != null) {
                this.f51062ld6.get(i2).m3820k(this, z2, this.f51063toq, this.f4411k);
            }
        }
        qrj(this.f51062ld6);
    }

    private static <T> void qrj(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private static <T> void x2(ArrayList<T> arrayList, T t2) {
        int iIndexOf = arrayList.indexOf(t2);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public T cdj(@zurt(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f4413p = f2;
        fn3e(f2 * 0.75f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.C0791k.toq
    @uv6({uv6.EnumC7844k.LIBRARY})
    public boolean doAnimationFrame(long j2) {
        long j3 = this.f4415s;
        if (j3 == 0) {
            this.f4415s = j2;
            ki(this.f51063toq);
            return false;
        }
        this.f4415s = j2;
        boolean zFu4 = fu4(j2 - j3);
        float fMin = Math.min(this.f51063toq, this.f51061f7l8);
        this.f51063toq = fMin;
        float fMax = Math.max(fMin, this.f4416y);
        this.f51063toq = fMax;
        ki(fMax);
        if (zFu4) {
            m3813q(false);
        }
        return zFu4;
    }

    abstract void fn3e(float f2);

    abstract boolean fu4(long j2);

    /* JADX INFO: renamed from: g */
    public float m3814g() {
        return this.f4413p;
    }

    /* JADX INFO: renamed from: h */
    public T mo3815h(float f2) {
        this.f4416y = f2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public T mo3816i(float f2) {
        this.f4411k = f2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public T m3817k(cdj cdjVar) {
        if (!this.f51062ld6.contains(cdjVar)) {
            this.f51062ld6.add(cdjVar);
        }
        return this;
    }

    void ki(float f2) {
        this.f4412n.zy(this.f4414q, f2);
        for (int i2 = 0; i2 < this.f51064x2.size(); i2++) {
            if (this.f51064x2.get(i2) != null) {
                this.f51064x2.get(i2).m3825k(this, this.f51063toq, this.f4411k);
            }
        }
        qrj(this.f51064x2);
    }

    public T kja0(float f2) {
        this.f51061f7l8 = f2;
        return this;
    }

    public void ld6(cdj cdjVar) {
        x2(this.f51062ld6, cdjVar);
    }

    /* JADX INFO: renamed from: n */
    abstract float mo3800n(float f2, float f3);

    public void n7h(ki kiVar) {
        x2(this.f51064x2, kiVar);
    }

    /* JADX INFO: renamed from: p */
    public boolean m3818p() {
        return this.f4410g;
    }

    /* JADX INFO: renamed from: s */
    abstract boolean mo3801s(float f2, float f3);

    public T t8r(float f2) {
        this.f51063toq = f2;
        this.f51065zy = true;
        return this;
    }

    public T toq(ki kiVar) {
        if (m3818p()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f51064x2.contains(kiVar)) {
            this.f51064x2.add(kiVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    float m3819y() {
        return this.f4413p * 0.75f;
    }

    public void zurt() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4410g) {
            return;
        }
        ni7();
    }

    public void zy() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f4410g) {
            m3813q(true);
        }
    }

    <K> toq(K k2, AbstractC0793q<K> abstractC0793q) {
        this.f4411k = 0.0f;
        this.f51063toq = Float.MAX_VALUE;
        this.f51065zy = false;
        this.f4410g = false;
        this.f51061f7l8 = Float.MAX_VALUE;
        this.f4416y = -Float.MAX_VALUE;
        this.f4415s = 0L;
        this.f51062ld6 = new ArrayList<>();
        this.f51064x2 = new ArrayList<>();
        this.f4414q = k2;
        this.f4412n = abstractC0793q;
        if (abstractC0793q != f51051ki && abstractC0793q != f51058t8r && abstractC0793q != f4407i) {
            if (abstractC0793q == f51049fu4) {
                this.f4413p = 0.00390625f;
                return;
            } else if (abstractC0793q != f4406h && abstractC0793q != f51046cdj) {
                this.f4413p = 1.0f;
                return;
            } else {
                this.f4413p = 0.00390625f;
                return;
            }
        }
        this.f4413p = 0.1f;
    }
}
