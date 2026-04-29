package miuix.hybrid.feature;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.Map;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.ni7;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: miuix.hybrid.feature.n */
/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7118n implements n7h {

    /* JADX INFO: renamed from: h */
    private static final String f40185h = "disableNotification";

    /* JADX INFO: renamed from: i */
    private static final String f40186i = "metered";

    /* JADX INFO: renamed from: p */
    private static final String f40187p = "enableNotification";

    /* JADX INFO: renamed from: s */
    private static final String f40188s = "getType";

    /* JADX INFO: renamed from: y */
    private static final String f40189y = "Network";

    /* JADX INFO: renamed from: z */
    private static final String f40190z = "connected";

    /* JADX INFO: renamed from: g */
    private zurt f40191g;

    /* JADX INFO: renamed from: k */
    private IntentFilter f40192k;

    /* JADX INFO: renamed from: n */
    private toq f40193n;

    /* JADX INFO: renamed from: q */
    private C7148k f40194q;

    /* JADX INFO: renamed from: miuix.hybrid.feature.n$k */
    /* JADX INFO: compiled from: Network.java */
    class k extends zurt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ni7 f40195k;

        k(final ni7 val$nativeInterface) {
            this.f40195k = val$nativeInterface;
        }

        /* JADX INFO: renamed from: k */
        private void m25781k() {
            C7118n.this.m25777g(this.f40195k);
            C7118n.this.f40194q.m25906k(new o1t(100));
        }

        @Override // miuix.hybrid.zurt
        public void onDestroy() {
            m25781k();
        }

        @Override // miuix.hybrid.zurt
        public void onPageChange() {
            m25781k();
        }
    }

    /* JADX INFO: renamed from: miuix.hybrid.feature.n$toq */
    /* JADX INFO: compiled from: Network.java */
    private class toq extends BroadcastReceiver {
        private toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null) {
                boolean z2 = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("connected", z2);
                    C7118n.this.f40194q.m25906k(new o1t(jSONObject));
                } catch (JSONException e2) {
                    Log.e(C7118n.f40189y, e2.getMessage());
                }
            }
        }

        /* synthetic */ toq(C7118n c7118n, k kVar) {
            this();
        }
    }

    public C7118n() {
        IntentFilter intentFilter = new IntentFilter();
        this.f40192k = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m25777g(ni7 nativeInterface) {
        if (this.f40193n != null) {
            Activity qVar = nativeInterface.toq();
            nativeInterface.zy(this.f40191g);
            qVar.unregisterReceiver(this.f40193n);
            this.f40193n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private o1t m25779n(C7156z request) {
        boolean zIsActiveNetworkMetered = ((ConnectivityManager) request.zy().toq().getSystemService("connectivity")).isActiveNetworkMetered();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f40186i, zIsActiveNetworkMetered);
        } catch (JSONException e2) {
            Log.e(f40189y, e2.getMessage());
        }
        return new o1t(jSONObject);
    }

    /* JADX INFO: renamed from: q */
    private o1t m25780q(C7156z request) {
        ni7 ni7VarZy = request.zy();
        m25777g(ni7VarZy);
        Activity qVar = ni7VarZy.toq();
        this.f40194q = request.toq();
        toq toqVar = new toq(this, null);
        this.f40193n = toqVar;
        qVar.registerReceiver(toqVar, this.f40192k);
        k kVar = new k(ni7VarZy);
        this.f40191g = kVar;
        ni7VarZy.m25907k(kVar);
        return null;
    }

    private o1t zy(C7156z request) {
        m25777g(request.zy());
        return new o1t(100);
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        String strM25920k = request.m25920k();
        if (f40188s.equals(strM25920k)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (f40187p.equals(strM25920k)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (f40185h.equals(strM25920k)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        String strM25920k = request.m25920k();
        return f40188s.equals(strM25920k) ? m25779n(request) : f40187p.equals(strM25920k) ? m25780q(request) : f40185h.equals(strM25920k) ? zy(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
