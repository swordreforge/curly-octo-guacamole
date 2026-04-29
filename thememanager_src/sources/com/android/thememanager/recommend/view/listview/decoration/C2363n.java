package com.android.thememanager.recommend.view.listview.decoration;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.f7l8;
import kotlinx.coroutines.internal.C6692t;
import zy.InterfaceC7829h;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.decoration.n */
/* JADX INFO: compiled from: WidgetSuitItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2363n extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: g */
    private static final String f13740g = "WidgetItemDecoration";

    /* JADX INFO: renamed from: k */
    private Resources f13741k;

    /* JADX INFO: renamed from: n */
    private int f13742n;

    /* JADX INFO: renamed from: q */
    private int f13743q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60669toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60670zy;

    public C2363n(Context context, @InterfaceC7829h int topOffsetRes, @InterfaceC7829h int bottomOffsetRes) {
        this.f60669toq = 0;
        this.f60670zy = 0;
        this.f13743q = 0;
        this.f13742n = 0;
        if (context == null) {
            Log.w(f13740g, "WidgetItemDecoration.constructor returned:  context == null");
            return;
        }
        Resources resources = context.getResources();
        this.f13741k = resources;
        this.f60669toq = resources.getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_lr);
        this.f60670zy = this.f13741k.getDimensionPixelSize(R.dimen.stagger_divider);
        this.f13743q = this.f13741k.getDimensionPixelSize(topOffsetRes);
        this.f13742n = this.f13741k.getDimensionPixelSize(bottomOffsetRes);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
        super.mo4711n(outRect, view, parent, state);
        if (this.f13741k == null) {
            return;
        }
        int qVar = ((RecyclerView.cdj) view.getLayoutParams()).toq();
        RecyclerView.AbstractC1060y adapter = parent.getAdapter();
        if (qVar == 0 && adapter != null && adapter.getItemCount() > 0 && adapter.getItemViewType(0) == 5) {
            int i2 = this.f60669toq;
            outRect.set(i2, 0, i2, 0);
            return;
        }
        int itemViewType = adapter != null ? adapter.getItemViewType(qVar) : -1;
        if (adapter instanceof f7l8) {
            itemViewType -= C6692t.f37242p;
        }
        if (itemViewType == -1) {
            Log.w(f13740g, "getItemOffsets failed: itemViewType = -1");
            return;
        }
        if (itemViewType == 3) {
            int i3 = this.f60670zy;
            outRect.set(i3, this.f13743q, i3, 0);
        } else if (itemViewType == 24) {
            int i4 = this.f60670zy;
            outRect.set(i4, 0, i4, this.f13742n);
        } else if (itemViewType == 77 || itemViewType == 122) {
            int i5 = this.f60670zy;
            outRect.set(i5, this.f13743q, i5, this.f13742n);
        }
    }
}
