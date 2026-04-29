package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import java.io.IOException;

/* JADX INFO: compiled from: PassportFallbackableRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cdj extends t8r {

    /* JADX INFO: renamed from: k */
    private final t8r f30932k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final t8r f72921toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f72922zy = false;

    public cdj(t8r t8rVar, t8r t8rVar2) {
        if (t8rVar == null || t8rVar2 == null) {
            throw new IllegalStateException("both arguments should not be null.");
        }
        this.f30932k = t8rVar;
        this.f72921toq = t8rVar2;
    }

    protected abstract boolean f7l8(Exception exc);

    /* JADX INFO: renamed from: g */
    protected abstract boolean mo18921g(wvg.C5555y c5555y);

    @Override // com.xiaomi.accountsdk.request.t8r
    /* JADX INFO: renamed from: k */
    public wvg.C5555y mo18922k() throws fn3e, IOException {
        try {
            wvg.C5555y c5555yMo18922k = this.f30932k.mo18922k();
            if (!mo18921g(c5555yMo18922k)) {
                mo18923n();
                return c5555yMo18922k;
            }
        } catch (fn3e e2) {
            if (!f7l8(e2)) {
                throw e2;
            }
        } catch (IOException e3) {
            if (!f7l8(e3)) {
                throw e3;
            }
        }
        mo18924q();
        this.f72922zy = true;
        return this.f72921toq.mo18922k();
    }

    /* JADX INFO: renamed from: n */
    protected abstract void mo18923n();

    /* JADX INFO: renamed from: q */
    protected abstract void mo18924q();

    public final boolean zy() {
        return this.f72922zy;
    }
}
