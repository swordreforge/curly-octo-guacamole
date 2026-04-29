package com.android.thememanager.activity;

import a98o.C0004k;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.wvg;
import com.android.thememanager.model.ListParams;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.PathVideoEntry;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.router.detail.callback.StartCommentEditActivityListener;
import com.android.thememanager.util.ResourcePreviewAssistant;
import com.android.thememanager.v9.ld6;
import com.android.thememanager.view.ResourceScreenView;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ResourceDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class ij extends C1582h implements InterfaceC1357q, InterfaceC1925p, InterfaceC1789q, ResourcePreviewAssistant.InterfaceC2747g, ld6.InterfaceC2868k.k, ld6.toq.InterfaceC2869k, com.android.thememanager.basemodule.analysis.toq {
    static final String an = "screen_index_tag";
    private static final String id = "current_resource";

    /* JADX INFO: renamed from: a */
    protected Button f9069a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected Handler f57309ab;

    /* JADX INFO: renamed from: b */
    protected Resource f9070b;
    private boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected ResourceScreenView f57310bo;
    private boolean bp;

    /* JADX INFO: renamed from: c */
    protected com.android.thememanager.controller.x2 f9071c;

    /* JADX INFO: renamed from: d */
    protected com.android.thememanager.controller.online.zurt f9072d;

    /* JADX INFO: renamed from: e */
    protected List<C0004k<Resource>> f9073e;

    /* JADX INFO: renamed from: f */
    protected WallpaperDetailActivity f9074f;

    /* JADX INFO: renamed from: j */
    protected C0004k<Resource> f9075j;

    /* JADX INFO: renamed from: o */
    protected int f9077o;

    /* JADX INFO: renamed from: u */
    protected Button f9078u;

    /* JADX INFO: renamed from: v */
    protected ResourcePreviewAssistant f9079v;

    /* JADX INFO: renamed from: x */
    protected TextView f9081x;

    /* JADX INFO: renamed from: m */
    protected int f9076m = -1;

    /* JADX INFO: renamed from: w */
    protected Set<AbstractAsyncTaskC1713n<?, ?, ?>> f9080w = new HashSet();
    private AbstractC1918k.k<List<wvg.toq>> bv = new C1585k();

    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    protected static class f7l8 extends AbstractAsyncTaskC1588s<Void, Void, List<Resource>> {

        /* JADX INFO: renamed from: g */
        private C0004k<Resource> f9082g;

        /* JADX INFO: renamed from: n */
        private com.android.thememanager.controller.online.zurt f9083n;

        /* JADX INFO: renamed from: q */
        private com.android.thememanager.controller.x2 f9084q;

        public f7l8(ij f2, String uniqueId) {
            super(f2, uniqueId);
            this.f9084q = f2.f9071c;
            this.f9083n = f2.f9072d;
            this.f9082g = f2.f9075j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.activity.ij.AbstractAsyncTaskC1588s
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo6413g(List<Resource> result) {
            ij ijVar = this.f57313zy.get();
            if (ijVar == null || !com.android.thememanager.util.gc3c.cdj(ijVar.getActivity())) {
                return;
            }
            ijVar.xzl(result);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public List<Resource> doInBackground(Void... params) {
            return this.f9084q.m7690k().fn3e(new ListParams(this.f9083n, this.f9082g.getPage()));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$g */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    protected static class AsyncTaskC1584g extends AbstractAsyncTaskC1588s<Resource, Void, Resource> {

        /* JADX INFO: renamed from: g */
        private com.android.thememanager.fu4 f9085g;

        /* JADX INFO: renamed from: n */
        private com.android.thememanager.controller.x2 f9086n;

        /* JADX INFO: renamed from: q */
        private int f9087q;

        public AsyncTaskC1584g(ij f2, int validIndex, String uniqueId) {
            super(f2, uniqueId);
            this.f9087q = validIndex;
            this.f9086n = f2.f9071c;
            this.f9085g = f2.f9059l;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.activity.ij.AbstractAsyncTaskC1588s
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo6413g(Resource result) {
            ij ijVar = this.f57313zy.get();
            if (ijVar == null || !com.android.thememanager.util.gc3c.cdj(ijVar.getActivity())) {
                return;
            }
            ijVar.z617(this.f9087q, result);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Resource doInBackground(Resource... params) {
            Resource resource = params[0];
            return resource.getOnlineId() != null ? this.f9086n.m7690k().mo7475i(resource.getOnlineId(), false) : resource;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$k */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    class C1585k implements AbstractC1918k.k<List<wvg.toq>> {
        C1585k() {
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        /* JADX INFO: renamed from: k */
        public void mo6418k() {
            ij.this.bp = true;
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void zy(List<wvg.toq> results) {
            ij.this.bp = false;
            if (results.size() > 0) {
                ij.this.f9070b.setLike(Boolean.valueOf(results.get(0).f57969toq));
                ij.this.f9070b.setLikeCount(Integer.valueOf(results.get(0).f57970zy));
            }
        }

        @Override // com.android.thememanager.controller.online.AbstractC1918k.k
        public Resource[] toq() {
            return new Resource[]{ij.this.f9070b};
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$n */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    public static class AsyncTaskC1586n extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: g */
        private int f9089g;

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f9090k;

        /* JADX INFO: renamed from: n */
        private WeakReference<Activity> f9091n;

        /* JADX INFO: renamed from: q */
        private C0004k<Resource> f9092q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.android.thememanager.controller.x2 f57311toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Resource f57312zy;

        public AsyncTaskC1586n(Activity activity, com.android.thememanager.controller.x2 controller, Resource resource, C0004k<Resource> groupDataSet, int position) {
            this.f57311toq = controller;
            this.f57312zy = resource;
            this.f9092q = groupDataSet;
            this.f9091n = new WeakReference<>(activity);
            this.f9089g = position;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            this.f57311toq.m7690k().fti(this.f57312zy);
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            Activity activity = this.f9091n.get();
            if (com.android.thememanager.util.gc3c.cdj(activity)) {
                miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(activity);
                this.f9090k = ddVar;
                ddVar.y2(0);
                this.f9090k.n5r1(activity.getString(R.string.deleting));
                this.f9090k.setCancelable(false);
                this.f9090k.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            Activity activity = this.f9091n.get();
            if (com.android.thememanager.util.gc3c.cdj(activity)) {
                this.f9090k.dismiss();
                this.f9092q.remove(this.f9089g);
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$q */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    class C1587q implements C1688q.n {
        C1587q() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            boolean z2 = !EnumC1933t.LIKE.contains(ij.this.f9070b);
            com.android.thememanager.basemodule.analysis.kja0.m6641s(z2 ? "LIKE" : "DIS_LIKE", ij.this.kx3(), null, null);
            C1708s.f7l8().ld6().n5r1(z2 ? "LIKE" : "DIS_LIKE", C1706p.kja0(ij.this.kx3(), null, ""));
            com.android.thememanager.controller.online.wvg wvgVarZy = com.android.thememanager.controller.online.wvg.zy();
            ij ijVar = ij.this;
            wvgVarZy.m7637q(z2, ijVar.f9074f, ijVar.bv);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$s */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    protected static abstract class AbstractAsyncTaskC1588s<Params, Progress, Result> extends AbstractAsyncTaskC1713n<Params, Progress, Result> {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        protected WeakReference<? extends ij> f57313zy;

        public AbstractAsyncTaskC1588s(ij f2, String uniqueId) {
            super(uniqueId);
            this.f57313zy = new WeakReference<>(f2);
        }

        protected void f7l8() {
        }

        /* JADX INFO: renamed from: g */
        protected void mo6413g(Result result) {
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        protected final void onPostExecute(Result result) {
            ij ijVar = this.f57313zy.get();
            if (ijVar == null || !com.android.thememanager.util.gc3c.cdj(ijVar.f9074f)) {
                return;
            }
            super.onPostExecute(result);
            ijVar.f9080w.remove(this);
            mo6413g(result);
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        protected final void onPreExecute() {
            super.onPreExecute();
            ij ijVar = this.f57313zy.get();
            if (ijVar == null || !com.android.thememanager.util.gc3c.cdj(ijVar.getActivity())) {
                return;
            }
            ijVar.f9080w.add(this);
            f7l8();
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n
        /* JADX INFO: renamed from: q */
        protected final boolean mo6421q() {
            ij ijVar = this.f57313zy.get();
            return ijVar != null && ijVar.f9080w.contains(this);
        }
    }

    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ij.this.z4j7();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ij$y */
    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    protected enum EnumC1589y {
        NORMAL,
        LOADING,
        FAILED
    }

    /* JADX INFO: compiled from: ResourceDetailFragment.java */
    class zy implements StartCommentEditActivityListener {

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f9096k;

        /* JADX INFO: renamed from: com.android.thememanager.activity.ij$zy$k */
        /* JADX INFO: compiled from: ResourceDetailFragment.java */
        class DialogInterfaceOnCancelListenerC1590k implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AsyncTask f9097k;

            DialogInterfaceOnCancelListenerC1590k(final AsyncTask val$asyncTask) {
                this.f9097k = val$asyncTask;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialog) {
                this.f9097k.cancel(false);
            }
        }

        /* JADX INFO: compiled from: ResourceDetailFragment.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (zy.this.f9096k == null || ij.this.f9074f.isFinishing()) {
                    return;
                }
                zy.this.f9096k.show();
            }
        }

        zy() {
        }

        @Override // com.android.thememanager.router.detail.callback.StartCommentEditActivityListener
        public void onPostExecute(AsyncTask<?, ?, ?> asyncTask, boolean result) {
            if (ij.this.f9074f.isFinishing()) {
                return;
            }
            ij.this.bb = false;
            this.f9096k.dismiss();
            this.f9096k = null;
        }

        @Override // com.android.thememanager.router.detail.callback.StartCommentEditActivityListener
        public void onPreExecute(final AsyncTask<?, ?, ?> asyncTask) {
            ij.this.bb = true;
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(ij.this.f9074f);
            this.f9096k = ddVar;
            ddVar.y2(0);
            this.f9096k.setCanceledOnTouchOutside(false);
            this.f9096k.n5r1(ij.this.f9074f.getString(R.string.resource_comment_edit_comment_waiting));
            this.f9096k.setOnCancelListener(new DialogInterfaceOnCancelListenerC1590k(asyncTask));
            ij.this.f57309ab.postDelayed(new toq(), 500L);
        }
    }

    private void d1ts(String event) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("name", this.f9070b.getTitle());
        arrayMapM6679k.put("productId", this.f9070b.getOnlineId());
        arrayMapM6679k.put("resourceType", this.f9059l.getResourceCode());
        C1708s.f7l8().ld6().n5r1(event, C1706p.n7h(kx3(), this.f9070b.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    private void f1bi(List<String> previews) {
        String resourceCode = this.f9059l.getResourceCode();
        if (previews == null || !"theme".equals(resourceCode)) {
            return;
        }
        Iterator<RelatedResource> it = this.f9070b.getSubResources().iterator();
        while (it.hasNext()) {
            String resourceCode2 = it.next().getResourceCode();
            String strNi7 = p001b.toq.ni7(resourceCode2);
            if (!com.android.thememanager.basemodule.analysis.toq.lbeq.equals(strNi7) && !"framework".equals(strNi7) && !com.android.thememanager.util.g1.m9748l(this.f9070b.getLocalPlatform(), strNi7)) {
                String strM5743p = p001b.toq.m5743p(resourceCode2);
                Iterator<String> it2 = previews.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (next == null || next.contains(strM5743p)) {
                        it2.remove();
                    }
                }
            }
        }
        for (String str : InterfaceC1789q.mkj5) {
            Iterator<String> it3 = previews.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (next2 == null || (next2.contains(str) && previews.size() > 1)) {
                    it3.remove();
                }
            }
        }
    }

    private int mj() {
        return InterfaceC1789q.t9.equals(this.f9075j.get(this.f9076m).getLocalInfo().getScreenRatio()) ? R.fraction.resource_preview_ratio_18_9 : R.fraction.resource_preview_ratio;
    }

    private List<PathEntry> xm() {
        List<PathEntry> previews;
        ArrayList arrayList = new ArrayList();
        ResourceResolver resourceResolver = new ResourceResolver(this.f9070b, this.f9059l);
        if (!xblq()) {
            List<String> buildInPreviews = resourceResolver.getBuildInPreviews();
            f1bi(buildInPreviews);
            if (buildInPreviews != null && !buildInPreviews.isEmpty()) {
                Iterator<String> it = buildInPreviews.iterator();
                while (it.hasNext()) {
                    arrayList.add(new PathEntry(it.next(), null));
                }
            }
        }
        if (arrayList.isEmpty() && (previews = resourceResolver.getPreviews()) != null) {
            if (this.f9070b.hasVideo()) {
                PathVideoEntry pathVideoEntry = new PathVideoEntry();
                ResourceInfo onlineInfo = this.f9070b.getOnlineInfo();
                pathVideoEntry.setOnlinePath(onlineInfo.getExtraMeta(InterfaceC1925p.y6xt));
                pathVideoEntry.setOnlineSecondPath(onlineInfo.getExtraMeta(InterfaceC1925p.ocl));
                arrayList.add(pathVideoEntry);
                this.f9079v.m9585l(false);
            }
            arrayList.addAll(previews);
        }
        while (arrayList.size() > 15) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xzl(List<Resource> result) {
        if (result == null) {
            this.f9075j.setReachBottom(true);
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
        } else {
            if (result.size() == 0 || ((a98o.zy) result).isLast()) {
                this.f9075j.setReachBottom(true);
                return;
            }
            this.f9075j.addAll(result);
            C0004k<Resource> c0004k = this.f9075j;
            c0004k.setPage(c0004k.getPage() + 1);
            i1an();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z617(int index, Resource result) {
        if (index != this.f9076m) {
            return;
        }
        if (result != null) {
            boolean zXblq = xblq();
            if (zXblq) {
                this.f9070b = result;
            } else {
                this.f9070b.mergeOnlineProperties(result);
            }
            wtop(zXblq);
        }
        if (pnt2()) {
            return;
        }
        nyj(EnumC1589y.FAILED);
    }

    protected void ab(int index) {
        kbj(index).executeOnExecutor(C6002g.x2(), this.f9075j.get(index));
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void b8() {
    }

    protected void bqie() {
        this.f9070b = this.f9075j.get(this.f9076m);
        ab(this.f9076m);
        wtop(true);
    }

    protected Resource btvn(Intent intent) {
        return null;
    }

    protected void c25(int start) {
        gb(start).executeOnExecutor(C6002g.x2(), new Void[0]);
    }

    @Override // com.android.thememanager.util.ResourcePreviewAssistant.InterfaceC2747g
    public void cdj() {
    }

    public Resource cn02() {
        return this.f9070b;
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void cv06() {
    }

    protected boolean exv8(Intent intent) {
        return "android.intent.action.VIEW".equals(intent.getAction()) || intent.hasExtra(InterfaceC1357q.f53892jk);
    }

    protected void f3f() {
    }

    protected void g0ad() {
        this.f9079v.m9586p(xm(), mj());
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void ga() {
    }

    protected f7l8 gb(int offset) {
        return new f7l8(this, "downloadList-" + offset);
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void h4b() {
    }

    protected boolean hyow(Intent intent) {
        Resource resourceBtvn = btvn(intent);
        if (resourceBtvn == null) {
            return false;
        }
        imd(resourceBtvn);
        return true;
    }

    protected void i1an() {
        if (this.f9072d != null) {
            int size = this.f9075j.size();
            if (this.f9076m < size - 5 || this.f9075j.isReachBottom() || !xblq() || xtb7()) {
                return;
            }
            c25(size);
        }
    }

    protected void i3x9() {
    }

    protected void imd(Resource r2) {
        ArrayList arrayList = new ArrayList();
        C0004k<Resource> c0004k = new C0004k<>();
        c0004k.add(r2);
        arrayList.add(c0004k);
        this.f9077o = 0;
        this.f9076m = 0;
        this.f9073e = arrayList;
        this.f9075j = c0004k;
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    /* JADX INFO: renamed from: j */
    public void mo6410j() {
    }

    protected AsyncTaskC1584g kbj(int index) {
        return new AsyncTaskC1584g(this, index, "downloadDetail-" + index);
    }

    protected int kq2f() {
        return 0;
    }

    protected void kt06() {
        WallpaperDetailActivity wallpaperDetailActivity = this.f9074f;
        this.f9059l = wallpaperDetailActivity.f9137r;
        this.f9071c = wallpaperDetailActivity.f8908e;
    }

    protected void kz28() {
        vss1(getString(R.string.resource_detail_recommend_other_themes), InterfaceC1925p.sr, com.android.thememanager.controller.online.ld6.d8wk(this.f9070b.getOnlineId(), -1));
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    /* JADX INFO: renamed from: l */
    public void mo6411l() {
    }

    protected void lk() {
        new AsyncTaskC1586n(this.f9074f, this.f9071c, this.f9070b, this.f9075j, this.f9076m).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void lv5() {
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void lvui() {
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void lw() {
        if (this.bp) {
            return;
        }
        if (C1915g.m7550n()) {
            C1688q.cdj().fti(this.f9074f, new C1587q());
        } else {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
        }
    }

    @Override // com.android.thememanager.v9.ld6.toq.InterfaceC2869k
    public void mbx() {
    }

    protected void mi1u() {
        int size = this.f9075j.size();
        int i2 = this.f9076m;
        if (i2 < size - 1) {
            this.f9076m = i2 + 1;
            bqie();
            i1an();
        }
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void mu() {
        if (this.bb) {
            return;
        }
        d1ts("COMMENT");
        com.android.thememanager.ld6.m8012y(this.f9074f, this.f9070b, new zy());
    }

    protected void nyj(EnumC1589y s2) {
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void o05() {
    }

    protected String ob() {
        return ovdh().getDesigner();
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        WallpaperDetailActivity wallpaperDetailActivity = this.f9074f;
        if (wallpaperDetailActivity == null || wallpaperDetailActivity.isFinishing()) {
            return;
        }
        this.f57309ab = new Handler();
        i3x9();
        if (savedInstanceState != null) {
            if (this.f9079v != null && savedInstanceState.containsKey(an)) {
                this.f9079v.n5r1(savedInstanceState.getInt(an));
            }
            Resource resource = (Resource) savedInstanceState.getSerializable(id);
            Resource resource2 = this.f9075j.get(this.f9076m);
            if (resource != null && !TextUtils.equals(resource.getOnlineId(), resource2.getOnlineId())) {
                imd(resource);
            }
        }
        bqie();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            this.f9074f.setResult(resultCode, data);
            this.f9074f.finish();
        }
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<AbstractAsyncTaskC1713n<?, ?, ?>> it = this.f9080w.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        Handler handler = this.f57309ab;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f9080w.clear();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        ResourceScreenView resourceScreenView = this.f57310bo;
        if (resourceScreenView != null) {
            resourceScreenView.m10503h();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ResourcePreviewAssistant resourcePreviewAssistant = this.f9079v;
        if (resourcePreviewAssistant != null) {
            outState.putInt(an, resourcePreviewAssistant.cdj());
        }
        Resource resource = this.f9070b;
        if (resource != null) {
            outState.putSerializable(id, resource.m28251clone());
        }
    }

    protected ResourceInfo ovdh() {
        return xblq() ? this.f9070b.getOnlineInfo() : this.f9070b.getLocalInfo();
    }

    protected boolean pnt2() {
        return ovdh() != null;
    }

    public boolean qh4d(WallpaperDetailActivity activity) {
        int i2;
        this.f9074f = activity;
        kt06();
        Intent intent = this.f9074f.getIntent();
        if (!exv8(intent)) {
            this.f9073e = C2082k.zy().ld6();
            this.f9077o = intent.getIntExtra(InterfaceC1357q.f53893jp0y, 0);
            if (this.f9076m < 0) {
                this.f9076m = intent.getIntExtra(InterfaceC1357q.f53879gvn7, 0);
            }
        } else if (!hyow(intent)) {
            return false;
        }
        List<C0004k<Resource>> list = this.f9073e;
        if (list != null) {
            int size = list.size();
            int i3 = this.f9077o;
            if (size > i3) {
                C0004k<Resource> c0004k = this.f9073e.get(i3);
                this.f9075j = c0004k;
                if (c0004k != null && !c0004k.isEmpty() && (i2 = this.f9076m) >= 0 && i2 < this.f9075j.size()) {
                    this.f9072d = (com.android.thememanager.controller.online.zurt) intent.getSerializableExtra(InterfaceC1357q.f53973zp);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    /* JADX INFO: renamed from: r */
    public void mo6412r() {
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void se() {
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void t8iq() {
    }

    protected void tjz5() {
        ResourceInfo resourceInfoOvdh = ovdh();
        TextView textView = this.f9081x;
        if (textView != null) {
            textView.setText(this.f9070b.getTitle());
        }
        TextView textView2 = (TextView) tww7(R.id.resource_detail_header_price);
        int productPrice = this.f9070b.getProductPrice();
        if (productPrice <= 0) {
            textView2.setText(getResources().getString(R.string.resource_price_free));
        } else {
            textView2.setText(com.android.thememanager.util.ch.m9686y(getActivity(), productPrice));
        }
        ((TextView) tww7(R.id.resource_detail_header_title)).setText(this.f9070b.getTitle());
        ((TextView) tww7(R.id.resource_detail_header_size)).setText(com.android.thememanager.util.ch.f7l8(resourceInfoOvdh.getSize()));
        if (TextUtils.isEmpty(resourceInfoOvdh.getDesigner())) {
            tww7(R.id.resource_detail_header_size_divider).setVisibility(8);
            tww7(R.id.resource_detail_header_designer).setVisibility(8);
            return;
        }
        TextView textView3 = (TextView) tww7(R.id.resource_detail_header_designer);
        textView3.setText(getResources().getString(R.string.resource_detail_header_theme_designer_title, resourceInfoOvdh.getDesigner()));
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.arrow_right, 0);
        C6077k.f7l8(textView3);
        textView3.setOnClickListener(new toq());
    }

    public View tww7(int id2) {
        if (getView() != null) {
            return getView().findViewById(id2);
        }
        return null;
    }

    protected void vss1(String pageGroupTitle, String pageKey, com.android.thememanager.controller.online.zurt requestUrl) {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(pageGroupTitle);
        Page page = new Page();
        page.setListUrl(requestUrl);
        page.setKey(pageKey);
        page.setTitle(this.f9070b.getOnlineId());
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        Intent intent = new Intent();
        intent.setClassName(this.f9059l.getTabActivityPackage(), this.f9059l.getTabActivityClass());
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53949uv6, kq2f());
        intent.putExtra(InterfaceC1357q.f53866eqxt, pageGroupTitle);
        startActivityForResult(intent, 1);
    }

    protected void vwb() {
        int i2 = this.f9076m;
        if (i2 > 0) {
            this.f9076m = i2 - 1;
            bqie();
            i1an();
        }
    }

    protected void wtop(boolean rebindScreenPreview) {
        if (!pnt2()) {
            nyj(EnumC1589y.LOADING);
            return;
        }
        nyj(EnumC1589y.NORMAL);
        f3f();
        tjz5();
        if (rebindScreenPreview) {
            g0ad();
        }
    }

    public boolean xblq() {
        return this.f9074f.se();
    }

    protected boolean xtb7() {
        return this.f9073e.size() == 1 && this.f9075j.size() == 1;
    }

    @Override // com.android.thememanager.util.ResourcePreviewAssistant.InterfaceC2747g
    public void yl() {
    }

    @Override // com.android.thememanager.util.ResourcePreviewAssistant.InterfaceC2747g
    public boolean yz() {
        return false;
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void z4() {
        String localPath = this.f9079v.ki() != null ? this.f9079v.ki().getLocalPath() : null;
        d1ts("SHARE");
        com.android.thememanager.util.nmn5.m9908n(this.f9074f, this.f9070b, localPath);
    }

    protected void z4j7() {
        String strOb = ob();
        vss1(strOb, String.format(InterfaceC1925p.kfxm, strOb), com.android.thememanager.controller.online.ld6.m7577t(strOb, -1, this.f9059l.getResourceStamp()));
    }

    @Override // com.android.thememanager.v9.ld6.InterfaceC2868k.k
    public void zp() {
    }
}
