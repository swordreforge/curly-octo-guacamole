package com.android.thememanager.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.PathVideoEntry;
import com.android.thememanager.view.ResourceScreenView;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.appcompat.app.AbstractC6946k;

/* JADX INFO: loaded from: classes2.dex */
public class ResourcePreviewAssistant implements InterfaceC0928g {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f61186ab = -2;
    private static final String an = "tag_lifecycle";
    private static final int bb = -1;
    private static final int bp = 2131232914;
    private static final String bv = "tag_animation";

    /* JADX INFO: renamed from: d */
    private static final boolean f16259d = true;
    private static final String id = "tag_normal_mode";
    private static final String in = "tag_full_mode";

    /* JADX INFO: renamed from: w */
    private static final int f16260w = 4;

    /* JADX INFO: renamed from: a */
    private int f16261a;

    /* JADX INFO: renamed from: b */
    private int f16262b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private com.android.thememanager.fu4 f61187bo;

    /* JADX INFO: renamed from: c */
    private ViewGroup.LayoutParams f16263c;

    /* JADX INFO: renamed from: f */
    private f7l8 f16265f;

    /* JADX INFO: renamed from: g */
    protected ViewGroup f16266g;

    /* JADX INFO: renamed from: h */
    private int f16267h;

    /* JADX INFO: renamed from: i */
    private boolean f16268i;

    /* JADX INFO: renamed from: j */
    protected ImageView f16269j;

    /* JADX INFO: renamed from: l */
    private int f16271l;

    /* JADX INFO: renamed from: m */
    protected ObjectAnimator f16272m;

    /* JADX INFO: renamed from: n */
    protected ViewGroup f16273n;

    /* JADX INFO: renamed from: o */
    protected ObjectAnimator f16274o;

    /* JADX INFO: renamed from: p */
    protected WeakReference<InterfaceC2747g> f16275p;

    /* JADX INFO: renamed from: q */
    protected AbstractActivityC1717k f16276q;

    /* JADX INFO: renamed from: r */
    private int f16277r;

    /* JADX INFO: renamed from: s */
    protected ViewGroup f16278s;

    /* JADX INFO: renamed from: t */
    private int f16279t;

    /* JADX INFO: renamed from: v */
    private boolean f16281v;

    /* JADX INFO: renamed from: y */
    protected ResourceScreenView f16283y;

    /* JADX INFO: renamed from: z */
    private boolean f16284z;

    /* JADX INFO: renamed from: k */
    private boolean f16270k = false;

    /* JADX INFO: renamed from: e */
    private final ViewGroup.LayoutParams f16264e = new ViewGroup.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: x */
    private List<PathEntry> f16282x = new ArrayList();

    /* JADX INFO: renamed from: u */
    private cv06 f16280u = new cv06();

    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        int f16285k;

        /* JADX INFO: renamed from: q */
        int f16286q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61188toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f61189zy;

        private f7l8() {
        }

