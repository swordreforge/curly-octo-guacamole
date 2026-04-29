package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RingtoneSubjectListElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.widget.DanceBar;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRingtoneSubjectListViewHolder extends BaseRingtoneElementViewHolder<RingtoneSubjectListElement> {

    /* JADX INFO: renamed from: a */
    private View f14002a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Button f60701ab;
    private Button ac;
    private DanceBar ad;
    private View am;
    private TextView an;
    private DanceBar as;
    private TextView ax;
    private TextView az;

    /* JADX INFO: renamed from: b */
    private View f14003b;
    private TextView ba;
    private DanceBar bb;
    private View bg;
    private Button bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private TextView f60702bo;
    private View bp;
    private ImageView bq;
    private TextView bv;

    /* JADX INFO: renamed from: d */
    private TextView f14004d;
    private TextView id;
    private ImageView in;

    /* JADX INFO: renamed from: u */
    private View f14005u;

    /* JADX INFO: renamed from: v */
    private TextView f14006v;

    /* JADX INFO: renamed from: w */
    private ImageView f14007w;

    /* JADX INFO: renamed from: x */
    private View f14008x;

    public ElementRingtoneSubjectListViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14003b = itemView.findViewById(R.id.container);
        this.f14002a = itemView.findViewById(R.id.item1);
        this.f14008x = itemView.findViewById(R.id.item2);
        this.f14005u = itemView.findViewById(R.id.item3);
        this.f60702bo = (TextView) this.f14002a.findViewById(R.id.name);
        this.f14006v = (TextView) this.f14002a.findViewById(R.id.count);
        this.f14004d = (TextView) this.f14002a.findViewById(R.id.ringtone_info);
        this.bp = this.f14002a.findViewById(R.id.audio_loading);
        this.bb = (DanceBar) this.f14002a.findViewById(R.id.audio_playing);
        this.f14007w = (ImageView) this.f14002a.findViewById(R.id.audio_more);
        this.f60701ab = (Button) this.f14002a.findViewById(R.id.ringtone_back_tone);
        this.bv = (TextView) this.f14008x.findViewById(R.id.name);
        this.an = (TextView) this.f14008x.findViewById(R.id.count);
        this.id = (TextView) this.f14008x.findViewById(R.id.ringtone_info);
        this.bg = this.f14008x.findViewById(R.id.audio_loading);
        this.as = (DanceBar) this.f14008x.findViewById(R.id.audio_playing);
        this.in = (ImageView) this.f14008x.findViewById(R.id.audio_more);
        this.bl = (Button) this.f14008x.findViewById(R.id.ringtone_back_tone);
        this.az = (TextView) this.f14005u.findViewById(R.id.name);
        this.ba = (TextView) this.f14005u.findViewById(R.id.count);
        this.ax = (TextView) this.f14005u.findViewById(R.id.ringtone_info);
        this.am = this.f14005u.findViewById(R.id.audio_loading);
        this.ad = (DanceBar) this.f14005u.findViewById(R.id.audio_playing);
        this.bq = (ImageView) this.f14005u.findViewById(R.id.audio_more);
        this.ac = (Button) this.f14005u.findViewById(R.id.ringtone_back_tone);
        C6077k.m22377z(this.f14002a, this.f14008x, this.f14005u);
        C6077k.m22374s(this.f60701ab, this.f14007w, this.bl, this.in, this.ac, this.bq);
    }

    /* JADX INFO: renamed from: d */
    private void m8646d(String id, int position) {
        boolean zM8525p = this.f13799g.m8525p(id);
        if (position == 1) {
            if (zM8525p) {
                this.f13799g.m8523k();
                this.bp.setVisibility(8);
                this.bb.setDanceState(true);
                this.bb.setVisibility(0);
                return;
            }
            if (Objects.equals(this.f13799g.m8524n(), id)) {
                this.bb.setVisibility(8);
                this.bp.setVisibility(0);
                return;
            } else {
                this.bb.setVisibility(8);
                this.bp.setVisibility(8);
                return;
            }
        }
        if (position == 2) {
            if (zM8525p) {
                this.f13799g.m8523k();
                this.bg.setVisibility(8);
                this.as.setDanceState(true);
                this.as.setVisibility(0);
                return;
            }
            if (Objects.equals(this.f13799g.m8524n(), id)) {
                this.as.setVisibility(8);
                this.bg.setVisibility(0);
                return;
            } else {
                this.as.setVisibility(8);
                this.bg.setVisibility(8);
                return;
            }
        }
        if (position != 3) {
            return;
        }
        if (zM8525p) {
            this.f13799g.m8523k();
            this.am.setVisibility(8);
            this.ad.setDanceState(true);
            this.ad.setVisibility(0);
            return;
        }
        if (Objects.equals(this.f13799g.m8524n(), id)) {
            this.ad.setVisibility(8);
            this.am.setVisibility(0);
        } else {
            this.ad.setVisibility(8);
            this.am.setVisibility(8);
        }
    }

    public static ElementRingtoneSubjectListViewHolder xwq3(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRingtoneSubjectListViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_ringtone_subject_list, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((RingtoneSubjectListElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void o1t(RingtoneSubjectListElement element, int position) {
        super.o1t(element, position);
        com.android.thememanager.basemodule.imageloader.x2.m6779p(ki(), element.getBackImageUrl(), this.f14003b, com.android.thememanager.basemodule.imageloader.x2.cdj(position));
        UIProduct uIProduct = element.getProducts().get(0);
        this.f14006v.setText(String.valueOf(1));
        this.f60702bo.setText(uIProduct.name);
        StringBuilder sb = new StringBuilder();
        sb.append(uIProduct.downloadCount);
        sb.append(this.f13807y);
        sb.append(uIProduct.playtimeDisplay);
        String str = uIProduct.title;
        if (!TextUtils.isEmpty(str)) {
            sb.append(this.f13807y);
            sb.append(str);
        }
        this.f14004d.setText(sb.toString());
        m8646d(uIProduct.uuid, 1);
        m8590u(this.f14007w, this.f60701ab, uIProduct, true);
        t8iq(this.f14002a, this.bp, uIProduct);
        UIProduct uIProduct2 = element.getProducts().get(1);
        this.an.setText(String.valueOf(2));
        this.bv.setText(uIProduct2.name);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uIProduct2.downloadCount);
        sb2.append(this.f13807y);
        sb2.append(uIProduct2.playtimeDisplay);
        String str2 = uIProduct2.title;
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(this.f13807y);
            sb2.append(str2);
        }
        this.id.setText(sb2.toString());
        m8646d(uIProduct2.uuid, 2);
        m8590u(this.in, this.bl, uIProduct2, true);
        t8iq(this.f14008x, this.bg, uIProduct2);
        UIProduct uIProduct3 = element.getProducts().get(2);
        this.ba.setText(String.valueOf(3));
        this.az.setText(uIProduct3.name);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(uIProduct3.downloadCount);
        sb3.append(this.f13807y);
        sb3.append(uIProduct3.playtimeDisplay);
        String str3 = uIProduct3.title;
        if (!TextUtils.isEmpty(str3)) {
            sb3.append(this.f13807y);
            sb3.append(str3);
        }
        this.ax.setText(sb3.toString());
        m8646d(uIProduct3.uuid, 3);
        m8590u(this.bq, this.ac, uIProduct3, true);
        t8iq(this.f14005u, this.am, uIProduct3);
    }
}
