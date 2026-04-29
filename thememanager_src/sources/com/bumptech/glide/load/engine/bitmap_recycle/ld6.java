package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements InterfaceC3008n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f62713ld6 = "LruBitmapPool";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Bitmap.Config f62714x2 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f62715f7l8;

    /* JADX INFO: renamed from: g */
    private long f18268g;

    /* JADX INFO: renamed from: k */
    private final x2 f18269k;

    /* JADX INFO: renamed from: n */
    private long f18270n;

    /* JADX INFO: renamed from: p */
    private int f18271p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3007k f18272q;

    /* JADX INFO: renamed from: s */
    private int f18273s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Set<Bitmap.Config> f62716toq;

    /* JADX INFO: renamed from: y */
    private int f18274y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f62717zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.ld6$k */
    /* JADX INFO: compiled from: LruBitmapPool.java */
    private interface InterfaceC3007k {
        /* JADX INFO: renamed from: k */
        void mo10690k(Bitmap bitmap);

        void toq(Bitmap bitmap);
    }

    /* JADX INFO: compiled from: LruBitmapPool.java */
    private static final class toq implements InterfaceC3007k {
        toq() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.ld6.InterfaceC3007k
        /* JADX INFO: renamed from: k */
        public void mo10690k(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.ld6.InterfaceC3007k
        public void toq(Bitmap bitmap) {
        }
    }

    /* JADX INFO: compiled from: LruBitmapPool.java */
    private static class zy implements InterfaceC3007k {

        /* JADX INFO: renamed from: k */
        private final Set<Bitmap> f18275k = Collections.synchronizedSet(new HashSet());

        private zy() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.ld6.InterfaceC3007k
        /* JADX INFO: renamed from: k */
        public void mo10690k(Bitmap bitmap) {
            if (!this.f18275k.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f18275k.remove(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.ld6.InterfaceC3007k
        public void toq(Bitmap bitmap) {
            if (!this.f18275k.contains(bitmap)) {
                this.f18275k.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + AnimatedProperty.PROPERTY_NAME_X + bitmap.getHeight() + "]");
        }
    }

    ld6(long j2, x2 x2Var, Set<Bitmap.Config> set) {
        this.f62717zy = j2;
        this.f18270n = j2;
        this.f18269k = x2Var;
        this.f62716toq = set;
        this.f18272q = new toq();
    }

    @dd
    private synchronized Bitmap cdj(int i2, int i3, @dd Bitmap.Config config) {
        Bitmap bitmapMo10672g;
        m10688y(config);
        bitmapMo10672g = this.f18269k.mo10672g(i2, i3, config != null ? config : f62714x2);
        if (bitmapMo10672g == null) {
            if (Log.isLoggable(f62713ld6, 3)) {
                Log.d(f62713ld6, "Missing bitmap=" + this.f18269k.toq(i2, i3, config));
            }
            this.f18274y++;
        } else {
            this.f62715f7l8++;
            this.f18268g -= (long) this.f18269k.zy(bitmapMo10672g);
            this.f18272q.mo10690k(bitmapMo10672g);
            fn3e(bitmapMo10672g);
        }
        if (Log.isLoggable(f62713ld6, 2)) {
            Log.v(f62713ld6, "Get bitmap=" + this.f18269k.toq(i2, i3, config));
        }
        m10686p();
        return bitmapMo10672g;
    }

    private static void fn3e(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        t8r(bitmap);
    }

    /* JADX INFO: renamed from: h */
    private static x2 m10685h() {
        return new kja0();
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> kja0() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private void ld6() {
        Log.v(f62713ld6, "Hits=" + this.f62715f7l8 + ", misses=" + this.f18274y + ", puts=" + this.f18273s + ", evictions=" + this.f18271p + ", currentSize=" + this.f18268g + ", maxSize=" + this.f18270n + "\nStrategy=" + this.f18269k);
    }

    /* JADX INFO: renamed from: p */
    private void m10686p() {
        if (Log.isLoggable(f62713ld6, 2)) {
            ld6();
        }
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private static Bitmap m10687s(int i2, int i3, @dd Bitmap.Config config) {
        if (config == null) {
            config = f62714x2;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @TargetApi(19)
    private static void t8r(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private void x2() {
        zurt(this.f18270n);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: y */
    private static void m10688y(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private synchronized void zurt(long j2) {
        while (this.f18268g > j2) {
            Bitmap bitmapRemoveLast = this.f18269k.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable(f62713ld6, 5)) {
                    Log.w(f62713ld6, "Size mismatch, resetting");
                    ld6();
                }
                this.f18268g = 0L;
                return;
            }
            this.f18272q.mo10690k(bitmapRemoveLast);
            this.f18268g -= (long) this.f18269k.zy(bitmapRemoveLast);
            this.f18271p++;
            if (Log.isLoggable(f62713ld6, 3)) {
                Log.d(f62713ld6, "Evicting bitmap=" + this.f18269k.mo10673k(bitmapRemoveLast));
            }
            m10686p();
            bitmapRemoveLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    @lvui
    public Bitmap f7l8(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapCdj = cdj(i2, i3, config);
        return bitmapCdj == null ? m10687s(i2, i3, config) : bitmapCdj;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    @lvui
    /* JADX INFO: renamed from: g */
    public Bitmap mo10666g(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapCdj = cdj(i2, i3, config);
        if (bitmapCdj == null) {
            return m10687s(i2, i3, config);
        }
        bitmapCdj.eraseColor(0);
        return bitmapCdj;
    }

    /* JADX INFO: renamed from: i */
    public long m10689i() {
        return this.f18274y;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: k */
    public void mo10667k(int i2) {
        if (Log.isLoggable(f62713ld6, 3)) {
            Log.d(f62713ld6, "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            toq();
        } else if (i2 >= 20 || i2 == 15) {
            zurt(mo10668n() / 2);
        }
    }

    public long ki() {
        return this.f62715f7l8;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    /* JADX INFO: renamed from: n */
    public long mo10668n() {
        return this.f18270n;
    }

    public long n7h() {
        return this.f18268g;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    /* JADX INFO: renamed from: q */
    public synchronized void mo10669q(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f18269k.zy(bitmap) <= this.f18270n && this.f62716toq.contains(bitmap.getConfig())) {
                int iZy = this.f18269k.zy(bitmap);
                this.f18269k.mo10674q(bitmap);
                this.f18272q.toq(bitmap);
                this.f18273s++;
                this.f18268g += (long) iZy;
                if (Log.isLoggable(f62713ld6, 2)) {
                    Log.v(f62713ld6, "Put bitmap in pool=" + this.f18269k.mo10673k(bitmap));
                }
                m10686p();
                x2();
                return;
            }
            if (Log.isLoggable(f62713ld6, 2)) {
                Log.v(f62713ld6, "Reject bitmap from pool, bitmap: " + this.f18269k.mo10673k(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f62716toq.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public long qrj() {
        return this.f18271p;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    public void toq() {
        if (Log.isLoggable(f62713ld6, 3)) {
            Log.d(f62713ld6, "clearMemory");
        }
        zurt(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n
    public synchronized void zy(float f2) {
        this.f18270n = Math.round(this.f62717zy * f2);
        x2();
    }

    public ld6(long j2) {
        this(j2, m10685h(), kja0());
    }

    public ld6(long j2, Set<Bitmap.Config> set) {
        this(j2, m10685h(), set);
    }
}
