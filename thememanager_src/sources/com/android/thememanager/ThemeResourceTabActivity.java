package com.android.thememanager;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0924e;
import cfr.C1394k;
import com.android.thememanager.activity.C1632y;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.f7l8;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.InterfaceC1870y;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import com.android.thememanager.clockmessage.C1875q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.h5.C2069n;
import com.android.thememanager.miuixcompat.AsyncTaskC2208n;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.recommend.player.AdAutoPlayer;
import com.android.thememanager.recommend.view.fragment.AbstractC2351k;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.util.a98o;
import com.android.thememanager.util.bz2;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.py;
import com.android.thememanager.util.yz;
import com.android.thememanager.util.zkd;
import com.android.thememanager.v9.AbstractC2865k;
import com.android.thememanager.v9.model.NavItemFac;
import com.android.thememanager.view.C2930n;
import com.android.thememanager.view.NavViewBottomContainer;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.appcompat.app.ki;
import p001b.InterfaceC1357q;
import y2.C7775g;

/* JADX INFO: loaded from: classes.dex */
public class ThemeResourceTabActivity extends com.android.thememanager.activity.kja0 implements com.android.thememanager.basemodule.analysis.toq, AdAutoPlayer.InterfaceC2345k {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f57254ab = 1;
    private static final String an = "SAVED_SUB_TAB_TAG";
    private static final int bb = 30000;
    private static final String bp = "SAVED_TAB_LIST_STATE";
    private static final String bv = "SAVED_TAB_TAG";

    /* JADX INFO: renamed from: w */
    private static final String f8703w = "ThemeResourceTabActivity";

    /* JADX INFO: renamed from: a */
    private Fragment f8704a;

    /* JADX INFO: renamed from: b */
    private FragmentManager f8705b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private com.android.thememanager.viewmodel.toq f57255bo;

    /* JADX INFO: renamed from: d */
    @zy.dd
    private AdAutoPlayer f8707d;

    /* JADX INFO: renamed from: e */
    private NavViewBottomContainer f8708e;

    /* JADX INFO: renamed from: j */
    private ArrayList<C1857k> f8709j;

    /* JADX INFO: renamed from: u */
    private bz2 f8712u;

    /* JADX INFO: renamed from: v */
    private com.android.thememanager.view.x2 f8713v;

    /* JADX INFO: renamed from: x */
    private Handler f8714x;

    /* JADX INFO: renamed from: c */
    private List<String> f8706c = new ArrayList();

    /* JADX INFO: renamed from: o */
    private ArrayList<String> f8711o = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    private int f8710m = -1;

    /* JADX INFO: renamed from: com.android.thememanager.ThemeResourceTabActivity$g */
    private static class RunnableC1533g implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f8715k;

