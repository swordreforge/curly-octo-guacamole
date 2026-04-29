package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.n */
/* JADX INFO: compiled from: ViewState.java */
/* JADX INFO: loaded from: classes.dex */
public class C0351n {

    /* JADX INFO: renamed from: k */
    public float f2176k;

    /* JADX INFO: renamed from: n */
    public int f2177n;

    /* JADX INFO: renamed from: q */
    public int f2178q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f48010toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f48011zy;

    /* JADX INFO: renamed from: k */
    public void m1380k(View v2) {
        this.f48010toq = v2.getLeft();
        this.f48011zy = v2.getTop();
        this.f2178q = v2.getRight();
        this.f2177n = v2.getBottom();
        this.f2176k = v2.getRotation();
    }

    public int toq() {
        return this.f2177n - this.f48011zy;
    }

    public int zy() {
        return this.f2178q - this.f48010toq;
    }
}
