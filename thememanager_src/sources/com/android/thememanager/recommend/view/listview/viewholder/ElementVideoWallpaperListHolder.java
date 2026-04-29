package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1801b;
import com.android.thememanager.recommend.model.entity.element.TwoVideoWallpaperGroupElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementVideoWallpaperListHolder extends BaseViewHolder<TwoVideoWallpaperGroupElement> {

    /* JADX INFO: renamed from: g */
    private final C1801b f14092g;

    /* JADX INFO: renamed from: s */
    private List<toq> f14093s;

    /* JADX INFO: renamed from: y */
    private int f14094y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementVideoWallpaperListHolder$k */
    class ViewOnClickListenerC2408k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f14095k;

        ViewOnClickListenerC2408k(final UIProduct val$itemProduct) {
            this.f14095k = val$itemProduct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.n7h(ElementVideoWallpaperListHolder.this.ki(), ElementVideoWallpaperListHolder.this.ni7(), this.f14095k, true);
            ElementVideoWallpaperListHolder.this.m6706z().d8wk(this.f14095k.trackId, null);
        }
    }

    private class toq {

        /* JADX INFO: renamed from: g */
        private TextView f14097g;

        /* JADX INFO: renamed from: k */
        private View f14098k;

        /* JADX INFO: renamed from: n */
        private TextView f14099n;

        /* JADX INFO: renamed from: q */
        private TextView f14100q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ViewGroup f60713toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ImageView f60714zy;

        toq(View parent) {
            this.f14098k = parent;
            this.f60713toq = (ViewGroup) parent.findViewById(R.id.content);
            this.f60714zy = (ImageView) parent.findViewById(R.id.image);
            this.f14100q = (TextView) parent.findViewById(R.id.title);
            this.f14099n = (TextView) parent.findViewById(R.id.designer);
            this.f14097g = (TextView) parent.findViewById(R.id.category);
            C6077k.o1t(this.f14098k);
        }
    }

    public ElementVideoWallpaperListHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14093s = new ArrayList();
        this.f14094y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        this.f14092g = new C1801b(ki(), this.f14094y);
        this.f14093s.add(0, new toq(itemView.findViewById(R.id.item_0)));
        this.f14093s.add(1, new toq(itemView.findViewById(R.id.item_1)));
    }

    /* JADX INFO: renamed from: l */
    public static ElementVideoWallpaperListHolder m8689l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementVideoWallpaperListHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_video_wallpaper_endless_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(TwoVideoWallpaperGroupElement item, int position) {
        super.o1t(item, position);
        int size = this.f14093s.size();
        int size2 = item.getProducts().size();
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f14093s.get(i2);
            if (i2 < size2) {
                toqVar.f14098k.setVisibility(0);
                UIProduct uIProduct = item.getProducts().get(i2);
                toqVar.f60713toq.setBackground(this.f14092g.m7003k());
                toqVar.f14100q.setText(uIProduct.name);
                toqVar.f14099n.setText(uIProduct.designerName);
                toqVar.f14097g.setText(R.string.live_wallpaper);
                boolean z2 = this.f14092g.toq((position * 2) + i2) && !TextUtils.isEmpty(uIProduct.gifUrl);
                com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), z2 ? uIProduct.gifUrl : uIProduct.imageUrl, toqVar.f60714zy, com.android.thememanager.basemodule.imageloader.x2.fn3e().n5r1(z2 ? uIProduct.imageUrl : null).gvn7(com.android.thememanager.basemodule.imageloader.x2.n7h(position)));
                toqVar.f14098k.setOnClickListener(new ViewOnClickListenerC2408k(uIProduct));
            } else {
                toqVar.f14098k.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((TwoVideoWallpaperGroupElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }
}
