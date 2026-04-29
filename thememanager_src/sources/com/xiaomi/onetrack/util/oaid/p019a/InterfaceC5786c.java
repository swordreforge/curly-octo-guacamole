package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5786c extends IInterface {
    /* JADX INFO: renamed from: a */
    String mo20302a();

    /* JADX INFO: renamed from: a */
    String mo20303a(String str);

    /* JADX INFO: renamed from: b */
    boolean mo20304b();

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.c$a */
    public static abstract class a extends Binder implements InterfaceC5786c {
        /* JADX INFO: renamed from: a */
        public static InterfaceC5786c m20305a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5786c)) ? new C8037a(iBinder) : (InterfaceC5786c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                String strMo20302a = mo20302a();
                parcel2.writeNoException();
                parcel2.writeString(strMo20302a);
                return true;
            }
            if (i2 == 1598968902) {
                parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                boolean zMo20304b = mo20304b();
                parcel2.writeNoException();
                parcel2.writeInt(zMo20304b ? 1 : 0);
                return true;
            }
            if (i2 != 4) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
            String strMo20303a = mo20303a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo20303a);
            return true;
        }

        /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.c$a$a, reason: collision with other inner class name */
        public static class C8037a implements InterfaceC5786c {

            /* JADX INFO: renamed from: a */
            private IBinder f32344a;

            public C8037a(IBinder iBinder) {
                this.f32344a = iBinder;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5786c
            /* JADX INFO: renamed from: a */
            public String mo20302a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                        this.f32344a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return null;
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5786c
            /* JADX INFO: renamed from: b */
            public boolean mo20304b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f32344a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable unused) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5786c
            /* JADX INFO: renamed from: a */
            public String mo20303a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                        this.f32344a.transact(4, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return null;
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
