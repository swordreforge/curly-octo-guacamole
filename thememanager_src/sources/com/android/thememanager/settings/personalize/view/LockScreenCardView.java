package com.android.thememanager.settings.personalize.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.DoodleInfo;
import com.android.thememanager.lockscreen.lock.SignatureInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.base.BaseTemplateView;
import com.android.thememanager.lockscreen.lock.task.C2112y;
import com.android.thememanager.recommend.view.C2451n;
import com.miui.clock.MiuiClockView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import i1.C6077k;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.smooth.SmoothFrameLayout2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LockScreenCardView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LockScreenCardView extends SmoothFrameLayout2 {

    /* JADX INFO: renamed from: d */
    @InterfaceC7396q
    private static final String f15314d = "LockScreenCardView";

    /* JADX INFO: renamed from: v */
    @InterfaceC7396q
    public static final C2589k f15315v = new C2589k(null);

    /* JADX INFO: renamed from: a */
    private long f15316a;

    /* JADX INFO: renamed from: b */
    private Point f15317b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f60834bo;

    /* JADX INFO: renamed from: c */
    private boolean f15318c;

    /* JADX INFO: renamed from: e */
    private FrameLayout f15319e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private MiuiClockView f15320f;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private TemplateConfig f15321j;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private LockScreenImageView f15322l;

    /* JADX INFO: renamed from: m */
    private float f15323m;

    /* JADX INFO: renamed from: o */
    @InterfaceC7395n
    private BaseTemplateView f15324o;

    /* JADX INFO: renamed from: u */
    private boolean f15325u;

    /* JADX INFO: renamed from: x */
    private boolean f15326x;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.view.LockScreenCardView$k */
    /* JADX INFO: compiled from: LockScreenCardView.kt */
    public static final class C2589k {
        private C2589k() {
        }

        public /* synthetic */ C2589k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: LockScreenCardView.kt */
    public static final class toq extends TransitionListener {
        toq() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(@InterfaceC7395n Object obj) {
            super.onComplete(obj);
            BaseTemplateView baseTemplateView = LockScreenCardView.this.f15324o;
            if (baseTemplateView != null) {
                baseTemplateView.setAlpha(1.0f);
            }
            BaseTemplateView baseTemplateView2 = LockScreenCardView.this.f15324o;
            if (baseTemplateView2 != null) {
                baseTemplateView2.setVisibility(0);
            }
            LockScreenCardView.this.f15325u = true;
            if (LockScreenCardView.this.f15326x) {
                LockScreenImageView lockScreenImageView = LockScreenCardView.this.f15322l;
                if (lockScreenImageView != null) {
                    lockScreenImageView.setAlpha(0.0f);
                }
                LockScreenImageView lockScreenImageView2 = LockScreenCardView.this.f15322l;
                if (lockScreenImageView2 != null) {
                    lockScreenImageView2.setVisibility(4);
                }
                LockScreenCardView.this.f15326x = false;
            }
        }
    }

    /* JADX INFO: compiled from: LockScreenCardView.kt */
    public static final class zy extends TransitionListener {
        zy() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(@InterfaceC7395n Object obj) {
            LockScreenImageView lockScreenImageView = LockScreenCardView.this.f15322l;
            if (lockScreenImageView != null) {
                lockScreenImageView.setAlpha(1.0f);
            }
            LockScreenImageView lockScreenImageView2 = LockScreenCardView.this.f15322l;
            if (lockScreenImageView2 != null) {
                lockScreenImageView2.setVisibility(0);
            }
            LockScreenCardView.this.f15326x = true;
            BaseTemplateView baseTemplateView = LockScreenCardView.this.f15324o;
            if (baseTemplateView != null) {
                baseTemplateView.setAlpha(0.0f);
            }
            BaseTemplateView baseTemplateView2 = LockScreenCardView.this.f15324o;
            if (baseTemplateView2 != null) {
                baseTemplateView2.setVisibility(4);
            }
            if (LockScreenCardView.this.f15324o != null) {
                LockScreenCardView lockScreenCardView = LockScreenCardView.this;
                FrameLayout frameLayout = lockScreenCardView.f15319e;
                if (frameLayout == null) {
                    d2ok.n5r1("mHolder");
                    frameLayout = null;
                }
                frameLayout.removeView(lockScreenCardView.f15324o);
            }
            LockScreenCardView.this.f15325u = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public LockScreenCardView(@InterfaceC7396q Context context) {
        this(context, null, 0, 6, null);
        d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public LockScreenCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ LockScreenCardView(Context context, AttributeSet attributeSet, int i2, int i3, ni7 ni7Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v10, types: [T, android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean fn3e(com.android.thememanager.settings.personalize.view.LockScreenCardView r6, kotlin.jvm.internal.i1.C6299y r7, android.graphics.Bitmap r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.d2ok.m23075h(r6, r0)
            java.lang.String r0 = "$darkBitmap"
            kotlin.jvm.internal.d2ok.m23075h(r7, r0)
            com.android.thememanager.lockscreen.lock.TemplateConfig r0 = com.android.thememanager.settings.superwallpaper.utils.C2670y.m9306k()
            r6.f15321j = r0
            java.lang.String r1 = "LockScreenCardView"
            r2 = 0
            if (r0 == 0) goto L22
            com.android.thememanager.lockscreen.lock.WallpaperInfo r0 = r0.getWallpaperInfo()     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getCropSubject()     // Catch: java.lang.Exception -> L20
            goto L23
        L20:
            r6 = move-exception
            goto L7d
        L22:
            r0 = r2
        L23:
            com.android.thememanager.lockscreen.lock.TemplateConfig r3 = r6.f15321j     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L2c
            com.android.thememanager.lockscreen.lock.WallpaperInfo r3 = r3.getWallpaperInfo()     // Catch: java.lang.Exception -> L20
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 != 0) goto L30
            goto L3a
        L30:
            com.android.thememanager.lockscreen.lock.wallpaper.toq r4 = com.android.thememanager.lockscreen.lock.wallpaper.toq.f12529k     // Catch: java.lang.Exception -> L20
            r5 = -1
            android.graphics.Bitmap r0 = r4.m8158n(r0, r5, r5)     // Catch: java.lang.Exception -> L20
            r3.setSubjectBitmap(r0)     // Catch: java.lang.Exception -> L20
        L3a:
            com.android.thememanager.wallpaper.n r0 = com.android.thememanager.wallpaper.C2951n.fn3e()     // Catch: java.lang.Exception -> L20
            r3 = 1
            boolean r0 = r0.o1t(r3)     // Catch: java.lang.Exception -> L20
            com.android.thememanager.lockscreen.lock.TemplateConfig r4 = r6.f15321j     // Catch: java.lang.Exception -> L20
            if (r4 == 0) goto L4b
            com.android.thememanager.lockscreen.lock.WallpaperInfo r2 = r4.getWallpaperInfo()     // Catch: java.lang.Exception -> L20
        L4b:
            if (r2 != 0) goto L4e
            goto L51
        L4e:
            r2.setNeedDark(r0)     // Catch: java.lang.Exception -> L20
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r2.<init>()     // Catch: java.lang.Exception -> L20
            java.lang.String r4 = "setupLockTemplateView: "
            r2.append(r4)     // Catch: java.lang.Exception -> L20
            com.android.thememanager.lockscreen.lock.TemplateConfig r6 = r6.f15321j     // Catch: java.lang.Exception -> L20
            r2.append(r6)     // Catch: java.lang.Exception -> L20
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L20
            android.util.Log.d(r1, r6)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L95
            android.content.Context r6 = bf2.toq.toq()     // Catch: java.lang.Exception -> L20
            com.bumptech.glide.zy r6 = com.bumptech.glide.zy.m11283n(r6)     // Catch: java.lang.Exception -> L20
            com.bumptech.glide.load.engine.bitmap_recycle.n r6 = r6.m11289y()     // Catch: java.lang.Exception -> L20
            r0 = 0
            android.graphics.Bitmap r6 = com.android.thememanager.util.x9kr.m10069g(r8, r6, r0, r3)     // Catch: java.lang.Exception -> L20
            r7.element = r6     // Catch: java.lang.Exception -> L20
            goto L95
        L7d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "copy subject: failed="
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.d(r1, r6)
        L95:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.view.LockScreenCardView.fn3e(com.android.thememanager.settings.personalize.view.LockScreenCardView, kotlin.jvm.internal.i1$y, android.graphics.Bitmap):java.lang.Boolean");
    }

    private final void setupLockTemplateView(final Bitmap bitmap) {
        if (!o1t.m7171i() || bitmap == null) {
            return;
        }
        final i1.C6299y c6299y = new i1.C6299y();
        LockScreenImageView lockScreenImageView = this.f15322l;
        if (lockScreenImageView != null) {
            lockScreenImageView.setImageBitmap(null);
        }
        C2112y.toq(new Supplier() { // from class: com.android.thememanager.settings.personalize.view.zy
            @Override // java.util.function.Supplier
            public final Object get() {
                return LockScreenCardView.fn3e(this.f15355k, c6299y, bitmap);
            }
        }).ld6(new Consumer() { // from class: com.android.thememanager.settings.personalize.view.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LockScreenCardView.zurt(this.f15352k, bitmap, c6299y, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t8r(LockScreenCardView this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        if (this$0.getContext() instanceof Activity) {
            Context context = this$0.getContext();
            d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
            if (C1819o.dd((Activity) context)) {
                nn86.m7150k(R.string.multiwindow_no_support, 0);
                return;
            }
        }
        if (SystemClock.elapsedRealtime() - this$0.f15316a <= 800) {
            return;
        }
        this$0.f15316a = SystemClock.elapsedRealtime();
        Context context2 = this$0.getContext();
        d2ok.n7h(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C2451n.m8800p((ActivityC0891q) context2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void zurt(LockScreenCardView this$0, Bitmap bitmap, i1.C6299y darkBitmap, Boolean bool) {
        FrameLayout frameLayout;
        TemplateConfig templateConfig;
        ClockInfo clockInfo;
        TemplateConfig templateConfig2;
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(darkBitmap, "$darkBitmap");
        if (this$0.f15321j == null) {
            return;
        }
        if (this$0.f15324o != null) {
            FrameLayout frameLayout2 = this$0.f15319e;
            if (frameLayout2 == null) {
                d2ok.n5r1("mHolder");
                frameLayout2 = null;
            }
            frameLayout2.removeView(this$0.f15324o);
        }
        TemplateConfig templateConfig3 = this$0.f15321j;
        if ((templateConfig3 != null ? templateConfig3.getWallpaperInfo() : null) == null && (templateConfig2 = this$0.f15321j) != null) {
            templateConfig2.setWallpaperInfo(new WallpaperInfo("", null, null, 0, null, null, null, null, false, false, false, 1792, null));
        }
        com.android.thememanager.lockscreen.lock.zy zyVar = com.android.thememanager.lockscreen.lock.zy.f12538k;
        Context context = this$0.getContext();
        d2ok.kja0(context, "getContext(...)");
        TemplateConfig templateConfig4 = this$0.f15321j;
        String templateId = (templateConfig4 == null || (clockInfo = templateConfig4.getClockInfo()) == null) ? null : clockInfo.getTemplateId();
        d2ok.qrj(templateId);
        Point point = this$0.f15317b;
        if (point == null) {
            d2ok.n5r1("mSize");
            point = null;
        }
        int i2 = point.x;
        Point point2 = this$0.f15317b;
        if (point2 == null) {
            d2ok.n5r1("mSize");
            point2 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, point2.y);
        float f2 = this$0.f15323m;
        BaseTemplateView qVar = zyVar.toq(context, templateId, layoutParams, f2, f2);
        this$0.f15324o = qVar;
        if (qVar != null) {
            qVar.kja0();
        }
        TemplateConfig templateConfig5 = this$0.f15321j;
        if (templateConfig5 != null) {
            templateConfig5.setCurrentWallpaper(bitmap);
        }
        T t2 = darkBitmap.element;
        if (((Bitmap) t2) != null && (templateConfig = this$0.f15321j) != null) {
            templateConfig.setDarkenBitmap((Bitmap) t2);
        }
        BaseTemplateView baseTemplateView = this$0.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.m8051z(this$0.f15321j, true, false);
        }
        Log.d(f15314d, "update Template View");
        FrameLayout frameLayout3 = this$0.f15319e;
        if (frameLayout3 == null) {
            d2ok.n5r1("mHolder");
            frameLayout = null;
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.addView(this$0.f15324o);
        if (this$0.f15326x) {
            this$0.fu4();
        }
        if (this$0.f60834bo) {
            this$0.fu4();
            this$0.f60834bo = false;
        }
    }

    public final void a9(@InterfaceC7396q ClockInfo clockInfo) {
        d2ok.m23075h(clockInfo, "clockInfo");
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.oc(clockInfo);
        }
    }

    public final void fti(@InterfaceC7396q SignatureInfo signature) {
        d2ok.m23075h(signature, "signature");
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.mo8047r(signature);
        }
    }

    public final void fu4() {
        C6077k.m22373q(this.f15324o, new AnimConfig().addListeners(new toq()));
    }

    /* JADX INFO: renamed from: i */
    public final void m9113i(@InterfaceC7395n uj2j.toq toqVar) {
        if (this.f15322l != null) {
            Bitmap qVar = toqVar != null ? toqVar.toq() : null;
            if (qVar == null || qVar.isRecycled()) {
                LockScreenImageView lockScreenImageView = this.f15322l;
                d2ok.qrj(lockScreenImageView);
                lockScreenImageView.setImageBitmap(null);
                Log.d(f15314d, "cannot load bitmap: " + qVar);
                return;
            }
            Log.d(f15314d, "loadBitmapIntoImageView:  mShowTemplateView " + this.f15325u + "  + mShowWallpaperImg  " + this.f15326x + " + isThirdTheme  + " + toqVar.m28081q() + " + initState " + this.f60834bo);
            if (o1t.m7171i() && !toqVar.m28081q()) {
                setupLockTemplateView(qVar);
                return;
            }
            LockScreenImageView lockScreenImageView2 = this.f15322l;
            d2ok.qrj(lockScreenImageView2);
            lockScreenImageView2.setImageBitmap(qVar);
            if (this.f15325u) {
                m9115z();
            }
            if (this.f60834bo) {
                m9115z();
                this.f60834bo = false;
            }
        }
    }

    public final void jk(int i2) {
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.lvui(i2);
        }
    }

    public final void ki() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.personalize_lock_screen_preview, (ViewGroup) this, true);
        this.f15322l = (LockScreenImageView) viewInflate.findViewById(R.id.lock_screen_card_wp_img);
        View viewFindViewById = viewInflate.findViewById(R.id.holder);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f15319e = (FrameLayout) viewFindViewById;
        setContentDescription(getResources().getString(R.string.theme_component_title_lockstyle));
        this.f15318c = o1t.o1t(bf2.toq.toq());
        this.f15323m = 0.525f;
        Point pointFn3e = y9n.fn3e();
        d2ok.kja0(pointFn3e, "getScreenRealSize(...)");
        this.f15317b = pointFn3e;
        MiuiClockView miuiClockView = (MiuiClockView) viewInflate.findViewById(R.id.lock_screen_card_clock_view);
        this.f15320f = miuiClockView;
        if (miuiClockView != null) {
            miuiClockView.x2(new ClockBean(AbstractC5074q.f29194r));
        }
        MiuiClockView miuiClockView2 = this.f15320f;
        if (miuiClockView2 != null) {
            miuiClockView2.setScaleRatio(this.f15323m);
        }
        if (o1t.m7171i()) {
            setupLockTemplateView(null);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.view.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockScreenCardView.t8r(this.f15353k, view);
            }
        });
    }

    public final void mcp(boolean z2) {
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.d2ok(z2);
        }
    }

    public final void ni7(int i2) {
        MiuiClockView miuiClockView = this.f15320f;
        if (miuiClockView != null) {
            miuiClockView.setShowLunarCalendar(i2);
        }
    }

    public final void o1t(boolean z2) {
        MiuiClockView miuiClockView = this.f15320f;
        if (miuiClockView != null) {
            miuiClockView.setTextColorDark(z2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o1t.m7171i()) {
            return;
        }
        int i2 = Settings.System.getInt(getContext().getContentResolver(), com.miui.clock.zy.f72057yz, 0);
        LockScreenImageView lockScreenImageView = this.f15322l;
        d2ok.qrj(lockScreenImageView);
        lockScreenImageView.setClockPosition(i2);
    }

    public final void release() {
        LockScreenImageView lockScreenImageView = this.f15322l;
        if (lockScreenImageView != null) {
            lockScreenImageView.setImageBitmap(null);
        }
        LockScreenImageView lockScreenImageView2 = this.f15322l;
        if (lockScreenImageView2 != null) {
            lockScreenImageView2.setBitmap(null);
        }
        this.f15322l = null;
        if (this.f15324o != null) {
            FrameLayout frameLayout = this.f15319e;
            if (frameLayout == null) {
                d2ok.n5r1("mHolder");
                frameLayout = null;
            }
            frameLayout.removeView(this.f15324o);
            BaseTemplateView baseTemplateView = this.f15324o;
            if (baseTemplateView != null) {
                baseTemplateView.removeAllViews();
            }
            this.f15324o = null;
        }
        this.f60834bo = true;
    }

    public final void setClockStyle(int i2) {
        MiuiClockView miuiClockView = this.f15320f;
        if (miuiClockView != null) {
            miuiClockView.setClockStyle(i2);
        }
        LockScreenImageView lockScreenImageView = this.f15322l;
        if (lockScreenImageView != null) {
            lockScreenImageView.setClockPosition(i2);
        }
    }

    public final void setClockViewVisible(boolean z2) {
        MiuiClockView miuiClockView = this.f15320f;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setVisibility(z2 ? 0 : 8);
    }

    /* JADX INFO: renamed from: t */
    public final void m9114t(boolean z2) {
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.fti(z2);
        }
    }

    public final void wvg(@InterfaceC7396q DoodleInfo doodleInfo) {
        d2ok.m23075h(doodleInfo, "doodleInfo");
        BaseTemplateView baseTemplateView = this.f15324o;
        if (baseTemplateView != null) {
            baseTemplateView.eqxt(doodleInfo);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9115z() {
        C6077k.m22373q(this.f15322l, new AnimConfig().addListeners(new zy()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public LockScreenCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d2ok.m23075h(context, "context");
        this.f60834bo = true;
        ki();
    }
}
