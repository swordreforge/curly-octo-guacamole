package com.android.thememanager.util;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ResourceTrialDialogActivity;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.scorewall.C1797k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.service.ThemeSchedulerService;
import java.io.File;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemeTrialManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class r8s8 implements InterfaceC1357q, InterfaceC1789q {

    /* JADX INFO: renamed from: c */
    private static final String f16767c = "thememanager";

    /* JADX INFO: renamed from: e */
    protected static final int f16768e = 1;

    /* JADX INFO: renamed from: f */
    private static final String f16769f = "thememanager";

    /* JADX INFO: renamed from: g */
    public static final String f16770g = "key_trial_check_box";

    /* JADX INFO: renamed from: h */
    public static final String f16771h = "subTitle";

    /* JADX INFO: renamed from: i */
    public static final String f16772i = "iconId";

    /* JADX INFO: renamed from: j */
    protected static final int f16773j = 2;

    /* JADX INFO: renamed from: l */
    private static final String f16774l = "ThemeTrialManager";

    /* JADX INFO: renamed from: n */
    public static final String f16775n = "com.android.thememanager.action.GET_MIBI";

    /* JADX INFO: renamed from: p */
    public static final String f16776p = "title";

    /* JADX INFO: renamed from: r */
    public static final long f16777r = 10800000;

    /* JADX INFO: renamed from: s */
    public static final String f16778s = "resCode";

    /* JADX INFO: renamed from: t */
    public static final long f16779t = 21600000;

    /* JADX INFO: renamed from: y */
    public static final String f16780y = "resLocalId";

    /* JADX INFO: renamed from: z */
    public static final long f16781z = 43200000;

    /* JADX INFO: renamed from: k */
    protected Context f16782k = C2082k.zy().toq();

    /* JADX INFO: renamed from: q */
    protected String f16783q;

    private static void f7l8(Context context, Notification.Builder builder) {
        if (C1797k.toq().m6983n()) {
            Intent intent = new Intent(context, (Class<?>) ThemeTrialReceiver.class);
            intent.setAction(f16775n);
            builder.addAction(m9974n(), context.getString(R.string.resource_trial_end_get_mibi), PendingIntent.getBroadcast(context, 2, intent, 201326592));
        }
    }

    /* JADX INFO: renamed from: n */
    protected static int m9974n() {
        return R.drawable.notification_small_icon;
    }

    /* JADX INFO: renamed from: q */
    public static Intent m9975q(String localId, boolean purchase) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(335544320);
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + localId));
        if (purchase) {
            intent.putExtra(InterfaceC1357q.f53906lvui, purchase);
        }
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
            intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.module.detail.view.ThemeDetailActivity"));
        }
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public String m9976g() {
        return this.f16783q;
    }

    /* JADX INFO: renamed from: k */
    public void m9977k(Context context) {
        ((NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).cancel(2);
    }

    public void ld6() {
        this.f16783q = null;
    }

    public void n7h(com.android.thememanager.fu4 resContext, Resource resource, long trialEndTime) {
        String strM6948y = C1792n.m6948y(resource);
        if ("miwallpaper".equals(resContext.getResourceCode()) || "fonts".equals(resContext.getResourceCode())) {
            strM6948y = resource.getLocalId();
        }
        toq();
        qrj(resContext, resource, strM6948y, trialEndTime);
        x2(this.f16782k, resource.getTitle(), strM6948y, resContext.getResourceCode());
        this.f16783q = strM6948y;
    }

    /* JADX INFO: renamed from: p */
    public void m9978p(String resRightPath) {
        if (resRightPath == null) {
            Log.w(f16774l, "trial rights file path is null");
        } else {
            new File(resRightPath).delete();
        }
    }

    public void qrj(com.android.thememanager.fu4 resContext, Resource resource, String localId, long trialEndTime) {
        Intent intent = new Intent(this.f16782k, (Class<?>) ResourceTrialDialogActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        intent.putExtra(InterfaceC1357q.f53909m4, resource.getTitle());
        intent.putExtra(InterfaceC1357q.f53950v0af, localId);
        intent.putExtra(InterfaceC1357q.f53867etdu, new ResourceResolver(resource, resContext).getRightsPath());
        ((AlarmManager) this.f16782k.getSystemService("alarm")).setExact(1, trialEndTime, PendingIntent.getActivity(this.f16782k, 1, intent, 201326592));
    }

    /* JADX INFO: renamed from: s */
    protected void mo9979s(com.android.thememanager.fu4 resContext, String resTitle, String resBuddleLocalId, String resRightPath) {
        m9978p(resRightPath);
        x2(this.f16782k, resTitle, resBuddleLocalId, resContext.getResourceCode());
        Intent intentM9975q = m9975q(resBuddleLocalId, true);
        intentM9975q.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        this.f16782k.startActivity(intentM9975q);
    }

    public void toq() {
        Intent intent = new Intent(this.f16782k, (Class<?>) ResourceTrialDialogActivity.class);
        PendingIntent activity = PendingIntent.getActivity(this.f16782k, 1, intent, 201326592);
        AlarmManager alarmManager = (AlarmManager) this.f16782k.getSystemService("alarm");
        alarmManager.cancel(activity);
        alarmManager.cancel(PendingIntent.getService(this.f16782k, 2, intent, 201326592));
        ThemeSchedulerService.f7l8();
    }

    public void x2(Context context, String resTitle, String resBuddleLocalId, String resourceCode) {
        int iM9974n = m9974n();
        Bundle bundle = new Bundle();
        bundle.putBoolean(yz.hp, true);
        Notification.Builder extras = new Notification.Builder(context).setOngoing(true).setSmallIcon(iM9974n).setContentTitle(context.getString(R.string.local_notification_font_trial_title)).setContentText(context.getString(R.string.resource_on_trial, resTitle)).setExtras(bundle);
        Intent intentM9975q = m9975q(resBuddleLocalId, false);
        intentM9975q.putExtra("REQUEST_RESOURCE_CODE", resourceCode);
        extras.setContentIntent(PendingIntent.getActivity(context, 0, intentM9975q, 201326592));
        Intent intentM9975q2 = m9975q(resBuddleLocalId, true);
        intentM9975q2.putExtra("REQUEST_RESOURCE_CODE", resourceCode);
        extras.addAction(iM9974n, this.f16782k.getString("fonts".equals(resourceCode) ? R.string.font_trial_end_purchase : R.string.resource_trial_end_purchase), PendingIntent.getActivity(context, 1, intentM9975q2, 201326592));
        com.android.thememanager.basemodule.utils.jk.m7104n(context, 2, extras);
    }

    /* JADX INFO: renamed from: y */
    protected void mo9980y(com.android.thememanager.fu4 resContext, String resTitle, String resBuddleLocalId, String resRightPath) {
        m9978p(resRightPath);
        Resource resourceLd6 = new com.android.thememanager.controller.x2(resContext).m7690k().ld6();
        Intent intentM9975q = m9975q((resourceLd6 == null || TextUtils.isEmpty(resourceLd6.getLocalId())) ? "0" : resourceLd6.getLocalId(), false);
        intentM9975q.putExtra(InterfaceC1357q.f53963x9kr, true);
        intentM9975q.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
        this.f16782k.startActivity(intentM9975q);
    }

    public void zy(com.android.thememanager.fu4 resContext, String resTitle, String resBuddleLocalId, String resRightPath, boolean purchase) {
        if (purchase) {
            mo9979s(resContext, resTitle, resBuddleLocalId, resRightPath);
        } else {
            mo9980y(resContext, resTitle, resBuddleLocalId, resRightPath);
        }
    }
}
