package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;
import android.util.Log;
import com.tencent.wxop.stat.common.C5387g;

/* JADX INFO: renamed from: com.tencent.a.a.a.a.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5359n extends AbstractC5357g {
    public C5359n(Context context) {
        super(context);
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    /* JADX INFO: renamed from: q */
    protected final String mo18229q() {
        String strM18396a;
        synchronized (this) {
            Log.i("MID", "read mid from Settings.System");
            strM18396a = C5387g.m18395a(this.f29894k).m18396a(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw=="));
        }
        return strM18396a;
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final void toq(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to Settings.System");
            C5387g.m18395a(this.f29894k).m18397a(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
        }
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final boolean zy() {
        return C5361y.m18234q(this.f29894k, "android.permission.WRITE_SETTINGS");
    }
}
