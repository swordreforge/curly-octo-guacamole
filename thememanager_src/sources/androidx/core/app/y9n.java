package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: NotificationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y9n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50327cdj = -1000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f50328f7l8 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50329fn3e = 3;

    /* JADX INFO: renamed from: g */
    public static final String f3389g = "android.support.useSideChannel";

    /* JADX INFO: renamed from: h */
    @zy.o1t("sLock")
    private static ServiceConnectionC0474q f3390h = null;

    /* JADX INFO: renamed from: i */
    public static final int f3391i = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50330ki = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50332ld6 = "enabled_notification_listeners";

    /* JADX INFO: renamed from: n */
    private static final String f3392n = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50334ni7 = 5;

    /* JADX INFO: renamed from: p */
    private static final int f3393p = 6;

    /* JADX INFO: renamed from: q */
    private static final String f3394q = "checkOpNoThrow";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.o1t("sEnabledNotificationListenersLock")
    private static String f50335qrj = null;

    /* JADX INFO: renamed from: s */
    private static final int f3395s = 1000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50336t8r = 1;

    /* JADX INFO: renamed from: y */
    static final int f3396y = 19;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f50338zurt = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50339zy = "NotifManCompat";

    /* JADX INFO: renamed from: k */
    private final Context f3397k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final NotificationManager f50340toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Object f50337x2 = new Object();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @zy.o1t("sEnabledNotificationListenersLock")
    private static Set<String> f50333n7h = new HashSet();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final Object f50331kja0 = new Object();

    /* JADX INFO: renamed from: androidx.core.app.y9n$n */
    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    private interface InterfaceC0473n {
        /* JADX INFO: renamed from: k */
        void mo2149k(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    /* JADX INFO: renamed from: androidx.core.app.y9n$q */
    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    private static class ServiceConnectionC0474q implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: h */
        private static final int f3400h = 2;

        /* JADX INFO: renamed from: i */
        private static final int f3401i = 3;

        /* JADX INFO: renamed from: p */
        private static final int f3402p = 1;

        /* JADX INFO: renamed from: s */
        private static final int f3403s = 0;

        /* JADX INFO: renamed from: k */
        private final Context f3405k;

        /* JADX INFO: renamed from: n */
        private final Handler f3406n;

        /* JADX INFO: renamed from: q */
        private final HandlerThread f3407q;

        /* JADX INFO: renamed from: g */
        private final Map<ComponentName, k> f3404g = new HashMap();

        /* JADX INFO: renamed from: y */
        private Set<String> f3408y = new HashSet();

        /* JADX INFO: renamed from: androidx.core.app.y9n$q$k */
        /* JADX INFO: compiled from: NotificationManagerCompat.java */
        private static class k {

            /* JADX INFO: renamed from: k */
            final ComponentName f3409k;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            INotificationSideChannel f50344zy;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            boolean f50343toq = false;

            /* JADX INFO: renamed from: q */
            ArrayDeque<InterfaceC0473n> f3411q = new ArrayDeque<>();

            /* JADX INFO: renamed from: n */
            int f3410n = 0;

            k(ComponentName componentName) {
                this.f3409k = componentName;
            }
        }

        ServiceConnectionC0474q(Context context) {
            this.f3405k = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3407q = handlerThread;
            handlerThread.start();
            this.f3406n = new Handler(handlerThread.getLooper(), this);
        }

        private void f7l8(k kVar) {
            if (Log.isLoggable(y9n.f50339zy, 3)) {
                Log.d(y9n.f50339zy, "Processing component " + kVar.f3409k + ", " + kVar.f3411q.size() + " queued tasks");
            }
            if (kVar.f3411q.isEmpty()) {
                return;
            }
            if (!m2151k(kVar) || kVar.f50344zy == null) {
                m2155s(kVar);
                return;
            }
            while (true) {
                InterfaceC0473n interfaceC0473nPeek = kVar.f3411q.peek();
                if (interfaceC0473nPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(y9n.f50339zy, 3)) {
                        Log.d(y9n.f50339zy, "Sending task " + interfaceC0473nPeek);
                    }
                    interfaceC0473nPeek.mo2149k(kVar.f50344zy);
                    kVar.f3411q.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(y9n.f50339zy, 3)) {
                        Log.d(y9n.f50339zy, "Remote service has died: " + kVar.f3409k);
                    }
                } catch (RemoteException e2) {
                    Log.w(y9n.f50339zy, "RemoteException communicating with " + kVar.f3409k, e2);
                }
            }
            if (kVar.f3411q.isEmpty()) {
                return;
            }
            m2155s(kVar);
        }

        /* JADX INFO: renamed from: g */
        private void m2150g(ComponentName componentName) {
            k kVar = this.f3404g.get(componentName);
            if (kVar != null) {
                toq(kVar);
            }
        }

        /* JADX INFO: renamed from: k */
        private boolean m2151k(k kVar) {
            if (kVar.f50343toq) {
                return true;
            }
            boolean zBindService = this.f3405k.bindService(new Intent(y9n.f50328f7l8).setComponent(kVar.f3409k), this, 33);
            kVar.f50343toq = zBindService;
            if (zBindService) {
                kVar.f3410n = 0;
            } else {
                Log.w(y9n.f50339zy, "Unable to bind to listener " + kVar.f3409k);
                this.f3405k.unbindService(this);
            }
            return kVar.f50343toq;
        }

        /* JADX INFO: renamed from: n */
        private void m2152n(ComponentName componentName, IBinder iBinder) {
            k kVar = this.f3404g.get(componentName);
            if (kVar != null) {
                kVar.f50344zy = INotificationSideChannel.Stub.asInterface(iBinder);
                kVar.f3410n = 0;
                f7l8(kVar);
            }
        }

        /* JADX INFO: renamed from: p */
        private void m2153p() {
            Set<String> setCdj = y9n.cdj(this.f3405k);
            if (setCdj.equals(this.f3408y)) {
                return;
            }
            this.f3408y = setCdj;
            List<ResolveInfo> listQueryIntentServices = this.f3405k.getPackageManager().queryIntentServices(new Intent().setAction(y9n.f50328f7l8), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setCdj.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(y9n.f50339zy, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f3404g.containsKey(componentName2)) {
                    if (Log.isLoggable(y9n.f50339zy, 3)) {
                        Log.d(y9n.f50339zy, "Adding listener record for " + componentName2);
                    }
                    this.f3404g.put(componentName2, new k(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, k>> it = this.f3404g.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, k> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(y9n.f50339zy, 3)) {
                        Log.d(y9n.f50339zy, "Removing listener record for " + next.getKey());
                    }
                    toq(next.getValue());
                    it.remove();
                }
            }
        }

        /* JADX INFO: renamed from: q */
        private void m2154q(ComponentName componentName) {
            k kVar = this.f3404g.get(componentName);
            if (kVar != null) {
                f7l8(kVar);
            }
        }

        /* JADX INFO: renamed from: s */
        private void m2155s(k kVar) {
            if (this.f3406n.hasMessages(3, kVar.f3409k)) {
                return;
            }
            int i2 = kVar.f3410n + 1;
            kVar.f3410n = i2;
            if (i2 <= 6) {
                int i3 = (1 << (i2 - 1)) * 1000;
                if (Log.isLoggable(y9n.f50339zy, 3)) {
                    Log.d(y9n.f50339zy, "Scheduling retry for " + i3 + " ms");
                }
                this.f3406n.sendMessageDelayed(this.f3406n.obtainMessage(3, kVar.f3409k), i3);
                return;
            }
            Log.w(y9n.f50339zy, "Giving up on delivering " + kVar.f3411q.size() + " tasks to " + kVar.f3409k + " after " + kVar.f3410n + " retries");
            kVar.f3411q.clear();
        }

        private void toq(k kVar) {
            if (kVar.f50343toq) {
                this.f3405k.unbindService(this);
                kVar.f50343toq = false;
            }
            kVar.f50344zy = null;
        }

        private void zy(InterfaceC0473n interfaceC0473n) {
            m2153p();
            for (k kVar : this.f3404g.values()) {
                kVar.f3411q.add(interfaceC0473n);
                f7l8(kVar);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                zy((InterfaceC0473n) message.obj);
                return true;
            }
            if (i2 == 1) {
                zy zyVar = (zy) message.obj;
                m2152n(zyVar.f3414k, zyVar.f50347toq);
                return true;
            }
            if (i2 == 2) {
                m2150g((ComponentName) message.obj);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            m2154q((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(y9n.f50339zy, 3)) {
                Log.d(y9n.f50339zy, "Connected to service " + componentName);
            }
            this.f3406n.obtainMessage(1, new zy(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(y9n.f50339zy, 3)) {
                Log.d(y9n.f50339zy, "Disconnected from service " + componentName);
            }
            this.f3406n.obtainMessage(2, componentName).sendToTarget();
        }

        /* JADX INFO: renamed from: y */
        public void m2156y(InterfaceC0473n interfaceC0473n) {
            this.f3406n.obtainMessage(0, interfaceC0473n).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    private static class toq implements InterfaceC0473n {

        /* JADX INFO: renamed from: k */
        final String f3412k;

        /* JADX INFO: renamed from: q */
        final Notification f3413q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f50345toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final String f50346zy;

        toq(String str, int i2, String str2, Notification notification) {
            this.f3412k = str;
            this.f50345toq = i2;
            this.f50346zy = str2;
            this.f3413q = notification;
        }

        @Override // androidx.core.app.y9n.InterfaceC0473n
        /* JADX INFO: renamed from: k */
        public void mo2149k(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f3412k, this.f50345toq, this.f50346zy, this.f3413q);
        }

        @zy.lvui
        public String toString() {
            return "NotifyTask[packageName:" + this.f3412k + ", id:" + this.f50345toq + ", tag:" + this.f50346zy + "]";
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        final ComponentName f3414k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final IBinder f50347toq;

        zy(ComponentName componentName, IBinder iBinder) {
            this.f3414k = componentName;
            this.f50347toq = iBinder;
        }
    }

    private y9n(Context context) {
        this.f3397k = context;
        this.f50340toq = (NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
    }

    private void a9(InterfaceC0473n interfaceC0473n) {
        synchronized (f50331kja0) {
            if (f3390h == null) {
                f3390h = new ServiceConnectionC0474q(this.f3397k.getApplicationContext());
            }
            f3390h.m2156y(interfaceC0473n);
        }
    }

    @zy.lvui
    public static Set<String> cdj(@zy.lvui Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f50332ld6);
        synchronized (f50337x2) {
            if (string != null) {
                if (!string.equals(f50335qrj)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f50333n7h = hashSet;
                    f50335qrj = string;
                }
                set = f50333n7h;
            } else {
                set = f50333n7h;
            }
        }
        return set;
    }

    private static boolean fti(Notification notification) {
        Bundle bundleN7h = x9kr.n7h(notification);
        return bundleN7h != null && bundleN7h.getBoolean(f3389g);
    }

    @zy.lvui
    /* JADX INFO: renamed from: h */
    public static y9n m2138h(@zy.lvui Context context) {
        return new y9n(context);
    }

    public void f7l8(@zy.lvui NotificationChannelGroup notificationChannelGroup) {
        this.f50340toq.createNotificationChannelGroup(notificationChannelGroup);
    }

    @zy.dd
    public jk fn3e(@zy.lvui String str) {
        NotificationChannel notificationChannelT8r = t8r(str);
        if (notificationChannelT8r != null) {
            return new jk(notificationChannelT8r);
        }
        return null;
    }

    @zy.dd
    public gvn7 fu4(@zy.lvui String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroupNi7 = ni7(str);
            if (notificationChannelGroupNi7 != null) {
                return new gvn7(notificationChannelGroupNi7);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroupNi72 = ni7(str);
        if (notificationChannelGroupNi72 != null) {
            return new gvn7(notificationChannelGroupNi72, wvg());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m2139g(@zy.lvui jk jkVar) {
        m2142n(jkVar.qrj());
    }

    @zy.dd
    /* JADX INFO: renamed from: i */
    public NotificationChannel m2140i(@zy.lvui String str, @zy.lvui String str2) {
        return Build.VERSION.SDK_INT >= 30 ? this.f50340toq.getNotificationChannel(str, str2) : t8r(str);
    }

    public void jk(@zy.dd String str, int i2, @zy.lvui Notification notification) {
        if (!fti(notification)) {
            this.f50340toq.notify(str, i2, notification);
        } else {
            a9(new toq(this.f3397k.getPackageName(), i2, str, notification));
            this.f50340toq.cancel(str, i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m2141k() {
        return this.f50340toq.areNotificationsEnabled();
    }

    public int ki() {
        return this.f50340toq.getImportance();
    }

    public void kja0(@zy.lvui Collection<String> collection) {
        for (NotificationChannel notificationChannel : this.f50340toq.getNotificationChannels()) {
            if (!collection.contains(notificationChannel.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(notificationChannel.getParentChannelId()))) {
                this.f50340toq.deleteNotificationChannel(notificationChannel.getId());
            }
        }
    }

    public void ld6(@zy.lvui List<NotificationChannel> list) {
        this.f50340toq.createNotificationChannels(list);
    }

    public void mcp(int i2, @zy.lvui Notification notification) {
        jk(null, i2, notification);
    }

    /* JADX INFO: renamed from: n */
    public void m2142n(@zy.lvui NotificationChannel notificationChannel) {
        this.f50340toq.createNotificationChannel(notificationChannel);
    }

    public void n7h(@zy.lvui String str) {
        this.f50340toq.deleteNotificationChannelGroup(str);
    }

    @zy.dd
    public NotificationChannelGroup ni7(@zy.lvui String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f50340toq.getNotificationChannelGroup(str);
        }
        for (NotificationChannelGroup notificationChannelGroup : m2148z()) {
            if (notificationChannelGroup.getId().equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    @zy.lvui
    public List<gvn7> o1t() {
        int i2 = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> listM2148z = m2148z();
        if (listM2148z.isEmpty()) {
            return Collections.emptyList();
        }
        List<NotificationChannel> listEmptyList = i2 >= 28 ? Collections.emptyList() : wvg();
        ArrayList arrayList = new ArrayList(listM2148z.size());
        for (NotificationChannelGroup notificationChannelGroup : listM2148z) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new gvn7(notificationChannelGroup));
            } else {
                arrayList.add(new gvn7(notificationChannelGroup, listEmptyList));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public void m2143p(@zy.lvui List<gvn7> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<gvn7> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1880g());
        }
        this.f50340toq.createNotificationChannelGroups(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public void m2144q() {
        this.f50340toq.cancelAll();
    }

    public void qrj(@zy.lvui String str) {
        this.f50340toq.deleteNotificationChannel(str);
    }

    /* JADX INFO: renamed from: s */
    public void m2145s(@zy.lvui List<NotificationChannelGroup> list) {
        this.f50340toq.createNotificationChannelGroups(list);
    }

    @zy.lvui
    /* JADX INFO: renamed from: t */
    public List<jk> m2146t() {
        List<NotificationChannel> listWvg = wvg();
        if (listWvg.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listWvg.size());
        Iterator<NotificationChannel> it = listWvg.iterator();
        while (it.hasNext()) {
            arrayList.add(new jk(it.next()));
        }
        return arrayList;
    }

    @zy.dd
    public NotificationChannel t8r(@zy.lvui String str) {
        return this.f50340toq.getNotificationChannel(str);
    }

    public void toq(int i2) {
        zy(null, i2);
    }

    @zy.lvui
    public List<NotificationChannel> wvg() {
        return this.f50340toq.getNotificationChannels();
    }

    public void x2(@zy.lvui List<jk> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<jk> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().qrj());
        }
        this.f50340toq.createNotificationChannels(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public void m2147y(@zy.lvui gvn7 gvn7Var) {
        f7l8(gvn7Var.m1880g());
    }

    @zy.lvui
    /* JADX INFO: renamed from: z */
    public List<NotificationChannelGroup> m2148z() {
        return this.f50340toq.getNotificationChannelGroups();
    }

    @zy.dd
    public jk zurt(@zy.lvui String str, @zy.lvui String str2) {
        NotificationChannel notificationChannelM2140i = m2140i(str, str2);
        if (notificationChannelM2140i != null) {
            return new jk(notificationChannelM2140i);
        }
        return null;
    }

    public void zy(@zy.dd String str, int i2) {
        this.f50340toq.cancel(str, i2);
    }

    /* JADX INFO: renamed from: androidx.core.app.y9n$k */
    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    private static class C0472k implements InterfaceC0473n {

        /* JADX INFO: renamed from: k */
        final String f3398k;

        /* JADX INFO: renamed from: q */
        final boolean f3399q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f50341toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final String f50342zy;

        C0472k(String str) {
            this.f3398k = str;
            this.f50341toq = 0;
            this.f50342zy = null;
            this.f3399q = true;
        }

        @Override // androidx.core.app.y9n.InterfaceC0473n
        /* JADX INFO: renamed from: k */
        public void mo2149k(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f3399q) {
                iNotificationSideChannel.cancelAll(this.f3398k);
            } else {
                iNotificationSideChannel.cancel(this.f3398k, this.f50341toq, this.f50342zy);
            }
        }

        @zy.lvui
        public String toString() {
            return "CancelTask[packageName:" + this.f3398k + ", id:" + this.f50341toq + ", tag:" + this.f50342zy + ", all:" + this.f3399q + "]";
        }

        C0472k(String str, int i2, String str2) {
            this.f3398k = str;
            this.f50341toq = i2;
            this.f50342zy = str2;
            this.f3399q = false;
        }
    }
}
