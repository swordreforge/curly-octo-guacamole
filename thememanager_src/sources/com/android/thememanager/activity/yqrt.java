package com.android.thememanager.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.C2225g;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.presenter.C2309k;
import com.android.thememanager.recommend.view.listview.RecommendVMListView;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.view.C2938r;
import com.android.thememanager.view.largeicon.LargeIconHeaderView;
import com.google.gson.C4871g;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.ki;
import miuix.appcompat.internal.app.widget.ActionBarMovableLayout;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LargeIconPickerFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class yqrt extends com.android.thememanager.module.detail.view.y9n<C2225g> implements C1688q.f7l8 {
    private static final String bd = "LargeIconPicker";
    private Handler ac;
    private View ad;
    private View am;
    private com.android.thememanager.view.dd an;
    private String as;
    private NestedScrollView ax;
    private View ay;
    private boolean az;
    private boolean ba;
    private com.android.thememanager.recommend.view.listview.zy bb;
    private Dialog bc;
    private View be;
    private String bg;
    private ViewGroup bl;
    private com.android.thememanager.recommend.view.listview.zy bp;
    private LargeIconHeaderView bv;
    private C2309k id;
    private ThemeOperationButton in;
    private int[] bq = new int[2];
    private androidx.lifecycle.jp0y<C1723y<Integer>> aj = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.etdu
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f9042k.gw((C1723y) obj);
        }
    };
    private androidx.lifecycle.jp0y<C1723y<Integer>> bs = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.sok
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f9326k.alcv((C1723y) obj);
        }
    };
    private androidx.lifecycle.jp0y<Integer> k0 = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.cfr
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f8975k.z1r((Integer) obj);
        }
    };
    private androidx.lifecycle.jp0y<Map<String, com.android.thememanager.module.detail.util.toq>> ar = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.w831
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f9364k.verb((Map) obj);
        }
    };
    private androidx.lifecycle.jp0y<ThemeStatus> bu = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.activity.yqrt$k */
    /* JADX INFO: compiled from: LargeIconPickerFragment.java */
    class C1633k implements C1688q.n {
        C1633k() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            ActivityC0891q activity = yqrt.this.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                com.android.thememanager.util.ch.yz(activity);
            } else {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.fail_to_add_account, 0);
            }
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            new zy(((C2225g) yqrt.this.wtop()).fu4().id, (C2225g) yqrt.this.wtop(), yqrt.this, null).executeOnExecutor(C6002g.n7h(), new Void[0]);
        }
    }

    /* JADX INFO: compiled from: LargeIconPickerFragment.java */
    class toq implements androidx.lifecycle.jp0y<ThemeStatus> {
        toq() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(ThemeStatus status) {
            if (status.status == 98) {
                ((C2225g) yqrt.this.wtop()).bz2(this);
                if (com.android.thememanager.util.gc3c.cdj(yqrt.this.getActivity()) && (yqrt.this.getActivity() instanceof LargeIconPickerActivity)) {
                    ((LargeIconPickerActivity) yqrt.this.getActivity()).ukdy();
                }
            }
        }
    }

    /* JADX INFO: compiled from: LargeIconPickerFragment.java */
    private static class zy extends AsyncTask<Void, Boolean, Boolean> {

        /* JADX INFO: renamed from: k */
        private final String f9422k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<C2225g> f57363toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<yqrt> f57364zy;

        /* synthetic */ zy(String str, C2225g c2225g, yqrt yqrtVar, C1633k c1633k) {
            this(str, c2225g, yqrtVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            try {
                Map<String, Boolean> mapM7579y = com.android.thememanager.controller.online.ld6.m7579y(p001b.toq.fu4("largeicons"), this.f9422k);
                if (mapM7579y != null && mapM7579y.get(this.f9422k) != null) {
                    return mapM7579y.get(this.f9422k);
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            LargeIconElement largeIconElementFu4;
            super.onPostExecute(result);
            Log.i(yqrt.bd, "CheckAndBuyResource : " + this.f9422k + result);
            if (result == null || result.booleanValue() || this.f57363toq.get() == null || this.f57364zy.get() == null || (largeIconElementFu4 = this.f57363toq.get().fu4()) == null || !p029m.zy.m24738k(this.f9422k, largeIconElementFu4.id)) {
                return;
            }
            this.f57364zy.get().pnt2();
        }

        private zy(String id, C2225g vm, yqrt fragment) {
            this.f9422k = id;
            this.f57363toq = new WeakReference<>(vm);
            this.f57364zy = new WeakReference<>(fragment);
        }
    }

    private void a3dw(LargeIconElement element) {
        if (element == null || p029m.zy.m24738k(element.id, wtop().lv5())) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSelectResourceChanged: ");
            sb.append(element == null);
            Log.d(bd, sb.toString());
            return;
        }
        Log.w(bd, "onSelectResourceChanged hasBought: " + element.hasBought + " element.currentPriceInCent: " + element.currentPriceInCent + " elementId: " + element.id + "  uuid: " + element.uuid);
        if (element.hasBought || element.currentPriceInCent <= 0) {
            this.an.m10337q();
        } else {
            if (this.f13395j) {
                return;
            }
            this.in.setText(C1815m.m7136k(getActivity(), element.currentPriceInCent));
            this.an.m10338s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void alcv(C1723y c1723y) {
        Integer num = (Integer) c1723y.m6720k();
        if (num != null && num.intValue() == 1 && wtop() != null && com.android.thememanager.basemodule.utils.y9n.mcp(wtop().ew().m4388g()) && C1915g.m7550n()) {
            wtop().l05();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bf5(View view) {
        view.getLocationOnScreen(this.bq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void brv(C1723y c1723y) {
        Integer num = (Integer) c1723y.m6720k();
        if (num != null) {
            lg4k(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cjaj(List list) {
        this.bb.ki(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cr3(C2938r c2938r) {
        a3dw(c2938r.f61539zy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eu(List list) {
        com.android.thememanager.view.dd ddVar;
        xouc(false);
        this.bp.ki(list);
        if (this.bp.getItemCount() > 0) {
            View view = this.ad;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        qppo(false);
        if (wtop().fu4() == null || wtop().fu4().type != 2 || (ddVar = this.an) == null) {
            return;
        }
        ddVar.m10337q();
    }

    private void f26p(boolean block) {
        wtop().a5id(block);
        if (com.android.thememanager.util.gc3c.cdj(getActivity())) {
            if (!block) {
                com.android.thememanager.basemodule.utils.y9n.f7l8(this.bc);
                return;
            }
            if (this.bc == null) {
                miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(getActivity()).nn86(null).m25037g();
                this.bc = kiVarM25037g;
                Window window = kiVarM25037g.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.width = -2;
                attributes.height = -2;
                window.setAttributes(attributes);
                window.setDimAmount(0.0f);
                window.getDecorView().setAlpha(0.0f);
                this.bc.setCancelable(false);
            }
            this.bc.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gw(C1723y c1723y) {
        Integer num = (Integer) c1723y.m6720k();
        if (num != null) {
            if (num.intValue() == 1) {
                d6od();
            } else if (num.intValue() == 2) {
                f26p(false);
            }
        }
    }

    private void jb9() {
        if (wtop() == null) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("pageId", com.android.thememanager.basemodule.analysis.toq.qlt6);
        arrayMap.put("app_package_name", this.as);
        Resource resource = this.f13393e;
        arrayMap.put("content", resource == null ? null : resource.getOnlineId());
        arrayMap.put("resourceType", "largeicons");
        arrayMap.put("size", C2938r.toq(wtop().ni7()));
        C1708s.f7l8().ld6().zurt(arrayMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l7o(View view) {
        d6od();
    }

    private void lg4k(int status) {
        Log.d(bd, "onRecommendLoadStatusChanged: " + status);
        boolean z2 = true;
        if (status == 1) {
            xouc(true);
            return;
        }
        if (status == 3) {
            xouc(false);
            return;
        }
        if (this.bp.getItemCount() > 0) {
            View view = this.ad;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (C1781k.toq(bf2.toq.toq()) && !com.android.thememanager.basemodule.privacy.x2.f7l8() && C1915g.m7550n()) {
            z2 = false;
        }
        qppo(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mla(boolean z2) {
        this.am.setVisibility(8);
        wtop().l05();
    }

    private int oei() {
        return 2;
    }

    private void owi() {
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.purchased_list);
        com.android.thememanager.recommend.view.listview.zy zyVar = new com.android.thememanager.recommend.view.listview.zy(this, wtop());
        this.bb = zyVar;
        recyclerView.setAdapter(zyVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) getView().findViewById(R.id.recommend_list);
        com.android.thememanager.recommend.view.listview.zy zyVar2 = new com.android.thememanager.recommend.view.listview.zy(this, wtop());
        this.bp = zyVar2;
        recyclerView2.setAdapter(zyVar2);
        recyclerView2.setVisibility(0);
        this.bp.mcp(RecommendVMListView.qrj(oei(), R.dimen.large_icon_recommend_list_padding_horizontal, R.dimen.large_icon_recommend_list_padding_center));
        recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        wtop().nme().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.z4
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9426k.cjaj((List) obj);
            }
        });
        wtop().ew().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.gbni
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9054k.eu((List) obj);
            }
        });
    }

    private void qppo(boolean noNetwork) {
        s31();
        xouc(false);
        this.ad.setVisibility(0);
        if (!noNetwork) {
            this.am.setVisibility(8);
            this.be.setVisibility(0);
        } else {
            this.am.setVisibility(0);
            this.be.setVisibility(8);
            C6077k.cdj(this.am);
            this.am.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.was
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9365k.y3(view);
                }
            });
        }
    }

    private void s31() {
        if (this.ad == null) {
            ViewStub viewStub = (ViewStub) this.bl.findViewById(R.id.error_stub);
            if (viewStub != null && viewStub.getParent() != null) {
                viewStub.inflate();
            }
            this.ad = this.bl.findViewById(R.id.large_icon_picker_recommend_error);
            this.am = this.bl.findViewById(R.id.no_network);
            this.ay = this.bl.findViewById(R.id.process_bar);
            this.be = this.bl.findViewById(R.id.no_more);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void verb(Map map) {
        if (map == null || map.size() <= 0 || Build.VERSION.SDK_INT <= 29) {
            Handler handler = this.ac;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (this.ac == null) {
            this.ac = new Handler(Looper.getMainLooper());
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            com.android.thememanager.module.detail.util.toq toqVar = (com.android.thememanager.module.detail.util.toq) map.get((String) it.next());
            if (toqVar != null && toqVar.m8374k() >= 0 && !this.ac.hasCallbacks(toqVar)) {
                this.ac.postDelayed(toqVar, toqVar.m8374k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wu() {
        this.am.setVisibility(8);
        wtop().l05();
    }

    private void xouc(boolean show) {
        s31();
        if (show) {
            this.ad.setVisibility(0);
        }
        this.ay.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y3(View view) {
        if (!C1781k.toq(bf2.toq.toq())) {
            ix(true, new C1781k.f7l8() { // from class: com.android.thememanager.activity.m4
                @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                public final void y9n(boolean z2) {
                    this.f9239k.mla(z2);
                }
            });
            return;
        }
        if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            com.android.thememanager.basemodule.privacy.x2.m6916q(getActivity(), new p000a.toq() { // from class: com.android.thememanager.activity.v0af
                @Override // p000a.toq
                public final void onSuccess() {
                    this.f9348k.wu();
                }
            });
        } else if (!C1915g.m7550n()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.unable_connect_network, 0);
        } else {
            this.am.setVisibility(8);
            wtop().l05();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ydj3(int state) {
        if (this.in == null) {
            return;
        }
        Resource resource = wtop().getResource();
        if (resource == null) {
            if (wtop().v5yj()) {
                this.id.m8450c().cdj(new C1723y<>(Boolean.TRUE));
                return;
            } else {
                this.id.m8450c().cdj(new C1723y<>(Boolean.FALSE));
                return;
            }
        }
        if (this.f13396l != null) {
            if (wtop().ps(this.f13396l.getId(), this.f13396l.isOfficialIcons == 1)) {
                switch (state) {
                    case 0:
                        this.in.setLoading(false);
                        if (!wtop().x2()) {
                            this.id.m8450c().cdj(new C1723y<>(Boolean.FALSE));
                            if (resource.getProductPrice() != this.f13396l.productPrice) {
                                this.an.m10337q();
                                Log.i(bd, "setState: error." + resource.getProductPrice() + "," + this.f13396l.productPrice);
                            } else if (!this.f13395j) {
                                this.in.setText(C1815m.m7136k(getActivity(), resource.getProductPrice()));
                                this.an.m10338s();
                            } else {
                                this.in.setText(R.string.resource_buy);
                            }
                        } else {
                            this.an.m10337q();
                            this.id.m8450c().cdj(new C1723y<>(Boolean.TRUE));
                        }
                        break;
                    case 1:
                        this.in.setEnabled(false);
                        break;
                    case 2:
                    case 4:
                    case 6:
                    case 7:
                        if (!wtop().x2()) {
                            this.in.setEnabled(false);
                        } else {
                            this.in.setLoading(true);
                        }
                        break;
                    case 3:
                        wtop().a5id(true);
                        this.in.setLoading(true);
                        break;
                    case 8:
                    case 10:
                    case 11:
                        f26p(false);
                        break;
                }
                return;
            }
        }
        Log.i(bd, "setState: return");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1r(Integer num) {
        if (num.intValue() != 8) {
            return;
        }
        if (this.bq.length != 2 && this.ax.getChildCount() == 1) {
            this.ax.n7h(33);
            return;
        }
        int[] iArr = new int[2];
        this.ax.getChildAt(0).getLocationOnScreen(iArr);
        this.ax.m3616r(0, iArr[1] - this.bq[1], ActionBarMovableLayout.n5ij);
    }

    private void zah1(boolean needDownload, boolean isUpdate, int state) {
        f26p(true);
        wtop().bz2(this.bu);
        wtop().mo5851h(this, this.bu);
        Resource resource = this.f13393e;
        String assemblyId = resource == null ? wtop().fu4() == null ? null : wtop().fu4().id : resource.getAssemblyId();
        Log.i(bd, "beginDownloadAndApply: needDownload = " + needDownload + ",state = " + state + ",isUpdate = " + isUpdate + ",applyingId = " + assemblyId);
        wtop().dxef((AbstractActivityC1717k) getActivity(), assemblyId, needDownload);
        if (!needDownload) {
            wtop().e5(assemblyId);
        } else if (state != 4) {
            if (state == 5) {
                wtop().mo5854n();
            } else {
                xzl(isUpdate);
            }
        }
        jb9();
    }

    public void d6od() {
        if (wtop().v5yj()) {
            zah1(false, false, 0);
            return;
        }
        if (wtop().u38j(this.f13396l) && this.f13393e != null) {
            if (wtop().ps(this.f13396l.getId(), this.f13396l.isOfficialIcons == 1)) {
                if (!wtop().x2()) {
                    if (this.f13392c != null) {
                        wtop().mo5858y(this.f13392c);
                        return;
                    } else {
                        pnt2();
                        return;
                    }
                }
                if (C2244g.zy(wtop().mo5853k(), wtop().getResource())) {
                    if (C2244g.m8367g(wtop().mo5853k(), wtop().getResource())) {
                        zah1(true, true, 0);
                        return;
                    } else {
                        zah1(false, false, 0);
                        return;
                    }
                }
                int state = wtop().getState();
                if (state != 0) {
                    zah1(true, false, state);
                    return;
                } else if (wtop().mo5855p() || !C1688q.cdj().o1t()) {
                    zah1(true, false, 0);
                    return;
                } else {
                    pnt2();
                    return;
                }
            }
        }
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.loading, 0);
        wtop().r6ty(wtop().fu4());
    }

    @Override // com.android.thememanager.basemodule.account.C1688q.f7l8
    public void ebn() {
        wtop().l05();
        wtop().r6ty(wtop().fu4());
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void iz(String actionType, String extra) {
        if (!"BUY".equals(actionType) && !"BUY_SUCCESS".equals(actionType)) {
            super.iz(actionType, extra);
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("pageId", com.android.thememanager.basemodule.analysis.toq.qlt6);
        arrayMap.put("app_package_name", this.as);
        Resource resource = this.f13393e;
        arrayMap.put("content", resource == null ? null : resource.getOnlineId());
        arrayMap.put("resourceType", "largeicons");
        nme(actionType, extra, new C4871g().o1t(arrayMap));
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void kjd() {
        super.kjd();
        ((C2225g) this.f13400t).h7am(11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    /* JADX INFO: renamed from: koj, reason: merged with bridge method [inline-methods] */
    public C2225g lk() {
        return (C2225g) new C0924e(this).toq(this.as, C2225g.class);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void m28(Resource resource) {
        OnlineResourceDetail onlineResourceDetailCnbm;
        super.m28(resource);
        if (resource == null || !wtop().ps(resource.getOnlineId(), resource.getLocalInfo().isOfficial()) || (onlineResourceDetailCnbm = wtop().cnbm(resource.getOnlineId(), resource.getLocalInfo().isOfficial())) == null) {
            return;
        }
        LargeIconElement largeIconElementCreate = LargeIconElement.create(onlineResourceDetailCnbm, null, this.as);
        if (largeIconElementCreate.isOfficialIcons && wtop().ps(largeIconElementCreate.id, largeIconElementCreate.isOfficialIcons)) {
            largeIconElementCreate.signature = wtop().fu4().signature;
        }
        wtop().mo8331s(largeIconElementCreate, -1);
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 6003 && resultCode == -1) {
            wtop().yw();
            wtop().r6ty(wtop().fu4());
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ew(true);
        this.id = (C2309k) new C0924e(getActivity()).m4420k(C2309k.class);
        wtop().o5(this.as, this.az, this.ba, this.bg);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(@InterfaceC7396q @zy.lvui LayoutInflater inflater, @zy.dd ViewGroup container, @zy.dd Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.large_icon_picker_fragment, container, false);
        wtop().mcp(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.zsr0
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9429k.ydj3(((Integer) obj).intValue());
            }
        });
        wtop().mcp(this, this.k0);
        wtop().r25n().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.py
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9318k.brv((C1723y) obj);
            }
        });
        wtop().ix().m4391p(this, this.ar);
        wtop().mo8330g(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.i9jn
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9068k.cr3((C2938r) obj);
            }
        });
        this.id.uv6().m4391p(getActivity(), this.aj);
        this.id.lrht().m4391p(getActivity(), this.bs);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.android.thememanager.basemodule.utils.y9n.f7l8(this.bc);
        super.onDestroyView();
        try {
            com.android.thememanager.view.dd ddVar = this.an;
            if (ddVar != null) {
                ddVar.toq();
            }
            Handler handler = this.ac;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.id.uv6().kja0(this.aj);
            this.id.lrht().kja0(this.bs);
            wtop().ix().kja0(this.ar);
            C1688q.cdj().dd(this);
            wtop().r25n().m4389h(this);
            wtop().bih();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f26p(false);
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC7396q @zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.ax = (NestedScrollView) view.findViewById(R.id.nestedScrollView);
        final View viewFindViewById = view.findViewById(R.id.scroll_layout);
        viewFindViewById.post(new Runnable() { // from class: com.android.thememanager.activity.ltg8
            @Override // java.lang.Runnable
            public final void run() {
                this.f9168k.bf5(viewFindViewById);
            }
        });
        LargeIconHeaderView largeIconHeaderView = (LargeIconHeaderView) view.findViewById(R.id.header_view);
        this.bv = largeIconHeaderView;
        largeIconHeaderView.yz(wtop(), (LargeIconPickerActivity) getActivity(), (RecyclerView) view.findViewById(R.id.selector));
        this.bl = (ViewGroup) view.findViewById(R.id.recommend_list_container);
        owi();
        com.android.thememanager.view.dd ddVar = new com.android.thememanager.view.dd((AbstractActivityC1717k) getActivity(), (ViewGroup) getActivity().findViewById(R.id.container));
        this.an = ddVar;
        ThemeOperationButton themeOperationButtonZy = ddVar.zy();
        this.in = themeOperationButtonZy;
        themeOperationButtonZy.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.r8s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9324k.l7o(view2);
            }
        });
        this.in.setTextSize(getResources().getDimension(R.dimen.large_icon_picker_page_purchase_button_text_size));
        this.an.m10337q();
        wtop().vy(false);
        C1688q.cdj().eqxt(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@zy.dd Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            wtop().ec();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void pnt2() {
        if (!wtop().u38j(this.f13396l) || this.f13393e == null) {
            return;
        }
        if (wtop().ps(this.f13396l.getId(), this.f13396l.isOfficialIcons == 1)) {
            if (!C1688q.cdj().wvg()) {
                C1688q.cdj().fti(getActivity(), new C1633k());
            } else {
                f26p(true);
                super.pnt2();
            }
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void vg() {
        super.vg();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.as = arguments.getString("packageName");
            this.bg = arguments.getString(LargeIconPickerActivity.am, null);
            this.az = arguments.getBoolean(LargeIconPickerActivity.be, false);
            this.ba = arguments.getBoolean(LargeIconPickerActivity.aj, false);
            this.f13398o = arguments.getString("resource_code", "largeicons");
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void xblq(C2247q args) {
        Log.i(bd, "picker applyResource: " + args.f13157s);
        com.android.thememanager.module.detail.util.zy.zy(getActivity(), this.f13393e, args);
    }
}
