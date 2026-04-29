package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.market.sdk.utils.C5019y;
import com.xiaomi.push.bih;
import com.xiaomi.push.i3x9;
import com.xiaomi.push.imd;
import com.xiaomi.push.kiv;
import com.xiaomi.push.kx3;
import com.xiaomi.push.lh;
import com.xiaomi.push.ngy;
import com.xiaomi.push.service.nn86;
import com.xiaomi.push.tfm;
import com.xiaomi.push.wu;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class x9kr extends nn86.AbstractC5930k implements tfm.InterfaceC5948k {

    /* JADX INFO: renamed from: k */
    private XMPushService f33930k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73678toq;

    /* JADX INFO: renamed from: com.xiaomi.push.service.x9kr$k */
    static class C5944k implements tfm.toq {
        C5944k() {
        }

        @Override // com.xiaomi.push.tfm.toq
        /* JADX INFO: renamed from: a */
        public String mo21800a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter(C5019y.f69023cdj, i3x9.toq(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(wu.m21967k()));
            String string = builderBuildUpon.toString();
            com.xiaomi.channel.commonutils.logger.zy.m19300t("fetch bucket from : " + string);
            URL url = new URL(string);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strLd6 = com.xiaomi.push.oc.ld6(wu.toq(), url);
                bih.f7l8(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - jCurrentTimeMillis), null);
                return strLd6;
            } catch (IOException e2) {
                bih.f7l8(url.getHost() + ":" + port, -1, e2);
                throw e2;
            }
        }
    }

    static class toq extends com.xiaomi.push.tfm {
        protected toq(Context context, com.xiaomi.push.qo qoVar, tfm.toq toqVar, String str) {
            super(context, qoVar, toqVar, str);
        }

        @Override // com.xiaomi.push.tfm
        /* JADX INFO: renamed from: g */
        protected String mo21801g(ArrayList<String> arrayList, String str, String str2, boolean z2) throws IOException {
            try {
                if (kiv.m21078g().ld6()) {
                    str2 = nn86.f7l8();
                }
                return super.mo21801g(arrayList, str, str2, z2);
            } catch (IOException e2) {
                bih.m20654q(0, kx3.GSLB_ERR.m21148a(), 1, null, com.xiaomi.push.oc.ni7(com.xiaomi.push.tfm.f33966p) ? 1 : 0);
                throw e2;
            }
        }
    }

    x9kr(XMPushService xMPushService) {
        this.f33930k = xMPushService;
    }

    /* JADX INFO: renamed from: q */
    public static void m21798q(XMPushService xMPushService) {
        x9kr x9krVar = new x9kr(xMPushService);
        nn86.m21710g().ld6(x9krVar);
        synchronized (com.xiaomi.push.tfm.class) {
            com.xiaomi.push.tfm.ld6(x9krVar);
            com.xiaomi.push.tfm.m21847p(xMPushService, null, new C5944k(), "0", com.android.thememanager.basemodule.analysis.toq.wwr9, "2.2");
        }
    }

    @Override // com.xiaomi.push.tfm.InterfaceC5948k
    /* JADX INFO: renamed from: k */
    public com.xiaomi.push.tfm mo21799k(Context context, com.xiaomi.push.qo qoVar, tfm.toq toqVar, String str) {
        return new toq(context, qoVar, toqVar, str);
    }

    @Override // com.xiaomi.push.service.nn86.AbstractC5930k
    public void toq(ngy.C5884k c5884k) {
    }

    @Override // com.xiaomi.push.service.nn86.AbstractC5930k
    public void zy(lh.toq toqVar) {
        com.xiaomi.push.mu muVarCdj;
        if (toqVar.m21191h() && toqVar.n7h() && System.currentTimeMillis() - this.f73678toq > 3600000) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("fetch bucket :" + toqVar.n7h());
            this.f73678toq = System.currentTimeMillis();
            com.xiaomi.push.tfm tfmVarZy = com.xiaomi.push.tfm.zy();
            tfmVarZy.m21851s();
            tfmVarZy.t8r();
            imd imdVarM21523a = this.f33930k.m21523a();
            if (imdVarM21523a == null || (muVarCdj = tfmVarZy.cdj(imdVarM21523a.zy().cdj())) == null) {
                return;
            }
            ArrayList<String> arrayListZy = muVarCdj.zy();
            boolean z2 = true;
            Iterator<String> it = arrayListZy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().equals(imdVarM21523a.mo20666q())) {
                    z2 = false;
                    break;
                }
            }
            if (!z2 || arrayListZy.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("bucket changed, force reconnect");
            this.f33930k.m21527a(0, (Exception) null);
            this.f33930k.m21535a(false);
        }
    }
}
