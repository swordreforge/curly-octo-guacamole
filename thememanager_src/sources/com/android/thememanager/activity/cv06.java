package com.android.thememanager.activity;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.ListParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: OnlineResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class cv06 extends pc implements InterfaceC1925p {
    private int an;
    private com.android.thememanager.controller.online.zurt bv;

    /* JADX INFO: renamed from: com.android.thememanager.activity.cv06$k */
    /* JADX INFO: compiled from: OnlineResourceAdapter.java */
    protected static class AsyncTaskC1572k extends AbstractC1712k.q<Resource> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private WeakReference<cv06> f57299ld6;

        public void cdj(cv06 adapter) {
            this.f57299ld6 = new WeakReference<>(adapter);
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.q
        protected int f7l8() {
            cv06 cv06Var;
            WeakReference<cv06> weakReference = this.f57299ld6;
            if (weakReference == null || (cv06Var = weakReference.get()) == null) {
                return 0;
            }
            return cv06Var.lv5();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.q, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: p */
        public void onPostExecute(List<Resource> result) {
            cv06 cv06Var;
            super.onPostExecute(result);
            WeakReference<cv06> weakReference = this.f57299ld6;
            if (weakReference == null || (cv06Var = weakReference.get()) == null) {
                return;
            }
            toq(cv06Var.lrht());
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.q
        /* JADX INFO: renamed from: s */
        protected List<Resource> mo6404s(AbstractC1712k.n params) {
            WeakReference<cv06> weakReference = this.f57299ld6;
            cv06 cv06Var = weakReference != null ? weakReference.get() : null;
            if (cv06Var == null) {
                return null;
            }
            return cv06Var.uv6().m7690k().zurt(new ListParams(cv06Var.t8iq(), params.f9825k), params.f57499zy);
        }
    }

    public cv06(C1582h fragment, com.android.thememanager.fu4 resContext) {
        super(fragment, resContext);
        this.an = 0;
    }

    public void bo(int mode) {
        this.an = mode;
    }

    @Override // com.android.thememanager.activity.pc
    protected boolean ek5k(int group) {
        return true;
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected List<AbstractC1712k.q> ki() {
        ArrayList arrayList = new ArrayList();
        AsyncTaskC1572k asyncTaskC1572k = new AsyncTaskC1572k();
        asyncTaskC1572k.m6700k(lrht());
        asyncTaskC1572k.cdj(this);
        arrayList.add(asyncTaskC1572k);
        return arrayList;
    }

    public int lv5() {
        return this.an;
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected void mcp(List<Resource> result) {
        C1582h c1582h = this.f9312m.get();
        if (result == null) {
            if ((c1582h == null || c1582h.ps()) && C1915g.m7549k()) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
            }
        }
    }

    @Override // com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: r */
    protected void mo6401r(View view, Resource resource, int groupIndex, int group) {
        RatingBar ratingBar;
        super.mo6401r(view, resource, groupIndex, group);
        TextView textView = (TextView) view.findViewById(R.id.origin_price);
        Activity activity = this.f9313o.get();
        if (textView != null) {
            textView.setVisibility(0);
            lvui(view, R.id.origin_price, resource, com.android.thememanager.util.ch.m9686y(activity, resource.getOriginPrice()));
            if (resource.getOriginPrice() == 0) {
                textView.setTextColor(activity.getResources().getColor(R.color.tag_ui_text_color));
            } else {
                TypedValue typedValue = new TypedValue();
                if (activity.getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true)) {
                    textView.setTextColor(activity.getResources().getColorStateList(typedValue.resourceId));
                }
            }
            TextView textView2 = (TextView) view.findViewById(R.id.discounted_price);
            if (textView2 != null) {
                if (resource.getOriginPrice() < 0 || resource.getOriginPrice() == resource.getProductPrice()) {
                    textView.setBackground(null);
                    textView2.setVisibility(8);
                } else {
                    textView.setBackgroundResource(R.drawable.resource_strickout);
                    lvui(view, R.id.discounted_price, resource, com.android.thememanager.util.ch.m9686y(activity, resource.getProductPrice()));
                    textView2.setVisibility(0);
                }
            }
        }
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            textView.setVisibility(8);
        }
        if (!this.f9310e.isPurchaseSupported() || resource.getScore() < 0.0f || (ratingBar = (RatingBar) view.findViewById(R.id.ratingbar)) == null) {
            return;
        }
        ratingBar.setRating(resource.getScore());
        ratingBar.setVisibility(0);
    }

    public com.android.thememanager.controller.online.zurt t8iq() {
        return this.bv;
    }

    /* JADX INFO: renamed from: u */
    public void m6402u(com.android.thememanager.controller.online.zurt listUrl) {
        this.bv = listUrl;
    }

    public cv06(Context activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
        this.an = 0;
    }
}
