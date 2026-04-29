package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.room.AbstractC1141t;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.database.C1960k;
import com.android.thememanager.database.ThemeDatabase;
import com.android.thememanager.mine.local.resource.C2162k;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalLargeIconViewHolder;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalLargeTitleViewHolder;
import com.xiaomi.mipush.sdk.C5658n;
import ek5k.C6002g;
import gbni.InterfaceC6058k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import miuix.appcompat.app.ki;
import zy.dd;
import zy.lvui;
import zy.oc;
import zy.y9n;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLargeIconAdapter extends BaseLocalResourceAdapter {

    /* JADX INFO: renamed from: o */
    private static final String f12782o = "LocalLargeIconAdapter";

    /* JADX INFO: renamed from: e */
    private InterfaceC6058k.k f12783e;

    /* JADX INFO: renamed from: j */
    protected String f12784j;

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter$k */
    class DialogInterfaceOnClickListenerC2177k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12785k;

        DialogInterfaceOnClickListenerC2177k(final Set val$checkedItemIds) {
            this.f12785k = val$checkedItemIds;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            LocalLargeIconAdapter.this.f12783e.mo8223k(this.f12785k);
        }
    }

    class toq {

        /* JADX INFO: renamed from: k */
        Map.Entry<String, List<Resource>> f12787k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f60459toq;

        toq(Map.Entry<String, List<Resource>> entry, int order) {
            this.f12787k = entry;
            this.f60459toq = order;
        }
    }

    private static class zy extends AsyncTask<List<Resource>, Void, List<C2162k>> {

        /* JADX INFO: renamed from: k */
        private LocalLargeIconAdapter f12788k;

        public zy(LocalLargeIconAdapter adapter) {
            this.f12788k = adapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0149 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[PHI: r3
          0x0150: PHI (r3v6 java.lang.String) = (r3v4 java.lang.String), (r3v11 java.lang.String) binds: [B:55:0x013b, B:60:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.List<com.android.thememanager.mine.local.resource.C2162k> doInBackground(java.util.List<com.android.thememanager.basemodule.resource.model.Resource>... r20) {
            /*
                Method dump skipped, instruction units count: 480
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter.zy.doInBackground(java.util.List[]):java.util.List");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<C2162k> result) {
            this.f12788k.d8wk(result);
        }
    }

    public LocalLargeIconAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter) {
        super(viewContainer, resourceCode, presenter);
        this.f12784j = resourceCode;
        this.f12783e = presenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void d8wk(List<C2162k> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("local large icon size : ");
        sb.append(list != null ? list.size() : -1);
        Log.d(f12782o, sb.toString());
        this.f9846q.clear();
        this.f9846q.addAll(list);
        notifyDataSetChanged();
    }

    protected static C2162k fnq8(int type, String appName, String packageName, String installName, Resource resource, String resourceCode) {
        C2162k c2162k = new C2162k(type, appName, packageName, installName, resource);
        c2162k.zy(resource != null ? qkj8(resource, C1791k.getInstance(resourceCode)) : true);
        c2162k.m8242n(resourceCode);
        return c2162k;
    }

    public static LinkedHashMap<String, List<Resource>> g1(LinkedHashMap<String, List<Resource>> map, HashMap<String, Integer> orderMap) {
        ArrayList<toq> arrayList = new ArrayList();
        for (Map.Entry<String, List<Resource>> entry : map.entrySet()) {
            arrayList.add(new toq(entry, orderMap.getOrDefault(entry.getKey(), Integer.valueOf(AbstractC1141t.f52393qrj)).intValue()));
        }
        arrayList.sort(Comparator.comparingInt(new ToIntFunction() { // from class: com.android.thememanager.mine.local.view.recyclerview.adapter.k
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((LocalLargeIconAdapter.toq) obj).f60459toq;
            }
        }));
        LinkedHashMap<String, List<Resource>> linkedHashMap = new LinkedHashMap<>();
        for (toq toqVar : arrayList) {
            linkedHashMap.put(toqVar.f12787k.getKey(), toqVar.f12787k.getValue());
        }
        return linkedHashMap;
    }

    private static boolean qkj8(Resource resource, C1791k resourceContext) {
        return C2320q.lvui(resource, resourceContext) && !zsr0.toq.m28219g(resource.getLocalInfo().getLargeIconPackageName(), resource.getLocalId(), resource.getLocalInfo().isOfficial());
    }

    @y9n
    public static String qo(@lvui String packageName) {
        String[] strArr;
        if (a9.m6999s(packageName.split(C5658n.f73185t8r)[0])) {
            return packageName;
        }
        C1960k c1960kX2 = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().x2(packageName);
        if (c1960kX2 == null || (strArr = c1960kX2.f58002f7l8) == null || strArr.length <= 0) {
            return null;
        }
        for (String str : strArr) {
            if (a9.m6999s(str.split(C5658n.f73185t8r)[0])) {
                return str;
            }
        }
        return null;
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: a */
    public void mo7308a(Set deletedItemIds) {
        super.mo7308a(deletedItemIds);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int size = this.f9846q.size() - 1; size >= 0; size--) {
            String str = ((C2162k) this.f9846q.get(size)).f60449ld6;
            if (linkedHashMap.containsKey(str)) {
                ((List) linkedHashMap.get(str)).add(Integer.valueOf(size));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(size));
                linkedHashMap.put(str, arrayList);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() == 2) {
                int iIntValue = ((Integer) ((List) entry.getValue()).get(0)).intValue();
                if (((BaseLocalResourceAdapter.toq) this.f9846q.get(iIntValue)).m8241k() == null) {
                    int iIntValue2 = ((Integer) ((List) entry.getValue()).get(1)).intValue();
                    this.f9846q.remove(iIntValue);
                    this.f9846q.remove(iIntValue2);
                    notifyItemRemoved(iIntValue);
                    notifyItemRemoved(iIntValue2);
                }
            }
        }
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter, com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: e */
    protected boolean mo7310e(BatchOperationAdapter.toq batchItem) {
        C2162k c2162k = (C2162k) batchItem;
        if (c2162k.f12732s == 1 || c2162k.m8241k() == null || c2162k.m8241k().getLocalInfo().isOfficial()) {
            return false;
        }
        return super.mo7310e(batchItem);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f9846q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return ((C2162k) this.f9846q.get(position)).f12732s;
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter, com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void uv6(Menu menu) {
        menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: wo, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType == 0 ? LocalLargeIconViewHolder.m8254l(parent, this) : LocalLargeTitleViewHolder.m8255l(parent, this);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    @oc
    public void xwq3(@dd List<Resource> resources) {
        if (resources != null) {
            new zy(this).executeOnExecutor(C6002g.ld6(), resources);
        } else {
            this.f9846q.clear();
            notifyDataSetChanged();
        }
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter, com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void y9n(MenuItem item, Set checkedItemIds) {
        if (item.getItemId() == R.string.resource_delete) {
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.orxw, null, this.f12784j));
            if (checkedItemIds.size() == 0) {
                nn86.m7150k(R.string.resource_tip_select_none, 0);
            } else {
                new ki.C6947k(ki()).m25039i(android.R.attr.alertDialogIcon).m25050z(fn3e().getString(R.string.resource_delete_all, Integer.valueOf(checkedItemIds.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterfaceOnClickListenerC2177k(checkedItemIds)).hb();
            }
        }
    }
}
