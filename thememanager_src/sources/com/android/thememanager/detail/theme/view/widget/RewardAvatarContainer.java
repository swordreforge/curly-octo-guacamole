package com.android.thememanager.detail.theme.view.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.router.detail.entity.UserBounty;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class RewardAvatarContainer extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private int f11269k;

    /* JADX INFO: renamed from: n */
    private int f11270n;

    /* JADX INFO: renamed from: q */
    private int f11271q;

    public RewardAvatarContainer(Context context) {
        this(context, null);
    }

    private void toq(String thumbnailUrl) {
        if (thumbnailUrl == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) getContext(), thumbnailUrl, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.avatar_default).m6794t(getResources().getDimensionPixelSize(R.dimen.de_user_info_image_view_size)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f11271q, this.f11270n);
        imageView.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, 0, this.f11269k, 0);
        addView(imageView);
    }

    /* JADX INFO: renamed from: k */
    public void m7782k(List<UserBounty> userBountyList, UserBounty currentUserBounty, int displayQuantity) {
        int i2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userBountyList);
        if (currentUserBounty != null && (i2 = currentUserBounty.rank) > 0 && i2 <= displayQuantity) {
            arrayList.remove(i2 - 1);
        }
        if (currentUserBounty != null && currentUserBounty.bounty > 0) {
            arrayList.add(0, currentUserBounty);
        }
        for (int i3 = 0; i3 < arrayList.size() && i3 < displayQuantity; i3++) {
            toq(((UserBounty) arrayList.get(i3)).profilePic);
        }
    }

    public RewardAvatarContainer(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RewardAvatarContainer(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11269k = getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_avatar_padding);
        this.f11271q = getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_avatar_size);
        this.f11270n = getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_avatar_size);
    }
}
