package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.cdj;
import com.xiaomi.push.b9ub;
import com.xiaomi.push.e5;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.qla;
import com.xiaomi.push.wu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class PushMessageHandler extends toq {

    /* JADX INFO: renamed from: a */
    private static List<cdj.toq> f31307a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static List<cdj.zy> f31309b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f31308a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$k */
    interface InterfaceC5638k extends Serializable {
    }

    /* JADX INFO: renamed from: a */
    public static void m19365a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageHandler", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    protected static void m19376b() {
        synchronized (f31307a) {
            f31307a.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m19381c(Context context, Intent intent) {
        if (intent != null && !f31308a.isShutdown()) {
            f31308a.execute(new fti(context, intent));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("-->scheduleJob() fail, case");
        sb.append(intent == null ? "0" : "1");
        com.xiaomi.channel.commonutils.logger.zy.mcp("PushMessageHandler", sb.toString());
    }

    @Override // com.xiaomi.mipush.sdk.toq, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.toq, android.app.Service
    public void onStart(Intent intent, int i2) {
        super.onStart(intent, i2);
        m19381c(getApplicationContext(), intent);
    }

    /* JADX INFO: renamed from: b */
    protected static void m19378b(Context context, Intent intent) {
        boolean booleanExtra;
        try {
            booleanExtra = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageHandler", "intent unparcel error:" + th);
            booleanExtra = false;
        }
        try {
            com.xiaomi.channel.commonutils.logger.zy.ki("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                kl7m kl7mVar = new kl7m();
                qla.m21399n(kl7mVar, intent.getByteArrayExtra("mipush_payload"));
                com.xiaomi.channel.commonutils.logger.zy.o1t("PushMessageHandler", "PushMessageHandler.onHandleIntent " + kl7mVar.m21127d());
                C5652i.toq(context, kl7mVar);
            } else if (1 == zurt.m19585q(context)) {
                if (m19380b()) {
                    com.xiaomi.channel.commonutils.logger.zy.m19294i("PushMessageHandler", "receive a message before application calling initialize");
                    if (booleanExtra) {
                        m19377b(context);
                        return;
                    }
                    return;
                }
                InterfaceC5638k qVar = jp0y.m19485n(context).toq(intent);
                if (qVar != null) {
                    m19370a(context, qVar);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    ResolveInfo resolveInfo = null;
                    if (listQueryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo next = it.next();
                            ActivityInfo activityInfo = next.activityInfo;
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(wu.zy(context, next.activityInfo.name))) {
                                resolveInfo = next;
                                break;
                            }
                        }
                    }
                    if (resolveInfo != null) {
                        m19367a(context, intent2, resolveInfo, booleanExtra);
                    } else {
                        com.xiaomi.channel.commonutils.logger.zy.m19294i("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                        e5.m20763k(context).m20765n(context.getPackageName(), intent, "11");
                    }
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.zy.cdj("PushMessageHandler", e2);
                    e5.m20763k(context).m20765n(context.getPackageName(), intent, "9");
                }
            }
            if (!booleanExtra) {
            }
        } catch (Throwable th2) {
            try {
                com.xiaomi.channel.commonutils.logger.zy.cdj("PushMessageHandler", th2);
                e5.m20763k(context).m20765n(context.getPackageName(), intent, InterfaceC1925p.jvci);
            } finally {
                if (booleanExtra) {
                    m19377b(context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19366a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.zy.o1t("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            m19381c(context, intent);
            m19365a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m19374a(cdj.zy zyVar) {
        synchronized (f31309b) {
            if (!f31309b.contains(zyVar)) {
                f31309b.add(zyVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m19373a(cdj.toq toqVar) {
        synchronized (f31307a) {
            if (!f31307a.contains(toqVar)) {
                f31307a.add(toqVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m19363a() {
        synchronized (f31309b) {
            f31309b.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m19367a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z2) {
        try {
            MessageHandleService.C5637k c5637k = new MessageHandleService.C5637k(intent, (PushMessageReceiver) wu.zy(context, resolveInfo.activityInfo.name).newInstance());
            if (z2) {
                MessageHandleService.m19357a(context.getApplicationContext(), c5637k);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), c5637k);
            }
            MessageHandleService.m19356a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(th);
        }
    }

    @Override // com.xiaomi.mipush.sdk.toq
    /* JADX INFO: renamed from: a */
    protected boolean mo19360a() {
        ThreadPoolExecutor threadPoolExecutor = f31308a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f31308a.getQueue().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static void m19370a(Context context, InterfaceC5638k interfaceC5638k) {
        if (interfaceC5638k instanceof MiPushMessage) {
            m19369a(context, (MiPushMessage) interfaceC5638k);
            return;
        }
        if (interfaceC5638k instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) interfaceC5638k;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (b9ub.COMMAND_REGISTER.f32725a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m19364a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (!b9ub.COMMAND_SET_ALIAS.f32725a.equals(command) && !b9ub.COMMAND_UNSET_ALIAS.f32725a.equals(command) && !b9ub.COMMAND_SET_ACCEPT_TIME.f32725a.equals(command)) {
                if (b9ub.COMMAND_SUBSCRIBE_TOPIC.f32725a.equals(command)) {
                    List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                        str = commandArguments2.get(0);
                    }
                    m19371a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                if (b9ub.COMMAND_UNSUBSCRIBE_TOPIC.f32725a.equals(command)) {
                    List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                        str = commandArguments3.get(0);
                    }
                    m19379b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                return;
            }
            m19372a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m19377b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, n5r1.m19528k(context));
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageHandler", "callback sync error" + e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19380b() {
        return f31309b.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    protected static void m19379b(Context context, String str, long j2, String str2, String str3) {
        synchronized (f31309b) {
            for (cdj.zy zyVar : f31309b) {
                if (m19375a(str, zyVar.m19413k())) {
                    zyVar.f7l8(j2, str2, str3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19369a(Context context, MiPushMessage miPushMessage) {
        synchronized (f31309b) {
            for (cdj.zy zyVar : f31309b) {
                if (m19375a(miPushMessage.getCategory(), zyVar.m19413k())) {
                    zyVar.m19414n(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    zyVar.m19415q(miPushMessage);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19364a(long j2, String str, String str2) {
        synchronized (f31309b) {
            Iterator<cdj.zy> it = f31309b.iterator();
            while (it.hasNext()) {
                it.next().zy(j2, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m19371a(Context context, String str, long j2, String str2, String str3) {
        synchronized (f31309b) {
            for (cdj.zy zyVar : f31309b) {
                if (m19375a(str, zyVar.m19413k())) {
                    zyVar.m19412g(j2, str2, str3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m19372a(Context context, String str, String str2, long j2, String str3, List<String> list) {
        synchronized (f31309b) {
            for (cdj.zy zyVar : f31309b) {
                if (m19375a(str, zyVar.m19413k())) {
                    zyVar.toq(str2, j2, str3, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m19375a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: a */
    protected static void m19368a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f31307a) {
            for (cdj.toq toqVar : f31307a) {
                if (toqVar instanceof cdj.InterfaceC5644n) {
                    cdj.C5645q c5645q = new cdj.C5645q();
                    if (miPushCommandMessage != null && miPushCommandMessage.getCommandArguments() != null && miPushCommandMessage.getCommandArguments().size() > 0) {
                        c5645q.zy(miPushCommandMessage.getResultCode());
                        c5645q.m19411q(miPushCommandMessage.getCommandArguments().get(0));
                    }
                    toqVar.onResult(c5645q);
                }
            }
        }
    }
}
