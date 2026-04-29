package com.xiaomi.accountsdk.utils;

import android.util.Base64;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.utils.toq;
import java.security.SecureRandom;

/* JADX INFO: compiled from: AESWithIVCoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements InterfaceC5575p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72985f7l8 = "1";

    /* JADX INFO: renamed from: g */
    private static final String f31071g = "AESWithIVCoder";

    /* JADX INFO: renamed from: y */
    private static final int f31072y = 11;

    /* JADX INFO: renamed from: k */
    private byte[] f31073k;

    /* JADX INFO: renamed from: n */
    protected String f31074n;

    /* JADX INFO: renamed from: q */
    private C5570k f31075q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f72986toq = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f72987zy = 0;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.zy$k */
    /* JADX INFO: compiled from: AESWithIVCoder.java */
    class C5583k extends C5570k {
        C5583k(String str) {
            super(str);
        }

        @Override // com.xiaomi.accountsdk.utils.C5570k
        /* JADX INFO: renamed from: n */
        protected byte[] mo19093n() {
            return zy.this.f31073k;
        }
    }

    public zy(String str) {
        this.f31074n = str;
        this.f31075q = new C5583k(str);
        m19168n();
    }

    /* JADX INFO: renamed from: n */
    private void m19168n() {
        this.f72987zy = Thread.currentThread().getId();
    }

    @Override // com.xiaomi.accountsdk.utils.InterfaceC5575p
    /* JADX INFO: renamed from: k */
    public String mo19092k(String str) throws C5545n {
        m19169q();
        try {
            this.f31073k = new byte[16];
            new SecureRandom().nextBytes(this.f31073k);
            return toq.m19139q("1", Base64.encodeToString(this.f31073k, 11), this.f31075q.mo19092k(str)).toString();
        } catch (toq.C5579k e2) {
            throw new C5545n(e2);
        }
    }

    /* JADX INFO: renamed from: q */
    protected void m19169q() {
        if (Thread.currentThread().getId() != this.f72987zy) {
            throw new IllegalAccessError("this method can not call concurrently");
        }
    }

    @Override // com.xiaomi.accountsdk.utils.InterfaceC5575p
    public String toq(String str) throws C5545n {
        m19169q();
        try {
            toq toqVarZy = toq.zy(str);
            if (toqVarZy.m19141n().equals("1")) {
                this.f31073k = Base64.decode(toqVarZy.toq(), 11);
                return this.f31075q.toq(toqVarZy.m19140k());
            }
            throw new C5545n("aes encrypt format version is wrong" + str);
        } catch (toq.C5579k e2) {
            throw new C5545n(e2);
        }
    }
}
