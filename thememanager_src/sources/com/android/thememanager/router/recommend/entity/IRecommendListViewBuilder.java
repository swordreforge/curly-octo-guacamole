package com.android.thememanager.router.recommend.entity;

import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.router.recommend.entity.IRecommendListView;

/* JADX INFO: loaded from: classes2.dex */
public interface IRecommendListViewBuilder {
    IRecommendListView build();

    IRecommendListViewBuilder disableAnim();

    IRecommendListViewBuilder setCallBack(IRecommendListView.CallBack callBack);

    IRecommendListViewBuilder setCardCount(int cardCount);

    IRecommendListViewBuilder setCardDivider(boolean hasCardDivider);

    IRecommendListViewBuilder setContext(Fragment fragment);

    IRecommendListViewBuilder setContext(ActivityC0891q activity);

    IRecommendListViewBuilder setItemDecoration(RecyclerView.kja0 decoration);

    IRecommendListViewBuilder setLayoutManagerSpanCount(int count);

    IRecommendListViewBuilder setLayoutManagerType(int type);

    IRecommendListViewBuilder setLoadMore(boolean loadMore);

    IRecommendListViewBuilder setNeedFootTip(boolean needFootTip);

    IRecommendListViewBuilder setPicker(boolean isPicker);

    IRecommendListViewBuilder setRefresh(boolean refresh);

    IRecommendListViewBuilder setRequest(IRecommendListView.Request request);

    IRecommendListViewBuilder setResCode(String resCode);

    IRecommendListViewBuilder setRingtoneFlag(int ringtoneFlag);

    IRecommendListViewBuilder setSettingPage(boolean isSettingPage);

    IRecommendListViewBuilder setSpanSizeLookup(GridLayoutManager.zy spanSizeLookup);

    IRecommendListViewBuilder setStaggerDecorationSize(int mStaggerDecorationSize);

    IRecommendListViewBuilder setStaggerHolderWidth(int mStaggerHolderWidth);

    IRecommendListViewBuilder setViewHolderLifecycleEnable(boolean needLifeCycle);
}
