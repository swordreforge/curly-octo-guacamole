package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1801b;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchVideoWallpaperViewHolder extends BaseViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: g */
    private final C1801b f14044g;

    /* JADX INFO: renamed from: s */
    private List<toq> f14045s;

    /* JADX INFO: renamed from: y */
    private int f14046y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementSearchVideoWallpaperViewHolder$k */
    class ViewOnClickListenerC2400k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f14047k;

        ViewOnClickListenerC2400k(final UIProduct val$itemProduct) {
            this.f14047k = val$itemProduct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.n7h(ElementSearchVideoWallpaperViewHolder.this.ki(), ElementSearchVideoWallpaperViewHolder.this.ni7(), this.f14047k, true);
            ElementSearchVideoWallpaperViewHolder.this.m6706z().d8wk(this.f14047k.trackId, null);
        }
    }

    private class toq {

        /* JADX INFO: renamed from: g */
        private TextView f14049g;

        /* JADX INFO: renamed from: k */
        private View f14050k;

        /* JADX INFO: renamed from: n */
        private TextView f14051n;

        /* JADX INFO: renamed from: q */
        private TextView f14052q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ViewGroup f60709toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ImageView f60710zy;

        toq(View parent) {
            this.f14050k = parent;
            this.f60709toq = (ViewGroup) parent.findViewById(R.id.content);
            this.f60710zy = (ImageView) parent.findViewById(R.id.image);
            this.f14052q = (TextView) parent.findViewById(R.id.title);
            this.f14051n = (TextView) parent.findViewById(R.id.designer);
            this.f14049g = (TextView) parent.findViewById(R.id.category);
            C6077k.o1t(this.f14050k);
        }
    }

    public ElementSearchVideoWallpaperViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14045s = new ArrayList();
        this.f14046y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        this.f14044g = new C1801b(ki(), this.f14046y);
        this.f14045s.add(0, new toq(itemView.findViewById(R.id.item_0)));
        this.f14045s.add(1, new toq(itemView.findViewById(R.id.item_1)));
    }

    /* JADX INFO: renamed from: l */
    public static ElementSearchVideoWallpaperViewHolder m8663l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchVideoWallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_video_wallpaper_endless_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        int size = this.f14045s.size();
        int size2 = item.getProductList().size();
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f14045s.get(i2);
            if (i2 < size2) {
                toqVar.f14050k.setVisibility(0);
                UIProduct uIProduct = item.getProductList().get(i2);
                toqVar.f60709toq.setBackground(this.f14044g.m7003k());
                toqVar.f14052q.setText(uIProduct.name);
                toqVar.f14051n.setText(uIProduct.designerName);
                toqVar.f14049g.setText(R.string.live_wallpaper);
                boolean z2 = this.f14044g.toq((position * 2) + i2) && !TextUtils.isEmpty(uIProduct.gifUrl);
                com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), z2 ? uIProduct.gifUrl : uIProduct.imageUrl, toqVar.f60710zy, com.android.thememanager.basemodule.imageloader.x2.fn3e().n5r1(z2 ? uIProduct.imageUrl : null).gvn7(com.android.thememanager.basemodule.imageloader.x2.n7h(position)));
                toqVar.f14050k.setOnClickListener(new ViewOnClickListenerC2400k(uIProduct));
            } else {
                toqVar.f14050k.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        T t2 = this.f9849q;
        if (t2 == 0 || com.android.thememanager.basemodule.utils.kja0.qrj(((ThemeSearchElement) t2).getProductList())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((ThemeSearchElement) this.f9849q).getProductList().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }
}
