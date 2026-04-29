package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.tfm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import n7h.C7400k;
import zy.uv6;

/* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class vq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f50937toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50938zy = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: k */
    private C0734n f4159k;

    /* JADX INFO: renamed from: androidx.core.view.vq$n */
    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    private static class C0734n {

        /* JADX INFO: renamed from: k */
        private final int f4161k;

        /* JADX INFO: renamed from: n */
        private float f4162n;

        /* JADX INFO: renamed from: q */
        private final long f4163q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f50940toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private final Interpolator f50941zy;

        C0734n(int i2, @zy.dd Interpolator interpolator, long j2) {
            this.f4161k = i2;
            this.f50941zy = interpolator;
            this.f4163q = j2;
        }

        public void f7l8(float f2) {
            this.f4162n = f2;
        }

        /* JADX INFO: renamed from: g */
        public int mo3533g() {
            return this.f4161k;
        }

        /* JADX INFO: renamed from: k */
        public float m3534k() {
            return this.f4162n;
        }

        @zy.dd
        /* JADX INFO: renamed from: n */
        public Interpolator mo3535n() {
            return this.f50941zy;
        }

        /* JADX INFO: renamed from: q */
        public float mo3536q() {
            Interpolator interpolator = this.f50941zy;
            return interpolator != null ? interpolator.getInterpolation(this.f50940toq) : this.f50940toq;
        }

        public long toq() {
            return this.f4163q;
        }

        /* JADX INFO: renamed from: y */
        public void mo3537y(float f2) {
            this.f50940toq = f2;
        }

        public float zy() {
            return this.f50940toq;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class toq {

        /* JADX INFO: renamed from: q */
        public static final int f4167q = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f50944zy = 0;

        /* JADX INFO: renamed from: k */
        WindowInsets f4168k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50945toq;

        /* JADX INFO: renamed from: androidx.core.view.vq$toq$k */
        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public @interface InterfaceC0736k {
        }

        public toq(int i2) {
            this.f50945toq = i2;
        }

        /* JADX INFO: renamed from: k */
        public final int m3541k() {
            return this.f50945toq;
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public C0733k m3542n(@zy.lvui vq vqVar, @zy.lvui C0733k c0733k) {
            return c0733k;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public abstract tfm m3543q(@zy.lvui tfm tfmVar, @zy.lvui List<vq> list);

        public void toq(@zy.lvui vq vqVar) {
        }

        public void zy(@zy.lvui vq vqVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    @zy.hyr(21)
    private static class zy extends C0734n {

        /* JADX INFO: renamed from: androidx.core.view.vq$zy$k */
        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @zy.hyr(21)
        private static class ViewOnApplyWindowInsetsListenerC0737k implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private static final int f50946zy = 160;

            /* JADX INFO: renamed from: k */
            final toq f4169k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private tfm f50947toq;

            /* JADX INFO: renamed from: androidx.core.view.vq$zy$k$k */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            class k implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: g */
                final /* synthetic */ int f4170g;

                /* JADX INFO: renamed from: k */
                final /* synthetic */ vq f4171k;

                /* JADX INFO: renamed from: n */
                final /* synthetic */ tfm f4172n;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ tfm f4173q;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ View f4175y;

                k(vq vqVar, tfm tfmVar, tfm tfmVar2, int i2, View view) {
                    this.f4171k = vqVar;
                    this.f4173q = tfmVar;
                    this.f4172n = tfmVar2;
                    this.f4170g = i2;
                    this.f4175y = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f4171k.m3529s(valueAnimator.getAnimatedFraction());
                    zy.n7h(this.f4175y, zy.ki(this.f4173q, this.f4172n, this.f4171k.m3528q(), this.f4170g), Collections.singletonList(this.f4171k));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.vq$zy$k$toq */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            class toq extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ vq f4176k;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ View f4178q;

                toq(vq vqVar, View view) {
                    this.f4176k = vqVar;
                    this.f4178q = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f4176k.m3529s(1.0f);
                    zy.x2(this.f4178q, this.f4176k);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.vq$zy$k$zy, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            class RunnableC7874zy implements Runnable {

                /* JADX INFO: renamed from: g */
                final /* synthetic */ ValueAnimator f4179g;

                /* JADX INFO: renamed from: k */
                final /* synthetic */ View f4180k;

                /* JADX INFO: renamed from: n */
                final /* synthetic */ C0733k f4181n;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ vq f4182q;

                RunnableC7874zy(View view, vq vqVar, C0733k c0733k, ValueAnimator valueAnimator) {
                    this.f4180k = view;
                    this.f4182q = vqVar;
                    this.f4181n = c0733k;
                    this.f4179g = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    zy.kja0(this.f4180k, this.f4182q, this.f4181n);
                    this.f4179g.start();
                }
            }

            ViewOnApplyWindowInsetsListenerC0737k(@zy.lvui View view, @zy.lvui toq toqVar) {
                this.f4169k = toqVar;
                tfm tfmVarM3178x = C0683f.m3178x(view);
                this.f50947toq = tfmVarM3178x != null ? new tfm.toq(tfmVarM3178x).m3503k() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f50947toq = tfm.d2ok(windowInsets, view);
                    return zy.m3544h(view, windowInsets);
                }
                tfm tfmVarD2ok = tfm.d2ok(windowInsets, view);
                if (this.f50947toq == null) {
                    this.f50947toq = C0683f.m3178x(view);
                }
                if (this.f50947toq == null) {
                    this.f50947toq = tfmVarD2ok;
                    return zy.m3544h(view, windowInsets);
                }
                toq toqVarCdj = zy.cdj(view);
                if (toqVarCdj != null && Objects.equals(toqVarCdj.f4168k, windowInsets)) {
                    return zy.m3544h(view, windowInsets);
                }
                int iM3546s = zy.m3546s(tfmVarD2ok, this.f50947toq);
                if (iM3546s == 0) {
                    return zy.m3544h(view, windowInsets);
                }
                tfm tfmVar = this.f50947toq;
                vq vqVar = new vq(iM3546s, new DecelerateInterpolator(), 160L);
                vqVar.m3529s(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(vqVar.toq());
                C0733k c0733kM3545p = zy.m3545p(tfmVarD2ok, tfmVar, iM3546s);
                zy.qrj(view, vqVar, windowInsets, false);
                duration.addUpdateListener(new k(vqVar, tfmVarD2ok, tfmVar, iM3546s, view));
                duration.addListener(new toq(vqVar, view));
                ViewTreeObserverOnPreDrawListenerC0714r.m3434k(view, new RunnableC7874zy(view, vqVar, c0733kM3545p, duration));
                this.f50947toq = tfmVarD2ok;
                return zy.m3544h(view, windowInsets);
            }
        }

        zy(int i2, @zy.dd Interpolator interpolator, long j2) {
            super(i2, interpolator, j2);
        }

        @zy.dd
        static toq cdj(View view) {
            Object tag = view.getTag(C7400k.n.f93237ch);
            if (tag instanceof ViewOnApplyWindowInsetsListenerC0737k) {
                return ((ViewOnApplyWindowInsetsListenerC0737k) tag).f4169k;
            }
            return null;
        }

        @zy.lvui
        /* JADX INFO: renamed from: h */
        static WindowInsets m3544h(@zy.lvui View view, @zy.lvui WindowInsets windowInsets) {
            return view.getTag(C7400k.n.f93277y9n) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @SuppressLint({"WrongConstant"})
        static tfm ki(tfm tfmVar, tfm tfmVar2, float f2, int i2) {
            tfm.toq toqVar = new tfm.toq(tfmVar);
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) == 0) {
                    toqVar.zy(i3, tfmVar.m3466g(i3));
                } else {
                    androidx.core.graphics.x2 x2VarM3466g = tfmVar.m3466g(i3);
                    androidx.core.graphics.x2 x2VarM3466g2 = tfmVar2.m3466g(i3);
                    float f3 = 1.0f - f2;
                    toqVar.zy(i3, tfm.o1t(x2VarM3466g, (int) (((double) ((x2VarM3466g.f3600k - x2VarM3466g2.f3600k) * f3)) + 0.5d), (int) (((double) ((x2VarM3466g.f50489toq - x2VarM3466g2.f50489toq) * f3)) + 0.5d), (int) (((double) ((x2VarM3466g.f50490zy - x2VarM3466g2.f50490zy) * f3)) + 0.5d), (int) (((double) ((x2VarM3466g.f3601q - x2VarM3466g2.f3601q) * f3)) + 0.5d)));
                }
            }
            return toqVar.m3503k();
        }

        static void kja0(View view, vq vqVar, C0733k c0733k) {
            toq toqVarCdj = cdj(view);
            if (toqVarCdj != null) {
                toqVarCdj.m3542n(vqVar, c0733k);
                if (toqVarCdj.m3541k() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    kja0(viewGroup.getChildAt(i2), vqVar, c0733k);
                }
            }
        }

        @zy.lvui
        private static View.OnApplyWindowInsetsListener ld6(@zy.lvui View view, @zy.lvui toq toqVar) {
            return new ViewOnApplyWindowInsetsListenerC0737k(view, toqVar);
        }

        static void n7h(@zy.lvui View view, @zy.lvui tfm tfmVar, @zy.lvui List<vq> list) {
            toq toqVarCdj = cdj(view);
            if (toqVarCdj != null) {
                tfmVar = toqVarCdj.m3543q(tfmVar, list);
                if (toqVarCdj.m3541k() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    n7h(viewGroup.getChildAt(i2), tfmVar, list);
                }
            }
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        static C0733k m3545p(@zy.lvui tfm tfmVar, @zy.lvui tfm tfmVar2, int i2) {
            androidx.core.graphics.x2 x2VarM3466g = tfmVar.m3466g(i2);
            androidx.core.graphics.x2 x2VarM3466g2 = tfmVar2.m3466g(i2);
            return new C0733k(androidx.core.graphics.x2.m2575q(Math.min(x2VarM3466g.f3600k, x2VarM3466g2.f3600k), Math.min(x2VarM3466g.f50489toq, x2VarM3466g2.f50489toq), Math.min(x2VarM3466g.f50490zy, x2VarM3466g2.f50490zy), Math.min(x2VarM3466g.f3601q, x2VarM3466g2.f3601q)), androidx.core.graphics.x2.m2575q(Math.max(x2VarM3466g.f3600k, x2VarM3466g2.f3600k), Math.max(x2VarM3466g.f50489toq, x2VarM3466g2.f50489toq), Math.max(x2VarM3466g.f50490zy, x2VarM3466g2.f50490zy), Math.max(x2VarM3466g.f3601q, x2VarM3466g2.f3601q)));
        }

        static void qrj(View view, vq vqVar, WindowInsets windowInsets, boolean z2) {
            toq toqVarCdj = cdj(view);
            if (toqVarCdj != null) {
                toqVarCdj.f4168k = windowInsets;
                if (!z2) {
                    toqVarCdj.zy(vqVar);
                    z2 = toqVarCdj.m3541k() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    qrj(viewGroup.getChildAt(i2), vqVar, windowInsets, z2);
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: s */
        static int m3546s(@zy.lvui tfm tfmVar, @zy.lvui tfm tfmVar2) {
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if (!tfmVar.m3466g(i3).equals(tfmVar2.m3466g(i3))) {
                    i2 |= i3;
                }
            }
            return i2;
        }

        static void t8r(@zy.lvui View view, @zy.dd toq toqVar) {
            Object tag = view.getTag(C7400k.n.f93277y9n);
            if (toqVar == null) {
                view.setTag(C7400k.n.f93237ch, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerLd6 = ld6(view, toqVar);
            view.setTag(C7400k.n.f93237ch, onApplyWindowInsetsListenerLd6);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerLd6);
            }
        }

        static void x2(@zy.lvui View view, @zy.lvui vq vqVar) {
            toq toqVarCdj = cdj(view);
            if (toqVarCdj != null) {
                toqVarCdj.toq(vqVar);
                if (toqVarCdj.m3541k() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    x2(viewGroup.getChildAt(i2), vqVar);
                }
            }
        }
    }

    public vq(int i2, @zy.dd Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4159k = new C0735q(i2, interpolator, j2);
        } else {
            this.f4159k = new zy(i2, interpolator, j2);
        }
    }

    @zy.hyr(30)
    /* JADX INFO: renamed from: p */
    static vq m3523p(WindowInsetsAnimation windowInsetsAnimation) {
        return new vq(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: y */
    static void m3524y(@zy.lvui View view, @zy.dd toq toqVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0735q.x2(view, toqVar);
        } else {
            zy.t8r(view, toqVar);
        }
    }

    public void f7l8(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f4159k.f7l8(f2);
    }

    /* JADX INFO: renamed from: g */
    public int m3525g() {
        return this.f4159k.mo3533g();
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: k */
    public float m3526k() {
        return this.f4159k.m3534k();
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public Interpolator m3527n() {
        return this.f4159k.mo3535n();
    }

    /* JADX INFO: renamed from: q */
    public float m3528q() {
        return this.f4159k.mo3536q();
    }

    /* JADX INFO: renamed from: s */
    public void m3529s(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f4159k.mo3537y(f2);
    }

    public long toq() {
        return this.f4159k.toq();
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    public float zy() {
        return this.f4159k.zy();
    }

    /* JADX INFO: renamed from: androidx.core.view.vq$q */
    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    @zy.hyr(30)
    private static class C0735q extends C0734n {

        /* JADX INFO: renamed from: g */
        @zy.lvui
        private final WindowInsetsAnimation f4164g;

        /* JADX INFO: renamed from: androidx.core.view.vq$q$k */
        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        @zy.hyr(30)
        private static class k extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: k */
            private final toq f4165k;

            /* JADX INFO: renamed from: q */
            private final HashMap<WindowInsetsAnimation, vq> f4166q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private List<vq> f50942toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private ArrayList<vq> f50943zy;

            k(@zy.lvui toq toqVar) {
                super(toqVar.m3541k());
                this.f4166q = new HashMap<>();
                this.f4165k = toqVar;
            }

            @zy.lvui
            /* JADX INFO: renamed from: k */
            private vq m3540k(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
                vq vqVar = this.f4166q.get(windowInsetsAnimation);
                if (vqVar != null) {
                    return vqVar;
                }
                vq vqVarM3523p = vq.m3523p(windowInsetsAnimation);
                this.f4166q.put(windowInsetsAnimation, vqVarM3523p);
                return vqVarM3523p;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
                this.f4165k.toq(m3540k(windowInsetsAnimation));
                this.f4166q.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
                this.f4165k.zy(m3540k(windowInsetsAnimation));
            }

            @zy.lvui
            public WindowInsets onProgress(@zy.lvui WindowInsets windowInsets, @zy.lvui List<WindowInsetsAnimation> list) {
                ArrayList<vq> arrayList = this.f50943zy;
                if (arrayList == null) {
                    ArrayList<vq> arrayList2 = new ArrayList<>(list.size());
                    this.f50943zy = arrayList2;
                    this.f50942toq = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    vq vqVarM3540k = m3540k(windowInsetsAnimation);
                    vqVarM3540k.m3529s(windowInsetsAnimation.getFraction());
                    this.f50943zy.add(vqVarM3540k);
                }
                return this.f4165k.m3543q(tfm.eqxt(windowInsets), this.f50942toq).oc();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @zy.lvui
            public WindowInsetsAnimation.Bounds onStart(@zy.lvui WindowInsetsAnimation windowInsetsAnimation, @zy.lvui WindowInsetsAnimation.Bounds bounds) {
                return this.f4165k.m3542n(m3540k(windowInsetsAnimation), C0733k.m3530n(bounds)).m3532q();
            }
        }

        C0735q(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f4164g = windowInsetsAnimation;
        }

        @zy.lvui
        public static androidx.core.graphics.x2 ld6(@zy.lvui WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.x2.f7l8(bounds.getLowerBound());
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public static androidx.core.graphics.x2 m3538p(@zy.lvui WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.x2.f7l8(bounds.getUpperBound());
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        public static WindowInsetsAnimation.Bounds m3539s(@zy.lvui C0733k c0733k) {
            return new WindowInsetsAnimation.Bounds(c0733k.m3531k().m2577y(), c0733k.toq().m2577y());
        }

        public static void x2(@zy.lvui View view, @zy.dd toq toqVar) {
            view.setWindowInsetsAnimationCallback(toqVar != null ? new k(toqVar) : null);
        }

        @Override // androidx.core.view.vq.C0734n
        /* JADX INFO: renamed from: g */
        public int mo3533g() {
            return this.f4164g.getTypeMask();
        }

        @Override // androidx.core.view.vq.C0734n
        @zy.dd
        /* JADX INFO: renamed from: n */
        public Interpolator mo3535n() {
            return this.f4164g.getInterpolator();
        }

        @Override // androidx.core.view.vq.C0734n
        /* JADX INFO: renamed from: q */
        public float mo3536q() {
            return this.f4164g.getInterpolatedFraction();
        }

        @Override // androidx.core.view.vq.C0734n
        public long toq() {
            return this.f4164g.getDurationMillis();
        }

        @Override // androidx.core.view.vq.C0734n
        /* JADX INFO: renamed from: y */
        public void mo3537y(float f2) {
            this.f4164g.setFraction(f2);
        }

        @Override // androidx.core.view.vq.C0734n
        public float zy() {
            return this.f4164g.getFraction();
        }

        C0735q(int i2, Interpolator interpolator, long j2) {
            this(new WindowInsetsAnimation(i2, interpolator, j2));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.vq$k */
    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static final class C0733k {

        /* JADX INFO: renamed from: k */
        private final androidx.core.graphics.x2 f4160k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final androidx.core.graphics.x2 f50939toq;

        public C0733k(@zy.lvui androidx.core.graphics.x2 x2Var, @zy.lvui androidx.core.graphics.x2 x2Var2) {
            this.f4160k = x2Var;
            this.f50939toq = x2Var2;
        }

        @zy.hyr(30)
        @zy.lvui
        /* JADX INFO: renamed from: n */
        public static C0733k m3530n(@zy.lvui WindowInsetsAnimation.Bounds bounds) {
            return new C0733k(bounds);
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public androidx.core.graphics.x2 m3531k() {
            return this.f4160k;
        }

        @zy.hyr(30)
        @zy.lvui
        /* JADX INFO: renamed from: q */
        public WindowInsetsAnimation.Bounds m3532q() {
            return C0735q.m3539s(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f4160k + " upper=" + this.f50939toq + "}";
        }

        @zy.lvui
        public androidx.core.graphics.x2 toq() {
            return this.f50939toq;
        }

        @zy.lvui
        public C0733k zy(@zy.lvui androidx.core.graphics.x2 x2Var) {
            return new C0733k(tfm.o1t(this.f4160k, x2Var.f3600k, x2Var.f50489toq, x2Var.f50490zy, x2Var.f3601q), tfm.o1t(this.f50939toq, x2Var.f3600k, x2Var.f50489toq, x2Var.f50490zy, x2Var.f3601q));
        }

        @zy.hyr(30)
        private C0733k(@zy.lvui WindowInsetsAnimation.Bounds bounds) {
            this.f4160k = C0735q.ld6(bounds);
            this.f50939toq = C0735q.m3538p(bounds);
        }
    }

    @zy.hyr(30)
    private vq(@zy.lvui WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4159k = new C0735q(windowInsetsAnimation);
        }
    }
}
