package ngy;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import zy.InterfaceC7843t;
import zy.lvui;

/* JADX INFO: compiled from: ExpandableWidgetHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    @lvui
    private final View f42684k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f93463toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7843t
    private int f93464zy = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zy(toq toqVar) {
        this.f42684k = (View) toqVar;
    }

    /* JADX INFO: renamed from: k */
    private void m26800k() {
        ViewParent parent = this.f42684k.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m1737p(this.f42684k);
        }
    }

    public void f7l8(@InterfaceC7843t int i2) {
        this.f93464zy = i2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m26801g(boolean z2) {
        if (this.f93463toq == z2) {
            return false;
        }
        this.f93463toq = z2;
        m26800k();
        return true;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public Bundle m26802n() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f93463toq);
        bundle.putInt("expandedComponentIdHint", this.f93464zy);
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    public void m26803q(@lvui Bundle bundle) {
        this.f93463toq = bundle.getBoolean("expanded", false);
        this.f93464zy = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f93463toq) {
            m26800k();
        }
    }

    @InterfaceC7843t
    public int toq() {
        return this.f93464zy;
    }

    public boolean zy() {
        return this.f93463toq;
    }
}
