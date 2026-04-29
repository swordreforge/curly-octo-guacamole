package com.android.thememanager.activity;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.TranslateAnimation;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperDetailViewPager extends ViewPager {
    private static final int afw = 10;
    private static final float eht = 10.0f;
    private static final float oyp = 0.5f;
    private float ls9;
    private InterfaceC1559k qns;
    private Rect ut;
    private boolean wh6;
    private PointF xhv;
    private int zm;

    /* JADX INFO: renamed from: com.android.thememanager.activity.WallpaperDetailViewPager$k */
    public interface InterfaceC1559k {
        /* JADX INFO: renamed from: k */
        void mo6379k();
    }

    public WallpaperDetailViewPager(@zy.lvui Context context) {
        super(context);
        this.xhv = new PointF();
        this.zm = 0;
        this.ut = new Rect();
        this.wh6 = true;
        this.ls9 = 0.0f;
    }

    private void hb() {
        if (this.ut.isEmpty()) {
            return;
        }
        m6376j();
    }

    /* JADX INFO: renamed from: j */
    private void m6376j() {
        TranslateAnimation translateAnimation = new TranslateAnimation(getLeft(), this.ut.left, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        startAnimation(translateAnimation);
        Rect rect = this.ut;
        layout(rect.left, rect.top, rect.right, rect.bottom);
        this.ut.setEmpty();
        this.wh6 = true;
        if (getAdapter() == null || this.zm != getAdapter().mo5575n() - 1) {
            return;
        }
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.up_to_the_end, 0);
    }

    /* JADX INFO: renamed from: o */
    private void m6377o(float offset) {
        if (this.ut.isEmpty()) {
            this.ut.set(getLeft(), getTop(), getRight(), getBottom());
        }
        this.wh6 = false;
        int i2 = (int) (offset * 0.5f);
        layout(getLeft() + i2, getTop(), getRight() + i2, getBottom());
    }

    private float vyq(PointF p1, PointF p2) {
        float f2 = p1.x - p2.x;
        float f3 = p1.y - p2.y;
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    /* JADX INFO: renamed from: e */
    public boolean m6378e() {
        return this.wh6;
    }

    protected void nn86() {
        InterfaceC1559k interfaceC1559k = this.qns;
        if (interfaceC1559k != null) {
            interfaceC1559k.mo6379k();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.ls9 = ev.getX();
            this.zm = getCurrentItem();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action != 0) {
            if (action == 1) {
                hb();
                if (vyq(this.xhv, new PointF(ev.getX(0), ev.getY(0))) < eht) {
                    nn86();
                }
            } else if (action == 2) {
                if (getAdapter().mo5575n() == 1) {
                    float x3 = ev.getX();
                    float f2 = x3 - this.ls9;
                    this.ls9 = x3;
                    if (f2 > eht || f2 < -10.0f) {
                        m6377o(f2);
                    } else if (!this.wh6) {
                        int i2 = (int) (f2 * 0.5f);
                        if (getLeft() + i2 != this.ut.left) {
                            layout(getLeft() + i2, getTop(), getRight() + i2, getBottom());
                        }
                    }
                } else {
                    int i3 = this.zm;
                    if (i3 == 0 || i3 == getAdapter().mo5575n() - 1) {
                        float x4 = ev.getX();
                        float f3 = x4 - this.ls9;
                        this.ls9 = x4;
                        if (this.zm == 0) {
                            if (f3 > eht) {
                                m6377o(f3);
                            } else if (!this.wh6) {
                                int i4 = (int) (f3 * 0.5f);
                                if (getLeft() + i4 >= this.ut.left) {
                                    layout(getLeft() + i4, getTop(), getRight() + i4, getBottom());
                                }
                            }
                        } else if (f3 < -10.0f) {
                            m6377o(f3);
                        } else if (!this.wh6) {
                            int i5 = (int) (f3 * 0.5f);
                            if (getRight() + i5 <= this.ut.right) {
                                layout(getLeft() + i5, getTop(), getRight() + i5, getBottom());
                            }
                        }
                    } else {
                        this.wh6 = true;
                    }
                }
                if (!this.wh6) {
                    return true;
                }
            }
        } else if (ev.getPointerCount() == 1) {
            this.xhv.x = ev.getX(0);
            this.xhv.y = ev.getY(0);
        }
        return super.onTouchEvent(ev);
    }

    public void setWallpaperPagerGestureListener(InterfaceC1559k l2) {
        this.qns = l2;
    }

    public WallpaperDetailViewPager(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        super(context, attrs);
        this.xhv = new PointF();
        this.zm = 0;
        this.ut = new Rect();
        this.wh6 = true;
        this.ls9 = 0.0f;
    }
}
