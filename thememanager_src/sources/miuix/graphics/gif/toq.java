package miuix.graphics.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import miuix.io.C7184k;

/* JADX INFO: compiled from: DecodeGifImageHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: s */
    public static final int f40010s = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public C7184k f87465f7l8;

    /* JADX INFO: renamed from: g */
    public Handler f40011g;

    /* JADX INFO: renamed from: n */
    public boolean f40013n;

    /* JADX INFO: renamed from: q */
    public int f40014q;

    /* JADX INFO: renamed from: y */
    private HandlerC7108k f40015y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87467zy;

    /* JADX INFO: renamed from: k */
    public long f40012k = 1048576;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public List<zy> f87466toq = new ArrayList();

    /* JADX INFO: renamed from: miuix.graphics.gif.toq$k */
    /* JADX INFO: compiled from: DecodeGifImageHelper.java */
    class HandlerC7109k extends Handler {
        HandlerC7109k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            toq toqVar = toq.this;
            if (toqVar.m25730s(toqVar.f40015y.m25724q())) {
                toq.this.m25728n();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.graphics.gif.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DecodeGifImageHelper.java */
    public static class C8104toq {

        /* JADX INFO: renamed from: k */
        public miuix.graphics.gif.zy f40017k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f87468toq;
    }

    /* JADX INFO: compiled from: DecodeGifImageHelper.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        public Bitmap f40018k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f87469toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f87470zy;

        public zy(Bitmap bitmap, int i2, int i3) {
            this.f40018k = bitmap;
            this.f87469toq = i2;
            this.f87470zy = i3;
        }
    }

    private int toq(int i2) {
        int i3 = this.f40014q;
        return i3 == 0 ? i2 : i2 % i3;
    }

    /* JADX INFO: renamed from: y */
    private int m25726y() {
        return this.f87466toq.get(r0.size() - 1).f87470zy;
    }

    public static C8104toq zy(C7184k c7184k, long j2, int i2) {
        C8104toq c8104toq = new C8104toq();
        c8104toq.f40017k = null;
        c8104toq.f87468toq = false;
        try {
            c7184k.reset();
            miuix.graphics.gif.zy zyVar = new miuix.graphics.gif.zy();
            c8104toq.f40017k = zyVar;
            zyVar.fti(i2);
            zyVar.jk(j2);
            c8104toq.f87468toq = zyVar.kja0(c7184k) == 0;
            c7184k.close();
        } catch (IOException unused) {
        }
        return c8104toq;
    }

    public void f7l8() {
        HandlerC7109k handlerC7109k = new HandlerC7109k(Looper.getMainLooper());
        this.f40011g = handlerC7109k;
        this.f40015y = HandlerC7108k.m25723k(this.f87465f7l8, this.f40012k, handlerC7109k);
        this.f87467zy = this.f87466toq.size();
        m25728n();
    }

    /* JADX INFO: renamed from: g */
    public void m25727g() {
        HandlerC7108k handlerC7108k = this.f40015y;
        if (handlerC7108k != null) {
            handlerC7108k.zy();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m25728n() {
        int size = this.f87466toq.size();
        int i2 = this.f87467zy;
        boolean z2 = false;
        if (i2 > 3 ? size <= i2 / 2 : size <= 2) {
            z2 = true;
        }
        if (z2) {
            this.f40015y.toq(toq(m25726y() + 1));
        }
    }

    /* JADX INFO: renamed from: q */
    public C8104toq m25729q(int i2) {
        return zy(this.f87465f7l8, this.f40012k, i2);
    }

    /* JADX INFO: renamed from: s */
    public boolean m25730s(C8104toq c8104toq) {
        miuix.graphics.gif.zy zyVar;
        if (!c8104toq.f87468toq || (zyVar = c8104toq.f40017k) == null) {
            return false;
        }
        Log.d("dumpFrameIndex", String.format("Thread#%d: decoded %d frames [%s] [%d]", Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(c8104toq.f40017k.m25731g()), Boolean.valueOf(c8104toq.f87468toq), Integer.valueOf(this.f40014q)));
        if (zyVar.x2()) {
            this.f40014q = zyVar.m25738s();
        }
        int iM25731g = zyVar.m25731g();
        if (iM25731g > 0) {
            int iM25726y = m25726y();
            for (int i2 = 0; i2 < iM25731g; i2++) {
                this.f87466toq.add(new zy(zyVar.m25735n(i2), zyVar.m25737q(i2), toq(iM25726y + 1 + i2)));
            }
        }
        return true;
    }
}
