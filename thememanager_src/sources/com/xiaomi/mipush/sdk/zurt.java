package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ge;
import com.xiaomi.push.rf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f73200f7l8 = "error_message";

    /* JADX INFO: renamed from: g */
    public static final int f31447g = 5;

    /* JADX INFO: renamed from: k */
    public static final String f31448k = "message_type";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f73201ld6 = "key_command";

    /* JADX INFO: renamed from: n */
    public static final int f31449n = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static int f73202n7h = 0;

    /* JADX INFO: renamed from: p */
    public static final String f31450p = "key_message";

    /* JADX INFO: renamed from: q */
    public static final int f31451q = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f73203qrj = 2;

    /* JADX INFO: renamed from: s */
    public static final String f31452s = "error_lack_of_permission";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f73204toq = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f73205x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final String f31453y = "error_type";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f73206zy = 2;

    public static void f7l8(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(f31448k, 3);
        intent.putExtra(f73201ld6, miPushCommandMessage);
        new ni7().onReceive(context, intent);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m19582g(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return m19584n(context, intent);
    }

    /* JADX INFO: renamed from: k */
    public static MiPushCommandMessage m19583k(String str, List<String> list, long j2, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j2);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m19584n(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (listQueryBroadcastReceivers != null) {
                if (!listQueryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m19585q(Context context) {
        if (f73202n7h == 0) {
            if (m19582g(context)) {
                m19586s(1);
            } else {
                m19586s(2);
            }
        }
        return f73202n7h;
    }

    /* JADX INFO: renamed from: s */
    private static void m19586s(int i2) {
        f73202n7h = i2;
    }

    public static MiPushMessage toq(rf rfVar, ge geVar, boolean z2) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(rfVar.m21432a());
        if (!TextUtils.isEmpty(rfVar.m21441d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(rfVar.m21441d());
        } else if (!TextUtils.isEmpty(rfVar.m21439c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(rfVar.m21439c());
        } else if (TextUtils.isEmpty(rfVar.m21445f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(rfVar.m21445f());
        }
        miPushMessage.setCategory(rfVar.m21443e());
        if (rfVar.m21431a() != null) {
            miPushMessage.setContent(rfVar.m21431a().m21033c());
        }
        if (geVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(geVar.m20906a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(geVar.m20916b());
            }
            miPushMessage.setDescription(geVar.m20928d());
            miPushMessage.setTitle(geVar.m20924c());
            miPushMessage.setNotifyType(geVar.m20899a());
            miPushMessage.setNotifyId(geVar.m20921c());
            miPushMessage.setPassThrough(geVar.m20913b());
            miPushMessage.setExtra(geVar.m20907a());
        }
        miPushMessage.setNotified(z2);
        return miPushMessage;
    }

    /* JADX INFO: renamed from: y */
    public static void m19587y(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(f31448k, 4);
        new ni7().onReceive(context, intent);
    }

    public static ge zy(MiPushMessage miPushMessage) {
        ge geVar = new ge();
        geVar.m20904a(miPushMessage.getMessageId());
        geVar.m20915b(miPushMessage.getTopic());
        geVar.m20927d(miPushMessage.getDescription());
        geVar.m20923c(miPushMessage.getTitle());
        geVar.m20922c(miPushMessage.getNotifyId());
        geVar.m20903a(miPushMessage.getNotifyType());
        geVar.m20914b(miPushMessage.getPassThrough());
        geVar.m20905a(miPushMessage.getExtra());
        return geVar;
    }
}
