package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: androidx.localbroadcastmanager.content.k */
/* JADX INFO: compiled from: LocalBroadcastManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0962k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f51633f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static final String f5185g = "LocalBroadcastManager";

    /* JADX INFO: renamed from: p */
    private static C0962k f5186p = null;

    /* JADX INFO: renamed from: s */
    private static final Object f5187s = new Object();

    /* JADX INFO: renamed from: y */
    static final int f5188y = 1;

    /* JADX INFO: renamed from: k */
    private final Context f5189k;

    /* JADX INFO: renamed from: n */
    private final Handler f5190n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<zy>> f51634toq = new HashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final HashMap<String, ArrayList<zy>> f51635zy = new HashMap<>();

    /* JADX INFO: renamed from: q */
    private final ArrayList<toq> f5191q = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.k$k */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    class k extends Handler {
        k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C0962k.this.m4541k();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.k$toq */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        final Intent f5193k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final ArrayList<zy> f51636toq;

        toq(Intent intent, ArrayList<zy> arrayList) {
            this.f5193k = intent;
            this.f51636toq = arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.k$zy */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        final IntentFilter f5194k;

        /* JADX INFO: renamed from: q */
        boolean f5195q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final BroadcastReceiver f51637toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f51638zy;

        zy(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f5194k = intentFilter;
            this.f51637toq = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f51637toq);
            sb.append(" filter=");
            sb.append(this.f5194k);
            if (this.f5195q) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C0962k(Context context) {
        this.f5189k = context;
        this.f5190n = new k(context.getMainLooper());
    }

    @lvui
    public static C0962k toq(@lvui Context context) {
        C0962k c0962k;
        synchronized (f5187s) {
            if (f5186p == null) {
                f5186p = new C0962k(context.getApplicationContext());
            }
            c0962k = f5186p;
        }
        return c0962k;
    }

    /* JADX INFO: renamed from: g */
    public void m4540g(@lvui BroadcastReceiver broadcastReceiver) {
        synchronized (this.f51634toq) {
            ArrayList<zy> arrayListRemove = this.f51634toq.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                zy zyVar = arrayListRemove.get(size);
                zyVar.f5195q = true;
                for (int i2 = 0; i2 < zyVar.f5194k.countActions(); i2++) {
                    String action = zyVar.f5194k.getAction(i2);
                    ArrayList<zy> arrayList = this.f51635zy.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            zy zyVar2 = arrayList.get(size2);
                            if (zyVar2.f51637toq == broadcastReceiver) {
                                zyVar2.f5195q = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f51635zy.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m4541k() {
        int size;
        toq[] toqVarArr;
        while (true) {
            synchronized (this.f51634toq) {
                size = this.f5191q.size();
                if (size <= 0) {
                    return;
                }
                toqVarArr = new toq[size];
                this.f5191q.toArray(toqVarArr);
                this.f5191q.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                toq toqVar = toqVarArr[i2];
                int size2 = toqVar.f51636toq.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    zy zyVar = toqVar.f51636toq.get(i3);
                    if (!zyVar.f5195q) {
                        zyVar.f51637toq.onReceive(this.f5189k, toqVar.f5193k);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4542n(@lvui Intent intent) {
        if (m4543q(intent)) {
            m4541k();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m4543q(@lvui Intent intent) {
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList<zy> arrayList2;
        String str2;
        synchronized (this.f51634toq) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f5189k.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                Log.v(f5185g, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<zy> arrayList3 = this.f51635zy.get(intent.getAction());
            if (arrayList3 != null) {
                if (z2) {
                    Log.v(f5185g, "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    zy zyVar = arrayList3.get(i3);
                    if (z2) {
                        Log.v(f5185g, "Matching against filter " + zyVar.f5194k);
                    }
                    if (zyVar.f51638zy) {
                        if (z2) {
                            Log.v(f5185g, "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i3;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = zyVar.f5194k.match(action, strResolveTypeIfNeeded, scheme, data, categories, f5185g);
                        if (iMatch >= 0) {
                            if (z2) {
                                Log.v(f5185g, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(zyVar);
                            zyVar.f51638zy = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z2) {
                            Log.v(f5185g, "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((zy) arrayList5.get(i4)).f51638zy = false;
                    }
                    this.f5191q.add(new toq(intent, arrayList5));
                    if (!this.f5190n.hasMessages(1)) {
                        this.f5190n.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void zy(@lvui BroadcastReceiver broadcastReceiver, @lvui IntentFilter intentFilter) {
        synchronized (this.f51634toq) {
            zy zyVar = new zy(intentFilter, broadcastReceiver);
            ArrayList<zy> arrayList = this.f51634toq.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f51634toq.put(broadcastReceiver, arrayList);
            }
            arrayList.add(zyVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<zy> arrayList2 = this.f51635zy.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f51635zy.put(action, arrayList2);
                }
                arrayList2.add(zyVar);
            }
        }
    }
}
