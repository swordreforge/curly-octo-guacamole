package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.ki;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
final class x9kr implements ki {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f67155toq = 50;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.o1t("messagePool")
    private static final List<toq> f67156zy = new ArrayList(50);

    /* JADX INFO: renamed from: k */
    private final Handler f23336k;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    private static final class toq implements ki.InterfaceC3845k {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private Message f23337k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private x9kr f67157toq;

        private toq() {
        }

        private void toq() {
            this.f23337k = null;
            this.f67157toq = null;
            x9kr.ki(this);
        }

        @Override // com.google.android.exoplayer2.util.ki.InterfaceC3845k
        public ki getTarget() {
            return (ki) C3844k.f7l8(this.f67157toq);
        }

        @Override // com.google.android.exoplayer2.util.ki.InterfaceC3845k
        /* JADX INFO: renamed from: k */
        public void mo13642k() {
            ((Message) C3844k.f7l8(this.f23337k)).sendToTarget();
            toq();
        }

        /* JADX INFO: renamed from: q */
        public toq m13761q(Message message, x9kr x9krVar) {
            this.f23337k = message;
            this.f67157toq = x9krVar;
            return this;
        }

        public boolean zy(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C3844k.f7l8(this.f23337k));
            toq();
            return zSendMessageAtFrontOfQueue;
        }
    }

    public x9kr(Handler handler) {
        this.f23336k = handler;
    }

    private static toq cdj() {
        toq toqVar;
        List<toq> list = f67156zy;
        synchronized (list) {
            toqVar = list.isEmpty() ? new toq() : list.remove(list.size() - 1);
        }
        return toqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ki(toq toqVar) {
        List<toq> list = f67156zy;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(toqVar);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.ki
    public ki.InterfaceC3845k f7l8(int i2, @zy.dd Object obj) {
        return cdj().m13761q(this.f23336k.obtainMessage(i2, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: g */
    public ki.InterfaceC3845k mo13635g(int i2, int i3, int i4, @zy.dd Object obj) {
        return cdj().m13761q(this.f23336k.obtainMessage(i2, i3, i4, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: k */
    public boolean mo13636k(int i2, int i3) {
        return this.f23336k.sendEmptyMessageDelayed(i2, i3);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public void kja0(int i2) {
        this.f23336k.removeMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public boolean ld6(Runnable runnable) {
        return this.f23336k.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: n */
    public boolean mo13637n(int i2) {
        return this.f23336k.hasMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public boolean n7h(int i2, long j2) {
        return this.f23336k.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: p */
    public ki.InterfaceC3845k mo13638p(int i2, int i3, int i4) {
        return cdj().m13761q(this.f23336k.obtainMessage(i2, i3, i4), this);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: q */
    public boolean mo13639q(ki.InterfaceC3845k interfaceC3845k) {
        return ((toq) interfaceC3845k).zy(this.f23336k);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public boolean qrj(int i2) {
        return this.f23336k.sendEmptyMessage(i2);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: s */
    public Looper mo13640s() {
        return this.f23336k.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.ki
    public boolean toq(Runnable runnable) {
        return this.f23336k.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public boolean x2(Runnable runnable, long j2) {
        return this.f23336k.postDelayed(runnable, j2);
    }

    @Override // com.google.android.exoplayer2.util.ki
    /* JADX INFO: renamed from: y */
    public void mo13641y(@zy.dd Object obj) {
        this.f23336k.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.ki
    public ki.InterfaceC3845k zy(int i2) {
        return cdj().m13761q(this.f23336k.obtainMessage(i2), this);
    }
}
