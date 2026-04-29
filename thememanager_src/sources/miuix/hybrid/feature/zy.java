package miuix.hybrid.feature;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.Map;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Geolocation.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f40216g = "HybridGeolocation";

    /* JADX INFO: renamed from: h */
    private static final String f40217h = "type";

    /* JADX INFO: renamed from: p */
    private static final String f40218p = "disableListener";

    /* JADX INFO: renamed from: s */
    private static final String f40219s = "get";

    /* JADX INFO: renamed from: y */
    private static final String f40220y = "enableListener";

    /* JADX INFO: renamed from: k */
    private String f40221k = "network";

    /* JADX INFO: renamed from: n */
    private LocationListener f40222n;

    /* JADX INFO: renamed from: q */
    private C7148k f40223q;

    /* JADX INFO: compiled from: Geolocation.java */
    private class toq implements LocationListener {
        private toq() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (zy.this.f40223q != null) {
                zy.this.f40223q.m25906k(zy.this.m25784g(location));
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public o1t m25784g(Location location) {
        if (location == null) {
            Log.i(f40216g, "error: response location with null.");
            return new o1t(200, "no location");
        }
        Log.i(f40216g, "response with valid location.");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return new o1t(3, jSONObject.toString());
    }

    /* JADX INFO: renamed from: n */
    private o1t m25786n(LocationManager locationManager, final C7156z request) {
        this.f40223q = request.toq();
        if (this.f40222n == null) {
            this.f40222n = new toq();
            Looper.prepare();
            locationManager.requestLocationUpdates(this.f40221k, 0L, 0.0f, this.f40222n);
            Looper.loop();
        }
        this.f40223q.m25906k(m25784g(locationManager.getLastKnownLocation(this.f40221k)));
        return null;
    }

    /* JADX INFO: renamed from: q */
    private o1t m25787q(LocationManager locationManager, final C7156z request) {
        LocationListener locationListener = this.f40222n;
        if (locationListener != null) {
            locationManager.removeUpdates(locationListener);
            this.f40222n = null;
        }
        this.f40223q = null;
        request.toq().m25906k(new o1t(0, "remove"));
        return null;
    }

    private o1t zy(LocationManager locationManager, final C7156z request) {
        return m25784g(locationManager.getLastKnownLocation(this.f40221k));
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        return f40219s.equals(request.m25920k()) ? n7h.EnumC7150k.SYNC : n7h.EnumC7150k.CALLBACK;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        String strM25920k = request.m25920k();
        Log.i(f40216g, "invoke with action: " + strM25920k);
        LocationManager locationManager = (LocationManager) request.zy().toq().getSystemService("location");
        return f40220y.equals(strM25920k) ? m25786n(locationManager, request) : f40219s.equals(strM25920k) ? zy(locationManager, request) : f40218p.equals(strM25920k) ? m25787q(locationManager, request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
        if ("gps".equals(params.get("type"))) {
            this.f40221k = "gps";
        }
    }
}
