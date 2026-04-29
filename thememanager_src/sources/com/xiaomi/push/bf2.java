package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.y2;

/* JADX INFO: loaded from: classes3.dex */
public class bf2 {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static volatile bf2 f73267qrj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f73268f7l8;

    /* JADX INFO: renamed from: g */
    private String f32727g;

    /* JADX INFO: renamed from: n */
    private Context f32729n;

    /* JADX INFO: renamed from: s */
    private xwq3 f32732s;

    /* JADX INFO: renamed from: y */
    private dr f32733y;

    /* JADX INFO: renamed from: k */
    private final String f32728k = "push_stat_sp";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f73270toq = "upload_time";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f73272zy = "delete_time";

    /* JADX INFO: renamed from: q */
    private final String f32731q = "check_time";

    /* JADX INFO: renamed from: p */
    private C5889p.k f32730p = new i1(this);

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private C5889p.k f73269ld6 = new a98o(this);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private C5889p.k f73271x2 = new C5850a(this);

    private bf2(Context context) {
        this.f32729n = context;
    }

    private boolean ld6() {
        return com.xiaomi.push.service.a9.m21550q(this.f32729n).qrj(oph.StatDataSwitch.m21370a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n7h() {
        return this.f32729n.getDatabasePath(zp.f34297k).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj(String str) {
        SharedPreferences.Editor editorEdit = this.f32729n.getSharedPreferences("push_stat_sp", 0).edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        l7o.m21152k(editorEdit);
    }

    public static bf2 toq(Context context) {
        if (f73267qrj == null) {
            synchronized (bf2.class) {
                if (f73267qrj == null) {
                    f73267qrj = new bf2(context);
                }
            }
        }
        return f73267qrj;
    }

    public void f7l8(y2.AbstractRunnableC5962k abstractRunnableC5962k) {
        y2.toq(this.f32729n).m22038g(abstractRunnableC5962k);
    }

    /* JADX INFO: renamed from: p */
    public void m20646p(String str, String str2, Boolean bool) {
        if (this.f32733y != null) {
            if (bool.booleanValue()) {
                this.f32733y.toq(this.f32729n, str2, str);
            } else {
                this.f32733y.m20727k(this.f32729n, str2, str);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public String m20647q() {
        return this.f32727g;
    }

    /* JADX INFO: renamed from: s */
    public void m20648s(String str) {
        if (ld6() && !TextUtils.isEmpty(str)) {
            m20649y(C5951v.m21889k(this.f32729n, str));
        }
    }

    public String x2() {
        return this.f73268f7l8;
    }

    /* JADX INFO: renamed from: y */
    public void m20649y(kl7m kl7mVar) {
        if (ld6() && com.xiaomi.push.service.ek5k.m21577g(kl7mVar.m21130e())) {
            f7l8(t8iq.ld6(this.f32729n, n7h(), kl7mVar));
        }
    }
}
