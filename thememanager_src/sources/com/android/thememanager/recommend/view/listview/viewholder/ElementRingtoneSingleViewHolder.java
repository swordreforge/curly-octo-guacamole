package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RingtoneSingleElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.widget.DanceBar;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRingtoneSingleViewHolder extends BaseRingtoneElementViewHolder<RingtoneSingleElement> {

    /* JADX INFO: renamed from: a */
    private TextView f13996a;

    /* JADX INFO: renamed from: b */
    private View f13997b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private Button f60700bo;

    /* JADX INFO: renamed from: d */
    private View f13998d;

    /* JADX INFO: renamed from: u */
    private ImageView f13999u;

    /* JADX INFO: renamed from: v */
    private DanceBar f14000v;

    /* JADX INFO: renamed from: x */
    private TextView f14001x;

    public ElementRingtoneSingleViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13997b = itemView.findViewById(R.id.container);
        this.f13996a = (TextView) itemView.findViewById(R.id.name);
        this.f14001x = (TextView) itemView.findViewById(R.id.ringtone_info);
        this.f13998d = itemView.findViewById(R.id.audio_loading);
        this.f14000v = (DanceBar) itemView.findViewById(R.id.audio_playing);
        this.f13999u = (ImageView) itemView.findViewById(R.id.audio_more);
        this.f60700bo = (Button) itemView.findViewById(R.id.ringtone_back_tone);
        C6077k.m22369i(itemView);
        C6077k.m22374s(this.f60700bo, this.f13999u);
    }

    /* JADX INFO: renamed from: d */
    private void m8644d(String id) {
        if (this.f13799g.m8525p(id)) {
            this.f13799g.m8523k();
            this.f13998d.setVisibility(8);
            this.f14000v.setDanceState(true);
            this.f14000v.setVisibility(0);
            return;
        }
        if (Objects.equals(this.f13799g.m8524n(), id)) {
            this.f14000v.setVisibility(8);
            this.f13998d.setVisibility(0);
        } else {
            this.f14000v.setVisibility(8);
            this.f13998d.setVisibility(8);
        }
    }

    public static ElementRingtoneSingleViewHolder xwq3(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRingtoneSingleViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_ringtone_single, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((RingtoneSingleElement) this.f9849q).getProducts().get(0).trackId);
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void o1t(RingtoneSingleElement element, int position) {
        super.o1t(element, position);
        com.android.thememanager.basemodule.imageloader.x2.m6779p(ki(), element.getBackImageUrl(), this.f13997b, com.android.thememanager.basemodule.imageloader.x2.cdj(position));
        UIProduct uIProduct = element.getProducts().get(0);
        this.f13996a.setText(uIProduct.name);
        StringBuilder sb = new StringBuilder();
        sb.append(uIProduct.downloadCount);
        sb.append(this.f13807y);
        sb.append(uIProduct.playtimeDisplay);
        String str = uIProduct.title;
        if (!TextUtils.isEmpty(str)) {
            sb.append(this.f13807y);
            sb.append(str);
        }
        this.f14001x.setText(sb.toString());
        m8644d(uIProduct.uuid);
        m8590u(this.f13999u, this.f60700bo, uIProduct, true);
        t8iq(this.itemView, this.f13998d, uIProduct);
    }
}
