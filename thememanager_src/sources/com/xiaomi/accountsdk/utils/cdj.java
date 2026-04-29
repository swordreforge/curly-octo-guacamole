package com.xiaomi.accountsdk.utils;

/* JADX INFO: compiled from: FidSigningUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.cdj$k */
    /* JADX INFO: compiled from: FidSigningUtil.java */
    public static class C5562k extends Exception {
        public C5562k(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.cdj$q */
    /* JADX INFO: compiled from: FidSigningUtil.java */
    public interface InterfaceC5563q {
        /* JADX INFO: renamed from: k */
        byte[] mo19055k(byte[] bArr) throws C5562k;

        boolean toq() throws C5562k;

        String zy() throws C5562k;
    }

    /* JADX INFO: compiled from: FidSigningUtil.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static volatile InterfaceC5563q f31014k = new zy();

        private toq() {
        }
    }

    /* JADX INFO: compiled from: FidSigningUtil.java */
    public static final class zy implements InterfaceC5563q {
        @Override // com.xiaomi.accountsdk.utils.cdj.InterfaceC5563q
        /* JADX INFO: renamed from: k */
        public byte[] mo19055k(byte[] bArr) throws C5562k {
            return bArr;
        }

        @Override // com.xiaomi.accountsdk.utils.cdj.InterfaceC5563q
        public boolean toq() {
            return false;
        }

        @Override // com.xiaomi.accountsdk.utils.cdj.InterfaceC5563q
        public String zy() throws C5562k {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC5563q m19054k() {
        return toq.f31014k;
    }

    public static void toq(InterfaceC5563q interfaceC5563q) {
        if (interfaceC5563q == null) {
            throw new IllegalArgumentException("signer == null");
        }
        InterfaceC5563q unused = toq.f31014k = interfaceC5563q;
    }
}
