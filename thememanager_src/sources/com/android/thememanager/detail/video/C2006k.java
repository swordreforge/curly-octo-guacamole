package com.android.thememanager.detail.video;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.detail.video.model.VideoRequestInterface;
import com.android.thememanager.detail.video.util.FastVideoPlayer;
import com.android.thememanager.detail.video.util.InterfaceC2010n;
import com.android.thememanager.detail.video.util.VideoDetailPlayer;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.detail.video.k */
/* JADX INFO: compiled from: VideoDetailActivityVM.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2006k extends lrht implements InterfaceC7648q<CommonResponse<UIPage>> {

    /* JADX INFO: renamed from: i */
    private InterfaceC2010n f11421i;

    /* JADX INFO: renamed from: p */
    private boolean f11422p;

    /* JADX INFO: renamed from: y */
    private retrofit2.toq<CommonResponse<UIPage>> f11424y;

    /* JADX INFO: renamed from: g */
    private final fti<List<VideoInfo>> f11419g = new fti<>();

    /* JADX INFO: renamed from: s */
    private final fti<Integer> f11423s = new fti<>();

    /* JADX INFO: renamed from: h */
    private int f11420h = 1;

    /* JADX INFO: renamed from: c */
    public LiveData<Integer> m7832c() {
        return this.f11423s;
    }

    /* JADX INFO: renamed from: f */
    public LiveData<List<VideoInfo>> m7833f() {
        return this.f11419g;
    }

    public void hyr() {
        if (this.f11422p) {
            return;
        }
        retrofit2.toq<CommonResponse<UIPage>> toqVar = this.f11424y;
        if (toqVar != null) {
            toqVar.cancel();
        }
        retrofit2.toq<CommonResponse<UIPage>> videoStaggeredUrl = ((VideoRequestInterface) f7l8.m6882h().toq(VideoRequestInterface.class)).getVideoStaggeredUrl(this.f11420h);
        this.f11424y = videoStaggeredUrl;
        videoStaggeredUrl.mo27954p(this);
    }

    public void lrht() {
        this.f11423s.cdj(-1);
    }

    public InterfaceC2010n n5r1(Context context, boolean isFastPlayer) {
        if (this.f11421i == null) {
            if (isFastPlayer) {
                this.f11421i = new FastVideoPlayer(context.getApplicationContext());
            } else {
                this.f11421i = new VideoDetailPlayer(context.getApplicationContext());
            }
        }
        return this.f11421i;
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        retrofit2.toq<CommonResponse<UIPage>> toqVar = this.f11424y;
        if (toqVar != null) {
            toqVar.cancel();
        }
        InterfaceC2010n interfaceC2010n = this.f11421i;
        if (interfaceC2010n != null) {
            interfaceC2010n.pjz9(false);
        }
    }

    @Override // retrofit2.InterfaceC7648q
    public void onFailure(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui Throwable throwable) {
        this.f11422p = false;
    }

    @Override // retrofit2.InterfaceC7648q
    public void onResponse(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui C7639i<CommonResponse<UIPage>> response) {
        this.f11422p = false;
        if (response.m27986k() == null || !com.android.thememanager.basemodule.network.theme.toq.m6892k(response)) {
            return;
        }
        List<UICard> list = response.m27986k().apiData.cards;
        if (kja0.qrj(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UICard> it = list.iterator();
        while (it.hasNext()) {
            List<UIImageWithLink> list2 = it.next().recommends;
            if (!kja0.qrj(list2)) {
                for (UIImageWithLink uIImageWithLink : list2) {
                    UILink uILink = uIImageWithLink.link;
                    if (uILink != null && "PRODUCT_DETAIL".equals(uILink.type) && "VIDEO_WALLPAPER".equals(uILink.productType)) {
                        VideoInfo videoInfo = new VideoInfo();
                        UIProduct uIProduct = uIImageWithLink.product;
                        videoInfo.name = uIProduct.name;
                        videoInfo.previewPath = uIProduct.videoUrl;
                        videoInfo.path = uIProduct.downloadUrl;
                        videoInfo.trackId = uILink.trackId;
                        videoInfo.onlineId = uIProduct.uuid;
                        videoInfo.productId = uIProduct.productUuid;
                        videoInfo.sizeBytes = uIProduct.fileSizeInKB;
                        videoInfo.thumbnail = uIImageWithLink.imageUrl;
                        videoInfo.innerTags = uIImageWithLink.innerTags;
                        arrayList.add(videoInfo);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            this.f11419g.cdj(arrayList);
        }
        this.f11420h++;
    }

    public void uv6(int fragmentIndex) {
        this.f11423s.cdj(Integer.valueOf(fragmentIndex));
    }
}
