package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import zy.dd;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zurt {

    /* JADX INFO: renamed from: k */
    @dd
    private InterfaceC3717k f22343k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private InterfaceC3808n f66066toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.zurt$k */
    /* JADX INFO: compiled from: TrackSelector.java */
    public interface InterfaceC3717k {
        /* JADX INFO: renamed from: k */
        void mo12454k();
    }

    public abstract ni7 f7l8(cv06[] cv06VarArr, C3629x c3629x, fti.C3596k c3596k, pc pcVar) throws com.google.android.exoplayer2.ki;

    /* JADX INFO: renamed from: g */
    public abstract void mo13140g(@dd Object obj);

    /* JADX INFO: renamed from: k */
    protected final InterfaceC3808n m13153k() {
        return (InterfaceC3808n) C3844k.f7l8(this.f66066toq);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo13093n() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    protected final void m13154q() {
        InterfaceC3717k interfaceC3717k = this.f22343k;
        if (interfaceC3717k != null) {
            interfaceC3717k.mo12454k();
        }
    }

    public C3707i toq() {
        return C3707i.f22281v;
    }

    /* JADX INFO: renamed from: y */
    public void mo13094y(C3707i c3707i) {
    }

    public final void zy(InterfaceC3717k interfaceC3717k, InterfaceC3808n interfaceC3808n) {
        this.f22343k = interfaceC3717k;
        this.f66066toq = interfaceC3808n;
    }
}
