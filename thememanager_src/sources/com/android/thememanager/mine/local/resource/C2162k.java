package com.android.thememanager.mine.local.resource;

import android.content.Context;
import android.view.Menu;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import was.InterfaceC7730k;

/* JADX INFO: renamed from: com.android.thememanager.mine.local.resource.k */
/* JADX INFO: compiled from: LargeIconLocalBatchItem.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2162k extends BaseLocalResourceAdapter.toq implements InterfaceC7730k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public String f60449ld6;

    /* JADX INFO: renamed from: p */
    public String f12731p;

    /* JADX INFO: renamed from: s */
    public int f12732s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public String f60450x2;

    public C2162k(int type, String appName, String packageName, String installedName, Resource r2) {
        super(r2);
        this.f12731p = appName;
        this.f12732s = type;
        this.f60449ld6 = packageName;
        this.f60450x2 = installedName;
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter.toq, com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
    public boolean canChecked(Menu menu) {
        Resource resource;
        if (this.f12732s == 1 || (resource = this.f12777q) == null || resource.getLocalInfo().isOfficial()) {
            return false;
        }
        return super.canChecked(menu);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter.toq, com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
    protected String cantCheckReason() {
        Context qVar = bf2.toq.toq();
        if (this.f12732s == 1) {
            return null;
        }
        Resource resource = this.f12777q;
        return qVar.getString(R.string.resource_can_not_selected, (resource == null || resource.getLocalInfo().isOfficial()) ? C1819o.m7168z() : zsr0.toq.m28219g(this.f12777q.getLocalInfo().getLargeIconPackageName(), this.f12777q.getLocalId(), this.f12777q.getLocalInfo().isOfficial()) ? qVar.getString(R.string.resource_current_using_title) : qVar.getString(R.string.resource_system_title));
    }
}
