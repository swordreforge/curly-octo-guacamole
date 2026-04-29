package com.android.thememanager.recommend.view.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import androidx.collection.C0247k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1808h;
import com.android.thememanager.basemodule.utils.dd;
import com.android.thememanager.basemodule.views.FastScrollStaggeredGridLayoutManager;
import com.android.thememanager.basemodule.views.ThemeLinearLayoutManager;
import com.android.thememanager.basemodule.views.f7l8;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.springback.view.SpringBackLayout;
import yqrt.C7792k;
import yz.C7794k;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class RecommendListView extends IRecommendListView {

    /* JADX INFO: renamed from: r */
    private static final boolean f13709r = C1807g.mcp();

    /* JADX INFO: renamed from: t */
    private static final String f13710t = "RecommendListView";

    /* JADX INFO: renamed from: g */
    protected f7l8 f13711g;

    /* JADX INFO: renamed from: h */
    private dd f13712h;

    /* JADX INFO: renamed from: i */
    private boolean f13713i;

    /* JADX INFO: renamed from: k */
    protected C2368q f13714k;

    /* JADX INFO: renamed from: n */
    protected RecyclerView f13715n;

    /* JADX INFO: renamed from: p */
    protected int f13716p;

    /* JADX INFO: renamed from: q */
    protected x2 f13717q;

    /* JADX INFO: renamed from: s */
    protected final C2367n f13718s;

    /* JADX INFO: renamed from: y */
    protected InterfaceC2366k f13719y;

    /* JADX INFO: renamed from: z */
    private int f13720z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.RecommendListView$k */
    class C2359k implements x2.InterfaceC1868n {
        C2359k() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        /* JADX INFO: renamed from: k */
        public void mo7377k() {
            if (RecommendListView.this.f13718s.ni7()) {
                RecommendListView.this.ld6(true);
            }
            if ("ringtone".equals(RecommendListView.this.f13718s.ld6())) {
                C0247k c0247k = new C0247k();
                c0247k.put("pageId", p001b.toq.f7216o);
                c0247k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
                c0247k.put("extra", "0");
                C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.u2a8, c0247k);
            }
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            if (RecommendListView.this.f13718s.m8559i()) {
                RecommendListView.this.ld6(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.RecommendListView$q */
    public static class AsyncTaskC2360q extends AsyncTask<Void, Void, List<UIElement>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<RecommendListView> f13722k;

        /* JADX INFO: renamed from: q */
        private UIPage f13723q = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f60663toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private kja0 f60664zy;

        public AsyncTaskC2360q(RecommendListView recommendListView, boolean refresh, kja0 apiData) {
            this.f13722k = new WeakReference<>(recommendListView);
            this.f60663toq = refresh;
            this.f60664zy = apiData;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<UIElement> doInBackground(Void... voids) {
            RecommendListView recommendListView = this.f13722k.get();
            if (recommendListView == null) {
                return null;
            }
            try {
                if (recommendListView.f13718s.zy() != null) {
                    this.f13723q = (UIPage) C1808h.m7086k().m17099s(this.f60664zy, recommendListView.f13718s.zy().getTClass());
                    this.f13723q = recommendListView.f13718s.zy().onRequestFinish(this.f13723q, this.f60663toq);
                } else {
                    this.f13723q = (UIPage) C1808h.m7086k().m17099s(this.f60664zy, UIPage.class);
                }
            } catch (Exception e2) {
                C7794k.zy(RecommendListView.f13710t, "ParseAsyncTask", e2);
            }
            if (this.f13723q == null) {
                return null;
            }
            C7792k c7792k = new C7792k(recommendListView.f13718s.t8r());
            UIPage uIPage = this.f13723q;
            return c7792k.toq(uIPage.cards, this.f60663toq, uIPage.hasMore);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<UIElement> uiElements) {
            RecommendListView recommendListView = this.f13722k.get();
            if (recommendListView == null) {
                return;
            }
            recommendListView.mo8396p(this.f13723q, uiElements, this.f60663toq);
        }
    }

    class toq extends RecyclerView.fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.bumptech.glide.kja0 f13724k;

        toq(final com.bumptech.glide.kja0 val$requestManager) {
            this.f13724k = val$requestManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@lvui RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            RecommendListView.this.f13712h.ld6(recyclerView, newState);
            if (newState == 0) {
                if (RecommendListView.f13709r) {
                    this.f13724k.m10624f();
                    RecommendListView.this.f13713i = false;
                    return;
                }
                return;
            }
            if (!RecommendListView.f13709r || RecommendListView.this.f13713i) {
                return;
            }
            RecommendListView.this.f13713i = true;
            this.f13724k.n5r1();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@lvui RecyclerView recyclerView, int dx, int dy) {
            if (RecommendListView.this.f13718s.zy() != null) {
                RecommendListView.this.f13718s.zy().onRecommendListScroll(RecommendListView.this, recyclerView, dx, dy);
            }
            RecommendListView.this.f13712h.x2();
        }
    }

    private static class zy extends AbstractC1777n<kja0> {

        /* JADX INFO: renamed from: k */
        private WeakReference<RecommendListView> f13725k;

        /* JADX INFO: renamed from: q */
        private boolean f13726q;

        public zy(RecommendListView recommendListView, boolean refresh) {
            this.f13725k = new WeakReference<>(recommendListView);
            this.f13726q = refresh;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@zy.dd kja0 response) {
            RecommendListView recommendListView = this.f13725k.get();
            if (recommendListView == null) {
                return;
            }
            new AsyncTaskC2360q(recommendListView, this.f13726q, response).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String apiMessage, Exception e2) {
            super.onFailure(httpCode, apiCode, apiMessage, e2);
            RecommendListView recommendListView = this.f13725k.get();
            if (recommendListView == null) {
                return;
            }
            recommendListView.mo8396p(null, null, this.f13726q);
        }
    }

    public RecommendListView(C2367n builder) {
        super(builder.m8561n());
        this.f13716p = 0;
        this.f13713i = false;
        this.f13720z = -1;
        this.f13718s = builder;
        this.f13720z = builder.x2();
        m8539s(builder.m8561n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6(boolean refresh) {
        retrofit2.toq<CommonResponse<kja0>> loadMoreCall;
        if (refresh) {
            loadMoreCall = this.f13718s.m8562p().getRefreshCall();
        } else {
            if (!this.f13714k.m8567k(this.f13716p)) {
                return;
            }
            this.f13714k.zy(this.f13716p);
            loadMoreCall = this.f13718s.m8562p().getLoadMoreCall(this.f13716p);
        }
        if (loadMoreCall == null) {
            Log.e("Recommend", "error, call is null");
            return;
        }
        if (this.f13718s.zy() != null) {
            this.f13718s.zy().onRequestStart();
        }
        loadMoreCall.mo27954p(new zy(this, refresh));
    }

    /* JADX INFO: renamed from: s */
    private void m8539s(Context context) {
        LayoutInflater.from(context).inflate(R.layout.rc_listview_recommend, this);
        SpringBackLayout springBackLayout = (SpringBackLayout) findViewById(R.id.refreshLayout);
        this.f13715n = (RecyclerView) findViewById(R.id.recyclerView);
        x2 x2Var = new x2(springBackLayout, new C2359k(), this.f13718s.ni7(), this.f13718s.m8559i());
        this.f13717q = x2Var;
        this.f13714k = new C2368q(x2Var);
        InterfaceC2366k interfaceC2366kMo8540g = mo8540g();
        this.f13719y = interfaceC2366kMo8540g;
        interfaceC2366kMo8540g.setRingtoneFlag(this.f13720z);
        f7l8 f7l8Var = new f7l8((RecyclerView.AbstractC1060y) this.f13719y);
        this.f13711g = f7l8Var;
        this.f13719y.mo8555p(f7l8Var);
        x2();
        if (this.f13718s.f7l8() != null) {
            this.f13715n.addItemDecoration(this.f13718s.f7l8());
        }
        if (this.f13718s.ki()) {
            this.f13715n.setItemAnimator(null);
        }
        this.f13712h = new dd();
        this.f13715n.addOnScrollListener(new toq(com.bumptech.glide.zy.a9(getContext())));
        this.f13715n.setAdapter(this.f13711g);
        RecyclerView.AbstractC1048h layoutManager = this.f13715n.getLayoutManager();
        GridLayoutManager.zy zyVarQrj = this.f13718s.qrj();
        if (!(layoutManager instanceof GridLayoutManager) || zyVarQrj == null) {
            return;
        }
        ((GridLayoutManager) layoutManager).fn3e(zyVarQrj);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void addHeaderView(View header) {
        this.f13711g.ki(header);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void clear() {
        this.f13715n.setAdapter(null);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void clearData() {
        this.f13719y.mo8550n(new ArrayList(), false, false);
    }

    protected void f7l8(boolean refersh, boolean success) {
        if (refersh) {
            this.f13717q.m7372n();
        } else {
            this.f13717q.m7374q(success, true);
        }
    }

    /* JADX INFO: renamed from: g */
    protected InterfaceC2366k mo8540g() {
        return new RecommendListViewAdapter(this.f13718s.m8558h(), this.f13718s, this.f13714k);
    }

    public InterfaceC2366k getAdapter() {
        return this.f13719y;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public int getElementSize() {
        InterfaceC2366k interfaceC2366k = this.f13719y;
        if (interfaceC2366k == null) {
            return 0;
        }
        return interfaceC2366k.getItemCount();
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public int getElementType(int position) {
        if (getElementSize() <= position) {
            return 0;
        }
        return this.f13719y.getItemViewType(position);
    }

    public C2368q getPreloadHelper() {
        return this.f13714k;
    }

    public x2 getSpringLayoutWrap() {
        return this.f13717q;
    }

    @oc
    /* JADX INFO: renamed from: p */
    protected void mo8396p(UIPage uiPage0, List<UIElement> uiElements0, boolean refresh) {
        Pair<UIPage, List<UIElement>> pairEditRecommendLoadResult;
        if (this.f13718s.zy() == null || !this.f13718s.zy().isInterruptLoadData(uiPage0)) {
            if (this.f13718s.zy() != null && (pairEditRecommendLoadResult = this.f13718s.zy().editRecommendLoadResult(uiPage0, uiElements0, refresh)) != null) {
                uiPage0 = (UIPage) pairEditRecommendLoadResult.first;
                uiElements0 = (List) pairEditRecommendLoadResult.second;
            }
            if (uiPage0 == null || uiElements0 == null || uiElements0.size() == 0) {
                if (uiPage0 != null) {
                    m8541y(refresh, false, uiPage0.hasMore);
                }
                this.f13714k.toq(refresh, false);
                f7l8(refresh, false);
                if (this.f13718s.zy() != null) {
                    this.f13718s.zy().onRecommendLoadFail(refresh);
                    return;
                }
                return;
            }
            this.f13714k.toq(refresh, true);
            if (this.f13718s.zy() != null) {
                this.f13718s.zy().onParseUICardFinish(uiElements0, refresh);
            }
            this.f13719y.mo8550n(uiElements0, !refresh, uiPage0.hasMore);
            if (refresh) {
                this.f13716p = uiPage0.cards.size();
            } else {
                this.f13716p += uiPage0.cards.size();
            }
            if (uiPage0.hasMore && this.f13718s.m8563q() - uiPage0.cards.size() > 0) {
                this.f13716p += this.f13718s.m8563q() - uiPage0.cards.size();
            }
            this.f13717q.m7373p(uiPage0.hasMore);
            f7l8(refresh, true);
            if (this.f13718s.zy() != null) {
                this.f13718s.zy().onRecommendLoadSuccess(refresh);
            }
        }
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void refreshData() {
        ld6(true);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void scrollTop() {
        this.f13715n.scrollToPosition(0);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void setCardDivider(boolean hasCardDivider) {
        this.f13718s.setCardDivider(hasCardDivider);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void setExVH(IRecommendListView.ExViewHolder evh) {
        this.f13719y.mo8547h(evh);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void setItemDecoration(RecyclerView.kja0 decoration) {
        RecyclerView recyclerView;
        if (decoration == null || (recyclerView = this.f13715n) == null) {
            return;
        }
        recyclerView.addItemDecoration(decoration);
    }

    public void setLayoutManager(RecyclerView.AbstractC1048h layoutManager) {
        this.f13715n.setLayoutManager(layoutManager);
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void setLayoutManagerType(int layoutManagerType) {
        if (this.f13718s.m8564s() == layoutManagerType) {
            return;
        }
        this.f13718s.setLayoutManagerType(layoutManagerType);
        x2();
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListView
    public void smoothScrolltoPosition(int position) {
        this.f13715n.smoothScrollToPosition(position);
    }

    protected void x2() {
        RecyclerView.AbstractC1048h themeLinearLayoutManager;
        if (this.f13715n == null) {
            return;
        }
        int iM8564s = this.f13718s.m8564s();
        if (iM8564s == 0) {
            themeLinearLayoutManager = new FastScrollStaggeredGridLayoutManager(this.f13718s.m8565y() > 0 ? this.f13718s.m8565y() : 2, 1);
        } else if (iM8564s == 2) {
            themeLinearLayoutManager = new GridLayoutManager(getContext(), this.f13718s.m8565y() > 0 ? this.f13718s.m8565y() : 2, 1, false);
        } else {
            themeLinearLayoutManager = new ThemeLinearLayoutManager(this.f13718s.toq());
        }
        this.f13715n.setLayoutManager(themeLinearLayoutManager);
        this.f13711g.lvui(themeLinearLayoutManager);
    }

    /* JADX INFO: renamed from: y */
    protected void m8541y(boolean refersh, boolean success, boolean hasMore) {
        if (refersh) {
            this.f13717q.m7372n();
        } else {
            this.f13717q.m7374q(success, hasMore);
        }
    }
}
