package miuix.slidingwidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.HashMap;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private final HashMap<View, Pair<Float, Float>> f41611k;

    /* JADX INFO: renamed from: n */
    private final int[] f41612n;

    /* JADX INFO: renamed from: q */
    private final HashMap<View, Pair<Float, Float>> f41613q;

    /* JADX INFO: renamed from: miuix.slidingwidget.widget.SlidingLinearLayout$k */
    class C7324k extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f41614k;

        C7324k(View view) {
            this.f41614k = view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            SlidingLinearLayout.this.removeView(this.f41614k);
        }
    }

    class toq extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41615k;

        toq(int i2) {
            this.f41615k = i2;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            if (this.f41615k < SlidingLinearLayout.this.getChildCount()) {
                try {
                    SlidingLinearLayout.this.removeViewAt(this.f41615k);
                } catch (Exception e2) {
                    Log.e("SlidingLinear", "error in removeViewSlidingAt, index " + this.f41615k + " " + e2);
                }
            }
        }
    }

    class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41616k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f41618q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f90065toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f90066zy;

        zy(int i2, int i3, int i4, int i5) {
            this.f41616k = i2;
            this.f90065toq = i3;
            this.f90066zy = i4;
            this.f41618q = i5;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            if (this.f41616k != this.f90065toq - 1 || this.f90066zy + this.f41618q > SlidingLinearLayout.this.getChildCount()) {
                return;
            }
            try {
                SlidingLinearLayout.this.removeViews(this.f90066zy, this.f41618q);
            } catch (Exception e2) {
                Log.e("SlidingLinear", "error in removeViewsSliding,start " + this.f90066zy + " count " + this.f41618q + " " + e2);
            }
        }
    }

    public SlidingLinearLayout(Context context) {
        this(context, null);
    }

    private void f7l8(int i2, int i3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((i4 < i2 || i4 >= i2 + i3) && childAt.getVisibility() != 8) {
                this.f41613q.put(childAt, new Pair<>(Float.valueOf(childAt.getX()), Float.valueOf(childAt.getY())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m26553g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            this.f41611k.put(childAt, new Pair<>(Float.valueOf(childAt.getX()), Float.valueOf(childAt.getY())));
        }
    }

    private void x2(View view) {
        Folme.useAt(view).visible().setFlags(1L).setFlags(1L).setShowDelay(100L).setHide().show(new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: y */
    private void m26554y(View view) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (view != childAt && childAt.getVisibility() != 8) {
                this.f41613q.put(childAt, new Pair<>(Float.valueOf(childAt.getX()), Float.valueOf(childAt.getY())));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m26555k(View view) {
        m26553g();
        addView(view);
        x2(view);
    }

    public void ld6(int i2, int i3) {
        f7l8(i2, i3);
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                Folme.useAt(childAt).visible().setFlags(1L).setShow().hide(new AnimConfig().addListeners(new zy(i5, i4, i2, i3)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m26556n(View view, LinearLayout.LayoutParams layoutParams) {
        m26553g();
        addView(view, layoutParams);
        x2(view);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @hyr(api = 24)
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int childCount = getChildCount();
            char c2 = 0;
            boolean z3 = getOrientation() != 1 ? Math.abs(this.f41612n[0] - i2) > Math.abs(this.f41612n[2] - i4) : Math.abs(this.f41612n[1] - i3) > Math.abs(this.f41612n[3] - i5);
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = getChildAt(i7);
                HashMap<View, Pair<Float, Float>> map = this.f41611k;
                if (map == null || map.size() <= 0) {
                    i6 = i7;
                } else {
                    Pair<Float, Float> pair = this.f41611k.get(childAt);
                    if (pair == null || childAt.getVisibility() == 8) {
                        i6 = i7;
                    } else {
                        if ((childAt.getX() != ((Float) pair.first).floatValue() || childAt.getY() != ((Float) pair.second).floatValue()) && !z3) {
                            fFloatValue3 = ((Float) pair.first).floatValue() - childAt.getX();
                            fFloatValue4 = ((Float) pair.second).floatValue() - childAt.getY();
                        } else if (childAt.getX() == ((Float) pair.first).floatValue() && childAt.getY() == ((Float) pair.second).floatValue() && z3) {
                            int[] iArr = this.f41612n;
                            float f2 = iArr[c2] - i2;
                            fFloatValue4 = iArr[1] - i3;
                            fFloatValue3 = f2;
                        } else {
                            fFloatValue3 = 0.0f;
                            fFloatValue4 = 0.0f;
                        }
                        AnimState animState = new AnimState("start");
                        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
                        i6 = i7;
                        AnimState animStateAdd = animState.add(viewProperty, fFloatValue3);
                        ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
                        AnimState animStateAdd2 = animStateAdd.add(viewProperty2, fFloatValue4);
                        Folme.useAt(childAt).state().setTo(animStateAdd2).fromTo(animStateAdd2, new AnimState(C3678q.f65807ch).add(viewProperty, 0.0d).add(viewProperty2, 0.0d), new AnimConfig[0]);
                    }
                    this.f41611k.remove(childAt);
                }
                HashMap<View, Pair<Float, Float>> map2 = this.f41613q;
                if (map2 != null && map2.size() > 0) {
                    Pair<Float, Float> pair2 = this.f41613q.get(childAt);
                    if (pair2 != null && childAt.getVisibility() != 8) {
                        if ((childAt.getX() != ((Float) pair2.first).floatValue() || childAt.getY() != ((Float) pair2.second).floatValue()) && !z3) {
                            fFloatValue = ((Float) pair2.first).floatValue() - childAt.getX();
                            fFloatValue2 = ((Float) pair2.second).floatValue() - childAt.getY();
                        } else if (childAt.getX() == ((Float) pair2.first).floatValue() && childAt.getY() == ((Float) pair2.second).floatValue() && z3) {
                            int[] iArr2 = this.f41612n;
                            fFloatValue = iArr2[0] - i2;
                            fFloatValue2 = iArr2[1] - i3;
                        } else {
                            fFloatValue2 = 0.0f;
                            fFloatValue = 0.0f;
                        }
                        AnimState animState2 = new AnimState("start");
                        ViewProperty viewProperty3 = ViewProperty.TRANSLATION_X;
                        AnimState animStateAdd3 = animState2.add(viewProperty3, fFloatValue);
                        ViewProperty viewProperty4 = ViewProperty.TRANSLATION_Y;
                        AnimState animStateAdd4 = animStateAdd3.add(viewProperty4, fFloatValue2);
                        Folme.useAt(childAt).state().setTo(animStateAdd4).fromTo(animStateAdd4, new AnimState(C3678q.f65807ch).add(viewProperty3, 0.0d).add(viewProperty4, 0.0d), new AnimConfig[0]);
                    }
                    this.f41613q.remove(childAt);
                }
                i7 = i6 + 1;
                c2 = 0;
            }
            this.f41611k.clear();
            this.f41613q.clear();
            int[] iArr3 = this.f41612n;
            iArr3[0] = i2;
            iArr3[1] = i3;
            iArr3[2] = i4;
            iArr3[3] = i5;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m26557p(int i2) {
        View childAt = getChildAt(i2);
        m26554y(childAt);
        Folme.useAt(childAt).visible().setFlags(1L).setShow().hide(new AnimConfig().addListeners(new toq(i2)));
    }

    /* JADX INFO: renamed from: q */
    public void m26558q(View view, int i2, LinearLayout.LayoutParams layoutParams) {
        m26553g();
        addView(view, i2, layoutParams);
        x2(view);
    }

    /* JADX INFO: renamed from: s */
    public void m26559s(View view) {
        m26554y(view);
        Folme.useAt(view).visible().setFlags(1L).setShow().hide(new AnimConfig().addListeners(new C7324k(view)));
    }

    public void toq(View view, int i2) {
        m26553g();
        addView(view, i2);
        x2(view);
    }

    public void zy(View view, int i2, int i3) {
        m26553g();
        addView(view, i2, i3);
        x2(view);
    }

    public SlidingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41611k = new HashMap<>();
        this.f41613q = new HashMap<>();
        this.f41612n = new int[4];
        setLayoutTransition(null);
    }
}
