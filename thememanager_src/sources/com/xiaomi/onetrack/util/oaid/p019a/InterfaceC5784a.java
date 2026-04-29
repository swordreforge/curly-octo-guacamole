package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.a */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5784a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.a$a */
    public static final class a implements InterfaceC5784a {

        /* JADX INFO: renamed from: a */
        private IBinder f32342a;

        public a(IBinder iBinder) {
            this.f32342a = iBinder;
        }

        @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5784a
        /* JADX INFO: renamed from: a */
        public String mo20299a() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                this.f32342a.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                th.printStackTrace();
                string = null;
            }
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return string;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f32342a;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo20299a();
}
