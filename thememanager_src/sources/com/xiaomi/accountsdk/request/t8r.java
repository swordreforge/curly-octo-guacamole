package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import java.io.IOException;
import kx3.C6757k;

/* JADX INFO: compiled from: PassportRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t8r {
    /* JADX INFO: renamed from: k */
    public abstract wvg.C5555y mo18922k() throws fn3e, IOException;

    public final wvg.C5555y toq() throws p039w.cdj, n7h, C5539k, zy, p039w.x2, C6757k, IOException, p039w.n7h, p039w.f7l8, p039w.kja0 {
        try {
            return mo18922k();
        } catch (fn3e e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof n7h) {
                throw ((n7h) cause);
            }
            if (cause instanceof p039w.f7l8) {
                throw ((p039w.f7l8) cause);
            }
            if (cause instanceof p039w.x2) {
                throw ((p039w.x2) cause);
            }
            if (cause instanceof p039w.cdj) {
                throw ((p039w.cdj) cause);
            }
            if (cause instanceof p039w.n7h) {
                throw ((p039w.n7h) cause);
            }
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof C5539k) {
                throw ((C5539k) cause);
            }
            if (cause instanceof zy) {
                throw ((zy) cause);
            }
            if (cause instanceof p039w.kja0) {
                throw ((p039w.kja0) cause);
            }
            if (cause instanceof C6757k) {
                throw ((C6757k) cause);
            }
            throw new IllegalStateException("");
        }
    }
}
