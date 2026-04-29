package com.android.thememanager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.personalize.C2567p;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.etdu;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.t8iq;
import ek5k.C6002g;
import y9n.InterfaceC7782q;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeTaskReceiver extends BroadcastReceiver implements com.android.thememanager.basemodule.analysis.ld6, InterfaceC1789q {

    /* JADX INFO: renamed from: k */
    private static final String f14787k = "android.provision.action.PROVISION_START";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void toq() {
        d8wk.x2(etdu.f16412k);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        if (!"miui.intent.action.CLEAR_THEME_RUNTIME_DATA".equals(intent.getAction())) {
            if (f14787k.equals(intent.getAction())) {
                if (g1.m9737a()) {
                    ThemeSchedulerService.t8r(context);
                    return;
                }
                return;
            } else {
                if (ki.f14826q.equals(intent.getAction())) {
                    ki.zy(context, intent);
                    return;
                }
                return;
            }
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("drm_delete_path");
        o1t.jp0y();
        t8iq.m10000q(stringArrayExtra);
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.service.cdj
            @Override // java.lang.Runnable
            public final void run() {
                ThemeTaskReceiver.toq();
            }
        });
        if (C1807g.lvui()) {
            C2567p.m9074s(true);
            C2567p.m9074s(false);
        }
        String stringExtra = intent.getStringExtra("drm_result");
        String stringExtra2 = intent.getStringExtra("drm_version");
        if (p029m.zy.toq(stringExtra2)) {
            stringExtra2 = "v1";
        }
        com.android.thememanager.basemodule.analysis.kja0.m6641s(InterfaceC7782q.f100611zurt, "noPageId", "noTrackId", stringExtra);
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("hint", stringExtra);
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.te, stringExtra2);
        C1708s.f7l8().ld6().n5r1(InterfaceC7782q.f100611zurt, arrayMap);
        Log.w("ThemeTaskReceiver", "received action CLEAR_THEME_RUNTIME_DATA ,restore theme." + com.android.thememanager.basemodule.utils.kja0.m7110n(stringArrayExtra));
    }
}