        /* synthetic */ RunnableC1533g(Activity activity, C1534k c1534k) {
            this(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<Activity> weakReference = this.f8715k;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            C7775g.x2(this.f8715k.get());
        }

        private RunnableC1533g(Activity activity) {
            this.f8715k = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ThemeResourceTabActivity$k */
    class C1534k implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f8716k;

        /* JADX INFO: renamed from: com.android.thememanager.ThemeResourceTabActivity$k$k */
        class k implements f7l8.InterfaceC1805k {
            k() {
            }

            @Override // com.android.thememanager.basemodule.utils.f7l8.InterfaceC1805k
            /* JADX INFO: renamed from: k */
            public void mo6322k() {
                C1875q.m7391g().m7400t(false);
            }

            @Override // com.android.thememanager.basemodule.utils.f7l8.InterfaceC1805k
            public void toq() {
            }

            @Override // com.android.thememanager.basemodule.utils.f7l8.InterfaceC1805k
            public void zy() {
                C1875q.m7391g().ni7();
                C1875q.m7391g().m7400t(false);
            }
        }

        C1534k(final String val$naviId) {
            this.f8716k = val$naviId;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            ThemeSchedulerService.m8899g();
            ThemeSchedulerService.qrj();
            py.m9954q(ThemeResourceTabActivity.this.getIntent());
            ThemeResourceTabActivity themeResourceTabActivity = ThemeResourceTabActivity.this;
            themeResourceTabActivity.jbh(themeResourceTabActivity.getIntent(), true, this.f8716k);
            C1875q.a9(ThemeResourceTabActivity.this, new k(), true);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ThemeResourceTabActivity$n */
    class C1535n implements NavViewContainer.InterfaceC1856q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f8719k;

        C1535n(final String val$restoreSubTabCode) {
            this.f8719k = val$restoreSubTabCode;
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        /* JADX INFO: renamed from: k */
        public void mo6323k(int position) {
            if (position == ThemeResourceTabActivity.this.f8710m) {
                return;
            }
            ThemeResourceTabActivity.this.wx16(position, this.f8719k);
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        public void toq() {
            ThemeResourceTabActivity.this.ktq();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ThemeResourceTabActivity$q */
    class HandlerC1536q extends Handler {
        HandlerC1536q(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Fragment fragmentNmn5;
            androidx.fragment.app.o1t o1tVarKi = ThemeResourceTabActivity.this.f8705b.ki();
            for (int i2 = 0; i2 < ThemeResourceTabActivity.this.f8709j.size(); i2++) {
                if (i2 != ThemeResourceTabActivity.this.f8710m && (fragmentNmn5 = ThemeResourceTabActivity.this.f8705b.nmn5(((C1857k) ThemeResourceTabActivity.this.f8709j.get(i2)).toq())) != null) {
                    o1tVarKi.fu4(fragmentNmn5);
                }
            }
            o1tVarKi.n7h();
            ThemeResourceTabActivity.this.f8705b.a98o();
        }
    }

    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ yz f8721k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Intent f8723q;

        toq(final yz val$otaUpdateManager, final Intent val$intent) {
            this.f8721k = val$otaUpdateManager;
            this.f8723q = val$intent;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.hk));
            this.f8721k.lvui();
            this.f8723q.putExtra(InterfaceC1357q.f53900kx3, false);
        }
    }

    class zy implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ yz f8724k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Intent f8726q;

        zy(final yz val$otaUpdateManager, final Intent val$intent) {
            this.f8724k = val$otaUpdateManager;
            this.f8726q = val$intent;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.gk));
            this.f8724k.lvui();
            this.f8726q.putExtra(InterfaceC1357q.f53900kx3, false);
            new a98o(ThemeResourceTabActivity.this).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    private void b3e() {
        if (C1807g.m7081r()) {
            return;
        }
        this.f57255bo.hyr().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.x9kr
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f17857k.mbx((UIPage) obj);
            }
        });
        if (this.f57255bo.m10460c()) {
            return;
        }
        this.f57255bo.uv6();
    }

    private void bek6() {
        bz2();
        g1.mu(this, this.f9137r.getResourceCode());
        this.f8705b = getSupportFragmentManager();
        this.f8714x = new HandlerC1536q(Looper.getMainLooper());
        ((NotificationManager) getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).cancel(com.android.thememanager.service.ki.m8940y());
    }

    private void bz2() {
        this.f8709j = new ArrayList<>();
        if (com.android.thememanager.basemodule.utils.toq.m7224q(null)) {
            Iterator<String> it = this.f8706c.iterator();
            while (it.hasNext()) {
                this.f8709j.add(NavItemFac.NavItemFactory.create(it.next()));
            }
        }
        if (this.f8709j.isEmpty()) {
            nn86.m7150k(R.string.region_not_support, 1);
            finish();
        }
    }

    private void cv06() {
        this.f8706c.clear();
        this.f8706c.add("homepage");
        this.f8706c.add("resourcecategory");
        if (!C1807g.a9()) {
            this.f8706c.add("daily");
        }
        this.f8706c.add("mine");
    }

    private void h7am() {
        bz2 bz2Var = new bz2(this);
        this.f8712u = bz2Var;
        bz2Var.m9643n();
    }

    private void ixz(boolean visisble) {
        int i2 = this.f8710m;
        if (i2 >= 0) {
            Fragment fragmentNmn5 = this.f8705b.nmn5(this.f8709j.get(i2).toq());
            if (fragmentNmn5 == null || !(fragmentNmn5 instanceof com.android.thememanager.basemodule.base.toq)) {
                return;
            }
            ((com.android.thememanager.basemodule.base.toq) fragmentNmn5).nnh(visisble);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbh(Intent intent, boolean defaultNav, String restoreNavId) {
        if (restoreNavId == null) {
            restoreNavId = intent.hasExtra(InterfaceC1357q.f53967yl) ? intent.getStringExtra(InterfaceC1357q.f53967yl) : null;
        }
        if ((restoreNavId == null || !this.f8706c.contains(restoreNavId)) && defaultNav) {
            restoreNavId = "homepage";
        }
        if ("homepage".equals(restoreNavId)) {
            zkd.m10098q(this, this.f9137r);
        }
        if (!TextUtils.isEmpty(restoreNavId)) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f8709j.size()) {
                    break;
                }
                if (restoreNavId.equals(this.f8709j.get(i2).toq())) {
                    this.f8708e.m7341n(i2);
                    break;
                }
                i2++;
            }
        }
        if ("mine".equals(restoreNavId) && InterfaceC1357q.f53920nme.equals(intent.getStringExtra(InterfaceC1357q.f53961wx16))) {
            startActivity(com.android.thememanager.toq.m9543n(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ktq() {
        int i2 = this.f8710m;
        if (i2 >= 0) {
            androidx.lifecycle.n7h n7hVarNmn5 = this.f8705b.nmn5(this.f8706c.get(i2));
            if (n7hVarNmn5 instanceof AbstractC2865k) {
                ((AbstractC2865k) n7hVarNmn5).ob();
            } else if (n7hVarNmn5 instanceof InterfaceC1870y) {
                ((InterfaceC1870y) n7hVarNmn5).d2ok();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mbx(UIPage uIPage) {
        if (this.f8713v.kja0()) {
            if (this.f57255bo.lrht(SystemClock.elapsedRealtime())) {
                Log.w(f8703w, "initFloatingWindow: weak net");
            } else {
                new C2930n(this).qrj(uIPage);
            }
            String stringExtra = getIntent().hasExtra("EXTRA_TAB_ID") ? getIntent().getStringExtra("EXTRA_TAB_ID") : "hybrid";
            this.f8713v.m10448y(this);
            this.f8713v.t8r("homepage", stringExtra);
        }
    }

    private void uc(Intent intent) {
        if (intent.getBooleanExtra(InterfaceC1357q.f53900kx3, false)) {
            yz yzVar = new yz();
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.gir));
            new ki.C6947k(this).lrht(R.string.ota_recovery_theme_dialog_title).fu4(R.string.ota_recovery_theme_dialog_message).m25047s(false).dd(android.R.string.ok, new zy(yzVar, intent)).mcp(android.R.string.cancel, new toq(yzVar, intent)).m25037g().show();
        }
    }

    private Fragment uj2j(String resCode) {
        if ("homepage".equals(resCode)) {
            com.android.thememanager.recommend.view.fragment.f7l8 f7l8VarZy = C1394k.zy();
            f7l8VarZy.kbj(this.f8713v);
            return f7l8VarZy;
        }
        if ("resourcecategory".equals(resCode)) {
            return C1394k.toq();
        }
        if (!"daily".equals(resCode)) {
            if ("mine".equals(resCode)) {
                return new C1632y();
            }
            return null;
        }
        C2069n c2069n = new C2069n();
        Bundle bundle = new Bundle();
        PageGroup pageGroup = new PageGroup();
        pageGroup.setUrl(InterfaceC1925p.e6x);
        bundle.putSerializable(InterfaceC1357q.f53848bf2, pageGroup);
        bundle.putBoolean(C2069n.f12239j, true);
        c2069n.setArguments(bundle);
        c2069n.cyoe(bundle);
        return c2069n;
    }

    private void vep5(String restoreNavId, final String restoreSubTabCode) {
        NavViewBottomContainer navViewBottomContainer = (NavViewBottomContainer) findViewById(R.id.nav_container);
        this.f8708e = navViewBottomContainer;
        navViewBottomContainer.mo7342q(this.f8709j);
        this.f8708e.setOnItemClickListener(new C1535n(restoreSubTabCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wx16(int i2, String restoreSubTabResCode) {
        Fragment fragmentNmn5;
        com.android.thememanager.view.x2 x2Var;
        com.android.thememanager.view.x2 x2Var2;
        com.android.thememanager.view.x2 x2Var3 = this.f8713v;
        if (x2Var3 != null && x2Var3.kja0()) {
            this.f8713v.m10448y(this);
        }
        this.f8708e.setSelectedPosition(i2);
        androidx.fragment.app.o1t o1tVarKi = this.f8705b.ki();
        int i3 = this.f8710m;
        if (i3 >= 0) {
            fragmentNmn5 = this.f8705b.nmn5(this.f8706c.get(i3));
            if (fragmentNmn5 != null) {
                if (fragmentNmn5 instanceof com.android.thememanager.basemodule.base.toq) {
                    ((com.android.thememanager.basemodule.base.toq) fragmentNmn5).nnh(false);
                }
                if (fragmentNmn5 instanceof AbstractC2351k) {
                    restoreSubTabResCode = ((AbstractC2351k) fragmentNmn5).rp();
                }
                o1tVarKi.fn3e(fragmentNmn5);
            }
        } else {
            fragmentNmn5 = null;
        }
        this.f8710m = i2;
        String str = this.f8706c.get(i2);
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.qb8);
        arrayMapZy.put("contentType", str);
        C1708s.f7l8().ld6().ni7(arrayMapZy);
        Fragment fragmentNmn52 = this.f8705b.nmn5(str);
        if (fragmentNmn52 == null) {
            fragmentNmn52 = uj2j(str);
            if (fragmentNmn52 == null) {
                return;
            } else {
                o1tVarKi.zy(R.id.container, fragmentNmn52, str);
            }
        }
        o1tVarKi.x9kr(fragmentNmn52);
        this.f8704a = fragmentNmn52;
        if ("homepage".equals(str)) {
            Fragment fragment = this.f8704a;
            if ((fragment instanceof AbstractC2351k) && fragmentNmn5 != null) {
                String strRp = ((AbstractC2351k) fragment).rp();
                if (fragmentNmn5 instanceof com.android.thememanager.recommend.view.fragment.toq) {
                    strRp = restoreSubTabResCode;
                }
                com.android.thememanager.view.x2 x2Var4 = this.f8713v;
                if (x2Var4 != null && strRp != null) {
                    x2Var4.t8r("homepage", strRp);
                }
            }
        }
        if (fragmentNmn52 instanceof com.android.thememanager.basemodule.base.toq) {
            ((com.android.thememanager.basemodule.base.toq) fragmentNmn52).nnh(true);
        }
        if ((fragmentNmn52 instanceof AbstractC2351k) && restoreSubTabResCode != null) {
            if ((fragmentNmn52 instanceof com.android.thememanager.recommend.view.fragment.toq) && "hybrid".equals(restoreSubTabResCode)) {
                restoreSubTabResCode = ((com.android.thememanager.recommend.view.fragment.toq) fragmentNmn52).ec();
                if (TextUtils.isEmpty(restoreSubTabResCode)) {
                    restoreSubTabResCode = null;
                }
            }
            ((AbstractC2351k) fragmentNmn52).el(restoreSubTabResCode);
        }
        o1tVarKi.n7h();
        if ("resourcecategory".equals(str) && (x2Var2 = this.f8713v) != null) {
            x2Var2.t8r("resourcecategory", null);
        }
        if ("daily".equals(str)) {
            com.android.thememanager.view.x2 x2Var5 = this.f8713v;
            if (x2Var5 != null) {
                x2Var5.t8r("daily", null);
            }
            g1.ncyb();
            this.f8708e.setMessageVisible(i2, g1.fnq8());
        }
        if ("mine".equals(str) && (x2Var = this.f8713v) != null) {
            x2Var.t8r("mine", null);
        }
        this.f9864s = str;
    }

    private void yl() {
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.analysis.f7l8.InterfaceC1696k
    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        return "thememanager";
    }

    @Override // com.android.thememanager.recommend.player.AdAutoPlayer.InterfaceC2345k
    @zy.oc
    /* JADX INFO: renamed from: i */
    public AdAutoPlayer mo6321i() {
        if (this.f8707d == null) {
            this.f8707d = new AdAutoPlayer(this);
        }
        return this.f8707d;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public boolean lv5() {
        return true;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("daily".equals(this.f9864s)) {
            Fragment fragment = this.f8704a;
            if ((fragment instanceof C2069n) && ((C2069n) fragment).gyi()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        m6711e(savedInstanceState);
        uc(getIntent());
        super.onCreate(savedInstanceState);
        cv06();
        C1534k c1534k = null;
        if (savedInstanceState != null) {
            this.f8711o.clear();
            this.f8711o.addAll(savedInstanceState.getStringArrayList(bp));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
            for (int i2 = 0; i2 < this.f8711o.size(); i2++) {
                Fragment fragmentNmn5 = supportFragmentManager.nmn5(this.f8711o.get(i2));
                if (fragmentNmn5 != null) {
                    o1tVarKi.fu4(fragmentNmn5);
                }
            }
            o1tVarKi.n7h();
            supportFragmentManager.a98o();
            this.f8711o.clear();
            string = savedInstanceState.getString(bv);
            string2 = savedInstanceState.getString(an);
        } else {
            string = null;
            string2 = null;
        }
        com.android.thememanager.viewmodel.toq toqVar = (com.android.thememanager.viewmodel.toq) new C0924e(this).m4420k(com.android.thememanager.viewmodel.toq.class);
        this.f57255bo = toqVar;
        this.f8713v = new com.android.thememanager.view.x2(toqVar);
        b3e();
        bek6();
        vep5(string, string2);
        h7am();
        if (savedInstanceState == null && !C2206g.m8315z(this)) {
            String stringExtra = getIntent().hasExtra("EXTRA_TAB_ID") ? getIntent().getStringExtra("EXTRA_TAB_ID") : null;
            new AsyncTaskC2208n(this, new RunnableC1533g(this, c1534k), TextUtils.isEmpty(stringExtra) || "hybrid".equals(stringExtra)).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
        ThemeSchedulerService.kja0();
        Looper.myQueue().addIdleHandler(new C1534k(string));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        Handler handler = this.f8714x;
        if (handler != null) {
            handler.removeMessages(1);
            this.f8714x = null;
        }
        this.f8712u.m9642g();
        com.android.thememanager.view.x2 x2Var = this.f8713v;
        if (x2Var != null) {
            x2Var.m10447h();
            this.f8713v = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        py.m9954q(intent);
        jbh(intent, false, null);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        ixz(false);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f8714x.removeMessages(1);
        ixz(true);
        ArrayList<C1857k> arrayList = this.f8709j;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i2 = 0; i2 < this.f8709j.size(); i2++) {
                if ("daily".equals(this.f8709j.get(i2).toq())) {
                    this.f8708e.setMessageVisible(i2, g1.fnq8());
                }
            }
        }
        yl();
        this.f8712u.f7l8();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        this.f8711o.clear();
        Iterator<C1857k> it = this.f8709j.iterator();
        while (it.hasNext()) {
            this.f8711o.add(it.next().toq());
        }
        outState.putSerializable(bp, this.f8711o);
        int i2 = this.f8710m;
        if (i2 >= 0) {
            String str = this.f8711o.get(i2);
            outState.putString(bv, str);
            Fragment fragmentNmn5 = this.f8705b.nmn5(str);
            if (fragmentNmn5 instanceof AbstractC2351k) {
                outState.putString(an, ((AbstractC2351k) fragmentNmn5).rp());
            }
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (20 == level) {
            this.f8714x.sendEmptyMessageDelayed(1, 30000L);
        }
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.home_page_layout;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        Fragment fragmentNmn5 = getSupportFragmentManager().nmn5("homepage");
        if (fragmentNmn5 instanceof AbstractC2351k) {
            AbstractC2351k abstractC2351k = (AbstractC2351k) fragmentNmn5;
            Fragment fragmentYw = abstractC2351k.yw();
            if ((fragmentYw instanceof com.android.thememanager.recommend.view.fragment.ld6) && agree) {
                ((com.android.thememanager.recommend.view.fragment.ld6) fragmentYw).xm();
                com.android.thememanager.viewmodel.toq toqVar = this.f57255bo;
                if (toqVar != null) {
                    toqVar.uv6();
                }
            }
            abstractC2351k.g0ad();
            ThemeSchedulerService.kja0();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean zp() {
        return false;
    }
}
