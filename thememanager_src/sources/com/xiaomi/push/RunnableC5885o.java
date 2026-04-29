package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.processor.InterfaceC5634k;
import com.xiaomi.clientreport.processor.InterfaceC5635n;

/* JADX INFO: renamed from: com.xiaomi.push.o */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5885o implements Runnable {

    /* JADX INFO: renamed from: k */
    private InterfaceC5635n f33482k;

    /* JADX INFO: renamed from: q */
    private Context f33483q;

    /* JADX INFO: renamed from: k */
    public void m21338k(Context context) {
        this.f33483q = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            InterfaceC5635n interfaceC5635n = this.f33482k;
            if (interfaceC5635n != null) {
                interfaceC5635n.mo19346a();
            }
            com.xiaomi.channel.commonutils.logger.zy.m19300t("begin read and send perf / event");
            InterfaceC5635n interfaceC5635n2 = this.f33482k;
            if (interfaceC5635n2 instanceof InterfaceC5634k) {
                C5851b.toq(this.f33483q).m20622q("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (interfaceC5635n2 instanceof com.xiaomi.clientreport.processor.toq) {
                C5851b.toq(this.f33483q).m20622q("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    public void toq(InterfaceC5635n interfaceC5635n) {
        this.f33482k = interfaceC5635n;
    }
}
