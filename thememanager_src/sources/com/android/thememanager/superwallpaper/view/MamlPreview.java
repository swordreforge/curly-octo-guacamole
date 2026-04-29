package com.android.thememanager.superwallpaper.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.miui.maml.component.MamlView;
import cv06.InterfaceC5977k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MamlPreview extends FrameLayout implements InterfaceC5977k.k {

    /* JADX INFO: renamed from: c */
    public static final String f16155c = "play";

    /* JADX INFO: renamed from: e */
    protected static final String f16156e = "content/";

    /* JADX INFO: renamed from: f */
    public static final String f16157f = "set_to_lockscreen";

    /* JADX INFO: renamed from: h */
    public static final String f16158h = "Land";

    /* JADX INFO: renamed from: i */
    public static final String f16159i = "to_home";

    /* JADX INFO: renamed from: j */
    protected static final String f16160j = "content/";

    /* JADX INFO: renamed from: l */
    public static final String f16161l = "to_lockscreen";

    /* JADX INFO: renamed from: o */
    protected static final String f16162o = "advance/";

    /* JADX INFO: renamed from: p */
    protected static final String f16163p = "SuperWallpaper.12.5";

    /* JADX INFO: renamed from: r */
    public static final String f16164r = "set_to_aod";

    /* JADX INFO: renamed from: t */
    public static final String f16165t = "to_aod";

    /* JADX INFO: renamed from: z */
    public static final String f16166z = "set_to_home";

    /* JADX INFO: renamed from: g */
    protected String f16167g;

    /* JADX INFO: renamed from: k */
    protected boolean f16168k;

    /* JADX INFO: renamed from: n */
    protected boolean f16169n;

    /* JADX INFO: renamed from: q */
    protected MamlView f16170q;

    /* JADX INFO: renamed from: s */
    protected InterfaceC5977k.toq f16171s;

    /* JADX INFO: renamed from: y */
    protected InterfaceC5977k.toq f16172y;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.view.MamlPreview$k */
    private static class C2736k extends MamlView {
        public C2736k(Context context, String path, String innerPath, int mode) {
            super(context, path, innerPath, mode);
        }

        @Override // com.miui.maml.component.MamlView, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            return false;
        }
    }

    public MamlPreview(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX INFO: renamed from: g */
    protected static MamlView m9520g(@lvui Context context, @lvui String mtzPath, String inner_path) {
        return new C2736k(context.getApplicationContext(), mtzPath, inner_path, 1);
    }

    /* JADX INFO: renamed from: y */
    private void m9521y() {
        MamlView mamlView = this.f16170q;
        if (mamlView != null) {
            mamlView.removeRelatedBitmapsRef();
            this.f16170q.onDestroy();
            this.f16170q = null;
        }
    }

    protected void f7l8() {
        MamlView mamlView = this.f16170q;
        if (mamlView == null || !mamlView.isLoaded()) {
            this.f16170q = getMamView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            MamlView mamlView2 = this.f16170q;
            if (mamlView2 != null && mamlView2.isLoaded()) {
                addView(this.f16170q, layoutParams);
            } else {
                addView(LayoutInflater.from(getContext()).inflate(R.layout.super_wallpaper_not_support_maml_layout, (ViewGroup) null), layoutParams);
                Log.e("SuperWallpaper.12.5", "maml load failed");
            }
        }
    }

    protected abstract MamlView getMamView();

    protected abstract InterfaceC5977k.toq getSceneType();

    /* JADX INFO: renamed from: k */
    public void mo9489k(InterfaceC5977k.toq sceneType) {
        this.f16171s = this.f16172y;
        this.f16172y = sceneType;
    }

    protected abstract void ld6();

    /* JADX INFO: renamed from: n */
    protected boolean m9522n() {
        if (!TextUtils.isEmpty(this.f16167g)) {
            return true;
        }
        Log.e("SuperWallpaper.12.5", "maml path is null.");
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        this.f16168k = o1t.f7l8();
    }

    /* JADX INFO: renamed from: p */
    protected void m9523p() {
        MamlView mamlView = this.f16170q;
        if (mamlView != null) {
            mamlView.onResume();
            ld6();
        }
    }

    @Override // cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: q */
    public void mo9524q() {
        m9521y();
    }

    /* JADX INFO: renamed from: s */
    protected void m9525s() {
        MamlView mamlView = this.f16170q;
        if (mamlView != null) {
            mamlView.onPause();
        }
    }

    public void setMamlPath(String path) {
        this.f16167g = path;
        if (TextUtils.isEmpty(path)) {
            setVisibility(8);
        } else {
            f7l8();
        }
    }

    @Override // cv06.InterfaceC5977k.k
    public void toq() {
        if (this.f16169n) {
            m9525s();
        }
    }

    protected void x2(String cmd) {
        MamlView mamlView = this.f16170q;
        if (mamlView != null) {
            mamlView.sendCommand(cmd);
        }
    }

    @Override // cv06.InterfaceC5977k.k
    public void zy() {
        if (this.f16169n) {
            m9523p();
        }
    }
}
