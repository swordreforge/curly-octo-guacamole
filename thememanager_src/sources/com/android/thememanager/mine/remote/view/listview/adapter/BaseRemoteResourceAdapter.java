package com.android.thememanager.mine.remote.view.listview.adapter;

import android.view.Menu;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p029m.zy;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRemoteResourceAdapter extends BatchOperationAdapter<toq, BatchOperationAdapter.BatchViewHolder<toq>> {

    /* JADX INFO: renamed from: e */
    private static final String f12879e = "large_icon_title_id";

    /* JADX INFO: renamed from: c */
    private boolean f12880c;

    /* JADX INFO: renamed from: f */
    private InterfaceC6094k.q f12881f;

    /* JADX INFO: renamed from: l */
    private String f12882l;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter$k */
    class C2193k extends ld6.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f12883k;

        C2193k(final List val$batchResourceItems) {
            this.f12883k = val$batchResourceItems;
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: k */
        public boolean mo4703k(int a2, int b2) {
            return zy.m24738k(((toq) ((BaseThemeAdapter) BaseRemoteResourceAdapter.this).f9846q.get(a2)).getId(), ((toq) this.f12883k.get(b2)).getId());
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: n */
        public int mo4704n() {
            return ((BaseThemeAdapter) BaseRemoteResourceAdapter.this).f9846q.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: q */
        public int mo4705q() {
            return this.f12883k.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        public boolean toq(int a2, int b2) {
            return zy.m24738k(((toq) ((BaseThemeAdapter) BaseRemoteResourceAdapter.this).f9846q.get(a2)).getId(), ((toq) this.f12883k.get(b2)).getId());
        }
    }

    public static class toq extends BatchOperationAdapter.toq {
        private UIProduct mProduct;

        public toq(UIProduct product) {
            this.mProduct = product;
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        public boolean canChecked(Menu menu) {
            return true;
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        public String getId() {
            UIProduct uIProduct = this.mProduct;
            return uIProduct == null ? BaseRemoteResourceAdapter.f12879e : uIProduct.uuid;
        }

        public UIProduct getProduct() {
            return this.mProduct;
        }
    }

    public BaseRemoteResourceAdapter(@lvui InterfaceC1719p viewContainer, String tabType, InterfaceC6094k.q presenter) {
        super(viewContainer);
        this.f12880c = false;
        this.f12882l = tabType;
        this.f12881f = presenter;
    }

    /* JADX INFO: renamed from: d */
    public String m8274d() {
        return this.f12882l;
    }

    protected LargeIconRemoteBatchItem dr(int type, String packageName, UIProduct resource) {
        return new LargeIconRemoteBatchItem(type, packageName, resource);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: e */
    protected boolean mo7310e(BatchOperationAdapter.toq batchItem) {
        if ((batchItem instanceof LargeIconRemoteBatchItem) && ((LargeIconRemoteBatchItem) batchItem).type == 1) {
            return false;
        }
        return super.mo7310e(batchItem);
    }

    public List<LargeIconRemoteBatchItem> gyi(List<UICard> elements, boolean append) {
        ArrayList arrayList = new ArrayList();
        if (elements != null && elements.size() > 0) {
            for (UICard uICard : elements) {
                if (!this.f12880c) {
                    arrayList.add(dr(1, uICard.title, null));
                }
                this.f12880c = uICard.hasMore;
                Iterator<UIProduct> it = uICard.products.iterator();
                while (it.hasNext()) {
                    arrayList.add(dr(0, uICard.title, it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @oc
    public void mu(@dd List<UIProduct> list, boolean z2) {
        if (list == null) {
            if (z2) {
                return;
            }
            this.f9846q.clear();
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xwq3(it.next()));
        }
        if (z2) {
            int itemCount = getItemCount();
            int size = list.size();
            this.f9846q.addAll(arrayList);
            notifyItemRangeInserted(itemCount, size);
        } else {
            ld6.zy(new C2193k(arrayList), false).m5034n(this);
            this.f9846q.clear();
            this.f9846q.addAll(arrayList);
        }
        if (m7312m()) {
            t8iq();
        }
    }

    /* JADX INFO: renamed from: v */
    protected InterfaceC6094k.q m8275v() {
        return this.f12881f;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void vq(@dd List<UICard> list, boolean z2) {
        if (list == null) {
            if (z2) {
                return;
            }
            this.f9846q.clear();
            notifyDataSetChanged();
            return;
        }
        List<LargeIconRemoteBatchItem> listGyi = gyi(list, z2);
        if (z2) {
            int itemCount = getItemCount();
            int size = list.size();
            this.f9846q.addAll(listGyi);
            notifyItemRangeInserted(itemCount, size);
        } else {
            this.f9846q.clear();
            this.f9846q.addAll(listGyi);
            notifyDataSetChanged();
        }
        if (m7312m()) {
            t8iq();
        }
    }

    protected toq xwq3(UIProduct product) {
        return new toq(product);
    }
}
