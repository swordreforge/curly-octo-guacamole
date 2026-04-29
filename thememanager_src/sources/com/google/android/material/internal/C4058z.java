package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C0683f;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import ij.C6095k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.z */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4058z {

    /* JADX INFO: renamed from: com.google.android.material.internal.z$k */
    /* JADX INFO: compiled from: ViewUtils.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f24640k;

        k(View view) {
            this.f24640k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f24640k.getContext().getSystemService("input_method")).showSoftInput(this.f24640k, 1);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.z$n */
    /* JADX INFO: compiled from: ViewUtils.java */
    public interface n {
        /* JADX INFO: renamed from: k */
        tfm mo14130k(View view, tfm tfmVar, g gVar);
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.z$q */
    /* JADX INFO: compiled from: ViewUtils.java */
    class q implements View.OnAttachStateChangeListener {
        q() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@lvui View view) {
            view.removeOnAttachStateChangeListener(this);
            C0683f.m28243do(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.z$toq */
    /* JADX INFO: compiled from: ViewUtils.java */
    class toq implements n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f24641k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ n f24642q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ boolean f67727toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ boolean f67728zy;

        toq(boolean z2, boolean z3, boolean z5, n nVar) {
            this.f24641k = z2;
            this.f67727toq = z3;
            this.f67728zy = z5;
            this.f24642q = nVar;
        }

        @Override // com.google.android.material.internal.C4058z.n
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo14130k(View view, @lvui tfm tfmVar, @lvui g gVar) {
            if (this.f24641k) {
                gVar.f24639q += tfmVar.kja0();
            }
            boolean zLd6 = C4058z.ld6(view);
            if (this.f67727toq) {
                if (zLd6) {
                    gVar.f67726zy += tfmVar.m3467h();
                } else {
                    gVar.f24638k += tfmVar.m3467h();
                }
            }
            if (this.f67728zy) {
                if (zLd6) {
                    gVar.f24638k += tfmVar.cdj();
                } else {
                    gVar.f67726zy += tfmVar.cdj();
                }
            }
            gVar.m14629k(view);
            n nVar = this.f24642q;
            return nVar != null ? nVar.mo14130k(view, tfmVar, gVar) : tfmVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.z$zy */
    /* JADX INFO: compiled from: ViewUtils.java */
    class zy implements eqxt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ n f24643k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ g f67729toq;

        zy(n nVar, g gVar) {
            this.f24643k = nVar;
            this.f67729toq = gVar;
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            return this.f24643k.mo14130k(view, tfmVar, new g(this.f67729toq));
        }
    }

    private C4058z() {
    }

    @dd
    public static ViewGroup f7l8(@dd View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static Integer m14621g(@lvui View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m14622h(@lvui View view) {
        view.requestFocus();
        view.post(new k(view));
    }

    /* JADX INFO: renamed from: k */
    public static void m14623k(@dd View view, @lvui ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void kja0(@lvui View view) {
        if (C0683f.zsr0(view)) {
            C0683f.m28243do(view);
        } else {
            view.addOnAttachStateChangeListener(new q());
        }
    }

    public static boolean ld6(View view) {
        return C0683f.m3159e(view) == 1;
    }

    /* JADX INFO: renamed from: n */
    public static float m14624n(@lvui Context context, @zy.cdj(unit = 0) int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static void n7h(@lvui ViewTreeObserver viewTreeObserver, @lvui ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: p */
    public static float m14625p(@lvui View view) {
        float fM3166l = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM3166l += C0683f.m3166l((View) parent);
        }
        return fM3166l;
    }

    /* JADX INFO: renamed from: q */
    public static void m14626q(@lvui View view, @lvui n nVar) {
        C0683f.kx3(view, new zy(nVar, new g(C0683f.i1(view), view.getPaddingTop(), C0683f.bf2(view), view.getPaddingBottom())));
        kja0(view);
    }

    public static void qrj(@dd View view, @lvui ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            n7h(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    @dd
    /* JADX INFO: renamed from: s */
    public static fu4 m14627s(@dd View view) {
        if (view == null) {
            return null;
        }
        return new ni7(view);
    }

    public static void toq(@lvui View view, @dd AttributeSet attributeSet, int i2, int i3) {
        zy(view, attributeSet, i2, i3, null);
    }

    public static PorterDuff.Mode x2(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @dd
    /* JADX INFO: renamed from: y */
    public static fu4 m14628y(@lvui View view) {
        return m14627s(f7l8(view));
    }

    public static void zy(@lvui View view, @dd AttributeSet attributeSet, int i2, int i3, @dd n nVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C6095k.kja0.zq, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.n96, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.lbq, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.w6, false);
        typedArrayObtainStyledAttributes.recycle();
        m14626q(view, new toq(z2, z3, z5, nVar));
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.z$g */
    /* JADX INFO: compiled from: ViewUtils.java */
    public static class g {

        /* JADX INFO: renamed from: k */
        public int f24638k;

        /* JADX INFO: renamed from: q */
        public int f24639q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f67725toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f67726zy;

        public g(int i2, int i3, int i4, int i5) {
            this.f24638k = i2;
            this.f67725toq = i3;
            this.f67726zy = i4;
            this.f24639q = i5;
        }

        /* JADX INFO: renamed from: k */
        public void m14629k(View view) {
            C0683f.u38j(view, this.f24638k, this.f67725toq, this.f67726zy, this.f24639q);
        }

        public g(@lvui g gVar) {
            this.f24638k = gVar.f24638k;
            this.f67725toq = gVar.f67725toq;
            this.f67726zy = gVar.f67726zy;
            this.f24639q = gVar.f24639q;
        }
    }
}
