package com.android.thememanager.module.attention.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.views.f7l8;
import com.android.thememanager.recommend.model.entity.element.DesignerElement;
import com.android.thememanager.recommend.model.entity.element.FeedElement;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.settings.subsettings.InterfaceC2616k;
import com.android.thememanager.v9.holder.toq;
import java.util.ArrayList;
import java.util.List;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: AuthorAttentionAndDynamicAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: k */
    private final C1582h f13052k;

    /* JADX INFO: renamed from: q */
    protected List<UIElement> f13053q = new ArrayList();

    public toq(C1582h fragment) {
        this.f13052k = fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fn3e(com.android.thememanager.v9.holder.toq toqVar, boolean z2, String str, String str2) {
        C1582h c1582h = this.f13052k;
        if (c1582h instanceof zy) {
            ((zy) c1582h).cn02(z2, toqVar, str, str2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f13053q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return this.f13053q.get(position).getCardTypeOrdinal();
    }

    public void ki() {
        this.f13053q.clear();
    }

    public void ni7(List<UIElement> elementList) {
        int size = this.f13053q.size();
        this.f13053q.addAll(elementList);
        if (size == 0) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeInserted(size, elementList.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti holder, int position) {
        if (holder instanceof com.android.thememanager.v9.holder.toq) {
            UIElement uIElement = this.f13053q.get(position);
            if (uIElement instanceof DesignerElement) {
                ((com.android.thememanager.v9.holder.toq) holder).mcp((DesignerElement) uIElement, position);
                return;
            }
            return;
        }
        if (holder instanceof com.android.thememanager.v9.holder.zy) {
            UIElement uIElement2 = this.f13053q.get(position);
            if (uIElement2 instanceof FeedElement) {
                ((com.android.thememanager.v9.holder.zy) holder).fn3e((FeedElement) uIElement2, position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 92:
                final com.android.thememanager.v9.holder.toq toqVar = new com.android.thememanager.v9.holder.toq(layoutInflaterFrom.inflate(R.layout.element_detail_author_attention_list, parent, false));
                toqVar.m10179t(new toq.InterfaceC7942toq() { // from class: com.android.thememanager.module.attention.view.k
                    @Override // com.android.thememanager.v9.holder.toq.InterfaceC7942toq
                    /* JADX INFO: renamed from: k */
                    public final void mo8327k(boolean z2, String str, String str2) {
                        this.f13048k.fn3e(toqVar, z2, str, str2);
                    }
                });
                return toqVar;
            case 93:
                return new com.android.thememanager.v9.holder.zy(layoutInflaterFrom.inflate(R.layout.element_detail_author_dyncmic_list, parent, false));
            case 94:
                return new f7l8.zy(layoutInflaterFrom.inflate(R.layout.element_detail_author_attention_head, parent, false));
            default:
                C7794k.f7l8("AuthorAttentionAdapter. unknown type: " + viewType);
                return new f7l8.zy(layoutInflaterFrom.inflate(android.R.layout.simple_list_item_1, parent, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewAttachedToWindow(@lvui RecyclerView.fti holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).mo9024n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewDetachedFromWindow(@lvui RecyclerView.fti holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).zy();
        }
    }
}
