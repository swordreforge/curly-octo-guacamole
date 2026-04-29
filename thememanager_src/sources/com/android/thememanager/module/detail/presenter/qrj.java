package com.android.thememanager.module.detail.presenter;

import a98o.C0004k;
import android.app.Activity;
import android.app.Application;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import c8jq.InterfaceC1392k;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.AbstractC1778q;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PostResult;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.o1t;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.detail.theme.view.widget.RewardDialog;
import com.android.thememanager.fu4;
import com.android.thememanager.lvui;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.module.detail.util.C2246n;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.util.f7l8;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.detail.entity.RewardData;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.g1;
import ek5k.C6002g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ch;
import miui.drm.DrmManager;
import miuix.appcompat.app.dd;
import retrofit2.C7639i;
import yz.C7794k;

/* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qrj extends androidx.lifecycle.toq implements InterfaceC1392k.toq, InterfaceC1755y, com.android.thememanager.basemodule.analysis.toq {
    public static final int ac = 2;
    public static final int ad = 10;
    public static final int aj = 14;
    public static final int am = 11;
    public static final int ar = 17;
    private static final int ax = 0;
    public static final int ay = 12;
    private static final String ba = "OnlineResourceDetailPre";
    public static final int bc = 18;
    public static final int bd = 100;
    public static final int be = 13;
    private static final int bq = 1;
    public static final int bs = 15;
    public static final int bu = 19;
    public static final int k0 = 16;
    private static final String tgs = "downloadRight|";
    public static final int tlhn = 101;
    public static final int w97r = 102;

    /* JADX INFO: renamed from: a */
    private lvui f13088a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private com.android.thememanager.controller.ld6 f60512ab;
    public final fti<C1723y<Object>> an;
    public final fti<C1723y<Boolean>> as;
    public final fti<C1723y<Pair<String, String>>> az;

    /* JADX INFO: renamed from: b */
    private retrofit2.toq<EmptyResponse> f13089b;
    private f7l8.InterfaceC2242k bb;
    public final fti<C1723y<Integer>> bg;
    public final fti<C1723y<Pair<Boolean, Integer>>> bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private f7l8.InterfaceC2242k f60513bo;
    private f7l8.zy bp;
    public final fti<C1723y<Integer>> bv;

    /* JADX INFO: renamed from: c */
    protected String f13090c;

    /* JADX INFO: renamed from: d */
    private boolean f13091d;

    /* JADX INFO: renamed from: e */
    protected retrofit2.toq<CommonResponse<OnlineResourceDetail>> f13092e;

    /* JADX INFO: renamed from: f */
    protected com.android.thememanager.controller.online.zy f13093f;

    /* JADX INFO: renamed from: h */
    protected Resource f13094h;

    /* JADX INFO: renamed from: i */
    protected String f13095i;
    public final fti<Resource> id;
    public final fti<OnlineResourceDetail> in;

    /* JADX INFO: renamed from: j */
    private retrofit2.toq<CommonResponse<PostResult>> f13096j;

    /* JADX INFO: renamed from: l */
    protected ThemeStatus f13097l;

    /* JADX INFO: renamed from: m */
    private retrofit2.toq<EmptyResponse> f13098m;

    /* JADX INFO: renamed from: o */
    private retrofit2.toq<CommonResponse<PostResult>> f13099o;

    /* JADX INFO: renamed from: p */
    protected fti<ThemeStatus> f13100p;

    /* JADX INFO: renamed from: r */
    protected String f13101r;

    /* JADX INFO: renamed from: s */
    protected fti<Integer> f13102s;

    /* JADX INFO: renamed from: t */
    protected String f13103t;

    /* JADX INFO: renamed from: u */
    private f7l8.zy f13104u;

    /* JADX INFO: renamed from: v */
    private boolean f13105v;

    /* JADX INFO: renamed from: w */
    private boolean f13106w;

    /* JADX INFO: renamed from: x */
    private boolean f13107x;

    /* JADX INFO: renamed from: y */
    protected fti<Pair<OnlineResourceDetail, Integer>> f13108y;

    /* JADX INFO: renamed from: z */
    protected OnlineResourceDetail f13109z;

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        void mo8349k(boolean confirm);
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$g */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    public static class C2232g {

        /* JADX INFO: renamed from: k */
        public boolean f13110k;

        /* JADX INFO: renamed from: q */
        public Runnable f13111q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f60514toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Runnable f60515zy;

        C2232g(boolean mix, String rCode, Runnable applyRun, Runnable cancelRun) {
            this.f13110k = mix;
            this.f60514toq = rCode;
            this.f60515zy = applyRun;
            this.f13111q = cancelRun;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$k */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    class C2233k implements t8r.f7l8 {
        C2233k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8() {
            g1.tfm(C1791k.getInstance(qrj.this.f13103t), qrj.this.f13094h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m8352y() {
            g1.tfm(C1791k.getInstance(qrj.this.f13103t), qrj.this.f13094h);
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        /* JADX INFO: renamed from: q */
        public void mo6370q(int errorType, int errorCode, String errorMsg) {
            DrmManager.TrialLimits trialLimits;
            qrj.this.h7am(10);
            qrj qrjVar = qrj.this;
            qrjVar.f13109z.bought = false;
            qrjVar.f13094h.setProductBought(false);
            boolean z2 = true;
            qrj.this.f13094h.setCheckBoughtStatus(true);
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.module.detail.presenter.ld6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13085k.f7l8();
                }
            });
            qrj.this.h7am(0);
            if (!qrj.this.x2() && qrj.this.qrj()) {
                Resource resource = qrj.this.getResource();
                if (com.android.thememanager.module.detail.util.zy.m8381s(qrj.this.mo5853k(), resource)) {
                    fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(qrj.this.mo5853k());
                    String rightsPath = new ResourceResolver(resource, fu4VarM10535g).getRightsPath();
                    File file = new File(rightsPath);
                    if (!file.exists()) {
                        Log.w("OnlineResourceDetailP", "rights file is not exist: " + rightsPath);
                    } else if (DrmManager.isPermanentRights(file) || (trialLimits = DrmManager.getTrialLimits(file)) == null || trialLimits.endTime >= System.currentTimeMillis()) {
                        z2 = false;
                    }
                    if (z2) {
                        C2082k.zy().m8003s().zy(fu4VarM10535g, resource.getTitle(), resource.getLocalId(), rightsPath, false);
                        qrj.this.bv.cdj(new C1723y<>(10));
                        return;
                    }
                }
            }
            qrj qrjVar2 = qrj.this;
            if (C2244g.zy(qrjVar2.f13103t, qrjVar2.f13094h) && errorType == 200006) {
                qrj.this.m8338a(false);
            } else {
                qrj.this.an.cdj(new C1723y<>(new ch(Integer.valueOf(errorType), Integer.valueOf(errorCode), errorMsg)));
            }
            qrj.this.gc3c(errorType, errorCode, errorMsg);
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        public void toq() {
            qrj.this.h7am(8);
            qrj qrjVar = qrj.this;
            if (!qrjVar.f13109z.bought) {
                qrjVar.bf2();
            }
            qrj qrjVar2 = qrj.this;
            qrjVar2.f13109z.bought = true;
            qrjVar2.f13094h.setProductBought(true);
            qrj.this.f13094h.setCheckBoughtStatus(true);
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.module.detail.presenter.x2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13135k.m8352y();
                }
            });
            qrj.this.h7am(0);
            qrj qrjVar3 = qrj.this;
            if (C2244g.zy(qrjVar3.f13103t, qrjVar3.f13094h)) {
                Log.d(qrj.ba, "OnlineResourceDetailPresenter onPurchaseSuccessful: downloadRightsAndApply");
                qrj.this.m8338a(false);
            } else {
                Log.d(qrj.ba, "OnlineResourceDetailPresenter onPurchaseSuccessful: ACTION_DOWNLOAD ");
                qrj.this.bv.cdj(new C1723y<>(16));
            }
            qrj.this.jbh("BUY_SUCCESS");
            qrj qrjVar4 = qrj.this;
            qrjVar4.zkd(qrjVar4.f13109z.getId());
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class kja0 extends AbstractC1778q<RewardData> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<RewardDialog.kja0> f13113k;

        kja0(RewardDialog.kja0 presenter) {
            this.f13113k = new WeakReference<>(presenter);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1778q
        /* JADX INFO: renamed from: k */
        public void mo6891k(int httpCode, int errorCode, Exception e2) {
            if (this.f13113k.get() != null) {
                this.f13113k.get().toq(errorCode);
            }
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1778q
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(@zy.lvui RewardData response) {
            if (this.f13113k.get() != null) {
                this.f13113k.get().mo7802k(response);
            }
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class ld6 extends AbstractC1777n<PostResult> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<qrj> f13114k;

        /* JADX INFO: renamed from: q */
        private boolean f13115q;

        ld6(qrj p2, boolean addFavorite) {
            this.f13114k = new WeakReference<>(p2);
            this.f13115q = addFavorite;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@zy.lvui PostResult response) {
            qrj qrjVar = this.f13114k.get();
            if (qrjVar == null) {
                return;
            }
            qrjVar.zsr0(response, this.f13115q);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$n */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    class C2234n implements f7l8.zy {
        C2234n() {
        }

        @Override // com.android.thememanager.module.detail.util.f7l8.zy
        /* JADX INFO: renamed from: k */
        public void mo8354k(Resource resource, zy.C7914zy result) {
            if (qrj.this.vq()) {
                C7794k.m28195n(C2755a.f16307g, "DownloadRightsTask resultType:" + result.m7664n() + "resultCode: " + result.m7663g() + "resultMessage:" + result.f7l8());
                if (result.m7664n() != 100000) {
                    qrj.this.xwq3(result, 1);
                    qrj.this.h7am(0);
                } else {
                    qrj qrjVar = qrj.this;
                    qrjVar.y9n(qrjVar.f13105v, qrj.this.f13091d, qrj.this.f13106w);
                }
            }
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    protected static class n7h extends AbstractC1777n<OnlineResourceDetail> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<qrj> f13117k;

        n7h(qrj p2) {
            this.f13117k = new WeakReference<>(p2);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@zy.lvui OnlineResourceDetail response) {
            qrj qrjVar = this.f13117k.get();
            if (qrjVar == null) {
                return;
            }
            qrjVar.v0af(response);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            qrj qrjVar = this.f13117k.get();
            if (qrjVar == null) {
                return;
            }
            C2789j.x2(qrj.ba, "onReloadFail. %d,%d,%s", Integer.valueOf(httpCode), Integer.valueOf(apiCode), message);
            qrjVar.m4(apiCode);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$p */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class RunnableC2235p implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<qrj> f13118k;

        /* JADX INFO: renamed from: q */
        private boolean f13119q;

        public RunnableC2235p(qrj presenter, boolean isUpdate) {
            this.f13118k = new WeakReference<>(presenter);
            this.f13119q = isUpdate;
        }

        @Override // java.lang.Runnable
        public void run() {
            qrj qrjVar = this.f13118k.get();
            if (qrjVar == null) {
                return;
            }
            if (TextUtils.equals(qrjVar.mo5853k(), "largeicons") || TextUtils.equals(qrjVar.mo5853k(), "fonts")) {
                OnlineResourceDetail onlineResourceDetail = new OnlineResourceDetail();
                onlineResourceDetail.bought = false;
                int qVar = com.android.thememanager.basemodule.network.theme.toq.toq();
                if (qVar == 0) {
                    qVar++;
                }
                onlineResourceDetail.productPrice = qVar;
                Resource resource = onlineResourceDetail.toResource();
                if (resource.isProductBought() || qVar != resource.getProductPrice()) {
                    return;
                }
            }
            zy.C1711k c1711k = new zy.C1711k();
            c1711k.f9808n = this.f13119q;
            c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
            c1711k.f57496toq = com.android.thememanager.basemodule.analysis.f7l8.m6613s();
            c1711k.f57497zy = com.android.thememanager.basemodule.analysis.f7l8.m6614y();
            C2320q.m8480i(qrjVar.f13094h, C1791k.getInstance(qrjVar.f13103t), c1711k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$q */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    class C2236q implements lvui.toq {
        C2236q() {
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: n */
        public void mo6395n(Resource resource) {
            Resource resource2 = qrj.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !qrj.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            qrj.this.uc(resource, new boolean[0]);
            if (qrj.this.f13107x) {
                qrj.this.bv.cdj(new C1723y<>(11));
            } else {
                qrj.this.h7am(0);
            }
            qrj.this.cfr(resource);
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: p */
        public void mo6396p(Resource resource) {
            Resource resource2 = qrj.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !qrj.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            qrj.this.h7am(0);
            qrj.this.etdu(resource);
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: q */
        public void mo6397q(Resource resource) {
            Resource resource2 = qrj.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !qrj.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            qrj.this.h7am(6);
            qrj.this.sok(resource);
        }

        @Override // com.android.thememanager.lvui.toq
        public void toq(Resource resource, int downloadBytes, int totalBytes) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$qrj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class C7927qrj implements C2246n.k {

        /* JADX INFO: renamed from: k */
        private final qrj f13121k;

        public C7927qrj(qrj presenter) {
            this.f13121k = presenter;
        }

        @Override // com.android.thememanager.module.detail.util.C2246n.k
        /* JADX INFO: renamed from: k */
        public void mo8356k(Resource resource, String result) {
            int i2;
            qrj qrjVar = this.f13121k;
            if (qrjVar == null) {
                return;
            }
            if (((Integer) C1944y.ki(result).first).intValue() == 0) {
                i2 = R.string.resource_exchange_success;
                if (!qrjVar.f13109z.bought) {
                    qrjVar.bf2();
                }
                qrjVar.f13109z.bought = true;
                qrjVar.f13094h.setProductBought(true);
                qrjVar.mo8337u().toq();
                if (!C2244g.zy(qrjVar.f13103t, qrjVar.f13094h)) {
                    qrjVar.bv.cdj(new C1723y<>(16));
                }
            } else {
                i2 = R.string.resource_exchange_wrong_format_by_server;
            }
            qrjVar.an.cdj(new C1723y<>(Pair.create(100, Integer.valueOf(i2))));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$s */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class AsyncTaskC2237s extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f13122k;

        /* JADX INFO: renamed from: q */
        private dd f13123q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Resource f60516toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f60517zy;

        public AsyncTaskC2237s(Activity activity, Resource resource, String resourceCode) {
            this.f60516toq = resource;
            this.f60517zy = resourceCode;
            this.f13122k = new WeakReference<>(activity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(this.f60517zy)).m7690k().fti(this.f60516toq);
            C1976k.m7741y().n7h(this.f60516toq.getProductId(), false);
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            Activity activity = this.f13122k.get();
            if (C1819o.eqxt(activity)) {
                dd ddVar = new dd(activity);
                this.f13123q = ddVar;
                ddVar.y2(0);
                this.f13123q.n5r1(activity.getString(R.string.deleting));
                this.f13123q.setCancelable(false);
                this.f13123q.show();
            }
            C1976k.m7741y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            Activity activity = this.f13122k.get();
            if (C1819o.eqxt(activity)) {
                this.f13123q.dismiss();
                List<C0004k<Resource>> listLd6 = C2082k.zy().ld6();
                if (!com.android.thememanager.basemodule.utils.kja0.qrj(listLd6)) {
                    boolean z2 = false;
                    for (C0004k<Resource> c0004k : listLd6) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= c0004k.size()) {
                                break;
                            }
                            Resource resource = c0004k.get(i2);
                            if (resource != null && resource.getLocalId() != null && resource.getLocalId().equals(this.f60516toq.getLocalId())) {
                                c0004k.remove(i2);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
                activity.finish();
            }
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    class toq implements f7l8.zy {

        /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$toq$k */
        /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
        class C2238k implements f7l8.InterfaceC2242k {
            C2238k() {
            }

            @Override // com.android.thememanager.module.detail.util.f7l8.InterfaceC2242k
            /* JADX INFO: renamed from: k */
            public void mo8358k(Resource resource, DrmManager.DrmResult result) {
                if (qrj.this.f13108y.m4388g() == null) {
                    return;
                }
                if (result != DrmManager.DrmResult.DRM_SUCCESS) {
                    qrj.this.dr(result, 2);
                } else {
                    qrj.this.bv.cdj(new C1723y<>(17));
                }
            }
        }

        toq() {
        }

        @Override // com.android.thememanager.module.detail.util.f7l8.zy
        /* JADX INFO: renamed from: k */
        public void mo8354k(Resource resource, zy.C7914zy result) {
            if (qrj.this.f13108y.m4388g() == null) {
                return;
            }
            int iM7664n = result.m7664n();
            C7794k.m28195n(C2755a.f16307g, "DownloadRightsTask resultType:" + iM7664n + "resultCode: " + result.m7663g() + "resultMessage:" + result.f7l8());
            if (iM7664n != 100000) {
                qrj.this.xwq3(result, 2);
                qrj.this.h7am(0);
                return;
            }
            if (qrj.this.f60513bo == null) {
                qrj.this.f60513bo = new C2238k();
            }
            qrj qrjVar = qrj.this;
            com.android.thememanager.module.detail.util.f7l8.toq(qrjVar.f13093f, qrjVar.f13103t, qrjVar.f13094h, qrjVar.f60513bo);
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    private static class x2 extends AbstractC1770g {

        /* JADX INFO: renamed from: s */
        private boolean f13126s;

        /* JADX INFO: renamed from: y */
        private final WeakReference<qrj> f13127y;

        x2(qrj p2, boolean addLike) {
            this.f13127y = new WeakReference<>(p2);
            this.f13126s = addLike;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        public void toq(retrofit2.toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
            qrj qrjVar = this.f13127y.get();
            if (qrjVar == null) {
                return;
            }
            qrjVar.ltg8(this.f13126s);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.qrj$y */
    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    public static class C2239y implements C1688q.n {

        /* JADX INFO: renamed from: k */
        private WeakReference<qrj> f13128k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60518toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Object f60519zy;

        public C2239y(qrj presenter, int type, Object data) {
            this.f13128k = new WeakReference<>(presenter);
            this.f60518toq = type;
            this.f60519zy = data;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            qrj qrjVar = this.f13128k.get();
            if (qrjVar != null) {
                qrjVar.qo(this.f60518toq, loginError);
            }
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            qrj qrjVar = this.f13128k.get();
            if (qrjVar != null) {
                qrjVar.wo(this.f60518toq, this.f60519zy);
            }
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailPresenter.java */
    class zy implements f7l8.InterfaceC2242k {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m8359n() {
            qrj.this.yl(98);
            qrj.this.h7am(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m8360q() {
            qrj qrjVar = qrj.this;
            qrjVar.an.cdj(new C1723y<>(qrjVar.i1()));
            qrj.this.yl(96);
            qrj.this.h7am(0);
        }

        @Override // com.android.thememanager.module.detail.util.f7l8.InterfaceC2242k
        /* JADX INFO: renamed from: k */
        public void mo8358k(Resource resource, DrmManager.DrmResult result) {
            if (!qrj.this.vq()) {
                qrj.this.m8339b();
                return;
            }
            if (result != null) {
                Log.w(qrj.ba, "result is: " + result.toString());
            }
            if (result == DrmManager.DrmResult.DRM_SUCCESS) {
                qrj.this.yl(82);
                qrj qrjVar = qrj.this;
                qrjVar.an.cdj(new C1723y<>(new C2232g(qrjVar.f13091d, qrj.this.f13103t, new Runnable() { // from class: com.android.thememanager.module.detail.presenter.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13086k.m8360q();
                    }
                }, new Runnable() { // from class: com.android.thememanager.module.detail.presenter.kja0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13084k.m8359n();
                    }
                })));
            } else if (result != DrmManager.DrmResult.DRM_ERROR_RIGHT_FILE_NOT_EXISTS) {
                qrj.this.dr(result, 1);
            } else if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                qrj.this.bv.cdj(new C1723y<>(19));
            } else {
                qrj qrjVar2 = qrj.this;
                qrjVar2.m8338a(qrjVar2.f13091d);
            }
        }
    }

    public qrj(Application app) {
        super(app);
        this.f13108y = new fti<>();
        this.f13102s = new fti<>();
        this.f13100p = new fti<>();
        this.bv = new fti<>();
        this.an = new fti<>();
        this.id = new fti<>();
        this.in = new fti<>();
        this.bl = new fti<>();
        this.as = new fti<>();
        this.bg = new fti<>();
        this.az = new fti<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m8338a(boolean isApplyMix) {
        if (this.bp == null) {
            this.bp = new C2234n();
        }
        com.android.thememanager.module.detail.util.f7l8.zy(1, this.f13093f, this.f13094h, p001b.toq.fu4(this.f13103t), this.bp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m8339b() {
        if (this.f13108y == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" mThemeDetail.getValue(): ");
        sb.append(this.f13108y.m4388g() != null);
        Log.w(ba, sb.toString());
    }

    @zy.lvui
    private AbstractC1778q<RewardData> b3e(RewardDialog.kja0 responseCallback) {
        return new kja0(responseCallback);
    }

    private void d8wk() {
        if (!C2244g.zy(this.f13103t, this.f13094h) || C2244g.m8367g(this.f13103t, this.f13094h)) {
            this.f13107x = true;
            this.bv.cdj(new C1723y<>(16));
        } else {
            if (this.f13104u == null) {
                this.f13104u = new toq();
            }
            com.android.thememanager.module.detail.util.f7l8.zy(2, this.f13093f, this.f13094h, p001b.toq.fu4(this.f13103t), this.f13104u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fnq8() {
        uc(C2244g.f7l8(this.f13103t, this.f13094h, false), true);
    }

    private void g1(boolean addFavorite) {
        if (!mcp.m7138k() || !mcp.m7139n()) {
            nn86.m7150k(R.string.online_no_network, 0);
            return;
        }
        String str = this.f13109z.packId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strFu4 = p001b.toq.fu4(this.f13103t);
        if (addFavorite) {
            retrofit2.toq<CommonResponse<PostResult>> toqVar = this.f13096j;
            if (toqVar != null) {
                toqVar.cancel();
            }
            this.f13096j = was.toq.m28124k(str, strFu4, new ld6(this, addFavorite));
        } else {
            retrofit2.toq<CommonResponse<PostResult>> toqVar2 = this.f13099o;
            if (toqVar2 != null) {
                toqVar2.cancel();
            }
            this.f13099o = was.toq.zy(str, strFu4, new ld6(this, addFavorite));
        }
        jbh(addFavorite ? "FAVOURITE" : "DIS_FAVOURITE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ltg8(boolean addLike) {
        if (this.f13108y.m4388g() == null || ((OnlineResourceDetail) this.f13108y.m4388g().first).likeCount == null) {
            return;
        }
        if (addLike) {
            OnlineResourceDetail onlineResourceDetail = (OnlineResourceDetail) this.f13108y.m4388g().first;
            onlineResourceDetail.likeCount = Integer.valueOf(onlineResourceDetail.likeCount.intValue() + 1);
        } else {
            ((OnlineResourceDetail) this.f13108y.m4388g().first).likeCount = Integer.valueOf(r0.likeCount.intValue() - 1);
        }
        ((OnlineResourceDetail) this.f13108y.m4388g().first).like = addLike;
        this.bl.cdj(new C1723y<>(Pair.create(Boolean.valueOf(addLike), ((OnlineResourceDetail) this.f13108y.m4388g().first).likeCount)));
        bf2();
    }

    private void mbx(String old, String current) {
        Log.w("OnlineResourceDetailP", "reload, resourceCode " + old + " -> " + current);
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("content", "OnlineResourceDetailPresenter_code_changed:" + old + "->" + current);
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.xo, arrayMapM6679k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qkj8() {
        uc(C2244g.f7l8(this.f13103t, this.f13094h, false), true);
        this.f13102s.n7h(0);
    }

    private void tfm(C1688q.g loginError) {
        if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
            com.android.thememanager.util.ch.y9n(n5r1());
        } else {
            nn86.m7150k(R.string.fail_to_add_account, 0);
        }
        h7am(0);
        C7794k.m28195n(C2755a.f16307g, "fail to login");
    }

    /* JADX INFO: renamed from: v */
    private void m8346v(String onlineId, String trackId) {
        this.f13095i = onlineId;
        this.f13101r = trackId;
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(this.f13103t);
        com.android.thememanager.controller.online.zy zyVar = new com.android.thememanager.controller.online.zy(fu4VarM10535g);
        this.f13093f = zyVar;
        zyVar.m7659n(new HashSet(Arrays.asList(InterfaceC1789q.qxj)));
        lvui lvuiVar = new lvui(n5r1());
        this.f13088a = lvuiVar;
        lvuiVar.m8165p(bo());
        this.f13097l = new ThemeStatus(this.f13095i);
        this.f60512ab = C2082k.zy().m8001n().ld6(fu4VarM10535g).m7690k();
        i9jn();
    }

    private void was(final boolean addLike) {
        if (!mcp.m7138k() || !mcp.m7139n()) {
            nn86.m7150k(R.string.online_no_network, 0);
            return;
        }
        if (addLike) {
            retrofit2.toq<EmptyResponse> toqVar = this.f13098m;
            if (toqVar != null) {
                toqVar.cancel();
            }
            this.f13098m = was.toq.toq(this.f13095i, new x2(this, addLike));
        } else {
            retrofit2.toq<EmptyResponse> toqVar2 = this.f13089b;
            if (toqVar2 != null) {
                toqVar2.cancel();
            }
            this.f13089b = was.toq.m28126q(this.f13095i, new x2(this, addLike));
        }
        jbh(addLike ? "LIKE" : "DIS_LIKE");
    }

    @zy.lvui
    private String yqrt(@zy.lvui OnlineResourceDetail onlineDetail) {
        String strM5744q = !TextUtils.isEmpty(onlineDetail.category) ? p001b.toq.m5744q(onlineDetail.category) : null;
        return TextUtils.isEmpty(strM5744q) ? p001b.toq.zy(onlineDetail.productType) : strM5744q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zsr0(@zy.lvui PostResult response, boolean favorite) {
        if (response.isSuccess()) {
            this.as.cdj(new C1723y<>(Boolean.valueOf(favorite)));
            ((OnlineResourceDetail) this.f13108y.m4388g().first).collect = favorite;
            o1t.zy().m7605q(bf2.toq.toq(), this.f13094h, favorite, this.f13103t);
            bf2();
        }
    }

    public void a98o(boolean isUpdate) {
        if (C2320q.m8477f(this.f13094h)) {
            C2320q.a98o(this.f13094h);
        } else {
            C6002g.m22240g(new RunnableC2235p(this, isUpdate));
        }
        jbh("DOWNLOAD");
    }

    public void apply() {
        ek5k(false);
    }

    public void bek6(String result) {
        this.f13090c = result;
    }

    protected void bf2() {
        if (this.f13092e == null) {
            ikck();
        }
        com.android.thememanager.basemodule.network.theme.f7l8.m6882h().x2(this.f13092e, true);
    }

    protected lvui.toq bo() {
        return new C2236q();
    }

    public void bwp(@zy.lvui OnlineResourceDetail onlineDetail) {
        this.f13109z = onlineDetail;
        this.f13103t = yqrt(onlineDetail);
        uc(this.f13109z.toResource(), new boolean[0]);
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.module.detail.presenter.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f13130k.fnq8();
            }
        });
        this.f13108y.cdj(new Pair<>(this.f13109z, 3));
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        m8346v(onlineResourceDetail.packId, onlineResourceDetail.trackId);
    }

    public void bz2(jp0y<ThemeStatus> observer) {
        this.f13100p.kja0(observer);
    }

    public fti<ThemeStatus> c8jq() {
        return this.f13100p;
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void cdj(RewardDialog.kja0 responseCallback) {
        ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRewardRand().mo27954p(b3e(responseCallback));
    }

    protected void cfr(Resource resource) {
    }

    protected void cv06() {
        C2244g.m8368k(this);
        this.f13088a.m8168y();
    }

    /* JADX INFO: renamed from: d */
    public boolean m8347d() {
        return g1.m9739c(this.f13103t, new C1795s(this.f13094h, C1791k.getInstance(this.f13103t)).m6971y());
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void d2ok() {
        AdInfo adInfoCheckAndGetAdInfo;
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        if (onlineResourceDetail == null || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        C1708s.f7l8().x2(4001).fti(adInfoCheckAndGetAdInfo);
    }

    protected void dr(DrmManager.DrmResult result, int applyType) {
        if (!C1781k.toq(bf2.toq.toq())) {
            this.bv.cdj(new C1723y<>(15));
            return;
        }
        if (!C1915g.m7550n()) {
            com.android.thememanager.util.ch.m9666b(R.string.online_no_network, null);
            return;
        }
        if (applyType == 1) {
            com.android.thememanager.basemodule.analysis.zy.m6680n(this.f13094h.getOnlineId());
            this.bv.cdj(new C1723y<>(12));
        } else if (result != DrmManager.DrmResult.DRM_ERROR_TIME_NOT_MATCH) {
            com.android.thememanager.util.ch.m9666b(R.string.resource_trial_fail_title, null);
        } else {
            this.bv.cdj(new C1723y<>(14));
            h7am(0);
        }
    }

    public void ek5k(boolean isRestore) {
        yz(isRestore, false);
    }

    protected void etdu(Resource resource) {
    }

    public void f7l8() {
        ikck();
        retrofit2.toq<CommonResponse<OnlineResourceDetail>> toqVar = this.f13092e;
        if (toqVar == null) {
            return;
        }
        toqVar.mo27954p(new n7h(this));
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void fn3e(InterfaceC0954z lifecycleOwner, jp0y<Pair<OnlineResourceDetail, Integer>> observer) {
        this.f13108y.m4391p(lifecycleOwner, observer);
    }

    protected boolean gbni() {
        return true;
    }

    protected void gc3c(int errorType, int errorCode, String errorMsg) {
    }

    @Override // c8jq.InterfaceC1392k.toq
    public Resource getResource() {
        return this.f13094h;
    }

    @Override // c8jq.InterfaceC1392k.toq
    public int getState() {
        Integer numM4388g = this.f13102s.m4388g();
        if (numM4388g != null) {
            return numM4388g.intValue();
        }
        return 0;
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void gvn7(ActivityC0891q activity, boolean addLike) {
        C1688q.cdj().fti(activity, new C2239y(this, 1, Boolean.valueOf(addLike)));
    }

    public String gyi() {
        return this.f13101r;
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: h */
    public void mo5851h(InterfaceC0954z lifecycleOwner, jp0y<ThemeStatus> observer) {
        this.f13100p.m4391p(lifecycleOwner, observer);
    }

    public void h7am(int state) {
        if (1 == state) {
            this.f13107x = false;
        }
        this.f13102s.cdj(Integer.valueOf(state));
    }

    public void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        Resource resource = this.f13094h;
        if (resource == null || downloadSuccess || !taskId.equals(resource.getAssemblyId())) {
            return;
        }
        h7am(0);
        nn86.toq(n5r1().getResources().getString(R.string.download_failed) + ":" + downloadFailCode, 0);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadProgressUpdate(String downloadPath, String taskId, String extraData, int currBytes, int totalBytes) {
        Resource resource = this.f13094h;
        if (resource != null && taskId.equals(resource.getAssemblyId())) {
            if (C2320q.m8477f(this.f13094h)) {
                this.bg.cdj(new C1723y<>(-1));
            } else {
                if (totalBytes <= 0 || currBytes < 0) {
                    return;
                }
                this.bg.cdj(new C1723y<>(Integer.valueOf((int) Math.round((((double) currBytes) * 100.0d) / ((double) totalBytes)))));
            }
        }
    }

    public void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        Resource resource = this.f13094h;
        if (resource != null && taskId.equals(resource.getAssemblyId()) && C2320q.m8477f(this.f13094h)) {
            this.bg.cdj(new C1723y<>(-1));
        }
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: i */
    public void mo5852i() {
        ek5k(true);
    }

    protected C2247q i1() {
        return new C2247q(this.f13103t, this.f13105v, this.f13100p, this.f13091d, this.f13106w);
    }

    public void i9jn() {
        if ((this.f13108y.m4388g() == null || ((Integer) this.f13108y.m4388g().second).intValue() == 1) && gbni()) {
            f7l8();
        }
    }

    protected void ikck() {
        if (this.f13095i == null) {
            return;
        }
        this.f13092e = y2((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class));
    }

    protected void jbh(String actionType) {
        fti<C1723y<Pair<String, String>>> ftiVar = this.az;
        String str = this.f13101r;
        if (str == null) {
            str = this.f13095i;
        }
        ftiVar.cdj(new C1723y<>(Pair.create(actionType, str)));
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void jk(ActivityC0891q activity, boolean addFavorite) {
        if (TextUtils.isEmpty(this.f13109z.packId)) {
            return;
        }
        C1688q.cdj().fti(activity, new C2239y(this, 0, Boolean.valueOf(addFavorite)));
    }

    protected void jz5() {
        C2244g.m8371y(this);
        this.f13088a.ld6();
    }

    @Override // c8jq.InterfaceC1392k.toq
    @zy.dd
    /* JADX INFO: renamed from: k */
    public String mo5853k() {
        return this.f13103t;
    }

    public void kcsr(@zy.lvui Resource resource, @zy.lvui String resourceCode) {
        uc(resource, new boolean[0]);
        this.f13103t = resourceCode;
        this.f13109z = OnlineResourceDetail.fromResource(resource, resourceCode);
        this.f13108y.cdj(new Pair<>(this.f13109z, 1));
        m8346v(resource.getOnlineId(), resource.getOnlineInfo().getTrackId());
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void kja0(String onlineId, int pageIndex, int requestRankCount, RewardDialog.kja0 responseCallback) {
        ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRewardRank(onlineId, pageIndex, requestRankCount).mo27954p(b3e(responseCallback));
    }

    protected void ktq() {
        if (this.f13094h == null || this.f13102s.m4388g() == null) {
            return;
        }
        if (getState() == 6 && !this.f13088a.f7l8(this.f13094h)) {
            h7am(0);
            return;
        }
        if (getState() == 4) {
            if (!C2244g.m8370q(this.f13094h)) {
                h7am(0);
                return;
            } else {
                if (C2320q.m8477f(this.f13094h)) {
                    h7am(5);
                    this.bg.cdj(new C1723y<>(-1));
                    return;
                }
                return;
            }
        }
        if (getState() == 1) {
            boolean zM8381s = com.android.thememanager.module.detail.util.zy.m8381s(this.f13103t, this.f13094h);
            DrmManager.TrialLimits trialLimitsF7l8 = com.android.thememanager.module.detail.util.zy.f7l8(this.f13103t, this.f13094h);
            if (!zM8381s || trialLimitsF7l8 == null || trialLimitsF7l8.endTime <= System.currentTimeMillis()) {
                h7am(0);
            }
        }
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void ld6(ActivityC0891q activity) {
        new AsyncTaskC2237s(activity, this.f13094h, this.f13103t).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    public String lv5() {
        return this.f13095i;
    }

    public void m4(int apiCode) {
        if (this.f13094h == null) {
            this.f13108y.cdj(null);
        }
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void mcp(InterfaceC0954z lifecycleOwner, jp0y<Integer> observer) {
        this.f13102s.m4391p(lifecycleOwner, observer);
    }

    protected boolean mu() {
        return C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(this.f13103t)).m7690k().mo7478t(this.f13094h);
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: n */
    public void mo5854n() {
        if (!C1915g.m7550n()) {
            nn86.m7150k(R.string.network_exception, 0);
        } else {
            h7am(4);
            C2320q.a98o(this.f13094h);
        }
    }

    public lvui nmn5() {
        return this.f13088a;
    }

    @Override // c8jq.InterfaceC1392k.toq
    public boolean o1t() {
        return com.android.thememanager.util.ch.vyq(new C1795s(this.f13094h, C1791k.getInstance(this.f13103t)).m6971y());
    }

    @Override // c8jq.InterfaceC1392k.toq
    public boolean oc() {
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        return onlineResourceDetail != null && onlineResourceDetail.productPrice == 0 && C2244g.zy(mo5853k(), getResource()) && !C2244g.m8367g(mo5853k(), getResource());
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: p */
    public boolean mo5855p() {
        return this.f13109z.bought;
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: q */
    public void mo5856q() {
        h7am(5);
        C2320q.m8484m(this.f13094h);
    }

    public void qo(int operatorType, C1688q.g loginError) {
        if (operatorType != 2) {
            return;
        }
        tfm(loginError);
    }

    @Override // c8jq.InterfaceC1392k.toq
    public boolean qrj() {
        String str = this.f13103t;
        if (str == null) {
            return false;
        }
        str.hashCode();
        return !str.equals("fonts") ? str.equals("theme") : g1.d8wk();
    }

    public void r8s8() {
        jz5();
    }

    public void se(@zy.lvui String onlineId, String trackId, String resourceCode) {
        this.f13103t = resourceCode;
        m8346v(onlineId, trackId);
    }

    protected void sok(Resource resource) {
    }

    /* JADX INFO: renamed from: t */
    public boolean mo5857t() {
        String strM6971y = new C1795s(this.f13094h, C1791k.getInstance(this.f13103t)).m6971y();
        return (!mu() || TextUtils.isEmpty(strM6971y) || com.android.thememanager.util.ch.vyq(strM6971y) || com.android.thememanager.util.ch.n5r1(strM6971y) || com.android.thememanager.util.ch.ncyb(strM6971y) || strM6971y == null || strM6971y.equals(C1792n.toq(n5r1(), this.f13103t))) ? false : true;
    }

    public OnlineResourceDetail t8iq() {
        return this.f13109z;
    }

    /* JADX INFO: renamed from: u */
    public t8r.f7l8 mo8337u() {
        return new C2233k();
    }

    protected void uc(Resource r2, boolean... ioThread) {
        this.f13094h = r2;
        if (ioThread == null || ioThread.length <= 0 || !ioThread[0]) {
            this.id.cdj(r2);
        } else {
            this.id.n7h(r2);
        }
    }

    public void uj2j(jp0y<Pair<OnlineResourceDetail, Integer>> observer) {
        this.f13108y.kja0(observer);
    }

    protected void v0af(@zy.lvui OnlineResourceDetail response) {
        int i2 = this.f13094h != null ? 2 : 3;
        String str = this.f13103t;
        this.f13103t = yqrt(response);
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f13103t)) {
            mbx(str, this.f13103t);
        }
        this.f13109z = response;
        this.in.cdj(response);
        uc(response.toResource(), new boolean[0]);
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.module.detail.presenter.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13087k.qkj8();
            }
        });
        this.f13108y.cdj(new Pair<>(response, Integer.valueOf(i2)));
    }

    public void vep5() {
        if (this.f13094h == null) {
            Log.w(ba, "startBuy fail because mResource is null");
            return;
        }
        bf2();
        com.android.thememanager.basemodule.analysis.zy.m6680n(this.f13094h.getOnlineId());
        jbh("BUY");
    }

    public boolean vq() {
        return this.f13108y.m4388g() != null;
    }

    public void w831() {
        cv06();
        ktq();
    }

    public void wo(int operatorType, Object data) {
        if (operatorType == 0) {
            g1(((Boolean) data).booleanValue());
        } else if (operatorType == 1) {
            was(((Boolean) data).booleanValue());
        } else {
            if (operatorType != 2) {
                return;
            }
            d8wk();
        }
    }

    @Override // c8jq.InterfaceC1392k.toq
    public void wvg(String onlineId, String rewardAmount, String verifyResult, RewardDialog.kja0 responseCallback) {
        String str;
        String str2;
        String str3;
        String str4;
        DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
        String str5 = C1688q.cdj().jk() ? C1774q.as : "";
        Map<String, String> qVar = hyr.toq(verifyResult);
        if (qVar == null || qVar.isEmpty()) {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        } else {
            String str6 = qVar.get(InterfaceC1925p.du);
            String str7 = qVar.get(InterfaceC1925p.dqjj);
            String str8 = qVar.get(InterfaceC1925p.v7x);
            str4 = qVar.get(InterfaceC1925p.nou);
            str = str6;
            str2 = str7;
            str3 = str8;
        }
        detailRequestInterface.getRewardOrder(onlineId, rewardAmount, UUID.randomUUID().toString(), str5, str, str2, str3, str4).mo27954p(b3e(responseCallback));
    }

    /* JADX INFO: renamed from: x */
    public String m8348x() {
        return this.f13090c;
    }

    @Override // c8jq.InterfaceC1392k.toq
    public boolean x2() {
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        return onlineResourceDetail.bought || onlineResourceDetail.productPrice == 0;
    }

    protected void xwq3(zy.C7914zy result, int applyType) {
        if (!C1781k.toq(bf2.toq.toq())) {
            this.bv.cdj(new C1723y<>(15));
        }
        int iM7664n = result.m7664n();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("resourceType", "theme");
        arrayMap.put("code", String.valueOf(iM7664n));
        arrayMap.put("content", result.f7l8());
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.l7o, C1706p.ki(arrayMap));
        switch (iM7664n) {
            case com.android.thememanager.controller.online.zy.f57985f7l8 /* 100001 */:
                nn86.m7150k(R.string.resource_account_login_before_action, 0);
                break;
            case com.android.thememanager.controller.online.zy.f11059y /* 100002 */:
                com.android.thememanager.util.ch.m9666b(R.string.online_no_network, tgs + iM7664n + "|" + result.m7663g());
                break;
            case com.android.thememanager.controller.online.zy.f11058s /* 100003 */:
                com.android.thememanager.util.ch.m9666b(R.string.online_no_network, tgs + iM7664n);
                break;
            case com.android.thememanager.controller.online.zy.f11056p /* 100004 */:
                if (1 == applyType && 408 == result.m7663g()) {
                    this.bv.cdj(new C1723y<>(12));
                } else {
                    com.android.thememanager.util.ch.m9666b(R.string.resource_server_out_of_service, tgs + result.m7663g());
                }
                break;
            case com.android.thememanager.controller.online.zy.f57987ld6 /* 100005 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_server_out_of_service, tgs + iM7664n);
                break;
            case com.android.thememanager.controller.online.zy.f57990x2 /* 100006 */:
                this.bv.cdj(new C1723y<>(13));
                break;
            case com.android.thememanager.controller.online.zy.f57989qrj /* 100007 */:
                this.an.cdj(new C1723y<>(Pair.create(101, result.f7l8())));
                break;
            case com.android.thememanager.controller.online.zy.f57988n7h /* 100008 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_server_out_of_service, tgs + iM7664n);
                break;
            default:
                com.android.thememanager.util.ch.m9666b(R.string.resource_server_out_of_service, tgs + iM7664n);
                break;
        }
    }

    @Override // c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: y */
    public void mo5858y(String redeemCode) {
        String str = this.f13109z.packId;
        C2246n.m8372k(str, redeemCode, str, new C7927qrj(this));
        jbh("REDEEM");
    }

    protected retrofit2.toq<CommonResponse<OnlineResourceDetail>> y2(DetailRequestInterface detailRequest) {
        boolean z2 = com.android.thememanager.basemodule.utils.o1t.cdj() && a9.m6999s("miui.systemui.plugin");
        return C1688q.cdj().o1t() ? detailRequest.getSafeResourceDetail(this.f13095i, z2) : detailRequest.getResourceDetail(this.f13095i, z2);
    }

    public void y9n(boolean isRestore, boolean isApplyMix, boolean withRelateResource) {
        h7am(7);
        this.f13105v = isRestore;
        this.f13091d = isApplyMix;
        this.f13106w = withRelateResource;
        if (this.bb == null) {
            this.bb = new zy();
        }
        yl(80);
        com.android.thememanager.module.detail.util.f7l8.toq(this.f13093f, this.f13103t, this.f13094h, this.bb);
    }

    public void yl(int status) {
        ThemeStatus themeStatus = this.f13097l;
        themeStatus.status = status;
        this.f13100p.cdj(themeStatus);
    }

    public void yz(boolean isRestore, boolean isApplyMix) {
        y9n(isRestore, isApplyMix, true);
    }

    @zy.dd
    public String z4() {
        Resource resource = this.f13094h;
        String str = this.f13109z.packId;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String onlineId = resource.getOnlineId();
        if (!TextUtils.isEmpty(onlineId)) {
            return onlineId;
        }
        if (com.android.thememanager.basemodule.utils.kja0.qrj(resource.getParentResources())) {
            return null;
        }
        RelatedResource relatedResource = this.f13094h.getParentResources().get(0);
        Resource resourceZy = C1792n.zy(relatedResource, C1791k.getInstance(relatedResource.getResourceCode()));
        if (resourceZy == null) {
            return null;
        }
        return resourceZy.getOnlineId();
    }

    protected void zkd(String id) {
    }

    protected void zp() {
        if (mcp.m7139n()) {
            return;
        }
        nn86.m7150k(R.string.network_exception, 0);
    }

    public boolean zurt() {
        return (this.f13108y.m4388g() == null || (((Integer) this.f13108y.m4388g().second).intValue() & 2) == 0) ? false : true;
    }

    public boolean zy() {
        return !OnlineResourceDetail.Status.OFFLINE.name().equals(this.f13109z.status);
    }
}
