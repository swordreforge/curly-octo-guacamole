package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.g */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5790g extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.g$a */
    public static abstract class a extends Binder implements InterfaceC5790g {

        /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.g$a$a, reason: collision with other inner class name */
        public static class C8040a implements InterfaceC5790g {

            /* JADX INFO: renamed from: a */
            private IBinder f32348a;

            public C8040a(IBinder iBinder) {
                this.f32348a = iBinder;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5790g
            /* JADX INFO: renamed from: a */
            public boolean mo20312a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f32348a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        return false;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return true;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    th.printStackTrace();
                    return false;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32348a;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5790g
            /* JADX INFO: renamed from: b */
            public String mo20313b() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f32348a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    string = null;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            }

            @Override // com.xiaomi.onetrack.util.oaid.p019a.InterfaceC5790g
            /* JADX INFO: renamed from: c */
            public boolean mo20314c() {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo20312a();

    /* JADX INFO: renamed from: b */
    String mo20313b();

    /* JADX INFO: renamed from: c */
    boolean mo20314c();
}
