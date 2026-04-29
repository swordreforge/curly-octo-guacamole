package com.android.thememanager.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.scorewall.C1797k;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeTrialReceiver extends BroadcastReceiver implements com.android.thememanager.basemodule.analysis.toq {
    /* JADX INFO: renamed from: k */
    private void m9601k(Context context) {
        context.startActivity(com.android.thememanager.basemodule.utils.x9kr.zy(C1797k.f10251q));
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.m6653p(com.android.thememanager.basemodule.analysis.toq.i8gn, com.android.thememanager.basemodule.analysis.toq.v1));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        if (action.equals(r8s8.f16775n)) {
            m9601k(context);
        }
    }
}
