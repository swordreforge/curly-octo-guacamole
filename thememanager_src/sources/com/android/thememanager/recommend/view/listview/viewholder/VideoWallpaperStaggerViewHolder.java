package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.C2307p;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1801b;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.StaggeredVideoWallpaperCategoryElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class VideoWallpaperStaggerViewHolder extends StaggerViewHolder<StaggeredVideoWallpaperCategoryElement> {

    /* JADX INFO: renamed from: c */
    private TextView f14296c;

    /* JADX INFO: renamed from: e */
    private C1801b f14297e;

    /* JADX INFO: renamed from: f */
    private TextView f14298f;

    /* JADX INFO: renamed from: l */
    private ViewGroup f14299l;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.VideoWallpaperStaggerViewHolder$k */
    class ViewOnClickListenerC2430k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f14300k;

        ViewOnClickListenerC2430k(final String val$imageUrl) {
            this.f14300k = val$imageUrl;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            UILink uILink = VideoWallpaperStaggerViewHolder.this.f14268t.link;
            if (uILink == null) {
                return;
            }
            if ("PRODUCT_DETAIL".equals(uILink.type) && "VIDEO_WALLPAPER".equals(uILink.productType)) {
                VideoInfo videoInfo = new VideoInfo();
                VideoWallpaperStaggerViewHolder videoWallpaperStaggerViewHolder = VideoWallpaperStaggerViewHolder.this;
                UIImageWithLink uIImageWithLink = videoWallpaperStaggerViewHolder.f14268t;
                UIProduct uIProduct = uIImageWithLink.product;
                videoInfo.name = uIProduct.name;
                videoInfo.previewPath = uIProduct.videoUrl;
                videoInfo.path = uIProduct.downloadUrl;
                videoInfo.onlineId = uIProduct.uuid;
                videoInfo.productId = uIProduct.productUuid;
                videoInfo.trackId = uILink.trackId;
                videoInfo.sizeBytes = uIProduct.fileSizeInKB;
                videoInfo.thumbnail = uIImageWithLink.imageUrl;
                videoInfo.like = uIProduct.like;
                videoInfo.likeCount = uIProduct.likeCount;
                videoInfo.innerTags = uIImageWithLink.innerTags;
                Intent qVar = C2307p.toq(videoWallpaperStaggerViewHolder.ki(), videoInfo, true);
                if (VideoWallpaperStaggerViewHolder.this.ni7() == null) {
                    VideoWallpaperStaggerViewHolder.this.ki().startActivity(qVar);
                } else {
                    VideoWallpaperStaggerViewHolder.this.ki().startActivityFromFragment(VideoWallpaperStaggerViewHolder.this.ni7(), qVar, -1);
                }
            } else {
                C2451n.toq toqVarM8797g = C2451n.m8797g();
                toqVarM8797g.m8807p(VideoWallpaperStaggerViewHolder.this.f14268t.index);
                toqVarM8797g.m8810y(this.f14300k);
                toqVarM8797g.toq(uILink.productType);
                toqVarM8797g.x2(VideoWallpaperStaggerViewHolder.this.wvg().lvui());
                toqVarM8797g.m8804g(VideoWallpaperStaggerViewHolder.this.wvg().m8549l());
                toqVarM8797g.f7l8(VideoWallpaperStaggerViewHolder.this.wvg().n5r1());
                C2451n.m8803y(VideoWallpaperStaggerViewHolder.this.ki(), VideoWallpaperStaggerViewHolder.this.ni7(), uILink, toqVarM8797g);
            }
            VideoWallpaperStaggerViewHolder.this.m6706z().d8wk(uILink.trackId, null);
        }
    }

    public VideoWallpaperStaggerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14299l = (ViewGroup) itemView.findViewById(R.id.content);
        this.f14298f = (TextView) itemView.findViewById(R.id.title);
        this.f14296c = (TextView) itemView.findViewById(R.id.designer);
        C6077k.o1t(this.f14267s);
        this.f14297e = new C1801b(ki(), fn3e().getResources().getDimensionPixelOffset(R.dimen.round_corner_default));
    }

    public static VideoWallpaperStaggerViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new VideoWallpaperStaggerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_video_wallpaper_staggered_item_category_new, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(StaggeredVideoWallpaperCategoryElement item, final int position) {
        super.o1t(item, position);
        this.f14299l.setVisibility(!TextUtils.isEmpty(this.f14268t.title) && !TextUtils.isEmpty(this.f14268t.designerName) ? 0 : 8);
        this.f14298f.setText(this.f14268t.title);
        this.f14296c.setText(this.f14268t.designerName);
        boolean z2 = this.f14297e.toq(item.index) && !TextUtils.isEmpty(this.f14268t.gifUrl);
        this.f14264i.n5r1(z2 ? this.f14268t.imageUrl : null);
        UIImageWithLink uIImageWithLink = this.f14268t;
        String str = z2 ? uIImageWithLink.gifUrl : uIImageWithLink.imageUrl;
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), str, this.f14263h, this.f14264i);
        C1812k.toq(this.f14263h, this.f14268t.title);
        this.f14267s.setOnClickListener(new ViewOnClickListenerC2430k(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((StaggeredVideoWallpaperCategoryElement) this.f9849q).getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((StaggeredVideoWallpaperCategoryElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
