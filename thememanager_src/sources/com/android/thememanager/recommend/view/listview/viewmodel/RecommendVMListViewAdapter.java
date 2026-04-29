package com.android.thememanager.recommend.view.listview.viewmodel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.BaseVMAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.recommend.model.entity.element.FooterElement;
import com.android.thememanager.recommend.view.listview.C2365g;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.C2368q;
import com.android.thememanager.recommend.view.listview.InterfaceC2366k;
import com.android.thememanager.recommend.view.listview.viewholder.BaseVMViewHolder;
import com.android.thememanager.recommend.view.listview.viewholder.IconRecommendPadViewHolder;
import com.android.thememanager.recommend.view.listview.viewholder.LargeIconCategoryTopViewHolder;
import com.android.thememanager.recommend.view.listview.viewholder.LargeIconDetailRecommendViewHolder;
import com.android.thememanager.recommend.view.listview.viewholder.LargeIconFourItemCardTitleViewHolder;
import com.android.thememanager.recommend.view.listview.viewholder.LargeIconTwoItemCardViewHolder;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;
import yz.C7794k;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendVMListViewAdapter extends BaseVMAdapter<UIElement, BaseVMViewHolder> implements InterfaceC2366k {

    /* JADX INFO: renamed from: y */
    private static final String f14432y = "RecommendListViewAdapter";

    /* JADX INFO: renamed from: g */
    protected final C2368q f14433g;

    /* JADX INFO: renamed from: n */
    protected C2365g f14434n;

    public RecommendVMListViewAdapter(InterfaceC1719p viewContainer, C2367n builder, C2368q preload) {
        super(viewContainer);
        C2365g c2365g = (C2365g) builder;
        this.f14434n = c2365g;
        this.f14433g = preload;
        this.f9851q = c2365g.o1t();
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BaseVMViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        C2368q c2368q = this.f14433g;
        if (c2368q != null) {
            c2368q.m8569q(position, getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: dd, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@lvui BaseVMViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.zy();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return ((UIElement) this.f9851q.toq().get(position)).getCardTypeOrdinal();
    }

    public int jk() {
        return this.f14434n.kja0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public BaseVMViewHolder onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        BaseVMViewHolder baseVMViewHolderD2ok;
        if (viewType == 113) {
            baseVMViewHolderD2ok = IconRecommendPadViewHolder.d2ok(parent, this);
        } else if (viewType == 129) {
            baseVMViewHolderD2ok = LargeIconFourItemCardTitleViewHolder.oc(parent, this);
        } else if (viewType == 132) {
            baseVMViewHolderD2ok = LargeIconDetailRecommendViewHolder.d2ok(parent, this);
        } else if (viewType == 126) {
            baseVMViewHolderD2ok = LargeIconCategoryTopViewHolder.oc(parent, this);
        } else if (viewType != 127) {
            C7794k.m28196p(f14432y, "createViewHolderByType not found type:" + viewType);
            baseVMViewHolderD2ok = null;
        } else {
            baseVMViewHolderD2ok = LargeIconTwoItemCardViewHolder.dd(parent, this);
        }
        if (baseVMViewHolderD2ok != null) {
            return baseVMViewHolderD2ok;
        }
        View view = new View(parent.getContext());
        view.setVisibility(8);
        return new BaseVMViewHolder(view, this);
    }

    public String mcp() {
        return this.f9851q.mo7367k();
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    @oc
    /* JADX INFO: renamed from: n */
    public void mo8550n(List<UIElement> elements, boolean append, boolean hasMore) {
        if (!hasMore && this.f14434n.fn3e()) {
            elements.add(new FooterElement());
        }
        if (!append) {
            this.f9851q.eqxt();
            this.f9851q.toq().addAll(elements);
            notifyDataSetChanged();
        } else {
            int itemCount = getItemCount();
            int size = elements.size();
            this.f9851q.toq().addAll(elements);
            notifyItemRangeInserted(itemCount, size);
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    /* JADX INFO: renamed from: o */
    public boolean mo6719o() {
        return this.f14434n.cdj();
    }

    public boolean oc() {
        return this.f14434n.zurt();
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    /* JADX INFO: renamed from: p */
    public void mo8555p(RecyclerView.AbstractC1060y outAdapter) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@lvui BaseVMViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.m8593n();
    }

    /* JADX INFO: renamed from: t */
    public String m8792t() {
        return this.f14434n.ld6();
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    public void toq(List<UIElement> elements, boolean hasMore) {
        if (!hasMore && this.f14434n.fn3e()) {
            elements.add(new FooterElement());
        }
        notifyDataSetChanged();
    }

    public int wvg() {
        return this.f14434n.m8564s();
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    /* JADX INFO: renamed from: y */
    public C2368q mo8556y() {
        return this.f14433g;
    }
}
