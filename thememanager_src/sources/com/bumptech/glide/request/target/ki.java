package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.ld6;
import com.bumptech.glide.request.InterfaceC3170n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: ViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ki<T extends View, Z> extends com.bumptech.glide.request.target.toq<Z> {

    /* JADX INFO: renamed from: h */
    private static boolean f19010h = false;

    /* JADX INFO: renamed from: i */
    private static int f19011i = ld6.C2988y.f62373bo;

    /* JADX INFO: renamed from: p */
    private static final String f19012p = "ViewTarget";

    /* JADX INFO: renamed from: g */
    @dd
    private View.OnAttachStateChangeListener f19013g;

    /* JADX INFO: renamed from: n */
    private final toq f19014n;

    /* JADX INFO: renamed from: q */
    protected final T f19015q;

    /* JADX INFO: renamed from: s */
    private boolean f19016s;

    /* JADX INFO: renamed from: y */
    private boolean f19017y;

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.ki$k */
    /* JADX INFO: compiled from: ViewTarget.java */
    class ViewOnAttachStateChangeListenerC3177k implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC3177k() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ki.this.cdj();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ki.this.n7h();
        }
    }

    /* JADX INFO: compiled from: ViewTarget.java */
    @yz
    static final class toq {

        /* JADX INFO: renamed from: g */
        @dd
        @yz
        static Integer f19019g;

        /* JADX INFO: renamed from: n */
        private static final int f19020n = 0;

        /* JADX INFO: renamed from: k */
        private final View f19021k;

        /* JADX INFO: renamed from: q */
        @dd
        private ViewTreeObserverOnPreDrawListenerC3178k f19022q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<kja0> f63045toq = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f63046zy;

        /* JADX INFO: renamed from: com.bumptech.glide.request.target.ki$toq$k */
        /* JADX INFO: compiled from: ViewTarget.java */
        private static final class ViewTreeObserverOnPreDrawListenerC3178k implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: k */
            private final WeakReference<toq> f19023k;

            ViewTreeObserverOnPreDrawListenerC3178k(@lvui toq toqVar) {
                this.f19023k = new WeakReference<>(toqVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(ki.f19012p, 2)) {
                    Log.v(ki.f19012p, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                toq toqVar = this.f19023k.get();
                if (toqVar == null) {
                    return true;
                }
                toqVar.m11200k();
                return true;
            }
        }

        toq(@lvui View view) {
            this.f19021k = view;
        }

        private int f7l8() {
            int paddingLeft = this.f19021k.getPaddingLeft() + this.f19021k.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f19021k.getLayoutParams();
            return m11196n(this.f19021k.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: g */
        private int m11195g() {
            int paddingTop = this.f19021k.getPaddingTop() + this.f19021k.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f19021k.getLayoutParams();
            return m11196n(this.f19021k.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: n */
        private int m11196n(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.f63046zy && this.f19021k.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f19021k.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable(ki.f19012p, 4)) {
                Log.i(ki.f19012p, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return zy(this.f19021k.getContext());
        }

        /* JADX INFO: renamed from: p */
        private void m11197p(int i2, int i3) {
            Iterator it = new ArrayList(this.f63045toq).iterator();
            while (it.hasNext()) {
                ((kja0) it.next()).mo11172q(i2, i3);
            }
        }

        /* JADX INFO: renamed from: s */
        private boolean m11198s(int i2, int i3) {
            return m11199y(i2) && m11199y(i3);
        }

        /* JADX INFO: renamed from: y */
        private boolean m11199y(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        private static int zy(@lvui Context context) {
            if (f19019g == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.qrj.m11262q((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f19019g = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f19019g.intValue();
        }

        /* JADX INFO: renamed from: k */
        void m11200k() {
            if (this.f63045toq.isEmpty()) {
                return;
            }
            int iF7l8 = f7l8();
            int iM11195g = m11195g();
            if (m11198s(iF7l8, iM11195g)) {
                m11197p(iF7l8, iM11195g);
                toq();
            }
        }

        void ld6(@lvui kja0 kja0Var) {
            this.f63045toq.remove(kja0Var);
        }

        /* JADX INFO: renamed from: q */
        void m11201q(@lvui kja0 kja0Var) {
            int iF7l8 = f7l8();
            int iM11195g = m11195g();
            if (m11198s(iF7l8, iM11195g)) {
                kja0Var.mo11172q(iF7l8, iM11195g);
                return;
            }
            if (!this.f63045toq.contains(kja0Var)) {
                this.f63045toq.add(kja0Var);
            }
            if (this.f19022q == null) {
                ViewTreeObserver viewTreeObserver = this.f19021k.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC3178k viewTreeObserverOnPreDrawListenerC3178k = new ViewTreeObserverOnPreDrawListenerC3178k(this);
                this.f19022q = viewTreeObserverOnPreDrawListenerC3178k;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3178k);
            }
        }

        void toq() {
            ViewTreeObserver viewTreeObserver = this.f19021k.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f19022q);
            }
            this.f19022q = null;
            this.f63045toq.clear();
        }
    }

    public ki(@lvui T t2) {
        this.f19015q = (T) com.bumptech.glide.util.qrj.m11262q(t2);
        this.f19014n = new toq(t2);
    }

    @dd
    private Object f7l8() {
        return this.f19015q.getTag(f19011i);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m11191i(int i2) {
        if (f19010h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f19011i = i2;
    }

    private void ki(@dd Object obj) {
        f19010h = true;
        this.f19015q.setTag(f19011i, obj);
    }

    /* JADX INFO: renamed from: s */
    private void m11192s() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f19013g;
        if (onAttachStateChangeListener == null || !this.f19016s) {
            return;
        }
        this.f19015q.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f19016s = false;
    }

    /* JADX INFO: renamed from: y */
    private void m11193y() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f19013g;
        if (onAttachStateChangeListener == null || this.f19016s) {
            return;
        }
        this.f19015q.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f19016s = true;
    }

    void cdj() {
        InterfaceC3170n interfaceC3170nLd6 = ld6();
        if (interfaceC3170nLd6 == null || !interfaceC3170nLd6.mo11171n()) {
            return;
        }
        interfaceC3170nLd6.mo11173s();
    }

    @lvui
    public final ki<T, Z> fn3e() {
        this.f19014n.f63046zy = true;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public final ki<T, Z> m11194g() {
        if (this.f19013g != null) {
            return this;
        }
        this.f19013g = new ViewOnAttachStateChangeListenerC3177k();
        m11193y();
        return this;
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    public void kja0(@dd InterfaceC3170n interfaceC3170n) {
        ki(interfaceC3170n);
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    @dd
    public InterfaceC3170n ld6() {
        Object objF7l8 = f7l8();
        if (objF7l8 == null) {
            return null;
        }
        if (objF7l8 instanceof InterfaceC3170n) {
            return (InterfaceC3170n) objF7l8;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    void n7h() {
        InterfaceC3170n interfaceC3170nLd6 = ld6();
        if (interfaceC3170nLd6 != null) {
            this.f19017y = true;
            interfaceC3170nLd6.clear();
            this.f19017y = false;
        }
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    @InterfaceC7842s
    /* JADX INFO: renamed from: p */
    public void mo6797p(@dd Drawable drawable) {
        super.mo6797p(drawable);
        m11193y();
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @InterfaceC7842s
    public void t8r(@lvui kja0 kja0Var) {
        this.f19014n.m11201q(kja0Var);
    }

    public String toString() {
        return "Target for: " + this.f19015q;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @InterfaceC7842s
    public void toq(@lvui kja0 kja0Var) {
        this.f19014n.ld6(kja0Var);
    }

    @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
    @InterfaceC7842s
    public void x2(@dd Drawable drawable) {
        super.x2(drawable);
        this.f19014n.toq();
        if (this.f19017y) {
            return;
        }
        m11192s();
    }

    @lvui
    public T zy() {
        return this.f19015q;
    }

    @Deprecated
    public ki(@lvui T t2, boolean z2) {
        this(t2);
        if (z2) {
            fn3e();
        }
    }
}
