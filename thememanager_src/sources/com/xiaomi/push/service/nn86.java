package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.C5882m;
import com.xiaomi.push.f26p;
import com.xiaomi.push.lh;
import com.xiaomi.push.m8;
import com.xiaomi.push.ngy;
import com.xiaomi.push.nyj;
import com.xiaomi.push.qrj;
import com.xiaomi.push.wu;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nn86 {

    /* JADX INFO: renamed from: n */
    private static nn86 f33868n = new nn86();

    /* JADX INFO: renamed from: q */
    private static String f33869q;

    /* JADX INFO: renamed from: k */
    private List<AbstractC5930k> f33870k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ngy.C5884k f73651toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private qrj.toq f73652zy;

    /* JADX INFO: renamed from: com.xiaomi.push.service.nn86$k */
    public static abstract class AbstractC5930k {
        public void toq(ngy.C5884k c5884k) {
        }

        public void zy(lh.toq toqVar) {
        }
    }

    private nn86() {
    }

    public static synchronized String f7l8() {
        if (f33869q == null) {
            SharedPreferences sharedPreferences = wu.toq().getSharedPreferences("XMPushServiceConfig", 0);
            String string = sharedPreferences.getString("DeviceUUID", null);
            f33869q = string;
            if (string == null) {
                String strM21282y = m8.m21282y(wu.toq(), false);
                f33869q = strM21282y;
                if (strM21282y != null) {
                    sharedPreferences.edit().putString("DeviceUUID", f33869q).commit();
                }
            }
        }
        return f33869q;
    }

    /* JADX INFO: renamed from: g */
    public static nn86 m21710g() {
        return f33868n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m21711h() {
        try {
            if (this.f73651toq != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(wu.toq().openFileOutput("XMCloudCfg", 0));
                C5882m c5882mN7h = C5882m.n7h(bufferedOutputStream);
                this.f73651toq.mo20671n(c5882mN7h);
                c5882mN7h.cdj();
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("save config failure: " + e2.getMessage());
        }
    }

    private void kja0() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Exception e2;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(wu.toq().openFileInput("XMCloudCfg"));
                try {
                    this.f73651toq = ngy.C5884k.ki(com.xiaomi.push.jk.m21052g(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e3) {
                    e2 = e3;
                    com.xiaomi.channel.commonutils.logger.zy.kja0("load config failure: " + e2.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                f26p.toq(bufferedInputStream);
                throw th;
            }
        } catch (Exception e4) {
            bufferedInputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            f26p.toq(bufferedInputStream);
            throw th;
        }
        f26p.toq(bufferedInputStream);
        if (this.f73651toq == null) {
            this.f73651toq = new ngy.C5884k();
        }
    }

    private void n7h() {
        if (this.f73652zy != null) {
            return;
        }
        hb hbVar = new hb(this);
        this.f73652zy = hbVar;
        nyj.m21337k(hbVar);
    }

    private void qrj() throws Throwable {
        if (this.f73651toq == null) {
            kja0();
        }
    }

    /* JADX INFO: renamed from: k */
    int m21715k() throws Throwable {
        qrj();
        ngy.C5884k c5884k = this.f73651toq;
        if (c5884k != null) {
            return c5884k.fn3e();
        }
        return 0;
    }

    public synchronized void ld6(AbstractC5930k abstractC5930k) {
        this.f33870k.add(abstractC5930k);
    }

    /* JADX INFO: renamed from: p */
    void m21716p(lh.toq toqVar) {
        AbstractC5930k[] abstractC5930kArr;
        if (toqVar.fn3e() && toqVar.m21192i() > m21715k()) {
            n7h();
        }
        synchronized (this) {
            List<AbstractC5930k> list = this.f33870k;
            abstractC5930kArr = (AbstractC5930k[]) list.toArray(new AbstractC5930k[list.size()]);
        }
        for (AbstractC5930k abstractC5930k : abstractC5930kArr) {
            abstractC5930k.zy(toqVar);
        }
    }

    /* JADX INFO: renamed from: s */
    synchronized void m21717s() {
        this.f33870k.clear();
    }

    public ngy.C5884k zy() throws Throwable {
        qrj();
        return this.f73651toq;
    }
}
