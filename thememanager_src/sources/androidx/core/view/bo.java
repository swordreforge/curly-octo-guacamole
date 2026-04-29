package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.C0846k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.C5693g;
import cyoe.InterfaceC5981k;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.InterfaceC7833l;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0087\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0086\b\u001a%\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\b\u001a%\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0087\b\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0086\b\u001a9\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0087\b¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u00102\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\"*\u00105\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00107¨\u0006C"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/c;", "name", C5693g.ae, "Lkotlin/was;", "action", "q", "zy", "Landroidx/core/view/r;", "n", "k", "toq", "", "start", "top", C3678q.f65807ch, com.android.thememanager.util.hb.f61266fu4, "wvg", "left", "right", "z", "size", "fn3e", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "cdj", "ki", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", C7704k.y.toq.f95579toq, "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/fn3e;", "block", "ni7", C0846k.zaso, "fu4", "(Landroid/view/View;Lcyoe/x2;)V", "", "value", AnimatedProperty.PROPERTY_NAME_H, "(Landroid/view/View;)Z", "zurt", "(Landroid/view/View;Z)V", "isVisible", "kja0", "i", "isInvisible", "n7h", "t8r", "isGone", "p", "(Landroid/view/View;)I", "marginLeft", "qrj", "marginTop", "ld6", "marginRight", AnimatedProperty.PROPERTY_NAME_Y, "marginBottom", "x2", "marginStart", C7704k.y.toq.f44691k, "marginEnd", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class bo {

    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class f7l8 implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k f3975k;

        public f7l8(InterfaceC5981k interfaceC5981k) {
            this.f3975k = interfaceC5981k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3975k.invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.bo$g */
    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class RunnableC0674g implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k f3976k;

        public RunnableC0674g(InterfaceC5981k interfaceC5981k) {
            this.f3976k = interfaceC5981k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3976k.invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.bo$k */
    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/bo$k", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", C5693g.ae, "Lkotlin/was;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class ViewOnAttachStateChangeListenerC0675k implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f3977k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2 f3978q;

        public ViewOnAttachStateChangeListenerC0675k(View view, cyoe.x2 x2Var) {
            this.f3977k = view;
            this.f3978q = x2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC7396q View view) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
            this.f3977k.removeOnAttachStateChangeListener(this);
            this.f3978q.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC7396q View view) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.bo$n */
    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class RunnableC0676n implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f3979k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2 f3980q;

        public RunnableC0676n(View view, cyoe.x2 x2Var) {
            this.f3979k = view;
            this.f3980q = x2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3980q.invoke(this.f3979k);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.bo$q */
    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/bo$q", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", C5693g.ae, "", "left", "top", "right", com.android.thememanager.util.hb.f61266fu4, "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/was;", "onLayoutChange", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class ViewOnLayoutChangeListenerC0677q implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3981k;

        public ViewOnLayoutChangeListenerC0677q(cyoe.x2 x2Var) {
            this.f3981k = x2Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@InterfaceC7396q View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f3981k.invoke(view);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/bo$toq", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", C5693g.ae, "Lkotlin/was;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f3982k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2 f3983q;

        public toq(View view, cyoe.x2 x2Var) {
            this.f3982k = view;
            this.f3983q = x2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC7396q View view) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC7396q View view) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
            this.f3982k.removeOnAttachStateChangeListener(this);
            this.f3983q.invoke(view);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/view/bo$q", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", C5693g.ae, "", "left", "top", "right", com.android.thememanager.util.hb.f61266fu4, "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/was;", "onLayoutChange", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class zy implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3984k;

        public zy(cyoe.x2 x2Var) {
            this.f3984k = x2Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@InterfaceC7396q View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            kotlin.jvm.internal.d2ok.cdj(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f3984k.invoke(view);
        }
    }

    @InterfaceC7396q
    public static final Runnable cdj(@InterfaceC7396q View postDelayed, long j2, @InterfaceC7396q InterfaceC5981k<kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(postDelayed, "$this$postDelayed");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        RunnableC0674g runnableC0674g = new RunnableC0674g(action);
        postDelayed.postDelayed(runnableC0674g, j2);
        return runnableC0674g;
    }

    public static /* synthetic */ Bitmap f7l8(View view, Bitmap.Config config, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m3128g(view, config);
    }

    public static final void fn3e(@InterfaceC7396q View setPadding, @InterfaceC7833l int i2) {
        kotlin.jvm.internal.d2ok.cdj(setPadding, "$this$setPadding");
        setPadding.setPadding(i2, i2, i2, i2);
    }

    @InterfaceC6769y(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void fu4(@InterfaceC7396q View updateLayoutParams, @InterfaceC7396q cyoe.x2<? super T, kotlin.was> block) {
        kotlin.jvm.internal.d2ok.cdj(updateLayoutParams, "$this$updateLayoutParams");
        kotlin.jvm.internal.d2ok.cdj(block, "block");
        ViewGroup.LayoutParams layoutParams = updateLayoutParams.getLayoutParams();
        kotlin.jvm.internal.d2ok.m23086z(1, C0846k.zaso);
        block.invoke(layoutParams);
        updateLayoutParams.setLayoutParams(layoutParams);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Bitmap m3128g(@InterfaceC7396q View drawToBitmap, @InterfaceC7396q Bitmap.Config config) {
        kotlin.jvm.internal.d2ok.cdj(drawToBitmap, "$this$drawToBitmap");
        kotlin.jvm.internal.d2ok.cdj(config, "config");
        if (!C0683f.v0af(drawToBitmap)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawToBitmap.getWidth(), drawToBitmap.getHeight(), config);
        kotlin.jvm.internal.d2ok.m23085y(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-drawToBitmap.getScrollX(), -drawToBitmap.getScrollY());
        drawToBitmap.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m3129h(@InterfaceC7396q View isVisible) {
        kotlin.jvm.internal.d2ok.cdj(isVisible, "$this$isVisible");
        return isVisible.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public static final void m3130i(@InterfaceC7396q View isInvisible, boolean z2) {
        kotlin.jvm.internal.d2ok.cdj(isInvisible, "$this$isInvisible");
        isInvisible.setVisibility(z2 ? 4 : 0);
    }

    /* JADX INFO: renamed from: k */
    public static final void m3131k(@InterfaceC7396q View doOnAttach, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(doOnAttach, "$this$doOnAttach");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        if (C0683f.zsr0(doOnAttach)) {
            action.invoke(doOnAttach);
        } else {
            doOnAttach.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0675k(doOnAttach, action));
        }
    }

    @InterfaceC7396q
    @zy.hyr(16)
    public static final Runnable ki(@InterfaceC7396q View postOnAnimationDelayed, long j2, @InterfaceC7396q InterfaceC5981k<kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(postOnAnimationDelayed, "$this$postOnAnimationDelayed");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        f7l8 f7l8Var = new f7l8(action);
        postOnAnimationDelayed.postOnAnimationDelayed(f7l8Var, j2);
        return f7l8Var;
    }

    public static final boolean kja0(@InterfaceC7396q View isInvisible) {
        kotlin.jvm.internal.d2ok.cdj(isInvisible, "$this$isInvisible");
        return isInvisible.getVisibility() == 4;
    }

    public static final int ld6(@InterfaceC7396q View marginRight) {
        kotlin.jvm.internal.d2ok.cdj(marginRight, "$this$marginRight");
        ViewGroup.LayoutParams layoutParams = marginRight.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final ViewTreeObserverOnPreDrawListenerC0714r m3132n(@InterfaceC7396q View doOnPreDraw, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(doOnPreDraw, "$this$doOnPreDraw");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        ViewTreeObserverOnPreDrawListenerC0714r viewTreeObserverOnPreDrawListenerC0714rM3434k = ViewTreeObserverOnPreDrawListenerC0714r.m3434k(doOnPreDraw, new RunnableC0676n(doOnPreDraw, action));
        kotlin.jvm.internal.d2ok.m23085y(viewTreeObserverOnPreDrawListenerC0714rM3434k, "OneShotPreDrawListener.add(this) { action(this) }");
        return viewTreeObserverOnPreDrawListenerC0714rM3434k;
    }

    public static final boolean n7h(@InterfaceC7396q View isGone) {
        kotlin.jvm.internal.d2ok.cdj(isGone, "$this$isGone");
        return isGone.getVisibility() == 8;
    }

    public static final void ni7(@InterfaceC7396q View updateLayoutParams, @InterfaceC7396q cyoe.x2<? super ViewGroup.LayoutParams, kotlin.was> block) {
        kotlin.jvm.internal.d2ok.cdj(updateLayoutParams, "$this$updateLayoutParams");
        kotlin.jvm.internal.d2ok.cdj(block, "block");
        ViewGroup.LayoutParams layoutParams = updateLayoutParams.getLayoutParams();
        if (layoutParams == null) {
            throw new kotlin.t8iq("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        block.invoke(layoutParams);
        updateLayoutParams.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void o1t(View updatePadding, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = updatePadding.getPaddingLeft();
        }
        if ((i6 & 2) != 0) {
            i3 = updatePadding.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = updatePadding.getPaddingRight();
        }
        if ((i6 & 8) != 0) {
            i5 = updatePadding.getPaddingBottom();
        }
        kotlin.jvm.internal.d2ok.cdj(updatePadding, "$this$updatePadding");
        updatePadding.setPadding(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: p */
    public static final int m3133p(@InterfaceC7396q View marginLeft) {
        kotlin.jvm.internal.d2ok.cdj(marginLeft, "$this$marginLeft");
        ViewGroup.LayoutParams layoutParams = marginLeft.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static final void m3134q(@InterfaceC7396q View doOnNextLayout, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(doOnNextLayout, "$this$doOnNextLayout");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        doOnNextLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0677q(action));
    }

    public static final int qrj(@InterfaceC7396q View marginTop) {
        kotlin.jvm.internal.d2ok.cdj(marginTop, "$this$marginTop");
        ViewGroup.LayoutParams layoutParams = marginTop.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public static final int m3135s(@InterfaceC7396q View marginEnd) {
        kotlin.jvm.internal.d2ok.cdj(marginEnd, "$this$marginEnd");
        ViewGroup.LayoutParams layoutParams = marginEnd.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ki.toq((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m3136t(View updatePaddingRelative, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = updatePaddingRelative.getPaddingStart();
        }
        if ((i6 & 2) != 0) {
            i3 = updatePaddingRelative.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = updatePaddingRelative.getPaddingEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = updatePaddingRelative.getPaddingBottom();
        }
        kotlin.jvm.internal.d2ok.cdj(updatePaddingRelative, "$this$updatePaddingRelative");
        updatePaddingRelative.setPaddingRelative(i2, i3, i4, i5);
    }

    public static final void t8r(@InterfaceC7396q View isGone, boolean z2) {
        kotlin.jvm.internal.d2ok.cdj(isGone, "$this$isGone");
        isGone.setVisibility(z2 ? 8 : 0);
    }

    public static final void toq(@InterfaceC7396q View doOnDetach, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(doOnDetach, "$this$doOnDetach");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        if (C0683f.zsr0(doOnDetach)) {
            doOnDetach.addOnAttachStateChangeListener(new toq(doOnDetach, action));
        } else {
            action.invoke(doOnDetach);
        }
    }

    @zy.hyr(17)
    public static final void wvg(@InterfaceC7396q View updatePaddingRelative, @InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        kotlin.jvm.internal.d2ok.cdj(updatePaddingRelative, "$this$updatePaddingRelative");
        updatePaddingRelative.setPaddingRelative(i2, i3, i4, i5);
    }

    public static final int x2(@InterfaceC7396q View marginStart) {
        kotlin.jvm.internal.d2ok.cdj(marginStart, "$this$marginStart");
        ViewGroup.LayoutParams layoutParams = marginStart.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ki.zy((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public static final int m3137y(@InterfaceC7396q View marginBottom) {
        kotlin.jvm.internal.d2ok.cdj(marginBottom, "$this$marginBottom");
        ViewGroup.LayoutParams layoutParams = marginBottom.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public static final void m3138z(@InterfaceC7396q View updatePadding, @InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        kotlin.jvm.internal.d2ok.cdj(updatePadding, "$this$updatePadding");
        updatePadding.setPadding(i2, i3, i4, i5);
    }

    public static final void zurt(@InterfaceC7396q View isVisible, boolean z2) {
        kotlin.jvm.internal.d2ok.cdj(isVisible, "$this$isVisible");
        isVisible.setVisibility(z2 ? 0 : 8);
    }

    public static final void zy(@InterfaceC7396q View doOnLayout, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(doOnLayout, "$this$doOnLayout");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        if (!C0683f.v0af(doOnLayout) || doOnLayout.isLayoutRequested()) {
            doOnLayout.addOnLayoutChangeListener(new zy(action));
        } else {
            action.invoke(doOnLayout);
        }
    }
}
