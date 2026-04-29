package com.android.thememanager.module.detail.view;

import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.view.z */
/* JADX INFO: compiled from: FontDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2303z extends ikck {
    @Override // com.android.thememanager.module.detail.view.y9n
    public void anw() {
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.personalize_second_space_not_support_set_font, 0);
        } else {
            super.anw();
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void l7o(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        super.l7o(onlineResourceDetail, isOnline);
        if (this.f13393e.getOnlineId() == null) {
            View viewFindViewById = this.bp.findViewById(R.id.author_container);
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.author_theme_right_arrow);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(4);
            }
            viewFindViewById.setOnClickListener(null);
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void mla(OnlineResourceDetail onlineResourceDetail) {
        ArrayList<Integer> arrayList;
        super.mla(onlineResourceDetail);
        ImageView imageView = (ImageView) this.bp.findViewById(R.id.font_var_image);
        if (imageView == null || !com.android.thememanager.util.g1.nn86() || (arrayList = onlineResourceDetail.fontWeightList) == null || arrayList.size() <= 0) {
            return;
        }
        imageView.setVisibility(0);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void pnt2() {
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.personalize_second_space_not_support_set_font, 0);
        } else {
            super.pnt2();
        }
    }
}
