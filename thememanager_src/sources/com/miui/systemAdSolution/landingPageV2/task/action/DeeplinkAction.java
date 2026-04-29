package com.miui.systemAdSolution.landingPageV2.task.action;

import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener;
import u38j.C7683q;

/* JADX INFO: loaded from: classes3.dex */
public class DeeplinkAction extends Action<IDeeplinkListener> {
    private static final String TAG = "DeeplinkAction";
    private String mTargetPackageName;
    private String mUrl;

    protected DeeplinkAction(Parcel parcel) {
        String string;
        super(parcel);
        String string2 = null;
        if (parcel != null) {
            try {
                string2 = parcel.readString();
                string = parcel.readString();
            } catch (Exception e2) {
                C7683q.m28055n(TAG, "DeeplinkAction parse parcel e : ", e2);
                return;
            }
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string2)) {
            C7683q.m28057q(TAG, "url is null");
        } else {
            this.mUrl = string2;
            this.mTargetPackageName = string;
        }
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getTargetPackageName() {
        return this.mTargetPackageName;
    }

    public String getUrl() {
        return this.mUrl;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: k */
    protected int mo18157k() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public IDeeplinkListener mo18158y(IBinder iBinder) {
        return IDeeplinkListener.Stub.asInterface(iBinder);
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mTargetPackageName);
    }

    public DeeplinkAction(Action<IDeeplinkListener>.C5336k c5336k, IDeeplinkListener iDeeplinkListener, boolean z2, String str, String str2) {
        super(c5336k, iDeeplinkListener, z2);
        this.mUrl = str;
        this.mTargetPackageName = str2;
    }
}
