package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.ConcentrationRecommendElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperRecommendConcentrationViewHolder extends BaseViewHolder<ConcentrationRecommendElement> implements View.OnClickListener, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private TextView f14321g;

    /* JADX INFO: renamed from: h */
    private NinePatchImageView f14322h;

    /* JADX INFO: renamed from: i */
    private List<NinePatchImageView> f14323i;

    /* JADX INFO: renamed from: p */
    private NinePatchImageView f14324p;

    /* JADX INFO: renamed from: r */
    private String f14325r;

    /* JADX INFO: renamed from: s */
    private TextView f14326s;

    /* JADX INFO: renamed from: t */
    private String f14327t;

    /* JADX INFO: renamed from: y */
    private TextView f14328y;

    /* JADX INFO: renamed from: z */
    private List<Resource> f14329z;

    public WallpaperRecommendConcentrationViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14323i = new ArrayList();
        this.f14329z = new ArrayList();
        x9kr();
        n5r1();
    }

    /* JADX INFO: renamed from: c */
    public static WallpaperRecommendConcentrationViewHolder m8772c(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new WallpaperRecommendConcentrationViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_recommend_concentration_view, parent, false), adapter);
    }

    /* JADX INFO: renamed from: e */
    private void m8773e(int position) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f14329z.size()) {
                break;
            }
            String onlineId = this.f14329z.get(i3).getOnlineId();
            if (!TextUtils.isEmpty(onlineId) && onlineId.equals(fu4().getProducts().get(position).uuid)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        Intent intentMcp = com.android.thememanager.toq.mcp(ki(), this.f14329z, com.android.thememanager.basemodule.analysis.toq.npjo);
        intentMcp.putExtra(InterfaceC1357q.f53879gvn7, i2);
        if (ni7() != null) {
            ni7().startActivityForResult(intentMcp, 109);
        } else {
            ki().startActivity(intentMcp);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m8774f() {
        return (fu4().getProducts() == null || fu4().getProducts().get(0) == null || !"VIDEO_WALLPAPER".equals(fu4().getProducts().get(0).link.productType)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    private void m8775l(int position) {
        if (position >= fu4().getProducts().size()) {
            return;
        }
        if (m8774f()) {
            C2451n.qrj(ki(), ni7(), ncyb(position), true);
        } else {
            m8773e(position);
        }
        m6706z().d8wk(fu4().getProducts().get(position).link.trackId, null);
        if (fu4().getLink() != null && m8774f()) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.bogl));
        } else if (fu4().getLink() != null) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.qg));
        }
    }

    private void n5r1() {
        m6706z().bf2(this);
        Resources resources = ki().getResources();
        this.f14327t = resources.getString(R.string.miuishare_title_more);
        this.f14325r = resources.getString(R.string.concentration_old_period);
        this.f14321g = (TextView) this.itemView.findViewById(R.id.concentration_title);
        TextView textView = (TextView) this.itemView.findViewById(R.id.concentration_subtitle);
        this.f14328y = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.concentration_more);
        this.f14326s = textView2;
        textView2.setVisibility(0);
        this.f14326s.setOnClickListener(this);
        C6077k.f7l8(this.f14326s);
        this.f14324p = (NinePatchImageView) this.itemView.findViewById(R.id.recommend_concentration_image_one);
        this.f14322h = (NinePatchImageView) this.itemView.findViewById(R.id.recommend_concentration_image_two);
        this.f14323i.add(this.f14324p);
        this.f14323i.add(this.f14322h);
        SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) this.itemView.findViewById(R.id.image_container_one);
        SmoothFrameLayout2 smoothFrameLayout22 = (SmoothFrameLayout2) this.itemView.findViewById(R.id.image_container_two);
        smoothFrameLayout2.setOnClickListener(this);
        smoothFrameLayout22.setOnClickListener(this);
        C6077k.jk(smoothFrameLayout2, smoothFrameLayout22);
    }

    private VideoInfo ncyb(int position) {
        UIProduct uIProduct = fu4().getProducts().get(position).product;
        UILink uILink = fu4().getProducts().get(position).link;
        if (uIProduct == null || uILink == null) {
            return null;
        }
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.name = uIProduct.name;
        videoInfo.previewPath = uIProduct.videoUrl;
        videoInfo.path = uIProduct.downloadUrl;
        videoInfo.onlineId = uIProduct.uuid;
        videoInfo.productId = uIProduct.productUuid;
        videoInfo.sizeBytes = uIProduct.fileSizeInKB;
        videoInfo.thumbnail = uIProduct.imageUrl;
        videoInfo.like = uIProduct.like;
        videoInfo.likeCount = uIProduct.likeCount;
        videoInfo.trackId = uILink.trackId;
        videoInfo.innerTags = fu4().getProducts().get(position).innerTags;
        return videoInfo;
    }

    private void vyq() {
        String str;
        for (int i2 = 0; fu4().getProducts() != null && fu4().getProducts().size() >= 2 && i2 < 2; i2++) {
            x2.C1735g c1735gM6793r = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.t8r(com.android.thememanager.basemodule.imageloader.x2.x2(), 0.0f, wvg().ncyb()));
            if (m8774f()) {
                str = fu4().getProducts().get(i2).gifUrl;
                c1735gM6793r.n5r1(fu4().getProducts().get(i2).imageUrl);
            } else {
                str = fu4().getProducts().get(i2).imageUrl;
            }
            C1812k.toq(this.f14323i.get(i2), fu4().getProducts().get(i2).title);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), str, this.f14323i.get(i2), c1735gM6793r);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id = v2.getId();
        if (id == R.id.concentration_more) {
            C2451n.m8802s(ki(), ni7(), fu4().getLink(), wvg());
            if (fu4().getLink() != null) {
                m6706z().d8wk(fu4().getTrackId(), null);
                C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.hk2l));
                return;
            }
            return;
        }
        if (id == R.id.image_container_one) {
            m8775l(0);
        } else if (id == R.id.image_container_two) {
            m8775l(1);
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < fu4().getProducts().size(); i2++) {
            arrayList.add(fu4().getProducts().get(i2).link.trackId);
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: uv6, reason: merged with bridge method [inline-methods] */
    public void o1t(ConcentrationRecommendElement item, int position) {
        super.o1t(item, position);
        if (item.getTitle() != null) {
            this.f14321g.setText(item.getTitle());
        }
        if (item.getSubTitle() != null) {
            this.f14328y.setText(item.getSubTitle());
        }
        vyq();
        if (m8774f()) {
            this.f14326s.setText(this.f14327t);
        } else {
            this.f14326s.setText(this.f14325r);
        }
        this.f14329z.clear();
        for (int i2 = 0; i2 < fu4().getProducts().size(); i2++) {
            Resource resourceM8801q = C2451n.m8801q(fu4().getProducts().get(i2), false);
            if (resourceM8801q != null && "WALLPAPER".equals(fu4().getProducts().get(i2).link.productType)) {
                this.f14329z.add(resourceM8801q);
            }
        }
    }
}
