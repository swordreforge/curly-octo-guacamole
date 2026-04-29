package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.cdj;

/* JADX INFO: loaded from: classes3.dex */
class t8r implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IBinder f33964k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ cdj.ServiceConnectionC5854k f33965q;

    t8r(cdj.ServiceConnectionC5854k serviceConnectionC5854k, IBinder iBinder) {
        this.f33965q = serviceConnectionC5854k;
        this.f33964k = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            cdj.this.f32772q = cdj.toq.m20688k(this.f33964k);
            cdj.this.f32771n = cdj.toq.toq(this.f33964k);
            cdj.this.m20686s();
            cdj.this.f73291zy = 2;
            synchronized (cdj.this.f73289f7l8) {
                try {
                    cdj.this.f73289f7l8.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            cdj.this.m20686s();
            cdj.this.f73291zy = 2;
            synchronized (cdj.this.f73289f7l8) {
                try {
                    cdj.this.f73289f7l8.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            cdj.this.m20686s();
            cdj.this.f73291zy = 2;
            synchronized (cdj.this.f73289f7l8) {
                try {
                    cdj.this.f73289f7l8.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
