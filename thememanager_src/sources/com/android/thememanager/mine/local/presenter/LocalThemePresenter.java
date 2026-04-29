package com.android.thememanager.mine.local.presenter;

import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.n7h;
import gbni.InterfaceC6058k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalThemePresenter extends BaseLocalPresenter<InterfaceC6058k.toq> implements InterfaceC6058k.k<InterfaceC6058k.toq> {

    /* JADX INFO: renamed from: f */
    public static final String f12725f = "LocalThemePresenter";

    public LocalThemePresenter(boolean registerImportListener) {
        super(registerImportListener, false, "theme");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.presenter.BaseLocalPresenter
    /* JADX INFO: renamed from: e */
    public void uv6(String resourceCode) {
        List<Resource> listEk5k = C2320q.ek5k("theme", false);
        n7h.m6950g(listEk5k);
        this.f12711n.n7h(new CopyOnWriteArrayList<>(listEk5k));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.presenter.BaseLocalPresenter
    /* JADX INFO: renamed from: vyq */
    public void m8218c(String resourceCode) {
        List<Resource> listA9 = C2320q.a9("theme", false);
        n7h.m6950g(listA9);
        this.f12711n.n7h(new CopyOnWriteArrayList<>(listA9));
    }
}
