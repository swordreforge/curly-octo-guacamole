package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import gbni.InterfaceC6058k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import miuix.appcompat.app.ki;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLocalResourceAdapter extends BatchOperationAdapter<toq, BatchOperationAdapter.BatchViewHolder<toq>> {

    /* JADX INFO: renamed from: c */
    private InterfaceC6058k.k f12770c;

    /* JADX INFO: renamed from: f */
    protected RecyclerView.AbstractC1060y f12771f;

    /* JADX INFO: renamed from: l */
    protected String f12772l;

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter$k */
    class DialogInterfaceOnClickListenerC2176k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12773k;

        DialogInterfaceOnClickListenerC2176k(final Set val$checkedItemIds) {
            this.f12773k = val$checkedItemIds;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            BaseLocalResourceAdapter.this.f12770c.mo8223k(this.f12773k);
        }
    }

    public static class toq extends BatchOperationAdapter.toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f60458f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f12775g;

        /* JADX INFO: renamed from: n */
        private boolean f12776n;

        /* JADX INFO: renamed from: q */
        protected Resource f12777q;

        /* JADX INFO: renamed from: y */
        protected String f12778y;

        public toq(Resource resource) {
            this.f12777q = resource;
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        public boolean canChecked(Menu menu) {
            return this.f12776n;
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        protected String cantCheckReason() {
            String string;
            Context qVar = bf2.toq.toq();
            Resource resource = this.f12777q;
            if (resource == null) {
                string = "";
            } else {
                string = zsr0.toq.m28221n(qVar, resource, this.f12778y) || this.f12775g ? qVar.getString(R.string.resource_current_using_title) : qVar.getString(R.string.resource_system_title);
            }
            return qVar.getString(R.string.resource_can_not_selected, string);
        }

        /* JADX INFO: renamed from: g */
        public void m8240g(boolean isUsing) {
            this.f12775g = isUsing;
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        public String getId() {
            String str = this.f60458f7l8;
            if (str != null) {
                return str;
            }
            Resource resource = this.f12777q;
            if (resource != null) {
                return resource.getOnlineId() != null ? this.f12777q.getOnlineId() : this.f12777q.getLocalId();
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        public Resource m8241k() {
            return this.f12777q;
        }

        /* JADX INFO: renamed from: n */
        public void m8242n(String resourceCode) {
            this.f12778y = resourceCode;
        }

        /* JADX INFO: renamed from: q */
        public void m8243q(String id) {
            this.f60458f7l8 = id;
        }

        public boolean toq() {
            return this.f12776n;
        }

        public void zy(boolean canDelete) {
            this.f12776n = canDelete;
        }
    }

    public BaseLocalResourceAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter) {
        super(viewContainer);
        this.f12772l = resourceCode;
        this.f12770c = presenter;
    }

    protected toq bo(Resource resource) {
        toq toqVar = new toq(resource);
        C1791k c1791k = C1791k.getInstance(this.f12772l);
        boolean zGyi = gyi(resource, c1791k);
        boolean zDr = dr(resource, c1791k);
        toqVar.zy(zGyi);
        toqVar.m8240g(zDr);
        toqVar.m8242n(this.f12772l);
        return toqVar;
    }

    public String c8jq() {
        return this.f12772l;
    }

    protected boolean dr(Resource resource, C1791k resourceContext) {
        return false;
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: e */
    protected boolean mo7310e(BatchOperationAdapter.toq batchItem) {
        if (!(batchItem instanceof toq) || ((toq) batchItem).toq()) {
            return super.mo7310e(batchItem);
        }
        return false;
    }

    protected boolean gyi(Resource resource, C1791k resourceContext) {
        return C2320q.lvui(resource, resourceContext);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void uv6(Menu menu) {
        menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
    }

    /* JADX INFO: renamed from: v */
    public void m8239v(RecyclerView.AbstractC1060y outerAdapter) {
        this.f12771f = outerAdapter;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @oc
    public void xwq3(@dd List<Resource> list) {
        this.f9846q.clear();
        if (list == null) {
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Resource resource : list) {
            if (resource != null) {
                arrayList.add(bo(resource));
            }
        }
        this.f9846q.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void y9n(MenuItem item, Set<String> checkedItemIds) {
        if (item.getItemId() == R.string.resource_delete) {
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.orxw, null, this.f12772l));
            if (checkedItemIds.size() == 0) {
                nn86.m7150k(R.string.resource_tip_select_none, 0);
            } else {
                new ki.C6947k(ki()).m25039i(android.R.attr.alertDialogIcon).m25050z(fn3e().getString(R.string.resource_delete_all, Integer.valueOf(checkedItemIds.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterfaceOnClickListenerC2176k(checkedItemIds)).hb();
            }
        }
    }
}
