package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0605y;
import androidx.core.provider.f7l8;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.provider.k */
/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
class C0600k {

    /* JADX INFO: renamed from: k */
    @lvui
    private final C0605y.q f3739k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final Handler f50557toq;

    /* JADX INFO: renamed from: androidx.core.provider.k$k */
    /* JADX INFO: compiled from: CallbackWithHandler.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0605y.q f3740k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Typeface f3742q;

        k(C0605y.q qVar, Typeface typeface) {
            this.f3740k = qVar;
            this.f3742q = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3740k.toq(this.f3742q);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.k$toq */
    /* JADX INFO: compiled from: CallbackWithHandler.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0605y.q f3743k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f3745q;

        toq(C0605y.q qVar, int i2) {
            this.f3743k = qVar;
            this.f3745q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3743k.mo2533k(this.f3745q);
        }
    }

    C0600k(@lvui C0605y.q qVar, @lvui Handler handler) {
        this.f3739k = qVar;
        this.f50557toq = handler;
    }

    /* JADX INFO: renamed from: k */
    private void m2798k(int i2) {
        this.f50557toq.post(new toq(this.f3739k, i2));
    }

    private void zy(@lvui Typeface typeface) {
        this.f50557toq.post(new k(this.f3739k, typeface));
    }

    void toq(@lvui f7l8.C0597n c0597n) {
        if (c0597n.m2789k()) {
            zy(c0597n.f3728k);
        } else {
            m2798k(c0597n.f50554toq);
        }
    }

    C0600k(@lvui C0605y.q qVar) {
        this.f3739k = qVar;
        this.f50557toq = androidx.core.provider.toq.m2812k();
    }
}
