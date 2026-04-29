package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.ncyb;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: LogcatLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements ncyb {

    /* JADX INFO: renamed from: k */
    private static final Set<String> f8292k = new HashSet();

    @Override // com.airbnb.lottie.ncyb
    /* JADX INFO: renamed from: k */
    public void mo6106k(String str) {
        mo6108q(str, null);
    }

    @Override // com.airbnb.lottie.ncyb
    /* JADX INFO: renamed from: n */
    public void mo6107n(String str, Throwable th) {
        if (C1476n.f8106k) {
            Log.d(C1476n.f56118toq, str, th);
        }
    }

    @Override // com.airbnb.lottie.ncyb
    /* JADX INFO: renamed from: q */
    public void mo6108q(String str, Throwable th) {
        Set<String> set = f8292k;
        if (set.contains(str)) {
            return;
        }
        Log.w(C1476n.f56118toq, str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.ncyb
    public void toq(String str, Throwable th) {
        if (C1476n.f8106k) {
            Log.d(C1476n.f56118toq, str, th);
        }
    }

    @Override // com.airbnb.lottie.ncyb
    public void zy(String str) {
        mo6107n(str, null);
    }
}
