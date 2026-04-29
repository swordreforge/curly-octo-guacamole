package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import zy.dd;

/* JADX INFO: compiled from: ResponsiveViewStateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends AbstractC7322k {

    /* JADX INFO: renamed from: g */
    private boolean f41606g;

    /* JADX INFO: renamed from: n */
    private kz28.toq f41607n;

    /* JADX INFO: renamed from: q */
    private View f41608q;

    public toq(View view, kz28.toq toqVar) {
        this.f41608q = view;
        this.f41607n = toqVar;
        this.f41606g = InterfaceC6758k.class.isAssignableFrom(view.getContext().getClass());
    }

    @Override // miuix.responsive.page.manager.AbstractC7322k
    protected Context f7l8() {
        return this.f41608q.getContext();
    }

    @Override // miuix.responsive.page.manager.AbstractC7322k
    /* JADX INFO: renamed from: k */
    public void mo26544k(Configuration configuration) {
        if (!this.f41606g && AbstractC7322k.m26548s()) {
            m26549p(configuration);
            x2(configuration, this.f90060toq, m26551y(this.f90060toq, this.f41605k));
        }
    }

    @Override // miuix.responsive.page.manager.AbstractC7322k
    public void toq(Configuration configuration) {
        if (!this.f41606g && AbstractC7322k.m26548s()) {
            this.f41605k.qrj(this.f90060toq);
            kt06.toq toqVarZy = zy();
            ld6(configuration);
            this.f90060toq = toqVarZy;
        }
    }

    protected void x2(Configuration configuration, @dd kt06.toq toqVar, boolean z2) {
        C6753n c6753n = new C6753n();
        if (toqVar != null) {
            toqVar.ki(c6753n);
        }
        kz28.toq toqVar2 = this.f41607n;
        if (toqVar2 != null) {
            toqVar2.onResponsiveLayout(configuration, c6753n, z2);
        }
    }
}
