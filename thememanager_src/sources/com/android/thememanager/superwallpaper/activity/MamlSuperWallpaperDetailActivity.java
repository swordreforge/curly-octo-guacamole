package com.android.thememanager.superwallpaper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import androidx.lifecycle.jp0y;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.toq;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.superwallpaper.base.AbstractC2721k;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s;
import com.android.thememanager.superwallpaper.presenter.C2728k;
import com.android.thememanager.superwallpaper.recyclerview.C2730k;
import com.android.thememanager.superwallpaper.view.AodMamlPreView;
import com.android.thememanager.superwallpaper.view.DesktopMamlPreView;
import com.android.thememanager.superwallpaper.view.LockScreenMamlPreView;
import java.util.HashMap;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class MamlSuperWallpaperDetailActivity extends AbstractViewOnClickListenerC2725s {
    private static final String dy = MamlSuperWallpaperDetailActivity.class.getSimpleName();
    private static final String k6e = "extra_dialog_tip";
    private static final String vb6 = "extra_superwallpaper_info";
    private static final String xk5 = "extra_bundle";
    private boolean sk1t;
    private DesktopMamlPreView tgs;
    private AodMamlPreView tlhn;
    private LockScreenMamlPreView w97r;
    private Resource yl25;
    private HashMap<String, String> zmmu;

    public static Intent h4b(Context context, @dd Resource resource, boolean showTipDialog) {
        Intent intent = new Intent(context, (Class<?>) MamlSuperWallpaperDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(vb6, resource);
        bundle.putBoolean(k6e, showTipDialog);
        intent.putExtra(xk5, bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wlev(ThemeStatus themeStatus) {
        int i2 = themeStatus.status;
        if (98 == i2 || 97 == i2) {
            finish();
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    public int bek6() {
        return 0;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected String h7am() {
        return toq.o2;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected void ixz() {
        super.ixz();
        ((ViewStub) findViewById(R.id.super_wallpaper_stub)).inflate();
        this.tlhn = (AodMamlPreView) findViewById(R.id.aod_preview);
        this.w97r = (LockScreenMamlPreView) findViewById(R.id.lockscreen_preview);
        this.tgs = (DesktopMamlPreView) findViewById(R.id.wallpaper_preview);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected AbstractC2723p ktq() {
        C2728k c2728k = new C2728k(this, this.yl25, this.sk1t);
        c2728k.zurt(this, new jp0y() { // from class: com.android.thememanager.superwallpaper.activity.k
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f16104k.wlev((ThemeStatus) obj);
            }
        });
        return c2728k;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected void uc() {
        super.uc();
        this.tlhn.setMamlPath(this.zmmu.get("spaod"));
        this.f16123o.add(this.tlhn);
        this.w97r.setMamlPath(this.zmmu.get("splockscreen"));
        this.f16123o.add(this.w97r);
        this.tgs.setMamlPath(this.zmmu.get("spwallpaper"));
        this.f16123o.add(this.tgs);
        this.f16121j.m9491k(this.tgs);
        this.f16121j.mo9493p(this.zmmu.get("spwallpaper"));
        jbh();
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected AbstractC2721k uj2j() {
        return new C2730k(this, this.f16121j);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected String vep5() {
        return this.yl25.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean zkd() {
        /*
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r7.zmmu = r1
            java.lang.String r1 = "extra_bundle"
            android.os.Bundle r0 = r0.getBundleExtra(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            java.lang.String r3 = "extra_dialog_tip"
            boolean r3 = r0.getBoolean(r3, r2)
            r7.sk1t = r3
            java.lang.String r3 = "extra_superwallpaper_info"
            java.io.Serializable r0 = r0.getSerializable(r3)
            com.android.thememanager.basemodule.resource.model.Resource r0 = (com.android.thememanager.basemodule.resource.model.Resource) r0
            r7.yl25 = r0
            if (r0 == 0) goto L6e
            java.lang.String r0 = com.android.thememanager.basemodule.resource.C1792n.m6942o(r0)
            java.lang.String r3 = "spwallpaper"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6e
            com.android.thememanager.basemodule.resource.model.Resource r0 = r7.yl25
            java.util.List r0 = r0.getSubResources()
            if (r0 == 0) goto L6e
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r0.next()
            com.android.thememanager.basemodule.resource.model.RelatedResource r3 = (com.android.thememanager.basemodule.resource.model.RelatedResource) r3
            java.lang.String r4 = r3.getResourceCode()
            com.android.thememanager.basemodule.resource.k r4 = com.android.thememanager.basemodule.resource.C1791k.getInstance(r4)
            com.android.thememanager.basemodule.resource.model.Resource r5 = com.android.thememanager.basemodule.resource.C1792n.zy(r3, r4)
            com.android.thememanager.basemodule.resource.s r6 = new com.android.thememanager.basemodule.resource.s
            r6.<init>(r5, r4)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r7.zmmu
            java.lang.String r3 = r3.getResourceCode()
            java.lang.String r5 = r6.f7l8()
            r4.put(r3, r5)
            goto L41
        L6c:
            r0 = r1
            goto L6f
        L6e:
            r0 = r2
        L6f:
            if (r0 != 0) goto L79
            java.lang.String r0 = com.android.thememanager.superwallpaper.activity.MamlSuperWallpaperDetailActivity.dy
            java.lang.String r1 = "not found valid super wallpaper resource."
            android.util.Log.e(r0, r1)
            return r2
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.superwallpaper.activity.MamlSuperWallpaperDetailActivity.zkd():boolean");
    }
}
