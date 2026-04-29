package com.android.thememanager.activity;

import a98o.C0004k;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.FilledListView;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.BatchResourceHandler;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ResourceListFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class nsb extends C1582h implements com.android.thememanager.basemodule.async.toq<Void, List<Resource>, List<Resource>>, InterfaceC1744k, InterfaceC1357q, com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: a */
    private boolean f9281a = true;

    /* JADX INFO: renamed from: b */
    protected Handler f9282b;

    /* JADX INFO: renamed from: c */
    protected com.android.thememanager.controller.x2 f9283c;

    /* JADX INFO: renamed from: e */
    protected WeakReference<ActivityC0891q> f9284e;

    /* JADX INFO: renamed from: f */
    protected C2082k f9285f;

    /* JADX INFO: renamed from: j */
    protected pc f9286j;

    /* JADX INFO: renamed from: m */
    protected View f9287m;

    /* JADX INFO: renamed from: o */
    protected FilledListView f9288o;

    /* JADX INFO: renamed from: com.android.thememanager.activity.nsb$k */
    /* JADX INFO: compiled from: ResourceListFragment.java */
    class ViewTreeObserverOnDrawListenerC1616k implements ViewTreeObserver.OnDrawListener {
        ViewTreeObserverOnDrawListenerC1616k() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            nsb nsbVar = nsb.this;
            nsbVar.f9288o.setAdapter((ListAdapter) nsbVar.f9286j);
        }
    }

    /* JADX INFO: compiled from: ResourceListFragment.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nsb.this.f9286j.notifyDataSetChanged();
        }
    }

    private void yp31(Pair<Integer, Integer> position, Intent intent) {
        Resource resource;
        if ("launcher".equals(this.f9059l.getResourceCode()) && (resource = (Resource) com.android.thememanager.basemodule.utils.kja0.m7108g((C0004k) com.android.thememanager.basemodule.utils.kja0.m7108g(C2082k.zy().ld6(), ((Integer) position.second).intValue()), ((Integer) position.first).intValue())) != null) {
            String contentPath = new ResourceResolver(resource, this.f9059l).getContentPath();
            if (TextUtils.isEmpty(contentPath) || new File(contentPath).exists()) {
                return;
            }
            intent.putExtra("REQUEST_RESOURCE_CODE", "miwallpaper");
        }
    }

    protected View bqie() {
        return null;
    }

    protected void btvn() {
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void ch() {
        View view = this.f9287m;
        if (view == null) {
            return;
        }
        Integer numValueOf = ((Integer) view.getTag()) == null ? 0 : Integer.valueOf(r0.intValue() - 1);
        this.f9287m.setTag(numValueOf);
        if (numValueOf.intValue() <= 0) {
            this.f9287m.setVisibility(8);
        }
    }

    protected void cn02() {
        pc pcVar = this.f9286j;
        if (pcVar == null) {
            return;
        }
        this.f9285f.qrj(pcVar.qrj());
        if (this.f9281a) {
            btvn();
            this.f9281a = false;
        } else {
            ovdh();
        }
        this.f9286j.notifyDataSetChanged();
    }

    protected abstract int el();

    protected void exv8() {
        FilledListView filledListView = (FilledListView) getView().findViewById(R.id.list);
        this.f9288o = filledListView;
        filledListView.setFillMode(f1bi());
        View viewBqie = bqie();
        if (viewBqie != null) {
            this.f9288o.addHeaderView(viewBqie);
        }
        View viewImd = imd();
        if (viewImd != null) {
            this.f9288o.addFooterView(viewImd);
        }
        this.f9288o.setDividerHeight(0);
        this.f9287m = getView().findViewById(com.android.thememanager.R.id.loadingprogressbar);
        com.android.thememanager.util.bwp.m9633r(this.f9288o, new ViewTreeObserverOnDrawListenerC1616k());
    }

    protected int f1bi() {
        return 0;
    }

    protected abstract int g0ad();

    protected void gb() {
        pc pcVarZff0 = zff0();
        this.f9286j = pcVarZff0;
        pcVarZff0.zp(this.f9283c);
        BatchResourceHandler batchResourceHandlerWt = wt();
        batchResourceHandlerWt.jk(this.f9283c);
        batchResourceHandlerWt.oc(ob());
        batchResourceHandlerWt.m9556t(el());
        bf2(batchResourceHandlerWt);
        this.f9286j.a98o(batchResourceHandlerWt);
        this.f9282b = new Handler();
    }

    protected View imd() {
        return null;
    }

    protected abstract int kbj(Pair<Integer, Integer> position);

    protected void kq2f() {
        pc pcVar = this.f9286j;
        if (pcVar != null) {
            pcVar.onClean(0);
        }
    }

    /* JADX INFO: renamed from: m */
    protected void m6456m(boolean z2) {
        Integer numValueOf;
        View view = this.f9287m;
        if (view == null) {
            return;
        }
        Integer num = (Integer) view.getTag();
        if (num == null) {
            numValueOf = Integer.valueOf(z2 ? 1 : 0);
        } else {
            numValueOf = Integer.valueOf(num.intValue() + (z2 ? 1 : -1));
        }
        this.f9287m.setTag(numValueOf);
        if (numValueOf.intValue() > 0) {
            this.f9287m.setVisibility(0);
        } else {
            this.f9287m.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: mj, reason: merged with bridge method [inline-methods] */
    public void py(List<Resource>... values) {
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void n7h() {
        m6456m(true);
    }

    protected abstract int ob();

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.f9284e = new WeakReference<>(getActivity());
        C2082k c2082kZy = C2082k.zy();
        this.f9285f = c2082kZy;
        this.f9283c = c2082kZy.m8001n().ld6(this.f9059l);
        gb();
        exv8();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || this.f9284e.get() == null) {
            return;
        }
        ActivityC0891q activityC0891q = this.f9284e.get();
        activityC0891q.setResult(resultCode, data);
        activityC0891q.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(g0ad(), container, false);
    }

    public void onDataSetUpdated() {
        this.f9282b.post(new toq());
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1744k
    public void onDataUpdated(Resource resource) {
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        pc pcVar = this.f9286j;
        if (pcVar != null) {
            pcVar.onClean(4);
            this.f9286j.m6687q(this);
        }
        super.onDestroy();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        pc pcVar = this.f9286j;
        if (pcVar != null) {
            pcVar.onClean(2);
        }
        com.android.thememanager.controller.x2 x2Var = this.f9283c;
        if (x2Var != null) {
            x2Var.m7690k().m7671q(this);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9283c.m7690k().m7669k(this);
        nnh(true);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        pc pcVar = this.f9286j;
        if (pcVar != null) {
            pcVar.onClean(3);
        }
        super.onStop();
    }

    protected void ovdh() {
    }

    public void qh4d(Pair<Integer, Integer> position) {
        Intent intent = new Intent();
        Pair<String, String> pairTww7 = tww7();
        intent.setClassName((String) pairTww7.first, (String) pairTww7.second);
        intent.putExtra(InterfaceC1357q.f53879gvn7, (Serializable) position.first);
        intent.putExtra(InterfaceC1357q.f53893jp0y, (Serializable) position.second);
        intent.putExtra(InterfaceC1357q.f53965y2, kbj(position));
        intent.putExtra("REQUEST_RESOURCE_CODE", this.f9059l.getResourceCode());
        r6ty(intent);
        yp31(position, intent);
        startActivityForResult(intent, intent.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }

    protected void r6ty(Intent intent) {
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public final void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            cn02();
        } else {
            kq2f();
        }
    }

    protected Pair<String, String> tww7() {
        return new Pair<>(this.f9059l.getDetailActivityPackage(), this.f9059l.getDetailActivityClass());
    }

    protected BatchResourceHandler wt() {
        return this.f9059l.getResourceFormat() == 3 ? new ThemeAudioBatchHandler(this, this.f9286j, this.f9059l) : new BatchResourceHandler(this, this.f9286j, this.f9059l);
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: xm, reason: merged with bridge method [inline-methods] */
    public void ij(List<Resource> result) {
        m6456m(false);
    }

    protected abstract pc zff0();
}
