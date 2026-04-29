package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.ui.hyr;
import com.google.android.exoplayer2.util.C3844k;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTimeBar extends View implements hyr {
    public static final int ac = 4;
    public static final int ad = 26;
    public static final int aj = 16;
    public static final int am = 4;
    public static final int ar = -855638017;
    public static final int ay = 12;
    public static final int bc = -1;
    public static final int bd = 872414976;
    public static final int be = 0;
    public static final int bs = -1;
    public static final int bu = -1291845888;
    private static final float dy = 1.0f;
    public static final int k0 = 872415231;
    private static final String k6e = "android.widget.SeekBar";
    private static final int sk1t = 20;
    private static final int tgs = -50;
    public static final int tlhn = 0;
    private static final float vb6 = 0.0f;
    public static final int w97r = 1;
    private static final int yl25 = 3;
    private static final long zmmu = 1000;

    /* JADX INFO: renamed from: a */
    private final StringBuilder f22373a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long f66069ab;
    private float an;
    private long as;

    @zy.dd
    private long[] ax;
    private long az;

    /* JADX INFO: renamed from: b */
    private final int f22374b;
    private int ba;
    private int bb;
    private long bg;
    private long bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final CopyOnWriteArraySet<hyr.InterfaceC3749k> f66070bo;
    private Rect bp;

    @zy.dd
    private boolean[] bq;
    private ValueAnimator bv;

    /* JADX INFO: renamed from: c */
    private final int f22375c;

    /* JADX INFO: renamed from: d */
    private final float f22376d;

    /* JADX INFO: renamed from: e */
    private final int f22377e;

    /* JADX INFO: renamed from: f */
    private final int f22378f;

    /* JADX INFO: renamed from: g */
    private final Rect f22379g;

    /* JADX INFO: renamed from: h */
    private final Paint f22380h;

    /* JADX INFO: renamed from: i */
    private final Paint f22381i;
    private boolean id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private final int f22382j;

    /* JADX INFO: renamed from: k */
    private final Rect f22383k;

    /* JADX INFO: renamed from: l */
    private final int f22384l;

    /* JADX INFO: renamed from: m */
    private final int f22385m;

    /* JADX INFO: renamed from: n */
    private final Rect f22386n;

    /* JADX INFO: renamed from: o */
    private final int f22387o;

    /* JADX INFO: renamed from: p */
    private final Paint f22388p;

    /* JADX INFO: renamed from: q */
    private final Rect f22389q;

    /* JADX INFO: renamed from: r */
    private final int f22390r;

    /* JADX INFO: renamed from: s */
    private final Paint f22391s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private final Drawable f22392t;

    /* JADX INFO: renamed from: u */
    private final Runnable f22393u;

    /* JADX INFO: renamed from: v */
    private final Point f22394v;

    /* JADX INFO: renamed from: w */
    private int f22395w;

    /* JADX INFO: renamed from: x */
    private final Formatter f22396x;

    /* JADX INFO: renamed from: y */
    private final Paint f22397y;

    /* JADX INFO: renamed from: z */
    private final Paint f22398z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private boolean cdj(Drawable drawable) {
        return com.google.android.exoplayer2.util.lrht.f23230k >= 23 && ki(drawable, getLayoutDirection());
    }

    private void f7l8(Canvas canvas) {
        int iHeight = this.f22389q.height();
        int iCenterY = this.f22389q.centerY() - (iHeight / 2);
        int i2 = iHeight + iCenterY;
        if (this.as <= 0) {
            Rect rect = this.f22389q;
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, this.f22388p);
            return;
        }
        Rect rect2 = this.f22386n;
        int i3 = rect2.left;
        int i4 = rect2.right;
        int iMax = Math.max(Math.max(this.f22389q.left, i4), this.f22379g.right);
        int i5 = this.f22389q.right;
        if (iMax < i5) {
            canvas.drawRect(iMax, iCenterY, i5, i2, this.f22388p);
        }
        int iMax2 = Math.max(i3, this.f22379g.right);
        if (i4 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i4, i2, this.f22391s);
        }
        if (this.f22379g.width() > 0) {
            Rect rect3 = this.f22379g;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i2, this.f22397y);
        }
        if (this.ba == 0) {
            return;
        }
        long[] jArr = (long[]) C3844k.f7l8(this.ax);
        boolean[] zArr = (boolean[]) C3844k.f7l8(this.bq);
        int i6 = this.f22375c / 2;
        for (int i7 = 0; i7 < this.ba; i7++) {
            int iWidth = ((int) ((((long) this.f22389q.width()) * com.google.android.exoplayer2.util.lrht.m13660i(jArr[i7], 0L, this.as)) / this.as)) - i6;
            Rect rect4 = this.f22389q;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f22375c, Math.max(0, iWidth)), iCenterY, r10 + this.f22375c, i2, zArr[i7] ? this.f22381i : this.f22380h);
        }
    }

    private void fu4() {
        this.f22386n.set(this.f22389q);
        this.f22379g.set(this.f22389q);
        long j2 = this.in ? this.bl : this.bg;
        if (this.as > 0) {
            int iWidth = (int) ((((long) this.f22389q.width()) * this.az) / this.as);
            Rect rect = this.f22386n;
            Rect rect2 = this.f22389q;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f22389q.width()) * j2) / this.as);
            Rect rect3 = this.f22379g;
            Rect rect4 = this.f22389q;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f22386n;
            int i2 = this.f22389q.left;
            rect5.right = i2;
            this.f22379g.right = i2;
        }
        invalidate(this.f22383k);
    }

    /* JADX INFO: renamed from: g */
    private void m13162g(Canvas canvas) {
        if (this.as <= 0) {
            return;
        }
        Rect rect = this.f22379g;
        int iT8r = com.google.android.exoplayer2.util.lrht.t8r(rect.right, rect.left, this.f22389q.right);
        int iCenterY = this.f22379g.centerY();
        if (this.f22392t == null) {
            canvas.drawCircle(iT8r, iCenterY, (int) ((((this.in || isFocused()) ? this.f22387o : isEnabled() ? this.f22377e : this.f22382j) * this.an) / 2.0f), this.f22398z);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.an)) / 2;
        int intrinsicHeight = ((int) (this.f22392t.getIntrinsicHeight() * this.an)) / 2;
        this.f22392t.setBounds(iT8r - intrinsicWidth, iCenterY - intrinsicHeight, iT8r + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f22392t.draw(canvas);
    }

    private long getPositionIncrement() {
        long j2 = this.f66069ab;
        if (j2 != C3548p.f65257toq) {
            return j2;
        }
        long j3 = this.as;
        if (j3 == C3548p.f65257toq) {
            return 0L;
        }
        return j3 / ((long) this.f22395w);
    }

    private String getProgressText() {
        return com.google.android.exoplayer2.util.lrht.lv5(this.f22373a, this.f22396x, this.bg);
    }

    private long getScrubberPosition() {
        if (this.f22389q.width() <= 0 || this.as == C3548p.f65257toq) {
            return 0L;
        }
        return (((long) this.f22379g.width()) * this.as) / ((long) this.f22389q.width());
    }

    /* JADX INFO: renamed from: h */
    private boolean m13163h(long j2) {
        long j3 = this.as;
        if (j3 <= 0) {
            return false;
        }
        long j4 = this.in ? this.bl : this.bg;
        long jM13660i = com.google.android.exoplayer2.util.lrht.m13660i(j4 + j2, 0L, j3);
        if (jM13660i == j4) {
            return false;
        }
        if (this.in) {
            o1t(jM13660i);
        } else {
            zurt(jM13660i);
        }
        fu4();
        return true;
    }

    private static boolean ki(Drawable drawable, int i2) {
        return com.google.android.exoplayer2.util.lrht.f23230k >= 23 && drawable.setLayoutDirection(i2);
    }

    private Point kja0(MotionEvent motionEvent) {
        this.f22394v.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f22394v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6() {
        ni7(false);
    }

    /* JADX INFO: renamed from: n */
    private static int m13164n(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    private static int n7h(float f2, int i2) {
        return (int) (i2 / f2);
    }

    private void ni7(boolean z2) {
        removeCallbacks(this.f22393u);
        this.in = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<hyr.InterfaceC3749k> it = this.f66070bo.iterator();
        while (it.hasNext()) {
            it.next().zy(this, this.bl, z2);
        }
    }

    private void o1t(long j2) {
        if (this.bl == j2) {
            return;
        }
        this.bl = j2;
        Iterator<hyr.InterfaceC3749k> it = this.f66070bo.iterator();
        while (it.hasNext()) {
            it.next().toq(this, j2);
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m13165p(float f2, float f3) {
        return this.f22383k.contains((int) f2, (int) f3);
    }

    private void qrj(float f2) {
        Rect rect = this.f22379g;
        Rect rect2 = this.f22389q;
        rect.right = com.google.android.exoplayer2.util.lrht.t8r((int) f2, rect2.left, rect2.right);
    }

    @zy.hyr(29)
    private void t8r(int i2, int i3) {
        Rect rect = this.bp;
        if (rect != null && rect.width() == i2 && this.bp.height() == i3) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i2, i3);
        this.bp = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(ValueAnimator valueAnimator) {
        this.an = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f22383k);
    }

    /* JADX INFO: renamed from: z */
    private void m13167z() {
        Drawable drawable = this.f22392t;
        if (drawable != null && drawable.isStateful() && this.f22392t.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void zurt(long j2) {
        this.bl = j2;
        this.in = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<hyr.InterfaceC3749k> it = this.f66070bo.iterator();
        while (it.hasNext()) {
            it.next().f7l8(this, j2);
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m13167z();
    }

    public void fn3e(long j2) {
        if (this.bv.isStarted()) {
            this.bv.cancel();
        }
        this.id = false;
        this.bv.setFloatValues(this.an, 1.0f);
        this.bv.setDuration(j2);
        this.bv.start();
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public long getPreferredUpdateDelay() {
        int iN7h = n7h(this.f22376d, this.f22389q.width());
        if (iN7h != 0) {
            long j2 = this.as;
            if (j2 != 0 && j2 != C3548p.f65257toq) {
                return j2 / ((long) iN7h);
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: i */
    public void m13168i() {
        if (this.bv.isStarted()) {
            this.bv.cancel();
        }
        this.id = false;
        this.an = 1.0f;
        invalidate(this.f22383k);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22392t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    /* JADX INFO: renamed from: k */
    public void mo13169k(hyr.InterfaceC3749k interfaceC3749k) {
        this.f66070bo.remove(interfaceC3749k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f7l8(canvas);
        m13162g(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z2, int i2, @zy.dd Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!this.in || z2) {
            return;
        }
        ni7(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(k6e);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(k6e);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.as <= 0) {
            return;
        }
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m13163h(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f22393u
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f22393u
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.in
            if (r0 == 0) goto L30
            r5 = 0
            r4.ni7(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingBottom;
        int iMax;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int i8 = this.id ? 0 : this.f22385m;
        if (this.f22378f == 1) {
            paddingBottom = (i7 - getPaddingBottom()) - this.f22384l;
            int paddingBottom2 = i7 - getPaddingBottom();
            int i9 = this.f22390r;
            iMax = (paddingBottom2 - i9) - Math.max(i8 - (i9 / 2), 0);
        } else {
            paddingBottom = (i7 - this.f22384l) / 2;
            iMax = (i7 - this.f22390r) / 2;
        }
        this.f22383k.set(paddingLeft, paddingBottom, paddingRight, this.f22384l + paddingBottom);
        Rect rect = this.f22389q;
        Rect rect2 = this.f22383k;
        rect.set(rect2.left + i8, iMax, rect2.right - i8, this.f22390r + iMax);
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 29) {
            t8r(i6, i7);
        }
        fu4();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.f22384l;
        } else if (mode != 1073741824) {
            size = Math.min(this.f22384l, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        m13167z();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.f22392t;
        if (drawable == null || !ki(drawable, i2)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.as
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.kja0(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.in
            if (r8 == 0) goto L76
            int r8 = r7.f22374b
            if (r0 >= r8) goto L3a
            int r8 = r7.bb
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.qrj(r8)
            goto L40
        L3a:
            r7.bb = r2
            float r8 = (float) r2
            r7.qrj(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.o1t(r0)
            r7.fu4()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.in
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.ni7(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m13165p(r8, r0)
            if (r0 == 0) goto L76
            r7.qrj(r8)
            long r0 = r7.getScrubberPosition()
            r7.zurt(r0)
            r7.fu4()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, @zy.dd Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.as <= 0) {
            return false;
        }
        if (i2 == 8192) {
            if (m13163h(-getPositionIncrement())) {
                ni7(false);
            }
        } else {
            if (i2 != 4096) {
                return false;
            }
            if (m13163h(getPositionIncrement())) {
                ni7(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m13170s(boolean z2) {
        if (this.bv.isStarted()) {
            this.bv.cancel();
        }
        this.id = z2;
        this.an = 0.0f;
        invalidate(this.f22383k);
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setAdGroupTimesMs(@zy.dd long[] jArr, @zy.dd boolean[] zArr, int i2) {
        C3844k.m13629k(i2 == 0 || !(jArr == null || zArr == null));
        this.ba = i2;
        this.ax = jArr;
        this.bq = zArr;
        fu4();
    }

    public void setAdMarkerColor(@zy.x2 int i2) {
        this.f22380h.setColor(i2);
        invalidate(this.f22383k);
    }

    public void setBufferedColor(@zy.x2 int i2) {
        this.f22391s.setColor(i2);
        invalidate(this.f22383k);
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setBufferedPosition(long j2) {
        if (this.az == j2) {
            return;
        }
        this.az = j2;
        fu4();
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setDuration(long j2) {
        if (this.as == j2) {
            return;
        }
        this.as = j2;
        if (this.in && j2 == C3548p.f65257toq) {
            ni7(true);
        }
        fu4();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.hyr
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!this.in || z2) {
            return;
        }
        ni7(true);
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setKeyCountIncrement(int i2) {
        C3844k.m13629k(i2 > 0);
        this.f22395w = i2;
        this.f66069ab = C3548p.f65257toq;
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setKeyTimeIncrement(long j2) {
        C3844k.m13629k(j2 > 0);
        this.f22395w = -1;
        this.f66069ab = j2;
    }

    public void setPlayedAdMarkerColor(@zy.x2 int i2) {
        this.f22381i.setColor(i2);
        invalidate(this.f22383k);
    }

    public void setPlayedColor(@zy.x2 int i2) {
        this.f22397y.setColor(i2);
        invalidate(this.f22383k);
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void setPosition(long j2) {
        if (this.bg == j2) {
            return;
        }
        this.bg = j2;
        setContentDescription(getProgressText());
        fu4();
    }

    public void setScrubberColor(@zy.x2 int i2) {
        this.f22398z.setColor(i2);
        invalidate(this.f22383k);
    }

    public void setUnplayedColor(@zy.x2 int i2) {
        this.f22388p.setColor(i2);
        invalidate(this.f22383k);
    }

    @Override // com.google.android.exoplayer2.ui.hyr
    public void toq(hyr.InterfaceC3749k interfaceC3749k) {
        C3844k.f7l8(interfaceC3749k);
        this.f66070bo.add(interfaceC3749k);
    }

    /* JADX INFO: renamed from: y */
    public void m13171y(long j2) {
        if (this.bv.isStarted()) {
            this.bv.cancel();
        }
        this.bv.setFloatValues(this.an, 0.0f);
        this.bv.setDuration(j2);
        this.bv.start();
    }

    public DefaultTimeBar(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @zy.dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    public DefaultTimeBar(Context context, @zy.dd AttributeSet attributeSet, int i2, @zy.dd AttributeSet attributeSet2) {
        this(context, attributeSet, i2, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @zy.dd AttributeSet attributeSet, int i2, @zy.dd AttributeSet attributeSet2, int i3) {
        super(context, attributeSet, i2);
        this.f22383k = new Rect();
        this.f22389q = new Rect();
        this.f22386n = new Rect();
        this.f22379g = new Rect();
        Paint paint = new Paint();
        this.f22397y = paint;
        Paint paint2 = new Paint();
        this.f22391s = paint2;
        Paint paint3 = new Paint();
        this.f22388p = paint3;
        Paint paint4 = new Paint();
        this.f22380h = paint4;
        Paint paint5 = new Paint();
        this.f22381i = paint5;
        Paint paint6 = new Paint();
        this.f22398z = paint6;
        paint6.setAntiAlias(true);
        this.f66070bo = new CopyOnWriteArraySet<>();
        this.f22394v = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f22376d = f2;
        this.f22374b = m13164n(f2, tgs);
        int iM13164n = m13164n(f2, 4);
        int iM13164n2 = m13164n(f2, 26);
        int iM13164n3 = m13164n(f2, 4);
        int iM13164n4 = m13164n(f2, 12);
        int iM13164n5 = m13164n(f2, 0);
        int iM13164n6 = m13164n(f2, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3748h.qrj.f66527x2, i2, i3);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C3748h.qrj.f66477ni7);
                this.f22392t = drawable;
                if (drawable != null) {
                    cdj(drawable);
                    iM13164n2 = Math.max(drawable.getMinimumHeight(), iM13164n2);
                }
                this.f22390r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f22712h, iM13164n);
                this.f22384l = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f22730z, iM13164n2);
                this.f22378f = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66453kja0, 0);
                this.f22375c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f66474n7h, iM13164n3);
                this.f22377e = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f66424fu4, iM13164n4);
                this.f22382j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f66421fn3e, iM13164n5);
                this.f22387o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3748h.qrj.f66544zurt, iM13164n6);
                int i4 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66504t8r, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f22713i, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66399cdj, ar);
                int i7 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66484o1t, k0);
                int i8 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66495qrj, bu);
                int i9 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66451ki, bd);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f22390r = iM13164n;
            this.f22384l = iM13164n2;
            this.f22378f = 0;
            this.f22375c = iM13164n3;
            this.f22377e = iM13164n4;
            this.f22382j = iM13164n5;
            this.f22387o = iM13164n6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(ar);
            paint3.setColor(k0);
            paint4.setColor(bu);
            paint5.setColor(bd);
            this.f22392t = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22373a = sb;
        this.f22396x = new Formatter(sb, Locale.getDefault());
        this.f22393u = new Runnable() { // from class: com.google.android.exoplayer2.ui.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f22608k.ld6();
            }
        };
        Drawable drawable2 = this.f22392t;
        if (drawable2 != null) {
            this.f22385m = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22385m = (Math.max(this.f22382j, Math.max(this.f22377e, this.f22387o)) + 1) / 2;
        }
        this.an = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.bv = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f22868k.x2(valueAnimator2);
            }
        });
        this.as = C3548p.f65257toq;
        this.f66069ab = C3548p.f65257toq;
        this.f22395w = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
