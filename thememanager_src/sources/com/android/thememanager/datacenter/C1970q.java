package com.android.thememanager.datacenter;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.android.thememanager.datacenter.q */
/* JADX INFO: compiled from: LogCenterManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1970q {

    /* JADX INFO: renamed from: k */
    private static SparseArray<zy> f11155k = new SparseArray<>();

    /* JADX INFO: renamed from: k */
    public static zy m7725k(bo.toq config, int id) {
        zy zyVarQrj = zy.qrj(config);
        f11155k.put(id, zyVarQrj);
        zyVarQrj.start();
        return toq(id);
    }

    public static zy toq(int id) {
        return f11155k.get(id);
    }

    public static void zy(int id) {
        f11155k.delete(id);
    }
}
