package miuix.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import cn02.toq;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: k */
    static final String f40377k = "ViewUtils";

    /* JADX INFO: renamed from: q */
    private static Method f40378q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f87765toq = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f87766zy;

    /* JADX INFO: renamed from: miuix.internal.util.n7h$k */
    /* JADX INFO: compiled from: ViewUtils.java */
    class C7165k implements InterfaceC7167q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f40379k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC7167q f40380q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ boolean f87767toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ boolean f87768zy;

        C7165k(boolean z2, boolean z3, boolean z5, InterfaceC7167q interfaceC7167q) {
            this.f40379k = z2;
            this.f87767toq = z3;
            this.f87768zy = z5;
            this.f40380q = interfaceC7167q;
        }

        @Override // miuix.internal.util.n7h.InterfaceC7167q
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo25962k(View view, @lvui tfm tfmVar, @lvui C7166n c7166n) {
            if (this.f40379k) {
                c7166n.f40382n += tfmVar.kja0();
            }
            boolean zX2 = n7h.x2(view);
            if (this.f87767toq) {
                if (zX2) {
                    c7166n.f40383q += tfmVar.m3467h();
                } else {
                    c7166n.f87769toq += tfmVar.m3467h();
                }
            }
            if (this.f87768zy) {
                if (zX2) {
                    c7166n.f87769toq += tfmVar.cdj();
                } else {
                    c7166n.f40383q += tfmVar.cdj();
                }
            }
            c7166n.toq(view);
            InterfaceC7167q interfaceC7167q = this.f40380q;
            return interfaceC7167q != null ? interfaceC7167q.mo25962k(view, tfmVar, c7166n) : tfmVar;
        }
    }

    /* JADX INFO: renamed from: miuix.internal.util.n7h$q */
    /* JADX INFO: compiled from: ViewUtils.java */
    public interface InterfaceC7167q {
        /* JADX INFO: renamed from: k */
        tfm mo25962k(View view, tfm tfmVar, C7166n c7166n);
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    class toq implements eqxt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC7167q f40384k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C7166n f87771toq;

        toq(InterfaceC7167q interfaceC7167q, C7166n c7166n) {
            this.f40384k = interfaceC7167q;
            this.f87771toq = c7166n;
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            return this.f40384k.mo25962k(view, tfmVar, new C7166n(this.f87771toq));
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    class zy implements View.OnAttachStateChangeListener {
        zy() {
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

    private n7h() {
    }

    public static void cdj(View view, int i2) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
    }

    public static int f7l8(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            return background.getIntrinsicWidth();
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m25954g(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static void m25955h(@lvui View view) {
        if (C0683f.zsr0(view)) {
            C0683f.m28243do(view);
        } else {
            view.addOnAttachStateChangeListener(new zy());
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25956k(View view, int i2, int i3) {
        return i2 > view.getLeft() && i2 < view.getRight() && i3 > view.getTop() && i3 < view.getBottom();
    }

    public static void ki(View view, int i2) {
        view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void kja0(ViewGroup viewGroup, View view, int i2, int i3, int i4, int i5) {
        boolean zX2 = x2(viewGroup);
        int width = viewGroup.getWidth();
        int i6 = zX2 ? width - i4 : i2;
        if (zX2) {
            i4 = width - i2;
        }
        view.layout(i6, i3, i4, i5);
    }

    public static boolean ld6(View view, Rect rect) {
        return rect != null && view.getLeft() < rect.right && view.getTop() < rect.bottom && view.getRight() > rect.left && view.getBottom() > rect.top;
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: n */
    private static void m25957n() {
        if (f87766zy) {
            return;
        }
        Class cls = Integer.TYPE;
        Method methodM26537n = miuix.reflect.toq.m26537n(View.class, "setFrame", cls, cls, cls, cls);
        f40378q = methodM26537n;
        methodM26537n.setAccessible(true);
        f87766zy = true;
    }

    public static boolean n7h(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 30 ? configuration.isNightModeActive() : (configuration.uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: p */
    public static int m25958p(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: q */
    public static void m25959q(@lvui View view, @lvui InterfaceC7167q interfaceC7167q) {
        C0683f.kx3(view, new toq(interfaceC7167q, new C7166n(C0683f.i1(view), view.getPaddingTop(), C0683f.bf2(view), view.getPaddingBottom())));
        m25955h(view);
    }

    public static boolean qrj(Context context) {
        return n7h(context.getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: s */
    public static void m25960s(View view, Rect rect) {
        rect.left = view.getScrollX() + view.getPaddingLeft();
        rect.top = view.getScrollY() + view.getPaddingTop();
        rect.right = (view.getWidth() - view.getPaddingRight()) - rect.left;
        rect.bottom = (view.getHeight() - view.getPaddingBottom()) - rect.top;
    }

    public static void t8r(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setLeftTopRightBottom(i2, i3, i4, i5);
            return;
        }
        m25957n();
        Method method = f40378q;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static void toq(@lvui View view, @dd AttributeSet attributeSet, int i2, int i3) {
        zy(view, attributeSet, i2, i3, null);
    }

    public static boolean x2(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: y */
    public static void m25961y(@lvui View view, @lvui Rect rect) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        rect.set(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
    }

    public static void zy(@lvui View view, @dd AttributeSet attributeSet, int i2, int i3, @dd InterfaceC7167q interfaceC7167q) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, toq.C1400p.f55783lrht, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.C1400p.f55792nn86, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(toq.C1400p.f55775hb, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(toq.C1400p.f7729j, false);
        typedArrayObtainStyledAttributes.recycle();
        m25959q(view, new C7165k(z2, z3, z5, interfaceC7167q));
    }

    /* JADX INFO: renamed from: miuix.internal.util.n7h$n */
    /* JADX INFO: compiled from: ViewUtils.java */
    public static class C7166n {

        /* JADX INFO: renamed from: k */
        public boolean f40381k = false;

        /* JADX INFO: renamed from: n */
        public int f40382n;

        /* JADX INFO: renamed from: q */
        public int f40383q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f87769toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f87770zy;

        public C7166n(View view) {
            this.f87769toq = C0683f.i1(view);
            this.f87770zy = view.getPaddingTop();
            this.f40383q = C0683f.bf2(view);
            this.f40382n = view.getPaddingBottom();
        }

        /* JADX INFO: renamed from: k */
        public void m25963k(ViewGroup viewGroup) {
            toq(viewGroup);
            viewGroup.setClipToPadding(true);
        }

        public void toq(View view) {
            C0683f.u38j(view, this.f87769toq, this.f87770zy, this.f40383q, this.f40382n);
        }

        public C7166n(int i2, int i3, int i4, int i5) {
            this.f87769toq = i2;
            this.f87770zy = i3;
            this.f40383q = i4;
            this.f40382n = i5;
        }

        public C7166n(@lvui C7166n c7166n) {
            this.f87769toq = c7166n.f87769toq;
            this.f87770zy = c7166n.f87770zy;
            this.f40383q = c7166n.f40383q;
            this.f40382n = c7166n.f40382n;
        }
    }
}
