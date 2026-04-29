package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.basemodule.base.BaseVMAdapter;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class BaseVMViewHolder<T> extends BaseVMAdapter.ViewHolder<T> {
    public BaseVMViewHolder(@lvui View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
    }

    protected void mcp() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.zy) {
            ((StaggeredGridLayoutManager.zy) layoutParams).x2(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8593n() {
        m6708z().fnq8(mo8594t());
    }

    /* JADX INFO: renamed from: t */
    protected List<String> mo8594t() {
        return null;
    }

    protected RecommendVMListViewAdapter wvg() {
        return (RecommendVMListViewAdapter) this.f9852k;
    }

    public void zy() {
        m6708z().x9kr(mo8594t());
    }
}
