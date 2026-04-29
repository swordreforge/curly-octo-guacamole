package com.android.thememanager.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.model.RecommendItem;

/* JADX INFO: compiled from: RecommendItemTitleButtonFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class d3 extends a9 {
    public d3(Activity activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: n */
    protected View mo10332n(RecommendItem item, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f17505k).inflate(R.layout.resource_recommend_item_title_button, parent, false);
        com.android.thememanager.basemodule.imageloader.x2.zy(this.f17505k, item.getOnlineThumbnail(), (ImageView) viewInflate.findViewById(R.id.image));
        return viewInflate;
    }
}
