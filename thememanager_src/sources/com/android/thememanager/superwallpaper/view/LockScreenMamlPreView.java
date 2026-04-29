package com.android.thememanager.superwallpaper.view;

import android.content.Context;
import android.util.AttributeSet;
import com.miui.maml.component.MamlView;
import cv06.InterfaceC5977k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LockScreenMamlPreView extends MamlPreview {
    public LockScreenMamlPreView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected MamlView getMamView() {
        if (m9522n()) {
            return MamlPreview.m9520g(getContext(), this.f16167g, "advance/");
        }
        return null;
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected InterfaceC5977k.toq getSceneType() {
        return InterfaceC5977k.toq.LOCKSCREEN;
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview, cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: k */
    public void mo9489k(InterfaceC5977k.toq sceneType) {
        super.mo9489k(sceneType);
        if (sceneType == getSceneType()) {
            if (this.f16169n) {
                return;
            }
            this.f16169n = true;
            setVisibility(0);
            m9523p();
            return;
        }
        if (this.f16169n) {
            this.f16169n = false;
            m9525s();
            setVisibility(8);
        }
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected void ld6() {
    }
}
