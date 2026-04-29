package com.android.thememanager.view;

import android.app.Activity;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.util.ch;

/* JADX INFO: compiled from: RecommendItemMultipleButtonFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class jp0y extends a9 {

    /* JADX INFO: renamed from: n */
    protected CornerIconView f17548n;

    public jp0y(Activity activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
    }

    /* JADX INFO: renamed from: y */
    private void m10358y() {
        this.f17548n.setVisibility(8);
        ch.lv5(this.f17505k, -1, false);
    }

    protected void f7l8(View localIconView) {
        Pair<Boolean, Integer> pairM9673j = ch.m9673j(this.f17505k);
        boolean zBooleanValue = ((Boolean) pairM9673j.first).booleanValue();
        int iIntValue = ((Integer) pairM9673j.second).intValue();
        if (iIntValue <= 0 || !zBooleanValue) {
            return;
        }
        CornerIconView cornerIconView = new CornerIconView(this.f17505k, localIconView);
        this.f17548n = cornerIconView;
        cornerIconView.setBackgroundResource(R.drawable.resource_list_icon_corner_marker_bg);
        this.f17548n.setCornerIconNumber(iIntValue);
        this.f17548n.setTextColor(this.f17505k.getResources().getColor(android.R.color.white));
        this.f17548n.setVisibility(0);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: g */
    protected void mo10331g(View view, RecommendItem item) {
        if (this.f17548n != null && this.f17506q.getResourceFormat() == 1 && item.getItemType() == RecommendItem.RecommendType.LOCAL) {
            m10358y();
        }
        super.mo10331g(view, item);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: n */
    protected View mo10332n(RecommendItem item, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f17505k).inflate(R.layout.resource_page_item_multiple_button_view, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.multiple_button_icon);
        com.android.thememanager.basemodule.imageloader.x2.zy(this.f17505k, item.getOnlineThumbnail(), imageView);
        ((TextView) viewInflate.findViewById(R.id.multiple_button_text)).setText(item.getTitle());
        if (this.f17506q.getResourceFormat() == 1 && item.getItemType() == RecommendItem.RecommendType.LOCAL) {
            f7l8(imageView);
        }
        return viewInflate;
    }
}
