package com.miui.systemAdSolution.landingPageV2.task.action;

import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.miui.systemAdSolution.landingPageV2.listener.IH5Listener;
import u38j.C7683q;

/* JADX INFO: loaded from: classes3.dex */
public class H5Action extends Action<IH5Listener> {
    private static final String TAG = "H5Action";
    private String mH5Url;

    protected H5Action(Parcel parcel) {
        super(parcel);
        String string = null;
        if (parcel != null) {
            try {
                string = parcel.readString();
            } catch (Exception e2) {
                C7683q.m28055n(TAG, "H5Action parse parcel e : ", e2);
                return;
            }
        }
        this.mH5Url = string;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getH5Url() {
        return this.mH5Url;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: k */
    protected int mo18157k() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public IH5Listener mo18158y(IBinder iBinder) {
        return IH5Listener.Stub.asInterface(iBinder);
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.mH5Url);
    }

    public H5Action(Action<IH5Listener>.C5336k c5336k, IH5Listener iH5Listener, boolean z2, String str) {
        super(c5336k, iH5Listener, z2);
        if (TextUtils.isEmpty(str)) {
            C7683q.m28057q(TAG, "h5 url is null!");
        }
        this.mH5Url = str;
    }
}
