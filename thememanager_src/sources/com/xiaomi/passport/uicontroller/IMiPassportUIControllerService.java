package com.xiaomi.passport.uicontroller;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.MiLoginResult;
import com.xiaomi.accountsdk.account.data.NotificationAuthResult;
import com.xiaomi.accountsdk.account.data.NotificationLoginEndParams;
import com.xiaomi.accountsdk.account.data.PasswordLoginParams;
import com.xiaomi.accountsdk.account.data.Step2LoginParams;

/* JADX INFO: loaded from: classes3.dex */
public interface IMiPassportUIControllerService extends IInterface {

    public static abstract class Stub extends Binder implements IMiPassportUIControllerService {
        private static final String DESCRIPTOR = "com.xiaomi.passport.uicontroller.IMiPassportUIControllerService";
        static final int TRANSACTION_addOrUpdateAccountManager = 4;
        static final int TRANSACTION_loginByPassword = 1;
        static final int TRANSACTION_loginByStep2 = 3;
        static final int TRANSACTION_onNotificationAuthEnd = 5;
        static final int TRANSACTION_onNotificationLoginEnd = 2;

        private static class Proxy implements IMiPassportUIControllerService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.xiaomi.passport.uicontroller.IMiPassportUIControllerService
            public void addOrUpdateAccountManager(AccountInfo accountInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (accountInfo != null) {
                        parcelObtain.writeInt(1);
                        accountInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.passport.uicontroller.IMiPassportUIControllerService
            public MiLoginResult loginByPassword(PasswordLoginParams passwordLoginParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (passwordLoginParams != null) {
                        parcelObtain.writeInt(1);
                        passwordLoginParams.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MiLoginResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.uicontroller.IMiPassportUIControllerService
            public MiLoginResult loginByStep2(Step2LoginParams step2LoginParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (step2LoginParams != null) {
                        parcelObtain.writeInt(1);
                        step2LoginParams.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MiLoginResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.uicontroller.IMiPassportUIControllerService
            public NotificationAuthResult onNotificationAuthEnd(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? NotificationAuthResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.passport.uicontroller.IMiPassportUIControllerService
            public MiLoginResult onNotificationLoginEnd(NotificationLoginEndParams notificationLoginEndParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (notificationLoginEndParams != null) {
                        parcelObtain.writeInt(1);
                        notificationLoginEndParams.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MiLoginResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMiPassportUIControllerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiPassportUIControllerService)) ? new Proxy(iBinder) : (IMiPassportUIControllerService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                MiLoginResult miLoginResultLoginByPassword = loginByPassword(parcel.readInt() != 0 ? PasswordLoginParams.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (miLoginResultLoginByPassword != null) {
                    parcel2.writeInt(1);
                    miLoginResultLoginByPassword.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                MiLoginResult miLoginResultOnNotificationLoginEnd = onNotificationLoginEnd(parcel.readInt() != 0 ? NotificationLoginEndParams.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (miLoginResultOnNotificationLoginEnd != null) {
                    parcel2.writeInt(1);
                    miLoginResultOnNotificationLoginEnd.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                MiLoginResult miLoginResultLoginByStep2 = loginByStep2(parcel.readInt() != 0 ? Step2LoginParams.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (miLoginResultLoginByStep2 != null) {
                    parcel2.writeInt(1);
                    miLoginResultLoginByStep2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                addOrUpdateAccountManager(parcel.readInt() != 0 ? AccountInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 5) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            NotificationAuthResult notificationAuthResultOnNotificationAuthEnd = onNotificationAuthEnd(parcel.readString());
            parcel2.writeNoException();
            if (notificationAuthResultOnNotificationAuthEnd != null) {
                parcel2.writeInt(1);
                notificationAuthResultOnNotificationAuthEnd.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void addOrUpdateAccountManager(AccountInfo accountInfo) throws RemoteException;

    MiLoginResult loginByPassword(PasswordLoginParams passwordLoginParams) throws RemoteException;

    MiLoginResult loginByStep2(Step2LoginParams step2LoginParams) throws RemoteException;

    NotificationAuthResult onNotificationAuthEnd(String str) throws RemoteException;

    MiLoginResult onNotificationLoginEnd(NotificationLoginEndParams notificationLoginEndParams) throws RemoteException;
}
