package com.xiaomi.accountsdk.request;

import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.i */
/* JADX INFO: compiled from: PassportRequestArguments.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5538i {

    /* JADX INFO: renamed from: k */
    protected final com.xiaomi.accountsdk.utils.n7h<String, String> f30939k = new com.xiaomi.accountsdk.utils.n7h<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final com.xiaomi.accountsdk.utils.n7h<String, String> f72927toq = new com.xiaomi.accountsdk.utils.n7h<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final com.xiaomi.accountsdk.utils.n7h<String, String> f72928zy = new com.xiaomi.accountsdk.utils.n7h<>();

    /* JADX INFO: renamed from: q */
    protected final com.xiaomi.accountsdk.utils.n7h<String, String> f30941q = new com.xiaomi.accountsdk.utils.n7h<>();

    /* JADX INFO: renamed from: n */
    protected boolean f30940n = true;

    /* JADX INFO: renamed from: g */
    protected String f30938g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected Integer f72926f7l8 = null;

    public void f7l8(String str, String str2) {
        this.f72928zy.easyPutOpt(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public void m18939g(Map<String, String> map) {
        if (map != null) {
            this.f30941q.putAll(map);
        }
    }

    /* JADX INFO: renamed from: k */
    public C5538i m18940k() {
        C5538i c5538i = new C5538i();
        toq(c5538i);
        return c5538i;
    }

    public void ld6(String str) {
        this.f30938g = str;
    }

    /* JADX INFO: renamed from: n */
    public void m18941n(Map<String, String> map) {
        if (map != null) {
            this.f30939k.putAll(map);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m18942p(Integer num) {
        this.f72926f7l8 = num;
    }

    /* JADX INFO: renamed from: q */
    public void m18943q(Map<String, String> map) {
        if (map != null) {
            this.f72928zy.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m18944s(boolean z2) {
        this.f30940n = z2;
    }

    protected final void toq(C5538i c5538i) {
        if (c5538i == null) {
            return;
        }
        c5538i.zy(this.f72927toq);
        c5538i.m18941n(this.f30939k);
        c5538i.m18939g(this.f30941q);
        c5538i.m18943q(this.f72928zy);
        c5538i.ld6(this.f30938g);
        c5538i.m18944s(this.f30940n);
        c5538i.m18942p(this.f72926f7l8);
    }

    /* JADX INFO: renamed from: y */
    public void m18945y(String str, String str2) {
        this.f30939k.easyPutOpt(str, str2);
    }

    public void zy(Map<String, String> map) {
        if (map != null) {
            this.f72927toq.putAll(map);
        }
    }
}
