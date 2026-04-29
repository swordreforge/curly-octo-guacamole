package com.xiaomi.accountsdk.account.stat;

import android.os.SystemClock;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.hasheddeviceidlib.zy;

/* JADX INFO: compiled from: CustomizedUrlStatUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private final String f30785k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f72808toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f72809zy = false;

    public toq(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("url can't be null");
        }
        this.f30785k = String.format("http://dummyurl/%s/_ver=%s&hdid=%s", str, str2, new zy(C5500p.toq()).zy());
    }

    /* JADX INFO: renamed from: k */
    public void m18821k() {
        AbstractC5503k qVar;
        if (this.f72809zy || (qVar = AbstractC5503k.toq()) == null) {
            return;
        }
        qVar.mo18816g(this.f30785k, SystemClock.elapsedRealtime() - this.f72808toq);
    }

    public void toq() {
        this.f72808toq = SystemClock.elapsedRealtime();
    }

    public void zy(Exception exc) {
        this.f72809zy = true;
        AbstractC5503k qVar = AbstractC5503k.toq();
        if (exc == null || qVar == null) {
            return;
        }
        qVar.f7l8(this.f30785k, exc);
    }
}
