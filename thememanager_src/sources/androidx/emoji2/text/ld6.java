package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.graphics.jp0y;
import androidx.core.os.zurt;
import androidx.core.provider.C0599g;
import androidx.core.provider.C0605y;
import androidx.emoji2.text.C0830n;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.o1t;
import zy.uv6;
import zy.y9n;

/* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 extends C0830n.zy {

    /* JADX INFO: renamed from: p */
    private static final toq f4515p = new toq();

    /* JADX INFO: renamed from: androidx.emoji2.text.ld6$k */
    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class C0827k extends AbstractC0828q {

        /* JADX INFO: renamed from: k */
        private final long f4516k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f51145toq;

        public C0827k(long j2) {
            this.f4516k = j2;
        }

        @Override // androidx.emoji2.text.ld6.AbstractC0828q
        /* JADX INFO: renamed from: k */
        public long mo4022k() {
            if (this.f51145toq == 0) {
                this.f51145toq = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f51145toq;
            if (jUptimeMillis > this.f4516k) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f4516k - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ld6$q */
    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static abstract class AbstractC0828q {
        /* JADX INFO: renamed from: k */
        public abstract long mo4022k();
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class toq {
        @dd
        /* JADX INFO: renamed from: k */
        public Typeface m4023k(@lvui Context context, @lvui C0605y.zy zyVar) throws PackageManager.NameNotFoundException {
            return C0605y.m2814k(context, null, new C0605y.zy[]{zyVar});
        }

        /* JADX INFO: renamed from: q */
        public void m4024q(@lvui Context context, @lvui ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }

        @lvui
        public C0605y.toq toq(@lvui Context context, @lvui C0599g c0599g) throws PackageManager.NameNotFoundException {
            return C0605y.toq(context, null, c0599g);
        }

        public void zy(@lvui Context context, @lvui Uri uri, @lvui ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    static class zy implements C0830n.y {

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final String f51146x2 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @o1t("mLock")
        @dd
        private ThreadPoolExecutor f51147f7l8;

        /* JADX INFO: renamed from: g */
        @o1t("mLock")
        @dd
        private Executor f4517g;

        /* JADX INFO: renamed from: k */
        @lvui
        private final Context f4518k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @o1t("mLock")
        @dd
        private Runnable f51148ld6;

        /* JADX INFO: renamed from: n */
        @o1t("mLock")
        @dd
        private Handler f4519n;

        /* JADX INFO: renamed from: p */
        @o1t("mLock")
        @dd
        private ContentObserver f4520p;

        /* JADX INFO: renamed from: q */
        @lvui
        private final Object f4521q = new Object();

        /* JADX INFO: renamed from: s */
        @o1t("mLock")
        @dd
        C0830n.s f4522s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final C0599g f51149toq;

        /* JADX INFO: renamed from: y */
        @o1t("mLock")
        @dd
        private AbstractC0828q f4523y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final toq f51150zy;

        /* JADX INFO: renamed from: androidx.emoji2.text.ld6$zy$k */
        /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
        class C0829k extends ContentObserver {
            C0829k(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z2, Uri uri) {
                zy.this.m4027q();
            }
        }

        zy(@lvui Context context, @lvui C0599g c0599g, @lvui toq toqVar) {
            androidx.core.util.n7h.qrj(context, "Context cannot be null");
            androidx.core.util.n7h.qrj(c0599g, "FontRequest cannot be null");
            this.f4518k = context.getApplicationContext();
            this.f51149toq = c0599g;
            this.f51150zy = toqVar;
        }

        @hyr(19)
        @y9n
        /* JADX INFO: renamed from: g */
        private void m4025g(Uri uri, long j2) {
            synchronized (this.f4521q) {
                Handler handlerM4091n = this.f4519n;
                if (handlerM4091n == null) {
                    handlerM4091n = androidx.emoji2.text.zy.m4091n();
                    this.f4519n = handlerM4091n;
                }
                if (this.f4520p == null) {
                    C0829k c0829k = new C0829k(handlerM4091n);
                    this.f4520p = c0829k;
                    this.f51150zy.zy(this.f4518k, uri, c0829k);
                }
                if (this.f51148ld6 == null) {
                    this.f51148ld6 = new Runnable() { // from class: androidx.emoji2.text.qrj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4560k.m4027q();
                        }
                    };
                }
                handlerM4091n.postDelayed(this.f51148ld6, j2);
            }
        }

        @y9n
        /* JADX INFO: renamed from: n */
        private C0605y.zy m4026n() {
            try {
                C0605y.toq qVar = this.f51150zy.toq(this.f4518k, this.f51149toq);
                if (qVar.zy() == 0) {
                    C0605y.zy[] qVar2 = qVar.toq();
                    if (qVar2 == null || qVar2.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return qVar2[0];
                }
                throw new RuntimeException("fetchFonts failed (" + qVar.zy() + ")");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }

        private void toq() {
            synchronized (this.f4521q) {
                this.f4522s = null;
                ContentObserver contentObserver = this.f4520p;
                if (contentObserver != null) {
                    this.f51150zy.m4024q(this.f4518k, contentObserver);
                    this.f4520p = null;
                }
                Handler handler = this.f4519n;
                if (handler != null) {
                    handler.removeCallbacks(this.f51148ld6);
                }
                this.f4519n = null;
                ThreadPoolExecutor threadPoolExecutor = this.f51147f7l8;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4517g = null;
                this.f51147f7l8 = null;
            }
        }

        public void f7l8(@lvui Executor executor) {
            synchronized (this.f4521q) {
                this.f4517g = executor;
            }
        }

        @Override // androidx.emoji2.text.C0830n.y
        @hyr(19)
        /* JADX INFO: renamed from: k */
        public void mo3864k(@lvui C0830n.s sVar) {
            androidx.core.util.n7h.qrj(sVar, "LoaderCallback cannot be null");
            synchronized (this.f4521q) {
                this.f4522s = sVar;
            }
            m4027q();
        }

        @hyr(19)
        /* JADX INFO: renamed from: q */
        void m4027q() {
            synchronized (this.f4521q) {
                if (this.f4522s == null) {
                    return;
                }
                if (this.f4517g == null) {
                    ThreadPoolExecutor threadPoolExecutorZy = androidx.emoji2.text.zy.zy("emojiCompat");
                    this.f51147f7l8 = threadPoolExecutorZy;
                    this.f4517g = threadPoolExecutorZy;
                }
                this.f4517g.execute(new Runnable() { // from class: androidx.emoji2.text.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4576k.zy();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: y */
        public void m4028y(@dd AbstractC0828q abstractC0828q) {
            synchronized (this.f4521q) {
                this.f4523y = abstractC0828q;
            }
        }

        @hyr(19)
        @y9n
        void zy() {
            synchronized (this.f4521q) {
                if (this.f4522s == null) {
                    return;
                }
                try {
                    C0605y.zy zyVarM4026n = m4026n();
                    int qVar = zyVarM4026n.toq();
                    if (qVar == 2) {
                        synchronized (this.f4521q) {
                            AbstractC0828q abstractC0828q = this.f4523y;
                            if (abstractC0828q != null) {
                                long jMo4022k = abstractC0828q.mo4022k();
                                if (jMo4022k >= 0) {
                                    m4025g(zyVarM4026n.m2823q(), jMo4022k);
                                    return;
                                }
                            }
                        }
                    }
                    if (qVar != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + qVar + ")");
                    }
                    try {
                        zurt.toq(f51146x2);
                        Typeface typefaceM4023k = this.f51150zy.m4023k(this.f4518k, zyVarM4026n);
                        ByteBuffer byteBufferM2489g = jp0y.m2489g(this.f4518k, null, zyVarM4026n.m2823q());
                        if (byteBufferM2489g == null || typefaceM4023k == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        kja0 kja0VarM4015n = kja0.m4015n(typefaceM4023k, byteBufferM2489g);
                        zurt.m2775q();
                        synchronized (this.f4521q) {
                            C0830n.s sVar = this.f4522s;
                            if (sVar != null) {
                                sVar.toq(kja0VarM4015n);
                            }
                        }
                        toq();
                    } catch (Throwable th) {
                        zurt.m2775q();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f4521q) {
                        C0830n.s sVar2 = this.f4522s;
                        if (sVar2 != null) {
                            sVar2.mo3865k(th2);
                        }
                        toq();
                    }
                }
            }
        }
    }

    public ld6(@lvui Context context, @lvui C0599g c0599g) {
        super(new zy(context, c0599g, f4515p));
    }

    @lvui
    @Deprecated
    public ld6 ld6(@dd Handler handler) {
        if (handler == null) {
            return this;
        }
        x2(androidx.emoji2.text.zy.toq(handler));
        return this;
    }

    @lvui
    public ld6 qrj(@dd AbstractC0828q abstractC0828q) {
        ((zy) m4047k()).m4028y(abstractC0828q);
        return this;
    }

    @lvui
    public ld6 x2(@lvui Executor executor) {
        ((zy) m4047k()).f7l8(executor);
        return this;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public ld6(@lvui Context context, @lvui C0599g c0599g, @lvui toq toqVar) {
        super(new zy(context, c0599g, toqVar));
    }
}
