package com.android.thememanager.push;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.push.InterfaceC2316n;
import java.util.ArrayList;
import org.json.JSONArray;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemePushActionAD.java */
/* JADX INFO: loaded from: classes2.dex */
class toq extends C2315k {

    /* JADX INFO: renamed from: q */
    Intent f13521q;

    protected toq(C2319y pushMsg) {
        super(pushMsg);
        this.f13521q = null;
    }

    @Override // com.android.thememanager.push.C2315k
    /* JADX INFO: renamed from: q */
    protected Intent mo8469q() {
        return this.f13521q;
    }

    @Override // com.android.thememanager.push.C2315k
    protected void qrj() {
        Intent intent;
        Exception e2;
        String str;
        Intent intent2 = null;
        try {
            str = this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f13518k);
        } catch (Exception e3) {
            intent = null;
            e2 = e3;
        }
        if (InterfaceC2316n.k.f13508n.equals(str)) {
            String str2 = this.f60608toq.f60622x2.get(InterfaceC2316n.k.f13510s);
            Intent intent3 = new Intent("android.intent.action.VIEW");
            try {
                intent3.setData(Uri.parse(str2));
                intent2 = intent3;
            } catch (Exception e4) {
                e2 = e4;
                intent = intent3;
                e2.printStackTrace();
                intent2 = intent;
            }
            this.f13521q = intent2;
        }
        try {
        } catch (Exception e6) {
            e2 = e6;
        }
        if (InterfaceC2316n.k.f13507g.equals(str)) {
            String strM5744q = p001b.toq.m5744q(this.f60608toq.f60622x2.get(InterfaceC2316n.k.f13509p));
            fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(strM5744q);
            C1944y c1944y = new C1944y(fu4VarM10535g);
            JSONArray jSONArray = new JSONArray(this.f60608toq.f60622x2.get(InterfaceC1925p.ffiu));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(c1944y.qrj(jSONArray.getJSONObject(i2)));
            }
            String str3 = this.f60608toq.f60622x2.get(InterfaceC2316n.k.f60615ld6);
            intent = new Intent();
            intent.setClassName(fu4VarM10535g.getTabActivityPackage(), fu4VarM10535g.getTabActivityClass());
            intent.putExtra("REQUEST_RESOURCE_CODE", strM5744q);
            if (!arrayList.isEmpty()) {
                intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra(InterfaceC1357q.f53866eqxt, str3);
            }
        } else {
            if (!InterfaceC2316n.k.f60614f7l8.equals(str)) {
                if (InterfaceC2316n.k.f13511y.equals(str)) {
                    Intent intent4 = new Intent();
                    try {
                        intent4.addFlags(268468224);
                        intent4.setAction(ThemeResourceProxyTabActivity.bl);
                        intent4.setPackage(bf2.toq.toq().getPackageName());
                        intent2 = intent4;
                    } catch (Exception e7) {
                        e2 = e7;
                        intent = intent4;
                        e2.printStackTrace();
                        intent2 = intent;
                    }
                }
                this.f13521q = intent2;
            }
            String str4 = this.f60608toq.f60622x2.get(InterfaceC2316n.k.f60617x2);
            fu4 fu4VarM10535g2 = C2082k.zy().m8001n().m10535g("theme");
            String str5 = this.f60608toq.f60622x2.get(InterfaceC2316n.k.f60616qrj);
            intent = new Intent();
            intent.setClassName(fu4VarM10535g2.getWebActivityPackage(), fu4VarM10535g2.getWebActivityClass());
            intent.addFlags(67108864);
            intent.putExtra(InterfaceC1357q.f53885i1, str4);
            intent.putExtra(InterfaceC1357q.f53866eqxt, str5);
        }
        intent2 = intent;
        this.f13521q = intent2;
    }
}
