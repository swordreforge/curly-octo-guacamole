package com.android.thememanager.recommend.view.listview.viewholder;

import android.graphics.Typeface;
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
import com.android.thememanager.recommend.model.entity.element.NormalRingtoneElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.Decoration;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementNormalRingtoneItemViewHolder extends BaseRingtoneElementViewHolder<NormalRingtoneElement> implements com.android.thememanager.recommend.view.listview.toq {

    /* JADX INFO: renamed from: a */
    private TextView f13930a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private View f60698ab;

    /* JADX INFO: renamed from: b */
    private TextView f13931b;
    private TextView bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ImageView f60699bo;
    private boolean bp;

    /* JADX INFO: renamed from: d */
    private View f13932d;

    /* JADX INFO: renamed from: u */
    private Button f13933u;

    /* JADX INFO: renamed from: v */
    private LottieAnimationView f13934v;

    /* JADX INFO: renamed from: w */
    private ImageView f13935w;

    /* JADX INFO: renamed from: x */
    private TextView f13936x;

    public ElementNormalRingtoneItemViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13931b = (TextView) itemView.findViewById(R.id.name);
        this.f13932d = itemView.findViewById(R.id.container);
        this.f13930a = (TextView) itemView.findViewById(R.id.ringtone_info);
        this.f13936x = (TextView) itemView.findViewById(R.id.ringtone_time);
        this.f13935w = (ImageView) itemView.findViewById(R.id.audio_loading);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) itemView.findViewById(R.id.audio_playing);
        this.f13934v = lottieAnimationView;
        lottieAnimationView.setAnimation(R.raw.ringtone_playing_icon);
        this.f13934v.setVisibility(8);
        this.f60699bo = (ImageView) itemView.findViewById(R.id.audio_more);
        Button button = (Button) itemView.findViewById(R.id.ringtone_back_tone);
        this.f13933u = button;
        if (button != null) {
            float f2 = ki().getResources().getConfiguration().fontScale;
            float f3 = ((double) f2) <= 1.0d ? f2 : 1.0f;
            Button button2 = this.f13933u;
            button2.setTextSize(0, (button2.getTextSize() / f2) * f3);
        }
        this.f60698ab = itemView.findViewById(R.id.divider);
        this.bb = (TextView) itemView.findViewById(R.id.count);
        this.bp = C1819o.d2ok(fn3e());
        this.f13805s = adapter.m8551r();
        C6077k.ld6(itemView);
        C6077k.m22374s(this.f13933u, this.f60699bo);
    }

    /* JADX INFO: renamed from: d */
    private int m8623d(String name) {
        switch (name.hashCode() % 8) {
            case 1:
                return R.color.ringtone_tag_color1;
            case 2:
                return R.color.ringtone_tag_color2;
            case 3:
                return R.color.ringtone_tag_color3;
            case 4:
                return R.color.ringtone_tag_color4;
            case 5:
                return R.color.ringtone_tag_color5;
            case 6:
                return R.color.ringtone_tag_color6;
            case 7:
                return R.color.ringtone_tag_color7;
            default:
                return R.color.ringtone_tag_color8;
        }
    }

    private void fnq8(String id) {
        if (this.f13799g.m8525p(id)) {
            this.f13799g.m8523k();
            this.f13935w.setVisibility(8);
            this.f13934v.post(new Runnable() { // from class: com.android.thememanager.recommend.view.listview.viewholder.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14397k.mu();
                }
            });
        } else if (Objects.equals(this.f13799g.m8524n(), id)) {
            this.f13934v.setVisibility(8);
            this.f13935w.setVisibility(0);
        } else {
            this.f13934v.setVisibility(8);
            this.f13935w.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mu() {
        this.f13934v.setVisibility(0);
        this.f13934v.m5877l(true);
        this.f13934v.hyr();
    }

    private void qo(UIProduct product) {
        this.f13931b.setText(product.name);
        this.f13930a.setText(product.downloadCount);
        this.f13936x.setText(product.playtimeDisplay);
        List<Decoration> listSubList = product.decorations;
        if ((listSubList == null || listSubList.isEmpty()) && TextUtils.isEmpty(product.colorRingId)) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = fn3e().getResources().getDimensionPixelOffset(R.dimen.recommend_ringtone_container) - fn3e().getResources().getDimensionPixelOffset(R.dimen.recommend_ringtone_tag_height);
            this.itemView.setLayoutParams(layoutParams);
            View viewFindViewById = this.itemView.findViewById(R.id.tag_group);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        } else {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.tag_group_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.tag_group);
            viewGroup.setVisibility(0);
            int size = listSubList == null ? 0 : listSubList.size();
            if (size > 3) {
                listSubList = listSubList.subList(0, 3);
                size = 3;
            }
            if (TextUtils.isEmpty(product.colorRingId)) {
                tfm(listSubList, viewGroup, size, 0);
            } else {
                TextView textView = (TextView) viewGroup.getChildAt(0);
                if (TextUtils.isEmpty(product.colorRingId)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setBackgroundResource(R.drawable.resource_ringtone_tag_bg_ring);
                    textView.setTextColor(ki().getResources().getColor(R.color.ring_white));
                    textView.setText(R.string.item_resource_audio_optional_color_ring);
                    if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
                        textView.setTypeface(Typeface.create("mipro-demibold", 0));
                    }
                }
                tfm(listSubList, viewGroup, size, 1);
            }
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            layoutParams2.height = -2;
            this.itemView.setLayoutParams(layoutParams2);
        }
        fnq8(product.uuid);
        m8590u(this.f60699bo, this.f13933u, product, this.bp);
        com.android.thememanager.basemodule.imageloader.x2.zy(ki(), Integer.valueOf(C1819o.d2ok(fn3e()) ? R.drawable.loading_bg_night : R.drawable.loading_bg), this.f13935w);
        t8iq(this.itemView, this.f13935w, product);
    }

    private void tfm(List<Decoration> decorations, ViewGroup mTagGroup, int count, int position) {
        for (int i2 = 0; i2 < count; i2++) {
            TextView textView = (TextView) mTagGroup.getChildAt(position == 0 ? i2 : i2 + 1);
            if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
                textView.setTypeface(Typeface.create("mipro-demibold", 0));
            }
            Decoration decoration = decorations.get(i2);
            textView.setBackgroundResource(m8624v(decoration.word));
            textView.setText(decoration.word);
            textView.setTextColor(ki().getResources().getColor(m8623d(decoration.word)));
            textView.setVisibility(0);
        }
        for (int i3 = count + position; i3 < mTagGroup.getChildCount(); i3++) {
            ((TextView) mTagGroup.getChildAt(i3)).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v */
    private int m8624v(String name) {
        switch (name.hashCode() % 8) {
            case 1:
                return R.drawable.resource_ringtone_tag_bg1;
            case 2:
                return R.drawable.resource_ringtone_tag_bg2;
            case 3:
                return R.drawable.resource_ringtone_tag_bg3;
            case 4:
                return R.drawable.resource_ringtone_tag_bg4;
            case 5:
                return R.drawable.resource_ringtone_tag_bg5;
            case 6:
                return R.drawable.resource_ringtone_tag_bg6;
            case 7:
                return R.drawable.resource_ringtone_tag_bg7;
            default:
                return R.drawable.resource_ringtone_tag_bg8;
        }
    }

    public static ElementNormalRingtoneItemViewHolder vq(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementNormalRingtoneItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_normal_ringrone_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: qkj8, reason: merged with bridge method [inline-methods] */
    public void o1t(NormalRingtoneElement element, int position) {
        TextView textView;
        super.o1t(element, position);
        this.f13804r = element.getExpLayer();
        this.f13802l = element.getEids();
        this.f13798f = element.getCardId();
        if (39 == element.getCardTypeOrdinal() && (textView = this.bb) != null) {
            textView.setVisibility(0);
            this.bb.setText(String.valueOf(position));
        }
        UIProduct product = element.getProduct();
        if (this.f60698ab != null) {
            if (element.isShowDivider()) {
                this.f60698ab.setVisibility(0);
            } else {
                this.f60698ab.setVisibility(8);
            }
        }
        qo(product);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((NormalRingtoneElement) this.f9849q).getProduct().trackId);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.toq
    /* JADX INFO: renamed from: y */
    public void mo8570y() {
        UIProduct product;
        T t2 = this.f9849q;
        if (t2 == 0 || (product = ((NormalRingtoneElement) t2).getProduct()) == null) {
            return;
        }
        fnq8(product.uuid);
    }
}
