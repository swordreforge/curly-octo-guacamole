package com.miui.systemAdSolution.landingPageV2.task.action;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.ad.entity.contract.zy;
import e5.InterfaceC5997k;
import u38j.C7683q;

/* JADX INFO: loaded from: classes3.dex */
public class Action<T extends IInterface> implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new Parcelable.Creator<Action>() { // from class: com.miui.systemAdSolution.landingPageV2.task.action.Action.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Action createFromParcel(Parcel parcel) {
            return C5338k.m18169k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Action[] newArray(int i2) {
            return new Action[i2];
        }
    };
    private static final String TAG = "Action";

    /* JADX INFO: renamed from: g */
    protected boolean f29801g;

    /* JADX INFO: renamed from: k */
    protected int f29802k;

    /* JADX INFO: renamed from: n */
    protected T f29803n;

    /* JADX INFO: renamed from: q */
    protected Action<T>.C5336k f29804q;

    /* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.action.Action$k */
    public class C5336k extends zy {

        /* JADX INFO: renamed from: s */
        private static final double f29805s = 1.0d;

        /* JADX INFO: renamed from: y */
        private static final String f29806y = "AdTrackInfo";

        /* JADX INFO: renamed from: g */
        @InterfaceC5997k
        String f29807g;

        /* JADX INFO: renamed from: n */
        @InterfaceC5997k
        String f29808n;

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        String f29809q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        String f72484zy;

        public C5336k() {
        }

        public String ld6() {
            return this.f29807g;
        }

        /* JADX INFO: renamed from: p */
        public String m18160p() {
            return this.f72484zy;
        }

        public String qrj() {
            return this.f29808n;
        }

        public String x2() {
            return this.f29809q;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f29806y;
        }
    }

    protected Action(Parcel parcel) {
        this.f29802k = mo18157k();
        if (parcel != null) {
            this.f29802k = mo18157k();
            this.f29804q = zy(parcel.readString());
            this.f29803n = (T) mo18158y(parcel.readStrongBinder());
            this.f29801g = f7l8(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected boolean f7l8(int i2) {
        return i2 > 0;
    }

    /* JADX INFO: renamed from: g */
    protected int m18156g(boolean z2) {
        return z2 ? 1 : 0;
    }

    public Action<T>.C5336k getAdTracKInfo() {
        return this.f29804q;
    }

    public T getListener() {
        return this.f29803n;
    }

    /* JADX INFO: renamed from: k */
    protected int mo18157k() {
        return 0;
    }

    public boolean toq() {
        return this.f29801g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f29802k);
        Action<T>.C5336k c5336k = this.f29804q;
        parcel.writeString(c5336k == null ? "" : c5336k.serialize());
        parcel.writeStrongInterface(this.f29803n);
        parcel.writeInt(m18156g(this.f29801g));
    }

    /* JADX INFO: renamed from: y */
    protected T mo18158y(IBinder iBinder) {
        return null;
    }

    protected final Action<T>.C5336k zy(String str) {
        try {
            return (C5336k) com.xiaomi.ad.entity.util.zy.zy(C5336k.class, str, TAG);
        } catch (Exception e2) {
            C7683q.m28055n(TAG, "parseAdTrackInfo e : ", e2);
            return null;
        }
    }

    protected Action(Action<T>.C5336k c5336k, T t2, boolean z2) {
        this.f29802k = mo18157k();
        this.f29804q = c5336k;
        this.f29803n = t2;
        this.f29801g = z2;
    }
}
