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
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.NormalSecondRingtoneElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.Decoration;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementDetailNormalRingtoneItemViewHolder extends BaseRingtoneElementViewHolder<NormalSecondRingtoneElement> implements com.android.thememanager.recommend.view.listview.toq {

    /* JADX INFO: renamed from: a */
    private TextView f13870a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private TextView f60694ab;

    /* JADX INFO: renamed from: b */
    private TextView f13871b;
    private boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ImageView f60695bo;

    /* JADX INFO: renamed from: d */
    private ImageView f13872d;

    /* JADX INFO: renamed from: u */
    private Button f13873u;

    /* JADX INFO: renamed from: v */
    private LottieAnimationView f13874v;

    /* JADX INFO: renamed from: w */
    private View f13875w;

    /* JADX INFO: renamed from: x */
    private TextView f13876x;

    public ElementDetailNormalRingtoneItemViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (C1807g.zurt()) {
            int dimensionPixelSize = ki().getResources().getDimensionPixelSize(R.dimen.itemview_horizontal_fold_online_ringtone);
            itemView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        this.f13871b = (TextView) itemView.findViewById(R.id.name);
        this.f13870a = (TextView) itemView.findViewById(R.id.ringtone_info);
        this.f13876x = (TextView) itemView.findViewById(R.id.ringtone_time);
        this.f13872d = (ImageView) itemView.findViewById(R.id.audio_loading);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) itemView.findViewById(R.id.audio_playing);
        this.f13874v = lottieAnimationView;
        lottieAnimationView.setAnimation(R.raw.ringtone_playing_icon);
        this.f13874v.setVisibility(8);
        this.f60695bo = (ImageView) itemView.findViewById(R.id.audio_more);
        this.f13873u = (Button) itemView.findViewById(R.id.ringtone_back_tone);
        this.f13875w = itemView.findViewById(R.id.divider);
        this.f13805s = adapter.m8551r();
        this.f60694ab = (TextView) itemView.findViewById(R.id.count);
        this.bb = C1819o.d2ok(fn3e());
        C6077k.ld6(itemView);
        C6077k.m22374s(this.f13873u, this.f60695bo);
    }

    /* JADX INFO: renamed from: d */
    public static ElementDetailNormalRingtoneItemViewHolder m8609d(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementDetailNormalRingtoneItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.rc_element_detail_normal_ringrone_item, R.layout.rc_element_detail_normal_ringrone_item_elder), parent, false), adapter);
    }

    private void qkj8(UIProduct product) {
        this.f13871b.setText(product.name);
        this.f13870a.setText(product.downloadCount);
        this.f13876x.setText(product.playtimeDisplay);
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
        vq(product.uuid);
        m8590u(this.f60695bo, this.f13873u, product, this.bb);
        com.android.thememanager.basemodule.imageloader.x2.zy(ki(), Integer.valueOf(C1819o.d2ok(fn3e()) ? R.drawable.loading_bg_night : R.drawable.loading_bg), this.f13872d);
        t8iq(this.itemView, this.f13872d, product);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m8610v() {
        this.f13874v.setVisibility(0);
        this.f13874v.m5877l(true);
        this.f13874v.hyr();
    }

    private void vq(String id) {
        if (this.f13799g.m8525p(id)) {
            this.f13799g.m8523k();
            this.f13872d.setVisibility(8);
            this.f13874v.post(new Runnable() { // from class: com.android.thememanager.recommend.view.listview.viewholder.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14414k.m8610v();
                }
            });
        } else if (Objects.equals(this.f13799g.m8524n(), id)) {
            this.f13874v.setVisibility(8);
            this.f13872d.setVisibility(0);
        } else {
            this.f13874v.setVisibility(8);
            this.f13872d.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: mu, reason: merged with bridge method [inline-methods] */
    public void o1t(NormalSecondRingtoneElement element, int position) {
        TextView textView;
        super.o1t(element, position);
        if (39 == element.getCardTypeOrdinal() && (textView = this.f60694ab) != null) {
            textView.setVisibility(0);
            this.f60694ab.setText(String.valueOf(position));
        }
        UIProduct product = element.getProduct();
        if (this.f13875w != null) {
            if (element.isShowDivider()) {
                this.f13875w.setVisibility(0);
            } else {
                this.f13875w.setVisibility(8);
            }
        }
        qkj8(product);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((NormalSecondRingtoneElement) this.f9849q).getProduct().trackId);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.toq
    /* JADX INFO: renamed from: y */
    public void mo8570y() {
        UIProduct product;
        T t2 = this.f9849q;
        if (t2 == 0 || (product = ((NormalSecondRingtoneElement) t2).getProduct()) == null) {
            return;
        }
        vq(product.uuid);
    }
}
