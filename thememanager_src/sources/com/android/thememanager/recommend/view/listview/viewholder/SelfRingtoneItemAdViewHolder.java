package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import com.android.thememanager.recommend.model.entity.element.NormalRingtoneAdElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class SelfRingtoneItemAdViewHolder extends BaseAdViewHolder<NormalRingtoneAdElement> implements InterfaceC1694q, InterfaceC1852k {

    /* JADX INFO: renamed from: h */
    private View f14252h;

    /* JADX INFO: renamed from: i */
    private ImageView f14253i;

    /* JADX INFO: renamed from: p */
    private TextView f14254p;

    /* JADX INFO: renamed from: r */
    private int f14255r;

    /* JADX INFO: renamed from: s */
    private TextView f14256s;

    /* JADX INFO: renamed from: t */
    private View f14257t;

    /* JADX INFO: renamed from: z */
    private AdSubTextView f14258z;

    public SelfRingtoneItemAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14255r = -1;
        this.f14256s = (TextView) itemView.findViewById(R.id.name);
        this.f14254p = (TextView) itemView.findViewById(R.id.summary);
        this.f14252h = itemView.findViewById(R.id.ad_close_btn);
        this.f14253i = (ImageView) itemView.findViewById(R.id.download);
        this.f14258z = (AdSubTextView) itemView.findViewById(R.id.ad_sub_text);
        this.f14257t = itemView.findViewById(R.id.container);
        C1812k.toq(this.f14253i, "下载");
        C6077k.ld6(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m8750c(View view) {
        if (this.f13786g != null) {
            C1653q.m6524g(ki(), this.f13786g, true, new Map[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m8751f(View view) {
        if (this.f13786g != null) {
            C1653q.m6529q(ki(), this.f13786g, new Map[0]);
        }
    }

    private void n5r1() {
        View view = this.itemView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        this.itemView.setVisibility(8);
    }

    public static SelfRingtoneItemAdViewHolder uv6(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new SelfRingtoneItemAdViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_self_ringtone_ad_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        if (this.f13786g != null && AdDislikeManager.m6595g().f7l8(this.f13786g.tagId)) {
            n5r1();
        }
        C1653q.m6526k(this);
        C1653q.toq(this);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1852k
    /* JADX INFO: renamed from: q */
    public void mo6499q(String packageName, int state) {
        String str;
        AdInfo adInfo = this.f13786g;
        if (adInfo == null || (str = adInfo.packageName) == null || !p029m.zy.m24738k(packageName, str)) {
            return;
        }
        if (state == -8 || state == -2 || state == 5) {
            this.f14258z.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        AdInfo adInfo = this.f13786g;
        if (adInfo == null || !p029m.zy.m24738k(tagId, adInfo.tagId)) {
            return;
        }
        BaseThemeAdapter baseThemeAdapter = this.f9847k;
        if (baseThemeAdapter instanceof RecommendListViewAdapter ? ((RecommendListViewAdapter) baseThemeAdapter).nn86(this.f14255r) : false) {
            return;
        }
        n5r1();
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public void o1t(NormalRingtoneAdElement item, int position) {
        super.o1t(item, position);
        AdInfo adInfo = item.getAdInfo();
        this.f13786g = adInfo;
        this.f14255r = position;
        C1812k.toq(this.f14257t, C1653q.x2(adInfo));
        C1653q.m6530s(ki(), this.f13786g, this.f14252h, null, 0, this.f14256s, this.f14254p, null, new Map[0]);
        this.f14258z.m7278y(this.f13786g);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.fti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14365k.m8751f(view);
            }
        });
        ImageView imageView = this.f14253i;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.jp0y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14377k.m8750c(view);
                }
            });
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        C1653q.cdj(this);
        C1653q.ki(this);
    }
}
