package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.core.view.dr;
import androidx.core.view.gyi;
import p030n.C7397k;

/* JADX INFO: renamed from: androidx.appcompat.widget.k */
/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0197k extends ViewGroup {

    /* JADX INFO: renamed from: i */
    private static final int f1072i = 200;

    /* JADX INFO: renamed from: g */
    protected ActionMenuPresenter f1073g;

    /* JADX INFO: renamed from: h */
    private boolean f1074h;

    /* JADX INFO: renamed from: k */
    protected final toq f1075k;

    /* JADX INFO: renamed from: n */
    protected ActionMenuView f1076n;

    /* JADX INFO: renamed from: p */
    private boolean f1077p;

    /* JADX INFO: renamed from: q */
    protected final Context f1078q;

    /* JADX INFO: renamed from: s */
    protected gyi f1079s;

    /* JADX INFO: renamed from: y */
    protected int f1080y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$k */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0197k.this.kja0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$toq */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    protected class toq implements dr {

        /* JADX INFO: renamed from: k */
        private boolean f1082k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f46905toq;

        protected toq() {
        }

        @Override // androidx.core.view.dr
        /* JADX INFO: renamed from: k */
        public void mo543k(View view) {
            this.f1082k = true;
        }

        /* JADX INFO: renamed from: q */
        public toq m624q(gyi gyiVar, int i2) {
            AbstractC0197k.this.f1079s = gyiVar;
            this.f46905toq = i2;
            return this;
        }

        @Override // androidx.core.view.dr
        public void toq(View view) {
            if (this.f1082k) {
                return;
            }
            AbstractC0197k abstractC0197k = AbstractC0197k.this;
            abstractC0197k.f1079s = null;
            AbstractC0197k.super.setVisibility(this.f46905toq);
        }

        @Override // androidx.core.view.dr
        public void zy(View view) {
            AbstractC0197k.super.setVisibility(0);
            this.f1082k = false;
        }
    }

    AbstractC0197k(@zy.lvui Context context) {
        this(context, null);
    }

    protected static int ld6(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    public boolean f7l8() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.jp0y();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo409g() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.a9();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f1079s != null ? this.f1075k.f46905toq : getVisibility();
    }

    public int getContentHeight() {
        return this.f1080y;
    }

    public boolean kja0() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.ncyb();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void mo412n() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m430t();
        }
    }

    public gyi n7h(int i2, long j2) {
        gyi gyiVar = this.f1079s;
        if (gyiVar != null) {
            gyiVar.m3298q();
        }
        if (i2 != 0) {
            gyi qVar = C0683f.f7l8(this).toq(0.0f);
            qVar.t8r(j2);
            qVar.fn3e(this.f1075k.m624q(qVar, i2));
            return qVar;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        gyi qVar2 = C0683f.f7l8(this).toq(1.0f);
        qVar2.t8r(j2);
        qVar2.fn3e(this.f1075k.m624q(qVar2, i2));
        return qVar2;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C7397k.qrj.f42457k, C7397k.toq.f42483g, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C7397k.qrj.f42464r, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.oc(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1074h = false;
        }
        if (!this.f1074h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1074h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1074h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1077p = false;
        }
        if (!this.f1077p) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1077p = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1077p = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    protected int m623p(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo413q() {
        return mo414s() && getVisibility() == 0;
    }

    public void qrj() {
        post(new k());
    }

    /* JADX INFO: renamed from: s */
    public boolean mo414s() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        return actionMenuPresenter != null && actionMenuPresenter.d3();
    }

    public void setContentHeight(int i2) {
        this.f1080y = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            gyi gyiVar = this.f1079s;
            if (gyiVar != null) {
                gyiVar.m3298q();
            }
            super.setVisibility(i2);
        }
    }

    protected int x2(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo415y() {
        ActionMenuPresenter actionMenuPresenter = this.f1073g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.gvn7();
        }
        return false;
    }

    public void zy(int i2) {
        n7h(i2, 200L).m3302z();
    }

    AbstractC0197k(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbstractC0197k(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1075k = new toq();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C7397k.toq.f93013zy, typedValue, true) && typedValue.resourceId != 0) {
            this.f1078q = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1078q = context;
        }
    }
}
