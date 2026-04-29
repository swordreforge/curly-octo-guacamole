package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.AodSlideListElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodSlideListViewHolder extends BaseViewHolder<AodSlideListElement> implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private TextView f13774g;

    /* JADX INFO: renamed from: p */
    private List<UIProduct> f13775p;

    /* JADX INFO: renamed from: s */
    private toq f13776s;

    /* JADX INFO: renamed from: y */
    private TextView f13777y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.AodSlideListViewHolder$k */
    private class C2369k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f13778k = bf2.toq.toq().getResources().getDimensionPixelSize(R.dimen.rc_aod_slide_list_item_horizontal_offset);

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60691toq = bf2.toq.toq().getResources().getDimensionPixelSize(R.dimen.rc_aod_slide_list_item_decoration);

        public C2369k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            int i2 = this.f60691toq;
            outRect.left = i2;
            outRect.right = i2;
            if (AodSlideListViewHolder.this.f13775p != null && parent.getChildAdapterPosition(view) == AodSlideListViewHolder.this.f13775p.size() - 1) {
                outRect.right = this.f13778k;
            } else if (parent.getChildAdapterPosition(view) == 0) {
                outRect.left = this.f13778k;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class toq extends RecyclerView.AbstractC1060y<C2370k> {

        /* JADX INFO: renamed from: k */
        private List<UIProduct> f13779k;

        /* JADX INFO: renamed from: q */
        private x2.C1735g f13781q = com.android.thememanager.basemodule.imageloader.x2.fn3e();

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.AodSlideListViewHolder$toq$k */
        private class C2370k extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            private NinePatchImageView f13783k;

            /* JADX INFO: renamed from: n */
            private int f13784n;

            /* JADX INFO: renamed from: q */
            private int f13785q;

            public C2370k(@lvui View itemView) {
                super(itemView);
                this.f13783k = (NinePatchImageView) itemView.findViewById(R.id.thumbnail);
                this.f13785q = itemView.getResources().getDimensionPixelSize(R.dimen.rc_aod_slide_list_item_width);
                this.f13784n = itemView.getResources().getDimensionPixelSize(R.dimen.rc_aod_slide_list_item_height);
            }
        }

        public toq(List<UIProduct> uiProductList) {
            this.f13779k = uiProductList;
            if (C1819o.d2ok(bf2.toq.toq())) {
                this.f13781q.wvg(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ki(int i2, View view) {
            UIProduct uIProduct = this.f13779k.get(i2);
            Intent intentKi = com.android.thememanager.toq.ki(AodSlideListViewHolder.this.ki(), AodSlideListViewHolder.this.ni7(), uIProduct.uuid, uIProduct.imageUrl, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
            if (AodSlideListViewHolder.this.ni7() != null) {
                AodSlideListViewHolder.this.ni7().startActivityForResult(intentKi, 109);
            } else {
                AodSlideListViewHolder.this.ki().startActivity(intentKi);
            }
            AodSlideListViewHolder.this.m6706z().d8wk(uIProduct.trackId, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui C2370k viewHolder, final int position) {
            com.android.thememanager.basemodule.imageloader.x2.m6782y(AodSlideListViewHolder.this.ki(), this.f13779k.get(position).imageUrl, viewHolder.f13783k, this.f13781q.m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), 0.0f)).x9kr(viewHolder.f13785q, viewHolder.f13784n));
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14393k.ki(position, view);
                }
            });
            C6077k.o1t(viewHolder.itemView);
        }

        public void fu4(List<UIProduct> uiProductList) {
            this.f13779k = uiProductList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f13779k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public C2370k onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
            return new C2370k(LayoutInflater.from(AodSlideListViewHolder.this.ki()).inflate(R.layout.rc_aod_slide_list_item, viewGroup, false));
        }
    }

    public AodSlideListViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13775p = new ArrayList();
        m8578f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m8577c(AodSlideListElement aodSlideListElement, View view) {
        if (aodSlideListElement.getLink() != null) {
            C2451n.toq qVar = C2451n.m8797g().toq(aodSlideListElement.getLink().productType);
            qVar.x2(wvg().lvui());
            C2451n.m8803y(ki(), ni7(), aodSlideListElement.getLink(), qVar);
        } else {
            oc(aodSlideListElement.getSubjectUuid(), aodSlideListElement.getTitle(), true);
        }
        m6706z().d8wk(aodSlideListElement.getTrackId(), null);
    }

    /* JADX INFO: renamed from: f */
    private void m8578f() {
        this.f13777y = (TextView) this.itemView.findViewById(R.id.aod_slide_list_count);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.aod_slide_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ki());
        linearLayoutManager.setOrientation(0);
        this.f13776s = new toq(this.f13775p);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new C2369k());
        recyclerView.setAdapter(this.f13776s);
        this.f13774g = (TextView) this.itemView.findViewById(R.id.aod_slide_list_title);
    }

    public static AodSlideListViewHolder uv6(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new AodSlideListViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_aod_slide_list, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        if (this.f13775p != null) {
            for (int i2 = 0; i2 < this.f13775p.size(); i2++) {
                arrayList.add(this.f13775p.get(i2).trackId);
            }
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public void o1t(final AodSlideListElement item, int position) {
        List<UIProduct> list;
        super.o1t(item, position);
        this.f13774g.setText(item.getTitle());
        this.f13775p = item.getProducts();
        this.f13777y.setText(String.valueOf(item.getProductCount()));
        if (this.f13775p == null || item.getProductCount() <= this.f13775p.size()) {
            this.f13777y.setCompoundDrawablePadding(0);
            this.f13777y.setCompoundDrawablesRelative(null, null, null, null);
            this.f13777y.setOnClickListener(null);
            C6077k.m22367g(this.f13777y);
        } else {
            TextView textView = this.f13777y;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, textView.getResources().getDrawable(R.drawable.rc_aod_slide_list_more), (Drawable) null);
            this.f13777y.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.zy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14430k.m8577c(item, view);
                }
            });
            C6077k.f7l8(this.f13777y);
        }
        toq toqVar = this.f13776s;
        if (toqVar == null || (list = this.f13775p) == null) {
            return;
        }
        toqVar.fu4(list);
        this.f13776s.notifyDataSetChanged();
    }
}
