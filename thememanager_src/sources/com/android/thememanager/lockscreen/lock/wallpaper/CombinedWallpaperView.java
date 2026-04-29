package com.android.thememanager.lockscreen.lock.wallpaper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.WallpaperTypeInfo;
import com.android.thememanager.lockscreen.lock.wallpaper.n7h;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.miwallpaper.opengl.n7h;
import java.util.HashSet;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CombinedWallpaperView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nCombinedWallpaperView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedWallpaperView.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/CombinedWallpaperView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class CombinedWallpaperView extends FrameLayout implements n7h, n7h.InterfaceC5295k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private View f12402g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private n7h f12403k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private View f12404n;

    /* JADX INFO: renamed from: q */
    private boolean f12405q;

    /* JADX INFO: renamed from: s */
    private float f12406s;

    /* JADX INFO: renamed from: y */
    private float f12407y;

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.CombinedWallpaperView$k */
    /* JADX INFO: compiled from: CombinedWallpaperView.kt */
    public static final class C2114k extends AnimatorListenerAdapter {
        C2114k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animation) {
            d2ok.m23075h(animation, "animation");
            View view = CombinedWallpaperView.this.f12402g;
            if (view != null) {
                CombinedWallpaperView.this.removeView(view);
            }
        }
    }

    /* JADX INFO: compiled from: CombinedWallpaperView.kt */
    public static final class toq extends TransitionListener {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ View f60365toq;

        toq(View view) {
            this.f60365toq = view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(@InterfaceC7395n Object obj) {
            super.onCancel(obj);
            CombinedWallpaperView.this.removeView(this.f60365toq);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(@InterfaceC7395n Object obj) {
            super.onComplete(obj);
            CombinedWallpaperView.this.removeView(this.f60365toq);
        }
    }

    public /* synthetic */ CombinedWallpaperView(Context context, AttributeSet attributeSet, int i2, ni7 ni7Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    private final void cdj(View view, float f2, float f3, AnimConfig animConfig) {
        AnimState animState = new AnimState("start");
        ViewProperty viewProperty = ViewProperty.ALPHA;
        Folme.useAt(view).state().fromTo(animState.add(viewProperty, f2), new AnimState(C3678q.f65807ch).add(viewProperty, f3), animConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fn3e(CombinedWallpaperView this$0, boolean z2, GLTextureView glTextureView) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(glTextureView, "$glTextureView");
        n7h n7hVar = this$0.f12403k;
        d2ok.n7h(n7hVar, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView");
        com.miui.miwallpaper.opengl.n7h n7hVar2 = ((GLTextureView) n7hVar).f12430r;
        if (n7hVar2 != null) {
            n7hVar2.m18026p(z2);
        }
        glTextureView.jk();
    }

    /* JADX INFO: renamed from: h */
    private final void m8087h(TemplateConfig templateConfig, View view) {
        Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "addOriginWallpaperView: ");
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(templateConfig.getCurrentWallpaper());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (view != null) {
            view.setAlpha(0.0f);
        }
        addView(imageView, -1, -1);
        this.f12404n = view;
        this.f12402g = imageView;
    }

    /* JADX INFO: renamed from: i */
    private final void m8088i(MotionEvent motionEvent) {
        setTag(R.id.kg_wallpaper_layer_click_point_tag, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
        performClick();
        setTag(R.id.kg_wallpaper_layer_click_point_tag, null);
    }

    private final void ni7(View view, View view2) {
        view.setAlpha(0.0f);
        addView(view);
        IStateStyle upVar = Folme.useAt(view2).state().setup("oldView-hide");
        ViewProperty viewProperty = ViewProperty.ALPHA;
        upVar.add((FloatProperty) viewProperty, 0.0f).to("oldView-hide", new AnimConfig());
        Folme.useAt(view).state().setup("newView-show").add((FloatProperty) viewProperty, 1.0f).to("newView-show", new AnimConfig().addListeners(new toq(view2)));
    }

    public static /* synthetic */ void setEnableBlurStatus$default(CombinedWallpaperView combinedWallpaperView, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        combinedWallpaperView.setEnableBlurStatus(z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t8r(CombinedWallpaperView this$0) {
        d2ok.m23075h(this$0, "this$0");
        this$0.zurt(this$0.f12404n);
    }

    private final void zurt(View view) {
        Log.i(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "start wallpaper view show animation: wallpaperLayer == " + view);
        if (view == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new C2114k());
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@InterfaceC7395n MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f12407y = motionEvent.getX();
            this.f12406s = motionEvent.getY();
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if (Math.abs(this.f12407y - motionEvent.getX()) < scaledTouchSlop && Math.abs(this.f12406s - motionEvent.getY()) < scaledTouchSlop) {
                m8088i(motionEvent);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public View mo8091g() {
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            return n7hVar.mo8091g();
        }
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public InterfaceC2132s getGestureEndCallback() {
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            return n7hVar.getGestureEndCallback();
        }
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public qrj getGestureManager() {
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            return n7hVar.getGestureManager();
        }
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Bitmap getOriginBitmap() {
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            return n7hVar.getOriginBitmap();
        }
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean getScaleable() {
        n7h n7hVar = this.f12403k;
        d2ok.qrj(n7hVar);
        return n7hVar.getScaleable();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7396q
    public HashSet<t8r> getWallpaperChangedListenerSet() {
        n7h n7hVar = this.f12403k;
        d2ok.qrj(n7hVar);
        return n7hVar.getWallpaperChangedListenerSet();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Matrix getWallpaperMatrix() {
        return n7h.toq.m8140q(this);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: k */
    public void mo8092k(@InterfaceC7395n WallpaperTypeInfo wallpaperTypeInfo) throws Exception {
        if (wallpaperTypeInfo != null && d2ok.f7l8(wallpaperTypeInfo.getType(), "super_wallpaper")) {
            qrj(0);
        }
        Object obj = this.f12403k;
        d2ok.n7h(obj, "null cannot be cast to non-null type android.view.View");
        AnimConfig minDuration = new AnimConfig().setMinDuration(150L);
        d2ok.kja0(minDuration, "setMinDuration(...)");
        cdj((View) obj, 1.0f, 0.0f, minDuration);
        Object obj2 = this.f12403k;
        d2ok.n7h(obj2, "null cannot be cast to non-null type android.view.View");
        AnimConfig minDuration2 = new AnimConfig().setMinDuration(300L);
        d2ok.kja0(minDuration2, "setMinDuration(...)");
        cdj((View) obj2, 0.0f, 1.0f, minDuration2);
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            n7hVar.mo8092k(wallpaperTypeInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ki(@InterfaceC7396q TemplateConfig templateConfig, boolean z2) {
        d2ok.m23075h(templateConfig, "templateConfig");
        n7h.C2128k c2128k = n7h.fs9;
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        View viewM8136q = c2128k.m8136q(context, templateConfig, z2, this);
        WallpaperInfo wallpaperInfo = templateConfig.getWallpaperInfo();
        int magicType = wallpaperInfo != null ? wallpaperInfo.getMagicType() : 0;
        WallpaperInfo wallpaperInfo2 = templateConfig.getWallpaperInfo();
        if (kja0.f12503k.m8125g(magicType, wallpaperInfo2 != null ? wallpaperInfo2.getEnableBlur() : false)) {
            m8087h(templateConfig, viewM8136q);
        }
        d2ok.n7h(viewM8136q, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.IWallpaperLayer");
        this.f12403k = (n7h) viewM8136q;
        addView(viewM8136q);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void kja0(@InterfaceC7395n t8r t8rVar) {
        n7h.toq.m8138k(this, t8rVar);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public WallpaperPositionInfo n7h(@InterfaceC7395n Bitmap bitmap) {
        return n7h.toq.toq(this, bitmap);
    }

    @Override // com.miui.miwallpaper.opengl.n7h.InterfaceC5295k
    public void onDrawFrame(@InterfaceC7395n GL10 gl10) {
        post(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.n
            @Override // java.lang.Runnable
            public final void run() {
                CombinedWallpaperView.t8r(this.f12512k);
            }
        });
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void qrj(int i2) throws Exception {
        n7h.toq.m8137g(this, i2);
        n7h n7hVar = this.f12403k;
        if (n7hVar == null) {
            throw new Exception("please init first");
        }
        Boolean boolValueOf = n7hVar != null ? Boolean.valueOf(n7hVar.getScaleable()) : null;
        if (kja0.f12503k.m8127n(i2) && (this.f12403k instanceof GLTextureView)) {
            Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "switch Glass Shader: " + i2);
            n7h n7hVar2 = this.f12403k;
            d2ok.n7h(n7hVar2, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView");
            ((GLTextureView) n7hVar2).qrj(i2);
        }
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            n7h n7hVar3 = this.f12403k;
            if (n7hVar3 == null) {
                return;
            }
            n7hVar3.setScaleable(boolValueOf.booleanValue());
        }
    }

    public final void setEnableBlurStatus(final boolean z2, boolean z3) {
        if (this.f12405q == z2) {
            return;
        }
        this.f12405q = z2;
        if (z3) {
            n7h n7hVar = this.f12403k;
            if (n7hVar instanceof GLTextureView) {
                d2ok.n7h(n7hVar, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView");
                final GLTextureView gLTextureView = (GLTextureView) n7hVar;
                gLTextureView.mcp(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        CombinedWallpaperView.fn3e(this.f12514k, z2, gLTextureView);
                    }
                });
            }
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setGestureEndCallback(@InterfaceC7395n InterfaceC2132s interfaceC2132s) {
        n7h n7hVar = this.f12403k;
        if (n7hVar == null) {
            return;
        }
        n7hVar.setGestureEndCallback(interfaceC2132s);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setImageAndPosition(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        n7h n7hVar = this.f12403k;
        if (n7hVar != null) {
            n7hVar.setImageAndPosition(bitmap, wallpaperPositionInfo);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setOriginBitmap(@InterfaceC7395n Bitmap bitmap) {
        n7h n7hVar = this.f12403k;
        if (n7hVar == null) {
            return;
        }
        n7hVar.setOriginBitmap(bitmap);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setScaleable(boolean z2) {
        n7h n7hVar = this.f12403k;
        if (n7hVar == null) {
            return;
        }
        n7hVar.setScaleable(z2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean x2() {
        return n7h.toq.m8139n(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedWallpaperView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
        d2ok.m23075h(context, "context");
    }
}
