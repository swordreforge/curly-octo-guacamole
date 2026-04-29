package com.android.thememanager.basemodule.views;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: compiled from: ReloadViewAnimAssist.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: n */
    public static final int f10595n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f10596q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f57842toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57843zy = 2;

    /* JADX INFO: renamed from: k */
    private toq f10597k;

    /* JADX INFO: compiled from: ReloadViewAnimAssist.java */
    private interface toq {
        /* JADX INFO: renamed from: k */
        ViewGroup mo7338k(ViewStub stub, int animType);

        void toq(boolean start);
    }

    /* JADX INFO: compiled from: ReloadViewAnimAssist.java */
    private static class zy implements toq {
        private zy() {
        }

        @Override // com.android.thememanager.basemodule.views.ld6.toq
        /* JADX INFO: renamed from: k */
        public ViewGroup mo7338k(ViewStub stub, int animType) {
            stub.setLayoutResource(R.layout.theme_webview_reload_simple);
            ViewGroup viewGroup = (ViewGroup) stub.inflate();
            View viewFindViewById = viewGroup.findViewById(R.id.animation_bg);
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                ((TextView) viewGroup.findViewById(R.id.reload_info)).setText(R.string.local_mode_hint);
            }
            if (animType == 2) {
                viewFindViewById.setBackgroundResource(R.drawable.flower);
            } else if (animType == 3) {
                viewFindViewById.setBackgroundResource(R.drawable.bird);
            } else if (animType != 4) {
                viewFindViewById.setBackgroundResource(R.drawable.rabbit);
            } else {
                viewFindViewById.setBackgroundResource(R.drawable.poker);
            }
            return viewGroup;
        }

        @Override // com.android.thememanager.basemodule.views.ld6.toq
        public void toq(boolean start) {
        }
    }

    /* JADX INFO: renamed from: k */
    public ViewGroup m7337k(ViewStub stub, int animType) {
        zy zyVar = new zy();
        this.f10597k = zyVar;
        return zyVar.mo7338k(stub, animType);
    }

    public void toq(boolean start) {
        toq toqVar = this.f10597k;
        if (toqVar != null) {
            toqVar.toq(start);
        }
    }
}
