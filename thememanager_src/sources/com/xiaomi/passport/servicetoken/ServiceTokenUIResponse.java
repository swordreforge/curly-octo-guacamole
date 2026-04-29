package com.xiaomi.passport.servicetoken;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.passport.servicetoken.IServiceTokenUIResponse;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceTokenUIResponse implements Parcelable {
    public static final Parcelable.Creator<ServiceTokenUIResponse> CREATOR = new Parcelable.Creator<ServiceTokenUIResponse>() { // from class: com.xiaomi.passport.servicetoken.ServiceTokenUIResponse.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ServiceTokenUIResponse createFromParcel(Parcel parcel) {
            return new ServiceTokenUIResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ServiceTokenUIResponse[] newArray(int i2) {
            return new ServiceTokenUIResponse[i2];
        }
    };
    private static final String TAG = "ServiceTokenUIResponse";
    private IServiceTokenUIResponse mResponse;

    public ServiceTokenUIResponse(IServiceTokenUIResponse iServiceTokenUIResponse) {
        this.mResponse = iServiceTokenUIResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public void m20447k(int i2, String str) {
        if (Log.isLoggable(TAG, 2)) {
            AbstractC5574n.zurt(TAG, "AccountAuthenticatorResponse.onError: " + i2 + ", " + str);
        }
        try {
            this.mResponse.onError(i2, str);
        } catch (RemoteException unused) {
        }
    }

    public void toq() {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "AccountAuthenticatorResponse.onRequestContinued");
        }
        try {
            this.mResponse.onRequestContinued();
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }

    public void zy(Bundle bundle) {
        if (Log.isLoggable(TAG, 2)) {
            bundle.keySet();
            AbstractC5574n.zurt(TAG, "AccountAuthenticatorResponse.onResult");
        }
        try {
            this.mResponse.onResult(bundle);
        } catch (RemoteException unused) {
        }
    }

    public ServiceTokenUIResponse(Parcel parcel) {
        this.mResponse = IServiceTokenUIResponse.Stub.asInterface(parcel.readStrongBinder());
    }
}
