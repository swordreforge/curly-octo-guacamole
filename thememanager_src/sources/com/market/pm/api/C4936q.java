package com.market.pm.api;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.market.pm.IMarketInstallerService;

/* JADX INFO: renamed from: com.market.pm.api.q */
/* JADX INFO: compiled from: MarketInstaller.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4936q implements zy {

    /* JADX INFO: renamed from: k */
    private final Context f27886k;

    /* JADX INFO: renamed from: q */
    private InterfaceC4935n f27887q;

    public C4936q(Context context) {
        this.f27886k = context;
    }

    /* JADX INFO: renamed from: n */
    public void m17251n(InterfaceC4935n interfaceC4935n) {
        this.f27887q = interfaceC4935n;
    }

    /* JADX INFO: renamed from: q */
    public void m17252q(Uri uri, String str, String str2, String str3, String str4) throws C4934k {
        if (uri == null) {
            throw new IllegalStateException("uri must not be null.");
        }
        IMarketInstallerService iMarketInstallerServiceOpenService = MarketInstallerService.openService(this.f27886k);
        Bundle bundle = new Bundle();
        bundle.putString(zy.qsok, str);
        bundle.putString(zy.sdmr, str2);
        bundle.putString(zy.tfb, str3);
        bundle.putString(zy.z3a, str4);
        bundle.putString(zy.jm, this.f27886k.getPackageName());
        try {
            iMarketInstallerServiceOpenService.installPackage(uri, new MarketInstallObserver(this.f27887q), bundle);
        } catch (RemoteException unused) {
        }
    }
}
