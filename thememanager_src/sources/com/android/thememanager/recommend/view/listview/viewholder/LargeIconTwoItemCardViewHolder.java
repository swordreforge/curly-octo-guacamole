package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.app.Activity;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.nmn5;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.BaseVMAdapter;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.model.LargeIconSplitResource;
import com.android.thememanager.recommend.model.entity.element.LargeIconAllTwoCardElement;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconTwoItemCardViewHolder extends BaseVMViewHolder<LargeIconAllTwoCardElement> {

    /* JADX INFO: renamed from: h */
    private static final int f14219h = 2;

    /* JADX INFO: renamed from: g */
    private int f14220g;

    /* JADX INFO: renamed from: p */
    private final Integer[] f14221p;

    /* JADX INFO: renamed from: s */
    private int f14222s;

    /* JADX INFO: renamed from: y */
    private List<C2421k> f14223y;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.LargeIconTwoItemCardViewHolder$k */
    class C2421k {

        /* JADX INFO: renamed from: k */
        private final View f14225k;

        /* JADX INFO: renamed from: n */
        private final ViewGroup f14226n;

        /* JADX INFO: renamed from: q */
        private final TextView f14227q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final ImageView f60722toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final TextView f60723zy;

        public C2421k(View parent) {
            this.f14225k = parent;
            parent.getLayoutParams().width = LargeIconTwoItemCardViewHolder.this.f14222s;
            ViewGroup viewGroup = (ViewGroup) parent.findViewById(R.id.image_container);
            this.f14226n = viewGroup;
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.preview);
            this.f60722toq = imageView;
            imageView.getLayoutParams().height = LargeIconTwoItemCardViewHolder.this.f14222s;
            imageView.getLayoutParams().width = LargeIconTwoItemCardViewHolder.this.f14222s;
            C6077k.wvg(viewGroup, imageView);
            this.f60723zy = (TextView) parent.findViewById(R.id.title);
            this.f14227q = (TextView) parent.findViewById(R.id.price);
        }

        /* JADX INFO: renamed from: n */
        private void m8735n(UIProduct uiProduct) {
            LargeIconSplitResource largeIconSplitResourceTww7 = LargeIconTwoItemCardViewHolder.this.ni7() instanceof nmn5 ? ((nmn5) LargeIconTwoItemCardViewHolder.this.ni7()).tww7() : null;
            if (largeIconSplitResourceTww7 == null) {
                return;
            }
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(com.android.thememanager.basemodule.analysis.toq.tkle, largeIconSplitResourceTww7.getTitle());
            arrayMap.put("content", uiProduct.uuid);
            C1708s.f7l8().ld6().ni7(C1706p.m6650h(largeIconSplitResourceTww7.getLink(), uiProduct.trackId, null, null, arrayMap));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zy(int i2, UIProduct uIProduct, View view) {
            Pair<ArrayList<C0005q<String, String>>, Integer> pairX2 = y9n.x2(((((LargeIconAllTwoCardElement) ((BaseVMAdapter.ViewHolder) LargeIconTwoItemCardViewHolder.this).f9854q).row - 1) * 2) + i2, ((LargeIconAllTwoCardElement) ((BaseVMAdapter.ViewHolder) LargeIconTwoItemCardViewHolder.this).f9854q).uiProducts);
            LargeIconTwoItemCardViewHolder.this.itemView.getContext().startActivity(com.android.thememanager.toq.t8r(LargeIconTwoItemCardViewHolder.this.ki(), LargeIconTwoItemCardViewHolder.this.ni7(), (ArrayList) pairX2.first, ((Integer) pairX2.second).intValue(), uIProduct.imageUrl, Boolean.FALSE, uIProduct.productType));
            m8735n(uIProduct);
        }

        /* JADX INFO: renamed from: q */
        public void m8736q(final UIProduct data, final int position) {
            if (data == null) {
                return;
            }
            this.f14225k.setVisibility(0);
            C1812k.toq(this.f60722toq, data.name);
            this.f60723zy.setText(data.name);
            this.f14227q.setText(C1815m.toq(LargeIconTwoItemCardViewHolder.this.itemView.getContext(), data.currentPriceInCent));
            com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) LargeIconTwoItemCardViewHolder.this.itemView.getContext(), data.imageUrl, this.f60722toq, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), LargeIconTwoItemCardViewHolder.this.f14220g)).jk(0));
            this.f60722toq.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14398k.zy(position, data, view);
                }
            });
        }

        public void toq() {
            View view = this.f14225k;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public LargeIconTwoItemCardViewHolder(@InterfaceC7396q @lvui View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14221p = new Integer[]{Integer.valueOf(R.id.item_0), Integer.valueOf(R.id.item_1)};
        this.f14222s = (adapter.jk() - (itemView.getContext().getResources().getDimensionPixelSize(R.dimen.large_icon_default_space) * 3)) / 2;
        this.f14223y = new ArrayList(2);
        m8733r();
    }

    public static LargeIconTwoItemCardViewHolder dd(ViewGroup parent, RecommendVMListViewAdapter adapter) {
        return new LargeIconTwoItemCardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_two_icon_card, parent, false), adapter);
    }

    /* JADX INFO: renamed from: r */
    private void m8733r() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f14223y.add(new C2421k(this.itemView.findViewById(this.f14221p[i2].intValue())));
        }
        this.f14220g = this.itemView.getResources().getDimensionPixelOffset(R.dimen.large_icon_item_default_radius);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseVMViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8594t() {
        T t2 = this.f9854q;
        if (t2 == 0 || y9n.mcp(((LargeIconAllTwoCardElement) t2).uiProducts)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        T t3 = this.f9854q;
        for (UIProduct uIProduct : ((LargeIconAllTwoCardElement) t3).uiProducts.subList(((LargeIconAllTwoCardElement) t3).useStart, ((LargeIconAllTwoCardElement) t3).useEnd)) {
            if (uIProduct != null) {
                arrayList.add(uIProduct.trackId);
            }
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder
    /* JADX INFO: renamed from: x9kr, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconAllTwoCardElement item, int position) {
        super.o1t(item, position);
        if (y9n.mcp(item.uiProducts)) {
            return;
        }
        List<UIProduct> listSubList = item.uiProducts.subList(item.useStart, item.useEnd);
        int iMin = Math.min(2, listSubList.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f14223y.get(i2).m8736q(listSubList.get(i2), i2);
        }
        while (iMin < this.f14223y.size()) {
            this.f14223y.get(iMin).toq();
            iMin++;
        }
    }
}
