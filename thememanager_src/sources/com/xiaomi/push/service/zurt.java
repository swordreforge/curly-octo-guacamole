package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.ge;
import com.xiaomi.push.nc;
import com.xiaomi.push.uf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class zurt {

    /* JADX INFO: renamed from: k */
    private static final boolean f33943k = Log.isLoggable("NCHelper", 3);

    private static void f7l8(Context context, List<String> list) {
        if (f33943k) {
            m21815p("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = zy(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public static void m21812g(Context context, String str) {
        if (!nc.m21313p(context) || TextUtils.isEmpty(str)) {
            return;
        }
        n7h(context, str);
        qkj8.f7l8(context, str);
    }

    /* JADX INFO: renamed from: k */
    private static int m21813k(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) C5892r.n7h(notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f33943k) {
                m21815p("isUserLockedChannel:" + iIntValue + " " + notificationChannel);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("NCHelper", "is user locked error" + e2);
        }
        return iIntValue;
    }

    @TargetApi(26)
    private static boolean ld6(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z2;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z3 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z2 = false;
        } else {
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:getName");
            }
            z2 = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:getDescription");
            }
            z2 = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z2 = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:enableVibration");
            }
            z2 = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:enableLights");
            }
            z2 = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (f33943k) {
                m21815p("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z3 = z2;
        }
        if (f33943k) {
            m21815p("appHack channelConfigLowerCompare:isDifferent:" + z3);
        }
        return z3;
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    /* JADX INFO: renamed from: n */
    static void m21814n(Context context, wvg wvgVar, NotificationChannel notificationChannel, int i2, String str) {
        if (i2 <= 0) {
            wvgVar.kja0(notificationChannel);
            return;
        }
        int iZy = uf.m21860k(context) >= 2 ? qkj8.zy(context.getPackageName(), str) : 0;
        NotificationChannel qVar = toq(notificationChannel.getId(), notificationChannel);
        if ((i2 & 32) != 0) {
            if (notificationChannel.getSound() != null) {
                qVar.setSound(null, null);
            } else {
                qVar.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if ((i2 & 16) != 0) {
            if (notificationChannel.shouldVibrate()) {
                qVar.enableVibration(false);
            } else {
                qVar.enableVibration(true);
            }
        }
        if ((i2 & 8) != 0) {
            if (notificationChannel.shouldShowLights()) {
                qVar.enableLights(false);
            } else {
                qVar.enableLights(true);
            }
        }
        if ((i2 & 4) != 0) {
            int importance = notificationChannel.getImportance() - 1;
            if (importance <= 0) {
                importance = 2;
            }
            qVar.setImportance(importance);
        }
        if ((i2 & 2) != 0) {
            qVar.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
        }
        wvgVar.kja0(qVar);
        wvgVar.m21786h(notificationChannel, true);
        qkj8.qrj(wvgVar.m21789y(), notificationChannel.getId(), iZy, 0);
    }

    private static void n7h(Context context, String str) {
        try {
            wvg wvgVarM21784n = wvg.m21784n(context, str);
            Set<String> setKeySet = zy(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (wvgVarM21784n.fn3e(str2)) {
                    arrayList.add(str2);
                    if (f33943k) {
                        m21815p("delete channel copy record:" + str2);
                    }
                }
            }
            f7l8(context, arrayList);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m21815p(String str) {
        com.xiaomi.channel.commonutils.logger.zy.m19293h("NCHelper", str);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: q */
    public static String m21816q(wvg wvgVar, String str, CharSequence charSequence, String str2, int i2, int i3, String str3, String str4) {
        String strM21788s = wvgVar.m21788s(str);
        boolean z2 = f33943k;
        if (z2) {
            m21815p("createChannel: appChannelId:" + strM21788s + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i2 + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i3 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(strM21788s, charSequence, i3);
        notificationChannel.setDescription(str2);
        notificationChannel.enableVibration((i2 & 2) != 0);
        notificationChannel.enableLights((i2 & 4) != 0);
        if ((i2 & 1) == 0) {
            notificationChannel.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith(com.android.thememanager.basemodule.resource.constants.toq.hze4 + wvgVar.m21789y())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z2) {
            m21815p("create channel:" + notificationChannel);
        }
        m21817s(wvgVar, notificationChannel, str4);
        return strM21788s;
    }

    private static void qrj(Context context, String str) {
        if (f33943k) {
            m21815p("recordCopiedChannel:" + str);
        }
        zy(context).edit().putBoolean(str, true).apply();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: s */
    private static void m21817s(wvg wvgVar, NotificationChannel notificationChannel, String str) {
        int i2;
        char c2;
        int iM21813k;
        Context contextM21787q = wvgVar.m21787q();
        String id = notificationChannel.getId();
        String strM21785p = wvg.m21785p(id, wvgVar.m21789y());
        boolean z2 = f33943k;
        if (z2) {
            m21815p("appChannelId:" + id + " oldChannelId:" + strM21785p);
        }
        if (!nc.m21313p(contextM21787q) || TextUtils.equals(id, strM21785p)) {
            NotificationChannel qVar = wvgVar.toq(id);
            if (z2) {
                m21815p("elseLogic getNotificationChannel:" + qVar);
            }
            if (qVar == null) {
                wvgVar.kja0(notificationChannel);
            }
            i2 = 0;
            c2 = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) contextM21787q.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strM21785p);
            NotificationChannel qVar2 = wvgVar.toq(id);
            if (z2) {
                m21815p("xmsfChannel:" + notificationChannel2);
                m21815p("appChannel:" + qVar2);
            }
            if (notificationChannel2 != null) {
                NotificationChannel qVar3 = toq(id, notificationChannel2);
                if (z2) {
                    m21815p("copyXmsf copyXmsfChannel:" + qVar3);
                }
                if (qVar2 != null) {
                    iM21813k = m21813k(qVar2);
                    wvgVar.m21786h(qVar3, iM21813k == 0);
                    c2 = 3;
                } else {
                    iM21813k = m21813k(notificationChannel2);
                    m21814n(contextM21787q, wvgVar, qVar3, iM21813k, notificationChannel2.getId());
                    c2 = 4;
                }
                qrj(contextM21787q, id);
                notificationManager.deleteNotificationChannel(strM21785p);
            } else if (qVar2 == null) {
                if (z2) {
                    m21815p("appHack createNotificationChannel:" + notificationChannel);
                }
                wvgVar.kja0(notificationChannel);
                c2 = 1;
                iM21813k = 0;
            } else if (x2(contextM21787q, id) || !ld6(notificationChannel, qVar2)) {
                iM21813k = 0;
                c2 = 0;
            } else {
                if (z2) {
                    m21815p("appHack updateNotificationChannel:" + notificationChannel);
                }
                iM21813k = m21813k(qVar2);
                wvgVar.m21786h(notificationChannel, iM21813k == 0);
                c2 = 2;
            }
            i2 = iM21813k;
        }
        qkj8.m21745y(wvgVar.m21787q(), wvgVar.m21789y(), id, notificationChannel.getImportance(), str, c2 == 1 || c2 == 4 || c2 == 3, i2);
    }

    @TargetApi(26)
    private static NotificationChannel toq(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    private static boolean x2(Context context, String str) {
        if (f33943k) {
            m21815p("checkCopeidChannel:newFullChannelId:" + str + "  " + zy(context).getBoolean(str, false));
        }
        return zy(context).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: y */
    static void m21818y(ge geVar) {
        Map<String, String> map;
        if (geVar == null || (map = geVar.f32983a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        geVar.f32979a = 0;
        geVar.f32983a.remove("channel_id");
        geVar.f32983a.remove("channel_importance");
        geVar.f32983a.remove("channel_name");
        geVar.f32983a.remove("channel_description");
        geVar.f32983a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.zy.kja0("delete channel info by:" + geVar.f32983a.get("REMOVE_CHANNEL_MARK"));
        geVar.f32983a.remove("REMOVE_CHANNEL_MARK");
    }

    private static SharedPreferences zy(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }
}
