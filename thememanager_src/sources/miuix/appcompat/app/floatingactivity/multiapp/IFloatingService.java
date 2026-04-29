package miuix.appcompat.app.floatingactivity.multiapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public interface IFloatingService extends IInterface {

    public static abstract class Stub extends Binder implements IFloatingService {
        private static final String DESCRIPTOR = "miuix.appcompat.app.floatingactivity.multiapp.IFloatingService";
        static final int TRANSACTION_callServiceMethod = 2;
        static final int TRANSACTION_registerServiceNotify = 3;
        static final int TRANSACTION_unregisterServiceNotify = 4;
        static final int TRANSACTION_updateActivity = 5;

        private static class Proxy implements IFloatingService {
            private final IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
            public Bundle callServiceMethod(int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeBundle(bundle);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    Bundle bundle2 = parcelObtain2.readBundle(getClass().getClassLoader());
                    parcelObtain2.readException();
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
            public int registerServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iServiceNotify == null ? null : iServiceNotify.asBinder());
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    int i2 = parcelObtain2.readInt();
                    parcelObtain2.readException();
                    return i2;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
            public void unregisterServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iServiceNotify == null ? null : iServiceNotify.asBinder());
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.IFloatingService
            public void upDateRemoteActivityInfo(String str, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFloatingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            return iBinder.queryLocalInterface(DESCRIPTOR) instanceof IFloatingService ? (IFloatingService) iBinder : new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i2, @lvui Parcel parcel, @dd Parcel parcel2, int i3) throws RemoteException {
            if (parcel2 == null) {
                return super.onTransact(i2, parcel, null, i3);
            }
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                parcel2.writeBundle(callServiceMethod(parcel.readInt(), parcel.readBundle(getClass().getClassLoader())));
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                parcel2.writeInt(registerServiceNotify(IServiceNotify.Stub.asInterface(parcel.readStrongBinder()), parcel.readString()));
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterServiceNotify(IServiceNotify.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
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
            upDateRemoteActivityInfo(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    Bundle callServiceMethod(int i2, Bundle bundle) throws RemoteException;

    int registerServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException;

    void unregisterServiceNotify(IServiceNotify iServiceNotify, String str) throws RemoteException;

    void upDateRemoteActivityInfo(String str, int i2) throws RemoteException;
}
