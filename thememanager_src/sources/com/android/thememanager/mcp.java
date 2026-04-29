package com.android.thememanager;

import com.android.thememanager.basemodule.privacy.C1781k;
import y9n.InterfaceC7781n;

/* JADX INFO: compiled from: StatsProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class mcp implements InterfaceC7781n {

    /* JADX INFO: renamed from: k */
    private boolean f12694k = false;

    @Override // y9n.InterfaceC7781n
    /* JADX INFO: renamed from: k */
    public boolean mo8215k() {
        if (!this.f12694k) {
            this.f12694k = C1781k.toq(bf2.toq.toq());
        }
        return this.f12694k;
    }

    @Override // y9n.InterfaceC7781n
    public String zy() {
        return "phone";
    }
}
