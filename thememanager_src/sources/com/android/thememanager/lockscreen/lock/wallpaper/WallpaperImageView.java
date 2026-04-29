package com.android.thememanager.lockscreen.lock.wallpaper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.wallpaper.n7h;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WallpaperImageView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nWallpaperImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallpaperImageView.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/WallpaperImageView\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n26#2:136\n1855#3,2:137\n*S KotlinDebug\n*F\n+ 1 WallpaperImageView.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/WallpaperImageView\n*L\n50#1:136\n94#1:137,2\n*E\n"})
public final class WallpaperImageView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC2129p, n7h {

    /* JADX INFO: renamed from: g */
    private boolean f12474g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final HashSet<t8r> f12475h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private InterfaceC2132s f12476p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private Bitmap f12477s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private qrj f12478y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperImageView(@InterfaceC7396q Context context) {
        this(context, null, 0, 6, null);
        d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperImageView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ WallpaperImageView(Context context, AttributeSet attributeSet, int i2, int i3, ni7 ni7Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        qrj qrjVar = this.f12478y;
        RectF rectFM8150i = qrjVar != null ? qrjVar.m8150i() : null;
        if (rectFM8150i == null || rectFM8150i.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (rectFM8150i.right < getWidth() + 1) {
                return false;
            }
        } else if (rectFM8150i.left > -1.0f) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        qrj qrjVar = this.f12478y;
        RectF rectFM8150i = qrjVar != null ? qrjVar.m8150i() : null;
        if (rectFM8150i == null || rectFM8150i.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (rectFM8150i.bottom < getHeight() + 1) {
                return false;
            }
        } else if (rectFM8150i.top > -1.0f) {
            return false;
        }
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public View mo8091g() {
        return this;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public InterfaceC2132s getGestureEndCallback() {
        return this.f12476p;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public qrj getGestureManager() {
        return this.f12478y;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Bitmap getOriginBitmap() {
        return this.f12477s;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean getScaleable() {
        return this.f12474g;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7396q
    public HashSet<t8r> getWallpaperChangedListenerSet() {
        return this.f12475h;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Matrix getWallpaperMatrix() {
        return n7h.toq.m8140q(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8092k(@mub.InterfaceC7395n com.android.thememanager.lockscreen.lock.WallpaperTypeInfo r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            android.graphics.Bitmap r1 = r4.getBitmap()
            goto L9
        L8:
            r1 = r0
        L9:
            r3.setImageAndPosition(r1, r0)
            if (r4 == 0) goto L13
            java.lang.String r1 = r4.getType()
            goto L14
        L13:
            r1 = r0
        L14:
            java.lang.String r2 = "super_wallpaper"
            boolean r1 = kotlin.jvm.internal.d2ok.f7l8(r1, r2)
            if (r1 != 0) goto L2c
            if (r4 == 0) goto L22
            java.lang.String r0 = r4.getType()
        L22:
            java.lang.String r4 = "video"
            boolean r4 = kotlin.jvm.internal.d2ok.f7l8(r0, r4)
            if (r4 != 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r3.setScaleable(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.lockscreen.lock.wallpaper.WallpaperImageView.mo8092k(com.android.thememanager.lockscreen.lock.WallpaperTypeInfo):void");
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

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        qrj qrjVar = this.f12478y;
        if (qrjVar != null) {
            qrjVar.lvui();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@InterfaceC7396q MotionEvent event) {
        d2ok.m23075h(event, "event");
        if (!getScaleable()) {
            return false;
        }
        qrj qrjVar = this.f12478y;
        if (qrjVar == null) {
            return getScaleable();
        }
        d2ok.qrj(qrjVar);
        boolean zOnTouchEvent = qrjVar.cdj().onTouchEvent(event);
        qrj qrjVar2 = this.f12478y;
        d2ok.qrj(qrjVar2);
        boolean zOnTouchEvent2 = qrjVar2.ld6().onTouchEvent(event);
        boolean z2 = event.getAction() == 1;
        if (!zOnTouchEvent2 && z2) {
            qrj qrjVar3 = this.f12478y;
            d2ok.qrj(qrjVar3);
            if (!qrjVar3.o1t()) {
                qrj qrjVar4 = this.f12478y;
                d2ok.qrj(qrjVar4);
                qrjVar4.m8152t();
            }
        }
        return zOnTouchEvent || zOnTouchEvent2;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void qrj(int i2) {
        n7h.toq.m8137g(this, i2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setGestureEndCallback(@InterfaceC7395n InterfaceC2132s interfaceC2132s) {
        this.f12476p = interfaceC2132s;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setImageAndPosition(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        qrj qrjVar;
        super.setImageBitmap(bitmap);
        setOriginBitmap(bitmap);
        if (bitmap != null) {
            Resources resources = getResources();
            d2ok.kja0(resources, "getResources(...)");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            this.f12478y = null;
            Context context = getContext();
            d2ok.kja0(context, "getContext(...)");
            this.f12478y = new qrj(context, this, this, bitmapDrawable, wallpaperPositionInfo);
            if (getHeight() <= 0 || (qrjVar = this.f12478y) == null) {
                return;
            }
            qrjVar.lvui();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setOriginBitmap(@InterfaceC7395n Bitmap bitmap) {
        this.f12477s = bitmap;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setScaleable(boolean z2) {
        this.f12474g = z2;
        qrj qrjVar = this.f12478y;
        if (qrjVar == null) {
            return;
        }
        qrjVar.d2ok(z2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean x2() {
        return n7h.toq.m8139n(this);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p
    /* JADX INFO: renamed from: y */
    public void mo8119y(@InterfaceC7396q Matrix matrix, @InterfaceC7395n Boolean bool) {
        d2ok.m23075h(matrix, "matrix");
        setImageMatrix(matrix);
        Iterator<T> it = getWallpaperChangedListenerSet().iterator();
        while (it.hasNext()) {
            ((t8r) it.next()).mo8039h(matrix);
        }
        getWallpaperChangedListenerSet();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperImageView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d2ok.m23075h(context, "context");
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f12474g = true;
        this.f12475h = new HashSet<>();
    }
}
