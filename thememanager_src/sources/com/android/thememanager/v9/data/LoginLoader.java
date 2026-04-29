package com.android.thememanager.v9.data;

import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.basemodule.account.C1688q;
import ek5k.C6002g;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
public class LoginLoader implements InterfaceC0928g {

    /* JADX INFO: renamed from: k */
    private final C1688q f17064k = C1688q.cdj();

    /* JADX INFO: renamed from: q */
    @dd
    private InterfaceC2849k f17065q;

    /* JADX INFO: renamed from: com.android.thememanager.v9.data.LoginLoader$k */
    public interface InterfaceC2849k {
        void gbni();
    }

    public LoginLoader(@lvui InterfaceC2849k listener) {
        this.f17065q = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m10148q(Runnable runnable) {
        this.f17064k.m6588r();
        C6002g.fn3e(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zy() {
        InterfaceC2849k interfaceC2849k = this.f17065q;
        if (interfaceC2849k != null) {
            interfaceC2849k.gbni();
        }
    }

    @oc
    /* JADX INFO: renamed from: n */
    public void m10149n() {
        final Runnable runnable = new Runnable() { // from class: com.android.thememanager.v9.data.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f17069k.zy();
            }
        };
        C6002g.m22248y(new Runnable() { // from class: com.android.thememanager.v9.data.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f17091k.m10148q(runnable);
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        this.f17065q = null;
    }
}
