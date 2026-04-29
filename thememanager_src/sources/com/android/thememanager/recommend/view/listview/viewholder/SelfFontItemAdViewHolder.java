package com.android.thememanager.recommend.view.listview.viewholder;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.resource.C1796y;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import com.android.thememanager.recommend.model.entity.element.NormalFontAdElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.io.File;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class SelfFontItemAdViewHolder extends BaseAdViewHolder<NormalFontAdElement> implements InterfaceC1694q, InterfaceC1852k {

    /* JADX INFO: renamed from: h */
    private View f14245h;

    /* JADX INFO: renamed from: i */
    private ImageView f14246i;

    /* JADX INFO: renamed from: p */
    private TextView f14247p;

    /* JADX INFO: renamed from: r */
    private String f14248r;

    /* JADX INFO: renamed from: s */
    private TextView f14249s;

    /* JADX INFO: renamed from: t */
    private View f14250t;

    /* JADX INFO: renamed from: z */
    private AdSubTextView f14251z;

    public SelfFontItemAdViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14249s = (TextView) itemView.findViewById(R.id.name);
        this.f14247p = (TextView) itemView.findViewById(R.id.summary);
        this.f14245h = itemView.findViewById(R.id.ad_close_btn);
        this.f14246i = (ImageView) itemView.findViewById(R.id.download);
        this.f14251z = (AdSubTextView) itemView.findViewById(R.id.ad_sub_text);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m8746c(View view) {
        if (this.f13786g != null) {
            C1653q.m6529q(ki(), this.f13786g, new Map[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m8747f() {
        View view = this.itemView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        this.itemView.setVisibility(8);
    }

    private void n5r1() {
        String str = C1724k.m6723p().ld6().font_file_hash;
        String qVar = C1796y.toq();
        if (p029m.zy.toq(qVar)) {
            return;
        }
        File file = new File(qVar + "/" + str);
        if (file.exists()) {
            this.f14249s.setTypeface(Typeface.createFromFile(file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uv6(View view) {
        if (this.f13786g != null) {
            C1653q.m6524g(ki(), this.f13786g, true, new Map[0]);
        }
    }

    public static SelfFontItemAdViewHolder vyq(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new SelfFontItemAdViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_self_font_ad_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void o1t(NormalFontAdElement item, int position) {
        super.o1t(item, position);
        this.f13786g = item.getAdInfo();
        this.f14248r = item.getAdEid();
        C1812k.toq(this.f14250t, C1653q.x2(this.f13786g));
        C1653q.m6530s(ki(), this.f13786g, this.f14245h, null, 0, this.f14249s, this.f14247p, null, new Map[0]);
        this.f14251z.m7278y(this.f13786g);
        if (p029m.zy.m24738k(this.f14248r, AdUtils.f9438g)) {
            n5r1();
        } else {
            View view = this.f14245h;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageResource(R.drawable.recommend_ad_close_blue);
            }
            this.f14249s.setTextSize(0, fn3e().getResources().getDimensionPixelSize(R.dimen.recommend_font_ad_title_text_size_testA));
        }
        C1812k.m7106k(this.f14245h, R.string.close);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.jk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14376k.m8746c(view2);
            }
        });
        ImageView imageView = this.f14246i;
        if (imageView != null) {
            C1812k.m7106k(imageView, R.string.ad_download_download);
            this.f14246i.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.a9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14355k.uv6(view2);
                }
            });
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        if (this.f13786g != null && AdDislikeManager.m6595g().f7l8(this.f13786g.tagId)) {
            m8747f();
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
            this.f14251z.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        AdInfo adInfo = this.f13786g;
        if (adInfo == null || !p029m.zy.m24738k(tagId, adInfo.tagId)) {
            return;
        }
        m8747f();
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        C1653q.cdj(this);
        C1653q.ki(this);
    }
}
