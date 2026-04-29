package com.miui.miwallpaper.opengl;

import android.util.Size;
import android.view.SurfaceControl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: GLWallpaperRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface ld6 {
    void f7l8();

    void finish();

    /* JADX INFO: renamed from: g */
    void mo18008g(int i2, int i3);

    /* JADX INFO: renamed from: n */
    void mo18009n();

    /* JADX INFO: renamed from: q */
    Size mo18010q();

    void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void zy(SurfaceControl surfaceControl);
}
