package com.android.thememanager.activity;

import android.os.AsyncTask;
import android.util.Log;
import com.android.thememanager.C2081i;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.model.LargeIconRequestModel;
import com.android.thememanager.model.LargeIconSplitResource;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIPage;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LargeIconAllPageViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public class lv5 extends androidx.lifecycle.lrht {

    /* JADX INFO: renamed from: i */
    private static final String f9170i = "LargeIconAllPageViewMod";

    /* JADX INFO: renamed from: h */
    private LargeIconSplitResource f9172h;

    /* JADX INFO: renamed from: g */
    private final androidx.lifecycle.fti<List<LargeIconSplitResource>> f9171g = new androidx.lifecycle.fti<>();

    /* JADX INFO: renamed from: y */
    private final androidx.lifecycle.fti<LargeIconSplitResource> f9175y = new androidx.lifecycle.fti<>();

    /* JADX INFO: renamed from: s */
    private final Map<String, C2081i> f9174s = new HashMap();

    /* JADX INFO: renamed from: p */
    private Boolean f9173p = null;

    /* JADX INFO: renamed from: com.android.thememanager.activity.lv5$k */
    /* JADX INFO: compiled from: LargeIconAllPageViewModel.java */
    private static class AsyncTaskC1602k extends AsyncTask<Void, Void, List<LargeIconSplitResource>> {

        /* JADX INFO: renamed from: k */
        private lv5 f9176k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57327toq;

        public AsyncTaskC1602k(lv5 viewModel, String onlineId) {
            this.f9176k = viewModel;
            this.f57327toq = onlineId;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<LargeIconSplitResource> doInBackground(Void... voids) {
            UIPage largeIconCategory = LargeIconRequestModel.getLargeIconCategory(this.f57327toq);
            if (largeIconCategory == null || com.android.thememanager.basemodule.utils.y9n.mcp(largeIconCategory.cards)) {
                Log.w(lv5.f9170i, "loadLargeIconSplitList: is empty");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (UICard uICard : largeIconCategory.cards) {
                if (InterfaceC1789q.j5.equals(uICard.cardType)) {
                    UILink uILink = uICard.link;
                    arrayList.add(new LargeIconSplitResource(uILink.title, uILink.link));
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<LargeIconSplitResource> newData) {
            if (!com.android.thememanager.basemodule.utils.y9n.mcp(newData)) {
                this.f9176k.hyr().cdj(newData.get(0));
            }
            this.f9176k.m6434f().cdj(newData);
        }
    }

    /* JADX INFO: renamed from: c */
    public C2081i m6432c(String key) {
        if (p029m.zy.toq(key)) {
            return null;
        }
        return this.f9174s.get(key);
    }

    /* JADX INFO: renamed from: e */
    public void m6433e(String onlineID) {
        new AsyncTaskC1602k(this, onlineID).executeOnExecutor(C6002g.x2(), new Void[0]);
    }

    /* JADX INFO: renamed from: f */
    public androidx.lifecycle.fti<List<LargeIconSplitResource>> m6434f() {
        return this.f9171g;
    }

    public void hb(LargeIconSplitResource requestMessage) {
        this.f9172h = requestMessage;
    }

    public androidx.lifecycle.fti<LargeIconSplitResource> hyr() {
        return this.f9175y;
    }

    public LargeIconSplitResource lrht() {
        return this.f9172h;
    }

    public void n5r1(String key, UIPage page, List<UIElement> list, boolean refresh, int cardCount) {
        C2081i c2081iM6432c = m6432c(key);
        if (c2081iM6432c == null) {
            c2081iM6432c = new C2081i();
        }
        c2081iM6432c.x2(page, list, refresh, cardCount);
        this.f9174s.put(key, c2081iM6432c);
    }

    public void nn86(Boolean needSelectList) {
        this.f9173p = needSelectList;
    }

    public Boolean uv6() {
        return this.f9173p;
    }

    public boolean vyq() {
        return com.android.thememanager.basemodule.utils.y9n.mcp(this.f9171g.m4388g()) || this.f9175y.m4388g() == null || !this.f9175y.m4388g().isValidData();
    }
}
