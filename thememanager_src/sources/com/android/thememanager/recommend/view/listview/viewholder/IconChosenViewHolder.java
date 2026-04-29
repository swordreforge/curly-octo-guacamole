package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.IconChosenElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IconChosenViewHolder extends BaseViewHolder<IconChosenElement> {

    /* JADX INFO: renamed from: g */
    private final int f14137g;

    /* JADX INFO: renamed from: h */
    private TextView f14138h;

    /* JADX INFO: renamed from: i */
    private List<UIProduct> f14139i;

    /* JADX INFO: renamed from: p */
    private TextView f14140p;

    /* JADX INFO: renamed from: s */
    private final int f14141s;

    /* JADX INFO: renamed from: y */
    private final int f14142y;

    /* JADX INFO: renamed from: z */
    private List<SubViewHolder> f14143z;

    private static class SubViewHolder extends BaseViewHolder<UIProduct> {

        /* JADX INFO: renamed from: g */
        private ImageView f14144g;

        /* JADX INFO: renamed from: h */
        private x2.C1735g f14145h;

        /* JADX INFO: renamed from: p */
        private TextView f14146p;

        /* JADX INFO: renamed from: s */
        private TextView f14147s;

        /* JADX INFO: renamed from: y */
        private SmoothFrameLayout2 f14148y;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.IconChosenViewHolder$SubViewHolder$k */
        class ViewOnClickListenerC2415k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIProduct f14149k;

            ViewOnClickListenerC2415k(final UIProduct val$product) {
                this.f14149k = val$product;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                ActivityC0891q activityC0891qKi = SubViewHolder.this.ki();
                Fragment fragmentNi7 = SubViewHolder.this.ni7();
                UIProduct uIProduct = this.f14149k;
                Intent intentKi = com.android.thememanager.toq.ki(activityC0891qKi, fragmentNi7, uIProduct.uuid, uIProduct.imageUrl, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
                if (SubViewHolder.this.ni7() != null) {
                    SubViewHolder.this.ni7().startActivityForResult(intentKi, 109);
                } else {
                    SubViewHolder.this.ki().startActivity(intentKi);
                }
                if (this.f14149k.link != null) {
                    SubViewHolder.this.m6706z().d8wk(this.f14149k.link.trackId, null);
                    return;
                }
                InterfaceC1719p interfaceC1719pM6706z = SubViewHolder.this.m6706z();
                UIProduct uIProduct2 = this.f14149k;
                interfaceC1719pM6706z.d8wk(uIProduct2.trackId, uIProduct2.name);
            }
        }

        public SubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14144g = (ImageView) itemView.findViewById(R.id.image);
            this.f14148y = (SmoothFrameLayout2) itemView.findViewById(R.id.image_container);
            this.f14147s = (TextView) itemView.findViewById(R.id.title);
            this.f14146p = (TextView) itemView.findViewById(R.id.price);
            this.f14145h = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(com.android.thememanager.basemodule.imageloader.x2.x2(), 0.0f, wvg().ncyb()));
            C6077k.o1t(this.f14148y);
        }

        /* JADX INFO: renamed from: f */
        private void m8711f(TextView textView, UIProduct item, boolean isShowPrice) {
            if (!isShowPrice) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(C1815m.toq(fn3e(), item.currentPriceInCent));
            }
        }

        public void n5r1(final UIProduct product, int position, boolean isShowPrice) {
            if (product == null) {
                this.itemView.setVisibility(8);
                return;
            }
            super.o1t(product, position);
            this.itemView.setVisibility(0);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), product.imageUrl, this.f14144g, this.f14145h);
            this.f14148y.setOnClickListener(new ViewOnClickListenerC2415k(product));
            this.f14147s.setText(product.name);
            m8711f(this.f14146p, product, isShowPrice);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.IconChosenViewHolder$k */
    class ViewOnClickListenerC2416k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IconChosenElement f14151k;

        ViewOnClickListenerC2416k(final IconChosenElement val$item) {
            this.f14151k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (this.f14151k.getLink() != null) {
                C2451n.toq qVar = C2451n.m8797g().toq(this.f14151k.getLink().productType);
                qVar.x2(IconChosenViewHolder.this.wvg().lvui());
                qVar.m8804g(IconChosenViewHolder.this.wvg().m8549l());
                qVar.f7l8(IconChosenViewHolder.this.wvg().n5r1());
                qVar.m8806n(true);
                C2451n.m8803y(IconChosenViewHolder.this.ki(), IconChosenViewHolder.this.ni7(), this.f14151k.getLink(), qVar);
                IconChosenViewHolder.this.m6706z().d8wk(this.f14151k.getLink().trackId, "more");
            }
        }
    }

    public IconChosenViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14139i = new ArrayList();
        this.f14143z = new ArrayList();
        Resources resources = ki().getResources();
        this.f14138h = (TextView) itemView.findViewById(R.id.icon_list_count);
        this.f14140p = (TextView) itemView.findViewById(R.id.icon_list_title);
        this.f14143z.add(new SubViewHolder(itemView.findViewById(R.id.thumbnail_0), wvg()));
        this.f14143z.add(new SubViewHolder(itemView.findViewById(R.id.thumbnail_1), wvg()));
        this.f14137g = resources.getDimensionPixelOffset(R.dimen.rc_icon_chosen_first_top_padding);
        this.f14142y = resources.getDimensionPixelOffset(R.dimen.rc_icon_chosen_bottom_padding);
        this.f14141s = resources.getDimensionPixelOffset(R.dimen.rc_icon_chosen_last_bottom_padding);
    }

    /* JADX INFO: renamed from: l */
    public static IconChosenViewHolder m8710l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new IconChosenViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_chosen_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(IconChosenElement item, int position) {
        super.o1t(item, position);
        this.f14140p.setText(item.getTitle());
        this.f14138h.setText(String.valueOf(item.getTotalCount()));
        this.f14139i = item.getProducts();
        if (item.getTotalCount() > this.f14139i.size()) {
            TextView textView = this.f14138h;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, textView.getResources().getDrawable(R.drawable.rc_icon_chosen_more_arrow), (Drawable) null);
            this.f14138h.setOnClickListener(new ViewOnClickListenerC2416k(item));
        } else {
            if (item.getTotalCount() == 0) {
                this.f14138h.setVisibility(4);
            }
            this.f14138h.setCompoundDrawablePadding(0);
            this.f14138h.setCompoundDrawablesRelative(null, null, null, null);
            this.f14138h.setOnClickListener(null);
        }
        for (int i2 = 0; i2 < this.f14143z.size(); i2++) {
            SubViewHolder subViewHolder = this.f14143z.get(i2);
            if (i2 < this.f14139i.size()) {
                subViewHolder.n5r1(this.f14139i.get(i2), i2, item.isShowPrice());
            } else {
                subViewHolder.n5r1(null, i2, item.isShowPrice());
            }
        }
        this.itemView.setPadding(0, item.isFirstCard() ? this.f14137g : 0, 0, (item.isLastCard() || item.isHasMoreOtherCard()) ? this.f14141s : this.f14142y);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f14139i.size(); i2++) {
            arrayList.add(this.f14139i.get(i2).trackId);
        }
        return arrayList;
    }
}
