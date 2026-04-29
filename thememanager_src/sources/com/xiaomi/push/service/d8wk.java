package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.nc;
import com.xiaomi.push.o5;
import com.xiaomi.push.pnt2;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.vwb;
import com.xiaomi.push.xblq;
import com.xiaomi.push.xtb7;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class d8wk {

    /* JADX INFO: renamed from: k */
    private zy f33740k = new zy();

    /* JADX INFO: renamed from: n */
    private static void m21569n(Context context, Intent intent, eqxt.toq toqVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, zy(toqVar));
        }
    }

    public static String zy(eqxt.toq toqVar) {
        if ("9".equals(toqVar.f33766y)) {
            return toqVar.f33761k + ".permission.MIMC_RECEIVE";
        }
        return toqVar.f33761k + ".permission.MIPUSH_RECEIVE";
    }

    public void f7l8(Context context, eqxt.toq toqVar, String str, String str2) {
        if (toqVar == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(toqVar.f33766y)) {
            com.xiaomi.channel.commonutils.logger.zy.jk("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(toqVar.f33761k);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", toqVar.f33766y);
        intent.putExtra(dd.f73583t8r, toqVar.f73603toq);
        intent.putExtra(dd.f73581oc, toqVar.f33763p);
        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", toqVar.f33766y, toqVar.f33761k, str2));
        m21569n(context, intent, toqVar);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: g */
    public void m21570g(Context context, eqxt.toq toqVar, int i2) {
        if ("5".equalsIgnoreCase(toqVar.f33766y)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(toqVar.f33761k);
        intent.putExtra(dd.f73588zurt, toqVar.f33766y);
        intent.putExtra("ext_reason", i2);
        intent.putExtra(dd.f73583t8r, toqVar.f73603toq);
        intent.putExtra(dd.f73581oc, toqVar.f33763p);
        if (toqVar.f73597ki == null || !"9".equals(toqVar.f33766y)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[Bcst] notify channel closed. %s,%s,%d", toqVar.f33766y, toqVar.f33761k, Integer.valueOf(i2)));
            m21569n(context, intent, toqVar);
            return;
        }
        try {
            toqVar.f73597ki.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            toqVar.f73597ki = null;
            StringBuilder sb = new StringBuilder();
            sb.append("peer may died: ");
            String str = toqVar.f73603toq;
            sb.append(str.substring(str.lastIndexOf(64)));
            com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
        }
    }

    /* JADX INFO: renamed from: k */
    eqxt.toq m21571k(o5 o5Var) {
        Collection<eqxt.toq> collectionM21582g = eqxt.zy().m21582g(Integer.toString(o5Var.m21348k()));
        if (collectionM21582g.isEmpty()) {
            return null;
        }
        Iterator<eqxt.toq> it = collectionM21582g.iterator();
        if (collectionM21582g.size() == 1) {
            return it.next();
        }
        String strFti = o5Var.fti();
        while (it.hasNext()) {
            eqxt.toq next = it.next();
            if (TextUtils.equals(strFti, next.f73603toq)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m21572p(XMPushService xMPushService, String str, xtb7 xtb7Var) {
        String str2;
        eqxt.toq qVar = toq(xtb7Var);
        if (qVar == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f33740k.m21828y(xMPushService, xtb7Var, qVar);
            return;
        }
        String str3 = qVar.f33761k;
        if (xtb7Var instanceof pnt2) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (xtb7Var instanceof xblq) {
            str2 = "com.xiaomi.push.new_iq";
        } else {
            if (!(xtb7Var instanceof vwb)) {
                com.xiaomi.channel.commonutils.logger.zy.jk("unknown packet type, drop it");
                return;
            }
            str2 = "com.xiaomi.push.new_pres";
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", xtb7Var.mo21383k());
        intent.putExtra(dd.f73581oc, qVar.f33763p);
        intent.putExtra(dd.f33751t, qVar.f33765s);
        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[Bcst] notify packet arrival. %s,%s,%s", qVar.f33766y, qVar.f33761k, xtb7Var.x2()));
        if ("3".equalsIgnoreCase(str)) {
            intent.putExtra(dd.f73579ni7, xtb7Var.f34184p);
            intent.putExtra(dd.f73568fu4, System.currentTimeMillis());
        }
        m21569n(xMPushService, intent, qVar);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public void m21573q(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.service_started");
            if (nc.ki()) {
                intent.addFlags(16777216);
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
            intent.setPackage("com.android.mms");
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m21574s(XMPushService xMPushService, String str, o5 o5Var) {
        eqxt.toq toqVarM21571k = m21571k(o5Var);
        if (toqVarM21571k == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f33740k.f7l8(xMPushService, o5Var, toqVarM21571k);
            return;
        }
        String str2 = toqVarM21571k.f33761k;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", o5Var.cdj(toqVarM21571k.f33765s));
        intent.putExtra(dd.f73581oc, toqVarM21571k.f33763p);
        intent.putExtra(dd.f33751t, toqVarM21571k.f33765s);
        if (vq.m21773k(o5Var)) {
            intent.putExtra("ext_downward_pkt_id", o5Var.jk());
        }
        if (toqVarM21571k.f73597ki != null) {
            try {
                toqVarM21571k.f73597ki.send(Message.obtain(null, 17, intent));
                com.xiaomi.channel.commonutils.logger.zy.kja0("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                toqVarM21571k.f73597ki = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str3 = toqVarM21571k.f73603toq;
                sb.append(str3.substring(str3.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", toqVarM21571k.f33766y, toqVarM21571k.f33761k, o5Var.jk()));
        if (vq.m21773k(o5Var)) {
            C5914f.m21604k().zy(o5Var.jk(), SystemClock.elapsedRealtime());
        }
        m21569n(xMPushService, intent, toqVarM21571k);
    }

    eqxt.toq toq(xtb7 xtb7Var) {
        Collection<eqxt.toq> collectionM21582g = eqxt.zy().m21582g(xtb7Var.qrj());
        if (collectionM21582g.isEmpty()) {
            return null;
        }
        Iterator<eqxt.toq> it = collectionM21582g.iterator();
        if (collectionM21582g.size() == 1) {
            return it.next();
        }
        String strCdj = xtb7Var.cdj();
        String strKja0 = xtb7Var.kja0();
        while (it.hasNext()) {
            eqxt.toq next = it.next();
            if (TextUtils.equals(strCdj, next.f73603toq) || TextUtils.equals(strKja0, next.f73603toq)) {
                return next;
            }
        }
        return null;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: y */
    public void m21575y(Context context, eqxt.toq toqVar, boolean z2, int i2, String str) {
        if ("5".equalsIgnoreCase(toqVar.f33766y)) {
            this.f33740k.m21827g(context, toqVar, z2, i2, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(toqVar.f33761k);
        intent.putExtra("ext_succeeded", z2);
        if (!z2) {
            intent.putExtra("ext_reason", i2);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", toqVar.f33766y);
        intent.putExtra(dd.f73583t8r, toqVar.f73603toq);
        intent.putExtra(dd.f73581oc, toqVar.f33763p);
        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", toqVar.f33766y, toqVar.f33761k, Boolean.valueOf(z2), Integer.valueOf(i2)));
        m21569n(context, intent, toqVar);
    }
}
