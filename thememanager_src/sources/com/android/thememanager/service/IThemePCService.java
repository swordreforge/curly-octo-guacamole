package com.android.thememanager.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IThemePCService extends IInterface {

    public static class Default implements IThemePCService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String deleteResources(String componentStamp, String localIds) throws RemoteException {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String getEnvironment() throws RemoteException {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String getLocalResources(String componentStamp) throws RemoteException {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String importBareResource(String path, String name, String moduleId) throws RemoteException {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String importResource(String path) throws RemoteException {
            return null;
        }

        @Override // com.android.thememanager.service.IThemePCService
        public String updateResource(String path, String componentStamp, String localId) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IThemePCService {
        private static final String DESCRIPTOR = "com.android.thememanager.service.IThemePCService";
        static final int TRANSACTION_deleteResources = 6;
        static final int TRANSACTION_getEnvironment = 1;
        static final int TRANSACTION_getLocalResources = 5;
        static final int TRANSACTION_importBareResource = 4;
        static final int TRANSACTION_importResource = 2;
        static final int TRANSACTION_updateResource = 3;

        private static class Proxy implements IThemePCService {
            public static IThemePCService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String deleteResources(String componentStamp, String localIds) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(componentStamp);
                    parcelObtain.writeString(localIds);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteResources(componentStamp, localIds);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String getEnvironment() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEnvironment();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String getLocalResources(String componentStamp) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(componentStamp);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalResources(componentStamp);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String importBareResource(String path, String name, String moduleId) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(path);
                    parcelObtain.writeString(name);
                    parcelObtain.writeString(moduleId);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().importBareResource(path, name, moduleId);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String importResource(String path) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(path);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().importResource(path);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.android.thememanager.service.IThemePCService
            public String updateResource(String path, String componentStamp, String localId) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(path);
                    parcelObtain.writeString(componentStamp);
                    parcelObtain.writeString(localId);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateResource(path, componentStamp, localId);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IThemePCService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IThemePCService)) ? new Proxy(obj) : (IThemePCService) iInterfaceQueryLocalInterface;
        }

        public static IThemePCService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IThemePCService impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            Proxy.sDefaultImpl = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(DESCRIPTOR);
                    String environment = getEnvironment();
                    reply.writeNoException();
                    reply.writeString(environment);
                    return true;
                case 2:
                    data.enforceInterface(DESCRIPTOR);
                    String strImportResource = importResource(data.readString());
                    reply.writeNoException();
                    reply.writeString(strImportResource);
                    return true;
                case 3:
                    data.enforceInterface(DESCRIPTOR);
                    String strUpdateResource = updateResource(data.readString(), data.readString(), data.readString());
                    reply.writeNoException();
                    reply.writeString(strUpdateResource);
                    return true;
                case 4:
                    data.enforceInterface(DESCRIPTOR);
                    String strImportBareResource = importBareResource(data.readString(), data.readString(), data.readString());
                    reply.writeNoException();
                    reply.writeString(strImportBareResource);
                    return true;
                case 5:
                    data.enforceInterface(DESCRIPTOR);
                    String localResources = getLocalResources(data.readString());
                    reply.writeNoException();
                    reply.writeString(localResources);
                    return true;
                case 6:
                    data.enforceInterface(DESCRIPTOR);
                    String strDeleteResources = deleteResources(data.readString(), data.readString());
                    reply.writeNoException();
                    reply.writeString(strDeleteResources);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    String deleteResources(String componentStamp, String localIds) throws RemoteException;

    String getEnvironment() throws RemoteException;

    String getLocalResources(String componentStamp) throws RemoteException;

    String importBareResource(String path, String name, String moduleId) throws RemoteException;

    String importResource(String path) throws RemoteException;

    String updateResource(String path, String componentStamp, String localId) throws RemoteException;
}
