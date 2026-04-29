package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/* JADX INFO: renamed from: com.tencent.a.a.a.a.q */
/* JADX INFO: loaded from: classes3.dex */
final class C5360q extends AbstractC5357g {
    public C5360q(Context context) {
        super(context);
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    /* JADX INFO: renamed from: q */
    protected final String mo18229q() {
        String string;
        synchronized (this) {
            Log.i("MID", "read mid from sharedPreferences");
            string = PreferenceManager.getDefaultSharedPreferences(this.f29894k).getString(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw=="), null);
        }
        return string;
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final void toq(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to sharedPreferences");
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f29894k).edit();
            editorEdit.putString(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
            editorEdit.commit();
        }
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final boolean zy() {
        return true;
    }
}
