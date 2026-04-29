package com.android.thememanager.mine.local.presenter;

import android.net.Uri;
import android.os.AsyncTask;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.local.f7l8;
import com.android.thememanager.basemodule.local.n7h;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.BatchOperationResources;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import ek5k.C6002g;
import gbni.InterfaceC6058k;
import gbni.InterfaceC6058k.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class BaseLocalPresenter<V extends InterfaceC6058k.toq> extends BasePresenter<V> implements InterfaceC6058k.k<V>, com.android.thememanager.mine.local.resource.zy, InterfaceC1744k {

    /* JADX INFO: renamed from: l */
    public static final String f12707l = "BaseLocalPresenter";

    /* JADX INFO: renamed from: g */
    protected boolean f12708g;

    /* JADX INFO: renamed from: h */
    private int f12709h;

    /* JADX INFO: renamed from: p */
    private int f12712p;

    /* JADX INFO: renamed from: q */
    protected String f12713q;

    /* JADX INFO: renamed from: r */
    private BaseLocalPresenter<V>.zy f12714r;

    /* JADX INFO: renamed from: s */
    private com.android.thememanager.mine.local.resource.toq f12715s;

    /* JADX INFO: renamed from: t */
    private BaseLocalPresenter<V>.toq f12716t;

    /* JADX INFO: renamed from: y */
    private boolean f12717y;

    /* JADX INFO: renamed from: z */
    private List<Resource> f12718z;

    /* JADX INFO: renamed from: n */
    protected fti<CopyOnWriteArrayList<Resource>> f12711n = new fti<>();

    /* JADX INFO: renamed from: i */
    private boolean f12710i = false;

    public class toq extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private String f12719k;

        public toq(String mResourceCode) {
            this.f12719k = mResourceCode;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            BatchOperationResources batchOperationResourcesFti = C2320q.fti(C1791k.getInstance(this.f12719k));
            BaseLocalPresenter.this.f12712p = batchOperationResourcesFti.getOldNum();
            BaseLocalPresenter.this.f12709h = batchOperationResourcesFti.getUpdatingNum();
            BaseLocalPresenter.this.f12718z = batchOperationResourcesFti.getResources();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            BaseLocalPresenter.this.nn86();
        }
    }

    private class zy extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private WeakReference<V> f12720k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60445toq;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            if (isCancelled()) {
                return Boolean.FALSE;
            }
            WeakReference<V> weakReference = this.f12720k;
            return Boolean.valueOf((weakReference == null || weakReference.get() == null || this.f12720k.get().dd() || !zsr0.toq.m28223s(this.f60445toq)) ? false : true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            WeakReference<V> weakReference;
            super.onPostExecute(aBoolean);
            if (aBoolean == null || !aBoolean.booleanValue() || (weakReference = this.f12720k) == null || weakReference.get() == null) {
                return;
            }
            this.f12720k.get().kcsr();
        }

        private zy(V v2, String resourceCode) {
            this.f12720k = new WeakReference<>(v2);
            this.f60445toq = resourceCode;
        }
    }

    public BaseLocalPresenter(boolean registerImportListener, boolean fromCustomize, @lvui String resourceCode) {
        this.f12717y = registerImportListener;
        this.f12708g = fromCustomize;
        this.f12713q = resourceCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m8219f(List list, Set set) {
        if (this.f12711n.m4388g() != null) {
            this.f12711n.m4388g().removeAll(list);
        }
        if (zy() != null) {
            zy().ld6(set);
        }
    }

    /* JADX INFO: renamed from: l */
    private String m8220l(Resource r2) {
        return r2.getOnlineId() != null ? r2.getOnlineId() : r2.getLocalId();
    }

    private void n5r1(Set<String> checkedItemIds, List<Resource> rs) {
        if (this.f12711n.m4388g() == null) {
            return;
        }
        for (Resource resource : this.f12711n.m4388g()) {
            if (checkedItemIds.contains(m8220l(resource))) {
                rs.add(resource);
            }
        }
    }

    private void ncyb() {
        BaseLocalPresenter<V>.zy zyVar = this.f12714r;
        if (zyVar != null) {
            zyVar.cancel(true);
        }
        BaseLocalPresenter<V>.zy zyVar2 = new zy(zy(), this.f12713q);
        this.f12714r = zyVar2;
        zyVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn86() {
        if (zy() == null) {
            return;
        }
        if (this.f12712p > 0) {
            zy().m58i(this.f12709h, this.f12712p);
        } else {
            zy().dr();
            this.f12710i = false;
        }
    }

    private void x9kr() {
        BaseLocalPresenter<V>.toq toqVar = this.f12716t;
        if (toqVar != null) {
            toqVar.cancel(true);
        }
        BaseLocalPresenter<V>.toq toqVar2 = new toq(this.f12713q);
        this.f12716t = toqVar2;
        toqVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void uv6(String resourceCode) {
        this.f12711n.n7h(new CopyOnWriteArrayList<>(C2320q.ek5k(resourceCode, this.f12708g)));
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z interfaceC0954z) {
        super.f7l8(interfaceC0954z);
        if (!this.f12717y || zy() == null) {
            return;
        }
        com.android.thememanager.mine.local.resource.toq toqVar = new com.android.thememanager.mine.local.resource.toq(((Fragment) zy()).getActivity());
        this.f12715s = toqVar;
        toqVar.m8232p(this);
    }

    @Override // gbni.InterfaceC6058k.k
    public void fn3e(InterfaceC0954z owner, jp0y<List<Resource>> observer) {
        this.f12711n.m4391p(owner, observer);
    }

    @Override // gbni.InterfaceC6058k.k
    /* JADX INFO: renamed from: k */
    public void mo8223k(@lvui final Set<String> set) {
        y9n.m7255s();
        ActivityC0891q activity = zy() instanceof Fragment ? ((Fragment) zy()).getActivity() : zy() instanceof ActivityC0891q ? (ActivityC0891q) zy() : null;
        if (C1819o.eqxt(activity)) {
            final ArrayList arrayList = new ArrayList();
            n5r1(set, arrayList);
            C2320q.ki(activity, arrayList, C1791k.getInstance(this.f12713q), new f7l8() { // from class: com.android.thememanager.mine.local.presenter.toq
                @Override // com.android.thememanager.basemodule.local.f7l8
                /* JADX INFO: renamed from: k */
                public final void mo6814k() {
                    this.f12728k.m8219f(arrayList, set);
                }
            });
        }
    }

    @Override // gbni.InterfaceC6058k.k
    public void kja0(final String resourceCode) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.mine.local.presenter.zy
            @Override // java.lang.Runnable
            public final void run() {
                this.f12729k.m8218c(resourceCode);
            }
        });
    }

    @Override // com.android.thememanager.mine.local.resource.zy
    /* JADX INFO: renamed from: n */
    public void mo6339n(Resource resource) {
        kja0(this.f12713q);
        if (zy() != null) {
            zy().mo28253do();
        }
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1744k
    public void onDataSetUpdated() {
        x9kr();
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1744k
    public void onDataUpdated(Resource resource) {
    }

    @Override // com.android.thememanager.mine.local.resource.zy
    /* JADX INFO: renamed from: p */
    public void mo6340p(Resource resource) {
        if (zy() != null) {
            zy().mo28253do();
        }
        nn86.m7150k(R.string.add_resource_detail_fail, 0);
    }

    @Override // com.android.thememanager.mine.local.resource.zy
    /* JADX INFO: renamed from: q */
    public void mo6341q(Resource resource) {
        if (zy() != null) {
            zy().dxef();
        }
    }

    @Override // gbni.InterfaceC6058k.k
    public void qrj() {
        if (zy() == null) {
            return;
        }
        ActivityC0891q activity = ((Fragment) zy()).getActivity();
        if (!C1819o.eqxt(activity)) {
            C7794k.m28194k(f12707l, "update fail by activity not valid");
            return;
        }
        if (this.f12710i) {
            zy().m4();
        } else {
            if (this.f12718z == null) {
                return;
            }
            C2320q.n7h(activity, C1791k.getInstance(this.f12713q), this.f12718z, this);
            this.f12710i = true;
        }
    }

    @Override // gbni.InterfaceC6058k.k
    /* JADX INFO: renamed from: t */
    public void mo8224t(Uri uri, C1791k resourceContext, int requestCode, n7h listener) {
        C2320q.oc(uri, resourceContext, requestCode, listener);
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        super.t8r(owner);
        if (this.f12717y) {
            this.f12715s.m8235y();
            if (this.f12715s.m8229g() && zy() != null) {
                zy().dxef();
            }
        }
        if (this.f12708g || !C1792n.m6938k(this.f12713q)) {
            return;
        }
        x9kr();
        C2320q.toq(C1791k.getInstance(this.f12713q), this);
        ncyb();
    }

    @Override // com.android.thememanager.mine.local.resource.zy
    public void toq(Resource resource, int downloadBytes, int totalBytes) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public void m8218c(String resourceCode) {
        this.f12711n.n7h(new CopyOnWriteArrayList<>(C2320q.a9(resourceCode, this.f12708g)));
    }

    @Override // gbni.InterfaceC6058k.k
    public void wvg(final String resourceCode) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.mine.local.presenter.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f12726k.uv6(resourceCode);
            }
        });
    }

    @Override // gbni.InterfaceC6058k.k
    /* JADX INFO: renamed from: y */
    public List<Resource> mo8225y() {
        return this.f12711n.m4388g();
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
        super.zurt(owner);
        if (this.f12717y) {
            this.f12715s.ld6();
        }
        if (this.f12708g || !C1792n.m6938k(this.f12713q)) {
            return;
        }
        C2320q.m8474b(C1791k.getInstance(this.f12713q), this);
        BaseLocalPresenter<V>.toq toqVar = this.f12716t;
        if (toqVar != null) {
            toqVar.cancel(true);
        }
        BaseLocalPresenter<V>.zy zyVar = this.f12714r;
        if (zyVar != null) {
            zyVar.cancel(true);
        }
    }
}
