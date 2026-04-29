package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.ew;
import com.xiaomi.push.r25n;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.xiaomi.push.service.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5914f {

    /* JADX INFO: renamed from: k */
    private final ConcurrentHashMap<String, zy> f33778k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.f$k */
    public static class k extends XMPushService.AbstractC5901p {
        public k() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        /* JADX INFO: renamed from: k */
        public String mo21141k() {
            return "RecordTimeManager clear";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
        public void toq() {
            C5914f.m21604k().toq();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.f$toq */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static final C5914f f33779k = new C5914f();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.f$zy */
    private static class zy {

        /* JADX INFO: renamed from: k */
        long f33780k;

        /* JADX INFO: renamed from: q */
        long f33781q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        long f73610toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f73611zy;

        private zy() {
        }

        /* JADX INFO: renamed from: k */
        public long m21609k() {
            long j2 = this.f73611zy;
            long j3 = this.f73610toq;
            if (j2 > j3) {
                return j2 - j3;
            }
            return 0L;
        }

        public long toq() {
            long j2 = this.f33781q;
            long j3 = this.f73611zy;
            if (j2 > j3) {
                return j2 - j3;
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5914f m21604k() {
        return toq.f33779k;
    }

    /* JADX INFO: renamed from: n */
    private void m21605n(String str, zy zyVar) {
        if (TextUtils.isEmpty(str) || zyVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("xmsfVC", Long.valueOf(zyVar.f33780k));
        map.put("packetId", str);
        map.put("pTime", Long.valueOf(zyVar.m21609k()));
        map.put("bTime", Long.valueOf(zyVar.toq()));
        ew.zy().toq(new r25n("msg_process_time", map));
    }

    /* JADX INFO: renamed from: g */
    public void m21606g(String str, long j2) {
        zy zyVarRemove = this.f33778k.remove(str);
        if (zyVarRemove != null) {
            zyVarRemove.f33781q = j2;
            m21605n(str, zyVarRemove);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21607q(String str, long j2, long j3) {
        zy zyVar = new zy();
        zyVar.f33780k = j3;
        zyVar.f73610toq = j2;
        this.f33778k.put(str, zyVar);
    }

    public void toq() {
        if (this.f33778k.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, zy>> it = this.f33778k.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, zy> next = it.next();
            if (next == null || next.getValue() == null) {
                it.remove();
            } else {
                zy value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.f73610toq) > 10000) {
                    m21605n(next.getKey(), value);
                    it.remove();
                }
            }
        }
    }

    public void zy(String str, long j2) {
        zy zyVar = this.f33778k.get(str);
        if (zyVar != null) {
            zyVar.f73611zy = j2;
        }
    }
}
