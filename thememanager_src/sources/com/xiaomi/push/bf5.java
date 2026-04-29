package com.xiaomi.push;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
class bf5 implements Runnable {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ cr3 f32734g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f32735k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f32736n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f32737q;

    bf5(cr3 cr3Var, String str, String str2, String str3) {
        this.f32734g = cr3Var;
        this.f32735k = str;
        this.f32737q = str2;
        this.f32736n = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        SharedPreferences.Editor editorEdit = this.f32734g.f32779k.getSharedPreferences(this.f32735k, 4).edit();
        editorEdit.putString(this.f32737q, this.f32736n);
        editorEdit.commit();
    }
}
