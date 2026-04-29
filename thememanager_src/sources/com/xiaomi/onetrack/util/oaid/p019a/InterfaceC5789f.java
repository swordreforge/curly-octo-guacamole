package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.f */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5789f extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.f$a */
    public static class a implements InterfaceC5789f {

        /* JADX INFO: renamed from: a */
        private IBinder f32347a;

        public a(IBinder iBinder) {
            this.f32347a = iBinder;
        }

        @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5789f
        /* JADX INFO: renamed from: a */
        public String mo20310a() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                this.f32347a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                th.printStackTrace();
                string = null;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f32347a;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.f$b */
    public static abstract class b extends Binder implements InterfaceC5789f {
        public b() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC5789f m20311a(IBinder iBinder) {
            if (iBinder == null || iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService") == null) {
                return null;
            }
            return new a(iBinder);
        }
    }

    /* JADX INFO: renamed from: a */
    String mo20310a();
}
