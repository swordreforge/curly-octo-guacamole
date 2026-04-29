package com.android.thememanager.recommend.view.listview.viewmodel;

import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.views.pad.toq;
import com.android.thememanager.basemodule.views.pad.zy;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewmodel.k */
/* JADX INFO: compiled from: RecommendViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2449k extends lrht implements zy<UIElement> {

    /* JADX INFO: renamed from: g */
    private List<UIElement> f14435g;

    /* JADX INFO: renamed from: p */
    private boolean f14436p = true;

    /* JADX INFO: renamed from: s */
    private int f14437s;

    /* JADX INFO: renamed from: y */
    protected String f14438y;

    @Override // com.android.thememanager.basemodule.views.pad.zy
    public boolean a9() {
        List<UIElement> list = this.f14435g;
        return list != null && list.size() > 0;
    }

    /* JADX INFO: renamed from: c */
    public void m8793c(boolean hasMore) {
        this.f14436p = hasMore;
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    public void eqxt() {
        List<UIElement> list = this.f14435g;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public int m8794f() {
        return this.f14437s;
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    public int getItemCount() {
        return toq().size();
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
    public UIElement getItem(int position) {
        List<UIElement> list;
        if (position < 0 || (list = this.f14435g) == null || position > list.size()) {
            return null;
        }
        return this.f14435g.get(position);
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    /* JADX INFO: renamed from: k */
    public String mo7367k() {
        return this.f14438y;
    }

    public void lrht(List<UIElement> mItemDataList) {
        this.f14435g = mItemDataList;
    }

    public boolean n5r1() {
        return this.f14436p;
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    public List<UIElement> toq() {
        if (this.f14435g == null) {
            this.f14435g = new ArrayList();
        }
        return this.f14435g;
    }

    public void uv6(int index) {
        this.f14437s = index;
    }

    public void vyq(String resourceCode) {
        this.f14438y = resourceCode;
    }

    @Override // com.android.thememanager.basemodule.views.pad.zy
    /* JADX INFO: renamed from: z */
    public toq mo7368z() {
        return null;
    }
}
