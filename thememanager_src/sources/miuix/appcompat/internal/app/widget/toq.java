package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import gb.toq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.InterfaceC6952n;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.C7020g;
import xm.C7752g;
import xm.C7756y;
import zy.dd;

/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class toq extends ViewGroup {
    static final int as = 1;
    protected static final int az = 20;
    protected static final int ba = Integer.MIN_VALUE;
    static final int bg = 2;
    static final int bl = 0;

    /* JADX INFO: renamed from: a */
    int f39308a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    float f86976ab;
    protected boolean an;

    /* JADX INFO: renamed from: b */
    int f39309b;
    int bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f86977bo;
    protected int bp;
    protected Rect bv;

    /* JADX INFO: renamed from: c */
    protected int f39310c;

    /* JADX INFO: renamed from: d */
    protected boolean f39311d;

    /* JADX INFO: renamed from: e */
    protected int f39312e;

    /* JADX INFO: renamed from: f */
    protected boolean f39313f;

    /* JADX INFO: renamed from: g */
    protected AnimConfig f39314g;

    /* JADX INFO: renamed from: h */
    protected boolean f39315h;

    /* JADX INFO: renamed from: i */
    protected ActionMenuView f39316i;
    protected TransitionListener id;
    protected View.OnClickListener in;

    /* JADX INFO: renamed from: j */
    protected int f39317j;

    /* JADX INFO: renamed from: k */
    protected AnimConfig f39318k;

    /* JADX INFO: renamed from: l */
    protected boolean f39319l;

    /* JADX INFO: renamed from: m */
    List<InterfaceC6952n> f39320m;

    /* JADX INFO: renamed from: n */
    protected AnimConfig f39321n;

    /* JADX INFO: renamed from: o */
    protected int f39322o;

    /* JADX INFO: renamed from: p */
    protected boolean f39323p;

    /* JADX INFO: renamed from: q */
    protected AnimConfig f39324q;

    /* JADX INFO: renamed from: r */
    protected boolean f39325r;

    /* JADX INFO: renamed from: s */
    protected AnimConfig f39326s;

    /* JADX INFO: renamed from: t */
    protected ActionBarContainer f39327t;

    /* JADX INFO: renamed from: u */
    int f39328u;

    /* JADX INFO: renamed from: v */
    protected boolean f39329v;

    /* JADX INFO: renamed from: w */
    protected int f39330w;

    /* JADX INFO: renamed from: x */
    int f39331x;

    /* JADX INFO: renamed from: y */
    protected AnimConfig f39332y;

    /* JADX INFO: renamed from: z */
    protected ActionMenuPresenter f39333z;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.toq$k */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    class C6999k extends TransitionListener {
        C6999k() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            List<InterfaceC6952n> list = toq.this.f39320m;
            if (list != null) {
                Iterator<InterfaceC6952n> it = list.iterator();
                while (it.hasNext()) {
                    it.next().m25059g(obj);
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            List<InterfaceC6952n> list = toq.this.f39320m;
            if (list != null) {
                Iterator<InterfaceC6952n> it = list.iterator();
                while (it.hasNext()) {
                    it.next().toq(obj);
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            List<InterfaceC6952n> list = toq.this.f39320m;
            if (list != null) {
                Iterator<InterfaceC6952n> it = list.iterator();
                while (it.hasNext()) {
                    it.next().zy(obj, collection);
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    protected static class C8098toq {

        /* JADX INFO: renamed from: q */
        private boolean f39336q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f86979zy;

        /* JADX INFO: renamed from: k */
        private List<View> f39335k = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f86978toq = true;

        /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.toq$toq$k */
        /* JADX INFO: compiled from: AbsActionBarView.java */
        class ViewOnAttachStateChangeListenerC7000k implements View.OnAttachStateChangeListener {
            ViewOnAttachStateChangeListenerC7000k() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Folme.clean(view);
            }
        }

        protected C8098toq() {
        }

        public void f7l8() {
            Iterator<View> it = this.f39335k.iterator();
            while (it.hasNext()) {
                it.next().setEnabled(true);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m25230g() {
            for (View view : this.f39335k) {
                view.clearFocus();
                view.setEnabled(false);
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m25231k(float f2, int i2, int i3, AnimConfig animConfig) {
            if (this.f39336q) {
                return;
            }
            if (!this.f86978toq) {
                f2 = this.f86979zy;
            }
            AnimState animStateAdd = new AnimState("to").add(ViewProperty.ALPHA, f2).add(ViewProperty.TRANSLATION_X, i2).add(ViewProperty.TRANSLATION_Y, i3);
            for (View view : this.f39335k) {
                if (view.isAttachedToWindow() && (view.getAlpha() != f2 || view.getTranslationX() != i2 || view.getTranslationY() != i3)) {
                    Folme.useAt(view).state().to(animStateAdd, animConfig);
                }
            }
        }

        public void ld6(float f2, int i2, int i3, boolean z2) {
            if (this.f39336q) {
                return;
            }
            AnimState animStateAdd = new AnimState("from").add(ViewProperty.ALPHA, this.f86978toq ? f2 : this.f86979zy).add(ViewProperty.TRANSLATION_X, i2).add(ViewProperty.TRANSLATION_Y, i3);
            for (View view : this.f39335k) {
                if (z2) {
                    view.setAlpha(f2);
                    view.setTranslationX(i2);
                    view.setTranslationY(i3);
                }
                if (view.isAttachedToWindow()) {
                    Folme.useAt(view).state().setTo(animStateAdd);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m25232n() {
            this.f39336q = true;
            Iterator<View> it = this.f39335k.iterator();
            while (it.hasNext()) {
                Folme.clean(it.next());
            }
        }

        /* JADX INFO: renamed from: p */
        public void m25233p(float f2, int i2, int i3) {
            ld6(f2, i2, i3, false);
        }

        /* JADX INFO: renamed from: q */
        public void m25234q() {
            this.f39336q = false;
        }

        public void qrj(int i2) {
            for (View view : this.f39335k) {
                view.setVisibility(i2);
                if (i2 != 0) {
                    view.clearFocus();
                }
            }
        }

        /* JADX INFO: renamed from: s */
        public void m25235s(float f2) {
            if (this.f39336q) {
                return;
            }
            this.f86979zy = f2;
            Iterator<View> it = this.f39335k.iterator();
            while (it.hasNext()) {
                Folme.useAt(it.next()).state().setTo(ViewProperty.ALPHA, Float.valueOf(f2));
            }
        }

        public void toq(View view) {
            if (this.f39335k.contains(view)) {
                return;
            }
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7000k());
            this.f39335k.add(view);
        }

        public void x2(int i2, int i3) {
            if (this.f39336q) {
                return;
            }
            for (View view : this.f39335k) {
                if (view.isAttachedToWindow()) {
                    Folme.useAt(view).state().setTo(ViewProperty.TRANSLATION_X, Integer.valueOf(i2), ViewProperty.TRANSLATION_Y, Integer.valueOf(i3));
                }
            }
        }

        /* JADX INFO: renamed from: y */
        public void m25236y(boolean z2) {
            this.f86978toq = z2;
        }

        public void zy(View view) {
            if (view == null || !this.f39335k.contains(view)) {
                return;
            }
            this.f39335k.remove(view);
        }
    }

    toq(Context context) {
        this(context, null);
    }

    private void setTitleMaxHeight(int i2) {
        this.f39312e = i2;
        requestLayout();
    }

    private void setTitleMinHeight(int i2) {
        this.f39310c = i2;
        requestLayout();
    }

    protected int a9(View view, int i2, int i3, int i4) {
        return fti(view, i2, i3, i4, true);
    }

    @dd
    public abstract View cdj(int i2);

    public void d3() {
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f39260k.eqxt();
            }
        });
    }

    public boolean eqxt() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.lv5();
    }

    public boolean fn3e() {
        return this.f86977bo;
    }

    protected int fti(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (!z2) {
            i5 = (this.f39310c - measuredHeight) / 2;
        }
        int i6 = i5;
        miuix.internal.util.n7h.kja0(this, view, i2, i6, i2 + measuredWidth, i6 + measuredHeight);
        return measuredWidth;
    }

    protected void fu4(int i2, int i3) {
    }

    int getActionBarStyle() {
        return R.attr.actionBarStyle;
    }

    public ActionMenuView getActionMenuView() {
        return this.f39316i;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public abstract C7752g getCollapseTitle();

    public int getExpandState() {
        return this.f39331x;
    }

    public abstract C7756y getExpandTitle();

    public ActionMenuView getMenuView() {
        return this.f39316i;
    }

    protected int gvn7(View view, int i2, int i3, int i4, boolean z2, int i5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i3 + ((i4 - measuredHeight) / 2);
        if (!z2) {
            i6 = (this.f39310c - measuredHeight) / 2;
        }
        int i7 = i6;
        miuix.internal.util.n7h.kja0(this, view, i2 + i5, i7, i2 + measuredWidth + i5, i7 + measuredHeight);
        return measuredWidth + i5;
    }

    @dd
    /* JADX INFO: renamed from: h */
    public abstract View mo25119h(int i2);

    /* JADX INFO: renamed from: i */
    public boolean mo25120i() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.ek5k();
    }

    public void jk(View view, int i2) {
    }

    protected int jp0y(View view, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = (this.f39310c - measuredHeight) / 2;
        miuix.internal.util.n7h.kja0(this, view, i2 - measuredWidth, i5, i2, i5 + measuredHeight);
        return measuredWidth;
    }

    public boolean ki() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.hb(false);
    }

    public void kja0() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m25275c(false);
        }
    }

    public boolean mcp(View view, View view2, int i2, int i3) {
        return false;
    }

    void n7h(List<InterfaceC6952n> list) {
        this.f39320m = list;
    }

    protected int ni7(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public void o1t(View view, int i2, int i3, int[] iArr, int i4, int[] iArr2) {
    }

    public abstract void oc();

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f39313f) {
            setSplitActionBar(getContext().getResources().getBoolean(toq.C6053n.f34874n));
        }
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.y9n(configuration);
        }
    }

    public void qrj(int i2) {
        ActionMenuView actionMenuView;
        clearAnimation();
        if (i2 != getVisibility()) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i2 == 0 ? toq.C6052k.f76005kja0 : toq.C6052k.f34816h);
            startAnimation(animationLoadAnimation);
            setVisibility(i2);
            if (this.f39327t == null || (actionMenuView = this.f39316i) == null) {
                return;
            }
            actionMenuView.startAnimation(animationLoadAnimation);
            this.f39316i.setVisibility(i2);
        }
    }

    protected void setActionMenuItemLimit(int i2) {
        this.bp = i2;
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter == null || (actionMenuPresenter instanceof C7020g)) {
            return;
        }
        actionMenuPresenter.zp(i2);
    }

    public void setBottomMenuMode(int i2) {
        this.bb = i2;
    }

    public void setExpandState(int i2) {
        setExpandState(i2, false, false);
    }

    protected void setExpandStateByUser(int i2) {
        if (i2 != -1) {
            this.f39311d = true;
            this.f39330w = i2;
        } else {
            this.f39311d = false;
            this.f39330w = -1;
        }
    }

    public void setPendingInset(Rect rect) {
        Rect rect2;
        if (rect == null) {
            return;
        }
        boolean z2 = (this.f39316i == null || (rect2 = this.bv) == null || rect2.bottom == rect.bottom) ? false : true;
        if (this.bv == null) {
            this.bv = new Rect();
        }
        this.bv.set(rect);
        if (z2) {
            oc();
        }
    }

    public void setResizable(boolean z2) {
        this.f86977bo = z2;
    }

    public void setSplitActionBar(boolean z2) {
        this.f39325r = z2;
    }

    public void setSplitView(ActionBarContainer actionBarContainer) {
        this.f39327t = actionBarContainer;
    }

    public void setSplitWhenNarrow(boolean z2) {
        this.f39313f = z2;
    }

    public void setSubTitleClickListener(View.OnClickListener onClickListener) {
        this.in = onClickListener;
    }

    public void setTitleClickable(boolean z2) {
        this.f39329v = z2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo25125t(View view, View view2, int i2, int i3) {
    }

    public boolean t8r() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.m25280m();
    }

    public void wvg(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
    }

    /* JADX INFO: renamed from: z */
    protected void mo25128z(int i2, int i3) {
    }

    public boolean zurt() {
        return this.f39311d;
    }

    toq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setExpandState(int i2, boolean z2, boolean z3) {
        int i3;
        if ((this.f86977bo || z3) && (i3 = this.f39309b) != i2) {
            if (z2) {
                fu4(i3, i2);
                return;
            }
            if (i2 == 2) {
                this.f39308a = this.f39331x;
            }
            this.f39309b = i2;
            if (i2 == 0) {
                this.f39331x = 0;
            } else if (i2 == 1) {
                this.f39331x = 1;
            }
            mo25128z(i3, i2);
            this.f39328u = this.f39331x;
            requestLayout();
        }
    }

    toq(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39309b = 1;
        this.f39308a = 1;
        this.f39331x = 1;
        this.f39328u = 1;
        this.f86977bo = true;
        this.f39329v = true;
        this.f86976ab = 0.0f;
        this.bb = 2;
        this.bp = Integer.MIN_VALUE;
        this.an = false;
        this.id = new C6999k();
        this.in = null;
        this.f39311d = false;
        this.f39330w = -1;
        this.f39317j = context.getResources().getDimensionPixelSize(toq.f7l8.f75483ngy);
        this.f39322o = context.getResources().getDimensionPixelSize(toq.f7l8.f75444jbh);
        this.f39318k = new AnimConfig().setEase(-2, 1.0f, 0.3f);
        this.f39321n = new AnimConfig().setEase(-2, 1.0f, 0.3f).addListeners(this.id);
        this.f39324q = new AnimConfig().setEase(-2, 1.0f, 0.15f);
        this.f39314g = new AnimConfig().setEase(-2, 1.0f, 0.15f).addListeners(this.id);
        this.f39332y = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        this.f39326s = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.f34844k, R.attr.actionBarStyle, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(toq.ki.f76074eqxt, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76098hb, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f34835b, true);
        typedArrayObtainStyledAttributes.recycle();
        if (zurt()) {
            int i4 = this.f39330w;
            this.f39309b = i4;
            this.f39331x = i4;
        } else if (i3 == 0) {
            this.f39309b = 0;
            this.f39331x = 0;
        } else {
            this.f39309b = 1;
            this.f39331x = 1;
        }
        this.f86977bo = z2;
        this.f39329v = z3;
    }
}
