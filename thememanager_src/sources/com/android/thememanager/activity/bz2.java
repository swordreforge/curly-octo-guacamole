package com.android.thememanager.activity;

import a98o.C0004k;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cfr.C1394k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.FilledListView;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.lvui;
import com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment;
import com.android.thememanager.mine.remote.view.activity.RemoteResourcePurchasedTabActivity;
import com.android.thememanager.module.DependencyUtils;
import com.android.thememanager.presenter.C2308g;
import com.android.thememanager.util.BatchResourceHandler;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import com.android.thememanager.util.ThemeBatchResourceHandler;
import com.android.thememanager.util.ThemeWallpaperBatchHandler;
import com.android.thememanager.view.ResourceEmptyView;
import com.android.thememanager.view.ThemePreferenceView;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miui.os.Build;
import miuix.appcompat.app.AbstractC6946k;
import miuix.core.util.C7083n;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: LocalResourceListFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class bz2 extends nsb implements lvui.toq, p001b.f7l8, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected ResourceEmptyView f57293ab;
    private String an;
    private com.android.thememanager.util.gvn7 bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private MenuItem f57294bo;
    private ArrayList<ResolveInfo> bp;
    private Intent bv;

    /* JADX INFO: renamed from: d */
    private com.android.thememanager.view.t8r f8941d;
    private View id;

    /* JADX INFO: renamed from: u */
    private boolean f8942u;

    /* JADX INFO: renamed from: w */
    private boolean f8944w;

    /* JADX INFO: renamed from: x */
    protected com.android.thememanager.lvui f8945x;
    private static final String bl = bz2.class.getSimpleName();
    private static String[] as = {"com.tencent.mtt.browser.file.FilePickActivity", "com.android.soundpicker.RingtonePickerActivity"};

    /* JADX INFO: renamed from: v */
    private String f8943v = Environment.getExternalStorageDirectory().getAbsolutePath();
    private p000a.zy in = new C1564g();

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class f7l8 implements Runnable {
        f7l8() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bz2.this.wwp(true);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$g */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class C1564g implements p000a.zy {
        C1564g() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            bz2.this.f9286j.fu4(true);
            bz2.this.f9286j.notifyDataSetChanged();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(bz2.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$k */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class ViewOnLayoutChangeListenerC1565k implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ View f8948g;

        /* JADX INFO: renamed from: k */
        private int f8949k;

        /* JADX INFO: renamed from: n */
        private Runnable f8950n;

        /* JADX INFO: renamed from: q */
        private Handler f8951q = new Handler();

        /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$k$k */
        /* JADX INFO: compiled from: LocalResourceListFragment.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AbsListView.LayoutParams f8953k;

            k(final AbsListView.LayoutParams val$layoutParams) {
                this.f8953k = val$layoutParams;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewOnLayoutChangeListenerC1565k.this.f8948g.setVisibility(0);
                ViewOnLayoutChangeListenerC1565k.this.f8948g.setLayoutParams(this.f8953k);
            }
        }

        ViewOnLayoutChangeListenerC1565k(final View val$importView) {
            this.f8948g = val$importView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            if (this.f8949k == 0) {
                this.f8949k = this.f8948g.getHeight();
            }
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) this.f8948g.getLayoutParams();
            int height = this.f8949k;
            if (!bz2.this.f9288o.canScrollVertically(1) && !bz2.this.f9288o.canScrollVertically(-1)) {
                height = (bz2.this.f9288o.getHeight() - bz2.this.f9288o.getPaddingBottom()) - this.f8948g.getTop();
            }
            if (height != layoutParams.height) {
                layoutParams.height = height;
                this.f8948g.setVisibility(8);
                this.f8951q.removeCallbacks(this.f8950n);
                Handler handler = this.f8951q;
                k kVar = new k(layoutParams);
                this.f8950n = kVar;
                handler.post(kVar);
            }
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    private static class kja0 extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: k */
        private WeakReference<bz2> f8955k;

        /* JADX INFO: renamed from: n */
        private com.android.thememanager.lvui f8956n;

        /* JADX INFO: renamed from: q */
        private com.android.thememanager.fu4 f8957q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Uri f57295toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f57296zy;

        public kja0(bz2 fragment, Uri uri, int code) {
            this.f8955k = new WeakReference<>(fragment);
            this.f57295toq = uri;
            this.f57296zy = code;
            this.f8956n = fragment.f8945x;
            this.f8957q = fragment.f9059l;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x014e, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
        
            r0 = r13;
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
        
            r1 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0154, code lost:
        
            r13 = null;
         */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.Void... r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.activity.bz2.kja0.doInBackground(java.lang.Void[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            bz2 bz2Var = this.f8955k.get();
            if (bz2Var == null || !com.android.thememanager.util.gc3c.cdj(bz2Var.getActivity())) {
                return;
            }
            bz2Var.m6456m(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String result) {
            super.onPostExecute(result);
            bz2 bz2Var = this.f8955k.get();
            if (bz2Var == null || !com.android.thememanager.util.gc3c.cdj(bz2Var.getActivity())) {
                return;
            }
            bz2Var.m6456m(false);
            if (TextUtils.isEmpty(result)) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.add_resource_detail_fail, 0);
                return;
            }
            if (bz2Var.f9059l.isPicker() && com.android.thememanager.util.bwp.jk(bz2Var.f9059l.getResourceCode())) {
                com.android.thememanager.util.bwp.m9626g(bz2Var.f9059l, bz2Var.getActivity(), result);
            }
            bz2Var.f9286j.mo6466n();
            bz2Var.f9286j.fu4(false);
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class ld6 implements View.OnClickListener {
        ld6() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            bz2.this.kz28();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$n */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class ViewOnClickListenerC1566n implements View.OnClickListener {
        ViewOnClickListenerC1566n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (bz2.this.f9284e.get() == null) {
                Log.d(bz2.bl, "localPicker onClick ActivityRef is recycle");
                return;
            }
            bz2.this.b7();
            Intent intent = new Intent(bz2.this.f9284e.get(), (Class<?>) ThirdPartyPickersActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.putExtra("android.intent.extra.INTENT", bz2.this.bv);
            intent.putExtra("android.intent.extra.ringtone.TITLE", bz2.this.an);
            intent.putExtra(ThirdPartyPickersActivity.f8901q, bz2.this.f9059l.getResourceCode());
            intent.putExtra(ThirdPartyPickersActivity.f8900n, true);
            intent.putExtra(ThirdPartyPickersActivity.f8899g, 101);
            intent.putParcelableArrayListExtra("extra_resolve_info_list", bz2.this.bp);
            bz2.this.startActivityForResult(intent, 101);
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class n7h implements View.OnClickListener {
        n7h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.dw));
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("root_directory", "/");
            intent.putExtra("ext_filter", new String[]{C2308g.f13473z});
            intent.putExtra("ext_file_first", true);
            intent.putExtra("back_to_parent_directory", false);
            bz2.this.startActivityForResult(intent, 100);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$p */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class ViewOnClickListenerC1567p implements View.OnClickListener {
        ViewOnClickListenerC1567p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            com.android.thememanager.basemodule.utils.o1t.m7173n(bz2.this.getActivity(), bz2.this, 1);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$q */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class ViewOnClickListenerC1568q implements View.OnClickListener {
        ViewOnClickListenerC1568q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (bz2.this.f9284e.get() == null) {
                Log.w(bz2.bl, "onlinePicker onClick mActivityRef is recycle");
                return;
            }
            bz2.this.startActivityForResult(C1394k.m5861k(bz2.this.f9284e.get(), bz2.this.getString(R.string.resource_online_picker), z4.toq.m28201k(), "ringtone", bz2.this.f9059l.isPicker(), -1), 105);
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class qrj implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f8963k;

        qrj(final String val$resourceCode) {
            this.f8963k = val$resourceCode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (bz2.this.f9284e.get() == null) {
                Log.w(bz2.bl, "onClick WeakLeak mActivityRef is recycle");
                return;
            }
            bz2.this.b7();
            Intent intent = new Intent(bz2.this.f9284e.get(), (Class<?>) ThirdPartyPickersActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.putExtra("android.intent.extra.INTENT", bz2.this.bv);
            intent.putExtra(ThirdPartyPickersActivity.f8900n, true);
            intent.putExtra(ThirdPartyPickersActivity.f8901q, this.f8963k);
            intent.putParcelableArrayListExtra("extra_resolve_info_list", bz2.this.bp);
            if (com.android.thememanager.util.bwp.ki(this.f8963k)) {
                bz2.this.startActivityForResult(intent, 101);
            } else if (com.android.thememanager.util.bwp.ni7(this.f8963k)) {
                C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.l0u));
                bz2.this.startActivityForResult(intent, 102);
            }
            bz2.this.f9284e.get().overridePendingTransition(R.anim.push_up_in, android.R.anim.fade_out);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$s */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class RunnableC1569s implements Runnable {
        RunnableC1569s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bz2.this.wwp(false);
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class toq implements BatchResourceHandler.f7l8 {
        toq() {
        }

        @Override // com.android.thememanager.util.BatchResourceHandler.f7l8
        /* JADX INFO: renamed from: h */
        public void mo6399h() {
            if (bz2.this.getView().findViewById(R.id.select_others_fab) != null) {
                C6077k.zy(bz2.this.getView().findViewById(R.id.select_others_fab));
            }
        }

        @Override // com.android.thememanager.util.BatchResourceHandler.f7l8
        public void x2() {
            if (bz2.this.getView().findViewById(R.id.select_others_fab) != null) {
                C6077k.m22370k(bz2.this.getView().findViewById(R.id.select_others_fab));
            }
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class x2 implements C1688q.n {
        x2() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            Intent intentW831 = RemoteResourcePurchasedTabActivity.w831(bz2.this.getActivity(), bz2.this.f9059l.getResourceCode());
            intentW831.putExtra(InterfaceC1357q.f53866eqxt, bz2.this.getResources().getString(R.string.order_list));
            bz2.this.getActivity().startActivityForResult(intentW831, 1);
            bz2.this.uo();
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.vf);
            arrayMapZy.put("entryType", com.android.thememanager.basemodule.analysis.toq.w82);
            C1708s.f7l8().ld6().ni7(arrayMapZy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.bz2$y */
    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class RunnableC1570y implements Runnable {
        RunnableC1570y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bz2.this.f9286j.fu4(false);
            bz2.this.wwp(false);
        }
    }

    /* JADX INFO: compiled from: LocalResourceListFragment.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bz2.this.oph();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b7() {
        String resourceCode = this.f9059l.getResourceCode();
        if (this.bp == null) {
            if ("wallpaper".equals(resourceCode) || "lockscreen".equals(resourceCode)) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                this.bv = intent;
                intent.addCategory("android.intent.category.OPENABLE");
                this.bv.setType("image/*");
            } else {
                Intent intent2 = new Intent("android.intent.action.RINGTONE_PICKER");
                this.bv = intent2;
                intent2.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", false);
                this.bv.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                this.bv.putExtra("android.intent.extra.ringtone.TYPE", com.android.thememanager.util.bwp.cdj(resourceCode));
            }
            ArrayList<ResolveInfo> arrayListM7244c = com.android.thememanager.basemodule.utils.y9n.m7244c(this.bv);
            this.bp = arrayListM7244c;
            i3x9(arrayListM7244c);
        }
    }

    private void d1ts() {
        String resourceCode = this.f9059l.getResourceCode();
        if (com.android.thememanager.util.bwp.ki(resourceCode) || com.android.thememanager.util.bwp.ni7(resourceCode)) {
            ViewStub viewStub = (ViewStub) getView().findViewById(R.id.select_others_fab_stub);
            if (viewStub.getParent() != null) {
                viewStub.inflate();
            }
            View viewFindViewById = getView().findViewById(R.id.select_others_fab);
            viewFindViewById.setVisibility(0);
            C1812k.m7106k(viewFindViewById, R.string.accessibiliy_description_content_add_resource);
            C6077k.o1t(viewFindViewById);
            viewFindViewById.setOnClickListener(new qrj(resourceCode));
        }
    }

    private void f3f() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.res_need_goto_purchase_list_bar, (ViewGroup) null, false);
        this.f9288o.addHeaderView(viewInflate);
        viewInflate.setOnClickListener(new ld6());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1an(View view) {
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("EXTRA_TAB_ID", "aod");
        startActivity(intent);
        getActivity().finish();
    }

    private void i3x9(ArrayList<ResolveInfo> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : as) {
                for (ResolveInfo resolveInfo : list) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && str.equals(activityInfo.name)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            list.removeAll(arrayList);
        }
    }

    private void kl7m() {
        if (this.f57294bo != null) {
            this.f57294bo.setEnabled(DependencyUtils.MamlWrapper.mamlContainsLockStyleConfig());
        }
    }

    private boolean kt06() {
        return C2082k.zy().toq().getSharedPreferences(BaseLocalResourceFragment.f12738w, 0).getBoolean(BaseLocalResourceFragment.f60451ab, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kz28() {
        C1688q.cdj().fti(getActivity(), new x2());
    }

    private boolean m8() {
        boolean z2 = !kt06();
        if (z2 && this.f9283c.m7690k() != null && this.f9283c.m7690k().kja0() != null && !this.f9283c.m7690k().kja0().isEmpty()) {
            for (Resource resource : this.f9283c.m7690k().kja0()) {
                if (ResourceLocalProperties.ResourceStorageType.SYSTEM != resource.getResourceStorageType() && ResourceLocalProperties.ResourceStorageType.PRECUST != resource.getResourceStorageType()) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    private View nyj() {
        if (this.f9284e.get() == null) {
            Log.w(bl, "getAudioPickerHead: mActivityRef is recycle");
            return null;
        }
        View viewInflate = LayoutInflater.from(this.f9284e.get()).inflate(R.layout.resource_list_ringtone_picker_header_layout, getView() == null ? null : (ViewGroup) getView().findViewById(R.id.list_container), false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_head_line);
        ThemePreferenceView themePreferenceView = (ThemePreferenceView) viewInflate.findViewById(R.id.online_picker);
        ThemePreferenceView themePreferenceView2 = (ThemePreferenceView) viewInflate.findViewById(R.id.local_picker);
        if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
            int dimensionPixelOffset = getActivity().getResources().getDimensionPixelOffset(R.dimen.ring_list_head_padding_start);
            int dimensionPixelOffset2 = getActivity().getResources().getDimensionPixelOffset(R.dimen.ring_list_head_padding_end);
            themePreferenceView.setBackground(null);
            themePreferenceView.setPaddingHorzintal(dimensionPixelOffset, dimensionPixelOffset2);
            themePreferenceView2.setBackground(null);
            themePreferenceView2.setPaddingHorzintal(dimensionPixelOffset, dimensionPixelOffset2);
            viewFindViewById.setVisibility(0);
        }
        if (!com.android.thememanager.basemodule.utils.toq.m7224q(this.f9059l.getResourceCode()) || Build.IS_TABLET) {
            themePreferenceView.setVisibility(8);
        } else {
            themePreferenceView.setVisibility(0);
            ((TextView) themePreferenceView.findViewById(R.id.title)).setText(R.string.resource_online_picker);
            themePreferenceView.setOnClickListener(new ViewOnClickListenerC1568q());
        }
        ((TextView) themePreferenceView2.findViewById(R.id.title)).setText(R.string.resource_local_picker);
        themePreferenceView2.setOnClickListener(new ViewOnClickListenerC1566n());
        C6077k.n7h(themePreferenceView);
        C6077k.n7h(themePreferenceView2);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oph() {
        if (this.f8944w) {
            return;
        }
        if (C1792n.wvg(this.f9059l.getResourceCode()) || C1792n.fu4(this.f9059l.getResourceCode()) || C1792n.eqxt(this.f9059l.getResourceCode()) || C1792n.lvui(this.f9059l.getResourceCode())) {
            this.f8941d.n7h();
        }
    }

    private void sc() {
        if (this.id == null || ula6()) {
            return;
        }
        this.f9288o.removeHeaderView(this.id);
        this.id = null;
    }

    private void tjz5() {
        if (ula6() && this.id == null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.res_enable_aod_list_bar, (ViewGroup) null, false);
            this.id = viewInflate;
            this.f9288o.addHeaderView(viewInflate);
            this.id.setOnClickListener(new ViewOnClickListenerC1567p());
        }
    }

    private boolean ula6() {
        return "aod".equals(this.f9059l.getResourceCode()) && C1819o.m7153f() && this.f9283c.m7690k() != null && this.f9286j.getCount() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uo() {
        SharedPreferences.Editor editorEdit = C2082k.zy().toq().getSharedPreferences(BaseLocalResourceFragment.f12738w, 0).edit();
        editorEdit.putBoolean(BaseLocalResourceFragment.f60451ab, true);
        editorEdit.apply();
    }

    private View vss1() {
        if (this.f8944w) {
            return null;
        }
        return this.f8941d.x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wwp(boolean visibility) {
        if (this.f8942u != visibility) {
            this.f8942u = visibility;
            m6456m(visibility);
        }
    }

    private void zuf() {
        if (this.f9059l.isPicker()) {
            if (this.f9286j.uv6().m7690k() instanceof C1902k) {
                ((C1902k) this.f9286j.uv6().m7690k()).w831();
                this.f9286j.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (this.f9284e.get() == null) {
            Log.w(bl, "refreshCurrentUsingFlags: mActivityRef is recycle");
            return;
        }
        this.f9059l.setCurrentUsingPath(com.android.thememanager.util.bwp.m9634s(this.f9284e.get(), this.f9059l.getResourceCode()));
        this.f9286j.notifyDataSetChanged();
    }

    @Override // com.android.thememanager.activity.nsb
    protected View bqie() {
        if (this.f9284e.get() == null) {
            Log.w(bl, "getHeaderView activityRef is recycle");
            return null;
        }
        if (com.android.thememanager.util.bwp.t8r(this.f9059l.getResourceCode()) || C1792n.fu4(this.f9059l.getResourceCode()) || C1792n.eqxt(this.f9059l.getResourceCode())) {
            return vss1();
        }
        if (!"wallpaper".equals(com.android.thememanager.util.bwp.n7h(this.f9059l))) {
            return (this.f9059l.isPicker() && com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode())) ? nyj() : super.bqie();
        }
        LinearLayout linearLayout = new LinearLayout(this.f9284e.get());
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void cn02() {
        super.cn02();
        if (this.f9059l == null) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("resourceType", this.f9059l.getResourceCode());
        C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.tn, null, arrayMap));
        if (!this.f9059l.isSelfDescribing()) {
            C2082k.zy().m8004y().m8503s(this.f9059l, false);
        }
        oph();
        zuf();
        kl7m();
    }

    @Override // com.android.thememanager.activity.nsb
    protected int el() {
        if (kiv() != null) {
            return kiv().getInt(InterfaceC1357q.f53922nn86, 1);
        }
        return 1;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void exv8() {
        AbstractC6946k appCompatActionBar;
        super.exv8();
        if (com.android.thememanager.util.bwp.t8r(this.f9059l.getResourceCode()) || C1792n.fu4(this.f9059l.getResourceCode()) || C1792n.eqxt(this.f9059l.getResourceCode())) {
            if (this.f8941d.ld6() != 8) {
                return;
            }
            if (m8()) {
                f3f();
            }
        } else if ((C1792n.fti(this.f9059l.getResourceCode()) || com.android.thememanager.util.bwp.o1t(this.f9059l.getResourceCode())) && m8()) {
            f3f();
        }
        if (com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode())) {
            FilledListView filledListView = this.f9288o;
            filledListView.setSelection(filledListView.getHeaderViewsCount());
        }
        if (this.f8944w && (this.f9284e.get() instanceof miuix.appcompat.app.t8r) && (appCompatActionBar = ((miuix.appcompat.app.t8r) this.f9284e.get()).getAppCompatActionBar()) != null) {
            appCompatActionBar.xwq3(R.string.app_name);
        }
        setHasOptionsMenu(true);
        if (this.f9059l.isPicker()) {
            this.an = (String) this.f9059l.getExtraMeta("android.intent.extra.ringtone.TITLE");
        } else {
            d1ts();
        }
    }

    @Override // com.android.thememanager.activity.nsb
    protected int f1bi() {
        if (com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode())) {
            return 2;
        }
        return super.f1bi();
    }

    @Override // com.android.thememanager.activity.nsb
    protected int g0ad() {
        return R.layout.resource_list;
    }

    @Override // com.android.thememanager.activity.nsb
    protected void gb() {
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra(InterfaceC1357q.f53959wo, false);
        this.f8944w = booleanExtra;
        if (!booleanExtra) {
            this.f8941d = new com.android.thememanager.view.t8r(getActivity(), this.f9059l, this.f9283c);
        }
        super.gb();
        com.android.thememanager.lvui lvuiVarZ4j7 = z4j7();
        this.f8945x = lvuiVarZ4j7;
        lvuiVarZ4j7.m8165p(this);
        C7083n.m25586k(this.f9059l.getBaseImageCacheFolder());
    }

    @Override // com.android.thememanager.activity.nsb
    protected View imd() {
        View viewImd = super.imd();
        if (viewImd != null) {
            return viewImd;
        }
        if (this.f9284e.get() == null) {
            Log.w(bl, "getFooterView mActivityRef.get() is recycle");
            return null;
        }
        String resourceCode = this.f9059l.getResourceCode();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f9284e.get());
        if (!com.android.thememanager.util.bwp.dd(resourceCode)) {
            return (com.android.thememanager.util.bwp.ki(resourceCode) || com.android.thememanager.util.bwp.ni7(resourceCode) || InterfaceC1789q.gx2z.equals(resourceCode)) ? layoutInflaterFrom.inflate(R.layout.list_above_fab_view, (ViewGroup) null, false) : viewImd;
        }
        boolean z2 = getActivity().getIntent().getIntExtra("category_type", -1) == 0;
        if (this.f8944w || z2) {
            return viewImd;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.theme_import_from_sdcard_btn_layout, (ViewGroup) null, false);
        viewInflate.findViewById(R.id.import_btn).setOnClickListener(new n7h());
        C6077k.ni7(viewInflate.findViewById(R.id.import_btn));
        viewInflate.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1565k(viewInflate));
        return viewInflate;
    }

    @Override // com.android.thememanager.activity.nsb
    protected int kbj(Pair<Integer, Integer> position) {
        C0004k<Resource> c0004k;
        Resource resource;
        List<C0004k<Resource>> listQrj = this.f9286j.qrj();
        return (listQrj == null || (c0004k = listQrj.get(((Integer) position.second).intValue())) == null || (resource = c0004k.get(((Integer) position.first).intValue())) == null) ? ob() : TextUtils.isEmpty(resource.getLocalId()) ? 2 : 1;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return String.format(com.android.thememanager.basemodule.analysis.toq.qoo, this.f9059l.getResourceStamp());
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: n */
    public void mo6395n(Resource resource) {
        this.f9282b.post(new RunnableC1570y());
    }

    @Override // com.android.thememanager.activity.nsb
    protected int ob() {
        return 1;
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (data == null) {
            return;
        }
        if (com.android.thememanager.util.bwp.zurt(this.f9059l.getResourceCode()) && this.f9059l.isPicker()) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (requestCode == 105) {
            String stringExtra = data.getStringExtra("RESPONSE_PICKED_RESOURCE");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            com.android.thememanager.util.bwp.m9626g(this.f9059l, this.f9284e.get(), stringExtra);
            return;
        }
        Uri data2 = requestCode == 101 ? (Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : data.getData();
        if (data2 == null) {
            return;
        }
        new kja0(this, data2, requestCode).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.android.thememanager.basemodule.utils.lvui.kja0(this, this.in);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if (InterfaceC1789q.gx2z.equals(this.f9059l.getResourceCode())) {
            MenuItem menuItemAdd = menu.add(0, R.string.lockstyle_personal_settings, 0, R.string.lockstyle_personal_settings);
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(R.drawable.action_setting);
            this.f57294bo = menuItemAdd;
            kl7m();
        }
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.local.InterfaceC1744k
    public void onDataSetUpdated() {
        super.onDataSetUpdated();
        if (com.android.thememanager.util.bwp.t8r(this.f9059l.getResourceCode()) || C1792n.fu4(this.f9059l.getResourceCode()) || C1792n.eqxt(this.f9059l.getResourceCode()) || C1792n.lvui(this.f9059l.getResourceCode())) {
            this.f9282b.post(new zy());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        if (this.f9284e.get() == null) {
            Log.w(bl, "onOptionsItemSelected: onOptionsItemSelected mActivityRef is recycle");
            return false;
        }
        if (item.getItemId() != R.string.lockstyle_personal_settings) {
            if (item.getItemId() != R.string.settings) {
                return super.onOptionsItemSelected(item);
            }
            startActivity(new Intent(this.f9284e.get(), (Class<?>) ThemePreferenceActivity.class));
            return true;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f9284e.get(), DependencyUtils.MamlWrapper.MamlSettingClass));
        intent.putExtra(DependencyUtils.MamlWrapper.EXTRA_MAML_CODE, InterfaceC1789q.gx2z);
        intent.putExtra(DependencyUtils.MamlWrapper.EXTRA_MAML_ID, com.android.thememanager.util.g1.m9751o(InterfaceC1789q.gx2z));
        startActivity(intent);
        return true;
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        this.f8945x.ld6();
        super.onPause();
        wwp(false);
    }

    @Override // com.android.thememanager.activity.nsb, androidx.fragment.app.Fragment
    public void onResume() {
        this.f8945x.m8168y();
        super.onResume();
        this.f9286j.fu4(false);
        if (this.f8945x.m8162g()) {
            wwp(true);
        }
        sc();
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: p */
    public void mo6396p(Resource resource) {
        this.f9282b.post(new RunnableC1569s());
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: q */
    public void mo6397q(Resource resource) {
        this.f9282b.post(new f7l8());
    }

    @Override // com.android.thememanager.lvui.toq
    public void toq(Resource resource, int downloadBytes, int totalBytes) {
    }

    @Override // com.android.thememanager.activity.nsb
    protected BatchResourceHandler wt() {
        BatchResourceHandler themeAudioBatchHandler = com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode()) ? new ThemeAudioBatchHandler(this, this.f9286j, this.f9059l) : com.android.thememanager.util.bwp.ni7(this.f9059l.getResourceCode()) ? new ThemeWallpaperBatchHandler(this, this.f9286j, this.f9059l) : new ThemeBatchResourceHandler(this, this.f9286j, this.f9059l);
        themeAudioBatchHandler.mcp(new toq());
        return themeAudioBatchHandler;
    }

    @Override // com.android.thememanager.activity.nsb, com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: xm */
    public void ij(List<Resource> result) {
        if (com.android.thememanager.util.gc3c.cdj(getActivity())) {
            super.ij(result);
            if (this.f9286j.getCount() != 0) {
                ResourceEmptyView resourceEmptyView = this.f57293ab;
                if (resourceEmptyView != null) {
                    resourceEmptyView.setVisibility(8);
                }
                tjz5();
                return;
            }
            if (this.f57293ab == null) {
                ViewStub viewStub = (ViewStub) getView().findViewById(R.id.empty_view_stub);
                if (viewStub.getParent() != null) {
                    viewStub.inflate();
                }
                this.f57293ab = (ResourceEmptyView) getView().findViewById(R.id.empty_view);
            }
            if (this.bb == null) {
                this.bb = new com.android.thememanager.util.gvn7();
            }
            if (!C1792n.fu4(this.f9059l.getResourceCode())) {
                this.bb.m9785k(this.f57293ab, 6, 6, false, false, null);
                return;
            }
            this.bb.m9785k(this.f57293ab, 7, 7, false, false, null);
            this.f57293ab.findViewById(R.id.compound_view).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.zkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9427k.i1an(view);
                }
            });
            this.f57293ab.setClickable(false);
            C6077k.m22367g(this.f57293ab);
            C6077k.m22369i(this.f57293ab.findViewById(R.id.compound_view));
        }
    }

    protected com.android.thememanager.lvui z4j7() {
        return new com.android.thememanager.lvui(this.f9284e.get());
    }

    @Override // com.android.thememanager.activity.nsb
    protected pc zff0() {
        if (com.android.thememanager.util.bwp.ki(this.f9059l.getResourceCode())) {
            return new bwp(this, this.f9059l);
        }
        if (com.android.thememanager.util.bwp.ni7(this.f9059l.getResourceCode())) {
            return new b3e(this, this.f9059l);
        }
        return new gc3c(this, this.f9059l, getActivity().getIntent().getIntExtra("category_type", -1) == 0);
    }
}
