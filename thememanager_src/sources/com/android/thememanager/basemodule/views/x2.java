package com.android.thememanager.basemodule.views;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import miuix.springback.trigger.AbstractC7346k;
import miuix.springback.view.SpringBackLayout;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: SpringBackLayoutWrap.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: n */
    private static final String f10627n = "SblUtil";

    /* JADX INFO: renamed from: k */
    @lvui
    private final SpringBackLayout f10628k;

    /* JADX INFO: renamed from: q */
    @lvui
    private final zy f10629q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final InterfaceC1868n f57848toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final C1869q f57849zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.x2$g */
    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1866g {
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.x2$k */
    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    class C1867k extends C1869q {
        C1867k() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.C1869q, miuix.springback.trigger.AbstractC7346k.k
        protected void ld6() {
            super.ld6();
            x2.this.f57848toq.mo7377k();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.x2$n */
    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    public interface InterfaceC1868n {
        /* JADX INFO: renamed from: k */
        default void mo7377k() {
        }

        default void toq() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.x2$q */
    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    static class C1869q extends AbstractC7346k.toq {
        C1869q() {
            super(0);
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: g */
        protected void mo7378g() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        protected void ld6() {
            C7794k.m28194k(x2.f10627n, this + ".onTriggered");
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: p */
        protected void mo7379p() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: s */
        protected void mo7380s() {
        }

        @lvui
        public String toString() {
            return "RefreshAction.0x" + Integer.toHexString(hashCode());
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: y */
        protected void mo7381y() {
        }
    }

    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    class toq extends zy {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.zy, miuix.springback.trigger.AbstractC7346k.k
        protected void ld6() {
            super.ld6();
            if (this.f10631p) {
                x2.this.f57848toq.toq();
            } else {
                n7h();
            }
        }
    }

    /* JADX INFO: compiled from: SpringBackLayoutWrap.java */
    static class zy extends AbstractC7346k.zy {

        /* JADX INFO: renamed from: p */
        boolean f10631p;

        zy() {
            super(0);
            this.f10631p = true;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: g */
        protected void mo7378g() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        protected void ld6() {
            C7794k.m28194k(x2.f10627n, this + ". onTriggered");
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: p */
        protected void mo7379p() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: s */
        protected void mo7380s() {
        }

        @lvui
        public String toString() {
            return "LoadMoreAction.hasMore:" + this.f10631p;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.k
        /* JADX INFO: renamed from: y */
        protected void mo7381y() {
        }
    }

    public x2(@lvui SpringBackLayout sbl, @lvui InterfaceC1868n rLis, boolean refresh, boolean loadMore) {
        this.f10628k = sbl;
        this.f57848toq = rLis;
        miuix.springback.trigger.zy zyVar = new miuix.springback.trigger.zy(sbl.getContext());
        C1867k c1867k = new C1867k();
        this.f57849zy = c1867k;
        toq toqVar = new toq();
        this.f10629q = toqVar;
        if (refresh) {
            zyVar.mo26655n(c1867k);
        }
        if (loadMore) {
            zyVar.mo26655n(toqVar);
        }
        zyVar.hyr(sbl);
    }

    public boolean f7l8() {
        return (this.f10628k.getSpringBackMode() & 1) != 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7371g() {
        return (this.f10628k.getSpringBackMode() & 2) != 0;
    }

    public void ld6() {
        this.f10629q.t8r();
    }

    /* JADX INFO: renamed from: n */
    public void m7372n() {
        this.f57849zy.m26670h();
        this.f10629q.m26682h();
    }

    /* JADX INFO: renamed from: p */
    public void m7373p(boolean has) {
        this.f10629q.f10631p = has;
        C7794k.m28194k(f10627n, "setHasMoreData." + has);
    }

    /* JADX INFO: renamed from: q */
    public void m7374q(boolean success, boolean hasMore) {
        if (success) {
            if (hasMore) {
                this.f10629q.m26682h();
                return;
            } else {
                this.f10629q.n7h();
                return;
            }
        }
        if (hasMore) {
            this.f10629q.cdj();
        } else {
            this.f10629q.n7h();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m7375s(boolean enable, int springBackMode) {
        int springBackMode2 = this.f10628k.getSpringBackMode();
        this.f10628k.setSpringBackMode(enable ? springBackMode2 | springBackMode : (~springBackMode) & springBackMode2);
    }

    public void toq() {
        this.f57848toq.toq();
    }

    public void x2() {
        this.f57849zy.t8r();
    }

    /* JADX INFO: renamed from: y */
    public void m7376y(boolean enable) {
        int springBackMode = this.f10628k.getSpringBackMode();
        this.f10628k.setSpringBackMode(enable ? springBackMode | 2 : springBackMode & (-3));
    }

    public boolean zy() {
        return this.f10629q.f10631p;
    }
}
