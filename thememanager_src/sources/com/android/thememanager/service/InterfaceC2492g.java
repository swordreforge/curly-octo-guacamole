package com.android.thememanager.service;

import android.view.SurfaceHolder;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.service.g */
/* JADX INFO: compiled from: IPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2492g {

    /* JADX INFO: renamed from: com.android.thememanager.service.g$k */
    /* JADX INFO: compiled from: IPlayer.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        default void m8933k(int what, @dd String msg) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.service.g$toq */
    /* JADX INFO: compiled from: IPlayer.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo8929k(int width, int height, int degree, float ratio);
    }

    void a9(boolean scale);

    void d3(toq listener);

    void dd(String path);

    void eqxt(SurfaceHolder sh);

    void f7l8(boolean audioOn);

    void fti(boolean visible, boolean screenOn, boolean screenOff, boolean lockScreen, boolean isBoth);

    void gvn7(boolean repeat);

    /* JADX INFO: renamed from: i */
    void mo8932i();

    default void jp0y() {
    }

    void t8r(boolean visible);

    void toq(float volume);

    boolean zurt();

    void zy(SurfaceHolder surfaceHolder);
}
