package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.graphics.Rect;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.model.entity.element.LargeIconHomeCardElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconHomeCardViewHolder extends BaseViewHolder<LargeIconHomeCardElement> {

    /* JADX INFO: renamed from: i */
    private static final String f14186i = "LARGEICONS_ONE_SLIDE_CARD";

    /* JADX INFO: renamed from: z */
    private static final String f14187z = "LargeIconHomeCardHolder";

    /* JADX INFO: renamed from: g */
    private TextView f14188g;

    /* JADX INFO: renamed from: h */
    private int f14189h;

    /* JADX INFO: renamed from: p */
    private zy f14190p;

    /* JADX INFO: renamed from: s */
    private RecyclerView f14191s;

    /* JADX INFO: renamed from: y */
    private TextView f14192y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.LargeIconHomeCardViewHolder$k */
    class C2419k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f14193k;

        C2419k(final int val$padding) {
            this.f14193k = val$padding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q @lvui Rect outRect, @InterfaceC7396q @lvui View view, @InterfaceC7396q @lvui RecyclerView parent, @InterfaceC7396q @lvui RecyclerView.mcp state) {
            int i2 = this.f14193k;
            outRect.top = i2;
            outRect.bottom = i2;
            outRect.left = i2;
            outRect.right = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: g */
        private ViewGroup f14194g;

        /* JADX INFO: renamed from: k */
        private TextView f14195k;

        /* JADX INFO: renamed from: n */
        private ImageView f14196n;

        /* JADX INFO: renamed from: q */
        private TextView f14197q;

        public toq(@InterfaceC7396q @lvui View itemView) {
            super(itemView);
            this.f14195k = (TextView) itemView.findViewById(R.id.title);
            this.f14197q = (TextView) itemView.findViewById(R.id.price);
            this.f14194g = (ViewGroup) itemView.findViewById(R.id.image_container);
            itemView.getLayoutParams().width = LargeIconHomeCardViewHolder.this.f14189h;
            ImageView imageView = (ImageView) this.f14194g.findViewById(R.id.preview);
            this.f14196n = imageView;
            imageView.getLayoutParams().width = LargeIconHomeCardViewHolder.this.f14189h;
            this.f14196n.getLayoutParams().height = LargeIconHomeCardViewHolder.this.f14189h;
            C6077k.wvg(this.f14194g, this.f14196n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(int i2, UIProduct uIProduct, View view) {
            Pair<ArrayList<C0005q<String, String>>, Integer> pairX2 = y9n.x2(i2, ((LargeIconHomeCardElement) ((BaseThemeAdapter.ViewHolder) LargeIconHomeCardViewHolder.this).f9849q).getProducts());
            LargeIconHomeCardViewHolder.this.ki().startActivity(com.android.thememanager.toq.t8r(LargeIconHomeCardViewHolder.this.ki(), LargeIconHomeCardViewHolder.this.ni7(), (ArrayList) pairX2.first, ((Integer) pairX2.second).intValue(), uIProduct.imageUrl, Boolean.FALSE, uIProduct.productType));
            LargeIconHomeCardViewHolder.this.hb(uIProduct.trackId, uIProduct.uuid, "more");
        }

        public void ni7(final UIProduct product, int cornerRadius, final int position) {
            if (product == null) {
                return;
            }
            this.f14195k.setText(product.name);
            this.f14197q.setText(C1815m.toq(LargeIconHomeCardViewHolder.this.ki(), product.currentPriceInCent));
            com.android.thememanager.basemodule.imageloader.x2.m6782y(LargeIconHomeCardViewHolder.this.ki(), product.imageUrl, this.f14196n, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), cornerRadius)).jk(0));
            C1812k.toq(this.f14196n, product.name);
            this.f14196n.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.t8r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14401k.fn3e(position, product, view);
                }
            });
        }
    }

    private class zy extends RecyclerView.AbstractC1060y<toq> {

        /* JADX INFO: renamed from: k */
        private List<UIProduct> f14199k = new ArrayList();

        /* JADX INFO: renamed from: q */
        private int f14201q;

        public zy() {
            this.f14201q = LargeIconHomeCardViewHolder.this.ki().getResources().getDimensionPixelOffset(R.dimen.large_icon_item_default_radius);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@InterfaceC7396q @lvui toq holder, int position) {
            holder.ni7(this.f14199k.get(position), this.f14201q, position);
        }

        public void fn3e(List<UIProduct> dataList) {
            if (y9n.mcp(dataList)) {
                return;
            }
            this.f14199k = dataList;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f14199k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @InterfaceC7396q
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public toq onCreateViewHolder(@InterfaceC7396q @lvui ViewGroup parent, int viewType) {
            LargeIconHomeCardViewHolder largeIconHomeCardViewHolder = LargeIconHomeCardViewHolder.this;
            return largeIconHomeCardViewHolder.new toq(LayoutInflater.from(largeIconHomeCardViewHolder.fn3e()).inflate(R.layout.view_large_icon_card_item, parent, false));
        }
    }

    public LargeIconHomeCardViewHolder(@InterfaceC7396q @lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (adapter != null && adapter.d2ok() == 0) {
            x9kr();
        }
        uv6();
    }

    /* JADX INFO: renamed from: c */
    private RecyclerView.AbstractC1048h m8718c(boolean isSingleLine) {
        return new GridLayoutManager(fn3e(), isSingleLine ? 1 : 2, 0, false);
    }

    /* JADX INFO: renamed from: e */
    public static LargeIconHomeCardViewHolder m8719e(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new LargeIconHomeCardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_home_card, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hb(String trackId, String packageName, String extra) {
        String strKx3 = ni7() instanceof com.android.thememanager.basemodule.base.toq ? ((com.android.thememanager.basemodule.base.toq) ni7()).kx3() : null;
        ArrayMap arrayMap = new ArrayMap();
        if (!p029m.zy.toq(packageName)) {
            arrayMap.put("content", packageName);
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6650h(strKx3, trackId, null, extra, arrayMap));
    }

    private void uv6() {
        this.f14188g = (TextView) this.itemView.findViewById(R.id.large_icon_home_card_title);
        this.f14192y = (TextView) this.itemView.findViewById(R.id.more);
        this.f14191s = (RecyclerView) this.itemView.findViewById(R.id.large_icon_slide_recyclerview);
        this.f14189h = fn3e().getResources().getDimensionPixelSize(R.dimen.large_icon_home_slide_list_image_slide);
        this.f14191s.addItemDecoration(new C2419k(fn3e().getResources().getDimensionPixelSize(R.dimen.large_icon_home_slide_list_padding)));
        zy zyVar = new zy();
        this.f14190p = zyVar;
        this.f14191s.setAdapter(zyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vyq(LargeIconHomeCardElement largeIconHomeCardElement, View view) {
        UILink uILink = new UILink();
        uILink.type = "SUBJECT";
        uILink.productType = InterfaceC1789q.fd23;
        uILink.title = largeIconHomeCardElement.getTitle();
        uILink.link = largeIconHomeCardElement.getSubjectUuid();
        C2451n.toq toqVarM8797g = C2451n.m8797g();
        toqVarM8797g.toq(uILink.productType);
        toqVarM8797g.x2("largeicons");
        C2451n.m8803y(ki(), ni7(), uILink, toqVarM8797g);
        hb(largeIconHomeCardElement.getTrackId(), null, null);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: nn86, reason: merged with bridge method [inline-methods] */
    public void o1t(final LargeIconHomeCardElement item, int position) {
        super.o1t(item, position);
        this.f14188g.setText(item.getTitle());
        this.f14192y.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.ki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14380k.vyq(item, view);
            }
        });
        this.f14191s.setLayoutManager(m8718c(f14186i.equals(item.getCardType())));
        this.f14190p.fn3e(item.getProducts());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        return Collections.singletonList(((LargeIconHomeCardElement) this.f9849q).getTrackId());
    }
}
