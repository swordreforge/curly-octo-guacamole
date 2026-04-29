package miuix.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import miuix.core.util.cdj;
import zy.lrht;

/* JADX INFO: renamed from: miuix.net.k */
/* JADX INFO: compiled from: ConnectivityHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7209k {

    /* JADX INFO: renamed from: n */
    private static final String f40696n = "ConnectivityHelper";

    /* JADX INFO: renamed from: q */
    private static final cdj<C7209k> f40697q = new k();

    /* JADX INFO: renamed from: k */
    private ConnectivityManager f40698k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WifiManager f87860toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f87861zy;

    /* JADX INFO: renamed from: miuix.net.k$k */
    /* JADX INFO: compiled from: ConnectivityHelper.java */
    class k extends cdj<C7209k> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // miuix.core.util.cdj
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public C7209k toq(Object obj) {
            return new C7209k((Context) obj, null);
        }
    }

    /* synthetic */ C7209k(Context context, k kVar) {
        this(context);
    }

    /* JADX INFO: renamed from: k */
    public static C7209k m26157k(Context context) {
        return f40697q.m25525q(context);
    }

    @lrht("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: n */
    public boolean m26158n() {
        NetworkInfo activeNetworkInfo = this.f40698k.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    @lrht("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: q */
    public boolean m26159q() {
        NetworkInfo activeNetworkInfo = this.f40698k.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || this.f40698k.isActiveNetworkMetered()) ? false : true;
    }

    public ConnectivityManager toq() {
        return this.f40698k;
    }

    @lrht("android.permission.ACCESS_NETWORK_STATE")
    public boolean zy() {
        NetworkInfo activeNetworkInfo = this.f40698k.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private C7209k(Context context) {
        this.f40698k = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
