package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.Decoration;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchRingtoneViewHolder extends BaseRingtoneElementViewHolder<ThemeSearchElement> {

    /* JADX INFO: renamed from: a */
    private TextView f14030a;

    /* JADX INFO: renamed from: b */
    private TextView f14031b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ImageView f60707bo;

    /* JADX INFO: renamed from: d */
    private ImageView f14032d;

    /* JADX INFO: renamed from: u */
    private Button f14033u;

    /* JADX INFO: renamed from: v */
    private LottieAnimationView f14034v;

    /* JADX INFO: renamed from: w */
    private boolean f14035w;

    /* JADX INFO: renamed from: x */
    private TextView f14036x;

    public ElementSearchRingtoneViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14031b = (TextView) itemView.findViewById(R.id.name);
        this.f14030a = (TextView) itemView.findViewById(R.id.ringtone_info);
        this.f14036x = (TextView) itemView.findViewById(R.id.ringtone_time);
        this.f14032d = (ImageView) itemView.findViewById(R.id.audio_loading);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) itemView.findViewById(R.id.audio_playing);
        this.f14034v = lottieAnimationView;
        lottieAnimationView.setAnimation(R.raw.ringtone_playing_icon);
        this.f14034v.setVisibility(8);
        this.f60707bo = (ImageView) itemView.findViewById(R.id.audio_more);
        this.f14033u = (Button) itemView.findViewById(R.id.ringtone_back_tone);
        this.f14035w = C1819o.d2ok(fn3e());
        C6077k.ld6(itemView);
        C6077k.m22374s(this.f60707bo, this.f14033u);
    }

    /* JADX INFO: renamed from: d */
    private void m8659d(String id) {
        if (this.f13799g.m8525p(id)) {
            this.f13799g.m8523k();
            this.f14032d.setVisibility(8);
            this.f14034v.setVisibility(0);
            this.f14034v.m5877l(true);
            this.f14034v.hyr();
            return;
        }
        if (Objects.equals(this.f13799g.m8524n(), id)) {
            this.f14034v.setVisibility(8);
            this.f14032d.setVisibility(0);
        } else {
            this.f14034v.setVisibility(8);
            this.f14032d.setVisibility(8);
        }
    }

    private void mu(UIProduct product) {
        this.f14031b.setText(product.name);
        this.f14030a.setText(product.downloadCount);
        this.f14036x.setText(product.playtimeDisplay);
        List<Decoration> list = product.decorations;
        if ((list == null || list.isEmpty()) && TextUtils.isEmpty(product.colorRingId)) {
            View viewFindViewById = this.itemView.findViewById(R.id.tag_group);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        } else if (!TextUtils.isEmpty(product.colorRingId)) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.tag_group_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.tag_group);
            viewGroup.setVisibility(0);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            if (TextUtils.isEmpty(product.colorRingId)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setBackgroundResource(R.drawable.resource_ringtone_tag_bg_ring);
                textView.setTextColor(ki().getResources().getColor(R.color.ring_white));
                textView.setText(R.string.item_resource_audio_optional_color_ring);
            }
        }
        m8659d(product.uuid);
        m8590u(this.f60707bo, this.f14033u, product, this.f14035w);
        com.android.thememanager.basemodule.imageloader.x2.zy(ki(), Integer.valueOf(C1819o.d2ok(fn3e()) ? R.drawable.loading_bg_night : R.drawable.loading_bg), this.f14032d);
        t8iq(this.itemView, this.f14032d, product);
    }

    public static ElementSearchRingtoneViewHolder xwq3(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchRingtoneViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_detail_normal_ringrone_item, parent, false), adapter);
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

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void o1t(ThemeSearchElement item, int position) {
        super.o1t(item, position);
        if (item.getProductList() == null || item.getProductList().size() == 0) {
            return;
        }
        mu(item.getProductList().get(0));
    }
}
