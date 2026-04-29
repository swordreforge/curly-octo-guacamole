package miuix.hybrid.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes3.dex */
public class WebContainerView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private boolean f40244g;

    /* JADX INFO: renamed from: k */
    private View f40245k;

    /* JADX INFO: renamed from: n */
    private final int f40246n;

    /* JADX INFO: renamed from: q */
    private boolean f40247q;

    /* JADX INFO: renamed from: s */
    private float f40248s;

    /* JADX INFO: renamed from: y */
    private float f40249y;

    public WebContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f40244g = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.s4y, 0, 0);
        this.f40247q = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f40246n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: k */
    private void m25796k() {
        if (getTranslationY() == 0.0f) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.translationY(0.0f);
        viewPropertyAnimatorAnimate.setDuration(getResources().getInteger(R.integer.config_mediumAnimTime));
        viewPropertyAnimatorAnimate.start();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.f40245k != null && this.f40247q) {
            int actionMasked = ev.getActionMasked();
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked == 0) {
                    this.f40249y = rawX;
                    this.f40248s = rawY;
                } else if (actionMasked == 2) {
                    if (this.f40244g) {
                        return true;
                    }
                    float f2 = this.f40249y - rawX;
                    float f3 = this.f40248s - rawY;
                    float fAbs = Math.abs(f2);
                    float fAbs2 = Math.abs(f3);
                    this.f40249y = rawX;
                    this.f40248s = rawY;
                    if (this.f40245k.getScrollY() == 0 && f3 < 0.0f && fAbs2 > fAbs && fAbs2 > this.f40246n) {
                        this.f40244g = true;
                        return true;
                    }
                }
                return false;
            }
            this.f40244g = false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.f40247q
            r1 = 0
            if (r0 == 0) goto L38
            boolean r0 = r4.f40244g
            if (r0 != 0) goto La
            goto L38
        La:
            float r0 = r5.getRawY()
            int r5 = r5.getAction()
            if (r5 == 0) goto L36
            r2 = 1
            if (r5 == r2) goto L30
            r2 = 2
            if (r5 == r2) goto L1e
            r0 = 3
            if (r5 == r0) goto L30
            goto L38
        L1e:
            float r5 = r4.f40248s
            float r5 = r0 - r5
            float r2 = r4.getTranslationY()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r3
            float r2 = r2 + r5
            r4.setTranslationY(r2)
            r4.f40248s = r0
            goto L38
        L30:
            r4.f40244g = r1
            r4.m25796k()
            goto L38
        L36:
            r4.f40248s = r0
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.hybrid.internal.WebContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setPullableStatus(boolean mPullable) {
        this.f40247q = mPullable;
    }

    public void setWebView(View webView) {
        View view;
        if (webView == null || (view = this.f40245k) == webView) {
            return;
        }
        if (view != null) {
            removeView(view);
        }
        this.f40245k = webView;
        addView(webView, 0, new FrameLayout.LayoutParams(-1, -1));
    }
}
