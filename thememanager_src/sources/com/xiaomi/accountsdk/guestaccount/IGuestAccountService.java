package com.xiaomi.accountsdk.guestaccount;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.accountsdk.guestaccount.IGuestAccountIntentHandler;

/* JADX INFO: loaded from: classes3.dex */
public interface IGuestAccountService extends IInterface {

    public static abstract class Stub extends Binder implements IGuestAccountService {
        private static final String DESCRIPTOR = "com.xiaomi.accountsdk.guestaccount.IGuestAccountService";
        static final int TRANSACTION_getGuestAccount = 1;
        static final int TRANSACTION_getStoredUserId = 4;
        static final int TRANSACTION_onXiaomiAccountCTAAllowed = 3;
        static final int TRANSACTION_renewServiceToken = 2;

        private static class Proxy implements IGuestAccountService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountService
            public Bundle getGuestAccount(Bundle bundle, IGuestAccountIntentHandler iGuestAccountIntentHandler) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iGuestAccountIntentHandler != null ? iGuestAccountIntentHandler.asBinder() : null);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountService
            public Bundle getStoredUserId(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountService
            public void onXiaomiAccountCTAAllowed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountService
            public Bundle renewServiceToken(Bundle bundle, IGuestAccountIntentHandler iGuestAccountIntentHandler) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iGuestAccountIntentHandler != null ? iGuestAccountIntentHandler.asBinder() : null);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IGuestAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGuestAccountService)) ? new Proxy(iBinder) : (IGuestAccountService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                Bundle guestAccount = getGuestAccount(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IGuestAccountIntentHandler.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (guestAccount != null) {
                    parcel2.writeInt(1);
                    guestAccount.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                Bundle bundleRenewServiceToken = renewServiceToken(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IGuestAccountIntentHandler.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (bundleRenewServiceToken != null) {
                    parcel2.writeInt(1);
                    bundleRenewServiceToken.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onXiaomiAccountCTAAllowed();
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 4) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Bundle storedUserId = getStoredUserId(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (storedUserId != null) {
                parcel2.writeInt(1);
                storedUserId.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    Bundle getGuestAccount(Bundle bundle, IGuestAccountIntentHandler iGuestAccountIntentHandler) throws RemoteException;

    Bundle getStoredUserId(Bundle bundle) throws RemoteException;

    void onXiaomiAccountCTAAllowed() throws RemoteException;

    Bundle renewServiceToken(Bundle bundle, IGuestAccountIntentHandler iGuestAccountIntentHandler) throws RemoteException;
}
