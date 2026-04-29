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
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.g */
/* JADX INFO: compiled from: CustomViewTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3174g<T extends View, Z> implements InterfaceC3175h<Z> {

    /* JADX INFO: renamed from: p */
    @InterfaceC7843t
    private static final int f18992p = ld6.C2988y.f62373bo;

    /* JADX INFO: renamed from: s */
    private static final String f18993s = "CustomViewTarget";

    /* JADX INFO: renamed from: g */
    private boolean f18994g;

    /* JADX INFO: renamed from: k */
    private final toq f18995k;

    /* JADX INFO: renamed from: n */
    @dd
    private View.OnAttachStateChangeListener f18996n;

    /* JADX INFO: renamed from: q */
    protected final T f18997q;

    /* JADX INFO: renamed from: y */
    private boolean f18998y;

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.g$k */
    /* JADX INFO: compiled from: CustomViewTarget.java */
    class k implements View.OnAttachStateChangeListener {
        k() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC3174g.this.cdj();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC3174g.this.n7h();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.g$toq */
    /* JADX INFO: compiled from: CustomViewTarget.java */
    @yz
    static final class toq {

        /* JADX INFO: renamed from: g */
        @dd
        @yz
        static Integer f19000g;

        /* JADX INFO: renamed from: n */
        private static final int f19001n = 0;

        /* JADX INFO: renamed from: k */
        private final View f19002k;

        /* JADX INFO: renamed from: q */
        @dd
        private k f19003q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<kja0> f63043toq = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f63044zy;

        /* JADX INFO: renamed from: com.bumptech.glide.request.target.g$toq$k */
        /* JADX INFO: compiled from: CustomViewTarget.java */
        private static final class k implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: k */
            private final WeakReference<toq> f19004k;

            k(@lvui toq toqVar) {
                this.f19004k = new WeakReference<>(toqVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(AbstractC3174g.f18993s, 2)) {
                    Log.v(AbstractC3174g.f18993s, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                toq toqVar = this.f19004k.get();
                if (toqVar == null) {
                    return true;
                }
                toqVar.m11187k();
                return true;
            }
        }

        toq(@lvui View view) {
            this.f19002k = view;
        }

        private int f7l8() {
            int paddingLeft = this.f19002k.getPaddingLeft() + this.f19002k.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f19002k.getLayoutParams();
            return m11183n(this.f19002k.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: g */
        private int m11182g() {
            int paddingTop = this.f19002k.getPaddingTop() + this.f19002k.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f19002k.getLayoutParams();
            return m11183n(this.f19002k.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: n */
        private int m11183n(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.f63044zy && this.f19002k.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f19002k.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable(AbstractC3174g.f18993s, 4)) {
                Log.i(AbstractC3174g.f18993s, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return zy(this.f19002k.getContext());
        }

        /* JADX INFO: renamed from: p */
        private void m11184p(int i2, int i3) {
            Iterator it = new ArrayList(this.f63043toq).iterator();
            while (it.hasNext()) {
                ((kja0) it.next()).mo11172q(i2, i3);
            }
        }

        /* JADX INFO: renamed from: s */
        private boolean m11185s(int i2, int i3) {
            return m11186y(i2) && m11186y(i3);
        }

        /* JADX INFO: renamed from: y */
        private boolean m11186y(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        private static int zy(@lvui Context context) {
            if (f19000g == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.qrj.m11262q((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f19000g = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f19000g.intValue();
        }

        /* JADX INFO: renamed from: k */
        void m11187k() {
            if (this.f63043toq.isEmpty()) {
                return;
            }
            int iF7l8 = f7l8();
            int iM11182g = m11182g();
            if (m11185s(iF7l8, iM11182g)) {
                m11184p(iF7l8, iM11182g);
                toq();
            }
        }

        void ld6(@lvui kja0 kja0Var) {
            this.f63043toq.remove(kja0Var);
        }

        /* JADX INFO: renamed from: q */
        void m11188q(@lvui kja0 kja0Var) {
            int iF7l8 = f7l8();
            int iM11182g = m11182g();
            if (m11185s(iF7l8, iM11182g)) {
                kja0Var.mo11172q(iF7l8, iM11182g);
                return;
            }
            if (!this.f63043toq.contains(kja0Var)) {
                this.f63043toq.add(kja0Var);
            }
            if (this.f19003q == null) {
                ViewTreeObserver viewTreeObserver = this.f19002k.getViewTreeObserver();
                k kVar = new k(this);
                this.f19003q = kVar;
                viewTreeObserver.addOnPreDrawListener(kVar);
            }
        }

        void toq() {
            ViewTreeObserver viewTreeObserver = this.f19002k.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f19003q);
            }
            this.f19003q = null;
            this.f63043toq.clear();
        }
    }

    public AbstractC3174g(@lvui T t2) {
        this.f18997q = (T) com.bumptech.glide.util.qrj.m11262q(t2);
        this.f18995k = new toq(t2);
    }

    private void f7l8() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18996n;
        if (onAttachStateChangeListener == null || !this.f18998y) {
            return;
        }
        this.f18997q.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f18998y = false;
    }

    /* JADX INFO: renamed from: g */
    private void m11177g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18996n;
        if (onAttachStateChangeListener == null || this.f18998y) {
            return;
        }
        this.f18997q.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f18998y = true;
    }

    private void ki(@dd Object obj) {
        this.f18997q.setTag(f18992p, obj);
    }

    @dd
    /* JADX INFO: renamed from: q */
    private Object m11178q() {
        return this.f18997q.getTag(f18992p);
    }

    final void cdj() {
        InterfaceC3170n interfaceC3170nLd6 = ld6();
        if (interfaceC3170nLd6 == null || !interfaceC3170nLd6.mo11171n()) {
            return;
        }
        interfaceC3170nLd6.mo11173s();
    }

    @lvui
    public final AbstractC3174g<T, Z> fn3e() {
        this.f18995k.f63044zy = true;
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public final AbstractC3174g<T, Z> m11179i(@InterfaceC7843t int i2) {
        return this;
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void kja0(@dd InterfaceC3170n interfaceC3170n) {
        ki(interfaceC3170n);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @dd
    public final InterfaceC3170n ld6() {
        Object objM11178q = m11178q();
        if (objM11178q == null) {
            return null;
        }
        if (objM11178q instanceof InterfaceC3170n) {
            return (InterfaceC3170n) objM11178q;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public final T m11180n() {
        return this.f18997q;
    }

    final void n7h() {
        InterfaceC3170n interfaceC3170nLd6 = ld6();
        if (interfaceC3170nLd6 != null) {
            this.f18994g = true;
            interfaceC3170nLd6.clear();
            this.f18994g = false;
        }
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: p */
    public final void mo6797p(@dd Drawable drawable) {
        m11177g();
        m11181s(drawable);
    }

    /* JADX INFO: renamed from: s */
    protected void m11181s(@dd Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void t8r(@lvui kja0 kja0Var) {
        this.f18995k.m11188q(kja0Var);
    }

    public String toString() {
        return "Target for: " + this.f18997q;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void toq(@lvui kja0 kja0Var) {
        this.f18995k.ld6(kja0Var);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void x2(@dd Drawable drawable) {
        this.f18995k.toq();
        mo10626y(drawable);
        if (this.f18994g) {
            return;
        }
        f7l8();
    }

    /* JADX INFO: renamed from: y */
    protected abstract void mo10626y(@dd Drawable drawable);

    @lvui
    public final AbstractC3174g<T, Z> zy() {
        if (this.f18996n != null) {
            return this;
        }
        this.f18996n = new k();
        m11177g();
        return this;
    }
}
