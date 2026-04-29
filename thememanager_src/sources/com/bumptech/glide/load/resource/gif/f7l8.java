package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.kja0;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.n7h;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.target.AbstractC3179n;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import com.bumptech.glide.signature.C3197n;
import com.bumptech.glide.util.qrj;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes2.dex */
class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f62948cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f62949f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f18782g;

    /* JADX INFO: renamed from: h */
    @dd
    private InterfaceC3124q f18783h;

    /* JADX INFO: renamed from: k */
    private final InterfaceC2974k f18784k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f62950ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private C3123k f62951kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f62952ld6;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3008n f18785n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private n7h<Bitmap> f62953n7h;

    /* JADX INFO: renamed from: p */
    private C3123k f18786p;

    /* JADX INFO: renamed from: q */
    final kja0 f18787q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private Bitmap f62954qrj;

    /* JADX INFO: renamed from: s */
    private com.bumptech.glide.n7h<Bitmap> f18788s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f62955t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Handler f62956toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private C3123k f62957x2;

    /* JADX INFO: renamed from: y */
    private boolean f18789y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<toq> f62958zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.f7l8$k */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    @yz
    static class C3123k extends AbstractC3179n<Bitmap> {

        /* JADX INFO: renamed from: g */
        private final Handler f18790g;

        /* JADX INFO: renamed from: p */
        private Bitmap f18791p;

        /* JADX INFO: renamed from: s */
        private final long f18792s;

        /* JADX INFO: renamed from: y */
        final int f18793y;

        C3123k(Handler handler, int i2, long j2) {
            this.f18790g = handler;
            this.f18793y = i2;
            this.f18792s = j2;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void qrj(@lvui Bitmap bitmap, @dd InterfaceC3185g<? super Bitmap> interfaceC3185g) {
            this.f18791p = bitmap;
            this.f18790g.sendMessageAtTime(this.f18790g.obtainMessage(1, this), this.f18792s);
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void x2(@dd Drawable drawable) {
            this.f18791p = null;
        }

        Bitmap zy() {
            return this.f18791p;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.f7l8$q */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    @yz
    interface InterfaceC3124q {
        /* JADX INFO: renamed from: k */
        void m11046k();
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo11047k();
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    private class zy implements Handler.Callback {

        /* JADX INFO: renamed from: n */
        static final int f18794n = 2;

        /* JADX INFO: renamed from: q */
        static final int f18795q = 1;

        zy() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                f7l8.this.kja0((C3123k) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            f7l8.this.f18787q.wvg((C3123k) message.obj);
            return false;
        }
    }

    f7l8(com.bumptech.glide.zy zyVar, InterfaceC2974k interfaceC2974k, int i2, int i3, n7h<Bitmap> n7hVar, Bitmap bitmap) {
        this(zyVar.m11289y(), com.bumptech.glide.zy.a9(zyVar.m11286p()), interfaceC2974k, null, ld6(com.bumptech.glide.zy.a9(zyVar.m11286p()), i2, i3), n7hVar, bitmap);
    }

    private static com.bumptech.glide.load.f7l8 f7l8() {
        return new C3197n(Double.valueOf(Math.random()));
    }

    private void fn3e() {
        this.f18782g = false;
    }

    /* JADX INFO: renamed from: h */
    private void m11036h() {
        Bitmap bitmap = this.f62954qrj;
        if (bitmap != null) {
            this.f18785n.mo10669q(bitmap);
            this.f62954qrj = null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11037i() {
        if (this.f18782g) {
            return;
        }
        this.f18782g = true;
        this.f62952ld6 = false;
        n7h();
    }

    private static com.bumptech.glide.n7h<Bitmap> ld6(kja0 kja0Var, int i2, int i3) {
        return kja0Var.zurt().mo6764k(C3173s.zkd(AbstractC3039p.f62798toq).w831(true).zsr0(true).mo6763d(i2, i3));
    }

    private void n7h() {
        if (!this.f18782g || this.f62949f7l8) {
            return;
        }
        if (this.f18789y) {
            qrj.m11260k(this.f62951kja0 == null, "Pending target must be null when starting from the first frame");
            this.f18784k.x2();
            this.f18789y = false;
        }
        C3123k c3123k = this.f62951kja0;
        if (c3123k != null) {
            this.f62951kja0 = null;
            kja0(c3123k);
            return;
        }
        this.f62949f7l8 = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f18784k.ld6());
        this.f18784k.mo10591q();
        this.f62957x2 = new C3123k(this.f62956toq, this.f18784k.n7h(), jUptimeMillis);
        this.f18788s.mo6764k(C3173s.ukdy(f7l8())).cdj(this.f18784k).yl(this.f62957x2);
    }

    void cdj(n7h<Bitmap> n7hVar, Bitmap bitmap) {
        this.f62953n7h = (n7h) qrj.m11262q(n7hVar);
        this.f62954qrj = (Bitmap) qrj.m11262q(bitmap);
        this.f18788s = this.f18788s.mo6764k(new C3173s().ltg8(n7hVar));
        this.f62948cdj = com.bumptech.glide.util.kja0.m11233y(bitmap);
        this.f62950ki = bitmap.getWidth();
        this.f62955t8r = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: g */
    int m11038g() {
        return this.f18784k.mo10589n();
    }

    /* JADX INFO: renamed from: k */
    void m11039k() {
        this.f62958zy.clear();
        m11036h();
        fn3e();
        C3123k c3123k = this.f18786p;
        if (c3123k != null) {
            this.f18787q.wvg(c3123k);
            this.f18786p = null;
        }
        C3123k c3123k2 = this.f62957x2;
        if (c3123k2 != null) {
            this.f18787q.wvg(c3123k2);
            this.f62957x2 = null;
        }
        C3123k c3123k3 = this.f62951kja0;
        if (c3123k3 != null) {
            this.f18787q.wvg(c3123k3);
            this.f62951kja0 = null;
        }
        this.f18784k.clear();
        this.f62952ld6 = true;
    }

    void ki() {
        qrj.m11260k(!this.f18782g, "Can't restart a running animation");
        this.f18789y = true;
        C3123k c3123k = this.f62951kja0;
        if (c3123k != null) {
            this.f18787q.wvg(c3123k);
            this.f62951kja0 = null;
        }
    }

    @yz
    void kja0(C3123k c3123k) {
        InterfaceC3124q interfaceC3124q = this.f18783h;
        if (interfaceC3124q != null) {
            interfaceC3124q.m11046k();
        }
        this.f62949f7l8 = false;
        if (this.f62952ld6) {
            this.f62956toq.obtainMessage(2, c3123k).sendToTarget();
            return;
        }
        if (!this.f18782g) {
            if (this.f18789y) {
                this.f62956toq.obtainMessage(2, c3123k).sendToTarget();
                return;
            } else {
                this.f62951kja0 = c3123k;
                return;
            }
        }
        if (c3123k.zy() != null) {
            m11036h();
            C3123k c3123k2 = this.f18786p;
            this.f18786p = c3123k;
            for (int size = this.f62958zy.size() - 1; size >= 0; size--) {
                this.f62958zy.get(size).mo11047k();
            }
            if (c3123k2 != null) {
                this.f62956toq.obtainMessage(2, c3123k2).sendToTarget();
            }
        }
        n7h();
    }

    /* JADX INFO: renamed from: n */
    Bitmap m11040n() {
        return this.f62954qrj;
    }

    void ni7(toq toqVar) {
        this.f62958zy.remove(toqVar);
        if (this.f62958zy.isEmpty()) {
            fn3e();
        }
    }

    /* JADX INFO: renamed from: p */
    int m11041p() {
        return this.f18784k.mo10593y();
    }

    /* JADX INFO: renamed from: q */
    int m11042q() {
        C3123k c3123k = this.f18786p;
        if (c3123k != null) {
            return c3123k.f18793y;
        }
        return -1;
    }

    int qrj() {
        return this.f62950ki;
    }

    /* JADX INFO: renamed from: s */
    int m11043s() {
        return this.f62955t8r;
    }

    @yz
    void t8r(@dd InterfaceC3124q interfaceC3124q) {
        this.f18783h = interfaceC3124q;
    }

    ByteBuffer toq() {
        return this.f18784k.getData().asReadOnlyBuffer();
    }

    int x2() {
        return this.f18784k.ki() + this.f62948cdj;
    }

    /* JADX INFO: renamed from: y */
    n7h<Bitmap> m11044y() {
        return this.f62953n7h;
    }

    void zurt(toq toqVar) {
        if (this.f62952ld6) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f62958zy.contains(toqVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f62958zy.isEmpty();
        this.f62958zy.add(toqVar);
        if (zIsEmpty) {
            m11037i();
        }
    }

    Bitmap zy() {
        C3123k c3123k = this.f18786p;
        return c3123k != null ? c3123k.zy() : this.f62954qrj;
    }

    f7l8(InterfaceC3008n interfaceC3008n, kja0 kja0Var, InterfaceC2974k interfaceC2974k, Handler handler, com.bumptech.glide.n7h<Bitmap> n7hVar, n7h<Bitmap> n7hVar2, Bitmap bitmap) {
        this.f62958zy = new ArrayList();
        this.f18787q = kja0Var;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new zy()) : handler;
        this.f18785n = interfaceC3008n;
        this.f62956toq = handler;
        this.f18788s = n7hVar;
        this.f18784k = interfaceC2974k;
        cdj(n7hVar2, bitmap);
    }
}
