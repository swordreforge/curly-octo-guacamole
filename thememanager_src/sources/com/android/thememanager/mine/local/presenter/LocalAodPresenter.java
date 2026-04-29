package com.android.thememanager.mine.local.presenter;

import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import gbni.InterfaceC6058k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAodPresenter extends BaseLocalPresenter<InterfaceC6058k.toq> implements InterfaceC6058k.k<InterfaceC6058k.toq> {

    /* JADX INFO: renamed from: f */
    public static final String f12721f = "LocalAodPresenter";

    public LocalAodPresenter(boolean registerImportListener, boolean fromCustomize) {
        super(registerImportListener, fromCustomize, "aod");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.presenter.BaseLocalPresenter
    /* JADX INFO: renamed from: vyq */
    public void m8218c(String resourceCode) {
        CopyOnWriteArrayList<Resource> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        boolean z2 = this.f12708g;
        if (z2) {
            copyOnWriteArrayList.addAll(C2320q.a9("spaod", z2));
        }
        List<Resource> listA9 = C2320q.a9("aod", this.f12708g);
        if (!kja0.qrj(listA9)) {
            copyOnWriteArrayList.addAll(listA9);
        }
        this.f12711n.n7h(copyOnWriteArrayList);
    }
}
