package com.bumptech.glide.load.engine.cache;

import androidx.core.util.qrj;
import com.bumptech.glide.util.C3204p;
import com.bumptech.glide.util.kja0;
import com.bumptech.glide.util.pool.C3205k;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import zy.lvui;

/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    private final C3204p<com.bumptech.glide.load.f7l8, String> f18305k = new C3204p<>(1000);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final qrj.InterfaceC0641k<toq> f62738toq = C3205k.m11247n(10, new C3020k());

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.qrj$k */
    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    class C3020k implements C3205k.q<toq> {
        C3020k() {
        }

        @Override // com.bumptech.glide.util.pool.C3205k.q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public toq mo10723k() {
            try {
                return new toq(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    private static final class toq implements C3205k.g {

        /* JADX INFO: renamed from: k */
        final MessageDigest f18307k;

        /* JADX INFO: renamed from: q */
        private final com.bumptech.glide.util.pool.zy f18308q = com.bumptech.glide.util.pool.zy.m11255k();

        toq(MessageDigest messageDigest) {
            this.f18307k = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.C3205k.g
        @lvui
        /* JADX INFO: renamed from: q */
        public com.bumptech.glide.util.pool.zy mo10724q() {
            return this.f18308q;
        }
    }

    /* JADX INFO: renamed from: k */
    private String m10722k(com.bumptech.glide.load.f7l8 f7l8Var) {
        toq toqVar = (toq) com.bumptech.glide.util.qrj.m11262q(this.f62738toq.mo2983k());
        try {
            f7l8Var.toq(toqVar.f18307k);
            return kja0.o1t(toqVar.f18307k.digest());
        } finally {
            this.f62738toq.toq(toqVar);
        }
    }

    public String toq(com.bumptech.glide.load.f7l8 f7l8Var) {
        String strLd6;
        synchronized (this.f18305k) {
            strLd6 = this.f18305k.ld6(f7l8Var);
        }
        if (strLd6 == null) {
            strLd6 = m10722k(f7l8Var);
        }
        synchronized (this.f18305k) {
            this.f18305k.kja0(f7l8Var, strLd6);
        }
        return strLd6;
    }
}
