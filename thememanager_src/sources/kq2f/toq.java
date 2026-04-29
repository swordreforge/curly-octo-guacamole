package kq2f;

import android.view.View;

/* JADX INFO: compiled from: NavigatorSwitchPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private final View f37506k;

    /* JADX INFO: renamed from: n */
    private boolean f37507n;

    /* JADX INFO: renamed from: q */
    private float f37508q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f82090toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f82091zy;

    public toq(View view) {
        this.f37506k = view;
        this.f82090toq = view.getVisibility();
        this.f37508q = view.getAlpha();
    }

    /* JADX INFO: renamed from: k */
    public void m24678k(float f2) {
        this.f37508q = f2;
        if (this.f37507n) {
            return;
        }
        this.f37506k.setAlpha(f2);
    }

    /* JADX INFO: renamed from: q */
    public void m24679q(boolean z2, int i2) {
        this.f82091zy = z2;
        if (z2) {
            this.f37506k.setVisibility(i2);
        } else {
            this.f37506k.setVisibility(this.f82090toq);
        }
    }

    public void toq(int i2) {
        this.f82090toq = i2;
        if (this.f82091zy) {
            return;
        }
        this.f37506k.setVisibility(i2);
    }

    public void zy(boolean z2, float f2) {
        this.f37507n = z2;
        if (z2) {
            this.f37506k.setAlpha(f2);
        } else {
            this.f37506k.setAlpha(this.f37508q);
        }
    }
}
