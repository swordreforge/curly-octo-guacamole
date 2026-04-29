package miuix.appcompat.app.floatingactivity.multiapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import miuix.appcompat.app.floatingactivity.multiapp.IFloatingService;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingService extends Service {

    /* JADX INFO: renamed from: y */
    private static final String f38878y = "FloatingService";

    /* JADX INFO: renamed from: k */
    private final RemoteCallbackList<IServiceNotify> f38880k = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: q */
    private final SparseArray<LinkedList<String>> f38882q = new SparseArray<>();

    /* JADX INFO: renamed from: n */
    private final ConcurrentHashMap<String, Integer> f38881n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private final IFloatingService f38879g = new IFloatingService.Stub() { // from class: miuix.appcompat.app.floatingactivity.multiapp.FloatingService.1
        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.util.Pair<java.lang.String, java.lang.Integer> parseIdentity(java.lang.String r5) {
            /*
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 != 0) goto L22
                java.lang.String r0 = ":"
                java.lang.String[] r5 = r5.split(r0)
                int r0 = r5.length
                r2 = 1
                if (r0 != r2) goto L14
                r5 = r5[r1]
                goto L23
            L14:
                int r0 = r5.length
                r3 = 2
                if (r0 < r3) goto L22
                r0 = r5[r1]
                r5 = r5[r2]     // Catch: java.lang.Exception -> L20
                int r1 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L20
            L20:
                r5 = r0
                goto L23
            L22:
                r5 = 0
            L23:
                miuix.appcompat.app.floatingactivity.multiapp.FloatingService r0 = miuix.appcompat.app.floatingactivity.multiapp.FloatingService.this
                int r0 = miuix.appcompat.app.floatingactivity.multiapp.FloatingService.m24956s(r0, r1)
                android.util.Pair r1 = new android.util.Pair
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.<init>(r5, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.floatingactivity.multiapp.FloatingService.BinderC69281.parseIdentity(java.lang.String):android.util.Pair");
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
        public Bundle callServiceMethod(int i2, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            if (i2 == 6) {
                bundle2.putInt(String.valueOf(6), FloatingService.this.n7h(bundle != null ? bundle.getInt(C6934k.f86877qrj, 0) : 0));
            } else if (i2 != 7) {
                String string = null;
                if (i2 == 9) {
                    if (bundle != null) {
                        i = bundle.getInt(C6934k.f86877qrj, 0);
                        string = bundle.getString(C6934k.f86879x2);
                    }
                    bundle2.putBoolean(C6934k.f86874kja0, FloatingService.this.m24954p(i2, string, i));
                } else if (i2 != 10) {
                    FloatingService.this.m24951h(i2);
                } else {
                    if (bundle != null) {
                        i = bundle.getInt(C6934k.f86877qrj, 0);
                        string = bundle.getString(C6934k.f38915h);
                    }
                    FloatingService.this.kja0(i2, string, i);
                }
            } else {
                String strX2 = FloatingService.this.x2(bundle.getString(C6934k.f86879x2), bundle.getInt(C6934k.f86877qrj, 0));
                int iBeginBroadcast = FloatingService.this.f38880k.beginBroadcast();
                while (true) {
                    if (i >= iBeginBroadcast) {
                        break;
                    }
                    if (TextUtils.equals(strX2, FloatingService.this.f38880k.getBroadcastCookie(i).toString())) {
                        ((IServiceNotify) FloatingService.this.f38880k.getBroadcastItem(i)).notifyFromService(8, bundle);
                        break;
                    }
                    i++;
                }
                FloatingService.this.f38880k.finishBroadcast();
            }
            return bundle2;
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
        public int registerServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException {
            Pair<String, Integer> identity = parseIdentity(str);
            String str2 = (String) identity.first;
            int iIntValue = ((Integer) identity.second).intValue();
            LinkedList linkedList = (LinkedList) FloatingService.this.f38882q.get(iIntValue);
            if (linkedList == null) {
                linkedList = new LinkedList();
                FloatingService.this.f38882q.put(iIntValue, linkedList);
            } else {
                linkedList.remove(str2);
            }
            FloatingService.this.f38880k.unregister(iServiceNotify);
            int registeredCallbackCount = FloatingService.this.f38880k.getRegisteredCallbackCount();
            FloatingService.this.f38880k.register(iServiceNotify, str2);
            linkedList.add(str2);
            return registeredCallbackCount;
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
        public void unregisterServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException {
            Pair<String, Integer> identity = parseIdentity(str);
            String str2 = (String) identity.first;
            int iIntValue = ((Integer) identity.second).intValue();
            LinkedList linkedList = (LinkedList) FloatingService.this.f38882q.get(iIntValue);
            if (linkedList != null) {
                linkedList.remove(str2);
                if (linkedList.isEmpty()) {
                    FloatingService.this.f38882q.remove(iIntValue);
                }
            }
            FloatingService.this.f38880k.unregister(iServiceNotify);
            FloatingService.this.f38881n.remove(str2);
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
        public void upDateRemoteActivityInfo(String str, int i2) throws RemoteException {
            FloatingService.this.f38881n.put((String) parseIdentity(str).first, Integer.valueOf(i2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m24951h(int i2) throws RemoteException {
        int iBeginBroadcast = this.f38880k.beginBroadcast();
        for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
            ((IServiceNotify) this.f38880k.getBroadcastItem(i3)).notifyFromService(i2, null);
        }
        this.f38880k.finishBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0(int i2, String str, int i3) throws RemoteException {
        if (str == null) {
            return;
        }
        int iBeginBroadcast = this.f38880k.beginBroadcast();
        String strX2 = x2(str, qrj(i3));
        int i4 = 0;
        while (true) {
            if (i4 >= iBeginBroadcast) {
                break;
            }
            if (TextUtils.equals(strX2, this.f38880k.getBroadcastCookie(i4).toString())) {
                ((IServiceNotify) this.f38880k.getBroadcastItem(i4)).notifyFromService(i2, null);
                break;
            }
            i4++;
        }
        this.f38880k.finishBroadcast();
    }

    private String ld6(String str, int i2) {
        Integer num = this.f38881n.get(str);
        int iIntValue = num == null ? -1 : num.intValue() + 1;
        for (String str2 : this.f38881n.keySet()) {
            Integer num2 = this.f38881n.get(str2);
            if (num2 != null && num2.intValue() == iIntValue) {
                return str2;
            }
        }
        boolean zEquals = false;
        LinkedList<String> linkedList = this.f38882q.get(qrj(i2));
        if (linkedList == null) {
            return null;
        }
        for (String str3 : linkedList) {
            if (zEquals) {
                return str3;
            }
            zEquals = TextUtils.equals(str, str3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n7h(int i2) {
        LinkedList<String> linkedList = this.f38882q.get(qrj(i2));
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r0 = ((miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify) r3.f38880k.getBroadcastItem(r6)).notifyFromService(r4, null).getBoolean(miuix.appcompat.app.floatingactivity.multiapp.C6934k.f86874kja0);
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m24954p(int r4, java.lang.String r5, int r6) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.os.RemoteCallbackList<miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify> r1 = r3.f38880k     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            java.lang.String r5 = r3.ld6(r5, r6)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            r6 = r0
        Lf:
            if (r6 >= r1) goto L43
            android.os.RemoteCallbackList<miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify> r2 = r3.f38880k     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            java.lang.Object r2 = r2.getBroadcastCookie(r6)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            boolean r2 = android.text.TextUtils.equals(r5, r2)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            if (r2 == 0) goto L36
            android.os.RemoteCallbackList<miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify> r5 = r3.f38880k     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            android.os.IInterface r5 = r5.getBroadcastItem(r6)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify r5 = (miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify) r5     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            r6 = 0
            android.os.Bundle r4 = r5.notifyFromService(r4, r6)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            java.lang.String r5 = "check_finishing"
            boolean r4 = r4.getBoolean(r5)     // Catch: java.lang.Throwable -> L39 android.os.RemoteException -> L3b
            r0 = r4
            goto L43
        L36:
            int r6 = r6 + 1
            goto Lf
        L39:
            r4 = move-exception
            goto L49
        L3b:
            r4 = move-exception
            java.lang.String r5 = "FloatingService"
            java.lang.String r6 = "checkFinishing is faulty"
            android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> L39
        L43:
            android.os.RemoteCallbackList<miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify> r4 = r3.f38880k
            r4.finishBroadcast()
            return r0
        L49:
            android.os.RemoteCallbackList<miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify> r5 = r3.f38880k
            r5.finishBroadcast()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.floatingactivity.multiapp.FloatingService.m24954p(int, java.lang.String, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int qrj(int i2) {
        return (i2 != 0 || this.f38882q.size() <= 0) ? i2 : this.f38882q.keyAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String x2(String str, int i2) {
        LinkedList<String> linkedList = this.f38882q.get(qrj(i2));
        String str2 = null;
        if (linkedList != null) {
            for (String str3 : linkedList) {
                if (TextUtils.equals(str, str3)) {
                    break;
                }
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.app.Service
    @dd
    public IBinder onBind(Intent intent) {
        return this.f38879g.asBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }
}
