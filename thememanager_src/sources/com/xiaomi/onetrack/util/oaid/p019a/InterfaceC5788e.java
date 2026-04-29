package com.xiaomi.onetrack.util.oaid.p019a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.e */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5788e extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.e$a */
    public static abstract class a extends Binder implements InterfaceC5788e {

        /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.a.e$a$a, reason: collision with other inner class name */
        public static class C8039a implements InterfaceC5788e {

            /* JADX INFO: renamed from: a */
            public IBinder f32346a;

            public C8039a(IBinder iBinder) {
                this.f32346a = iBinder;
            }

            /* JADX INFO: renamed from: a */
            public String m20309a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeString(str3);
                        this.f32346a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        return null;
                    }
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32346a;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC5788e m20308a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5788e)) ? new C8039a(iBinder) : (InterfaceC5788e) iInterfaceQueryLocalInterface;
        }
    }
}
