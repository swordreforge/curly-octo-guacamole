package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.wvg;

/* JADX INFO: loaded from: classes3.dex */
class mcp implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IBinder f33417k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ wvg.toq f33418q;

    mcp(wvg.toq toqVar, IBinder iBinder) {
        this.f33418q = toqVar;
        this.f33417k = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String packageName = wvg.this.f34085k.getPackageName();
            String strLd6 = wvg.this.ld6();
            wvg.C5958k c5958k = new wvg.C5958k();
            c5958k.f73721toq = wvg.zy.m21980k(this.f33417k, packageName, strLd6, "OUID");
            wvg.this.f34087q = c5958k;
            wvg.this.x2();
            wvg.this.f73720zy = 2;
            synchronized (wvg.this.f34086n) {
                try {
                    wvg.this.f34086n.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            wvg.this.x2();
            wvg.this.f73720zy = 2;
            synchronized (wvg.this.f34086n) {
                try {
                    wvg.this.f34086n.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            wvg.this.x2();
            wvg.this.f73720zy = 2;
            synchronized (wvg.this.f34086n) {
                try {
                    wvg.this.f34086n.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
