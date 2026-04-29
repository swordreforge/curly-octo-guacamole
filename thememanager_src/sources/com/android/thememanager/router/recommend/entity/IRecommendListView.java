package com.android.thememanager.router.recommend.entity;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import retrofit2.toq;
import zy.lvui;
import zy.oc;
import zy.y9n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IRecommendListView extends FrameLayout {

    public static abstract class CallBack<T extends UIPage> {
        @oc
        public Pair<UIPage, List<UIElement>> editRecommendLoadResult(UIPage page, List<UIElement> list, boolean refresh) {
            return null;
        }

        public Class<T> getTClass() {
            return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }

        @oc
        public boolean isInterruptLoadData(UIPage uiPage) {
            return false;
        }

        @oc
        public void onParseUICardFinish(List<UIElement> uiElements, boolean refresh) {
        }

        @oc
        public void onRecommendListScroll(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
        }

        @oc
        public void onRecommendLoadFail(boolean refresh) {
        }

        @oc
        public void onRecommendLoadSuccess(boolean refresh) {
        }

        @y9n
        public T onRequestFinish(T apiData, boolean refresh) {
            return apiData;
        }

        @oc
        public void onRequestStart() {
        }
    }

    public interface ExViewHolder {
        RecyclerView.fti getVH(int viewType, ViewGroup parent, RecyclerView.AbstractC1060y<?> adapter);
    }

    public interface Request {
        default toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
            return null;
        }

        default toq<CommonResponse<kja0>> getRefreshCall() {
            return null;
        }
    }

    public IRecommendListView(@lvui Context context) {
        super(context);
    }

    public abstract void addHeaderView(View header);

    public abstract void clear();

    public abstract void clearData();

    public abstract int getElementSize();

    public abstract int getElementType(int position);

    public abstract void refreshData();

    public abstract void scrollTop();

    public abstract void setCardDivider(boolean hasCardDivider);

    public void setExVH(ExViewHolder evh) {
    }

    public abstract void setItemDecoration(RecyclerView.kja0 decoration);

    public abstract void setLayoutManagerType(int layoutManagerType);

    public abstract void smoothScrolltoPosition(int position);
}
