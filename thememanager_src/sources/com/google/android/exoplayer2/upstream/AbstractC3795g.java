package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.g */
/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3795g implements kja0 {

    /* JADX INFO: renamed from: n */
    @zy.dd
    private t8r f23011n;

    /* JADX INFO: renamed from: q */
    private int f23012q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f66847toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<uv6> f66848zy = new ArrayList<>(1);

    protected AbstractC3795g(boolean z2) {
        this.f66847toq = z2;
    }

    protected final void fu4(t8r t8rVar) {
        for (int i2 = 0; i2 < this.f23012q; i2++) {
            this.f66848zy.get(i2).mo13526s(this, t8rVar, this.f66847toq);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public final void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        if (this.f66848zy.contains(uv6Var)) {
            return;
        }
        this.f66848zy.add(uv6Var);
        this.f23012q++;
    }

    protected final void ni7() {
        t8r t8rVar = (t8r) com.google.android.exoplayer2.util.lrht.ld6(this.f23011n);
        for (int i2 = 0; i2 < this.f23012q; i2++) {
            this.f66848zy.get(i2).toq(this, t8rVar, this.f66847toq);
        }
        this.f23011n = null;
    }

    /* JADX INFO: renamed from: z */
    protected final void m13463z(t8r t8rVar) {
        this.f23011n = t8rVar;
        for (int i2 = 0; i2 < this.f23012q; i2++) {
            this.f66848zy.get(i2).mo13527y(this, t8rVar, this.f66847toq);
        }
    }

    protected final void zurt(int i2) {
        t8r t8rVar = (t8r) com.google.android.exoplayer2.util.lrht.ld6(this.f23011n);
        for (int i3 = 0; i3 < this.f23012q; i3++) {
            this.f66848zy.get(i3).mo13525g(this, t8rVar, this.f66847toq, i2);
        }
    }
}
