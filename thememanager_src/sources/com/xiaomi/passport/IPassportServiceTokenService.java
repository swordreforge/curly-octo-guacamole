package com.xiaomi.passport;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;

/* JADX INFO: loaded from: classes3.dex */
public interface IPassportServiceTokenService extends IInterface {

    public static abstract class Stub extends Binder implements IPassportServiceTokenService {
        private static final String DESCRIPTOR = "com.xiaomi.passport.IPassportServiceTokenService";
        static final int TRANSACTION_fastCheckSlhPhCompatibility = 4;
        static final int TRANSACTION_getAccountVisible = 7;
        static final int TRANSACTION_getServiceToken = 1;
        static final int TRANSACTION_invalidateServiceToken = 2;
        static final int TRANSACTION_setAccountVisible = 6;
        static final int TRANSACTION_supportAccessAccount = 5;
        static final int TRANSACTION_supportServiceTokenUIResponse = 3;

        private static class Proxy implements IPassportServiceTokenService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public boolean fastCheckSlhPhCompatibility() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public XmAccountVisibility getAccountVisible(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? XmAccountVisibility.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public ServiceTokenResult getServiceToken(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServiceTokenResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public ServiceTokenResult invalidateServiceToken(ServiceTokenResult serviceTokenResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (serviceTokenResult != null) {
                        parcelObtain.writeInt(1);
                        serviceTokenResult.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServiceTokenResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public XmAccountVisibility setAccountVisible(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? XmAccountVisibility.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public boolean supportAccessAccount() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.IPassportServiceTokenService
            public boolean supportServiceTokenUIResponse() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPassportServiceTokenService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPassportServiceTokenService)) ? new Proxy(iBinder) : (IPassportServiceTokenService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    ServiceTokenResult serviceToken = getServiceToken(parcel.readString());
                    parcel2.writeNoException();
                    if (serviceToken != null) {
                        parcel2.writeInt(1);
                        serviceToken.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    ServiceTokenResult serviceTokenResultInvalidateServiceToken = invalidateServiceToken(parcel.readInt() != 0 ? ServiceTokenResult.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (serviceTokenResultInvalidateServiceToken != null) {
                        parcel2.writeInt(1);
                        serviceTokenResultInvalidateServiceToken.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSupportServiceTokenUIResponse = supportServiceTokenUIResponse();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportServiceTokenUIResponse ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zFastCheckSlhPhCompatibility = fastCheckSlhPhCompatibility();
                    parcel2.writeNoException();
                    parcel2.writeInt(zFastCheckSlhPhCompatibility ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSupportAccessAccount = supportAccessAccount();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportAccessAccount ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    XmAccountVisibility accountVisible = setAccountVisible(parcel.readString());
                    parcel2.writeNoException();
                    if (accountVisible != null) {
                        parcel2.writeInt(1);
                        accountVisible.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    XmAccountVisibility accountVisible2 = getAccountVisible(parcel.readString());
                    parcel2.writeNoException();
                    if (accountVisible2 != null) {
                        parcel2.writeInt(1);
                        accountVisible2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    boolean fastCheckSlhPhCompatibility() throws RemoteException;

    XmAccountVisibility getAccountVisible(String str) throws RemoteException;

    ServiceTokenResult getServiceToken(String str) throws RemoteException;

    ServiceTokenResult invalidateServiceToken(ServiceTokenResult serviceTokenResult) throws RemoteException;

    XmAccountVisibility setAccountVisible(String str) throws RemoteException;

    boolean supportAccessAccount() throws RemoteException;

    boolean supportServiceTokenUIResponse() throws RemoteException;
}
