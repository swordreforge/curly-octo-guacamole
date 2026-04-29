package com.android.thememanager.basemodule.base;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.fu4;
import com.android.thememanager.basemodule.analysis.C1698k;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.InterfaceC0001q;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: AbstractBaseFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq extends Fragment implements InterfaceC1719p, C1781k.f7l8, InterfaceC0001q {

    /* JADX INFO: renamed from: i */
    private AbstractC0067g f9872i;

    /* JADX INFO: renamed from: n */
    private C1781k.f7l8 f9874n;

    /* JADX INFO: renamed from: s */
    protected String f9877s;

    /* JADX INFO: renamed from: z */
    private p000a.zy f9879z;

    /* JADX INFO: renamed from: k */
    private final ArrayList<InterfaceC1721s> f9873k = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private C1781k f9876q = null;

    /* JADX INFO: renamed from: g */
    private boolean f9870g = false;

    /* JADX INFO: renamed from: y */
    protected kja0 f9878y = new kja0();

    /* JADX INFO: renamed from: p */
    private final AtomicBoolean f9875p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f9871h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.base.toq$k */
    /* JADX INFO: compiled from: AbstractBaseFragment.java */
    class RunnableC1722k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f9881k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f9882n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f9883q;

        RunnableC1722k(final String val$extra, final String val$actionType, final String val$trackId) {
            this.f9881k = val$extra;
            this.f9883q = val$actionType;
            this.f9882n = val$trackId;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            String strMo6436w = toq.this.mo6436w();
            if (strMo6436w == null) {
                string = this.f9881k;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(strMo6436w);
                String str = this.f9881k;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                string = sb.toString();
            }
            toq toqVar = toq.this;
            kja0 kja0Var = toqVar.f9878y;
            kja0.m6641s(this.f9883q, toqVar.kx3(), this.f9882n, string);
            boolean zEquals = TextUtils.equals(string, this.f9881k);
            ArrayMap<String, Object> arrayMapN7h = null;
            if (C1706p.cdj(this.f9881k)) {
                try {
                    arrayMapN7h = zEquals ? C1706p.n7h(toq.this.kx3(), this.f9882n, (ArrayMap) new C4871g().n7h(this.f9881k, ArrayMap.class)) : C1706p.m6650h(toq.this.kx3(), this.f9882n, null, toq.this.mo6436w(), (ArrayMap) new C4871g().n7h(this.f9881k, ArrayMap.class));
                } catch (Exception e2) {
                    Log.e("Stats", "error convert", e2);
                }
            } else {
                arrayMapN7h = C1706p.kja0(toq.this.kx3(), this.f9882n, string);
            }
            C1708s.f7l8().ld6().n5r1(this.f9883q, arrayMapN7h);
        }
    }

    private void uf(boolean visibleForUser) {
        for (InterfaceC1721s interfaceC1721s : this.f9873k) {
            if (visibleForUser) {
                interfaceC1721s.ktq(this);
            } else {
                interfaceC1721s.jp0y(this);
            }
        }
    }

    @Override // p000a.InterfaceC0001q
    public AbstractC0067g a5id(toq.C0066y permissions, InterfaceC0068k callback) {
        return registerForActivityResult(permissions, callback);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1719p
    public void bf2(@lvui fu4 observer) {
        getLifecycle().mo4451k(observer);
        if (!(observer instanceof InterfaceC1721s) || this.f9873k.contains(observer)) {
            return;
        }
        this.f9873k.add((InterfaceC1721s) observer);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void d8wk(String trackId, String extra) {
        nme("T_CLICK", trackId, extra);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ew(boolean forceRequest) {
        ix(forceRequest, null);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void fnq8(Collection<String> trackIds) {
        this.f9878y.m6644q(trackIds);
    }

    public boolean gyi() {
        return false;
    }

    protected void ix(boolean forceRequest, C1781k.f7l8 callback) {
        this.f9874n = callback;
        u38j().m6911q(getActivity(), this, this, forceRequest);
    }

    @Override // p000a.InterfaceC0001q
    public p000a.zy jz5() {
        return this.f9879z;
    }

    public String kx3() {
        return this.f9877s;
    }

    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.t5;
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void n5r1(String trackId) {
        this.f9878y.zy(trackId);
    }

    public void ncyb(String trackId) {
        this.f9878y.m6643n(trackId);
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void nme(String actionType, String trackId, String extra) {
        C6002g.ld6().execute(new RunnableC1722k(extra, actionType, trackId));
    }

    public void nnh(boolean visibleForUser) {
        if (this.f9875p.get()) {
            this.f9870g = visibleForUser;
            ra(visibleForUser);
        } else if (visibleForUser) {
            this.f9871h.set(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.f9875p.set(true);
        if (this.f9871h.getAndSet(false)) {
            nnh(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 5001) {
            if (requestCode == 6002) {
                if (resultCode == 3) {
                    C1781k.m6904h(getActivity());
                    y9n(true);
                } else if (resultCode == 2) {
                    C1781k.kja0(getActivity());
                    y9n(true);
                } else if (resultCode == 1) {
                    C1781k.cdj();
                    y9n(false);
                }
                v5yj(resultCode);
            }
        } else if (resultCode == 1) {
            x2.m6915p(3);
            C1781k.m6904h(getActivity());
            y9n(true);
            C1781k.f7l8 f7l8Var = this.f9874n;
            if (f7l8Var != null) {
                f7l8Var.y9n(true);
                this.f9874n = null;
            }
        } else if (resultCode == -3) {
            ew(false);
        } else {
            if (!x2.x2()) {
                C1781k.cdj();
            }
            y9n(false);
            if (x2.x2()) {
                startActivityForResult(x2.m6912g(false, x2.f57645x2), 6002);
            }
        }
        Iterator<InterfaceC1721s> it = this.f9873k.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        u38j().m6910n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        kja0 kja0Var;
        super.onHiddenChanged(hidden);
        nnh(!hidden);
        if (!hidden || (kja0Var = this.f9878y) == null) {
            return;
        }
        kja0Var.m6645y(kx3(), mo6436w());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f9870g) {
            this.f9878y.m6645y(kx3(), mo6436w());
            C1698k.m6634n().m6637y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        uf(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        uf(false);
    }

    public boolean ps() {
        return this.f9870g;
    }

    protected void r25n() {
        ew(false);
    }

    protected void ra(boolean visibleForUser) {
        uf(visibleForUser);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser || !this.f9870g) {
            return;
        }
        this.f9878y.m6645y(kx3(), mo6436w());
        C1698k.m6634n().m6637y();
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
        ActivityC0891q activity = getActivity();
        if (activity instanceof AbstractActivityC1717k) {
            ((AbstractActivityC1717k) activity).m6710d(false);
        }
    }

    public C1781k u38j() {
        if (this.f9876q == null) {
            this.f9876q = new C1781k();
        }
        return this.f9876q;
    }

    protected void v5yj(int newMode) {
    }

    /* JADX INFO: renamed from: w */
    public String mo6436w() {
        return null;
    }

    @Override // com.android.thememanager.basemodule.analysis.qrj
    public void x9kr(Collection<String> trackIds) {
        this.f9878y.m6642g(trackIds);
    }

    public void y9n(boolean agree) {
        if (agree) {
            getActivity().recreate();
        }
    }
}
