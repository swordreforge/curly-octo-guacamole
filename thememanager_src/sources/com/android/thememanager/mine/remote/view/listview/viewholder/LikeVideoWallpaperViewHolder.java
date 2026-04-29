package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.C2307p;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LikeVideoWallpaperViewHolder extends WallpaperViewHolder {
    public LikeVideoWallpaperViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        C6077k.o1t(itemView);
    }

    /* JADX INFO: renamed from: f */
    public static LikeVideoWallpaperViewHolder m8280f(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new LikeVideoWallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_wallpaper, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.WallpaperViewHolder, com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        UIProduct product = ((BaseRemoteResourceAdapter.toq) fu4()).getProduct();
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.name = product.name;
        videoInfo.previewPath = product.videoUrl;
        videoInfo.path = product.downloadUrl;
        videoInfo.trackId = product.trackId;
        videoInfo.onlineId = product.uuid;
        videoInfo.productId = product.productUuid;
        videoInfo.sizeBytes = product.fileSizeInKB;
        videoInfo.thumbnail = product.imageUrl;
        ki().startActivity(C2307p.toq(ki(), videoInfo, false));
        m6706z().d8wk(product.trackId, null);
    }
}
