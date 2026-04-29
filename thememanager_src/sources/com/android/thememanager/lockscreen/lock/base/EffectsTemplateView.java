package com.android.thememanager.lockscreen.lock.base;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.lockscreen.lock.HierarchyImageView;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.task.C2112y;
import com.android.thememanager.lockscreen.lock.wallpaper.CombinedWallpaperView;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.android.thememanager.lockscreen.lock.wallpaper.n7h;
import com.android.thememanager.util.mbx;
import com.miui.clock.MiuiClockView;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EffectsTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EffectsTemplateView extends BaseTemplateView {

    /* JADX INFO: renamed from: a */
    @InterfaceC7395n
    private Boolean f12347a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EffectsTemplateView(@InterfaceC7396q Context context) {
        super(context, null, 2, 0 == true ? 1 : 0);
        d2ok.m23075h(context, "context");
    }

    /* JADX INFO: renamed from: e */
    private final void m8052e() {
        WallpaperInfo wallpaperInfo;
        HierarchyImageView hierarchyImageView = (HierarchyImageView) getHierarchyLayer();
        if (hierarchyImageView != null) {
            TemplateConfig templateConfig = getTemplateConfig();
            hierarchyImageView.setImageBitmap((templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) ? null : wallpaperInfo.getSubjectBitmap());
            hierarchyImageView.setVisibility(0);
        }
        vyq();
    }

    /* JADX INFO: renamed from: f */
    private final void m8053f() {
        HierarchyImageView hierarchyImageView = (HierarchyImageView) getHierarchyLayer();
        if (hierarchyImageView != null) {
            hierarchyImageView.setImageBitmap(null);
            hierarchyImageView.setVisibility(8);
        }
        uv6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hyr(EffectsTemplateView this$0, Boolean bool) {
        d2ok.m23075h(this$0, "this$0");
        if (this$0.getContext() instanceof Activity) {
            Context context = this$0.getContext();
            d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
            if (!C1819o.eqxt((Activity) context)) {
                Log.w(zy.f12351k, "checkGalleryLockOpen: relate Activity invalid");
                return;
            }
        }
        d2ok.qrj(bool);
        if (bool.booleanValue()) {
            Log.w(zy.f12351k, "Gallery lock is open close hierarchy layer");
            this$0.m8053f();
            this$0.mo8055c();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m8054l() {
        C2112y.toq(new Supplier() { // from class: com.android.thememanager.lockscreen.lock.base.q
            @Override // java.util.function.Supplier
            public final Object get() {
                return EffectsTemplateView.n5r1();
            }
        }).ld6(new Consumer() { // from class: com.android.thememanager.lockscreen.lock.base.n
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                EffectsTemplateView.hyr(this.f12349k, (Boolean) obj);
            }
        });
    }

    private final void lrht(Object obj) {
        m8053f();
        d2ok.n7h(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        TemplateConfig templateConfig = getTemplateConfig();
        WallpaperInfo wallpaperInfo = templateConfig != null ? templateConfig.getWallpaperInfo() : null;
        if (wallpaperInfo != null) {
            wallpaperInfo.setMagicType(iIntValue);
        }
        n7h wallpaperLayer = getWallpaperLayer();
        if (wallpaperLayer != null) {
            wallpaperLayer.qrj(iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean n5r1() {
        return Boolean.valueOf(mbx.m9870p());
    }

    private final boolean nn86() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo8055c() {
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void d2ok(boolean z2) {
        WallpaperInfo wallpaperInfo;
        TemplateConfig templateConfig = getTemplateConfig();
        if ((templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null || z2 != wallpaperInfo.getEnableBlur()) ? false : true) {
            return;
        }
        TemplateConfig templateConfig2 = getTemplateConfig();
        WallpaperInfo wallpaperInfo2 = templateConfig2 != null ? templateConfig2.getWallpaperInfo() : null;
        if (wallpaperInfo2 != null) {
            wallpaperInfo2.setEnableBlur(z2);
        }
        CombinedWallpaperView combinedWallpaperView = (CombinedWallpaperView) getWallpaperLayer();
        if (combinedWallpaperView != null) {
            CombinedWallpaperView.setEnableBlurStatus$default(combinedWallpaperView, z2, false, 2, null);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        super.dd(config);
        t8r(config);
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView == null) {
            return true;
        }
        miuiClockView.x2(getCurrentClockBean());
        return true;
    }

    public boolean hb() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo8056j() {
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        super.jk();
        HierarchyImageView hierarchyImageView = (HierarchyImageView) getHierarchyLayer();
        if (hierarchyImageView != null) {
            hierarchyImageView.setVisibility(0);
        } else {
            hierarchyImageView = null;
        }
        if (hierarchyImageView == null) {
            return;
        }
        n7h wallpaperLayer = getWallpaperLayer();
        hierarchyImageView.setImageMatrix(wallpaperLayer != null ? wallpaperLayer.getWallpaperMatrix() : null);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void lvui(int i2) {
        super.lvui(i2);
        TemplateConfig templateConfig = getTemplateConfig();
        WallpaperInfo wallpaperInfo = templateConfig != null ? templateConfig.getWallpaperInfo() : null;
        if (wallpaperInfo != null) {
            wallpaperInfo.setMagicType(i2);
        }
        if (kja0.f12503k.toq(Integer.valueOf(i2))) {
            m8052e();
        } else {
            m8053f();
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean mo8057m() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo8058o() {
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    protected View qrj(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if (!nn86()) {
            return null;
        }
        WallpaperInfo wallpaperInfo = templateConfig != null ? templateConfig.getWallpaperInfo() : null;
        if (wallpaperInfo == null) {
            Log.w(zy.f12351k, "createHierarchyLayer: wallpaper info is null");
            return null;
        }
        m8054l();
        HierarchyImageView hierarchyImageView = new HierarchyImageView(context, null, 0, 6, null);
        hierarchyImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Log.i(zy.f12351k, "createHierarchyLayer: " + wallpaperInfo.getMagicType() + "  subject=" + wallpaperInfo.getSubjectBitmap());
        if (!kja0.f12503k.toq(Integer.valueOf(wallpaperInfo.getMagicType())) || wallpaperInfo.getSubjectBitmap() == null) {
            hierarchyImageView.setVisibility(8);
        } else {
            hierarchyImageView.setImageBitmap(wallpaperInfo.getSubjectBitmap());
        }
        n7h wallpaperLayer = getWallpaperLayer();
        if (wallpaperLayer != null) {
            wallpaperLayer.kja0(hierarchyImageView);
        }
        return hierarchyImageView;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        getCurrentClockBean().setEnableDiffusion(templateConfig.getClockInfo().getEnableDiffusion());
    }

    protected void uv6() {
    }

    protected void vyq() {
    }
}
