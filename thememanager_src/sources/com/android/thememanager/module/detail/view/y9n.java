package com.android.thememanager.module.detail.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import c8jq.InterfaceC1392k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1825s;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.miuixcompat.AsyncTaskC2208n;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.module.detail.presenter.qrj;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.view.C2258d;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.nn86;
import com.google.gson.C4871g;
import ek5k.C6002g;
import miuix.appcompat.app.ki;
import y2.C7775g;
import yz.C7794k;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: OnlineResourceDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y9n<VM extends com.android.thememanager.module.detail.presenter.qrj> extends com.android.thememanager.basemodule.base.toq implements InterfaceC1392k.n {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f60576ab = "resource";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f60577bo = "online_detail";

    /* JADX INFO: renamed from: d */
    public static final String f13386d = "is_local";

    /* JADX INFO: renamed from: u */
    public static final String f13387u = "online_id";

    /* JADX INFO: renamed from: v */
    public static final String f13388v = "track_id";

    /* JADX INFO: renamed from: w */
    public static final String f13389w = "redeem_code";

    /* JADX INFO: renamed from: a */
    private miuix.appcompat.app.ki f13390a;

    /* JADX INFO: renamed from: b */
    private C2258d f13391b;

    /* JADX INFO: renamed from: c */
    protected String f13392c;

    /* JADX INFO: renamed from: e */
    protected Resource f13393e;

    /* JADX INFO: renamed from: f */
    protected String f13394f;

    /* JADX INFO: renamed from: j */
    protected boolean f13395j;

    /* JADX INFO: renamed from: l */
    protected OnlineResourceDetail f13396l;

    /* JADX INFO: renamed from: m */
    protected AbstractActivityC1717k f13397m;

    /* JADX INFO: renamed from: o */
    protected String f13398o;

    /* JADX INFO: renamed from: r */
    protected String f13399r;

    /* JADX INFO: renamed from: t */
    protected VM f13400t;

    /* JADX INFO: renamed from: x */
    private miuix.appcompat.app.ki f13401x;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.y9n$k */
    /* JADX INFO: compiled from: OnlineResourceDetailFragment.java */
    class C2302k implements C1688q.n {
        C2302k() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g e2) {
            y9n.this.f13400t.qo(2, e2);
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            y9n.this.f13400t.h7am(1);
            y9n.this.f13400t.wo(2, null);
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailFragment.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f13403k;

        toq(final boolean val$isUpdate) {
            this.f13403k = val$isUpdate;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                com.android.thememanager.util.ch.yz(y9n.this.requireActivity());
            } else {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.fail_to_add_account, 0);
            }
            y9n.this.kjd();
            y9n.this.f13400t.h7am(0);
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            y9n.this.f13400t.h7am(4);
            y9n.this.f13400t.a98o(this.f13403k);
        }
    }

    /* JADX INFO: compiled from: OnlineResourceDetailFragment.java */
    class zy implements C1688q.n {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (!com.android.thememanager.basemodule.utils.mcp.m7138k() || !com.android.thememanager.basemodule.utils.mcp.m7139n()) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
            } else {
                y9n y9nVar = y9n.this;
                y9nVar.rf(y9nVar.f13393e.getOnlineId(), y9n.this.f13396l.designerName);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void anhx(boolean z2) {
        this.f13400t.yz(false, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(boolean z2, DialogInterface dialogInterface, int i2) {
        C1688q.cdj().fti(requireActivity(), new toq(z2));
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.bhar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b7(C1723y c1723y) {
        Pair pair = (Pair) c1723y.m6720k();
        if (pair != null) {
            mo5847t(((Boolean) pair.first).booleanValue(), ((Integer) pair.second).intValue());
            zxq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1ts(C2247q c2247q, DialogInterface dialogInterface, int i2) {
        c2247q.f13152g = true;
        xblq(c2247q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f3f(boolean z2) {
        if (z2) {
            this.f13400t.vep5();
            new com.android.thememanager.controller.online.t8r((AbstractActivityC1717k) requireActivity(), this.f13400t.mo8337u(), this.f13400t).fu4(this.f13400t.z4(), this.f13398o, t8r.EnumC1934g.SINGLE);
        } else {
            this.f13400t.h7am(10);
            this.f13400t.h7am(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f7z0(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent("android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS");
        intent.addFlags(268435456);
        this.f13397m.startActivity(intent);
    }

    private void ff(final boolean isUpdate) {
        if (C1688q.cdj().wvg()) {
            this.f13400t.a98o(isUpdate);
            return;
        }
        if (C1976k.m7741y().x2() < 10) {
            this.f13400t.a98o(isUpdate);
            return;
        }
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.me_anonymous_dialog_message_view, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.message)).setText(getResources().getQuantityString(R.plurals.anonymous_resource_login_message, 10, 10));
        new ki.C6947k(requireActivity()).lrht(R.string.anonymous_resource_login_title).nn86(viewInflate).dd(R.string.anonymous_resource_login_confirm, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13327k.b2(isUpdate, dialogInterface, i2);
            }
        }).oc(new DialogInterface.OnDismissListener() { // from class: com.android.thememanager.module.detail.view.m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f13305k.x7o(dialogInterface);
            }
        }).hb();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.s8, null, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fh() {
        wtop().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ge(Resource resource) {
        this.f13393e = resource;
        m28(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1an(C2247q c2247q, DialogInterface dialogInterface, int i2) {
        c2247q.f13152g = false;
        xblq(c2247q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i3x9(boolean z2) {
        if (z2) {
            C7775g.ld6(requireActivity(), this.f13393e.getOnlineId(), this.f13398o, this.f13400t.getState(), new C7775g.k() { // from class: com.android.thememanager.module.detail.view.a9
                @Override // y2.C7775g.k
                /* JADX INFO: renamed from: k */
                public final void mo8401k(boolean z3) {
                    this.f13213k.f3f(z3);
                }
            });
        } else {
            this.f13400t.h7am(10);
            this.f13400t.h7am(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j3y2(C1723y c1723y) {
        Object objM6720k = c1723y.m6720k();
        ActivityC0891q activity = getActivity();
        if (activity == null) {
            Log.i("OnlineFragment", "observerOnCreateView: activity is NULL ");
            return;
        }
        if (objM6720k != null) {
            if (objM6720k instanceof kotlin.ch) {
                kotlin.ch chVar = (kotlin.ch) objM6720k;
                com.android.thememanager.controller.online.t8r.n7h(activity, ((Integer) chVar.getFirst()).intValue(), ((Integer) chVar.getSecond()).intValue(), (String) chVar.getThird());
                return;
            }
            if (!(objM6720k instanceof Pair)) {
                if (objM6720k instanceof C2247q) {
                    C2247q c2247q = (C2247q) objM6720k;
                    if (tjz5(c2247q)) {
                        mi1u(c2247q);
                        return;
                    } else {
                        xblq(c2247q);
                        return;
                    }
                }
                if (objM6720k instanceof qrj.C2232g) {
                    qrj.C2232g c2232g = (qrj.C2232g) objM6720k;
                    int iM8378n = com.android.thememanager.module.detail.util.zy.m8378n();
                    Log.i("OnlineFragment", "begin popApplyDialogIfNeed");
                    C2206g.fu4(this.f13397m, iM8378n, c2232g.f13110k, this.f13398o, this.f13393e, c2232g.f60515zy, c2232g.f13111q);
                    return;
                }
                return;
            }
            Pair pair = (Pair) objM6720k;
            Object obj = pair.first;
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (100 == num.intValue()) {
                    new ki.C6947k(activity).lrht(R.string.resource_hint).fu4(((Integer) pair.second).intValue()).m25039i(android.R.attr.alertDialogIcon).dd(R.string.resource_user_know, null).hb();
                    return;
                }
                if (101 == num.intValue()) {
                    com.android.thememanager.util.ch.bf2(this.f13397m, (String) pair.second);
                    return;
                }
                if (102 == num.intValue()) {
                    final boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
                    if (this.f13391b == null) {
                        C2258d c2258dEl = C2258d.el(true);
                        this.f13391b = c2258dEl;
                        c2258dEl.imd(new C2258d.zy() { // from class: com.android.thememanager.module.detail.view.r
                            @Override // com.android.thememanager.module.detail.view.C2258d.zy
                            /* JADX INFO: renamed from: k */
                            public final void mo8402k() {
                                this.f13340k.anhx(zBooleanValue);
                            }
                        });
                    }
                    this.f13391b.cyoe(this.f13397m.getSupportFragmentManager(), null);
                }
            }
        }
    }

    private void k4jz(VM vm) {
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        if (onlineResourceDetail != null) {
            vm.bwp(onlineResourceDetail);
            return;
        }
        Resource resource = this.f13393e;
        if (resource == null) {
            vm.se(this.f13399r, this.f13394f, this.f13398o);
        } else if (!this.f13395j) {
            vm.se(resource.getOnlineId(), this.f13393e.getOnlineInfo().getTrackId(), this.f13398o);
        } else {
            vm.kcsr(resource, this.f13398o);
            this.f13396l = vm.t8iq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kl7m(C1723y c1723y) {
        Boolean bool = (Boolean) c1723y.m6720k();
        if (bool != null) {
            v0af(bool.booleanValue());
            zxq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kq(C1723y c1723y) {
        Integer num = (Integer) c1723y.m6720k();
        ActivityC0891q activity = getActivity();
        if (activity == null || num == null) {
            return;
        }
        switch (num.intValue()) {
            case 10:
                activity.finish();
                break;
            case 11:
                anw();
                break;
            case 12:
                pnt2();
                break;
            case 13:
                new ki.C6947k(this.f13397m).lrht(R.string.resource_get_auth_exceed_max_limit_title).fu4(C1807g.lvui() ? R.string.resource_get_auth_exceed_max_limit_tips_pad : R.string.resource_get_auth_exceed_max_limit_tips).dd(R.string.resource_account_switch, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.hb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f13262k.f7z0(dialogInterface, i2);
                    }
                }).mcp(android.R.string.cancel, null).hb();
                break;
            case 14:
                new ki.C6947k(this.f13397m).lrht(R.string.resource_trial_fail_title).fu4(R.string.resource_trial_fail_message).m25047s(false).mcp(R.string.resource_trial_fail_cancel, null).dd(R.string.resource_trial_fail_go_settings, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.nn86
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f13318k.mub(dialogInterface, i2);
                    }
                }).hb();
                break;
            case 15:
                this.f13397m.nn86(null, true);
                break;
            case 16:
                xzl(false);
                break;
            case 17:
                int iM8378n = com.android.thememanager.module.detail.util.zy.m8378n();
                wtop().yl(144);
                com.android.thememanager.module.detail.util.zy.m8377k(this.f13397m, this.f13398o, this.f13393e, 2, iM8378n, false, wtop().c8jq());
                break;
            case 18:
                if (this.f13391b == null) {
                    C2258d c2258dEl = C2258d.el(false);
                    this.f13391b = c2258dEl;
                    c2258dEl.imd(new C2258d.zy() { // from class: com.android.thememanager.module.detail.view.vyq
                        @Override // com.android.thememanager.module.detail.view.C2258d.zy
                        /* JADX INFO: renamed from: k */
                        public final void mo8402k() {
                            this.f13374k.le7();
                        }
                    });
                }
                this.f13391b.cyoe(this.f13397m.getSupportFragmentManager(), null);
                break;
            case 19:
                if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                    wtop().h7am(0);
                    com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.module.detail.view.j
                        @Override // p000a.toq
                        public final void onSuccess() {
                            this.f13278k.fh();
                        }
                    });
                }
                break;
            default:
                C7794k.f7l8("unknown Action Event. " + num);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kt06(C2247q c2247q, DialogInterface dialogInterface, int i2) {
        vwb(c2247q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kz28(DialogInterface dialogInterface, int i2) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            intent.addFlags(268435456);
            if (C1807g.m7081r()) {
                intent = miui.settings.splitlib.zy.m24752k(getActivity(), intent, null);
            }
            startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void le7() {
        if (com.android.thememanager.basemodule.utils.o1t.m7178y()) {
            this.f13400t.ek5k(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m8(final C2247q c2247q, Object obj, boolean z2) {
        if (z2) {
            sj(new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.n5r1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13311k.d1ts(c2247q, dialogInterface, i2);
                }
            }, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.hyr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13263k.i1an(c2247q, dialogInterface, i2);
                }
            }, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            });
        } else {
            xblq(c2247q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mub(DialogInterface dialogInterface, int i2) {
        this.f13397m.startActivity(new Intent("android.settings.DATE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oph(C1723y c1723y) {
        Integer num = (Integer) c1723y.m6720k();
        if (num != null) {
            mo5849v(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sb1e(boolean z2) {
        if (z2) {
            C7775g.ld6(requireActivity(), this.f13393e.getOnlineId(), this.f13398o, this.f13400t.getState(), new C7775g.k() { // from class: com.android.thememanager.module.detail.view.lrht
                @Override // y2.C7775g.k
                /* JADX INFO: renamed from: k */
                public final void mo8401k(boolean z3) {
                    this.f13301k.z8(z3);
                }
            });
        } else {
            this.f13400t.h7am(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sc(C1723y c1723y) {
        Pair pair = (Pair) c1723y.m6720k();
        if (pair != null) {
            iz((String) pair.first, (String) pair.second);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ula6(DialogInterface dialogInterface, int i2) {
        this.f13400t.ld6(requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void vss1(qrj.f7l8 f7l8Var, DialogInterface dialogInterface) {
        if (f7l8Var != null) {
            f7l8Var.mo8349k(false);
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.s9));
        dialogInterface.dismiss();
    }

    private void vwb(final C2247q args) {
        if (!com.android.thememanager.basemodule.utils.o1t.fu4() && C1807g.m7077l() && com.android.thememanager.util.nn86.m9912g()) {
            new nn86.toq(args, new nn86.InterfaceC2798q() { // from class: com.android.thememanager.module.detail.view.mcp
                @Override // com.android.thememanager.util.nn86.InterfaceC2798q
                /* JADX INFO: renamed from: k */
                public final void mo8403k(Object obj, boolean z2) {
                    this.f13308k.m8(args, obj, z2);
                }
            }).executeOnExecutor(C6002g.ld6(), new Void[0]);
        } else {
            xblq(args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wwp(boolean z2, boolean z3) {
        if (z3) {
            ff(z2);
        } else {
            kjd();
            this.f13400t.h7am(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x7o(DialogInterface dialogInterface) {
        this.f13400t.h7am(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z4j7(qrj.f7l8 f7l8Var, DialogInterface dialogInterface, int i2) {
        String str;
        String localId = this.f13396l.packId;
        if (localId == null) {
            localId = this.f13393e.getOnlineId();
            str = "onlineId";
        } else {
            str = InterfaceC1925p.u02;
        }
        if (localId == null) {
            localId = this.f13393e.getLocalId();
            str = "localId";
        }
        C1825s.f10404q.m7215k(AsyncTaskC2208n.f60497kja0).qrj(localId, str).m7212n(getActivity());
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.n2mu));
        if (f7l8Var != null) {
            f7l8Var.mo8349k(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z5(OnlineResourceDetail onlineResourceDetail) {
        this.f13396l = onlineResourceDetail;
        zma(onlineResourceDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z8(boolean z2) {
        if (z2) {
            C1688q.cdj().fti(requireActivity(), new C2302k());
        } else {
            this.f13400t.h7am(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zuf(final boolean z2, boolean z3) {
        if (z3) {
            C7775g.ld6(requireActivity(), this.f13393e.getOnlineId(), this.f13398o, this.f13400t.getState(), new C7775g.k() { // from class: com.android.thememanager.module.detail.view.c
                @Override // y2.C7775g.k
                /* JADX INFO: renamed from: k */
                public final void mo8401k(boolean z5) {
                    this.f13222k.wwp(z2, z5);
                }
            });
        } else {
            kjd();
            this.f13400t.h7am(0);
        }
    }

    private void zxq() {
        com.android.thememanager.basemodule.utils.ni7.m7146k().zy(com.android.thememanager.mine.remote.view.fragment.zy.as, new Intent(com.android.thememanager.mine.remote.view.fragment.zy.as).putExtra("resource_code", this.f13398o));
    }

    public void ab() {
        String str;
        String str2;
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        String str3 = onlineResourceDetail.designerName;
        if (str3 == null || (str = onlineResourceDetail.designerId) == null || (str2 = onlineResourceDetail.designerMiId) == null) {
            c25();
        } else {
            com.android.thememanager.toq.fn3e(this.f13397m, str, str2, str3);
            iz("AUTHOR_WORK", null);
        }
    }

    public void anw() {
        xtb7(new qrj.f7l8() { // from class: com.android.thememanager.module.detail.view.jk
            @Override // com.android.thememanager.module.detail.presenter.qrj.f7l8
            /* JADX INFO: renamed from: k */
            public final void mo8349k(boolean z2) {
                this.f13280k.sb1e(z2);
            }
        });
    }

    public void c25() {
        AbstractActivityC1717k abstractActivityC1717k = this.f13397m;
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        abstractActivityC1717k.startActivity(com.android.thememanager.toq.qrj(abstractActivityC1717k, onlineResourceDetail.designerName, onlineResourceDetail.designerId, onlineResourceDetail.packId, onlineResourceDetail.category));
        iz("AUTHOR_WORK", null);
    }

    public void e4e() {
        Resource resource = this.f13393e;
        if (!(resource != null && resource.isOnShelf())) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_is_off_shelf_can_not_share, 0);
            return;
        }
        if (!"theme".equals(this.f13398o)) {
            com.android.thememanager.util.nmn5.m9909q(requireActivity(), this.f13393e);
            return;
        }
        String str = this.f13396l.shareUrl;
        ActivityC0891q activityC0891qRequireActivity = requireActivity();
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        com.android.thememanager.share.f7l8.f7l8(activityC0891qRequireActivity, str, onlineResourceDetail.name, onlineResourceDetail.productId, onlineResourceDetail.packId, null, onlineResourceDetail.productType);
        String str2 = this.f13394f;
        if (str2 == null) {
            str2 = this.f13399r;
        }
        nme("SHARE", str2, null);
    }

    public void erbd() {
        C1688q.cdj().fti(requireActivity(), new zy());
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.mqs));
    }

    protected void iz(String actionType, String extra) {
        String str = this.f13394f;
        if (str == null) {
            str = this.f13399r;
        }
        nme(actionType, str, extra);
    }

    protected void kjd() {
    }

    protected abstract VM lk();

    protected void m28(Resource resource) {
    }

    protected void mete() {
        this.f13400t.bg.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.jp0y
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13281k.oph((C1723y) obj);
            }
        });
        this.f13400t.bv.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.gvn7
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13257k.kq((C1723y) obj);
            }
        });
        this.f13400t.an.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.d3
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13233k.j3y2((C1723y) obj);
            }
        });
        this.f13400t.az.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.oc
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13330k.sc((C1723y) obj);
            }
        });
        this.f13400t.bl.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.eqxt
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13245k.b7((C1723y) obj);
            }
        });
        this.f13400t.as.m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.d2ok
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13232k.kl7m((C1723y) obj);
            }
        });
    }

    protected void mi1u(final C2247q param) {
        boolean qVar = miuix.os.f7l8.toq("persist.sys.miui_optimization", true);
        Log.i("theme", "checkIconAndWarning: miui_op = " + qVar);
        if (com.android.thememanager.basemodule.utils.o1t.fu4() || qVar) {
            vwb(param);
        } else {
            nod(new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ek5k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13244k.kz28(dialogInterface, i2);
                }
            }, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.yz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13407k.kt06(param, dialogInterface, i2);
                }
            });
        }
    }

    public void nc(String verifyResult) {
    }

    protected void nod(DialogInterface.OnClickListener agreeListener, DialogInterface.OnClickListener disagreeListener) {
        miuix.appcompat.app.ki kiVar = this.f13401x;
        if (kiVar != null && kiVar.isShowing()) {
            this.f13401x.n7h();
        }
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(getActivity()).lrht(R.string.warning_miui_optimization_closed_dialog_title).fu4(R.string.warning_miui_optimization_closed_dialog_message).x9kr(getActivity().getResources().getString(R.string.warning_miui_optimization_closed_dialog_agree), agreeListener).jk(getActivity().getResources().getString(R.string.warning_miui_optimization_closed_dialog_disagree), disagreeListener).m25037g();
        this.f13401x = kiVarM25037g;
        kiVarM25037g.show();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 111) {
            String stringExtra = data == null ? null : data.getStringExtra(ThemeTabActivity.az);
            if (p029m.zy.m24738k(stringExtra, ThemeTabActivity.ax)) {
                if (resultCode == -1 && data != null) {
                    String stringExtra2 = data.getStringExtra("result");
                    if (!p029m.zy.toq(stringExtra2)) {
                        this.f13400t.bek6(stringExtra2);
                        pnt2();
                    }
                } else if (resultCode == 0) {
                    this.f13400t.h7am(0);
                }
            } else if (p029m.zy.m24738k(stringExtra, ThemeTabActivity.bq) && resultCode == -1) {
                nc(data.getStringExtra("result"));
            }
            Log.d(C2755a.f16307g, "child account verify is over resultCode " + resultCode + " pageType is " + stringExtra);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle bundle) {
        super.onCreate(bundle);
        this.f13397m = (AbstractActivityC1717k) requireActivity();
        vg();
        VM vm = (VM) lk();
        this.f13400t = vm;
        k4jz(vm);
        this.f13400t.id.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.uv6
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13369k.ge((Resource) obj);
            }
        });
        this.f13400t.in.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.e
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13242k.z5((OnlineResourceDetail) obj);
            }
        });
        if (p029m.zy.toq(this.f13394f)) {
            this.f13394f = wtop().gyi();
        }
        if (p029m.zy.toq(this.f13399r)) {
            this.f13399r = wtop().lv5();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        miuix.appcompat.app.ki kiVar = this.f13390a;
        if (kiVar != null && kiVar.isShowing()) {
            this.f13390a.n7h();
        }
        miuix.appcompat.app.ki kiVar2 = this.f13401x;
        if (kiVar2 == null || !kiVar2.isShowing()) {
            return;
        }
        this.f13401x.n7h();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f13400t.r8s8();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f13400t.w831();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        mete();
    }

    public void pnt2() {
        this.f13400t.h7am(3);
        xtb7(new qrj.f7l8() { // from class: com.android.thememanager.module.detail.view.l
            @Override // com.android.thememanager.module.detail.presenter.qrj.f7l8
            /* JADX INFO: renamed from: k */
            public final void mo8349k(boolean z2) {
                this.f13299k.i3x9(z2);
            }
        });
    }

    public void rf(String onlineId, String designerName) {
    }

    protected void sj(DialogInterface.OnClickListener keepListener, DialogInterface.OnClickListener notKeepListener, DialogInterface.OnClickListener cancelListener) {
        miuix.appcompat.app.ki kiVar = this.f13390a;
        if (kiVar != null && kiVar.isShowing()) {
            this.f13390a.n7h();
        }
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(requireActivity()).lrht(R.string.large_icon_detail_warning_dialog_title).fu4(R.string.large_icon_detail_warning_dialog_msg).zy(getActivity().getString(R.string.large_icon_detail_warning_dialog_btn_keep), keepListener, 0).zy(getActivity().getString(R.string.large_icon_detail_warning_dialog_btn_not_keep), notKeepListener, 1).zy(getActivity().getString(android.R.string.cancel), cancelListener, 2).m25037g();
        this.f13390a = kiVarM25037g;
        kiVarM25037g.show();
    }

    protected boolean tjz5(C2247q params) {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public void mo5849v(int progress) {
    }

    @InterfaceC7842s
    protected void vg() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13399r = arguments.getString("online_id");
            this.f13396l = (OnlineResourceDetail) arguments.getSerializable(f60577bo);
            this.f13394f = arguments.getString(f13388v);
            this.f13393e = (Resource) arguments.getSerializable("resource");
            this.f13395j = arguments.getBoolean(f13386d, false);
            this.f13392c = arguments.getString("redeem_code");
        }
    }

    protected VM wtop() {
        return this.f13400t;
    }

    protected void xblq(C2247q args) {
        Log.d("Theme", "applyResource, keepLargeIcon = " + args.f13152g);
        int iM8378n = com.android.thememanager.module.detail.util.zy.m8378n();
        com.android.thememanager.module.detail.util.zy.toq(this.f13397m, args.f13153k, this.f13393e, 1, iM8378n, args.f60528toq, args.f60529zy, args.f13156q, args.f13154n, true, args.f13152g);
        iz("APPLY", Integer.toString(iM8378n));
    }

    protected void xtb7(final qrj.f7l8 callback) {
        int iMax = Math.max(this.f13393e.getOnlineInfo().getPlatform(), this.f13393e.getLocalInfo().getPlatform());
        boolean z2 = C1807g.m7081r() || com.android.thememanager.util.g1.m9748l(iMax, this.f13398o);
        C1825s.k kVar = C1825s.f10404q;
        String strM7214y = kVar.m7215k(AsyncTaskC2208n.f60497kja0).m7214y(this.f13396l.packId);
        Log.i("theme", "checkCompatibility: " + z2 + "," + iMax + "," + this.f13398o);
        if (strM7214y == null) {
            strM7214y = kVar.m7215k(AsyncTaskC2208n.f60497kja0).m7214y(this.f13393e.getOnlineId());
        }
        if (strM7214y == null) {
            strM7214y = kVar.m7215k(AsyncTaskC2208n.f60497kja0).m7214y(this.f13393e.getLocalId());
        }
        if (!z2 && strM7214y == null) {
            new ki.C6947k(requireActivity()).lrht(R.string.incompatible_dialog_title).fu4(R.string.incompatible_dialog_message).mcp(R.string.incompatible_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.dd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.cancel();
                }
            }).gvn7(new DialogInterface.OnCancelListener() { // from class: com.android.thememanager.module.detail.view.x9kr
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    y9n.vss1(callback, dialogInterface);
                }
            }).x9kr(getString(R.string.incompatible_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ncyb
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f13314k.z4j7(callback, dialogInterface, i2);
                }
            }).hb();
        } else if (callback != null) {
            callback.mo8349k(true);
        }
    }

    public void xzl(final boolean isUpdate) {
        this.f13400t.h7am(4);
        xtb7(new qrj.f7l8() { // from class: com.android.thememanager.module.detail.view.fti
            @Override // com.android.thememanager.module.detail.presenter.qrj.f7l8
            /* JADX INFO: renamed from: k */
            public final void mo8349k(boolean z2) {
                this.f13249k.zuf(isUpdate, z2);
            }
        });
    }

    void z617() {
        new ki.C6947k(requireActivity()).lrht(R.string.resource_delete).m25039i(android.R.attr.alertDialogIcon).fu4(R.string.resource_delete_confirm).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.lvui
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13304k.ula6(dialogInterface, i2);
            }
        }).hb();
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("id", this.f13399r);
        arrayMapM6679k.put("resourceType", this.f13398o);
        d8wk(com.android.thememanager.basemodule.analysis.toq.evb, new C4871g().o1t(arrayMapM6679k));
    }

    protected void zma(OnlineResourceDetail detail) {
    }
}
