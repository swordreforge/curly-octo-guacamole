package com.android.thememanager.v9;

import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: TopScrollListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends RecyclerView.fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61464f7l8 = "cdj";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private View f61466zy;

    /* JADX INFO: renamed from: k */
    private int f17061k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f61465toq = 0;

    /* JADX INFO: renamed from: q */
    private ObjectAnimator f17063q = null;

    /* JADX INFO: renamed from: n */
    private boolean f17062n = false;

    /* JADX INFO: renamed from: g */
    private boolean f17060g = false;

    public cdj(View target) {
        this.f61466zy = null;
        if (target == null) {
            throw new IllegalArgumentException("target shouldn't be null");
        }
        this.f61466zy = target;
    }

    /* JADX INFO: renamed from: k */
    private ObjectAnimator m10145k(View targetView) {
        return zy(targetView, targetView.getTranslationY(), -targetView.getBottom());
    }

    private ObjectAnimator toq(View targetView) {
        return zy(targetView, targetView.getTranslationY(), 0.0f);
    }

    private ObjectAnimator zy(View view, float start, float end) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", start, end);
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.fn3e
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            Log.d(f61464f7l8, "SCROLL_STATE_IDLE");
            float translationY = this.f61466zy.getTranslationY();
            int i2 = -this.f61466zy.getBottom();
            if (translationY == 0.0f || translationY == i2) {
                return;
            }
            if (this.f17061k > 0) {
                this.f17063q = m10145k(this.f61466zy);
                return;
            } else {
                this.f17063q = toq(this.f61466zy);
                return;
            }
        }
        if (newState != 1) {
            if (newState != 2) {
                return;
            }
            Log.d(f61464f7l8, "SCROLL_STATE_SETTLING");
        } else {
            Log.d(f61464f7l8, "SCROLL_STATE_DRAGGING");
            ObjectAnimator objectAnimator = this.f17063q;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                return;
            }
            this.f17063q.cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.fn3e
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        this.f61465toq -= dy;
        this.f17061k = dy;
        float translationY = this.f61466zy.getTranslationY();
        int i2 = -this.f61466zy.getBottom();
        if (this.f61465toq < i2 || dy <= 0) {
            if (!this.f17062n || dy <= 0) {
                if (!this.f17060g || dy >= 0) {
                    float f2 = translationY - dy;
                    float f3 = i2;
                    if (f2 < f3) {
                        f2 = f3;
                    } else {
                        if (f2 == f3) {
                            return;
                        }
                        if (f2 > 0.0f) {
                            f2 = 0.0f;
                        } else if (f2 == 0.0f) {
                            return;
                        }
                    }
                    this.f61466zy.setTranslationY(f2);
                    this.f17062n = f2 == f3;
                    this.f17060g = f2 == 0.0f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m10146q() {
        View view = this.f61466zy;
        if (view != null) {
            this.f17063q = toq(view);
            this.f17062n = false;
            this.f17060g = true;
            this.f17061k = 0;
            this.f61465toq = 0;
        }
    }
}
