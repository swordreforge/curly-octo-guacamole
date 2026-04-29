package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class eqxt {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static eqxt f73592zy;

    /* JADX INFO: renamed from: k */
    private ConcurrentHashMap<String, HashMap<String, toq>> f33757k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<InterfaceC5911k> f73593toq = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.eqxt$k */
    public interface InterfaceC5911k {
        /* JADX INFO: renamed from: a */
        void mo21588a();
    }

    public enum zy {
        unbind,
        binding,
        binded
    }

    private eqxt() {
    }

    /* JADX INFO: renamed from: q */
    private String m21581q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("@");
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    public static synchronized eqxt zy() {
        if (f73592zy == null) {
            f73592zy = new eqxt();
        }
        return f73592zy;
    }

    public synchronized List<String> f7l8(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, toq>> it = this.f33757k.values().iterator();
        while (it.hasNext()) {
            for (toq toqVar : it.next().values()) {
                if (str.equals(toqVar.f33761k)) {
                    arrayList.add(toqVar.f33766y);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public synchronized Collection<toq> m21582g(String str) {
        if (this.f33757k.containsKey(str)) {
            return ((HashMap) this.f33757k.get(str).clone()).values();
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m21583k() {
        return this.f33757k.size();
    }

    public synchronized void kja0() {
        this.f73593toq.clear();
    }

    public synchronized void ld6(InterfaceC5911k interfaceC5911k) {
        this.f73593toq.add(interfaceC5911k);
    }

    /* JADX INFO: renamed from: n */
    public synchronized ArrayList<toq> m21584n() {
        ArrayList<toq> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, toq>> it = this.f33757k.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    public synchronized void n7h(String str, String str2) {
        HashMap<String, toq> map = this.f33757k.get(str);
        if (map != null) {
            toq toqVar = map.get(m21581q(str2));
            if (toqVar != null) {
                toqVar.m21591g();
            }
            map.remove(m21581q(str2));
            if (map.isEmpty()) {
                this.f33757k.remove(str);
            }
        }
        Iterator<InterfaceC5911k> it = this.f73593toq.iterator();
        while (it.hasNext()) {
            it.next().mo21588a();
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m21585p(Context context, int i2) {
        Iterator<HashMap<String, toq>> it = this.f33757k.values().iterator();
        while (it.hasNext()) {
            Iterator<toq> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().ld6(zy.unbind, 2, i2, null, null);
            }
        }
    }

    public synchronized void qrj(String str) {
        HashMap<String, toq> map = this.f33757k.get(str);
        if (map != null) {
            Iterator<toq> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m21591g();
            }
            map.clear();
            this.f33757k.remove(str);
        }
        Iterator<InterfaceC5911k> it2 = this.f73593toq.iterator();
        while (it2.hasNext()) {
            it2.next().mo21588a();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m21586s(Context context) {
        Iterator<HashMap<String, toq>> it = this.f33757k.values().iterator();
        while (it.hasNext()) {
            Iterator<toq> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().ld6(zy.unbind, 1, 3, null, null);
            }
        }
    }

    public synchronized toq toq(String str, String str2) {
        HashMap<String, toq> map = this.f33757k.get(str);
        if (map == null) {
            return null;
        }
        return map.get(m21581q(str2));
    }

    public synchronized void x2(toq toqVar) {
        HashMap<String, toq> map = this.f33757k.get(toqVar.f33766y);
        if (map == null) {
            map = new HashMap<>();
            this.f33757k.put(toqVar.f33766y, map);
        }
        map.put(m21581q(toqVar.f73603toq), toqVar);
        com.xiaomi.channel.commonutils.logger.zy.kja0("add active client. " + toqVar.f33761k);
        Iterator<InterfaceC5911k> it = this.f73593toq.iterator();
        while (it.hasNext()) {
            it.next().mo21588a();
        }
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m21587y() {
        Iterator<toq> it = m21584n().iterator();
        while (it.hasNext()) {
            it.next().m21591g();
        }
        this.f33757k.clear();
    }

    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public String f73595f7l8;

        /* JADX INFO: renamed from: g */
        public String f33758g;

        /* JADX INFO: renamed from: h */
        private XMPushService f33759h;

        /* JADX INFO: renamed from: k */
        public String f33761k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        Messenger f73597ki;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public d8wk f73599ld6;

        /* JADX INFO: renamed from: n */
        public boolean f33762n;

        /* JADX INFO: renamed from: p */
        public String f33763p;

        /* JADX INFO: renamed from: q */
        public String f33764q;

        /* JADX INFO: renamed from: s */
        public String f33765s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f73603toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public Context f73604x2;

        /* JADX INFO: renamed from: y */
        public String f33766y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f73606zy;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        zy f73601qrj = zy.unbind;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private int f73600n7h = 0;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private final CopyOnWriteArrayList<InterfaceC5912k> f73598kja0 = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        zy f73594cdj = null;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f73602t8r = false;

        /* JADX INFO: renamed from: i */
        private XMPushService.zy f33760i = new XMPushService.zy(this);

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        IBinder.DeathRecipient f73596fn3e = null;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        final C8042toq f73605zurt = new C8042toq();

        /* JADX INFO: renamed from: com.xiaomi.push.service.eqxt$toq$k */
        public interface InterfaceC5912k {
            /* JADX INFO: renamed from: k */
            void mo21564k(zy zyVar, zy zyVar2, int i2);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.eqxt$toq$toq, reason: collision with other inner class name */
        class C8042toq extends XMPushService.AbstractC5901p {

            /* JADX INFO: renamed from: g */
            String f33767g;

            /* JADX INFO: renamed from: n */
            int f33768n;

            /* JADX INFO: renamed from: q */
            int f33769q;

            /* JADX INFO: renamed from: y */
            String f33771y;

            public C8042toq() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
            /* JADX INFO: renamed from: k */
            public String mo21141k() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
            public void toq() {
                if (toq.this.x2(this.f33769q, this.f33768n, this.f33771y)) {
                    toq.this.f7l8(this.f33769q, this.f33768n, this.f33767g, this.f33771y);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.zy.m19302z(" ignore notify client :" + toq.this.f33766y);
            }

            public XMPushService.AbstractC5901p zy(int i2, int i3, String str, String str2) {
                this.f33769q = i2;
                this.f33768n = i3;
                this.f33771y = str2;
                this.f33767g = str;
                return this;
            }
        }

        class zy implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: k */
            final toq f33772k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final Messenger f73607toq;

            zy(toq toqVar, Messenger messenger) {
                this.f33772k = toqVar;
                this.f73607toq = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.zy.m19302z("peer died, chid = " + this.f33772k.f33766y);
                toq.this.f33759h.m21531a(new lvui(this, 0), 0L);
                if ("9".equals(this.f33772k.f33766y) && "com.xiaomi.xmsf".equals(toq.this.f33759h.getPackageName())) {
                    toq.this.f33759h.m21531a(new C5936r(this, 0), 60000L);
                }
            }
        }

        public toq() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f7l8(int i2, int i3, String str, String str2) {
            zy zyVar = this.f73601qrj;
            this.f73594cdj = zyVar;
            if (i2 == 2) {
                this.f73599ld6.m21570g(this.f73604x2, this, i3);
                return;
            }
            if (i2 == 3) {
                this.f73599ld6.f7l8(this.f73604x2, this, str2, str);
                return;
            }
            if (i2 == 1) {
                boolean z2 = zyVar == zy.binded;
                if (!z2 && "wait".equals(str2)) {
                    this.f73600n7h++;
                } else if (z2) {
                    this.f73600n7h = 0;
                    if (this.f73597ki != null) {
                        try {
                            this.f73597ki.send(Message.obtain(null, 16, this.f33759h.f33662a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f73599ld6.m21575y(this.f33759h, this, z2, i3, str);
            }
        }

        private boolean kja0(int i2, int i3, String str) {
            if (i2 == 1) {
                return (this.f73601qrj == zy.binded || !this.f33759h.m21544c() || i3 == 21 || (i3 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i2 == 2) {
                return this.f33759h.m21544c();
            }
            if (i2 != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* JADX INFO: renamed from: n */
        public static String m21589n(String str) {
            int iLastIndexOf;
            return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(iLastIndexOf + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x2(int i2, int i3, String str) {
            boolean z2;
            zy zyVar = this.f73594cdj;
            if (zyVar == null || !(z2 = this.f73602t8r)) {
                return true;
            }
            if (zyVar == this.f73601qrj) {
                com.xiaomi.channel.commonutils.logger.zy.m19302z(" status recovered, don't notify client:" + this.f33766y);
                return false;
            }
            if (this.f73597ki == null || !z2) {
                com.xiaomi.channel.commonutils.logger.zy.m19302z("peer died, ignore notify " + this.f33766y);
                return false;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19302z("Peer alive notify status to client:" + this.f33766y);
            return true;
        }

        /* JADX INFO: renamed from: g */
        void m21591g() {
            try {
                Messenger messenger = this.f73597ki;
                if (messenger != null && this.f73596fn3e != null) {
                    messenger.getBinder().unlinkToDeath(this.f73596fn3e, 0);
                }
            } catch (Exception unused) {
            }
            this.f73594cdj = null;
        }

        /* JADX INFO: renamed from: k */
        public long m21592k() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f73600n7h + 1) * 15))) * 1000;
        }

        public void ld6(zy zyVar, int i2, int i3, String str, String str2) {
            boolean z2;
            for (InterfaceC5912k interfaceC5912k : this.f73598kja0) {
                if (interfaceC5912k != null) {
                    interfaceC5912k.mo21564k(this.f73601qrj, zyVar, i3);
                }
            }
            zy zyVar2 = this.f73601qrj;
            int i4 = 0;
            if (zyVar2 != zyVar) {
                com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", zyVar2, zyVar, m21593q(i2), dd.m21576k(i3), str, str2, this.f33766y));
                this.f73601qrj = zyVar;
            }
            if (this.f73599ld6 == null) {
                com.xiaomi.channel.commonutils.logger.zy.jk("status changed while the client dispatcher is missing");
                return;
            }
            if (zyVar == zy.binding) {
                return;
            }
            if (this.f73594cdj != null && (z2 = this.f73602t8r)) {
                i4 = (this.f73597ki == null || !z2) ? 10100 : 1000;
            }
            this.f33759h.m21542b(this.f73605zurt);
            if (kja0(i2, i3, str2)) {
                f7l8(i2, i3, str, str2);
            } else {
                this.f33759h.m21531a(this.f73605zurt.zy(i2, i3, str, str2), i4);
            }
        }

        public void n7h(InterfaceC5912k interfaceC5912k) {
            this.f73598kja0.remove(interfaceC5912k);
        }

        /* JADX INFO: renamed from: q */
        public String m21593q(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? "unknown" : "KICK" : "CLOSE" : "OPEN";
        }

        /* JADX INFO: renamed from: s */
        public void m21594s(InterfaceC5912k interfaceC5912k) {
            this.f73598kja0.add(interfaceC5912k);
        }

        /* JADX INFO: renamed from: y */
        void m21595y(Messenger messenger) {
            m21591g();
            try {
                if (messenger != null) {
                    this.f73597ki = messenger;
                    this.f73602t8r = true;
                    this.f73596fn3e = new zy(this, messenger);
                    messenger.getBinder().linkToDeath(this.f73596fn3e, 0);
                } else {
                    com.xiaomi.channel.commonutils.logger.zy.m19302z("peer linked with old sdk chid = " + this.f33766y);
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.m19302z("peer linkToDeath err: " + e2.getMessage());
                this.f73597ki = null;
                this.f73602t8r = false;
            }
        }

        public toq(XMPushService xMPushService) {
            this.f33759h = xMPushService;
            m21594s(new d2ok(this));
        }
    }
}
