package com.android.thememanager.settings;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.ThemeSettingsActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.settings.presenter.ThemeSettingsPresenter;
import com.android.thememanager.settings.superwallpaper.widget.FindMoreButton;
import i1.C6077k;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001b.InterfaceC1357q;
import zkd.InterfaceC7808k;

/* JADX INFO: renamed from: com.android.thememanager.settings.i */
/* JADX INFO: compiled from: ThemeSettingsFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC2517i extends com.android.thememanager.basemodule.base.f7l8<InterfaceC7808k.k> implements InterfaceC7808k.toq, View.OnClickListener, com.android.thememanager.basemodule.analysis.toq {
    public static final String ac = "theme://zhuti.xiaomi.com/mainpage?S.EXTRA_NAV_ID=homepage&S.EXTRA_TAB_ID=theme&miref=settings";
    public static final String ad = "theme://zhuti.xiaomi.com/mainpage?S.EXTRA_NAV_ID=resourcecategory&S.EXTRA_TAB_ID=theme&miref=setting";
    private static final int am = 500;
    public static final String ax = "theme_setting_stagger_banner_all_theme";
    private static final String ay = "scroll_to_online_theme";
    private static final int be = 1;
    public static final String bq = "theme_setting_stagger_banner_category";

    /* JADX INFO: renamed from: a */
    private View f15048a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f60785ab;
    private Handler as;

    /* JADX INFO: renamed from: b */
    private View f15049b;
    private int bb;
    private GestureDetector bg;
    private boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private View f60786bo;
    private int bp;
    private int bv;

    /* JADX INFO: renamed from: c */
    private ViewGroup f15050c;

    /* JADX INFO: renamed from: d */
    private FindMoreButton f15051d;

    /* JADX INFO: renamed from: e */
    private RecyclerView f15052e;

    /* JADX INFO: renamed from: f */
    private boolean f15053f;

    /* JADX INFO: renamed from: j */
    private View f15054j;

    /* JADX INFO: renamed from: l */
    private List<Resource> f15055l;

    /* JADX INFO: renamed from: m */
    private View f15056m;

    /* JADX INFO: renamed from: o */
    private IRecommendListView f15057o;

    /* JADX INFO: renamed from: r */
    private com.android.thememanager.fu4 f15058r;

    /* JADX INFO: renamed from: u */
    private TextView f15059u;

    /* JADX INFO: renamed from: v */
    private TextView f15060v;

    /* JADX INFO: renamed from: w */
    private View f15061w;

    /* JADX INFO: renamed from: x */
    private View f15062x;
    private int an = 0;
    private AtomicBoolean id = new AtomicBoolean(false);
    private AtomicBoolean in = new AtomicBoolean(false);
    private p000a.zy az = new g();
    private final androidx.lifecycle.jp0y<Intent> ba = new zy();

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$f7l8 */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class f7l8 extends IRecommendListView.CallBack<UIPage> {
        f7l8() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onParseUICardFinish(List<UIElement> uiElements, boolean refresh) {
            if (C1819o.eqxt(ViewOnClickListenerC2517i.this.getActivity()) && refresh) {
                ((ThemeSettingsPresenter) ViewOnClickListenerC2517i.this.kiv()).oc(uiElements);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendListScroll(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
            super.onRecommendListScroll(listView, recyclerView, dx, dy);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            super.onRecommendLoadFail(refresh);
            if (ViewOnClickListenerC2517i.this.f15057o.getElementSize() == 0) {
                ViewOnClickListenerC2517i.this.kz28(true);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            ViewOnClickListenerC2517i.this.kz28(false);
            ViewOnClickListenerC2517i.this.f15054j.findViewById(R.id.online_entry).setVisibility(0);
            super.onRecommendLoadSuccess(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh && apiData != null) {
                ((com.android.thememanager.basemodule.base.toq) ViewOnClickListenerC2517i.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$g */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class g implements p000a.zy {
        g() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ViewOnClickListenerC2517i.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$k */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class k implements View.OnClickListener {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            ViewOnClickListenerC2517i.this.i3x9();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!C1781k.toq(bf2.toq.toq())) {
                ViewOnClickListenerC2517i.this.ew(true);
                return;
            }
            boolean zF7l8 = com.android.thememanager.basemodule.privacy.x2.f7l8();
            ViewOnClickListenerC2517i.this.nyj(zF7l8);
            if (zF7l8) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(ViewOnClickListenerC2517i.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.settings.t8r
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f15916k.toq();
                    }
                });
            } else {
                ViewOnClickListenerC2517i.this.i3x9();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$ld6 */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class ld6 extends RecyclerView.fn3e {
        ld6() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@zy.lvui RecyclerView recyclerView, int newState) {
            ViewOnClickListenerC2517i.this.an = newState;
            super.onScrollStateChanged(recyclerView, newState);
            ViewOnClickListenerC2517i.this.hyow(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@zy.lvui RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            ViewOnClickListenerC2517i.wt(ViewOnClickListenerC2517i.this, dy);
            ViewOnClickListenerC2517i.this.xblq();
            ViewOnClickListenerC2517i.this.qh4d();
            ViewOnClickListenerC2517i.this.hyow(dy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$n */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class n extends Handler {
        n() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            ViewOnClickListenerC2517i.this.f15052e.scrollBy(0, ViewOnClickListenerC2517i.this.f15054j.findViewById(R.id.online_entry).getBottom() + ViewOnClickListenerC2517i.this.f15054j.getTop());
            ViewOnClickListenerC2517i.this.xblq();
            ViewOnClickListenerC2517i.this.qh4d();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$n7h */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    private static class n7h extends RecyclerView.kja0 {
        private n7h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = view.getResources().getDimensionPixelOffset(R.dimen.theme_settings_header_margin_top);
                return;
            }
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin);
            outRect.right = dimensionPixelSize;
            outRect.left = dimensionPixelSize;
            int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin);
            outRect.bottom = dimensionPixelSize2;
            outRect.top = dimensionPixelSize2;
        }

        /* synthetic */ n7h(n nVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$p */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class p implements ViewTreeObserver.OnGlobalLayoutListener {
        p() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewOnClickListenerC2517i.this.f15052e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int top = ViewOnClickListenerC2517i.this.f15054j.getTop();
            ViewOnClickListenerC2517i viewOnClickListenerC2517i = ViewOnClickListenerC2517i.this;
            viewOnClickListenerC2517i.bb = viewOnClickListenerC2517i.f15054j.findViewById(R.id.local_entry).getBottom() + top;
            ViewOnClickListenerC2517i viewOnClickListenerC2517i2 = ViewOnClickListenerC2517i.this;
            viewOnClickListenerC2517i2.bp = viewOnClickListenerC2517i2.f15054j.findViewById(R.id.online_entry).getBottom() + top;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$q */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class q extends AnimatorListenerAdapter {
        q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ViewOnClickListenerC2517i.this.kt06();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$qrj */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class qrj implements Runnable {
        qrj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnClickListenerC2517i.this.mi1u();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$s */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class s implements androidx.lifecycle.jp0y<List<Resource>> {
        s() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(@zy.dd List<Resource> resources) {
            ViewOnClickListenerC2517i.this.vss1(resources);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$toq */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height = ViewOnClickListenerC2517i.this.f15050c.getHeight();
            int width = ViewOnClickListenerC2517i.this.f15050c.getWidth();
            if (height > 0) {
                ViewOnClickListenerC2517i.this.f15054j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int height2 = ViewOnClickListenerC2517i.this.f15061w.getHeight();
                if (height2 == 0) {
                    ViewOnClickListenerC2517i.this.f15061w.measure(0, 0);
                    height2 = ViewOnClickListenerC2517i.this.f15061w.getMeasuredHeight();
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ViewOnClickListenerC2517i.this.f15061w.getLayoutParams();
                layoutParams.bottomMargin = ((height - width) - height2) / 2;
                ViewOnClickListenerC2517i.this.f15061w.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$x2 */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class x2 extends GestureDetector.SimpleOnGestureListener {
        x2() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e2) {
            ViewOnClickListenerC2517i.this.f15052e.scrollToPosition(0);
            ViewOnClickListenerC2517i.this.bv = 0;
            ViewOnClickListenerC2517i.this.xblq();
            ViewOnClickListenerC2517i.this.qh4d();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$y */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class y implements IRecommendListView.Request {
        y() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return ((InterfaceC7808k.k) ViewOnClickListenerC2517i.this.kiv()).getLoadMoreCall(cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return ((InterfaceC7808k.k) ViewOnClickListenerC2517i.this.kiv()).getRefreshCall();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.i$zy */
    /* JADX INFO: compiled from: ThemeSettingsFragment.java */
    class zy implements androidx.lifecycle.jp0y<Intent> {
        zy() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (!com.android.thememanager.basemodule.privacy.x2.f7l8() || ViewOnClickListenerC2517i.this.f15061w == null || ViewOnClickListenerC2517i.this.f15057o.getElementSize() <= 0) {
                return;
            }
            ViewOnClickListenerC2517i.this.f15057o.clearData();
            ViewOnClickListenerC2517i.this.kz28(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ab(View view, MotionEvent motionEvent) {
        this.bg.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c25(View view) {
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("EXTRA_TAB_ID", "theme");
        startActivity(intent);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.bz4g));
    }

    private void f3f() {
        if (ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED) && !this.f15053f) {
            this.f15053f = true;
            if (com.android.thememanager.basemodule.utils.toq.m7224q("theme")) {
                this.f15057o.refreshData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hyow(int dy) {
        int i2;
        int i3;
        int i4 = this.bp;
        if (i4 == 0) {
            return;
        }
        boolean z2 = true;
        if (dy == 0 || this.an != 1) {
            if (dy != 0 || this.an == 0) {
                if (dy >= 0 ? (i2 = this.bv) <= this.bb || i2 >= i4 : (i3 = this.bv) <= i4 || i3 + dy >= i4) {
                    z2 = false;
                }
                if (z2) {
                    this.f15052e.smoothScrollBy(0, i4 - this.bv);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3x9() {
        kz28(false);
        this.f15057o.refreshData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kt06() {
        TextView textViewMi1u = mi1u();
        if (textViewMi1u == null) {
            return;
        }
        ThemeSettingsActivity themeSettingsActivity = getActivity() instanceof ThemeSettingsActivity ? (ThemeSettingsActivity) getActivity() : null;
        if (this.bv >= this.bp) {
            if (themeSettingsActivity != null) {
                themeSettingsActivity.m6709b().xwq3(R.string.present_online_themes);
            }
            textViewMi1u.setText(R.string.present_online_themes);
        } else {
            if (themeSettingsActivity != null) {
                themeSettingsActivity.m6709b().xwq3(R.string.theme_settings_title);
            }
            textViewMi1u.setText(R.string.theme_settings_title);
        }
        ObjectAnimator.ofFloat(textViewMi1u, "alpha", textViewMi1u.getAlpha(), 1.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kz28(boolean show) {
        this.f15061w.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public TextView mi1u() {
        TextView textView = this.f15060v;
        if (textView != null) {
            return textView;
        }
        if (!C1819o.eqxt(getActivity())) {
            return null;
        }
        TextView textView2 = (TextView) getActivity().findViewById(R.id.action_bar_title);
        this.f15060v = textView2;
        if (textView2 != null) {
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.settings.cdj
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f14993k.ab(view, motionEvent);
                }
            });
        }
        return this.f15060v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nyj(boolean isLocalMode) {
        View view = this.f15061w;
        if (view != null) {
            ((TextView) view.findViewById(R.id.offline_title)).setText(isLocalMode ? R.string.local_mode_hint : R.string.wallpaper_online_tip);
        }
    }

    public static ViewOnClickListenerC2517i pnt2(boolean scrollToOnlineTheme) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ay, scrollToOnlineTheme);
        ViewOnClickListenerC2517i viewOnClickListenerC2517i = new ViewOnClickListenerC2517i();
        viewOnClickListenerC2517i.setArguments(bundle);
        return viewOnClickListenerC2517i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh4d() {
        int i2 = this.bp;
        if (i2 == 0) {
            return;
        }
        if (this.bv >= i2) {
            if (this.id.getAndSet(true)) {
                return;
            }
            this.f15051d.ki();
        } else if (this.id.getAndSet(false)) {
            this.f15051d.n7h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean tjz5(View view, MotionEvent motionEvent) {
        this.bg.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vss1(List<Resource> list) {
        this.f15055l = list;
        if (list.size() <= 0) {
            return;
        }
        ImageView imageView = (ImageView) this.f15056m.findViewById(R.id.image);
        TextView textView = (TextView) this.f15056m.findViewById(R.id.title);
        Resource resource = list.get(0);
        String title = resource.getTitle();
        if ("0".equals(resource.getLocalId())) {
            title = com.android.thememanager.basemodule.utils.fu4.zy(resource, title);
        }
        textView.setText(title);
        com.android.thememanager.basemodule.imageloader.x2.f7l8(getActivity(), C1792n.t8r(list.get(0)), imageView, com.android.thememanager.basemodule.imageloader.x2.ki(0, this.f60785ab), this.f60785ab);
        C1812k.toq(imageView, title);
        if (list.size() > 1) {
            this.f15049b.setVisibility(0);
            ImageView imageView2 = (ImageView) this.f15049b.findViewById(R.id.image);
            TextView textView2 = (TextView) this.f15049b.findViewById(R.id.title);
            textView2.setText(com.android.thememanager.basemodule.utils.fu4.zy(list.get(1), list.get(1).getTitle()));
            C1812k.toq(imageView2, (String) textView2.getText());
            com.android.thememanager.basemodule.imageloader.x2.f7l8(getActivity(), C1792n.t8r(list.get(1)), imageView2, com.android.thememanager.basemodule.imageloader.x2.ki(1, this.f60785ab), this.f60785ab);
        } else {
            this.f15049b.setVisibility(4);
        }
        this.f15059u.setText(String.valueOf(list.size()));
    }

    private void vwb() {
        TextView textViewMi1u = mi1u();
        if (textViewMi1u == null) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(textViewMi1u, "alpha", textViewMi1u.getAlpha(), 0.0f).setDuration(200L);
        duration.addListener(new q());
        duration.start();
    }

    static /* synthetic */ int wt(ViewOnClickListenerC2517i viewOnClickListenerC2517i, int i2) {
        int i3 = viewOnClickListenerC2517i.bv + i2;
        viewOnClickListenerC2517i.bv = i3;
        return i3;
    }

    private void wtop() {
        View viewFindViewById = this.f15054j.findViewById(R.id.offline2);
        this.f15061w = viewFindViewById;
        ((TextView) viewFindViewById.findViewById(R.id.offline_title)).setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.wallpaper_online_tip);
        this.f15061w.setOnClickListener(new k());
        this.f15054j.getViewTreeObserver().addOnGlobalLayoutListener(new toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xblq() {
        int i2 = this.bp;
        if (i2 == 0) {
            return;
        }
        if (this.bv >= i2) {
            if (this.in.getAndSet(true)) {
                return;
            }
            vwb();
        } else if (this.in.getAndSet(false)) {
            vwb();
        }
    }

    private void z4j7() {
        this.bg = new GestureDetector(getActivity(), new x2());
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.android.thememanager.settings.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f15044k.tjz5(view, motionEvent);
            }
        };
        View viewFindViewById = getActivity().getWindow().getDecorView().findViewById(getResources().getIdentifier("action_bar_container", "id", miuix.core.util.x2.f87403zy));
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(onTouchListener);
        }
        getActivity().getWindow().getDecorView().postDelayed(new qrj(), 100L);
    }

    private void z617() {
        this.f15051d = (FindMoreButton) this.f15050c.findViewById(R.id.find_more);
        if (!com.android.thememanager.basemodule.utils.toq.m7224q("theme")) {
            this.f15051d.setVisibility(8);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15051d.getLayoutParams();
        layoutParams.bottomMargin = -this.f15051d.getHeightWithShadow();
        this.f15051d.setLayoutParams(layoutParams);
        this.f15051d.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.ki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15088k.c25(view);
            }
        });
    }

    protected C2367n lk() {
        C2367n c2367n = new C2367n();
        c2367n.setContext(this).setRefresh(true).setLayoutManagerType(0).setCardDivider(false).setItemDecoration(new n7h(null)).setNeedFootTip(false).setResCode(this.f15058r.getResourceCode()).setPicker(false).setSettingPage(true).setStaggerHolderWidth(((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin) * 4)) - (getActivity().getResources().getDimensionPixelSize(R.dimen.theme_settings_recycler_view_horizontal_padding) * 2)) / 2).setStaggerDecorationSize(getActivity().getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin)).setRequest(new y()).setCallBack(new f7l8());
        return c2367n;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@zy.dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        f3f();
        if (this.bl) {
            n nVar = new n();
            this.as = nVar;
            nVar.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id = v2.getId();
        if (id != R.id.image) {
            if (id != R.id.local_entry) {
                return;
            }
            Intent forwardLocalIntent = RecommendItemResolver.getForwardLocalIntent(this.f15058r.getResourceCode());
            forwardLocalIntent.putExtra(InterfaceC1357q.f53866eqxt, getActivity().getResources().getString(R.string.present_local_themes));
            startActivity(forwardLocalIntent);
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ryij));
            return;
        }
        int iIntValue = ((Integer) v2.getTag(R.id.theme_setting_title_tag)).intValue();
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.f15055l)) {
            return;
        }
        String localId = this.f15055l.get(iIntValue).getLocalId();
        if (!TextUtils.isEmpty(localId) && !C1807g.zurt()) {
            com.android.thememanager.v9.f7l8.kja0(getActivity(), localId, false, false);
        } else {
            com.android.thememanager.v9.f7l8.ki(getActivity(), this, this.f15055l.get(iIntValue).getOnlineId());
        }
    }

    @Override // com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f60785ab = getActivity().getResources().getDimensionPixelOffset(R.dimen.theme_settings_img_radius);
        this.f15058r = C2082k.zy().m8001n().m10536k();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.bl = arguments.getBoolean(ay, false);
        }
        if (savedInstanceState == null) {
            com.android.thememanager.basemodule.utils.lvui.kja0(this, this.az);
        }
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq(com.android.thememanager.basemodule.privacy.x2.f57643qrj, this.ba);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        this.f15050c = (ViewGroup) inflater.inflate(R.layout.theme_settings_activity_layout, container, false);
        this.f15053f = false;
        xzl();
        z4j7();
        z617();
        wtop();
        return this.f15050c;
    }

    @Override // com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler handler = this.as;
        if (handler != null) {
            handler.removeMessages(1);
        }
        super.onDestroy();
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(com.android.thememanager.basemodule.privacy.x2.f57643qrj, this.ba);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        nnh(true);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        nnh(false);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            f3f();
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @zy.lvui
    /* JADX INFO: renamed from: xtb7, reason: merged with bridge method [inline-methods] */
    public ThemeSettingsPresenter uv6() {
        return new ThemeSettingsPresenter();
    }

    protected void xzl() {
        IRecommendListView iRecommendListViewBuild = lk().build();
        this.f15057o = iRecommendListViewBuild;
        this.f15050c.addView(iRecommendListViewBuild, 0);
        this.f15054j = LayoutInflater.from(getActivity()).inflate(R.layout.theme_settings_header, (ViewGroup) this.f15057o, false);
        this.f15054j.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = this.f15054j.findViewById(R.id.local_item1);
        this.f15056m = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.image);
        this.f15048a = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.f15048a.setTag(R.id.theme_setting_title_tag, 0);
        C6077k.o1t(this.f15048a);
        View viewFindViewById3 = this.f15054j.findViewById(R.id.local_item2);
        this.f15049b = viewFindViewById3;
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.image);
        this.f15062x = viewFindViewById4;
        viewFindViewById4.setOnClickListener(this);
        this.f15062x.setTag(R.id.theme_setting_title_tag, 1);
        C6077k.o1t(this.f15062x);
        kiv().mo9134s(this, new s());
        if (!com.android.thememanager.basemodule.utils.o1t.qrj()) {
            int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(R.dimen.theme_settings_local_item_height_lt_v10);
            ViewGroup.LayoutParams layoutParams = this.f15048a.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f15062x.getLayoutParams();
            layoutParams2.height = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f15048a.setLayoutParams(layoutParams);
            this.f15062x.setLayoutParams(layoutParams2);
        }
        this.f15059u = (TextView) this.f15054j.findViewById(R.id.count);
        View viewFindViewById5 = this.f15054j.findViewById(R.id.local_entry);
        this.f60786bo = viewFindViewById5;
        viewFindViewById5.setOnClickListener(this);
        C6077k.ld6(this.f60786bo);
        this.f15057o.addHeaderView(this.f15054j);
        this.f15052e = (RecyclerView) this.f15057o.findViewById(R.id.recyclerView);
        int dimensionPixelSize2 = getActivity().getResources().getDimensionPixelSize(R.dimen.theme_settings_recycler_view_horizontal_padding);
        this.f15052e.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        this.f15052e.setClipToPadding(false);
        this.f15052e.setClipChildren(false);
        this.f15052e.getViewTreeObserver().addOnGlobalLayoutListener(new p());
        this.f15052e.addOnScrollListener(new ld6());
    }
}
