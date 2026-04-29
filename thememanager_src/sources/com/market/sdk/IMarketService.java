package com.market.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.market.sdk.IDesktopRecommendResponse;
import com.market.sdk.IImageCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IMarketService extends IInterface {

    public static abstract class Stub extends Binder implements IMarketService {
        private static final String DESCRIPTOR = "com.market.sdk.IMarketService";
        static final int TRANSACTION_allowConnectToNetwork = 3;
        static final int TRANSACTION_getApkCheckInfo = 2;
        static final int TRANSACTION_getCategory = 11;
        static final int TRANSACTION_getCategoryV2 = 13;
        static final int TRANSACTION_getDesktopFolderConfig = 16;
        static final int TRANSACTION_getEnableSettings = 10;
        static final int TRANSACTION_getVerifyInfo = 1;
        static final int TRANSACTION_getWhiteSet = 9;
        static final int TRANSACTION_getWhiteSetV2 = 12;
        static final int TRANSACTION_isInWhiteSetForApkCheck = 8;
        static final int TRANSACTION_loadDesktopRecommendInfo = 7;
        static final int TRANSACTION_loadDesktopRecommendInfoV2 = 14;
        static final int TRANSACTION_loadDesktopRecommendInfoV3 = 15;
        static final int TRANSACTION_loadIcon = 5;
        static final int TRANSACTION_loadImage = 6;
        static final int TRANSACTION_recordStaticsCountEvent = 4;

        private static class Proxy implements IMarketService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.market.sdk.IMarketService
            public boolean allowConnectToNetwork() throws RemoteException {
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.market.sdk.IMarketService
            public ApkVerifyInfo getApkCheckInfo(String str, String str2, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ApkVerifyInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public int getCategory(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void getCategoryV2(String[] strArr, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void getDesktopFolderConfig(ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public String getEnableSettings() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
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

            @Override // com.market.sdk.IMarketService
            public ApkVerifyInfo getVerifyInfo(String str, String str2, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ApkVerifyInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public String getWhiteSet() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void getWhiteSetV2(ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public boolean isInWhiteSetForApkCheck(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void loadDesktopRecommendInfo(long j2, String str, List<String> list, IDesktopRecommendResponse iDesktopRecommendResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongBinder(iDesktopRecommendResponse != null ? iDesktopRecommendResponse.asBinder() : null);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.readStringList(list);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void loadDesktopRecommendInfoV2(long j2, String str, List<String> list, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.readStringList(list);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void loadDesktopRecommendInfoV3(Bundle bundle, ResultReceiver resultReceiver) throws RemoteException {
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
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void loadIcon(String str, String str2, IImageCallback iImageCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iImageCallback != null ? iImageCallback.asBinder() : null);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void loadImage(String str, int i2, int i3, IImageCallback iImageCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iImageCallback != null ? iImageCallback.asBinder() : null);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.market.sdk.IMarketService
            public void recordStaticsCountEvent(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
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

        public static IMarketService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMarketService)) ? new Proxy(iBinder) : (IMarketService) iInterfaceQueryLocalInterface;
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
                    ApkVerifyInfo verifyInfo = getVerifyInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (verifyInfo != null) {
                        parcel2.writeInt(1);
                        verifyInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    ApkVerifyInfo apkCheckInfo = getApkCheckInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (apkCheckInfo != null) {
                        parcel2.writeInt(1);
                        apkCheckInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAllowConnectToNetwork = allowConnectToNetwork();
                    parcel2.writeNoException();
                    parcel2.writeInt(zAllowConnectToNetwork ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    recordStaticsCountEvent(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    loadIcon(parcel.readString(), parcel.readString(), IImageCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    loadImage(parcel.readString(), parcel.readInt(), parcel.readInt(), IImageCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    long j2 = parcel.readLong();
                    String string = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    loadDesktopRecommendInfo(j2, string, arrayListCreateStringArrayList, IDesktopRecommendResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStringList(arrayListCreateStringArrayList);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsInWhiteSetForApkCheck = isInWhiteSetForApkCheck(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsInWhiteSetForApkCheck ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String whiteSet = getWhiteSet();
                    parcel2.writeNoException();
                    parcel2.writeString(whiteSet);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String enableSettings = getEnableSettings();
                    parcel2.writeNoException();
                    parcel2.writeString(enableSettings);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int category = getCategory(parcel.createStringArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(category);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    getWhiteSetV2(parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    getCategoryV2(parcel.createStringArray(), parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    long j3 = parcel.readLong();
                    String string2 = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                    loadDesktopRecommendInfoV2(j3, string2, arrayListCreateStringArrayList2, parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeStringList(arrayListCreateStringArrayList2);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    loadDesktopRecommendInfoV3(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    getDesktopFolderConfig(parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    boolean allowConnectToNetwork() throws RemoteException;

    ApkVerifyInfo getApkCheckInfo(String str, String str2, boolean z2) throws RemoteException;

    int getCategory(String[] strArr) throws RemoteException;

    void getCategoryV2(String[] strArr, ResultReceiver resultReceiver) throws RemoteException;

    void getDesktopFolderConfig(ResultReceiver resultReceiver) throws RemoteException;

    String getEnableSettings() throws RemoteException;

    ApkVerifyInfo getVerifyInfo(String str, String str2, boolean z2) throws RemoteException;

    String getWhiteSet() throws RemoteException;

    void getWhiteSetV2(ResultReceiver resultReceiver) throws RemoteException;

    boolean isInWhiteSetForApkCheck(String str) throws RemoteException;

    void loadDesktopRecommendInfo(long j2, String str, List<String> list, IDesktopRecommendResponse iDesktopRecommendResponse) throws RemoteException;

    void loadDesktopRecommendInfoV2(long j2, String str, List<String> list, ResultReceiver resultReceiver) throws RemoteException;

    void loadDesktopRecommendInfoV3(Bundle bundle, ResultReceiver resultReceiver) throws RemoteException;

    void loadIcon(String str, String str2, IImageCallback iImageCallback) throws RemoteException;

    void loadImage(String str, int i2, int i3, IImageCallback iImageCallback) throws RemoteException;

    void recordStaticsCountEvent(String str, String str2) throws RemoteException;
}
