package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new Parcelable.Creator<Requirements>() { // from class: com.google.android.exoplayer2.scheduler.Requirements.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i2) {
            return new Requirements[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final int f21193g = 4;

    /* JADX INFO: renamed from: n */
    public static final int f21194n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f21195q = 1;

    /* JADX INFO: renamed from: s */
    public static final int f21196s = 16;

    /* JADX INFO: renamed from: y */
    public static final int f21197y = 8;

    /* JADX INFO: renamed from: k */
    private final int f21198k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.Requirements$k */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3557k {
    }

    public Requirements(int i2) {
        this.f21198k = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m12530h(ConnectivityManager connectivityManager) {
        if (lrht.f23230k < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    private boolean ld6(Context context) {
        PowerManager powerManager = (PowerManager) C3844k.f7l8(context.getSystemService("power"));
        int i2 = lrht.f23230k;
        if (i2 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i2 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m12531p(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean zurt(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    private int zy(Context context) {
        if (!t8r()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C3844k.f7l8(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m12530h(connectivityManager)) ? (fu4() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f21198k & 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f21198k == ((Requirements) obj).f21198k;
    }

    public int f7l8() {
        return this.f21198k;
    }

    public boolean fu4() {
        return (this.f21198k & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public int m12532g(Context context) {
        int iZy = zy(context);
        if (m12534y() && !m12531p(context)) {
            iZy |= 8;
        }
        if (x2() && !ld6(context)) {
            iZy |= 4;
        }
        return (!ni7() || zurt(context)) ? iZy : iZy | 16;
    }

    public int hashCode() {
        return this.f21198k;
    }

    /* JADX INFO: renamed from: k */
    public boolean m12533k(Context context) {
        return m12532g(context) == 0;
    }

    public boolean ni7() {
        return (this.f21198k & 16) != 0;
    }

    public boolean t8r() {
        return (this.f21198k & 1) != 0;
    }

    public Requirements toq(int i2) {
        int i3 = this.f21198k;
        int i4 = i2 & i3;
        return i4 == i3 ? this : new Requirements(i4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f21198k);
    }

    public boolean x2() {
        return (this.f21198k & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m12534y() {
        return (this.f21198k & 8) != 0;
    }
}
