package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.kja0;

/* JADX INFO: compiled from: DefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class fu4 implements kja0.InterfaceC3804k {

    /* JADX INFO: renamed from: k */
    private final Context f23010k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final uv6 f66845toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final kja0.InterfaceC3804k f66846zy;

    public fu4(Context context) {
        this(context, (String) null, (uv6) null);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public ni7 mo7265k() {
        ni7 ni7Var = new ni7(this.f23010k, this.f66846zy.mo7265k());
        uv6 uv6Var = this.f66845toq;
        if (uv6Var != null) {
            ni7Var.mo7271n(uv6Var);
        }
        return ni7Var;
    }

    public fu4(Context context, @zy.dd String str) {
        this(context, str, (uv6) null);
    }

    public fu4(Context context, @zy.dd String str, @zy.dd uv6 uv6Var) {
        this(context, uv6Var, new C3827z.toq().ld6(str));
    }

    public fu4(Context context, kja0.InterfaceC3804k interfaceC3804k) {
        this(context, (uv6) null, interfaceC3804k);
    }

    public fu4(Context context, @zy.dd uv6 uv6Var, kja0.InterfaceC3804k interfaceC3804k) {
        this.f23010k = context.getApplicationContext();
        this.f66845toq = uv6Var;
        this.f66846zy = interfaceC3804k;
    }
}
