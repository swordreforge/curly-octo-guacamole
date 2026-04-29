package com.android.thememanager.basemodule.base;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.fu4;
import androidx.lifecycle.kja0;
import com.android.thememanager.activity.bek6;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.UserAgreementVersionManager;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.controller.online.n7h;
import com.google.gson.C4871g;
import com.google.gson.reflect.C4922k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import miuix.appcompat.app.AbstractC6946k;
import p000a.InterfaceC0001q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.base.k */
/* JADX INFO: compiled from: AbstractBaseActivity.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1717k extends bek6 implements C1781k.f7l8, InterfaceC1719p, f7l8.InterfaceC1696k, InterfaceC0001q {

    /* JADX INFO: renamed from: h */
    private AbstractC0067g f9858h;

    /* JADX INFO: renamed from: i */
    private p000a.zy f9859i;

    /* JADX INFO: renamed from: n */
    private C1781k.f7l8 f9861n;

    /* JADX INFO: renamed from: s */
    protected String f9864s;

    /* JADX INFO: renamed from: t */
    private n7h f9865t;

    /* JADX INFO: renamed from: z */
    private C1781k.f7l8 f9867z;

    /* JADX INFO: renamed from: k */
    private final ArrayList<InterfaceC1721s> f9860k = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    protected C1781k f9863q = null;

    /* JADX INFO: renamed from: g */
    private final com.android.thememanager.basemodule.analysis.f7l8 f9857g = new com.android.thememanager.basemodule.analysis.f7l8();

    /* JADX INFO: renamed from: y */
    protected kja0 f9866y = new kja0();

    /* JADX INFO: renamed from: p */
    private boolean f9862p = true;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.base.k$k */
    /* JADX INFO: compiled from: AbstractBaseActivity.java */
    class k extends C4922k<ArrayMap<String, Object>> {
        k() {
        }
    }

    private void qo() {
        try {
            Intent intentM7038n = C1803e.m7038n(this);
            intentM7038n.putExtra(x9kr.f57818toq, true);
            startActivity(intentM7038n);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
        finish();
    }

    private void tfm(boolean visibleForUser) {
        for (InterfaceC1721s interfaceC1721s : this.f9860k) {
            if (visibleForUser) {
                interfaceC1721s.ktq(this);
            } else {
                interfaceC1721s.jp0y(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.t5;
    }

    @Override // p000a.InterfaceC0001q
    public AbstractC0067g a5id(toq.C0066y permissions, InterfaceC0068k callback) {
        return registerForActivityResult(permissions, callback);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC6946k m6709b() {
        return getAppCompatActionBar();
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1719p
    public void bf2(@lvui fu4 observer) {
        getLifecycle().mo4451k(observer);
        if (!(observer instanceof InterfaceC1721s) || this.f9860k.contains(observer)) {
            return;
        }
        this.f9860k.add((InterfaceC1721s) observer);
    }

    protected boolean bo() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m6710d(boolean enable) {
        this.f9862p = enable;
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void d8wk(String trackId, String extra) {
        nme("T_CLICK", trackId, extra);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: e */
    public void m6711e(Bundle savedInstanceState) {
        nn86(savedInstanceState, false);
    }

    public AbstractC0067g ek5k() {
        return this.f9858h;
    }

    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        return null;
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void fnq8(Collection<String> trackIds) {
        this.f9866y.m6644q(trackIds);
    }

    public void gyi(@lvui p000a.zy callBack) {
        this.f9859i = callBack;
    }

    public String i1() {
        return null;
    }

    public void ikck(n7h pm) {
        this.f9865t = pm;
    }

    /* JADX INFO: renamed from: j */
    public void m6712j(Bundle savedInstanceState, boolean forceRequest, C1781k.f7l8 callback) {
        if (savedInstanceState != null) {
            return;
        }
        this.f9867z = callback;
        m6715x().m6911q(this, null, this, forceRequest);
    }

    @Override // p000a.InterfaceC0001q
    public p000a.zy jz5() {
        return this.f9859i;
    }

    public boolean lv5() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 0;
    }

    protected boolean mu() {
        Intent intent = getIntent();
        if (com.android.thememanager.basemodule.analysis.f7l8.m6611p(intent) || lv5() || intent.getBooleanExtra(x9kr.f10440n, false)) {
            return false;
        }
        return intent.getBooleanExtra(x9kr.f57819zy, false) || intent.getBooleanExtra(x9kr.f10441q, false);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void n5r1(String trackId) {
        this.f9866y.zy(trackId);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void ncyb(String trackId) {
        this.f9866y.m6643n(trackId);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void nme(String actionType, String trackId, String extra) {
        String string;
        String strI1 = i1();
        if (strI1 == null) {
            string = extra;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strI1);
            sb.append(extra == null ? "" : extra);
            string = sb.toString();
        }
        kja0.m6641s(actionType, yz(), trackId, string);
        ArrayMap arrayMap = null;
        if (!TextUtils.isEmpty(extra)) {
            try {
                arrayMap = (ArrayMap) new C4871g().kja0(extra, new k().getType());
            } catch (Exception unused) {
                Log.e("stat", "json parse error:" + extra);
            }
        }
        C1708s.f7l8().ld6().n5r1(actionType, C1706p.n7h(yz(), trackId, arrayMap));
    }

    public void nmn5() {
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.vyq(false);
        }
    }

    public void nn86(Bundle savedInstanceState, boolean forceRequest) {
        m6712j(savedInstanceState, forceRequest, null);
    }

    /* JADX INFO: renamed from: o */
    protected boolean m6713o() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.f9862p = true;
        if (requestCode == 20) {
            n7h n7hVar = this.f9865t;
            if (n7hVar != null) {
                n7hVar.mo7597k(resultCode, data);
            }
        } else if (requestCode == 122) {
            C1688q.cdj().m6589y(resultCode);
        } else if (requestCode != 5001) {
            if (requestCode == 6002) {
                if (resultCode == 3) {
                    C1781k.m6904h(this);
                    y9n(true);
                } else if (resultCode == 2) {
                    C1781k.kja0(this);
                    y9n(true);
                } else if (resultCode == 1) {
                    C1781k.cdj();
                    y9n(false);
                }
                y2(resultCode);
            }
        } else if (resultCode == 1) {
            x2.m6915p(3);
            C1781k.m6904h(this);
            y9n(true);
            C1781k.f7l8 f7l8Var = this.f9867z;
            if (f7l8Var != null) {
                f7l8Var.y9n(true);
                this.f9867z = null;
            }
        } else if (resultCode == -3) {
            m6715x().m6911q(this, null, this, false);
        } else {
            if (C1781k.toq(bf2.toq.toq())) {
                return;
            }
            if (!x2.x2()) {
                C1781k.cdj();
            }
            y9n(false);
            C1781k.f7l8 f7l8Var2 = this.f9867z;
            if (f7l8Var2 != null) {
                f7l8Var2.y9n(false);
                this.f9867z = null;
            }
            if (x2.x2()) {
                startActivityForResult(x2.m6912g(false, x2.f57645x2), 6002);
            }
        }
        Iterator<InterfaceC1721s> it = this.f9860k.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (mu()) {
            qo();
            return;
        }
        if (Build.VERSION.SDK_INT == 29 && isTaskRoot() && getFragmentManager() != null && getFragmentManager().getBackStackEntryCount() == 0) {
            finishAfterTransition();
        } else {
            super.onBackPressed();
        }
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C1819o.nn86(this);
        this.f9857g.ld6(getIntent(), savedInstanceState, this);
        this.f9857g.cdj();
        this.f9858h = com.android.thememanager.basemodule.utils.lvui.n5r1(this);
        bf2.toq.m5814q();
        o1t.wvg(m6709b(), mo6344m());
        o1t.fti(this, zp());
        vq();
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        m6715x().m6910n();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f9866y.m6645y(yz(), null);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f9857g.cdj();
    }

    @Override // miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        this.f9857g.x2(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        tfm(true);
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bumptech.glide.zy.m11283n(this).zy();
        tfm(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        boolean zIsAtLeast = getLifecycle().toq().isAtLeast(kja0.zy.RESUMED);
        if (!this.f9862p || zIsAtLeast || level < 60) {
            return;
        }
        Log.w("ABActivity", getClass().getSimpleName() + ".finish onTrimMemory." + level);
        finish();
    }

    public void qkj8(Fragment fragment, Intent[] intents) {
        for (Intent intent : intents) {
            this.f9857g.m6615n(intent, this, fragment);
        }
        super.startActivities(intents);
    }

    public void setActionBarRightMenu(View view) {
        if (getAppCompatActionBar() == null || view == null) {
            return;
        }
        getAppCompatActionBar().ij(view);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intents) {
        for (Intent intent : intents) {
            this.f9857g.m6615n(intent, this, null);
        }
        super.startActivities(intents);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        this.f9857g.m6615n(intent, this, null);
        this.f9862p = false;
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // androidx.fragment.app.ActivityC0891q
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        this.f9857g.m6615n(intent, this, fragment);
        this.f9862p = false;
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    public boolean t8iq() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    protected void mo6714u() {
        recreate();
    }

    /* JADX INFO: renamed from: v */
    public void mo6478v(String title) {
        if (getAppCompatActionBar() != null) {
            getAppCompatActionBar().mo173v(title);
        }
    }

    public void vq() {
        if (UserAgreementVersionManager.ki()) {
            UserAgreementVersionManager userAgreementVersionManager = new UserAgreementVersionManager(this);
            bf2(userAgreementVersionManager);
            userAgreementVersionManager.fn3e(this);
        }
    }

    public void wo() {
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.vyq(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public C1781k m6715x() {
        if (this.f9863q == null) {
            this.f9863q = new C1781k();
        }
        return this.f9863q;
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void x9kr(Collection<String> trackIds) {
        this.f9866y.m6642g(trackIds);
    }

    protected void y2(int newMode) {
    }

    public void y9n(boolean agree) {
        if (agree && bo()) {
            mo6714u();
        }
    }

    public String yz() {
        return this.f9864s;
    }

    protected boolean zp() {
        return true;
    }
}
