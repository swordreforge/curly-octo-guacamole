package com.xiaomi.accountsdk.request;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.data.C5480k;
import java.util.ArrayList;

/* JADX INFO: compiled from: IPDiagnosisStatHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends fu4 {

    /* JADX INFO: renamed from: k */
    private ArrayList<String> f30933k = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ArrayList<String> f72923toq = new ArrayList<>();

    f7l8() {
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void f7l8(int i2, String str) {
        this.f30933k.add(str);
        this.f72923toq.add(m18979k());
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void fn3e() {
        zy(C5480k.f30621k, C5480k.f30627y);
        fu4(true);
    }

    void fu4(boolean z2) {
        m18980q(String.format("http://dummyurl/IpDiagonose?_ver=%s&_ips=%s&_nets=%s&_ipResult=%s", com.xiaomi.accountsdk.account.zy.f30810k, TextUtils.join(",", this.f30933k), TextUtils.join(",", this.f72923toq), Boolean.valueOf(z2)));
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: g */
    public void mo18925g(int i2) {
        zy(C5480k.f30621k, C5480k.f30622n + i2);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: h */
    public void mo18926h(String str) {
        this.f30933k.add(str);
        this.f72923toq.add(m18979k());
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: i */
    public void mo18927i() {
        zy(C5480k.f30621k, C5480k.f72641f7l8);
        fu4(false);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void ld6() {
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: p */
    public void mo18928p(String str) {
        this.f30933k.add(str);
        this.f72923toq.add(m18979k());
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void qrj() {
        m18980q(String.format("http://dummyurl/cachedIpDiagonose?_ver=%s&cacheipnet=%s&cachedip=%s&dnsipnet=%s&dnsip=%s&finalnet=%s", com.xiaomi.accountsdk.account.zy.f30810k, this.f72923toq.get(0), this.f30933k.get(0), this.f72923toq.get(1), this.f30933k.get(1), m18979k()));
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: s */
    public void mo18929s() {
        zy(C5480k.f30621k, C5480k.f72658zy);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void t8r() {
        zy(C5480k.f30621k, C5480k.f30618g);
        fu4(true);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void x2() {
        zy(C5480k.f30621k, C5480k.f30624q);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: y */
    public void mo18930y(int i2) {
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void zurt() {
        zy(C5480k.f30621k, C5480k.f72654toq);
    }
}
