package com.miui.systemAdSolution.changeSkin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miui.systemAdSolution.common.AdTrackType;
import com.miui.systemAdSolution.common.EnumPracle;

/* JADX INFO: loaded from: classes3.dex */
public interface IChangeSkinService extends IInterface {

    public static abstract class Stub extends Binder implements IChangeSkinService {
        private static final String DESCRIPTOR = "com.miui.systemAdSolution.changeSkin.IChangeSkinService";
        static final int TRANSACTION_doTrack = 2;
        static final int TRANSACTION_exec = 3;
        static final int TRANSACTION_getSkinInfoByTagId = 1;

        private static class Proxy implements IChangeSkinService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.systemAdSolution.changeSkin.IChangeSkinService
            public boolean doTrack(String str, String str2, AdTrackType adTrackType, String str3, long j2, long j3, long j4) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (adTrackType != null) {
                        parcelObtain.writeInt(1);
                        adTrackType.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str3);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeLong(j4);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.systemAdSolution.changeSkin.IChangeSkinService
            public String exec(EnumPracle enumPracle, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (enumPracle != null) {
                        parcelObtain.writeInt(1);
                        enumPracle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
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

            @Override // com.miui.systemAdSolution.changeSkin.IChangeSkinService
            public String getSkinInfoByTagId(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
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

        public static IChangeSkinService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IChangeSkinService)) ? new Proxy(iBinder) : (IChangeSkinService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String skinInfoByTagId = getSkinInfoByTagId(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(skinInfoByTagId);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zDoTrack = doTrack(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AdTrackType.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(zDoTrack ? 1 : 0);
                return true;
            }
            if (i2 != 3) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String strExec = exec(parcel.readInt() != 0 ? EnumPracle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strExec);
            return true;
        }
    }

    boolean doTrack(String str, String str2, AdTrackType adTrackType, String str3, long j2, long j3, long j4);

    String exec(EnumPracle enumPracle, String str);

    String getSkinInfoByTagId(String str, String str2);
}
