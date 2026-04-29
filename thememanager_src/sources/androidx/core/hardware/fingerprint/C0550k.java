package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lrht;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k */
/* JADX INFO: compiled from: FingerprintManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C0550k {

    /* JADX INFO: renamed from: k */
    private final Context f3603k;

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k$k */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    class k extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zy f3604k;

        k(zy zyVar) {
            this.f3604k = zyVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i2, CharSequence charSequence) {
            this.f3604k.m2604k(i2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f3604k.toq();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i2, CharSequence charSequence) {
            this.f3604k.zy(i2, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f3604k.m2605q(new q(C0550k.m2593g(toq.toq(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k$q */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static final class q {

        /* JADX INFO: renamed from: k */
        private final n f3606k;

        public q(n nVar) {
            this.f3606k = nVar;
        }

        /* JADX INFO: renamed from: k */
        public n m2599k() {
            return this.f3606k;
        }
    }

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k$toq */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    @hyr(23)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        public static FingerprintManager.CryptoObject f7l8(n nVar) {
            if (nVar == null) {
                return null;
            }
            if (nVar.m2598k() != null) {
                return new FingerprintManager.CryptoObject(nVar.m2598k());
            }
            if (nVar.zy() != null) {
                return new FingerprintManager.CryptoObject(nVar.zy());
            }
            if (nVar.toq() != null) {
                return new FingerprintManager.CryptoObject(nVar.toq());
            }
            return null;
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        public static n m2600g(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new n(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new n(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new n(cryptoObject.getMac());
            }
            return null;
        }

        @lrht("android.permission.USE_FINGERPRINT")
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2601k(Object obj, Object obj2, CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @lrht("android.permission.USE_FINGERPRINT")
        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m2602n(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @lrht("android.permission.USE_FINGERPRINT")
        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m2603q(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @InterfaceC7830i
        static FingerprintManager.CryptoObject toq(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @InterfaceC7830i
        public static FingerprintManager zy(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k$zy */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static abstract class zy {
        /* JADX INFO: renamed from: k */
        public void m2604k(int i2, CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: q */
        public void m2605q(q qVar) {
        }

        public void toq() {
        }

        public void zy(int i2, CharSequence charSequence) {
        }
    }

    private C0550k(Context context) {
        this.f3603k = context;
    }

    @hyr(23)
    private static FingerprintManager.AuthenticationCallback f7l8(zy zyVar) {
        return new k(zyVar);
    }

    @hyr(23)
    /* JADX INFO: renamed from: g */
    static n m2593g(FingerprintManager.CryptoObject cryptoObject) {
        return toq.m2600g(cryptoObject);
    }

    @lvui
    public static C0550k toq(@lvui Context context) {
        return new C0550k(context);
    }

    @hyr(23)
    /* JADX INFO: renamed from: y */
    private static FingerprintManager.CryptoObject m2594y(n nVar) {
        return toq.f7l8(nVar);
    }

    @hyr(23)
    @dd
    private static FingerprintManager zy(@lvui Context context) {
        return toq.zy(context);
    }

    @lrht("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: k */
    public void m2595k(@dd n nVar, int i2, @dd androidx.core.os.zy zyVar, @lvui zy zyVar2, @dd Handler handler) {
        FingerprintManager fingerprintManagerZy = zy(this.f3603k);
        if (fingerprintManagerZy != null) {
            toq.m2601k(fingerprintManagerZy, m2594y(nVar), zyVar != null ? (CancellationSignal) zyVar.toq() : null, i2, f7l8(zyVar2), handler);
        }
    }

    @lrht("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: n */
    public boolean m2596n() {
        FingerprintManager fingerprintManagerZy = zy(this.f3603k);
        return fingerprintManagerZy != null && toq.m2602n(fingerprintManagerZy);
    }

    @lrht("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: q */
    public boolean m2597q() {
        FingerprintManager fingerprintManagerZy = zy(this.f3603k);
        return fingerprintManagerZy != null && toq.m2603q(fingerprintManagerZy);
    }

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.k$n */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static class n {

        /* JADX INFO: renamed from: k */
        private final Signature f3605k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Cipher f50493toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Mac f50494zy;

        public n(@lvui Signature signature) {
            this.f3605k = signature;
            this.f50493toq = null;
            this.f50494zy = null;
        }

        @dd
        /* JADX INFO: renamed from: k */
        public Cipher m2598k() {
            return this.f50493toq;
        }

        @dd
        public Mac toq() {
            return this.f50494zy;
        }

        @dd
        public Signature zy() {
            return this.f3605k;
        }

        public n(@lvui Cipher cipher) {
            this.f50493toq = cipher;
            this.f3605k = null;
            this.f50494zy = null;
        }

        public n(@lvui Mac mac) {
            this.f50494zy = mac;
            this.f50493toq = null;
            this.f3605k = null;
        }
    }
}
