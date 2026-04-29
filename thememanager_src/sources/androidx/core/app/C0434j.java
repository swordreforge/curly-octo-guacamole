package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.x9kr;
import androidx.core.content.C0508s;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.app.j */
/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class C0434j implements fu4 {

    /* JADX INFO: renamed from: k */
    private final Context f3198k;

    /* JADX INFO: renamed from: n */
    private RemoteViews f3199n;

    /* JADX INFO: renamed from: q */
    private RemoteViews f3200q;

    /* JADX INFO: renamed from: s */
    private RemoteViews f3201s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Notification.Builder f50088toq;

    /* JADX INFO: renamed from: y */
    private int f3202y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final x9kr.f7l8 f50089zy;

    /* JADX INFO: renamed from: g */
    private final List<Bundle> f3197g = new ArrayList();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Bundle f50087f7l8 = new Bundle();

    C0434j(x9kr.f7l8 f7l8Var) {
        int i2;
        this.f50089zy = f7l8Var;
        this.f3198k = f7l8Var.f3288k;
        Notification.Builder builder = new Notification.Builder(f7l8Var.f3288k, f7l8Var.f50207d2ok);
        this.f50088toq = builder;
        Notification notification = f7l8Var.f3284f;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, f7l8Var.f3294s).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(f7l8Var.f3290n).setContentText(f7l8Var.f3285g).setContentInfo(f7l8Var.f50221ld6).setContentIntent(f7l8Var.f50211f7l8).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(f7l8Var.f3296y, (notification.flags & 128) != 0).setLargeIcon(f7l8Var.f3291p).setNumber(f7l8Var.f50236x2).setProgress(f7l8Var.f50212fn3e, f7l8Var.f50238zurt, f7l8Var.f50228ni7);
        builder.setSubText(f7l8Var.f50219ki).setUsesChronometer(f7l8Var.f50220kja0).setPriority(f7l8Var.f50231qrj);
        Iterator<x9kr.toq> it = f7l8Var.f50233toq.iterator();
        while (it.hasNext()) {
            toq(it.next());
        }
        Bundle bundle = f7l8Var.f50205a9;
        if (bundle != null) {
            this.f50087f7l8.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f3200q = f7l8Var.f50208d3;
        this.f3199n = f7l8Var.f50230oc;
        this.f50088toq.setShowWhen(f7l8Var.f50226n7h);
        this.f50088toq.setLocalOnly(f7l8Var.f50235wvg).setGroup(f7l8Var.f50214fu4).setGroupSummary(f7l8Var.f3297z).setSortKey(f7l8Var.f50229o1t);
        this.f3202y = f7l8Var.f50227ncyb;
        this.f50088toq.setCategory(f7l8Var.f50217jk).setColor(f7l8Var.f50213fti).setVisibility(f7l8Var.f50218jp0y).setPublicVersion(f7l8Var.f50215gvn7).setSound(notification.sound, notification.audioAttributes);
        List listM1899n = i3 < 28 ? m1899n(f7l8(f7l8Var.f50239zy), f7l8Var.f50234uv6) : f7l8Var.f50234uv6;
        if (listM1899n != null && !listM1899n.isEmpty()) {
            Iterator it2 = listM1899n.iterator();
            while (it2.hasNext()) {
                this.f50088toq.addPerson((String) it2.next());
            }
        }
        this.f3201s = f7l8Var.f50210eqxt;
        if (f7l8Var.f3292q.size() > 0) {
            Bundle bundle2 = f7l8Var.m2037i().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < f7l8Var.f3292q.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), C0439m.m1934p(f7l8Var.f3292q.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            f7l8Var.m2037i().putBundle("android.car.EXTENSIONS", bundle2);
            this.f50087f7l8.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        Icon icon = f7l8Var.f50222lrht;
        if (icon != null) {
            this.f50088toq.setSmallIcon(icon);
        }
        this.f50088toq.setExtras(f7l8Var.f50205a9).setRemoteInputHistory(f7l8Var.f3287i);
        RemoteViews remoteViews = f7l8Var.f50208d3;
        if (remoteViews != null) {
            this.f50088toq.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = f7l8Var.f50230oc;
        if (remoteViews2 != null) {
            this.f50088toq.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = f7l8Var.f50210eqxt;
        if (remoteViews3 != null) {
            this.f50088toq.setCustomHeadsUpContentView(remoteViews3);
        }
        this.f50088toq.setBadgeIconType(f7l8Var.f50223lvui).setSettingsText(f7l8Var.f50232t8r).setShortcutId(f7l8Var.f3293r).setTimeoutAfter(f7l8Var.f50237x9kr).setGroupAlertBehavior(f7l8Var.f50227ncyb);
        if (f7l8Var.f50224mcp) {
            this.f50088toq.setColorized(f7l8Var.f3295t);
        }
        if (!TextUtils.isEmpty(f7l8Var.f50207d2ok)) {
            this.f50088toq.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i5 >= 28) {
            Iterator<a98o> it3 = f7l8Var.f50239zy.iterator();
            while (it3.hasNext()) {
                this.f50088toq.addPerson(it3.next().ld6());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f50088toq.setAllowSystemGeneratedContextualActions(f7l8Var.f50225n5r1);
            this.f50088toq.setBubbleMetadata(x9kr.C0459g.ld6(f7l8Var.f50216hyr));
            C0508s c0508s = f7l8Var.f50209dd;
            if (c0508s != null) {
                this.f50088toq.setLocusId(c0508s.zy());
            }
        }
        if (i6 >= 31 && (i2 = f7l8Var.f3289l) != 0) {
            this.f50088toq.setForegroundServiceBehavior(i2);
        }
        if (f7l8Var.f3283c) {
            if (this.f50089zy.f3297z) {
                this.f3202y = 2;
            } else {
                this.f3202y = 1;
            }
            this.f50088toq.setVibrate(null);
            this.f50088toq.setSound(null);
            int i7 = notification.defaults & (-2) & (-3);
            notification.defaults = i7;
            this.f50088toq.setDefaults(i7);
            if (TextUtils.isEmpty(this.f50089zy.f50214fu4)) {
                this.f50088toq.setGroup(x9kr.f50177py);
            }
            this.f50088toq.setGroupAlertBehavior(this.f3202y);
        }
    }

    @zy.dd
    private static List<String> f7l8(@zy.dd List<a98o> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<a98o> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1794p());
        }
        return arrayList;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    private static List<String> m1899n(@zy.dd List<String> list, @zy.dd List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.zy zyVar = new androidx.collection.zy(list.size() + list2.size());
        zyVar.addAll(list);
        zyVar.addAll(list2);
        return new ArrayList(zyVar);
    }

    private void toq(x9kr.toq toqVar) {
        IconCompat iconCompatM2098g = toqVar.m2098g();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatM2098g != null ? iconCompatM2098g.eqxt() : null, toqVar.m2101p(), toqVar.m2099k());
        if (toqVar.f7l8() != null) {
            for (RemoteInput remoteInput : ch.m1842q(toqVar.f7l8())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = toqVar.m2102q() != null ? new Bundle(toqVar.m2102q()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", toqVar.toq());
        int i2 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(toqVar.toq());
        bundle.putInt("android.support.action.semanticAction", toqVar.m2104y());
        if (i2 >= 28) {
            builder.setSemanticAction(toqVar.m2104y());
        }
        if (i2 >= 29) {
            builder.setContextual(toqVar.x2());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(toqVar.ld6());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", toqVar.m2103s());
        builder.addExtras(bundle);
        this.f50088toq.addAction(builder.build());
    }

    /* JADX INFO: renamed from: y */
    private void m1900y(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    /* JADX INFO: renamed from: g */
    Context m1901g() {
        return this.f3198k;
    }

    @Override // androidx.core.app.fu4
    /* JADX INFO: renamed from: k */
    public Notification.Builder mo1878k() {
        return this.f50088toq;
    }

    /* JADX INFO: renamed from: q */
    protected Notification m1902q() {
        return this.f50088toq.build();
    }

    public Notification zy() {
        Bundle bundleN7h;
        RemoteViews remoteViewsFu4;
        RemoteViews remoteViewsZurt;
        x9kr.cdj cdjVar = this.f50089zy.f50206cdj;
        if (cdjVar != null) {
            cdjVar.toq(this);
        }
        RemoteViews remoteViewsNi7 = cdjVar != null ? cdjVar.ni7(this) : null;
        Notification notificationM1902q = m1902q();
        if (remoteViewsNi7 != null) {
            notificationM1902q.contentView = remoteViewsNi7;
        } else {
            RemoteViews remoteViews = this.f50089zy.f50208d3;
            if (remoteViews != null) {
                notificationM1902q.contentView = remoteViews;
            }
        }
        if (cdjVar != null && (remoteViewsZurt = cdjVar.zurt(this)) != null) {
            notificationM1902q.bigContentView = remoteViewsZurt;
        }
        if (cdjVar != null && (remoteViewsFu4 = this.f50089zy.f50206cdj.fu4(this)) != null) {
            notificationM1902q.headsUpContentView = remoteViewsFu4;
        }
        if (cdjVar != null && (bundleN7h = x9kr.n7h(notificationM1902q)) != null) {
            cdjVar.mo2024k(bundleN7h);
        }
        return notificationM1902q;
    }
}