        /* synthetic */ f7l8(C2748k c2748k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ResourcePreviewAssistant$g */
    public interface InterfaceC2747g {
        void cdj();

        void yl();

        boolean yz();
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ResourcePreviewAssistant$k */
    class C2748k implements ResourceScreenView.InterfaceC2898k {
        C2748k() {
        }

        @Override // com.android.thememanager.view.ResourceScreenView.InterfaceC2898k
        /* JADX INFO: renamed from: k */
        public void mo9588k(int screenIndex) {
            if (ResourcePreviewAssistant.this.f16283y.qrj(screenIndex) != null) {
                ResourcePreviewAssistant resourcePreviewAssistant = ResourcePreviewAssistant.this;
                resourcePreviewAssistant.wvg(((Integer) resourcePreviewAssistant.f16283y.qrj(screenIndex).getTag()).intValue());
            }
        }

        @Override // com.android.thememanager.view.ResourceScreenView.InterfaceC2898k
        public void toq(int srcScreenIndex, int destScreenIndex) {
            if (ResourcePreviewAssistant.this.f16283y.qrj(destScreenIndex) != null) {
                if (srcScreenIndex < destScreenIndex || ResourcePreviewAssistant.this.m9587t()) {
                    ResourcePreviewAssistant resourcePreviewAssistant = ResourcePreviewAssistant.this;
                    resourcePreviewAssistant.wvg(((Integer) resourcePreviewAssistant.f16283y.qrj(destScreenIndex).getTag()).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ResourcePreviewAssistant$n */
    class ViewOnClickListenerC2749n implements View.OnClickListener {
        ViewOnClickListenerC2749n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ResourcePreviewAssistant.this.kja0();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ResourcePreviewAssistant$q */
    class ViewOnClickListenerC2750q implements View.OnClickListener {
        ViewOnClickListenerC2750q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ResourcePreviewAssistant.this.qrj(((Integer) v2.getTag()).intValue());
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ResourcePreviewAssistant.this.f16269j.setVisibility(8);
            ResourcePreviewAssistant.this.f16269j.setImageDrawable(null);
            ResourcePreviewAssistant.this.lvui();
            ResourcePreviewAssistant.this.f16280u.zy(ResourcePreviewAssistant.this.f16269j, ResourcePreviewAssistant.id);
            super.onAnimationEnd(animation);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Drawable drawable = ((ImageView) ((ViewGroup) ResourcePreviewAssistant.this.fu4(ResourcePreviewAssistant.this.cdj())).getChildAt(0)).getDrawable();
            if (drawable != null) {
                ResourcePreviewAssistant.this.f16269j.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ResourcePreviewAssistant.this.f16269j.setImageDrawable(drawable);
            } else {
                ResourcePreviewAssistant.this.f16269j.setScaleType(ImageView.ScaleType.FIT_XY);
                ResourcePreviewAssistant.this.f16269j.setImageResource(R.drawable.resource_preview_bg);
            }
            ResourcePreviewAssistant.this.f16269j.setVisibility(0);
            ResourcePreviewAssistant.this.f16280u.toq(ResourcePreviewAssistant.this.f16269j, ResourcePreviewAssistant.in);
            ResourcePreviewAssistant.this.oc();
            super.onAnimationStart(animation);
        }
    }

    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ResourcePreviewAssistant.this.f16269j.setVisibility(8);
            ResourcePreviewAssistant.this.f16269j.setImageDrawable(null);
            ResourcePreviewAssistant.this.f16280u.zy(ResourcePreviewAssistant.this.f16269j, ResourcePreviewAssistant.in);
            ResourcePreviewAssistant.this.d2ok();
            super.onAnimationEnd(animation);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Drawable drawable = ((ImageView) ((ViewGroup) ResourcePreviewAssistant.this.fu4(ResourcePreviewAssistant.this.cdj())).getChildAt(0)).getDrawable();
            if (drawable != null) {
                ResourcePreviewAssistant.this.f16269j.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ResourcePreviewAssistant.this.f16269j.setImageDrawable(drawable);
            } else {
                ResourcePreviewAssistant.this.f16269j.setScaleType(ImageView.ScaleType.FIT_XY);
                ResourcePreviewAssistant.this.f16269j.setImageResource(R.drawable.resource_preview_bg);
            }
            ResourcePreviewAssistant.this.f16269j.setVisibility(0);
            ResourcePreviewAssistant.this.f16280u.toq(ResourcePreviewAssistant.this.f16269j, ResourcePreviewAssistant.id);
            ResourcePreviewAssistant.this.jk();
            super.onAnimationStart(animation);
        }
    }

    public ResourcePreviewAssistant(AbstractActivityC1717k activity, boolean onlinePage, ViewGroup fullScreenParentView, ResourceScreenView previewScreenView, ImageView fullScreenAnimView, com.android.thememanager.fu4 resContext, int previewRatio) {
        this.f16281v = false;
        activity.bf2(this);
        this.f16276q = activity;
        this.f16281v = onlinePage;
        this.f16273n = fullScreenParentView;
        this.f16283y = previewScreenView;
        this.f16269j = fullScreenAnimView;
        this.f16267h = -2;
        this.f61187bo = resContext;
        this.f16279t = previewRatio;
        Pair<Integer, Integer> pairJp0y = ch.jp0y(activity, onlinePage, previewRatio);
        this.f16277r = ((Integer) pairJp0y.first).intValue();
        this.f16271l = ((Integer) pairJp0y.second).intValue();
        this.f16265f = new f7l8(null);
        Resources resources = this.f16276q.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.detail_preview_image_horizontal_offset) / 2;
        f7l8 f7l8Var = this.f16265f;
        f7l8Var.f16285k = dimensionPixelSize;
        f7l8Var.f61188toq = dimensionPixelSize;
        f7l8Var.f61189zy = 0;
        f7l8Var.f16286q = resources.getDimensionPixelSize(R.dimen.detail_preview_image_bottom_offset);
        int i2 = this.f16277r;
        f7l8 f7l8Var2 = this.f16265f;
        this.f16263c = new ViewGroup.LayoutParams(i2 + f7l8Var2.f16285k + f7l8Var2.f61188toq, this.f16271l + f7l8Var2.f61189zy + f7l8Var2.f16286q);
        this.f16283y.setOverScrollRatio(0.2f);
        this.f16283y.setOvershootTension(0.0f);
        this.f16283y.setScreenAlignment(2);
        this.f16283y.setScreenChangeListener(new C2748k());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams.setMargins(0, 0, 0, this.f16276q.getResources().getDimensionPixelSize(R.dimen.detail_screenview_seekbar_bottom_offset));
        this.f16283y.setSeekBarPosition(layoutParams);
        ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d2ok() {
        for (int i2 = 0; i2 < this.f16282x.size(); i2++) {
            n7h(fu4(i2));
        }
        int iCdj = cdj();
        if (o1t()) {
            this.f16283y.wvg(0);
        }
        if (!this.f16270k) {
            this.f16280u.toq(this.f16283y, an);
        }
        this.f16280u.zy(this.f16283y, bv);
        this.f16273n.addView(this.f16283y, this.f16264e);
        if (!this.f16270k) {
            this.f16280u.zy(this.f16283y, an);
        }
        this.f16283y.setBackgroundColor(-16777216);
        this.f16283y.requestFocus();
        this.f16283y.setClickable(true);
        this.f16283y.setSeekBarVisibility(8);
        this.f16283y.setScreenAlignment(2);
        m9581r(iCdj);
        this.f16268i = true;
        InterfaceC2747g interfaceC2747gFn3e = fn3e();
        if (interfaceC2747gFn3e != null) {
            interfaceC2747gFn3e.yl();
        }
        if (com.android.thememanager.basemodule.utils.y9n.m7258z()) {
            C1819o.hb(this.f16276q, -16777216);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m9575f() {
        if (this.f16283y.getScreenCount() > 1) {
            this.f16283y.setSeekBarVisibility(0);
            this.f16283y.setScreenAlignment(0);
            this.f16283y.setScreenOffset(this.f16265f.f61188toq);
        } else {
            this.f16283y.setSeekBarVisibility(8);
            this.f16283y.setScreenAlignment(2);
        }
        this.f16283y.setSeekBarVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View fu4(int indexTag) {
        int iM9584z = m9584z(indexTag);
        if (iM9584z >= 0) {
            return this.f16283y.qrj(iM9584z);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private void m9577h(View imageContainer) {
        imageContainer.setLayoutParams(this.f16263c);
        f7l8 f7l8Var = this.f16265f;
        imageContainer.setPaddingRelative(f7l8Var.f16285k, f7l8Var.f61189zy, f7l8Var.f61188toq, f7l8Var.f16286q);
        imageContainer.setBackgroundResource(0);
        C6077k.o1t(imageContainer);
        imageContainer.setOnClickListener(new ViewOnClickListenerC2750q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk() {
        this.f16276q.getWindow().addFlags(1024);
        AbstractC6946k abstractC6946kM6709b = this.f16276q.m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.mcp();
        }
        this.f16283y.setClickable(false);
    }

    private void ld6() {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f16269j, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.7f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.7f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f)).setDuration(200L);
        this.f16272m = duration;
        duration.addListener(new toq());
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this.f16269j, PropertyValuesHolder.ofFloat("scaleX", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f)).setDuration(200L);
        this.f16274o = duration2;
        duration2.addListener(new zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui() {
        this.f16283y.setClickable(true);
        InterfaceC2747g interfaceC2747gFn3e = fn3e();
        if (interfaceC2747gFn3e != null) {
            interfaceC2747gFn3e.cdj();
        }
    }

    private boolean mcp(int indexTag) {
        return Math.abs(indexTag - cdj()) <= 2;
    }

    private void n7h(View imageContainer) {
        imageContainer.setLayoutParams(this.f16264e);
        imageContainer.setPaddingRelative(0, 0, 0, 0);
        imageContainer.setBackgroundColor(-16777216);
        imageContainer.setOnClickListener(new ViewOnClickListenerC2749n());
    }

    private boolean o1t() {
        return this.f16278s != null && this.f16283y.qrj(0) == this.f16278s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oc() {
        this.f16276q.getWindow().clearFlags(1024);
        AbstractC6946k abstractC6946kM6709b = this.f16276q.m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.mo155d();
        }
        for (int i2 = 0; i2 < this.f16282x.size(); i2++) {
            m9577h(fu4(i2));
        }
        int iCdj = cdj();
        ViewGroup viewGroup = this.f16278s;
        if (viewGroup != null) {
            this.f16283y.addView(viewGroup, 0);
        }
        this.f16273n.removeView(this.f16283y);
        this.f16280u.toq(this.f16283y, bv);
        this.f16283y.setBackgroundResource(R.drawable.local_grid_item_bg);
        this.f16283y.setClickable(false);
        m9575f();
        m9581r(iCdj);
        this.f16268i = false;
        if (com.android.thememanager.basemodule.utils.y9n.m7258z()) {
            C1819o.hb(this.f16276q, -1);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m9581r(int indexTag) {
        int iM9584z = m9584z(indexTag);
        if (iM9584z >= 0) {
            this.f16283y.setCurrentScreen(iM9584z);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m9582s(ImageView imageView, PathEntry pathEntry) {
        this.f16282x.add(pathEntry);
        FrameLayout frameLayout = new FrameLayout(this.f16276q);
        frameLayout.addView(imageView);
        m9577h(frameLayout);
        this.f16283y.addView(frameLayout, this.f16263c);
        frameLayout.setTag(Integer.valueOf(this.f16282x.size() - 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wvg(int indexTag) {
        for (int i2 = 0; i2 < this.f16282x.size(); i2++) {
            if (mcp(i2)) {
                x2(i2);
            }
        }
    }

    private void x2(int indexTag) {
        String onlinePath;
        if (indexTag < 0 || indexTag >= this.f16282x.size() || this.f16282x.get(indexTag) == null) {
            return;
        }
        ImageView imageView = (ImageView) ((ViewGroup) fu4(indexTag)).getChildAt(0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        PathEntry pathEntry = this.f16282x.get(indexTag);
        if (pathEntry instanceof PathVideoEntry) {
            PathVideoEntry pathVideoEntry = (PathVideoEntry) pathEntry;
            onlinePath = this.f16284z ? pathVideoEntry.getOnlinePath() : pathVideoEntry.getOnlineSecondPath();
        } else {
            onlinePath = this.f16281v ? pathEntry.getOnlinePath() : pathEntry.getAbsoluteLocalPath();
        }
        if (TextUtils.isEmpty(onlinePath) || onlinePath.equals(imageView.getTag(R.id.screen_image_tag))) {
            return;
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) imageView.getContext(), onlinePath, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.resource_preview_bg).lvui(true));
        imageView.setTag(R.id.screen_image_tag, onlinePath);
    }

    /* JADX INFO: renamed from: z */
    private int m9584z(int indexTag) {
        for (int i2 = 0; i2 < this.f16283y.getScreenCount(); i2++) {
            if (((Integer) this.f16283y.qrj(i2).getTag()).intValue() == indexTag) {
                return i2;
            }
        }
        return -1;
    }

    public int cdj() {
        ResourceScreenView resourceScreenView = this.f16283y;
        View viewQrj = resourceScreenView.qrj(resourceScreenView.getCurrentScreenIndex());
        if (viewQrj == null) {
            return 0;
        }
        return ((Integer) viewQrj.getTag()).intValue();
    }

    public void dd(View header) {
        if (header == null || this.f16278s != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f16276q);
        this.f16278s = frameLayout;
        f7l8 f7l8Var = this.f16265f;
        frameLayout.setPaddingRelative(f7l8Var.f16285k, f7l8Var.f61189zy, f7l8Var.f61188toq, f7l8Var.f16286q);
        this.f16278s.addView(header, this.f16264e);
        this.f16278s.setLayoutParams(this.f16263c);
        this.f16278s.setTag(-1);
        if (m9587t()) {
            return;
        }
        int iCdj = cdj();
        int i2 = iCdj != 0 ? iCdj : -1;
        this.f16283y.addView(this.f16278s, 0);
        wvg(i2);
        m9575f();
        m9581r(i2);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@zy.lvui InterfaceC0954z owner) {
    }

    public InterfaceC2747g fn3e() {
        WeakReference<InterfaceC2747g> weakReference = this.f16275p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public PathEntry ki() {
        if (this.f16282x.isEmpty()) {
            return null;
        }
        return this.f16282x.get(0);
    }

    public void kja0() {
        this.f16284z = false;
        this.f16272m.start();
    }

    /* JADX INFO: renamed from: l */
    public void m9585l(boolean able) {
        ResourceScreenView resourceScreenView = this.f16283y;
        if (resourceScreenView != null) {
            resourceScreenView.setClickable(able);
        }
    }

    public void n5r1(int indexTag) {
        this.f16267h = indexTag;
    }

    public void ncyb(InterfaceC2747g l2) {
        this.f16275p = new WeakReference<>(l2);
    }

    public int ni7() {
        return this.f16277r;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@zy.lvui InterfaceC0954z owner) {
        this.f16270k = false;
        this.f16280u.zy(this.f16283y, an);
    }

    /* JADX INFO: renamed from: p */
    public void m9586p(List<PathEntry> previewEntrys, int previewRatio) {
        if (previewEntrys == null) {
            previewEntrys = new ArrayList<>();
        }
        if (this.f16279t != previewRatio) {
            AbstractActivityC1717k abstractActivityC1717k = this.f16276q;
            boolean z2 = this.f16281v;
            this.f16279t = previewRatio;
            int iIntValue = ((Integer) ch.jp0y(abstractActivityC1717k, z2, previewRatio).second).intValue();
            this.f16271l = iIntValue;
            ViewGroup.LayoutParams layoutParams = this.f16263c;
            f7l8 f7l8Var = this.f16265f;
            layoutParams.height = iIntValue + f7l8Var.f61189zy + f7l8Var.f16286q;
        }
        this.f16283y.m10508z();
        this.f16282x.clear();
        ViewGroup viewGroup = this.f16278s;
        if (viewGroup != null) {
            this.f16283y.addView(viewGroup, 0);
        }
        for (int i2 = 0; i2 < previewEntrys.size(); i2++) {
            NinePatchImageView ninePatchImageView = new NinePatchImageView(this.f16276q);
            ninePatchImageView.setAutoRecycle(false);
            ninePatchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ninePatchImageView.setImageResource(R.drawable.resource_preview_bg);
            m9582s(ninePatchImageView, previewEntrys.get(i2));
            int i3 = this.f16262b;
            if (i3 > 0) {
                ninePatchImageView.setBackgroundResource(i3);
                if (this.f16261a > 0) {
                    int dimensionPixelSize = this.f16276q.getResources().getDimensionPixelSize(this.f16261a);
                    ninePatchImageView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
            }
        }
        if (previewEntrys.isEmpty()) {
            NinePatchImageView ninePatchImageView2 = new NinePatchImageView(this.f16276q);
            ninePatchImageView2.setAutoRecycle(false);
            ninePatchImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            ninePatchImageView2.setImageResource(R.drawable.resource_preview_empty);
            m9582s(ninePatchImageView2, new PathEntry(null, null));
            this.f16283y.setClickable(false);
        }
        if (this.f16267h == -2) {
            this.f16267h = ((Integer) this.f16283y.qrj(0).getTag()).intValue();
        }
        m9581r(this.f16267h);
        m9575f();
    }

    protected void qrj(int clickIndexTag) {
        InterfaceC2747g interfaceC2747gFn3e = fn3e();
        if (interfaceC2747gFn3e == null || !interfaceC2747gFn3e.yz()) {
            if (clickIndexTag != cdj()) {
                m9581r(clickIndexTag);
            }
            if (cdj() != -1) {
                this.f16284z = true;
                this.f16274o.start();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m9587t() {
        return this.f16268i;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@zy.lvui InterfaceC0954z owner) {
        this.f16270k = true;
        this.f16280u.toq(this.f16283y, an);
        wvg(cdj());
    }

    public void x9kr(int imageResId, int paddingResId) {
        this.f16262b = imageResId;
        this.f16261a = paddingResId;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@zy.lvui InterfaceC0954z owner) {
    }
}
