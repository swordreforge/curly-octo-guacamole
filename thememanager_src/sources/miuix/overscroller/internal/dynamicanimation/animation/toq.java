package miuix.overscroller.internal.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import miuix.overscroller.internal.dynamicanimation.animation.C7215k;
import miuix.overscroller.internal.dynamicanimation.animation.toq;

/* JADX INFO: compiled from: DynamicAnimation.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq<T extends toq<T>> implements C7215k.toq {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final float f87894a9 = 0.002f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final float f87897fti = Float.MAX_VALUE;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final float f87899jk = 0.00390625f;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final float f87900jp0y = 0.75f;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final float f87903mcp = 0.1f;

    /* JADX INFO: renamed from: t */
    public static final float f40735t = 1.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f87910f7l8;

    /* JADX INFO: renamed from: g */
    boolean f40737g;

    /* JADX INFO: renamed from: k */
    float f40738k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final ArrayList<cdj> f87911ld6;

    /* JADX INFO: renamed from: n */
    final AbstractC7217q f40739n;

    /* JADX INFO: renamed from: p */
    private float f40740p;

    /* JADX INFO: renamed from: q */
    final Object f40741q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f87912qrj;

    /* JADX INFO: renamed from: s */
    private long f40742s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    float f87913toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final ArrayList<ki> f87914x2;

    /* JADX INFO: renamed from: y */
    float f40743y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    boolean f87915zy;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final t8r f87904n7h = new f7l8("translationX");

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final t8r f87902kja0 = new C7225y("translationY");

    /* JADX INFO: renamed from: h */
    public static final t8r f40733h = new C7224s("translationZ");

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final t8r f87895cdj = new C7222p("scaleX");

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final t8r f87901ki = new ld6("scaleY");

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final t8r f87907t8r = new x2("rotation");

    /* JADX INFO: renamed from: i */
    public static final t8r f40734i = new qrj("rotationX");

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final t8r f87896fn3e = new n7h("rotationY");

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final t8r f87909zurt = new kja0(AnimatedProperty.PROPERTY_NAME_X);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final t8r f87905ni7 = new C7220k(AnimatedProperty.PROPERTY_NAME_Y);

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final t8r f87898fu4 = new C8105toq("z");

    /* JADX INFO: renamed from: z */
    public static final t8r f40736z = new zy("alpha");

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final t8r f87906o1t = new C7223q("scrollX");

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final t8r f87908wvg = new C7221n("scrollY");

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface cdj {
        /* JADX INFO: renamed from: k */
        void m26203k(toq toqVar, boolean z2, float f2, float f3);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class f7l8 extends t8r {
        f7l8(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setTranslationX(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getTranslationX();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$g */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7218g extends AbstractC7217q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C7216n f87916toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7218g(String str, C7216n c7216n) {
            super(str);
            this.f87916toq = c7216n;
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        public float toq(Object obj) {
            return this.f87916toq.m26194k();
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        public void zy(Object obj, float f2) {
            this.f87916toq.toq(f2);
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$h */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    static class C7219h {

        /* JADX INFO: renamed from: k */
        float f40744k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f87918toq;

        C7219h() {
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$k */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7220k extends t8r {
        C7220k(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setY(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface ki {
        /* JADX INFO: renamed from: k */
        void mo26208k(toq toqVar, float f2, float f3);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class kja0 extends t8r {
        kja0(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setX(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getX();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class ld6 extends t8r {
        ld6(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScaleY(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScaleY();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$n */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7221n extends t8r {
        C7221n(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScrollY((int) f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScrollY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class n7h extends t8r {
        n7h(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotationY(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotationY();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$p */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7222p extends t8r {
        C7222p(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScaleX(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScaleX();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$q */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7223q extends t8r {
        C7223q(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setScrollX((int) f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getScrollX();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class qrj extends t8r {
        qrj(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotationX(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotationX();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$s */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7224s extends t8r {
        C7224s(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setTranslationZ(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getTranslationZ();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static abstract class t8r extends AbstractC7217q<View> {
        /* synthetic */ t8r(String str, f7l8 f7l8Var) {
            this(str);
        }

        private t8r(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C8105toq extends t8r {
        C8105toq(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setZ(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getZ();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class x2 extends t8r {
        x2(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setRotation(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getRotation();
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.toq$y */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    class C7225y extends t8r {
        C7225y(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setTranslationY(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    class zy extends t8r {
        zy(String str) {
            super(str, null);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(View view, float f2) {
            view.setAlpha(f2);
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(View view) {
            return view.getAlpha();
        }
    }

    toq(C7216n c7216n) {
        this.f40738k = 0.0f;
        this.f87913toq = Float.MAX_VALUE;
        this.f87915zy = false;
        this.f40737g = false;
        this.f87910f7l8 = Float.MAX_VALUE;
        this.f40743y = -Float.MAX_VALUE;
        this.f40742s = 0L;
        this.f87911ld6 = new ArrayList<>();
        this.f87914x2 = new ArrayList<>();
        this.f40741q = null;
        this.f40739n = new C7218g("FloatValueHolder", c7216n);
        this.f40740p = 1.0f;
    }

    private float f7l8() {
        return this.f40739n.toq(this.f40741q);
    }

    private void fu4(boolean z2) {
        if (this.f40737g) {
            return;
        }
        this.f87912qrj = z2;
        this.f40737g = true;
        if (!this.f87915zy) {
            this.f87913toq = f7l8();
        }
        float f2 = this.f87913toq;
        if (f2 <= this.f87910f7l8 && f2 >= this.f40743y) {
            if (z2) {
                return;
            }
            C7215k.m26186n().m26189k(this, 0L);
            return;
        }
        throw new IllegalArgumentException("Starting value(" + this.f87913toq + ") need to be in between min value(" + this.f40743y + ") and max value(" + this.f87910f7l8 + ")");
    }

    /* JADX INFO: renamed from: q */
    private void m26196q(boolean z2) {
        this.f40737g = false;
        if (!this.f87912qrj) {
            C7215k.m26186n().m26191y(this);
        }
        this.f87912qrj = false;
        this.f40742s = 0L;
        this.f87915zy = false;
        for (int i2 = 0; i2 < this.f87911ld6.size(); i2++) {
            if (this.f87911ld6.get(i2) != null) {
                this.f87911ld6.get(i2).m26203k(this, z2, this.f87913toq, this.f40738k);
            }
        }
        qrj(this.f87911ld6);
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

    public T cdj(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f40740p = f2;
        fn3e(f2 * 0.75f);
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.C7215k.toq
    public boolean doAnimationFrame(long j2) {
        long j3 = this.f40742s;
        if (j3 == 0) {
            this.f40742s = j2;
            ki(this.f87913toq);
            return false;
        }
        this.f40742s = j2;
        boolean zMo26185z = mo26185z(j2 - j3);
        float fMin = Math.min(this.f87913toq, this.f87910f7l8);
        this.f87913toq = fMin;
        float fMax = Math.max(fMin, this.f40743y);
        this.f87913toq = fMax;
        ki(fMax);
        if (zMo26185z) {
            m26196q(false);
        }
        return zMo26185z;
    }

    abstract void fn3e(float f2);

    /* JADX INFO: renamed from: g */
    public float m26197g() {
        return this.f40740p;
    }

    /* JADX INFO: renamed from: h */
    public T mo26198h(float f2) {
        this.f40743y = f2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public T mo26199i(float f2) {
        this.f40738k = f2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public T m26200k(cdj cdjVar) {
        if (!this.f87911ld6.contains(cdjVar)) {
            this.f87911ld6.add(cdjVar);
        }
        return this;
    }

    void ki(float f2) {
        this.f40739n.zy(this.f40741q, f2);
        for (int i2 = 0; i2 < this.f87914x2.size(); i2++) {
            if (this.f87914x2.get(i2) != null) {
                this.f87914x2.get(i2).mo26208k(this, this.f87913toq, this.f40738k);
            }
        }
        qrj(this.f87914x2);
    }

    public T kja0(float f2) {
        this.f87910f7l8 = f2;
        return this;
    }

    public void ld6(cdj cdjVar) {
        x2(this.f87911ld6, cdjVar);
    }

    /* JADX INFO: renamed from: n */
    abstract float mo26182n(float f2, float f3);

    public void n7h(ki kiVar) {
        x2(this.f87914x2, kiVar);
    }

    public void ni7(boolean z2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f40737g) {
            return;
        }
        fu4(z2);
    }

    /* JADX INFO: renamed from: p */
    public boolean m26201p() {
        return this.f40737g;
    }

    /* JADX INFO: renamed from: s */
    abstract boolean mo26183s(float f2, float f3);

    public T t8r(float f2) {
        this.f87913toq = f2;
        this.f87915zy = true;
        return this;
    }

    public T toq(ki kiVar) {
        if (m26201p()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f87914x2.contains(kiVar)) {
            this.f87914x2.add(kiVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    float m26202y() {
        return this.f40740p * 0.75f;
    }

    /* JADX INFO: renamed from: z */
    abstract boolean mo26185z(long j2);

    public void zurt() {
        ni7(false);
    }

    public void zy() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f40737g) {
            m26196q(true);
        }
    }

    <K> toq(K k2, AbstractC7217q<K> abstractC7217q) {
        this.f40738k = 0.0f;
        this.f87913toq = Float.MAX_VALUE;
        this.f87915zy = false;
        this.f40737g = false;
        this.f87910f7l8 = Float.MAX_VALUE;
        this.f40743y = -Float.MAX_VALUE;
        this.f40742s = 0L;
        this.f87911ld6 = new ArrayList<>();
        this.f87914x2 = new ArrayList<>();
        this.f40741q = k2;
        this.f40739n = abstractC7217q;
        if (abstractC7217q != f87907t8r && abstractC7217q != f40734i && abstractC7217q != f87896fn3e) {
            if (abstractC7217q == f40736z) {
                this.f40740p = 0.00390625f;
                return;
            } else if (abstractC7217q != f87895cdj && abstractC7217q != f87901ki) {
                this.f40740p = 1.0f;
                return;
            } else {
                this.f40740p = 0.00390625f;
                return;
            }
        }
        this.f40740p = 0.1f;
    }
}
