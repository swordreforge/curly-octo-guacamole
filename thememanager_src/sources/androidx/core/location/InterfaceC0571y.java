package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.location.y */
/* JADX INFO: compiled from: LocationListenerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0571y extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i2) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@lvui List<Location> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            onLocationChanged(list.get(i2));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@lvui String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@lvui String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@lvui String str, int i2, @dd Bundle bundle) {
    }
}
