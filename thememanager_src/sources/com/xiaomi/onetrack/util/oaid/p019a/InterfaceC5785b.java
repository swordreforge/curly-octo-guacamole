package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.b */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5785b extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.b$a */
    public static final class a implements InterfaceC5785b {

        /* JADX INFO: renamed from: a */
        private IBinder f32343a;

        public a(IBinder iBinder) {
            this.f32343a = iBinder;
        }

        @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5785b
        /* JADX INFO: renamed from: a */
        public String mo20300a() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f32343a.transact(1, parcelObtain, parcelObtain2, 0);
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
            return this.f32343a;
        }

        @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5785b
        /* JADX INFO: renamed from: b */
        public boolean mo20301b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            boolean z2 = false;
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f32343a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z2 = true;
                }
            } catch (Throwable unused) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return z2;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo20300a();

    /* JADX INFO: renamed from: b */
    boolean mo20301b();
}
