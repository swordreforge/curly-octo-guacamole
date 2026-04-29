package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.transition.C1246t;
import androidx.transition.o1t;
import androidx.transition.oc;
import bap7.C1366k;
import com.google.android.material.shape.C4105k;
import com.google.android.material.shape.InterfaceC4109q;
import com.google.android.material.shape.kja0;
import zy.InterfaceC7828g;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes2.dex */
class fn3e {

    /* JADX INFO: renamed from: k */
    static final int f25436k = -1;

    /* JADX INFO: renamed from: n */
    private static final RectF f25437n = new RectF();

    /* JADX INFO: renamed from: q */
    private static final int f25438q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7828g
    static final int f67980toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f67981zy = 0;

    /* JADX INFO: renamed from: com.google.android.material.transition.fn3e$k */
    /* JADX INFO: compiled from: TransitionUtils.java */
    class C4190k implements kja0.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RectF f25439k;

        C4190k(RectF rectF) {
            this.f25439k = rectF;
        }

        @Override // com.google.android.material.shape.kja0.zy
        @lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC4109q mo14840k(@lvui InterfaceC4109q interfaceC4109q) {
            return interfaceC4109q instanceof com.google.android.material.shape.qrj ? interfaceC4109q : new com.google.android.material.shape.qrj(interfaceC4109q.mo14816k(this.f25439k) / this.f25439k.height());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.fn3e$q */
    /* JADX INFO: compiled from: TransitionUtils.java */
    interface InterfaceC4191q {
        @lvui
        /* JADX INFO: renamed from: k */
        InterfaceC4109q mo15172k(@lvui InterfaceC4109q interfaceC4109q, @lvui InterfaceC4109q interfaceC4109q2);
    }

    /* JADX INFO: compiled from: TransitionUtils.java */
    class toq implements InterfaceC4191q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RectF f25440k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f25441n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25442q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ RectF f67982toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ float f67983zy;

        toq(RectF rectF, RectF rectF2, float f2, float f3, float f4) {
            this.f25440k = rectF;
            this.f67982toq = rectF2;
            this.f67983zy = f2;
            this.f25442q = f3;
            this.f25441n = f4;
        }

        @Override // com.google.android.material.transition.fn3e.InterfaceC4191q
        @lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC4109q mo15172k(@lvui InterfaceC4109q interfaceC4109q, @lvui InterfaceC4109q interfaceC4109q2) {
            return new C4105k(fn3e.x2(interfaceC4109q.mo14816k(this.f25440k), interfaceC4109q2.mo14816k(this.f67982toq), this.f67983zy, this.f25442q, this.f25441n));
        }
    }

    /* JADX INFO: compiled from: TransitionUtils.java */
    interface zy {
        /* JADX INFO: renamed from: k */
        void mo15173k(Canvas canvas);
    }

    private fn3e() {
    }

    static boolean cdj(oc ocVar, Context context, @InterfaceC7828g int i2) {
        int iM5800q;
        if (i2 == 0 || ocVar.lvui() != -1 || (iM5800q = C1366k.m5800q(context, i2, -1)) == -1) {
            return false;
        }
        ocVar.gyi(iM5800q);
        return true;
    }

