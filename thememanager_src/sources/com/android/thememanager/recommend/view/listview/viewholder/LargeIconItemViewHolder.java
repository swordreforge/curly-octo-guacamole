package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconItemViewHolder extends BaseViewHolder<com.android.thememanager.t8r> {

    /* JADX INFO: renamed from: g */
    private ImageView f14214g;

    /* JADX INFO: renamed from: h */
    private final int f14215h;

    /* JADX INFO: renamed from: p */
    private ViewGroup f14216p;

    /* JADX INFO: renamed from: s */
    private TextView f14217s;

    /* JADX INFO: renamed from: y */
    private TextView f14218y;

    public LargeIconItemViewHolder(View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14215h = ki().getResources().getDimensionPixelOffset(R.dimen.large_icon_item_default_radius);
        m8731l();
    }

    /* JADX INFO: renamed from: f */
    public static LargeIconItemViewHolder m8730f(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new LargeIconItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.view_large_icon_card_item, parent, false), adapter);
    }

    /* JADX INFO: renamed from: l */
    private void m8731l() {
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.image_container);
        this.f14216p = viewGroup;
        this.f14214g = (ImageView) viewGroup.findViewById(R.id.preview);
        int dimensionPixelOffset = (y9n.fn3e().x - (ki().getResources().getDimensionPixelOffset(R.dimen.large_icon_item_spacing) * 3)) / 2;
        this.f14214g.getLayoutParams().width = dimensionPixelOffset;
        this.f14214g.getLayoutParams().height = dimensionPixelOffset;
        this.f14218y = (TextView) this.itemView.findViewById(R.id.title);
        this.f14217s = (TextView) this.itemView.findViewById(R.id.price);
        C6077k.wvg(this.f14216p, this.f14214g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n5r1(int i2, UIProduct uIProduct, View view) {
        if (wvg() == null || y9n.mcp(wvg().ni7())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UIElement uIElement : wvg().ni7()) {
            if (uIElement instanceof com.android.thememanager.t8r) {
                arrayList.add(((com.android.thememanager.t8r) uIElement).f16222k);
            }
        }
        Pair<ArrayList<C0005q<String, String>>, Integer> pairX2 = y9n.x2(i2, arrayList);
        ki().startActivity(com.android.thememanager.toq.t8r(ki(), ni7(), (ArrayList) pairX2.first, ((Integer) pairX2.second).intValue(), uIProduct.imageUrl, Boolean.FALSE, uIProduct.productType));
        m6706z().d8wk(uIProduct.trackId, null);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(com.android.thememanager.t8r item, final int position) {
        super.o1t(item, position);
        final UIProduct uIProduct = item.f16222k;
        if (uIProduct == null) {
            return;
        }
        this.f14218y.setText(uIProduct.name);
        this.f14217s.setText(C1815m.toq(ki(), uIProduct.currentPriceInCent));
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), uIProduct.imageUrl, this.f14214g, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), this.f14215h)).jk(0));
        C1812k.toq(this.f14214g, uIProduct.name);
        this.f14214g.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.zurt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14427k.n5r1(position, uIProduct, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        T t2 = this.f9849q;
        if (t2 != 0 && ((com.android.thememanager.t8r) t2).m9538k() != null) {
            arrayList.add(((com.android.thememanager.t8r) this.f9849q).m9538k().trackId);
        }
        return arrayList;
    }
}
