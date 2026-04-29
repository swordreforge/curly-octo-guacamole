package com.miui.systemAdSolution.miFamily;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface IMiFamilyService extends IInterface {

    public static abstract class Stub extends Binder implements IMiFamilyService {
        private static final String DESCRIPTOR = "com.miui.systemAdSolution.miFamily.IMiFamilyService";
        static final int TRANSACTION_getMiFamilyBigImagePath = 7;
        static final int TRANSACTION_getMiFamilyLogoPath = 3;
        static final int TRANSACTION_getMiFamilyTitle = 4;
        static final int TRANSACTION_getMiFamilyUrl = 2;
        static final int TRANSACTION_showMiFamily = 1;
        static final int TRANSACTION_trackClick = 6;
        static final int TRANSACTION_trackView = 5;

        private static class Proxy implements IMiFamilyService {
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

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public String getMiFamilyBigImagePath() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public String getMiFamilyLogoPath() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public String getMiFamilyTitle() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public String getMiFamilyUrl(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public boolean showMiFamily() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public void trackClick(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.miFamily.IMiFamilyService
            public void trackView(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMiFamilyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiFamilyService)) ? new Proxy(iBinder) : (IMiFamilyService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zShowMiFamily = showMiFamily();
                    parcel2.writeNoException();
                    parcel2.writeInt(zShowMiFamily ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String miFamilyUrl = getMiFamilyUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(miFamilyUrl);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String miFamilyLogoPath = getMiFamilyLogoPath();
                    parcel2.writeNoException();
                    parcel2.writeString(miFamilyLogoPath);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String miFamilyTitle = getMiFamilyTitle();
                    parcel2.writeNoException();
                    parcel2.writeString(miFamilyTitle);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    trackView(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    trackClick(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String miFamilyBigImagePath = getMiFamilyBigImagePath();
                    parcel2.writeNoException();
                    parcel2.writeString(miFamilyBigImagePath);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    String getMiFamilyBigImagePath();

    String getMiFamilyLogoPath();

    String getMiFamilyTitle();

    String getMiFamilyUrl(String str);

    boolean showMiFamily();

    void trackClick(String str);

    void trackView(String str);
}
