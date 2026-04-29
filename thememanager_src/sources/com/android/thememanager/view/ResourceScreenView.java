package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.thememanager.widget.ScreenView;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceScreenView extends ScreenView {
    private InterfaceC2898k a7kc;
    private boolean cecm;
    private ScreenView.SeekBarIndicator k84;
    private boolean kdv1;

    /* JADX INFO: renamed from: com.android.thememanager.view.ResourceScreenView$k */
    public interface InterfaceC2898k {
        /* JADX INFO: renamed from: k */
        void mo9588k(int screenIndex);

        void toq(int srcScreenIndex, int destScreenIndex);
    }

    public ResourceScreenView(Context context) {
        this(context, null);
    }

    private int getRightmostScreenOffset() {
        return (this.f17810u - (getVisibleRange() * this.f17813x)) - this.f17791b;
    }

    public void ek5k() {
        this.cecm = false;
    }

    @Override // com.android.thememanager.widget.ScreenView
    protected void hb(int fromIndex, int toIndex) {
        ScreenView.SeekBarIndicator seekBarIndicator = this.k84;
        if (seekBarIndicator != null) {
            int childCount = seekBarIndicator.getChildCount();
            int screenCount = getScreenCount();
            if (childCount > 0) {
                int i2 = screenCount > 1 ? (int) ((((((double) toIndex) * 1.0d) / ((double) (screenCount - 1))) * ((double) (childCount - 1))) + 0.5d) : 0;
                int i3 = 0;
                while (i3 < childCount) {
                    this.k84.getChildAt(i3).setSelected(i3 == i2);
                    i3++;
                }
            }
        }
        super.hb(fromIndex, toIndex);
    }

    @Override // com.android.thememanager.widget.ScreenView
    public void jk(int index) {
        if (this.cecm || this.f17804o != 0 || getScreenCount() <= getVisibleRange() || index < getScreenCount() - getVisibleRange()) {
            super.jk(index);
            return;
        }
        if (this.bv) {
            index -= index % this.f17790a;
        }
        measure(this.f61577bo, this.f17811v);
        int i2 = this.f17791b;
        int rightmostScreenOffset = getRightmostScreenOffset();
        this.f17791b = rightmostScreenOffset;
        scrollTo((this.f17813x * index) - rightmostScreenOffset, 0);
        this.f17791b = i2;
    }

    @Override // com.android.thememanager.widget.ScreenView
    /* JADX INFO: renamed from: l */
    protected void mo10292l(int whichScreen, int velocity, boolean settle, ScreenView.InterfaceC2958p notification) {
        int i2 = this.f17793d;
        if (this.cecm || this.f17804o != 0 || getScreenCount() <= getVisibleRange() || whichScreen < getScreenCount() - getVisibleRange()) {
            super.mo10292l(whichScreen, velocity, settle, notification);
        } else {
            int i3 = this.f17791b;
            this.f17791b = getRightmostScreenOffset();
            super.mo10292l(whichScreen, velocity, settle, notification);
            this.f17791b = i3;
        }
        InterfaceC2898k interfaceC2898k = this.a7kc;
        if (interfaceC2898k != null) {
            interfaceC2898k.toq(i2, whichScreen);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m10293m() {
        this.cecm = true;
    }

    @Override // com.android.thememanager.widget.ScreenView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev) || !isClickable();
    }

    @Override // com.android.thememanager.widget.ScreenView, android.view.View
    public void scrollTo(int x3, int y3) {
        if (this.kdv1) {
            if (this.cecm || this.f17804o != 0) {
                super.scrollTo(x3, y3);
                return;
            }
            int i2 = this.f61576ab;
            if (getScreenCount() > getVisibleRange()) {
                this.f61576ab = ((int) (this.f17813x * ((getScreenCount() - getVisibleRange()) + this.bp))) - getRightmostScreenOffset();
            } else {
                this.f61576ab = ((int) (this.f17813x * this.bp)) - this.f17791b;
            }
            super.scrollTo(x3, y3);
            this.f61576ab = i2;
        }
    }

    @Override // com.android.thememanager.widget.ScreenView
    protected void setCurrentScreenInner(int screenIndex) {
        super.setCurrentScreenInner(screenIndex);
        InterfaceC2898k interfaceC2898k = this.a7kc;
        if (interfaceC2898k != null) {
            interfaceC2898k.mo9588k(screenIndex);
        }
    }

    public void setEnableScroll(boolean enable) {
        this.kdv1 = enable;
    }

    public void setFakeSeekBarLength(int length) {
        ScreenView.SeekBarIndicator seekBarIndicator = this.k84;
        if (seekBarIndicator != null) {
            seekBarIndicator.removeAllViews();
            for (int i2 = 0; i2 < length; i2++) {
                this.k84.addView(ld6(), ScreenView.wra);
            }
        }
    }

    public void setFakeSeekBarPosition(FrameLayout.LayoutParams params) {
        if (params == null) {
            ScreenView.SeekBarIndicator seekBarIndicator = this.k84;
            if (seekBarIndicator != null) {
                o1t(seekBarIndicator);
                this.k84 = null;
                return;
            }
            return;
        }
        ScreenView.SeekBarIndicator seekBarIndicator2 = this.k84;
        if (seekBarIndicator2 != null) {
            seekBarIndicator2.setLayoutParams(params);
            return;
        }
        ScreenView.SeekBarIndicator seekBarIndicator3 = new ScreenView.SeekBarIndicator(getContext());
        this.k84 = seekBarIndicator3;
        seekBarIndicator3.setGravity(16);
        this.k84.setAnimationCacheEnabled(false);
        m10507y(this.k84, params);
    }

    public void setScreenChangeListener(InterfaceC2898k l2) {
        this.a7kc = l2;
    }

    public ResourceScreenView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceScreenView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.kdv1 = true;
        setTouchSlop(0);
    }
}
