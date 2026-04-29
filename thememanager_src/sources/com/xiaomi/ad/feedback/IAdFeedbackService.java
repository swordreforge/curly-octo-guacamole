package com.xiaomi.ad.feedback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.ad.feedback.IAdFeedbackListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IAdFeedbackService extends IInterface {

    public static abstract class Stub extends Binder implements IAdFeedbackService {
        private static final String DESCRIPTOR = "com.xiaomi.ad.feedback.IAdFeedbackService";
        static final int TRANSACTION_showFeedbackWindow = 1;
        static final int TRANSACTION_showFeedbackWindowAndTrackResult = 2;
        static final int TRANSACTION_showFeedbackWindowAndTrackResultForMultiAds = 3;

        private static class Proxy implements IAdFeedbackService {
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

            @Override // com.xiaomi.ad.feedback.IAdFeedbackService
            public void showFeedbackWindow(IAdFeedbackListener iAdFeedbackListener) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAdFeedbackListener != null ? iAdFeedbackListener.asBinder() : null);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.ad.feedback.IAdFeedbackService
            public void showFeedbackWindowAndTrackResult(IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAdFeedbackListener != null ? iAdFeedbackListener.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.ad.feedback.IAdFeedbackService
            public void showFeedbackWindowAndTrackResultForMultiAds(IAdFeedbackListener iAdFeedbackListener, String str, String str2, List<String> list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAdFeedbackListener != null ? iAdFeedbackListener.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
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

        public static IAdFeedbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAdFeedbackService)) ? new Proxy(iBinder) : (IAdFeedbackService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                showFeedbackWindow(IAdFeedbackListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                showFeedbackWindowAndTrackResult(IAdFeedbackListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
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
            showFeedbackWindowAndTrackResultForMultiAds(IAdFeedbackListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            parcel2.writeNoException();
            return true;
        }
    }

    void showFeedbackWindow(IAdFeedbackListener iAdFeedbackListener);

    void showFeedbackWindowAndTrackResult(IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3);

    void showFeedbackWindowAndTrackResultForMultiAds(IAdFeedbackListener iAdFeedbackListener, String str, String str2, List<String> list);
}
