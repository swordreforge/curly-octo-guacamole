package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.gyi;
import java.lang.reflect.Field;
import p030n.C7397k;

/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
class d2ok extends ListView {

    /* JADX INFO: renamed from: c */
    public static final int f977c = -1;

    /* JADX INFO: renamed from: e */
    public static final int f978e = -1;

    /* JADX INFO: renamed from: f */
    toq f979f;

    /* JADX INFO: renamed from: g */
    private int f980g;

    /* JADX INFO: renamed from: h */
    private C0186k f981h;

    /* JADX INFO: renamed from: i */
    private boolean f982i;

    /* JADX INFO: renamed from: k */
    private final Rect f983k;

    /* JADX INFO: renamed from: l */
    private androidx.core.widget.n7h f984l;

    /* JADX INFO: renamed from: n */
    private int f985n;

    /* JADX INFO: renamed from: p */
    private Field f986p;

    /* JADX INFO: renamed from: q */
    private int f987q;

    /* JADX INFO: renamed from: r */
    private gyi f988r;

    /* JADX INFO: renamed from: s */
    private int f989s;

    /* JADX INFO: renamed from: t */
    private boolean f990t;

    /* JADX INFO: renamed from: y */
    private int f991y;

    /* JADX INFO: renamed from: z */
    private boolean f992z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.d2ok$k */
    /* JADX INFO: compiled from: DropDownListView.java */
    private static class C0186k extends androidx.appcompat.graphics.drawable.zy {

        /* JADX INFO: renamed from: q */
        private boolean f993q;

        C0186k(Drawable drawable) {
            super(drawable);
            this.f993q = true;
        }

        @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f993q) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f993q) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f993q) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f993q) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f993q) {
                return super.setVisible(z2, z3);
            }
            return false;
        }

        void zy(boolean z2) {
            this.f993q = z2;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    private class toq implements Runnable {
        toq() {
        }

        /* JADX INFO: renamed from: k */
        public void m575k() {
            d2ok d2okVar = d2ok.this;
            d2okVar.f979f = null;
            d2okVar.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d2ok d2okVar = d2ok.this;
            d2okVar.f979f = null;
            d2okVar.drawableStateChanged();
        }

        public void toq() {
            d2ok.this.post(this);
        }
    }

    d2ok(@zy.lvui Context context, boolean z2) {
        super(context, null, C7397k.toq.f92914mbx);
        this.f983k = new Rect();
        this.f987q = 0;
        this.f985n = 0;
        this.f980g = 0;
        this.f991y = 0;
        this.f992z = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f986p = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void f7l8(int i2, View view) {
        Rect rect = this.f983k;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f987q;
        rect.top -= this.f985n;
        rect.right += this.f980g;
        rect.bottom += this.f991y;
        try {
            boolean z2 = this.f986p.getBoolean(this);
            if (view.isEnabled() != z2) {
                this.f986p.set(this, Boolean.valueOf(!z2));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m571k() {
        this.f990t = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f989s - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        gyi gyiVar = this.f988r;
        if (gyiVar != null) {
            gyiVar.m3298q();
            this.f988r = null;
        }
    }

    private boolean ld6() {
        return this.f990t;
    }

    /* JADX INFO: renamed from: p */
    private void m572p(View view, int i2, float f2, float f3) {
        View childAt;
        this.f990t = true;
        drawableHotspotChanged(f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f989s;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f989s = i2;
        view.drawableHotspotChanged(f2 - view.getLeft(), f3 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m573s(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: s */
    private void m573s(int i2, View view, float f2, float f3) {
        m574y(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        androidx.core.graphics.drawable.zy.ld6(selector, f2, f3);
    }

    private void setSelectorEnabled(boolean z2) {
        C0186k c0186k = this.f981h;
        if (c0186k != null) {
            c0186k.zy(z2);
        }
    }

    private void toq(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void x2() {
        Drawable selector = getSelector();
        if (selector != null && ld6() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX INFO: renamed from: y */
    private void m574y(int i2, View view) {
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f7l8(i2, view);
        if (z2) {
            Rect rect = this.f983k;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.zy.ld6(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void zy(Canvas canvas) {
        Drawable selector;
        if (this.f983k.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f983k);
        selector.draw(canvas);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        zy(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f979f != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        x2();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo472g(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m572p(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.toq(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m571k()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.n7h r9 = r7.f984l
            if (r9 != 0) goto L5a
            androidx.core.widget.n7h r9 = new androidx.core.widget.n7h
            r9.<init>(r7)
            r7.f984l = r9
        L5a:
            androidx.core.widget.n7h r9 = r7.f984l
            r9.kja0(r2)
            androidx.core.widget.n7h r9 = r7.f984l
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.n7h r8 = r7.f984l
            if (r8 == 0) goto L6c
            r8.kja0(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d2ok.mo472g(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f992z || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f992z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f992z || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f992z && this.f982i) || super.isInTouchMode();
    }

    /* JADX INFO: renamed from: n */
    public int mo473n(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return (i6 < 0 || i7 <= i6 || i9 <= 0 || measuredHeight == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i7 >= i6) {
                i9 = measuredHeight;
            }
            i7++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f979f = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@zy.lvui MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f979f == null) {
            toq toqVar = new toq();
            this.f979f = toqVar;
            toqVar.toq();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                x2();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f989s = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        toq toqVar = this.f979f;
        if (toqVar != null) {
            toqVar.m575k();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: q */
    public int mo474q(int i2, boolean z2) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z2) {
                    iMin = Math.max(0, i2);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i2, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i2 >= 0 && i2 < count) {
                return i2;
            }
        }
        return -1;
    }

    void setListSelectionHidden(boolean z2) {
        this.f982i = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0186k c0186k = drawable != null ? new C0186k(drawable) : null;
        this.f981h = c0186k;
        super.setSelector(c0186k);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f987q = rect.left;
        this.f985n = rect.top;
        this.f980g = rect.right;
        this.f991y = rect.bottom;
    }
}
