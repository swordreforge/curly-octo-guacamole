package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class a3dw extends lg4k {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ Runnable f32638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a3dw(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f32638g = runnable;
    }

    @Override // com.xiaomi.push.lg4k
    /* JADX INFO: renamed from: k */
    protected void mo20551k(Context context) {
        Runnable runnable = this.f32638g;
        if (runnable != null) {
            runnable.run();
        }
    }
}
