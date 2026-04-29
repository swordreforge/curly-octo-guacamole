package com.android.thememanager.controller.online;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.lifecycle.jp0y;
import androidx.lifecycle.lrht;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.account.C1687n;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.util.C2789j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.ch;
import miuix.appcompat.app.ki;
import vy.C7718q;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: PurchaseManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r implements com.android.thememanager.basemodule.analysis.toq, n7h {

    /* JADX INFO: renamed from: a */
    public static final int f10992a = 200011;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f57961ab = 2;
    public static final int an = 6;

    /* JADX INFO: renamed from: b */
    public static final int f10993b = 200010;
    public static final int bb = 3;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f57962bo = 200014;
    public static final int bp = 4;
    public static final int bv = 5;

    /* JADX INFO: renamed from: c */
    public static final int f10994c = 200005;

    /* JADX INFO: renamed from: d */
    public static final int f10995d = 200016;

    /* JADX INFO: renamed from: e */
    public static final int f10996e = 200006;

    /* JADX INFO: renamed from: f */
    public static final int f10997f = 200004;

    /* JADX INFO: renamed from: h */
    private static final String f10998h = "getOrder|";

    /* JADX INFO: renamed from: i */
    public static final String f10999i = "result";
    public static final int id = 7;
    public static final int in = -1;

    /* JADX INFO: renamed from: j */
    public static final int f11000j = 200007;

    /* JADX INFO: renamed from: l */
    public static final int f11001l = 200003;

    /* JADX INFO: renamed from: m */
    public static final int f11002m = 200009;

    /* JADX INFO: renamed from: o */
    public static final int f11003o = 200008;

    /* JADX INFO: renamed from: p */
    public static final String f11004p = "ThemePurchaseManager";

    /* JADX INFO: renamed from: r */
    public static final int f11005r = 200002;

    /* JADX INFO: renamed from: t */
    public static final int f11006t = 200001;

    /* JADX INFO: renamed from: u */
    public static final int f11007u = 200013;

    /* JADX INFO: renamed from: v */
    public static final int f11008v = 200015;

    /* JADX INFO: renamed from: w */
    public static final int f11009w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f11010x = 200012;

    /* JADX INFO: renamed from: z */
    public static final int f11011z = 20;

    /* JADX INFO: renamed from: g */
    private String f11012g;

    /* JADX INFO: renamed from: k */
    private final Activity f11013k;

    /* JADX INFO: renamed from: n */
    private final C1917i f11014n;

    /* JADX INFO: renamed from: q */
    private final f7l8 f11015q;

    /* JADX INFO: renamed from: s */
    private String f11016s;

    /* JADX INFO: renamed from: y */
    private EnumC1934g f11017y;

    /* JADX INFO: compiled from: PurchaseManager.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        default void m7628k() {
        }

        /* JADX INFO: renamed from: q */
        void mo6370q(int errorType, int errorCode, String errorMsg);

        void toq();

        default void zy(EnumC1938y step) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.t8r$g */
    /* JADX INFO: compiled from: PurchaseManager.java */
    public enum EnumC1934g {
        SINGLE,
        EXCHANGE_CODE
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.t8r$k */
    /* JADX INFO: compiled from: PurchaseManager.java */
    class DialogInterfaceOnClickListenerC1935k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f11019k;

        DialogInterfaceOnClickListenerC1935k(final Activity val$activity) {
            this.f11019k = val$activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent("android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS");
            intent.addFlags(268435456);
            this.f11019k.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.t8r$n */
    /* JADX INFO: compiled from: PurchaseManager.java */
    public static class C1936n {

        /* JADX INFO: renamed from: k */
        int f11020k;

        /* JADX INFO: renamed from: q */
        public String f11021q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f57963toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f57964zy;

        public C1936n(int result, int errorCode, String errorMessage, String order) {
            this.f11020k = result;
            this.f57963toq = errorCode;
            this.f57964zy = errorMessage;
            this.f11021q = order;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.t8r$q */
    /* JADX INFO: compiled from: PurchaseManager.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1937q {
    }

    /* JADX INFO: compiled from: PurchaseManager.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f11022k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ EnumC1934g f57965toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f57966zy;

        toq(final String val$onlineId, final EnumC1934g val$productType, final String val$resourceCode) {
            this.f11022k = val$onlineId;
            this.f57965toq = val$productType;
            this.f57966zy = val$resourceCode;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                t8r.this.fn3e(t8r.f11006t, -1, null);
            } else {
                t8r.this.fn3e(t8r.f11005r, -1, null);
            }
            Log.i(t8r.f11004p, "fail to login");
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            t8r.this.m7621i();
            t8r.this.f11014n.zy(this.f11022k, this.f57965toq, this.f57966zy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.t8r$y */
    /* JADX INFO: compiled from: PurchaseManager.java */
    public enum EnumC1938y {
        NONE,
        GETTING_ORDER,
        WAITING_PAYMENT
    }

    /* JADX INFO: compiled from: PurchaseManager.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    public t8r(@lvui final AbstractActivityC1717k activity, @lvui f7l8 listener, lrht vm) {
        this.f11013k = activity;
        this.f11015q = listener;
        C1917i c1917i = new C1917i(vm);
        this.f11014n = c1917i;
        c1917i.x2().m4391p(activity, new jp0y() { // from class: com.android.thememanager.controller.online.kja0
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f10937k.m7620h((t8r.EnumC1938y) obj);
            }
        });
        c1917i.m7559p().m4391p(activity, new jp0y() { // from class: com.android.thememanager.controller.online.h
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f10932k.cdj((t8r.C1936n) obj);
            }
        });
        c1917i.m7560s().m4391p(activity, new jp0y() { // from class: com.android.thememanager.controller.online.cdj
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f10926k.ki(activity, (C1723y) obj);
            }
        });
        c1917i.ld6().m4391p(activity, new jp0y() { // from class: com.android.thememanager.controller.online.ki
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f10936k.t8r((ch) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdj(C1936n c1936n) {
        if (c1936n == null) {
            return;
        }
        if (c1936n.f11020k == 7) {
            x2(c1936n.f57964zy);
        } else {
            this.f11016s = c1936n.f11021q;
            this.f11014n.n7h(c1936n, this.f11012g, this.f11017y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(int errorType, int errorCode, String errorMsg) {
        qrj();
        this.f11015q.mo6370q(errorType, errorCode, errorMsg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m7620h(EnumC1938y enumC1938y) {
        if (enumC1938y != EnumC1938y.NONE) {
            zurt(enumC1938y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m7621i() {
        this.f11015q.m7628k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ki(AbstractActivityC1717k abstractActivityC1717k, C1723y c1723y) {
        if ((c1723y != null ? ((Integer) c1723y.m6720k()).intValue() : -1) == 1) {
            m7626z(abstractActivityC1717k, this.f11016s, this);
        }
    }

    public static int kja0(EnumC1938y step) {
        if (step == EnumC1938y.GETTING_ORDER) {
            return R.string.resource_purchase_getting_order;
        }
        if (step == EnumC1938y.WAITING_PAYMENT) {
            return R.string.resource_purchase_waiting_payment;
        }
        return 0;
    }

    public static int ld6(String onlineId, @lvui String productType) {
        try {
            Boolean bool = ld6.m7579y(productType, onlineId).get(onlineId);
            if (bool != null) {
                return bool.booleanValue() ? 1 : 2;
            }
            return 2;
        } catch (Exception e2) {
            C2789j.qrj(t8r.class.getSimpleName(), e2);
            return 2;
        }
    }

    public static void n7h(final Activity activity, int resultType, int errorCode, String errorMsg) {
        Log.d(f11004p, "getOrder resultType:" + resultType + ",errorCode:" + errorCode + ",errorMsg = " + errorMsg);
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("resourceType", "theme");
        arrayMapM6679k.put("code", String.valueOf(resultType));
        arrayMapM6679k.put("content", errorMsg);
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.verb, C1706p.ki(arrayMapM6679k));
        StringBuilder sb = new StringBuilder();
        sb.append(f10998h);
        sb.append(resultType);
        sb.append(errorCode == -1 ? "" : "|" + errorCode);
        String string = sb.toString();
        switch (resultType) {
            case f11006t /* 200001 */:
                if (activity != null) {
                    com.android.thememanager.util.ch.yz(activity);
                }
                break;
            case f11005r /* 200002 */:
                nn86.m7150k(R.string.fail_to_add_account, 0);
                break;
            case f11001l /* 200003 */:
            case f10992a /* 200011 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_server_out_of_service, string);
                break;
            case f10997f /* 200004 */:
            case f11010x /* 200012 */:
                com.android.thememanager.util.ch.m9666b(R.string.update_no_net, string);
                break;
            case f10994c /* 200005 */:
            case f10993b /* 200010 */:
            case f11007u /* 200013 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_unknow_error, string);
                break;
            case f10996e /* 200006 */:
            case f11008v /* 200015 */:
            default:
                nn86.toq(errorMsg, 0);
                break;
            case f11000j /* 200007 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_pack_get_auth_has_been_undercarriaged, null);
                break;
            case f11003o /* 200008 */:
                com.android.thememanager.util.ch.m9666b(R.string.resource_get_auth_has_been_undercarriaged, null);
                break;
            case f11002m /* 200009 */:
                if (activity != null) {
                    new ki.C6947k(activity).lrht(R.string.resource_get_auth_exceed_max_limit_title).fu4(C1807g.lvui() ? R.string.resource_get_auth_exceed_max_limit_tips_pad : R.string.resource_get_auth_exceed_max_limit_tips).dd(R.string.resource_account_switch, new DialogInterfaceOnClickListenerC1935k(activity)).mcp(android.R.string.cancel, null).hb();
                    break;
                }
                break;
            case f57962bo /* 200014 */:
            case f10995d /* 200016 */:
                break;
        }
    }

    private void ni7() {
        qrj();
        this.f11015q.toq();
    }

    /* JADX INFO: renamed from: p */
    private void m7623p(final String onlineId, final EnumC1934g productType, final String resourceCode) {
        if (!this.f11013k.isFinishing() && onlineId != null && resourceCode != null) {
            C1688q.cdj().fti(this.f11013k, new toq(onlineId, productType, resourceCode));
            return;
        }
        Log.e(f11004p, "checkAccountAndPurchase: activity == null " + onlineId + ", " + resourceCode);
    }

    private void qrj() {
        this.f11014n.cdj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t8r(ch chVar) {
        if (((Integer) chVar.getFirst()).intValue() == 0) {
            ni7();
        } else {
            fn3e(((Integer) chVar.getFirst()).intValue(), ((Integer) chVar.getSecond()).intValue(), (String) chVar.getThird());
        }
    }

    private void x2(String H5Url) {
        if (C1688q.cdj().jk()) {
            Log.d(f11004p, "go to child account webview");
            if (C1819o.eqxt(this.f11013k)) {
                Intent intentM9541i = com.android.thememanager.toq.m9541i(this.f11013k, null, H5Url);
                intentM9541i.putExtra(ThemeTabActivity.az, ThemeTabActivity.ax);
                this.f11013k.startActivityForResult(intentM9541i, 111);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m7626z(@lvui AbstractActivityC1717k activity, @lvui String order, @lvui n7h payCallbackReceiver) {
        activity.ikck(payCallbackReceiver);
        Bundle bundle = new Bundle();
        C1687n c1687n = new C1687n(activity);
        vy.toq toqVarM28120k = C7718q.m28120k(activity);
        bundle.putString(C7718q.f97075zy, "1,1");
        try {
            toqVarM28120k.mo17520n(activity, 20, order, c1687n, bundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void zurt(EnumC1938y step) {
        this.f11015q.zy(step);
    }

    public void fu4(String onlineId, String resourceCode, EnumC1934g productType) {
        y9n.m7255s();
        if (this.f11013k.isFinishing()) {
            Log.e(f11004p, "purchase: activity finishing ");
            return;
        }
        if (this.f11014n.m7558n() != EnumC1938y.NONE) {
            Log.i(f11004p, "You can't call purchase() method when other purchase task is going.");
            return;
        }
        if (TextUtils.isEmpty(onlineId)) {
            Log.i(f11004p, "Fail to buy resource because of empty product ID.");
            fn3e(f10996e, -1, null);
        } else {
            this.f11012g = onlineId;
            this.f11017y = productType;
            m7623p(onlineId, productType, resourceCode);
        }
    }

    @Override // com.android.thememanager.controller.online.n7h
    /* JADX INFO: renamed from: k */
    public void mo7597k(int resultCode, @dd Intent data) {
        Bundle bundleExtra;
        C7718q.m28120k(bf2.toq.toq()).release();
        String string = null;
        int i2 = 0;
        if (data != null) {
            bundleExtra = data.getBundleExtra("result");
            if (bundleExtra != null) {
                string = bundleExtra.getString("message");
                i2 = bundleExtra.getInt("code");
            }
        } else {
            bundleExtra = null;
        }
        if (resultCode == -1) {
            this.f11014n.kja0(this.f11016s, bundleExtra, this.f11017y);
        } else {
            this.f11014n.qrj(i2, string);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m7627s() {
        if (this.f11014n.m7558n() != EnumC1938y.GETTING_ORDER) {
            return false;
        }
        qrj();
        return true;
    }
}
