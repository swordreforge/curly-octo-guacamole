package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.f7l8;
import com.bumptech.glide.util.kja0;
import com.miui.maml.folme.AnimatedProperty;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.k */
/* JADX INFO: compiled from: BitmapPreFillRunner.java */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3040k implements Runnable {

    /* JADX INFO: renamed from: i */
    @yz
    static final String f18440i = "PreFillRunner";

    /* JADX INFO: renamed from: l */
    static final int f18441l = 4;

    /* JADX INFO: renamed from: r */
    static final long f18442r = 40;

    /* JADX INFO: renamed from: t */
    static final long f18443t = 32;

    /* JADX INFO: renamed from: g */
    private final k f18445g;

    /* JADX INFO: renamed from: h */
    private boolean f18446h;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18447k;

    /* JADX INFO: renamed from: n */
    private final zy f18448n;

    /* JADX INFO: renamed from: p */
    private long f18449p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3018p f18450q;

    /* JADX INFO: renamed from: s */
    private final Handler f18451s;

    /* JADX INFO: renamed from: y */
    private final Set<C3041q> f18452y;

    /* JADX INFO: renamed from: z */
    private static final k f18444z = new k();

    /* JADX INFO: renamed from: f */
    static final long f18439f = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.k$k */
    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    @yz
    static class k {
        k() {
        }

        /* JADX INFO: renamed from: k */
        long m10802k() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.k$toq */
    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    private static final class toq implements f7l8 {
        toq() {
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public RunnableC3040k(InterfaceC3008n interfaceC3008n, InterfaceC3018p interfaceC3018p, zy zyVar) {
        this(interfaceC3008n, interfaceC3018p, zyVar, f18444z, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: n */
    private boolean m10799n(long j2) {
        return this.f18445g.m10802k() - j2 >= 32;
    }

    /* JADX INFO: renamed from: q */
    private long m10800q() {
        long j2 = this.f18449p;
        this.f18449p = Math.min(4 * j2, f18439f);
        return j2;
    }

    private long zy() {
        return this.f18450q.mo10715n() - this.f18450q.mo10716q();
    }

    @yz
    /* JADX INFO: renamed from: k */
    boolean m10801k() {
        Bitmap bitmapCreateBitmap;
        long jM10802k = this.f18445g.m10802k();
        while (!this.f18448n.toq() && !m10799n(jM10802k)) {
            C3041q c3041qZy = this.f18448n.zy();
            if (this.f18452y.contains(c3041qZy)) {
                bitmapCreateBitmap = Bitmap.createBitmap(c3041qZy.m10804q(), c3041qZy.toq(), c3041qZy.m10803k());
            } else {
                this.f18452y.add(c3041qZy);
                bitmapCreateBitmap = this.f18447k.f7l8(c3041qZy.m10804q(), c3041qZy.toq(), c3041qZy.m10803k());
            }
            int iM11233y = kja0.m11233y(bitmapCreateBitmap);
            if (zy() >= iM11233y) {
                this.f18450q.mo10713g(new toq(), com.bumptech.glide.load.resource.bitmap.f7l8.m10956g(bitmapCreateBitmap, this.f18447k));
            } else {
                this.f18447k.mo10669q(bitmapCreateBitmap);
            }
            if (Log.isLoggable(f18440i, 3)) {
                Log.d(f18440i, "allocated [" + c3041qZy.m10804q() + AnimatedProperty.PROPERTY_NAME_X + c3041qZy.toq() + "] " + c3041qZy.m10803k() + " size: " + iM11233y);
            }
        }
        return (this.f18446h || this.f18448n.toq()) ? false : true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m10801k()) {
            this.f18451s.postDelayed(this, m10800q());
        }
    }

    public void toq() {
        this.f18446h = true;
    }

    @yz
    RunnableC3040k(InterfaceC3008n interfaceC3008n, InterfaceC3018p interfaceC3018p, zy zyVar, k kVar, Handler handler) {
        this.f18452y = new HashSet();
        this.f18449p = f18442r;
        this.f18447k = interfaceC3008n;
        this.f18450q = interfaceC3018p;
        this.f18448n = zyVar;
        this.f18445g = kVar;
        this.f18451s = handler;
    }
}
