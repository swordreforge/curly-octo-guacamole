package com.android.thememanager.settings.subsettings;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import java.util.ArrayList;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetAdapter extends BaseThemeAdapter<C2615h, BaseThemeAdapter.ViewHolder> {
    public WidgetAdapter(InterfaceC1719p activity) {
        super(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@lvui BaseThemeAdapter.ViewHolder holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).mo9024n();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return ((C2615h) this.f9846q.get(position)).f15464p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@lvui BaseThemeAdapter.ViewHolder holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).zy();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: oc, reason: merged with bridge method [inline-methods] */
    public BaseThemeAdapter.ViewHolder onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType != 0 ? new WidgetListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.widget_list_item, parent, false), this) : new BlankWidgetViewHolder(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: r */
    public void m9168r(int i2, ArrayList<C2615h> arrayList, boolean z2) {
        if (this.f9846q.size() > 0) {
            this.f9846q.set(0, (T) ((C2615h) arrayList.get(0)));
            notifyItemChanged(0);
            return;
        }
        int size = this.f9846q.size();
        this.f9846q.addAll(arrayList);
        if (z2) {
            notifyItemRangeInserted(size, arrayList.size());
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: wvg */
    public void onBindViewHolder(@lvui BaseThemeAdapter.ViewHolder holder, int position) {
        holder.o1t(this.f9846q.get(position), position);
    }
}
