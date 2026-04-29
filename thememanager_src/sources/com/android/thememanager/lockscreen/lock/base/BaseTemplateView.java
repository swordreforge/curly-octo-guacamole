package com.android.thememanager.lockscreen.lock.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.DoodleInfo;
import com.android.thememanager.lockscreen.lock.SignatureInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.WallpaperTypeInfo;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.android.thememanager.lockscreen.lock.task.C2112y;
import com.android.thememanager.lockscreen.lock.wallpaper.CombinedWallpaperView;
import com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2132s;
import com.android.thememanager.lockscreen.lock.wallpaper.n7h;
import com.miui.clock.MiuiClockView;
import com.miui.clock.module.ClockBean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: BaseTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTemplateView extends FrameLayout implements InterfaceC2132s {

    /* JADX INFO: renamed from: b */
    private boolean f12327b;

    /* JADX INFO: renamed from: c */
    private boolean f12328c;

    /* JADX INFO: renamed from: e */
    private boolean f12329e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private Consumer<Object> f12330f;

    /* JADX INFO: renamed from: g */
    private boolean f12331g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private View f12332h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private View f12333i;

    /* JADX INFO: renamed from: j */
    private boolean f12334j;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private TemplateConfig f12335k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private AbstractC2097k f12336l;

    /* JADX INFO: renamed from: m */
    private boolean f12337m;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private MiuiClockView f12338n;

    /* JADX INFO: renamed from: o */
    private boolean f12339o;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private View f12340p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ClockBean f12341q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7395n
    private Integer f12342r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private View f12343s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7395n
    private Bitmap f12344t;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private View f12345y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private TextView f12346z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public BaseTemplateView(@InterfaceC7396q Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ BaseTemplateView(Context context, AttributeSet attributeSet, int i2, ni7 ni7Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(BaseTemplateView this$0, ColorData colorData) {
        d2ok.m23075h(this$0, "this$0");
        if (colorData != null) {
            this$0.mo8049t(colorData);
        } else {
            Log.w(zy.f12351k, "startPickColorFromWallpaper: data is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorData gvn7(BaseTemplateView this$0, Bitmap bitmap) {
        d2ok.m23075h(this$0, "this$0");
        try {
            AbstractC2097k abstractC2097k = this$0.f12336l;
            if (abstractC2097k != null) {
                return abstractC2097k.qrj(bitmap);
            }
            return null;
        } catch (Exception e2) {
            Log.w(zy.f12351k, "startPickColorFromWallpaper: " + e2);
            return null;
        }
    }

    public static /* synthetic */ void o1t(BaseTemplateView baseTemplateView, TemplateConfig templateConfig, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTemplate");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        baseTemplateView.m8051z(templateConfig, z2, z3);
    }

    /* JADX INFO: renamed from: q */
    private final void m8040q(ViewGroup viewGroup) {
        addView(viewGroup);
    }

    public void a9(@InterfaceC7395n WallpaperTypeInfo wallpaperTypeInfo) {
        this.f12344t = wallpaperTypeInfo != null ? wallpaperTypeInfo.getBitmap() : null;
        TemplateConfig templateConfig = this.f12335k;
        WallpaperInfo wallpaperInfo = templateConfig != null ? templateConfig.getWallpaperInfo() : null;
        if (wallpaperInfo != null) {
            wallpaperInfo.setResourceType(wallpaperTypeInfo != null ? wallpaperTypeInfo.getType() : null);
        }
        TemplateConfig templateConfig2 = this.f12335k;
        WallpaperInfo wallpaperInfo2 = templateConfig2 != null ? templateConfig2.getWallpaperInfo() : null;
        if (wallpaperInfo2 != null) {
            wallpaperInfo2.setOriginResourcePath(wallpaperTypeInfo != null ? wallpaperTypeInfo.getResourcePath() : null);
        }
        n7h wallpaperLayer = getWallpaperLayer();
        if (wallpaperLayer != null) {
            wallpaperLayer.mo8092k(wallpaperTypeInfo);
        }
    }

    protected int cdj() {
        return 0;
    }

    public void d2ok(boolean z2) {
    }

    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        t8r(config);
        return true;
    }

    public void eqxt(@InterfaceC7396q DoodleInfo doodleInfo) {
        d2ok.m23075h(doodleInfo, "doodleInfo");
    }

    protected int f7l8() {
        return 0;
    }

    public final boolean fn3e() {
        return this.f12334j;
    }

    public void fti(boolean z2) {
        if (this.f12328c != z2) {
            this.f12328c = z2;
            Log.d(zy.f12351k, "force reload template ");
            o1t(this, this.f12335k, true, false, 4, null);
        }
    }

    public final boolean fu4() {
        return this.f12337m;
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: g */
    protected void mo8041g() {
        WallpaperInfo wallpaperInfo;
        n7h wallpaperLayer;
        ClockInfo clockInfo;
        TemplateConfig templateConfig = this.f12335k;
        if (templateConfig != null && (clockInfo = templateConfig.getClockInfo()) != null) {
            clockInfo.setStyle(this.f12341q.getStyle());
            clockInfo.setPrimaryColor(this.f12341q.getPrimaryColor());
            clockInfo.setAutoPrimaryColor(this.f12341q.isAutoPrimaryColor());
            clockInfo.setSecondaryColor(this.f12341q.getSecondaryColor());
            clockInfo.setAutoSecondaryColor(this.f12341q.isAutoSecondaryColor());
            clockInfo.setDiffHourMinuteColor(this.f12341q.isDiffHourMinuteColor());
        }
        TemplateConfig templateConfig2 = this.f12335k;
        if (templateConfig2 != null) {
            templateConfig2.setCurrentWallpaper(this.f12344t);
        }
        TemplateConfig templateConfig3 = this.f12335k;
        if (templateConfig3 == null || (wallpaperInfo = templateConfig3.getWallpaperInfo()) == null || (wallpaperLayer = getWallpaperLayer()) == null) {
            return;
        }
        Bitmap bitmap = this.f12344t;
        d2ok.qrj(bitmap);
        WallpaperPositionInfo wallpaperPositionInfoN7h = wallpaperLayer.n7h(bitmap);
        if (wallpaperPositionInfoN7h != null) {
            wallpaperInfo.setPositionInfo(wallpaperPositionInfoN7h);
        }
    }

    @InterfaceC7395n
    protected final AbstractC2097k getAutoColorPicker() {
        return this.f12336l;
    }

    @InterfaceC7395n
    public final <T extends View> T getBackContentLayer() {
        return (T) this.f12340p;
    }

    @InterfaceC7396q
    public abstract String getClockStyleType();

    @InterfaceC7395n
    public final <T extends View> T getColorLayer() {
        return (T) this.f12343s;
    }

    public final boolean getColorLayerHidden() {
        return this.f12327b;
    }

    @InterfaceC7396q
    protected final ClockBean getCurrentClockBean() {
        return this.f12341q;
    }

    @InterfaceC7395n
    public final Bitmap getCurrentWallpaper() {
        return this.f12344t;
    }

    @InterfaceC7395n
    public final TemplateConfig getEditingConfig() {
        return this.f12335k;
    }

    @InterfaceC7395n
    public final <T extends View> T getForeContentLayer() {
        return (T) this.f12333i;
    }

    protected final boolean getHasAddClockView() {
        return this.f12329e;
    }

    @InterfaceC7395n
    public final <T extends View> T getHierarchyLayer() {
        return (T) this.f12332h;
    }

    @InterfaceC7395n
    protected final MiuiClockView getMiuiClockView() {
        return this.f12338n;
    }

    @InterfaceC7395n
    protected final TemplateConfig getTemplateConfig() {
        return this.f12335k;
    }

    protected final boolean getTouchable() {
        return this.f12331g;
    }

    @InterfaceC7395n
    public final <T extends n7h> T getWallpaperLayer() {
        return (T) this.f12345y;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo8042h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8043i() {
        return this.f12339o;
    }

    protected void jk() {
    }

    public void jp0y(@InterfaceC7395n final Bitmap bitmap) {
        if (bitmap != null) {
            C2112y.toq(new Supplier() { // from class: com.android.thememanager.lockscreen.lock.base.k
                @Override // java.util.function.Supplier
                public final Object get() {
                    return BaseTemplateView.gvn7(this.f12348k, bitmap);
                }
            }).ld6(new Consumer() { // from class: com.android.thememanager.lockscreen.lock.base.toq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BaseTemplateView.d3(this.f12350k, (ColorData) obj);
                }
            });
        } else {
            Log.w(zy.f12351k, "startPickColorFromWallpaper: bitmap is null");
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2132s
    /* JADX INFO: renamed from: k */
    public void mo8044k(@InterfaceC7395n Bitmap bitmap) {
        jp0y(bitmap);
    }

    protected void ki(@InterfaceC7396q FrameLayout templateView, @InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateView, "templateView");
        d2ok.m23075h(templateConfig, "templateConfig");
        if (mo8042h()) {
            if (this.f12338n == null) {
                this.f12338n = new MiuiClockView(getContext());
                new FrameLayout.LayoutParams(-1, -1);
                Log.i(zy.f12351k, "initClock= " + this.f12338n);
                this.f12329e = true;
                addView(this.f12338n);
                was wasVar = was.f36763k;
            }
            if (!this.f12329e && this.f12338n != null) {
                this.f12329e = true;
                Log.d(zy.f12351k, "add miui clock view later");
                addView(this.f12338n);
            }
        }
        t8r(templateConfig);
        MiuiClockView miuiClockView = this.f12338n;
        if (miuiClockView != null) {
            miuiClockView.x2(this.f12341q);
        }
        Log.i(zy.f12351k, "initClock= " + this.f12341q);
        jk();
        if (templateConfig.getAutoColorData() != null) {
            mo8049t(templateConfig.getAutoColorData());
        }
    }

    public final void kja0() {
        this.f12331g = false;
    }

    @InterfaceC7395n
    protected View ld6(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if (this.f12327b) {
            return null;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return imageView;
    }

    public void lvui(int i2) {
        n7h wallpaperLayer;
        WallpaperInfo wallpaperInfo;
        TemplateConfig templateConfig = this.f12335k;
        boolean z2 = false;
        if (templateConfig != null && (wallpaperInfo = templateConfig.getWallpaperInfo()) != null && i2 == wallpaperInfo.getMagicType()) {
            z2 = true;
        }
        if (!z2 && (wallpaperLayer = getWallpaperLayer()) != null) {
            wallpaperLayer.qrj(i2);
        }
        TemplateConfig templateConfig2 = this.f12335k;
        WallpaperInfo wallpaperInfo2 = templateConfig2 != null ? templateConfig2.getWallpaperInfo() : null;
        if (wallpaperInfo2 == null) {
            return;
        }
        wallpaperInfo2.setMagicType(i2);
    }

    public void mcp() {
        ClockInfo clockInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Template ");
        TemplateConfig templateConfig = this.f12335k;
        sb.append((templateConfig == null || (clockInfo = templateConfig.getClockInfo()) == null) ? null : clockInfo.getTemplateId());
        sb.append(" Destroyed");
        Log.i(zy.f12351k, sb.toString());
    }

    /* JADX INFO: renamed from: n */
    protected void m8045n(@InterfaceC7395n TemplateConfig templateConfig) {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        View viewN7h = n7h(context, templateConfig);
        ViewGroup viewGroup = null;
        if (viewN7h != null) {
            addView(viewN7h);
        } else {
            viewN7h = null;
        }
        this.f12345y = viewN7h;
        Context context2 = getContext();
        d2ok.kja0(context2, "getContext(...)");
        View viewLd6 = ld6(context2, templateConfig);
        if (viewLd6 != null) {
            addView(viewLd6);
        } else {
            viewLd6 = null;
        }
        this.f12343s = viewLd6;
        Context context3 = getContext();
        d2ok.kja0(context3, "getContext(...)");
        View viewMo8046p = mo8046p(context3, templateConfig);
        if (viewMo8046p != null) {
            addView(viewMo8046p);
        } else {
            viewMo8046p = null;
        }
        this.f12340p = viewMo8046p;
        Context context4 = getContext();
        d2ok.kja0(context4, "getContext(...)");
        View viewQrj = qrj(context4, templateConfig);
        if (viewQrj != null) {
            addView(viewQrj);
        } else {
            viewQrj = null;
        }
        this.f12332h = viewQrj;
        Context context5 = getContext();
        d2ok.kja0(context5, "getContext(...)");
        ViewGroup viewGroupX2 = x2(context5, templateConfig);
        if (viewGroupX2 != null) {
            m8040q(viewGroupX2);
            viewGroup = viewGroupX2;
        }
        this.f12333i = viewGroup;
    }

    @InterfaceC7395n
    protected View n7h(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if ((templateConfig != null ? templateConfig.getWallpaperInfo() : null) == null || templateConfig.getCurrentWallpaper() == null) {
            Log.w(zy.f12351k, "createWallpaperLayer: wallpaperInfo is null");
            return null;
        }
        CombinedWallpaperView combinedWallpaperViewM8133g = n7h.fs9.m8133g(context, templateConfig, this.f12331g);
        this.f12344t = templateConfig.getCurrentWallpaper();
        combinedWallpaperViewM8133g.setGestureEndCallback(this);
        combinedWallpaperViewM8133g.setScaleable(this.f12331g);
        return combinedWallpaperViewM8133g;
    }

    protected final boolean ni7() {
        return this.f12328c;
    }

    public void oc(@InterfaceC7396q ClockInfo clockInfo) {
        d2ok.m23075h(clockInfo, "clockInfo");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f12331g) {
            setPivotX(i2 / 2.0f);
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected View mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if (templateConfig == null || f7l8() == 0) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(f7l8(), (ViewGroup) null);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        d2ok.n7h(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) viewInflate;
    }

    @InterfaceC7395n
    protected View qrj(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void mo8047r(@InterfaceC7396q SignatureInfo signatureInfo) {
        d2ok.m23075h(signatureInfo, "signatureInfo");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        return null;
    }

    protected final void setAutoColorPicker(@InterfaceC7395n AbstractC2097k abstractC2097k) {
        this.f12336l = abstractC2097k;
    }

    public final void setChangedTimeMagic(boolean z2) {
        this.f12339o = z2;
    }

    public final void setChangedWallpaper(boolean z2) {
        this.f12334j = z2;
    }

    public final void setColorLayerHidden(boolean z2) {
        this.f12327b = z2;
    }

    protected final void setDualClock(boolean z2) {
        this.f12328c = z2;
    }

    public final void setEditHierarchy(boolean z2) {
        this.f12337m = z2;
    }

    protected final void setHasAddClockView(boolean z2) {
        this.f12329e = z2;
    }

    protected final void setMiuiClockView(@InterfaceC7395n MiuiClockView miuiClockView) {
        this.f12338n = miuiClockView;
    }

    protected final void setTemplateConfig(@InterfaceC7395n TemplateConfig templateConfig) {
        this.f12335k = templateConfig;
    }

    protected final void setTouchable(boolean z2) {
        this.f12331g = z2;
    }

    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        d2ok.m23075h(colorData, "colorData");
        Log.d(zy.f12351k, "onColorPickComplete darkClockArea=" + colorData.getDarkClockArea());
        MiuiClockView miuiClockView = this.f12338n;
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
    }

    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
    }

    public void wvg() {
        MiuiClockView miuiClockView = this.f12338n;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setClockBean(this.f12341q);
    }

    @InterfaceC7395n
    protected ViewGroup x2(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if (templateConfig == null || cdj() == 0) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(cdj(), (ViewGroup) null);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        d2ok.n7h(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewInflate;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8050y(@InterfaceC7396q String newClockType, @InterfaceC7396q String oldClockType) {
        d2ok.m23075h(newClockType, "newClockType");
        d2ok.m23075h(oldClockType, "oldClockType");
        return d2ok.f7l8(newClockType, oldClockType);
    }

    /* JADX INFO: renamed from: z */
    public void m8051z(@InterfaceC7395n TemplateConfig templateConfig, boolean z2, boolean z3) {
        this.f12327b = z3;
        if (!d2ok.f7l8(templateConfig, this.f12335k) || z2) {
            removeAllViews();
            this.f12329e = false;
            this.f12335k = templateConfig;
            Log.i(zy.f12351k, "loadTemplate: " + templateConfig);
            this.f12336l = mo8048s();
            m8045n(templateConfig);
            TemplateConfig templateConfig2 = this.f12335k;
            if (templateConfig2 != null) {
                d2ok.qrj(templateConfig2);
                ki(this, templateConfig2);
                TemplateConfig templateConfig3 = this.f12335k;
                d2ok.qrj(templateConfig3);
                if (templateConfig3.getCurrentWallpaper() != null) {
                    TemplateConfig templateConfig4 = this.f12335k;
                    d2ok.qrj(templateConfig4);
                    jp0y(templateConfig4.getCurrentWallpaper());
                }
            }
        }
    }

    public final boolean zurt() {
        n7h wallpaperLayer = getWallpaperLayer();
        if (wallpaperLayer != null) {
            return wallpaperLayer.x2();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public BaseTemplateView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
        d2ok.m23075h(context, "context");
        this.f12341q = new ClockBean(getClockStyleType());
        this.f12331g = true;
        this.f12328c = o1t.o1t(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }
}
