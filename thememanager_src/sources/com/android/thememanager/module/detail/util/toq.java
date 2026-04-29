package com.android.thememanager.module.detail.util;

import com.android.thememanager.module.detail.presenter.C2225g;
import java.lang.ref.WeakReference;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: LargeIconDetailRetryRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class toq implements Runnable {

    /* JADX INFO: renamed from: g */
    private static final int[] f13159g = {1, 1, 2, 3, 5};

    /* JADX INFO: renamed from: k */
    private int f13160k = 0;

    /* JADX INFO: renamed from: n */
    private WeakReference<C2225g> f13161n;

    /* JADX INFO: renamed from: q */
    private String f13162q;

    public toq(String onlineId, C2225g vm) {
        this.f13162q = onlineId;
        this.f13161n = new WeakReference<>(vm);
    }

    /* JADX INFO: renamed from: k */
    public int m8374k() {
        int i2 = this.f13160k;
        int[] iArr = f13159g;
        if (i2 >= iArr.length) {
            return -1;
        }
        return iArr[i2] * 1000;
    }

    /* JADX INFO: renamed from: q */
    public C2225g m8375q() {
        WeakReference<C2225g> weakReference = this.f13161n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // java.lang.Runnable
    @InterfaceC7842s
    public void run() {
        this.f13160k++;
    }

    public int toq() {
        return this.f13160k;
    }

    public String zy() {
        return this.f13162q;
    }
}
