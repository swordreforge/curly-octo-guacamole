package com.xiaomi.accountsdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.BadParcelableException;

/* JADX INFO: compiled from: ParcelableAttackGuardian.java */
/* JADX INFO: loaded from: classes3.dex */
public class o1t {

    /* JADX INFO: renamed from: k */
    private static final String f31051k = "ParcelableAttackGuardia";

    /* JADX INFO: renamed from: k */
    public boolean m19122k(Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            try {
                toq(new Intent(activity.getIntent()));
                return true;
            } catch (RuntimeException e2) {
                if (e2 instanceof BadParcelableException) {
                    AbstractC5574n.fu4(f31051k, "fail checking ParcelableAttack for Activity " + activity.getClass().getName());
                    return false;
                }
                if (e2.getCause() instanceof ClassNotFoundException) {
                    AbstractC5574n.fu4(f31051k, "fail checking SerializableAttack for Activity " + activity.getClass().getName());
                    return false;
                }
                AbstractC5574n.m19116z(f31051k, "error", e2);
            }
        }
        return true;
    }

    void toq(Intent intent) throws BadParcelableException {
        intent.getStringExtra("");
    }
}
