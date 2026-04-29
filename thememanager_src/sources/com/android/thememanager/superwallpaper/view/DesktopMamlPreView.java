package com.android.thememanager.superwallpaper.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.toq;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.miui.maml.component.MamlView;
import cv06.InterfaceC5977k;
import h7am.C6071k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DesktopMamlPreView extends MamlPreview implements AbstractC2723p.k {

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.view.DesktopMamlPreView$k */
    static /* synthetic */ class C2735k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f16154k;

        static {
            int[] iArr = new int[InterfaceC5977k.toq.values().length];
            f16154k = iArr;
            try {
                iArr[InterfaceC5977k.toq.AOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16154k[InterfaceC5977k.toq.LOCKSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16154k[InterfaceC5977k.toq.DESKTOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DesktopMamlPreView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected MamlView getMamView() {
        if (m9522n()) {
            return MamlPreview.m9520g(getContext(), this.f16167g, toq.q92d);
        }
        return null;
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected InterfaceC5977k.toq getSceneType() {
        return InterfaceC5977k.toq.DESKTOP;
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview, cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: k */
    public void mo9489k(InterfaceC5977k.toq sceneType) {
        super.mo9489k(sceneType);
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        m9523p();
    }

    @Override // com.android.thememanager.superwallpaper.view.MamlPreview
    protected void ld6() {
        InterfaceC5977k.toq toqVar;
        if (this.f16170q == null || (toqVar = this.f16172y) == null) {
            return;
        }
        String str = null;
        int i2 = C2735k.f16154k[toqVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = (this.f16171s == InterfaceC5977k.toq.DESKTOP || this.f16168k) ? MamlPreview.f16161l : MamlPreview.f16157f;
            } else if (i2 == 3) {
                str = MamlPreview.f16159i;
            }
        } else if (this.f16168k) {
            str = MamlPreview.f16165t;
        }
        if (str != null) {
            Log.d(C6071k.f35077k, "command: " + str);
            this.f16170q.sendCommand(str);
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p.k
    public void vyq(int landPosition) {
        MamlView mamlView = this.f16170q;
        if (mamlView != null) {
            mamlView.putVariableNumber("Land", Double.valueOf(landPosition).doubleValue());
            Log.d(C6071k.f35077k, "position changed:" + landPosition);
            ld6();
        }
    }
}
