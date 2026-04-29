package com.android.thememanager.view;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.RecommendItem;

/* JADX INFO: compiled from: RecommendItemTextFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class gvn7 extends a9 {
    public gvn7(Activity activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
    }

    private int f7l8(RecommendItem item) {
        int iHashCode;
        int iHashCode2;
        if (item.getExtraMeta().getBoolean(RecommendItem.RECOMMEND_ITEM_IS_TAG, false)) {
            String title = item.getTitle();
            return (TextUtils.isEmpty(title) || (iHashCode2 = ((title.hashCode() % 4) + 4) % 4) == 0) ? R.drawable.resource_recommend_tag_text_bg : iHashCode2 != 1 ? iHashCode2 != 2 ? iHashCode2 != 3 ? R.drawable.resource_recommend_tag_text_bg : R.drawable.resource_recommend_tag_text_bg_3 : R.drawable.resource_recommend_tag_text_bg_2 : R.drawable.resource_recommend_tag_text_bg_1;
        }
        if (C1819o.d2ok(this.f17505k)) {
            return R.drawable.resource_recommend_item_text_night_bg;
        }
        String title2 = item.getTitle();
        return (TextUtils.isEmpty(title2) || (iHashCode = ((title2.hashCode() % 5) + 5) % 5) == 0) ? R.drawable.resource_recommend_item_text_bg : iHashCode != 1 ? iHashCode != 2 ? iHashCode != 3 ? iHashCode != 4 ? R.drawable.resource_recommend_item_text_bg : R.drawable.resource_recommend_item_text_bg_4 : R.drawable.resource_recommend_item_text_bg_3 : R.drawable.resource_recommend_item_text_bg_2 : R.drawable.resource_recommend_item_text_bg_1;
    }

    /* JADX INFO: renamed from: y */
    private ColorStateList m10357y(RecommendItem item) {
        return item.getExtraMeta().getBoolean(RecommendItem.RECOMMEND_ITEM_IS_TAG, false) ? this.f17505k.getResources().getColorStateList(R.color.resource_detail_tag_text_color) : this.f17505k.getResources().getColorStateList(R.color.resource_search_hotword_text_color);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: n */
    protected View mo10332n(RecommendItem item, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f17505k).inflate(R.layout.resource_recommend_item_text, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        textView.setText(item.getTitle());
        textView.setBackgroundResource(f7l8(item));
        textView.setTextColor(m10357y(item));
        return viewInflate;
    }
}
