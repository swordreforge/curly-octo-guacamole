package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.clientreport.manager.C5627k;
import com.xiaomi.mipush.sdk.C5652i;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.Cdo;
import com.xiaomi.push.a8p6;
import com.xiaomi.push.b9ub;
import com.xiaomi.push.bap7;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ga;
import com.xiaomi.push.ge;
import com.xiaomi.push.iz;
import com.xiaomi.push.kq;
import com.xiaomi.push.ktq;
import com.xiaomi.push.l7o;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.oph;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import com.xiaomi.push.sj;
import com.xiaomi.push.uf;
import com.xiaomi.push.verb;
import com.xiaomi.push.wlev;
import com.xiaomi.push.wu;
import com.xiaomi.push.wwp;
import com.xiaomi.push.z5;
import com.xiaomi.push.zah1;
import com.xiaomi.push.zma;
import com.xiaomi.push.zxq;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cdj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f73121f7l8 = "subscribe-topic";

    /* JADX INFO: renamed from: g */
    public static final String f31316g = "unset-account";

    /* JADX INFO: renamed from: k */
    public static final String f31317k = "register";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Context f73122ld6 = null;

    /* JADX INFO: renamed from: n */
    public static final String f31318n = "set-account";

    /* JADX INFO: renamed from: p */
    public static final String f31319p = "mipush_extra";

    /* JADX INFO: renamed from: q */
    public static final String f31320q = "unset-alias";

    /* JADX INFO: renamed from: s */
    public static final String f31321s = "accept-time";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f73123toq = "unregister";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static long f73124x2 = System.currentTimeMillis();

    /* JADX INFO: renamed from: y */
    public static final String f31322y = "unsubscibe-topic";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f73125zy = "set-alias";

    public interface f7l8 extends toq<C5645q> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.cdj$g */
    public interface InterfaceC5642g extends toq<C5643k> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.cdj$k */
    public static class C5643k {

        /* JADX INFO: renamed from: k */
        private long f31323k = -1;

        /* JADX INFO: renamed from: k */
        public long m19409k() {
            return this.f31323k;
        }

        protected void toq(long j2) {
            this.f31323k = j2;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.cdj$n */
    public interface InterfaceC5644n extends toq<C5645q> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.cdj$q */
    public static class C5645q {

        /* JADX INFO: renamed from: k */
        private String f31324k = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f73126toq = -1;

        /* JADX INFO: renamed from: k */
        public long m19410k() {
            return this.f73126toq;
        }

        /* JADX INFO: renamed from: q */
        protected void m19411q(String str) {
            this.f31324k = str;
        }

        public String toq() {
            return this.f31324k;
        }

        protected void zy(long j2) {
            this.f73126toq = j2;
        }
    }

    public interface toq<R> {
        void onResult(R r2);
    }

    @Deprecated
    public static abstract class zy {

        /* JADX INFO: renamed from: k */
        private String f31325k;

        public void f7l8(long j2, String str, String str2) {
        }

        /* JADX INFO: renamed from: g */
        public void m19412g(long j2, String str, String str2) {
        }

        /* JADX INFO: renamed from: k */
        protected String m19413k() {
            return this.f31325k;
        }

        /* JADX INFO: renamed from: n */
        public void m19414n(String str, String str2, String str3, boolean z2) {
        }

        /* JADX INFO: renamed from: q */
        public void m19415q(MiPushMessage miPushMessage) {
        }

        public void toq(String str, long j2, String str2, List<String> list) {
        }

        /* JADX INFO: renamed from: y */
        protected void m19416y(String str) {
            this.f31325k = str;
        }

        public void zy(long j2, String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19384a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zp(context, b9ub.COMMAND_SET_ALIAS.f32725a, str, str2);
    }

    protected static boolean a9(Context context) {
        kja0(context, "context");
        return C5648f.m19438n(context).qrj(hyr.ASSEMBLE_PUSH_HUAWEI);
    }

    public static void a98o(Context context, int i2, int i3, int i4, int i5, String str) {
        if (i2 < 0 || i2 >= 24 || i4 < 0 || i4 >= 24 || i3 < 0 || i3 >= 60 || i5 < 0 || i5 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j2 = ((((long) ((i2 * 60) + i3)) + rawOffset) + 1440) % 1440;
        long j3 = ((((long) ((i4 * 60) + i5)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i2), Integer.valueOf(i3)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i4), Integer.valueOf(i5)));
        if (!m19394k(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            m19406x(context, b9ub.COMMAND_SET_ACCEPT_TIME.f32725a, arrayList, str);
        } else if (1 == zurt.m19585q(context)) {
            PushMessageHandler.m19372a(context, str, b9ub.COMMAND_SET_ACCEPT_TIME.f32725a, 0L, null, arrayList2);
        } else {
            zurt.f7l8(context, zurt.m19583k(b9ub.COMMAND_SET_ACCEPT_TIME.f32725a, arrayList2, 0L, null, null, null));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19385b(Context context, String str) {
        a98o(context, 0, 0, 23, 59, str);
    }

    private static void bf2(Context context) {
        if (com.xiaomi.push.service.a9.m21550q(f73122ld6).qrj(oph.DataCollectionSwitch.m21370a(), mcp())) {
            Cdo.toq().zy(new C5660o(context));
            C5889p.toq(f73122ld6).m21378y(new x2(), 10);
        }
    }

    public static void bo(Context context, String str, String str2) {
        if (TextUtils.isEmpty(C5656l.m19500q(context).m19505n()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - xwq3(context, str)) <= 86400000) {
            if (1 == zurt.m19585q(context)) {
                PushMessageHandler.m19371a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            zurt.f7l8(context, zurt.m19583k(b9ub.COMMAND_SUBSCRIBE_TOPIC.f32725a, arrayList, 0L, null, null, null));
            return;
        }
        sj sjVar = new sj();
        String strM21617k = com.xiaomi.push.service.gvn7.m21617k();
        sjVar.m21830a(strM21617k);
        sjVar.m21834b(C5656l.m19500q(context).m19505n());
        sjVar.m21836c(str);
        sjVar.m21838d(context.getPackageName());
        sjVar.m21840e(str2);
        com.xiaomi.channel.commonutils.logger.zy.a9("cmd:" + b9ub.COMMAND_SUBSCRIBE_TOPIC + ", " + strM21617k);
        d3.m19429y(context).ni7(sjVar, wwp.Subscription, null);
    }

    /* JADX INFO: renamed from: c */
    static synchronized void m19386c(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.remove(C5658n.f31413y);
        l7o.m21152k(editorEdit);
    }

    public static void c8jq(Context context) {
        d3.m19429y(context).a9(null, dd.UPLOAD_FCM_TOKEN, hyr.ASSEMBLE_PUSH_FCM, "");
    }

    private static void cdj(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = m19408z(context).iterator();
        while (it.hasNext()) {
            editorEdit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = wvg(context).iterator();
        while (it2.hasNext()) {
            editorEdit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = o1t(context).iterator();
        while (it3.hasNext()) {
            editorEdit.remove("topic_" + it3.next());
        }
        editorEdit.remove(C5658n.f31413y);
        editorEdit.commit();
    }

    public static void ch(Context context, int i2) {
        d3.m19429y(context).dd(i2 & (-1));
    }

    /* JADX INFO: renamed from: d */
    public static void m19387d(Context context, f7l8 f7l8Var) {
        mu(context);
        if (f7l8Var != null) {
            C5645q c5645q = new C5645q();
            c5645q.m19411q(null);
            c5645q.toq();
            c5645q.zy(0L);
            c5645q.m19410k();
            f7l8Var.onResult(c5645q);
        }
    }

    private static void d2ok(Context context) {
        if ("syncing".equals(o1t.toq(f73122ld6).zy(dd.DISABLE_PUSH))) {
            zurt(f73122ld6);
        }
        if ("syncing".equals(o1t.toq(f73122ld6).zy(dd.ENABLE_PUSH))) {
            ni7(f73122ld6);
        }
        o1t qVar = o1t.toq(f73122ld6);
        dd ddVar = dd.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(qVar.zy(ddVar))) {
            d3.m19429y(f73122ld6).a9(null, ddVar, hyr.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(o1t.toq(f73122ld6).zy(dd.UPLOAD_FCM_TOKEN))) {
            c8jq(f73122ld6);
        }
        o1t qVar2 = o1t.toq(f73122ld6);
        dd ddVar2 = dd.UPLOAD_COS_TOKEN;
        if ("syncing".equals(qVar2.zy(ddVar2))) {
            d3.m19429y(f73122ld6).a9(null, ddVar2, hyr.ASSEMBLE_PUSH_COS, "init");
        }
        o1t qVar3 = o1t.toq(f73122ld6);
        dd ddVar3 = dd.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(qVar3.zy(ddVar3))) {
            d3.m19429y(context).a9(null, ddVar3, hyr.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    private static void d3(Context context) {
        ga.kja0(new kja0());
        C5623k c5623kZy = ga.zy(context);
        com.xiaomi.clientreport.manager.toq.m19328n(context).kja0(C5872k.f33107g);
        C5627k.zy(context, c5623kZy, new bap7(context), new wlev(context));
        fu4.toq(context);
        ek5k.m19436k(context, c5623kZy);
        com.xiaomi.push.service.a9.m21550q(context).m21554p(new C5651h(100, "perf event job update", context));
    }

    @Deprecated
    public static void dd(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    @Deprecated
    public static void dr(Context context) {
    }

    /* JADX INFO: renamed from: e */
    static synchronized void m19388e(Context context) {
        Iterator<String> it = m19408z(context).iterator();
        while (it.hasNext()) {
            uv6(context, it.next());
        }
    }

    public static void ek5k(Context context, MiPushMessage miPushMessage) {
        ge geVar = new ge();
        geVar.m20904a(miPushMessage.getMessageId());
        geVar.m20915b(miPushMessage.getTopic());
        geVar.m20927d(miPushMessage.getDescription());
        geVar.m20923c(miPushMessage.getTitle());
        geVar.m20922c(miPushMessage.getNotifyId());
        geVar.m20903a(miPushMessage.getNotifyType());
        geVar.m20914b(miPushMessage.getPassThrough());
        geVar.m20905a(miPushMessage.getExtra());
        y9n(context, miPushMessage.getMessageId(), geVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqxt(Context context, String str, String str2, zy zyVar, String str3, toq toqVar) {
        try {
            com.xiaomi.channel.commonutils.logger.zy.x2(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.zy.a9("sdk_version = 5_7_8-C");
            com.xiaomi.push.o1t.m21340k(context).zy();
            ktq.m21146k(context);
            if (zyVar != null) {
                PushMessageHandler.m19374a(zyVar);
            }
            if (toqVar != null) {
                PushMessageHandler.m19373a(toqVar);
            }
            if (wu.f7l8(f73122ld6)) {
                y9n.toq(f73122ld6);
            }
            boolean z2 = C5656l.m19500q(f73122ld6).m19504k() != C5658n.m19527k();
            if (!z2 && !t8iq(f73122ld6)) {
                d3.m19429y(f73122ld6).qrj();
                com.xiaomi.channel.commonutils.logger.zy.kja0("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z2 || !C5656l.m19500q(f73122ld6).qrj(str, str2) || C5656l.m19500q(f73122ld6).m19508t()) {
                String strM21302k = com.xiaomi.push.n5r1.m21302k(6);
                C5656l.m19500q(f73122ld6).m19501g();
                C5656l.m19500q(f73122ld6).f7l8(C5658n.m19527k());
                C5656l.m19500q(f73122ld6).m19506p(str, str2, strM21302k);
                C5652i.k.toq().m19473s(C5652i.f31371k);
                m19391h(f73122ld6);
                t8r(context);
                zxq zxqVar = new zxq();
                zxqVar.m22143a(com.xiaomi.push.service.gvn7.zy());
                zxqVar.m22150b(str);
                zxqVar.m22162e(str2);
                zxqVar.m22159d(f73122ld6.getPackageName());
                zxqVar.m22165f(strM21302k);
                Context context2 = f73122ld6;
                zxqVar.m22155c(uf.m21865y(context2, context2.getPackageName()));
                Context context3 = f73122ld6;
                zxqVar.m22149b(uf.toq(context3, context3.getPackageName()));
                zxqVar.m22171h(C5872k.f33107g);
                zxqVar.m22141a(C5872k.f33109n);
                zxqVar.m22142a(z5.Init);
                if (!TextUtils.isEmpty(str3)) {
                    zxqVar.m22168g(str3);
                }
                if (!nc.m21310i()) {
                    String strNi7 = m8.ni7(f73122ld6);
                    if (!TextUtils.isEmpty(strNi7)) {
                        zxqVar.m22174i(com.xiaomi.push.n5r1.toq(strNi7) + "," + m8.m21283z(f73122ld6));
                    }
                }
                int iZy = m8.zy();
                if (iZy >= 0) {
                    zxqVar.m22154c(iZy);
                }
                d3.m19429y(f73122ld6).fn3e(zxqVar, z2);
                f73122ld6.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == zurt.m19585q(f73122ld6)) {
                    kja0(zyVar, "callback");
                    zyVar.zy(0L, null, C5656l.m19500q(f73122ld6).m19503i());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C5656l.m19500q(f73122ld6).m19503i());
                    zurt.f7l8(f73122ld6, zurt.m19583k(b9ub.COMMAND_REGISTER.f32725a, arrayList, 0L, null, null, null));
                }
                d3.m19429y(f73122ld6).qrj();
                if (C5656l.m19500q(f73122ld6).x2()) {
                    erbd erbdVar = new erbd();
                    erbdVar.m20795b(C5656l.m19500q(f73122ld6).m19505n());
                    erbdVar.m20799c(kq.ClientInfoUpdate.f33227a);
                    erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
                    HashMap map = new HashMap();
                    erbdVar.f32866a = map;
                    Context context4 = f73122ld6;
                    map.put(C5658n.f73186toq, uf.m21865y(context4, context4.getPackageName()));
                    Map<String, String> map2 = erbdVar.f32866a;
                    Context context5 = f73122ld6;
                    map2.put(C5658n.f73191zy, Integer.toString(uf.toq(context5, context5.getPackageName())));
                    erbdVar.f32866a.put("push_sdk_vn", C5872k.f33107g);
                    erbdVar.f32866a.put("push_sdk_vc", Integer.toString(C5872k.f33109n));
                    String strM19510z = C5656l.m19500q(f73122ld6).m19510z();
                    if (!TextUtils.isEmpty(strM19510z)) {
                        erbdVar.f32866a.put("deviceid", strM19510z);
                    }
                    d3.m19429y(f73122ld6).m19435z(erbdVar, wwp.Notification, false, null);
                    d3.m19429y(f73122ld6).cdj(f73122ld6);
                }
                if (!zah1.m22103q(f73122ld6, "update_devId", false)) {
                    qo();
                    zah1.toq(f73122ld6, "update_devId", true);
                }
                if (m19404u(f73122ld6) && lv5(f73122ld6)) {
                    erbd erbdVar2 = new erbd();
                    erbdVar2.m20795b(C5656l.m19500q(f73122ld6).m19505n());
                    erbdVar2.m20799c(kq.PullOfflineMessage.f33227a);
                    erbdVar2.m20782a(com.xiaomi.push.service.gvn7.m21617k());
                    erbdVar2.m20785a(false);
                    d3.m19429y(f73122ld6).o1t(erbdVar2, wwp.Notification, false, null, false);
                    m19402s(f73122ld6);
                }
            }
            m19399p(f73122ld6);
            i1();
            bf2(f73122ld6);
            d3(f73122ld6);
            x9kr.toq(f73122ld6);
            if (!f73122ld6.getPackageName().equals("com.xiaomi.xmsf")) {
                if (C5661p.m19541q() != null) {
                    C5661p.m19540n(f73122ld6, C5661p.m19541q());
                }
                com.xiaomi.channel.commonutils.logger.zy.m19301y(2);
            }
            d2ok(context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m19389f(Context context, String str, String str2, String str3, InterfaceC5644n interfaceC5644n) {
        n5r1(context, str, str2, new fn3e(), null, interfaceC5644n);
    }

    static synchronized void f7l8(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
    }

    public static void fn3e(Context context, String str, String str2) {
        d3.m19429y(context).jp0y(str, str2);
    }

    public static void fnq8(Context context, String str, String str2) {
        if (C5656l.m19500q(context).t8r()) {
            if (xwq3(context, str) < 0) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("Don't cancel subscribe for " + com.xiaomi.push.n5r1.zy(str, 3) + " is unsubscribed");
                return;
            }
            a8p6 a8p6Var = new a8p6();
            String strM21617k = com.xiaomi.push.service.gvn7.m21617k();
            a8p6Var.m20555a(strM21617k);
            a8p6Var.m20560b(C5656l.m19500q(context).m19505n());
            a8p6Var.m20563c(str);
            a8p6Var.m20565d(context.getPackageName());
            a8p6Var.m20567e(str2);
            com.xiaomi.channel.commonutils.logger.zy.a9("cmd:" + b9ub.COMMAND_UNSUBSCRIBE_TOPIC + ", " + strM21617k);
            d3.m19429y(context).ni7(a8p6Var, wwp.UnSubscription, null);
        }
    }

    protected static boolean fti(Context context) {
        kja0(context, "context");
        return C5648f.m19438n(context).qrj(hyr.ASSEMBLE_PUSH_COS);
    }

    protected static String fu4(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(C5658n.f31413y, "00:00-23:59");
    }

    /* JADX INFO: renamed from: g */
    static synchronized void m19390g(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(C5658n.f31413y, str + "," + str2);
        l7o.m21152k(editorEdit);
    }

    public static String gvn7(Context context) {
        if (C5656l.m19500q(context).zurt()) {
            return C5656l.m19500q(context).m19503i();
        }
        return null;
    }

    @Deprecated
    public static void gyi(Context context) {
    }

    /* JADX INFO: renamed from: h */
    protected static void m19391h(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    static synchronized void hb(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
    }

    public static void hyr(Context context, String str, String str2, String str3) {
        n5r1(context, str, str2, new fn3e(), str3, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m19392i(Context context, int i2) {
        d3.m19429y(context).n7h(i2);
    }

    private static void i1() {
        C5889p.toq(f73122ld6).ld6(new C5670z(f73122ld6), com.xiaomi.push.service.a9.m21550q(f73122ld6).m21553k(oph.OcVersionCheckFrequency.m21370a(), 86400), 5);
    }

    public static void ikck(Context context, InterfaceC5642g interfaceC5642g) {
        ni7(context);
        if (interfaceC5642g != null) {
            C5643k c5643k = new C5643k();
            c5643k.toq(0L);
            c5643k.m19409k();
            interfaceC5642g.onResult(c5643k);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m19393j(Context context) {
        d3.m19429y(context).hb();
    }

    protected static boolean jk(Context context) {
        kja0(context, "context");
        return C5648f.m19438n(context).qrj(hyr.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean jp0y(Context context) {
        return C5648f.m19438n(context).qrj(hyr.ASSEMBLE_PUSH_FTOS);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m19394k(Context context, String str, String str2) {
        return TextUtils.equals(fu4(context), str + "," + str2);
    }

    public static void ki(Context context) {
        d3.m19429y(context).m19432o();
    }

    private static void kja0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    /* JADX INFO: renamed from: l */
    public static void m19395l(Context context, String str, String str2, fn3e fn3eVar) {
        n5r1(context, str, str2, fn3eVar, null, null);
    }

    static synchronized void ld6(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    static synchronized void lrht(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
    }

    private static boolean lv5(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    public static void lvui(Context context, String str) {
        a98o(context, 0, 0, 0, 0, str);
    }

    /* JADX INFO: renamed from: m */
    static void m19396m(Context context, String str, ge geVar, String str2, String str3) {
        erbd erbdVar = new erbd();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.zy.jk("do not report clicked message");
            return;
        }
        erbdVar.m20795b(str3);
        erbdVar.m20799c("bar:click");
        erbdVar.m20782a(str);
        erbdVar.m20785a(false);
        d3.m19429y(context).m19434t(erbdVar, wwp.Notification, false, true, geVar, true, str2, str3);
    }

    private static boolean mcp() {
        return nc.m21309h();
    }

    public static void mu(Context context) {
        uv6.fu4(context);
        com.xiaomi.push.service.a9.m21550q(context).m21555y();
        if (C5656l.m19500q(context).t8r()) {
            iz izVar = new iz();
            izVar.m21002a(com.xiaomi.push.service.gvn7.m21617k());
            izVar.m21007b(C5656l.m19500q(context).m19505n());
            izVar.m21010c(C5656l.m19500q(context).m19503i());
            izVar.m21014e(C5656l.m19500q(context).kja0());
            izVar.m21012d(context.getPackageName());
            d3.m19429y(context).zurt(izVar);
            PushMessageHandler.m19363a();
            PushMessageHandler.m19376b();
            C5656l.m19500q(context).m19502h();
            ki(context);
            t8r(context);
            m19391h(context);
        }
    }

    /* JADX INFO: renamed from: n */
    public static long m19397n(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    private static void n5r1(Context context, String str, String str2, fn3e fn3eVar, String str3, toq toqVar) {
        kja0(context, "context");
        kja0(str, "appID");
        kja0(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        f73122ld6 = applicationContext;
        if (applicationContext == null) {
            f73122ld6 = context;
        }
        Context context2 = f73122ld6;
        wu.m21968n(context2);
        if (!NetworkStatusReceiver.m21750a()) {
            x9kr(f73122ld6);
        }
        C5648f.m19438n(f73122ld6).f7l8(fn3eVar);
        C5889p.toq(context2).f7l8(new ld6(str, str2, str3, toqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n7h(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.m19366a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void ncyb(Context context, String str, String str2) {
        m19395l(context, str, str2, new fn3e());
    }

    public static void ni7(Context context) {
        d3.m19429y(context).gvn7(false);
    }

    public static void nmn5(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zp(context, b9ub.COMMAND_SET_ACCOUNT.f32725a, str, str2);
    }

    static synchronized void nn86(Context context) {
        Iterator<String> it = o1t(context).iterator();
        while (it.hasNext()) {
            hb(context, it.next());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m19398o(Context context, boolean z2) {
        if (C5656l.m19500q(context).t8r()) {
            kq kqVar = z2 ? kq.APP_SLEEP : kq.APP_WAKEUP;
            erbd erbdVar = new erbd();
            erbdVar.m20795b(C5656l.m19500q(context).m19505n());
            erbdVar.m20799c(kqVar.f33227a);
            erbdVar.m20803d(context.getPackageName());
            erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
            erbdVar.m20785a(false);
            d3.m19429y(context).o1t(erbdVar, wwp.Notification, false, null, false);
        }
    }

    public static List<String> o1t(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static void oc(Context context, String str, String str2, zy zyVar) {
        eqxt(context, str, str2, zyVar, null, null);
    }

    /* JADX INFO: renamed from: p */
    private static void m19399p(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        l7o.m21152k(editorEdit);
    }

    public static void qkj8(Context context, String str, String str2) {
        zp(context, b9ub.COMMAND_UNSET_ACCOUNT.f32725a, str, str2);
    }

    private static void qo() {
        new Thread(new qrj()).start();
    }

    public static void qrj(Context context, String[] strArr) {
        C5889p.toq(context).f7l8(new n7h(strArr, context));
    }

    /* JADX INFO: renamed from: r */
    static void m19401r(Context context, z5 z5Var) {
        com.xiaomi.channel.commonutils.logger.zy.a9("re-register reason: " + z5Var);
        String strM21302k = com.xiaomi.push.n5r1.m21302k(6);
        String strM19505n = C5656l.m19500q(context).m19505n();
        String strKja0 = C5656l.m19500q(context).kja0();
        C5656l.m19500q(context).m19501g();
        cdj(context);
        t8r(context);
        C5656l.m19500q(context).f7l8(C5658n.m19527k());
        C5656l.m19500q(context).m19506p(strM19505n, strKja0, strM21302k);
        zxq zxqVar = new zxq();
        zxqVar.m22143a(com.xiaomi.push.service.gvn7.zy());
        zxqVar.m22150b(strM19505n);
        zxqVar.m22162e(strKja0);
        zxqVar.m22165f(strM21302k);
        zxqVar.m22159d(context.getPackageName());
        zxqVar.m22155c(uf.m21865y(context, context.getPackageName()));
        zxqVar.m22149b(uf.toq(context, context.getPackageName()));
        zxqVar.m22171h(C5872k.f33107g);
        zxqVar.m22141a(C5872k.f33109n);
        zxqVar.m22142a(z5Var);
        int iZy = m8.zy();
        if (iZy >= 0) {
            zxqVar.m22154c(iZy);
        }
        d3.m19429y(context).fn3e(zxqVar, false);
    }

    /* JADX INFO: renamed from: s */
    private static void m19402s(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_pull_notification", System.currentTimeMillis());
        l7o.m21152k(editorEdit);
    }

    /* JADX INFO: renamed from: t */
    public static String m19403t(Context context) {
        if (C5656l.m19500q(context).zurt()) {
            return C5656l.m19500q(context).wvg();
        }
        return null;
    }

    private static boolean t8iq(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static void t8r(Context context) {
        d3.m19429y(context).n7h(-1);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m19404u(Context context) {
        return d3.m19429y(context).oc();
    }

    static synchronized void uv6(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
    }

    /* JADX INFO: renamed from: v */
    public static void m19405v(Context context, InterfaceC5642g interfaceC5642g) {
        zurt(context);
        if (interfaceC5642g != null) {
            C5643k c5643k = new C5643k();
            c5643k.toq(0L);
            c5643k.m19409k();
            interfaceC5642g.onResult(c5643k);
        }
    }

    public static void vq(Context context, String str, String str2) {
        zp(context, b9ub.COMMAND_UNSET_ALIAS.f32725a, str, str2);
    }

    static synchronized void vyq(Context context) {
        Iterator<String> it = wvg(context).iterator();
        while (it.hasNext()) {
            lrht(context, it.next());
        }
    }

    public static List<String> wvg(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    protected static void m19406x(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(C5656l.m19500q(context).m19505n())) {
            return;
        }
        zma zmaVar = new zma();
        String strM21617k = com.xiaomi.push.service.gvn7.m21617k();
        zmaVar.m22108a(strM21617k);
        zmaVar.m22115b(C5656l.m19500q(context).m19505n());
        zmaVar.m22118c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            zmaVar.m22111a(it.next());
        }
        zmaVar.m22123e(str2);
        zmaVar.m22121d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.zy.a9("cmd:" + str + ", " + strM21617k);
        d3.m19429y(context).ni7(zmaVar, wwp.Command, null);
    }

    public static long x2(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    private static void x9kr(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            verb.m21900k(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("dynamic register network status receiver failed:" + th);
        }
        com.xiaomi.push.oc.m21362s(f73122ld6);
    }

    public static long xwq3(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    /* JADX INFO: renamed from: y */
    static synchronized void m19407y(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
    }

    @Deprecated
    public static void y2(Context context) {
    }

    static void y9n(Context context, String str, ge geVar, String str2) {
        erbd erbdVar = new erbd();
        if (!TextUtils.isEmpty(str2)) {
            erbdVar.m20795b(str2);
        } else {
            if (!C5656l.m19500q(context).t8r()) {
                com.xiaomi.channel.commonutils.logger.zy.jk("do not report clicked message");
                return;
            }
            erbdVar.m20795b(C5656l.m19500q(context).m19505n());
        }
        erbdVar.m20799c("bar:click");
        erbdVar.m20782a(str);
        erbdVar.m20785a(false);
        d3.m19429y(context).m19435z(erbdVar, wwp.Notification, false, geVar);
    }

    @Deprecated
    public static void yz(Context context, String str) {
        y9n(context, str, null, null);
    }

    /* JADX INFO: renamed from: z */
    public static List<String> m19408z(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    protected static void zp(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        b9ub b9ubVar = b9ub.COMMAND_SET_ALIAS;
        if (b9ubVar.f32725a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - x2(context, str2)) < 86400000) {
            if (1 == zurt.m19585q(context)) {
                PushMessageHandler.m19372a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                zurt.f7l8(context, zurt.m19583k(b9ubVar.f32725a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (b9ub.COMMAND_UNSET_ALIAS.f32725a.equalsIgnoreCase(str) && x2(context, str2) < 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Don't cancel alias for " + com.xiaomi.push.n5r1.zy(arrayList.toString(), 3) + " is unseted");
            return;
        }
        b9ub b9ubVar2 = b9ub.COMMAND_SET_ACCOUNT;
        if (b9ubVar2.f32725a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - m19397n(context, str2)) < 3600000) {
            if (1 == zurt.m19585q(context)) {
                PushMessageHandler.m19372a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                zurt.f7l8(context, zurt.m19583k(b9ubVar2.f32725a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!b9ub.COMMAND_UNSET_ACCOUNT.f32725a.equalsIgnoreCase(str) || m19397n(context, str2) >= 0) {
            m19406x(context, str, arrayList, str3);
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("Don't cancel account for " + com.xiaomi.push.n5r1.zy(arrayList.toString(), 3) + " is unseted");
    }

    public static void zurt(Context context) {
        d3.m19429y(context).gvn7(true);
    }
}
