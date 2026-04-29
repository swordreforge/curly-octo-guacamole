package com.android.thememanager.v9.view;

import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: com.android.thememanager.v9.view.k */
/* JADX INFO: compiled from: AppBarLayoutStateListener.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2876k implements AppBarLayout.InterfaceC3925y {

    /* JADX INFO: renamed from: k */
    boolean f17202k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    boolean f61489toq = false;

    /* JADX INFO: renamed from: com.android.thememanager.v9.view.k$k */
    /* JADX INFO: compiled from: AppBarLayoutStateListener.java */
    public enum k {
        EXPANDED,
        COLLAPSED
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC3925y, com.google.android.material.appbar.AppBarLayout.zy
    /* JADX INFO: renamed from: k */
    public void mo10215k(AppBarLayout appBarLayout, int verticalOffset) {
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        float fAbs = Math.abs(verticalOffset) / totalScrollRange;
        if (verticalOffset == 0 && !this.f17202k) {
            zy();
            this.f17202k = true;
            this.f61489toq = false;
        } else if (Math.abs(verticalOffset) == totalScrollRange && !this.f61489toq) {
            toq();
            this.f61489toq = true;
            this.f17202k = false;
        }
        m10216q(appBarLayout.getTotalScrollRange(), fAbs);
    }

    /* JADX INFO: renamed from: q */
    public void m10216q(int maxRange, float percent) {
    }

    public abstract void toq();

    public abstract void zy();
}
