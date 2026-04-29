package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shape.y */
/* JADX INFO: compiled from: InterpolateOnScrollPositionChangeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4111y {

    /* JADX INFO: renamed from: k */
    private View f25010k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C4108p f67860toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ScrollView f67861zy;

    /* JADX INFO: renamed from: q */
    private final int[] f25012q = new int[2];

    /* JADX INFO: renamed from: n */
    private final int[] f25011n = new int[2];

    /* JADX INFO: renamed from: g */
    private final ViewTreeObserver.OnScrollChangedListener f25009g = new k();

    /* JADX INFO: renamed from: com.google.android.material.shape.y$k */
    /* JADX INFO: compiled from: InterpolateOnScrollPositionChangeHelper.java */
    class k implements ViewTreeObserver.OnScrollChangedListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            C4111y.this.m14871n();
        }
    }

    public C4111y(View view, C4108p c4108p, ScrollView scrollView) {
        this.f25010k = view;
        this.f67860toq = c4108p;
        this.f67861zy = scrollView;
    }

    /* JADX INFO: renamed from: k */
    public void m14870k(ScrollView scrollView) {
        this.f67861zy = scrollView;
    }

    /* JADX INFO: renamed from: n */
    public void m14871n() {
        ScrollView scrollView = this.f67861zy;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f67861zy.getLocationInWindow(this.f25012q);
        this.f67861zy.getChildAt(0).getLocationInWindow(this.f25011n);
        int top = (this.f25010k.getTop() - this.f25012q[1]) + this.f25011n[1];
        int height = this.f25010k.getHeight();
        int height2 = this.f67861zy.getHeight();
        if (top < 0) {
            this.f67860toq.ch(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f25010k.invalidate();
            return;
        }
        if (top + height > height2) {
            this.f67860toq.ch(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f25010k.invalidate();
        } else if (this.f67860toq.o1t() != 1.0f) {
            this.f67860toq.ch(1.0f);
            this.f25010k.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m14872q(@lvui ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f25009g);
    }

    public void toq(C4108p c4108p) {
        this.f67860toq = c4108p;
    }

    public void zy(@lvui ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f25009g);
    }
}
