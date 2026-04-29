package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class BaseViewHolder<T> extends BaseThemeAdapter.ViewHolder<T> {
    public BaseViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
    }

    private void d2ok(String uuid, String title, boolean isRankList, boolean isGrid) {
        if (TextUtils.isEmpty(uuid)) {
            return;
        }
        Intent intentEtdu = RecommendActivity.etdu(ki(), title, isRankList ? z4.toq.m28202n(uuid) : z4.toq.m28200g(uuid), wvg().lvui(), wvg().m8549l(), false, isGrid, true);
        if (ni7() != null) {
            ki().startActivityFromFragment(ni7(), intentEtdu, 1, (Bundle) null);
        }
    }

    public void dd(boolean isVisible) {
    }

    protected void jk(String uuid, String title) {
        d2ok(uuid, title, false, false);
    }

    protected void lvui(String uuid, String title) {
        d2ok(uuid, title, true, false);
    }

    protected boolean mcp() {
        return ((AbstractActivityC1717k) ki()).t8iq();
    }

    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        m6706z().fnq8(mo8573t());
    }

    protected void oc(String uuid, String title, boolean isGrid) {
        d2ok(uuid, title, false, isGrid);
    }

    /* JADX INFO: renamed from: r */
    protected void m8595r(String uuid, String title, boolean isRankList, boolean isGrid, String resCode) {
        if (TextUtils.isEmpty(uuid)) {
            return;
        }
        Intent intentEtdu = RecommendActivity.etdu(ki(), title, isRankList ? z4.toq.m28202n(uuid) : z4.toq.m28200g(uuid), resCode, wvg().m8549l(), false, isGrid, isRankList);
        if (ni7() != null) {
            ki().startActivityFromFragment(ni7(), intentEtdu, 1, (Bundle) null);
        }
    }

    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        return null;
    }

    protected RecommendListViewAdapter wvg() {
        return (RecommendListViewAdapter) this.f9847k;
    }

    protected void x9kr() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.zy) {
            ((StaggeredGridLayoutManager.zy) layoutParams).x2(true);
        }
    }

    public void zy() {
        m6706z().x9kr(mo8573t());
    }
}
