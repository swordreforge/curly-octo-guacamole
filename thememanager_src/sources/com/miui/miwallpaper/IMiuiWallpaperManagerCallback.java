package com.miui.miwallpaper;

import android.app.WallpaperColors;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IMiuiWallpaperManagerCallback extends IInterface {

    public static abstract class Stub extends Binder implements IMiuiWallpaperManagerCallback {
        private static final String DESCRIPTOR = "com.miui.miwallpaper.IMiuiWallpaperManagerCallback";
        static final int TRANSACTION_onPartColorComputeComplete = 2;
        static final int TRANSACTION_onWallpaperChanged = 1;

        private static class Proxy implements IMiuiWallpaperManagerCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.miui.miwallpaper.IMiuiWallpaperManagerCallback
            public void onPartColorComputeComplete(Map map, Map map2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    parcelObtain.writeMap(map2);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.miwallpaper.IMiuiWallpaperManagerCallback
            public void onWallpaperChanged(WallpaperColors wallpaperColors, String str, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (wallpaperColors != null) {
                        parcelObtain.writeInt(1);
                        wallpaperColors.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMiuiWallpaperManagerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiuiWallpaperManagerCallback)) ? new Proxy(iBinder) : (IMiuiWallpaperManagerCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onWallpaperChanged(parcel.readInt() != 0 ? (WallpaperColors) WallpaperColors.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            ClassLoader classLoader = getClass().getClassLoader();
            onPartColorComputeComplete(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
            return true;
        }
    }

    void onPartColorComputeComplete(Map map, Map map2) throws RemoteException;

    void onWallpaperChanged(WallpaperColors wallpaperColors, String str, int i2) throws RemoteException;
}
