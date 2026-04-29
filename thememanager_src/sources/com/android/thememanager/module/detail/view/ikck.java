package com.android.thememanager.module.detail.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c8jq.InterfaceC1392k;
import cfr.C1394k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.NestViewPager;
import com.android.thememanager.comment.view.activity.ResourceCommentsActivity;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.model.UIUpdateLog;
import com.android.thememanager.detail.theme.view.C1977k;
import com.android.thememanager.detail.theme.view.widget.C1999n;
import com.android.thememanager.detail.theme.view.widget.DetailActionView;
import com.android.thememanager.detail.theme.view.widget.DetailTagLayout;
import com.android.thememanager.detail.theme.view.widget.DetailTopComment;
import com.android.thememanager.detail.theme.view.widget.ResourceDetailPreview;
import com.android.thememanager.detail.theme.view.widget.RewardDialog;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import com.android.thememanager.detail.theme.view.zy;
import com.android.thememanager.detail.widget.RewardGuide;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.module.detail.presenter.C2226h;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.view.ResourceEmptyView;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import miui.drm.DrmManager;
import miuix.internal.widget.C7177g;
import y9n.C7780k;

/* JADX INFO: compiled from: SingleModuleDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ikck extends y9n<C2226h> implements InterfaceC1392k.zy, com.android.thememanager.basemodule.analysis.toq, NestViewPager.toq {
    public static final String dy = "local_resource_using_update";
    public static final String sk1t = "auto_buy";
    public static final String yl25 = "resource_code";
    public static final String zmmu = "auto_restore";
    protected com.android.thememanager.detail.theme.view.widget.cdj ac;
    protected C7177g ad;
    private InterfaceC1392k.n.k aj;
    private View am;
    private String an;
    private boolean ar;
    protected DetailActionView as;
    protected ThemeOperationButton ax;
    private InterfaceC1694q ay;
    protected DetailActionView az;
    private ThemeOperationButton ba;
    protected ViewGroup bb;
    private RewardDialog bc;
    private com.android.thememanager.ad.download.controller.toq bd;
    private List<UIUpdateLog> be;
    protected DetailActionView bg;
    protected ResourceDetailPreview bl;
    protected View bp;
    protected DetailActionView bq;
    private boolean bs;
    private boolean bu;
    protected IRecommendListView bv;
    private ViewGroup id;
    private View in;
    private boolean k0;
    private miuix.appcompat.app.ki tlhn;
    private p000a.zy w97r = new C2270q();
    private p000a.zy tgs = new C2269n();

    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class f7l8 implements IRecommendListView.Request {
        f7l8() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return null;
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ikck$g */
    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class DialogInterfaceOnClickListenerC2267g implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2267g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ikck.this.wtop().apply();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ikck$k */
    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class ViewTreeObserverOnGlobalLayoutListenerC2268k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2268k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ikck.this.bq.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ikck.this.bv.scrollTop();
            ((FrameLayout) ikck.this.getActivity().getWindow().getDecorView()).addView(new RewardGuide(ikck.this.getActivity(), ikck.this.bq));
            com.android.thememanager.detail.theme.view.widget.ki.m7818q();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ikck$n */
    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class C2269n implements p000a.zy {
        C2269n() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ikck.this.zaso();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ikck.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ikck$q */
    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class C2270q implements p000a.zy {
        C2270q() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ikck.this.mkmm();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ikck.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class toq implements C1781k.g {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                ikck ikckVar = ikck.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(ikckVar, ikckVar.w97r)) {
                    return;
                }
                ikck.this.mkmm();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ikck$y */
    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    private static class C2271y implements InterfaceC1694q {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f13275k;

        public C2271y(View adView) {
            this.f13275k = new WeakReference<>(adView);
        }

        @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
        /* JADX INFO: renamed from: s */
        public void mo6510s(String tagId) {
            View view = this.f13275k.get();
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: SingleModuleDetailFragment.java */
    class zy implements C1781k.g {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                ikck ikckVar = ikck.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(ikckVar, ikckVar.tgs)) {
                    return;
                }
                ikck.this.zaso();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ae4(Pair pair) {
        Object obj;
        if (pair == null || (obj = pair.first) == null) {
            mq();
            return;
        }
        OnlineResourceDetail onlineResourceDetail = (OnlineResourceDetail) obj;
        int iIntValue = ((Integer) pair.second).intValue();
        bmt3();
        this.f9877s = onlineResourceDetail.packId;
        this.bs = true;
        InterfaceC1392k.n.k kVar = this.aj;
        if (kVar != null) {
            kVar.mo5850k();
        }
        this.be = onlineResourceDetail.updateLogs;
        ydj3();
        f26p(onlineResourceDetail, iIntValue);
    }

    private void alcv() {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            u38j().m6909i(getActivity(), null);
        } else {
            startActivity(ResourceCommentsActivity.was(getActivity(), wtop().getResource(), false, 0L));
            nme("COMMENT", m2t(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b6(View view) {
        alcv();
    }

    private void bmt3() {
        this.in.setVisibility(8);
        this.id.setVisibility(8);
        this.bp.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cb(OnlineResourceDetail onlineResourceDetail, View view) {
        wh(onlineResourceDetail.description);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void cp(com.android.thememanager.basemodule.ad.model.AdInfo r6, android.widget.ImageView r7, android.view.View r8) {
        /*
            r5 = this;
            androidx.fragment.app.q r0 = r5.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r6.dspName
            boolean r1 = com.android.thememanager.ad.C1653q.m6525h(r1)
            if (r1 == 0) goto L18
            r1 = 2131166108(0x7f07039c, float:1.7946452E38)
            float r1 = r0.getDimension(r1)
            goto L1f
        L18:
            r1 = 2131165898(0x7f0702ca, float:1.7946026E38)
            float r1 = r0.getDimension(r1)
        L1f:
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r2 = r2 - r1
            float r1 = r6.height
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L3a
            float r6 = r6.width
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L3a
            float r1 = r1 / r6
            float r1 = r1 * r2
            goto L41
        L3a:
            r6 = 2131165947(0x7f0702fb, float:1.7946125E38)
            float r1 = r0.getDimension(r6)
        L41:
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r0 = (int) r1
            r6.height = r0
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r7 = (int) r2
            r6.width = r7
            if (r8 == 0) goto L57
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r6.height = r0
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.ikck.cp(com.android.thememanager.basemodule.ad.model.AdInfo, android.widget.ImageView, android.view.View):void");
    }

    private void d6od(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        View viewM6498z = AdUtils.m6498z(this.bp, onlineResourceDetail.adEid);
        this.am = viewM6498z;
        if (viewM6498z == null) {
            return;
        }
        com.android.thememanager.ad.download.controller.toq toqVarO1t = AdUtils.o1t(getActivity(), this.am, adInfoCheckAndGetAdInfo, onlineResourceDetail.adEid, ps(), wtop());
        this.bd = toqVarO1t;
        C1653q.toq(toqVarO1t);
        C2271y c2271y = new C2271y(this.am);
        this.ay = c2271y;
        C1653q.m6526k(c2271y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d9i(View view) {
        alcv();
    }

    private void f26p(OnlineResourceDetail onlineResourceDetail, int dataPart) {
        if ((dataPart & 1) != 0) {
            a3dw(onlineResourceDetail, !TextUtils.isEmpty(onlineResourceDetail.adInfo));
            mla(onlineResourceDetail);
            lg4k(onlineResourceDetail);
            l7o(onlineResourceDetail, false);
        }
        if ((dataPart & 2) != 0) {
            brv(onlineResourceDetail);
            if (TextUtils.isEmpty(onlineResourceDetail.adEid) || AdUtils.f9445y.equals(onlineResourceDetail.adEid)) {
                cr3(onlineResourceDetail);
            } else {
                d6od(onlineResourceDetail);
            }
            l7o(onlineResourceDetail, true);
            wu(onlineResourceDetail);
            qppo(onlineResourceDetail);
        }
        if (this.f13395j) {
            verb();
        }
    }

    private DrmManager.TrialLimits gw() {
        File file = new File(new ResourceResolver(wtop().getResource(), C2082k.zy().m8001n().m10535g(wtop().mo5853k())).getRightsPath());
        if (file.exists()) {
            return DrmManager.getTrialLimits(file);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ie(ThemeStatus themeStatus) {
        if (98 == themeStatus.status) {
            com.android.thememanager.basemodule.utils.ni7.m7146k().m7148q(dy, new Intent(dy));
            verb();
        }
        if (99 == themeStatus.status) {
            c2(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jb9(View view) {
        e4e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jglj(AdapterView adapterView, View view, int i2, long j2) {
        z617();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jog(View view) {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            u38j().m6909i(getActivity(), new toq());
        } else {
            if (com.android.thememanager.basemodule.utils.lvui.kja0(this, this.w97r)) {
                return;
            }
            mkmm();
        }
    }

    private void jre(String actionType, @zy.dd String content) {
        boolean zEquals = "TRIAL".equals(actionType);
        if (zEquals) {
            actionType = "APPLY";
        }
        Resource resource = wtop().getResource();
        String strMo5853k = wtop().mo5853k();
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("name", resource.getTitle());
        arrayMapM6679k.put("resourceType", strMo5853k);
        arrayMapM6679k.put("productId", resource.getOnlineId());
        if (content != null) {
            arrayMapM6679k.put("content", content);
        }
        if ("APPLY".equals(actionType)) {
            arrayMapM6679k.put("type", zEquals ? com.android.thememanager.basemodule.analysis.toq.xn : com.android.thememanager.basemodule.analysis.toq.hql);
        }
        if ("APPLY".equals(actionType)) {
            arrayMapM6679k.put("resourceType", strMo5853k);
            Resource resource2 = this.f13393e;
            arrayMapM6679k.put("productId", resource2 == null ? this.f13399r : resource2.getOnlineId());
        }
        C1708s.f7l8().ld6().n5r1(actionType, C1706p.n7h(kx3(), resource.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(View view) {
        boolean zO1t = wtop().o1t();
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && !zO1t) {
            u38j().m6909i(getActivity(), new zy());
        } else if (zO1t || !com.android.thememanager.basemodule.utils.lvui.kja0(this, this.tgs)) {
            zaso();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ln(View view) {
        wtop().jk(requireActivity(), !this.az.isSelected());
    }

    private void mq() {
        this.in.setVisibility(8);
        this.id.setVisibility(0);
        this.bp.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qexj(View view) {
        c25();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rig(int i2) {
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ac;
        if (cdjVar == null || !cdjVar.isShowing()) {
            return;
        }
        this.ac.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sm(View view) {
        vymi();
        wtop().f7l8();
    }

    private void vymi() {
        this.in.setVisibility(0);
        this.id.setVisibility(8);
        this.bp.setVisibility(8);
    }

    private void wh(@zy.dd String description) {
        Resource resource = wtop().getResource();
        if (this.ac == null) {
            if (this.bb == null || owi() == null) {
                return;
            }
            int bottom = (this.bb.getBottom() - owi().getBottom()) - 10;
            boolean zZ1r = z1r(resource);
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = new com.android.thememanager.detail.theme.view.widget.cdj(getActivity(), resource.getTitle(), resource.getScore(), description, UIUpdateLog.getUpdateString(this.be), bottom, zZ1r);
            this.ac = cdjVar;
            cdjVar.m7814q(zZ1r, resource.getScore());
            this.ac.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.android.thememanager.module.detail.view.y2
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ikck.ybb();
                }
            });
        }
        if (!this.ac.isShowing()) {
            this.ac.showAtLocation(this.bb, 80, 0, 0);
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.jrla));
    }

    private void wqp(boolean oneButton) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (oneButton) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.de_detail_title_max_width_with_one_button);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.de_detail_info_max_width_with_one_button);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.de_detail_title_max_width_with_two_buttons);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.de_detail_info_max_width_with_two_buttons);
        }
        if (C1807g.m7081r()) {
            return;
        }
        ((TextView) this.bp.findViewById(R.id.title)).setMaxWidth(dimensionPixelSize);
        ((TextView) this.bp.findViewById(R.id.info)).setMaxWidth(dimensionPixelSize2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x3b(View view) {
        erbd();
    }

    private void xo() {
        if (ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED)) {
            if (this.ba != null) {
                jre("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.oa);
            }
            if (this.ax != null) {
                if (getString(R.string.resource_apply).contentEquals(this.ax.getText())) {
                    nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.bqr, wtop().mo5853k());
                } else if (getString(R.string.resource_download).contentEquals(this.ax.getText())) {
                    nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.uyb, wtop().mo5853k());
                } else if (getString(R.string.resource_update).contentEquals(this.ax.getText())) {
                    nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.mj4s, wtop().mo5853k());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xouc(View view) {
        xnu(view, (ViewGroup) view.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ybb() {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.zxe));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zi4o(C1999n c1999n, DetailTagLayout detailTagLayout, View view, int i2) {
        Intent intentM9540h;
        if (C1807g.m7081r()) {
            intentM9540h = new Intent();
            intentM9540h.setAction(p001b.f7l8.f53780f7z0);
        } else {
            intentM9540h = com.android.thememanager.toq.m9540h(getActivity(), wtop().mo5853k(), c1999n.getItem(i2));
        }
        startActivity(intentM9540h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zt(View view) {
        wtop().gvn7(requireActivity(), !this.as.isSelected());
    }

    protected void a3dw(OnlineResourceDetail onlineResourceDetail, boolean isShowAdDownloadBtn) {
        int iZurt;
        List<String> list = onlineResourceDetail.snapshotsUrl;
        String str = onlineResourceDetail.snapshotAspectRatio;
        this.bl = (ResourceDetailPreview) this.bp.findViewById(R.id.preview_container);
        if (C1807g.m7081r()) {
            iZurt = getResources().getDimensionPixelSize(R.dimen.pad_detail_preview_height);
        } else {
            iZurt = isShowAdDownloadBtn ? AdUtils.zurt(onlineResourceDetail.adEid) : com.android.thememanager.basemodule.utils.y9n.fn3e().y - getResources().getDimensionPixelSize(R.dimen.de_detail_preview_bottom_offset);
            if (com.android.thememanager.basemodule.utils.y9n.m7258z() && !com.android.thememanager.util.gc3c.m9777h()) {
                iZurt -= com.android.thememanager.util.gc3c.m9781p();
            }
        }
        int i2 = iZurt;
        int i3 = 0;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 2) {
                i3 = (Integer.parseInt(strArrSplit[0]) * i2) / Integer.parseInt(strArrSplit[1]);
            }
        }
        int i4 = i3 == 0 ? i2 / 2 : i3;
        if (this.bl == null) {
            return;
        }
        this.bl.setData(list, i4, i2, wtop().mo5853k(), null, wtop().getResource() != null ? wtop().getResource().getMiuiAdapterVersion() : null, (wtop().getResource() != null ? Integer.valueOf(wtop().getResource().getLocalPlatform()) : null).intValue());
        this.bl.setOnItemClickListener(new zy.InterfaceC2004k() { // from class: com.android.thememanager.module.detail.view.t8iq
            @Override // com.android.thememanager.detail.theme.view.zy.InterfaceC2004k
            /* JADX INFO: renamed from: k */
            public final void mo7820k(int i5) {
                this.f13347k.rig(i5);
            }
        });
    }

    protected ThemeOperationButton bf5(View headerView) {
        return (ThemeOperationButton) headerView.findViewById(R.id.operation_btn_apply);
    }

    protected void brv(OnlineResourceDetail onlineResourceDetail) {
        View viewFindViewById = this.bp.findViewById(R.id.icon_container);
        DetailActionView detailActionView = (DetailActionView) viewFindViewById.findViewById(R.id.like);
        this.as = detailActionView;
        detailActionView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.zp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13411k.zt(view);
            }
        });
        mo5847t(onlineResourceDetail.like, onlineResourceDetail.likeCount.intValue());
        DetailActionView detailActionView2 = (DetailActionView) viewFindViewById.findViewById(R.id.comment);
        this.bg = detailActionView2;
        if (detailActionView2 != null) {
            if (C1688q.cdj().jk()) {
                this.bg.setVisibility(8);
            } else {
                this.bg.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13381k.b6(view);
                    }
                });
                ek5k(onlineResourceDetail.commentCount);
            }
        }
        DetailActionView detailActionView3 = (DetailActionView) viewFindViewById.findViewById(R.id.favorite);
        this.az = detailActionView3;
        detailActionView3.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13226k.ln(view);
            }
        });
        v0af(onlineResourceDetail.collect);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.share);
        if (wtop().zy()) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.nmn5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13317k.jb9(view);
                }
            });
        } else {
            viewFindViewById2.setVisibility(8);
        }
        DetailActionView detailActionView4 = (DetailActionView) viewFindViewById.findViewById(R.id.reward);
        this.bq = detailActionView4;
        if (onlineResourceDetail.productPrice == 0) {
            detailActionView4.setVisibility(0);
        }
        if (wtop().oc()) {
            jbh();
        }
        this.bq.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.lv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13303k.x3b(view);
            }
        });
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            return;
        }
        viewFindViewById.setVisibility(0);
    }

    protected void c2(int state) {
        if (this.ba == null || this.ax == null) {
            return;
        }
        Resource resource = wtop().getResource();
        switch (state) {
            case 0:
                if (wtop().x2()) {
                    if (C2244g.zy(wtop().mo5853k(), resource) && !C2244g.m8367g(wtop().mo5853k(), resource)) {
                        this.ax.setText(R.string.resource_apply);
                        this.ba.setVisibility(8);
                        if (wtop().oc()) {
                            jbh();
                        }
                    } else if (C2244g.m8367g(wtop().mo5853k(), resource)) {
                        this.ax.setText(R.string.resource_update);
                    } else {
                        this.ax.setText(R.string.resource_download);
                    }
                } else if (this.f13392c != null) {
                    this.ax.setText(R.string.de_redeem);
                } else {
                    if (wtop().qrj()) {
                        this.ba.setVisibility(0);
                        boolean zM8381s = com.android.thememanager.module.detail.util.zy.m8381s(this.f13398o, resource);
                        DrmManager.TrialLimits trialLimitsGw = gw();
                        if (!zM8381s || trialLimitsGw == null || trialLimitsGw.endTime <= System.currentTimeMillis()) {
                            this.ba.setText(R.string.de_try);
                        } else {
                            this.ba.setCountDown(trialLimitsGw.endTime - System.currentTimeMillis());
                        }
                    }
                    if (this.f13395j) {
                        this.ax.setText(R.string.resource_buy);
                    } else {
                        this.ax.setText(C1815m.toq(getActivity(), resource.getProductPrice()));
                    }
                }
                wqp(this.ba.getVisibility() != 0);
                break;
            case 1:
                this.ba.setLoading(true);
                this.ax.setEnabled(false);
                break;
            case 2:
            case 4:
            case 6:
            case 7:
                if (!wtop().x2()) {
                    this.ba.setLoading(true);
                    this.ax.setEnabled(false);
                } else {
                    this.ba.setEnabled(false);
                    this.ax.setLoading(true);
                }
                break;
            case 3:
                this.ba.setEnabled(false);
                this.ax.setLoading(true);
                break;
            case 8:
                this.ba.setVisibility(8);
                break;
        }
    }

    public int cjaj() {
        return (C1807g.m7081r() && ("fonts".equals(this.f13398o) || "icons".equals(this.f13398o))) ? R.layout.pad_online_font_detail_header : com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.de_online_font_detail_header, R.layout.de_online_font_detail_header_elder);
    }

    protected void cr3(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        TextView textView;
        TextView textView2;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        boolean zM6525h = C1653q.m6525h(adInfoCheckAndGetAdInfo.dspName);
        ViewStub viewStub = (ViewStub) this.bp.findViewById(R.id.ad_stub);
        if (viewStub != null) {
            if (zM6525h) {
                viewStub.setLayoutResource(R.layout.element_ad_detail_dsp_banner);
            }
            View viewInflate = viewStub.inflate();
            this.am = viewInflate;
            View viewFindViewById = viewInflate.findViewById(R.id.ad_info_view);
            AdSubTextView adSubTextView = (AdSubTextView) this.am.findViewById(R.id.ad_textview);
            if (zM6525h) {
                textView = (TextView) this.am.findViewById(R.id.ad_title);
                textView2 = (TextView) this.am.findViewById(R.id.ad_subtitle);
            } else {
                textView = null;
                textView2 = null;
            }
            TextView textView3 = (TextView) this.am.findViewById(R.id.download_button);
            ImageView imageView = (ImageView) this.am.findViewById(R.id.thumbnail);
            C6077k.o1t(imageView);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.round_corner_default);
            cp(adInfoCheckAndGetAdInfo, imageView, viewFindViewById);
            C1653q.m6530s(getActivity(), adInfoCheckAndGetAdInfo, this.am, imageView, dimensionPixelSize, textView, textView2, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
            C2271y c2271y = new C2271y(this.am);
            this.ay = c2271y;
            C1653q.m6526k(c2271y);
            if (ps()) {
                wtop().d2ok();
            }
            com.android.thememanager.ad.download.controller.toq toqVar = new com.android.thememanager.ad.download.controller.toq(textView3, adSubTextView, adInfoCheckAndGetAdInfo, true);
            this.bd = toqVar;
            C1653q.toq(toqVar);
            C1812k.toq(imageView, C1653q.x2(adInfoCheckAndGetAdInfo));
        }
    }

    @Override // c8jq.InterfaceC1392k.n
    public void ek5k(int count) {
        String strZy = count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_comment);
        this.bg.setInfo(false, strZy);
        if (count > 0) {
            C1812k.toq(this.bg, getString(R.string.accessibiliy_description_content_comment) + strZy);
        }
    }

    protected int eu() {
        return R.layout.resource_preview;
    }

    @Override // com.android.thememanager.basemodule.views.NestViewPager.toq
    /* JADX INFO: renamed from: f */
    public boolean mo7321f(int direction) {
        ResourceDetailPreview resourceDetailPreview = this.bl;
        return resourceDetailPreview != null && resourceDetailPreview.canScrollHorizontally(direction);
    }

    @Override // c8jq.InterfaceC1392k.zy
    /* JADX INFO: renamed from: g */
    public retrofit2.toq<CommonResponse<UIPage>> mo5859g(int randIndex, int cardStart) {
        if (wtop() == null) {
            return null;
        }
        return wtop().ixz(randIndex, cardStart);
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        RewardDialog rewardDialog = this.bc;
        if (rewardDialog != null && rewardDialog.hb()) {
            this.bc = null;
            return true;
        }
        ResourceDetailPreview resourceDetailPreview = this.bl;
        if (resourceDetailPreview != null) {
            return resourceDetailPreview.a9();
        }
        return false;
    }

    @Override // c8jq.InterfaceC1392k.n
    public void jbh() {
        ResourceDetailPreview resourceDetailPreview;
        RewardDialog rewardDialog = this.bc;
        if ((rewardDialog == null || rewardDialog.getWindowToken() == null) && !this.bu && this.bq != null && ps() && !com.android.thememanager.detail.theme.view.widget.ki.zy() && (resourceDetailPreview = this.bl) != null && !resourceDetailPreview.jp0y()) {
            this.bu = true;
            this.bq.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2268k());
        }
        DetailActionView detailActionView = this.bq;
        if (detailActionView != null) {
            com.android.thememanager.detail.theme.view.widget.ki.m7815g(detailActionView, getActivity());
        }
    }

    protected void l7o(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        TextView textView = (TextView) this.bp.findViewById(R.id.author_component);
        View viewFindViewById = this.bp.findViewById(R.id.author_container);
        if (TextUtils.isEmpty(onlineResourceDetail.designerName)) {
            textView.setVisibility(8);
            viewFindViewById.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        int iKja0 = p001b.toq.kja0(wtop().mo5853k());
        if (iKja0 != 0) {
            textView.setText(getString(R.string.de_resource_author, getString(iKja0)));
        } else {
            textView.setText(R.string.description_designer);
        }
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.a98o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13214k.qexj(view);
            }
        });
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.author_avatar);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(getActivity(), onlineResourceDetail.designerIcon, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.icon_default_avatar));
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.author_name);
        textView2.setSelected(true);
        textView2.setText(onlineResourceDetail.designerName);
        if (isOnline) {
            View viewFindViewById2 = this.bp.findViewById(R.id.author_info_container);
            TextView textView3 = (TextView) viewFindViewById2.findViewById(R.id.author_theme_amount);
            Resources resources = getResources();
            int i2 = onlineResourceDetail.productCount;
            textView3.setText(resources.getQuantityString(R.plurals.de_author_theme_amount, i2, Integer.valueOf(i2)));
            viewFindViewById2.setVisibility(0);
            C6077k.fn3e(imageView, viewFindViewById);
            C6077k.m22376y(textView2, viewFindViewById);
            C6077k.m22376y(textView3, viewFindViewById);
        }
    }

    protected void lg4k(OnlineResourceDetail onlineResourceDetail) {
        ThemeOperationButton themeOperationButton = (ThemeOperationButton) this.bp.findViewById(R.id.operation_btn_try);
        this.ba = themeOperationButton;
        themeOperationButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13370k.jog(view);
            }
        });
        ThemeOperationButton themeOperationButtonBf5 = bf5(this.bp);
        this.ax = themeOperationButtonBf5;
        themeOperationButtonBf5.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.bf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13218k.l0(view);
            }
        });
        ((C2226h) this.f13400t).h7am(0);
        if (!wtop().x2() && onlineResourceDetail.originPrice > onlineResourceDetail.productPrice) {
            TextView textView = (TextView) this.bp.findViewById(R.id.origin_price);
            textView.getPaint().setFlags(textView.getPaintFlags() | 16);
            textView.setText(C1815m.toq(getActivity(), onlineResourceDetail.originPrice));
            textView.setVisibility(0);
        }
        if (ps()) {
            xo();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return this.f13394f;
    }

    public void mkmm() {
        int state = wtop().getState();
        if (state == 0) {
            anw();
        } else if (state == 4) {
            wtop().mo5856q();
        } else if (state == 5) {
            wtop().mo5854n();
        }
    }

    protected void mla(final OnlineResourceDetail onlineResourceDetail) {
        ((TextView) this.bp.findViewById(R.id.title)).setText(com.android.thememanager.basemodule.utils.fu4.zy(wtop().getResource(), onlineResourceDetail.name));
        if (TextUtils.isEmpty(onlineResourceDetail.description)) {
            this.bp.findViewById(R.id.info_container).setVisibility(8);
        } else {
            ((TextView) this.bp.findViewById(R.id.info)).setText(onlineResourceDetail.description.trim());
            this.bp.findViewById(R.id.more_info).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13351k.cb(onlineResourceDetail, view);
                }
            });
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void nc(String verifyResult) {
        this.bc.setVerifyResult(verifyResult);
        this.bc.m7800l();
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.analysis.qrj
    public void nme(String actionType, String trackId, String extra) {
        super.nme(actionType, trackId, extra);
        jre(actionType, null);
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4001 && this.ar) {
            this.ar = false;
            pnt2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.de_fragment_online_font_detail, container, false);
        this.bb = viewGroup;
        ResourceEmptyView resourceEmptyView = (ResourceEmptyView) viewGroup.findViewById(R.id.empty_view);
        this.id = resourceEmptyView;
        resourceEmptyView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13215k.sm(view);
            }
        });
        this.in = this.bb.findViewById(R.id.loading);
        y3();
        return this.bb;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ThemeOperationButton themeOperationButton = this.ba;
        if (themeOperationButton != null) {
            themeOperationButton.zy();
            this.ba = null;
        }
        ThemeOperationButton themeOperationButton2 = this.ax;
        if (themeOperationButton2 != null) {
            themeOperationButton2.zy();
            this.ax = null;
        }
        InterfaceC1694q interfaceC1694q = this.ay;
        if (interfaceC1694q != null) {
            AdUtils.jp0y(interfaceC1694q);
        }
        ViewGroup viewGroup = this.bb;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.bb = null;
        }
        this.bv = null;
        C1653q.ki(this.bd);
        super.onDestroyView();
    }

    protected View owi() {
        return this.bl;
    }

    protected void qppo(OnlineResourceDetail onlineResourceDetail) {
        View viewFindViewById = this.bp.findViewById(R.id.detail_tags_component);
        String str = onlineResourceDetail.tags;
        if (TextUtils.isEmpty(str)) {
            viewFindViewById.setVisibility(8);
            return;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length == 0) {
            viewFindViewById.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        DetailTagLayout detailTagLayout = (DetailTagLayout) viewFindViewById.findViewById(R.id.detail_tags_container);
        final C1999n c1999n = new C1999n(getActivity());
        detailTagLayout.setAdapter(c1999n);
        detailTagLayout.setOnTagClickListener(new DetailTagLayout.toq() { // from class: com.android.thememanager.module.detail.view.bo
            @Override // com.android.thememanager.detail.theme.view.widget.DetailTagLayout.toq
            /* JADX INFO: renamed from: k */
            public final void mo7764k(DetailTagLayout detailTagLayout2, View view, int i2) {
                this.f13219k.zi4o(c1999n, detailTagLayout2, view, i2);
            }
        });
        c1999n.m7819k(Arrays.asList(strArrSplit));
    }

    @Override // com.android.thememanager.basemodule.base.toq
    protected void ra(boolean visibleForUser) {
        if (visibleForUser) {
            if (this.am != null && wtop() != null) {
                wtop().d2ok();
            }
            xo();
        } else {
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ac;
            if (cdjVar != null && cdjVar.isShowing()) {
                this.ac.dismiss();
            }
        }
        if (visibleForUser && wtop().oc()) {
            jbh();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void rf(String onlineId, String designerName) {
        RewardDialog rewardDialog = this.bc;
        if (rewardDialog == null || rewardDialog.getWindowToken() == null) {
            this.bc = new RewardDialog(getActivity(), onlineId, designerName, wtop());
            ((ViewGroup) getActivity().getWindow().getDecorView()).addView(this.bc);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    @zy.lvui
    /* JADX INFO: renamed from: s31, reason: merged with bridge method [inline-methods] */
    public C2226h lk() {
        return (C2226h) new C0924e(this).m4420k(C2226h.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean visible) {
        super.setMenuVisibility(visible);
        nnh(visible);
    }

    @Override // c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: t */
    public void mo5847t(boolean like, int count) {
        String strZy = count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_like);
        this.as.setInfo(like, strZy);
        if (count <= 0) {
            C1812k.toq(this.as, getString(R.string.de_icon_text_like));
            return;
        }
        C1812k.toq(this.as, getString(R.string.de_icon_text_like) + strZy);
    }

    @Override // c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: u */
    public void mo5848u(@zy.dd InterfaceC1392k.n.k callback) {
        this.aj = callback;
        if (callback != null && this.bs) {
            callback.mo5850k();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: v */
    public void mo5849v(int progress) {
        if (wtop().x2()) {
            this.ax.setProgress(progress);
            this.ba.setEnabled(false);
        } else {
            this.ba.setProgress(progress);
            this.ax.setEnabled(false);
        }
    }

    @Override // c8jq.InterfaceC1392k.n
    public void v0af(boolean favorite) {
        this.az.setInfo(favorite, null);
    }

    protected void verb() {
        if ((getActivity() instanceof AbstractActivityC1717k) && !C1807g.m7081r()) {
            if (!wtop().mo5857t()) {
                ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(null);
                return;
            }
            ImageView imageView = new ImageView(getActivity());
            C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
            imageView.setBackgroundResource(R.drawable.action_immersion);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13212k.xouc(view);
                }
            });
            ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(imageView);
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void vg() {
        super.vg();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.an = arguments.getString("resource_code");
            this.ar = arguments.getBoolean("auto_buy", false);
            this.k0 = arguments.getBoolean("auto_restore", false);
            arguments.remove("auto_buy");
            arguments.remove("auto_restore");
        }
        this.f13398o = this.an;
    }

    protected void wu(OnlineResourceDetail onlineResourceDetail) {
        if (C1688q.cdj().jk()) {
            return;
        }
        DetailTopComment detailTopComment = (DetailTopComment) this.bp.findViewById(R.id.top_comment);
        detailTopComment.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13266k.d9i(view);
            }
        });
        ResourceCommentItem resourceCommentItem = onlineResourceDetail.comment;
        if (resourceCommentItem != null) {
            detailTopComment.setInfo(resourceCommentItem.userName, resourceCommentItem.updateTime, resourceCommentItem.score, resourceCommentItem.content, onlineResourceDetail.commentCount);
        } else {
            detailTopComment.setInfo(null, 0L, 0.0f, null, 0);
        }
        this.bp.findViewById(R.id.top_comment_title).setVisibility(0);
        detailTopComment.setVisibility(0);
    }

    public void xnu(View anchor, ViewGroup parent) {
        if (this.ad == null) {
            C1977k c1977k = new C1977k(getActivity());
            C7177g c7177g = new C7177g(getActivity());
            this.ad = c7177g;
            c7177g.x2(c1977k);
            this.ad.m26034b(new AdapterView.OnItemClickListener() { // from class: com.android.thememanager.module.detail.view.c8jq
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    this.f13223k.jglj(adapterView, view, i2, j2);
                }
            });
        }
        if (this.ad.isShowing()) {
            return;
        }
        this.ad.kja0(anchor, parent);
    }

    protected void y3() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(cjaj(), this.bb, false);
        this.bp = viewInflate;
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(R.id.preview_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(eu());
            viewStub.inflate();
        }
        StaggeredGridLayoutManager.zy zyVar = new StaggeredGridLayoutManager.zy(-1, -2);
        zyVar.x2(true);
        this.bp.setLayoutParams(zyVar);
        wtop().fn3e(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.gyi
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13258k.ae4((Pair) obj);
            }
        });
        if (this.ar) {
            this.ar = false;
            pnt2();
        } else if (this.k0) {
            this.k0 = false;
            wtop().mo5852i();
        }
        wtop().mcp(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.dr
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13241k.c2(((Integer) obj).intValue());
            }
        });
        wtop().mo5851h(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.xwq3
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13384k.ie((ThemeStatus) obj);
            }
        });
        vymi();
    }

    protected void ydj3() {
        if (this.bv != null) {
            return;
        }
        IRecommendListView iRecommendListViewBuild = C1394k.m5862q().setContext(this).setRefresh(false).setLoadMore(false).setRequest(new f7l8()).build();
        this.bv = iRecommendListViewBuild;
        iRecommendListViewBuild.addHeaderView(this.bp);
        this.bb.addView(this.bv, 0);
    }

    protected boolean z1r(Resource resource) {
        return resource.getScore() < 0.0f || C1807g.m7081r();
    }

    public void zaso() {
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
                xzl(true);
                return;
            }
            if (!InterfaceC1789q.q28.contains(wtop().mo5853k())) {
                wtop().apply();
                return;
            }
            if (this.tlhn == null) {
                this.tlhn = com.android.thememanager.superwallpaper.util.zy.m9516k(getActivity(), new DialogInterfaceOnClickListenerC2267g());
            }
            if (this.tlhn.isShowing()) {
                return;
            }
            this.tlhn.show();
            return;
        }
        int state = wtop().getState();
        if (state == 0) {
            if (wtop().mo5855p() || !C1688q.cdj().o1t()) {
                xzl(false);
                return;
            } else {
                pnt2();
                return;
            }
        }
        if (state == 4) {
            wtop().mo5856q();
        } else if (state == 5) {
            wtop().mo5854n();
        }
    }

    @Override // c8jq.InterfaceC1392k.n
    public void zwy(int count) {
    }
}
