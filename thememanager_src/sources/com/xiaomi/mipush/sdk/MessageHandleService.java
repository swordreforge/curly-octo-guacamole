package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.exoplayer2.yqrt;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.b9ub;
import com.xiaomi.push.e5;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class MessageHandleService extends toq {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<C5637k> f31302a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    private static ExecutorService f31303a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$k */
    public static class C5637k {

        /* JADX INFO: renamed from: k */
        private PushMessageReceiver f31304k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Intent f73119toq;

        public C5637k(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f31304k = pushMessageReceiver;
            this.f73119toq = intent;
        }

        /* JADX INFO: renamed from: k */
        public Intent m19361k() {
            return this.f73119toq;
        }

        public PushMessageReceiver toq() {
            return this.f31304k;
        }
    }

    public static void addJob(Context context, C5637k c5637k) {
        if (c5637k != null) {
            f31302a.add(c5637k);
            m19358b(context);
            startService(context);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m19358b(Context context) {
        if (f31303a.isShutdown()) {
            return;
        }
        f31303a.execute(new a98o(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m19359c(Context context) {
        try {
            m19357a(context, f31302a.poll());
        } catch (RuntimeException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        C5889p.toq(context).f7l8(new i1(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.toq, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.toq, android.app.Service
    public void onStart(Intent intent, int i2) {
        super.onStart(intent, i2);
    }

    /* JADX INFO: renamed from: a */
    protected static void m19356a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m19358b(context);
    }

    /* JADX INFO: renamed from: a */
    static void m19357a(Context context, C5637k c5637k) {
        String[] stringArrayExtra;
        if (c5637k == null) {
            return;
        }
        try {
            PushMessageReceiver qVar = c5637k.toq();
            Intent intentM19361k = c5637k.m19361k();
            int intExtra = intentM19361k.getIntExtra(zurt.f31448k, 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && zurt.f31452s.equals(intentM19361k.getStringExtra(zurt.f31453y)) && (stringArrayExtra = intentM19361k.getStringArrayExtra(zurt.f73200f7l8)) != null) {
                        com.xiaomi.channel.commonutils.logger.zy.a9("begin execute onRequirePermissions, lack of necessary permissions");
                        qVar.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) intentM19361k.getSerializableExtra(zurt.f73201ld6);
                com.xiaomi.channel.commonutils.logger.zy.a9("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                qVar.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), b9ub.COMMAND_REGISTER.f32725a)) {
                    qVar.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.m19368a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        uv6.fn3e(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.InterfaceC5638k qVar2 = jp0y.m19485n(context).toq(intentM19361k);
            int intExtra2 = intentM19361k.getIntExtra("eventMessageType", -1);
            if (qVar2 != null) {
                if (qVar2 instanceof MiPushMessage) {
                    MiPushMessage miPushMessage = (MiPushMessage) qVar2;
                    if (!miPushMessage.isArrivedMessage()) {
                        qVar.onReceiveMessage(context, miPushMessage);
                    }
                    if (miPushMessage.getPassThrough() == 1) {
                        e5.m20763k(context.getApplicationContext()).m20767q(context.getPackageName(), intentM19361k, yqrt.ERROR_CODE_IO_BAD_HTTP_STATUS, null);
                        com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                        qVar.onReceivePassThroughMessage(context, miPushMessage);
                        return;
                    }
                    if (miPushMessage.isNotified()) {
                        if (intExtra2 == 1000) {
                            e5.m20763k(context.getApplicationContext()).m20767q(context.getPackageName(), intentM19361k, 1007, null);
                        } else {
                            e5.m20763k(context.getApplicationContext()).m20767q(context.getPackageName(), intentM19361k, 3007, null);
                        }
                        com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
                        qVar.onNotificationMessageClicked(context, miPushMessage);
                        return;
                    }
                    com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                    qVar.onNotificationMessageArrived(context, miPushMessage);
                    return;
                }
                if (qVar2 instanceof MiPushCommandMessage) {
                    MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) qVar2;
                    com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                    qVar.onCommandResult(context, miPushCommandMessage2);
                    if (TextUtils.equals(miPushCommandMessage2.getCommand(), b9ub.COMMAND_REGISTER.f32725a)) {
                        qVar.onReceiveRegisterResult(context, miPushCommandMessage2);
                        PushMessageHandler.m19368a(context, miPushCommandMessage2);
                        if (miPushCommandMessage2.getResultCode() == 0) {
                            uv6.fn3e(context);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "unknown raw message: " + qVar2);
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.mcp("MessageHandleService", "no message from raw for receiver");
        } catch (RuntimeException e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("MessageHandleService", e2);
        }
    }

    @Override // com.xiaomi.mipush.sdk.toq
    /* JADX INFO: renamed from: a */
    protected boolean mo19360a() {
        ConcurrentLinkedQueue<C5637k> concurrentLinkedQueue = f31302a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }
}
