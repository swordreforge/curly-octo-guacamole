package com.android.thememanager.view;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.router.recommend.entity.UICard;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.view.y */
/* JADX INFO: compiled from: FloatBallView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nFloatBallView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatBallView.kt\ncom/android/thememanager/view/FloatBallView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,99:1\n251#2:100\n251#2:101\n*S KotlinDebug\n*F\n+ 1 FloatBallView.kt\ncom/android/thememanager/view/FloatBallView\n*L\n42#1:100\n50#1:101\n*E\n"})
public final class C2945y {

    /* JADX INFO: renamed from: k */
    private View f17725k;

    /* JADX INFO: renamed from: n */
    private ImageView f17726n;

    /* JADX INFO: renamed from: q */
    private ImageView f17727q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f61551toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f61552zy;

    private final void zy() {
        if (this.f17725k == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(kotlin.ranges.fn3e.fn3e(this.f61552zy, 0));
        layoutParams.bottomMargin = kotlin.ranges.fn3e.fn3e(this.f61551toq, 0);
        layoutParams.gravity = 8388693;
        View view = this.f17725k;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFloatView");
            view = null;
        }
        view.setLayoutParams(layoutParams);
    }

    @InterfaceC7396q
    public final C2945y f7l8() {
        View view = this.f17725k;
        if (view != null) {
            View view2 = null;
            if (view == null) {
                kotlin.jvm.internal.d2ok.n5r1("mFloatView");
                view = null;
            }
            if (!(view.getVisibility() == 0)) {
                View view3 = this.f17725k;
                if (view3 == null) {
                    kotlin.jvm.internal.d2ok.n5r1("mFloatView");
                } else {
                    view2 = view3;
                }
                view2.setVisibility(0);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m10449g(@InterfaceC7396q View.OnClickListener clickListener) {
        kotlin.jvm.internal.d2ok.m23075h(clickListener, "clickListener");
        ImageView imageView = this.f17726n;
        if (imageView != null) {
            if (imageView == null) {
                kotlin.jvm.internal.d2ok.n5r1("mFloatingContentView");
                imageView = null;
            }
            imageView.setOnClickListener(clickListener);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final C2945y m10450k() {
        View view = this.f17725k;
        if (view != null) {
            View view2 = null;
            if (view == null) {
                kotlin.jvm.internal.d2ok.n5r1("mFloatView");
                view = null;
            }
            if (view.getVisibility() == 0) {
                View view3 = this.f17725k;
                if (view3 == null) {
                    kotlin.jvm.internal.d2ok.n5r1("mFloatView");
                } else {
                    view2 = view3;
                }
                view2.setVisibility(4);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m10451n(@InterfaceC7396q View.OnClickListener clickListener) {
        kotlin.jvm.internal.d2ok.m23075h(clickListener, "clickListener");
        ImageView imageView = this.f17727q;
        if (imageView != null) {
            if (imageView == null) {
                kotlin.jvm.internal.d2ok.n5r1("mCloseImageView");
                imageView = null;
            }
            imageView.setOnClickListener(clickListener);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10452q(float f2) {
        View view = this.f17725k;
        if (view != null) {
            if (view == null) {
                kotlin.jvm.internal.d2ok.n5r1("mFloatView");
                view = null;
            }
            view.setAlpha(f2);
        }
    }

    @InterfaceC7396q
    public final C2945y toq(@InterfaceC7395n Activity activity, int i2, int i3) {
        Window window;
        View decorView;
        View view = null;
        FrameLayout frameLayout = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : (FrameLayout) decorView.findViewById(R.id.content);
        this.f61551toq = i2;
        this.f61552zy = i3;
        View viewInflate = LayoutInflater.from(activity).inflate(com.android.thememanager.R.layout.theme_floating_ball, (ViewGroup) null);
        kotlin.jvm.internal.d2ok.kja0(viewInflate, "inflate(...)");
        this.f17725k = viewInflate;
        if (viewInflate == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFloatView");
            viewInflate = null;
        }
        View viewFindViewById = viewInflate.findViewById(com.android.thememanager.R.id.close);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f17727q = (ImageView) viewFindViewById;
        View view2 = this.f17725k;
        if (view2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFloatView");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(com.android.thememanager.R.id.content);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f17726n = (ImageView) viewFindViewById2;
        zy();
        if (frameLayout != null) {
            View view3 = this.f17725k;
            if (view3 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mFloatView");
            } else {
                view = view3;
            }
            frameLayout.addView(view);
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final void m10453y(@InterfaceC7395n Activity activity, @InterfaceC7395n UICard uICard) {
        if (activity == null || this.f17727q == null) {
            return;
        }
        kotlin.jvm.internal.d2ok.qrj(uICard);
        String str = uICard.imageUrl;
        ImageView imageView = this.f17726n;
        ImageView imageView2 = null;
        if (imageView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFloatingContentView");
            imageView = null;
        }
        com.android.thememanager.basemodule.imageloader.x2.zy(activity, str, imageView);
        ImageView imageView3 = this.f17726n;
        if (imageView3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFloatingContentView");
        } else {
            imageView2 = imageView3;
        }
        C1812k.toq(imageView2, uICard.title);
    }
}
