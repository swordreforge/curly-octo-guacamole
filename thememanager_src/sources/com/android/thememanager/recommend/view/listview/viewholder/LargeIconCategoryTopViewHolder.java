package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.model.entity.element.LargeIconAllPackageCategoryElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconCategoryTopViewHolder extends BaseVMViewHolder<LargeIconAllPackageCategoryElement> {

    /* JADX INFO: renamed from: g */
    RecyclerView f14173g;

    /* JADX INFO: renamed from: y */
    toq f14174y;

    private static class toq extends RecyclerView.AbstractC1060y<zy> {

        /* JADX INFO: renamed from: k */
        List<UILink> f14175k;

        private toq() {
            this.f14175k = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@InterfaceC7396q @lvui zy holder, int position) {
            holder.ki(this.f14175k.get(position));
        }

        public void fn3e(List<UILink> dataList) {
            this.f14175k = dataList;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            if (y9n.mcp(this.f14175k)) {
                return 0;
            }
            return this.f14175k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @InterfaceC7396q
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public zy onCreateViewHolder(@InterfaceC7396q @lvui ViewGroup parent, int viewType) {
            return new zy(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_all_child_category_item, parent, false));
        }
    }

    private static class zy extends RecyclerView.fti implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        private TextView f14176k;

        /* JADX INFO: renamed from: n */
        UILink f14177n;

        /* JADX INFO: renamed from: q */
        private ViewGroup f14178q;

        public zy(@InterfaceC7396q @lvui View itemView) {
            super(itemView);
            this.f14176k = (TextView) itemView.findViewById(R.id.title);
            ViewGroup viewGroup = (ViewGroup) itemView.findViewById(R.id.container);
            this.f14178q = viewGroup;
            C6077k.ld6(viewGroup);
        }

        public void ki(UILink uiLink) {
            this.f14177n = uiLink;
            this.f14176k.setText(uiLink.title);
            this.f14178q.setOnClickListener(this);
            C1812k.toq(this.itemView, uiLink.title);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f14177n != null) {
                C2451n.toq toqVarM8797g = C2451n.m8797g();
                toqVarM8797g.toq(this.f14177n.productType);
                toqVarM8797g.x2("largeicons");
                C2451n.m8803y((AbstractActivityC1717k) this.itemView.getContext(), null, this.f14177n, toqVarM8797g);
            }
        }
    }

    public LargeIconCategoryTopViewHolder(@InterfaceC7396q @lvui View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
        jk(itemView);
    }

    private void jk(View itemView) {
        RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R.id.recycle);
        this.f14173g = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), 0, false));
        toq toqVar = new toq();
        this.f14174y = toqVar;
        this.f14173g.setAdapter(toqVar);
    }

    public static LargeIconCategoryTopViewHolder oc(ViewGroup parent, RecommendVMListViewAdapter adapter) {
        return new LargeIconCategoryTopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_all_category, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconAllPackageCategoryElement item, int position) {
        super.o1t(item, position);
        this.f14174y.fn3e(item.uiLinks);
    }
}
