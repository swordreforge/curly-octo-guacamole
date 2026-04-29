package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.toq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLauncherViewHolder extends LocalResourceViewHolder {
    public LocalLauncherViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
    }

    /* JADX INFO: renamed from: f */
    public static LocalLauncherViewHolder m8256f(ViewGroup parent, BaseLocalResourceAdapter adapter) {
        return new LocalLauncherViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_local_theme, parent, false), adapter);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalResourceViewHolder, com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        Intent intentM9542k;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BaseLocalResourceAdapter) this.f9847k).ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Resource resource = (Resource) arrayList.get(this.f9848n);
        if (C1792n.gvn7(resource)) {
            List<RelatedResource> parentResources = resource.getParentResources();
            if (parentResources == null || parentResources.size() <= 0) {
                Log.e("LocalLauncher", "not found parent resource");
                return;
            }
            intentM9542k = toq.m9539g(ki(), C1792n.zy(parentResources.get(0), C1791k.getInstance("theme")), true);
        } else {
            intentM9542k = toq.m9542k(ki(), this.f9848n, arrayList, C1792n.d3(resource) ? "spwallpaper" : "launcher");
        }
        ki().startActivityForResult(intentM9542k, intentM9542k.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }
}
