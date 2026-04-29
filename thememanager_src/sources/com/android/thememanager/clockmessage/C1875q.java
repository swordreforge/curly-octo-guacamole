package com.android.thememanager.clockmessage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.f7l8;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.clockmessage.db.C1871k;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.clockmessage.model.toq;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.appcompat.app.ki;
import zy.lvui;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.clockmessage.q */
/* JADX INFO: compiled from: ClockMessageManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1875q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final long f57856cdj = 3600000;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f57857fn3e = "classic_theme_clock";

    /* JADX INFO: renamed from: h */
    private static final long f10658h = 60000;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final long f57858ki = 86400000;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f57859kja0 = "clock_community_message_trigger";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f57860ld6 = "https://web.vip.miui.com/page/info/mio/mio/singleBoard?boardId=567428&preventBack=true&ref=themeApp";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f57861n7h = "clock_message_trigger";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f57862ni7 = "community_once_click_clock_message";

    /* JADX INFO: renamed from: p */
    public static final String f10660p = "web.vip.miui.com";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f57863qrj = "theme://zhuti.xiaomi.com/community/%s";

    /* JADX INFO: renamed from: s */
    public static final String f10661s = "mio";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57865x2 = "https://web.vip.miui.com/page/info/mio/mio/singleBoard?boardId=567428&ref=themewidget";

    /* JADX INFO: renamed from: y */
    private static final String f10662y = "ClockMessageManager";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f57866zurt = "community_in_condition_of_agreement_remind";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f57867f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f10663g;

    /* JADX INFO: renamed from: k */
    private C1871k f10664k;

    /* JADX INFO: renamed from: n */
    private String f10665n;

    /* JADX INFO: renamed from: q */
    private String f10666q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private AtomicBoolean f57868toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f57869zy;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f57864t8r = com.android.thememanager.basemodule.resource.constants.zy.f57665ld6 + "community_classic_themes";

    /* JADX INFO: renamed from: i */
    private static final String f10659i = bf2.toq.toq().getCacheDir().getAbsolutePath() + "/community_read_activity";

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.q$k */
    /* JADX INFO: compiled from: ClockMessageManager.java */
    class k extends AbstractC1777n<EmptyResponse> {
        k() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui EmptyResponse response) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.q$toq */
    /* JADX INFO: compiled from: ClockMessageManager.java */
    class toq extends AbstractC1777n<com.android.thememanager.clockmessage.model.toq> {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui com.android.thememanager.clockmessage.model.toq response) {
            boolean z2;
            if (response == null) {
                return;
            }
            C1875q.this.f10664k.zy();
            if (!response.enable) {
                C1875q.this.f10664k.m7384h(C1873k.toq());
                return;
            }
            toq.C1874k c1874k = response.activity;
            if (c1874k == null || TextUtils.isEmpty(c1874k.link) || C1875q.this.ld6(response.activity.link)) {
                z2 = false;
            } else {
                C1873k c1873k = new C1873k();
                c1873k.f10655k = C1873k.f10652g;
                c1873k.f57852toq = 1;
                c1873k.f57853zy = response.activity.link;
                c1873k.f10656q = System.currentTimeMillis();
                C1875q.this.f10664k.m7384h(c1873k);
                z2 = true;
            }
            toq.C7910toq c7910toq = response.feedInfo;
            if (c7910toq != null && c7910toq.msgNum > 0) {
                C1873k c1873k2 = new C1873k();
                c1873k2.f10655k = C1873k.f10654y;
                toq.C7910toq c7910toq2 = response.feedInfo;
                c1873k2.f57852toq = c7910toq2.msgNum;
                c1873k2.f57853zy = c7910toq2.link;
                c1873k2.f10656q = c7910toq2.updateTime;
                C1875q.this.f10664k.m7384h(c1873k2);
                z2 = true;
            }
            toq.C7910toq c7910toq3 = response.postInfo;
            if (c7910toq3 != null && c7910toq3.msgNum > 0) {
                C1873k c1873k3 = new C1873k();
                c1873k3.f10655k = "post";
                toq.C7910toq c7910toq4 = response.postInfo;
                c1873k3.f57852toq = c7910toq4.msgNum;
                c1873k3.f57853zy = c7910toq4.link;
                c1873k3.f10656q = c7910toq4.updateTime;
                C1875q.this.f10664k.m7384h(c1873k3);
                z2 = true;
            }
            if (z2) {
                return;
            }
            C1875q.this.f10664k.m7384h(C1873k.toq());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.q$zy */
    /* JADX INFO: compiled from: ClockMessageManager.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private static C1875q f10669k = new C1875q(null);

        private zy() {
        }
    }

    /* synthetic */ C1875q(k kVar) {
        this();
    }

    @oc
    public static boolean a9(Context context, final f7l8.InterfaceC1805k communityCallback, boolean isHomePage) {
        if (!m7391g().t8r()) {
            return false;
        }
        if (isHomePage && !o1t()) {
            return false;
        }
        new ki.C6947k(context).m25047s(false).lrht(R.string.community_cta_dialog_title).fu4(R.string.community_cta_dialog_des).mcp(R.string.community_cta_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.clockmessage.toq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1875q.fn3e(communityCallback, dialogInterface, i2);
            }
        }).dd(R.string.community_cta_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.clockmessage.zy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1875q.zurt(communityCallback, dialogInterface, i2);
            }
        }).m25037g().show();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.hs6, null, ""));
        return true;
    }

    private static boolean cdj(@lvui C1873k message) {
        String str = message.f10655k;
        str.hashCode();
        switch (str) {
            case "activity":
                if (System.currentTimeMillis() - message.f10656q < 3600000) {
                    break;
                }
                break;
            case "feed":
            case "post":
                if (System.currentTimeMillis() - message.f10656q < 86400000) {
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void fn3e(f7l8.InterfaceC1805k interfaceC1805k, DialogInterface dialogInterface, int i2) {
        if (interfaceC1805k != null) {
            interfaceC1805k.mo6322k();
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.e10));
    }

    public static void fu4() {
        C1824r.m7203y().m7206p(f57862ni7, true).toq();
    }

    /* JADX INFO: renamed from: g */
    public static C1875q m7391g() {
        return zy.f10669k;
    }

    /* JADX INFO: renamed from: h */
    private boolean m7392h() {
        return C1824r.m7203y().zy(f57866zurt, true);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m7393i(C1873k message) {
        return System.currentTimeMillis() - message.f10656q >= 60000;
    }

    private void jk(String link) {
        if (TextUtils.isEmpty(link)) {
            return;
        }
        ch.zy zyVar = new ch.zy(f10659i);
        zyVar.putBoolean(link, true);
        zyVar.commit();
    }

    private void jp0y(String messageType) {
        kja0.m6641s("T_EXPOSE", f57857fn3e, this.f57869zy, messageType);
        C1708s.f7l8().ld6().cdj(C1706p.kja0(f57857fn3e, this.f57869zy, messageType));
    }

    private boolean ki() {
        return com.android.thememanager.clockmessage.model.zy.f57855zy.contains(this.f57869zy) && com.android.thememanager.clockmessage.model.zy.m7390k() && t8r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ld6(String link) {
        if (TextUtils.isEmpty(link)) {
            return false;
        }
        return new ch.zy(f10659i).getBoolean(link, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.android.thememanager.clockmessage.model.C1873k m7395n() {
        /*
            r4 = this;
            com.android.thememanager.clockmessage.db.k r0 = r4.f10664k
            com.android.thememanager.clockmessage.model.k r0 = r0.x2()
            boolean r1 = r4.f10663g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f57868toq
            boolean r1 = r1.getAndSet(r2)
            if (r1 == 0) goto L17
            goto L34
        L17:
            boolean r1 = cdj(r0)
            if (r1 != 0) goto L2f
            boolean r1 = r4.f57867f7l8
            if (r1 != 0) goto L28
            boolean r1 = r0.m7389k()
            if (r1 == 0) goto L28
            goto L2f
        L28:
            boolean r1 = m7393i(r0)
            if (r1 == 0) goto L39
            goto L38
        L2f:
            com.android.thememanager.clockmessage.model.k r0 = com.android.thememanager.clockmessage.model.C1873k.toq()
            goto L38
        L34:
            com.android.thememanager.clockmessage.model.k r0 = com.android.thememanager.clockmessage.model.C1873k.toq()
        L38:
            r2 = r3
        L39:
            if (r2 == 0) goto L3e
            r4.wvg()
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.clockmessage.C1875q.m7395n():com.android.thememanager.clockmessage.model.k");
    }

    public static boolean o1t() {
        return C1824r.m7203y().zy(f57862ni7, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r9
      0x0056: PHI (r9v3 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:22:0x0054, B:15:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @zy.dd
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m7396p(@zy.lvui java.lang.String r9, @zy.lvui java.lang.String r10) throws java.lang.Throwable {
        /*
            r0 = 0
            android.net.Uri r1 = miui.provider.ThemeRuntimeDataContract.CONTENT_URI     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r2 = 0
            r5[r2] = r10     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            android.content.Context r10 = bf2.toq.toq()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            android.content.ContentProviderClient r3 = r10.acquireUnstableContentProviderClient(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r3 == 0) goto L45
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r10.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = "content://com.android.thememanager.provider/"
            r10.append(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r10.append(r9)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            android.net.Uri r4 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r9 == 0) goto L46
            boolean r10 = r9.moveToNext()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5a
            if (r10 == 0) goto L46
            java.lang.String r10 = r9.getString(r2)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5a
            r9.close()
            return r10
        L43:
            r10 = move-exception
            goto L4d
        L45:
            r9 = r0
        L46:
            if (r9 == 0) goto L59
            goto L56
        L49:
            r10 = move-exception
            goto L5c
        L4b:
            r10 = move-exception
            r9 = r0
        L4d:
            java.lang.String r1 = "ClockMessageManager"
            java.lang.String r2 = "getRuntimeData happens error"
            android.util.Log.w(r1, r2, r10)     // Catch: java.lang.Throwable -> L5a
            if (r9 == 0) goto L59
        L56:
            r9.close()
        L59:
            return r0
        L5a:
            r10 = move-exception
            r0 = r9
        L5c:
            if (r0 == 0) goto L61
            r0.close()
        L61:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.clockmessage.C1875q.m7396p(java.lang.String, java.lang.String):java.lang.String");
    }

    private boolean qrj() {
        return TextUtils.equals(this.f10665n, this.f10666q);
    }

    private boolean t8r() {
        return C1781k.toq(bf2.toq.toq()) && this.f10663g && !this.f57867f7l8 && m7392h();
    }

    private void wvg() {
        if (!C1688q.cdj().wvg()) {
            C1688q.cdj().x9kr();
        }
        if (TextUtils.isEmpty(this.f57869zy)) {
            return;
        }
        InterfaceC1872k interfaceC1872k = (InterfaceC1872k) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(InterfaceC1872k.class);
        ((C1688q.cdj().wvg() && (this.f57867f7l8 || ki())) ? interfaceC1872k.toq(this.f57869zy, Boolean.TRUE) : interfaceC1872k.zy()).mo27954p(new toq());
    }

    /* JADX INFO: renamed from: y */
    public static String m7398y(String messageType) {
        return String.format(f57863qrj, messageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zurt(f7l8.InterfaceC1805k interfaceC1805k, DialogInterface dialogInterface, int i2) {
        if (interfaceC1805k != null) {
            interfaceC1805k.zy();
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.z8l));
    }

    public void d3(boolean isClockMessageTriggered, boolean isCommunityMessageTriggered) {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        this.f10663g = isClockMessageTriggered;
        this.f57867f7l8 = isCommunityMessageTriggered;
        if ("com.android.thememanager".equals(y9n.ki(bf2.toq.toq(), Process.myPid())) && y9n.gvn7(InterfaceC1789q.oct) && (contentProviderClientAcquireUnstableContentProviderClient = bf2.toq.toq().getContentResolver().acquireUnstableContentProviderClient(ClockMessageProvider.f10638n)) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(f57861n7h, this.f10663g);
            bundle.putBoolean(f57859kja0, this.f57867f7l8);
            try {
                contentProviderClientAcquireUnstableContentProviderClient.call(ClockMessageProvider.f10637g, null, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public C1873k f7l8(String messageType) {
        return this.f10664k.ld6(messageType);
    }

    public void fti(String messageType) {
        kja0.f7l8(f57857fn3e, this.f57869zy, messageType);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(f57857fn3e, this.f57869zy, messageType));
    }

    public void gvn7(boolean firstInit) {
        this.f57868toq.set(!firstInit);
        this.f57869zy = m7396p("theme", "online_id");
        this.f10666q = m7396p("theme", com.android.thememanager.util.y9n.f16911m);
        this.f10665n = m7396p(InterfaceC1789q.gun, com.android.thememanager.util.y9n.f16911m);
    }

    public boolean kja0() {
        return this.f10663g;
    }

    public void mcp(String id) {
        if (TextUtils.isEmpty(id)) {
            return;
        }
        ch.zy zyVar = new ch.zy(f57864t8r);
        zyVar.putBoolean(id, true);
        zyVar.apply();
    }

    public boolean n7h() {
        return C1781k.toq(bf2.toq.toq()) && qrj() && this.f10663g;
    }

    public void ni7() {
        this.f57867f7l8 = true;
        m7391g().d3(this.f10663g, true);
        C1824r.m7203y().m7206p(f57859kja0, true).toq();
    }

    /* JADX INFO: renamed from: s */
    public Cursor m7399s() {
        C1873k c1873kM7395n = m7395n();
        jp0y(c1873kM7395n.f10655k);
        return this.f10664k.m7385p(c1873kM7395n);
    }

    /* JADX INFO: renamed from: t */
    public void m7400t(boolean remind) {
        C1824r.m7203y().m7206p(f57866zurt, remind).toq();
    }

    public boolean x2(String id) {
        if (TextUtils.isEmpty(id)) {
            return false;
        }
        return new ch.zy(f57864t8r).getBoolean(id, false);
    }

    /* JADX INFO: renamed from: z */
    public void m7401z(C1873k message) {
        String str = message.f10655k;
        this.f10664k.m7386q(str);
        if (this.f10664k.x2() == null) {
            this.f10664k.m7384h(C1873k.toq());
        }
        if (C1873k.f10652g.equals(str)) {
            jk(message.f57853zy);
            return;
        }
        if (C1873k.f10654y.equals(str) || "post".equals(str)) {
            InterfaceC1872k interfaceC1872k = (InterfaceC1872k) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(InterfaceC1872k.class);
            if (TextUtils.isEmpty(this.f57869zy)) {
                return;
            }
            interfaceC1872k.m7388k(this.f57869zy, str.toUpperCase()).mo27954p(new k());
        }
    }

    private C1875q() {
        this.f57868toq = new AtomicBoolean(false);
        this.f10664k = C1871k.m7383y();
        this.f10663g = C1824r.m7203y().zy(f57861n7h, true);
        this.f57867f7l8 = C1824r.m7203y().zy(f57859kja0, false);
        gvn7(true);
    }
}