    static RectF f7l8(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    @dd
    static o1t fn3e(Context context, @InterfaceC7828g int i2) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.type;
        if (i3 != 16) {
            if (i3 == 3) {
                return new C1246t(androidx.core.graphics.cdj.m2389n(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i4 = typedValue.data;
        if (i4 == 0) {
            return null;
        }
        if (i4 == 1) {
            return new ld6();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i4);
    }

    static com.google.android.material.shape.kja0 fu4(com.google.android.material.shape.kja0 kja0Var, com.google.android.material.shape.kja0 kja0Var2, RectF rectF, InterfaceC4191q interfaceC4191q) {
        return (m15168p(kja0Var, rectF) ? kja0Var : kja0Var2).zurt().d2ok(interfaceC4191q.mo15172k(kja0Var.ki(), kja0Var2.ki())).ncyb(interfaceC4191q.mo15172k(kja0Var.m14823i(), kja0Var2.m14823i())).m14839z(interfaceC4191q.mo15172k(kja0Var.m14824p(), kja0Var2.m14824p())).jk(interfaceC4191q.mo15172k(kja0Var.x2(), kja0Var2.x2())).qrj();
    }

    /* JADX INFO: renamed from: g */
    static View m15163g(View view, @InterfaceC7843t int i2) {
        View viewFindViewById = view.findViewById(i2);
        return viewFindViewById != null ? viewFindViewById : m15167n(view, i2);
    }

    /* JADX INFO: renamed from: h */
    static void m15164h(androidx.transition.dd ddVar, @dd oc ocVar) {
        if (ocVar != null) {
            ddVar.g1(ocVar);
        }
    }

    /* JADX INFO: renamed from: i */
    static void m15165i(androidx.transition.dd ddVar, @dd oc ocVar) {
        if (ocVar != null) {
            ddVar.etdu(ocVar);
        }
    }

    /* JADX INFO: renamed from: k */
    static float m15166k(@lvui RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static boolean ki(oc ocVar, Context context, @InterfaceC7828g int i2, TimeInterpolator timeInterpolator) {
        if (i2 == 0 || ocVar.x9kr() != null) {
            return false;
        }
        ocVar.xwq3(C1366k.m5799n(context, i2, timeInterpolator));
        return true;
    }

    static com.google.android.material.shape.kja0 kja0(com.google.android.material.shape.kja0 kja0Var, com.google.android.material.shape.kja0 kja0Var2, RectF rectF, RectF rectF2, @zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4) {
        return f4 < f2 ? kja0Var : f4 > f3 ? kja0Var2 : fu4(kja0Var, kja0Var2, rectF, new toq(rectF, rectF2, f2, f3, f4));
    }

    static float ld6(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    /* JADX INFO: renamed from: n */
    static View m15167n(View view, @InterfaceC7843t int i2) {
        String resourceName = view.getResources().getResourceName(i2);
        while (view != null) {
            if (view.getId() != i2) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static int n7h(int i2, int i3, @zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4) {
        return f4 < f2 ? i2 : f4 > f3 ? i3 : (int) ld6(i2, i3, (f4 - f2) / (f3 - f2));
    }

    static void ni7(Canvas canvas, Rect rect, float f2, float f3, float f4, int i2, zy zyVar) {
        if (i2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f4, f4);
        if (i2 < 255) {
            zurt(canvas, rect, i2);
        }
        zyVar.mo15173k(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: p */
    private static boolean m15168p(com.google.android.material.shape.kja0 kja0Var, RectF rectF) {
        return (kja0Var.ki().mo14816k(rectF) == 0.0f && kja0Var.m14823i().mo14816k(rectF) == 0.0f && kja0Var.x2().mo14816k(rectF) == 0.0f && kja0Var.m14824p().mo14816k(rectF) == 0.0f) ? false : true;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    static <T> T m15169q(@dd T t2, @lvui T t3) {
        return t2 != null ? t2 : t3;
    }

    static float qrj(float f2, float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4, @zy.zurt(from = 0.0d, to = 1.0d) float f5, @zy.zurt(from = 0.0d) float f6, boolean z2) {
        return (!z2 || (f6 >= 0.0f && f6 <= 1.0f)) ? f6 < f4 ? f2 : f6 > f5 ? f3 : ld6(f2, f3, (f6 - f4) / (f5 - f4)) : ld6(f2, f3, f6);
    }

    /* JADX INFO: renamed from: s */
    static Rect m15170s(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static boolean t8r(oc ocVar, Context context, @InterfaceC7828g int i2) {
        o1t o1tVarFn3e;
        if (i2 == 0 || (o1tVarFn3e = fn3e(context, i2)) == null) {
            return false;
        }
        ocVar.ikck(o1tVarFn3e);
        return true;
    }

    static com.google.android.material.shape.kja0 toq(com.google.android.material.shape.kja0 kja0Var, RectF rectF) {
        return kja0Var.m14827z(new C4190k(rectF));
    }

    static float x2(float f2, float f3, @zy.zurt(from = 0.0d, to = 1.0d) float f4, @zy.zurt(from = 0.0d, to = 1.0d) float f5, @zy.zurt(from = 0.0d, to = 1.0d) float f6) {
        return qrj(f2, f3, f4, f5, f6, false);
    }

    /* JADX INFO: renamed from: y */
    static RectF m15171y(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static int zurt(Canvas canvas, Rect rect, int i2) {
        RectF rectF = f25437n;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i2);
    }

    static Shader zy(@zy.x2 int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i2, i2, Shader.TileMode.CLAMP);
    }
}
