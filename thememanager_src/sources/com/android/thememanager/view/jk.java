package com.android.thememanager.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.util.gc3c;
import java.util.Random;

/* JADX INFO: compiled from: RecommendItemBannerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class jk extends a9 {
    public jk(Activity activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: n */
    protected View mo10332n(RecommendItem item, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f17505k).inflate(R.layout.resource_recommend_item_banner, (ViewGroup) null);
        com.android.thememanager.basemodule.imageloader.x2.m6778n(this.f17505k, item.getOnlineThumbnail(), (ImageView) viewInflate.findViewById(R.id.image), gc3c.m9780n(new Random().nextInt(7)), this.f17505k.getResources().getDimensionPixelSize(R.dimen.recommend_thumbnail_round_corner_radius));
        return viewInflate;
    }
}
