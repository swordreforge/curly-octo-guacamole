package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private View f599g;

    /* JADX INFO: renamed from: h */
    boolean f600h;

    /* JADX INFO: renamed from: i */
    boolean f601i;

    /* JADX INFO: renamed from: k */
    private boolean f602k;

    /* JADX INFO: renamed from: n */
    private View f603n;

    /* JADX INFO: renamed from: p */
    Drawable f604p;

    /* JADX INFO: renamed from: q */
    private View f605q;

    /* JADX INFO: renamed from: s */
    Drawable f606s;

    /* JADX INFO: renamed from: y */
    Drawable f607y;

    /* JADX INFO: renamed from: z */
    private int f608z;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private int m408k(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean toq(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f607y;
        if (drawable != null && drawable.isStateful()) {
            this.f607y.setState(getDrawableState());
        }
        Drawable drawable2 = this.f606s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f606s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f604p;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f604p.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f605q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f607y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f606s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f604p;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f603n = findViewById(C7397k.f7l8.f42327k);
        this.f599g = findViewById(C7397k.f7l8.f42339y);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f602k || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f605q
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f600h
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f604p
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f607y
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f603n
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f607y
            android.view.View r7 = r4.f603n
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f603n
            int r8 = r8.getTop()
            android.view.View r0 = r4.f603n
            int r0 = r0.getRight()
            android.view.View r2 = r4.f603n
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f599g
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f607y
            android.view.View r7 = r4.f599g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f599g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f599g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f599g
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f607y
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f601i = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f606s
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f603n == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f608z) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f603n == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f605q;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!toq(this.f603n) ? m408k(this.f603n) : !toq(this.f599g) ? m408k(this.f599g) : 0) + m408k(this.f605q), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f607y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f607y);
        }
        this.f607y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f603n;
            if (view != null) {
                this.f607y.setBounds(view.getLeft(), this.f603n.getTop(), this.f603n.getRight(), this.f603n.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f600h ? this.f607y != null || this.f606s != null : this.f604p != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f604p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f604p);
        }
        this.f604p = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f600h && (drawable2 = this.f604p) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f600h ? !(this.f607y != null || this.f606s != null) : this.f604p == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f606s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f606s);
        }
        this.f606s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f601i && (drawable2 = this.f606s) != null) {
                drawable2.setBounds(this.f605q.getLeft(), this.f605q.getTop(), this.f605q.getRight(), this.f605q.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f600h ? this.f607y != null || this.f606s != null : this.f604p != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f605q;
        if (view != null) {
            removeView(view);
        }
        this.f605q = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f602k = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f607y;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f606s;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f604p;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f607y && !this.f600h) || (drawable == this.f606s && this.f601i) || ((drawable == this.f604p && this.f600h) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0683f.wlev(this, new toq(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.f42457k);
        this.f607y = typedArrayObtainStyledAttributes.getDrawable(C7397k.qrj.f92719ni7);
        this.f606s = typedArrayObtainStyledAttributes.getDrawable(C7397k.qrj.f42472z);
        this.f608z = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.f42464r, -1);
        boolean z2 = true;
        if (getId() == C7397k.f7l8.f92304bf2) {
            this.f600h = true;
            this.f604p = typedArrayObtainStyledAttributes.getDrawable(C7397k.qrj.f92655fu4);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f600h ? this.f607y != null || this.f606s != null : this.f604p != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }
}
