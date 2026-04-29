package android.service.wallpaper;

import android.app.WallpaperColors;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperEngine;

/* JADX INFO: loaded from: classes.dex */
public interface IWallpaperConnection extends IInterface {

    public static class Default implements IWallpaperConnection {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void attachEngine(IWallpaperEngine engine, int displayId) throws RemoteException {
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void engineShown(IWallpaperEngine engine) throws RemoteException {
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void onWallpaperColorsChanged(WallpaperColors colors, int displayId) throws RemoteException {
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public ParcelFileDescriptor setWallpaper(String name) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWallpaperConnection {
        private static final String DESCRIPTOR = "android.service.wallpaper.IWallpaperConnection";
        static final int TRANSACTION_attachEngine = 1;
        static final int TRANSACTION_engineShown = 2;
        static final int TRANSACTION_onWallpaperColorsChanged = 4;
        static final int TRANSACTION_setWallpaper = 3;

        private static class Proxy implements IWallpaperConnection {
            public static IWallpaperConnection sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.service.wallpaper.IWallpaperConnection
            public void attachEngine(IWallpaperEngine engine, int displayId) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(engine != null ? engine.asBinder() : null);
                    parcelObtain.writeInt(displayId);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().attachEngine(engine, displayId);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.service.wallpaper.IWallpaperConnection
            public void engineShown(IWallpaperEngine engine) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(engine != null ? engine.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().engineShown(engine);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.service.wallpaper.IWallpaperConnection
            public void onWallpaperColorsChanged(WallpaperColors colors, int displayId) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (colors != null) {
                        parcelObtain.writeInt(1);
                        colors.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(displayId);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onWallpaperColorsChanged(colors, displayId);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.service.wallpaper.IWallpaperConnection
            public ParcelFileDescriptor setWallpaper(String name) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(name);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setWallpaper(name);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWallpaperConnection asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWallpaperConnection)) ? new Proxy(obj) : (IWallpaperConnection) iInterfaceQueryLocalInterface;
        }

        public static IWallpaperConnection getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWallpaperConnection impl) {
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
            if (code == 1) {
                data.enforceInterface(DESCRIPTOR);
                attachEngine(IWallpaperEngine.Stub.asInterface(data.readStrongBinder()), data.readInt());
                reply.writeNoException();
                return true;
            }
            if (code == 2) {
                data.enforceInterface(DESCRIPTOR);
                engineShown(IWallpaperEngine.Stub.asInterface(data.readStrongBinder()));
                reply.writeNoException();
                return true;
            }
            if (code == 3) {
                data.enforceInterface(DESCRIPTOR);
                ParcelFileDescriptor wallpaper = setWallpaper(data.readString());
                reply.writeNoException();
                if (wallpaper != null) {
                    reply.writeInt(1);
                    wallpaper.writeToParcel(reply, 1);
                } else {
                    reply.writeInt(0);
                }
                return true;
            }
            if (code != 4) {
                if (code != 1598968902) {
                    return super.onTransact(code, data, reply, flags);
                }
                reply.writeString(DESCRIPTOR);
                return true;
            }
            data.enforceInterface(DESCRIPTOR);
            onWallpaperColorsChanged(data.readInt() != 0 ? (WallpaperColors) WallpaperColors.CREATOR.createFromParcel(data) : null, data.readInt());
            reply.writeNoException();
            return true;
        }
    }

    void attachEngine(IWallpaperEngine engine, int displayId) throws RemoteException;

    void engineShown(IWallpaperEngine engine) throws RemoteException;

    void onWallpaperColorsChanged(WallpaperColors colors, int displayId) throws RemoteException;

    ParcelFileDescriptor setWallpaper(String name) throws RemoteException;
}
