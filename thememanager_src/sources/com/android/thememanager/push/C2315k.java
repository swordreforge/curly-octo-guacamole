package com.android.thememanager.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.jk;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.push.InterfaceC2316n;
import java.util.Calendar;

/* JADX INFO: renamed from: com.android.thememanager.push.k */
/* JADX INFO: compiled from: ThemePushAction.java */
/* JADX INFO: loaded from: classes2.dex */
class C2315k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected C2319y f60608toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f60609zy = null;

    /* JADX INFO: renamed from: k */
    protected Context f13498k = C2082k.zy().toq();

    protected C2315k(C2319y pushMsg) {
        this.f60608toq = pushMsg;
    }

    /* JADX INFO: renamed from: g */
    private PendingIntent m8465g() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    private PendingIntent m8466n() {
        Intent intentMo8469q = mo8469q();
        if (intentMo8469q == null) {
            intentMo8469q = C1803e.m7038n(this.f13498k);
        }
        intentMo8469q.putExtra(InterfaceC2316n.f13504y, this.f60608toq.f13522p);
        intentMo8469q.putExtra(x9kr.f10441q, true);
        com.android.thememanager.basemodule.analysis.f7l8.toq(intentMo8469q, com.android.thememanager.basemodule.analysis.toq.wwr9);
        return PendingIntent.getActivity(this.f13498k, intentMo8469q.hashCode(), intentMo8469q, 67108864);
    }

    static C2315k toq(C2319y pushMsg) {
        EnumC2318s enumC2318s = pushMsg.f60621ld6;
        return enumC2318s == EnumC2318s.PUSH_AD ? new toq(pushMsg) : enumC2318s == EnumC2318s.PUSH_PC ? new C2317q(pushMsg) : enumC2318s == EnumC2318s.PUSH_APP ? new zy(pushMsg) : new C2315k(pushMsg);
    }

    protected String f7l8() {
        return this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f60620zy);
    }

    /* JADX INFO: renamed from: k */
    final boolean m8467k() {
        y9n.m7257y();
        qrj();
        int iLd6 = ld6();
        x2(iLd6);
        return iLd6 >= 0;
    }

    protected int ld6() {
        String strM8470s = m8470s();
        if (TextUtils.isEmpty(strM8470s)) {
            return -1;
        }
        Notification.Builder builder = new Notification.Builder(this.f13498k);
        builder.setSmallIcon(R.drawable.notification_small_icon).setAutoCancel(true).setContentTitle(strM8470s).setContentText(f7l8()).setTicker(m8471y()).setContentIntent(m8466n()).setDeleteIntent(m8465g());
        if (m8468p()) {
            builder.setDefaults(1);
        }
        int iHashCode = strM8470s.hashCode();
        if (iHashCode < 0) {
            iHashCode = -iHashCode;
        }
        jk.m7104n(this.f13498k, iHashCode, builder);
        return iHashCode;
    }

    protected void n7h(String reason) {
        this.f60609zy = reason;
    }

    /* JADX INFO: renamed from: p */
    protected boolean m8468p() {
        int i2 = Calendar.getInstance().get(11);
        return 8 <= i2 && i2 <= 19;
    }

    /* JADX INFO: renamed from: q */
    protected Intent mo8469q() {
        return null;
    }

    protected void qrj() {
    }

    /* JADX INFO: renamed from: s */
    protected String m8470s() {
        return this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f60619toq);
    }

    protected void x2(int notifyId) {
    }

    /* JADX INFO: renamed from: y */
    protected String m8471y() {
        return this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f13519q);
    }

    String zy() {
        return this.f60609zy;
    }
}
