package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class BaseGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: k */
    protected final String f15722k;

    /* JADX INFO: renamed from: n */
    protected C2660n f15723n;

    /* JADX INFO: renamed from: q */
    protected Context f15724q;

    public BaseGLSurfaceView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    public void mo9247k(boolean isSuperWallpaper, String wpName) {
    }

    public BaseGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15722k = getClass().getSimpleName();
        this.f15724q = context;
        setEGLContextClientVersion(2);
    }
}
