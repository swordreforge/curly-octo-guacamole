package com.android.thememanager.activity;

import a98o.C0004k;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.qrj;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.PageItem;
import com.android.thememanager.util.BatchResourceHandler;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2792m;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import com.android.thememanager.util.ThemeBatchResourceHandler;
import com.android.thememanager.util.ThemeWallpaperBatchHandler;
import com.android.thememanager.view.ResourceEmptyView;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: OnlineResourceListFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class vep5 extends nsb implements InterfaceC1925p, com.android.thememanager.basemodule.analysis.toq, AbstractC1712k.k<Resource> {
    private static final String ad = "OnlineResourceListFragm";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected PageGroup f57353ab;
    protected com.android.thememanager.controller.online.zurt an;
    private boolean as;
    protected boolean ax;
    protected boolean az;
    protected View ba;
    protected String bb;
    protected boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected LinearLayout f57354bo;
    protected Page bp;
    private AsyncTaskC1629n bq;
    protected com.android.thememanager.controller.online.zurt bv;

    /* JADX INFO: renamed from: d */
    protected LinearLayout f9349d;
    protected int id;
    protected int in;

    /* JADX INFO: renamed from: u */
    protected LinearLayout f9350u;

    /* JADX INFO: renamed from: v */
    protected LinearLayout f9351v;

    /* JADX INFO: renamed from: w */
    protected ResourceEmptyView f9352w;

    /* JADX INFO: renamed from: x */
    protected LinearLayout f9353x;
    private int bg = 0;
    private View.OnClickListener ac = new ViewOnClickListenerC1628k();

    /* JADX INFO: renamed from: com.android.thememanager.activity.vep5$k */
    /* JADX INFO: compiled from: OnlineResourceListFragment.java */
    class ViewOnClickListenerC1628k implements View.OnClickListener {
        ViewOnClickListenerC1628k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            vep5 vep5Var = vep5.this;
            vep5Var.d1ts(vep5Var.bg);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!vep5.this.as) {
                vep5.this.wtop().zy(view.getContext());
            } else if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(vep5.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.activity.h7am
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f9063k.toq();
                    }
                });
            } else {
                vep5 vep5Var = vep5.this;
                vep5Var.d1ts(vep5Var.bg);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.vep5$n */
    /* JADX INFO: compiled from: OnlineResourceListFragment.java */
    protected static class AsyncTaskC1629n extends AsyncTask<Void, Void, List<PageItem>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<vep5> f9355k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.android.thememanager.controller.x2 f57355toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.android.thememanager.controller.online.zurt f57356zy;

        public AsyncTaskC1629n(vep5 fragment) {
            this.f9355k = new WeakReference<>(fragment);
            this.f57355toq = fragment.f9283c;
            this.f57356zy = fragment.an;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<PageItem> doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            return this.f57355toq.m7690k().mo7480z(this.f57356zy);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            vep5 vep5Var = this.f9355k.get();
            if (vep5Var == null || vep5Var.getActivity() == null) {
                return;
            }
            vep5Var.bq = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<PageItem> result) {
            vep5 vep5Var = this.f9355k.get();
            if (vep5Var == null || !com.android.thememanager.util.gc3c.cdj(vep5Var.getActivity())) {
                return;
            }
            vep5Var.kz28(result);
            vep5Var.bq = null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.vep5$q */
    /* JADX INFO: compiled from: OnlineResourceListFragment.java */
    class RunnableC1630q implements Runnable {
        RunnableC1630q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vep5.this.f9286j.notifyDataSetChanged();
            if (vep5.this.kiv() == null || vep5.this.kiv().getInt(InterfaceC1357q.f53873fu4, 1) != 2001) {
                return;
            }
            vep5.this.getActivity().setResult(-1);
        }
    }

    /* JADX INFO: compiled from: OnlineResourceListFragment.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f9357k;

        toq(final int val$index) {
            this.f9357k = val$index;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            for (int i2 = 0; i2 < vep5.this.f9353x.getChildCount(); i2++) {
                vep5.this.f9353x.getChildAt(i2).setSelected(false);
            }
            v2.setSelected(true);
            vep5.this.d1ts(this.f9357k);
        }
    }

    /* JADX INFO: compiled from: OnlineResourceListFragment.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0004k<Resource> c0004k = vep5.this.f9286j.qrj().get(0);
            com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
            for (Resource resource : c0004k) {
                if (!vep5.this.f9283c.m7690k().mo7478t(resource) && !o1tVarM8000g.n7h(resource)) {
                    zy.C1711k c1711k = new zy.C1711k();
                    c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.q72;
                    c1711k.f57497zy = "";
                    c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
                    o1tVarM8000g.m8434n(resource, vep5.this.f9059l, c1711k);
                }
            }
        }
    }

    private List<Resource> mi1u(List<Resource> onlineResources) {
        if (onlineResources == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Resource resource : onlineResources) {
            if (this.f9283c.m7690k().mo7478t(resource)) {
                hashSet.add(resource);
            }
        }
        onlineResources.removeAll(hashSet);
        if (bf2.toq.m5812n()) {
            Log.d(C2755a.f16307g, "NonLocalThemes - Local = " + hashSet.size() + ", Non-Local = " + onlineResources.size());
        }
        return onlineResources;
    }

    private void nyj() {
        com.android.thememanager.fu4 fu4Var = this.f9059l;
        if (fu4Var == null || fu4Var.isPicker() || this.f9284e.get() == null) {
            return;
        }
        this.f9059l.setCurrentUsingPath(com.android.thememanager.util.bwp.m9634s(this.f9284e.get(), this.f9059l.getResourceCode()));
        this.f9286j.notifyDataSetChanged();
    }

    private void vwb() {
        new Thread(new zy()).start();
    }

    private void xtb7(List<qrj.f7l8> itemViewWrappers, LinearLayout container, boolean showImmediately) {
        if (itemViewWrappers.isEmpty()) {
            container.setVisibility(8);
            return;
        }
        for (int i2 = 0; i2 < itemViewWrappers.size(); i2++) {
            qrj.f7l8 f7l8Var = itemViewWrappers.get(i2);
            qrj.EnumC1929n enumC1929n = f7l8Var.f57959toq;
            qrj.EnumC1929n enumC1929n2 = qrj.EnumC1929n.NONE;
            int i3 = enumC1929n == enumC1929n2 ? 0 : this.in;
            int i4 = f7l8Var.f10982k == enumC1929n2 ? 0 : this.id;
            f7l8Var.f57960zy.setPaddingRelative(i4, i3, i4, 0);
            container.addView(f7l8Var.f57960zy, new LinearLayout.LayoutParams(-1, -2));
            KeyEvent.Callback callback = f7l8Var.f57960zy;
            if (callback instanceof androidx.lifecycle.fu4) {
                bf2((androidx.lifecycle.fu4) callback);
            }
        }
        if (showImmediately) {
            container.setVisibility(0);
        }
    }

    protected boolean ab() {
        if (kiv() != null) {
            return kiv().getBoolean(InterfaceC1357q.f53883hb, false);
        }
        return false;
    }

    @Override // com.android.thememanager.activity.nsb
    protected View bqie() {
        if (this.f9284e.get() == null) {
            Log.w(ad, "getHeaderView: weakLead is recycle");
            return null;
        }
        if (this.f9351v == null) {
            LinearLayout linearLayout = new LinearLayout(this.f9284e.get());
            this.f9351v = linearLayout;
            linearLayout.setOrientation(1);
            this.f9351v.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f9350u;
        if (linearLayout2 == null) {
            this.f9350u = new LinearLayout(this.f9284e.get());
        } else {
            linearLayout2.removeAllViews();
        }
        this.f9350u.setOrientation(1);
        View view = this.ba;
        if (view != null) {
            this.f9350u.addView(view);
        }
        this.f9350u.addView(this.f9351v);
        return this.f9350u;
    }

    protected PageGroup c25() {
        if (kiv() != null) {
            return (PageGroup) kiv().getSerializable(InterfaceC1357q.f53848bf2);
        }
        return null;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void cn02() {
        super.cn02();
        nyj();
    }

    protected void d1ts(int index) {
        this.bg = index;
        z4j7(index);
        this.as = true;
        this.f9286j.mo6466n();
        if (this.bp.getListUrl() != null) {
            this.f9286j.m6691z(false);
        }
        AsyncTaskC1629n asyncTaskC1629n = this.bq;
        if (asyncTaskC1629n != null) {
            asyncTaskC1629n.cancel(false);
        }
        this.f9351v.removeAllViews();
        this.f9349d.removeAllViews();
        if (this.bp.getItemUrl() != null) {
            vss1();
        }
    }

    @Override // com.android.thememanager.activity.nsb
    protected int el() {
        if (kiv() != null) {
            return kiv().getInt(InterfaceC1357q.f53922nn86, 2);
        }
        return 2;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void exv8() {
        this.in = com.android.thememanager.util.ch.fu4(this.f9284e.get());
        this.id = com.android.thememanager.util.ch.m9687z(this.f9284e.get());
        if (this.az) {
            this.ba = lk().zy();
        }
        super.exv8();
        this.f9288o.setVisibility(8);
        List<Page> pages = this.f57353ab.getPages();
        if (pages.size() <= 1) {
            d1ts(0);
            return;
        }
        if (this.f9284e.get() == null) {
            Log.w(ad, "setupUI mActivityRef is recycle");
            return;
        }
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.tablayout_stub);
        if (viewStub.getParent() != null) {
            viewStub.inflate();
        }
        LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.tablayout);
        this.f9353x = linearLayout;
        linearLayout.setVisibility(0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f9284e.get());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        for (int i2 = 0; i2 < pages.size(); i2++) {
            Page page = pages.get(i2);
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.resource_secondary_tab, (ViewGroup) null);
            textView.setText(page.getTitle());
            textView.setOnClickListener(new toq(i2));
            this.f9353x.addView(textView, layoutParams);
            if (i2 == 0) {
                textView.setSelected(true);
                d1ts(i2);
            }
        }
    }

    protected String f3f() {
        if (kiv() != null) {
            return kiv().getString(InterfaceC1357q.f53927oc);
        }
        return null;
    }

    @Override // com.android.thememanager.activity.nsb
    protected int g0ad() {
        return R.layout.resource_list;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void gb() {
        super.gb();
        this.f57353ab = c25();
        this.bb = f3f();
        z4j7(0);
        this.as = true;
        this.bl = kt06();
        this.az = i3x9();
        this.f9286j.oc(ab());
        this.f9286j.a9(this);
        setHasOptionsMenu(true);
    }

    protected boolean i3x9() {
        if (kiv() != null) {
            return kiv().getBoolean(InterfaceC1357q.f53871fnq8, false);
        }
        return false;
    }

    @Override // com.android.thememanager.activity.nsb
    protected View imd() {
        if (this.f9284e.get() == null) {
            Log.w(ad, "getFooterView: weakLead is recycle");
            return null;
        }
        if (this.f9349d == null) {
            LinearLayout linearLayout = new LinearLayout(this.f9284e.get());
            this.f9349d = linearLayout;
            linearLayout.setOrientation(1);
            this.f9349d.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f57354bo;
        if (linearLayout2 == null) {
            this.f57354bo = new LinearLayout(this.f9284e.get());
        } else {
            linearLayout2.removeAllViews();
        }
        this.f57354bo.setOrientation(1);
        this.f57354bo.addView(this.f9349d);
        this.f57354bo.setPaddingRelative(0, 0, 0, this.in);
        return this.f57354bo;
    }

    @Override // com.android.thememanager.activity.nsb
    protected int kbj(Pair<Integer, Integer> position) {
        return ob();
    }

    protected boolean kt06() {
        if (kiv() != null) {
            return kiv().getBoolean(InterfaceC1357q.f53933qkj8, false);
        }
        return false;
    }

    protected void kz28(List<PageItem> items) {
        boolean z2;
        int size;
        com.android.thememanager.controller.online.qrj qrjVarTjz5 = tjz5();
        if (qrjVarTjz5 == null) {
            return;
        }
        com.android.thememanager.util.cfr<List<PageItem>, List<PageItem>, PageItem> cfrVarCdj = com.android.thememanager.controller.online.qrj.cdj(items);
        List<qrj.f7l8> listX2 = qrjVarTjz5.x2(cfrVarCdj.f16370k);
        List<qrj.f7l8> listX22 = qrjVarTjz5.x2(cfrVarCdj.f61217toq);
        if (cfrVarCdj.f16370k.size() > 0 && listX2.size() > 0 && cfrVarCdj.f16370k.get(0).getType() == PageItem.ItemType.PICTURE) {
            listX2.get(0).f57959toq = qrj.EnumC1929n.NONE;
        }
        View view = this.ba;
        if (view != null) {
            this.f9350u.removeView(view);
            int i2 = 0;
            while (true) {
                if (i2 >= cfrVarCdj.f16370k.size()) {
                    z2 = false;
                    break;
                } else {
                    if (cfrVarCdj.f16370k.get(i2).getType() == PageItem.ItemType.MULTIPLEBUTTON) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z2) {
                if (C2792m.m9862q()) {
                    size = 0;
                    while (true) {
                        if (size >= cfrVarCdj.f16370k.size()) {
                            size = -1;
                            break;
                        } else if (cfrVarCdj.f16370k.get(size).getType() != PageItem.ItemType.SHOPWINDOW) {
                            break;
                        } else {
                            size++;
                        }
                    }
                    if (size == -1) {
                        size = cfrVarCdj.f16370k.size();
                    }
                } else {
                    size = 0;
                }
                qrj.f7l8 f7l8Var = new qrj.f7l8();
                f7l8Var.f57960zy = this.ba;
                listX2.add(size, f7l8Var);
            }
        }
        xtb7(listX2, this.f9351v, true);
        xtb7(listX22, this.f9349d, this.bp.getListUrl() == null || this.ax);
    }

    protected com.android.thememanager.util.wo lk() {
        return new com.android.thememanager.util.wo(getActivity(), this.f9059l);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.i9;
    }

    @Override // com.android.thememanager.activity.nsb
    protected int ob() {
        return 2;
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 2001) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            for (int i2 = 0; i2 < this.f57353ab.getPages().size(); i2++) {
                if (this.f57353ab.getPages().get(i2).getKey().startsWith(InterfaceC1925p.xavr)) {
                    d1ts(i2);
                }
            }
        }
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.local.InterfaceC1744k
    public void onDataSetUpdated() {
        this.f9282b.post(new RunnableC1630q());
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        AsyncTaskC1629n asyncTaskC1629n = this.bq;
        if (asyncTaskC1629n != null) {
            asyncTaskC1629n.cancel(true);
        }
        if (this.f9350u != null) {
            this.f9350u = null;
        }
        if (this.f9351v != null) {
            this.f9351v = null;
        }
        if (this.f57354bo != null) {
            this.f57354bo = null;
        }
        if (this.f9349d != null) {
            this.f9349d = null;
        }
        super.onDestroy();
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.android.thememanager.activity.nsb
    protected void ovdh() {
        this.f9286j.notifyDataSetChanged();
    }

    @Override // com.android.thememanager.activity.nsb
    protected void r6ty(Intent intent) {
        super.r6ty(intent);
        intent.putExtra(InterfaceC1357q.f53973zp, this.bv);
        if (kiv() == null || kiv().getInt(InterfaceC1357q.f53873fu4, 1) != 2001) {
            return;
        }
        intent.putExtra(InterfaceC1357q.f53873fu4, 2001);
    }

    protected com.android.thememanager.controller.online.qrj tjz5() {
        if (this.f9284e.get() != null) {
            return new com.android.thememanager.controller.online.qrj(this.f9284e.get(), this.f9059l);
        }
        Log.w(ad, "getPageItemViewConverter: weakRef is recycle");
        return null;
    }

    protected void vss1() {
        if (this.bq == null) {
            AsyncTaskC1629n asyncTaskC1629n = new AsyncTaskC1629n(this);
            this.bq = asyncTaskC1629n;
            asyncTaskC1629n.executeOnExecutor(C6002g.x2(), new Void[0]);
        }
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k.k
    public List<Resource> w831(List<Resource> data) {
        if (data == null || data.isEmpty()) {
            return data;
        }
        String key = this.bp.getKey();
        if (TextUtils.isEmpty(key)) {
            return data;
        }
        if (!key.startsWith(InterfaceC1925p.xavr)) {
            return (key.startsWith(InterfaceC1925p.y8mq) && key.contains(InterfaceC1925p.vaso)) ? mi1u(data) : data;
        }
        AbstractC1918k.m7561k(EnumC1933t.FAVORITE, true, (Resource[]) data.toArray(new Resource[data.size()]));
        return data;
    }

    @Override // com.android.thememanager.activity.nsb
    protected BatchResourceHandler wt() {
        return com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode()) ? new ThemeAudioBatchHandler(this, this.f9286j, this.f9059l) : com.android.thememanager.util.bwp.ni7(this.f9059l.getResourceCode()) ? new ThemeWallpaperBatchHandler(this, this.f9286j, this.f9059l) : new ThemeBatchResourceHandler(this, this.f9286j, this.f9059l);
    }

    protected com.android.thememanager.util.gvn7 wtop() {
        return new com.android.thememanager.util.gvn7();
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: xm */
    public void ij(List<Resource> result) {
        if (com.android.thememanager.util.gc3c.cdj(getActivity())) {
            super.ij(result);
            this.ax = true;
            boolean z2 = ((result == null || result.isEmpty()) && this.f9286j.getCount() == 0) ? false : true;
            this.f9288o.setVisibility(z2 ? 0 : 8);
            int i2 = C1915g.m7550n() ? 0 : -1;
            this.as = result == null;
            Log.w(ad, "onlineresourceList, errorType: " + i2 + ",mHasError = " + this.as + ",hasData =" + z2);
            if (this.f9352w == null) {
                this.f9352w = z617();
            }
            wtop().m9785k(this.f9352w, xzl(), i2, z2, this.as, this.ac);
            if (this.f9349d.getChildCount() > 0) {
                this.f9349d.setVisibility(0);
            }
        }
    }

    protected int xzl() {
        if (kiv() != null) {
            return kiv().getInt(InterfaceC1357q.f53955vyq, 0);
        }
        return 0;
    }

    protected void z4j7(int index) {
        Page page = this.f57353ab.getPages().get(index);
        this.bp = page;
        this.bv = page.getListUrl();
        this.an = this.bp.getItemUrl();
        ((cv06) this.f9286j).m6402u(this.bv);
        this.ax = false;
        String key = this.bp.getKey();
        if (!TextUtils.isEmpty(key) && key.startsWith(InterfaceC1925p.y8mq) && key.contains(InterfaceC1925p.vaso)) {
            ((cv06) this.f9286j).bo(1);
        } else {
            ((cv06) this.f9286j).bo(0);
        }
    }

    protected ResourceEmptyView z617() {
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.empty_view_stub);
        if (viewStub.getParent() != null) {
            viewStub.inflate();
        }
        return (ResourceEmptyView) getView().findViewById(R.id.empty_view);
    }

    @Override // com.android.thememanager.activity.nsb
    protected pc zff0() {
        return ("aod".equals(this.f9059l.getResourceCode()) || "icons".equals(this.f9059l.getResourceCode())) ? new C1623s(this, this.f9059l) : new cv06(this, this.f9059l);
    }
}
