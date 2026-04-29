package com.miui.systemAdSolution.landingPageV2.task.action;

import android.os.Parcel;
import u38j.C7683q;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.action.k */
/* JADX INFO: compiled from: ActionCreator.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5338k {

    /* JADX INFO: renamed from: k */
    private static final String f29825k = "ActionCreator";

    /* JADX INFO: renamed from: n */
    public static final int f29826n = 3;

    /* JADX INFO: renamed from: q */
    public static final int f29827q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f72490toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f72491zy = 1;

    /* JADX INFO: renamed from: k */
    public static Action m18169k(Parcel parcel) {
        int i2 = parcel.readInt();
        C7683q.toq(f29825k, "Type is " + i2);
        if (i2 == 0) {
            C7683q.toq(f29825k, "Error : Action can't be instantiation");
            return null;
        }
        if (i2 == 1) {
            return new DeeplinkAction(parcel);
        }
        if (i2 == 2) {
            return new H5Action(parcel);
        }
        if (i2 == 3) {
            return new DownloadAction(parcel);
        }
        C7683q.toq(f29825k, "Unknown action type : " + i2);
        return null;
    }
}
