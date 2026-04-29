package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.database.C1960k;
import com.android.thememanager.database.ThemeDatabase;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.view.widget.DetailActionView;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.C2229n;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.recommend.view.listview.C2365g;
import com.android.thememanager.recommend.view.listview.RecommendVMListView;
import com.android.thememanager.recommend.view.listview.decoration.C2364q;
import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.view.C2938r;
import com.android.thememanager.view.largeicon.LargeIconHeaderView;
import com.google.gson.C4871g;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.ref.WeakReference;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.ki;
import miuix.internal.widget.C7177g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.activity.v */
/* JADX INFO: compiled from: LargeIconDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class C1627v extends com.android.thememanager.module.detail.view.ikck {
    private static final String cw14 = "largeIcon";
    public static final String hp = "package_name";
    private miuix.appcompat.app.ki k6e;
    private C2449k s8y;
    private LargeIconHeaderView vb6;
    private int xk5 = com.android.thememanager.basemodule.network.theme.toq.toq();
    private androidx.lifecycle.jp0y<Pair<OnlineResourceDetail, Integer>> mjvl = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.y2
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f9398k.wr((Pair) obj);
        }
    };

    /* JADX INFO: renamed from: com.android.thememanager.activity.v$k */
    /* JADX INFO: compiled from: LargeIconDetailFragment.java */
    class k implements androidx.lifecycle.jp0y<C1960k> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ LiveData f9345k;

        k(final LiveData val$packageLiveData) {
            this.f9345k = val$packageLiveData;
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(C1960k largeIconInfo) {
            this.f9345k.kja0(this);
            if (largeIconInfo == null || ((com.android.thememanager.module.detail.view.y9n) C1627v.this).f13396l == null || !p029m.zy.m24738k(largeIconInfo.f58003toq, ((com.android.thememanager.module.detail.view.y9n) C1627v.this).f13396l.productPackageName)) {
                return;
            }
            try {
                ((ThemeDetailActivity) C1627v.this.getActivity()).vy(String.format(C1627v.this.getActivity().getResources().getString(R.string.large_icon_detail_title), largeIconInfo.f58004zy));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.activity.v$q */
    /* JADX INFO: compiled from: LargeIconDetailFragment.java */
    interface q {
        /* JADX INFO: renamed from: k */
        void mo6479k(String packageName);
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.v$toq */
    /* JADX INFO: compiled from: LargeIconDetailFragment.java */
    class toq extends IRecommendListView.CallBack<UIPage> {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            if (((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp == null || !com.android.thememanager.util.gc3c.cdj(C1627v.this.getActivity())) {
                return;
            }
            ((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp.setPadding(((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp.getPaddingLeft(), ((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp.getPaddingTop(), ((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp.getPaddingRight(), C1627v.this.getResources().getDimensionPixelSize(R.dimen.de_no_recommendation_padding_bottom));
            super.onRecommendLoadFail(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            View viewFindViewById;
            if (((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp != null && (viewFindViewById = ((com.android.thememanager.module.detail.view.ikck) C1627v.this).bp.findViewById(R.id.detail_recommend_title)) != null) {
                viewFindViewById.setVisibility(0);
            }
            super.onRecommendLoadSuccess(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        @zy.y9n
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh) {
                ((com.android.thememanager.basemodule.base.toq) C1627v.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.v$zy */
    /* JADX INFO: compiled from: LargeIconDetailFragment.java */
    class zy implements IRecommendListView.Request {
        zy() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return C1627v.this.wtop().wx16(C1627v.this.xk5, cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            C1627v.this.xk5 = com.android.thememanager.basemodule.network.theme.toq.toq();
            return C1627v.this.wtop().mo28256do(C1627v.this.xk5);
        }
    }

    private void e9s(String packageNameParam, q iCheckAppInstallCallback) {
        Log.i(cw14, "checkAndWarningWhileNotInstalled: " + packageNameParam);
        final WeakReference weakReference = new WeakReference(iCheckAppInstallCallback);
        final LiveData<C1960k> liveDataCdj = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().cdj(packageNameParam);
        if (liveDataCdj == null) {
            Log.d(cw14, "checkAndWarningWhileNotInstalled: packageLiveData == null");
        } else {
            liveDataCdj.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.u
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f9340k.g41(liveDataCdj, weakReference, (C1960k) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g41(LiveData liveData, WeakReference weakReference, C1960k c1960k) {
        liveData.m4389h(this);
        if (c1960k == null) {
            Log.i(cw14, "checkAndWarningWhileNotInstalled: largeIconInfo is null.");
            return;
        }
        Log.d(cw14, "observe " + c1960k.f58003toq);
        String strRlj = rlj(c1960k.f58003toq);
        if (com.android.thememanager.basemodule.utils.a9.m6999s(strRlj)) {
            if (weakReference.get() != null) {
                ((q) weakReference.get()).mo6479k(strRlj);
                return;
            } else {
                Log.i(cw14, "checkAndWarningWhileNotInstalled callback is null.");
                return;
            }
        }
        Log.i(cw14, "checkAndWarningWhileNotInstalled app not install " + strRlj);
        String[] strArr = c1960k.f58002f7l8;
        if (strArr == null || strArr.length <= 0) {
            zidq(c1960k, strRlj);
            return;
        }
        for (String str : strArr) {
            if (com.android.thememanager.basemodule.utils.a9.m6999s(rlj(str))) {
                if (weakReference.get() != null) {
                    ((q) weakReference.get()).mo6479k(strRlj);
                    return;
                } else {
                    Log.i(cw14, "checkAndWarningWhileNotInstalled: callback is null");
                    return;
                }
            }
        }
        zidq(c1960k, strRlj);
    }

    private void i8(final String packageName) {
        final LiveData<C1960k> liveDataCdj = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().cdj(packageName);
        liveDataCdj.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.dr
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f8984k.u0z(liveDataCdj, packageName, (C1960k) obj);
            }
        });
    }

    private int j3px() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2b8(C2247q c2247q, String str) {
        com.android.thememanager.module.detail.util.zy.zy(getActivity(), this.f13393e, c2247q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void krto(String str, DialogInterface dialogInterface, int i2) {
        i8(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void le9(C2938r c2938r) {
        c2(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lm(View view) {
        xnu(view, (ViewGroup) view.getParent());
    }

    private String rlj(String packageInfo) {
        String[] strArrSplit = packageInfo.split(C5658n.f73185t8r);
        return strArrSplit.length > 1 ? strArrSplit[0] : packageInfo;
    }

    private void t8fp(String productPackageName) {
        String strM6996n;
        if (productPackageName == null || !(getActivity() instanceof ThemeDetailActivity)) {
            strM6996n = "";
        } else {
            String[] strArrSplit = productPackageName.split(C5658n.f73185t8r);
            strM6996n = strArrSplit.length > 1 ? com.android.thememanager.basemodule.utils.a9.m6996n(strArrSplit[0], strArrSplit[1]) : com.android.thememanager.basemodule.utils.a9.m6996n(productPackageName, null);
            if (p029m.zy.toq(strM6996n)) {
                LiveData<C1960k> liveDataCdj = ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().cdj(productPackageName);
                if (liveDataCdj != null) {
                    liveDataCdj.m4391p(this, new k(liveDataCdj));
                }
                ((ThemeDetailActivity) getActivity()).vy("");
                return;
            }
        }
        ((ThemeDetailActivity) getActivity()).vy(p029m.zy.toq(strM6996n) ? "" : String.format(getActivity().getResources().getString(R.string.large_icon_detail_title), strM6996n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0z(LiveData liveData, String str, C1960k c1960k) {
        miuix.appcompat.app.ki kiVar;
        liveData.m4389h(this);
        if (c1960k == null || (kiVar = this.k6e) == null || !kiVar.isShowing()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        String[] strArr = c1960k.f58002f7l8;
        if (strArr == null || strArr.length <= 0) {
            intent.setData(C1803e.m7039p(str, true));
        } else {
            intent.setData(C1803e.ld6(c1960k.f58004zy));
        }
        try {
            getActivity().startActivity(intent);
        } catch (Exception e2) {
            Log.w(C2755a.f16307g, "checkAndWarningWhileNotInstalled error.", e2);
            intent.setData(C1803e.m7039p(str, false));
            try {
                getActivity().startActivity(intent);
            } catch (Exception e3) {
                Log.w(C2755a.f16307g, "checkAndWarningWhileNotInstalled cannot open market.", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wr(Pair pair) {
        if (pair == null || pair.first == null || !ps()) {
            return;
        }
        t8fp(((OnlineResourceDetail) pair.first).productPackageName);
    }

    private void yvs(String trackId, String packageName) {
        ArrayMap<String, Object> arrayMapX2 = C1706p.x2(com.android.thememanager.basemodule.analysis.toq.ja, trackId, null, null);
        arrayMapX2.put("app_package_name", packageName);
        C1708s.f7l8().ld6().cdj(arrayMapX2);
    }

    private void zidq(C1960k largeIconInfo, final String packageName) {
        Log.d(cw14, "showAppNotInstallDialog: " + packageName);
        if (this.k6e == null) {
            this.k6e = new ki.C6947k(getActivity()).x9kr(getContext().getResources().getString(R.string.large_icon_warning_install), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.c8jq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f8973k.krto(packageName, dialogInterface, i2);
                }
            }).t8r(getContext().getResources().getDrawable(R.drawable.icon)).mcp(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.gyi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).m25047s(false).m25037g();
        }
        String str = this.f13396l.largeIconsUrl_1x1;
        String str2 = largeIconInfo.f58004zy;
        String str3 = String.format(getContext().getResources().getString(R.string.large_icon_warning_not_install), str2);
        String str4 = String.format(getContext().getResources().getString(R.string.large_icon_warning_not_install_msg), str2);
        this.k6e.setTitle(str3);
        this.k6e.n5r1(str4);
        this.k6e.show();
        ImageView imageView = (ImageView) this.k6e.findViewById(android.R.id.icon);
        if (imageView != null) {
            com.android.thememanager.basemodule.imageloader.x2.m6782y(getActivity(), str, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(getContext().getResources().getDrawable(R.color.large_icon_header_selector_bg_color)).m6794t(40.0f));
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void a3dw(OnlineResourceDetail onlineResourceDetail, boolean isShowAdDownloadBtn) {
        this.vb6 = (LargeIconHeaderView) this.bp.findViewById(R.id.preview_container);
        ((ViewGroup.MarginLayoutParams) ((ViewGroup) this.bp.findViewById(R.id.operation_container)).getLayoutParams()).topMargin = getResources().getDimensionPixelOffset(R.dimen.large_icon_detail_title_margin_top);
        ((TextView) this.bp.findViewById(R.id.icon_size)).setTextColor(getResources().getColor(R.color.large_icon_detail_page_icon_size_title_text_color, null));
        LargeIconElement largeIconElementCreate = LargeIconElement.create(onlineResourceDetail, wtop().fu4(), onlineResourceDetail.productPackageName);
        if (largeIconElementCreate.signature == null) {
            largeIconElementCreate.signature = com.android.thememanager.basemodule.utils.vyq.fn3e("icons") + com.android.thememanager.basemodule.utils.vyq.fu4("icons");
        }
        wtop().mo8331s(largeIconElementCreate, 1);
        this.vb6.yz(wtop(), (ThemeDetailActivity) getActivity(), (RecyclerView) this.bp.findViewById(R.id.selector));
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void brv(OnlineResourceDetail onlineResourceDetail) {
        Resource resource;
        super.brv(onlineResourceDetail);
        DetailActionView detailActionView = this.bg;
        if (detailActionView != null) {
            detailActionView.setVisibility(8);
        }
        DetailActionView detailActionView2 = this.bq;
        if (detailActionView2 != null) {
            detailActionView2.setVisibility(4);
        }
        if (onlineResourceDetail.isOfficialIcons != 1 && ((resource = this.f13393e) == null || !resource.getLocalInfo().isOfficial())) {
            this.as.setVisibility(0);
            this.az.setVisibility(0);
        } else {
            this.bp.findViewById(R.id.icon_container).setVisibility(8);
            this.as.setVisibility(8);
            this.az.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void c2(int state) {
        if (wtop().ebn() && wtop().ni7() == 1) {
            this.ax.setText(R.string.resource_apply);
        } else {
            super.c2(state);
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void c25() {
        String str;
        String str2;
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        String str3 = onlineResourceDetail.designerName;
        if (str3 != null && (str = onlineResourceDetail.designerId) != null && (str2 = onlineResourceDetail.designerMiId) != null) {
            com.android.thememanager.toq.fn3e(this.f13397m, str, str2, str3);
            iz("AUTHOR_WORK", null);
            return;
        }
        Log.w(cw14, "gotoAuthorWork: large icon designer info may be null designerName = " + this.f13396l.designerName + "designerId = " + this.f13396l.designerId + "designerMiId = " + this.f13396l.designerMiId);
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.update_no_net, 0);
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected int eu() {
        return R.layout.large_icon_detail_preview;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    /* JADX INFO: renamed from: fbr, reason: merged with bridge method [inline-methods] */
    public C2229n wtop() {
        return (C2229n) super.wtop();
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void iz(String actionType, String extra) {
        if (!"FAVOURITE".equals(actionType) && !"DIS_FAVOURITE".equals(actionType) && !"LIKE".equals(actionType) && !"DIS_LIKE".equals(actionType) && !"BUY".equals(actionType) && !"BUY_SUCCESS".equals(actionType)) {
            super.iz(actionType, extra);
            return;
        }
        if (wtop() == null) {
            super.iz(actionType, extra);
            Log.w(cw14, "trackEvent: getPresenter() is null");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("app_package_name", wtop() == null ? null : wtop().ukdy());
        String str = this.f13394f;
        if (str == null) {
            str = this.f13399r;
        }
        nme(actionType, str, new C4871g().o1t(arrayMap));
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void l7o(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        super.l7o(onlineResourceDetail, isOnline);
        OnlineResourceDetail onlineResourceDetail2 = this.f13396l;
        if (onlineResourceDetail2 == null || onlineResourceDetail2.isOfficialIcons != 1) {
            return;
        }
        View viewFindViewById = this.bp.findViewById(R.id.author_container);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.author_theme_right_arrow);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(4);
        }
        viewFindViewById.setOnClickListener(null);
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void lg4k(OnlineResourceDetail onlineResourceDetail) {
        super.lg4k(onlineResourceDetail);
        ThemeOperationButton themeOperationButton = this.ax;
        if (themeOperationButton != null) {
            themeOperationButton.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.large_icon_detail_apply_button_width);
            this.ax.setTypeface(Typeface.create("mipro-regular", 0));
            this.ax.setTextSize(getResources().getDimensionPixelSize(R.dimen.large_icon_head_detail_apply_button_title));
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void m28(Resource resource) {
        super.m28(resource);
        if (this.f13395j) {
            verb();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.s8y = (C2449k) new C0924e(this).m4420k(C2449k.class);
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        miuix.appcompat.app.ki kiVar = this.k6e;
        if (kiVar == null || !kiVar.isShowing()) {
            return;
        }
        this.k6e.n7h();
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f13395j) {
            verb();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC7396q @zy.lvui View view, @InterfaceC7395n @zy.dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        if (onlineResourceDetail == null || onlineResourceDetail.isOfficialIcons != 1) {
            return;
        }
        wtop().mo8330g(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.t8iq
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9328k.le9((C2938r) obj);
            }
        });
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected View owi() {
        return this.vb6;
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void qppo(OnlineResourceDetail onlineResourceDetail) {
    }

    @Override // com.android.thememanager.module.detail.view.ikck, com.android.thememanager.basemodule.base.toq
    protected void ra(boolean visibleForUser) {
        String onlineId;
        String str;
        super.ra(visibleForUser);
        if (!visibleForUser) {
            wtop().uj2j(this.mjvl);
            return;
        }
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        String largeIconPackageName = null;
        if (onlineResourceDetail == null || (str = onlineResourceDetail.productPackageName) == null) {
            Resource resource = this.f13393e;
            if (resource == null || resource.getLocalInfo().getLargeIconPackageName() == null) {
                onlineId = null;
            } else {
                largeIconPackageName = this.f13393e.getLocalInfo().getLargeIconPackageName();
                onlineId = this.f13393e.getOnlineId();
            }
        } else {
            onlineId = onlineResourceDetail.trackId;
            largeIconPackageName = str;
        }
        if (largeIconPackageName == null) {
            wtop().fn3e(this, this.mjvl);
        }
        t8fp(largeIconPackageName);
        yvs(onlineId, largeIconPackageName);
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void verb() {
        if (getActivity() instanceof AbstractActivityC1717k) {
            if (!wtop().mo5857t()) {
                ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(null);
                C7177g c7177g = this.ad;
                if (c7177g == null || !c7177g.isShowing()) {
                    return;
                }
                this.ad.dismiss();
                return;
            }
            AbstractC6946k abstractC6946kM6709b = ((AbstractActivityC1717k) getActivity()).m6709b();
            if (abstractC6946kM6709b == null || abstractC6946kM6709b.v0af() == null) {
                ImageView imageView = new ImageView(getActivity());
                C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
                imageView.setBackgroundResource(R.drawable.action_immersion);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.bo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8940k.lm(view);
                    }
                });
                ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(imageView);
            }
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void wu(OnlineResourceDetail onlineResourceDetail) {
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void xblq(final C2247q args) {
        Log.i(cw14, "detail applyResource: " + args.f13157s);
        String str = args.f13157s;
        if (str == null) {
            return;
        }
        e9s(str, new q() { // from class: com.android.thememanager.activity.xwq3
            @Override // com.android.thememanager.activity.C1627v.q
            /* JADX INFO: renamed from: k */
            public final void mo6479k(String str2) {
                this.f9377k.k2b8(args, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.ikck
    /* JADX INFO: renamed from: xh, reason: merged with bridge method [inline-methods] */
    public C2229n lk() {
        C2229n c2229n = (C2229n) new C0924e(this).m4420k(C2229n.class);
        Resource resource = this.f13393e;
        if (resource != null && resource.getLocalInfo() != null) {
            c2229n.pc(this.f13393e.getLocalInfo().getLargeIconPackageName(), this.f13393e.getLocalInfo().isOfficial());
        }
        return c2229n;
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void ydj3() {
        if (this.bv == null) {
            C2365g c2365g = new C2365g();
            c2365g.mcp(this.s8y);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.large_icon_detail_list_item_horizontal_padding);
            IRecommendListViewBuilder refresh = c2365g.setContext(this).setResCode(wtop().mo5853k()).setRefresh(false);
            Resource resource = this.f13393e;
            IRecommendListView iRecommendListViewBuild = refresh.setLoadMore((resource == null || resource.getLocalInfo() == null || this.f13393e.getLocalInfo().isOfficial() || LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID.equals(this.f13393e.getOnlineId())) ? false : true).setLayoutManagerType(0).setStaggerHolderWidth(RecommendVMListView.n7h(j3px(), dimensionPixelOffset, dimensionPixelOffset)).setLayoutManagerSpanCount(j3px()).setItemDecoration(new C2364q(j3px(), dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 1)).setRequest(new zy()).setCallBack(new toq()).build();
            this.bv = iRecommendListViewBuild;
            iRecommendListViewBuild.addHeaderView(this.bp);
            this.bb.addView(this.bv, 0);
        }
        if (!this.s8y.a9()) {
            if (wtop().zurt()) {
                this.bv.refreshData();
            }
        } else {
            View viewFindViewById = this.bp.findViewById(R.id.detail_recommend_title);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected boolean z1r(Resource resource) {
        return true;
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    public void zaso() {
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.large_icon_apply_fail_for_in_oldmode, 0);
        } else if (wtop().ebn() && wtop().ni7() == 1) {
            wtop().apply();
        } else {
            super.zaso();
        }
    }
}
