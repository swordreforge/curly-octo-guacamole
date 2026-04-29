package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a9;
import java.lang.reflect.Field;
import miuix.spring.view.SpringHelper;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import ncyb.C7401k;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpringRecyclerView extends a9 {

    /* JADX INFO: renamed from: c */
    private static final Field f5755c;

    /* JADX INFO: renamed from: e */
    private static final Field f5756e;

    /* JADX INFO: renamed from: f */
    private static final String f5757f = "SpringRecyclerView";

    /* JADX INFO: renamed from: j */
    private static final RecyclerView.x2 f5758j;

    /* JADX INFO: renamed from: h */
    private zy f5759h;

    /* JADX INFO: renamed from: i */
    private C1064q f5760i;

    /* JADX INFO: renamed from: l */
    private SpringHelper f5761l;

    /* JADX INFO: renamed from: r */
    private int f5762r;

    /* JADX INFO: renamed from: t */
    private boolean f5763t;

    /* JADX INFO: renamed from: z */
    private boolean f5764z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.SpringRecyclerView$k */
    private static class C1063k extends EdgeEffect {
        C1063k(Context context) {
            super(context);
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            return false;
        }

        @Override // android.widget.EdgeEffect
        public void finish() {
        }

        @Override // android.widget.EdgeEffect
        @zy.dd
        public BlendMode getBlendMode() {
            return null;
        }

        @Override // android.widget.EdgeEffect
        public int getColor() {
            return 0;
        }

        @Override // android.widget.EdgeEffect
        public int getMaxHeight() {
            return 0;
        }

        @Override // android.widget.EdgeEffect
        public boolean isFinished() {
            return true;
        }

        @Override // android.widget.EdgeEffect
        public void onAbsorb(int i2) {
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f2) {
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f2, float f3) {
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
        }

        @Override // android.widget.EdgeEffect
        public void setBlendMode(@zy.dd BlendMode blendMode) {
        }

        @Override // android.widget.EdgeEffect
        public void setColor(int i2) {
        }

        @Override // android.widget.EdgeEffect
        public void setSize(int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.SpringRecyclerView$q */
    private class C1064q extends androidx.core.view.fti {
        C1064q(@zy.lvui View view) {
            super(view);
        }

        @Override // androidx.core.view.fti
        /* JADX INFO: renamed from: n */
        public void mo3267n(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6, @zy.dd int[] iArr2) {
            SpringRecyclerView.this.f5761l.m26643p(i2, i3, i4, i5, iArr, i6, iArr2);
        }

        void ni7(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6, @zy.dd int[] iArr2) {
            if (SpringRecyclerView.this.f5764z || SpringRecyclerView.this.f5763t) {
                return;
            }
            super.mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
        }

        @Override // androidx.core.view.fti
        /* JADX INFO: renamed from: q */
        public boolean mo3268q(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i4) {
            return SpringRecyclerView.this.f5761l.m26644s(i2, i3, iArr, iArr2, i4);
        }

        boolean zurt(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i4) {
            if (SpringRecyclerView.this.f5764z || SpringRecyclerView.this.f5763t) {
                return false;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            return super.mo3268q(i2, i3, iArr, iArr2, i4);
        }
    }

    private static class toq extends RecyclerView.x2 {
        private toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x2
        @zy.lvui
        /* JADX INFO: renamed from: k */
        protected EdgeEffect mo4876k(@zy.lvui RecyclerView recyclerView, int i2) {
            return new C1063k(recyclerView.getContext());
        }
    }

    private class zy extends a9.C1069k {
        private zy() {
            super();
        }

        void kja0(int i2, int i3) {
            if (i2 != 0) {
                SpringRecyclerView.this.f5764z = true;
            }
            if (i3 != 0) {
                SpringRecyclerView.this.f5763t = true;
            }
            SpringRecyclerView.this.setScrollState(2);
            ld6();
            int i4 = -i2;
            int i5 = -i3;
            this.f5823z.mcp(0, 0, i4, i4, i5, i5);
            mo4783q();
        }

        void n7h(int i2, int i3, int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            SpringRecyclerView.this.f5764z = i4 != 0;
            SpringRecyclerView.this.f5763t = i5 != 0;
            SpringRecyclerView.this.setScrollState(2);
            ld6();
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            if (Integer.signum(i2) * i4 > 0) {
                i6 = -i4;
                i7 = i6;
            } else if (i2 < 0) {
                i7 = -i4;
                i6 = Integer.MIN_VALUE;
            } else {
                i6 = -i4;
                i7 = Integer.MAX_VALUE;
            }
            if (Integer.signum(i3) * i5 > 0) {
                i8 = -i5;
                i9 = i8;
            } else {
                if (i3 < 0) {
                    i11 = -i5;
                } else {
                    i10 = -i5;
                }
                i8 = i10;
                i9 = i11;
            }
            this.f5823z.m26264n(0, 0, i2, i3, i6, i7, i8, i9, SpringRecyclerView.this.getWidth(), SpringRecyclerView.this.getHeight());
            mo4783q();
        }

        void qrj(int i2) {
            SpringRecyclerView.this.f5763t = true;
            SpringRecyclerView.this.setScrollState(2);
            ld6();
            this.f5823z.zurt(0, -i2, SpringRecyclerView.this.getHeight());
        }

        @Override // androidx.recyclerview.widget.a9.C1069k, androidx.recyclerview.widget.RecyclerView.a9
        public void toq(int i2, int i3) {
            int iM26642g = SpringRecyclerView.this.f5761l.m26642g();
            int iF7l8 = SpringRecyclerView.this.f5761l.f7l8();
            if (!SpringRecyclerView.this.ni7() || (iM26642g == 0 && iF7l8 == 0)) {
                super.toq(i2, i3);
            } else {
                n7h(i2, i3, iM26642g, iF7l8);
            }
        }

        void x2(int i2) {
            SpringRecyclerView.this.f5764z = true;
            SpringRecyclerView.this.setScrollState(2);
            ld6();
            this.f5823z.fn3e(0, -i2, SpringRecyclerView.this.getWidth());
        }
    }

    static {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            f5755c = declaredField;
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = RecyclerView.class.getDeclaredField("mScrollingChildHelper");
                f5756e = declaredField2;
                declaredField2.setAccessible(true);
                f5758j = new toq();
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    public SpringRecyclerView(@zy.lvui Context context) {
        this(context, null);
    }

    private void fn3e(androidx.core.view.fti ftiVar) {
        try {
            f5756e.set(this, ftiVar);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ni7() {
        return getOverScrollMode() != 2 && getSpringEnabled();
    }

    private void zurt(a9.C1069k c1069k) {
        try {
            f5755c.set(this, c1069k);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        int iM26642g = this.f5761l.m26642g();
        int iF7l8 = this.f5761l.f7l8();
        if (iM26642g == 0 && iF7l8 == 0) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.translate(-iM26642g, -iF7l8);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // androidx.recyclerview.widget.a9
    public /* bridge */ /* synthetic */ boolean getSpringEnabled() {
        return super.getSpringEnabled();
    }

    @Override // androidx.recyclerview.widget.a9, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.a9, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i2) {
        super.onScrollStateChanged(i2);
        this.f5762r = i2;
        if (ni7() && i2 != 2) {
            if (this.f5764z || this.f5763t) {
                this.f5759h.mo4781g();
                this.f5764z = false;
                this.f5763t = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a9, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.a9, android.view.View
    public /* bridge */ /* synthetic */ void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    void setScrollState(int i2) {
        if (this.f5762r == 1 && i2 == 0) {
            int iM26642g = this.f5761l.m26642g();
            int iF7l8 = this.f5761l.f7l8();
            if (iM26642g != 0 || iF7l8 != 0) {
                this.f5759h.kja0(iM26642g, iF7l8);
                return;
            }
        }
        super.setScrollState(i2);
    }

    @Override // androidx.recyclerview.widget.a9
    public /* bridge */ /* synthetic */ void setSpringEnabled(boolean z2) {
        super.setSpringEnabled(z2);
    }

    @Override // androidx.recyclerview.widget.a9
    /* JADX INFO: renamed from: y */
    protected boolean mo4880y() {
        return this.f5764z || this.f5763t;
    }

    public SpringRecyclerView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7401k.k.f93342ki);
    }

    public SpringRecyclerView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5762r = 0;
        this.f5761l = new SpringHelper() { // from class: androidx.recyclerview.widget.SpringRecyclerView.1

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            miuix.util.toq f52067zy;

            private miuix.util.toq x2() {
                if (this.f52067zy == null) {
                    this.f52067zy = new miuix.util.toq(SpringRecyclerView.this.getContext());
                }
                return this.f52067zy;
            }

            @Override // miuix.spring.view.SpringHelper
            /* JADX INFO: renamed from: k */
            protected boolean mo4881k() {
                RecyclerView.AbstractC1048h abstractC1048h = SpringRecyclerView.this.mLayout;
                return abstractC1048h != null && abstractC1048h.canScrollHorizontally();
            }

            @Override // miuix.spring.view.SpringHelper
            protected boolean ld6() {
                return SpringRecyclerView.this.ni7();
            }

            @Override // miuix.spring.view.SpringHelper
            /* JADX INFO: renamed from: n */
            protected int mo4882n() {
                return SpringRecyclerView.this.getHeight();
            }

            @Override // miuix.spring.view.SpringHelper
            /* JADX INFO: renamed from: q */
            protected void mo4883q(int i3, int i4, int i5, int i6, @zy.dd int[] iArr, int i7, @zy.dd int[] iArr2) {
                SpringRecyclerView.this.f5760i.ni7(i3, i4, i5, i6, iArr, i7, iArr2);
                if (ld6() && SpringRecyclerView.this.f5762r == 2) {
                    if (!SpringRecyclerView.this.f5764z && mo4881k() && i5 != 0) {
                        SpringRecyclerView.this.f5759h.x2(i5);
                    }
                    if (SpringRecyclerView.this.f5763t || !toq() || i6 == 0) {
                        return;
                    }
                    SpringRecyclerView.this.f5759h.qrj(i6);
                }
            }

            @Override // miuix.spring.view.SpringHelper
            protected boolean toq() {
                RecyclerView.AbstractC1048h abstractC1048h = SpringRecyclerView.this.mLayout;
                return abstractC1048h != null && abstractC1048h.canScrollVertically();
            }

            @Override // miuix.spring.view.SpringHelper
            @Keep
            protected void vibrate() {
                if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                    x2().zy(201);
                } else {
                    HapticCompat.performHapticFeedback(SpringRecyclerView.this, C7385p.f92252t8r);
                }
            }

            @Override // miuix.spring.view.SpringHelper
            /* JADX INFO: renamed from: y */
            protected int mo4884y() {
                return SpringRecyclerView.this.getWidth();
            }

            @Override // miuix.spring.view.SpringHelper
            protected boolean zy(int i3, int i4, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i5) {
                if (SpringRecyclerView.this.f5764z && m26642g() == 0) {
                    SpringRecyclerView.this.f5764z = false;
                }
                if (SpringRecyclerView.this.f5763t && f7l8() == 0) {
                    SpringRecyclerView.this.f5763t = false;
                }
                return SpringRecyclerView.this.f5760i.zurt(i3, i4, iArr, iArr2, i5);
            }
        };
        this.f5759h = new zy();
        C1064q c1064q = new C1064q(this);
        this.f5760i = c1064q;
        c1064q.mo3264h(isNestedScrollingEnabled());
        zurt(this.f5759h);
        fn3e(this.f5760i);
        super.setEdgeEffectFactory(f5758j);
        if (miuix.os.toq.f40717k) {
            setSpringEnabled(false);
        }
    }
}
