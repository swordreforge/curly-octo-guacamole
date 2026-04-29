package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5804p;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ak implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f31660a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f31661b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f31662c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f31663d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ String f31664e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ String f31665f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ long f31666g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C5699m f31667h;

    ak(C5699m c5699m, Map map, String str, String str2, String str3, String str4, String str5, long j2) {
        this.f31667h = c5699m;
        this.f31660a = map;
        this.f31661b = str;
        this.f31662c = str2;
        this.f31663d = str3;
        this.f31664e = str4;
        this.f31665f = str5;
        this.f31666g = j2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f31667h.m19871f()) {
                return;
            }
            this.f31667h.f31851b.mo19705a("onetrack_bug_report", C5694h.m19787a(this.f31661b, this.f31662c, this.f31663d, this.f31664e, this.f31665f, this.f31666g, this.f31667h.f31854f, this.f31667h.f31856h, this.f31667h.m19821d((Map<String, Object>) this.f31660a), this.f31667h.f31857i, this.f31667h.f31858j));
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "trackException error: " + e2.toString());
        }
    }
}
