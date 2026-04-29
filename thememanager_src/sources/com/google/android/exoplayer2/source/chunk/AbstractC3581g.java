package com.google.android.exoplayer2.source.chunk;

import android.net.Uri;
import com.google.android.exoplayer2.source.ni7;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.upstream.oc;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.g */
/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3581g implements oc.InterfaceC3814n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final long f65337f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    public final Object f21365g;

    /* JADX INFO: renamed from: k */
    public final long f21366k = ni7.m12808k();

    /* JADX INFO: renamed from: n */
    public final int f21367n;

    /* JADX INFO: renamed from: q */
    public final xwq3 f21368q;

    /* JADX INFO: renamed from: s */
    protected final C3794f f21369s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.t8r f65338toq;

    /* JADX INFO: renamed from: y */
    public final long f21370y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f65339zy;

    public AbstractC3581g(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, int i2, xwq3 xwq3Var, int i3, @dd Object obj, long j2, long j3) {
        this.f21369s = new C3794f(kja0Var);
        this.f65338toq = (com.google.android.exoplayer2.upstream.t8r) C3844k.f7l8(t8rVar);
        this.f65339zy = i2;
        this.f21368q = xwq3Var;
        this.f21367n = i3;
        this.f21365g = obj;
        this.f65337f7l8 = j2;
        this.f21370y = j3;
    }

    /* JADX INFO: renamed from: g */
    public final Uri m12649g() {
        return this.f21369s.ni7();
    }

    /* JADX INFO: renamed from: n */
    public final Map<String, List<String>> m12650n() {
        return this.f21369s.fu4();
    }

    /* JADX INFO: renamed from: q */
    public final long m12651q() {
        return this.f21370y - this.f65337f7l8;
    }

    public final long toq() {
        return this.f21369s.zurt();
    }
}
